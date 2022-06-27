package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationRequest;
public class MedicationRequestBidirectionalConversion 
{
	public MedicationRequest MedicationRequests(org.hl7.fhir.r4.model.MedicationRequest medicationrequest) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationRequest m = new  main.java.com.campfhir.model.MedicationRequest();

		/******************** id ********************************************************************************/
		medicationrequest.setId(m.getId());

		/******************** medicationrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriority medicationrequestpriority = medicationrequest.getPriority();
		m.setMdctnRqstPriority(medicationrequestpriority.toCode());

		/******************** MdctnRqst_DetectedIssue ********************************************************************************/
		if(medicationrequest.hasDetectedIssue()) {
			m.setMdctnRqstDetectedIssue(String.valueOf(medicationrequest.getDetectedIssueFirstRep()));
		}
		/******************** MdctnRqst_RptedBooleanTyp ********************************************************************************/
		if(medicationrequest.hasReportedBooleanType()) {
			m.setMdctnRqstRptedBooleanTyp(String.valueOf(medicationrequest.getReportedBooleanType()));
		}
		/******************** medicationrequestcourseoftherapytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestcourseoftherapytype = medicationrequest.getCourseOfTherapyType();

		/******************** MdctnRqst_CourseOfThrpyTyp_Txt ********************************************************************************/
		if(medicationrequestcourseoftherapytype.hasText()) {
			m.setMdctnRqstCourseOfThrpyTypTxt(String.valueOf(medicationrequestcourseoftherapytype.getText()));
		}
		/******************** medicationrequestcourseoftherapytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestcourseoftherapytypecoding = medicationrequestcourseoftherapytype.getCodingFirstRep();

		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestcourseoftherapytypecoding.hasVersion()) {
			m.setMdctnRqstCourseOfThrpyTypCdgVrsn(String.valueOf(medicationrequestcourseoftherapytypecoding.getVersion()));
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Dsply ********************************************************************************/
		if(medicationrequestcourseoftherapytypecoding.hasDisplay()) {
			m.setMdctnRqstCourseOfThrpyTypCdgDsply(String.valueOf(medicationrequestcourseoftherapytypecoding.getDisplay()));
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Cd ********************************************************************************/
		if(medicationrequestcourseoftherapytypecoding.hasCode()) {
			m.setMdctnRqstCourseOfThrpyTypCdgCd(String.valueOf(medicationrequestcourseoftherapytypecoding.getCode()));
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestcourseoftherapytypecoding.hasUserSelected()) {
			m.setMdctnRqstCourseOfThrpyTypCdgUsrSltd(String.valueOf(medicationrequestcourseoftherapytypecoding.getUserSelected()));
		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Sys ********************************************************************************/
		if(medicationrequestcourseoftherapytypecoding.hasSystem()) {
			m.setMdctnRqstCourseOfThrpyTypCdgSys(String.valueOf(medicationrequestcourseoftherapytypecoding.getSystem()));
		}
		/******************** MdctnRqst_RptedRfrnc ********************************************************************************/
		if(medicationrequest.hasReportedReference()) {
			m.setMdctnRqstRptedRfrnc(String.valueOf(medicationrequest.getReportedReference()));
		}
		/******************** medicationrequestdosageinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationrequestdosageinstruction = medicationrequest.getDosageInstructionFirstRep();

		/******************** medicationrequestdosageinstructionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionmethod = medicationrequestdosageinstruction.getMethod();

		/******************** MdctnRqst_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionmethod.hasText()) {
			m.setMdctnRqstDsgInstrctnMthdTxt(String.valueOf(medicationrequestdosageinstructionmethod.getText()));
		}
		/******************** medicationrequestdosageinstructionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionmethodcoding = medicationrequestdosageinstructionmethod.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnMthdCdgVrsn(String.valueOf(medicationrequestdosageinstructionmethodcoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnMthdCdgDsply(String.valueOf(medicationrequestdosageinstructionmethodcoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnMthdCdgCd(String.valueOf(medicationrequestdosageinstructionmethodcoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnMthdCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionmethodcoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnMthdCdgSys(String.valueOf(medicationrequestdosageinstructionmethodcoding.getSystem()));
		}
		/******************** medicationrequestdosageinstructionasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionasneededcodeableconcept = medicationrequestdosageinstruction.getAsNeededCodeableConcept();

		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconcept.hasText()) {
			m.setMdctnRqstDsgInstrctnAsNdCdbleCncptTxt(String.valueOf(medicationrequestdosageinstructionasneededcodeableconcept.getText()));
		}
		/******************** medicationrequestdosageinstructionasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionasneededcodeableconceptcoding = medicationrequestdosageinstructionasneededcodeableconcept.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnRqst_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(medicationrequestdosageinstruction.hasAsNeededBooleanType()) {
			m.setMdctnRqstDsgInstrctnAsNdBooleanTyp(String.valueOf(medicationrequestdosageinstruction.getAsNeededBooleanType()));
		}
		/******************** MdctnRqst_DsgInstrctn_Sqnc ********************************************************************************/
		if(medicationrequestdosageinstruction.hasSequence()) {
			m.setMdctnRqstDsgInstrctnSqnc(String.valueOf(medicationrequestdosageinstruction.getSequence()));
		}
		/******************** medicationrequestdosageinstructionsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionsite = medicationrequestdosageinstruction.getSite();

		/******************** MdctnRqst_DsgInstrctn_Site_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionsite.hasText()) {
			m.setMdctnRqstDsgInstrctnSiteTxt(String.valueOf(medicationrequestdosageinstructionsite.getText()));
		}
		/******************** medicationrequestdosageinstructionsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionsitecoding = medicationrequestdosageinstructionsite.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionsitecoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnSiteCdgVrsn(String.valueOf(medicationrequestdosageinstructionsitecoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionsitecoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnSiteCdgDsply(String.valueOf(medicationrequestdosageinstructionsitecoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionsitecoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnSiteCdgCd(String.valueOf(medicationrequestdosageinstructionsitecoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionsitecoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnSiteCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionsitecoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionsitecoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnSiteCdgSys(String.valueOf(medicationrequestdosageinstructionsitecoding.getSystem()));
		}
		/******************** MdctnRqst_DsgInstrctn_Txt ********************************************************************************/
		if(medicationrequestdosageinstruction.hasText()) {
			m.setMdctnRqstDsgInstrctnTxt(String.valueOf(medicationrequestdosageinstruction.getText()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperlifetime = medicationrequestdosageinstruction.getMaxDosePerLifetime();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasValue()) {
			m.setMdctnRqstDsgInstrctnMxDosePerLifetimeVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getValue()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperlifetimecomparator = medicationrequestdosageinstructionmaxdoseperlifetime.getComparator();
		m.setMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr(medicationrequestdosageinstructionmaxdoseperlifetimecomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasCode()) {
			m.setMdctnRqstDsgInstrctnMxDosePerLifetimeCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasUnit()) {
			m.setMdctnRqstDsgInstrctnMxDosePerLifetimeUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasSystem()) {
			m.setMdctnRqstDsgInstrctnMxDosePerLifetimeSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getSystem()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationrequestdosageinstructionmaxdoseperperiod = medicationrequestdosageinstruction.getMaxDosePerPeriod();

		/******************** medicationrequestdosageinstructionmaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperperioddenominator = medicationrequestdosageinstructionmaxdoseperperiod.getDenominator();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasValue()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getValue()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator = medicationrequestdosageinstructionmaxdoseperperioddenominator.getComparator();
		m.setMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr(medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasCode()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasUnit()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasSystem()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getSystem()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperperiodnumerator = medicationrequestdosageinstructionmaxdoseperperiod.getNumerator();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasValue()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getValue()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator = medicationrequestdosageinstructionmaxdoseperperiodnumerator.getComparator();
		m.setMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr(medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasCode()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasUnit()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasSystem()) {
			m.setMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getSystem()));
		}
		/******************** medicationrequestdosageinstructionadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionadditionalinstruction = medicationrequestdosageinstruction.getAdditionalInstructionFirstRep();

		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstruction.hasText()) {
			m.setMdctnRqstDsgInstrctnAddtnlInstrctnTxt(String.valueOf(medicationrequestdosageinstructionadditionalinstruction.getText()));
		}
		/******************** medicationrequestdosageinstructionadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionadditionalinstructioncoding = medicationrequestdosageinstructionadditionalinstruction.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationrequestdosageinstructiondoseandrate = medicationrequestdosageinstruction.getDoseAndRateFirstRep();

		/******************** medicationrequestdosageinstructiondoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructiondoseandratetype = medicationrequestdosageinstructiondoseandrate.getType();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetype.hasText()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtTypTxt(String.valueOf(medicationrequestdosageinstructiondoseandratetype.getText()));
		}
		/******************** medicationrequestdosageinstructiondoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructiondoseandratetypecoding = medicationrequestdosageinstructiondoseandratetype.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtTypCdgCd(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtTypCdgSys(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationrequestdosageinstructiondoseandraterateratio = medicationrequestdosageinstructiondoseandrate.getRateRatio();

		/******************** medicationrequestdosageinstructiondoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandraterateratiodenominator = medicationrequestdosageinstructiondoseandraterateratio.getDenominator();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator = medicationrequestdosageinstructiondoseandraterateratiodenominator.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr(medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterationumerator = medicationrequestdosageinstructiondoseandraterateratio.getNumerator();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator = medicationrequestdosageinstructiondoseandrateraterationumerator.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr(medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiondoseandratedoserange = medicationrequestdosageinstructiondoseandrate.getDoseRange();

		/******************** medicationrequestdosageinstructiondoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedoserangelow = medicationrequestdosageinstructiondoseandratedoserange.getLow();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandratedoserangelowcomparator = medicationrequestdosageinstructiondoseandratedoserangelow.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr(medicationrequestdosageinstructiondoseandratedoserangelowcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedoserangehigh = medicationrequestdosageinstructiondoseandratedoserange.getHigh();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandratedoserangehighcomparator = medicationrequestdosageinstructiondoseandratedoserangehigh.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr(medicationrequestdosageinstructiondoseandratedoserangehighcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateratequantity = medicationrequestdosageinstructiondoseandrate.getRateQuantity();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtQntyVl(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateratequantitycomparator = medicationrequestdosageinstructiondoseandrateratequantity.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr(medicationrequestdosageinstructiondoseandrateratequantitycomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtQntyCd(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtQntySys(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiondoseandrateraterange = medicationrequestdosageinstructiondoseandrate.getRateRange();

		/******************** medicationrequestdosageinstructiondoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterangelow = medicationrequestdosageinstructiondoseandrateraterange.getLow();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateraterangelowcomparator = medicationrequestdosageinstructiondoseandrateraterangelow.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr(medicationrequestdosageinstructiondoseandrateraterangelowcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterangehigh = medicationrequestdosageinstructiondoseandrateraterange.getHigh();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateraterangehighcomparator = medicationrequestdosageinstructiondoseandrateraterangehigh.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr(medicationrequestdosageinstructiondoseandrateraterangehighcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getSystem()));
		}
		/******************** medicationrequestdosageinstructiondoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedosequantity = medicationrequestdosageinstructiondoseandrate.getDoseQuantity();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasValue()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getValue()));
		}
		/******************** medicationrequestdosageinstructiondoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandratedosequantitycomparator = medicationrequestdosageinstructiondoseandratedosequantity.getComparator();
		m.setMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr(medicationrequestdosageinstructiondoseandratedosequantitycomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasCode()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasUnit()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasSystem()) {
			m.setMdctnRqstDsgInstrctnDoseAndRtDoseQntySys(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getSystem()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperadministration = medicationrequestdosageinstruction.getMaxDosePerAdministration();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasValue()) {
			m.setMdctnRqstDsgInstrctnMxDosePerAdmnstnVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getValue()));
		}
		/******************** medicationrequestdosageinstructionmaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperadministrationcomparator = medicationrequestdosageinstructionmaxdoseperadministration.getComparator();
		m.setMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr(medicationrequestdosageinstructionmaxdoseperadministrationcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasCode()) {
			m.setMdctnRqstDsgInstrctnMxDosePerAdmnstnCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasUnit()) {
			m.setMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasSystem()) {
			m.setMdctnRqstDsgInstrctnMxDosePerAdmnstnSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getSystem()));
		}
		/******************** MdctnRqst_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(medicationrequestdosageinstruction.hasPatientInstruction()) {
			m.setMdctnRqstDsgInstrctnPntInstrctn(String.valueOf(medicationrequestdosageinstruction.getPatientInstruction()));
		}
		/******************** medicationrequestdosageinstructiontiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationrequestdosageinstructiontiming = medicationrequestdosageinstruction.getTiming();

		/******************** medicationrequestdosageinstructiontimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructiontimingcode = medicationrequestdosageinstructiontiming.getCode();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcode.hasText()) {
			m.setMdctnRqstDsgInstrctnTmgCdTxt(String.valueOf(medicationrequestdosageinstructiontimingcode.getText()));
		}
		/******************** medicationrequestdosageinstructiontimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructiontimingcodecoding = medicationrequestdosageinstructiontimingcode.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnTmgCdCdgVrsn(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnTmgCdCdgDsply(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnTmgCdCdgCd(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnTmgCdCdgUsrSltd(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnTmgCdCdgSys(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getSystem()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationrequestdosageinstructiontimingrepeat = medicationrequestdosageinstructiontiming.getRepeat();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasOffset()) {
			m.setMdctnRqstDsgInstrctnTmgRptOff(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getOffset()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasCount()) {
			m.setMdctnRqstDsgInstrctnTmgRptCnt(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getCount()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasFrequency()) {
			m.setMdctnRqstDsgInstrctnTmgRptFrqncy(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getFrequency()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasPeriod()) {
			m.setMdctnRqstDsgInstrctnTmgRptPrd(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getPeriod()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasDuration()) {
			m.setMdctnRqstDsgInstrctnTmgRptDuration(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getDuration()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdosageinstructiontimingrepeatboundsduration = medicationrequestdosageinstructiontimingrepeat.getBoundsDuration();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasValue()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsDurationVl(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getValue()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator = medicationrequestdosageinstructiontimingrepeatboundsduration.getComparator();
		m.setMdctnRqstDsgInstrctnTmgRptBndsDurationCmprtr(medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasCode()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsDurationCd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasUnit()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsDurationUnt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasSystem()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsDurationSys(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getSystem()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiontimingrepeatboundsrange = medicationrequestdosageinstructiontimingrepeat.getBoundsRange();

		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiontimingrepeatboundsrangelow = medicationrequestdosageinstructiontimingrepeatboundsrange.getLow();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasValue()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngLwVl(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getValue()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator = medicationrequestdosageinstructiontimingrepeatboundsrangelow.getComparator();
		m.setMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr(medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasCode()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngLwCd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasUnit()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasSystem()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngLwSys(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getSystem()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiontimingrepeatboundsrangehigh = medicationrequestdosageinstructiontimingrepeatboundsrange.getHigh();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasValue()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngHiVl(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getValue()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator = medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getComparator();
		m.setMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr(medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator.toCode());

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasCode()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngHiCd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasUnit()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasSystem()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsRngHiSys(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestdosageinstructiontimingrepeatboundsperiod = medicationrequestdosageinstructiontimingrepeat.getBoundsPeriod();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsperiod.hasStart()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsPrdStrt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsperiod.getStart()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsperiod.hasEnd()) {
			m.setMdctnRqstDsgInstrctnTmgRptBndsPrdEnd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsperiod.getEnd()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasPeriodMax()) {
			m.setMdctnRqstDsgInstrctnTmgRptPrdMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getPeriodMax()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasDurationMax()) {
			m.setMdctnRqstDsgInstrctnTmgRptDurationMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getDurationMax()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasCountMax()) {
			m.setMdctnRqstDsgInstrctnTmgRptCntMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getCountMax()));
		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasFrequencyMax()) {
			m.setMdctnRqstDsgInstrctnTmgRptFrqncyMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getFrequencyMax()));
		}
		/******************** medicationrequestdosageinstructiontimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationrequestdosageinstructiontimingrepeatdurationunit = medicationrequestdosageinstructiontimingrepeat.getDurationUnit();
		m.setMdctnRqstDsgInstrctnTmgRptDurationUnt(medicationrequestdosageinstructiontimingrepeatdurationunit.toCode());

		/******************** medicationrequestdosageinstructiontimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationrequestdosageinstructiontimingrepeatperiodunit = medicationrequestdosageinstructiontimingrepeat.getPeriodUnit();
		m.setMdctnRqstDsgInstrctnTmgRptPrdUnt(medicationrequestdosageinstructiontimingrepeatperiodunit.toCode());

		/******************** medicationrequestdosageinstructionroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionroute = medicationrequestdosageinstruction.getRoute();

		/******************** MdctnRqst_DsgInstrctn_Route_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionroute.hasText()) {
			m.setMdctnRqstDsgInstrctnRouteTxt(String.valueOf(medicationrequestdosageinstructionroute.getText()));
		}
		/******************** medicationrequestdosageinstructionroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestdosageinstructionroutecoding = medicationrequestdosageinstructionroute.getCodingFirstRep();

		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionroutecoding.hasVersion()) {
			m.setMdctnRqstDsgInstrctnRouteCdgVrsn(String.valueOf(medicationrequestdosageinstructionroutecoding.getVersion()));
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionroutecoding.hasDisplay()) {
			m.setMdctnRqstDsgInstrctnRouteCdgDsply(String.valueOf(medicationrequestdosageinstructionroutecoding.getDisplay()));
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionroutecoding.hasCode()) {
			m.setMdctnRqstDsgInstrctnRouteCdgCd(String.valueOf(medicationrequestdosageinstructionroutecoding.getCode()));
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionroutecoding.hasUserSelected()) {
			m.setMdctnRqstDsgInstrctnRouteCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionroutecoding.getUserSelected()));
		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionroutecoding.hasSystem()) {
			m.setMdctnRqstDsgInstrctnRouteCdgSys(String.valueOf(medicationrequestdosageinstructionroutecoding.getSystem()));
		}
		/******************** MdctnRqst_PriorPrescription ********************************************************************************/
		if(medicationrequest.hasPriorPrescription()) {
			m.setMdctnRqstPriorPrescription(String.valueOf(medicationrequest.getPriorPrescription()));
		}
		/******************** MdctnRqst_Prfrmr ********************************************************************************/
		if(medicationrequest.hasPerformer()) {
			m.setMdctnRqstPrfrmr(String.valueOf(medicationrequest.getPerformer()));
		}
		/******************** medicationrequeststatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequeststatusreason = medicationrequest.getStatusReason();

		/******************** MdctnRqst_StsRsn_Txt ********************************************************************************/
		if(medicationrequeststatusreason.hasText()) {
			m.setMdctnRqstStsRsnTxt(String.valueOf(medicationrequeststatusreason.getText()));
		}
		/******************** medicationrequeststatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequeststatusreasoncoding = medicationrequeststatusreason.getCodingFirstRep();

		/******************** MdctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(medicationrequeststatusreasoncoding.hasVersion()) {
			m.setMdctnRqstStsRsnCdgVrsn(String.valueOf(medicationrequeststatusreasoncoding.getVersion()));
		}
		/******************** MdctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(medicationrequeststatusreasoncoding.hasDisplay()) {
			m.setMdctnRqstStsRsnCdgDsply(String.valueOf(medicationrequeststatusreasoncoding.getDisplay()));
		}
		/******************** MdctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(medicationrequeststatusreasoncoding.hasCode()) {
			m.setMdctnRqstStsRsnCdgCd(String.valueOf(medicationrequeststatusreasoncoding.getCode()));
		}
		/******************** MdctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequeststatusreasoncoding.hasUserSelected()) {
			m.setMdctnRqstStsRsnCdgUsrSltd(String.valueOf(medicationrequeststatusreasoncoding.getUserSelected()));
		}
		/******************** MdctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(medicationrequeststatusreasoncoding.hasSystem()) {
			m.setMdctnRqstStsRsnCdgSys(String.valueOf(medicationrequeststatusreasoncoding.getSystem()));
		}
		/******************** medicationrequestdispenserequest ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent medicationrequestdispenserequest = medicationrequest.getDispenseRequest();

		/******************** MdctnRqst_DispnsRqst_Prfrmr ********************************************************************************/
		if(medicationrequestdispenserequest.hasPerformer()) {
			m.setMdctnRqstDispnsRqstPrfrmr(String.valueOf(medicationrequestdispenserequest.getPerformer()));
		}
		/******************** medicationrequestdispenserequestinitialfill ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent medicationrequestdispenserequestinitialfill = medicationrequestdispenserequest.getInitialFill();

		/******************** medicationrequestdispenserequestinitialfillduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestinitialfillduration = medicationrequestdispenserequestinitialfill.getDuration();

		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Vl ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasValue()) {
			m.setMdctnRqstDispnsRqstInitialFillDurationVl(String.valueOf(medicationrequestdispenserequestinitialfillduration.getValue()));
		}
		/******************** medicationrequestdispenserequestinitialfilldurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestinitialfilldurationcomparator = medicationrequestdispenserequestinitialfillduration.getComparator();
		m.setMdctnRqstDispnsRqstInitialFillDurationCmprtr(medicationrequestdispenserequestinitialfilldurationcomparator.toCode());

		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Cd ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasCode()) {
			m.setMdctnRqstDispnsRqstInitialFillDurationCd(String.valueOf(medicationrequestdispenserequestinitialfillduration.getCode()));
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Unt ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasUnit()) {
			m.setMdctnRqstDispnsRqstInitialFillDurationUnt(String.valueOf(medicationrequestdispenserequestinitialfillduration.getUnit()));
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Sys ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasSystem()) {
			m.setMdctnRqstDispnsRqstInitialFillDurationSys(String.valueOf(medicationrequestdispenserequestinitialfillduration.getSystem()));
		}
		/******************** medicationrequestdispenserequestinitialfillquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdispenserequestinitialfillquantity = medicationrequestdispenserequestinitialfill.getQuantity();

		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Vl ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasValue()) {
			m.setMdctnRqstDispnsRqstInitialFillQntyVl(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getValue()));
		}
		/******************** medicationrequestdispenserequestinitialfillquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestinitialfillquantitycomparator = medicationrequestdispenserequestinitialfillquantity.getComparator();
		m.setMdctnRqstDispnsRqstInitialFillQntyCmprtr(medicationrequestdispenserequestinitialfillquantitycomparator.toCode());

		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Cd ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasCode()) {
			m.setMdctnRqstDispnsRqstInitialFillQntyCd(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getCode()));
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Unt ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasUnit()) {
			m.setMdctnRqstDispnsRqstInitialFillQntyUnt(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getUnit()));
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Sys ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasSystem()) {
			m.setMdctnRqstDispnsRqstInitialFillQntySys(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getSystem()));
		}
		/******************** medicationrequestdispenserequestexpectedsupplyduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestexpectedsupplyduration = medicationrequestdispenserequest.getExpectedSupplyDuration();

		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Vl ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasValue()) {
			m.setMdctnRqstDispnsRqstExpectedSpplyDurationVl(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getValue()));
		}
		/******************** medicationrequestdispenserequestexpectedsupplydurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestexpectedsupplydurationcomparator = medicationrequestdispenserequestexpectedsupplyduration.getComparator();
		m.setMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr(medicationrequestdispenserequestexpectedsupplydurationcomparator.toCode());

		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Cd ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasCode()) {
			m.setMdctnRqstDispnsRqstExpectedSpplyDurationCd(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getCode()));
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Unt ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasUnit()) {
			m.setMdctnRqstDispnsRqstExpectedSpplyDurationUnt(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getUnit()));
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Sys ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasSystem()) {
			m.setMdctnRqstDispnsRqstExpectedSpplyDurationSys(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getSystem()));
		}
		/******************** MdctnRqst_DispnsRqst_NmbrOfRptsAllowed ********************************************************************************/
		if(medicationrequestdispenserequest.hasNumberOfRepeatsAllowed()) {
			m.setMdctnRqstDispnsRqstNmbrOfRptsAllowed(String.valueOf(medicationrequestdispenserequest.getNumberOfRepeatsAllowed()));
		}
		/******************** medicationrequestdispenserequestdispenseinterval ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestdispenseinterval = medicationrequestdispenserequest.getDispenseInterval();

		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Vl ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasValue()) {
			m.setMdctnRqstDispnsRqstDispnsIntervalVl(String.valueOf(medicationrequestdispenserequestdispenseinterval.getValue()));
		}
		/******************** medicationrequestdispenserequestdispenseintervalcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestdispenseintervalcomparator = medicationrequestdispenserequestdispenseinterval.getComparator();
		m.setMdctnRqstDispnsRqstDispnsIntervalCmprtr(medicationrequestdispenserequestdispenseintervalcomparator.toCode());

		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Cd ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasCode()) {
			m.setMdctnRqstDispnsRqstDispnsIntervalCd(String.valueOf(medicationrequestdispenserequestdispenseinterval.getCode()));
		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Unt ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasUnit()) {
			m.setMdctnRqstDispnsRqstDispnsIntervalUnt(String.valueOf(medicationrequestdispenserequestdispenseinterval.getUnit()));
		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Sys ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasSystem()) {
			m.setMdctnRqstDispnsRqstDispnsIntervalSys(String.valueOf(medicationrequestdispenserequestdispenseinterval.getSystem()));
		}
		/******************** medicationrequestdispenserequestvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestdispenserequestvalidityperiod = medicationrequestdispenserequest.getValidityPeriod();

		/******************** MdctnRqst_DispnsRqst_ValidityPrd_Strt ********************************************************************************/
		if(medicationrequestdispenserequestvalidityperiod.hasStart()) {
			m.setMdctnRqstDispnsRqstValidityPrdStrt(String.valueOf(medicationrequestdispenserequestvalidityperiod.getStart()));
		}
		/******************** MdctnRqst_DispnsRqst_ValidityPrd_End ********************************************************************************/
		if(medicationrequestdispenserequestvalidityperiod.hasEnd()) {
			m.setMdctnRqstDispnsRqstValidityPrdEnd(String.valueOf(medicationrequestdispenserequestvalidityperiod.getEnd()));
		}
		/******************** medicationrequestdispenserequestquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdispenserequestquantity = medicationrequestdispenserequest.getQuantity();

		/******************** MdctnRqst_DispnsRqst_Qnty_Vl ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasValue()) {
			m.setMdctnRqstDispnsRqstQntyVl(String.valueOf(medicationrequestdispenserequestquantity.getValue()));
		}
		/******************** medicationrequestdispenserequestquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestquantitycomparator = medicationrequestdispenserequestquantity.getComparator();
		m.setMdctnRqstDispnsRqstQntyCmprtr(medicationrequestdispenserequestquantitycomparator.toCode());

		/******************** MdctnRqst_DispnsRqst_Qnty_Cd ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasCode()) {
			m.setMdctnRqstDispnsRqstQntyCd(String.valueOf(medicationrequestdispenserequestquantity.getCode()));
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Unt ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasUnit()) {
			m.setMdctnRqstDispnsRqstQntyUnt(String.valueOf(medicationrequestdispenserequestquantity.getUnit()));
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Sys ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasSystem()) {
			m.setMdctnRqstDispnsRqstQntySys(String.valueOf(medicationrequestdispenserequestquantity.getSystem()));
		}
		/******************** medicationrequestsubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent medicationrequestsubstitution = medicationrequest.getSubstitution();

		/******************** medicationrequestsubstitutionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsubstitutionreason = medicationrequestsubstitution.getReason();

		/******************** MdctnRqst_Substitution_Rsn_Txt ********************************************************************************/
		if(medicationrequestsubstitutionreason.hasText()) {
			m.setMdctnRqstSubstitutionRsnTxt(String.valueOf(medicationrequestsubstitutionreason.getText()));
		}
		/******************** medicationrequestsubstitutionreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestsubstitutionreasoncoding = medicationrequestsubstitutionreason.getCodingFirstRep();

		/******************** MdctnRqst_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestsubstitutionreasoncoding.hasVersion()) {
			m.setMdctnRqstSubstitutionRsnCdgVrsn(String.valueOf(medicationrequestsubstitutionreasoncoding.getVersion()));
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(medicationrequestsubstitutionreasoncoding.hasDisplay()) {
			m.setMdctnRqstSubstitutionRsnCdgDsply(String.valueOf(medicationrequestsubstitutionreasoncoding.getDisplay()));
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(medicationrequestsubstitutionreasoncoding.hasCode()) {
			m.setMdctnRqstSubstitutionRsnCdgCd(String.valueOf(medicationrequestsubstitutionreasoncoding.getCode()));
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestsubstitutionreasoncoding.hasUserSelected()) {
			m.setMdctnRqstSubstitutionRsnCdgUsrSltd(String.valueOf(medicationrequestsubstitutionreasoncoding.getUserSelected()));
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(medicationrequestsubstitutionreasoncoding.hasSystem()) {
			m.setMdctnRqstSubstitutionRsnCdgSys(String.valueOf(medicationrequestsubstitutionreasoncoding.getSystem()));
		}
		/******************** MdctnRqst_Substitution_AllowedBooleanTyp ********************************************************************************/
		if(medicationrequestsubstitution.hasAllowedBooleanType()) {
			m.setMdctnRqstSubstitutionAllowedBooleanTyp(String.valueOf(medicationrequestsubstitution.getAllowedBooleanType()));
		}
		/******************** medicationrequestsubstitutionallowedcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsubstitutionallowedcodeableconcept = medicationrequestsubstitution.getAllowedCodeableConcept();

		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Txt ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconcept.hasText()) {
			m.setMdctnRqstSubstitutionAllowedCdbleCncptTxt(String.valueOf(medicationrequestsubstitutionallowedcodeableconcept.getText()));
		}
		/******************** medicationrequestsubstitutionallowedcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestsubstitutionallowedcodeableconceptcoding = medicationrequestsubstitutionallowedcodeableconcept.getCodingFirstRep();

		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasVersion()) {
			m.setMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasDisplay()) {
			m.setMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasCode()) {
			m.setMdctnRqstSubstitutionAllowedCdbleCncptCdgCd(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getCode()));
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasSystem()) {
			m.setMdctnRqstSubstitutionAllowedCdbleCncptCdgSys(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnRqst_Enc ********************************************************************************/
		if(medicationrequest.hasEncounter()) {
			m.setMdctnRqstEnc(String.valueOf(medicationrequest.getEncounter()));
		}
		/******************** MdctnRqst_Sbjct ********************************************************************************/
		if(medicationrequest.hasSubject()) {
			m.setMdctnRqstSbjct(String.valueOf(medicationrequest.getSubject()));
		}
		/******************** medicationrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatus medicationrequeststatus = medicationrequest.getStatus();
		m.setMdctnRqstSts(medicationrequeststatus.toCode());

		/******************** MdctnRqst_BasedOn ********************************************************************************/
		if(medicationrequest.hasBasedOn()) {
			m.setMdctnRqstBasedOn(String.valueOf(medicationrequest.getBasedOnFirstRep()));
		}
		/******************** medicationrequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationrequestnote = medicationrequest.getNoteFirstRep();

		/******************** MdctnRqst_Nt_Time ********************************************************************************/
		if(medicationrequestnote.hasTime()) {
			m.setMdctnRqstNtTime(String.valueOf(medicationrequestnote.getTime()));
		}
		/******************** MdctnRqst_Nt_Txt ********************************************************************************/
		if(medicationrequestnote.hasText()) {
			m.setMdctnRqstNtTxt(String.valueOf(medicationrequestnote.getText()));
		}
		/******************** MdctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(medicationrequestnote.hasAuthorReference()) {
			m.setMdctnRqstNtAthrRfrnc(String.valueOf(medicationrequestnote.getAuthorReference()));
		}
		/******************** MdctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationrequestnote.hasAuthorStringType()) {
			m.setMdctnRqstNtAthrStrgTyp(String.valueOf(medicationrequestnote.getAuthorStringType()));
		}
		/******************** MdctnRqst_SprtingInfo ********************************************************************************/
		if(medicationrequest.hasSupportingInformation()) {
			m.setMdctnRqstSprtingInfo(String.valueOf(medicationrequest.getSupportingInformationFirstRep()));
		}
		/******************** MdctnRqst_EvntHis ********************************************************************************/
		if(medicationrequest.hasEventHistory()) {
			m.setMdctnRqstEvntHis(String.valueOf(medicationrequest.getEventHistoryFirstRep()));
		}
		/******************** MdctnRqst_Recorder ********************************************************************************/
		if(medicationrequest.hasRecorder()) {
			m.setMdctnRqstRecorder(String.valueOf(medicationrequest.getRecorder()));
		}
		/******************** MdctnRqst_AthredOn ********************************************************************************/
		if(medicationrequest.hasAuthoredOn()) {
			m.setMdctnRqstAthredOn(String.valueOf(medicationrequest.getAuthoredOn()));
		}
		/******************** medicationrequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntent medicationrequestintent = medicationrequest.getIntent();
		m.setMdctnRqstIntent(medicationrequestintent.toCode());

		/******************** medicationrequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationrequestgroupidentifier = medicationrequest.getGroupIdentifier();

		/******************** MdctnRqst_GrpId_Vl ********************************************************************************/
		if(medicationrequestgroupidentifier.hasValue()) {
			m.setMdctnRqstGrpIdVl(String.valueOf(medicationrequestgroupidentifier.getValue()));
		}
		/******************** medicationrequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestgroupidentifiertype = medicationrequestgroupidentifier.getType();

		/******************** MdctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(medicationrequestgroupidentifiertype.hasText()) {
			m.setMdctnRqstGrpIdTypTxt(String.valueOf(medicationrequestgroupidentifiertype.getText()));
		}
		/******************** medicationrequestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestgroupidentifiertypecoding = medicationrequestgroupidentifiertype.getCodingFirstRep();

		/******************** MdctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestgroupidentifiertypecoding.hasVersion()) {
			m.setMdctnRqstGrpIdTypCdgVrsn(String.valueOf(medicationrequestgroupidentifiertypecoding.getVersion()));
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationrequestgroupidentifiertypecoding.hasDisplay()) {
			m.setMdctnRqstGrpIdTypCdgDsply(String.valueOf(medicationrequestgroupidentifiertypecoding.getDisplay()));
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(medicationrequestgroupidentifiertypecoding.hasCode()) {
			m.setMdctnRqstGrpIdTypCdgCd(String.valueOf(medicationrequestgroupidentifiertypecoding.getCode()));
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestgroupidentifiertypecoding.hasUserSelected()) {
			m.setMdctnRqstGrpIdTypCdgUsrSltd(String.valueOf(medicationrequestgroupidentifiertypecoding.getUserSelected()));
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(medicationrequestgroupidentifiertypecoding.hasSystem()) {
			m.setMdctnRqstGrpIdTypCdgSys(String.valueOf(medicationrequestgroupidentifiertypecoding.getSystem()));
		}
		/******************** medicationrequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestgroupidentifierperiod = medicationrequestgroupidentifier.getPeriod();

		/******************** MdctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(medicationrequestgroupidentifierperiod.hasStart()) {
			m.setMdctnRqstGrpIdPrdStrt(String.valueOf(medicationrequestgroupidentifierperiod.getStart()));
		}
		/******************** MdctnRqst_GrpId_Prd_End ********************************************************************************/
		if(medicationrequestgroupidentifierperiod.hasEnd()) {
			m.setMdctnRqstGrpIdPrdEnd(String.valueOf(medicationrequestgroupidentifierperiod.getEnd()));
		}
		/******************** MdctnRqst_GrpId_Assigner ********************************************************************************/
		if(medicationrequestgroupidentifier.hasAssigner()) {
			m.setMdctnRqstGrpIdAssigner(String.valueOf(medicationrequestgroupidentifier.getAssigner()));
		}
		/******************** MdctnRqst_GrpId_Sys ********************************************************************************/
		if(medicationrequestgroupidentifier.hasSystem()) {
			m.setMdctnRqstGrpIdSys(String.valueOf(medicationrequestgroupidentifier.getSystem()));
		}
		/******************** medicationrequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationrequestgroupidentifieruse = medicationrequestgroupidentifier.getUse();
		m.setMdctnRqstGrpIdUse(medicationrequestgroupidentifieruse.toCode());

		/******************** MdctnRqst_Insrnc ********************************************************************************/
		if(medicationrequest.hasInsurance()) {
			m.setMdctnRqstInsrnc(String.valueOf(medicationrequest.getInsuranceFirstRep()));
		}
		/******************** medicationrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationrequestidentifier = medicationrequest.getIdentifierFirstRep();

		/******************** MdctnRqst_Id_Vl ********************************************************************************/
		if(medicationrequestidentifier.hasValue()) {
			m.setMdctnRqstIdVl(String.valueOf(medicationrequestidentifier.getValue()));
		}
		/******************** medicationrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestidentifiertype = medicationrequestidentifier.getType();

		/******************** MdctnRqst_Id_Typ_Txt ********************************************************************************/
		if(medicationrequestidentifiertype.hasText()) {
			m.setMdctnRqstIdTypTxt(String.valueOf(medicationrequestidentifiertype.getText()));
		}
		/******************** medicationrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestidentifiertypecoding = medicationrequestidentifiertype.getCodingFirstRep();

		/******************** MdctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestidentifiertypecoding.hasVersion()) {
			m.setMdctnRqstIdTypCdgVrsn(String.valueOf(medicationrequestidentifiertypecoding.getVersion()));
		}
		/******************** MdctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationrequestidentifiertypecoding.hasDisplay()) {
			m.setMdctnRqstIdTypCdgDsply(String.valueOf(medicationrequestidentifiertypecoding.getDisplay()));
		}
		/******************** MdctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationrequestidentifiertypecoding.hasCode()) {
			m.setMdctnRqstIdTypCdgCd(String.valueOf(medicationrequestidentifiertypecoding.getCode()));
		}
		/******************** MdctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestidentifiertypecoding.hasUserSelected()) {
			m.setMdctnRqstIdTypCdgUsrSltd(String.valueOf(medicationrequestidentifiertypecoding.getUserSelected()));
		}
		/******************** MdctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationrequestidentifiertypecoding.hasSystem()) {
			m.setMdctnRqstIdTypCdgSys(String.valueOf(medicationrequestidentifiertypecoding.getSystem()));
		}
		/******************** medicationrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestidentifierperiod = medicationrequestidentifier.getPeriod();

		/******************** MdctnRqst_Id_Prd_Strt ********************************************************************************/
		if(medicationrequestidentifierperiod.hasStart()) {
			m.setMdctnRqstIdPrdStrt(String.valueOf(medicationrequestidentifierperiod.getStart()));
		}
		/******************** MdctnRqst_Id_Prd_End ********************************************************************************/
		if(medicationrequestidentifierperiod.hasEnd()) {
			m.setMdctnRqstIdPrdEnd(String.valueOf(medicationrequestidentifierperiod.getEnd()));
		}
		/******************** MdctnRqst_Id_Assigner ********************************************************************************/
		if(medicationrequestidentifier.hasAssigner()) {
			m.setMdctnRqstIdAssigner(String.valueOf(medicationrequestidentifier.getAssigner()));
		}
		/******************** MdctnRqst_Id_Sys ********************************************************************************/
		if(medicationrequestidentifier.hasSystem()) {
			m.setMdctnRqstIdSys(String.valueOf(medicationrequestidentifier.getSystem()));
		}
		/******************** medicationrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationrequestidentifieruse = medicationrequestidentifier.getUse();
		m.setMdctnRqstIdUse(medicationrequestidentifieruse.toCode());

		/******************** medicationrequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestreasoncode = medicationrequest.getReasonCodeFirstRep();

		/******************** MdctnRqst_RsnCd_Txt ********************************************************************************/
		if(medicationrequestreasoncode.hasText()) {
			m.setMdctnRqstRsnCdTxt(String.valueOf(medicationrequestreasoncode.getText()));
		}
		/******************** medicationrequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestreasoncodecoding = medicationrequestreasoncode.getCodingFirstRep();

		/******************** MdctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestreasoncodecoding.hasVersion()) {
			m.setMdctnRqstRsnCdCdgVrsn(String.valueOf(medicationrequestreasoncodecoding.getVersion()));
		}
		/******************** MdctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(medicationrequestreasoncodecoding.hasDisplay()) {
			m.setMdctnRqstRsnCdCdgDsply(String.valueOf(medicationrequestreasoncodecoding.getDisplay()));
		}
		/******************** MdctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(medicationrequestreasoncodecoding.hasCode()) {
			m.setMdctnRqstRsnCdCdgCd(String.valueOf(medicationrequestreasoncodecoding.getCode()));
		}
		/******************** MdctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestreasoncodecoding.hasUserSelected()) {
			m.setMdctnRqstRsnCdCdgUsrSltd(String.valueOf(medicationrequestreasoncodecoding.getUserSelected()));
		}
		/******************** MdctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(medicationrequestreasoncodecoding.hasSystem()) {
			m.setMdctnRqstRsnCdCdgSys(String.valueOf(medicationrequestreasoncodecoding.getSystem()));
		}
		/******************** MdctnRqst_RsnRfrnc ********************************************************************************/
		if(medicationrequest.hasReasonReference()) {
			m.setMdctnRqstRsnRfrnc(String.valueOf(medicationrequest.getReasonReferenceFirstRep()));
		}
		/******************** medicationrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestcategory = medicationrequest.getCategoryFirstRep();

		/******************** MdctnRqst_Ctgry_Txt ********************************************************************************/
		if(medicationrequestcategory.hasText()) {
			m.setMdctnRqstCtgryTxt(String.valueOf(medicationrequestcategory.getText()));
		}
		/******************** medicationrequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestcategorycoding = medicationrequestcategory.getCodingFirstRep();

		/******************** MdctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestcategorycoding.hasVersion()) {
			m.setMdctnRqstCtgryCdgVrsn(String.valueOf(medicationrequestcategorycoding.getVersion()));
		}
		/******************** MdctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationrequestcategorycoding.hasDisplay()) {
			m.setMdctnRqstCtgryCdgDsply(String.valueOf(medicationrequestcategorycoding.getDisplay()));
		}
		/******************** MdctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationrequestcategorycoding.hasCode()) {
			m.setMdctnRqstCtgryCdgCd(String.valueOf(medicationrequestcategorycoding.getCode()));
		}
		/******************** MdctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestcategorycoding.hasUserSelected()) {
			m.setMdctnRqstCtgryCdgUsrSltd(String.valueOf(medicationrequestcategorycoding.getUserSelected()));
		}
		/******************** MdctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationrequestcategorycoding.hasSystem()) {
			m.setMdctnRqstCtgryCdgSys(String.valueOf(medicationrequestcategorycoding.getSystem()));
		}
		/******************** medicationrequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestperformertype = medicationrequest.getPerformerType();

		/******************** MdctnRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(medicationrequestperformertype.hasText()) {
			m.setMdctnRqstPrfrmrTypTxt(String.valueOf(medicationrequestperformertype.getText()));
		}
		/******************** medicationrequestperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestperformertypecoding = medicationrequestperformertype.getCodingFirstRep();

		/******************** MdctnRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestperformertypecoding.hasVersion()) {
			m.setMdctnRqstPrfrmrTypCdgVrsn(String.valueOf(medicationrequestperformertypecoding.getVersion()));
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(medicationrequestperformertypecoding.hasDisplay()) {
			m.setMdctnRqstPrfrmrTypCdgDsply(String.valueOf(medicationrequestperformertypecoding.getDisplay()));
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(medicationrequestperformertypecoding.hasCode()) {
			m.setMdctnRqstPrfrmrTypCdgCd(String.valueOf(medicationrequestperformertypecoding.getCode()));
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestperformertypecoding.hasUserSelected()) {
			m.setMdctnRqstPrfrmrTypCdgUsrSltd(String.valueOf(medicationrequestperformertypecoding.getUserSelected()));
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(medicationrequestperformertypecoding.hasSystem()) {
			m.setMdctnRqstPrfrmrTypCdgSys(String.valueOf(medicationrequestperformertypecoding.getSystem()));
		}
		/******************** MdctnRqst_Rqster ********************************************************************************/
		if(medicationrequest.hasRequester()) {
			m.setMdctnRqstRqster(String.valueOf(medicationrequest.getRequester()));
		}
		/******************** MdctnRqst_DoNotPerform ********************************************************************************/
		if(medicationrequest.hasDoNotPerform()) {
			m.setMdctnRqstDoNotPerform(String.valueOf(medicationrequest.getDoNotPerform()));
		}
		/******************** medicationrequestmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestmedicationcodeableconcept = medicationrequest.getMedicationCodeableConcept();

		/******************** MdctnRqst_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationrequestmedicationcodeableconcept.hasText()) {
			m.setMdctnRqstMdctnCdbleCncptTxt(String.valueOf(medicationrequestmedicationcodeableconcept.getText()));
		}
		/******************** medicationrequestmedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationrequestmedicationcodeableconceptcoding = medicationrequestmedicationcodeableconcept.getCodingFirstRep();

		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcoding.hasVersion()) {
			m.setMdctnRqstMdctnCdbleCncptCdgVrsn(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcoding.hasDisplay()) {
			m.setMdctnRqstMdctnCdbleCncptCdgDsply(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcoding.hasCode()) {
			m.setMdctnRqstMdctnCdbleCncptCdgCd(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getCode()));
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnRqstMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcoding.hasSystem()) {
			m.setMdctnRqstMdctnCdbleCncptCdgSys(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnRqst_MdctnRfrnc ********************************************************************************/
		if(medicationrequest.hasMedicationReference()) {
			m.setMdctnRqstMdctnRfrnc(String.valueOf(medicationrequest.getMedicationReference()));
		}
		return m;
	}
}
