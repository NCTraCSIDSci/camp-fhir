package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIndication;
public class MedicinalProductIndicationBidirectionalConversion 
{
	public MedicinalProductIndication MedicinalProductIndications(org.hl7.fhir.r4.model.MedicinalProductIndication medicinalproductindication) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductIndication m = new  main.java.com.campfhir.model.MedicinalProductIndication();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductindication.getIdElement().getIdPart());

		/******************** MdcnlPrdctIndctn_Sbjct ********************************************************************************/
		if(medicinalproductindication.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductindication.getSubject().size(); incr++) {
				array = array + medicinalproductindication.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctIndctnSbjct(array);

		} else {
			m.addMdcnlPrdctIndctnSbjct("NULL");
		}


		/******************** MdcnlPrdctIndctn_UndesirableEfct ********************************************************************************/
		if(medicinalproductindication.hasUndesirableEffect()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductindication.getUndesirableEffect().size(); incr++) {
				array = array + medicinalproductindication.getUndesirableEffect().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctIndctnUndesirableEfct(array);

		} else {
			m.addMdcnlPrdctIndctnUndesirableEfct("NULL");
		}


		/******************** medicinalproductindicationdiseasesymptomprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationdiseasesymptomprocedure = medicinalproductindication.getDiseaseSymptomProcedure();

		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Txt ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedure.hasText()) {

			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt(String.valueOf(medicinalproductindicationdiseasesymptomprocedure.getText()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt("NULL");
		}


		/******************** medicinalproductindicationdiseasesymptomprocedurecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationdiseasesymptomprocedurecodinglist = medicinalproductindicationdiseasesymptomprocedure.getCoding();
		for(int medicinalproductindicationdiseasesymptomprocedurecodingi = 0; medicinalproductindicationdiseasesymptomprocedurecodingi<medicinalproductindicationdiseasesymptomprocedurecodinglist.size();medicinalproductindicationdiseasesymptomprocedurecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationdiseasesymptomprocedurecoding = medicinalproductindicationdiseasesymptomprocedurecodinglist.get(medicinalproductindicationdiseasesymptomprocedurecodingi);

		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecodingi == 0) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply("[");}
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply("NULL");
		}

		if(medicinalproductindicationdiseasesymptomprocedurecodingi == medicinalproductindicationdiseasesymptomprocedurecodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecodingi == 0) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn("[");}
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasVersion()) {

			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn("NULL");
		}

		if(medicinalproductindicationdiseasesymptomprocedurecodingi == medicinalproductindicationdiseasesymptomprocedurecodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecodingi == 0) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd("[");}
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasCode()) {

			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd("NULL");
		}

		if(medicinalproductindicationdiseasesymptomprocedurecodingi == medicinalproductindicationdiseasesymptomprocedurecodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecodingi == 0) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd("[");}
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationdiseasesymptomprocedurecodingi == medicinalproductindicationdiseasesymptomprocedurecodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationdiseasesymptomprocedurecodingi == 0) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys("[");}
		if(medicinalproductindicationdiseasesymptomprocedurecoding.hasSystem()) {

			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys(String.valueOf(medicinalproductindicationdiseasesymptomprocedurecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys("NULL");
		}

		if(medicinalproductindicationdiseasesymptomprocedurecodingi == medicinalproductindicationdiseasesymptomprocedurecodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys("]");}


		 };
		/******************** medicinalproductindicationdiseasestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationdiseasestatus = medicinalproductindication.getDiseaseStatus();

		/******************** MdcnlPrdctIndctn_DiseaseSts_Txt ********************************************************************************/
		if(medicinalproductindicationdiseasestatus.hasText()) {

			m.addMdcnlPrdctIndctnDiseaseStsTxt(String.valueOf(medicinalproductindicationdiseasestatus.getText()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseStsTxt("NULL");
		}


		/******************** medicinalproductindicationdiseasestatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationdiseasestatuscodinglist = medicinalproductindicationdiseasestatus.getCoding();
		for(int medicinalproductindicationdiseasestatuscodingi = 0; medicinalproductindicationdiseasestatuscodingi<medicinalproductindicationdiseasestatuscodinglist.size();medicinalproductindicationdiseasestatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationdiseasestatuscoding = medicinalproductindicationdiseasestatuscodinglist.get(medicinalproductindicationdiseasestatuscodingi);

		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctIndctnDiseaseStsCdgDsply("[");}
		if(medicinalproductindicationdiseasestatuscoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnDiseaseStsCdgDsply(String.valueOf(medicinalproductindicationdiseasestatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseStsCdgDsply("NULL");
		}

		if(medicinalproductindicationdiseasestatuscodingi == medicinalproductindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseStsCdgDsply("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctIndctnDiseaseStsCdgVrsn("[");}
		if(medicinalproductindicationdiseasestatuscoding.hasVersion()) {

			m.addMdcnlPrdctIndctnDiseaseStsCdgVrsn(String.valueOf(medicinalproductindicationdiseasestatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseStsCdgVrsn("NULL");
		}

		if(medicinalproductindicationdiseasestatuscodingi == medicinalproductindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseStsCdgVrsn("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctIndctnDiseaseStsCdgCd("[");}
		if(medicinalproductindicationdiseasestatuscoding.hasCode()) {

			m.addMdcnlPrdctIndctnDiseaseStsCdgCd(String.valueOf(medicinalproductindicationdiseasestatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseStsCdgCd("NULL");
		}

		if(medicinalproductindicationdiseasestatuscodingi == medicinalproductindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseStsCdgCd("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctIndctnDiseaseStsCdgUsrSltd("[");}
		if(medicinalproductindicationdiseasestatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnDiseaseStsCdgUsrSltd(String.valueOf(medicinalproductindicationdiseasestatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseStsCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationdiseasestatuscodingi == medicinalproductindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseStsCdgUsrSltd("]");}


		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctIndctnDiseaseStsCdgSys("[");}
		if(medicinalproductindicationdiseasestatuscoding.hasSystem()) {

			m.addMdcnlPrdctIndctnDiseaseStsCdgSys(String.valueOf(medicinalproductindicationdiseasestatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnDiseaseStsCdgSys("NULL");
		}

		if(medicinalproductindicationdiseasestatuscodingi == medicinalproductindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctIndctnDiseaseStsCdgSys("]");}


		 };
		/******************** medicinalproductindicationintendedeffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationintendedeffect = medicinalproductindication.getIntendedEffect();

		/******************** MdcnlPrdctIndctn_IntendedEfct_Txt ********************************************************************************/
		if(medicinalproductindicationintendedeffect.hasText()) {

			m.addMdcnlPrdctIndctnIntendedEfctTxt(String.valueOf(medicinalproductindicationintendedeffect.getText()));
		} else {
			m.addMdcnlPrdctIndctnIntendedEfctTxt("NULL");
		}


		/******************** medicinalproductindicationintendedeffectcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationintendedeffectcodinglist = medicinalproductindicationintendedeffect.getCoding();
		for(int medicinalproductindicationintendedeffectcodingi = 0; medicinalproductindicationintendedeffectcodingi<medicinalproductindicationintendedeffectcodinglist.size();medicinalproductindicationintendedeffectcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationintendedeffectcoding = medicinalproductindicationintendedeffectcodinglist.get(medicinalproductindicationintendedeffectcodingi);

		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationintendedeffectcodingi == 0) {m.addMdcnlPrdctIndctnIntendedEfctCdgDsply("[");}
		if(medicinalproductindicationintendedeffectcoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnIntendedEfctCdgDsply(String.valueOf(medicinalproductindicationintendedeffectcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnIntendedEfctCdgDsply("NULL");
		}

		if(medicinalproductindicationintendedeffectcodingi == medicinalproductindicationintendedeffectcodinglist.size()-1) {m.addMdcnlPrdctIndctnIntendedEfctCdgDsply("]");}


		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationintendedeffectcodingi == 0) {m.addMdcnlPrdctIndctnIntendedEfctCdgVrsn("[");}
		if(medicinalproductindicationintendedeffectcoding.hasVersion()) {

			m.addMdcnlPrdctIndctnIntendedEfctCdgVrsn(String.valueOf(medicinalproductindicationintendedeffectcoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnIntendedEfctCdgVrsn("NULL");
		}

		if(medicinalproductindicationintendedeffectcodingi == medicinalproductindicationintendedeffectcodinglist.size()-1) {m.addMdcnlPrdctIndctnIntendedEfctCdgVrsn("]");}


		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationintendedeffectcodingi == 0) {m.addMdcnlPrdctIndctnIntendedEfctCdgCd("[");}
		if(medicinalproductindicationintendedeffectcoding.hasCode()) {

			m.addMdcnlPrdctIndctnIntendedEfctCdgCd(String.valueOf(medicinalproductindicationintendedeffectcoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnIntendedEfctCdgCd("NULL");
		}

		if(medicinalproductindicationintendedeffectcodingi == medicinalproductindicationintendedeffectcodinglist.size()-1) {m.addMdcnlPrdctIndctnIntendedEfctCdgCd("]");}


		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationintendedeffectcodingi == 0) {m.addMdcnlPrdctIndctnIntendedEfctCdgUsrSltd("[");}
		if(medicinalproductindicationintendedeffectcoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnIntendedEfctCdgUsrSltd(String.valueOf(medicinalproductindicationintendedeffectcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnIntendedEfctCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationintendedeffectcodingi == medicinalproductindicationintendedeffectcodinglist.size()-1) {m.addMdcnlPrdctIndctnIntendedEfctCdgUsrSltd("]");}


		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationintendedeffectcodingi == 0) {m.addMdcnlPrdctIndctnIntendedEfctCdgSys("[");}
		if(medicinalproductindicationintendedeffectcoding.hasSystem()) {

			m.addMdcnlPrdctIndctnIntendedEfctCdgSys(String.valueOf(medicinalproductindicationintendedeffectcoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnIntendedEfctCdgSys("NULL");
		}

		if(medicinalproductindicationintendedeffectcodingi == medicinalproductindicationintendedeffectcodinglist.size()-1) {m.addMdcnlPrdctIndctnIntendedEfctCdgSys("]");}


		 };
		/******************** medicinalproductindicationothertherapy ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent> medicinalproductindicationothertherapylist = medicinalproductindication.getOtherTherapy();
		for(int medicinalproductindicationothertherapyi = 0; medicinalproductindicationothertherapyi<medicinalproductindicationothertherapylist.size();medicinalproductindicationothertherapyi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent  medicinalproductindicationothertherapy = medicinalproductindicationothertherapylist.get(medicinalproductindicationothertherapyi);

		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(medicinalproductindicationothertherapyi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnRfrnc("[");}
		if(medicinalproductindicationothertherapy.hasMedicationReference()) {

			if(medicinalproductindicationothertherapy.getMedicationReference().getReference() != null) {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnRfrnc(medicinalproductindicationothertherapy.getMedicationReference().getReference());
			}
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnRfrnc("NULL");
		}

		if(medicinalproductindicationothertherapyi == medicinalproductindicationothertherapylist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnRfrnc("]");}


		/******************** medicinalproductindicationothertherapymedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationothertherapymedicationcodeableconcept = medicinalproductindicationothertherapy.getMedicationCodeableConcept();

		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductindicationothertherapyi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt("[");}
		if(medicinalproductindicationothertherapymedicationcodeableconcept.hasText()) {

			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt("NULL");
		}

		if(medicinalproductindicationothertherapyi == medicinalproductindicationothertherapylist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt("]");}


		/******************** medicinalproductindicationothertherapymedicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationothertherapymedicationcodeableconceptcodinglist = medicinalproductindicationothertherapymedicationcodeableconcept.getCoding();
		for(int medicinalproductindicationothertherapymedicationcodeableconceptcodingi = 0; medicinalproductindicationothertherapymedicationcodeableconceptcodingi<medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.size();medicinalproductindicationothertherapymedicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationothertherapymedicationcodeableconceptcoding = medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.get(medicinalproductindicationothertherapymedicationcodeableconceptcodingi);

		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply("[[");}
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn("[[");}
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd("[[");}
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys("[[");}
		if(medicinalproductindicationothertherapymedicationcodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys(String.valueOf(medicinalproductindicationothertherapymedicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductindicationothertherapymedicationcodeableconceptcodingi == medicinalproductindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys("]]");}


		 };
		/******************** medicinalproductindicationothertherapytherapyrelationshiptype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationothertherapytherapyrelationshiptype = medicinalproductindicationothertherapy.getTherapyRelationshipType();

		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(medicinalproductindicationothertherapyi == 0) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt("[");}
		if(medicinalproductindicationothertherapytherapyrelationshiptype.hasText()) {

			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptype.getText()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt("NULL");
		}

		if(medicinalproductindicationothertherapyi == medicinalproductindicationothertherapylist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt("]");}


		/******************** medicinalproductindicationothertherapytherapyrelationshiptypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationothertherapytherapyrelationshiptypecodinglist = medicinalproductindicationothertherapytherapyrelationshiptype.getCoding();
		for(int medicinalproductindicationothertherapytherapyrelationshiptypecodingi = 0; medicinalproductindicationothertherapytherapyrelationshiptypecodingi<medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.size();medicinalproductindicationothertherapytherapyrelationshiptypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationothertherapytherapyrelationshiptypecoding = medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.get(medicinalproductindicationothertherapytherapyrelationshiptypecodingi);

		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply("[[");}
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply("NULL");
		}

		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn("[[");}
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasVersion()) {

			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn("NULL");
		}

		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd("[[");}
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasCode()) {

			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd("NULL");
		}

		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd("[[");}
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys("[[");}
		if(medicinalproductindicationothertherapytherapyrelationshiptypecoding.hasSystem()) {

			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys(String.valueOf(medicinalproductindicationothertherapytherapyrelationshiptypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys("NULL");
		}

		if(medicinalproductindicationothertherapytherapyrelationshiptypecodingi == medicinalproductindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductindicationcomorbidity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductindicationcomorbiditylist = medicinalproductindication.getComorbidity();
		for(int medicinalproductindicationcomorbidityi = 0; medicinalproductindicationcomorbidityi<medicinalproductindicationcomorbiditylist.size();medicinalproductindicationcomorbidityi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductindicationcomorbidity = medicinalproductindicationcomorbiditylist.get(medicinalproductindicationcomorbidityi);

		/******************** MdcnlPrdctIndctn_Comorbidity_Txt ********************************************************************************/
		if(medicinalproductindicationcomorbidityi == 0) {m.addMdcnlPrdctIndctnComorbidityTxt("[");}
		if(medicinalproductindicationcomorbidity.hasText()) {

			m.addMdcnlPrdctIndctnComorbidityTxt(String.valueOf(medicinalproductindicationcomorbidity.getText()));
		} else {
			m.addMdcnlPrdctIndctnComorbidityTxt("NULL");
		}

		if(medicinalproductindicationcomorbidityi == medicinalproductindicationcomorbiditylist.size()-1) {m.addMdcnlPrdctIndctnComorbidityTxt("]");}


		/******************** medicinalproductindicationcomorbiditycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationcomorbiditycodinglist = medicinalproductindicationcomorbidity.getCoding();
		for(int medicinalproductindicationcomorbiditycodingi = 0; medicinalproductindicationcomorbiditycodingi<medicinalproductindicationcomorbiditycodinglist.size();medicinalproductindicationcomorbiditycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationcomorbiditycoding = medicinalproductindicationcomorbiditycodinglist.get(medicinalproductindicationcomorbiditycodingi);

		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctIndctnComorbidityCdgDsply("[[");}
		if(medicinalproductindicationcomorbiditycoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnComorbidityCdgDsply(String.valueOf(medicinalproductindicationcomorbiditycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnComorbidityCdgDsply("NULL");
		}

		if(medicinalproductindicationcomorbiditycodingi == medicinalproductindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctIndctnComorbidityCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctIndctnComorbidityCdgVrsn("[[");}
		if(medicinalproductindicationcomorbiditycoding.hasVersion()) {

			m.addMdcnlPrdctIndctnComorbidityCdgVrsn(String.valueOf(medicinalproductindicationcomorbiditycoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnComorbidityCdgVrsn("NULL");
		}

		if(medicinalproductindicationcomorbiditycodingi == medicinalproductindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctIndctnComorbidityCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctIndctnComorbidityCdgCd("[[");}
		if(medicinalproductindicationcomorbiditycoding.hasCode()) {

			m.addMdcnlPrdctIndctnComorbidityCdgCd(String.valueOf(medicinalproductindicationcomorbiditycoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnComorbidityCdgCd("NULL");
		}

		if(medicinalproductindicationcomorbiditycodingi == medicinalproductindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctIndctnComorbidityCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctIndctnComorbidityCdgUsrSltd("[[");}
		if(medicinalproductindicationcomorbiditycoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnComorbidityCdgUsrSltd(String.valueOf(medicinalproductindicationcomorbiditycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnComorbidityCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationcomorbiditycodingi == medicinalproductindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctIndctnComorbidityCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctIndctnComorbidityCdgSys("[[");}
		if(medicinalproductindicationcomorbiditycoding.hasSystem()) {

			m.addMdcnlPrdctIndctnComorbidityCdgSys(String.valueOf(medicinalproductindicationcomorbiditycoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnComorbidityCdgSys("NULL");
		}

		if(medicinalproductindicationcomorbiditycodingi == medicinalproductindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctIndctnComorbidityCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductindicationduration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationduration = medicinalproductindication.getDuration();

		/******************** MdcnlPrdctIndctn_Duration_Vl ********************************************************************************/
		if(medicinalproductindicationduration.hasValue()) {

			m.addMdcnlPrdctIndctnDurationVl(String.valueOf(medicinalproductindicationduration.getValue()));
		} else {
			m.addMdcnlPrdctIndctnDurationVl("NULL");
		}


		/******************** medicinalproductindicationdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductindicationdurationcomparator = medicinalproductindicationduration.getComparator();
		if(medicinalproductindicationdurationcomparator!=null) {
			m.addMdcnlPrdctIndctnDurationCmprtr(medicinalproductindicationdurationcomparator.toCode());
		} else {
			m.addMdcnlPrdctIndctnDurationCmprtr("NULL");
		}

		/******************** MdcnlPrdctIndctn_Duration_Cd ********************************************************************************/
		if(medicinalproductindicationduration.hasCode()) {

			m.addMdcnlPrdctIndctnDurationCd(String.valueOf(medicinalproductindicationduration.getCode()));
		} else {
			m.addMdcnlPrdctIndctnDurationCd("NULL");
		}


		/******************** MdcnlPrdctIndctn_Duration_Unt ********************************************************************************/
		if(medicinalproductindicationduration.hasUnit()) {

			m.addMdcnlPrdctIndctnDurationUnt(String.valueOf(medicinalproductindicationduration.getUnit()));
		} else {
			m.addMdcnlPrdctIndctnDurationUnt("NULL");
		}


		/******************** MdcnlPrdctIndctn_Duration_Sys ********************************************************************************/
		if(medicinalproductindicationduration.hasSystem()) {

			m.addMdcnlPrdctIndctnDurationSys(String.valueOf(medicinalproductindicationduration.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnDurationSys("NULL");
		}


		/******************** medicinalproductindicationpopulation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Population> medicinalproductindicationpopulationlist = medicinalproductindication.getPopulation();
		for(int medicinalproductindicationpopulationi = 0; medicinalproductindicationpopulationi<medicinalproductindicationpopulationlist.size();medicinalproductindicationpopulationi++ ) {
		org.hl7.fhir.r4.model.Population  medicinalproductindicationpopulation = medicinalproductindicationpopulationlist.get(medicinalproductindicationpopulationi);

		/******************** medicinalproductindicationpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationrace = medicinalproductindicationpopulation.getRace();

		/******************** MdcnlPrdctIndctn_Popln_Race_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnRaceTxt("[");}
		if(medicinalproductindicationpopulationrace.hasText()) {

			m.addMdcnlPrdctIndctnPoplnRaceTxt(String.valueOf(medicinalproductindicationpopulationrace.getText()));
		} else {
			m.addMdcnlPrdctIndctnPoplnRaceTxt("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnRaceTxt("]");}


		/******************** medicinalproductindicationpopulationracecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationpopulationracecodinglist = medicinalproductindicationpopulationrace.getCoding();
		for(int medicinalproductindicationpopulationracecodingi = 0; medicinalproductindicationpopulationracecodingi<medicinalproductindicationpopulationracecodinglist.size();medicinalproductindicationpopulationracecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationpopulationracecoding = medicinalproductindicationpopulationracecodinglist.get(medicinalproductindicationpopulationracecodingi);

		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationracecodingi == 0) {m.addMdcnlPrdctIndctnPoplnRaceCdgDsply("[[");}
		if(medicinalproductindicationpopulationracecoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnPoplnRaceCdgDsply(String.valueOf(medicinalproductindicationpopulationracecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnPoplnRaceCdgDsply("NULL");
		}

		if(medicinalproductindicationpopulationracecodingi == medicinalproductindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnRaceCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationracecodingi == 0) {m.addMdcnlPrdctIndctnPoplnRaceCdgVrsn("[[");}
		if(medicinalproductindicationpopulationracecoding.hasVersion()) {

			m.addMdcnlPrdctIndctnPoplnRaceCdgVrsn(String.valueOf(medicinalproductindicationpopulationracecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnPoplnRaceCdgVrsn("NULL");
		}

		if(medicinalproductindicationpopulationracecodingi == medicinalproductindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnRaceCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationracecodingi == 0) {m.addMdcnlPrdctIndctnPoplnRaceCdgCd("[[");}
		if(medicinalproductindicationpopulationracecoding.hasCode()) {

			m.addMdcnlPrdctIndctnPoplnRaceCdgCd(String.valueOf(medicinalproductindicationpopulationracecoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnPoplnRaceCdgCd("NULL");
		}

		if(medicinalproductindicationpopulationracecodingi == medicinalproductindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnRaceCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationracecodingi == 0) {m.addMdcnlPrdctIndctnPoplnRaceCdgUsrSltd("[[");}
		if(medicinalproductindicationpopulationracecoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnPoplnRaceCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationracecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnPoplnRaceCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationpopulationracecodingi == medicinalproductindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnRaceCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationracecodingi == 0) {m.addMdcnlPrdctIndctnPoplnRaceCdgSys("[[");}
		if(medicinalproductindicationpopulationracecoding.hasSystem()) {

			m.addMdcnlPrdctIndctnPoplnRaceCdgSys(String.valueOf(medicinalproductindicationpopulationracecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnPoplnRaceCdgSys("NULL");
		}

		if(medicinalproductindicationpopulationracecodingi == medicinalproductindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnRaceCdgSys("]]");}


		 };
		/******************** medicinalproductindicationpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationgender = medicinalproductindicationpopulation.getGender();

		/******************** MdcnlPrdctIndctn_Popln_Gender_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnGenderTxt("[");}
		if(medicinalproductindicationpopulationgender.hasText()) {

			m.addMdcnlPrdctIndctnPoplnGenderTxt(String.valueOf(medicinalproductindicationpopulationgender.getText()));
		} else {
			m.addMdcnlPrdctIndctnPoplnGenderTxt("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnGenderTxt("]");}


		/******************** medicinalproductindicationpopulationgendercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationpopulationgendercodinglist = medicinalproductindicationpopulationgender.getCoding();
		for(int medicinalproductindicationpopulationgendercodingi = 0; medicinalproductindicationpopulationgendercodingi<medicinalproductindicationpopulationgendercodinglist.size();medicinalproductindicationpopulationgendercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationpopulationgendercoding = medicinalproductindicationpopulationgendercodinglist.get(medicinalproductindicationpopulationgendercodingi);

		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctIndctnPoplnGenderCdgDsply("[[");}
		if(medicinalproductindicationpopulationgendercoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnPoplnGenderCdgDsply(String.valueOf(medicinalproductindicationpopulationgendercoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnPoplnGenderCdgDsply("NULL");
		}

		if(medicinalproductindicationpopulationgendercodingi == medicinalproductindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnGenderCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctIndctnPoplnGenderCdgVrsn("[[");}
		if(medicinalproductindicationpopulationgendercoding.hasVersion()) {

			m.addMdcnlPrdctIndctnPoplnGenderCdgVrsn(String.valueOf(medicinalproductindicationpopulationgendercoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnPoplnGenderCdgVrsn("NULL");
		}

		if(medicinalproductindicationpopulationgendercodingi == medicinalproductindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnGenderCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctIndctnPoplnGenderCdgCd("[[");}
		if(medicinalproductindicationpopulationgendercoding.hasCode()) {

			m.addMdcnlPrdctIndctnPoplnGenderCdgCd(String.valueOf(medicinalproductindicationpopulationgendercoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnPoplnGenderCdgCd("NULL");
		}

		if(medicinalproductindicationpopulationgendercodingi == medicinalproductindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnGenderCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctIndctnPoplnGenderCdgUsrSltd("[[");}
		if(medicinalproductindicationpopulationgendercoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnPoplnGenderCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationgendercoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnPoplnGenderCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationpopulationgendercodingi == medicinalproductindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnGenderCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctIndctnPoplnGenderCdgSys("[[");}
		if(medicinalproductindicationpopulationgendercoding.hasSystem()) {

			m.addMdcnlPrdctIndctnPoplnGenderCdgSys(String.valueOf(medicinalproductindicationpopulationgendercoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnPoplnGenderCdgSys("NULL");
		}

		if(medicinalproductindicationpopulationgendercodingi == medicinalproductindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnGenderCdgSys("]]");}


		 };
		/******************** medicinalproductindicationpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationagecodeableconcept = medicinalproductindicationpopulation.getAgeCodeableConcept();

		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt("[");}
		if(medicinalproductindicationpopulationagecodeableconcept.hasText()) {

			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt(String.valueOf(medicinalproductindicationpopulationagecodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt("]");}


		/******************** medicinalproductindicationpopulationagecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationpopulationagecodeableconceptcodinglist = medicinalproductindicationpopulationagecodeableconcept.getCoding();
		for(int medicinalproductindicationpopulationagecodeableconceptcodingi = 0; medicinalproductindicationpopulationagecodeableconceptcodingi<medicinalproductindicationpopulationagecodeableconceptcodinglist.size();medicinalproductindicationpopulationagecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationpopulationagecodeableconceptcoding = medicinalproductindicationpopulationagecodeableconceptcodinglist.get(medicinalproductindicationpopulationagecodeableconceptcodingi);

		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply("[[");}
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductindicationpopulationagecodeableconceptcodingi == medicinalproductindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn("[[");}
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductindicationpopulationagecodeableconceptcodingi == medicinalproductindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd("[[");}
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductindicationpopulationagecodeableconceptcodingi == medicinalproductindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationpopulationagecodeableconceptcodingi == medicinalproductindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys("[[");}
		if(medicinalproductindicationpopulationagecodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys(String.valueOf(medicinalproductindicationpopulationagecodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductindicationpopulationagecodeableconceptcodingi == medicinalproductindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys("]]");}


		 };
		/******************** medicinalproductindicationpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductindicationpopulationphysiologicalcondition = medicinalproductindicationpopulation.getPhysiologicalCondition();

		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt("[");}
		if(medicinalproductindicationpopulationphysiologicalcondition.hasText()) {

			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt(String.valueOf(medicinalproductindicationpopulationphysiologicalcondition.getText()));
		} else {
			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt("]");}


		/******************** medicinalproductindicationpopulationphysiologicalconditioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductindicationpopulationphysiologicalconditioncodinglist = medicinalproductindicationpopulationphysiologicalcondition.getCoding();
		for(int medicinalproductindicationpopulationphysiologicalconditioncodingi = 0; medicinalproductindicationpopulationphysiologicalconditioncodingi<medicinalproductindicationpopulationphysiologicalconditioncodinglist.size();medicinalproductindicationpopulationphysiologicalconditioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductindicationpopulationphysiologicalconditioncoding = medicinalproductindicationpopulationphysiologicalconditioncodinglist.get(medicinalproductindicationpopulationphysiologicalconditioncodingi);

		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply("[[");}
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasDisplay()) {

			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply("NULL");
		}

		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == medicinalproductindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply("]]");}


		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn("[[");}
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasVersion()) {

			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn("NULL");
		}

		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == medicinalproductindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn("]]");}


		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd("[[");}
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasCode()) {

			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getCode()));
		} else {
			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd("NULL");
		}

		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == medicinalproductindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd("[[");}
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasUserSelected()) {

			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd("NULL");
		}

		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == medicinalproductindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys("[[");}
		if(medicinalproductindicationpopulationphysiologicalconditioncoding.hasSystem()) {

			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys(String.valueOf(medicinalproductindicationpopulationphysiologicalconditioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys("NULL");
		}

		if(medicinalproductindicationpopulationphysiologicalconditioncodingi == medicinalproductindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys("]]");}


		 };
		/******************** medicinalproductindicationpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductindicationpopulationagerange = medicinalproductindicationpopulation.getAgeRange();

		/******************** medicinalproductindicationpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationpopulationagerangelow = medicinalproductindicationpopulationagerange.getLow();

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngLwVl("[");}
		if(medicinalproductindicationpopulationagerangelow.hasValue()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngLwVl(String.valueOf(medicinalproductindicationpopulationagerangelow.getValue()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngLwVl("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngLwVl("]");}


		/******************** medicinalproductindicationpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductindicationpopulationagerangelowcomparator = medicinalproductindicationpopulationagerangelow.getComparator();
		if(medicinalproductindicationpopulationagerangelowcomparator!=null) {
		if(medicinalproductindicationpopulationi == 0) {

		m.addMdcnlPrdctIndctnPoplnAgeRngLwCmprtr("[");		}
			m.addMdcnlPrdctIndctnPoplnAgeRngLwCmprtr(medicinalproductindicationpopulationagerangelowcomparator.toCode());
		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {

		m.addMdcnlPrdctIndctnPoplnAgeRngLwCmprtr("]");		}

		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngLwCmprtr("NULL");
		}

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngLwCd("[");}
		if(medicinalproductindicationpopulationagerangelow.hasCode()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngLwCd(String.valueOf(medicinalproductindicationpopulationagerangelow.getCode()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngLwCd("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngLwCd("]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngLwUnt("[");}
		if(medicinalproductindicationpopulationagerangelow.hasUnit()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngLwUnt(String.valueOf(medicinalproductindicationpopulationagerangelow.getUnit()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngLwUnt("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngLwUnt("]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngLwSys("[");}
		if(medicinalproductindicationpopulationagerangelow.hasSystem()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngLwSys(String.valueOf(medicinalproductindicationpopulationagerangelow.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngLwSys("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngLwSys("]");}


		/******************** medicinalproductindicationpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductindicationpopulationagerangehigh = medicinalproductindicationpopulationagerange.getHigh();

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngHiVl("[");}
		if(medicinalproductindicationpopulationagerangehigh.hasValue()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngHiVl(String.valueOf(medicinalproductindicationpopulationagerangehigh.getValue()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngHiVl("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngHiVl("]");}


		/******************** medicinalproductindicationpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductindicationpopulationagerangehighcomparator = medicinalproductindicationpopulationagerangehigh.getComparator();
		if(medicinalproductindicationpopulationagerangehighcomparator!=null) {
		if(medicinalproductindicationpopulationi == 0) {

		m.addMdcnlPrdctIndctnPoplnAgeRngHiCmprtr("[");		}
			m.addMdcnlPrdctIndctnPoplnAgeRngHiCmprtr(medicinalproductindicationpopulationagerangehighcomparator.toCode());
		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {

		m.addMdcnlPrdctIndctnPoplnAgeRngHiCmprtr("]");		}

		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngHiCmprtr("NULL");
		}

		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngHiCd("[");}
		if(medicinalproductindicationpopulationagerangehigh.hasCode()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngHiCd(String.valueOf(medicinalproductindicationpopulationagerangehigh.getCode()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngHiCd("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngHiCd("]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngHiUnt("[");}
		if(medicinalproductindicationpopulationagerangehigh.hasUnit()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngHiUnt(String.valueOf(medicinalproductindicationpopulationagerangehigh.getUnit()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngHiUnt("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngHiUnt("]");}


		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(medicinalproductindicationpopulationi == 0) {m.addMdcnlPrdctIndctnPoplnAgeRngHiSys("[");}
		if(medicinalproductindicationpopulationagerangehigh.hasSystem()) {

			m.addMdcnlPrdctIndctnPoplnAgeRngHiSys(String.valueOf(medicinalproductindicationpopulationagerangehigh.getSystem()));
		} else {
			m.addMdcnlPrdctIndctnPoplnAgeRngHiSys("NULL");
		}

		if(medicinalproductindicationpopulationi == medicinalproductindicationpopulationlist.size()-1) {m.addMdcnlPrdctIndctnPoplnAgeRngHiSys("]");}


		 };
		return m;
	}
}
