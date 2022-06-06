package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Medication;
public class MedicationConversion 
{
	public org.hl7.fhir.r4.model.Medication Medications(Medication m) throws ParseException
	{
		org.hl7.fhir.r4.model.Medication medication = new org.hl7.fhir.r4.model.Medication();

		/******************** id ********************************************************************************/
		medication.setId(m.getId());

		/******************** medicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationamount =  new org.hl7.fhir.r4.model.Ratio();
		medication.setAmount(medicationamount);

		/******************** medicationamountdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationamountdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationamount.setDenominator(medicationamountdenominator);

		/******************** Mdctn_Amnt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnAmntDnmntrCd() != null) {
			medicationamountdenominator.setCode(m.getMdctnAmntDnmntrCd());
		}
		/******************** medicationamountdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationamountdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationamountdenominator.setComparator(medicationamountdenominatorcomparator.fromCode(m.getMdctnAmntDnmntrCmprtr()));

		/******************** Mdctn_Amnt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnAmntDnmntrSys() != null) {
			medicationamountdenominator.setSystem(m.getMdctnAmntDnmntrSys());
		}
		/******************** Mdctn_Amnt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnAmntDnmntrUnt() != null) {
			medicationamountdenominator.setUnit(m.getMdctnAmntDnmntrUnt());
		}
		/******************** Mdctn_Amnt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnAmntDnmntrVl() != null) {
			medicationamountdenominator.setValue(Double.parseDouble((m.getMdctnAmntDnmntrVl())));
		}
		/******************** medicationamountnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationamountnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationamount.setNumerator(medicationamountnumerator);

		/******************** Mdctn_Amnt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnAmntNmrtrCd() != null) {
			medicationamountnumerator.setCode(m.getMdctnAmntNmrtrCd());
		}
		/******************** medicationamountnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationamountnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationamountnumerator.setComparator(medicationamountnumeratorcomparator.fromCode(m.getMdctnAmntNmrtrCmprtr()));

		/******************** Mdctn_Amnt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnAmntNmrtrSys() != null) {
			medicationamountnumerator.setSystem(m.getMdctnAmntNmrtrSys());
		}
		/******************** Mdctn_Amnt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnAmntNmrtrUnt() != null) {
			medicationamountnumerator.setUnit(m.getMdctnAmntNmrtrUnt());
		}
		/******************** Mdctn_Amnt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnAmntNmrtrVl() != null) {
			medicationamountnumerator.setValue(Double.parseDouble((m.getMdctnAmntNmrtrVl())));
		}
		/******************** medicationbatch ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationBatchComponent medicationbatch =  new org.hl7.fhir.r4.model.Medication.MedicationBatchComponent();
		medication.setBatch(medicationbatch);

		/******************** Mdctn_Batch_ExpirationDt ********************************************************************************/
		if(m.getMdctnBatchExpirationDt() != null) {
			java.text.SimpleDateFormat Mdctn_Batch_ExpirationDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Mdctn_Batch_ExpirationDtdate = Mdctn_Batch_ExpirationDtsdf.parse(m.getMdctnBatchExpirationDt());
			medicationbatch.setExpirationDate(Mdctn_Batch_ExpirationDtdate);
		}
		/******************** Mdctn_Batch_LotNmbr ********************************************************************************/
		if(m.getMdctnBatchLotNmbr() != null) {
			medicationbatch.setLotNumber(m.getMdctnBatchLotNmbr());
		}
		/******************** medicationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medication.setCode(medicationcode);

		/******************** medicationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationcode.addCoding(medicationcodecoding);

		/******************** Mdctn_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnCdCdgCd() != null) {
			medicationcodecoding.setCode(m.getMdctnCdCdgCd());
		}
		/******************** Mdctn_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnCdCdgDsply() != null) {
			medicationcodecoding.setDisplay(m.getMdctnCdCdgDsply());
		}
		/******************** Mdctn_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnCdCdgSys() != null) {
			medicationcodecoding.setSystem(m.getMdctnCdCdgSys());
		}
		/******************** Mdctn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnCdCdgUsrSltd() != null) {
			medicationcodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnCdCdgUsrSltd()));
		}
		/******************** Mdctn_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnCdCdgVrsn() != null) {
			medicationcodecoding.setVersion(m.getMdctnCdCdgVrsn());
		}
		/******************** Mdctn_Cd_Txt ********************************************************************************/
		if(m.getMdctnCdTxt() != null) {
			medicationcode.setText(m.getMdctnCdTxt());
		}
		/******************** medicationform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationform =  new org.hl7.fhir.r4.model.CodeableConcept();
		medication.setForm(medicationform);

		/******************** medicationformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationformcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationform.addCoding(medicationformcoding);

		/******************** Mdctn_Frm_Cdg_Cd ********************************************************************************/
		if(m.getMdctnFrmCdgCd() != null) {
			medicationformcoding.setCode(m.getMdctnFrmCdgCd());
		}
		/******************** Mdctn_Frm_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnFrmCdgDsply() != null) {
			medicationformcoding.setDisplay(m.getMdctnFrmCdgDsply());
		}
		/******************** Mdctn_Frm_Cdg_Sys ********************************************************************************/
		if(m.getMdctnFrmCdgSys() != null) {
			medicationformcoding.setSystem(m.getMdctnFrmCdgSys());
		}
		/******************** Mdctn_Frm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnFrmCdgUsrSltd() != null) {
			medicationformcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnFrmCdgUsrSltd()));
		}
		/******************** Mdctn_Frm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnFrmCdgVrsn() != null) {
			medicationformcoding.setVersion(m.getMdctnFrmCdgVrsn());
		}
		/******************** Mdctn_Frm_Txt ********************************************************************************/
		if(m.getMdctnFrmTxt() != null) {
			medicationform.setText(m.getMdctnFrmTxt());
		}
		/******************** medicationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medication.addIdentifier(medicationidentifier);

		/******************** Mdctn_Id_Assigner ********************************************************************************/
		if(m.getMdctnIdAssigner() != null) {
			medicationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdctnIdAssigner()));
		}
		/******************** medicationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicationidentifier.setPeriod(medicationidentifierperiod);

		/******************** Mdctn_Id_Prd_End ********************************************************************************/
		if(m.getMdctnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Mdctn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Mdctn_Id_Prd_Enddate = Mdctn_Id_Prd_Endsdf.parse(m.getMdctnIdPrdEnd());
			medicationidentifierperiod.setEnd(Mdctn_Id_Prd_Enddate);
		}
		/******************** Mdctn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Mdctn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Mdctn_Id_Prd_Strtdate = Mdctn_Id_Prd_Strtsdf.parse(m.getMdctnIdPrdStrt());
			medicationidentifierperiod.setStart(Mdctn_Id_Prd_Strtdate);
		}
		/******************** Mdctn_Id_Sys ********************************************************************************/
		if(m.getMdctnIdSys() != null) {
			medicationidentifier.setSystem(m.getMdctnIdSys());
		}
		/******************** medicationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationidentifier.setType(medicationidentifiertype);

		/******************** medicationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationidentifiertype.addCoding(medicationidentifiertypecoding);

		/******************** Mdctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnIdTypCdgCd() != null) {
			medicationidentifiertypecoding.setCode(m.getMdctnIdTypCdgCd());
		}
		/******************** Mdctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnIdTypCdgDsply() != null) {
			medicationidentifiertypecoding.setDisplay(m.getMdctnIdTypCdgDsply());
		}
		/******************** Mdctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnIdTypCdgSys() != null) {
			medicationidentifiertypecoding.setSystem(m.getMdctnIdTypCdgSys());
		}
		/******************** Mdctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnIdTypCdgUsrSltd() != null) {
			medicationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnIdTypCdgUsrSltd()));
		}
		/******************** Mdctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnIdTypCdgVrsn() != null) {
			medicationidentifiertypecoding.setVersion(m.getMdctnIdTypCdgVrsn());
		}
		/******************** Mdctn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnIdTypTxt() != null) {
			medicationidentifiertype.setText(m.getMdctnIdTypTxt());
		}
		/******************** medicationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicationidentifier.setUse(medicationidentifieruse.fromCode(m.getMdctnIdUse()));

		/******************** Mdctn_Id_Vl ********************************************************************************/
		if(m.getMdctnIdVl() != null) {
			medicationidentifier.setValue(m.getMdctnIdVl());
		}
		/******************** medicationingredient ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent medicationingredient =  new org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent();
		medication.addIngredient(medicationingredient);

		/******************** Mdctn_Igrdnt_IsActive ********************************************************************************/
		if(m.getMdctnIgrdntIsActive() != null) {
			medicationingredient.setIsActive(Boolean.parseBoolean(m.getMdctnIgrdntIsActive()));
		}
		/******************** medicationingredientitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationingredientitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationingredient.setItem(medicationingredientitemcodeableconcept);

		/******************** medicationingredientitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationingredientitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationingredientitemcodeableconcept.addCoding(medicationingredientitemcodeableconceptcoding);

		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgCd() != null) {
			medicationingredientitemcodeableconceptcoding.setCode(m.getMdctnIgrdntItmCdbleCncptCdgCd());
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgDsply() != null) {
			medicationingredientitemcodeableconceptcoding.setDisplay(m.getMdctnIgrdntItmCdbleCncptCdgDsply());
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgSys() != null) {
			medicationingredientitemcodeableconceptcoding.setSystem(m.getMdctnIgrdntItmCdbleCncptCdgSys());
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgUsrSltd() != null) {
			medicationingredientitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnIgrdntItmCdbleCncptCdgUsrSltd()));
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgVrsn() != null) {
			medicationingredientitemcodeableconceptcoding.setVersion(m.getMdctnIgrdntItmCdbleCncptCdgVrsn());
		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptTxt() != null) {
			medicationingredientitemcodeableconcept.setText(m.getMdctnIgrdntItmCdbleCncptTxt());
		}
		/******************** Mdctn_Igrdnt_ItmRfrnc ********************************************************************************/
		if(m.getMdctnIgrdntItmRfrnc() != null) {
			medicationingredient.setItem( new org.hl7.fhir.r4.model.Reference(m.getMdctnIgrdntItmRfrnc()));
		}
		/******************** medicationingredientstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationingredientstrength =  new org.hl7.fhir.r4.model.Ratio();
		medicationingredient.setStrength(medicationingredientstrength);

		/******************** medicationingredientstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationingredientstrengthdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationingredientstrength.setDenominator(medicationingredientstrengthdenominator);

		/******************** Mdctn_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrCd() != null) {
			medicationingredientstrengthdenominator.setCode(m.getMdctnIgrdntStrDnmntrCd());
		}
		/******************** medicationingredientstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationingredientstrengthdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationingredientstrengthdenominator.setComparator(medicationingredientstrengthdenominatorcomparator.fromCode(m.getMdctnIgrdntStrDnmntrCmprtr()));

		/******************** Mdctn_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrSys() != null) {
			medicationingredientstrengthdenominator.setSystem(m.getMdctnIgrdntStrDnmntrSys());
		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrUnt() != null) {
			medicationingredientstrengthdenominator.setUnit(m.getMdctnIgrdntStrDnmntrUnt());
		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrVl() != null) {
			medicationingredientstrengthdenominator.setValue(Double.parseDouble((m.getMdctnIgrdntStrDnmntrVl())));
		}
		/******************** medicationingredientstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationingredientstrengthnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationingredientstrength.setNumerator(medicationingredientstrengthnumerator);

		/******************** Mdctn_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrCd() != null) {
			medicationingredientstrengthnumerator.setCode(m.getMdctnIgrdntStrNmrtrCd());
		}
		/******************** medicationingredientstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationingredientstrengthnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationingredientstrengthnumerator.setComparator(medicationingredientstrengthnumeratorcomparator.fromCode(m.getMdctnIgrdntStrNmrtrCmprtr()));

		/******************** Mdctn_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrSys() != null) {
			medicationingredientstrengthnumerator.setSystem(m.getMdctnIgrdntStrNmrtrSys());
		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrUnt() != null) {
			medicationingredientstrengthnumerator.setUnit(m.getMdctnIgrdntStrNmrtrUnt());
		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrVl() != null) {
			medicationingredientstrengthnumerator.setValue(Double.parseDouble((m.getMdctnIgrdntStrNmrtrVl())));
		}
		/******************** Mdctn_Manufacturer ********************************************************************************/
		if(m.getMdctnManufacturer() != null) {
			medication.setManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdctnManufacturer()));
		}
		/******************** medicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationStatusEnumFactory medicationstatus =  new org.hl7.fhir.r4.model.Medication.MedicationStatusEnumFactory();
		medication.setStatus(medicationstatus.fromCode(m.getMdctnSts()));

		return medication;
	}
}
