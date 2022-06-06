package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationKnowledge;
public class MedicationKnowledgeConversion 
{
	public org.hl7.fhir.r4.model.MedicationKnowledge MedicationKnowledges(MedicationKnowledge m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationKnowledge medicationknowledge = new org.hl7.fhir.r4.model.MedicationKnowledge();

		/******************** id ********************************************************************************/
		medicationknowledge.setId(m.getId());

		/******************** medicationknowledgeadministrationguidelines ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent medicationknowledgeadministrationguidelines =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent();
		medicationknowledge.addAdministrationGuidelines(medicationknowledgeadministrationguidelines);

		/******************** medicationknowledgeadministrationguidelinesdosage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent medicationknowledgeadministrationguidelinesdosage =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent();
		medicationknowledgeadministrationguidelines.addDosage(medicationknowledgeadministrationguidelinesdosage);

		/******************** medicationknowledgeadministrationguidelinesdosagedosage ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationknowledgeadministrationguidelinesdosagedosage =  new org.hl7.fhir.r4.model.Dosage();
		medicationknowledgeadministrationguidelinesdosage.addDosage(medicationknowledgeadministrationguidelinesdosagedosage);

		/******************** medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosage.addAdditionalInstruction(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction);

		/******************** medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.addCoding(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp() != null) {
			medicationknowledgeadministrationguidelinesdosagedosage.setAsNeeded( new org.hl7.fhir.r4.model.BooleanType(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosage.setAsNeeded(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept);

		/******************** medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.addCoding(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationknowledgeadministrationguidelinesdosagedosagedoseandrate =  new org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent();
		medicationknowledgeadministrationguidelinesdosagedosage.addDoseAndRate(medicationknowledgeadministrationguidelinesdosagedosagedoseandrate);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.setDose(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange =  new org.hl7.fhir.r4.model.Range();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.setDose(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange.setHigh(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange.setLow(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.setRate(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange =  new org.hl7.fhir.r4.model.Range();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.setRate(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange.setHigh(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange.setLow(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio =  new org.hl7.fhir.r4.model.Ratio();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.setRate(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio.setDenominator(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio.setNumerator(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.setComparator(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.setType(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.addCoding(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosage.setMaxDosePerAdministration(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.setComparator(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosage.setMaxDosePerLifetime(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.setComparator(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod =  new org.hl7.fhir.r4.model.Ratio();
		medicationknowledgeadministrationguidelinesdosagedosage.setMaxDosePerPeriod(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod.setDenominator(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.setComparator(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod.setNumerator(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.setComparator(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagemethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosage.setMethod(medicationknowledgeadministrationguidelinesdosagedosagemethod);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagemethodcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosagemethod.addCoding(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagemethod.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdTxt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_PntInstrctn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosage.setPatientInstruction(m.getMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosage.setRoute(medicationknowledgeadministrationguidelinesdosagedosageroute);

		/******************** medicationknowledgeadministrationguidelinesdosagedosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosageroutecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosageroute.addCoding(medicationknowledgeadministrationguidelinesdosagedosageroutecoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageroutecoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageroutecoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageroutecoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageroutecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageroutecoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosageroute.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteTxt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Sqnc ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSqnc() != null) {
			medicationknowledgeadministrationguidelinesdosagedosage.setSequence(Integer.parseInt(m.getMdctnKnldgAdmnGdlnsDsgDsgSqnc()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagesite =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosage.setSite(medicationknowledgeadministrationguidelinesdosagedosagesite);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagesitecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosagesite.addCoding(medicationknowledgeadministrationguidelinesdosagedosagesitecoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagesitecoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagesitecoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagesitecoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagesitecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagesitecoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagesite.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteTxt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosage.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgTxt());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationknowledgeadministrationguidelinesdosagedosagetiming =  new org.hl7.fhir.r4.model.Timing();
		medicationknowledgeadministrationguidelinesdosagedosage.setTiming(medicationknowledgeadministrationguidelinesdosagedosagetiming);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosagedosagetiming.setCode(medicationknowledgeadministrationguidelinesdosagedosagetimingcode);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagedosagetimingcode.addCoding(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingcode.setText(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt() != null) {
			java.text.SimpleDateFormat MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evntdate = MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evntsdf.parse(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt());
			medicationknowledgeadministrationguidelinesdosagedosagetiming.addEvent(MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evntdate);
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		medicationknowledgeadministrationguidelinesdosagedosagetiming.setRepeat(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setBounds(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setBounds(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Enddate = MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Endsdf.parse(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd());
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.setEnd(MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Enddate);
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strtdate = MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strtsdf.parse(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt());
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.setStart(MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setBounds(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange.setHigh(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.setComparator(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange.setLow(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.setCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.setComparator(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.setSystem(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.setUnit(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl())));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setCount(Integer.parseInt(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setCountMax(Integer.parseInt(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.addDayOfWeek(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDayOfWeek()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setDuration(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration())));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setDurationMax(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setDurationUnit(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setFrequency(Integer.parseInt(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setFrequencyMax(Integer.parseInt(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setOffset(Integer.parseInt(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setPeriod(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd())));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setPeriodMax(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx())));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.setPeriodUnit(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt()));

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay() != null) {
			medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.addTimeOfDay(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay());
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.addWhen(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen.fromCode(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptWhen()));

		/******************** medicationknowledgeadministrationguidelinesdosagetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinesdosage.setType(medicationknowledgeadministrationguidelinesdosagetype);

		/******************** medicationknowledgeadministrationguidelinesdosagetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesdosagetype.addCoding(medicationknowledgeadministrationguidelinesdosagetypecoding);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgCd() != null) {
			medicationknowledgeadministrationguidelinesdosagetypecoding.setCode(m.getMdctnKnldgAdmnGdlnsDsgTypCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesdosagetypecoding.setDisplay(m.getMdctnKnldgAdmnGdlnsDsgTypCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgSys() != null) {
			medicationknowledgeadministrationguidelinesdosagetypecoding.setSystem(m.getMdctnKnldgAdmnGdlnsDsgTypCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesdosagetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesdosagetypecoding.setVersion(m.getMdctnKnldgAdmnGdlnsDsgTypCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypTxt() != null) {
			medicationknowledgeadministrationguidelinesdosagetype.setText(m.getMdctnKnldgAdmnGdlnsDsgTypTxt());
		}
		/******************** medicationknowledgeadministrationguidelinesindicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesindicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelines.setIndication(medicationknowledgeadministrationguidelinesindicationcodeableconcept);

		/******************** medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinesindicationcodeableconcept.addCoding(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding);

		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd() != null) {
			medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.setCode(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply() != null) {
			medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.setDisplay(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys() != null) {
			medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.setSystem(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.setVersion(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt() != null) {
			medicationknowledgeadministrationguidelinesindicationcodeableconcept.setText(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt());
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnRfrnc ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnRfrnc() != null) {
			medicationknowledgeadministrationguidelines.setIndication( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgAdmnGdlnsIndctnRfrnc()));
		}
		/******************** medicationknowledgeadministrationguidelinespatientcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent medicationknowledgeadministrationguidelinespatientcharacteristics =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent();
		medicationknowledgeadministrationguidelines.addPatientCharacteristics(medicationknowledgeadministrationguidelinespatientcharacteristics);

		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeadministrationguidelinespatientcharacteristics.setCharacteristic(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept);

		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.addCoding(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding);

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.setCode(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd());
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.setDisplay(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply());
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.setSystem(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys());
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.setVersion(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn());
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.setText(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt());
		}
		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeadministrationguidelinespatientcharacteristics.setCharacteristic(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity);

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.setCode(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd());
		}
		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.setComparator(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator.fromCode(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr()));

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.setSystem(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys());
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.setUnit(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt());
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.setValue(Double.parseDouble((m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl())));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsVl() != null) {
			medicationknowledgeadministrationguidelinespatientcharacteristics.addValue(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsVl());
		}
		/******************** medicationknowledgeamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeamount =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledge.setAmount(medicationknowledgeamount);

		/******************** MdctnKnldg_Amnt_Cd ********************************************************************************/
		if(m.getMdctnKnldgAmntCd() != null) {
			medicationknowledgeamount.setCode(m.getMdctnKnldgAmntCd());
		}
		/******************** medicationknowledgeamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeamountcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeamount.setComparator(medicationknowledgeamountcomparator.fromCode(m.getMdctnKnldgAmntCmprtr()));

		/******************** MdctnKnldg_Amnt_Sys ********************************************************************************/
		if(m.getMdctnKnldgAmntSys() != null) {
			medicationknowledgeamount.setSystem(m.getMdctnKnldgAmntSys());
		}
		/******************** MdctnKnldg_Amnt_Unt ********************************************************************************/
		if(m.getMdctnKnldgAmntUnt() != null) {
			medicationknowledgeamount.setUnit(m.getMdctnKnldgAmntUnt());
		}
		/******************** MdctnKnldg_Amnt_Vl ********************************************************************************/
		if(m.getMdctnKnldgAmntVl() != null) {
			medicationknowledgeamount.setValue(Double.parseDouble((m.getMdctnKnldgAmntVl())));
		}
		/******************** MdctnKnldg_AssociatedMdctn ********************************************************************************/
		if(m.getMdctnKnldgAssociatedMdctn() != null) {
			medicationknowledge.addAssociatedMedication( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgAssociatedMdctn()));
		}
		/******************** medicationknowledgecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledge.setCode(medicationknowledgecode);

		/******************** medicationknowledgecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgecodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgecode.addCoding(medicationknowledgecodecoding);

		/******************** MdctnKnldg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgCdCdgCd() != null) {
			medicationknowledgecodecoding.setCode(m.getMdctnKnldgCdCdgCd());
		}
		/******************** MdctnKnldg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgCdCdgDsply() != null) {
			medicationknowledgecodecoding.setDisplay(m.getMdctnKnldgCdCdgDsply());
		}
		/******************** MdctnKnldg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgCdCdgSys() != null) {
			medicationknowledgecodecoding.setSystem(m.getMdctnKnldgCdCdgSys());
		}
		/******************** MdctnKnldg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgCdCdgUsrSltd() != null) {
			medicationknowledgecodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgCdCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgCdCdgVrsn() != null) {
			medicationknowledgecodecoding.setVersion(m.getMdctnKnldgCdCdgVrsn());
		}
		/******************** MdctnKnldg_Cd_Txt ********************************************************************************/
		if(m.getMdctnKnldgCdTxt() != null) {
			medicationknowledgecode.setText(m.getMdctnKnldgCdTxt());
		}
		/******************** MdctnKnldg_Cntraindctn ********************************************************************************/
		if(m.getMdctnKnldgCntraindctn() != null) {
			medicationknowledge.addContraindication( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgCntraindctn()));
		}
		/******************** medicationknowledgecost ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent medicationknowledgecost =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent();
		medicationknowledge.addCost(medicationknowledgecost);

		/******************** medicationknowledgecostcost ********************************************************************************/
		org.hl7.fhir.r4.model.Money medicationknowledgecostcost =  new org.hl7.fhir.r4.model.Money();
		medicationknowledgecost.setCost(medicationknowledgecostcost);

		/******************** MdctnKnldg_Cst_Cst_Crncy ********************************************************************************/
		if(m.getMdctnKnldgCstCstCrncy() != null) {
			medicationknowledgecostcost.setCurrency(m.getMdctnKnldgCstCstCrncy());
		}
		/******************** MdctnKnldg_Cst_Cst_Vl ********************************************************************************/
		if(m.getMdctnKnldgCstCstVl() != null) {
			medicationknowledgecostcost.setValue(Double.parseDouble((m.getMdctnKnldgCstCstVl())));
		}
		/******************** MdctnKnldg_Cst_Src ********************************************************************************/
		if(m.getMdctnKnldgCstSrc() != null) {
			medicationknowledgecost.setSource(m.getMdctnKnldgCstSrc());
		}
		/******************** medicationknowledgecosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgecosttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgecost.setType(medicationknowledgecosttype);

		/******************** medicationknowledgecosttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgecosttypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgecosttype.addCoding(medicationknowledgecosttypecoding);

		/******************** MdctnKnldg_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgCstTypCdgCd() != null) {
			medicationknowledgecosttypecoding.setCode(m.getMdctnKnldgCstTypCdgCd());
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgCstTypCdgDsply() != null) {
			medicationknowledgecosttypecoding.setDisplay(m.getMdctnKnldgCstTypCdgDsply());
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgCstTypCdgSys() != null) {
			medicationknowledgecosttypecoding.setSystem(m.getMdctnKnldgCstTypCdgSys());
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgCstTypCdgUsrSltd() != null) {
			medicationknowledgecosttypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgCstTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgCstTypCdgVrsn() != null) {
			medicationknowledgecosttypecoding.setVersion(m.getMdctnKnldgCstTypCdgVrsn());
		}
		/******************** MdctnKnldg_Cst_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgCstTypTxt() != null) {
			medicationknowledgecosttype.setText(m.getMdctnKnldgCstTypTxt());
		}
		/******************** medicationknowledgedoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedoseform =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledge.setDoseForm(medicationknowledgedoseform);

		/******************** medicationknowledgedoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgedoseformcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgedoseform.addCoding(medicationknowledgedoseformcoding);

		/******************** MdctnKnldg_DoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgCd() != null) {
			medicationknowledgedoseformcoding.setCode(m.getMdctnKnldgDoseFrmCdgCd());
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgDsply() != null) {
			medicationknowledgedoseformcoding.setDisplay(m.getMdctnKnldgDoseFrmCdgDsply());
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgSys() != null) {
			medicationknowledgedoseformcoding.setSystem(m.getMdctnKnldgDoseFrmCdgSys());
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgUsrSltd() != null) {
			medicationknowledgedoseformcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgDoseFrmCdgUsrSltd()));
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgVrsn() != null) {
			medicationknowledgedoseformcoding.setVersion(m.getMdctnKnldgDoseFrmCdgVrsn());
		}
		/******************** MdctnKnldg_DoseFrm_Txt ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmTxt() != null) {
			medicationknowledgedoseform.setText(m.getMdctnKnldgDoseFrmTxt());
		}
		/******************** medicationknowledgedrugcharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent medicationknowledgedrugcharacteristic =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent();
		medicationknowledge.addDrugCharacteristic(medicationknowledgedrugcharacteristic);

		/******************** medicationknowledgedrugcharacteristictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedrugcharacteristictype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgedrugcharacteristic.setType(medicationknowledgedrugcharacteristictype);

		/******************** medicationknowledgedrugcharacteristictypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgedrugcharacteristictypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgedrugcharacteristictype.addCoding(medicationknowledgedrugcharacteristictypecoding);

		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgCd() != null) {
			medicationknowledgedrugcharacteristictypecoding.setCode(m.getMdctnKnldgDrugCrctrstcTypCdgCd());
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgDsply() != null) {
			medicationknowledgedrugcharacteristictypecoding.setDisplay(m.getMdctnKnldgDrugCrctrstcTypCdgDsply());
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgSys() != null) {
			medicationknowledgedrugcharacteristictypecoding.setSystem(m.getMdctnKnldgDrugCrctrstcTypCdgSys());
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgUsrSltd() != null) {
			medicationknowledgedrugcharacteristictypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgDrugCrctrstcTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgVrsn() != null) {
			medicationknowledgedrugcharacteristictypecoding.setVersion(m.getMdctnKnldgDrugCrctrstcTypCdgVrsn());
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypTxt() != null) {
			medicationknowledgedrugcharacteristictype.setText(m.getMdctnKnldgDrugCrctrstcTypTxt());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlBase64BinaryTyp ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlBase64binaryTyp() != null) {
			medicationknowledgedrugcharacteristic.setValue( new org.hl7.fhir.r4.model.Base64BinaryType(m.getMdctnKnldgDrugCrctrstcVlBase64binaryTyp()));
		}
		/******************** medicationknowledgedrugcharacteristicvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedrugcharacteristicvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgedrugcharacteristic.setValue(medicationknowledgedrugcharacteristicvaluecodeableconcept);

		/******************** medicationknowledgedrugcharacteristicvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgedrugcharacteristicvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgedrugcharacteristicvaluecodeableconcept.addCoding(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding);

		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd() != null) {
			medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.setCode(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply() != null) {
			medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.setDisplay(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys() != null) {
			medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.setSystem(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd() != null) {
			medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn() != null) {
			medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.setVersion(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptTxt() != null) {
			medicationknowledgedrugcharacteristicvaluecodeableconcept.setText(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptTxt());
		}
		/******************** medicationknowledgedrugcharacteristicvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgedrugcharacteristicvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgedrugcharacteristic.setValue(medicationknowledgedrugcharacteristicvaluequantity);

		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyCd() != null) {
			medicationknowledgedrugcharacteristicvaluequantity.setCode(m.getMdctnKnldgDrugCrctrstcVlQntyCd());
		}
		/******************** medicationknowledgedrugcharacteristicvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgedrugcharacteristicvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgedrugcharacteristicvaluequantity.setComparator(medicationknowledgedrugcharacteristicvaluequantitycomparator.fromCode(m.getMdctnKnldgDrugCrctrstcVlQntyCmprtr()));

		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntySys() != null) {
			medicationknowledgedrugcharacteristicvaluequantity.setSystem(m.getMdctnKnldgDrugCrctrstcVlQntySys());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyUnt() != null) {
			medicationknowledgedrugcharacteristicvaluequantity.setUnit(m.getMdctnKnldgDrugCrctrstcVlQntyUnt());
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyVl() != null) {
			medicationknowledgedrugcharacteristicvaluequantity.setValue(Double.parseDouble((m.getMdctnKnldgDrugCrctrstcVlQntyVl())));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlStrgTyp ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlStrgTyp() != null) {
			medicationknowledgedrugcharacteristic.setValue( new org.hl7.fhir.r4.model.StringType(m.getMdctnKnldgDrugCrctrstcVlStrgTyp()));
		}
		/******************** medicationknowledgeingredient ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent medicationknowledgeingredient =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent();
		medicationknowledge.addIngredient(medicationknowledgeingredient);

		/******************** MdctnKnldg_Igrdnt_IsActive ********************************************************************************/
		if(m.getMdctnKnldgIgrdntIsActive() != null) {
			medicationknowledgeingredient.setIsActive(Boolean.parseBoolean(m.getMdctnKnldgIgrdntIsActive()));
		}
		/******************** medicationknowledgeingredientitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeingredientitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeingredient.setItem(medicationknowledgeingredientitemcodeableconcept);

		/******************** medicationknowledgeingredientitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeingredientitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeingredientitemcodeableconcept.addCoding(medicationknowledgeingredientitemcodeableconceptcoding);

		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgCd() != null) {
			medicationknowledgeingredientitemcodeableconceptcoding.setCode(m.getMdctnKnldgIgrdntItmCdbleCncptCdgCd());
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgDsply() != null) {
			medicationknowledgeingredientitemcodeableconceptcoding.setDisplay(m.getMdctnKnldgIgrdntItmCdbleCncptCdgDsply());
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgSys() != null) {
			medicationknowledgeingredientitemcodeableconceptcoding.setSystem(m.getMdctnKnldgIgrdntItmCdbleCncptCdgSys());
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd() != null) {
			medicationknowledgeingredientitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgVrsn() != null) {
			medicationknowledgeingredientitemcodeableconceptcoding.setVersion(m.getMdctnKnldgIgrdntItmCdbleCncptCdgVrsn());
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptTxt() != null) {
			medicationknowledgeingredientitemcodeableconcept.setText(m.getMdctnKnldgIgrdntItmCdbleCncptTxt());
		}
		/******************** MdctnKnldg_Igrdnt_ItmRfrnc ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmRfrnc() != null) {
			medicationknowledgeingredient.setItem( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgIgrdntItmRfrnc()));
		}
		/******************** medicationknowledgeingredientstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeingredientstrength =  new org.hl7.fhir.r4.model.Ratio();
		medicationknowledgeingredient.setStrength(medicationknowledgeingredientstrength);

		/******************** medicationknowledgeingredientstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeingredientstrengthdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeingredientstrength.setDenominator(medicationknowledgeingredientstrengthdenominator);

		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrCd() != null) {
			medicationknowledgeingredientstrengthdenominator.setCode(m.getMdctnKnldgIgrdntStrDnmntrCd());
		}
		/******************** medicationknowledgeingredientstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeingredientstrengthdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeingredientstrengthdenominator.setComparator(medicationknowledgeingredientstrengthdenominatorcomparator.fromCode(m.getMdctnKnldgIgrdntStrDnmntrCmprtr()));

		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrSys() != null) {
			medicationknowledgeingredientstrengthdenominator.setSystem(m.getMdctnKnldgIgrdntStrDnmntrSys());
		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrUnt() != null) {
			medicationknowledgeingredientstrengthdenominator.setUnit(m.getMdctnKnldgIgrdntStrDnmntrUnt());
		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrVl() != null) {
			medicationknowledgeingredientstrengthdenominator.setValue(Double.parseDouble((m.getMdctnKnldgIgrdntStrDnmntrVl())));
		}
		/******************** medicationknowledgeingredientstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeingredientstrengthnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeingredientstrength.setNumerator(medicationknowledgeingredientstrengthnumerator);

		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrCd() != null) {
			medicationknowledgeingredientstrengthnumerator.setCode(m.getMdctnKnldgIgrdntStrNmrtrCd());
		}
		/******************** medicationknowledgeingredientstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeingredientstrengthnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeingredientstrengthnumerator.setComparator(medicationknowledgeingredientstrengthnumeratorcomparator.fromCode(m.getMdctnKnldgIgrdntStrNmrtrCmprtr()));

		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrSys() != null) {
			medicationknowledgeingredientstrengthnumerator.setSystem(m.getMdctnKnldgIgrdntStrNmrtrSys());
		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrUnt() != null) {
			medicationknowledgeingredientstrengthnumerator.setUnit(m.getMdctnKnldgIgrdntStrNmrtrUnt());
		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrVl() != null) {
			medicationknowledgeingredientstrengthnumerator.setValue(Double.parseDouble((m.getMdctnKnldgIgrdntStrNmrtrVl())));
		}
		/******************** medicationknowledgeintendedroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeintendedroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledge.addIntendedRoute(medicationknowledgeintendedroute);

		/******************** medicationknowledgeintendedroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeintendedroutecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeintendedroute.addCoding(medicationknowledgeintendedroutecoding);

		/******************** MdctnKnldg_IntendedRoute_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgCd() != null) {
			medicationknowledgeintendedroutecoding.setCode(m.getMdctnKnldgIntendedRouteCdgCd());
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgDsply() != null) {
			medicationknowledgeintendedroutecoding.setDisplay(m.getMdctnKnldgIntendedRouteCdgDsply());
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgSys() != null) {
			medicationknowledgeintendedroutecoding.setSystem(m.getMdctnKnldgIntendedRouteCdgSys());
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgUsrSltd() != null) {
			medicationknowledgeintendedroutecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgIntendedRouteCdgUsrSltd()));
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgVrsn() != null) {
			medicationknowledgeintendedroutecoding.setVersion(m.getMdctnKnldgIntendedRouteCdgVrsn());
		}
		/******************** MdctnKnldg_IntendedRoute_Txt ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteTxt() != null) {
			medicationknowledgeintendedroute.setText(m.getMdctnKnldgIntendedRouteTxt());
		}
		/******************** medicationknowledgekinetics ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent medicationknowledgekinetics =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent();
		medicationknowledge.addKinetics(medicationknowledgekinetics);

		/******************** medicationknowledgekineticsareaundercurve ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgekineticsareaundercurve =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgekinetics.addAreaUnderCurve(medicationknowledgekineticsareaundercurve);

		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Cd ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveCd() != null) {
			medicationknowledgekineticsareaundercurve.setCode(m.getMdctnKnldgKineticsAreaUnderCurveCd());
		}
		/******************** medicationknowledgekineticsareaundercurvecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgekineticsareaundercurvecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgekineticsareaundercurve.setComparator(medicationknowledgekineticsareaundercurvecomparator.fromCode(m.getMdctnKnldgKineticsAreaUnderCurveCmprtr()));

		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Sys ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveSys() != null) {
			medicationknowledgekineticsareaundercurve.setSystem(m.getMdctnKnldgKineticsAreaUnderCurveSys());
		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Unt ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveUnt() != null) {
			medicationknowledgekineticsareaundercurve.setUnit(m.getMdctnKnldgKineticsAreaUnderCurveUnt());
		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Vl ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveVl() != null) {
			medicationknowledgekineticsareaundercurve.setValue(Double.parseDouble((m.getMdctnKnldgKineticsAreaUnderCurveVl())));
		}
		/******************** medicationknowledgekineticshalflifeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgekineticshalflifeperiod =  new org.hl7.fhir.r4.model.Duration();
		medicationknowledgekinetics.setHalfLifePeriod(medicationknowledgekineticshalflifeperiod);

		/******************** medicationknowledgekineticslethaldose50 ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgekineticslethaldose50 =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgekinetics.addLethalDose50(medicationknowledgekineticslethaldose50);

		/******************** MdctnKnldg_Kinetics_LethalDose50_Cd ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Cd() != null) {
			medicationknowledgekineticslethaldose50.setCode(m.getMdctnKnldgKineticsLethalDose50Cd());
		}
		/******************** medicationknowledgekineticslethaldose50comparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgekineticslethaldose50comparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgekineticslethaldose50.setComparator(medicationknowledgekineticslethaldose50comparator.fromCode(m.getMdctnKnldgKineticsLethalDose50Cmprtr()));

		/******************** MdctnKnldg_Kinetics_LethalDose50_Sys ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Sys() != null) {
			medicationknowledgekineticslethaldose50.setSystem(m.getMdctnKnldgKineticsLethalDose50Sys());
		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Unt ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Unt() != null) {
			medicationknowledgekineticslethaldose50.setUnit(m.getMdctnKnldgKineticsLethalDose50Unt());
		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Vl ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Vl() != null) {
			medicationknowledgekineticslethaldose50.setValue(Double.parseDouble((m.getMdctnKnldgKineticsLethalDose50Vl())));
		}
		/******************** MdctnKnldg_Manufacturer ********************************************************************************/
		if(m.getMdctnKnldgManufacturer() != null) {
			medicationknowledge.setManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgManufacturer()));
		}
		/******************** medicationknowledgemedicineclassification ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent medicationknowledgemedicineclassification =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent();
		medicationknowledge.addMedicineClassification(medicationknowledgemedicineclassification);

		/******************** medicationknowledgemedicineclassificationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemedicineclassificationclassification =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgemedicineclassification.addClassification(medicationknowledgemedicineclassificationclassification);

		/******************** medicationknowledgemedicineclassificationclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemedicineclassificationclassificationcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgemedicineclassificationclassification.addCoding(medicationknowledgemedicineclassificationclassificationcoding);

		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgCd() != null) {
			medicationknowledgemedicineclassificationclassificationcoding.setCode(m.getMdctnKnldgMedicineClsfctnClsfctnCdgCd());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgDsply() != null) {
			medicationknowledgemedicineclassificationclassificationcoding.setDisplay(m.getMdctnKnldgMedicineClsfctnClsfctnCdgDsply());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgSys() != null) {
			medicationknowledgemedicineclassificationclassificationcoding.setSystem(m.getMdctnKnldgMedicineClsfctnClsfctnCdgSys());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd() != null) {
			medicationknowledgemedicineclassificationclassificationcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgVrsn() != null) {
			medicationknowledgemedicineclassificationclassificationcoding.setVersion(m.getMdctnKnldgMedicineClsfctnClsfctnCdgVrsn());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Txt ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnTxt() != null) {
			medicationknowledgemedicineclassificationclassification.setText(m.getMdctnKnldgMedicineClsfctnClsfctnTxt());
		}
		/******************** medicationknowledgemedicineclassificationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemedicineclassificationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgemedicineclassification.setType(medicationknowledgemedicineclassificationtype);

		/******************** medicationknowledgemedicineclassificationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemedicineclassificationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgemedicineclassificationtype.addCoding(medicationknowledgemedicineclassificationtypecoding);

		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgCd() != null) {
			medicationknowledgemedicineclassificationtypecoding.setCode(m.getMdctnKnldgMedicineClsfctnTypCdgCd());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgDsply() != null) {
			medicationknowledgemedicineclassificationtypecoding.setDisplay(m.getMdctnKnldgMedicineClsfctnTypCdgDsply());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgSys() != null) {
			medicationknowledgemedicineclassificationtypecoding.setSystem(m.getMdctnKnldgMedicineClsfctnTypCdgSys());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgUsrSltd() != null) {
			medicationknowledgemedicineclassificationtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgMedicineClsfctnTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgVrsn() != null) {
			medicationknowledgemedicineclassificationtypecoding.setVersion(m.getMdctnKnldgMedicineClsfctnTypCdgVrsn());
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypTxt() != null) {
			medicationknowledgemedicineclassificationtype.setText(m.getMdctnKnldgMedicineClsfctnTypTxt());
		}
		/******************** medicationknowledgemonitoringprogram ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent medicationknowledgemonitoringprogram =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent();
		medicationknowledge.addMonitoringProgram(medicationknowledgemonitoringprogram);

		/******************** MdctnKnldg_MonitoringPrgrm_Nm ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmNm() != null) {
			medicationknowledgemonitoringprogram.setName(m.getMdctnKnldgMonitoringPrgrmNm());
		}
		/******************** medicationknowledgemonitoringprogramtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemonitoringprogramtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgemonitoringprogram.setType(medicationknowledgemonitoringprogramtype);

		/******************** medicationknowledgemonitoringprogramtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemonitoringprogramtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgemonitoringprogramtype.addCoding(medicationknowledgemonitoringprogramtypecoding);

		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgCd() != null) {
			medicationknowledgemonitoringprogramtypecoding.setCode(m.getMdctnKnldgMonitoringPrgrmTypCdgCd());
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgDsply() != null) {
			medicationknowledgemonitoringprogramtypecoding.setDisplay(m.getMdctnKnldgMonitoringPrgrmTypCdgDsply());
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgSys() != null) {
			medicationknowledgemonitoringprogramtypecoding.setSystem(m.getMdctnKnldgMonitoringPrgrmTypCdgSys());
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgUsrSltd() != null) {
			medicationknowledgemonitoringprogramtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgMonitoringPrgrmTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgVrsn() != null) {
			medicationknowledgemonitoringprogramtypecoding.setVersion(m.getMdctnKnldgMonitoringPrgrmTypCdgVrsn());
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypTxt() != null) {
			medicationknowledgemonitoringprogramtype.setText(m.getMdctnKnldgMonitoringPrgrmTypTxt());
		}
		/******************** medicationknowledgemonograph ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent medicationknowledgemonograph =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent();
		medicationknowledge.addMonograph(medicationknowledgemonograph);

		/******************** MdctnKnldg_Monograph_Src ********************************************************************************/
		if(m.getMdctnKnldgMonographSrc() != null) {
			medicationknowledgemonograph.setSource( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgMonographSrc()));
		}
		/******************** medicationknowledgemonographtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemonographtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgemonograph.setType(medicationknowledgemonographtype);

		/******************** medicationknowledgemonographtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemonographtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgemonographtype.addCoding(medicationknowledgemonographtypecoding);

		/******************** MdctnKnldg_Monograph_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgCd() != null) {
			medicationknowledgemonographtypecoding.setCode(m.getMdctnKnldgMonographTypCdgCd());
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgDsply() != null) {
			medicationknowledgemonographtypecoding.setDisplay(m.getMdctnKnldgMonographTypCdgDsply());
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgSys() != null) {
			medicationknowledgemonographtypecoding.setSystem(m.getMdctnKnldgMonographTypCdgSys());
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgUsrSltd() != null) {
			medicationknowledgemonographtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgMonographTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgVrsn() != null) {
			medicationknowledgemonographtypecoding.setVersion(m.getMdctnKnldgMonographTypCdgVrsn());
		}
		/******************** MdctnKnldg_Monograph_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgMonographTypTxt() != null) {
			medicationknowledgemonographtype.setText(m.getMdctnKnldgMonographTypTxt());
		}
		/******************** medicationknowledgepackaging ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent medicationknowledgepackaging =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent();
		medicationknowledge.setPackaging(medicationknowledgepackaging);

		/******************** medicationknowledgepackagingquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgepackagingquantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgepackaging.setQuantity(medicationknowledgepackagingquantity);

		/******************** MdctnKnldg_Packaging_Qnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyCd() != null) {
			medicationknowledgepackagingquantity.setCode(m.getMdctnKnldgPackagingQntyCd());
		}
		/******************** medicationknowledgepackagingquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgepackagingquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgepackagingquantity.setComparator(medicationknowledgepackagingquantitycomparator.fromCode(m.getMdctnKnldgPackagingQntyCmprtr()));

		/******************** MdctnKnldg_Packaging_Qnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntySys() != null) {
			medicationknowledgepackagingquantity.setSystem(m.getMdctnKnldgPackagingQntySys());
		}
		/******************** MdctnKnldg_Packaging_Qnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyUnt() != null) {
			medicationknowledgepackagingquantity.setUnit(m.getMdctnKnldgPackagingQntyUnt());
		}
		/******************** MdctnKnldg_Packaging_Qnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyVl() != null) {
			medicationknowledgepackagingquantity.setValue(Double.parseDouble((m.getMdctnKnldgPackagingQntyVl())));
		}
		/******************** medicationknowledgepackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgepackagingtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgepackaging.setType(medicationknowledgepackagingtype);

		/******************** medicationknowledgepackagingtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgepackagingtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgepackagingtype.addCoding(medicationknowledgepackagingtypecoding);

		/******************** MdctnKnldg_Packaging_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgCd() != null) {
			medicationknowledgepackagingtypecoding.setCode(m.getMdctnKnldgPackagingTypCdgCd());
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgDsply() != null) {
			medicationknowledgepackagingtypecoding.setDisplay(m.getMdctnKnldgPackagingTypCdgDsply());
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgSys() != null) {
			medicationknowledgepackagingtypecoding.setSystem(m.getMdctnKnldgPackagingTypCdgSys());
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgUsrSltd() != null) {
			medicationknowledgepackagingtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgPackagingTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgVrsn() != null) {
			medicationknowledgepackagingtypecoding.setVersion(m.getMdctnKnldgPackagingTypCdgVrsn());
		}
		/******************** MdctnKnldg_Packaging_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypTxt() != null) {
			medicationknowledgepackagingtype.setText(m.getMdctnKnldgPackagingTypTxt());
		}
		/******************** MdctnKnldg_PreparationInstrctn ********************************************************************************/
		if(m.getMdctnKnldgPreparationInstrctn() != null) {
			medicationknowledge.setPreparationInstruction(m.getMdctnKnldgPreparationInstrctn());
		}
		/******************** medicationknowledgeproducttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeproducttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledge.addProductType(medicationknowledgeproducttype);

		/******************** medicationknowledgeproducttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeproducttypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeproducttype.addCoding(medicationknowledgeproducttypecoding);

		/******************** MdctnKnldg_PrdctTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgCd() != null) {
			medicationknowledgeproducttypecoding.setCode(m.getMdctnKnldgPrdctTypCdgCd());
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgDsply() != null) {
			medicationknowledgeproducttypecoding.setDisplay(m.getMdctnKnldgPrdctTypCdgDsply());
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgSys() != null) {
			medicationknowledgeproducttypecoding.setSystem(m.getMdctnKnldgPrdctTypCdgSys());
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgUsrSltd() != null) {
			medicationknowledgeproducttypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgPrdctTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgVrsn() != null) {
			medicationknowledgeproducttypecoding.setVersion(m.getMdctnKnldgPrdctTypCdgVrsn());
		}
		/******************** MdctnKnldg_PrdctTyp_Txt ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypTxt() != null) {
			medicationknowledgeproducttype.setText(m.getMdctnKnldgPrdctTypTxt());
		}
		/******************** medicationknowledgeregulatory ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent medicationknowledgeregulatory =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent();
		medicationknowledge.addRegulatory(medicationknowledgeregulatory);

		/******************** medicationknowledgeregulatorymaxdispense ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent medicationknowledgeregulatorymaxdispense =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent();
		medicationknowledgeregulatory.setMaxDispense(medicationknowledgeregulatorymaxdispense);

		/******************** medicationknowledgeregulatorymaxdispenseperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgeregulatorymaxdispenseperiod =  new org.hl7.fhir.r4.model.Duration();
		medicationknowledgeregulatorymaxdispense.setPeriod(medicationknowledgeregulatorymaxdispenseperiod);

		/******************** medicationknowledgeregulatorymaxdispensequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeregulatorymaxdispensequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationknowledgeregulatorymaxdispense.setQuantity(medicationknowledgeregulatorymaxdispensequantity);

		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyCd() != null) {
			medicationknowledgeregulatorymaxdispensequantity.setCode(m.getMdctnKnldgRegulatoryMxDispnsQntyCd());
		}
		/******************** medicationknowledgeregulatorymaxdispensequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationknowledgeregulatorymaxdispensequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationknowledgeregulatorymaxdispensequantity.setComparator(medicationknowledgeregulatorymaxdispensequantitycomparator.fromCode(m.getMdctnKnldgRegulatoryMxDispnsQntyCmprtr()));

		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntySys() != null) {
			medicationknowledgeregulatorymaxdispensequantity.setSystem(m.getMdctnKnldgRegulatoryMxDispnsQntySys());
		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyUnt() != null) {
			medicationknowledgeregulatorymaxdispensequantity.setUnit(m.getMdctnKnldgRegulatoryMxDispnsQntyUnt());
		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyVl() != null) {
			medicationknowledgeregulatorymaxdispensequantity.setValue(Double.parseDouble((m.getMdctnKnldgRegulatoryMxDispnsQntyVl())));
		}
		/******************** MdctnKnldg_Regulatory_RegulatoryAthrity ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryRegulatoryAthrity() != null) {
			medicationknowledgeregulatory.setRegulatoryAuthority( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgRegulatoryRegulatoryAthrity()));
		}
		/******************** medicationknowledgeregulatoryschedule ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent medicationknowledgeregulatoryschedule =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent();
		medicationknowledgeregulatory.addSchedule(medicationknowledgeregulatoryschedule);

		/******************** medicationknowledgeregulatoryscheduleschedule ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeregulatoryscheduleschedule =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeregulatoryschedule.setSchedule(medicationknowledgeregulatoryscheduleschedule);

		/******************** medicationknowledgeregulatoryscheduleschedulecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeregulatoryscheduleschedulecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeregulatoryscheduleschedule.addCoding(medicationknowledgeregulatoryscheduleschedulecoding);

		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgCd() != null) {
			medicationknowledgeregulatoryscheduleschedulecoding.setCode(m.getMdctnKnldgRegulatorySchdlSchdlCdgCd());
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgDsply() != null) {
			medicationknowledgeregulatoryscheduleschedulecoding.setDisplay(m.getMdctnKnldgRegulatorySchdlSchdlCdgDsply());
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgSys() != null) {
			medicationknowledgeregulatoryscheduleschedulecoding.setSystem(m.getMdctnKnldgRegulatorySchdlSchdlCdgSys());
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd() != null) {
			medicationknowledgeregulatoryscheduleschedulecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgVrsn() != null) {
			medicationknowledgeregulatoryscheduleschedulecoding.setVersion(m.getMdctnKnldgRegulatorySchdlSchdlCdgVrsn());
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Txt ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlTxt() != null) {
			medicationknowledgeregulatoryscheduleschedule.setText(m.getMdctnKnldgRegulatorySchdlSchdlTxt());
		}
		/******************** medicationknowledgeregulatorysubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent medicationknowledgeregulatorysubstitution =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent();
		medicationknowledgeregulatory.addSubstitution(medicationknowledgeregulatorysubstitution);

		/******************** MdctnKnldg_Regulatory_Substitution_Allowed ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionAllowed() != null) {
			medicationknowledgeregulatorysubstitution.setAllowed(Boolean.parseBoolean(m.getMdctnKnldgRegulatorySubstitutionAllowed()));
		}
		/******************** medicationknowledgeregulatorysubstitutiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeregulatorysubstitutiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgeregulatorysubstitution.setType(medicationknowledgeregulatorysubstitutiontype);

		/******************** medicationknowledgeregulatorysubstitutiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeregulatorysubstitutiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgeregulatorysubstitutiontype.addCoding(medicationknowledgeregulatorysubstitutiontypecoding);

		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgCd() != null) {
			medicationknowledgeregulatorysubstitutiontypecoding.setCode(m.getMdctnKnldgRegulatorySubstitutionTypCdgCd());
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgDsply() != null) {
			medicationknowledgeregulatorysubstitutiontypecoding.setDisplay(m.getMdctnKnldgRegulatorySubstitutionTypCdgDsply());
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgSys() != null) {
			medicationknowledgeregulatorysubstitutiontypecoding.setSystem(m.getMdctnKnldgRegulatorySubstitutionTypCdgSys());
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd() != null) {
			medicationknowledgeregulatorysubstitutiontypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgVrsn() != null) {
			medicationknowledgeregulatorysubstitutiontypecoding.setVersion(m.getMdctnKnldgRegulatorySubstitutionTypCdgVrsn());
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypTxt() != null) {
			medicationknowledgeregulatorysubstitutiontype.setText(m.getMdctnKnldgRegulatorySubstitutionTypTxt());
		}
		/******************** medicationknowledgerelatedmedicationknowledge ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent medicationknowledgerelatedmedicationknowledge =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent();
		medicationknowledge.addRelatedMedicationKnowledge(medicationknowledgerelatedmedicationknowledge);

		/******************** MdctnKnldg_RltedMdctnKnldg_Rfrnc ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgRfrnc() != null) {
			medicationknowledgerelatedmedicationknowledge.addReference( new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgRltedMdctnKnldgRfrnc()));
		}
		/******************** medicationknowledgerelatedmedicationknowledgetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgerelatedmedicationknowledgetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationknowledgerelatedmedicationknowledge.setType(medicationknowledgerelatedmedicationknowledgetype);

		/******************** medicationknowledgerelatedmedicationknowledgetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgerelatedmedicationknowledgetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationknowledgerelatedmedicationknowledgetype.addCoding(medicationknowledgerelatedmedicationknowledgetypecoding);

		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgCd() != null) {
			medicationknowledgerelatedmedicationknowledgetypecoding.setCode(m.getMdctnKnldgRltedMdctnKnldgTypCdgCd());
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgDsply() != null) {
			medicationknowledgerelatedmedicationknowledgetypecoding.setDisplay(m.getMdctnKnldgRltedMdctnKnldgTypCdgDsply());
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgSys() != null) {
			medicationknowledgerelatedmedicationknowledgetypecoding.setSystem(m.getMdctnKnldgRltedMdctnKnldgTypCdgSys());
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd() != null) {
			medicationknowledgerelatedmedicationknowledgetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgVrsn() != null) {
			medicationknowledgerelatedmedicationknowledgetypecoding.setVersion(m.getMdctnKnldgRltedMdctnKnldgTypCdgVrsn());
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypTxt() != null) {
			medicationknowledgerelatedmedicationknowledgetype.setText(m.getMdctnKnldgRltedMdctnKnldgTypTxt());
		}
		/******************** medicationknowledgestatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeStatusEnumFactory medicationknowledgestatus =  new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeStatusEnumFactory();
		medicationknowledge.setStatus(medicationknowledgestatus.fromCode(m.getMdctnKnldgSts()));

		/******************** MdctnKnldg_Synonym ********************************************************************************/
		if(m.getMdctnKnldgSynonym() != null) {
			medicationknowledge.addSynonym(m.getMdctnKnldgSynonym());
		}
		return medicationknowledge;
	}
}
