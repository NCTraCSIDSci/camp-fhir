package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationStatement;
public class MedicationStatementBidirectionalConversion 
{
	public MedicationStatement MedicationStatements(org.hl7.fhir.r4.model.MedicationStatement medicationstatement) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationStatement m = new  main.java.com.campfhir.model.MedicationStatement();

		/******************** id ********************************************************************************/
		medicationstatement.setId(m.getId());

		/******************** MdctnStmnt_Cntxt ********************************************************************************/
		if(medicationstatement.hasContext()) {
			m.setMdctnStmntCntxt(String.valueOf(medicationstatement.getContext()));
		}
		/******************** MdctnStmnt_PartOf ********************************************************************************/
		if(medicationstatement.hasPartOf()) {
			m.setMdctnStmntPartOf(String.valueOf(medicationstatement.getPartOfFirstRep()));
		}
		/******************** MdctnStmnt_Sbjct ********************************************************************************/
		if(medicationstatement.hasSubject()) {
			m.setMdctnStmntSbjct(String.valueOf(medicationstatement.getSubject()));
		}
		/******************** medicationstatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus medicationstatementstatus = medicationstatement.getStatus();
		m.setMdctnStmntSts(medicationstatementstatus.toCode());

		/******************** MdctnStmnt_BasedOn ********************************************************************************/
		if(medicationstatement.hasBasedOn()) {
			m.setMdctnStmntBasedOn(String.valueOf(medicationstatement.getBasedOnFirstRep()));
		}
		/******************** medicationstatementnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationstatementnote = medicationstatement.getNoteFirstRep();

		/******************** MdctnStmnt_Nt_Time ********************************************************************************/
		if(medicationstatementnote.hasTime()) {
			m.setMdctnStmntNtTime(String.valueOf(medicationstatementnote.getTime()));
		}
		/******************** MdctnStmnt_Nt_Txt ********************************************************************************/
		if(medicationstatementnote.hasText()) {
			m.setMdctnStmntNtTxt(String.valueOf(medicationstatementnote.getText()));
		}
		/******************** MdctnStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(medicationstatementnote.hasAuthorReference()) {
			m.setMdctnStmntNtAthrRfrnc(String.valueOf(medicationstatementnote.getAuthorReference()));
		}
		/******************** MdctnStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationstatementnote.hasAuthorStringType()) {
			m.setMdctnStmntNtAthrStrgTyp(String.valueOf(medicationstatementnote.getAuthorStringType()));
		}
		/******************** medicationstatementeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementeffectiveperiod = medicationstatement.getEffectivePeriod();

		/******************** MdctnStmnt_EfctivePrd_Strt ********************************************************************************/
		if(medicationstatementeffectiveperiod.hasStart()) {
			m.setMdctnStmntEfctivePrdStrt(String.valueOf(medicationstatementeffectiveperiod.getStart()));
		}
		/******************** MdctnStmnt_EfctivePrd_End ********************************************************************************/
		if(medicationstatementeffectiveperiod.hasEnd()) {
			m.setMdctnStmntEfctivePrdEnd(String.valueOf(medicationstatementeffectiveperiod.getEnd()));
		}
		/******************** medicationstatementdosage ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationstatementdosage = medicationstatement.getDosageFirstRep();

		/******************** medicationstatementdosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagemethod = medicationstatementdosage.getMethod();

		/******************** MdctnStmnt_Dsg_Mthd_Txt ********************************************************************************/
		if(medicationstatementdosagemethod.hasText()) {
			m.setMdctnStmntDsgMthdTxt(String.valueOf(medicationstatementdosagemethod.getText()));
		}
		/******************** medicationstatementdosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagemethodcoding = medicationstatementdosagemethod.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagemethodcoding.hasVersion()) {
			m.setMdctnStmntDsgMthdCdgVrsn(String.valueOf(medicationstatementdosagemethodcoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagemethodcoding.hasDisplay()) {
			m.setMdctnStmntDsgMthdCdgDsply(String.valueOf(medicationstatementdosagemethodcoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagemethodcoding.hasCode()) {
			m.setMdctnStmntDsgMthdCdgCd(String.valueOf(medicationstatementdosagemethodcoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagemethodcoding.hasUserSelected()) {
			m.setMdctnStmntDsgMthdCdgUsrSltd(String.valueOf(medicationstatementdosagemethodcoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagemethodcoding.hasSystem()) {
			m.setMdctnStmntDsgMthdCdgSys(String.valueOf(medicationstatementdosagemethodcoding.getSystem()));
		}
		/******************** medicationstatementdosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageasneededcodeableconcept = medicationstatementdosage.getAsNeededCodeableConcept();

		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconcept.hasText()) {
			m.setMdctnStmntDsgAsNdCdbleCncptTxt(String.valueOf(medicationstatementdosageasneededcodeableconcept.getText()));
		}
		/******************** medicationstatementdosageasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosageasneededcodeableconceptcoding = medicationstatementdosageasneededcodeableconcept.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcoding.hasVersion()) {
			m.setMdctnStmntDsgAsNdCdbleCncptCdgVrsn(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcoding.hasDisplay()) {
			m.setMdctnStmntDsgAsNdCdbleCncptCdgDsply(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcoding.hasCode()) {
			m.setMdctnStmntDsgAsNdCdbleCncptCdgCd(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcoding.hasSystem()) {
			m.setMdctnStmntDsgAsNdCdbleCncptCdgSys(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnStmnt_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(medicationstatementdosage.hasAsNeededBooleanType()) {
			m.setMdctnStmntDsgAsNdBooleanTyp(String.valueOf(medicationstatementdosage.getAsNeededBooleanType()));
		}
		/******************** MdctnStmnt_Dsg_Sqnc ********************************************************************************/
		if(medicationstatementdosage.hasSequence()) {
			m.setMdctnStmntDsgSqnc(String.valueOf(medicationstatementdosage.getSequence()));
		}
		/******************** medicationstatementdosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagesite = medicationstatementdosage.getSite();

		/******************** MdctnStmnt_Dsg_Site_Txt ********************************************************************************/
		if(medicationstatementdosagesite.hasText()) {
			m.setMdctnStmntDsgSiteTxt(String.valueOf(medicationstatementdosagesite.getText()));
		}
		/******************** medicationstatementdosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagesitecoding = medicationstatementdosagesite.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagesitecoding.hasVersion()) {
			m.setMdctnStmntDsgSiteCdgVrsn(String.valueOf(medicationstatementdosagesitecoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagesitecoding.hasDisplay()) {
			m.setMdctnStmntDsgSiteCdgDsply(String.valueOf(medicationstatementdosagesitecoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagesitecoding.hasCode()) {
			m.setMdctnStmntDsgSiteCdgCd(String.valueOf(medicationstatementdosagesitecoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagesitecoding.hasUserSelected()) {
			m.setMdctnStmntDsgSiteCdgUsrSltd(String.valueOf(medicationstatementdosagesitecoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagesitecoding.hasSystem()) {
			m.setMdctnStmntDsgSiteCdgSys(String.valueOf(medicationstatementdosagesitecoding.getSystem()));
		}
		/******************** MdctnStmnt_Dsg_Txt ********************************************************************************/
		if(medicationstatementdosage.hasText()) {
			m.setMdctnStmntDsgTxt(String.valueOf(medicationstatementdosage.getText()));
		}
		/******************** medicationstatementdosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperlifetime = medicationstatementdosage.getMaxDosePerLifetime();

		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasValue()) {
			m.setMdctnStmntDsgMxDosePerLifetimeVl(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getValue()));
		}
		/******************** medicationstatementdosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperlifetimecomparator = medicationstatementdosagemaxdoseperlifetime.getComparator();
		m.setMdctnStmntDsgMxDosePerLifetimeCmprtr(medicationstatementdosagemaxdoseperlifetimecomparator.toCode());

		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasCode()) {
			m.setMdctnStmntDsgMxDosePerLifetimeCd(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getCode()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasUnit()) {
			m.setMdctnStmntDsgMxDosePerLifetimeUnt(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasSystem()) {
			m.setMdctnStmntDsgMxDosePerLifetimeSys(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getSystem()));
		}
		/******************** medicationstatementdosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationstatementdosagemaxdoseperperiod = medicationstatementdosage.getMaxDosePerPeriod();

		/******************** medicationstatementdosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperperioddenominator = medicationstatementdosagemaxdoseperperiod.getDenominator();

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasValue()) {
			m.setMdctnStmntDsgMxDosePerPrdDnmntrVl(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getValue()));
		}
		/******************** medicationstatementdosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperperioddenominatorcomparator = medicationstatementdosagemaxdoseperperioddenominator.getComparator();
		m.setMdctnStmntDsgMxDosePerPrdDnmntrCmprtr(medicationstatementdosagemaxdoseperperioddenominatorcomparator.toCode());

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasCode()) {
			m.setMdctnStmntDsgMxDosePerPrdDnmntrCd(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getCode()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasUnit()) {
			m.setMdctnStmntDsgMxDosePerPrdDnmntrUnt(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasSystem()) {
			m.setMdctnStmntDsgMxDosePerPrdDnmntrSys(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getSystem()));
		}
		/******************** medicationstatementdosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperperiodnumerator = medicationstatementdosagemaxdoseperperiod.getNumerator();

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasValue()) {
			m.setMdctnStmntDsgMxDosePerPrdNmrtrVl(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getValue()));
		}
		/******************** medicationstatementdosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperperiodnumeratorcomparator = medicationstatementdosagemaxdoseperperiodnumerator.getComparator();
		m.setMdctnStmntDsgMxDosePerPrdNmrtrCmprtr(medicationstatementdosagemaxdoseperperiodnumeratorcomparator.toCode());

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasCode()) {
			m.setMdctnStmntDsgMxDosePerPrdNmrtrCd(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getCode()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasUnit()) {
			m.setMdctnStmntDsgMxDosePerPrdNmrtrUnt(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasSystem()) {
			m.setMdctnStmntDsgMxDosePerPrdNmrtrSys(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getSystem()));
		}
		/******************** medicationstatementdosageadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageadditionalinstruction = medicationstatementdosage.getAdditionalInstructionFirstRep();

		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationstatementdosageadditionalinstruction.hasText()) {
			m.setMdctnStmntDsgAddtnlInstrctnTxt(String.valueOf(medicationstatementdosageadditionalinstruction.getText()));
		}
		/******************** medicationstatementdosageadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosageadditionalinstructioncoding = medicationstatementdosageadditionalinstruction.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncoding.hasVersion()) {
			m.setMdctnStmntDsgAddtnlInstrctnCdgVrsn(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncoding.hasDisplay()) {
			m.setMdctnStmntDsgAddtnlInstrctnCdgDsply(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncoding.hasCode()) {
			m.setMdctnStmntDsgAddtnlInstrctnCdgCd(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncoding.hasUserSelected()) {
			m.setMdctnStmntDsgAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncoding.hasSystem()) {
			m.setMdctnStmntDsgAddtnlInstrctnCdgSys(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getSystem()));
		}
		/******************** medicationstatementdosagedoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationstatementdosagedoseandrate = medicationstatementdosage.getDoseAndRateFirstRep();

		/******************** medicationstatementdosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagedoseandratetype = medicationstatementdosagedoseandrate.getType();

		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationstatementdosagedoseandratetype.hasText()) {
			m.setMdctnStmntDsgDoseAndRtTypTxt(String.valueOf(medicationstatementdosagedoseandratetype.getText()));
		}
		/******************** medicationstatementdosagedoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagedoseandratetypecoding = medicationstatementdosagedoseandratetype.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecoding.hasVersion()) {
			m.setMdctnStmntDsgDoseAndRtTypCdgVrsn(String.valueOf(medicationstatementdosagedoseandratetypecoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecoding.hasDisplay()) {
			m.setMdctnStmntDsgDoseAndRtTypCdgDsply(String.valueOf(medicationstatementdosagedoseandratetypecoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecoding.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtTypCdgCd(String.valueOf(medicationstatementdosagedoseandratetypecoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecoding.hasUserSelected()) {
			m.setMdctnStmntDsgDoseAndRtTypCdgUsrSltd(String.valueOf(medicationstatementdosagedoseandratetypecoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecoding.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtTypCdgSys(String.valueOf(medicationstatementdosagedoseandratetypecoding.getSystem()));
		}
		/******************** medicationstatementdosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationstatementdosagedoseandraterateratio = medicationstatementdosagedoseandrate.getRateRatio();

		/******************** medicationstatementdosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandraterateratiodenominator = medicationstatementdosagedoseandraterateratio.getDenominator();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandraterateratiodenominator.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getValue()));
		}
		/******************** medicationstatementdosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandraterateratiodenominatorcomparator = medicationstatementdosagedoseandraterateratiodenominator.getComparator();
		m.setMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr(medicationstatementdosagedoseandraterateratiodenominatorcomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandraterateratiodenominator.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandraterateratiodenominator.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandraterateratiodenominator.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getSystem()));
		}
		/******************** medicationstatementdosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterationumerator = medicationstatementdosagedoseandraterateratio.getNumerator();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterationumerator.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getValue()));
		}
		/******************** medicationstatementdosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateraterationumeratorcomparator = medicationstatementdosagedoseandrateraterationumerator.getComparator();
		m.setMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr(medicationstatementdosagedoseandrateraterationumeratorcomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterationumerator.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterationumerator.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterationumerator.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getSystem()));
		}
		/******************** medicationstatementdosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagedoseandratedoserange = medicationstatementdosagedoseandrate.getDoseRange();

		/******************** medicationstatementdosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedoserangelow = medicationstatementdosagedoseandratedoserange.getLow();

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangelow.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngLwVl(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getValue()));
		}
		/******************** medicationstatementdosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandratedoserangelowcomparator = medicationstatementdosagedoseandratedoserangelow.getComparator();
		m.setMdctnStmntDsgDoseAndRtDoseRngLwCmprtr(medicationstatementdosagedoseandratedoserangelowcomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangelow.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngLwCd(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangelow.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngLwUnt(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangelow.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngLwSys(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getSystem()));
		}
		/******************** medicationstatementdosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedoserangehigh = medicationstatementdosagedoseandratedoserange.getHigh();

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangehigh.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngHiVl(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getValue()));
		}
		/******************** medicationstatementdosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandratedoserangehighcomparator = medicationstatementdosagedoseandratedoserangehigh.getComparator();
		m.setMdctnStmntDsgDoseAndRtDoseRngHiCmprtr(medicationstatementdosagedoseandratedoserangehighcomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangehigh.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngHiCd(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangehigh.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngHiUnt(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratedoserangehigh.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtDoseRngHiSys(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getSystem()));
		}
		/******************** medicationstatementdosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateratequantity = medicationstatementdosagedoseandrate.getRateQuantity();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandrateratequantity.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtRtQntyVl(String.valueOf(medicationstatementdosagedoseandrateratequantity.getValue()));
		}
		/******************** medicationstatementdosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateratequantitycomparator = medicationstatementdosagedoseandrateratequantity.getComparator();
		m.setMdctnStmntDsgDoseAndRtRtQntyCmprtr(medicationstatementdosagedoseandrateratequantitycomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandrateratequantity.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtRtQntyCd(String.valueOf(medicationstatementdosagedoseandrateratequantity.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandrateratequantity.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtRtQntyUnt(String.valueOf(medicationstatementdosagedoseandrateratequantity.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandrateratequantity.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtRtQntySys(String.valueOf(medicationstatementdosagedoseandrateratequantity.getSystem()));
		}
		/******************** medicationstatementdosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagedoseandrateraterange = medicationstatementdosagedoseandrate.getRateRange();

		/******************** medicationstatementdosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterangelow = medicationstatementdosagedoseandrateraterange.getLow();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangelow.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtRtRngLwVl(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getValue()));
		}
		/******************** medicationstatementdosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateraterangelowcomparator = medicationstatementdosagedoseandrateraterangelow.getComparator();
		m.setMdctnStmntDsgDoseAndRtRtRngLwCmprtr(medicationstatementdosagedoseandrateraterangelowcomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangelow.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtRtRngLwCd(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangelow.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtRtRngLwUnt(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangelow.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtRtRngLwSys(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getSystem()));
		}
		/******************** medicationstatementdosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterangehigh = medicationstatementdosagedoseandrateraterange.getHigh();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangehigh.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtRtRngHiVl(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getValue()));
		}
		/******************** medicationstatementdosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateraterangehighcomparator = medicationstatementdosagedoseandrateraterangehigh.getComparator();
		m.setMdctnStmntDsgDoseAndRtRtRngHiCmprtr(medicationstatementdosagedoseandrateraterangehighcomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangehigh.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtRtRngHiCd(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangehigh.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtRtRngHiUnt(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandrateraterangehigh.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtRtRngHiSys(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getSystem()));
		}
		/******************** medicationstatementdosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedosequantity = medicationstatementdosagedoseandrate.getDoseQuantity();

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratedosequantity.hasValue()) {
			m.setMdctnStmntDsgDoseAndRtDoseQntyVl(String.valueOf(medicationstatementdosagedoseandratedosequantity.getValue()));
		}
		/******************** medicationstatementdosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandratedosequantitycomparator = medicationstatementdosagedoseandratedosequantity.getComparator();
		m.setMdctnStmntDsgDoseAndRtDoseQntyCmprtr(medicationstatementdosagedoseandratedosequantitycomparator.toCode());

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratedosequantity.hasCode()) {
			m.setMdctnStmntDsgDoseAndRtDoseQntyCd(String.valueOf(medicationstatementdosagedoseandratedosequantity.getCode()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratedosequantity.hasUnit()) {
			m.setMdctnStmntDsgDoseAndRtDoseQntyUnt(String.valueOf(medicationstatementdosagedoseandratedosequantity.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratedosequantity.hasSystem()) {
			m.setMdctnStmntDsgDoseAndRtDoseQntySys(String.valueOf(medicationstatementdosagedoseandratedosequantity.getSystem()));
		}
		/******************** medicationstatementdosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperadministration = medicationstatementdosage.getMaxDosePerAdministration();

		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasValue()) {
			m.setMdctnStmntDsgMxDosePerAdmnstnVl(String.valueOf(medicationstatementdosagemaxdoseperadministration.getValue()));
		}
		/******************** medicationstatementdosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperadministrationcomparator = medicationstatementdosagemaxdoseperadministration.getComparator();
		m.setMdctnStmntDsgMxDosePerAdmnstnCmprtr(medicationstatementdosagemaxdoseperadministrationcomparator.toCode());

		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasCode()) {
			m.setMdctnStmntDsgMxDosePerAdmnstnCd(String.valueOf(medicationstatementdosagemaxdoseperadministration.getCode()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasUnit()) {
			m.setMdctnStmntDsgMxDosePerAdmnstnUnt(String.valueOf(medicationstatementdosagemaxdoseperadministration.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasSystem()) {
			m.setMdctnStmntDsgMxDosePerAdmnstnSys(String.valueOf(medicationstatementdosagemaxdoseperadministration.getSystem()));
		}
		/******************** MdctnStmnt_Dsg_PntInstrctn ********************************************************************************/
		if(medicationstatementdosage.hasPatientInstruction()) {
			m.setMdctnStmntDsgPntInstrctn(String.valueOf(medicationstatementdosage.getPatientInstruction()));
		}
		/******************** medicationstatementdosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationstatementdosagetiming = medicationstatementdosage.getTiming();

		/******************** medicationstatementdosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagetimingcode = medicationstatementdosagetiming.getCode();

		/******************** MdctnStmnt_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(medicationstatementdosagetimingcode.hasText()) {
			m.setMdctnStmntDsgTmgCdTxt(String.valueOf(medicationstatementdosagetimingcode.getText()));
		}
		/******************** medicationstatementdosagetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosagetimingcodecoding = medicationstatementdosagetimingcode.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagetimingcodecoding.hasVersion()) {
			m.setMdctnStmntDsgTmgCdCdgVrsn(String.valueOf(medicationstatementdosagetimingcodecoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagetimingcodecoding.hasDisplay()) {
			m.setMdctnStmntDsgTmgCdCdgDsply(String.valueOf(medicationstatementdosagetimingcodecoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagetimingcodecoding.hasCode()) {
			m.setMdctnStmntDsgTmgCdCdgCd(String.valueOf(medicationstatementdosagetimingcodecoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagetimingcodecoding.hasUserSelected()) {
			m.setMdctnStmntDsgTmgCdCdgUsrSltd(String.valueOf(medicationstatementdosagetimingcodecoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagetimingcodecoding.hasSystem()) {
			m.setMdctnStmntDsgTmgCdCdgSys(String.valueOf(medicationstatementdosagetimingcodecoding.getSystem()));
		}
		/******************** medicationstatementdosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationstatementdosagetimingrepeat = medicationstatementdosagetiming.getRepeat();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasOffset()) {
			m.setMdctnStmntDsgTmgRptOff(String.valueOf(medicationstatementdosagetimingrepeat.getOffset()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasCount()) {
			m.setMdctnStmntDsgTmgRptCnt(String.valueOf(medicationstatementdosagetimingrepeat.getCount()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasFrequency()) {
			m.setMdctnStmntDsgTmgRptFrqncy(String.valueOf(medicationstatementdosagetimingrepeat.getFrequency()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasPeriod()) {
			m.setMdctnStmntDsgTmgRptPrd(String.valueOf(medicationstatementdosagetimingrepeat.getPeriod()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasDuration()) {
			m.setMdctnStmntDsgTmgRptDuration(String.valueOf(medicationstatementdosagetimingrepeat.getDuration()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationstatementdosagetimingrepeatboundsduration = medicationstatementdosagetimingrepeat.getBoundsDuration();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasValue()) {
			m.setMdctnStmntDsgTmgRptBndsDurationVl(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getValue()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagetimingrepeatboundsdurationcomparator = medicationstatementdosagetimingrepeatboundsduration.getComparator();
		m.setMdctnStmntDsgTmgRptBndsDurationCmprtr(medicationstatementdosagetimingrepeatboundsdurationcomparator.toCode());

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasCode()) {
			m.setMdctnStmntDsgTmgRptBndsDurationCd(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasUnit()) {
			m.setMdctnStmntDsgTmgRptBndsDurationUnt(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasSystem()) {
			m.setMdctnStmntDsgTmgRptBndsDurationSys(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getSystem()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagetimingrepeatboundsrange = medicationstatementdosagetimingrepeat.getBoundsRange();

		/******************** medicationstatementdosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagetimingrepeatboundsrangelow = medicationstatementdosagetimingrepeatboundsrange.getLow();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasValue()) {
			m.setMdctnStmntDsgTmgRptBndsRngLwVl(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getValue()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagetimingrepeatboundsrangelowcomparator = medicationstatementdosagetimingrepeatboundsrangelow.getComparator();
		m.setMdctnStmntDsgTmgRptBndsRngLwCmprtr(medicationstatementdosagetimingrepeatboundsrangelowcomparator.toCode());

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasCode()) {
			m.setMdctnStmntDsgTmgRptBndsRngLwCd(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasUnit()) {
			m.setMdctnStmntDsgTmgRptBndsRngLwUnt(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasSystem()) {
			m.setMdctnStmntDsgTmgRptBndsRngLwSys(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagetimingrepeatboundsrangehigh = medicationstatementdosagetimingrepeatboundsrange.getHigh();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasValue()) {
			m.setMdctnStmntDsgTmgRptBndsRngHiVl(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagetimingrepeatboundsrangehighcomparator = medicationstatementdosagetimingrepeatboundsrangehigh.getComparator();
		m.setMdctnStmntDsgTmgRptBndsRngHiCmprtr(medicationstatementdosagetimingrepeatboundsrangehighcomparator.toCode());

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasCode()) {
			m.setMdctnStmntDsgTmgRptBndsRngHiCd(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasUnit()) {
			m.setMdctnStmntDsgTmgRptBndsRngHiUnt(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasSystem()) {
			m.setMdctnStmntDsgTmgRptBndsRngHiSys(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** medicationstatementdosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementdosagetimingrepeatboundsperiod = medicationstatementdosagetimingrepeat.getBoundsPeriod();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsperiod.hasStart()) {
			m.setMdctnStmntDsgTmgRptBndsPrdStrt(String.valueOf(medicationstatementdosagetimingrepeatboundsperiod.getStart()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsperiod.hasEnd()) {
			m.setMdctnStmntDsgTmgRptBndsPrdEnd(String.valueOf(medicationstatementdosagetimingrepeatboundsperiod.getEnd()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasPeriodMax()) {
			m.setMdctnStmntDsgTmgRptPrdMx(String.valueOf(medicationstatementdosagetimingrepeat.getPeriodMax()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasDurationMax()) {
			m.setMdctnStmntDsgTmgRptDurationMx(String.valueOf(medicationstatementdosagetimingrepeat.getDurationMax()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasCountMax()) {
			m.setMdctnStmntDsgTmgRptCntMx(String.valueOf(medicationstatementdosagetimingrepeat.getCountMax()));
		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasFrequencyMax()) {
			m.setMdctnStmntDsgTmgRptFrqncyMx(String.valueOf(medicationstatementdosagetimingrepeat.getFrequencyMax()));
		}
		/******************** medicationstatementdosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationstatementdosagetimingrepeatdurationunit = medicationstatementdosagetimingrepeat.getDurationUnit();
		m.setMdctnStmntDsgTmgRptDurationUnt(medicationstatementdosagetimingrepeatdurationunit.toCode());

		/******************** medicationstatementdosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationstatementdosagetimingrepeatperiodunit = medicationstatementdosagetimingrepeat.getPeriodUnit();
		m.setMdctnStmntDsgTmgRptPrdUnt(medicationstatementdosagetimingrepeatperiodunit.toCode());

		/******************** medicationstatementdosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageroute = medicationstatementdosage.getRoute();

		/******************** MdctnStmnt_Dsg_Route_Txt ********************************************************************************/
		if(medicationstatementdosageroute.hasText()) {
			m.setMdctnStmntDsgRouteTxt(String.valueOf(medicationstatementdosageroute.getText()));
		}
		/******************** medicationstatementdosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementdosageroutecoding = medicationstatementdosageroute.getCodingFirstRep();

		/******************** MdctnStmnt_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosageroutecoding.hasVersion()) {
			m.setMdctnStmntDsgRouteCdgVrsn(String.valueOf(medicationstatementdosageroutecoding.getVersion()));
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosageroutecoding.hasDisplay()) {
			m.setMdctnStmntDsgRouteCdgDsply(String.valueOf(medicationstatementdosageroutecoding.getDisplay()));
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosageroutecoding.hasCode()) {
			m.setMdctnStmntDsgRouteCdgCd(String.valueOf(medicationstatementdosageroutecoding.getCode()));
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosageroutecoding.hasUserSelected()) {
			m.setMdctnStmntDsgRouteCdgUsrSltd(String.valueOf(medicationstatementdosageroutecoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosageroutecoding.hasSystem()) {
			m.setMdctnStmntDsgRouteCdgSys(String.valueOf(medicationstatementdosageroutecoding.getSystem()));
		}
		/******************** MdctnStmnt_DtAsserted ********************************************************************************/
		if(medicationstatement.hasDateAsserted()) {
			m.setMdctnStmntDtAsserted(String.valueOf(medicationstatement.getDateAsserted()));
		}
		/******************** medicationstatementcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementcategory = medicationstatement.getCategory();

		/******************** MdctnStmnt_Ctgry_Txt ********************************************************************************/
		if(medicationstatementcategory.hasText()) {
			m.setMdctnStmntCtgryTxt(String.valueOf(medicationstatementcategory.getText()));
		}
		/******************** medicationstatementcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementcategorycoding = medicationstatementcategory.getCodingFirstRep();

		/******************** MdctnStmnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementcategorycoding.hasVersion()) {
			m.setMdctnStmntCtgryCdgVrsn(String.valueOf(medicationstatementcategorycoding.getVersion()));
		}
		/******************** MdctnStmnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationstatementcategorycoding.hasDisplay()) {
			m.setMdctnStmntCtgryCdgDsply(String.valueOf(medicationstatementcategorycoding.getDisplay()));
		}
		/******************** MdctnStmnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationstatementcategorycoding.hasCode()) {
			m.setMdctnStmntCtgryCdgCd(String.valueOf(medicationstatementcategorycoding.getCode()));
		}
		/******************** MdctnStmnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementcategorycoding.hasUserSelected()) {
			m.setMdctnStmntCtgryCdgUsrSltd(String.valueOf(medicationstatementcategorycoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationstatementcategorycoding.hasSystem()) {
			m.setMdctnStmntCtgryCdgSys(String.valueOf(medicationstatementcategorycoding.getSystem()));
		}
		/******************** medicationstatementstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementstatusreason = medicationstatement.getStatusReasonFirstRep();

		/******************** MdctnStmnt_StsRsn_Txt ********************************************************************************/
		if(medicationstatementstatusreason.hasText()) {
			m.setMdctnStmntStsRsnTxt(String.valueOf(medicationstatementstatusreason.getText()));
		}
		/******************** medicationstatementstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementstatusreasoncoding = medicationstatementstatusreason.getCodingFirstRep();

		/******************** MdctnStmnt_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementstatusreasoncoding.hasVersion()) {
			m.setMdctnStmntStsRsnCdgVrsn(String.valueOf(medicationstatementstatusreasoncoding.getVersion()));
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Dsply ********************************************************************************/
		if(medicationstatementstatusreasoncoding.hasDisplay()) {
			m.setMdctnStmntStsRsnCdgDsply(String.valueOf(medicationstatementstatusreasoncoding.getDisplay()));
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Cd ********************************************************************************/
		if(medicationstatementstatusreasoncoding.hasCode()) {
			m.setMdctnStmntStsRsnCdgCd(String.valueOf(medicationstatementstatusreasoncoding.getCode()));
		}
		/******************** MdctnStmnt_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementstatusreasoncoding.hasUserSelected()) {
			m.setMdctnStmntStsRsnCdgUsrSltd(String.valueOf(medicationstatementstatusreasoncoding.getUserSelected()));
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Sys ********************************************************************************/
		if(medicationstatementstatusreasoncoding.hasSystem()) {
			m.setMdctnStmntStsRsnCdgSys(String.valueOf(medicationstatementstatusreasoncoding.getSystem()));
		}
		/******************** MdctnStmnt_DerivedFrom ********************************************************************************/
		if(medicationstatement.hasDerivedFrom()) {
			m.setMdctnStmntDerivedFrom(String.valueOf(medicationstatement.getDerivedFromFirstRep()));
		}
		/******************** medicationstatementidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationstatementidentifier = medicationstatement.getIdentifierFirstRep();

		/******************** MdctnStmnt_Id_Vl ********************************************************************************/
		if(medicationstatementidentifier.hasValue()) {
			m.setMdctnStmntIdVl(String.valueOf(medicationstatementidentifier.getValue()));
		}
		/******************** medicationstatementidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementidentifiertype = medicationstatementidentifier.getType();

		/******************** MdctnStmnt_Id_Typ_Txt ********************************************************************************/
		if(medicationstatementidentifiertype.hasText()) {
			m.setMdctnStmntIdTypTxt(String.valueOf(medicationstatementidentifiertype.getText()));
		}
		/******************** medicationstatementidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementidentifiertypecoding = medicationstatementidentifiertype.getCodingFirstRep();

		/******************** MdctnStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementidentifiertypecoding.hasVersion()) {
			m.setMdctnStmntIdTypCdgVrsn(String.valueOf(medicationstatementidentifiertypecoding.getVersion()));
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationstatementidentifiertypecoding.hasDisplay()) {
			m.setMdctnStmntIdTypCdgDsply(String.valueOf(medicationstatementidentifiertypecoding.getDisplay()));
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationstatementidentifiertypecoding.hasCode()) {
			m.setMdctnStmntIdTypCdgCd(String.valueOf(medicationstatementidentifiertypecoding.getCode()));
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementidentifiertypecoding.hasUserSelected()) {
			m.setMdctnStmntIdTypCdgUsrSltd(String.valueOf(medicationstatementidentifiertypecoding.getUserSelected()));
		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationstatementidentifiertypecoding.hasSystem()) {
			m.setMdctnStmntIdTypCdgSys(String.valueOf(medicationstatementidentifiertypecoding.getSystem()));
		}
		/******************** medicationstatementidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementidentifierperiod = medicationstatementidentifier.getPeriod();

		/******************** MdctnStmnt_Id_Prd_Strt ********************************************************************************/
		if(medicationstatementidentifierperiod.hasStart()) {
			m.setMdctnStmntIdPrdStrt(String.valueOf(medicationstatementidentifierperiod.getStart()));
		}
		/******************** MdctnStmnt_Id_Prd_End ********************************************************************************/
		if(medicationstatementidentifierperiod.hasEnd()) {
			m.setMdctnStmntIdPrdEnd(String.valueOf(medicationstatementidentifierperiod.getEnd()));
		}
		/******************** MdctnStmnt_Id_Assigner ********************************************************************************/
		if(medicationstatementidentifier.hasAssigner()) {
			m.setMdctnStmntIdAssigner(String.valueOf(medicationstatementidentifier.getAssigner()));
		}
		/******************** MdctnStmnt_Id_Sys ********************************************************************************/
		if(medicationstatementidentifier.hasSystem()) {
			m.setMdctnStmntIdSys(String.valueOf(medicationstatementidentifier.getSystem()));
		}
		/******************** medicationstatementidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationstatementidentifieruse = medicationstatementidentifier.getUse();
		m.setMdctnStmntIdUse(medicationstatementidentifieruse.toCode());

		/******************** medicationstatementreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementreasoncode = medicationstatement.getReasonCodeFirstRep();

		/******************** MdctnStmnt_RsnCd_Txt ********************************************************************************/
		if(medicationstatementreasoncode.hasText()) {
			m.setMdctnStmntRsnCdTxt(String.valueOf(medicationstatementreasoncode.getText()));
		}
		/******************** medicationstatementreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementreasoncodecoding = medicationstatementreasoncode.getCodingFirstRep();

		/******************** MdctnStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementreasoncodecoding.hasVersion()) {
			m.setMdctnStmntRsnCdCdgVrsn(String.valueOf(medicationstatementreasoncodecoding.getVersion()));
		}
		/******************** MdctnStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(medicationstatementreasoncodecoding.hasDisplay()) {
			m.setMdctnStmntRsnCdCdgDsply(String.valueOf(medicationstatementreasoncodecoding.getDisplay()));
		}
		/******************** MdctnStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(medicationstatementreasoncodecoding.hasCode()) {
			m.setMdctnStmntRsnCdCdgCd(String.valueOf(medicationstatementreasoncodecoding.getCode()));
		}
		/******************** MdctnStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementreasoncodecoding.hasUserSelected()) {
			m.setMdctnStmntRsnCdCdgUsrSltd(String.valueOf(medicationstatementreasoncodecoding.getUserSelected()));
		}
		/******************** MdctnStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(medicationstatementreasoncodecoding.hasSystem()) {
			m.setMdctnStmntRsnCdCdgSys(String.valueOf(medicationstatementreasoncodecoding.getSystem()));
		}
		/******************** MdctnStmnt_RsnRfrnc ********************************************************************************/
		if(medicationstatement.hasReasonReference()) {
			m.setMdctnStmntRsnRfrnc(String.valueOf(medicationstatement.getReasonReferenceFirstRep()));
		}
		/******************** MdctnStmnt_EfctiveDtTimeTyp ********************************************************************************/
		if(medicationstatement.hasEffectiveDateTimeType()) {
			m.setMdctnStmntEfctiveDtTimeTyp(String.valueOf(medicationstatement.getEffectiveDateTimeType()));
		}
		/******************** medicationstatementmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementmedicationcodeableconcept = medicationstatement.getMedicationCodeableConcept();

		/******************** MdctnStmnt_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationstatementmedicationcodeableconcept.hasText()) {
			m.setMdctnStmntMdctnCdbleCncptTxt(String.valueOf(medicationstatementmedicationcodeableconcept.getText()));
		}
		/******************** medicationstatementmedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationstatementmedicationcodeableconceptcoding = medicationstatementmedicationcodeableconcept.getCodingFirstRep();

		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcoding.hasVersion()) {
			m.setMdctnStmntMdctnCdbleCncptCdgVrsn(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcoding.hasDisplay()) {
			m.setMdctnStmntMdctnCdbleCncptCdgDsply(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcoding.hasCode()) {
			m.setMdctnStmntMdctnCdbleCncptCdgCd(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getCode()));
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnStmntMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcoding.hasSystem()) {
			m.setMdctnStmntMdctnCdbleCncptCdgSys(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnStmnt_MdctnRfrnc ********************************************************************************/
		if(medicationstatement.hasMedicationReference()) {
			m.setMdctnStmntMdctnRfrnc(String.valueOf(medicationstatement.getMedicationReference()));
		}
		/******************** MdctnStmnt_InfoSrc ********************************************************************************/
		if(medicationstatement.hasInformationSource()) {
			m.setMdctnStmntInfoSrc(String.valueOf(medicationstatement.getInformationSource()));
		}
		return m;
	}
}
