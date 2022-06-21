package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Medication;
public class MedicationBidirectionalConversion 
{
	public Medication Medications(org.hl7.fhir.r4.model.Medication medication) throws ParseException
	{
		 main.java.com.campfhir.model.Medication m = new  main.java.com.campfhir.model.Medication();

		/******************** id ********************************************************************************/
		medication.setId(m.getId());

		/******************** medicationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationcode = medication.getCode();

		/******************** medicationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationcodecoding = medicationcode.getCodingFirstRep();

		/******************** Mdctn_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationcodecoding.hasDisplay()) {
			m.setMdctnCdCdgDsply(String.valueOf(medicationcodecoding.getDisplay()));
		}
		/******************** Mdctn_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationcodecoding.hasVersion()) {
			m.setMdctnCdCdgVrsn(String.valueOf(medicationcodecoding.getVersion()));
		}
		/******************** Mdctn_Cd_Cdg_Cd ********************************************************************************/
		if(medicationcodecoding.hasCode()) {
			m.setMdctnCdCdgCd(String.valueOf(medicationcodecoding.getCode()));
		}
		/******************** Mdctn_Cd_Cdg_Sys ********************************************************************************/
		if(medicationcodecoding.hasSystem()) {
			m.setMdctnCdCdgSys(String.valueOf(medicationcodecoding.getSystem()));
		}
		/******************** Mdctn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationcodecoding.hasUserSelected()) {
			m.setMdctnCdCdgUsrSltd(String.valueOf(medicationcodecoding.getUserSelected()));
		}
		/******************** Mdctn_Cd_Txt ********************************************************************************/
		if(medicationcode.hasText()) {
			m.setMdctnCdTxt(String.valueOf(medicationcode.getText()));
		}
		/******************** medicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationStatus medicationstatus = medication.getStatus();
		m.setMdctnSts(medicationstatus.toCode());

		/******************** Mdctn_Manufacturer ********************************************************************************/
		if(medication.hasManufacturer()) {
			m.setMdctnManufacturer(String.valueOf(medication.getManufacturer()));
		}
		/******************** medicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationamount = medication.getAmount();

		/******************** medicationamountnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationamountnumerator = medicationamount.getNumerator();

		/******************** Mdctn_Amnt_Nmrtr_Vl ********************************************************************************/
		if(medicationamountnumerator.hasValue()) {
			m.setMdctnAmntNmrtrVl(String.valueOf(medicationamountnumerator.getValue()));
		}
		/******************** medicationamountnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationamountnumeratorcomparator = medicationamountnumerator.getComparator();
		m.setMdctnAmntNmrtrCmprtr(medicationamountnumeratorcomparator.toCode());

		/******************** Mdctn_Amnt_Nmrtr_Cd ********************************************************************************/
		if(medicationamountnumerator.hasCode()) {
			m.setMdctnAmntNmrtrCd(String.valueOf(medicationamountnumerator.getCode()));
		}
		/******************** Mdctn_Amnt_Nmrtr_Sys ********************************************************************************/
		if(medicationamountnumerator.hasSystem()) {
			m.setMdctnAmntNmrtrSys(String.valueOf(medicationamountnumerator.getSystem()));
		}
		/******************** Mdctn_Amnt_Nmrtr_Unt ********************************************************************************/
		if(medicationamountnumerator.hasUnit()) {
			m.setMdctnAmntNmrtrUnt(String.valueOf(medicationamountnumerator.getUnit()));
		}
		/******************** medicationamountdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationamountdenominator = medicationamount.getDenominator();

		/******************** Mdctn_Amnt_Dnmntr_Vl ********************************************************************************/
		if(medicationamountdenominator.hasValue()) {
			m.setMdctnAmntDnmntrVl(String.valueOf(medicationamountdenominator.getValue()));
		}
		/******************** medicationamountdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationamountdenominatorcomparator = medicationamountdenominator.getComparator();
		m.setMdctnAmntDnmntrCmprtr(medicationamountdenominatorcomparator.toCode());

		/******************** Mdctn_Amnt_Dnmntr_Cd ********************************************************************************/
		if(medicationamountdenominator.hasCode()) {
			m.setMdctnAmntDnmntrCd(String.valueOf(medicationamountdenominator.getCode()));
		}
		/******************** Mdctn_Amnt_Dnmntr_Sys ********************************************************************************/
		if(medicationamountdenominator.hasSystem()) {
			m.setMdctnAmntDnmntrSys(String.valueOf(medicationamountdenominator.getSystem()));
		}
		/******************** Mdctn_Amnt_Dnmntr_Unt ********************************************************************************/
		if(medicationamountdenominator.hasUnit()) {
			m.setMdctnAmntDnmntrUnt(String.valueOf(medicationamountdenominator.getUnit()));
		}
		/******************** medicationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationidentifier = medication.getIdentifierFirstRep();

		/******************** Mdctn_Id_Vl ********************************************************************************/
		if(medicationidentifier.hasValue()) {
			m.setMdctnIdVl(String.valueOf(medicationidentifier.getValue()));
		}
		/******************** medicationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationidentifiertype = medicationidentifier.getType();

		/******************** medicationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationidentifiertypecoding = medicationidentifiertype.getCodingFirstRep();

		/******************** Mdctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationidentifiertypecoding.hasDisplay()) {
			m.setMdctnIdTypCdgDsply(String.valueOf(medicationidentifiertypecoding.getDisplay()));
		}
		/******************** Mdctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationidentifiertypecoding.hasVersion()) {
			m.setMdctnIdTypCdgVrsn(String.valueOf(medicationidentifiertypecoding.getVersion()));
		}
		/******************** Mdctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationidentifiertypecoding.hasCode()) {
			m.setMdctnIdTypCdgCd(String.valueOf(medicationidentifiertypecoding.getCode()));
		}
		/******************** Mdctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationidentifiertypecoding.hasSystem()) {
			m.setMdctnIdTypCdgSys(String.valueOf(medicationidentifiertypecoding.getSystem()));
		}
		/******************** Mdctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationidentifiertypecoding.hasUserSelected()) {
			m.setMdctnIdTypCdgUsrSltd(String.valueOf(medicationidentifiertypecoding.getUserSelected()));
		}
		/******************** Mdctn_Id_Typ_Txt ********************************************************************************/
		if(medicationidentifiertype.hasText()) {
			m.setMdctnIdTypTxt(String.valueOf(medicationidentifiertype.getText()));
		}
		/******************** Mdctn_Id_Sys ********************************************************************************/
		if(medicationidentifier.hasSystem()) {
			m.setMdctnIdSys(String.valueOf(medicationidentifier.getSystem()));
		}
		/******************** Mdctn_Id_Assigner ********************************************************************************/
		if(medicationidentifier.hasAssigner()) {
			m.setMdctnIdAssigner(String.valueOf(medicationidentifier.getAssigner()));
		}
		/******************** medicationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationidentifierperiod = medicationidentifier.getPeriod();

		/******************** Mdctn_Id_Prd_End ********************************************************************************/
		if(medicationidentifierperiod.hasEnd()) {
			m.setMdctnIdPrdEnd(String.valueOf(medicationidentifierperiod.getEnd()));
		}
		/******************** Mdctn_Id_Prd_Strt ********************************************************************************/
		if(medicationidentifierperiod.hasStart()) {
			m.setMdctnIdPrdStrt(String.valueOf(medicationidentifierperiod.getStart()));
		}
		/******************** medicationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationidentifieruse = medicationidentifier.getUse();
		m.setMdctnIdUse(medicationidentifieruse.toCode());

		/******************** medicationform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationform = medication.getForm();

		/******************** medicationformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationformcoding = medicationform.getCodingFirstRep();

		/******************** Mdctn_Frm_Cdg_Dsply ********************************************************************************/
		if(medicationformcoding.hasDisplay()) {
			m.setMdctnFrmCdgDsply(String.valueOf(medicationformcoding.getDisplay()));
		}
		/******************** Mdctn_Frm_Cdg_Vrsn ********************************************************************************/
		if(medicationformcoding.hasVersion()) {
			m.setMdctnFrmCdgVrsn(String.valueOf(medicationformcoding.getVersion()));
		}
		/******************** Mdctn_Frm_Cdg_Cd ********************************************************************************/
		if(medicationformcoding.hasCode()) {
			m.setMdctnFrmCdgCd(String.valueOf(medicationformcoding.getCode()));
		}
		/******************** Mdctn_Frm_Cdg_Sys ********************************************************************************/
		if(medicationformcoding.hasSystem()) {
			m.setMdctnFrmCdgSys(String.valueOf(medicationformcoding.getSystem()));
		}
		/******************** Mdctn_Frm_Cdg_UsrSltd ********************************************************************************/
		if(medicationformcoding.hasUserSelected()) {
			m.setMdctnFrmCdgUsrSltd(String.valueOf(medicationformcoding.getUserSelected()));
		}
		/******************** Mdctn_Frm_Txt ********************************************************************************/
		if(medicationform.hasText()) {
			m.setMdctnFrmTxt(String.valueOf(medicationform.getText()));
		}
		/******************** medicationbatch ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationBatchComponent medicationbatch = medication.getBatch();

		/******************** Mdctn_Batch_ExpirationDt ********************************************************************************/
		if(medicationbatch.hasExpirationDate()) {
			m.setMdctnBatchExpirationDt(String.valueOf(medicationbatch.getExpirationDate()));
		}
		/******************** Mdctn_Batch_LotNmbr ********************************************************************************/
		if(medicationbatch.hasLotNumber()) {
			m.setMdctnBatchLotNmbr(String.valueOf(medicationbatch.getLotNumber()));
		}
		/******************** medicationingredient ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent medicationingredient = medication.getIngredientFirstRep();

		/******************** medicationingredientitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationingredientitemcodeableconcept = medicationingredient.getItemCodeableConcept();

		/******************** medicationingredientitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationingredientitemcodeableconceptcoding = medicationingredientitemcodeableconcept.getCodingFirstRep();

		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationingredientitemcodeableconceptcoding.hasDisplay()) {
			m.setMdctnIgrdntItmCdbleCncptCdgDsply(String.valueOf(medicationingredientitemcodeableconceptcoding.getDisplay()));
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationingredientitemcodeableconceptcoding.hasVersion()) {
			m.setMdctnIgrdntItmCdbleCncptCdgVrsn(String.valueOf(medicationingredientitemcodeableconceptcoding.getVersion()));
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationingredientitemcodeableconceptcoding.hasCode()) {
			m.setMdctnIgrdntItmCdbleCncptCdgCd(String.valueOf(medicationingredientitemcodeableconceptcoding.getCode()));
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationingredientitemcodeableconceptcoding.hasSystem()) {
			m.setMdctnIgrdntItmCdbleCncptCdgSys(String.valueOf(medicationingredientitemcodeableconceptcoding.getSystem()));
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationingredientitemcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnIgrdntItmCdbleCncptCdgUsrSltd(String.valueOf(medicationingredientitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(medicationingredientitemcodeableconcept.hasText()) {
			m.setMdctnIgrdntItmCdbleCncptTxt(String.valueOf(medicationingredientitemcodeableconcept.getText()));
		}
		/******************** Mdctn_Igrdnt_ItmRfrnc ********************************************************************************/
		if(medicationingredient.hasItemReference()) {
			m.setMdctnIgrdntItmRfrnc(String.valueOf(medicationingredient.getItemReference()));
		}
		/******************** Mdctn_Igrdnt_IsActive ********************************************************************************/
		if(medicationingredient.hasIsActive()) {
			m.setMdctnIgrdntIsActive(String.valueOf(medicationingredient.getIsActive()));
		}
		/******************** medicationingredientstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationingredientstrength = medicationingredient.getStrength();

		/******************** medicationingredientstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationingredientstrengthnumerator = medicationingredientstrength.getNumerator();

		/******************** Mdctn_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(medicationingredientstrengthnumerator.hasValue()) {
			m.setMdctnIgrdntStrNmrtrVl(String.valueOf(medicationingredientstrengthnumerator.getValue()));
		}
		/******************** medicationingredientstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationingredientstrengthnumeratorcomparator = medicationingredientstrengthnumerator.getComparator();
		m.setMdctnIgrdntStrNmrtrCmprtr(medicationingredientstrengthnumeratorcomparator.toCode());

		/******************** Mdctn_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(medicationingredientstrengthnumerator.hasCode()) {
			m.setMdctnIgrdntStrNmrtrCd(String.valueOf(medicationingredientstrengthnumerator.getCode()));
		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(medicationingredientstrengthnumerator.hasSystem()) {
			m.setMdctnIgrdntStrNmrtrSys(String.valueOf(medicationingredientstrengthnumerator.getSystem()));
		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(medicationingredientstrengthnumerator.hasUnit()) {
			m.setMdctnIgrdntStrNmrtrUnt(String.valueOf(medicationingredientstrengthnumerator.getUnit()));
		}
		/******************** medicationingredientstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationingredientstrengthdenominator = medicationingredientstrength.getDenominator();

		/******************** Mdctn_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(medicationingredientstrengthdenominator.hasValue()) {
			m.setMdctnIgrdntStrDnmntrVl(String.valueOf(medicationingredientstrengthdenominator.getValue()));
		}
		/******************** medicationingredientstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationingredientstrengthdenominatorcomparator = medicationingredientstrengthdenominator.getComparator();
		m.setMdctnIgrdntStrDnmntrCmprtr(medicationingredientstrengthdenominatorcomparator.toCode());

		/******************** Mdctn_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(medicationingredientstrengthdenominator.hasCode()) {
			m.setMdctnIgrdntStrDnmntrCd(String.valueOf(medicationingredientstrengthdenominator.getCode()));
		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(medicationingredientstrengthdenominator.hasSystem()) {
			m.setMdctnIgrdntStrDnmntrSys(String.valueOf(medicationingredientstrengthdenominator.getSystem()));
		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(medicationingredientstrengthdenominator.hasUnit()) {
			m.setMdctnIgrdntStrDnmntrUnt(String.valueOf(medicationingredientstrengthdenominator.getUnit()));
		}
		return m;
	}
}
