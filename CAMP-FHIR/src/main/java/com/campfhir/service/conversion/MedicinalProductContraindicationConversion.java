package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductContraindication;
public class MedicinalProductContraindicationConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductContraindication MedicinalProductContraindications(MedicinalProductContraindication m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductContraindication medicinalproductcontraindication = new org.hl7.fhir.r4.model.MedicinalProductContraindication();

		/******************** id ********************************************************************************/
		medicinalproductcontraindication.setId(m.getId());

		/******************** medicinalproductcontraindicationcomorbidity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationcomorbidity =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindication.addComorbidity(medicinalproductcontraindicationcomorbidity);

		/******************** medicinalproductcontraindicationcomorbiditycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationcomorbiditycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationcomorbidity.addCoding(medicinalproductcontraindicationcomorbiditycoding);

		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgCd() != null) {
			medicinalproductcontraindicationcomorbiditycoding.setCode(m.getMdcnlPrdctCntraindctnComorbidityCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgDsply() != null) {
			medicinalproductcontraindicationcomorbiditycoding.setDisplay(m.getMdcnlPrdctCntraindctnComorbidityCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgSys() != null) {
			medicinalproductcontraindicationcomorbiditycoding.setSystem(m.getMdcnlPrdctCntraindctnComorbidityCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgUsrSltd() != null) {
			medicinalproductcontraindicationcomorbiditycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnComorbidityCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgVrsn() != null) {
			medicinalproductcontraindicationcomorbiditycoding.setVersion(m.getMdcnlPrdctCntraindctnComorbidityCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityTxt() != null) {
			medicinalproductcontraindicationcomorbidity.setText(m.getMdcnlPrdctCntraindctnComorbidityTxt());
		}
		/******************** medicinalproductcontraindicationdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationdisease =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindication.setDisease(medicinalproductcontraindicationdisease);

		/******************** medicinalproductcontraindicationdiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationdiseasecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationdisease.addCoding(medicinalproductcontraindicationdiseasecoding);

		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgCd() != null) {
			medicinalproductcontraindicationdiseasecoding.setCode(m.getMdcnlPrdctCntraindctnDiseaseCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgDsply() != null) {
			medicinalproductcontraindicationdiseasecoding.setDisplay(m.getMdcnlPrdctCntraindctnDiseaseCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgSys() != null) {
			medicinalproductcontraindicationdiseasecoding.setSystem(m.getMdcnlPrdctCntraindctnDiseaseCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgUsrSltd() != null) {
			medicinalproductcontraindicationdiseasecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnDiseaseCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgVrsn() != null) {
			medicinalproductcontraindicationdiseasecoding.setVersion(m.getMdcnlPrdctCntraindctnDiseaseCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseTxt() != null) {
			medicinalproductcontraindicationdisease.setText(m.getMdcnlPrdctCntraindctnDiseaseTxt());
		}
		/******************** medicinalproductcontraindicationdiseasestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationdiseasestatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindication.setDiseaseStatus(medicinalproductcontraindicationdiseasestatus);

		/******************** medicinalproductcontraindicationdiseasestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationdiseasestatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationdiseasestatus.addCoding(medicinalproductcontraindicationdiseasestatuscoding);

		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgCd() != null) {
			medicinalproductcontraindicationdiseasestatuscoding.setCode(m.getMdcnlPrdctCntraindctnDiseaseStsCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgDsply() != null) {
			medicinalproductcontraindicationdiseasestatuscoding.setDisplay(m.getMdcnlPrdctCntraindctnDiseaseStsCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgSys() != null) {
			medicinalproductcontraindicationdiseasestatuscoding.setSystem(m.getMdcnlPrdctCntraindctnDiseaseStsCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd() != null) {
			medicinalproductcontraindicationdiseasestatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgVrsn() != null) {
			medicinalproductcontraindicationdiseasestatuscoding.setVersion(m.getMdcnlPrdctCntraindctnDiseaseStsCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsTxt() != null) {
			medicinalproductcontraindicationdiseasestatus.setText(m.getMdcnlPrdctCntraindctnDiseaseStsTxt());
		}
		/******************** medicinalproductcontraindicationothertherapy ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent medicinalproductcontraindicationothertherapy =  new org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent();
		medicinalproductcontraindication.addOtherTherapy(medicinalproductcontraindicationothertherapy);

		/******************** medicinalproductcontraindicationothertherapymedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationothertherapymedicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindicationothertherapy.setMedication(medicinalproductcontraindicationothertherapymedicationcodeableconcept);

		/******************** medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationothertherapymedicationcodeableconcept.addCoding(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding);

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd() != null) {
			medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.setCode(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply() != null) {
			medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.setDisplay(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys() != null) {
			medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.setSystem(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd() != null) {
			medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn() != null) {
			medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.setVersion(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt() != null) {
			medicinalproductcontraindicationothertherapymedicationcodeableconcept.setText(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc() != null) {
			medicinalproductcontraindicationothertherapy.setMedication( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc()));
		}
		/******************** medicinalproductcontraindicationothertherapytherapyrelationshiptype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationothertherapytherapyrelationshiptype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindicationothertherapy.setTherapyRelationshipType(medicinalproductcontraindicationothertherapytherapyrelationshiptype);

		/******************** medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationothertherapytherapyrelationshiptype.addCoding(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding);

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd() != null) {
			medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.setCode(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply() != null) {
			medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.setDisplay(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys() != null) {
			medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.setSystem(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd() != null) {
			medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn() != null) {
			medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.setVersion(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt() != null) {
			medicinalproductcontraindicationothertherapytherapyrelationshiptype.setText(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt());
		}
		/******************** medicinalproductcontraindicationpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Population medicinalproductcontraindicationpopulation =  new org.hl7.fhir.r4.model.Population();
		medicinalproductcontraindication.addPopulation(medicinalproductcontraindicationpopulation);

		/******************** medicinalproductcontraindicationpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationagecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindicationpopulation.setAge(medicinalproductcontraindicationpopulationagecodeableconcept);

		/******************** medicinalproductcontraindicationpopulationagecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationagecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationpopulationagecodeableconcept.addCoding(medicinalproductcontraindicationpopulationagecodeableconceptcoding);

		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd() != null) {
			medicinalproductcontraindicationpopulationagecodeableconceptcoding.setCode(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply() != null) {
			medicinalproductcontraindicationpopulationagecodeableconceptcoding.setDisplay(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys() != null) {
			medicinalproductcontraindicationpopulationagecodeableconceptcoding.setSystem(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd() != null) {
			medicinalproductcontraindicationpopulationagecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn() != null) {
			medicinalproductcontraindicationpopulationagecodeableconceptcoding.setVersion(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt() != null) {
			medicinalproductcontraindicationpopulationagecodeableconcept.setText(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt());
		}
		/******************** medicinalproductcontraindicationpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductcontraindicationpopulationagerange =  new org.hl7.fhir.r4.model.Range();
		medicinalproductcontraindicationpopulation.setAge(medicinalproductcontraindicationpopulationagerange);

		/******************** medicinalproductcontraindicationpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductcontraindicationpopulationagerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductcontraindicationpopulationagerange.setHigh(medicinalproductcontraindicationpopulationagerangehigh);

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCd() != null) {
			medicinalproductcontraindicationpopulationagerangehigh.setCode(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCd());
		}
		/******************** medicinalproductcontraindicationpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductcontraindicationpopulationagerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductcontraindicationpopulationagerangehigh.setComparator(medicinalproductcontraindicationpopulationagerangehighcomparator.fromCode(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr()));

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiSys() != null) {
			medicinalproductcontraindicationpopulationagerangehigh.setSystem(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiSys());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiUnt() != null) {
			medicinalproductcontraindicationpopulationagerangehigh.setUnit(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiUnt());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiVl() != null) {
			medicinalproductcontraindicationpopulationagerangehigh.setValue(Double.parseDouble((m.getMdcnlPrdctCntraindctnPoplnAgeRngHiVl())));
		}
		/******************** medicinalproductcontraindicationpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductcontraindicationpopulationagerangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductcontraindicationpopulationagerange.setLow(medicinalproductcontraindicationpopulationagerangelow);

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCd() != null) {
			medicinalproductcontraindicationpopulationagerangelow.setCode(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCd());
		}
		/******************** medicinalproductcontraindicationpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductcontraindicationpopulationagerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductcontraindicationpopulationagerangelow.setComparator(medicinalproductcontraindicationpopulationagerangelowcomparator.fromCode(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr()));

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwSys() != null) {
			medicinalproductcontraindicationpopulationagerangelow.setSystem(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwSys());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwUnt() != null) {
			medicinalproductcontraindicationpopulationagerangelow.setUnit(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwUnt());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwVl() != null) {
			medicinalproductcontraindicationpopulationagerangelow.setValue(Double.parseDouble((m.getMdcnlPrdctCntraindctnPoplnAgeRngLwVl())));
		}
		/******************** medicinalproductcontraindicationpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationgender =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindicationpopulation.setGender(medicinalproductcontraindicationpopulationgender);

		/******************** medicinalproductcontraindicationpopulationgendercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationgendercoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationpopulationgender.addCoding(medicinalproductcontraindicationpopulationgendercoding);

		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgCd() != null) {
			medicinalproductcontraindicationpopulationgendercoding.setCode(m.getMdcnlPrdctCntraindctnPoplnGenderCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgDsply() != null) {
			medicinalproductcontraindicationpopulationgendercoding.setDisplay(m.getMdcnlPrdctCntraindctnPoplnGenderCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgSys() != null) {
			medicinalproductcontraindicationpopulationgendercoding.setSystem(m.getMdcnlPrdctCntraindctnPoplnGenderCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd() != null) {
			medicinalproductcontraindicationpopulationgendercoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgVrsn() != null) {
			medicinalproductcontraindicationpopulationgendercoding.setVersion(m.getMdcnlPrdctCntraindctnPoplnGenderCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderTxt() != null) {
			medicinalproductcontraindicationpopulationgender.setText(m.getMdcnlPrdctCntraindctnPoplnGenderTxt());
		}
		/******************** medicinalproductcontraindicationpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationphysiologicalcondition =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindicationpopulation.setPhysiologicalCondition(medicinalproductcontraindicationpopulationphysiologicalcondition);

		/******************** medicinalproductcontraindicationpopulationphysiologicalconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationphysiologicalconditioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationpopulationphysiologicalcondition.addCoding(medicinalproductcontraindicationpopulationphysiologicalconditioncoding);

		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd() != null) {
			medicinalproductcontraindicationpopulationphysiologicalconditioncoding.setCode(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply() != null) {
			medicinalproductcontraindicationpopulationphysiologicalconditioncoding.setDisplay(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys() != null) {
			medicinalproductcontraindicationpopulationphysiologicalconditioncoding.setSystem(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd() != null) {
			medicinalproductcontraindicationpopulationphysiologicalconditioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn() != null) {
			medicinalproductcontraindicationpopulationphysiologicalconditioncoding.setVersion(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt() != null) {
			medicinalproductcontraindicationpopulationphysiologicalcondition.setText(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt());
		}
		/******************** medicinalproductcontraindicationpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationrace =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcontraindicationpopulation.setRace(medicinalproductcontraindicationpopulationrace);

		/******************** medicinalproductcontraindicationpopulationracecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationracecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcontraindicationpopulationrace.addCoding(medicinalproductcontraindicationpopulationracecoding);

		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgCd() != null) {
			medicinalproductcontraindicationpopulationracecoding.setCode(m.getMdcnlPrdctCntraindctnPoplnRaceCdgCd());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgDsply() != null) {
			medicinalproductcontraindicationpopulationracecoding.setDisplay(m.getMdcnlPrdctCntraindctnPoplnRaceCdgDsply());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgSys() != null) {
			medicinalproductcontraindicationpopulationracecoding.setSystem(m.getMdcnlPrdctCntraindctnPoplnRaceCdgSys());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd() != null) {
			medicinalproductcontraindicationpopulationracecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgVrsn() != null) {
			medicinalproductcontraindicationpopulationracecoding.setVersion(m.getMdcnlPrdctCntraindctnPoplnRaceCdgVrsn());
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceTxt() != null) {
			medicinalproductcontraindicationpopulationrace.setText(m.getMdcnlPrdctCntraindctnPoplnRaceTxt());
		}
		/******************** MdcnlPrdctCntraindctn_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnSbjct() != null) {
			medicinalproductcontraindication.addSubject( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctCntraindctnSbjct()));
		}
		/******************** MdcnlPrdctCntraindctn_TherapeuticIndctn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnTherapeuticIndctn() != null) {
			medicinalproductcontraindication.addTherapeuticIndication( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctCntraindctnTherapeuticIndctn()));
		}
		return medicinalproductcontraindication;
	}
}
