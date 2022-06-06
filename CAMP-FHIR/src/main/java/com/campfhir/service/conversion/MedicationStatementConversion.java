package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationStatement;
public class MedicationStatementConversion 
{
	public org.hl7.fhir.r4.model.MedicationStatement MedicationStatements(MedicationStatement m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationStatement medicationstatement = new org.hl7.fhir.r4.model.MedicationStatement();

		/******************** id ********************************************************************************/
		medicationstatement.setId(m.getId());

		/******************** MdctnStmnt_BasedOn ********************************************************************************/
		if(m.getMdctnStmntBasedOn() != null) {
			medicationstatement.addBasedOn( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntBasedOn()));
		}
		/******************** medicationstatementcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatement.setCategory(medicationstatementcategory);

		/******************** medicationstatementcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementcategory.addCoding(medicationstatementcategorycoding);

		/******************** MdctnStmnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgCd() != null) {
			medicationstatementcategorycoding.setCode(m.getMdctnStmntCtgryCdgCd());
		}
		/******************** MdctnStmnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgDsply() != null) {
			medicationstatementcategorycoding.setDisplay(m.getMdctnStmntCtgryCdgDsply());
		}
		/******************** MdctnStmnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgSys() != null) {
			medicationstatementcategorycoding.setSystem(m.getMdctnStmntCtgryCdgSys());
		}
		/******************** MdctnStmnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgUsrSltd() != null) {
			medicationstatementcategorycoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntCtgryCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgVrsn() != null) {
			medicationstatementcategorycoding.setVersion(m.getMdctnStmntCtgryCdgVrsn());
		}
		/******************** MdctnStmnt_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnStmntCtgryTxt() != null) {
			medicationstatementcategory.setText(m.getMdctnStmntCtgryTxt());
		}
		/******************** MdctnStmnt_Cntxt ********************************************************************************/
		if(m.getMdctnStmntCntxt() != null) {
			medicationstatement.setContext( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntCntxt()));
		}
		/******************** MdctnStmnt_DtAsserted ********************************************************************************/
		if(m.getMdctnStmntDtAsserted() != null) {
			java.text.SimpleDateFormat MdctnStmnt_DtAssertedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_DtAsserteddate = MdctnStmnt_DtAssertedsdf.parse(m.getMdctnStmntDtAsserted());
			medicationstatement.setDateAsserted(MdctnStmnt_DtAsserteddate);
		}
		/******************** MdctnStmnt_DerivedFrom ********************************************************************************/
		if(m.getMdctnStmntDerivedFrom() != null) {
			medicationstatement.addDerivedFrom( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntDerivedFrom()));
		}
		/******************** medicationstatementdosage ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationstatementdosage =  new org.hl7.fhir.r4.model.Dosage();
		medicationstatement.addDosage(medicationstatementdosage);

		/******************** medicationstatementdosageadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageadditionalinstruction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosage.addAdditionalInstruction(medicationstatementdosageadditionalinstruction);

		/******************** medicationstatementdosageadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosageadditionalinstructioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosageadditionalinstruction.addCoding(medicationstatementdosageadditionalinstructioncoding);

		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgCd() != null) {
			medicationstatementdosageadditionalinstructioncoding.setCode(m.getMdctnStmntDsgAddtnlInstrctnCdgCd());
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgDsply() != null) {
			medicationstatementdosageadditionalinstructioncoding.setDisplay(m.getMdctnStmntDsgAddtnlInstrctnCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgSys() != null) {
			medicationstatementdosageadditionalinstructioncoding.setSystem(m.getMdctnStmntDsgAddtnlInstrctnCdgSys());
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgUsrSltd() != null) {
			medicationstatementdosageadditionalinstructioncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgAddtnlInstrctnCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgVrsn() != null) {
			medicationstatementdosageadditionalinstructioncoding.setVersion(m.getMdctnStmntDsgAddtnlInstrctnCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnTxt() != null) {
			medicationstatementdosageadditionalinstruction.setText(m.getMdctnStmntDsgAddtnlInstrctnTxt());
		}
		/******************** MdctnStmnt_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdBooleanTyp() != null) {
			medicationstatementdosage.setAsNeeded( new org.hl7.fhir.r4.model.BooleanType(m.getMdctnStmntDsgAsNdBooleanTyp()));
		}
		/******************** medicationstatementdosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageasneededcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosage.setAsNeeded(medicationstatementdosageasneededcodeableconcept);

		/******************** medicationstatementdosageasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosageasneededcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosageasneededcodeableconcept.addCoding(medicationstatementdosageasneededcodeableconceptcoding);

		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgCd() != null) {
			medicationstatementdosageasneededcodeableconceptcoding.setCode(m.getMdctnStmntDsgAsNdCdbleCncptCdgCd());
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgDsply() != null) {
			medicationstatementdosageasneededcodeableconceptcoding.setDisplay(m.getMdctnStmntDsgAsNdCdbleCncptCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgSys() != null) {
			medicationstatementdosageasneededcodeableconceptcoding.setSystem(m.getMdctnStmntDsgAsNdCdbleCncptCdgSys());
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd() != null) {
			medicationstatementdosageasneededcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgVrsn() != null) {
			medicationstatementdosageasneededcodeableconceptcoding.setVersion(m.getMdctnStmntDsgAsNdCdbleCncptCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptTxt() != null) {
			medicationstatementdosageasneededcodeableconcept.setText(m.getMdctnStmntDsgAsNdCdbleCncptTxt());
		}
		/******************** medicationstatementdosagedoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationstatementdosagedoseandrate =  new org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent();
		medicationstatementdosage.addDoseAndRate(medicationstatementdosagedoseandrate);

		/******************** medicationstatementdosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedosequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandrate.setDose(medicationstatementdosagedoseandratedosequantity);

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyCd() != null) {
			medicationstatementdosagedoseandratedosequantity.setCode(m.getMdctnStmntDsgDoseAndRtDoseQntyCd());
		}
		/******************** medicationstatementdosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandratedosequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandratedosequantity.setComparator(medicationstatementdosagedoseandratedosequantitycomparator.fromCode(m.getMdctnStmntDsgDoseAndRtDoseQntyCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntySys() != null) {
			medicationstatementdosagedoseandratedosequantity.setSystem(m.getMdctnStmntDsgDoseAndRtDoseQntySys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyUnt() != null) {
			medicationstatementdosagedoseandratedosequantity.setUnit(m.getMdctnStmntDsgDoseAndRtDoseQntyUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyVl() != null) {
			medicationstatementdosagedoseandratedosequantity.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtDoseQntyVl())));
		}
		/******************** medicationstatementdosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagedoseandratedoserange =  new org.hl7.fhir.r4.model.Range();
		medicationstatementdosagedoseandrate.setDose(medicationstatementdosagedoseandratedoserange);

		/******************** medicationstatementdosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedoserangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandratedoserange.setHigh(medicationstatementdosagedoseandratedoserangehigh);

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiCd() != null) {
			medicationstatementdosagedoseandratedoserangehigh.setCode(m.getMdctnStmntDsgDoseAndRtDoseRngHiCd());
		}
		/******************** medicationstatementdosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandratedoserangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandratedoserangehigh.setComparator(medicationstatementdosagedoseandratedoserangehighcomparator.fromCode(m.getMdctnStmntDsgDoseAndRtDoseRngHiCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiSys() != null) {
			medicationstatementdosagedoseandratedoserangehigh.setSystem(m.getMdctnStmntDsgDoseAndRtDoseRngHiSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiUnt() != null) {
			medicationstatementdosagedoseandratedoserangehigh.setUnit(m.getMdctnStmntDsgDoseAndRtDoseRngHiUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiVl() != null) {
			medicationstatementdosagedoseandratedoserangehigh.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtDoseRngHiVl())));
		}
		/******************** medicationstatementdosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedoserangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandratedoserange.setLow(medicationstatementdosagedoseandratedoserangelow);

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwCd() != null) {
			medicationstatementdosagedoseandratedoserangelow.setCode(m.getMdctnStmntDsgDoseAndRtDoseRngLwCd());
		}
		/******************** medicationstatementdosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandratedoserangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandratedoserangelow.setComparator(medicationstatementdosagedoseandratedoserangelowcomparator.fromCode(m.getMdctnStmntDsgDoseAndRtDoseRngLwCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwSys() != null) {
			medicationstatementdosagedoseandratedoserangelow.setSystem(m.getMdctnStmntDsgDoseAndRtDoseRngLwSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwUnt() != null) {
			medicationstatementdosagedoseandratedoserangelow.setUnit(m.getMdctnStmntDsgDoseAndRtDoseRngLwUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwVl() != null) {
			medicationstatementdosagedoseandratedoserangelow.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtDoseRngLwVl())));
		}
		/******************** medicationstatementdosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateratequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandrate.setRate(medicationstatementdosagedoseandrateratequantity);

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyCd() != null) {
			medicationstatementdosagedoseandrateratequantity.setCode(m.getMdctnStmntDsgDoseAndRtRtQntyCd());
		}
		/******************** medicationstatementdosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandrateratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandrateratequantity.setComparator(medicationstatementdosagedoseandrateratequantitycomparator.fromCode(m.getMdctnStmntDsgDoseAndRtRtQntyCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntySys() != null) {
			medicationstatementdosagedoseandrateratequantity.setSystem(m.getMdctnStmntDsgDoseAndRtRtQntySys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyUnt() != null) {
			medicationstatementdosagedoseandrateratequantity.setUnit(m.getMdctnStmntDsgDoseAndRtRtQntyUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyVl() != null) {
			medicationstatementdosagedoseandrateratequantity.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtRtQntyVl())));
		}
		/******************** medicationstatementdosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagedoseandrateraterange =  new org.hl7.fhir.r4.model.Range();
		medicationstatementdosagedoseandrate.setRate(medicationstatementdosagedoseandrateraterange);

		/******************** medicationstatementdosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandrateraterange.setHigh(medicationstatementdosagedoseandrateraterangehigh);

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiCd() != null) {
			medicationstatementdosagedoseandrateraterangehigh.setCode(m.getMdctnStmntDsgDoseAndRtRtRngHiCd());
		}
		/******************** medicationstatementdosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandrateraterangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandrateraterangehigh.setComparator(medicationstatementdosagedoseandrateraterangehighcomparator.fromCode(m.getMdctnStmntDsgDoseAndRtRtRngHiCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiSys() != null) {
			medicationstatementdosagedoseandrateraterangehigh.setSystem(m.getMdctnStmntDsgDoseAndRtRtRngHiSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiUnt() != null) {
			medicationstatementdosagedoseandrateraterangehigh.setUnit(m.getMdctnStmntDsgDoseAndRtRtRngHiUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiVl() != null) {
			medicationstatementdosagedoseandrateraterangehigh.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtRtRngHiVl())));
		}
		/******************** medicationstatementdosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandrateraterange.setLow(medicationstatementdosagedoseandrateraterangelow);

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwCd() != null) {
			medicationstatementdosagedoseandrateraterangelow.setCode(m.getMdctnStmntDsgDoseAndRtRtRngLwCd());
		}
		/******************** medicationstatementdosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandrateraterangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandrateraterangelow.setComparator(medicationstatementdosagedoseandrateraterangelowcomparator.fromCode(m.getMdctnStmntDsgDoseAndRtRtRngLwCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwSys() != null) {
			medicationstatementdosagedoseandrateraterangelow.setSystem(m.getMdctnStmntDsgDoseAndRtRtRngLwSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwUnt() != null) {
			medicationstatementdosagedoseandrateraterangelow.setUnit(m.getMdctnStmntDsgDoseAndRtRtRngLwUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwVl() != null) {
			medicationstatementdosagedoseandrateraterangelow.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtRtRngLwVl())));
		}
		/******************** medicationstatementdosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationstatementdosagedoseandraterateratio =  new org.hl7.fhir.r4.model.Ratio();
		medicationstatementdosagedoseandrate.setRate(medicationstatementdosagedoseandraterateratio);

		/******************** medicationstatementdosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandraterateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandraterateratio.setDenominator(medicationstatementdosagedoseandraterateratiodenominator);

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCd() != null) {
			medicationstatementdosagedoseandraterateratiodenominator.setCode(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCd());
		}
		/******************** medicationstatementdosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandraterateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandraterateratiodenominator.setComparator(medicationstatementdosagedoseandraterateratiodenominatorcomparator.fromCode(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrSys() != null) {
			medicationstatementdosagedoseandraterateratiodenominator.setSystem(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt() != null) {
			medicationstatementdosagedoseandraterateratiodenominator.setUnit(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrVl() != null) {
			medicationstatementdosagedoseandraterateratiodenominator.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrVl())));
		}
		/******************** medicationstatementdosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagedoseandraterateratio.setNumerator(medicationstatementdosagedoseandrateraterationumerator);

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCd() != null) {
			medicationstatementdosagedoseandrateraterationumerator.setCode(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCd());
		}
		/******************** medicationstatementdosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagedoseandrateraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagedoseandrateraterationumerator.setComparator(medicationstatementdosagedoseandrateraterationumeratorcomparator.fromCode(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr()));

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrSys() != null) {
			medicationstatementdosagedoseandrateraterationumerator.setSystem(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt() != null) {
			medicationstatementdosagedoseandrateraterationumerator.setUnit(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrVl() != null) {
			medicationstatementdosagedoseandrateraterationumerator.setValue(Double.parseDouble((m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrVl())));
		}
		/******************** medicationstatementdosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagedoseandratetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosagedoseandrate.setType(medicationstatementdosagedoseandratetype);

		/******************** medicationstatementdosagedoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagedoseandratetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosagedoseandratetype.addCoding(medicationstatementdosagedoseandratetypecoding);

		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgCd() != null) {
			medicationstatementdosagedoseandratetypecoding.setCode(m.getMdctnStmntDsgDoseAndRtTypCdgCd());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgDsply() != null) {
			medicationstatementdosagedoseandratetypecoding.setDisplay(m.getMdctnStmntDsgDoseAndRtTypCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgSys() != null) {
			medicationstatementdosagedoseandratetypecoding.setSystem(m.getMdctnStmntDsgDoseAndRtTypCdgSys());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgUsrSltd() != null) {
			medicationstatementdosagedoseandratetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgDoseAndRtTypCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgVrsn() != null) {
			medicationstatementdosagedoseandratetypecoding.setVersion(m.getMdctnStmntDsgDoseAndRtTypCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypTxt() != null) {
			medicationstatementdosagedoseandratetype.setText(m.getMdctnStmntDsgDoseAndRtTypTxt());
		}
		/******************** medicationstatementdosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperadministration =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosage.setMaxDosePerAdministration(medicationstatementdosagemaxdoseperadministration);

		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnCd() != null) {
			medicationstatementdosagemaxdoseperadministration.setCode(m.getMdctnStmntDsgMxDosePerAdmnstnCd());
		}
		/******************** medicationstatementdosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagemaxdoseperadministrationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagemaxdoseperadministration.setComparator(medicationstatementdosagemaxdoseperadministrationcomparator.fromCode(m.getMdctnStmntDsgMxDosePerAdmnstnCmprtr()));

		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnSys() != null) {
			medicationstatementdosagemaxdoseperadministration.setSystem(m.getMdctnStmntDsgMxDosePerAdmnstnSys());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnUnt() != null) {
			medicationstatementdosagemaxdoseperadministration.setUnit(m.getMdctnStmntDsgMxDosePerAdmnstnUnt());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnVl() != null) {
			medicationstatementdosagemaxdoseperadministration.setValue(Double.parseDouble((m.getMdctnStmntDsgMxDosePerAdmnstnVl())));
		}
		/******************** medicationstatementdosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperlifetime =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosage.setMaxDosePerLifetime(medicationstatementdosagemaxdoseperlifetime);

		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeCd() != null) {
			medicationstatementdosagemaxdoseperlifetime.setCode(m.getMdctnStmntDsgMxDosePerLifetimeCd());
		}
		/******************** medicationstatementdosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagemaxdoseperlifetimecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagemaxdoseperlifetime.setComparator(medicationstatementdosagemaxdoseperlifetimecomparator.fromCode(m.getMdctnStmntDsgMxDosePerLifetimeCmprtr()));

		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeSys() != null) {
			medicationstatementdosagemaxdoseperlifetime.setSystem(m.getMdctnStmntDsgMxDosePerLifetimeSys());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeUnt() != null) {
			medicationstatementdosagemaxdoseperlifetime.setUnit(m.getMdctnStmntDsgMxDosePerLifetimeUnt());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeVl() != null) {
			medicationstatementdosagemaxdoseperlifetime.setValue(Double.parseDouble((m.getMdctnStmntDsgMxDosePerLifetimeVl())));
		}
		/******************** medicationstatementdosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationstatementdosagemaxdoseperperiod =  new org.hl7.fhir.r4.model.Ratio();
		medicationstatementdosage.setMaxDosePerPeriod(medicationstatementdosagemaxdoseperperiod);

		/******************** medicationstatementdosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperperioddenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagemaxdoseperperiod.setDenominator(medicationstatementdosagemaxdoseperperioddenominator);

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrCd() != null) {
			medicationstatementdosagemaxdoseperperioddenominator.setCode(m.getMdctnStmntDsgMxDosePerPrdDnmntrCd());
		}
		/******************** medicationstatementdosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagemaxdoseperperioddenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagemaxdoseperperioddenominator.setComparator(medicationstatementdosagemaxdoseperperioddenominatorcomparator.fromCode(m.getMdctnStmntDsgMxDosePerPrdDnmntrCmprtr()));

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrSys() != null) {
			medicationstatementdosagemaxdoseperperioddenominator.setSystem(m.getMdctnStmntDsgMxDosePerPrdDnmntrSys());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrUnt() != null) {
			medicationstatementdosagemaxdoseperperioddenominator.setUnit(m.getMdctnStmntDsgMxDosePerPrdDnmntrUnt());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrVl() != null) {
			medicationstatementdosagemaxdoseperperioddenominator.setValue(Double.parseDouble((m.getMdctnStmntDsgMxDosePerPrdDnmntrVl())));
		}
		/******************** medicationstatementdosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperperiodnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagemaxdoseperperiod.setNumerator(medicationstatementdosagemaxdoseperperiodnumerator);

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrCd() != null) {
			medicationstatementdosagemaxdoseperperiodnumerator.setCode(m.getMdctnStmntDsgMxDosePerPrdNmrtrCd());
		}
		/******************** medicationstatementdosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagemaxdoseperperiodnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagemaxdoseperperiodnumerator.setComparator(medicationstatementdosagemaxdoseperperiodnumeratorcomparator.fromCode(m.getMdctnStmntDsgMxDosePerPrdNmrtrCmprtr()));

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrSys() != null) {
			medicationstatementdosagemaxdoseperperiodnumerator.setSystem(m.getMdctnStmntDsgMxDosePerPrdNmrtrSys());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrUnt() != null) {
			medicationstatementdosagemaxdoseperperiodnumerator.setUnit(m.getMdctnStmntDsgMxDosePerPrdNmrtrUnt());
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrVl() != null) {
			medicationstatementdosagemaxdoseperperiodnumerator.setValue(Double.parseDouble((m.getMdctnStmntDsgMxDosePerPrdNmrtrVl())));
		}
		/******************** medicationstatementdosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagemethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosage.setMethod(medicationstatementdosagemethod);

		/******************** medicationstatementdosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagemethodcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosagemethod.addCoding(medicationstatementdosagemethodcoding);

		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgCd() != null) {
			medicationstatementdosagemethodcoding.setCode(m.getMdctnStmntDsgMthdCdgCd());
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgDsply() != null) {
			medicationstatementdosagemethodcoding.setDisplay(m.getMdctnStmntDsgMthdCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgSys() != null) {
			medicationstatementdosagemethodcoding.setSystem(m.getMdctnStmntDsgMthdCdgSys());
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgUsrSltd() != null) {
			medicationstatementdosagemethodcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgMthdCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgVrsn() != null) {
			medicationstatementdosagemethodcoding.setVersion(m.getMdctnStmntDsgMthdCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_Mthd_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgMthdTxt() != null) {
			medicationstatementdosagemethod.setText(m.getMdctnStmntDsgMthdTxt());
		}
		/******************** MdctnStmnt_Dsg_PntInstrctn ********************************************************************************/
		if(m.getMdctnStmntDsgPntInstrctn() != null) {
			medicationstatementdosage.setPatientInstruction(m.getMdctnStmntDsgPntInstrctn());
		}
		/******************** medicationstatementdosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosage.setRoute(medicationstatementdosageroute);

		/******************** medicationstatementdosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosageroutecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosageroute.addCoding(medicationstatementdosageroutecoding);

		/******************** MdctnStmnt_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgCd() != null) {
			medicationstatementdosageroutecoding.setCode(m.getMdctnStmntDsgRouteCdgCd());
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgDsply() != null) {
			medicationstatementdosageroutecoding.setDisplay(m.getMdctnStmntDsgRouteCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgSys() != null) {
			medicationstatementdosageroutecoding.setSystem(m.getMdctnStmntDsgRouteCdgSys());
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgUsrSltd() != null) {
			medicationstatementdosageroutecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgRouteCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgVrsn() != null) {
			medicationstatementdosageroutecoding.setVersion(m.getMdctnStmntDsgRouteCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_Route_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgRouteTxt() != null) {
			medicationstatementdosageroute.setText(m.getMdctnStmntDsgRouteTxt());
		}
		/******************** MdctnStmnt_Dsg_Sqnc ********************************************************************************/
		if(m.getMdctnStmntDsgSqnc() != null) {
			medicationstatementdosage.setSequence(Integer.parseInt(m.getMdctnStmntDsgSqnc()));
		}
		/******************** medicationstatementdosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagesite =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosage.setSite(medicationstatementdosagesite);

		/******************** medicationstatementdosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagesitecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosagesite.addCoding(medicationstatementdosagesitecoding);

		/******************** MdctnStmnt_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgCd() != null) {
			medicationstatementdosagesitecoding.setCode(m.getMdctnStmntDsgSiteCdgCd());
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgDsply() != null) {
			medicationstatementdosagesitecoding.setDisplay(m.getMdctnStmntDsgSiteCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgSys() != null) {
			medicationstatementdosagesitecoding.setSystem(m.getMdctnStmntDsgSiteCdgSys());
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgUsrSltd() != null) {
			medicationstatementdosagesitecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgSiteCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgVrsn() != null) {
			medicationstatementdosagesitecoding.setVersion(m.getMdctnStmntDsgSiteCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_Site_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgSiteTxt() != null) {
			medicationstatementdosagesite.setText(m.getMdctnStmntDsgSiteTxt());
		}
		/******************** MdctnStmnt_Dsg_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgTxt() != null) {
			medicationstatementdosage.setText(m.getMdctnStmntDsgTxt());
		}
		/******************** medicationstatementdosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationstatementdosagetiming =  new org.hl7.fhir.r4.model.Timing();
		medicationstatementdosage.setTiming(medicationstatementdosagetiming);

		/******************** medicationstatementdosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementdosagetiming.setCode(medicationstatementdosagetimingcode);

		/******************** medicationstatementdosagetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementdosagetimingcode.addCoding(medicationstatementdosagetimingcodecoding);

		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgCd() != null) {
			medicationstatementdosagetimingcodecoding.setCode(m.getMdctnStmntDsgTmgCdCdgCd());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgDsply() != null) {
			medicationstatementdosagetimingcodecoding.setDisplay(m.getMdctnStmntDsgTmgCdCdgDsply());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgSys() != null) {
			medicationstatementdosagetimingcodecoding.setSystem(m.getMdctnStmntDsgTmgCdCdgSys());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgUsrSltd() != null) {
			medicationstatementdosagetimingcodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntDsgTmgCdCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgVrsn() != null) {
			medicationstatementdosagetimingcodecoding.setVersion(m.getMdctnStmntDsgTmgCdCdgVrsn());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdTxt() != null) {
			medicationstatementdosagetimingcode.setText(m.getMdctnStmntDsgTmgCdTxt());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgEvnt() != null) {
			java.text.SimpleDateFormat MdctnStmnt_Dsg_Tmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_Dsg_Tmg_Evntdate = MdctnStmnt_Dsg_Tmg_Evntsdf.parse(m.getMdctnStmntDsgTmgEvnt());
			medicationstatementdosagetiming.addEvent(MdctnStmnt_Dsg_Tmg_Evntdate);
		}
		/******************** medicationstatementdosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationstatementdosagetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		medicationstatementdosagetiming.setRepeat(medicationstatementdosagetimingrepeat);

		/******************** medicationstatementdosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationstatementdosagetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		medicationstatementdosagetimingrepeat.setBounds(medicationstatementdosagetimingrepeatboundsduration);

		/******************** medicationstatementdosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementdosagetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		medicationstatementdosagetimingrepeat.setBounds(medicationstatementdosagetimingrepeatboundsperiod);

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Enddate = MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Endsdf.parse(m.getMdctnStmntDsgTmgRptBndsPrdEnd());
			medicationstatementdosagetimingrepeatboundsperiod.setEnd(MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Enddate);
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strtdate = MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strtsdf.parse(m.getMdctnStmntDsgTmgRptBndsPrdStrt());
			medicationstatementdosagetimingrepeatboundsperiod.setStart(MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** medicationstatementdosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		medicationstatementdosagetimingrepeat.setBounds(medicationstatementdosagetimingrepeatboundsrange);

		/******************** medicationstatementdosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagetimingrepeatboundsrange.setHigh(medicationstatementdosagetimingrepeatboundsrangehigh);

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiCd() != null) {
			medicationstatementdosagetimingrepeatboundsrangehigh.setCode(m.getMdctnStmntDsgTmgRptBndsRngHiCd());
		}
		/******************** medicationstatementdosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagetimingrepeatboundsrangehigh.setComparator(medicationstatementdosagetimingrepeatboundsrangehighcomparator.fromCode(m.getMdctnStmntDsgTmgRptBndsRngHiCmprtr()));

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiSys() != null) {
			medicationstatementdosagetimingrepeatboundsrangehigh.setSystem(m.getMdctnStmntDsgTmgRptBndsRngHiSys());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiUnt() != null) {
			medicationstatementdosagetimingrepeatboundsrangehigh.setUnit(m.getMdctnStmntDsgTmgRptBndsRngHiUnt());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiVl() != null) {
			medicationstatementdosagetimingrepeatboundsrangehigh.setValue(Double.parseDouble((m.getMdctnStmntDsgTmgRptBndsRngHiVl())));
		}
		/******************** medicationstatementdosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationstatementdosagetimingrepeatboundsrange.setLow(medicationstatementdosagetimingrepeatboundsrangelow);

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwCd() != null) {
			medicationstatementdosagetimingrepeatboundsrangelow.setCode(m.getMdctnStmntDsgTmgRptBndsRngLwCd());
		}
		/******************** medicationstatementdosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationstatementdosagetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationstatementdosagetimingrepeatboundsrangelow.setComparator(medicationstatementdosagetimingrepeatboundsrangelowcomparator.fromCode(m.getMdctnStmntDsgTmgRptBndsRngLwCmprtr()));

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwSys() != null) {
			medicationstatementdosagetimingrepeatboundsrangelow.setSystem(m.getMdctnStmntDsgTmgRptBndsRngLwSys());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwUnt() != null) {
			medicationstatementdosagetimingrepeatboundsrangelow.setUnit(m.getMdctnStmntDsgTmgRptBndsRngLwUnt());
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwVl() != null) {
			medicationstatementdosagetimingrepeatboundsrangelow.setValue(Double.parseDouble((m.getMdctnStmntDsgTmgRptBndsRngLwVl())));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptCnt() != null) {
			medicationstatementdosagetimingrepeat.setCount(Integer.parseInt(m.getMdctnStmntDsgTmgRptCnt()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptCntMx() != null) {
			medicationstatementdosagetimingrepeat.setCountMax(Integer.parseInt(m.getMdctnStmntDsgTmgRptCntMx()));
		}
		/******************** medicationstatementdosagetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory medicationstatementdosagetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		medicationstatementdosagetimingrepeat.addDayOfWeek(medicationstatementdosagetimingrepeatdayofweek.fromCode(m.getMdctnStmntDsgTmgRptDayOfWeek()));

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptDuration() != null) {
			medicationstatementdosagetimingrepeat.setDuration(Double.parseDouble((m.getMdctnStmntDsgTmgRptDuration())));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptDurationMx() != null) {
			medicationstatementdosagetimingrepeat.setDurationMax(Double.parseDouble((m.getMdctnStmntDsgTmgRptDurationMx())));
		}
		/******************** medicationstatementdosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationstatementdosagetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationstatementdosagetimingrepeat.setDurationUnit(medicationstatementdosagetimingrepeatdurationunit.fromCode(m.getMdctnStmntDsgTmgRptDurationUnt()));

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptFrqncy() != null) {
			medicationstatementdosagetimingrepeat.setFrequency(Integer.parseInt(m.getMdctnStmntDsgTmgRptFrqncy()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptFrqncyMx() != null) {
			medicationstatementdosagetimingrepeat.setFrequencyMax(Integer.parseInt(m.getMdctnStmntDsgTmgRptFrqncyMx()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptOff() != null) {
			medicationstatementdosagetimingrepeat.setOffset(Integer.parseInt(m.getMdctnStmntDsgTmgRptOff()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptPrd() != null) {
			medicationstatementdosagetimingrepeat.setPeriod(Double.parseDouble((m.getMdctnStmntDsgTmgRptPrd())));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptPrdMx() != null) {
			medicationstatementdosagetimingrepeat.setPeriodMax(Double.parseDouble((m.getMdctnStmntDsgTmgRptPrdMx())));
		}
		/******************** medicationstatementdosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationstatementdosagetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationstatementdosagetimingrepeat.setPeriodUnit(medicationstatementdosagetimingrepeatperiodunit.fromCode(m.getMdctnStmntDsgTmgRptPrdUnt()));

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptTimeOfDay() != null) {
			medicationstatementdosagetimingrepeat.addTimeOfDay(m.getMdctnStmntDsgTmgRptTimeOfDay());
		}
		/******************** medicationstatementdosagetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory medicationstatementdosagetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		medicationstatementdosagetimingrepeat.addWhen(medicationstatementdosagetimingrepeatwhen.fromCode(m.getMdctnStmntDsgTmgRptWhen()));

		/******************** MdctnStmnt_EfctiveDtTimeTyp ********************************************************************************/
		if(m.getMdctnStmntEfctiveDtTimeTyp() != null) {
			medicationstatement.setEffective( new org.hl7.fhir.r4.model.DateTimeType(m.getMdctnStmntEfctiveDtTimeTyp()));
		}
		/******************** medicationstatementeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		medicationstatement.setEffective(medicationstatementeffectiveperiod);

		/******************** MdctnStmnt_EfctivePrd_End ********************************************************************************/
		if(m.getMdctnStmntEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat MdctnStmnt_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_EfctivePrd_Enddate = MdctnStmnt_EfctivePrd_Endsdf.parse(m.getMdctnStmntEfctivePrdEnd());
			medicationstatementeffectiveperiod.setEnd(MdctnStmnt_EfctivePrd_Enddate);
		}
		/******************** MdctnStmnt_EfctivePrd_Strt ********************************************************************************/
		if(m.getMdctnStmntEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat MdctnStmnt_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_EfctivePrd_Strtdate = MdctnStmnt_EfctivePrd_Strtsdf.parse(m.getMdctnStmntEfctivePrdStrt());
			medicationstatementeffectiveperiod.setStart(MdctnStmnt_EfctivePrd_Strtdate);
		}
		/******************** medicationstatementidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationstatementidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicationstatement.addIdentifier(medicationstatementidentifier);

		/******************** MdctnStmnt_Id_Assigner ********************************************************************************/
		if(m.getMdctnStmntIdAssigner() != null) {
			medicationstatementidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntIdAssigner()));
		}
		/******************** medicationstatementidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicationstatementidentifier.setPeriod(medicationstatementidentifierperiod);

		/******************** MdctnStmnt_Id_Prd_End ********************************************************************************/
		if(m.getMdctnStmntIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnStmnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_Id_Prd_Enddate = MdctnStmnt_Id_Prd_Endsdf.parse(m.getMdctnStmntIdPrdEnd());
			medicationstatementidentifierperiod.setEnd(MdctnStmnt_Id_Prd_Enddate);
		}
		/******************** MdctnStmnt_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnStmntIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnStmnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_Id_Prd_Strtdate = MdctnStmnt_Id_Prd_Strtsdf.parse(m.getMdctnStmntIdPrdStrt());
			medicationstatementidentifierperiod.setStart(MdctnStmnt_Id_Prd_Strtdate);
		}
		/******************** MdctnStmnt_Id_Sys ********************************************************************************/
		if(m.getMdctnStmntIdSys() != null) {
			medicationstatementidentifier.setSystem(m.getMdctnStmntIdSys());
		}
		/******************** medicationstatementidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatementidentifier.setType(medicationstatementidentifiertype);

		/******************** medicationstatementidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementidentifiertype.addCoding(medicationstatementidentifiertypecoding);

		/******************** MdctnStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgCd() != null) {
			medicationstatementidentifiertypecoding.setCode(m.getMdctnStmntIdTypCdgCd());
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgDsply() != null) {
			medicationstatementidentifiertypecoding.setDisplay(m.getMdctnStmntIdTypCdgDsply());
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgSys() != null) {
			medicationstatementidentifiertypecoding.setSystem(m.getMdctnStmntIdTypCdgSys());
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgUsrSltd() != null) {
			medicationstatementidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntIdTypCdgUsrSltd()));
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgVrsn() != null) {
			medicationstatementidentifiertypecoding.setVersion(m.getMdctnStmntIdTypCdgVrsn());
		}
		/******************** MdctnStmnt_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnStmntIdTypTxt() != null) {
			medicationstatementidentifiertype.setText(m.getMdctnStmntIdTypTxt());
		}
		/******************** medicationstatementidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationstatementidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicationstatementidentifier.setUse(medicationstatementidentifieruse.fromCode(m.getMdctnStmntIdUse()));

		/******************** MdctnStmnt_Id_Vl ********************************************************************************/
		if(m.getMdctnStmntIdVl() != null) {
			medicationstatementidentifier.setValue(m.getMdctnStmntIdVl());
		}
		/******************** MdctnStmnt_InfoSrc ********************************************************************************/
		if(m.getMdctnStmntInfoSrc() != null) {
			medicationstatement.setInformationSource( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntInfoSrc()));
		}
		/******************** medicationstatementmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementmedicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatement.setMedication(medicationstatementmedicationcodeableconcept);

		/******************** medicationstatementmedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementmedicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementmedicationcodeableconcept.addCoding(medicationstatementmedicationcodeableconceptcoding);

		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgCd() != null) {
			medicationstatementmedicationcodeableconceptcoding.setCode(m.getMdctnStmntMdctnCdbleCncptCdgCd());
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgDsply() != null) {
			medicationstatementmedicationcodeableconceptcoding.setDisplay(m.getMdctnStmntMdctnCdbleCncptCdgDsply());
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgSys() != null) {
			medicationstatementmedicationcodeableconceptcoding.setSystem(m.getMdctnStmntMdctnCdbleCncptCdgSys());
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgUsrSltd() != null) {
			medicationstatementmedicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntMdctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgVrsn() != null) {
			medicationstatementmedicationcodeableconceptcoding.setVersion(m.getMdctnStmntMdctnCdbleCncptCdgVrsn());
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptTxt() != null) {
			medicationstatementmedicationcodeableconcept.setText(m.getMdctnStmntMdctnCdbleCncptTxt());
		}
		/******************** MdctnStmnt_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnStmntMdctnRfrnc() != null) {
			medicationstatement.setMedication( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntMdctnRfrnc()));
		}
		/******************** medicationstatementnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationstatementnote =  new org.hl7.fhir.r4.model.Annotation();
		medicationstatement.addNote(medicationstatementnote);

		/******************** MdctnStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnStmntNtAthrRfrnc() != null) {
			medicationstatementnote.setAuthor( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntNtAthrRfrnc()));
		}
		/******************** MdctnStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnStmntNtAthrStrgTyp() != null) {
			medicationstatementnote.setAuthor( new org.hl7.fhir.r4.model.StringType(m.getMdctnStmntNtAthrStrgTyp()));
		}
		/******************** MdctnStmnt_Nt_Txt ********************************************************************************/
		if(m.getMdctnStmntNtTxt() != null) {
			medicationstatementnote.setText(m.getMdctnStmntNtTxt());
		}
		/******************** MdctnStmnt_Nt_Time ********************************************************************************/
		if(m.getMdctnStmntNtTime() != null) {
			java.text.SimpleDateFormat MdctnStmnt_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnStmnt_Nt_Timedate = MdctnStmnt_Nt_Timesdf.parse(m.getMdctnStmntNtTime());
			medicationstatementnote.setTime(MdctnStmnt_Nt_Timedate);
		}
		/******************** MdctnStmnt_PartOf ********************************************************************************/
		if(m.getMdctnStmntPartOf() != null) {
			medicationstatement.addPartOf( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntPartOf()));
		}
		/******************** medicationstatementreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatement.addReasonCode(medicationstatementreasoncode);

		/******************** medicationstatementreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementreasoncode.addCoding(medicationstatementreasoncodecoding);

		/******************** MdctnStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgCd() != null) {
			medicationstatementreasoncodecoding.setCode(m.getMdctnStmntRsnCdCdgCd());
		}
		/******************** MdctnStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgDsply() != null) {
			medicationstatementreasoncodecoding.setDisplay(m.getMdctnStmntRsnCdCdgDsply());
		}
		/******************** MdctnStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgSys() != null) {
			medicationstatementreasoncodecoding.setSystem(m.getMdctnStmntRsnCdCdgSys());
		}
		/******************** MdctnStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgUsrSltd() != null) {
			medicationstatementreasoncodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntRsnCdCdgUsrSltd()));
		}
		/******************** MdctnStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgVrsn() != null) {
			medicationstatementreasoncodecoding.setVersion(m.getMdctnStmntRsnCdCdgVrsn());
		}
		/******************** MdctnStmnt_RsnCd_Txt ********************************************************************************/
		if(m.getMdctnStmntRsnCdTxt() != null) {
			medicationstatementreasoncode.setText(m.getMdctnStmntRsnCdTxt());
		}
		/******************** MdctnStmnt_RsnRfrnc ********************************************************************************/
		if(m.getMdctnStmntRsnRfrnc() != null) {
			medicationstatement.addReasonReference( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntRsnRfrnc()));
		}
		/******************** medicationstatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatusEnumFactory medicationstatementstatus =  new org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatusEnumFactory();
		medicationstatement.setStatus(medicationstatementstatus.fromCode(m.getMdctnStmntSts()));

		/******************** medicationstatementstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationstatement.addStatusReason(medicationstatementstatusreason);

		/******************** medicationstatementstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationstatementstatusreason.addCoding(medicationstatementstatusreasoncoding);

		/******************** MdctnStmnt_StsRsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgCd() != null) {
			medicationstatementstatusreasoncoding.setCode(m.getMdctnStmntStsRsnCdgCd());
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgDsply() != null) {
			medicationstatementstatusreasoncoding.setDisplay(m.getMdctnStmntStsRsnCdgDsply());
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgSys() != null) {
			medicationstatementstatusreasoncoding.setSystem(m.getMdctnStmntStsRsnCdgSys());
		}
		/******************** MdctnStmnt_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgUsrSltd() != null) {
			medicationstatementstatusreasoncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnStmntStsRsnCdgUsrSltd()));
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgVrsn() != null) {
			medicationstatementstatusreasoncoding.setVersion(m.getMdctnStmntStsRsnCdgVrsn());
		}
		/******************** MdctnStmnt_StsRsn_Txt ********************************************************************************/
		if(m.getMdctnStmntStsRsnTxt() != null) {
			medicationstatementstatusreason.setText(m.getMdctnStmntStsRsnTxt());
		}
		/******************** MdctnStmnt_Sbjct ********************************************************************************/
		if(m.getMdctnStmntSbjct() != null) {
			medicationstatement.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntSbjct()));
		}
		return medicationstatement;
	}
}
