package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductContraindication;
public class MedicinalProductContraindicationBidirectionalConversion 
{
	public MedicinalProductContraindication MedicinalProductContraindications(org.hl7.fhir.r4.model.MedicinalProductContraindication medicinalproductcontraindication) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductContraindication m = new  main.java.com.campfhir.model.MedicinalProductContraindication();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductcontraindication.getIdElement().getIdPart());

		/******************** MdcnlPrdctCntraindctn_Sbjct ********************************************************************************/
		if(medicinalproductcontraindication.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductcontraindication.getSubject().size(); incr++) {
				array = array + medicinalproductcontraindication.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctCntraindctnSbjct(array);

		} else {
			m.addMdcnlPrdctCntraindctnSbjct("NULL");
		}


		/******************** MdcnlPrdctCntraindctn_TherapeuticIndctn ********************************************************************************/
		if(medicinalproductcontraindication.hasTherapeuticIndication()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductcontraindication.getTherapeuticIndication().size(); incr++) {
				array = array + medicinalproductcontraindication.getTherapeuticIndication().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctCntraindctnTherapeuticIndctn(array);

		} else {
			m.addMdcnlPrdctCntraindctnTherapeuticIndctn("NULL");
		}


		/******************** medicinalproductcontraindicationdiseasestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationdiseasestatus = medicinalproductcontraindication.getDiseaseStatus();

		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Txt ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatus.hasText()) {

			m.addMdcnlPrdctCntraindctnDiseaseStsTxt(String.valueOf(medicinalproductcontraindicationdiseasestatus.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseStsTxt("NULL");
		}


		/******************** medicinalproductcontraindicationdiseasestatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationdiseasestatuscodinglist = medicinalproductcontraindicationdiseasestatus.getCoding();
		for(int medicinalproductcontraindicationdiseasestatuscodingi = 0; medicinalproductcontraindicationdiseasestatuscodingi<medicinalproductcontraindicationdiseasestatuscodinglist.size();medicinalproductcontraindicationdiseasestatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationdiseasestatuscoding = medicinalproductcontraindicationdiseasestatuscodinglist.get(medicinalproductcontraindicationdiseasestatuscodingi);

		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgDsply("[");}
		if(medicinalproductcontraindicationdiseasestatuscoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnDiseaseStsCdgDsply(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseStsCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationdiseasestatuscodingi == medicinalproductcontraindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgDsply("]");}


		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgVrsn("[");}
		if(medicinalproductcontraindicationdiseasestatuscoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnDiseaseStsCdgVrsn(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseStsCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationdiseasestatuscodingi == medicinalproductcontraindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgVrsn("]");}


		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgCd("[");}
		if(medicinalproductcontraindicationdiseasestatuscoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnDiseaseStsCdgCd(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseStsCdgCd("NULL");
		}

		if(medicinalproductcontraindicationdiseasestatuscodingi == medicinalproductcontraindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgCd("]");}


		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd("[");}
		if(medicinalproductcontraindicationdiseasestatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationdiseasestatuscodingi == medicinalproductcontraindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd("]");}


		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationdiseasestatuscodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgSys("[");}
		if(medicinalproductcontraindicationdiseasestatuscoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnDiseaseStsCdgSys(String.valueOf(medicinalproductcontraindicationdiseasestatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseStsCdgSys("NULL");
		}

		if(medicinalproductcontraindicationdiseasestatuscodingi == medicinalproductcontraindicationdiseasestatuscodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseStsCdgSys("]");}


		 };
		/******************** medicinalproductcontraindicationothertherapy ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent> medicinalproductcontraindicationothertherapylist = medicinalproductcontraindication.getOtherTherapy();
		for(int medicinalproductcontraindicationothertherapyi = 0; medicinalproductcontraindicationothertherapyi<medicinalproductcontraindicationothertherapylist.size();medicinalproductcontraindicationothertherapyi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent  medicinalproductcontraindicationothertherapy = medicinalproductcontraindicationothertherapylist.get(medicinalproductcontraindicationothertherapyi);

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(medicinalproductcontraindicationothertherapyi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc("[");}
		if(medicinalproductcontraindicationothertherapy.hasMedicationReference()) {

			if(medicinalproductcontraindicationothertherapy.getMedicationReference().getReference() != null) {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc(medicinalproductcontraindicationothertherapy.getMedicationReference().getReference());
			}
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc("NULL");
		}

		if(medicinalproductcontraindicationothertherapyi == medicinalproductcontraindicationothertherapylist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc("]");}


		/******************** medicinalproductcontraindicationothertherapymedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationothertherapymedicationcodeableconcept = medicinalproductcontraindicationothertherapy.getMedicationCodeableConcept();

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductcontraindicationothertherapyi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt("[");}
		if(medicinalproductcontraindicationothertherapymedicationcodeableconcept.hasText()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt("NULL");
		}

		if(medicinalproductcontraindicationothertherapyi == medicinalproductcontraindicationothertherapylist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt("]");}


		/******************** medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist = medicinalproductcontraindicationothertherapymedicationcodeableconcept.getCoding();
		for(int medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi = 0; medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi<medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.size();medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding = medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.get(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi);

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply("[[");}
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn("[[");}
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd("[[");}
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys("[[");}
		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys(String.valueOf(medicinalproductcontraindicationothertherapymedicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductcontraindicationothertherapymedicationcodeableconceptcodingi == medicinalproductcontraindicationothertherapymedicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys("]]");}


		 };
		/******************** medicinalproductcontraindicationothertherapytherapyrelationshiptype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationothertherapytherapyrelationshiptype = medicinalproductcontraindicationothertherapy.getTherapyRelationshipType();

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(medicinalproductcontraindicationothertherapyi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt("[");}
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptype.hasText()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptype.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt("NULL");
		}

		if(medicinalproductcontraindicationothertherapyi == medicinalproductcontraindicationothertherapylist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt("]");}


		/******************** medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist = medicinalproductcontraindicationothertherapytherapyrelationshiptype.getCoding();
		for(int medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi = 0; medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi<medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.size();medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding = medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.get(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi);

		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply("[[");}
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn("[[");}
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd("[[");}
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd("NULL");
		}

		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == 0) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys("[[");}
		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys(String.valueOf(medicinalproductcontraindicationothertherapytherapyrelationshiptypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys("NULL");
		}

		if(medicinalproductcontraindicationothertherapytherapyrelationshiptypecodingi == medicinalproductcontraindicationothertherapytherapyrelationshiptypecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductcontraindicationcomorbidity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductcontraindicationcomorbiditylist = medicinalproductcontraindication.getComorbidity();
		for(int medicinalproductcontraindicationcomorbidityi = 0; medicinalproductcontraindicationcomorbidityi<medicinalproductcontraindicationcomorbiditylist.size();medicinalproductcontraindicationcomorbidityi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductcontraindicationcomorbidity = medicinalproductcontraindicationcomorbiditylist.get(medicinalproductcontraindicationcomorbidityi);

		/******************** MdcnlPrdctCntraindctn_Comorbidity_Txt ********************************************************************************/
		if(medicinalproductcontraindicationcomorbidityi == 0) {m.addMdcnlPrdctCntraindctnComorbidityTxt("[");}
		if(medicinalproductcontraindicationcomorbidity.hasText()) {

			m.addMdcnlPrdctCntraindctnComorbidityTxt(String.valueOf(medicinalproductcontraindicationcomorbidity.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnComorbidityTxt("NULL");
		}

		if(medicinalproductcontraindicationcomorbidityi == medicinalproductcontraindicationcomorbiditylist.size()-1) {m.addMdcnlPrdctCntraindctnComorbidityTxt("]");}


		/******************** medicinalproductcontraindicationcomorbiditycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationcomorbiditycodinglist = medicinalproductcontraindicationcomorbidity.getCoding();
		for(int medicinalproductcontraindicationcomorbiditycodingi = 0; medicinalproductcontraindicationcomorbiditycodingi<medicinalproductcontraindicationcomorbiditycodinglist.size();medicinalproductcontraindicationcomorbiditycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationcomorbiditycoding = medicinalproductcontraindicationcomorbiditycodinglist.get(medicinalproductcontraindicationcomorbiditycodingi);

		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctCntraindctnComorbidityCdgDsply("[[");}
		if(medicinalproductcontraindicationcomorbiditycoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnComorbidityCdgDsply(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnComorbidityCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationcomorbiditycodingi == medicinalproductcontraindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctCntraindctnComorbidityCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctCntraindctnComorbidityCdgVrsn("[[");}
		if(medicinalproductcontraindicationcomorbiditycoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnComorbidityCdgVrsn(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnComorbidityCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationcomorbiditycodingi == medicinalproductcontraindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctCntraindctnComorbidityCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctCntraindctnComorbidityCdgCd("[[");}
		if(medicinalproductcontraindicationcomorbiditycoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnComorbidityCdgCd(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnComorbidityCdgCd("NULL");
		}

		if(medicinalproductcontraindicationcomorbiditycodingi == medicinalproductcontraindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctCntraindctnComorbidityCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctCntraindctnComorbidityCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationcomorbiditycoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnComorbidityCdgUsrSltd(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnComorbidityCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationcomorbiditycodingi == medicinalproductcontraindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctCntraindctnComorbidityCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationcomorbiditycodingi == 0) {m.addMdcnlPrdctCntraindctnComorbidityCdgSys("[[");}
		if(medicinalproductcontraindicationcomorbiditycoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnComorbidityCdgSys(String.valueOf(medicinalproductcontraindicationcomorbiditycoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnComorbidityCdgSys("NULL");
		}

		if(medicinalproductcontraindicationcomorbiditycodingi == medicinalproductcontraindicationcomorbiditycodinglist.size()-1) {m.addMdcnlPrdctCntraindctnComorbidityCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductcontraindicationpopulation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Population> medicinalproductcontraindicationpopulationlist = medicinalproductcontraindication.getPopulation();
		for(int medicinalproductcontraindicationpopulationi = 0; medicinalproductcontraindicationpopulationi<medicinalproductcontraindicationpopulationlist.size();medicinalproductcontraindicationpopulationi++ ) {
		org.hl7.fhir.r4.model.Population  medicinalproductcontraindicationpopulation = medicinalproductcontraindicationpopulationlist.get(medicinalproductcontraindicationpopulationi);

		/******************** medicinalproductcontraindicationpopulationrace ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationrace = medicinalproductcontraindicationpopulation.getRace();

		/******************** MdcnlPrdctCntraindctn_Popln_Race_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnRaceTxt("[");}
		if(medicinalproductcontraindicationpopulationrace.hasText()) {

			m.addMdcnlPrdctCntraindctnPoplnRaceTxt(String.valueOf(medicinalproductcontraindicationpopulationrace.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnRaceTxt("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnRaceTxt("]");}


		/******************** medicinalproductcontraindicationpopulationracecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationpopulationracecodinglist = medicinalproductcontraindicationpopulationrace.getCoding();
		for(int medicinalproductcontraindicationpopulationracecodingi = 0; medicinalproductcontraindicationpopulationracecodingi<medicinalproductcontraindicationpopulationracecodinglist.size();medicinalproductcontraindicationpopulationracecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationpopulationracecoding = medicinalproductcontraindicationpopulationracecodinglist.get(medicinalproductcontraindicationpopulationracecodingi);

		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgDsply("[[");}
		if(medicinalproductcontraindicationpopulationracecoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnPoplnRaceCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnRaceCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationpopulationracecodingi == medicinalproductcontraindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgVrsn("[[");}
		if(medicinalproductcontraindicationpopulationracecoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnPoplnRaceCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnRaceCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationpopulationracecodingi == medicinalproductcontraindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgCd("[[");}
		if(medicinalproductcontraindicationpopulationracecoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnPoplnRaceCdgCd(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnRaceCdgCd("NULL");
		}

		if(medicinalproductcontraindicationpopulationracecodingi == medicinalproductcontraindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationpopulationracecoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationpopulationracecodingi == medicinalproductcontraindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationracecodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgSys("[[");}
		if(medicinalproductcontraindicationpopulationracecoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnPoplnRaceCdgSys(String.valueOf(medicinalproductcontraindicationpopulationracecoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnRaceCdgSys("NULL");
		}

		if(medicinalproductcontraindicationpopulationracecodingi == medicinalproductcontraindicationpopulationracecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnRaceCdgSys("]]");}


		 };
		/******************** medicinalproductcontraindicationpopulationgender ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationgender = medicinalproductcontraindicationpopulation.getGender();

		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnGenderTxt("[");}
		if(medicinalproductcontraindicationpopulationgender.hasText()) {

			m.addMdcnlPrdctCntraindctnPoplnGenderTxt(String.valueOf(medicinalproductcontraindicationpopulationgender.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnGenderTxt("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnGenderTxt("]");}


		/******************** medicinalproductcontraindicationpopulationgendercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationpopulationgendercodinglist = medicinalproductcontraindicationpopulationgender.getCoding();
		for(int medicinalproductcontraindicationpopulationgendercodingi = 0; medicinalproductcontraindicationpopulationgendercodingi<medicinalproductcontraindicationpopulationgendercodinglist.size();medicinalproductcontraindicationpopulationgendercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationpopulationgendercoding = medicinalproductcontraindicationpopulationgendercodinglist.get(medicinalproductcontraindicationpopulationgendercodingi);

		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgDsply("[[");}
		if(medicinalproductcontraindicationpopulationgendercoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnPoplnGenderCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnGenderCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationpopulationgendercodingi == medicinalproductcontraindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgVrsn("[[");}
		if(medicinalproductcontraindicationpopulationgendercoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnPoplnGenderCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnGenderCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationpopulationgendercodingi == medicinalproductcontraindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgCd("[[");}
		if(medicinalproductcontraindicationpopulationgendercoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnPoplnGenderCdgCd(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnGenderCdgCd("NULL");
		}

		if(medicinalproductcontraindicationpopulationgendercodingi == medicinalproductcontraindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationpopulationgendercoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationpopulationgendercodingi == medicinalproductcontraindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationgendercodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgSys("[[");}
		if(medicinalproductcontraindicationpopulationgendercoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnPoplnGenderCdgSys(String.valueOf(medicinalproductcontraindicationpopulationgendercoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnGenderCdgSys("NULL");
		}

		if(medicinalproductcontraindicationpopulationgendercodingi == medicinalproductcontraindicationpopulationgendercodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnGenderCdgSys("]]");}


		 };
		/******************** medicinalproductcontraindicationpopulationagecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationagecodeableconcept = medicinalproductcontraindicationpopulation.getAgeCodeableConcept();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt("[");}
		if(medicinalproductcontraindicationpopulationagecodeableconcept.hasText()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt("]");}


		/******************** medicinalproductcontraindicationpopulationagecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationpopulationagecodeableconceptcodinglist = medicinalproductcontraindicationpopulationagecodeableconcept.getCoding();
		for(int medicinalproductcontraindicationpopulationagecodeableconceptcodingi = 0; medicinalproductcontraindicationpopulationagecodeableconceptcodingi<medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.size();medicinalproductcontraindicationpopulationagecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationpopulationagecodeableconceptcoding = medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.get(medicinalproductcontraindicationpopulationagecodeableconceptcodingi);

		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply("[[");}
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn("[[");}
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd("[[");}
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys("[[");}
		if(medicinalproductcontraindicationpopulationagecodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys(String.valueOf(medicinalproductcontraindicationpopulationagecodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductcontraindicationpopulationagecodeableconceptcodingi == medicinalproductcontraindicationpopulationagecodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys("]]");}


		 };
		/******************** medicinalproductcontraindicationpopulationphysiologicalcondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationpopulationphysiologicalcondition = medicinalproductcontraindicationpopulation.getPhysiologicalCondition();

		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt("[");}
		if(medicinalproductcontraindicationpopulationphysiologicalcondition.hasText()) {

			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalcondition.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt("]");}


		/******************** medicinalproductcontraindicationpopulationphysiologicalconditioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist = medicinalproductcontraindicationpopulationphysiologicalcondition.getCoding();
		for(int medicinalproductcontraindicationpopulationphysiologicalconditioncodingi = 0; medicinalproductcontraindicationpopulationphysiologicalconditioncodingi<medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.size();medicinalproductcontraindicationpopulationphysiologicalconditioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationpopulationphysiologicalconditioncoding = medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.get(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi);

		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply("[[");}
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn("[[");}
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd("[[");}
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd("NULL");
		}

		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd("[[");}
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd("]]");}


		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == 0) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys("[[");}
		if(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys(String.valueOf(medicinalproductcontraindicationpopulationphysiologicalconditioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys("NULL");
		}

		if(medicinalproductcontraindicationpopulationphysiologicalconditioncodingi == medicinalproductcontraindicationpopulationphysiologicalconditioncodinglist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys("]]");}


		 };
		/******************** medicinalproductcontraindicationpopulationagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicinalproductcontraindicationpopulationagerange = medicinalproductcontraindicationpopulation.getAgeRange();

		/******************** medicinalproductcontraindicationpopulationagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductcontraindicationpopulationagerangelow = medicinalproductcontraindicationpopulationagerange.getLow();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwVl("[");}
		if(medicinalproductcontraindicationpopulationagerangelow.hasValue()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwVl(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getValue()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwVl("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwVl("]");}


		/******************** medicinalproductcontraindicationpopulationagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductcontraindicationpopulationagerangelowcomparator = medicinalproductcontraindicationpopulationagerangelow.getComparator();
		if(medicinalproductcontraindicationpopulationagerangelowcomparator!=null) {
		if(medicinalproductcontraindicationpopulationi == 0) {

		m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr("[");		}
			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr(medicinalproductcontraindicationpopulationagerangelowcomparator.toCode());
		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {

		m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr("]");		}

		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr("NULL");
		}

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCd("[");}
		if(medicinalproductcontraindicationpopulationagerangelow.hasCode()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCd(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCd("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwCd("]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwUnt("[");}
		if(medicinalproductcontraindicationpopulationagerangelow.hasUnit()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwUnt(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getUnit()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwUnt("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwUnt("]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwSys("[");}
		if(medicinalproductcontraindicationpopulationagerangelow.hasSystem()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwSys(String.valueOf(medicinalproductcontraindicationpopulationagerangelow.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngLwSys("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngLwSys("]");}


		/******************** medicinalproductcontraindicationpopulationagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductcontraindicationpopulationagerangehigh = medicinalproductcontraindicationpopulationagerange.getHigh();

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiVl("[");}
		if(medicinalproductcontraindicationpopulationagerangehigh.hasValue()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiVl(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getValue()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiVl("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiVl("]");}


		/******************** medicinalproductcontraindicationpopulationagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductcontraindicationpopulationagerangehighcomparator = medicinalproductcontraindicationpopulationagerangehigh.getComparator();
		if(medicinalproductcontraindicationpopulationagerangehighcomparator!=null) {
		if(medicinalproductcontraindicationpopulationi == 0) {

		m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr("[");		}
			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr(medicinalproductcontraindicationpopulationagerangehighcomparator.toCode());
		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {

		m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr("]");		}

		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr("NULL");
		}

		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCd("[");}
		if(medicinalproductcontraindicationpopulationagerangehigh.hasCode()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCd(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCd("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiCd("]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiUnt("[");}
		if(medicinalproductcontraindicationpopulationagerangehigh.hasUnit()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiUnt(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getUnit()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiUnt("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiUnt("]");}


		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(medicinalproductcontraindicationpopulationi == 0) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiSys("[");}
		if(medicinalproductcontraindicationpopulationagerangehigh.hasSystem()) {

			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiSys(String.valueOf(medicinalproductcontraindicationpopulationagerangehigh.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnPoplnAgeRngHiSys("NULL");
		}

		if(medicinalproductcontraindicationpopulationi == medicinalproductcontraindicationpopulationlist.size()-1) {m.addMdcnlPrdctCntraindctnPoplnAgeRngHiSys("]");}


		 };
		/******************** medicinalproductcontraindicationdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcontraindicationdisease = medicinalproductcontraindication.getDisease();

		/******************** MdcnlPrdctCntraindctn_Disease_Txt ********************************************************************************/
		if(medicinalproductcontraindicationdisease.hasText()) {

			m.addMdcnlPrdctCntraindctnDiseaseTxt(String.valueOf(medicinalproductcontraindicationdisease.getText()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseTxt("NULL");
		}


		/******************** medicinalproductcontraindicationdiseasecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcontraindicationdiseasecodinglist = medicinalproductcontraindicationdisease.getCoding();
		for(int medicinalproductcontraindicationdiseasecodingi = 0; medicinalproductcontraindicationdiseasecodingi<medicinalproductcontraindicationdiseasecodinglist.size();medicinalproductcontraindicationdiseasecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcontraindicationdiseasecoding = medicinalproductcontraindicationdiseasecodinglist.get(medicinalproductcontraindicationdiseasecodingi);

		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseCdgDsply("[");}
		if(medicinalproductcontraindicationdiseasecoding.hasDisplay()) {

			m.addMdcnlPrdctCntraindctnDiseaseCdgDsply(String.valueOf(medicinalproductcontraindicationdiseasecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseCdgDsply("NULL");
		}

		if(medicinalproductcontraindicationdiseasecodingi == medicinalproductcontraindicationdiseasecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseCdgDsply("]");}


		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseCdgVrsn("[");}
		if(medicinalproductcontraindicationdiseasecoding.hasVersion()) {

			m.addMdcnlPrdctCntraindctnDiseaseCdgVrsn(String.valueOf(medicinalproductcontraindicationdiseasecoding.getVersion()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseCdgVrsn("NULL");
		}

		if(medicinalproductcontraindicationdiseasecodingi == medicinalproductcontraindicationdiseasecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseCdgVrsn("]");}


		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Cd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseCdgCd("[");}
		if(medicinalproductcontraindicationdiseasecoding.hasCode()) {

			m.addMdcnlPrdctCntraindctnDiseaseCdgCd(String.valueOf(medicinalproductcontraindicationdiseasecoding.getCode()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseCdgCd("NULL");
		}

		if(medicinalproductcontraindicationdiseasecodingi == medicinalproductcontraindicationdiseasecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseCdgCd("]");}


		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseCdgUsrSltd("[");}
		if(medicinalproductcontraindicationdiseasecoding.hasUserSelected()) {

			m.addMdcnlPrdctCntraindctnDiseaseCdgUsrSltd(String.valueOf(medicinalproductcontraindicationdiseasecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseCdgUsrSltd("NULL");
		}

		if(medicinalproductcontraindicationdiseasecodingi == medicinalproductcontraindicationdiseasecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseCdgUsrSltd("]");}


		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Sys ********************************************************************************/
		if(medicinalproductcontraindicationdiseasecodingi == 0) {m.addMdcnlPrdctCntraindctnDiseaseCdgSys("[");}
		if(medicinalproductcontraindicationdiseasecoding.hasSystem()) {

			m.addMdcnlPrdctCntraindctnDiseaseCdgSys(String.valueOf(medicinalproductcontraindicationdiseasecoding.getSystem()));
		} else {
			m.addMdcnlPrdctCntraindctnDiseaseCdgSys("NULL");
		}

		if(medicinalproductcontraindicationdiseasecodingi == medicinalproductcontraindicationdiseasecodinglist.size()-1) {m.addMdcnlPrdctCntraindctnDiseaseCdgSys("]");}


		 };
		return m;
	}
}
