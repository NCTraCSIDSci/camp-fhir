package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationDispense;
public class MedicationDispenseConversion 
{
	public org.hl7.fhir.r4.model.MedicationDispense MedicationDispenses(MedicationDispense m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationDispense medicationdispense = new org.hl7.fhir.r4.model.MedicationDispense();

		/******************** id ********************************************************************************/
		medicationdispense.setId(m.getId());

		/******************** MdctnDispns_AthrizingPrescription ********************************************************************************/
		if(m.getMdctnDispnsAthrizingPrescription() != null) {
			medicationdispense.addAuthorizingPrescription( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsAthrizingPrescription()));
		}
		/******************** medicationdispensecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispense.setCategory(medicationdispensecategory);

		/******************** medicationdispensecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensecategory.addCoding(medicationdispensecategorycoding);

		/******************** MdctnDispns_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgCd() != null) {
			medicationdispensecategorycoding.setCode(m.getMdctnDispnsCtgryCdgCd());
		}
		/******************** MdctnDispns_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgDsply() != null) {
			medicationdispensecategorycoding.setDisplay(m.getMdctnDispnsCtgryCdgDsply());
		}
		/******************** MdctnDispns_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgSys() != null) {
			medicationdispensecategorycoding.setSystem(m.getMdctnDispnsCtgryCdgSys());
		}
		/******************** MdctnDispns_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgUsrSltd() != null) {
			medicationdispensecategorycoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsCtgryCdgUsrSltd()));
		}
		/******************** MdctnDispns_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgVrsn() != null) {
			medicationdispensecategorycoding.setVersion(m.getMdctnDispnsCtgryCdgVrsn());
		}
		/******************** MdctnDispns_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnDispnsCtgryTxt() != null) {
			medicationdispensecategory.setText(m.getMdctnDispnsCtgryTxt());
		}
		/******************** MdctnDispns_Cntxt ********************************************************************************/
		if(m.getMdctnDispnsCntxt() != null) {
			medicationdispense.setContext( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsCntxt()));
		}
		/******************** medicationdispensedayssupply ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedayssupply =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispense.setDaysSupply(medicationdispensedayssupply);

		/******************** MdctnDispns_DaysSpply_Cd ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyCd() != null) {
			medicationdispensedayssupply.setCode(m.getMdctnDispnsDaysSpplyCd());
		}
		/******************** medicationdispensedayssupplycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedayssupplycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedayssupply.setComparator(medicationdispensedayssupplycomparator.fromCode(m.getMdctnDispnsDaysSpplyCmprtr()));

		/******************** MdctnDispns_DaysSpply_Sys ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplySys() != null) {
			medicationdispensedayssupply.setSystem(m.getMdctnDispnsDaysSpplySys());
		}
		/******************** MdctnDispns_DaysSpply_Unt ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyUnt() != null) {
			medicationdispensedayssupply.setUnit(m.getMdctnDispnsDaysSpplyUnt());
		}
		/******************** MdctnDispns_DaysSpply_Vl ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyVl() != null) {
			medicationdispensedayssupply.setValue(Double.parseDouble((m.getMdctnDispnsDaysSpplyVl())));
		}
		/******************** MdctnDispns_Destination ********************************************************************************/
		if(m.getMdctnDispnsDestination() != null) {
			medicationdispense.setDestination( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsDestination()));
		}
		/******************** MdctnDispns_DetectedIssue ********************************************************************************/
		if(m.getMdctnDispnsDetectedIssue() != null) {
			medicationdispense.addDetectedIssue( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsDetectedIssue()));
		}
		/******************** medicationdispensedosageinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationdispensedosageinstruction =  new org.hl7.fhir.r4.model.Dosage();
		medicationdispense.addDosageInstruction(medicationdispensedosageinstruction);

		/******************** medicationdispensedosageinstructionadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionadditionalinstruction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstruction.addAdditionalInstruction(medicationdispensedosageinstructionadditionalinstruction);

		/******************** medicationdispensedosageinstructionadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionadditionalinstructioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructionadditionalinstruction.addCoding(medicationdispensedosageinstructionadditionalinstructioncoding);

		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd() != null) {
			medicationdispensedosageinstructionadditionalinstructioncoding.setCode(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply() != null) {
			medicationdispensedosageinstructionadditionalinstructioncoding.setDisplay(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys() != null) {
			medicationdispensedosageinstructionadditionalinstructioncoding.setSystem(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd() != null) {
			medicationdispensedosageinstructionadditionalinstructioncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn() != null) {
			medicationdispensedosageinstructionadditionalinstructioncoding.setVersion(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnTxt() != null) {
			medicationdispensedosageinstructionadditionalinstruction.setText(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnTxt());
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdBooleanTyp() != null) {
			medicationdispensedosageinstruction.setAsNeeded( new org.hl7.fhir.r4.model.BooleanType(m.getMdctnDispnsDsgInstrctnAsNdBooleanTyp()));
		}
		/******************** medicationdispensedosageinstructionasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionasneededcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstruction.setAsNeeded(medicationdispensedosageinstructionasneededcodeableconcept);

		/******************** medicationdispensedosageinstructionasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionasneededcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructionasneededcodeableconcept.addCoding(medicationdispensedosageinstructionasneededcodeableconceptcoding);

		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd() != null) {
			medicationdispensedosageinstructionasneededcodeableconceptcoding.setCode(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply() != null) {
			medicationdispensedosageinstructionasneededcodeableconceptcoding.setDisplay(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys() != null) {
			medicationdispensedosageinstructionasneededcodeableconceptcoding.setSystem(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd() != null) {
			medicationdispensedosageinstructionasneededcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn() != null) {
			medicationdispensedosageinstructionasneededcodeableconceptcoding.setVersion(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt() != null) {
			medicationdispensedosageinstructionasneededcodeableconcept.setText(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt());
		}
		/******************** medicationdispensedosageinstructiondoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationdispensedosageinstructiondoseandrate =  new org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent();
		medicationdispensedosageinstruction.addDoseAndRate(medicationdispensedosageinstructiondoseandrate);

		/******************** medicationdispensedosageinstructiondoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedosequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandrate.setDose(medicationdispensedosageinstructiondoseandratedosequantity);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd() != null) {
			medicationdispensedosageinstructiondoseandratedosequantity.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd());
		}
		/******************** medicationdispensedosageinstructiondoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandratedosequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandratedosequantity.setComparator(medicationdispensedosageinstructiondoseandratedosequantitycomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys() != null) {
			medicationdispensedosageinstructiondoseandratedosequantity.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt() != null) {
			medicationdispensedosageinstructiondoseandratedosequantity.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl() != null) {
			medicationdispensedosageinstructiondoseandratedosequantity.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiondoseandratedoserange =  new org.hl7.fhir.r4.model.Range();
		medicationdispensedosageinstructiondoseandrate.setDose(medicationdispensedosageinstructiondoseandratedoserange);

		/******************** medicationdispensedosageinstructiondoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedoserangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandratedoserange.setHigh(medicationdispensedosageinstructiondoseandratedoserangehigh);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd() != null) {
			medicationdispensedosageinstructiondoseandratedoserangehigh.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd());
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandratedoserangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandratedoserangehigh.setComparator(medicationdispensedosageinstructiondoseandratedoserangehighcomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys() != null) {
			medicationdispensedosageinstructiondoseandratedoserangehigh.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt() != null) {
			medicationdispensedosageinstructiondoseandratedoserangehigh.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl() != null) {
			medicationdispensedosageinstructiondoseandratedoserangehigh.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedoserangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandratedoserange.setLow(medicationdispensedosageinstructiondoseandratedoserangelow);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd() != null) {
			medicationdispensedosageinstructiondoseandratedoserangelow.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd());
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandratedoserangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandratedoserangelow.setComparator(medicationdispensedosageinstructiondoseandratedoserangelowcomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys() != null) {
			medicationdispensedosageinstructiondoseandratedoserangelow.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt() != null) {
			medicationdispensedosageinstructiondoseandratedoserangelow.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl() != null) {
			medicationdispensedosageinstructiondoseandratedoserangelow.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateratequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandrate.setRate(medicationdispensedosageinstructiondoseandrateratequantity);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd() != null) {
			medicationdispensedosageinstructiondoseandrateratequantity.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd());
		}
		/******************** medicationdispensedosageinstructiondoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandrateratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandrateratequantity.setComparator(medicationdispensedosageinstructiondoseandrateratequantitycomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntySys() != null) {
			medicationdispensedosageinstructiondoseandrateratequantity.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntySys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt() != null) {
			medicationdispensedosageinstructiondoseandrateratequantity.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl() != null) {
			medicationdispensedosageinstructiondoseandrateratequantity.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiondoseandrateraterange =  new org.hl7.fhir.r4.model.Range();
		medicationdispensedosageinstructiondoseandrate.setRate(medicationdispensedosageinstructiondoseandrateraterange);

		/******************** medicationdispensedosageinstructiondoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandrateraterange.setHigh(medicationdispensedosageinstructiondoseandrateraterangehigh);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd() != null) {
			medicationdispensedosageinstructiondoseandrateraterangehigh.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd());
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandrateraterangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandrateraterangehigh.setComparator(medicationdispensedosageinstructiondoseandrateraterangehighcomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys() != null) {
			medicationdispensedosageinstructiondoseandrateraterangehigh.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt() != null) {
			medicationdispensedosageinstructiondoseandrateraterangehigh.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl() != null) {
			medicationdispensedosageinstructiondoseandrateraterangehigh.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandrateraterange.setLow(medicationdispensedosageinstructiondoseandrateraterangelow);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd() != null) {
			medicationdispensedosageinstructiondoseandrateraterangelow.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd());
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandrateraterangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandrateraterangelow.setComparator(medicationdispensedosageinstructiondoseandrateraterangelowcomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys() != null) {
			medicationdispensedosageinstructiondoseandrateraterangelow.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt() != null) {
			medicationdispensedosageinstructiondoseandrateraterangelow.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl() != null) {
			medicationdispensedosageinstructiondoseandrateraterangelow.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationdispensedosageinstructiondoseandraterateratio =  new org.hl7.fhir.r4.model.Ratio();
		medicationdispensedosageinstructiondoseandrate.setRate(medicationdispensedosageinstructiondoseandraterateratio);

		/******************** medicationdispensedosageinstructiondoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandraterateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandraterateratio.setDenominator(medicationdispensedosageinstructiondoseandraterateratiodenominator);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd() != null) {
			medicationdispensedosageinstructiondoseandraterateratiodenominator.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd());
		}
		/******************** medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandraterateratiodenominator.setComparator(medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys() != null) {
			medicationdispensedosageinstructiondoseandraterateratiodenominator.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt() != null) {
			medicationdispensedosageinstructiondoseandraterateratiodenominator.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl() != null) {
			medicationdispensedosageinstructiondoseandraterateratiodenominator.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiondoseandraterateratio.setNumerator(medicationdispensedosageinstructiondoseandrateraterationumerator);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd() != null) {
			medicationdispensedosageinstructiondoseandrateraterationumerator.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd());
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiondoseandrateraterationumerator.setComparator(medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator.fromCode(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys() != null) {
			medicationdispensedosageinstructiondoseandrateraterationumerator.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt() != null) {
			medicationdispensedosageinstructiondoseandrateraterationumerator.setUnit(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl() != null) {
			medicationdispensedosageinstructiondoseandrateraterationumerator.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl())));
		}
		/******************** medicationdispensedosageinstructiondoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructiondoseandratetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstructiondoseandrate.setType(medicationdispensedosageinstructiondoseandratetype);

		/******************** medicationdispensedosageinstructiondoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructiondoseandratetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructiondoseandratetype.addCoding(medicationdispensedosageinstructiondoseandratetypecoding);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd() != null) {
			medicationdispensedosageinstructiondoseandratetypecoding.setCode(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply() != null) {
			medicationdispensedosageinstructiondoseandratetypecoding.setDisplay(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys() != null) {
			medicationdispensedosageinstructiondoseandratetypecoding.setSystem(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd() != null) {
			medicationdispensedosageinstructiondoseandratetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn() != null) {
			medicationdispensedosageinstructiondoseandratetypecoding.setVersion(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypTxt() != null) {
			medicationdispensedosageinstructiondoseandratetype.setText(m.getMdctnDispnsDsgInstrctnDoseAndRtTypTxt());
		}
		/******************** medicationdispensedosageinstructionmaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperadministration =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstruction.setMaxDosePerAdministration(medicationdispensedosageinstructionmaxdoseperadministration);

		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd() != null) {
			medicationdispensedosageinstructionmaxdoseperadministration.setCode(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd());
		}
		/******************** medicationdispensedosageinstructionmaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructionmaxdoseperadministrationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructionmaxdoseperadministration.setComparator(medicationdispensedosageinstructionmaxdoseperadministrationcomparator.fromCode(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys() != null) {
			medicationdispensedosageinstructionmaxdoseperadministration.setSystem(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt() != null) {
			medicationdispensedosageinstructionmaxdoseperadministration.setUnit(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl() != null) {
			medicationdispensedosageinstructionmaxdoseperadministration.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl())));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperlifetime =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstruction.setMaxDosePerLifetime(medicationdispensedosageinstructionmaxdoseperlifetime);

		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCd() != null) {
			medicationdispensedosageinstructionmaxdoseperlifetime.setCode(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCd());
		}
		/******************** medicationdispensedosageinstructionmaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructionmaxdoseperlifetimecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructionmaxdoseperlifetime.setComparator(medicationdispensedosageinstructionmaxdoseperlifetimecomparator.fromCode(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeSys() != null) {
			medicationdispensedosageinstructionmaxdoseperlifetime.setSystem(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeSys());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt() != null) {
			medicationdispensedosageinstructionmaxdoseperlifetime.setUnit(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeVl() != null) {
			medicationdispensedosageinstructionmaxdoseperlifetime.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeVl())));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationdispensedosageinstructionmaxdoseperperiod =  new org.hl7.fhir.r4.model.Ratio();
		medicationdispensedosageinstruction.setMaxDosePerPeriod(medicationdispensedosageinstructionmaxdoseperperiod);

		/******************** medicationdispensedosageinstructionmaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperperioddenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructionmaxdoseperperiod.setDenominator(medicationdispensedosageinstructionmaxdoseperperioddenominator);

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd() != null) {
			medicationdispensedosageinstructionmaxdoseperperioddenominator.setCode(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd());
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructionmaxdoseperperioddenominator.setComparator(medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator.fromCode(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys() != null) {
			medicationdispensedosageinstructionmaxdoseperperioddenominator.setSystem(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt() != null) {
			medicationdispensedosageinstructionmaxdoseperperioddenominator.setUnit(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl() != null) {
			medicationdispensedosageinstructionmaxdoseperperioddenominator.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl())));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperperiodnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructionmaxdoseperperiod.setNumerator(medicationdispensedosageinstructionmaxdoseperperiodnumerator);

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd() != null) {
			medicationdispensedosageinstructionmaxdoseperperiodnumerator.setCode(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd());
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructionmaxdoseperperiodnumerator.setComparator(medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator.fromCode(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys() != null) {
			medicationdispensedosageinstructionmaxdoseperperiodnumerator.setSystem(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt() != null) {
			medicationdispensedosageinstructionmaxdoseperperiodnumerator.setUnit(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl() != null) {
			medicationdispensedosageinstructionmaxdoseperperiodnumerator.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl())));
		}
		/******************** medicationdispensedosageinstructionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstruction.setMethod(medicationdispensedosageinstructionmethod);

		/******************** medicationdispensedosageinstructionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructionmethod.addCoding(medicationdispensedosageinstructionmethodcoding);

		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgCd() != null) {
			medicationdispensedosageinstructionmethodcoding.setCode(m.getMdctnDispnsDsgInstrctnMthdCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgDsply() != null) {
			medicationdispensedosageinstructionmethodcoding.setDisplay(m.getMdctnDispnsDsgInstrctnMthdCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgSys() != null) {
			medicationdispensedosageinstructionmethodcoding.setSystem(m.getMdctnDispnsDsgInstrctnMthdCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgUsrSltd() != null) {
			medicationdispensedosageinstructionmethodcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnMthdCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgVrsn() != null) {
			medicationdispensedosageinstructionmethodcoding.setVersion(m.getMdctnDispnsDsgInstrctnMthdCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdTxt() != null) {
			medicationdispensedosageinstructionmethod.setText(m.getMdctnDispnsDsgInstrctnMthdTxt());
		}
		/******************** MdctnDispns_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnPntInstrctn() != null) {
			medicationdispensedosageinstruction.setPatientInstruction(m.getMdctnDispnsDsgInstrctnPntInstrctn());
		}
		/******************** medicationdispensedosageinstructionroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstruction.setRoute(medicationdispensedosageinstructionroute);

		/******************** medicationdispensedosageinstructionroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionroutecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructionroute.addCoding(medicationdispensedosageinstructionroutecoding);

		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgCd() != null) {
			medicationdispensedosageinstructionroutecoding.setCode(m.getMdctnDispnsDsgInstrctnRouteCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgDsply() != null) {
			medicationdispensedosageinstructionroutecoding.setDisplay(m.getMdctnDispnsDsgInstrctnRouteCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgSys() != null) {
			medicationdispensedosageinstructionroutecoding.setSystem(m.getMdctnDispnsDsgInstrctnRouteCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgUsrSltd() != null) {
			medicationdispensedosageinstructionroutecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnRouteCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgVrsn() != null) {
			medicationdispensedosageinstructionroutecoding.setVersion(m.getMdctnDispnsDsgInstrctnRouteCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteTxt() != null) {
			medicationdispensedosageinstructionroute.setText(m.getMdctnDispnsDsgInstrctnRouteTxt());
		}
		/******************** MdctnDispns_DsgInstrctn_Sqnc ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSqnc() != null) {
			medicationdispensedosageinstruction.setSequence(Integer.parseInt(m.getMdctnDispnsDsgInstrctnSqnc()));
		}
		/******************** medicationdispensedosageinstructionsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstruction.setSite(medicationdispensedosageinstructionsite);

		/******************** medicationdispensedosageinstructionsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionsitecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructionsite.addCoding(medicationdispensedosageinstructionsitecoding);

		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgCd() != null) {
			medicationdispensedosageinstructionsitecoding.setCode(m.getMdctnDispnsDsgInstrctnSiteCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgDsply() != null) {
			medicationdispensedosageinstructionsitecoding.setDisplay(m.getMdctnDispnsDsgInstrctnSiteCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgSys() != null) {
			medicationdispensedosageinstructionsitecoding.setSystem(m.getMdctnDispnsDsgInstrctnSiteCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgUsrSltd() != null) {
			medicationdispensedosageinstructionsitecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnSiteCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgVrsn() != null) {
			medicationdispensedosageinstructionsitecoding.setVersion(m.getMdctnDispnsDsgInstrctnSiteCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteTxt() != null) {
			medicationdispensedosageinstructionsite.setText(m.getMdctnDispnsDsgInstrctnSiteTxt());
		}
		/******************** MdctnDispns_DsgInstrctn_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTxt() != null) {
			medicationdispensedosageinstruction.setText(m.getMdctnDispnsDsgInstrctnTxt());
		}
		/******************** medicationdispensedosageinstructiontiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationdispensedosageinstructiontiming =  new org.hl7.fhir.r4.model.Timing();
		medicationdispensedosageinstruction.setTiming(medicationdispensedosageinstructiontiming);

		/******************** medicationdispensedosageinstructiontimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructiontimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensedosageinstructiontiming.setCode(medicationdispensedosageinstructiontimingcode);

		/******************** medicationdispensedosageinstructiontimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructiontimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensedosageinstructiontimingcode.addCoding(medicationdispensedosageinstructiontimingcodecoding);

		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgCd() != null) {
			medicationdispensedosageinstructiontimingcodecoding.setCode(m.getMdctnDispnsDsgInstrctnTmgCdCdgCd());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgDsply() != null) {
			medicationdispensedosageinstructiontimingcodecoding.setDisplay(m.getMdctnDispnsDsgInstrctnTmgCdCdgDsply());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgSys() != null) {
			medicationdispensedosageinstructiontimingcodecoding.setSystem(m.getMdctnDispnsDsgInstrctnTmgCdCdgSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd() != null) {
			medicationdispensedosageinstructiontimingcodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgVrsn() != null) {
			medicationdispensedosageinstructiontimingcodecoding.setVersion(m.getMdctnDispnsDsgInstrctnTmgCdCdgVrsn());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdTxt() != null) {
			medicationdispensedosageinstructiontimingcode.setText(m.getMdctnDispnsDsgInstrctnTmgCdTxt());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgEvnt() != null) {
			java.text.SimpleDateFormat MdctnDispns_DsgInstrctn_Tmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_DsgInstrctn_Tmg_Evntdate = MdctnDispns_DsgInstrctn_Tmg_Evntsdf.parse(m.getMdctnDispnsDsgInstrctnTmgEvnt());
			medicationdispensedosageinstructiontiming.addEvent(MdctnDispns_DsgInstrctn_Tmg_Evntdate);
		}
		/******************** medicationdispensedosageinstructiontimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationdispensedosageinstructiontimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		medicationdispensedosageinstructiontiming.setRepeat(medicationdispensedosageinstructiontimingrepeat);

		/******************** medicationdispensedosageinstructiontimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationdispensedosageinstructiontimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		medicationdispensedosageinstructiontimingrepeat.setBounds(medicationdispensedosageinstructiontimingrepeatboundsduration);

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCd() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsduration.setCode(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCd());
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiontimingrepeatboundsduration.setComparator(medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationSys() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsduration.setSystem(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsduration.setUnit(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationVl() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsduration.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationVl())));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationdispensedosageinstructiontimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		medicationdispensedosageinstructiontimingrepeat.setBounds(medicationdispensedosageinstructiontimingrepeatboundsperiod);

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Enddate = MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Endsdf.parse(m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd());
			medicationdispensedosageinstructiontimingrepeatboundsperiod.setEnd(MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Enddate);
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtdate = MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtsdf.parse(m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt());
			medicationdispensedosageinstructiontimingrepeatboundsperiod.setStart(MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiontimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		medicationdispensedosageinstructiontimingrepeat.setBounds(medicationdispensedosageinstructiontimingrepeatboundsrange);

		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiontimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiontimingrepeatboundsrange.setHigh(medicationdispensedosageinstructiontimingrepeatboundsrangehigh);

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangehigh.setCode(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd());
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiontimingrepeatboundsrangehigh.setComparator(medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangehigh.setSystem(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangehigh.setUnit(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangehigh.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl())));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiontimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispensedosageinstructiontimingrepeatboundsrange.setLow(medicationdispensedosageinstructiontimingrepeatboundsrangelow);

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangelow.setCode(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd());
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensedosageinstructiontimingrepeatboundsrangelow.setComparator(medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCmprtr()));

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangelow.setSystem(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangelow.setUnit(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt());
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl() != null) {
			medicationdispensedosageinstructiontimingrepeatboundsrangelow.setValue(Double.parseDouble((m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl())));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptCnt() != null) {
			medicationdispensedosageinstructiontimingrepeat.setCount(Integer.parseInt(m.getMdctnDispnsDsgInstrctnTmgRptCnt()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptCntMx() != null) {
			medicationdispensedosageinstructiontimingrepeat.setCountMax(Integer.parseInt(m.getMdctnDispnsDsgInstrctnTmgRptCntMx()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory medicationdispensedosageinstructiontimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		medicationdispensedosageinstructiontimingrepeat.addDayOfWeek(medicationdispensedosageinstructiontimingrepeatdayofweek.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptDayOfWeek()));

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptDuration() != null) {
			medicationdispensedosageinstructiontimingrepeat.setDuration(Double.parseDouble((m.getMdctnDispnsDsgInstrctnTmgRptDuration())));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptDurationMx() != null) {
			medicationdispensedosageinstructiontimingrepeat.setDurationMax(Double.parseDouble((m.getMdctnDispnsDsgInstrctnTmgRptDurationMx())));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationdispensedosageinstructiontimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationdispensedosageinstructiontimingrepeat.setDurationUnit(medicationdispensedosageinstructiontimingrepeatdurationunit.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptDurationUnt()));

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptFrqncy() != null) {
			medicationdispensedosageinstructiontimingrepeat.setFrequency(Integer.parseInt(m.getMdctnDispnsDsgInstrctnTmgRptFrqncy()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptFrqncyMx() != null) {
			medicationdispensedosageinstructiontimingrepeat.setFrequencyMax(Integer.parseInt(m.getMdctnDispnsDsgInstrctnTmgRptFrqncyMx()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptOff() != null) {
			medicationdispensedosageinstructiontimingrepeat.setOffset(Integer.parseInt(m.getMdctnDispnsDsgInstrctnTmgRptOff()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptPrd() != null) {
			medicationdispensedosageinstructiontimingrepeat.setPeriod(Double.parseDouble((m.getMdctnDispnsDsgInstrctnTmgRptPrd())));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptPrdMx() != null) {
			medicationdispensedosageinstructiontimingrepeat.setPeriodMax(new java.math.BigDecimal((m.getMdctnDispnsDsgInstrctnTmgRptPrdMx())));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationdispensedosageinstructiontimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationdispensedosageinstructiontimingrepeat.setPeriodUnit(medicationdispensedosageinstructiontimingrepeatperiodunit.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptPrdUnt()));

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptTimeOfDay() != null) {
			medicationdispensedosageinstructiontimingrepeat.addTimeOfDay(m.getMdctnDispnsDsgInstrctnTmgRptTimeOfDay());
		}
		/******************** medicationdispensedosageinstructiontimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory medicationdispensedosageinstructiontimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		medicationdispensedosageinstructiontimingrepeat.addWhen(medicationdispensedosageinstructiontimingrepeatwhen.fromCode(m.getMdctnDispnsDsgInstrctnTmgRptWhen()));

		/******************** MdctnDispns_EvntHis ********************************************************************************/
		if(m.getMdctnDispnsEvntHis() != null) {
			medicationdispense.addEventHistory( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsEvntHis()));
		}
		/******************** medicationdispenseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationdispenseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicationdispense.addIdentifier(medicationdispenseidentifier);

		/******************** MdctnDispns_Id_Assigner ********************************************************************************/
		if(m.getMdctnDispnsIdAssigner() != null) {
			medicationdispenseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsIdAssigner()));
		}
		/******************** medicationdispenseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationdispenseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicationdispenseidentifier.setPeriod(medicationdispenseidentifierperiod);

		/******************** MdctnDispns_Id_Prd_End ********************************************************************************/
		if(m.getMdctnDispnsIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnDispns_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_Id_Prd_Enddate = MdctnDispns_Id_Prd_Endsdf.parse(m.getMdctnDispnsIdPrdEnd());
			medicationdispenseidentifierperiod.setEnd(MdctnDispns_Id_Prd_Enddate);
		}
		/******************** MdctnDispns_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnDispnsIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnDispns_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_Id_Prd_Strtdate = MdctnDispns_Id_Prd_Strtsdf.parse(m.getMdctnDispnsIdPrdStrt());
			medicationdispenseidentifierperiod.setStart(MdctnDispns_Id_Prd_Strtdate);
		}
		/******************** MdctnDispns_Id_Sys ********************************************************************************/
		if(m.getMdctnDispnsIdSys() != null) {
			medicationdispenseidentifier.setSystem(m.getMdctnDispnsIdSys());
		}
		/******************** medicationdispenseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispenseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispenseidentifier.setType(medicationdispenseidentifiertype);

		/******************** medicationdispenseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispenseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispenseidentifiertype.addCoding(medicationdispenseidentifiertypecoding);

		/******************** MdctnDispns_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgCd() != null) {
			medicationdispenseidentifiertypecoding.setCode(m.getMdctnDispnsIdTypCdgCd());
		}
		/******************** MdctnDispns_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgDsply() != null) {
			medicationdispenseidentifiertypecoding.setDisplay(m.getMdctnDispnsIdTypCdgDsply());
		}
		/******************** MdctnDispns_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgSys() != null) {
			medicationdispenseidentifiertypecoding.setSystem(m.getMdctnDispnsIdTypCdgSys());
		}
		/******************** MdctnDispns_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgUsrSltd() != null) {
			medicationdispenseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsIdTypCdgUsrSltd()));
		}
		/******************** MdctnDispns_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgVrsn() != null) {
			medicationdispenseidentifiertypecoding.setVersion(m.getMdctnDispnsIdTypCdgVrsn());
		}
		/******************** MdctnDispns_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsIdTypTxt() != null) {
			medicationdispenseidentifiertype.setText(m.getMdctnDispnsIdTypTxt());
		}
		/******************** medicationdispenseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationdispenseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicationdispenseidentifier.setUse(medicationdispenseidentifieruse.fromCode(m.getMdctnDispnsIdUse()));

		/******************** MdctnDispns_Id_Vl ********************************************************************************/
		if(m.getMdctnDispnsIdVl() != null) {
			medicationdispenseidentifier.setValue(m.getMdctnDispnsIdVl());
		}
		/******************** MdctnDispns_Lctn ********************************************************************************/
		if(m.getMdctnDispnsLctn() != null) {
			medicationdispense.setLocation( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsLctn()));
		}
		/******************** medicationdispensemedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensemedicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispense.setMedication(medicationdispensemedicationcodeableconcept);

		/******************** medicationdispensemedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensemedicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensemedicationcodeableconcept.addCoding(medicationdispensemedicationcodeableconceptcoding);

		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgCd() != null) {
			medicationdispensemedicationcodeableconceptcoding.setCode(m.getMdctnDispnsMdctnCdbleCncptCdgCd());
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgDsply() != null) {
			medicationdispensemedicationcodeableconceptcoding.setDisplay(m.getMdctnDispnsMdctnCdbleCncptCdgDsply());
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgSys() != null) {
			medicationdispensemedicationcodeableconceptcoding.setSystem(m.getMdctnDispnsMdctnCdbleCncptCdgSys());
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgUsrSltd() != null) {
			medicationdispensemedicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsMdctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgVrsn() != null) {
			medicationdispensemedicationcodeableconceptcoding.setVersion(m.getMdctnDispnsMdctnCdbleCncptCdgVrsn());
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptTxt() != null) {
			medicationdispensemedicationcodeableconcept.setText(m.getMdctnDispnsMdctnCdbleCncptTxt());
		}
		/******************** MdctnDispns_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnDispnsMdctnRfrnc() != null) {
			medicationdispense.setMedication( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsMdctnRfrnc()));
		}
		/******************** medicationdispensenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationdispensenote =  new org.hl7.fhir.r4.model.Annotation();
		medicationdispense.addNote(medicationdispensenote);

		/******************** MdctnDispns_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnDispnsNtAthrRfrnc() != null) {
			medicationdispensenote.setAuthor( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsNtAthrRfrnc()));
		}
		/******************** MdctnDispns_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnDispnsNtAthrStrgTyp() != null) {
			medicationdispensenote.setAuthor( new org.hl7.fhir.r4.model.StringType(m.getMdctnDispnsNtAthrStrgTyp()));
		}
		/******************** MdctnDispns_Nt_Txt ********************************************************************************/
		if(m.getMdctnDispnsNtTxt() != null) {
			medicationdispensenote.setText(m.getMdctnDispnsNtTxt());
		}
		/******************** MdctnDispns_Nt_Time ********************************************************************************/
		if(m.getMdctnDispnsNtTime() != null) {
			java.text.SimpleDateFormat MdctnDispns_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_Nt_Timedate = MdctnDispns_Nt_Timesdf.parse(m.getMdctnDispnsNtTime());
			medicationdispensenote.setTime(MdctnDispns_Nt_Timedate);
		}
		/******************** MdctnDispns_PartOf ********************************************************************************/
		if(m.getMdctnDispnsPartOf() != null) {
			medicationdispense.addPartOf( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsPartOf()));
		}
		/******************** medicationdispenseperformer ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispensePerformerComponent medicationdispenseperformer =  new org.hl7.fhir.r4.model.MedicationDispense.MedicationDispensePerformerComponent();
		medicationdispense.addPerformer(medicationdispenseperformer);

		/******************** MdctnDispns_Prfrmr_Actor ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrActor() != null) {
			medicationdispenseperformer.setActor( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsPrfrmrActor()));
		}
		/******************** medicationdispenseperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispenseperformerfunction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispenseperformer.setFunction(medicationdispenseperformerfunction);

		/******************** medicationdispenseperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispenseperformerfunctioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispenseperformerfunction.addCoding(medicationdispenseperformerfunctioncoding);

		/******************** MdctnDispns_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgCd() != null) {
			medicationdispenseperformerfunctioncoding.setCode(m.getMdctnDispnsPrfrmrFunctionCdgCd());
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgDsply() != null) {
			medicationdispenseperformerfunctioncoding.setDisplay(m.getMdctnDispnsPrfrmrFunctionCdgDsply());
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgSys() != null) {
			medicationdispenseperformerfunctioncoding.setSystem(m.getMdctnDispnsPrfrmrFunctionCdgSys());
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgUsrSltd() != null) {
			medicationdispenseperformerfunctioncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsPrfrmrFunctionCdgUsrSltd()));
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgVrsn() != null) {
			medicationdispenseperformerfunctioncoding.setVersion(m.getMdctnDispnsPrfrmrFunctionCdgVrsn());
		}
		/******************** MdctnDispns_Prfrmr_Function_Txt ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionTxt() != null) {
			medicationdispenseperformerfunction.setText(m.getMdctnDispnsPrfrmrFunctionTxt());
		}
		/******************** medicationdispensequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationdispense.setQuantity(medicationdispensequantity);

		/******************** MdctnDispns_Qnty_Cd ********************************************************************************/
		if(m.getMdctnDispnsQntyCd() != null) {
			medicationdispensequantity.setCode(m.getMdctnDispnsQntyCd());
		}
		/******************** medicationdispensequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationdispensequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationdispensequantity.setComparator(medicationdispensequantitycomparator.fromCode(m.getMdctnDispnsQntyCmprtr()));

		/******************** MdctnDispns_Qnty_Sys ********************************************************************************/
		if(m.getMdctnDispnsQntySys() != null) {
			medicationdispensequantity.setSystem(m.getMdctnDispnsQntySys());
		}
		/******************** MdctnDispns_Qnty_Unt ********************************************************************************/
		if(m.getMdctnDispnsQntyUnt() != null) {
			medicationdispensequantity.setUnit(m.getMdctnDispnsQntyUnt());
		}
		/******************** MdctnDispns_Qnty_Vl ********************************************************************************/
		if(m.getMdctnDispnsQntyVl() != null) {
			medicationdispensequantity.setValue(Double.parseDouble((m.getMdctnDispnsQntyVl())));
		}
		/******************** MdctnDispns_Receiver ********************************************************************************/
		if(m.getMdctnDispnsReceiver() != null) {
			medicationdispense.addReceiver( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsReceiver()));
		}
		/******************** medicationdispensestatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseStatusEnumFactory medicationdispensestatus =  new org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseStatusEnumFactory();
		medicationdispense.setStatus(medicationdispensestatus.fromCode(m.getMdctnDispnsSts()));

		/******************** medicationdispensestatusreasoncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensestatusreasoncodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispense.setStatusReason(medicationdispensestatusreasoncodeableconcept);

		/******************** medicationdispensestatusreasoncodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensestatusreasoncodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensestatusreasoncodeableconcept.addCoding(medicationdispensestatusreasoncodeableconceptcoding);

		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgCd() != null) {
			medicationdispensestatusreasoncodeableconceptcoding.setCode(m.getMdctnDispnsStsRsnCdbleCncptCdgCd());
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgDsply() != null) {
			medicationdispensestatusreasoncodeableconceptcoding.setDisplay(m.getMdctnDispnsStsRsnCdbleCncptCdgDsply());
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgSys() != null) {
			medicationdispensestatusreasoncodeableconceptcoding.setSystem(m.getMdctnDispnsStsRsnCdbleCncptCdgSys());
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgUsrSltd() != null) {
			medicationdispensestatusreasoncodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsStsRsnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgVrsn() != null) {
			medicationdispensestatusreasoncodeableconceptcoding.setVersion(m.getMdctnDispnsStsRsnCdbleCncptCdgVrsn());
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptTxt() != null) {
			medicationdispensestatusreasoncodeableconcept.setText(m.getMdctnDispnsStsRsnCdbleCncptTxt());
		}
		/******************** MdctnDispns_StsRsnRfrnc ********************************************************************************/
		if(m.getMdctnDispnsStsRsnRfrnc() != null) {
			medicationdispense.setStatusReason( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsStsRsnRfrnc()));
		}
		/******************** MdctnDispns_Sbjct ********************************************************************************/
		if(m.getMdctnDispnsSbjct() != null) {
			medicationdispense.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsSbjct()));
		}
		/******************** medicationdispensesubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseSubstitutionComponent medicationdispensesubstitution =  new org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseSubstitutionComponent();
		medicationdispense.setSubstitution(medicationdispensesubstitution);

		/******************** medicationdispensesubstitutionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensesubstitutionreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensesubstitution.addReason(medicationdispensesubstitutionreason);

		/******************** medicationdispensesubstitutionreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensesubstitutionreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensesubstitutionreason.addCoding(medicationdispensesubstitutionreasoncoding);

		/******************** MdctnDispns_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgCd() != null) {
			medicationdispensesubstitutionreasoncoding.setCode(m.getMdctnDispnsSubstitutionRsnCdgCd());
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgDsply() != null) {
			medicationdispensesubstitutionreasoncoding.setDisplay(m.getMdctnDispnsSubstitutionRsnCdgDsply());
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgSys() != null) {
			medicationdispensesubstitutionreasoncoding.setSystem(m.getMdctnDispnsSubstitutionRsnCdgSys());
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgUsrSltd() != null) {
			medicationdispensesubstitutionreasoncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsSubstitutionRsnCdgUsrSltd()));
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgVrsn() != null) {
			medicationdispensesubstitutionreasoncoding.setVersion(m.getMdctnDispnsSubstitutionRsnCdgVrsn());
		}
		/******************** MdctnDispns_Substitution_Rsn_Txt ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnTxt() != null) {
			medicationdispensesubstitutionreason.setText(m.getMdctnDispnsSubstitutionRsnTxt());
		}
		/******************** MdctnDispns_Substitution_ResponsibleParty ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionResponsibleParty() != null) {
			medicationdispensesubstitution.addResponsibleParty( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsSubstitutionResponsibleParty()));
		}
		/******************** medicationdispensesubstitutiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensesubstitutiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispensesubstitution.setType(medicationdispensesubstitutiontype);

		/******************** medicationdispensesubstitutiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensesubstitutiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensesubstitutiontype.addCoding(medicationdispensesubstitutiontypecoding);

		/******************** MdctnDispns_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgCd() != null) {
			medicationdispensesubstitutiontypecoding.setCode(m.getMdctnDispnsSubstitutionTypCdgCd());
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgDsply() != null) {
			medicationdispensesubstitutiontypecoding.setDisplay(m.getMdctnDispnsSubstitutionTypCdgDsply());
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgSys() != null) {
			medicationdispensesubstitutiontypecoding.setSystem(m.getMdctnDispnsSubstitutionTypCdgSys());
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgUsrSltd() != null) {
			medicationdispensesubstitutiontypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsSubstitutionTypCdgUsrSltd()));
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgVrsn() != null) {
			medicationdispensesubstitutiontypecoding.setVersion(m.getMdctnDispnsSubstitutionTypCdgVrsn());
		}
		/******************** MdctnDispns_Substitution_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypTxt() != null) {
			medicationdispensesubstitutiontype.setText(m.getMdctnDispnsSubstitutionTypTxt());
		}
		/******************** MdctnDispns_Substitution_WasSubstituted ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionWasSubstituted() != null) {
			medicationdispensesubstitution.setWasSubstituted(Boolean.parseBoolean(m.getMdctnDispnsSubstitutionWasSubstituted()));
		}
		/******************** MdctnDispns_SprtingInfo ********************************************************************************/
		if(m.getMdctnDispnsSprtingInfo() != null) {
			medicationdispense.addSupportingInformation( new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsSprtingInfo()));
		}
		/******************** medicationdispensetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationdispense.setType(medicationdispensetype);

		/******************** medicationdispensetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationdispensetype.addCoding(medicationdispensetypecoding);

		/******************** MdctnDispns_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsTypCdgCd() != null) {
			medicationdispensetypecoding.setCode(m.getMdctnDispnsTypCdgCd());
		}
		/******************** MdctnDispns_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsTypCdgDsply() != null) {
			medicationdispensetypecoding.setDisplay(m.getMdctnDispnsTypCdgDsply());
		}
		/******************** MdctnDispns_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsTypCdgSys() != null) {
			medicationdispensetypecoding.setSystem(m.getMdctnDispnsTypCdgSys());
		}
		/******************** MdctnDispns_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsTypCdgUsrSltd() != null) {
			medicationdispensetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnDispnsTypCdgUsrSltd()));
		}
		/******************** MdctnDispns_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsTypCdgVrsn() != null) {
			medicationdispensetypecoding.setVersion(m.getMdctnDispnsTypCdgVrsn());
		}
		/******************** MdctnDispns_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsTypTxt() != null) {
			medicationdispensetype.setText(m.getMdctnDispnsTypTxt());
		}
		/******************** MdctnDispns_WhenHandedOver ********************************************************************************/
		if(m.getMdctnDispnsWhenHandedOver() != null) {
			java.text.SimpleDateFormat MdctnDispns_WhenHandedOversdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_WhenHandedOverdate = MdctnDispns_WhenHandedOversdf.parse(m.getMdctnDispnsWhenHandedOver());
			medicationdispense.setWhenHandedOver(MdctnDispns_WhenHandedOverdate);
		}
		/******************** MdctnDispns_WhenPrepared ********************************************************************************/
		if(m.getMdctnDispnsWhenPrepared() != null) {
			java.text.SimpleDateFormat MdctnDispns_WhenPreparedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnDispns_WhenPrepareddate = MdctnDispns_WhenPreparedsdf.parse(m.getMdctnDispnsWhenPrepared());
			medicationdispense.setWhenPrepared(MdctnDispns_WhenPrepareddate);
		}
		return medicationdispense;
	}
}
