package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductUndesirableEffect;
public class MedicinalProductUndesirableEffectBidirectionalConversion 
{
	public MedicinalProductUndesirableEffect MedicinalProductUndesirableEffects(org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect medicinalproductundesirableeffect) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductUndesirableEffect m = new  main.java.com.campfhir.model.MedicinalProductUndesirableEffect();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductundesirableeffect.getIdElement().getIdPart());

		/******************** MdcnlPrdctUndesirableEfct_Sbjct ********************************************************************************/
		if(medicinalproductundesirableeffect.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductundesirableeffect.getSubject().size(); incr++) {
				array = array + medicinalproductundesirableeffect.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctUndesirableEfctSbjct(array);

		} else {
			m.addMdcnlPrdctUndesirableEfctSbjct("NULL");
		}


		/******************** medicinalproductundesirableeffectfrequencyofoccurrence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectfrequencyofoccurrence = medicinalproductundesirableeffect.getFrequencyOfOccurrence();

		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrence.hasText()) {

			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrence.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt("NULL");
		}


		/******************** medicinalproductundesirableeffectfrequencyofoccurrencecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectfrequencyofoccurrencecodinglist = medicinalproductundesirableeffectfrequencyofoccurrence.getCoding();
		for(int medicinalproductundesirableeffectfrequencyofoccurrencecodingi = 0; medicinalproductundesirableeffectfrequencyofoccurrencecodingi<medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.size();medicinalproductundesirableeffectfrequencyofoccurrencecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectfrequencyofoccurrencecoding = medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.get(medicinalproductundesirableeffectfrequencyofoccurrencecodingi);

		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == 0) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply("[");}
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply("]");}


		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == 0) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn("[");}
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn("]");}


		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == 0) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd("[");}
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd("]");}


		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == 0) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd("[");}
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd("]");}


		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == 0) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys("[");}
		if(medicinalproductundesirableeffectfrequencyofoccurrencecoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys(String.valueOf(medicinalproductundesirableeffectfrequencyofoccurrencecoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectfrequencyofoccurrencecodingi == medicinalproductundesirableeffectfrequencyofoccurrencecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys("]");}


		 };
		/******************** medicinalproductundesirableeffectsymptomconditioneffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectsymptomconditioneffect = medicinalproductundesirableeffect.getSymptomConditionEffect();

		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffect.hasText()) {

			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffect.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt("NULL");
		}


		/******************** medicinalproductundesirableeffectsymptomconditioneffectcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectsymptomconditioneffectcodinglist = medicinalproductundesirableeffectsymptomconditioneffect.getCoding();
		for(int medicinalproductundesirableeffectsymptomconditioneffectcodingi = 0; medicinalproductundesirableeffectsymptomconditioneffectcodingi<medicinalproductundesirableeffectsymptomconditioneffectcodinglist.size();medicinalproductundesirableeffectsymptomconditioneffectcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectsymptomconditioneffectcoding = medicinalproductundesirableeffectsymptomconditioneffectcodinglist.get(medicinalproductundesirableeffectsymptomconditioneffectcodingi);

		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == 0) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply("[");}
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == medicinalproductundesirableeffectsymptomconditioneffectcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply("]");}


		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == 0) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn("[");}
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == medicinalproductundesirableeffectsymptomconditioneffectcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn("]");}


		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == 0) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd("[");}
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == medicinalproductundesirableeffectsymptomconditioneffectcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd("]");}


		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == 0) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd("[");}
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == medicinalproductundesirableeffectsymptomconditioneffectcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd("]");}


		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == 0) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys("[");}
		if(medicinalproductundesirableeffectsymptomconditioneffectcoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys(String.valueOf(medicinalproductundesirableeffectsymptomconditioneffectcoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectsymptomconditioneffectcodingi == medicinalproductundesirableeffectsymptomconditioneffectcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys("]");}


		 };
		/******************** medicinalproductundesirableeffectclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectclassification = medicinalproductundesirableeffect.getClassification();

		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectclassification.hasText()) {

			m.addMdcnlPrdctUndesirableEfctClsfctnTxt(String.valueOf(medicinalproductundesirableeffectclassification.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctClsfctnTxt("NULL");
		}


		/******************** medicinalproductundesirableeffectclassificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectclassificationcodinglist = medicinalproductundesirableeffectclassification.getCoding();
		for(int medicinalproductundesirableeffectclassificationcodingi = 0; medicinalproductundesirableeffectclassificationcodingi<medicinalproductundesirableeffectclassificationcodinglist.size();medicinalproductundesirableeffectclassificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectclassificationcoding = medicinalproductundesirableeffectclassificationcodinglist.get(medicinalproductundesirableeffectclassificationcodingi);

		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcodingi == 0) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgDsply("[");}
		if(medicinalproductundesirableeffectclassificationcoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctClsfctnCdgDsply(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctClsfctnCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectclassificationcodingi == medicinalproductundesirableeffectclassificationcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgDsply("]");}


		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcodingi == 0) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgVrsn("[");}
		if(medicinalproductundesirableeffectclassificationcoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctClsfctnCdgVrsn(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctClsfctnCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectclassificationcodingi == medicinalproductundesirableeffectclassificationcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgVrsn("]");}


		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcodingi == 0) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgCd("[");}
		if(medicinalproductundesirableeffectclassificationcoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctClsfctnCdgCd(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctClsfctnCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectclassificationcodingi == medicinalproductundesirableeffectclassificationcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgCd("]");}


		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcodingi == 0) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd("[");}
		if(medicinalproductundesirableeffectclassificationcoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectclassificationcodingi == medicinalproductundesirableeffectclassificationcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd("]");}


		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectclassificationcodingi == 0) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgSys("[");}
		if(medicinalproductundesirableeffectclassificationcoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctClsfctnCdgSys(String.valueOf(medicinalproductundesirableeffectclassificationcoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctClsfctnCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectclassificationcodingi == medicinalproductundesirableeffectclassificationcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctClsfctnCdgSys("]");}


		 };
		/******************** medicinalproductundesirableeffectpopulation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Population> medicinalproductundesirableeffectpopulationlist = medicinalproductundesirableeffect.getPopulation();
		for(int medicinalproductundesirableeffectpopulationi = 0; medicinalproductundesirableeffectpopulationi<medicinalproductundesirableeffectpopulationlist.size();medicinalproductundesirableeffectpopulationi++ ) {
		org.hl7.fhir.r4.model.Population  medicinalproductundesirableeffectpopulation = medicinalproductundesirableeffectpopulationlist.get(medicinalproductundesirableeffectpopulationi);

		/******************** medicinalproductundesirableeffectpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationrace = medicinalproductundesirableeffectpopulation.getRace();

		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnRaceTxt("[");}
		if(medicinalproductundesirableeffectpopulationrace.hasText()) {

			m.addMdcnlPrdctUndesirableEfctPoplnRaceTxt(String.valueOf(medicinalproductundesirableeffectpopulationrace.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnRaceTxt("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnRaceTxt("]");}


		/******************** medicinalproductundesirableeffectpopulationracecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectpopulationracecodinglist = medicinalproductundesirableeffectpopulationrace.getCoding();
		for(int medicinalproductundesirableeffectpopulationracecodingi = 0; medicinalproductundesirableeffectpopulationracecodingi<medicinalproductundesirableeffectpopulationracecodinglist.size();medicinalproductundesirableeffectpopulationracecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectpopulationracecoding = medicinalproductundesirableeffectpopulationracecodinglist.get(medicinalproductundesirableeffectpopulationracecodingi);

		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply("[[");}
		if(medicinalproductundesirableeffectpopulationracecoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectpopulationracecodingi == medicinalproductundesirableeffectpopulationracecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn("[[");}
		if(medicinalproductundesirableeffectpopulationracecoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectpopulationracecodingi == medicinalproductundesirableeffectpopulationracecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgCd("[[");}
		if(medicinalproductundesirableeffectpopulationracecoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationracecodingi == medicinalproductundesirableeffectpopulationracecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgCd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd("[[");}
		if(medicinalproductundesirableeffectpopulationracecoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationracecodingi == medicinalproductundesirableeffectpopulationracecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationracecodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgSys("[[");}
		if(medicinalproductundesirableeffectpopulationracecoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationracecoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectpopulationracecodingi == medicinalproductundesirableeffectpopulationracecodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnRaceCdgSys("]]");}


		 };
		/******************** medicinalproductundesirableeffectpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationgender = medicinalproductundesirableeffectpopulation.getGender();

		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnGenderTxt("[");}
		if(medicinalproductundesirableeffectpopulationgender.hasText()) {

			m.addMdcnlPrdctUndesirableEfctPoplnGenderTxt(String.valueOf(medicinalproductundesirableeffectpopulationgender.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnGenderTxt("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnGenderTxt("]");}


		/******************** medicinalproductundesirableeffectpopulationgendercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectpopulationgendercodinglist = medicinalproductundesirableeffectpopulationgender.getCoding();
		for(int medicinalproductundesirableeffectpopulationgendercodingi = 0; medicinalproductundesirableeffectpopulationgendercodingi<medicinalproductundesirableeffectpopulationgendercodinglist.size();medicinalproductundesirableeffectpopulationgendercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectpopulationgendercoding = medicinalproductundesirableeffectpopulationgendercodinglist.get(medicinalproductundesirableeffectpopulationgendercodingi);

		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply("[[");}
		if(medicinalproductundesirableeffectpopulationgendercoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectpopulationgendercodingi == medicinalproductundesirableeffectpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn("[[");}
		if(medicinalproductundesirableeffectpopulationgendercoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectpopulationgendercodingi == medicinalproductundesirableeffectpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgCd("[[");}
		if(medicinalproductundesirableeffectpopulationgendercoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationgendercodingi == medicinalproductundesirableeffectpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgCd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd("[[");}
		if(medicinalproductundesirableeffectpopulationgendercoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationgendercodingi == medicinalproductundesirableeffectpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationgendercodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgSys("[[");}
		if(medicinalproductundesirableeffectpopulationgendercoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationgendercoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectpopulationgendercodingi == medicinalproductundesirableeffectpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnGenderCdgSys("]]");}


		 };
		/******************** medicinalproductundesirableeffectpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationagecodeableconcept = medicinalproductundesirableeffectpopulation.getAgeCodeableConcept();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt("[");}
		if(medicinalproductundesirableeffectpopulationagecodeableconcept.hasText()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt("]");}


		/******************** medicinalproductundesirableeffectpopulationagecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist = medicinalproductundesirableeffectpopulationagecodeableconcept.getCoding();
		for(int medicinalproductundesirableeffectpopulationagecodeableconceptcodingi = 0; medicinalproductundesirableeffectpopulationagecodeableconceptcodingi<medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.size();medicinalproductundesirableeffectpopulationagecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectpopulationagecodeableconceptcoding = medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.get(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi);

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply("[[");}
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn("[[");}
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd("[[");}
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys("[[");}
		if(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationagecodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectpopulationagecodeableconceptcodingi == medicinalproductundesirableeffectpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys("]]");}


		 };
		/******************** medicinalproductundesirableeffectpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductundesirableeffectpopulationphysiologicalcondition = medicinalproductundesirableeffectpopulation.getPhysiologicalCondition();

		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt("[");}
		if(medicinalproductundesirableeffectpopulationphysiologicalcondition.hasText()) {

			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalcondition.getText()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt("]");}


		/******************** medicinalproductundesirableeffectpopulationphysiologicalconditioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist = medicinalproductundesirableeffectpopulationphysiologicalcondition.getCoding();
		for(int medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi = 0; medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi<medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.size();medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductundesirableeffectpopulationphysiologicalconditioncoding = medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.get(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi);

		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply("[[");}
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasDisplay()) {

			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply("NULL");
		}

		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn("[[");}
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasVersion()) {

			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn("NULL");
		}

		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd("[[");}
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd("[[");}
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasUserSelected()) {

			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd("]]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys("[[");}
		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys(String.valueOf(medicinalproductundesirableeffectpopulationphysiologicalconditioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys("NULL");
		}

		if(medicinalproductundesirableeffectpopulationphysiologicalconditioncodingi == medicinalproductundesirableeffectpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys("]]");}


		 };
		/******************** medicinalproductundesirableeffectpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductundesirableeffectpopulationagerange = medicinalproductundesirableeffectpopulation.getAgeRange();

		/******************** medicinalproductundesirableeffectpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductundesirableeffectpopulationagerangelow = medicinalproductundesirableeffectpopulationagerange.getLow();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl("[");}
		if(medicinalproductundesirableeffectpopulationagerangelow.hasValue()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getValue()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl("]");}


		/******************** medicinalproductundesirableeffectpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductundesirableeffectpopulationagerangelowcomparator = medicinalproductundesirableeffectpopulationagerangelow.getComparator();
		if(medicinalproductundesirableeffectpopulationagerangelowcomparator!=null) {
		if(medicinalproductundesirableeffectpopulationi == 0) {

		m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr("[");		}
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr(medicinalproductundesirableeffectpopulationagerangelowcomparator.toCode());
		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {

		m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr("]");		}

		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr("NULL");
		}

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd("[");}
		if(medicinalproductundesirableeffectpopulationagerangelow.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd("]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt("[");}
		if(medicinalproductundesirableeffectpopulationagerangelow.hasUnit()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getUnit()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt("]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys("[");}
		if(medicinalproductundesirableeffectpopulationagerangelow.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys(String.valueOf(medicinalproductundesirableeffectpopulationagerangelow.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys("]");}


		/******************** medicinalproductundesirableeffectpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductundesirableeffectpopulationagerangehigh = medicinalproductundesirableeffectpopulationagerange.getHigh();

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl("[");}
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasValue()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getValue()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl("]");}


		/******************** medicinalproductundesirableeffectpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductundesirableeffectpopulationagerangehighcomparator = medicinalproductundesirableeffectpopulationagerangehigh.getComparator();
		if(medicinalproductundesirableeffectpopulationagerangehighcomparator!=null) {
		if(medicinalproductundesirableeffectpopulationi == 0) {

		m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr("[");		}
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr(medicinalproductundesirableeffectpopulationagerangehighcomparator.toCode());
		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {

		m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr("]");		}

		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr("NULL");
		}

		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd("[");}
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasCode()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getCode()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd("]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt("[");}
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasUnit()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getUnit()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt("]");}


		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(medicinalproductundesirableeffectpopulationi == 0) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys("[");}
		if(medicinalproductundesirableeffectpopulationagerangehigh.hasSystem()) {

			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys(String.valueOf(medicinalproductundesirableeffectpopulationagerangehigh.getSystem()));
		} else {
			m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys("NULL");
		}

		if(medicinalproductundesirableeffectpopulationi == medicinalproductundesirableeffectpopulationlist.size()-1) {m.addMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys("]");}


		 };
		return m;
	}
}
