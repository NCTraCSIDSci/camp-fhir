package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationDispense;
public class MedicationDispenseBidirectionalConversion 
{
	public MedicationDispense MedicationDispenses(org.hl7.fhir.r4.model.MedicationDispense medicationdispense) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationDispense m = new  main.java.com.campfhir.model.MedicationDispense();

		/******************** id ********************************************************************************/
		medicationdispense.setId(m.getId());

		/******************** MdctnDispns_Lctn ********************************************************************************/
		if(medicationdispense.hasLocation()) {
			m.setMdctnDispnsLctn(String.valueOf(medicationdispense.getLocation()));
		}
		/******************** MdctnDispns_Cntxt ********************************************************************************/
		if(medicationdispense.hasContext()) {
			m.setMdctnDispnsCntxt(String.valueOf(medicationdispense.getContext()));
		}
		/******************** medicationdispensetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensetype = medicationdispense.getType();

		/******************** MdctnDispns_Typ_Txt ********************************************************************************/
		if(medicationdispensetype.hasText()) {
			m.setMdctnDispnsTypTxt(String.valueOf(medicationdispensetype.getText()));
		}
		/******************** medicationdispensetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensetypecoding = medicationdispensetype.getCodingFirstRep();

		/******************** MdctnDispns_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensetypecoding.hasVersion()) {
			m.setMdctnDispnsTypCdgVrsn(String.valueOf(medicationdispensetypecoding.getVersion()));
		}
		/******************** MdctnDispns_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispensetypecoding.hasDisplay()) {
			m.setMdctnDispnsTypCdgDsply(String.valueOf(medicationdispensetypecoding.getDisplay()));
		}
		/******************** MdctnDispns_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispensetypecoding.hasCode()) {
			m.setMdctnDispnsTypCdgCd(String.valueOf(medicationdispensetypecoding.getCode()));
		}
		/******************** MdctnDispns_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensetypecoding.hasUserSelected()) {
			m.setMdctnDispnsTypCdgUsrSltd(String.valueOf(medicationdispensetypecoding.getUserSelected()));
		}
		/******************** MdctnDispns_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispensetypecoding.hasSystem()) {
			m.setMdctnDispnsTypCdgSys(String.valueOf(medicationdispensetypecoding.getSystem()));
		}
		/******************** MdctnDispns_DetectedIssue ********************************************************************************/
		if(medicationdispense.hasDetectedIssue()) {
			m.setMdctnDispnsDetectedIssue(String.valueOf(medicationdispense.getDetectedIssueFirstRep()));
		}
		/******************** medicationdispensedosageinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationdispensedosageinstruction = medicationdispense.getDosageInstructionFirstRep();

		/******************** medicationdispensedosageinstructionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionmethod = medicationdispensedosageinstruction.getMethod();

		/******************** MdctnDispns_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionmethod.hasText()) {
			m.setMdctnDispnsDsgInstrctnMthdTxt(String.valueOf(medicationdispensedosageinstructionmethod.getText()));
		}
		/******************** medicationdispensedosageinstructionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionmethodcoding = medicationdispensedosageinstructionmethod.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnMthdCdgVrsn(String.valueOf(medicationdispensedosageinstructionmethodcoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnMthdCdgDsply(String.valueOf(medicationdispensedosageinstructionmethodcoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnMthdCdgCd(String.valueOf(medicationdispensedosageinstructionmethodcoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnMthdCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionmethodcoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnMthdCdgSys(String.valueOf(medicationdispensedosageinstructionmethodcoding.getSystem()));
		}
		/******************** medicationdispensedosageinstructionasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionasneededcodeableconcept = medicationdispensedosageinstruction.getAsNeededCodeableConcept();

		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconcept.hasText()) {
			m.setMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt(String.valueOf(medicationdispensedosageinstructionasneededcodeableconcept.getText()));
		}
		/******************** medicationdispensedosageinstructionasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionasneededcodeableconceptcoding = medicationdispensedosageinstructionasneededcodeableconcept.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnDispns_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(medicationdispensedosageinstruction.hasAsNeededBooleanType()) {
			m.setMdctnDispnsDsgInstrctnAsNdBooleanTyp(String.valueOf(medicationdispensedosageinstruction.getAsNeededBooleanType()));
		}
		/******************** MdctnDispns_DsgInstrctn_Sqnc ********************************************************************************/
		if(medicationdispensedosageinstruction.hasSequence()) {
			m.setMdctnDispnsDsgInstrctnSqnc(String.valueOf(medicationdispensedosageinstruction.getSequence()));
		}
		/******************** medicationdispensedosageinstructionsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionsite = medicationdispensedosageinstruction.getSite();

		/******************** MdctnDispns_DsgInstrctn_Site_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionsite.hasText()) {
			m.setMdctnDispnsDsgInstrctnSiteTxt(String.valueOf(medicationdispensedosageinstructionsite.getText()));
		}
		/******************** medicationdispensedosageinstructionsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionsitecoding = medicationdispensedosageinstructionsite.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionsitecoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnSiteCdgVrsn(String.valueOf(medicationdispensedosageinstructionsitecoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionsitecoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnSiteCdgDsply(String.valueOf(medicationdispensedosageinstructionsitecoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionsitecoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnSiteCdgCd(String.valueOf(medicationdispensedosageinstructionsitecoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionsitecoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnSiteCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionsitecoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionsitecoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnSiteCdgSys(String.valueOf(medicationdispensedosageinstructionsitecoding.getSystem()));
		}
		/******************** MdctnDispns_DsgInstrctn_Txt ********************************************************************************/
		if(medicationdispensedosageinstruction.hasText()) {
			m.setMdctnDispnsDsgInstrctnTxt(String.valueOf(medicationdispensedosageinstruction.getText()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperlifetime = medicationdispensedosageinstruction.getMaxDosePerLifetime();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasValue()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerLifetimeVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getValue()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperlifetimecomparator = medicationdispensedosageinstructionmaxdoseperlifetime.getComparator();
		m.setMdctnDispnsDsgInstrctnMxDosePerLifetimeCmprtr(medicationdispensedosageinstructionmaxdoseperlifetimecomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasCode()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerLifetimeCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerLifetimeSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getSystem()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationdispensedosageinstructionmaxdoseperperiod = medicationdispensedosageinstruction.getMaxDosePerPeriod();

		/******************** medicationdispensedosageinstructionmaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperperioddenominator = medicationdispensedosageinstructionmaxdoseperperiod.getDenominator();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasValue()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getValue()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator = medicationdispensedosageinstructionmaxdoseperperioddenominator.getComparator();
		m.setMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCmprtr(medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasCode()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getSystem()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperperiodnumerator = medicationdispensedosageinstructionmaxdoseperperiod.getNumerator();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasValue()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getValue()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator = medicationdispensedosageinstructionmaxdoseperperiodnumerator.getComparator();
		m.setMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCmprtr(medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasCode()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getSystem()));
		}
		/******************** medicationdispensedosageinstructionadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionadditionalinstruction = medicationdispensedosageinstruction.getAdditionalInstructionFirstRep();

		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstruction.hasText()) {
			m.setMdctnDispnsDsgInstrctnAddtnlInstrctnTxt(String.valueOf(medicationdispensedosageinstructionadditionalinstruction.getText()));
		}
		/******************** medicationdispensedosageinstructionadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionadditionalinstructioncoding = medicationdispensedosageinstructionadditionalinstruction.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationdispensedosageinstructiondoseandrate = medicationdispensedosageinstruction.getDoseAndRateFirstRep();

		/******************** medicationdispensedosageinstructiondoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructiondoseandratetype = medicationdispensedosageinstructiondoseandrate.getType();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetype.hasText()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtTypTxt(String.valueOf(medicationdispensedosageinstructiondoseandratetype.getText()));
		}
		/******************** medicationdispensedosageinstructiondoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructiondoseandratetypecoding = medicationdispensedosageinstructiondoseandratetype.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationdispensedosageinstructiondoseandraterateratio = medicationdispensedosageinstructiondoseandrate.getRateRatio();

		/******************** medicationdispensedosageinstructiondoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandraterateratiodenominator = medicationdispensedosageinstructiondoseandraterateratio.getDenominator();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator = medicationdispensedosageinstructiondoseandraterateratiodenominator.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr(medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterationumerator = medicationdispensedosageinstructiondoseandraterateratio.getNumerator();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator = medicationdispensedosageinstructiondoseandrateraterationumerator.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr(medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiondoseandratedoserange = medicationdispensedosageinstructiondoseandrate.getDoseRange();

		/******************** medicationdispensedosageinstructiondoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedoserangelow = medicationdispensedosageinstructiondoseandratedoserange.getLow();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandratedoserangelowcomparator = medicationdispensedosageinstructiondoseandratedoserangelow.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr(medicationdispensedosageinstructiondoseandratedoserangelowcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedoserangehigh = medicationdispensedosageinstructiondoseandratedoserange.getHigh();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandratedoserangehighcomparator = medicationdispensedosageinstructiondoseandratedoserangehigh.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr(medicationdispensedosageinstructiondoseandratedoserangehighcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateratequantity = medicationdispensedosageinstructiondoseandrate.getRateQuantity();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateratequantitycomparator = medicationdispensedosageinstructiondoseandrateratequantity.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr(medicationdispensedosageinstructiondoseandrateratequantitycomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtQntySys(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiondoseandrateraterange = medicationdispensedosageinstructiondoseandrate.getRateRange();

		/******************** medicationdispensedosageinstructiondoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterangelow = medicationdispensedosageinstructiondoseandrateraterange.getLow();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateraterangelowcomparator = medicationdispensedosageinstructiondoseandrateraterangelow.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr(medicationdispensedosageinstructiondoseandrateraterangelowcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterangehigh = medicationdispensedosageinstructiondoseandrateraterange.getHigh();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateraterangehighcomparator = medicationdispensedosageinstructiondoseandrateraterangehigh.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr(medicationdispensedosageinstructiondoseandrateraterangehighcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getSystem()));
		}
		/******************** medicationdispensedosageinstructiondoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedosequantity = medicationdispensedosageinstructiondoseandrate.getDoseQuantity();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasValue()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getValue()));
		}
		/******************** medicationdispensedosageinstructiondoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandratedosequantitycomparator = medicationdispensedosageinstructiondoseandratedosequantity.getComparator();
		m.setMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr(medicationdispensedosageinstructiondoseandratedosequantitycomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasCode()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getSystem()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperadministration = medicationdispensedosageinstruction.getMaxDosePerAdministration();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasValue()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getValue()));
		}
		/******************** medicationdispensedosageinstructionmaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperadministrationcomparator = medicationdispensedosageinstructionmaxdoseperadministration.getComparator();
		m.setMdctnDispnsDsgInstrctnMxDosePerAdmnstnCmprtr(medicationdispensedosageinstructionmaxdoseperadministrationcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasCode()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getSystem()));
		}
		/******************** MdctnDispns_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(medicationdispensedosageinstruction.hasPatientInstruction()) {
			m.setMdctnDispnsDsgInstrctnPntInstrctn(String.valueOf(medicationdispensedosageinstruction.getPatientInstruction()));
		}
		/******************** medicationdispensedosageinstructiontiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationdispensedosageinstructiontiming = medicationdispensedosageinstruction.getTiming();

		/******************** medicationdispensedosageinstructiontimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructiontimingcode = medicationdispensedosageinstructiontiming.getCode();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcode.hasText()) {
			m.setMdctnDispnsDsgInstrctnTmgCdTxt(String.valueOf(medicationdispensedosageinstructiontimingcode.getText()));
		}
		/******************** medicationdispensedosageinstructiontimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructiontimingcodecoding = medicationdispensedosageinstructiontimingcode.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnTmgCdCdgVrsn(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnTmgCdCdgDsply(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnTmgCdCdgCd(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnTmgCdCdgSys(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getSystem()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationdispensedosageinstructiontimingrepeat = medicationdispensedosageinstructiontiming.getRepeat();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasOffset()) {
			m.setMdctnDispnsDsgInstrctnTmgRptOff(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getOffset()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasCount()) {
			m.setMdctnDispnsDsgInstrctnTmgRptCnt(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getCount()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasFrequency()) {
			m.setMdctnDispnsDsgInstrctnTmgRptFrqncy(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getFrequency()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasPeriod()) {
			m.setMdctnDispnsDsgInstrctnTmgRptPrd(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getPeriod()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasDuration()) {
			m.setMdctnDispnsDsgInstrctnTmgRptDuration(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getDuration()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationdispensedosageinstructiontimingrepeatboundsduration = medicationdispensedosageinstructiontimingrepeat.getBoundsDuration();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasValue()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsDurationVl(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getValue()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator = medicationdispensedosageinstructiontimingrepeatboundsduration.getComparator();
		m.setMdctnDispnsDsgInstrctnTmgRptBndsDurationCmprtr(medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasCode()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsDurationCd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsDurationSys(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getSystem()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiontimingrepeatboundsrange = medicationdispensedosageinstructiontimingrepeat.getBoundsRange();

		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiontimingrepeatboundsrangelow = medicationdispensedosageinstructiontimingrepeatboundsrange.getLow();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasValue()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getValue()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator = medicationdispensedosageinstructiontimingrepeatboundsrangelow.getComparator();
		m.setMdctnDispnsDsgInstrctnTmgRptBndsRngLwCmprtr(medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasCode()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getSystem()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiontimingrepeatboundsrangehigh = medicationdispensedosageinstructiontimingrepeatboundsrange.getHigh();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasValue()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getValue()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator = medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getComparator();
		m.setMdctnDispnsDsgInstrctnTmgRptBndsRngHiCmprtr(medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator.toCode());

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasCode()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasUnit()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationdispensedosageinstructiontimingrepeatboundsperiod = medicationdispensedosageinstructiontimingrepeat.getBoundsPeriod();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsperiod.hasStart()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsperiod.getStart()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsperiod.hasEnd()) {
			m.setMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsperiod.getEnd()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasPeriodMax()) {
			m.setMdctnDispnsDsgInstrctnTmgRptPrdMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getPeriodMax()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasDurationMax()) {
			m.setMdctnDispnsDsgInstrctnTmgRptDurationMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getDurationMax()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasCountMax()) {
			m.setMdctnDispnsDsgInstrctnTmgRptCntMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getCountMax()));
		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasFrequencyMax()) {
			m.setMdctnDispnsDsgInstrctnTmgRptFrqncyMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getFrequencyMax()));
		}
		/******************** medicationdispensedosageinstructiontimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationdispensedosageinstructiontimingrepeatdurationunit = medicationdispensedosageinstructiontimingrepeat.getDurationUnit();
		m.setMdctnDispnsDsgInstrctnTmgRptDurationUnt(medicationdispensedosageinstructiontimingrepeatdurationunit.toCode());

		/******************** medicationdispensedosageinstructiontimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationdispensedosageinstructiontimingrepeatperiodunit = medicationdispensedosageinstructiontimingrepeat.getPeriodUnit();
		m.setMdctnDispnsDsgInstrctnTmgRptPrdUnt(medicationdispensedosageinstructiontimingrepeatperiodunit.toCode());

		/******************** medicationdispensedosageinstructionroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionroute = medicationdispensedosageinstruction.getRoute();

		/******************** MdctnDispns_DsgInstrctn_Route_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionroute.hasText()) {
			m.setMdctnDispnsDsgInstrctnRouteTxt(String.valueOf(medicationdispensedosageinstructionroute.getText()));
		}
		/******************** medicationdispensedosageinstructionroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensedosageinstructionroutecoding = medicationdispensedosageinstructionroute.getCodingFirstRep();

		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionroutecoding.hasVersion()) {
			m.setMdctnDispnsDsgInstrctnRouteCdgVrsn(String.valueOf(medicationdispensedosageinstructionroutecoding.getVersion()));
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionroutecoding.hasDisplay()) {
			m.setMdctnDispnsDsgInstrctnRouteCdgDsply(String.valueOf(medicationdispensedosageinstructionroutecoding.getDisplay()));
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionroutecoding.hasCode()) {
			m.setMdctnDispnsDsgInstrctnRouteCdgCd(String.valueOf(medicationdispensedosageinstructionroutecoding.getCode()));
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionroutecoding.hasUserSelected()) {
			m.setMdctnDispnsDsgInstrctnRouteCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionroutecoding.getUserSelected()));
		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionroutecoding.hasSystem()) {
			m.setMdctnDispnsDsgInstrctnRouteCdgSys(String.valueOf(medicationdispensedosageinstructionroutecoding.getSystem()));
		}
		/******************** medicationdispensestatusreasoncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensestatusreasoncodeableconcept = medicationdispense.getStatusReasonCodeableConcept();

		/******************** MdctnDispns_StsRsnCdbleCncpt_Txt ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconcept.hasText()) {
			m.setMdctnDispnsStsRsnCdbleCncptTxt(String.valueOf(medicationdispensestatusreasoncodeableconcept.getText()));
		}
		/******************** medicationdispensestatusreasoncodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensestatusreasoncodeableconceptcoding = medicationdispensestatusreasoncodeableconcept.getCodingFirstRep();

		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcoding.hasVersion()) {
			m.setMdctnDispnsStsRsnCdbleCncptCdgVrsn(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getVersion()));
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcoding.hasDisplay()) {
			m.setMdctnDispnsStsRsnCdbleCncptCdgDsply(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcoding.hasCode()) {
			m.setMdctnDispnsStsRsnCdbleCncptCdgCd(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getCode()));
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcoding.hasUserSelected()) {
			m.setMdctnDispnsStsRsnCdbleCncptCdgUsrSltd(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcoding.hasSystem()) {
			m.setMdctnDispnsStsRsnCdbleCncptCdgSys(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getSystem()));
		}
		/******************** MdctnDispns_StsRsnRfrnc ********************************************************************************/
		if(medicationdispense.hasStatusReasonReference()) {
			m.setMdctnDispnsStsRsnRfrnc(String.valueOf(medicationdispense.getStatusReasonReference()));
		}
		/******************** MdctnDispns_AthrizingPrescription ********************************************************************************/
		if(medicationdispense.hasAuthorizingPrescription()) {
			m.setMdctnDispnsAthrizingPrescription(String.valueOf(medicationdispense.getAuthorizingPrescriptionFirstRep()));
		}
		/******************** MdctnDispns_PartOf ********************************************************************************/
		if(medicationdispense.hasPartOf()) {
			m.setMdctnDispnsPartOf(String.valueOf(medicationdispense.getPartOfFirstRep()));
		}
		/******************** medicationdispensesubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseSubstitutionComponent medicationdispensesubstitution = medicationdispense.getSubstitution();

		/******************** medicationdispensesubstitutiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensesubstitutiontype = medicationdispensesubstitution.getType();

		/******************** MdctnDispns_Substitution_Typ_Txt ********************************************************************************/
		if(medicationdispensesubstitutiontype.hasText()) {
			m.setMdctnDispnsSubstitutionTypTxt(String.valueOf(medicationdispensesubstitutiontype.getText()));
		}
		/******************** medicationdispensesubstitutiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensesubstitutiontypecoding = medicationdispensesubstitutiontype.getCodingFirstRep();

		/******************** MdctnDispns_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensesubstitutiontypecoding.hasVersion()) {
			m.setMdctnDispnsSubstitutionTypCdgVrsn(String.valueOf(medicationdispensesubstitutiontypecoding.getVersion()));
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispensesubstitutiontypecoding.hasDisplay()) {
			m.setMdctnDispnsSubstitutionTypCdgDsply(String.valueOf(medicationdispensesubstitutiontypecoding.getDisplay()));
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispensesubstitutiontypecoding.hasCode()) {
			m.setMdctnDispnsSubstitutionTypCdgCd(String.valueOf(medicationdispensesubstitutiontypecoding.getCode()));
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensesubstitutiontypecoding.hasUserSelected()) {
			m.setMdctnDispnsSubstitutionTypCdgUsrSltd(String.valueOf(medicationdispensesubstitutiontypecoding.getUserSelected()));
		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispensesubstitutiontypecoding.hasSystem()) {
			m.setMdctnDispnsSubstitutionTypCdgSys(String.valueOf(medicationdispensesubstitutiontypecoding.getSystem()));
		}
		/******************** medicationdispensesubstitutionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensesubstitutionreason = medicationdispensesubstitution.getReasonFirstRep();

		/******************** MdctnDispns_Substitution_Rsn_Txt ********************************************************************************/
		if(medicationdispensesubstitutionreason.hasText()) {
			m.setMdctnDispnsSubstitutionRsnTxt(String.valueOf(medicationdispensesubstitutionreason.getText()));
		}
		/******************** medicationdispensesubstitutionreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensesubstitutionreasoncoding = medicationdispensesubstitutionreason.getCodingFirstRep();

		/******************** MdctnDispns_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensesubstitutionreasoncoding.hasVersion()) {
			m.setMdctnDispnsSubstitutionRsnCdgVrsn(String.valueOf(medicationdispensesubstitutionreasoncoding.getVersion()));
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(medicationdispensesubstitutionreasoncoding.hasDisplay()) {
			m.setMdctnDispnsSubstitutionRsnCdgDsply(String.valueOf(medicationdispensesubstitutionreasoncoding.getDisplay()));
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(medicationdispensesubstitutionreasoncoding.hasCode()) {
			m.setMdctnDispnsSubstitutionRsnCdgCd(String.valueOf(medicationdispensesubstitutionreasoncoding.getCode()));
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensesubstitutionreasoncoding.hasUserSelected()) {
			m.setMdctnDispnsSubstitutionRsnCdgUsrSltd(String.valueOf(medicationdispensesubstitutionreasoncoding.getUserSelected()));
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(medicationdispensesubstitutionreasoncoding.hasSystem()) {
			m.setMdctnDispnsSubstitutionRsnCdgSys(String.valueOf(medicationdispensesubstitutionreasoncoding.getSystem()));
		}
		/******************** MdctnDispns_Substitution_WasSubstituted ********************************************************************************/
		if(medicationdispensesubstitution.hasWasSubstituted()) {
			m.setMdctnDispnsSubstitutionWasSubstituted(String.valueOf(medicationdispensesubstitution.getWasSubstituted()));
		}
		/******************** MdctnDispns_Substitution_ResponsibleParty ********************************************************************************/
		if(medicationdispensesubstitution.hasResponsibleParty()) {
			m.setMdctnDispnsSubstitutionResponsibleParty(String.valueOf(medicationdispensesubstitution.getResponsiblePartyFirstRep()));
		}
		/******************** MdctnDispns_Sbjct ********************************************************************************/
		if(medicationdispense.hasSubject()) {
			m.setMdctnDispnsSbjct(String.valueOf(medicationdispense.getSubject()));
		}
		/******************** medicationdispensestatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseStatus medicationdispensestatus = medicationdispense.getStatus();
		m.setMdctnDispnsSts(medicationdispensestatus.toCode());

		/******************** medicationdispensenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationdispensenote = medicationdispense.getNoteFirstRep();

		/******************** MdctnDispns_Nt_Time ********************************************************************************/
		if(medicationdispensenote.hasTime()) {
			m.setMdctnDispnsNtTime(String.valueOf(medicationdispensenote.getTime()));
		}
		/******************** MdctnDispns_Nt_Txt ********************************************************************************/
		if(medicationdispensenote.hasText()) {
			m.setMdctnDispnsNtTxt(String.valueOf(medicationdispensenote.getText()));
		}
		/******************** MdctnDispns_Nt_AthrRfrnc ********************************************************************************/
		if(medicationdispensenote.hasAuthorReference()) {
			m.setMdctnDispnsNtAthrRfrnc(String.valueOf(medicationdispensenote.getAuthorReference()));
		}
		/******************** MdctnDispns_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationdispensenote.hasAuthorStringType()) {
			m.setMdctnDispnsNtAthrStrgTyp(String.valueOf(medicationdispensenote.getAuthorStringType()));
		}
		/******************** MdctnDispns_WhenPrepared ********************************************************************************/
		if(medicationdispense.hasWhenPrepared()) {
			m.setMdctnDispnsWhenPrepared(String.valueOf(medicationdispense.getWhenPrepared()));
		}
		/******************** MdctnDispns_WhenHandedOver ********************************************************************************/
		if(medicationdispense.hasWhenHandedOver()) {
			m.setMdctnDispnsWhenHandedOver(String.valueOf(medicationdispense.getWhenHandedOver()));
		}
		/******************** medicationdispensedayssupply ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedayssupply = medicationdispense.getDaysSupply();

		/******************** MdctnDispns_DaysSpply_Vl ********************************************************************************/
		if(medicationdispensedayssupply.hasValue()) {
			m.setMdctnDispnsDaysSpplyVl(String.valueOf(medicationdispensedayssupply.getValue()));
		}
		/******************** medicationdispensedayssupplycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedayssupplycomparator = medicationdispensedayssupply.getComparator();
		m.setMdctnDispnsDaysSpplyCmprtr(medicationdispensedayssupplycomparator.toCode());

		/******************** MdctnDispns_DaysSpply_Cd ********************************************************************************/
		if(medicationdispensedayssupply.hasCode()) {
			m.setMdctnDispnsDaysSpplyCd(String.valueOf(medicationdispensedayssupply.getCode()));
		}
		/******************** MdctnDispns_DaysSpply_Unt ********************************************************************************/
		if(medicationdispensedayssupply.hasUnit()) {
			m.setMdctnDispnsDaysSpplyUnt(String.valueOf(medicationdispensedayssupply.getUnit()));
		}
		/******************** MdctnDispns_DaysSpply_Sys ********************************************************************************/
		if(medicationdispensedayssupply.hasSystem()) {
			m.setMdctnDispnsDaysSpplySys(String.valueOf(medicationdispensedayssupply.getSystem()));
		}
		/******************** medicationdispensequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensequantity = medicationdispense.getQuantity();

		/******************** MdctnDispns_Qnty_Vl ********************************************************************************/
		if(medicationdispensequantity.hasValue()) {
			m.setMdctnDispnsQntyVl(String.valueOf(medicationdispensequantity.getValue()));
		}
		/******************** medicationdispensequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensequantitycomparator = medicationdispensequantity.getComparator();
		m.setMdctnDispnsQntyCmprtr(medicationdispensequantitycomparator.toCode());

		/******************** MdctnDispns_Qnty_Cd ********************************************************************************/
		if(medicationdispensequantity.hasCode()) {
			m.setMdctnDispnsQntyCd(String.valueOf(medicationdispensequantity.getCode()));
		}
		/******************** MdctnDispns_Qnty_Unt ********************************************************************************/
		if(medicationdispensequantity.hasUnit()) {
			m.setMdctnDispnsQntyUnt(String.valueOf(medicationdispensequantity.getUnit()));
		}
		/******************** MdctnDispns_Qnty_Sys ********************************************************************************/
		if(medicationdispensequantity.hasSystem()) {
			m.setMdctnDispnsQntySys(String.valueOf(medicationdispensequantity.getSystem()));
		}
		/******************** MdctnDispns_Destination ********************************************************************************/
		if(medicationdispense.hasDestination()) {
			m.setMdctnDispnsDestination(String.valueOf(medicationdispense.getDestination()));
		}
		/******************** MdctnDispns_SprtingInfo ********************************************************************************/
		if(medicationdispense.hasSupportingInformation()) {
			m.setMdctnDispnsSprtingInfo(String.valueOf(medicationdispense.getSupportingInformationFirstRep()));
		}
		/******************** MdctnDispns_Receiver ********************************************************************************/
		if(medicationdispense.hasReceiver()) {
			m.setMdctnDispnsReceiver(String.valueOf(medicationdispense.getReceiverFirstRep()));
		}
		/******************** MdctnDispns_EvntHis ********************************************************************************/
		if(medicationdispense.hasEventHistory()) {
			m.setMdctnDispnsEvntHis(String.valueOf(medicationdispense.getEventHistoryFirstRep()));
		}
		/******************** medicationdispensecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensecategory = medicationdispense.getCategory();

		/******************** MdctnDispns_Ctgry_Txt ********************************************************************************/
		if(medicationdispensecategory.hasText()) {
			m.setMdctnDispnsCtgryTxt(String.valueOf(medicationdispensecategory.getText()));
		}
		/******************** medicationdispensecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensecategorycoding = medicationdispensecategory.getCodingFirstRep();

		/******************** MdctnDispns_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensecategorycoding.hasVersion()) {
			m.setMdctnDispnsCtgryCdgVrsn(String.valueOf(medicationdispensecategorycoding.getVersion()));
		}
		/******************** MdctnDispns_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationdispensecategorycoding.hasDisplay()) {
			m.setMdctnDispnsCtgryCdgDsply(String.valueOf(medicationdispensecategorycoding.getDisplay()));
		}
		/******************** MdctnDispns_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationdispensecategorycoding.hasCode()) {
			m.setMdctnDispnsCtgryCdgCd(String.valueOf(medicationdispensecategorycoding.getCode()));
		}
		/******************** MdctnDispns_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensecategorycoding.hasUserSelected()) {
			m.setMdctnDispnsCtgryCdgUsrSltd(String.valueOf(medicationdispensecategorycoding.getUserSelected()));
		}
		/******************** MdctnDispns_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationdispensecategorycoding.hasSystem()) {
			m.setMdctnDispnsCtgryCdgSys(String.valueOf(medicationdispensecategorycoding.getSystem()));
		}
		/******************** medicationdispenseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationdispenseidentifier = medicationdispense.getIdentifierFirstRep();

		/******************** MdctnDispns_Id_Vl ********************************************************************************/
		if(medicationdispenseidentifier.hasValue()) {
			m.setMdctnDispnsIdVl(String.valueOf(medicationdispenseidentifier.getValue()));
		}
		/******************** medicationdispenseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispenseidentifiertype = medicationdispenseidentifier.getType();

		/******************** MdctnDispns_Id_Typ_Txt ********************************************************************************/
		if(medicationdispenseidentifiertype.hasText()) {
			m.setMdctnDispnsIdTypTxt(String.valueOf(medicationdispenseidentifiertype.getText()));
		}
		/******************** medicationdispenseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispenseidentifiertypecoding = medicationdispenseidentifiertype.getCodingFirstRep();

		/******************** MdctnDispns_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispenseidentifiertypecoding.hasVersion()) {
			m.setMdctnDispnsIdTypCdgVrsn(String.valueOf(medicationdispenseidentifiertypecoding.getVersion()));
		}
		/******************** MdctnDispns_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispenseidentifiertypecoding.hasDisplay()) {
			m.setMdctnDispnsIdTypCdgDsply(String.valueOf(medicationdispenseidentifiertypecoding.getDisplay()));
		}
		/******************** MdctnDispns_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispenseidentifiertypecoding.hasCode()) {
			m.setMdctnDispnsIdTypCdgCd(String.valueOf(medicationdispenseidentifiertypecoding.getCode()));
		}
		/******************** MdctnDispns_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispenseidentifiertypecoding.hasUserSelected()) {
			m.setMdctnDispnsIdTypCdgUsrSltd(String.valueOf(medicationdispenseidentifiertypecoding.getUserSelected()));
		}
		/******************** MdctnDispns_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispenseidentifiertypecoding.hasSystem()) {
			m.setMdctnDispnsIdTypCdgSys(String.valueOf(medicationdispenseidentifiertypecoding.getSystem()));
		}
		/******************** medicationdispenseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationdispenseidentifierperiod = medicationdispenseidentifier.getPeriod();

		/******************** MdctnDispns_Id_Prd_Strt ********************************************************************************/
		if(medicationdispenseidentifierperiod.hasStart()) {
			m.setMdctnDispnsIdPrdStrt(String.valueOf(medicationdispenseidentifierperiod.getStart()));
		}
		/******************** MdctnDispns_Id_Prd_End ********************************************************************************/
		if(medicationdispenseidentifierperiod.hasEnd()) {
			m.setMdctnDispnsIdPrdEnd(String.valueOf(medicationdispenseidentifierperiod.getEnd()));
		}
		/******************** MdctnDispns_Id_Assigner ********************************************************************************/
		if(medicationdispenseidentifier.hasAssigner()) {
			m.setMdctnDispnsIdAssigner(String.valueOf(medicationdispenseidentifier.getAssigner()));
		}
		/******************** MdctnDispns_Id_Sys ********************************************************************************/
		if(medicationdispenseidentifier.hasSystem()) {
			m.setMdctnDispnsIdSys(String.valueOf(medicationdispenseidentifier.getSystem()));
		}
		/******************** medicationdispenseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationdispenseidentifieruse = medicationdispenseidentifier.getUse();
		m.setMdctnDispnsIdUse(medicationdispenseidentifieruse.toCode());

		/******************** medicationdispenseperformer ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispensePerformerComponent medicationdispenseperformer = medicationdispense.getPerformerFirstRep();

		/******************** medicationdispenseperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispenseperformerfunction = medicationdispenseperformer.getFunction();

		/******************** MdctnDispns_Prfrmr_Function_Txt ********************************************************************************/
		if(medicationdispenseperformerfunction.hasText()) {
			m.setMdctnDispnsPrfrmrFunctionTxt(String.valueOf(medicationdispenseperformerfunction.getText()));
		}
		/******************** medicationdispenseperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispenseperformerfunctioncoding = medicationdispenseperformerfunction.getCodingFirstRep();

		/******************** MdctnDispns_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(medicationdispenseperformerfunctioncoding.hasVersion()) {
			m.setMdctnDispnsPrfrmrFunctionCdgVrsn(String.valueOf(medicationdispenseperformerfunctioncoding.getVersion()));
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(medicationdispenseperformerfunctioncoding.hasDisplay()) {
			m.setMdctnDispnsPrfrmrFunctionCdgDsply(String.valueOf(medicationdispenseperformerfunctioncoding.getDisplay()));
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(medicationdispenseperformerfunctioncoding.hasCode()) {
			m.setMdctnDispnsPrfrmrFunctionCdgCd(String.valueOf(medicationdispenseperformerfunctioncoding.getCode()));
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispenseperformerfunctioncoding.hasUserSelected()) {
			m.setMdctnDispnsPrfrmrFunctionCdgUsrSltd(String.valueOf(medicationdispenseperformerfunctioncoding.getUserSelected()));
		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(medicationdispenseperformerfunctioncoding.hasSystem()) {
			m.setMdctnDispnsPrfrmrFunctionCdgSys(String.valueOf(medicationdispenseperformerfunctioncoding.getSystem()));
		}
		/******************** MdctnDispns_Prfrmr_Actor ********************************************************************************/
		if(medicationdispenseperformer.hasActor()) {
			m.setMdctnDispnsPrfrmrActor(String.valueOf(medicationdispenseperformer.getActor()));
		}
		/******************** medicationdispensemedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensemedicationcodeableconcept = medicationdispense.getMedicationCodeableConcept();

		/******************** MdctnDispns_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationdispensemedicationcodeableconcept.hasText()) {
			m.setMdctnDispnsMdctnCdbleCncptTxt(String.valueOf(medicationdispensemedicationcodeableconcept.getText()));
		}
		/******************** medicationdispensemedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationdispensemedicationcodeableconceptcoding = medicationdispensemedicationcodeableconcept.getCodingFirstRep();

		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcoding.hasVersion()) {
			m.setMdctnDispnsMdctnCdbleCncptCdgVrsn(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcoding.hasDisplay()) {
			m.setMdctnDispnsMdctnCdbleCncptCdgDsply(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcoding.hasCode()) {
			m.setMdctnDispnsMdctnCdbleCncptCdgCd(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getCode()));
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnDispnsMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcoding.hasSystem()) {
			m.setMdctnDispnsMdctnCdbleCncptCdgSys(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnDispns_MdctnRfrnc ********************************************************************************/
		if(medicationdispense.hasMedicationReference()) {
			m.setMdctnDispnsMdctnRfrnc(String.valueOf(medicationdispense.getMedicationReference()));
		}
		return m;
	}
}
