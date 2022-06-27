package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductUndesirableEffect;
public class MedicinalProductUndesirableEffectBidirectionalConversion 
{
	public MedicinalProductUndesirableEffect MedicinalProductUndesirableEffects(org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect medicinalproductundesirableeffect) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductUndesirableEffect m = new  main.java.com.campfhir.model.MedicinalProductUndesirableEffect();

		/******************** id ********************************************************************************/
		medicinalproductundesirableeffect.setId(m.getId());

		/******************** MdcnlPrdctUndesirableEfct_Sbjct ********************************************************************************/
		if(medicinalproductundesirableeffect.hasSubject()) {
			m.setMdcnlPrdctUndesirableEfctSbjct(String.valueOf(medicinalproductundesirableeffect.getSubjectFirstRep()));
		}
		/******************** medicinalproductundesirableeffectclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectclassification = medicinalproductundesirableeffect.getClassification();

		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectclassification.hasText()) {
			m.setMdcnlPrdctUndesirableEfctClsfctnTxt(String.valueOf(medicinalproductundesirableeffectclassification.getText()));
		}
		/******************** medicinalproductundesirableeffectclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectclassificationcoding = medicinalproductundesirableeffectclassification.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctClsfctnCdgVrsn(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctClsfctnCdgDsply(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctClsfctnCdgCd(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctClsfctnCdgSys(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getSystem()));
		}
		/******************** medicinalproductundesirableeffectsymptomconditioneffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectsymptomconditioneffect = medicinalproductundesirableeffect.getSymptomConditionEffect();

		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffect.hasText()) {
			m.setMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffect.getText()));
		}
		/******************** medicinalproductundesirableeffectsymptomconditioneffectcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectsymptomconditioneffectcoding = medicinalproductundesirableeffectsymptomconditioneffect.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getSystem()));
		}
		/******************** medicinalproductundesirableeffectfrequencyofoccurrence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectfrequencyofoccurrence = medicinalproductundesirableeffect.getFrequencyOfOccurrence();

		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrence.hasText()) {
			m.setMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrence.getText()));
		}
		/******************** medicinalproductundesirableeffectfrequencyofoccurrencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectfrequencyofoccurrencecoding = medicinalproductundesirableeffectfrequencyofoccurrence.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getSystem()));
		}
		/******************** medicinalproductundesirableeffectpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Population medicinalproductundesirableeffectpopulation = medicinalproductundesirableeffect.getPopulationFirstRep();

		/******************** medicinalproductundesirableeffectpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductundesirableeffectpopulationagerange = medicinalproductundesirableeffectpopulation.getAgeRange();

		/******************** medicinalproductundesirableeffectpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductundesirableeffectpopulationagerangelow = medicinalproductundesirableeffectpopulationagerange.getLow();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangelow.hasValue()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getValue()));
		}
		/******************** medicinalproductundesirableeffectpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductundesirableeffectpopulationagerangelowcomparator = medicinalproductundesirableeffectpopulationagerangelow.getComparator();
		m.setMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr(medicinalproductundesirableeffectpopulationagerangelowcomparator.toCode());

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangelow.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangelow.hasUnit()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getUnit()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangelow.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getSystem()));
		}
		/******************** medicinalproductundesirableeffectpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductundesirableeffectpopulationagerangehigh = medicinalproductundesirableeffectpopulationagerange.getHigh();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasValue()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getValue()));
		}
		/******************** medicinalproductundesirableeffectpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductundesirableeffectpopulationagerangehighcomparator = medicinalproductundesirableeffectpopulationagerangehigh.getComparator();
		m.setMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr(medicinalproductundesirableeffectpopulationagerangehighcomparator.toCode());

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasUnit()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getUnit()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getSystem()));
		}
		/******************** medicinalproductundesirableeffectpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationphysiologicalcondition = medicinalproductundesirableeffectpopulation.getPhysiologicalCondition();

		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalcondition.hasText()) {
			m.setMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalcondition.getText()));
		}
		/******************** medicinalproductundesirableeffectpopulationphysiologicalconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationphysiologicalconditioncoding = medicinalproductundesirableeffectpopulationphysiologicalcondition.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getSystem()));
		}
		/******************** medicinalproductundesirableeffectpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationagecodeableconcept = medicinalproductundesirableeffectpopulation.getAgeCodeableConcept();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconcept.hasText()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconcept.getText()));
		}
		/******************** medicinalproductundesirableeffectpopulationagecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationagecodeableconceptcoding = medicinalproductundesirableeffectpopulationagecodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getSystem()));
		}
		/******************** medicinalproductundesirableeffectpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationrace = medicinalproductundesirableeffectpopulation.getRace();

		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationrace.hasText()) {
			m.setMdcnlPrdctUndesirableEfctPoplnRaceTxt(String.valueOf(medicinalproductundesirableeffectpopulationrace.getText()));
		}
		/******************** medicinalproductundesirableeffectpopulationracecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationracecoding = medicinalproductundesirableeffectpopulationrace.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctPoplnRaceCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctPoplnRaceCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getSystem()));
		}
		/******************** medicinalproductundesirableeffectpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationgender = medicinalproductundesirableeffectpopulation.getGender();

		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgender.hasText()) {
			m.setMdcnlPrdctUndesirableEfctPoplnGenderTxt(String.valueOf(medicinalproductundesirableeffectpopulationgender.getText()));
		}
		/******************** medicinalproductundesirableeffectpopulationgendercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationgendercoding = medicinalproductundesirableeffectpopulationgender.getCodingFirstRep();

		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercoding.hasVersion()) {
			m.setMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getVersion()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercoding.hasDisplay()) {
			m.setMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getDisplay()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercoding.hasCode()) {
			m.setMdcnlPrdctUndesirableEfctPoplnGenderCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getCode()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercoding.hasUserSelected()) {
			m.setMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getUserSelected()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercoding.hasSystem()) {
			m.setMdcnlPrdctUndesirableEfctPoplnGenderCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getSystem()));
		}
		return m;
	}
}
