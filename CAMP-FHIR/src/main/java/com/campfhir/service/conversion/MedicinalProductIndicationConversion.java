package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIndication;
public class MedicinalProductIndicationConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductIndication MedicinalProductIndications(MedicinalProductIndication m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductIndication medicinalproductindication = new org.hl7.fhir.r4.model.MedicinalProductIndication();

		/******************** id ********************************************************************************/
		medicinalproductindication.setId(m.getId());

		/******************** medicinalproductindicationcomorbidity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationcomorbidity =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindication.addComorbidity(medicinalproductindicationcomorbidity);

		/******************** medicinalproductindicationcomorbiditycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationcomorbiditycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationcomorbidity.addCoding(medicinalproductindicationcomorbiditycoding);

		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgCd() != null) {
			medicinalproductindicationcomorbiditycoding.setCode(m.getMdcnlPrdctIndctnComorbidityCdgCd());
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgDsply() != null) {
			medicinalproductindicationcomorbiditycoding.setDisplay(m.getMdcnlPrdctIndctnComorbidityCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgSys() != null) {
			medicinalproductindicationcomorbiditycoding.setSystem(m.getMdcnlPrdctIndctnComorbidityCdgSys());
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgUsrSltd() != null) {
			medicinalproductindicationcomorbiditycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnComorbidityCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgVrsn() != null) {
			medicinalproductindicationcomorbiditycoding.setVersion(m.getMdcnlPrdctIndctnComorbidityCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityTxt() != null) {
			medicinalproductindicationcomorbidity.setText(m.getMdcnlPrdctIndctnComorbidityTxt());
		}
		/******************** medicinalproductindicationdiseasestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationdiseasestatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindication.setDiseaseStatus(medicinalproductindicationdiseasestatus);

		/******************** medicinalproductindicationdiseasestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationdiseasestatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationdiseasestatus.addCoding(medicinalproductindicationdiseasestatuscoding);

		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgCd() != null) {
			medicinalproductindicationdiseasestatuscoding.setCode(m.getMdcnlPrdctIndctnDiseaseStsCdgCd());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgDsply() != null) {
			medicinalproductindicationdiseasestatuscoding.setDisplay(m.getMdcnlPrdctIndctnDiseaseStsCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgSys() != null) {
			medicinalproductindicationdiseasestatuscoding.setSystem(m.getMdcnlPrdctIndctnDiseaseStsCdgSys());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgUsrSltd() != null) {
			medicinalproductindicationdiseasestatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnDiseaseStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgVrsn() != null) {
			medicinalproductindicationdiseasestatuscoding.setVersion(m.getMdcnlPrdctIndctnDiseaseStsCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsTxt() != null) {
			medicinalproductindicationdiseasestatus.setText(m.getMdcnlPrdctIndctnDiseaseStsTxt());
		}
		/******************** medicinalproductindicationdiseasesymptomprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationdiseasesymptomprocedure =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindication.setDiseaseSymptomProcedure(medicinalproductindicationdiseasesymptomprocedure);

		/******************** medicinalproductindicationdiseasesymptomprocedurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationdiseasesymptomprocedurecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationdiseasesymptomprocedure.addCoding(medicinalproductindicationdiseasesymptomprocedurecoding);

		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd() != null) {
			medicinalproductindicationdiseasesymptomprocedurecoding.setCode(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply() != null) {
			medicinalproductindicationdiseasesymptomprocedurecoding.setDisplay(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys() != null) {
			medicinalproductindicationdiseasesymptomprocedurecoding.setSystem(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd() != null) {
			medicinalproductindicationdiseasesymptomprocedurecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn() != null) {
			medicinalproductindicationdiseasesymptomprocedurecoding.setVersion(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt() != null) {
			medicinalproductindicationdiseasesymptomprocedure.setText(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt());
		}
		/******************** medicinalproductindicationduration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationduration =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductindication.setDuration(medicinalproductindicationduration);

		/******************** MdcnlPrdctIndctn_Duration_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationCd() != null) {
			medicinalproductindicationduration.setCode(m.getMdcnlPrdctIndctnDurationCd());
		}
		/******************** medicinalproductindicationdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductindicationdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductindicationduration.setComparator(medicinalproductindicationdurationcomparator.fromCode(m.getMdcnlPrdctIndctnDurationCmprtr()));

		/******************** MdcnlPrdctIndctn_Duration_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationSys() != null) {
			medicinalproductindicationduration.setSystem(m.getMdcnlPrdctIndctnDurationSys());
		}
		/******************** MdcnlPrdctIndctn_Duration_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationUnt() != null) {
			medicinalproductindicationduration.setUnit(m.getMdcnlPrdctIndctnDurationUnt());
		}
		/******************** MdcnlPrdctIndctn_Duration_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationVl() != null) {
			medicinalproductindicationduration.setValue(Double.parseDouble((m.getMdcnlPrdctIndctnDurationVl())));
		}
		/******************** medicinalproductindicationintendedeffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationintendedeffect =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindication.setIntendedEffect(medicinalproductindicationintendedeffect);

		/******************** medicinalproductindicationintendedeffectcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationintendedeffectcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationintendedeffect.addCoding(medicinalproductindicationintendedeffectcoding);

		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgCd() != null) {
			medicinalproductindicationintendedeffectcoding.setCode(m.getMdcnlPrdctIndctnIntendedEfctCdgCd());
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgDsply() != null) {
			medicinalproductindicationintendedeffectcoding.setDisplay(m.getMdcnlPrdctIndctnIntendedEfctCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgSys() != null) {
			medicinalproductindicationintendedeffectcoding.setSystem(m.getMdcnlPrdctIndctnIntendedEfctCdgSys());
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgUsrSltd() != null) {
			medicinalproductindicationintendedeffectcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnIntendedEfctCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgVrsn() != null) {
			medicinalproductindicationintendedeffectcoding.setVersion(m.getMdcnlPrdctIndctnIntendedEfctCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctTxt() != null) {
			medicinalproductindicationintendedeffect.setText(m.getMdcnlPrdctIndctnIntendedEfctTxt());
		}
		/******************** medicinalproductindicationothertherapy ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent medicinalproductindicationothertherapy =  new org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent();
		medicinalproductindication.addOtherTherapy(medicinalproductindicationothertherapy);

		/******************** medicinalproductindicationothertherapymedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationothertherapymedicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindicationothertherapy.setMedication(medicinalproductindicationothertherapymedicationcodeableconcept);

		/******************** medicinalproductindicationothertherapymedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationothertherapymedicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationothertherapymedicationcodeableconcept.addCoding(medicinalproductindicationothertherapymedicationcodeableconceptcoding);

		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd() != null) {
			medicinalproductindicationothertherapymedicationcodeableconceptcoding.setCode(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply() != null) {
			medicinalproductindicationothertherapymedicationcodeableconceptcoding.setDisplay(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys() != null) {
			medicinalproductindicationothertherapymedicationcodeableconceptcoding.setSystem(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd() != null) {
			medicinalproductindicationothertherapymedicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn() != null) {
			medicinalproductindicationothertherapymedicationcodeableconceptcoding.setVersion(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt() != null) {
			medicinalproductindicationothertherapymedicationcodeableconcept.setText(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnRfrnc() != null) {
			medicinalproductindicationothertherapy.setMedication( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIndctnOtherThrpyMdctnRfrnc()));
		}
		/******************** medicinalproductindicationothertherapytherapyrelationshiptype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationothertherapytherapyrelationshiptype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindicationothertherapy.setTherapyRelationshipType(medicinalproductindicationothertherapytherapyrelationshiptype);

		/******************** medicinalproductindicationothertherapytherapyrelationshiptypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationothertherapytherapyrelationshiptypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationothertherapytherapyrelationshiptype.addCoding(medicinalproductindicationothertherapytherapyrelationshiptypecoding);

		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd() != null) {
			medicinalproductindicationothertherapytherapyrelationshiptypecoding.setCode(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply() != null) {
			medicinalproductindicationothertherapytherapyrelationshiptypecoding.setDisplay(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys() != null) {
			medicinalproductindicationothertherapytherapyrelationshiptypecoding.setSystem(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd() != null) {
			medicinalproductindicationothertherapytherapyrelationshiptypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn() != null) {
			medicinalproductindicationothertherapytherapyrelationshiptypecoding.setVersion(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt() != null) {
			medicinalproductindicationothertherapytherapyrelationshiptype.setText(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt());
		}
		/******************** medicinalproductindicationpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Population medicinalproductindicationpopulation =  new org.hl7.fhir.r4.model.Population();
		medicinalproductindication.addPopulation(medicinalproductindicationpopulation);

		/******************** medicinalproductindicationpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationagecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindicationpopulation.setAge(medicinalproductindicationpopulationagecodeableconcept);

		/******************** medicinalproductindicationpopulationagecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationagecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationpopulationagecodeableconcept.addCoding(medicinalproductindicationpopulationagecodeableconceptcoding);

		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd() != null) {
			medicinalproductindicationpopulationagecodeableconceptcoding.setCode(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply() != null) {
			medicinalproductindicationpopulationagecodeableconceptcoding.setDisplay(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys() != null) {
			medicinalproductindicationpopulationagecodeableconceptcoding.setSystem(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd() != null) {
			medicinalproductindicationpopulationagecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn() != null) {
			medicinalproductindicationpopulationagecodeableconceptcoding.setVersion(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt() != null) {
			medicinalproductindicationpopulationagecodeableconcept.setText(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt());
		}
		/******************** medicinalproductindicationpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductindicationpopulationagerange =  new org.hl7.fhir.r4.model.Range();
		medicinalproductindicationpopulation.setAge(medicinalproductindicationpopulationagerange);

		/******************** medicinalproductindicationpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationpopulationagerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductindicationpopulationagerange.setHigh(medicinalproductindicationpopulationagerangehigh);

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiCd() != null) {
			medicinalproductindicationpopulationagerangehigh.setCode(m.getMdcnlPrdctIndctnPoplnAgeRngHiCd());
		}
		/******************** medicinalproductindicationpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductindicationpopulationagerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductindicationpopulationagerangehigh.setComparator(medicinalproductindicationpopulationagerangehighcomparator.fromCode(m.getMdcnlPrdctIndctnPoplnAgeRngHiCmprtr()));

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiSys() != null) {
			medicinalproductindicationpopulationagerangehigh.setSystem(m.getMdcnlPrdctIndctnPoplnAgeRngHiSys());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiUnt() != null) {
			medicinalproductindicationpopulationagerangehigh.setUnit(m.getMdcnlPrdctIndctnPoplnAgeRngHiUnt());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiVl() != null) {
			medicinalproductindicationpopulationagerangehigh.setValue(Double.parseDouble((m.getMdcnlPrdctIndctnPoplnAgeRngHiVl())));
		}
		/******************** medicinalproductindicationpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationpopulationagerangelow =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductindicationpopulationagerange.setLow(medicinalproductindicationpopulationagerangelow);

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwCd() != null) {
			medicinalproductindicationpopulationagerangelow.setCode(m.getMdcnlPrdctIndctnPoplnAgeRngLwCd());
		}
		/******************** medicinalproductindicationpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductindicationpopulationagerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductindicationpopulationagerangelow.setComparator(medicinalproductindicationpopulationagerangelowcomparator.fromCode(m.getMdcnlPrdctIndctnPoplnAgeRngLwCmprtr()));

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwSys() != null) {
			medicinalproductindicationpopulationagerangelow.setSystem(m.getMdcnlPrdctIndctnPoplnAgeRngLwSys());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwUnt() != null) {
			medicinalproductindicationpopulationagerangelow.setUnit(m.getMdcnlPrdctIndctnPoplnAgeRngLwUnt());
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwVl() != null) {
			medicinalproductindicationpopulationagerangelow.setValue(Double.parseDouble((m.getMdcnlPrdctIndctnPoplnAgeRngLwVl())));
		}
		/******************** medicinalproductindicationpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationgender =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindicationpopulation.setGender(medicinalproductindicationpopulationgender);

		/******************** medicinalproductindicationpopulationgendercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationgendercoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationpopulationgender.addCoding(medicinalproductindicationpopulationgendercoding);

		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgCd() != null) {
			medicinalproductindicationpopulationgendercoding.setCode(m.getMdcnlPrdctIndctnPoplnGenderCdgCd());
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgDsply() != null) {
			medicinalproductindicationpopulationgendercoding.setDisplay(m.getMdcnlPrdctIndctnPoplnGenderCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgSys() != null) {
			medicinalproductindicationpopulationgendercoding.setSystem(m.getMdcnlPrdctIndctnPoplnGenderCdgSys());
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgUsrSltd() != null) {
			medicinalproductindicationpopulationgendercoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnPoplnGenderCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgVrsn() != null) {
			medicinalproductindicationpopulationgendercoding.setVersion(m.getMdcnlPrdctIndctnPoplnGenderCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderTxt() != null) {
			medicinalproductindicationpopulationgender.setText(m.getMdcnlPrdctIndctnPoplnGenderTxt());
		}
		/******************** medicinalproductindicationpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationphysiologicalcondition =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindicationpopulation.setPhysiologicalCondition(medicinalproductindicationpopulationphysiologicalcondition);

		/******************** medicinalproductindicationpopulationphysiologicalconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationphysiologicalconditioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationpopulationphysiologicalcondition.addCoding(medicinalproductindicationpopulationphysiologicalconditioncoding);

		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd() != null) {
			medicinalproductindicationpopulationphysiologicalconditioncoding.setCode(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd());
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply() != null) {
			medicinalproductindicationpopulationphysiologicalconditioncoding.setDisplay(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys() != null) {
			medicinalproductindicationpopulationphysiologicalconditioncoding.setSystem(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys());
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd() != null) {
			medicinalproductindicationpopulationphysiologicalconditioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn() != null) {
			medicinalproductindicationpopulationphysiologicalconditioncoding.setVersion(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt() != null) {
			medicinalproductindicationpopulationphysiologicalcondition.setText(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt());
		}
		/******************** medicinalproductindicationpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationrace =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductindicationpopulation.setRace(medicinalproductindicationpopulationrace);

		/******************** medicinalproductindicationpopulationracecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationracecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductindicationpopulationrace.addCoding(medicinalproductindicationpopulationracecoding);

		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgCd() != null) {
			medicinalproductindicationpopulationracecoding.setCode(m.getMdcnlPrdctIndctnPoplnRaceCdgCd());
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgDsply() != null) {
			medicinalproductindicationpopulationracecoding.setDisplay(m.getMdcnlPrdctIndctnPoplnRaceCdgDsply());
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgSys() != null) {
			medicinalproductindicationpopulationracecoding.setSystem(m.getMdcnlPrdctIndctnPoplnRaceCdgSys());
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgUsrSltd() != null) {
			medicinalproductindicationpopulationracecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIndctnPoplnRaceCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgVrsn() != null) {
			medicinalproductindicationpopulationracecoding.setVersion(m.getMdcnlPrdctIndctnPoplnRaceCdgVrsn());
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceTxt() != null) {
			medicinalproductindicationpopulationrace.setText(m.getMdcnlPrdctIndctnPoplnRaceTxt());
		}
		/******************** MdcnlPrdctIndctn_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctIndctnSbjct() != null) {
			medicinalproductindication.addSubject( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIndctnSbjct()));
		}
		/******************** MdcnlPrdctIndctn_UndesirableEfct ********************************************************************************/
		if(m.getMdcnlPrdctIndctnUndesirableEfct() != null) {
			medicinalproductindication.addUndesirableEffect( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIndctnUndesirableEfct()));
		}
		return medicinalproductindication;
	}
}
