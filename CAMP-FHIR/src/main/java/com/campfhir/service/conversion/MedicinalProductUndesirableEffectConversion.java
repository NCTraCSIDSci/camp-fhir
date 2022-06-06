package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductUndesirableEffect;
public class MedicinalProductUndesirableEffectConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect MedicinalProductUndesirableEffects(MedicinalProductUndesirableEffect m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect medicinalproductundesirableeffect = new org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect();

		/******************** id ********************************************************************************/
		medicinalproductundesirableeffect.setId(m.getId());

		/******************** medicinalproductundesirableeffectclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectclassification =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffect.setClassification(medicinalproductundesirableeffectclassification);

		/******************** medicinalproductundesirableeffectclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectclassificationcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectclassification.addCoding(medicinalproductundesirableeffectclassificationcoding);

		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgCd() != null) {
			medicinalproductundesirableeffectclassificationcoding.setCode(m.getMdcnlPrdctUndesirableEfctClsfctnCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgDsply() != null) {
			medicinalproductundesirableeffectclassificationcoding.setDisplay(m.getMdcnlPrdctUndesirableEfctClsfctnCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgSys() != null) {
			medicinalproductundesirableeffectclassificationcoding.setSystem(m.getMdcnlPrdctUndesirableEfctClsfctnCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd() != null) {
			medicinalproductundesirableeffectclassificationcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgVrsn() != null) {
			medicinalproductundesirableeffectclassificationcoding.setVersion(m.getMdcnlPrdctUndesirableEfctClsfctnCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnTxt() != null) {
			medicinalproductundesirableeffectclassification.setText(m.getMdcnlPrdctUndesirableEfctClsfctnTxt());
		}
		/******************** medicinalproductundesirableeffectfrequencyofoccurrence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectfrequencyofoccurrence =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffect.setFrequencyOfOccurrence(medicinalproductundesirableeffectfrequencyofoccurrence);

		/******************** medicinalproductundesirableeffectfrequencyofoccurrencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectfrequencyofoccurrencecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectfrequencyofoccurrence.addCoding(medicinalproductundesirableeffectfrequencyofoccurrencecoding);

		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd() != null) {
			medicinalproductundesirableeffectfrequencyofoccurrencecoding.setCode(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply() != null) {
			medicinalproductundesirableeffectfrequencyofoccurrencecoding.setDisplay(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys() != null) {
			medicinalproductundesirableeffectfrequencyofoccurrencecoding.setSystem(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd() != null) {
			medicinalproductundesirableeffectfrequencyofoccurrencecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn() != null) {
			medicinalproductundesirableeffectfrequencyofoccurrencecoding.setVersion(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt() != null) {
			medicinalproductundesirableeffectfrequencyofoccurrence.setText(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt());
		}
		/******************** medicinalproductundesirableeffectpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Population medicinalproductundesirableeffectpopulation =  new org.hl7.fhir.r4.model.Population();
		medicinalproductundesirableeffect.addPopulation(medicinalproductundesirableeffectpopulation);

		/******************** medicinalproductundesirableeffectpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationagecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffectpopulation.setAge(medicinalproductundesirableeffectpopulationagecodeableconcept);

		/******************** medicinalproductundesirableeffectpopulationagecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationagecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectpopulationagecodeableconcept.addCoding(medicinalproductundesirableeffectpopulationagecodeableconceptcoding);

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd() != null) {
			medicinalproductundesirableeffectpopulationagecodeableconceptcoding.setCode(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply() != null) {
			medicinalproductundesirableeffectpopulationagecodeableconceptcoding.setDisplay(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys() != null) {
			medicinalproductundesirableeffectpopulationagecodeableconceptcoding.setSystem(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd() != null) {
			medicinalproductundesirableeffectpopulationagecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn() != null) {
			medicinalproductundesirableeffectpopulationagecodeableconceptcoding.setVersion(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt() != null) {
			medicinalproductundesirableeffectpopulationagecodeableconcept.setText(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt());
		}
		/******************** medicinalproductundesirableeffectpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductundesirableeffectpopulationagerange =  new org.hl7.fhir.r4.model.Range();
		medicinalproductundesirableeffectpopulation.setAge(medicinalproductundesirableeffectpopulationagerange);

		/******************** medicinalproductundesirableeffectpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductundesirableeffectpopulationagerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductundesirableeffectpopulationagerange.setHigh(medicinalproductundesirableeffectpopulationagerangehigh);

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd() != null) {
			medicinalproductundesirableeffectpopulationagerangehigh.setCode(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd());
		}
		/******************** medicinalproductundesirableeffectpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductundesirableeffectpopulationagerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductundesirableeffectpopulationagerangehigh.setComparator(medicinalproductundesirableeffectpopulationagerangehighcomparator.fromCode(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr()));

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys() != null) {
			medicinalproductundesirableeffectpopulationagerangehigh.setSystem(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt() != null) {
			medicinalproductundesirableeffectpopulationagerangehigh.setUnit(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl() != null) {
			medicinalproductundesirableeffectpopulationagerangehigh.setValue(Double.parseDouble((m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl())));
		}
		/******************** medicinalproductundesirableeffectpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductundesirableeffectpopulationagerangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductundesirableeffectpopulationagerange.setLow(medicinalproductundesirableeffectpopulationagerangelow);

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd() != null) {
			medicinalproductundesirableeffectpopulationagerangelow.setCode(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd());
		}
		/******************** medicinalproductundesirableeffectpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductundesirableeffectpopulationagerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductundesirableeffectpopulationagerangelow.setComparator(medicinalproductundesirableeffectpopulationagerangelowcomparator.fromCode(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr()));

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys() != null) {
			medicinalproductundesirableeffectpopulationagerangelow.setSystem(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt() != null) {
			medicinalproductundesirableeffectpopulationagerangelow.setUnit(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl() != null) {
			medicinalproductundesirableeffectpopulationagerangelow.setValue(Double.parseDouble((m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl())));
		}
		/******************** medicinalproductundesirableeffectpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationgender =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffectpopulation.setGender(medicinalproductundesirableeffectpopulationgender);

		/******************** medicinalproductundesirableeffectpopulationgendercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationgendercoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectpopulationgender.addCoding(medicinalproductundesirableeffectpopulationgendercoding);

		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgCd() != null) {
			medicinalproductundesirableeffectpopulationgendercoding.setCode(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply() != null) {
			medicinalproductundesirableeffectpopulationgendercoding.setDisplay(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgSys() != null) {
			medicinalproductundesirableeffectpopulationgendercoding.setSystem(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd() != null) {
			medicinalproductundesirableeffectpopulationgendercoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn() != null) {
			medicinalproductundesirableeffectpopulationgendercoding.setVersion(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderTxt() != null) {
			medicinalproductundesirableeffectpopulationgender.setText(m.getMdcnlPrdctUndesirableEfctPoplnGenderTxt());
		}
		/******************** medicinalproductundesirableeffectpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationphysiologicalcondition =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffectpopulation.setPhysiologicalCondition(medicinalproductundesirableeffectpopulationphysiologicalcondition);

		/******************** medicinalproductundesirableeffectpopulationphysiologicalconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationphysiologicalconditioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectpopulationphysiologicalcondition.addCoding(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding);

		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd() != null) {
			medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.setCode(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply() != null) {
			medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.setDisplay(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys() != null) {
			medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.setSystem(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd() != null) {
			medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn() != null) {
			medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.setVersion(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt() != null) {
			medicinalproductundesirableeffectpopulationphysiologicalcondition.setText(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt());
		}
		/******************** medicinalproductundesirableeffectpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationrace =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffectpopulation.setRace(medicinalproductundesirableeffectpopulationrace);

		/******************** medicinalproductundesirableeffectpopulationracecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectpopulationracecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectpopulationrace.addCoding(medicinalproductundesirableeffectpopulationracecoding);

		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgCd() != null) {
			medicinalproductundesirableeffectpopulationracecoding.setCode(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply() != null) {
			medicinalproductundesirableeffectpopulationracecoding.setDisplay(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgSys() != null) {
			medicinalproductundesirableeffectpopulationracecoding.setSystem(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd() != null) {
			medicinalproductundesirableeffectpopulationracecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn() != null) {
			medicinalproductundesirableeffectpopulationracecoding.setVersion(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceTxt() != null) {
			medicinalproductundesirableeffectpopulationrace.setText(m.getMdcnlPrdctUndesirableEfctPoplnRaceTxt());
		}
		/******************** MdcnlPrdctUndesirableEfct_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSbjct() != null) {
			medicinalproductundesirableeffect.addSubject( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctUndesirableEfctSbjct()));
		}
		/******************** medicinalproductundesirableeffectsymptomconditioneffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectsymptomconditioneffect =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductundesirableeffect.setSymptomConditionEffect(medicinalproductundesirableeffectsymptomconditioneffect);

		/******************** medicinalproductundesirableeffectsymptomconditioneffectcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductundesirableeffectsymptomconditioneffectcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductundesirableeffectsymptomconditioneffect.addCoding(medicinalproductundesirableeffectsymptomconditioneffectcoding);

		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd() != null) {
			medicinalproductundesirableeffectsymptomconditioneffectcoding.setCode(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd());
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply() != null) {
			medicinalproductundesirableeffectsymptomconditioneffectcoding.setDisplay(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply());
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys() != null) {
			medicinalproductundesirableeffectsymptomconditioneffectcoding.setSystem(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys());
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd() != null) {
			medicinalproductundesirableeffectsymptomconditioneffectcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd()));
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn() != null) {
			medicinalproductundesirableeffectsymptomconditioneffectcoding.setVersion(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn());
		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt() != null) {
			medicinalproductundesirableeffectsymptomconditioneffect.setText(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt());
		}
		return medicinalproductundesirableeffect;
	}
}
