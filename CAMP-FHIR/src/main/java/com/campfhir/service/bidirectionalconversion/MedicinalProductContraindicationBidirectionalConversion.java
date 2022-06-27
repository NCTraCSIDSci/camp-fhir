package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductContraindication;
public class MedicinalProductContraindicationBidirectionalConversion 
{
	public MedicinalProductContraindication MedicinalProductContraindications(org.hl7.fhir.r4.model.MedicinalProductContraindication medicinalproductcontraindication) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductContraindication m = new  main.java.com.campfhir.model.MedicinalProductContraindication();

		/******************** id ********************************************************************************/
		medicinalproductcontraindication.setId(m.getId());

		/******************** MdcnlPrdctCntraindctn_TherapeuticIndctn ********************************************************************************/
		if(medicinalproductcontraindication.hasTherapeuticIndication()) {
			m.setMdcnlPrdctCntraindctnTherapeuticIndctn(String.valueOf(medicinalproductcontraindication.getTherapeuticIndicationFirstRep()));
		}
		/******************** MdcnlPrdctCntraindctn_Sbjct ********************************************************************************/
		if(medicinalproductcontraindication.hasSubject()) {
			m.setMdcnlPrdctCntraindctnSbjct(String.valueOf(medicinalproductcontraindication.getSubjectFirstRep()));
		}
		/******************** medicinalproductcontraindicationdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationdisease = medicinalproductcontraindication.getDisease();

		/******************** MdcnlPrdctCntraindctn_Disease_Txt ********************************************************************************/
		if(medicinalproductcontraindicationdisease.hasText()) {
			m.setMdcnlPrdctCntraindctnDiseaseTxt(String.valueOf(medicinalproductcontraindicationdisease.getText()));
		}
		/******************** medicinalproductcontraindicationdiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationdiseasecoding = medicinalproductcontraindicationdisease.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnDiseaseCdgVrsn(String.valueOf(medicinalproductcontraindicationdiseasecoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnDiseaseCdgDsply(String.valueOf(medicinalproductcontraindicationdiseasecoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnDiseaseCdgCd(String.valueOf(medicinalproductcontraindicationdiseasecoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnDiseaseCdgUsrSltd(String.valueOf(medicinalproductcontraindicationdiseasecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnDiseaseCdgSys(String.valueOf(medicinalproductcontraindicationdiseasecoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationdiseasestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationdiseasestatus = medicinalproductcontraindication.getDiseaseStatus();

		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Txt ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatus.hasText()) {
			m.setMdcnlPrdctCntraindctnDiseaseStsTxt(String.valueOf(medicinalproductcontraindicationdiseasestatus.getText()));
		}
		/******************** medicinalproductcontraindicationdiseasestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationdiseasestatuscoding = medicinalproductcontraindicationdiseasestatus.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnDiseaseStsCdgVrsn(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnDiseaseStsCdgDsply(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnDiseaseStsCdgCd(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnDiseaseStsCdgSys(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationcomorbidity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationcomorbidity = medicinalproductcontraindication.getComorbidityFirstRep();

		/******************** MdcnlPrdctCntraindctn_Comorbidity_Txt ********************************************************************************/
		if(medicinalproductcontraindicationcomorbidity.hasText()) {
			m.setMdcnlPrdctCntraindctnComorbidityTxt(String.valueOf(medicinalproductcontraindicationcomorbidity.getText()));
		}
		/******************** medicinalproductcontraindicationcomorbiditycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationcomorbiditycoding = medicinalproductcontraindicationcomorbidity.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnComorbidityCdgVrsn(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnComorbidityCdgDsply(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnComorbidityCdgCd(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnComorbidityCdgUsrSltd(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnComorbidityCdgSys(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationothertherapy ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent medicinalproductcontraindicationothertherapy = medicinalproductcontraindication.getOtherTherapyFirstRep();

		/******************** medicinalproductcontraindicationothertherapytherapyrelationshiptype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationothertherapytherapyrelationshiptype = medicinalproductcontraindicationothertherapy.getTherapyRelationshipType();

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptype.hasText()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptype.getText()));
		}
		/******************** medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding = medicinalproductcontraindicationothertherapytherapyrelationshiptype.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationothertherapymedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationothertherapymedicationcodeableconcept = medicinalproductcontraindicationothertherapy.getMedicationCodeableConcept();

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconcept.hasText()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconcept.getText()));
		}
		/******************** medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding = medicinalproductcontraindicationothertherapymedicationcodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(medicinalproductcontraindicationothertherapy.hasMedicationReference()) {
			m.setMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc(String.valueOf(medicinalproductcontraindicationothertherapy.getMedicationReference()));
		}
		/******************** medicinalproductcontraindicationpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Population medicinalproductcontraindicationpopulation = medicinalproductcontraindication.getPopulationFirstRep();

		/******************** medicinalproductcontraindicationpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductcontraindicationpopulationagerange = medicinalproductcontraindicationpopulation.getAgeRange();

		/******************** medicinalproductcontraindicationpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductcontraindicationpopulationagerangelow = medicinalproductcontraindicationpopulationagerange.getLow();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangelow.hasValue()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngLwVl(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getValue()));
		}
		/******************** medicinalproductcontraindicationpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductcontraindicationpopulationagerangelowcomparator = medicinalproductcontraindicationpopulationagerangelow.getComparator();
		m.setMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr(medicinalproductcontraindicationpopulationagerangelowcomparator.toCode());

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangelow.hasCode()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngLwCd(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangelow.hasUnit()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngLwUnt(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getUnit()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangelow.hasSystem()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngLwSys(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getSystem()));
		}
		/******************** medicinalproductcontraindicationpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductcontraindicationpopulationagerangehigh = medicinalproductcontraindicationpopulationagerange.getHigh();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangehigh.hasValue()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngHiVl(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getValue()));
		}
		/******************** medicinalproductcontraindicationpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductcontraindicationpopulationagerangehighcomparator = medicinalproductcontraindicationpopulationagerangehigh.getComparator();
		m.setMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr(medicinalproductcontraindicationpopulationagerangehighcomparator.toCode());

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangehigh.hasCode()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngHiCd(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangehigh.hasUnit()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngHiUnt(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getUnit()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagerangehigh.hasSystem()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeRngHiSys(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getSystem()));
		}
		/******************** medicinalproductcontraindicationpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationphysiologicalcondition = medicinalproductcontraindicationpopulation.getPhysiologicalCondition();

		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalcondition.hasText()) {
			m.setMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalcondition.getText()));
		}
		/******************** medicinalproductcontraindicationpopulationphysiologicalconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationphysiologicalconditioncoding = medicinalproductcontraindicationpopulationphysiologicalcondition.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationagecodeableconcept = medicinalproductcontraindicationpopulation.getAgeCodeableConcept();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconcept.hasText()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconcept.getText()));
		}
		/******************** medicinalproductcontraindicationpopulationagecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationagecodeableconceptcoding = medicinalproductcontraindicationpopulationagecodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationrace = medicinalproductcontraindicationpopulation.getRace();

		/******************** MdcnlPrdctCntraindctn_Popln_Race_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationrace.hasText()) {
			m.setMdcnlPrdctCntraindctnPoplnRaceTxt(String.valueOf(medicinalproductcontraindicationpopulationrace.getText()));
		}
		/******************** medicinalproductcontraindicationpopulationracecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationracecoding = medicinalproductcontraindicationpopulationrace.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnPoplnRaceCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnPoplnRaceCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnPoplnRaceCdgCd(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnPoplnRaceCdgSys(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getSystem()));
		}
		/******************** medicinalproductcontraindicationpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationgender = medicinalproductcontraindicationpopulation.getGender();

		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgender.hasText()) {
			m.setMdcnlPrdctCntraindctnPoplnGenderTxt(String.valueOf(medicinalproductcontraindicationpopulationgender.getText()));
		}
		/******************** medicinalproductcontraindicationpopulationgendercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcontraindicationpopulationgendercoding = medicinalproductcontraindicationpopulationgender.getCodingFirstRep();

		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercoding.hasVersion()) {
			m.setMdcnlPrdctCntraindctnPoplnGenderCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getVersion()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercoding.hasDisplay()) {
			m.setMdcnlPrdctCntraindctnPoplnGenderCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getDisplay()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercoding.hasCode()) {
			m.setMdcnlPrdctCntraindctnPoplnGenderCdgCd(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getCode()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercoding.hasUserSelected()) {
			m.setMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getUserSelected()));
		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercoding.hasSystem()) {
			m.setMdcnlPrdctCntraindctnPoplnGenderCdgSys(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getSystem()));
		}
		return m;
	}
}
