package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationRequest;
public class MedicationRequestConversion 
{
	public org.hl7.fhir.r4.model.MedicationRequest MedicationRequests(MedicationRequest m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationRequest medicationrequest = new org.hl7.fhir.r4.model.MedicationRequest();

		/******************** id ********************************************************************************/
		medicationrequest.setId(m.getId());

		/******************** MdctnRqst_AthredOn ********************************************************************************/
		if(m.getMdctnRqstAthredOn() != null) {
			java.text.SimpleDateFormat MdctnRqst_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_AthredOndate = MdctnRqst_AthredOnsdf.parse(m.getMdctnRqstAthredOn());
			medicationrequest.setAuthoredOn(MdctnRqst_AthredOndate);
		}
		/******************** MdctnRqst_BasedOn ********************************************************************************/
		if(m.getMdctnRqstBasedOn() != null) {
			medicationrequest.addBasedOn( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstBasedOn()));
		}
		/******************** medicationrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.addCategory(medicationrequestcategory);

		/******************** medicationrequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestcategory.addCoding(medicationrequestcategorycoding);

		/******************** MdctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgCd() != null) {
			medicationrequestcategorycoding.setCode(m.getMdctnRqstCtgryCdgCd());
		}
		/******************** MdctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgDsply() != null) {
			medicationrequestcategorycoding.setDisplay(m.getMdctnRqstCtgryCdgDsply());
		}
		/******************** MdctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgSys() != null) {
			medicationrequestcategorycoding.setSystem(m.getMdctnRqstCtgryCdgSys());
		}
		/******************** MdctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgUsrSltd() != null) {
			medicationrequestcategorycoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstCtgryCdgUsrSltd()));
		}
		/******************** MdctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgVrsn() != null) {
			medicationrequestcategorycoding.setVersion(m.getMdctnRqstCtgryCdgVrsn());
		}
		/******************** MdctnRqst_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnRqstCtgryTxt() != null) {
			medicationrequestcategory.setText(m.getMdctnRqstCtgryTxt());
		}
		/******************** medicationrequestcourseoftherapytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestcourseoftherapytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setCourseOfTherapyType(medicationrequestcourseoftherapytype);

		/******************** medicationrequestcourseoftherapytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestcourseoftherapytypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestcourseoftherapytype.addCoding(medicationrequestcourseoftherapytypecoding);

		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgCd() != null) {
			medicationrequestcourseoftherapytypecoding.setCode(m.getMdctnRqstCourseOfThrpyTypCdgCd());
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgDsply() != null) {
			medicationrequestcourseoftherapytypecoding.setDisplay(m.getMdctnRqstCourseOfThrpyTypCdgDsply());
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgSys() != null) {
			medicationrequestcourseoftherapytypecoding.setSystem(m.getMdctnRqstCourseOfThrpyTypCdgSys());
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgUsrSltd() != null) {
			medicationrequestcourseoftherapytypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstCourseOfThrpyTypCdgUsrSltd()));
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgVrsn() != null) {
			medicationrequestcourseoftherapytypecoding.setVersion(m.getMdctnRqstCourseOfThrpyTypCdgVrsn());
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Txt ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypTxt() != null) {
			medicationrequestcourseoftherapytype.setText(m.getMdctnRqstCourseOfThrpyTypTxt());
		}
		/******************** MdctnRqst_DetectedIssue ********************************************************************************/
		if(m.getMdctnRqstDetectedIssue() != null) {
			medicationrequest.addDetectedIssue( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstDetectedIssue()));
		}
		/******************** medicationrequestdispenserequest ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent medicationrequestdispenserequest =  new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent();
		medicationrequest.setDispenseRequest(medicationrequestdispenserequest);

		/******************** medicationrequestdispenserequestdispenseinterval ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestdispenseinterval =  new org.hl7.fhir.r4.model.Duration();
		medicationrequestdispenserequest.setDispenseInterval(medicationrequestdispenserequestdispenseinterval);

		/******************** medicationrequestdispenserequestexpectedsupplyduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestexpectedsupplyduration =  new org.hl7.fhir.r4.model.Duration();
		medicationrequestdispenserequest.setExpectedSupplyDuration(medicationrequestdispenserequestexpectedsupplyduration);

		/******************** medicationrequestdispenserequestinitialfill ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent medicationrequestdispenserequestinitialfill =  new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent();
		medicationrequestdispenserequest.setInitialFill(medicationrequestdispenserequestinitialfill);

		/******************** medicationrequestdispenserequestinitialfillduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestinitialfillduration =  new org.hl7.fhir.r4.model.Duration();
		medicationrequestdispenserequestinitialfill.setDuration(medicationrequestdispenserequestinitialfillduration);

		/******************** medicationrequestdispenserequestinitialfillquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdispenserequestinitialfillquantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdispenserequestinitialfill.setQuantity(medicationrequestdispenserequestinitialfillquantity);

		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyCd() != null) {
			medicationrequestdispenserequestinitialfillquantity.setCode(m.getMdctnRqstDispnsRqstInitialFillQntyCd());
		}
		/******************** medicationrequestdispenserequestinitialfillquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdispenserequestinitialfillquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdispenserequestinitialfillquantity.setComparator(medicationrequestdispenserequestinitialfillquantitycomparator.fromCode(m.getMdctnRqstDispnsRqstInitialFillQntyCmprtr()));

		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntySys() != null) {
			medicationrequestdispenserequestinitialfillquantity.setSystem(m.getMdctnRqstDispnsRqstInitialFillQntySys());
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyUnt() != null) {
			medicationrequestdispenserequestinitialfillquantity.setUnit(m.getMdctnRqstDispnsRqstInitialFillQntyUnt());
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyVl() != null) {
			medicationrequestdispenserequestinitialfillquantity.setValue(Double.parseDouble((m.getMdctnRqstDispnsRqstInitialFillQntyVl())));
		}
		/******************** MdctnRqst_DispnsRqst_NmbrOfRptsAllowed ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstNmbrOfRptsAllowed() != null) {
			medicationrequestdispenserequest.setNumberOfRepeatsAllowed(Integer.parseInt(m.getMdctnRqstDispnsRqstNmbrOfRptsAllowed()));
		}
		/******************** MdctnRqst_DispnsRqst_Prfrmr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstPrfrmr() != null) {
			medicationrequestdispenserequest.setPerformer( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstDispnsRqstPrfrmr()));
		}
		/******************** medicationrequestdispenserequestquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdispenserequestquantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdispenserequest.setQuantity(medicationrequestdispenserequestquantity);

		/******************** MdctnRqst_DispnsRqst_Qnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyCd() != null) {
			medicationrequestdispenserequestquantity.setCode(m.getMdctnRqstDispnsRqstQntyCd());
		}
		/******************** medicationrequestdispenserequestquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdispenserequestquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdispenserequestquantity.setComparator(medicationrequestdispenserequestquantitycomparator.fromCode(m.getMdctnRqstDispnsRqstQntyCmprtr()));

		/******************** MdctnRqst_DispnsRqst_Qnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntySys() != null) {
			medicationrequestdispenserequestquantity.setSystem(m.getMdctnRqstDispnsRqstQntySys());
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyUnt() != null) {
			medicationrequestdispenserequestquantity.setUnit(m.getMdctnRqstDispnsRqstQntyUnt());
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyVl() != null) {
			medicationrequestdispenserequestquantity.setValue(Double.parseDouble((m.getMdctnRqstDispnsRqstQntyVl())));
		}
		/******************** medicationrequestdispenserequestvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestdispenserequestvalidityperiod =  new org.hl7.fhir.r4.model.Period();
		medicationrequestdispenserequest.setValidityPeriod(medicationrequestdispenserequestvalidityperiod);

		/******************** MdctnRqst_DispnsRqst_ValidityPrd_End ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstValidityPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnRqst_DispnsRqst_ValidityPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_DispnsRqst_ValidityPrd_Enddate = MdctnRqst_DispnsRqst_ValidityPrd_Endsdf.parse(m.getMdctnRqstDispnsRqstValidityPrdEnd());
			medicationrequestdispenserequestvalidityperiod.setEnd(MdctnRqst_DispnsRqst_ValidityPrd_Enddate);
		}
		/******************** MdctnRqst_DispnsRqst_ValidityPrd_Strt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstValidityPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnRqst_DispnsRqst_ValidityPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_DispnsRqst_ValidityPrd_Strtdate = MdctnRqst_DispnsRqst_ValidityPrd_Strtsdf.parse(m.getMdctnRqstDispnsRqstValidityPrdStrt());
			medicationrequestdispenserequestvalidityperiod.setStart(MdctnRqst_DispnsRqst_ValidityPrd_Strtdate);
		}
		/******************** MdctnRqst_DoNotPerform ********************************************************************************/
		if(m.getMdctnRqstDoNotPerform() != null) {
			medicationrequest.setDoNotPerform(Boolean.parseBoolean(m.getMdctnRqstDoNotPerform()));
		}
		/******************** medicationrequestdosageinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationrequestdosageinstruction =  new org.hl7.fhir.r4.model.Dosage();
		medicationrequest.addDosageInstruction(medicationrequestdosageinstruction);

		/******************** medicationrequestdosageinstructionadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionadditionalinstruction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstruction.addAdditionalInstruction(medicationrequestdosageinstructionadditionalinstruction);

		/******************** medicationrequestdosageinstructionadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionadditionalinstructioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructionadditionalinstruction.addCoding(medicationrequestdosageinstructionadditionalinstructioncoding);

		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd() != null) {
			medicationrequestdosageinstructionadditionalinstructioncoding.setCode(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply() != null) {
			medicationrequestdosageinstructionadditionalinstructioncoding.setDisplay(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys() != null) {
			medicationrequestdosageinstructionadditionalinstructioncoding.setSystem(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd() != null) {
			medicationrequestdosageinstructionadditionalinstructioncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn() != null) {
			medicationrequestdosageinstructionadditionalinstructioncoding.setVersion(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnTxt() != null) {
			medicationrequestdosageinstructionadditionalinstruction.setText(m.getMdctnRqstDsgInstrctnAddtnlInstrctnTxt());
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdBooleanTyp() != null) {
			medicationrequestdosageinstruction.setAsNeeded( new org.hl7.fhir.r4.model.BooleanType(m.getMdctnRqstDsgInstrctnAsNdBooleanTyp()));
		}
		/******************** medicationrequestdosageinstructionasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionasneededcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstruction.setAsNeeded(medicationrequestdosageinstructionasneededcodeableconcept);

		/******************** medicationrequestdosageinstructionasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionasneededcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructionasneededcodeableconcept.addCoding(medicationrequestdosageinstructionasneededcodeableconceptcoding);

		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd() != null) {
			medicationrequestdosageinstructionasneededcodeableconceptcoding.setCode(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply() != null) {
			medicationrequestdosageinstructionasneededcodeableconceptcoding.setDisplay(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys() != null) {
			medicationrequestdosageinstructionasneededcodeableconceptcoding.setSystem(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd() != null) {
			medicationrequestdosageinstructionasneededcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn() != null) {
			medicationrequestdosageinstructionasneededcodeableconceptcoding.setVersion(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptTxt() != null) {
			medicationrequestdosageinstructionasneededcodeableconcept.setText(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptTxt());
		}
		/******************** medicationrequestdosageinstructiondoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationrequestdosageinstructiondoseandrate =  new org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent();
		medicationrequestdosageinstruction.addDoseAndRate(medicationrequestdosageinstructiondoseandrate);

		/******************** medicationrequestdosageinstructiondoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedosequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandrate.setDose(medicationrequestdosageinstructiondoseandratedosequantity);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd() != null) {
			medicationrequestdosageinstructiondoseandratedosequantity.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd());
		}
		/******************** medicationrequestdosageinstructiondoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandratedosequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandratedosequantity.setComparator(medicationrequestdosageinstructiondoseandratedosequantitycomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntySys() != null) {
			medicationrequestdosageinstructiondoseandratedosequantity.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntySys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt() != null) {
			medicationrequestdosageinstructiondoseandratedosequantity.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl() != null) {
			medicationrequestdosageinstructiondoseandratedosequantity.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiondoseandratedoserange =  new org.hl7.fhir.r4.model.Range();
		medicationrequestdosageinstructiondoseandrate.setDose(medicationrequestdosageinstructiondoseandratedoserange);

		/******************** medicationrequestdosageinstructiondoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedoserangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandratedoserange.setHigh(medicationrequestdosageinstructiondoseandratedoserangehigh);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd() != null) {
			medicationrequestdosageinstructiondoseandratedoserangehigh.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd());
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandratedoserangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandratedoserangehigh.setComparator(medicationrequestdosageinstructiondoseandratedoserangehighcomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys() != null) {
			medicationrequestdosageinstructiondoseandratedoserangehigh.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt() != null) {
			medicationrequestdosageinstructiondoseandratedoserangehigh.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl() != null) {
			medicationrequestdosageinstructiondoseandratedoserangehigh.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedoserangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandratedoserange.setLow(medicationrequestdosageinstructiondoseandratedoserangelow);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd() != null) {
			medicationrequestdosageinstructiondoseandratedoserangelow.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd());
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandratedoserangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandratedoserangelow.setComparator(medicationrequestdosageinstructiondoseandratedoserangelowcomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys() != null) {
			medicationrequestdosageinstructiondoseandratedoserangelow.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt() != null) {
			medicationrequestdosageinstructiondoseandratedoserangelow.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl() != null) {
			medicationrequestdosageinstructiondoseandratedoserangelow.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateratequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandrate.setRate(medicationrequestdosageinstructiondoseandrateratequantity);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCd() != null) {
			medicationrequestdosageinstructiondoseandrateratequantity.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCd());
		}
		/******************** medicationrequestdosageinstructiondoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandrateratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandrateratequantity.setComparator(medicationrequestdosageinstructiondoseandrateratequantitycomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntySys() != null) {
			medicationrequestdosageinstructiondoseandrateratequantity.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntySys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt() != null) {
			medicationrequestdosageinstructiondoseandrateratequantity.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyVl() != null) {
			medicationrequestdosageinstructiondoseandrateratequantity.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiondoseandrateraterange =  new org.hl7.fhir.r4.model.Range();
		medicationrequestdosageinstructiondoseandrate.setRate(medicationrequestdosageinstructiondoseandrateraterange);

		/******************** medicationrequestdosageinstructiondoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandrateraterange.setHigh(medicationrequestdosageinstructiondoseandrateraterangehigh);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd() != null) {
			medicationrequestdosageinstructiondoseandrateraterangehigh.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd());
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandrateraterangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandrateraterangehigh.setComparator(medicationrequestdosageinstructiondoseandrateraterangehighcomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys() != null) {
			medicationrequestdosageinstructiondoseandrateraterangehigh.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt() != null) {
			medicationrequestdosageinstructiondoseandrateraterangehigh.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl() != null) {
			medicationrequestdosageinstructiondoseandrateraterangehigh.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandrateraterange.setLow(medicationrequestdosageinstructiondoseandrateraterangelow);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd() != null) {
			medicationrequestdosageinstructiondoseandrateraterangelow.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd());
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandrateraterangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandrateraterangelow.setComparator(medicationrequestdosageinstructiondoseandrateraterangelowcomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys() != null) {
			medicationrequestdosageinstructiondoseandrateraterangelow.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt() != null) {
			medicationrequestdosageinstructiondoseandrateraterangelow.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl() != null) {
			medicationrequestdosageinstructiondoseandrateraterangelow.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationrequestdosageinstructiondoseandraterateratio =  new org.hl7.fhir.r4.model.Ratio();
		medicationrequestdosageinstructiondoseandrate.setRate(medicationrequestdosageinstructiondoseandraterateratio);

		/******************** medicationrequestdosageinstructiondoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandraterateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandraterateratio.setDenominator(medicationrequestdosageinstructiondoseandraterateratiodenominator);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd() != null) {
			medicationrequestdosageinstructiondoseandraterateratiodenominator.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd());
		}
		/******************** medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandraterateratiodenominator.setComparator(medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys() != null) {
			medicationrequestdosageinstructiondoseandraterateratiodenominator.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt() != null) {
			medicationrequestdosageinstructiondoseandraterateratiodenominator.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl() != null) {
			medicationrequestdosageinstructiondoseandraterateratiodenominator.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiondoseandraterateratio.setNumerator(medicationrequestdosageinstructiondoseandrateraterationumerator);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd() != null) {
			medicationrequestdosageinstructiondoseandrateraterationumerator.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd());
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiondoseandrateraterationumerator.setComparator(medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator.fromCode(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys() != null) {
			medicationrequestdosageinstructiondoseandrateraterationumerator.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt() != null) {
			medicationrequestdosageinstructiondoseandrateraterationumerator.setUnit(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl() != null) {
			medicationrequestdosageinstructiondoseandrateraterationumerator.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl())));
		}
		/******************** medicationrequestdosageinstructiondoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructiondoseandratetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstructiondoseandrate.setType(medicationrequestdosageinstructiondoseandratetype);

		/******************** medicationrequestdosageinstructiondoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructiondoseandratetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructiondoseandratetype.addCoding(medicationrequestdosageinstructiondoseandratetypecoding);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd() != null) {
			medicationrequestdosageinstructiondoseandratetypecoding.setCode(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply() != null) {
			medicationrequestdosageinstructiondoseandratetypecoding.setDisplay(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys() != null) {
			medicationrequestdosageinstructiondoseandratetypecoding.setSystem(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd() != null) {
			medicationrequestdosageinstructiondoseandratetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn() != null) {
			medicationrequestdosageinstructiondoseandratetypecoding.setVersion(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypTxt() != null) {
			medicationrequestdosageinstructiondoseandratetype.setText(m.getMdctnRqstDsgInstrctnDoseAndRtTypTxt());
		}
		/******************** medicationrequestdosageinstructionmaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperadministration =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstruction.setMaxDosePerAdministration(medicationrequestdosageinstructionmaxdoseperadministration);

		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCd() != null) {
			medicationrequestdosageinstructionmaxdoseperadministration.setCode(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCd());
		}
		/******************** medicationrequestdosageinstructionmaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructionmaxdoseperadministrationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructionmaxdoseperadministration.setComparator(medicationrequestdosageinstructionmaxdoseperadministrationcomparator.fromCode(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnSys() != null) {
			medicationrequestdosageinstructionmaxdoseperadministration.setSystem(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnSys());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt() != null) {
			medicationrequestdosageinstructionmaxdoseperadministration.setUnit(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnVl() != null) {
			medicationrequestdosageinstructionmaxdoseperadministration.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnVl())));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperlifetime =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstruction.setMaxDosePerLifetime(medicationrequestdosageinstructionmaxdoseperlifetime);

		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCd() != null) {
			medicationrequestdosageinstructionmaxdoseperlifetime.setCode(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCd());
		}
		/******************** medicationrequestdosageinstructionmaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructionmaxdoseperlifetimecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructionmaxdoseperlifetime.setComparator(medicationrequestdosageinstructionmaxdoseperlifetimecomparator.fromCode(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeSys() != null) {
			medicationrequestdosageinstructionmaxdoseperlifetime.setSystem(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeSys());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeUnt() != null) {
			medicationrequestdosageinstructionmaxdoseperlifetime.setUnit(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeVl() != null) {
			medicationrequestdosageinstructionmaxdoseperlifetime.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnMxDosePerLifetimeVl())));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationrequestdosageinstructionmaxdoseperperiod =  new org.hl7.fhir.r4.model.Ratio();
		medicationrequestdosageinstruction.setMaxDosePerPeriod(medicationrequestdosageinstructionmaxdoseperperiod);

		/******************** medicationrequestdosageinstructionmaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperperioddenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructionmaxdoseperperiod.setDenominator(medicationrequestdosageinstructionmaxdoseperperioddenominator);

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd() != null) {
			medicationrequestdosageinstructionmaxdoseperperioddenominator.setCode(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd());
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructionmaxdoseperperioddenominator.setComparator(medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator.fromCode(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys() != null) {
			medicationrequestdosageinstructionmaxdoseperperioddenominator.setSystem(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt() != null) {
			medicationrequestdosageinstructionmaxdoseperperioddenominator.setUnit(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl() != null) {
			medicationrequestdosageinstructionmaxdoseperperioddenominator.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl())));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperperiodnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructionmaxdoseperperiod.setNumerator(medicationrequestdosageinstructionmaxdoseperperiodnumerator);

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd() != null) {
			medicationrequestdosageinstructionmaxdoseperperiodnumerator.setCode(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd());
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructionmaxdoseperperiodnumerator.setComparator(medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator.fromCode(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys() != null) {
			medicationrequestdosageinstructionmaxdoseperperiodnumerator.setSystem(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt() != null) {
			medicationrequestdosageinstructionmaxdoseperperiodnumerator.setUnit(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl() != null) {
			medicationrequestdosageinstructionmaxdoseperperiodnumerator.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl())));
		}
		/******************** medicationrequestdosageinstructionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstruction.setMethod(medicationrequestdosageinstructionmethod);

		/******************** medicationrequestdosageinstructionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructionmethod.addCoding(medicationrequestdosageinstructionmethodcoding);

		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgCd() != null) {
			medicationrequestdosageinstructionmethodcoding.setCode(m.getMdctnRqstDsgInstrctnMthdCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgDsply() != null) {
			medicationrequestdosageinstructionmethodcoding.setDisplay(m.getMdctnRqstDsgInstrctnMthdCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgSys() != null) {
			medicationrequestdosageinstructionmethodcoding.setSystem(m.getMdctnRqstDsgInstrctnMthdCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgUsrSltd() != null) {
			medicationrequestdosageinstructionmethodcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnMthdCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgVrsn() != null) {
			medicationrequestdosageinstructionmethodcoding.setVersion(m.getMdctnRqstDsgInstrctnMthdCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdTxt() != null) {
			medicationrequestdosageinstructionmethod.setText(m.getMdctnRqstDsgInstrctnMthdTxt());
		}
		/******************** MdctnRqst_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnPntInstrctn() != null) {
			medicationrequestdosageinstruction.setPatientInstruction(m.getMdctnRqstDsgInstrctnPntInstrctn());
		}
		/******************** medicationrequestdosageinstructionroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstruction.setRoute(medicationrequestdosageinstructionroute);

		/******************** medicationrequestdosageinstructionroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionroutecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructionroute.addCoding(medicationrequestdosageinstructionroutecoding);

		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgCd() != null) {
			medicationrequestdosageinstructionroutecoding.setCode(m.getMdctnRqstDsgInstrctnRouteCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgDsply() != null) {
			medicationrequestdosageinstructionroutecoding.setDisplay(m.getMdctnRqstDsgInstrctnRouteCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgSys() != null) {
			medicationrequestdosageinstructionroutecoding.setSystem(m.getMdctnRqstDsgInstrctnRouteCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgUsrSltd() != null) {
			medicationrequestdosageinstructionroutecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnRouteCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgVrsn() != null) {
			medicationrequestdosageinstructionroutecoding.setVersion(m.getMdctnRqstDsgInstrctnRouteCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteTxt() != null) {
			medicationrequestdosageinstructionroute.setText(m.getMdctnRqstDsgInstrctnRouteTxt());
		}
		/******************** MdctnRqst_DsgInstrctn_Sqnc ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSqnc() != null) {
			medicationrequestdosageinstruction.setSequence(Integer.parseInt(m.getMdctnRqstDsgInstrctnSqnc()));
		}
		/******************** medicationrequestdosageinstructionsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstruction.setSite(medicationrequestdosageinstructionsite);

		/******************** medicationrequestdosageinstructionsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionsitecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructionsite.addCoding(medicationrequestdosageinstructionsitecoding);

		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgCd() != null) {
			medicationrequestdosageinstructionsitecoding.setCode(m.getMdctnRqstDsgInstrctnSiteCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgDsply() != null) {
			medicationrequestdosageinstructionsitecoding.setDisplay(m.getMdctnRqstDsgInstrctnSiteCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgSys() != null) {
			medicationrequestdosageinstructionsitecoding.setSystem(m.getMdctnRqstDsgInstrctnSiteCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgUsrSltd() != null) {
			medicationrequestdosageinstructionsitecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnSiteCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgVrsn() != null) {
			medicationrequestdosageinstructionsitecoding.setVersion(m.getMdctnRqstDsgInstrctnSiteCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteTxt() != null) {
			medicationrequestdosageinstructionsite.setText(m.getMdctnRqstDsgInstrctnSiteTxt());
		}
		/******************** MdctnRqst_DsgInstrctn_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTxt() != null) {
			medicationrequestdosageinstruction.setText(m.getMdctnRqstDsgInstrctnTxt());
		}
		/******************** medicationrequestdosageinstructiontiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationrequestdosageinstructiontiming =  new org.hl7.fhir.r4.model.Timing();
		medicationrequestdosageinstruction.setTiming(medicationrequestdosageinstructiontiming);

		/******************** medicationrequestdosageinstructiontimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructiontimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestdosageinstructiontiming.setCode(medicationrequestdosageinstructiontimingcode);

		/******************** medicationrequestdosageinstructiontimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructiontimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestdosageinstructiontimingcode.addCoding(medicationrequestdosageinstructiontimingcodecoding);

		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgCd() != null) {
			medicationrequestdosageinstructiontimingcodecoding.setCode(m.getMdctnRqstDsgInstrctnTmgCdCdgCd());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgDsply() != null) {
			medicationrequestdosageinstructiontimingcodecoding.setDisplay(m.getMdctnRqstDsgInstrctnTmgCdCdgDsply());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgSys() != null) {
			medicationrequestdosageinstructiontimingcodecoding.setSystem(m.getMdctnRqstDsgInstrctnTmgCdCdgSys());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgUsrSltd() != null) {
			medicationrequestdosageinstructiontimingcodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstDsgInstrctnTmgCdCdgUsrSltd()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgVrsn() != null) {
			medicationrequestdosageinstructiontimingcodecoding.setVersion(m.getMdctnRqstDsgInstrctnTmgCdCdgVrsn());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdTxt() != null) {
			medicationrequestdosageinstructiontimingcode.setText(m.getMdctnRqstDsgInstrctnTmgCdTxt());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgEvnt() != null) {
			java.text.SimpleDateFormat MdctnRqst_DsgInstrctn_Tmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_DsgInstrctn_Tmg_Evntdate = MdctnRqst_DsgInstrctn_Tmg_Evntsdf.parse(m.getMdctnRqstDsgInstrctnTmgEvnt());
			medicationrequestdosageinstructiontiming.addEvent(MdctnRqst_DsgInstrctn_Tmg_Evntdate);
		}
		/******************** medicationrequestdosageinstructiontimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationrequestdosageinstructiontimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		medicationrequestdosageinstructiontiming.setRepeat(medicationrequestdosageinstructiontimingrepeat);

		/******************** medicationrequestdosageinstructiontimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdosageinstructiontimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		medicationrequestdosageinstructiontimingrepeat.setBounds(medicationrequestdosageinstructiontimingrepeatboundsduration);

		/******************** medicationrequestdosageinstructiontimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestdosageinstructiontimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		medicationrequestdosageinstructiontimingrepeat.setBounds(medicationrequestdosageinstructiontimingrepeatboundsperiod);

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Enddate = MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Endsdf.parse(m.getMdctnRqstDsgInstrctnTmgRptBndsPrdEnd());
			medicationrequestdosageinstructiontimingrepeatboundsperiod.setEnd(MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Enddate);
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtdate = MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtsdf.parse(m.getMdctnRqstDsgInstrctnTmgRptBndsPrdStrt());
			medicationrequestdosageinstructiontimingrepeatboundsperiod.setStart(MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiontimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		medicationrequestdosageinstructiontimingrepeat.setBounds(medicationrequestdosageinstructiontimingrepeatboundsrange);

		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiontimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiontimingrepeatboundsrange.setHigh(medicationrequestdosageinstructiontimingrepeatboundsrangehigh);

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCd() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangehigh.setCode(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCd());
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiontimingrepeatboundsrangehigh.setComparator(medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator.fromCode(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiSys() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangehigh.setSystem(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiSys());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangehigh.setUnit(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiVl() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangehigh.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiVl())));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiontimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicationrequestdosageinstructiontimingrepeatboundsrange.setLow(medicationrequestdosageinstructiontimingrepeatboundsrangelow);

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCd() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangelow.setCode(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCd());
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationrequestdosageinstructiontimingrepeatboundsrangelow.setComparator(medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator.fromCode(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr()));

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwSys() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangelow.setSystem(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwSys());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangelow.setUnit(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt());
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwVl() != null) {
			medicationrequestdosageinstructiontimingrepeatboundsrangelow.setValue(Double.parseDouble((m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwVl())));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptCnt() != null) {
			medicationrequestdosageinstructiontimingrepeat.setCount(Integer.parseInt(m.getMdctnRqstDsgInstrctnTmgRptCnt()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptCntMx() != null) {
			medicationrequestdosageinstructiontimingrepeat.setCountMax(Integer.parseInt(m.getMdctnRqstDsgInstrctnTmgRptCntMx()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory medicationrequestdosageinstructiontimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		medicationrequestdosageinstructiontimingrepeat.addDayOfWeek(medicationrequestdosageinstructiontimingrepeatdayofweek.fromCode(m.getMdctnRqstDsgInstrctnTmgRptDayOfWeek()));

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptDuration() != null) {
			medicationrequestdosageinstructiontimingrepeat.setDuration(Double.parseDouble((m.getMdctnRqstDsgInstrctnTmgRptDuration())));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptDurationMx() != null) {
			medicationrequestdosageinstructiontimingrepeat.setDurationMax(Double.parseDouble((m.getMdctnRqstDsgInstrctnTmgRptDurationMx())));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationrequestdosageinstructiontimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationrequestdosageinstructiontimingrepeat.setDurationUnit(medicationrequestdosageinstructiontimingrepeatdurationunit.fromCode(m.getMdctnRqstDsgInstrctnTmgRptDurationUnt()));

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptFrqncy() != null) {
			medicationrequestdosageinstructiontimingrepeat.setFrequency(Integer.parseInt(m.getMdctnRqstDsgInstrctnTmgRptFrqncy()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptFrqncyMx() != null) {
			medicationrequestdosageinstructiontimingrepeat.setFrequencyMax(Integer.parseInt(m.getMdctnRqstDsgInstrctnTmgRptFrqncyMx()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptOff() != null) {
			medicationrequestdosageinstructiontimingrepeat.setOffset(Integer.parseInt(m.getMdctnRqstDsgInstrctnTmgRptOff()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptPrd() != null) {
			medicationrequestdosageinstructiontimingrepeat.setPeriod(Double.parseDouble((m.getMdctnRqstDsgInstrctnTmgRptPrd())));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptPrdMx() != null) {
			medicationrequestdosageinstructiontimingrepeat.setPeriodMax(Double.parseDouble((m.getMdctnRqstDsgInstrctnTmgRptPrdMx())));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationrequestdosageinstructiontimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		medicationrequestdosageinstructiontimingrepeat.setPeriodUnit(medicationrequestdosageinstructiontimingrepeatperiodunit.fromCode(m.getMdctnRqstDsgInstrctnTmgRptPrdUnt()));

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptTimeOfDay() != null) {
			medicationrequestdosageinstructiontimingrepeat.addTimeOfDay(m.getMdctnRqstDsgInstrctnTmgRptTimeOfDay());
		}
		/******************** medicationrequestdosageinstructiontimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory medicationrequestdosageinstructiontimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		medicationrequestdosageinstructiontimingrepeat.addWhen(medicationrequestdosageinstructiontimingrepeatwhen.fromCode(m.getMdctnRqstDsgInstrctnTmgRptWhen()));

		/******************** MdctnRqst_Enc ********************************************************************************/
		if(m.getMdctnRqstEnc() != null) {
			medicationrequest.setEncounter( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstEnc()));
		}
		/******************** MdctnRqst_EvntHis ********************************************************************************/
		if(m.getMdctnRqstEvntHis() != null) {
			medicationrequest.addEventHistory( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstEvntHis()));
		}
		/******************** medicationrequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationrequestgroupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicationrequest.setGroupIdentifier(medicationrequestgroupidentifier);

		/******************** MdctnRqst_GrpId_Assigner ********************************************************************************/
		if(m.getMdctnRqstGrpIdAssigner() != null) {
			medicationrequestgroupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstGrpIdAssigner()));
		}
		/******************** medicationrequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestgroupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicationrequestgroupidentifier.setPeriod(medicationrequestgroupidentifierperiod);

		/******************** MdctnRqst_GrpId_Prd_End ********************************************************************************/
		if(m.getMdctnRqstGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnRqst_GrpId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_GrpId_Prd_Enddate = MdctnRqst_GrpId_Prd_Endsdf.parse(m.getMdctnRqstGrpIdPrdEnd());
			medicationrequestgroupidentifierperiod.setEnd(MdctnRqst_GrpId_Prd_Enddate);
		}
		/******************** MdctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(m.getMdctnRqstGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnRqst_GrpId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_GrpId_Prd_Strtdate = MdctnRqst_GrpId_Prd_Strtsdf.parse(m.getMdctnRqstGrpIdPrdStrt());
			medicationrequestgroupidentifierperiod.setStart(MdctnRqst_GrpId_Prd_Strtdate);
		}
		/******************** MdctnRqst_GrpId_Sys ********************************************************************************/
		if(m.getMdctnRqstGrpIdSys() != null) {
			medicationrequestgroupidentifier.setSystem(m.getMdctnRqstGrpIdSys());
		}
		/******************** medicationrequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestgroupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestgroupidentifier.setType(medicationrequestgroupidentifiertype);

		/******************** medicationrequestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestgroupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestgroupidentifiertype.addCoding(medicationrequestgroupidentifiertypecoding);

		/******************** MdctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgCd() != null) {
			medicationrequestgroupidentifiertypecoding.setCode(m.getMdctnRqstGrpIdTypCdgCd());
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgDsply() != null) {
			medicationrequestgroupidentifiertypecoding.setDisplay(m.getMdctnRqstGrpIdTypCdgDsply());
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgSys() != null) {
			medicationrequestgroupidentifiertypecoding.setSystem(m.getMdctnRqstGrpIdTypCdgSys());
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgUsrSltd() != null) {
			medicationrequestgroupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstGrpIdTypCdgUsrSltd()));
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgVrsn() != null) {
			medicationrequestgroupidentifiertypecoding.setVersion(m.getMdctnRqstGrpIdTypCdgVrsn());
		}
		/******************** MdctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypTxt() != null) {
			medicationrequestgroupidentifiertype.setText(m.getMdctnRqstGrpIdTypTxt());
		}
		/******************** medicationrequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationrequestgroupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicationrequestgroupidentifier.setUse(medicationrequestgroupidentifieruse.fromCode(m.getMdctnRqstGrpIdUse()));

		/******************** MdctnRqst_GrpId_Vl ********************************************************************************/
		if(m.getMdctnRqstGrpIdVl() != null) {
			medicationrequestgroupidentifier.setValue(m.getMdctnRqstGrpIdVl());
		}
		/******************** medicationrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationrequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicationrequest.addIdentifier(medicationrequestidentifier);

		/******************** MdctnRqst_Id_Assigner ********************************************************************************/
		if(m.getMdctnRqstIdAssigner() != null) {
			medicationrequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstIdAssigner()));
		}
		/******************** medicationrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicationrequestidentifier.setPeriod(medicationrequestidentifierperiod);

		/******************** MdctnRqst_Id_Prd_End ********************************************************************************/
		if(m.getMdctnRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_Id_Prd_Enddate = MdctnRqst_Id_Prd_Endsdf.parse(m.getMdctnRqstIdPrdEnd());
			medicationrequestidentifierperiod.setEnd(MdctnRqst_Id_Prd_Enddate);
		}
		/******************** MdctnRqst_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_Id_Prd_Strtdate = MdctnRqst_Id_Prd_Strtsdf.parse(m.getMdctnRqstIdPrdStrt());
			medicationrequestidentifierperiod.setStart(MdctnRqst_Id_Prd_Strtdate);
		}
		/******************** MdctnRqst_Id_Sys ********************************************************************************/
		if(m.getMdctnRqstIdSys() != null) {
			medicationrequestidentifier.setSystem(m.getMdctnRqstIdSys());
		}
		/******************** medicationrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestidentifier.setType(medicationrequestidentifiertype);

		/******************** medicationrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestidentifiertype.addCoding(medicationrequestidentifiertypecoding);

		/******************** MdctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgCd() != null) {
			medicationrequestidentifiertypecoding.setCode(m.getMdctnRqstIdTypCdgCd());
		}
		/******************** MdctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgDsply() != null) {
			medicationrequestidentifiertypecoding.setDisplay(m.getMdctnRqstIdTypCdgDsply());
		}
		/******************** MdctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgSys() != null) {
			medicationrequestidentifiertypecoding.setSystem(m.getMdctnRqstIdTypCdgSys());
		}
		/******************** MdctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgUsrSltd() != null) {
			medicationrequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstIdTypCdgUsrSltd()));
		}
		/******************** MdctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgVrsn() != null) {
			medicationrequestidentifiertypecoding.setVersion(m.getMdctnRqstIdTypCdgVrsn());
		}
		/******************** MdctnRqst_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnRqstIdTypTxt() != null) {
			medicationrequestidentifiertype.setText(m.getMdctnRqstIdTypTxt());
		}
		/******************** medicationrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationrequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicationrequestidentifier.setUse(medicationrequestidentifieruse.fromCode(m.getMdctnRqstIdUse()));

		/******************** MdctnRqst_Id_Vl ********************************************************************************/
		if(m.getMdctnRqstIdVl() != null) {
			medicationrequestidentifier.setValue(m.getMdctnRqstIdVl());
		}
		/******************** MdctnRqst_InstantiatesCanonical ********************************************************************************/
		if(m.getMdctnRqstInstantiatesCanonical() != null) {
			medicationrequest.addInstantiatesCanonical(m.getMdctnRqstInstantiatesCanonical());
		}
		/******************** MdctnRqst_InstantiatesUri ********************************************************************************/
		if(m.getMdctnRqstInstantiatesUri() != null) {
			medicationrequest.addInstantiatesUri(m.getMdctnRqstInstantiatesUri());
		}
		/******************** MdctnRqst_Insrnc ********************************************************************************/
		if(m.getMdctnRqstInsrnc() != null) {
			medicationrequest.addInsurance( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstInsrnc()));
		}
		/******************** medicationrequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory medicationrequestintent =  new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory();
		medicationrequest.setIntent(medicationrequestintent.fromCode(m.getMdctnRqstIntent()));

		/******************** medicationrequestmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestmedicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setMedication(medicationrequestmedicationcodeableconcept);

		/******************** medicationrequestmedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestmedicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestmedicationcodeableconcept.addCoding(medicationrequestmedicationcodeableconceptcoding);

		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgCd() != null) {
			medicationrequestmedicationcodeableconceptcoding.setCode(m.getMdctnRqstMdctnCdbleCncptCdgCd());
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgDsply() != null) {
			medicationrequestmedicationcodeableconceptcoding.setDisplay(m.getMdctnRqstMdctnCdbleCncptCdgDsply());
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgSys() != null) {
			medicationrequestmedicationcodeableconceptcoding.setSystem(m.getMdctnRqstMdctnCdbleCncptCdgSys());
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgUsrSltd() != null) {
			medicationrequestmedicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstMdctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgVrsn() != null) {
			medicationrequestmedicationcodeableconceptcoding.setVersion(m.getMdctnRqstMdctnCdbleCncptCdgVrsn());
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptTxt() != null) {
			medicationrequestmedicationcodeableconcept.setText(m.getMdctnRqstMdctnCdbleCncptTxt());
		}
		/******************** MdctnRqst_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnRqstMdctnRfrnc() != null) {
			medicationrequest.setMedication( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstMdctnRfrnc()));
		}
		/******************** medicationrequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationrequestnote =  new org.hl7.fhir.r4.model.Annotation();
		medicationrequest.addNote(medicationrequestnote);

		/******************** MdctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnRqstNtAthrRfrnc() != null) {
			medicationrequestnote.setAuthor( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstNtAthrRfrnc()));
		}
		/******************** MdctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnRqstNtAthrStrgTyp() != null) {
			medicationrequestnote.setAuthor( new org.hl7.fhir.r4.model.StringType(m.getMdctnRqstNtAthrStrgTyp()));
		}
		/******************** MdctnRqst_Nt_Txt ********************************************************************************/
		if(m.getMdctnRqstNtTxt() != null) {
			medicationrequestnote.setText(m.getMdctnRqstNtTxt());
		}
		/******************** MdctnRqst_Nt_Time ********************************************************************************/
		if(m.getMdctnRqstNtTime() != null) {
			java.text.SimpleDateFormat MdctnRqst_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnRqst_Nt_Timedate = MdctnRqst_Nt_Timesdf.parse(m.getMdctnRqstNtTime());
			medicationrequestnote.setTime(MdctnRqst_Nt_Timedate);
		}
		/******************** MdctnRqst_Prfrmr ********************************************************************************/
		if(m.getMdctnRqstPrfrmr() != null) {
			medicationrequest.setPerformer( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstPrfrmr()));
		}
		/******************** medicationrequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestperformertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setPerformerType(medicationrequestperformertype);

		/******************** medicationrequestperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestperformertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestperformertype.addCoding(medicationrequestperformertypecoding);

		/******************** MdctnRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgCd() != null) {
			medicationrequestperformertypecoding.setCode(m.getMdctnRqstPrfrmrTypCdgCd());
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgDsply() != null) {
			medicationrequestperformertypecoding.setDisplay(m.getMdctnRqstPrfrmrTypCdgDsply());
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgSys() != null) {
			medicationrequestperformertypecoding.setSystem(m.getMdctnRqstPrfrmrTypCdgSys());
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgUsrSltd() != null) {
			medicationrequestperformertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstPrfrmrTypCdgUsrSltd()));
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgVrsn() != null) {
			medicationrequestperformertypecoding.setVersion(m.getMdctnRqstPrfrmrTypCdgVrsn());
		}
		/******************** MdctnRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypTxt() != null) {
			medicationrequestperformertype.setText(m.getMdctnRqstPrfrmrTypTxt());
		}
		/******************** MdctnRqst_PriorPrescription ********************************************************************************/
		if(m.getMdctnRqstPriorPrescription() != null) {
			medicationrequest.setPriorPrescription( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstPriorPrescription()));
		}
		/******************** medicationrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory medicationrequestpriority =  new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory();
		medicationrequest.setPriority(medicationrequestpriority.fromCode(m.getMdctnRqstPriority()));

		/******************** medicationrequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.addReasonCode(medicationrequestreasoncode);

		/******************** medicationrequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestreasoncode.addCoding(medicationrequestreasoncodecoding);

		/******************** MdctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgCd() != null) {
			medicationrequestreasoncodecoding.setCode(m.getMdctnRqstRsnCdCdgCd());
		}
		/******************** MdctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgDsply() != null) {
			medicationrequestreasoncodecoding.setDisplay(m.getMdctnRqstRsnCdCdgDsply());
		}
		/******************** MdctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgSys() != null) {
			medicationrequestreasoncodecoding.setSystem(m.getMdctnRqstRsnCdCdgSys());
		}
		/******************** MdctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgUsrSltd() != null) {
			medicationrequestreasoncodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstRsnCdCdgUsrSltd()));
		}
		/******************** MdctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgVrsn() != null) {
			medicationrequestreasoncodecoding.setVersion(m.getMdctnRqstRsnCdCdgVrsn());
		}
		/******************** MdctnRqst_RsnCd_Txt ********************************************************************************/
		if(m.getMdctnRqstRsnCdTxt() != null) {
			medicationrequestreasoncode.setText(m.getMdctnRqstRsnCdTxt());
		}
		/******************** MdctnRqst_RsnRfrnc ********************************************************************************/
		if(m.getMdctnRqstRsnRfrnc() != null) {
			medicationrequest.addReasonReference( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRsnRfrnc()));
		}
		/******************** MdctnRqst_Recorder ********************************************************************************/
		if(m.getMdctnRqstRecorder() != null) {
			medicationrequest.setRecorder( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRecorder()));
		}
		/******************** MdctnRqst_RptedBooleanTyp ********************************************************************************/
		if(m.getMdctnRqstRptedBooleanTyp() != null) {
			medicationrequest.setReported( new org.hl7.fhir.r4.model.BooleanType(m.getMdctnRqstRptedBooleanTyp()));
		}
		/******************** MdctnRqst_RptedRfrnc ********************************************************************************/
		if(m.getMdctnRqstRptedRfrnc() != null) {
			medicationrequest.setReported( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRptedRfrnc()));
		}
		/******************** MdctnRqst_Rqster ********************************************************************************/
		if(m.getMdctnRqstRqster() != null) {
			medicationrequest.setRequester( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRqster()));
		}
		/******************** medicationrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory medicationrequeststatus =  new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory();
		medicationrequest.setStatus(medicationrequeststatus.fromCode(m.getMdctnRqstSts()));

		/******************** medicationrequeststatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequeststatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setStatusReason(medicationrequeststatusreason);

		/******************** medicationrequeststatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequeststatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequeststatusreason.addCoding(medicationrequeststatusreasoncoding);

		/******************** MdctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgCd() != null) {
			medicationrequeststatusreasoncoding.setCode(m.getMdctnRqstStsRsnCdgCd());
		}
		/******************** MdctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgDsply() != null) {
			medicationrequeststatusreasoncoding.setDisplay(m.getMdctnRqstStsRsnCdgDsply());
		}
		/******************** MdctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgSys() != null) {
			medicationrequeststatusreasoncoding.setSystem(m.getMdctnRqstStsRsnCdgSys());
		}
		/******************** MdctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgUsrSltd() != null) {
			medicationrequeststatusreasoncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstStsRsnCdgUsrSltd()));
		}
		/******************** MdctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgVrsn() != null) {
			medicationrequeststatusreasoncoding.setVersion(m.getMdctnRqstStsRsnCdgVrsn());
		}
		/******************** MdctnRqst_StsRsn_Txt ********************************************************************************/
		if(m.getMdctnRqstStsRsnTxt() != null) {
			medicationrequeststatusreason.setText(m.getMdctnRqstStsRsnTxt());
		}
		/******************** MdctnRqst_Sbjct ********************************************************************************/
		if(m.getMdctnRqstSbjct() != null) {
			medicationrequest.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstSbjct()));
		}
		/******************** medicationrequestsubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent medicationrequestsubstitution =  new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent();
		medicationrequest.setSubstitution(medicationrequestsubstitution);

		/******************** MdctnRqst_Substitution_AllowedBooleanTyp ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedBooleanTyp() != null) {
			medicationrequestsubstitution.setAllowed( new org.hl7.fhir.r4.model.BooleanType(m.getMdctnRqstSubstitutionAllowedBooleanTyp()));
		}
		/******************** medicationrequestsubstitutionallowedcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsubstitutionallowedcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestsubstitution.setAllowed(medicationrequestsubstitutionallowedcodeableconcept);

		/******************** medicationrequestsubstitutionallowedcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestsubstitutionallowedcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestsubstitutionallowedcodeableconcept.addCoding(medicationrequestsubstitutionallowedcodeableconceptcoding);

		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgCd() != null) {
			medicationrequestsubstitutionallowedcodeableconceptcoding.setCode(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgCd());
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply() != null) {
			medicationrequestsubstitutionallowedcodeableconceptcoding.setDisplay(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply());
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgSys() != null) {
			medicationrequestsubstitutionallowedcodeableconceptcoding.setSystem(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgSys());
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd() != null) {
			medicationrequestsubstitutionallowedcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn() != null) {
			medicationrequestsubstitutionallowedcodeableconceptcoding.setVersion(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn());
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptTxt() != null) {
			medicationrequestsubstitutionallowedcodeableconcept.setText(m.getMdctnRqstSubstitutionAllowedCdbleCncptTxt());
		}
		/******************** medicationrequestsubstitutionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsubstitutionreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestsubstitution.setReason(medicationrequestsubstitutionreason);

		/******************** medicationrequestsubstitutionreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestsubstitutionreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationrequestsubstitutionreason.addCoding(medicationrequestsubstitutionreasoncoding);

		/******************** MdctnRqst_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgCd() != null) {
			medicationrequestsubstitutionreasoncoding.setCode(m.getMdctnRqstSubstitutionRsnCdgCd());
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgDsply() != null) {
			medicationrequestsubstitutionreasoncoding.setDisplay(m.getMdctnRqstSubstitutionRsnCdgDsply());
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgSys() != null) {
			medicationrequestsubstitutionreasoncoding.setSystem(m.getMdctnRqstSubstitutionRsnCdgSys());
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgUsrSltd() != null) {
			medicationrequestsubstitutionreasoncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnRqstSubstitutionRsnCdgUsrSltd()));
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgVrsn() != null) {
			medicationrequestsubstitutionreasoncoding.setVersion(m.getMdctnRqstSubstitutionRsnCdgVrsn());
		}
		/******************** MdctnRqst_Substitution_Rsn_Txt ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnTxt() != null) {
			medicationrequestsubstitutionreason.setText(m.getMdctnRqstSubstitutionRsnTxt());
		}
		/******************** MdctnRqst_SprtingInfo ********************************************************************************/
		if(m.getMdctnRqstSprtingInfo() != null) {
			medicationrequest.addSupportingInformation( new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstSprtingInfo()));
		}
		return medicationrequest;
	}
}
