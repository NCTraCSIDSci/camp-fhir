package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIndication;
public class MedicinalProductIndicationBidirectionalConversion 
{
	public MedicinalProductIndication MedicinalProductIndications(org.hl7.fhir.r4.model.MedicinalProductIndication medicinalproductindication) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductIndication m = new  main.java.com.campfhir.model.MedicinalProductIndication();

		/******************** id ********************************************************************************/
		medicinalproductindication.setId(m.getId());

		/******************** MdcnlPrdctIndctn_Sbjct ********************************************************************************/
		if(medicinalproductindication.hasSubject()) {
			m.setMdcnlPrdctIndctnSbjct(String.valueOf(medicinalproductindication.getSubjectFirstRep()));
		}
		/******************** medicinalproductindicationintendedeffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationintendedeffect = medicinalproductindication.getIntendedEffect();

		/******************** MdcnlPrdctIndctn_IntendedEfct_Txt ********************************************************************************/
		if(medicinalproductindicationintendedeffect.hasText()) {
			m.setMdcnlPrdctIndctnIntendedEfctTxt(String.valueOf(medicinalproductindicationintendedeffect.getText()));
		}
		/******************** medicinalproductindicationintendedeffectcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationintendedeffectcoding = medicinalproductindicationintendedeffect.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationintendedeffectcoding.hasVersion()) {
			m.setMdcnlPrdctIndctnIntendedEfctCdgVrsn(String.valueOf(medicinalproductindicationintendedeffectcoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationintendedeffectcoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnIntendedEfctCdgDsply(String.valueOf(medicinalproductindicationintendedeffectcoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationintendedeffectcoding.hasCode()) {
			m.setMdcnlPrdctIndctnIntendedEfctCdgCd(String.valueOf(medicinalproductindicationintendedeffectcoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationintendedeffectcoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnIntendedEfctCdgUsrSltd(String.valueOf(medicinalproductindicationintendedeffectcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationintendedeffectcoding.hasSystem()) {
			m.setMdcnlPrdctIndctnIntendedEfctCdgSys(String.valueOf(medicinalproductindicationintendedeffectcoding.getSystem()));
		}
		/******************** medicinalproductindicationduration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationduration = medicinalproductindication.getDuration();

		/******************** MdcnlPrdctIndctn_Duration_Vl ********************************************************************************/
		if(medicinalproductindicationduration.hasValue()) {
			m.setMdcnlPrdctIndctnDurationVl(String.valueOf(medicinalproductindicationduration.getValue()));
		}
		/******************** medicinalproductindicationdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductindicationdurationcomparator = medicinalproductindicationduration.getComparator();
		m.setMdcnlPrdctIndctnDurationCmprtr(medicinalproductindicationdurationcomparator.toCode());

		/******************** MdcnlPrdctIndctn_Duration_Cd ********************************************************************************/
		if(medicinalproductindicationduration.hasCode()) {
			m.setMdcnlPrdctIndctnDurationCd(String.valueOf(medicinalproductindicationduration.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Duration_Unt ********************************************************************************/
		if(medicinalproductindicationduration.hasUnit()) {
			m.setMdcnlPrdctIndctnDurationUnt(String.valueOf(medicinalproductindicationduration.getUnit()));
		}
		/******************** MdcnlPrdctIndctn_Duration_Sys ********************************************************************************/
		if(medicinalproductindicationduration.hasSystem()) {
			m.setMdcnlPrdctIndctnDurationSys(String.valueOf(medicinalproductindicationduration.getSystem()));
		}
		/******************** medicinalproductindicationdiseasestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationdiseasestatus = medicinalproductindication.getDiseaseStatus();

		/******************** MdcnlPrdctIndctn_DiseaseSts_Txt ********************************************************************************/
		if(medicinalproductindicationdiseasestatus.hasText()) {
			m.setMdcnlPrdctIndctnDiseaseStsTxt(String.valueOf(medicinalproductindicationdiseasestatus.getText()));
		}
		/******************** medicinalproductindicationdiseasestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationdiseasestatuscoding = medicinalproductindicationdiseasestatus.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscoding.hasVersion()) {
			m.setMdcnlPrdctIndctnDiseaseStsCdgVrsn(String.valueOf(medicinalproductindicationdiseasestatuscoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnDiseaseStsCdgDsply(String.valueOf(medicinalproductindicationdiseasestatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscoding.hasCode()) {
			m.setMdcnlPrdctIndctnDiseaseStsCdgCd(String.valueOf(medicinalproductindicationdiseasestatuscoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnDiseaseStsCdgUsrSltd(String.valueOf(medicinalproductindicationdiseasestatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscoding.hasSystem()) {
			m.setMdcnlPrdctIndctnDiseaseStsCdgSys(String.valueOf(medicinalproductindicationdiseasestatuscoding.getSystem()));
		}
		/******************** medicinalproductindicationcomorbidity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationcomorbidity = medicinalproductindication.getComorbidityFirstRep();

		/******************** MdcnlPrdctIndctn_Comorbidity_Txt ********************************************************************************/
		if(medicinalproductindicationcomorbidity.hasText()) {
			m.setMdcnlPrdctIndctnComorbidityTxt(String.valueOf(medicinalproductindicationcomorbidity.getText()));
		}
		/******************** medicinalproductindicationcomorbiditycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationcomorbiditycoding = medicinalproductindicationcomorbidity.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationcomorbiditycoding.hasVersion()) {
			m.setMdcnlPrdctIndctnComorbidityCdgVrsn(String.valueOf(medicinalproductindicationcomorbiditycoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationcomorbiditycoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnComorbidityCdgDsply(String.valueOf(medicinalproductindicationcomorbiditycoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationcomorbiditycoding.hasCode()) {
			m.setMdcnlPrdctIndctnComorbidityCdgCd(String.valueOf(medicinalproductindicationcomorbiditycoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationcomorbiditycoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnComorbidityCdgUsrSltd(String.valueOf(medicinalproductindicationcomorbiditycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationcomorbiditycoding.hasSystem()) {
			m.setMdcnlPrdctIndctnComorbidityCdgSys(String.valueOf(medicinalproductindicationcomorbiditycoding.getSystem()));
		}
		/******************** medicinalproductindicationdiseasesymptomprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationdiseasesymptomprocedure = medicinalproductindication.getDiseaseSymptomProcedure();

		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Txt ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedure.hasText()) {
			m.setMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt(String.valueOf(medicinalproductindicationdiseasesymptomprocedure.getText()));
		}
		/******************** medicinalproductindicationdiseasesymptomprocedurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationdiseasesymptomprocedurecoding = medicinalproductindicationdiseasesymptomprocedure.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasVersion()) {
			m.setMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasCode()) {
			m.setMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasSystem()) {
			m.setMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getSystem()));
		}
		/******************** medicinalproductindicationothertherapy ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent medicinalproductindicationothertherapy = medicinalproductindication.getOtherTherapyFirstRep();

		/******************** medicinalproductindicationothertherapytherapyrelationshiptype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationothertherapytherapyrelationshiptype = medicinalproductindicationothertherapy.getTherapyRelationshipType();

		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptype.hasText()) {
			m.setMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptype.getText()));
		}
		/******************** medicinalproductindicationothertherapytherapyrelationshiptypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationothertherapytherapyrelationshiptypecoding = medicinalproductindicationothertherapytherapyrelationshiptype.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasVersion()) {
			m.setMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasCode()) {
			m.setMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasSystem()) {
			m.setMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getSystem()));
		}
		/******************** medicinalproductindicationothertherapymedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationothertherapymedicationcodeableconcept = medicinalproductindicationothertherapy.getMedicationCodeableConcept();

		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconcept.hasText()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconcept.getText()));
		}
		/******************** medicinalproductindicationothertherapymedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationothertherapymedicationcodeableconceptcoding = medicinalproductindicationothertherapymedicationcodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(medicinalproductindicationothertherapy.hasMedicationReference()) {
			m.setMdcnlPrdctIndctnOtherThrpyMdctnRfrnc(String.valueOf(medicinalproductindicationothertherapy.getMedicationReference()));
		}
		/******************** MdcnlPrdctIndctn_UndesirableEfct ********************************************************************************/
		if(medicinalproductindication.hasUndesirableEffect()) {
			m.setMdcnlPrdctIndctnUndesirableEfct(String.valueOf(medicinalproductindication.getUndesirableEffectFirstRep()));
		}
		/******************** medicinalproductindicationpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Population medicinalproductindicationpopulation = medicinalproductindication.getPopulationFirstRep();

		/******************** medicinalproductindicationpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductindicationpopulationagerange = medicinalproductindicationpopulation.getAgeRange();

		/******************** medicinalproductindicationpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationpopulationagerangelow = medicinalproductindicationpopulationagerange.getLow();

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(medicinalproductindicationpopulationagerangelow.hasValue()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngLwVl(String.valueOf(medicinalproductindicationpopulationagerangelow.getValue()));
		}
		/******************** medicinalproductindicationpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductindicationpopulationagerangelowcomparator = medicinalproductindicationpopulationagerangelow.getComparator();
		m.setMdcnlPrdctIndctnPoplnAgeRngLwCmprtr(medicinalproductindicationpopulationagerangelowcomparator.toCode());

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationagerangelow.hasCode()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngLwCd(String.valueOf(medicinalproductindicationpopulationagerangelow.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(medicinalproductindicationpopulationagerangelow.hasUnit()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngLwUnt(String.valueOf(medicinalproductindicationpopulationagerangelow.getUnit()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationagerangelow.hasSystem()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngLwSys(String.valueOf(medicinalproductindicationpopulationagerangelow.getSystem()));
		}
		/******************** medicinalproductindicationpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationpopulationagerangehigh = medicinalproductindicationpopulationagerange.getHigh();

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(medicinalproductindicationpopulationagerangehigh.hasValue()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngHiVl(String.valueOf(medicinalproductindicationpopulationagerangehigh.getValue()));
		}
		/******************** medicinalproductindicationpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductindicationpopulationagerangehighcomparator = medicinalproductindicationpopulationagerangehigh.getComparator();
		m.setMdcnlPrdctIndctnPoplnAgeRngHiCmprtr(medicinalproductindicationpopulationagerangehighcomparator.toCode());

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationagerangehigh.hasCode()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngHiCd(String.valueOf(medicinalproductindicationpopulationagerangehigh.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(medicinalproductindicationpopulationagerangehigh.hasUnit()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngHiUnt(String.valueOf(medicinalproductindicationpopulationagerangehigh.getUnit()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationagerangehigh.hasSystem()) {
			m.setMdcnlPrdctIndctnPoplnAgeRngHiSys(String.valueOf(medicinalproductindicationpopulationagerangehigh.getSystem()));
		}
		/******************** medicinalproductindicationpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationphysiologicalcondition = medicinalproductindicationpopulation.getPhysiologicalCondition();

		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalcondition.hasText()) {
			m.setMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt(String.valueOf(medicinalproductindicationpopulationphysiologicalcondition.getText()));
		}
		/******************** medicinalproductindicationpopulationphysiologicalconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationphysiologicalconditioncoding = medicinalproductindicationpopulationphysiologicalcondition.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasVersion()) {
			m.setMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasCode()) {
			m.setMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasSystem()) {
			m.setMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getSystem()));
		}
		/******************** medicinalproductindicationpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationagecodeableconcept = medicinalproductindicationpopulation.getAgeCodeableConcept();

		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconcept.hasText()) {
			m.setMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt(String.valueOf(medicinalproductindicationpopulationagecodeableconcept.getText()));
		}
		/******************** medicinalproductindicationpopulationagecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationagecodeableconceptcoding = medicinalproductindicationpopulationagecodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getSystem()));
		}
		/******************** medicinalproductindicationpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationrace = medicinalproductindicationpopulation.getRace();

		/******************** MdcnlPrdctIndctn_Popln_Race_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationrace.hasText()) {
			m.setMdcnlPrdctIndctnPoplnRaceTxt(String.valueOf(medicinalproductindicationpopulationrace.getText()));
		}
		/******************** medicinalproductindicationpopulationracecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationracecoding = medicinalproductindicationpopulationrace.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationracecoding.hasVersion()) {
			m.setMdcnlPrdctIndctnPoplnRaceCdgVrsn(String.valueOf(medicinalproductindicationpopulationracecoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationracecoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnPoplnRaceCdgDsply(String.valueOf(medicinalproductindicationpopulationracecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationracecoding.hasCode()) {
			m.setMdcnlPrdctIndctnPoplnRaceCdgCd(String.valueOf(medicinalproductindicationpopulationracecoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationracecoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnPoplnRaceCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationracecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationracecoding.hasSystem()) {
			m.setMdcnlPrdctIndctnPoplnRaceCdgSys(String.valueOf(medicinalproductindicationpopulationracecoding.getSystem()));
		}
		/******************** medicinalproductindicationpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationgender = medicinalproductindicationpopulation.getGender();

		/******************** MdcnlPrdctIndctn_Popln_Gender_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationgender.hasText()) {
			m.setMdcnlPrdctIndctnPoplnGenderTxt(String.valueOf(medicinalproductindicationpopulationgender.getText()));
		}
		/******************** medicinalproductindicationpopulationgendercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductindicationpopulationgendercoding = medicinalproductindicationpopulationgender.getCodingFirstRep();

		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationgendercoding.hasVersion()) {
			m.setMdcnlPrdctIndctnPoplnGenderCdgVrsn(String.valueOf(medicinalproductindicationpopulationgendercoding.getVersion()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationgendercoding.hasDisplay()) {
			m.setMdcnlPrdctIndctnPoplnGenderCdgDsply(String.valueOf(medicinalproductindicationpopulationgendercoding.getDisplay()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationgendercoding.hasCode()) {
			m.setMdcnlPrdctIndctnPoplnGenderCdgCd(String.valueOf(medicinalproductindicationpopulationgendercoding.getCode()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationgendercoding.hasUserSelected()) {
			m.setMdcnlPrdctIndctnPoplnGenderCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationgendercoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationgendercoding.hasSystem()) {
			m.setMdcnlPrdctIndctnPoplnGenderCdgSys(String.valueOf(medicinalproductindicationpopulationgendercoding.getSystem()));
		}
		return m;
	}
}
