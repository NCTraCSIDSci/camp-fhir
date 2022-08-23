package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationKnowledge;
public class MedicationKnowledgeBidirectionalConversion 
{
	public MedicationKnowledge MedicationKnowledges(org.hl7.fhir.r4.model.MedicationKnowledge medicationknowledge) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationKnowledge m = new  main.java.com.campfhir.model.MedicationKnowledge();

		/******************** id ********************************************************************************/
		m.setId(medicationknowledge.getIdElement().getIdPart());

		/******************** MdctnKnldg_Synonym ********************************************************************************/
		if(medicationknowledge.hasSynonym()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledge.getSynonym().size(); incr++) {
				array = array + medicationknowledge.getSynonym().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgSynonym(array);

		} else {
			m.addMdctnKnldgSynonym("NULL");
		}


		/******************** medicationknowledgecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgecode = medicationknowledge.getCode();

		/******************** MdctnKnldg_Cd_Txt ********************************************************************************/
		if(medicationknowledgecode.hasText()) {

			m.addMdctnKnldgCdTxt(String.valueOf(medicationknowledgecode.getText()));
		} else {
			m.addMdctnKnldgCdTxt("NULL");
		}


		/******************** medicationknowledgecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgecodecodinglist = medicationknowledgecode.getCoding();
		for(int medicationknowledgecodecodingi = 0; medicationknowledgecodecodingi<medicationknowledgecodecodinglist.size();medicationknowledgecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgecodecoding = medicationknowledgecodecodinglist.get(medicationknowledgecodecodingi);

		/******************** MdctnKnldg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgecodecodingi == 0) {m.addMdctnKnldgCdCdgDsply("[");}
		if(medicationknowledgecodecoding.hasDisplay()) {

			m.addMdctnKnldgCdCdgDsply(String.valueOf(medicationknowledgecodecoding.getDisplay()));
		} else {
			m.addMdctnKnldgCdCdgDsply("NULL");
		}

		if(medicationknowledgecodecodingi == medicationknowledgecodecodinglist.size()-1) {m.addMdctnKnldgCdCdgDsply("]");}


		/******************** MdctnKnldg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgecodecodingi == 0) {m.addMdctnKnldgCdCdgVrsn("[");}
		if(medicationknowledgecodecoding.hasVersion()) {

			m.addMdctnKnldgCdCdgVrsn(String.valueOf(medicationknowledgecodecoding.getVersion()));
		} else {
			m.addMdctnKnldgCdCdgVrsn("NULL");
		}

		if(medicationknowledgecodecodingi == medicationknowledgecodecodinglist.size()-1) {m.addMdctnKnldgCdCdgVrsn("]");}


		/******************** MdctnKnldg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationknowledgecodecodingi == 0) {m.addMdctnKnldgCdCdgCd("[");}
		if(medicationknowledgecodecoding.hasCode()) {

			m.addMdctnKnldgCdCdgCd(String.valueOf(medicationknowledgecodecoding.getCode()));
		} else {
			m.addMdctnKnldgCdCdgCd("NULL");
		}

		if(medicationknowledgecodecodingi == medicationknowledgecodecodinglist.size()-1) {m.addMdctnKnldgCdCdgCd("]");}


		/******************** MdctnKnldg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgecodecodingi == 0) {m.addMdctnKnldgCdCdgUsrSltd("[");}
		if(medicationknowledgecodecoding.hasUserSelected()) {

			m.addMdctnKnldgCdCdgUsrSltd(String.valueOf(medicationknowledgecodecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgCdCdgUsrSltd("NULL");
		}

		if(medicationknowledgecodecodingi == medicationknowledgecodecodinglist.size()-1) {m.addMdctnKnldgCdCdgUsrSltd("]");}


		/******************** MdctnKnldg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationknowledgecodecodingi == 0) {m.addMdctnKnldgCdCdgSys("[");}
		if(medicationknowledgecodecoding.hasSystem()) {

			m.addMdctnKnldgCdCdgSys(String.valueOf(medicationknowledgecodecoding.getSystem()));
		} else {
			m.addMdctnKnldgCdCdgSys("NULL");
		}

		if(medicationknowledgecodecodingi == medicationknowledgecodecodinglist.size()-1) {m.addMdctnKnldgCdCdgSys("]");}


		 };
		/******************** medicationknowledgestatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeStatus medicationknowledgestatus = medicationknowledge.getStatus();
		if(medicationknowledgestatus!=null) {
			m.addMdctnKnldgSts(medicationknowledgestatus.toCode());
		} else {
			m.addMdctnKnldgSts("NULL");
		}

		/******************** MdctnKnldg_AssociatedMdctn ********************************************************************************/
		if(medicationknowledge.hasAssociatedMedication()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledge.getAssociatedMedication().size(); incr++) {
				array = array + medicationknowledge.getAssociatedMedication().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgAssociatedMdctn(array);

		} else {
			m.addMdctnKnldgAssociatedMdctn("NULL");
		}


		/******************** medicationknowledgerelatedmedicationknowledge ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent> medicationknowledgerelatedmedicationknowledgelist = medicationknowledge.getRelatedMedicationKnowledge();
		for(int medicationknowledgerelatedmedicationknowledgei = 0; medicationknowledgerelatedmedicationknowledgei<medicationknowledgerelatedmedicationknowledgelist.size();medicationknowledgerelatedmedicationknowledgei++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent  medicationknowledgerelatedmedicationknowledge = medicationknowledgerelatedmedicationknowledgelist.get(medicationknowledgerelatedmedicationknowledgei);

		/******************** MdctnKnldg_RltedMdctnKnldg_Rfrnc ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgei == 0) {m.addMdctnKnldgRltedMdctnKnldgRfrnc("[");}
		if(medicationknowledgerelatedmedicationknowledge.hasReference()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledgerelatedmedicationknowledge.getReference().size(); incr++) {
				array = array + medicationknowledgerelatedmedicationknowledge.getReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgRltedMdctnKnldgRfrnc(array);

		} else {
			m.addMdctnKnldgRltedMdctnKnldgRfrnc("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgei == medicationknowledgerelatedmedicationknowledgelist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgRfrnc("]");}


		/******************** medicationknowledgerelatedmedicationknowledgetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgerelatedmedicationknowledgetype = medicationknowledgerelatedmedicationknowledge.getType();

		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Txt ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgei == 0) {m.addMdctnKnldgRltedMdctnKnldgTypTxt("[");}
		if(medicationknowledgerelatedmedicationknowledgetype.hasText()) {

			m.addMdctnKnldgRltedMdctnKnldgTypTxt(String.valueOf(medicationknowledgerelatedmedicationknowledgetype.getText()));
		} else {
			m.addMdctnKnldgRltedMdctnKnldgTypTxt("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgei == medicationknowledgerelatedmedicationknowledgelist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgTypTxt("]");}


		/******************** medicationknowledgerelatedmedicationknowledgetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgerelatedmedicationknowledgetypecodinglist = medicationknowledgerelatedmedicationknowledgetype.getCoding();
		for(int medicationknowledgerelatedmedicationknowledgetypecodingi = 0; medicationknowledgerelatedmedicationknowledgetypecodingi<medicationknowledgerelatedmedicationknowledgetypecodinglist.size();medicationknowledgerelatedmedicationknowledgetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgerelatedmedicationknowledgetypecoding = medicationknowledgerelatedmedicationknowledgetypecodinglist.get(medicationknowledgerelatedmedicationknowledgetypecodingi);

		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecodingi == 0) {m.addMdctnKnldgRltedMdctnKnldgTypCdgDsply("[[");}
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasDisplay()) {

			m.addMdctnKnldgRltedMdctnKnldgTypCdgDsply(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgRltedMdctnKnldgTypCdgDsply("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgetypecodingi == medicationknowledgerelatedmedicationknowledgetypecodinglist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgTypCdgDsply("]]");}


		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecodingi == 0) {m.addMdctnKnldgRltedMdctnKnldgTypCdgVrsn("[[");}
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasVersion()) {

			m.addMdctnKnldgRltedMdctnKnldgTypCdgVrsn(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getVersion()));
		} else {
			m.addMdctnKnldgRltedMdctnKnldgTypCdgVrsn("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgetypecodingi == medicationknowledgerelatedmedicationknowledgetypecodinglist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgTypCdgVrsn("]]");}


		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecodingi == 0) {m.addMdctnKnldgRltedMdctnKnldgTypCdgCd("[[");}
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasCode()) {

			m.addMdctnKnldgRltedMdctnKnldgTypCdgCd(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getCode()));
		} else {
			m.addMdctnKnldgRltedMdctnKnldgTypCdgCd("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgetypecodingi == medicationknowledgerelatedmedicationknowledgetypecodinglist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgTypCdgCd("]]");}


		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecodingi == 0) {m.addMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd("[[");}
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasUserSelected()) {

			m.addMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgetypecodingi == medicationknowledgerelatedmedicationknowledgetypecodinglist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecodingi == 0) {m.addMdctnKnldgRltedMdctnKnldgTypCdgSys("[[");}
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasSystem()) {

			m.addMdctnKnldgRltedMdctnKnldgTypCdgSys(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getSystem()));
		} else {
			m.addMdctnKnldgRltedMdctnKnldgTypCdgSys("NULL");
		}

		if(medicationknowledgerelatedmedicationknowledgetypecodingi == medicationknowledgerelatedmedicationknowledgetypecodinglist.size()-1) {m.addMdctnKnldgRltedMdctnKnldgTypCdgSys("]]");}


		 };
		 };
		/******************** MdctnKnldg_Cntraindctn ********************************************************************************/
		if(medicationknowledge.hasContraindication()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledge.getContraindication().size(); incr++) {
				array = array + medicationknowledge.getContraindication().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgCntraindctn(array);

		} else {
			m.addMdctnKnldgCntraindctn("NULL");
		}


		/******************** medicationknowledgemonitoringprogram ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent> medicationknowledgemonitoringprogramlist = medicationknowledge.getMonitoringProgram();
		for(int medicationknowledgemonitoringprogrami = 0; medicationknowledgemonitoringprogrami<medicationknowledgemonitoringprogramlist.size();medicationknowledgemonitoringprogrami++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent  medicationknowledgemonitoringprogram = medicationknowledgemonitoringprogramlist.get(medicationknowledgemonitoringprogrami);

		/******************** MdctnKnldg_MonitoringPrgrm_Nm ********************************************************************************/
		if(medicationknowledgemonitoringprogrami == 0) {m.addMdctnKnldgMonitoringPrgrmNm("[");}
		if(medicationknowledgemonitoringprogram.hasName()) {

			m.addMdctnKnldgMonitoringPrgrmNm(String.valueOf(medicationknowledgemonitoringprogram.getName()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmNm("NULL");
		}

		if(medicationknowledgemonitoringprogrami == medicationknowledgemonitoringprogramlist.size()-1) {m.addMdctnKnldgMonitoringPrgrmNm("]");}


		/******************** medicationknowledgemonitoringprogramtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemonitoringprogramtype = medicationknowledgemonitoringprogram.getType();

		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Txt ********************************************************************************/
		if(medicationknowledgemonitoringprogrami == 0) {m.addMdctnKnldgMonitoringPrgrmTypTxt("[");}
		if(medicationknowledgemonitoringprogramtype.hasText()) {

			m.addMdctnKnldgMonitoringPrgrmTypTxt(String.valueOf(medicationknowledgemonitoringprogramtype.getText()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmTypTxt("NULL");
		}

		if(medicationknowledgemonitoringprogrami == medicationknowledgemonitoringprogramlist.size()-1) {m.addMdctnKnldgMonitoringPrgrmTypTxt("]");}


		/******************** medicationknowledgemonitoringprogramtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgemonitoringprogramtypecodinglist = medicationknowledgemonitoringprogramtype.getCoding();
		for(int medicationknowledgemonitoringprogramtypecodingi = 0; medicationknowledgemonitoringprogramtypecodingi<medicationknowledgemonitoringprogramtypecodinglist.size();medicationknowledgemonitoringprogramtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgemonitoringprogramtypecoding = medicationknowledgemonitoringprogramtypecodinglist.get(medicationknowledgemonitoringprogramtypecodingi);

		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecodingi == 0) {m.addMdctnKnldgMonitoringPrgrmTypCdgDsply("[[");}
		if(medicationknowledgemonitoringprogramtypecoding.hasDisplay()) {

			m.addMdctnKnldgMonitoringPrgrmTypCdgDsply(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmTypCdgDsply("NULL");
		}

		if(medicationknowledgemonitoringprogramtypecodingi == medicationknowledgemonitoringprogramtypecodinglist.size()-1) {m.addMdctnKnldgMonitoringPrgrmTypCdgDsply("]]");}


		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecodingi == 0) {m.addMdctnKnldgMonitoringPrgrmTypCdgVrsn("[[");}
		if(medicationknowledgemonitoringprogramtypecoding.hasVersion()) {

			m.addMdctnKnldgMonitoringPrgrmTypCdgVrsn(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getVersion()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmTypCdgVrsn("NULL");
		}

		if(medicationknowledgemonitoringprogramtypecodingi == medicationknowledgemonitoringprogramtypecodinglist.size()-1) {m.addMdctnKnldgMonitoringPrgrmTypCdgVrsn("]]");}


		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecodingi == 0) {m.addMdctnKnldgMonitoringPrgrmTypCdgCd("[[");}
		if(medicationknowledgemonitoringprogramtypecoding.hasCode()) {

			m.addMdctnKnldgMonitoringPrgrmTypCdgCd(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getCode()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmTypCdgCd("NULL");
		}

		if(medicationknowledgemonitoringprogramtypecodingi == medicationknowledgemonitoringprogramtypecodinglist.size()-1) {m.addMdctnKnldgMonitoringPrgrmTypCdgCd("]]");}


		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecodingi == 0) {m.addMdctnKnldgMonitoringPrgrmTypCdgUsrSltd("[[");}
		if(medicationknowledgemonitoringprogramtypecoding.hasUserSelected()) {

			m.addMdctnKnldgMonitoringPrgrmTypCdgUsrSltd(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgemonitoringprogramtypecodingi == medicationknowledgemonitoringprogramtypecodinglist.size()-1) {m.addMdctnKnldgMonitoringPrgrmTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecodingi == 0) {m.addMdctnKnldgMonitoringPrgrmTypCdgSys("[[");}
		if(medicationknowledgemonitoringprogramtypecoding.hasSystem()) {

			m.addMdctnKnldgMonitoringPrgrmTypCdgSys(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getSystem()));
		} else {
			m.addMdctnKnldgMonitoringPrgrmTypCdgSys("NULL");
		}

		if(medicationknowledgemonitoringprogramtypecodingi == medicationknowledgemonitoringprogramtypecodinglist.size()-1) {m.addMdctnKnldgMonitoringPrgrmTypCdgSys("]]");}


		 };
		 };
		/******************** medicationknowledgemedicineclassification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent> medicationknowledgemedicineclassificationlist = medicationknowledge.getMedicineClassification();
		for(int medicationknowledgemedicineclassificationi = 0; medicationknowledgemedicineclassificationi<medicationknowledgemedicineclassificationlist.size();medicationknowledgemedicineclassificationi++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent  medicationknowledgemedicineclassification = medicationknowledgemedicineclassificationlist.get(medicationknowledgemedicineclassificationi);

		/******************** medicationknowledgemedicineclassificationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemedicineclassificationtype = medicationknowledgemedicineclassification.getType();

		/******************** MdctnKnldg_MedicineClsfctn_Typ_Txt ********************************************************************************/
		if(medicationknowledgemedicineclassificationi == 0) {m.addMdctnKnldgMedicineClsfctnTypTxt("[");}
		if(medicationknowledgemedicineclassificationtype.hasText()) {

			m.addMdctnKnldgMedicineClsfctnTypTxt(String.valueOf(medicationknowledgemedicineclassificationtype.getText()));
		} else {
			m.addMdctnKnldgMedicineClsfctnTypTxt("NULL");
		}

		if(medicationknowledgemedicineclassificationi == medicationknowledgemedicineclassificationlist.size()-1) {m.addMdctnKnldgMedicineClsfctnTypTxt("]");}


		/******************** medicationknowledgemedicineclassificationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgemedicineclassificationtypecodinglist = medicationknowledgemedicineclassificationtype.getCoding();
		for(int medicationknowledgemedicineclassificationtypecodingi = 0; medicationknowledgemedicineclassificationtypecodingi<medicationknowledgemedicineclassificationtypecodinglist.size();medicationknowledgemedicineclassificationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgemedicineclassificationtypecoding = medicationknowledgemedicineclassificationtypecodinglist.get(medicationknowledgemedicineclassificationtypecodingi);

		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecodingi == 0) {m.addMdctnKnldgMedicineClsfctnTypCdgDsply("[[");}
		if(medicationknowledgemedicineclassificationtypecoding.hasDisplay()) {

			m.addMdctnKnldgMedicineClsfctnTypCdgDsply(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgMedicineClsfctnTypCdgDsply("NULL");
		}

		if(medicationknowledgemedicineclassificationtypecodingi == medicationknowledgemedicineclassificationtypecodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnTypCdgDsply("]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecodingi == 0) {m.addMdctnKnldgMedicineClsfctnTypCdgVrsn("[[");}
		if(medicationknowledgemedicineclassificationtypecoding.hasVersion()) {

			m.addMdctnKnldgMedicineClsfctnTypCdgVrsn(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getVersion()));
		} else {
			m.addMdctnKnldgMedicineClsfctnTypCdgVrsn("NULL");
		}

		if(medicationknowledgemedicineclassificationtypecodingi == medicationknowledgemedicineclassificationtypecodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnTypCdgVrsn("]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecodingi == 0) {m.addMdctnKnldgMedicineClsfctnTypCdgCd("[[");}
		if(medicationknowledgemedicineclassificationtypecoding.hasCode()) {

			m.addMdctnKnldgMedicineClsfctnTypCdgCd(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getCode()));
		} else {
			m.addMdctnKnldgMedicineClsfctnTypCdgCd("NULL");
		}

		if(medicationknowledgemedicineclassificationtypecodingi == medicationknowledgemedicineclassificationtypecodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnTypCdgCd("]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecodingi == 0) {m.addMdctnKnldgMedicineClsfctnTypCdgUsrSltd("[[");}
		if(medicationknowledgemedicineclassificationtypecoding.hasUserSelected()) {

			m.addMdctnKnldgMedicineClsfctnTypCdgUsrSltd(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgMedicineClsfctnTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgemedicineclassificationtypecodingi == medicationknowledgemedicineclassificationtypecodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecodingi == 0) {m.addMdctnKnldgMedicineClsfctnTypCdgSys("[[");}
		if(medicationknowledgemedicineclassificationtypecoding.hasSystem()) {

			m.addMdctnKnldgMedicineClsfctnTypCdgSys(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getSystem()));
		} else {
			m.addMdctnKnldgMedicineClsfctnTypCdgSys("NULL");
		}

		if(medicationknowledgemedicineclassificationtypecodingi == medicationknowledgemedicineclassificationtypecodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnTypCdgSys("]]");}


		 };
		/******************** medicationknowledgemedicineclassificationclassification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationknowledgemedicineclassificationclassificationlist = medicationknowledgemedicineclassification.getClassification();
		for(int medicationknowledgemedicineclassificationclassificationi = 0; medicationknowledgemedicineclassificationclassificationi<medicationknowledgemedicineclassificationclassificationlist.size();medicationknowledgemedicineclassificationclassificationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationknowledgemedicineclassificationclassification = medicationknowledgemedicineclassificationclassificationlist.get(medicationknowledgemedicineclassificationclassificationi);

		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Txt ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationi == 0) {m.addMdctnKnldgMedicineClsfctnClsfctnTxt("[[");}
		if(medicationknowledgemedicineclassificationclassification.hasText()) {

			m.addMdctnKnldgMedicineClsfctnClsfctnTxt(String.valueOf(medicationknowledgemedicineclassificationclassification.getText()));
		} else {
			m.addMdctnKnldgMedicineClsfctnClsfctnTxt("NULL");
		}

		if(medicationknowledgemedicineclassificationclassificationi == medicationknowledgemedicineclassificationclassificationlist.size()-1) {m.addMdctnKnldgMedicineClsfctnClsfctnTxt("]]");}


		/******************** medicationknowledgemedicineclassificationclassificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgemedicineclassificationclassificationcodinglist = medicationknowledgemedicineclassificationclassification.getCoding();
		for(int medicationknowledgemedicineclassificationclassificationcodingi = 0; medicationknowledgemedicineclassificationclassificationcodingi<medicationknowledgemedicineclassificationclassificationcodinglist.size();medicationknowledgemedicineclassificationclassificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgemedicineclassificationclassificationcoding = medicationknowledgemedicineclassificationclassificationcodinglist.get(medicationknowledgemedicineclassificationclassificationcodingi);

		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcodingi == 0) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgDsply("[[[");}
		if(medicationknowledgemedicineclassificationclassificationcoding.hasDisplay()) {

			m.addMdctnKnldgMedicineClsfctnClsfctnCdgDsply(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getDisplay()));
		} else {
			m.addMdctnKnldgMedicineClsfctnClsfctnCdgDsply("NULL");
		}

		if(medicationknowledgemedicineclassificationclassificationcodingi == medicationknowledgemedicineclassificationclassificationcodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgDsply("]]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcodingi == 0) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgVrsn("[[[");}
		if(medicationknowledgemedicineclassificationclassificationcoding.hasVersion()) {

			m.addMdctnKnldgMedicineClsfctnClsfctnCdgVrsn(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getVersion()));
		} else {
			m.addMdctnKnldgMedicineClsfctnClsfctnCdgVrsn("NULL");
		}

		if(medicationknowledgemedicineclassificationclassificationcodingi == medicationknowledgemedicineclassificationclassificationcodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgVrsn("]]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcodingi == 0) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgCd("[[[");}
		if(medicationknowledgemedicineclassificationclassificationcoding.hasCode()) {

			m.addMdctnKnldgMedicineClsfctnClsfctnCdgCd(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getCode()));
		} else {
			m.addMdctnKnldgMedicineClsfctnClsfctnCdgCd("NULL");
		}

		if(medicationknowledgemedicineclassificationclassificationcodingi == medicationknowledgemedicineclassificationclassificationcodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgCd("]]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcodingi == 0) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd("[[[");}
		if(medicationknowledgemedicineclassificationclassificationcoding.hasUserSelected()) {

			m.addMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd("NULL");
		}

		if(medicationknowledgemedicineclassificationclassificationcodingi == medicationknowledgemedicineclassificationclassificationcodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd("]]]");}


		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcodingi == 0) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgSys("[[[");}
		if(medicationknowledgemedicineclassificationclassificationcoding.hasSystem()) {

			m.addMdctnKnldgMedicineClsfctnClsfctnCdgSys(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getSystem()));
		} else {
			m.addMdctnKnldgMedicineClsfctnClsfctnCdgSys("NULL");
		}

		if(medicationknowledgemedicineclassificationclassificationcodingi == medicationknowledgemedicineclassificationclassificationcodinglist.size()-1) {m.addMdctnKnldgMedicineClsfctnClsfctnCdgSys("]]]");}


		 };
		 };
		 };
		/******************** MdctnKnldg_PreparationInstrctn ********************************************************************************/
		if(medicationknowledge.hasPreparationInstruction()) {

			m.addMdctnKnldgPreparationInstrctn(String.valueOf(medicationknowledge.getPreparationInstruction()));
		} else {
			m.addMdctnKnldgPreparationInstrctn("NULL");
		}


		/******************** medicationknowledgeadministrationguidelines ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent> medicationknowledgeadministrationguidelineslist = medicationknowledge.getAdministrationGuidelines();
		for(int medicationknowledgeadministrationguidelinesi = 0; medicationknowledgeadministrationguidelinesi<medicationknowledgeadministrationguidelineslist.size();medicationknowledgeadministrationguidelinesi++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent  medicationknowledgeadministrationguidelines = medicationknowledgeadministrationguidelineslist.get(medicationknowledgeadministrationguidelinesi);

		/******************** medicationknowledgeadministrationguidelinesdosage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent> medicationknowledgeadministrationguidelinesdosagelist = medicationknowledgeadministrationguidelines.getDosage();
		for(int medicationknowledgeadministrationguidelinesdosagei = 0; medicationknowledgeadministrationguidelinesdosagei<medicationknowledgeadministrationguidelinesdosagelist.size();medicationknowledgeadministrationguidelinesdosagei++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent  medicationknowledgeadministrationguidelinesdosage = medicationknowledgeadministrationguidelinesdosagelist.get(medicationknowledgeadministrationguidelinesdosagei);

		/******************** medicationknowledgeadministrationguidelinesdosagetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagetype = medicationknowledgeadministrationguidelinesdosage.getType();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagei == 0) {m.addMdctnKnldgAdmnGdlnsDsgTypTxt("[[");}
		if(medicationknowledgeadministrationguidelinesdosagetype.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgTypTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagetype.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgTypTxt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagei == medicationknowledgeadministrationguidelinesdosagelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgTypTxt("]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagetypecodinglist = medicationknowledgeadministrationguidelinesdosagetype.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagetypecodingi = 0; medicationknowledgeadministrationguidelinesdosagetypecodingi<medicationknowledgeadministrationguidelinesdosagetypecodinglist.size();medicationknowledgeadministrationguidelinesdosagetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagetypecoding = medicationknowledgeadministrationguidelinesdosagetypecodinglist.get(medicationknowledgeadministrationguidelinesdosagetypecodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgDsply("[[[");}
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgTypCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgTypCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == medicationknowledgeadministrationguidelinesdosagetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgDsply("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgVrsn("[[[");}
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgTypCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgTypCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == medicationknowledgeadministrationguidelinesdosagetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgVrsn("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgCd("[[[");}
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgTypCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgTypCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == medicationknowledgeadministrationguidelinesdosagetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgCd("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd("[[[");}
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == medicationknowledgeadministrationguidelinesdosagetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgSys("[[[");}
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgTypCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgTypCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagetypecodingi == medicationknowledgeadministrationguidelinesdosagetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgTypCdgSys("]]]");}


		 };
		/******************** medicationknowledgeadministrationguidelinesdosagedosage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage> medicationknowledgeadministrationguidelinesdosagedosagelist = medicationknowledgeadministrationguidelinesdosage.getDosage();
		for(int medicationknowledgeadministrationguidelinesdosagedosagei = 0; medicationknowledgeadministrationguidelinesdosagedosagei<medicationknowledgeadministrationguidelinesdosagedosagelist.size();medicationknowledgeadministrationguidelinesdosagedosagei++ ) {
		org.hl7.fhir.r4.model.Dosage  medicationknowledgeadministrationguidelinesdosagedosage = medicationknowledgeadministrationguidelinesdosagedosagelist.get(medicationknowledgeadministrationguidelinesdosagedosagei);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagemethod = medicationknowledgeadministrationguidelinesdosagedosage.getMethod();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdTxt("[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagemethod.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethod.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdTxt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagei == medicationknowledgeadministrationguidelinesdosagedosagelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdTxt("]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist = medicationknowledgeadministrationguidelinesdosagedosagemethod.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi = 0; medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi<medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.size();medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosagemethodcoding = medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.get(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcodingi == medicationknowledgeadministrationguidelinesdosagedosagemethodcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys("]]]]");}


		 };
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist = medicationknowledgeadministrationguidelinesdosagedosage.getDoseAndRate();
		for(int medicationknowledgeadministrationguidelinesdosagedosagedoseandratei = 0; medicationknowledgeadministrationguidelinesdosagedosagedoseandratei<medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size();medicationknowledgeadministrationguidelinesdosagedosagedoseandratei++ ) {
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent  medicationknowledgeadministrationguidelinesdosagedosagedoseandrate = medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.get(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei);

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getType();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist = medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi = 0; medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi<medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.size();medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding = medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.get(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodingi == medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys("]]]]]");}


		 };
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getDoseRange();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange.getLow();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange.getHigh();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getRateQuantity();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getRateRatio();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator = medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio.getNumerator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator = medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio.getDenominator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getRateRange();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange.getLow();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange.getHigh();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getDoseQuantity();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator!=null) {
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr("[[[[");		}
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator.toCode());
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr("]]]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratei == medicationknowledgeadministrationguidelinesdosagedosagedoseandratelist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys("]]]]");}


		 };
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Sqnc ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasSequence()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSqnc(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getSequence()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSqnc("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagesite = medicationknowledgeadministrationguidelinesdosagedosage.getSite();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesite.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesite.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteTxt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagesitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist = medicationknowledgeadministrationguidelinesdosagedosagesite.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosagesitecodingi = 0; medicationknowledgeadministrationguidelinesdosagedosagesitecodingi<medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.size();medicationknowledgeadministrationguidelinesdosagedosagesitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosagesitecoding = medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.get(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagesitecodingi == medicationknowledgeadministrationguidelinesdosagedosagesitecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys("]]]]");}


		 };
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_PntInstrctn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasPatientInstruction()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getPatientInstruction()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTxt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationknowledgeadministrationguidelinesdosagedosagetiming = medicationknowledgeadministrationguidelinesdosagedosage.getTiming();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagetimingcode = medicationknowledgeadministrationguidelinesdosagedosagetiming.getCode();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcode.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcode.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist = medicationknowledgeadministrationguidelinesdosagedosagetimingcode.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi = 0; medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi<medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.size();medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding = medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.get(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodingi == medicationknowledgeadministrationguidelinesdosagedosagetimingcodecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys("]]]]");}


		 };
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evnt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledgeadministrationguidelinesdosagedosagetiming.getEvent().size(); incr++) {
				array = array + medicationknowledgeadministrationguidelinesdosagedosagetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt(array);

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat = medicationknowledgeadministrationguidelinesdosagedosagetiming.getRepeat();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasOffset()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getOffset()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasCount()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getCount()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasPeriod()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getPeriod()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasCountMax()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getCountMax()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasDurationMax()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDurationMax()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getBoundsPeriod();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.hasStart()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.hasEnd()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDurationUnit();
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt("NULL");
		}

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getBoundsDuration();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsdurationcomparator = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsdurationcomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCmprtr(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsdurationcomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationSys("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getBoundsRange();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange.getLow();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange.getHigh();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasFrequencyMax()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getFrequencyMax()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhenlist = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getWhen();
		for(int medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwheni = 0; medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwheni<medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhenlist.size();medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhenlist.get(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwheni);
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptWhen(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatwhen.getCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptWhen("NULL");
		}
		 };

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getPeriodUnit();
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasPeriodMax()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getPeriodMax()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeklist = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDayOfWeek();
		for(int medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeki = 0; medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeki<medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeklist.size();medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeklist.get(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweeki);
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDayOfWeek(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdayofweek.getCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay(array);

		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasDuration()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDuration()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasFrequency()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getFrequency()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration = medicationknowledgeadministrationguidelinesdosagedosage.getMaxDosePerAdministration();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod = medicationknowledgeadministrationguidelinesdosagedosage.getMaxDosePerPeriod();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod.getNumerator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod.getDenominator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructionlist = medicationknowledgeadministrationguidelinesdosagedosage.getAdditionalInstruction();
		for(int medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioni = 0; medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioni<medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructionlist.size();medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction = medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructionlist.get(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioni);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioni == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioni == medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructionlist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt("]]]]");}


		/******************** medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist = medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi = 0; medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi<medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.size();medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding = medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.get(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd("]]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys("[[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodingi == medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys("]]]]]");}


		 };
		 };
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime = medicationknowledgeadministrationguidelinesdosagedosage.getMaxDosePerLifetime();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getComparator();
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator!=null) {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator.toCode());
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt("NULL");
		}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept = medicationknowledgeadministrationguidelinesdosagedosage.getAsNeededCodeableConcept();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist = medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi = 0; medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi<medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.size();medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding = medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.get(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodingi == medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys("]]]]");}


		 };
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasAsNeededBooleanType()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp("\""+medicationknowledgeadministrationguidelinesdosagedosage.getAsNeededBooleanType().getValueAsString()+"\"");
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageroute = medicationknowledgeadministrationguidelinesdosagedosage.getRoute();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroute.hasText()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroute.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteTxt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesdosagedosageroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist = medicationknowledgeadministrationguidelinesdosagedosageroute.getCoding();
		for(int medicationknowledgeadministrationguidelinesdosagedosageroutecodingi = 0; medicationknowledgeadministrationguidelinesdosagedosageroutecodingi<medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.size();medicationknowledgeadministrationguidelinesdosagedosageroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesdosagedosageroutecoding = medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.get(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi);

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd("]]]]");}


		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == 0) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys("[[[[");}
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesdosagedosageroutecodingi == medicationknowledgeadministrationguidelinesdosagedosageroutecodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys("]]]]");}


		 };
		 };
		 };
		/******************** MdctnKnldg_AdmnGdlns_IndctnRfrnc ********************************************************************************/
		if(medicationknowledgeadministrationguidelines.hasIndicationReference()) {

			if(medicationknowledgeadministrationguidelines.getIndicationReference().getReference() != null) {
			m.addMdctnKnldgAdmnGdlnsIndctnRfrnc(medicationknowledgeadministrationguidelines.getIndicationReference().getReference());
			}
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnRfrnc("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinespatientcharacteristics ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent> medicationknowledgeadministrationguidelinespatientcharacteristicslist = medicationknowledgeadministrationguidelines.getPatientCharacteristics();
		for(int medicationknowledgeadministrationguidelinespatientcharacteristicsi = 0; medicationknowledgeadministrationguidelinespatientcharacteristicsi<medicationknowledgeadministrationguidelinespatientcharacteristicslist.size();medicationknowledgeadministrationguidelinespatientcharacteristicsi++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent  medicationknowledgeadministrationguidelinespatientcharacteristics = medicationknowledgeadministrationguidelinespatientcharacteristicslist.get(medicationknowledgeadministrationguidelinespatientcharacteristicsi);

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsVl("[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristics.hasValue()) {

			String  array = "[";
			for(int incr=0; incr<medicationknowledgeadministrationguidelinespatientcharacteristics.getValue().size(); incr++) {
				array = array + medicationknowledgeadministrationguidelinespatientcharacteristics.getValue().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsVl(array);

		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsVl("]]");}


		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept = medicationknowledgeadministrationguidelinespatientcharacteristics.getCharacteristicCodeableConcept();

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt("[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.hasText()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt("]]");}


		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist = medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.getCoding();
		for(int medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi = 0; medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi<medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.size();medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding = medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.get(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi);

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply("[[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn("[[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd("[[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd("[[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd("]]]");}


		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys("[[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodingi == medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys("]]]");}


		 };
		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity = medicationknowledgeadministrationguidelinespatientcharacteristics.getCharacteristicQuantity();

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl("[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasValue()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getValue()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl("]]");}


		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator = medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getComparator();
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator!=null) {
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {

		m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr("[[");		}
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator.toCode());
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {

		m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr("]]");		}

		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr("NULL");
		}

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd("[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd("]]");}


		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt("[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasUnit()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getUnit()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt("]]");}


		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == 0) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys("[[");}
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys("NULL");
		}

		if(medicationknowledgeadministrationguidelinespatientcharacteristicsi == medicationknowledgeadministrationguidelinespatientcharacteristicslist.size()-1) {m.addMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys("]]");}


		 };
		/******************** medicationknowledgeadministrationguidelinesindicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesindicationcodeableconcept = medicationknowledgeadministrationguidelines.getIndicationCodeableConcept();

		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconcept.hasText()) {

			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconcept.getText()));
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt("NULL");
		}


		/******************** medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist = medicationknowledgeadministrationguidelinesindicationcodeableconcept.getCoding();
		for(int medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi = 0; medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi<medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.size();medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding = medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.get(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi);

		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply("[[");}
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasDisplay()) {

			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply("NULL");
		}

		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply("]]");}


		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn("[[");}
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasVersion()) {

			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn("]]");}


		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd("[[");}
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasCode()) {

			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd("]]");}


		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd("[[");}
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd("]]");}


		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == 0) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys("[[");}
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasSystem()) {

			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys("NULL");
		}

		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcodingi == medicationknowledgeadministrationguidelinesindicationcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** medicationknowledgedrugcharacteristic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent> medicationknowledgedrugcharacteristiclist = medicationknowledge.getDrugCharacteristic();
		for(int medicationknowledgedrugcharacteristici = 0; medicationknowledgedrugcharacteristici<medicationknowledgedrugcharacteristiclist.size();medicationknowledgedrugcharacteristici++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent  medicationknowledgedrugcharacteristic = medicationknowledgedrugcharacteristiclist.get(medicationknowledgedrugcharacteristici);

		/******************** medicationknowledgedrugcharacteristictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedrugcharacteristictype = medicationknowledgedrugcharacteristic.getType();

		/******************** MdctnKnldg_DrugCrctrstc_Typ_Txt ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcTypTxt("[");}
		if(medicationknowledgedrugcharacteristictype.hasText()) {

			m.addMdctnKnldgDrugCrctrstcTypTxt(String.valueOf(medicationknowledgedrugcharacteristictype.getText()));
		} else {
			m.addMdctnKnldgDrugCrctrstcTypTxt("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcTypTxt("]");}


		/******************** medicationknowledgedrugcharacteristictypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgedrugcharacteristictypecodinglist = medicationknowledgedrugcharacteristictype.getCoding();
		for(int medicationknowledgedrugcharacteristictypecodingi = 0; medicationknowledgedrugcharacteristictypecodingi<medicationknowledgedrugcharacteristictypecodinglist.size();medicationknowledgedrugcharacteristictypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgedrugcharacteristictypecoding = medicationknowledgedrugcharacteristictypecodinglist.get(medicationknowledgedrugcharacteristictypecodingi);

		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecodingi == 0) {m.addMdctnKnldgDrugCrctrstcTypCdgDsply("[[");}
		if(medicationknowledgedrugcharacteristictypecoding.hasDisplay()) {

			m.addMdctnKnldgDrugCrctrstcTypCdgDsply(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgDrugCrctrstcTypCdgDsply("NULL");
		}

		if(medicationknowledgedrugcharacteristictypecodingi == medicationknowledgedrugcharacteristictypecodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcTypCdgDsply("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecodingi == 0) {m.addMdctnKnldgDrugCrctrstcTypCdgVrsn("[[");}
		if(medicationknowledgedrugcharacteristictypecoding.hasVersion()) {

			m.addMdctnKnldgDrugCrctrstcTypCdgVrsn(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getVersion()));
		} else {
			m.addMdctnKnldgDrugCrctrstcTypCdgVrsn("NULL");
		}

		if(medicationknowledgedrugcharacteristictypecodingi == medicationknowledgedrugcharacteristictypecodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcTypCdgVrsn("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecodingi == 0) {m.addMdctnKnldgDrugCrctrstcTypCdgCd("[[");}
		if(medicationknowledgedrugcharacteristictypecoding.hasCode()) {

			m.addMdctnKnldgDrugCrctrstcTypCdgCd(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getCode()));
		} else {
			m.addMdctnKnldgDrugCrctrstcTypCdgCd("NULL");
		}

		if(medicationknowledgedrugcharacteristictypecodingi == medicationknowledgedrugcharacteristictypecodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcTypCdgCd("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecodingi == 0) {m.addMdctnKnldgDrugCrctrstcTypCdgUsrSltd("[[");}
		if(medicationknowledgedrugcharacteristictypecoding.hasUserSelected()) {

			m.addMdctnKnldgDrugCrctrstcTypCdgUsrSltd(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgDrugCrctrstcTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgedrugcharacteristictypecodingi == medicationknowledgedrugcharacteristictypecodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecodingi == 0) {m.addMdctnKnldgDrugCrctrstcTypCdgSys("[[");}
		if(medicationknowledgedrugcharacteristictypecoding.hasSystem()) {

			m.addMdctnKnldgDrugCrctrstcTypCdgSys(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getSystem()));
		} else {
			m.addMdctnKnldgDrugCrctrstcTypCdgSys("NULL");
		}

		if(medicationknowledgedrugcharacteristictypecodingi == medicationknowledgedrugcharacteristictypecodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcTypCdgSys("]]");}


		 };
		/******************** MdctnKnldg_DrugCrctrstc_VlBase64BinaryTyp ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlBase64binaryTyp("[");}
		if(medicationknowledgedrugcharacteristic.hasValueBase64BinaryType()) {

			m.addMdctnKnldgDrugCrctrstcVlBase64binaryTyp("\""+medicationknowledgedrugcharacteristic.getValueBase64BinaryType().getValueAsString()+"\"");
		} else {
			m.addMdctnKnldgDrugCrctrstcVlBase64binaryTyp("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlBase64binaryTyp("]");}


		/******************** medicationknowledgedrugcharacteristicvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedrugcharacteristicvaluecodeableconcept = medicationknowledgedrugcharacteristic.getValueCodeableConcept();

		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptTxt("[");}
		if(medicationknowledgedrugcharacteristicvaluecodeableconcept.hasText()) {

			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptTxt(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconcept.getText()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptTxt("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptTxt("]");}


		/******************** medicationknowledgedrugcharacteristicvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist = medicationknowledgedrugcharacteristicvaluecodeableconcept.getCoding();
		for(int medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi = 0; medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi<medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.size();medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgedrugcharacteristicvaluecodeableconceptcoding = medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.get(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi);

		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == 0) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply("[[");}
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasDisplay()) {

			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply("NULL");
		}

		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == 0) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn("[[");}
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasVersion()) {

			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn("NULL");
		}

		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == 0) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd("[[");}
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasCode()) {

			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getCode()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd("NULL");
		}

		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == 0) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd("[[");}
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasUserSelected()) {

			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd("]]");}


		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == 0) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys("[[");}
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasSystem()) {

			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys("NULL");
		}

		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcodingi == medicationknowledgedrugcharacteristicvaluecodeableconceptcodinglist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys("]]");}


		 };
		/******************** MdctnKnldg_DrugCrctrstc_VlStrgTyp ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlStrgTyp("[");}
		if(medicationknowledgedrugcharacteristic.hasValueStringType()) {

			m.addMdctnKnldgDrugCrctrstcVlStrgTyp("\""+medicationknowledgedrugcharacteristic.getValueStringType().getValueAsString()+"\"");
		} else {
			m.addMdctnKnldgDrugCrctrstcVlStrgTyp("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlStrgTyp("]");}


		/******************** medicationknowledgedrugcharacteristicvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgedrugcharacteristicvaluequantity = medicationknowledgedrugcharacteristic.getValueQuantity();

		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Vl ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlQntyVl("[");}
		if(medicationknowledgedrugcharacteristicvaluequantity.hasValue()) {

			m.addMdctnKnldgDrugCrctrstcVlQntyVl(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getValue()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlQntyVl("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlQntyVl("]");}


		/******************** medicationknowledgedrugcharacteristicvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgedrugcharacteristicvaluequantitycomparator = medicationknowledgedrugcharacteristicvaluequantity.getComparator();
		if(medicationknowledgedrugcharacteristicvaluequantitycomparator!=null) {
		if(medicationknowledgedrugcharacteristici == 0) {

		m.addMdctnKnldgDrugCrctrstcVlQntyCmprtr("[");		}
			m.addMdctnKnldgDrugCrctrstcVlQntyCmprtr(medicationknowledgedrugcharacteristicvaluequantitycomparator.toCode());
		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {

		m.addMdctnKnldgDrugCrctrstcVlQntyCmprtr("]");		}

		} else {
			m.addMdctnKnldgDrugCrctrstcVlQntyCmprtr("NULL");
		}

		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Cd ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlQntyCd("[");}
		if(medicationknowledgedrugcharacteristicvaluequantity.hasCode()) {

			m.addMdctnKnldgDrugCrctrstcVlQntyCd(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getCode()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlQntyCd("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlQntyCd("]");}


		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Unt ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlQntyUnt("[");}
		if(medicationknowledgedrugcharacteristicvaluequantity.hasUnit()) {

			m.addMdctnKnldgDrugCrctrstcVlQntyUnt(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getUnit()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlQntyUnt("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlQntyUnt("]");}


		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Sys ********************************************************************************/
		if(medicationknowledgedrugcharacteristici == 0) {m.addMdctnKnldgDrugCrctrstcVlQntySys("[");}
		if(medicationknowledgedrugcharacteristicvaluequantity.hasSystem()) {

			m.addMdctnKnldgDrugCrctrstcVlQntySys(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getSystem()));
		} else {
			m.addMdctnKnldgDrugCrctrstcVlQntySys("NULL");
		}

		if(medicationknowledgedrugcharacteristici == medicationknowledgedrugcharacteristiclist.size()-1) {m.addMdctnKnldgDrugCrctrstcVlQntySys("]");}


		 };
		/******************** medicationknowledgedoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedoseform = medicationknowledge.getDoseForm();

		/******************** MdctnKnldg_DoseFrm_Txt ********************************************************************************/
		if(medicationknowledgedoseform.hasText()) {

			m.addMdctnKnldgDoseFrmTxt(String.valueOf(medicationknowledgedoseform.getText()));
		} else {
			m.addMdctnKnldgDoseFrmTxt("NULL");
		}


		/******************** medicationknowledgedoseformcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgedoseformcodinglist = medicationknowledgedoseform.getCoding();
		for(int medicationknowledgedoseformcodingi = 0; medicationknowledgedoseformcodingi<medicationknowledgedoseformcodinglist.size();medicationknowledgedoseformcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgedoseformcoding = medicationknowledgedoseformcodinglist.get(medicationknowledgedoseformcodingi);

		/******************** MdctnKnldg_DoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgedoseformcodingi == 0) {m.addMdctnKnldgDoseFrmCdgDsply("[");}
		if(medicationknowledgedoseformcoding.hasDisplay()) {

			m.addMdctnKnldgDoseFrmCdgDsply(String.valueOf(medicationknowledgedoseformcoding.getDisplay()));
		} else {
			m.addMdctnKnldgDoseFrmCdgDsply("NULL");
		}

		if(medicationknowledgedoseformcodingi == medicationknowledgedoseformcodinglist.size()-1) {m.addMdctnKnldgDoseFrmCdgDsply("]");}


		/******************** MdctnKnldg_DoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgedoseformcodingi == 0) {m.addMdctnKnldgDoseFrmCdgVrsn("[");}
		if(medicationknowledgedoseformcoding.hasVersion()) {

			m.addMdctnKnldgDoseFrmCdgVrsn(String.valueOf(medicationknowledgedoseformcoding.getVersion()));
		} else {
			m.addMdctnKnldgDoseFrmCdgVrsn("NULL");
		}

		if(medicationknowledgedoseformcodingi == medicationknowledgedoseformcodinglist.size()-1) {m.addMdctnKnldgDoseFrmCdgVrsn("]");}


		/******************** MdctnKnldg_DoseFrm_Cdg_Cd ********************************************************************************/
		if(medicationknowledgedoseformcodingi == 0) {m.addMdctnKnldgDoseFrmCdgCd("[");}
		if(medicationknowledgedoseformcoding.hasCode()) {

			m.addMdctnKnldgDoseFrmCdgCd(String.valueOf(medicationknowledgedoseformcoding.getCode()));
		} else {
			m.addMdctnKnldgDoseFrmCdgCd("NULL");
		}

		if(medicationknowledgedoseformcodingi == medicationknowledgedoseformcodinglist.size()-1) {m.addMdctnKnldgDoseFrmCdgCd("]");}


		/******************** MdctnKnldg_DoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgedoseformcodingi == 0) {m.addMdctnKnldgDoseFrmCdgUsrSltd("[");}
		if(medicationknowledgedoseformcoding.hasUserSelected()) {

			m.addMdctnKnldgDoseFrmCdgUsrSltd(String.valueOf(medicationknowledgedoseformcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgDoseFrmCdgUsrSltd("NULL");
		}

		if(medicationknowledgedoseformcodingi == medicationknowledgedoseformcodinglist.size()-1) {m.addMdctnKnldgDoseFrmCdgUsrSltd("]");}


		/******************** MdctnKnldg_DoseFrm_Cdg_Sys ********************************************************************************/
		if(medicationknowledgedoseformcodingi == 0) {m.addMdctnKnldgDoseFrmCdgSys("[");}
		if(medicationknowledgedoseformcoding.hasSystem()) {

			m.addMdctnKnldgDoseFrmCdgSys(String.valueOf(medicationknowledgedoseformcoding.getSystem()));
		} else {
			m.addMdctnKnldgDoseFrmCdgSys("NULL");
		}

		if(medicationknowledgedoseformcodingi == medicationknowledgedoseformcodinglist.size()-1) {m.addMdctnKnldgDoseFrmCdgSys("]");}


		 };
		/******************** medicationknowledgeamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeamount = medicationknowledge.getAmount();

		/******************** MdctnKnldg_Amnt_Vl ********************************************************************************/
		if(medicationknowledgeamount.hasValue()) {

			m.addMdctnKnldgAmntVl(String.valueOf(medicationknowledgeamount.getValue()));
		} else {
			m.addMdctnKnldgAmntVl("NULL");
		}


		/******************** medicationknowledgeamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeamountcomparator = medicationknowledgeamount.getComparator();
		if(medicationknowledgeamountcomparator!=null) {
			m.addMdctnKnldgAmntCmprtr(medicationknowledgeamountcomparator.toCode());
		} else {
			m.addMdctnKnldgAmntCmprtr("NULL");
		}

		/******************** MdctnKnldg_Amnt_Cd ********************************************************************************/
		if(medicationknowledgeamount.hasCode()) {

			m.addMdctnKnldgAmntCd(String.valueOf(medicationknowledgeamount.getCode()));
		} else {
			m.addMdctnKnldgAmntCd("NULL");
		}


		/******************** MdctnKnldg_Amnt_Unt ********************************************************************************/
		if(medicationknowledgeamount.hasUnit()) {

			m.addMdctnKnldgAmntUnt(String.valueOf(medicationknowledgeamount.getUnit()));
		} else {
			m.addMdctnKnldgAmntUnt("NULL");
		}


		/******************** MdctnKnldg_Amnt_Sys ********************************************************************************/
		if(medicationknowledgeamount.hasSystem()) {

			m.addMdctnKnldgAmntSys(String.valueOf(medicationknowledgeamount.getSystem()));
		} else {
			m.addMdctnKnldgAmntSys("NULL");
		}


		/******************** medicationknowledgeingredient ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent> medicationknowledgeingredientlist = medicationknowledge.getIngredient();
		for(int medicationknowledgeingredienti = 0; medicationknowledgeingredienti<medicationknowledgeingredientlist.size();medicationknowledgeingredienti++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent  medicationknowledgeingredient = medicationknowledgeingredientlist.get(medicationknowledgeingredienti);

		/******************** MdctnKnldg_Igrdnt_IsActive ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntIsActive("[");}
		if(medicationknowledgeingredient.hasIsActive()) {

			m.addMdctnKnldgIgrdntIsActive(String.valueOf(medicationknowledgeingredient.getIsActive()));
		} else {
			m.addMdctnKnldgIgrdntIsActive("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntIsActive("]");}


		/******************** medicationknowledgeingredientstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeingredientstrength = medicationknowledgeingredient.getStrength();

		/******************** medicationknowledgeingredientstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeingredientstrengthnumerator = medicationknowledgeingredientstrength.getNumerator();

		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrNmrtrVl("[");}
		if(medicationknowledgeingredientstrengthnumerator.hasValue()) {

			m.addMdctnKnldgIgrdntStrNmrtrVl(String.valueOf(medicationknowledgeingredientstrengthnumerator.getValue()));
		} else {
			m.addMdctnKnldgIgrdntStrNmrtrVl("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrNmrtrVl("]");}


		/******************** medicationknowledgeingredientstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeingredientstrengthnumeratorcomparator = medicationknowledgeingredientstrengthnumerator.getComparator();
		if(medicationknowledgeingredientstrengthnumeratorcomparator!=null) {
		if(medicationknowledgeingredienti == 0) {

		m.addMdctnKnldgIgrdntStrNmrtrCmprtr("[");		}
			m.addMdctnKnldgIgrdntStrNmrtrCmprtr(medicationknowledgeingredientstrengthnumeratorcomparator.toCode());
		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {

		m.addMdctnKnldgIgrdntStrNmrtrCmprtr("]");		}

		} else {
			m.addMdctnKnldgIgrdntStrNmrtrCmprtr("NULL");
		}

		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrNmrtrCd("[");}
		if(medicationknowledgeingredientstrengthnumerator.hasCode()) {

			m.addMdctnKnldgIgrdntStrNmrtrCd(String.valueOf(medicationknowledgeingredientstrengthnumerator.getCode()));
		} else {
			m.addMdctnKnldgIgrdntStrNmrtrCd("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrNmrtrCd("]");}


		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrNmrtrUnt("[");}
		if(medicationknowledgeingredientstrengthnumerator.hasUnit()) {

			m.addMdctnKnldgIgrdntStrNmrtrUnt(String.valueOf(medicationknowledgeingredientstrengthnumerator.getUnit()));
		} else {
			m.addMdctnKnldgIgrdntStrNmrtrUnt("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrNmrtrUnt("]");}


		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrNmrtrSys("[");}
		if(medicationknowledgeingredientstrengthnumerator.hasSystem()) {

			m.addMdctnKnldgIgrdntStrNmrtrSys(String.valueOf(medicationknowledgeingredientstrengthnumerator.getSystem()));
		} else {
			m.addMdctnKnldgIgrdntStrNmrtrSys("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrNmrtrSys("]");}


		/******************** medicationknowledgeingredientstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeingredientstrengthdenominator = medicationknowledgeingredientstrength.getDenominator();

		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrDnmntrVl("[");}
		if(medicationknowledgeingredientstrengthdenominator.hasValue()) {

			m.addMdctnKnldgIgrdntStrDnmntrVl(String.valueOf(medicationknowledgeingredientstrengthdenominator.getValue()));
		} else {
			m.addMdctnKnldgIgrdntStrDnmntrVl("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrDnmntrVl("]");}


		/******************** medicationknowledgeingredientstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeingredientstrengthdenominatorcomparator = medicationknowledgeingredientstrengthdenominator.getComparator();
		if(medicationknowledgeingredientstrengthdenominatorcomparator!=null) {
		if(medicationknowledgeingredienti == 0) {

		m.addMdctnKnldgIgrdntStrDnmntrCmprtr("[");		}
			m.addMdctnKnldgIgrdntStrDnmntrCmprtr(medicationknowledgeingredientstrengthdenominatorcomparator.toCode());
		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {

		m.addMdctnKnldgIgrdntStrDnmntrCmprtr("]");		}

		} else {
			m.addMdctnKnldgIgrdntStrDnmntrCmprtr("NULL");
		}

		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrDnmntrCd("[");}
		if(medicationknowledgeingredientstrengthdenominator.hasCode()) {

			m.addMdctnKnldgIgrdntStrDnmntrCd(String.valueOf(medicationknowledgeingredientstrengthdenominator.getCode()));
		} else {
			m.addMdctnKnldgIgrdntStrDnmntrCd("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrDnmntrCd("]");}


		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrDnmntrUnt("[");}
		if(medicationknowledgeingredientstrengthdenominator.hasUnit()) {

			m.addMdctnKnldgIgrdntStrDnmntrUnt(String.valueOf(medicationknowledgeingredientstrengthdenominator.getUnit()));
		} else {
			m.addMdctnKnldgIgrdntStrDnmntrUnt("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrDnmntrUnt("]");}


		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntStrDnmntrSys("[");}
		if(medicationknowledgeingredientstrengthdenominator.hasSystem()) {

			m.addMdctnKnldgIgrdntStrDnmntrSys(String.valueOf(medicationknowledgeingredientstrengthdenominator.getSystem()));
		} else {
			m.addMdctnKnldgIgrdntStrDnmntrSys("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntStrDnmntrSys("]");}


		/******************** MdctnKnldg_Igrdnt_ItmRfrnc ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntItmRfrnc("[");}
		if(medicationknowledgeingredient.hasItemReference()) {

			if(medicationknowledgeingredient.getItemReference().getReference() != null) {
			m.addMdctnKnldgIgrdntItmRfrnc(medicationknowledgeingredient.getItemReference().getReference());
			}
		} else {
			m.addMdctnKnldgIgrdntItmRfrnc("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntItmRfrnc("]");}


		/******************** medicationknowledgeingredientitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeingredientitemcodeableconcept = medicationknowledgeingredient.getItemCodeableConcept();

		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeingredienti == 0) {m.addMdctnKnldgIgrdntItmCdbleCncptTxt("[");}
		if(medicationknowledgeingredientitemcodeableconcept.hasText()) {

			m.addMdctnKnldgIgrdntItmCdbleCncptTxt(String.valueOf(medicationknowledgeingredientitemcodeableconcept.getText()));
		} else {
			m.addMdctnKnldgIgrdntItmCdbleCncptTxt("NULL");
		}

		if(medicationknowledgeingredienti == medicationknowledgeingredientlist.size()-1) {m.addMdctnKnldgIgrdntItmCdbleCncptTxt("]");}


		/******************** medicationknowledgeingredientitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeingredientitemcodeableconceptcodinglist = medicationknowledgeingredientitemcodeableconcept.getCoding();
		for(int medicationknowledgeingredientitemcodeableconceptcodingi = 0; medicationknowledgeingredientitemcodeableconceptcodingi<medicationknowledgeingredientitemcodeableconceptcodinglist.size();medicationknowledgeingredientitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeingredientitemcodeableconceptcoding = medicationknowledgeingredientitemcodeableconceptcodinglist.get(medicationknowledgeingredientitemcodeableconceptcodingi);

		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcodingi == 0) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgDsply("[[");}
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasDisplay()) {

			m.addMdctnKnldgIgrdntItmCdbleCncptCdgDsply(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnKnldgIgrdntItmCdbleCncptCdgDsply("NULL");
		}

		if(medicationknowledgeingredientitemcodeableconceptcodingi == medicationknowledgeingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgDsply("]]");}


		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcodingi == 0) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgVrsn("[[");}
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasVersion()) {

			m.addMdctnKnldgIgrdntItmCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnKnldgIgrdntItmCdbleCncptCdgVrsn("NULL");
		}

		if(medicationknowledgeingredientitemcodeableconceptcodingi == medicationknowledgeingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgVrsn("]]");}


		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcodingi == 0) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgCd("[[");}
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasCode()) {

			m.addMdctnKnldgIgrdntItmCdbleCncptCdgCd(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnKnldgIgrdntItmCdbleCncptCdgCd("NULL");
		}

		if(medicationknowledgeingredientitemcodeableconceptcodingi == medicationknowledgeingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgCd("]]");}


		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcodingi == 0) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd("[[");}
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationknowledgeingredientitemcodeableconceptcodingi == medicationknowledgeingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd("]]");}


		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcodingi == 0) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgSys("[[");}
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasSystem()) {

			m.addMdctnKnldgIgrdntItmCdbleCncptCdgSys(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnKnldgIgrdntItmCdbleCncptCdgSys("NULL");
		}

		if(medicationknowledgeingredientitemcodeableconceptcodingi == medicationknowledgeingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnKnldgIgrdntItmCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** medicationknowledgemonograph ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent> medicationknowledgemonographlist = medicationknowledge.getMonograph();
		for(int medicationknowledgemonographi = 0; medicationknowledgemonographi<medicationknowledgemonographlist.size();medicationknowledgemonographi++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent  medicationknowledgemonograph = medicationknowledgemonographlist.get(medicationknowledgemonographi);

		/******************** medicationknowledgemonographtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemonographtype = medicationknowledgemonograph.getType();

		/******************** MdctnKnldg_Monograph_Typ_Txt ********************************************************************************/
		if(medicationknowledgemonographi == 0) {m.addMdctnKnldgMonographTypTxt("[");}
		if(medicationknowledgemonographtype.hasText()) {

			m.addMdctnKnldgMonographTypTxt(String.valueOf(medicationknowledgemonographtype.getText()));
		} else {
			m.addMdctnKnldgMonographTypTxt("NULL");
		}

		if(medicationknowledgemonographi == medicationknowledgemonographlist.size()-1) {m.addMdctnKnldgMonographTypTxt("]");}


		/******************** medicationknowledgemonographtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgemonographtypecodinglist = medicationknowledgemonographtype.getCoding();
		for(int medicationknowledgemonographtypecodingi = 0; medicationknowledgemonographtypecodingi<medicationknowledgemonographtypecodinglist.size();medicationknowledgemonographtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgemonographtypecoding = medicationknowledgemonographtypecodinglist.get(medicationknowledgemonographtypecodingi);

		/******************** MdctnKnldg_Monograph_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemonographtypecodingi == 0) {m.addMdctnKnldgMonographTypCdgDsply("[[");}
		if(medicationknowledgemonographtypecoding.hasDisplay()) {

			m.addMdctnKnldgMonographTypCdgDsply(String.valueOf(medicationknowledgemonographtypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgMonographTypCdgDsply("NULL");
		}

		if(medicationknowledgemonographtypecodingi == medicationknowledgemonographtypecodinglist.size()-1) {m.addMdctnKnldgMonographTypCdgDsply("]]");}


		/******************** MdctnKnldg_Monograph_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemonographtypecodingi == 0) {m.addMdctnKnldgMonographTypCdgVrsn("[[");}
		if(medicationknowledgemonographtypecoding.hasVersion()) {

			m.addMdctnKnldgMonographTypCdgVrsn(String.valueOf(medicationknowledgemonographtypecoding.getVersion()));
		} else {
			m.addMdctnKnldgMonographTypCdgVrsn("NULL");
		}

		if(medicationknowledgemonographtypecodingi == medicationknowledgemonographtypecodinglist.size()-1) {m.addMdctnKnldgMonographTypCdgVrsn("]]");}


		/******************** MdctnKnldg_Monograph_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemonographtypecodingi == 0) {m.addMdctnKnldgMonographTypCdgCd("[[");}
		if(medicationknowledgemonographtypecoding.hasCode()) {

			m.addMdctnKnldgMonographTypCdgCd(String.valueOf(medicationknowledgemonographtypecoding.getCode()));
		} else {
			m.addMdctnKnldgMonographTypCdgCd("NULL");
		}

		if(medicationknowledgemonographtypecodingi == medicationknowledgemonographtypecodinglist.size()-1) {m.addMdctnKnldgMonographTypCdgCd("]]");}


		/******************** MdctnKnldg_Monograph_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemonographtypecodingi == 0) {m.addMdctnKnldgMonographTypCdgUsrSltd("[[");}
		if(medicationknowledgemonographtypecoding.hasUserSelected()) {

			m.addMdctnKnldgMonographTypCdgUsrSltd(String.valueOf(medicationknowledgemonographtypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgMonographTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgemonographtypecodingi == medicationknowledgemonographtypecodinglist.size()-1) {m.addMdctnKnldgMonographTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_Monograph_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemonographtypecodingi == 0) {m.addMdctnKnldgMonographTypCdgSys("[[");}
		if(medicationknowledgemonographtypecoding.hasSystem()) {

			m.addMdctnKnldgMonographTypCdgSys(String.valueOf(medicationknowledgemonographtypecoding.getSystem()));
		} else {
			m.addMdctnKnldgMonographTypCdgSys("NULL");
		}

		if(medicationknowledgemonographtypecodingi == medicationknowledgemonographtypecodinglist.size()-1) {m.addMdctnKnldgMonographTypCdgSys("]]");}


		 };
		/******************** MdctnKnldg_Monograph_Src ********************************************************************************/
		if(medicationknowledgemonographi == 0) {m.addMdctnKnldgMonographSrc("[");}
		if(medicationknowledgemonograph.hasSource()) {

			if(medicationknowledgemonograph.getSource().getReference() != null) {
			m.addMdctnKnldgMonographSrc(medicationknowledgemonograph.getSource().getReference());
			}
		} else {
			m.addMdctnKnldgMonographSrc("NULL");
		}

		if(medicationknowledgemonographi == medicationknowledgemonographlist.size()-1) {m.addMdctnKnldgMonographSrc("]");}


		 };
		/******************** medicationknowledgeintendedroute ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationknowledgeintendedroutelist = medicationknowledge.getIntendedRoute();
		for(int medicationknowledgeintendedroutei = 0; medicationknowledgeintendedroutei<medicationknowledgeintendedroutelist.size();medicationknowledgeintendedroutei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationknowledgeintendedroute = medicationknowledgeintendedroutelist.get(medicationknowledgeintendedroutei);

		/******************** MdctnKnldg_IntendedRoute_Txt ********************************************************************************/
		if(medicationknowledgeintendedroutei == 0) {m.addMdctnKnldgIntendedRouteTxt("[");}
		if(medicationknowledgeintendedroute.hasText()) {

			m.addMdctnKnldgIntendedRouteTxt(String.valueOf(medicationknowledgeintendedroute.getText()));
		} else {
			m.addMdctnKnldgIntendedRouteTxt("NULL");
		}

		if(medicationknowledgeintendedroutei == medicationknowledgeintendedroutelist.size()-1) {m.addMdctnKnldgIntendedRouteTxt("]");}


		/******************** medicationknowledgeintendedroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeintendedroutecodinglist = medicationknowledgeintendedroute.getCoding();
		for(int medicationknowledgeintendedroutecodingi = 0; medicationknowledgeintendedroutecodingi<medicationknowledgeintendedroutecodinglist.size();medicationknowledgeintendedroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeintendedroutecoding = medicationknowledgeintendedroutecodinglist.get(medicationknowledgeintendedroutecodingi);

		/******************** MdctnKnldg_IntendedRoute_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeintendedroutecodingi == 0) {m.addMdctnKnldgIntendedRouteCdgDsply("[[");}
		if(medicationknowledgeintendedroutecoding.hasDisplay()) {

			m.addMdctnKnldgIntendedRouteCdgDsply(String.valueOf(medicationknowledgeintendedroutecoding.getDisplay()));
		} else {
			m.addMdctnKnldgIntendedRouteCdgDsply("NULL");
		}

		if(medicationknowledgeintendedroutecodingi == medicationknowledgeintendedroutecodinglist.size()-1) {m.addMdctnKnldgIntendedRouteCdgDsply("]]");}


		/******************** MdctnKnldg_IntendedRoute_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeintendedroutecodingi == 0) {m.addMdctnKnldgIntendedRouteCdgVrsn("[[");}
		if(medicationknowledgeintendedroutecoding.hasVersion()) {

			m.addMdctnKnldgIntendedRouteCdgVrsn(String.valueOf(medicationknowledgeintendedroutecoding.getVersion()));
		} else {
			m.addMdctnKnldgIntendedRouteCdgVrsn("NULL");
		}

		if(medicationknowledgeintendedroutecodingi == medicationknowledgeintendedroutecodinglist.size()-1) {m.addMdctnKnldgIntendedRouteCdgVrsn("]]");}


		/******************** MdctnKnldg_IntendedRoute_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeintendedroutecodingi == 0) {m.addMdctnKnldgIntendedRouteCdgCd("[[");}
		if(medicationknowledgeintendedroutecoding.hasCode()) {

			m.addMdctnKnldgIntendedRouteCdgCd(String.valueOf(medicationknowledgeintendedroutecoding.getCode()));
		} else {
			m.addMdctnKnldgIntendedRouteCdgCd("NULL");
		}

		if(medicationknowledgeintendedroutecodingi == medicationknowledgeintendedroutecodinglist.size()-1) {m.addMdctnKnldgIntendedRouteCdgCd("]]");}


		/******************** MdctnKnldg_IntendedRoute_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeintendedroutecodingi == 0) {m.addMdctnKnldgIntendedRouteCdgUsrSltd("[[");}
		if(medicationknowledgeintendedroutecoding.hasUserSelected()) {

			m.addMdctnKnldgIntendedRouteCdgUsrSltd(String.valueOf(medicationknowledgeintendedroutecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgIntendedRouteCdgUsrSltd("NULL");
		}

		if(medicationknowledgeintendedroutecodingi == medicationknowledgeintendedroutecodinglist.size()-1) {m.addMdctnKnldgIntendedRouteCdgUsrSltd("]]");}


		/******************** MdctnKnldg_IntendedRoute_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeintendedroutecodingi == 0) {m.addMdctnKnldgIntendedRouteCdgSys("[[");}
		if(medicationknowledgeintendedroutecoding.hasSystem()) {

			m.addMdctnKnldgIntendedRouteCdgSys(String.valueOf(medicationknowledgeintendedroutecoding.getSystem()));
		} else {
			m.addMdctnKnldgIntendedRouteCdgSys("NULL");
		}

		if(medicationknowledgeintendedroutecodingi == medicationknowledgeintendedroutecodinglist.size()-1) {m.addMdctnKnldgIntendedRouteCdgSys("]]");}


		 };
		 };
		/******************** medicationknowledgeproducttype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationknowledgeproducttypelist = medicationknowledge.getProductType();
		for(int medicationknowledgeproducttypei = 0; medicationknowledgeproducttypei<medicationknowledgeproducttypelist.size();medicationknowledgeproducttypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationknowledgeproducttype = medicationknowledgeproducttypelist.get(medicationknowledgeproducttypei);

		/******************** MdctnKnldg_PrdctTyp_Txt ********************************************************************************/
		if(medicationknowledgeproducttypei == 0) {m.addMdctnKnldgPrdctTypTxt("[");}
		if(medicationknowledgeproducttype.hasText()) {

			m.addMdctnKnldgPrdctTypTxt(String.valueOf(medicationknowledgeproducttype.getText()));
		} else {
			m.addMdctnKnldgPrdctTypTxt("NULL");
		}

		if(medicationknowledgeproducttypei == medicationknowledgeproducttypelist.size()-1) {m.addMdctnKnldgPrdctTypTxt("]");}


		/******************** medicationknowledgeproducttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeproducttypecodinglist = medicationknowledgeproducttype.getCoding();
		for(int medicationknowledgeproducttypecodingi = 0; medicationknowledgeproducttypecodingi<medicationknowledgeproducttypecodinglist.size();medicationknowledgeproducttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeproducttypecoding = medicationknowledgeproducttypecodinglist.get(medicationknowledgeproducttypecodingi);

		/******************** MdctnKnldg_PrdctTyp_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeproducttypecodingi == 0) {m.addMdctnKnldgPrdctTypCdgDsply("[[");}
		if(medicationknowledgeproducttypecoding.hasDisplay()) {

			m.addMdctnKnldgPrdctTypCdgDsply(String.valueOf(medicationknowledgeproducttypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgPrdctTypCdgDsply("NULL");
		}

		if(medicationknowledgeproducttypecodingi == medicationknowledgeproducttypecodinglist.size()-1) {m.addMdctnKnldgPrdctTypCdgDsply("]]");}


		/******************** MdctnKnldg_PrdctTyp_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeproducttypecodingi == 0) {m.addMdctnKnldgPrdctTypCdgVrsn("[[");}
		if(medicationknowledgeproducttypecoding.hasVersion()) {

			m.addMdctnKnldgPrdctTypCdgVrsn(String.valueOf(medicationknowledgeproducttypecoding.getVersion()));
		} else {
			m.addMdctnKnldgPrdctTypCdgVrsn("NULL");
		}

		if(medicationknowledgeproducttypecodingi == medicationknowledgeproducttypecodinglist.size()-1) {m.addMdctnKnldgPrdctTypCdgVrsn("]]");}


		/******************** MdctnKnldg_PrdctTyp_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeproducttypecodingi == 0) {m.addMdctnKnldgPrdctTypCdgCd("[[");}
		if(medicationknowledgeproducttypecoding.hasCode()) {

			m.addMdctnKnldgPrdctTypCdgCd(String.valueOf(medicationknowledgeproducttypecoding.getCode()));
		} else {
			m.addMdctnKnldgPrdctTypCdgCd("NULL");
		}

		if(medicationknowledgeproducttypecodingi == medicationknowledgeproducttypecodinglist.size()-1) {m.addMdctnKnldgPrdctTypCdgCd("]]");}


		/******************** MdctnKnldg_PrdctTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeproducttypecodingi == 0) {m.addMdctnKnldgPrdctTypCdgUsrSltd("[[");}
		if(medicationknowledgeproducttypecoding.hasUserSelected()) {

			m.addMdctnKnldgPrdctTypCdgUsrSltd(String.valueOf(medicationknowledgeproducttypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgPrdctTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgeproducttypecodingi == medicationknowledgeproducttypecodinglist.size()-1) {m.addMdctnKnldgPrdctTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_PrdctTyp_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeproducttypecodingi == 0) {m.addMdctnKnldgPrdctTypCdgSys("[[");}
		if(medicationknowledgeproducttypecoding.hasSystem()) {

			m.addMdctnKnldgPrdctTypCdgSys(String.valueOf(medicationknowledgeproducttypecoding.getSystem()));
		} else {
			m.addMdctnKnldgPrdctTypCdgSys("NULL");
		}

		if(medicationknowledgeproducttypecodingi == medicationknowledgeproducttypecodinglist.size()-1) {m.addMdctnKnldgPrdctTypCdgSys("]]");}


		 };
		 };
		/******************** medicationknowledgecost ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent> medicationknowledgecostlist = medicationknowledge.getCost();
		for(int medicationknowledgecosti = 0; medicationknowledgecosti<medicationknowledgecostlist.size();medicationknowledgecosti++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent  medicationknowledgecost = medicationknowledgecostlist.get(medicationknowledgecosti);

		/******************** medicationknowledgecosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgecosttype = medicationknowledgecost.getType();

		/******************** MdctnKnldg_Cst_Typ_Txt ********************************************************************************/
		if(medicationknowledgecosti == 0) {m.addMdctnKnldgCstTypTxt("[");}
		if(medicationknowledgecosttype.hasText()) {

			m.addMdctnKnldgCstTypTxt(String.valueOf(medicationknowledgecosttype.getText()));
		} else {
			m.addMdctnKnldgCstTypTxt("NULL");
		}

		if(medicationknowledgecosti == medicationknowledgecostlist.size()-1) {m.addMdctnKnldgCstTypTxt("]");}


		/******************** medicationknowledgecosttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgecosttypecodinglist = medicationknowledgecosttype.getCoding();
		for(int medicationknowledgecosttypecodingi = 0; medicationknowledgecosttypecodingi<medicationknowledgecosttypecodinglist.size();medicationknowledgecosttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgecosttypecoding = medicationknowledgecosttypecodinglist.get(medicationknowledgecosttypecodingi);

		/******************** MdctnKnldg_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgecosttypecodingi == 0) {m.addMdctnKnldgCstTypCdgDsply("[[");}
		if(medicationknowledgecosttypecoding.hasDisplay()) {

			m.addMdctnKnldgCstTypCdgDsply(String.valueOf(medicationknowledgecosttypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgCstTypCdgDsply("NULL");
		}

		if(medicationknowledgecosttypecodingi == medicationknowledgecosttypecodinglist.size()-1) {m.addMdctnKnldgCstTypCdgDsply("]]");}


		/******************** MdctnKnldg_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgecosttypecodingi == 0) {m.addMdctnKnldgCstTypCdgVrsn("[[");}
		if(medicationknowledgecosttypecoding.hasVersion()) {

			m.addMdctnKnldgCstTypCdgVrsn(String.valueOf(medicationknowledgecosttypecoding.getVersion()));
		} else {
			m.addMdctnKnldgCstTypCdgVrsn("NULL");
		}

		if(medicationknowledgecosttypecodingi == medicationknowledgecosttypecodinglist.size()-1) {m.addMdctnKnldgCstTypCdgVrsn("]]");}


		/******************** MdctnKnldg_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgecosttypecodingi == 0) {m.addMdctnKnldgCstTypCdgCd("[[");}
		if(medicationknowledgecosttypecoding.hasCode()) {

			m.addMdctnKnldgCstTypCdgCd(String.valueOf(medicationknowledgecosttypecoding.getCode()));
		} else {
			m.addMdctnKnldgCstTypCdgCd("NULL");
		}

		if(medicationknowledgecosttypecodingi == medicationknowledgecosttypecodinglist.size()-1) {m.addMdctnKnldgCstTypCdgCd("]]");}


		/******************** MdctnKnldg_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgecosttypecodingi == 0) {m.addMdctnKnldgCstTypCdgUsrSltd("[[");}
		if(medicationknowledgecosttypecoding.hasUserSelected()) {

			m.addMdctnKnldgCstTypCdgUsrSltd(String.valueOf(medicationknowledgecosttypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgCstTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgecosttypecodingi == medicationknowledgecosttypecodinglist.size()-1) {m.addMdctnKnldgCstTypCdgUsrSltd("]]");}


		/******************** MdctnKnldg_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgecosttypecodingi == 0) {m.addMdctnKnldgCstTypCdgSys("[[");}
		if(medicationknowledgecosttypecoding.hasSystem()) {

			m.addMdctnKnldgCstTypCdgSys(String.valueOf(medicationknowledgecosttypecoding.getSystem()));
		} else {
			m.addMdctnKnldgCstTypCdgSys("NULL");
		}

		if(medicationknowledgecosttypecodingi == medicationknowledgecosttypecodinglist.size()-1) {m.addMdctnKnldgCstTypCdgSys("]]");}


		 };
		/******************** MdctnKnldg_Cst_Src ********************************************************************************/
		if(medicationknowledgecosti == 0) {m.addMdctnKnldgCstSrc("[");}
		if(medicationknowledgecost.hasSource()) {

			m.addMdctnKnldgCstSrc(String.valueOf(medicationknowledgecost.getSource()));
		} else {
			m.addMdctnKnldgCstSrc("NULL");
		}

		if(medicationknowledgecosti == medicationknowledgecostlist.size()-1) {m.addMdctnKnldgCstSrc("]");}


		/******************** medicationknowledgecostcost ********************************************************************************/
		org.hl7.fhir.r4.model.Money medicationknowledgecostcost = medicationknowledgecost.getCost();

		/******************** MdctnKnldg_Cst_Cst_Vl ********************************************************************************/
		if(medicationknowledgecosti == 0) {m.addMdctnKnldgCstCstVl("[");}
		if(medicationknowledgecostcost.hasValue()) {

			m.addMdctnKnldgCstCstVl(String.valueOf(medicationknowledgecostcost.getValue()));
		} else {
			m.addMdctnKnldgCstCstVl("NULL");
		}

		if(medicationknowledgecosti == medicationknowledgecostlist.size()-1) {m.addMdctnKnldgCstCstVl("]");}


		/******************** MdctnKnldg_Cst_Cst_Crncy ********************************************************************************/
		if(medicationknowledgecosti == 0) {m.addMdctnKnldgCstCstCrncy("[");}
		if(medicationknowledgecostcost.hasCurrency()) {

			m.addMdctnKnldgCstCstCrncy(String.valueOf(medicationknowledgecostcost.getCurrency()));
		} else {
			m.addMdctnKnldgCstCstCrncy("NULL");
		}

		if(medicationknowledgecosti == medicationknowledgecostlist.size()-1) {m.addMdctnKnldgCstCstCrncy("]");}


		 };
		/******************** medicationknowledgepackaging ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent medicationknowledgepackaging = medicationknowledge.getPackaging();

		/******************** medicationknowledgepackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgepackagingtype = medicationknowledgepackaging.getType();

		/******************** MdctnKnldg_Packaging_Typ_Txt ********************************************************************************/
		if(medicationknowledgepackagingtype.hasText()) {

			m.addMdctnKnldgPackagingTypTxt(String.valueOf(medicationknowledgepackagingtype.getText()));
		} else {
			m.addMdctnKnldgPackagingTypTxt("NULL");
		}


		/******************** medicationknowledgepackagingtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgepackagingtypecodinglist = medicationknowledgepackagingtype.getCoding();
		for(int medicationknowledgepackagingtypecodingi = 0; medicationknowledgepackagingtypecodingi<medicationknowledgepackagingtypecodinglist.size();medicationknowledgepackagingtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgepackagingtypecoding = medicationknowledgepackagingtypecodinglist.get(medicationknowledgepackagingtypecodingi);

		/******************** MdctnKnldg_Packaging_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgepackagingtypecodingi == 0) {m.addMdctnKnldgPackagingTypCdgDsply("[");}
		if(medicationknowledgepackagingtypecoding.hasDisplay()) {

			m.addMdctnKnldgPackagingTypCdgDsply(String.valueOf(medicationknowledgepackagingtypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgPackagingTypCdgDsply("NULL");
		}

		if(medicationknowledgepackagingtypecodingi == medicationknowledgepackagingtypecodinglist.size()-1) {m.addMdctnKnldgPackagingTypCdgDsply("]");}


		/******************** MdctnKnldg_Packaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgepackagingtypecodingi == 0) {m.addMdctnKnldgPackagingTypCdgVrsn("[");}
		if(medicationknowledgepackagingtypecoding.hasVersion()) {

			m.addMdctnKnldgPackagingTypCdgVrsn(String.valueOf(medicationknowledgepackagingtypecoding.getVersion()));
		} else {
			m.addMdctnKnldgPackagingTypCdgVrsn("NULL");
		}

		if(medicationknowledgepackagingtypecodingi == medicationknowledgepackagingtypecodinglist.size()-1) {m.addMdctnKnldgPackagingTypCdgVrsn("]");}


		/******************** MdctnKnldg_Packaging_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgepackagingtypecodingi == 0) {m.addMdctnKnldgPackagingTypCdgCd("[");}
		if(medicationknowledgepackagingtypecoding.hasCode()) {

			m.addMdctnKnldgPackagingTypCdgCd(String.valueOf(medicationknowledgepackagingtypecoding.getCode()));
		} else {
			m.addMdctnKnldgPackagingTypCdgCd("NULL");
		}

		if(medicationknowledgepackagingtypecodingi == medicationknowledgepackagingtypecodinglist.size()-1) {m.addMdctnKnldgPackagingTypCdgCd("]");}


		/******************** MdctnKnldg_Packaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgepackagingtypecodingi == 0) {m.addMdctnKnldgPackagingTypCdgUsrSltd("[");}
		if(medicationknowledgepackagingtypecoding.hasUserSelected()) {

			m.addMdctnKnldgPackagingTypCdgUsrSltd(String.valueOf(medicationknowledgepackagingtypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgPackagingTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgepackagingtypecodingi == medicationknowledgepackagingtypecodinglist.size()-1) {m.addMdctnKnldgPackagingTypCdgUsrSltd("]");}


		/******************** MdctnKnldg_Packaging_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgepackagingtypecodingi == 0) {m.addMdctnKnldgPackagingTypCdgSys("[");}
		if(medicationknowledgepackagingtypecoding.hasSystem()) {

			m.addMdctnKnldgPackagingTypCdgSys(String.valueOf(medicationknowledgepackagingtypecoding.getSystem()));
		} else {
			m.addMdctnKnldgPackagingTypCdgSys("NULL");
		}

		if(medicationknowledgepackagingtypecodingi == medicationknowledgepackagingtypecodinglist.size()-1) {m.addMdctnKnldgPackagingTypCdgSys("]");}


		 };
		/******************** medicationknowledgepackagingquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgepackagingquantity = medicationknowledgepackaging.getQuantity();

		/******************** MdctnKnldg_Packaging_Qnty_Vl ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasValue()) {

			m.addMdctnKnldgPackagingQntyVl(String.valueOf(medicationknowledgepackagingquantity.getValue()));
		} else {
			m.addMdctnKnldgPackagingQntyVl("NULL");
		}


		/******************** medicationknowledgepackagingquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgepackagingquantitycomparator = medicationknowledgepackagingquantity.getComparator();
		if(medicationknowledgepackagingquantitycomparator!=null) {
			m.addMdctnKnldgPackagingQntyCmprtr(medicationknowledgepackagingquantitycomparator.toCode());
		} else {
			m.addMdctnKnldgPackagingQntyCmprtr("NULL");
		}

		/******************** MdctnKnldg_Packaging_Qnty_Cd ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasCode()) {

			m.addMdctnKnldgPackagingQntyCd(String.valueOf(medicationknowledgepackagingquantity.getCode()));
		} else {
			m.addMdctnKnldgPackagingQntyCd("NULL");
		}


		/******************** MdctnKnldg_Packaging_Qnty_Unt ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasUnit()) {

			m.addMdctnKnldgPackagingQntyUnt(String.valueOf(medicationknowledgepackagingquantity.getUnit()));
		} else {
			m.addMdctnKnldgPackagingQntyUnt("NULL");
		}


		/******************** MdctnKnldg_Packaging_Qnty_Sys ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasSystem()) {

			m.addMdctnKnldgPackagingQntySys(String.valueOf(medicationknowledgepackagingquantity.getSystem()));
		} else {
			m.addMdctnKnldgPackagingQntySys("NULL");
		}


		/******************** medicationknowledgeregulatory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent> medicationknowledgeregulatorylist = medicationknowledge.getRegulatory();
		for(int medicationknowledgeregulatoryi = 0; medicationknowledgeregulatoryi<medicationknowledgeregulatorylist.size();medicationknowledgeregulatoryi++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent  medicationknowledgeregulatory = medicationknowledgeregulatorylist.get(medicationknowledgeregulatoryi);

		/******************** medicationknowledgeregulatorymaxdispense ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent medicationknowledgeregulatorymaxdispense = medicationknowledgeregulatory.getMaxDispense();

		/******************** medicationknowledgeregulatorymaxdispenseperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgeregulatorymaxdispenseperiod = medicationknowledgeregulatorymaxdispense.getPeriod();

		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Vl ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsPrdVl("[");}
		if(medicationknowledgeregulatorymaxdispenseperiod.hasValue()) {

			m.addMdctnKnldgRegulatoryMxDispnsPrdVl(String.valueOf(medicationknowledgeregulatorymaxdispenseperiod.getValue()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsPrdVl("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsPrdVl("]");}


		/******************** medicationknowledgeregulatorymaxdispenseperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeregulatorymaxdispenseperiodcomparator = medicationknowledgeregulatorymaxdispenseperiod.getComparator();
		if(medicationknowledgeregulatorymaxdispenseperiodcomparator!=null) {
		if(medicationknowledgeregulatoryi == 0) {

		m.addMdctnKnldgRegulatoryMxDispnsPrdCmprtr("[");		}
			m.addMdctnKnldgRegulatoryMxDispnsPrdCmprtr(medicationknowledgeregulatorymaxdispenseperiodcomparator.toCode());
		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {

		m.addMdctnKnldgRegulatoryMxDispnsPrdCmprtr("]");		}

		} else {
			m.addMdctnKnldgRegulatoryMxDispnsPrdCmprtr("NULL");
		}

		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Cd ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsPrdCd("[");}
		if(medicationknowledgeregulatorymaxdispenseperiod.hasCode()) {

			m.addMdctnKnldgRegulatoryMxDispnsPrdCd(String.valueOf(medicationknowledgeregulatorymaxdispenseperiod.getCode()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsPrdCd("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsPrdCd("]");}


		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Unt ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsPrdUnt("[");}
		if(medicationknowledgeregulatorymaxdispenseperiod.hasUnit()) {

			m.addMdctnKnldgRegulatoryMxDispnsPrdUnt(String.valueOf(medicationknowledgeregulatorymaxdispenseperiod.getUnit()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsPrdUnt("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsPrdUnt("]");}


		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Sys ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsPrdSys("[");}
		if(medicationknowledgeregulatorymaxdispenseperiod.hasSystem()) {

			m.addMdctnKnldgRegulatoryMxDispnsPrdSys(String.valueOf(medicationknowledgeregulatorymaxdispenseperiod.getSystem()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsPrdSys("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsPrdSys("]");}


		/******************** medicationknowledgeregulatorymaxdispensequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeregulatorymaxdispensequantity = medicationknowledgeregulatorymaxdispense.getQuantity();

		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Vl ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsQntyVl("[");}
		if(medicationknowledgeregulatorymaxdispensequantity.hasValue()) {

			m.addMdctnKnldgRegulatoryMxDispnsQntyVl(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getValue()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsQntyVl("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsQntyVl("]");}


		/******************** medicationknowledgeregulatorymaxdispensequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeregulatorymaxdispensequantitycomparator = medicationknowledgeregulatorymaxdispensequantity.getComparator();
		if(medicationknowledgeregulatorymaxdispensequantitycomparator!=null) {
		if(medicationknowledgeregulatoryi == 0) {

		m.addMdctnKnldgRegulatoryMxDispnsQntyCmprtr("[");		}
			m.addMdctnKnldgRegulatoryMxDispnsQntyCmprtr(medicationknowledgeregulatorymaxdispensequantitycomparator.toCode());
		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {

		m.addMdctnKnldgRegulatoryMxDispnsQntyCmprtr("]");		}

		} else {
			m.addMdctnKnldgRegulatoryMxDispnsQntyCmprtr("NULL");
		}

		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Cd ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsQntyCd("[");}
		if(medicationknowledgeregulatorymaxdispensequantity.hasCode()) {

			m.addMdctnKnldgRegulatoryMxDispnsQntyCd(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getCode()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsQntyCd("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsQntyCd("]");}


		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Unt ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsQntyUnt("[");}
		if(medicationknowledgeregulatorymaxdispensequantity.hasUnit()) {

			m.addMdctnKnldgRegulatoryMxDispnsQntyUnt(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getUnit()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsQntyUnt("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsQntyUnt("]");}


		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Sys ********************************************************************************/
		if(medicationknowledgeregulatoryi == 0) {m.addMdctnKnldgRegulatoryMxDispnsQntySys("[");}
		if(medicationknowledgeregulatorymaxdispensequantity.hasSystem()) {

			m.addMdctnKnldgRegulatoryMxDispnsQntySys(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getSystem()));
		} else {
			m.addMdctnKnldgRegulatoryMxDispnsQntySys("NULL");
		}

		if(medicationknowledgeregulatoryi == medicationknowledgeregulatorylist.size()-1) {m.addMdctnKnldgRegulatoryMxDispnsQntySys("]");}


		/******************** medicationknowledgeregulatoryschedule ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent> medicationknowledgeregulatoryschedulelist = medicationknowledgeregulatory.getSchedule();
		for(int medicationknowledgeregulatoryschedulei = 0; medicationknowledgeregulatoryschedulei<medicationknowledgeregulatoryschedulelist.size();medicationknowledgeregulatoryschedulei++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent  medicationknowledgeregulatoryschedule = medicationknowledgeregulatoryschedulelist.get(medicationknowledgeregulatoryschedulei);

		/******************** medicationknowledgeregulatoryscheduleschedule ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeregulatoryscheduleschedule = medicationknowledgeregulatoryschedule.getSchedule();

		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Txt ********************************************************************************/
		if(medicationknowledgeregulatoryschedulei == 0) {m.addMdctnKnldgRegulatorySchdlSchdlTxt("[[");}
		if(medicationknowledgeregulatoryscheduleschedule.hasText()) {

			m.addMdctnKnldgRegulatorySchdlSchdlTxt(String.valueOf(medicationknowledgeregulatoryscheduleschedule.getText()));
		} else {
			m.addMdctnKnldgRegulatorySchdlSchdlTxt("NULL");
		}

		if(medicationknowledgeregulatoryschedulei == medicationknowledgeregulatoryschedulelist.size()-1) {m.addMdctnKnldgRegulatorySchdlSchdlTxt("]]");}


		/******************** medicationknowledgeregulatoryscheduleschedulecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeregulatoryscheduleschedulecodinglist = medicationknowledgeregulatoryscheduleschedule.getCoding();
		for(int medicationknowledgeregulatoryscheduleschedulecodingi = 0; medicationknowledgeregulatoryscheduleschedulecodingi<medicationknowledgeregulatoryscheduleschedulecodinglist.size();medicationknowledgeregulatoryscheduleschedulecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeregulatoryscheduleschedulecoding = medicationknowledgeregulatoryscheduleschedulecodinglist.get(medicationknowledgeregulatoryscheduleschedulecodingi);

		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecodingi == 0) {m.addMdctnKnldgRegulatorySchdlSchdlCdgDsply("[[[");}
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasDisplay()) {

			m.addMdctnKnldgRegulatorySchdlSchdlCdgDsply(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getDisplay()));
		} else {
			m.addMdctnKnldgRegulatorySchdlSchdlCdgDsply("NULL");
		}

		if(medicationknowledgeregulatoryscheduleschedulecodingi == medicationknowledgeregulatoryscheduleschedulecodinglist.size()-1) {m.addMdctnKnldgRegulatorySchdlSchdlCdgDsply("]]]");}


		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecodingi == 0) {m.addMdctnKnldgRegulatorySchdlSchdlCdgVrsn("[[[");}
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasVersion()) {

			m.addMdctnKnldgRegulatorySchdlSchdlCdgVrsn(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getVersion()));
		} else {
			m.addMdctnKnldgRegulatorySchdlSchdlCdgVrsn("NULL");
		}

		if(medicationknowledgeregulatoryscheduleschedulecodingi == medicationknowledgeregulatoryscheduleschedulecodinglist.size()-1) {m.addMdctnKnldgRegulatorySchdlSchdlCdgVrsn("]]]");}


		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecodingi == 0) {m.addMdctnKnldgRegulatorySchdlSchdlCdgCd("[[[");}
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasCode()) {

			m.addMdctnKnldgRegulatorySchdlSchdlCdgCd(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getCode()));
		} else {
			m.addMdctnKnldgRegulatorySchdlSchdlCdgCd("NULL");
		}

		if(medicationknowledgeregulatoryscheduleschedulecodingi == medicationknowledgeregulatoryscheduleschedulecodinglist.size()-1) {m.addMdctnKnldgRegulatorySchdlSchdlCdgCd("]]]");}


		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecodingi == 0) {m.addMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd("[[[");}
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasUserSelected()) {

			m.addMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd("NULL");
		}

		if(medicationknowledgeregulatoryscheduleschedulecodingi == medicationknowledgeregulatoryscheduleschedulecodinglist.size()-1) {m.addMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd("]]]");}


		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecodingi == 0) {m.addMdctnKnldgRegulatorySchdlSchdlCdgSys("[[[");}
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasSystem()) {

			m.addMdctnKnldgRegulatorySchdlSchdlCdgSys(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getSystem()));
		} else {
			m.addMdctnKnldgRegulatorySchdlSchdlCdgSys("NULL");
		}

		if(medicationknowledgeregulatoryscheduleschedulecodingi == medicationknowledgeregulatoryscheduleschedulecodinglist.size()-1) {m.addMdctnKnldgRegulatorySchdlSchdlCdgSys("]]]");}


		 };
		 };
		/******************** medicationknowledgeregulatorysubstitution ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent> medicationknowledgeregulatorysubstitutionlist = medicationknowledgeregulatory.getSubstitution();
		for(int medicationknowledgeregulatorysubstitutioni = 0; medicationknowledgeregulatorysubstitutioni<medicationknowledgeregulatorysubstitutionlist.size();medicationknowledgeregulatorysubstitutioni++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent  medicationknowledgeregulatorysubstitution = medicationknowledgeregulatorysubstitutionlist.get(medicationknowledgeregulatorysubstitutioni);

		/******************** medicationknowledgeregulatorysubstitutiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeregulatorysubstitutiontype = medicationknowledgeregulatorysubstitution.getType();

		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Txt ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutioni == 0) {m.addMdctnKnldgRegulatorySubstitutionTypTxt("[[");}
		if(medicationknowledgeregulatorysubstitutiontype.hasText()) {

			m.addMdctnKnldgRegulatorySubstitutionTypTxt(String.valueOf(medicationknowledgeregulatorysubstitutiontype.getText()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionTypTxt("NULL");
		}

		if(medicationknowledgeregulatorysubstitutioni == medicationknowledgeregulatorysubstitutionlist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionTypTxt("]]");}


		/******************** medicationknowledgeregulatorysubstitutiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationknowledgeregulatorysubstitutiontypecodinglist = medicationknowledgeregulatorysubstitutiontype.getCoding();
		for(int medicationknowledgeregulatorysubstitutiontypecodingi = 0; medicationknowledgeregulatorysubstitutiontypecodingi<medicationknowledgeregulatorysubstitutiontypecodinglist.size();medicationknowledgeregulatorysubstitutiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationknowledgeregulatorysubstitutiontypecoding = medicationknowledgeregulatorysubstitutiontypecodinglist.get(medicationknowledgeregulatorysubstitutiontypecodingi);

		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecodingi == 0) {m.addMdctnKnldgRegulatorySubstitutionTypCdgDsply("[[[");}
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasDisplay()) {

			m.addMdctnKnldgRegulatorySubstitutionTypCdgDsply(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getDisplay()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionTypCdgDsply("NULL");
		}

		if(medicationknowledgeregulatorysubstitutiontypecodingi == medicationknowledgeregulatorysubstitutiontypecodinglist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionTypCdgDsply("]]]");}


		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecodingi == 0) {m.addMdctnKnldgRegulatorySubstitutionTypCdgVrsn("[[[");}
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasVersion()) {

			m.addMdctnKnldgRegulatorySubstitutionTypCdgVrsn(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getVersion()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionTypCdgVrsn("NULL");
		}

		if(medicationknowledgeregulatorysubstitutiontypecodingi == medicationknowledgeregulatorysubstitutiontypecodinglist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionTypCdgVrsn("]]]");}


		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecodingi == 0) {m.addMdctnKnldgRegulatorySubstitutionTypCdgCd("[[[");}
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasCode()) {

			m.addMdctnKnldgRegulatorySubstitutionTypCdgCd(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getCode()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionTypCdgCd("NULL");
		}

		if(medicationknowledgeregulatorysubstitutiontypecodingi == medicationknowledgeregulatorysubstitutiontypecodinglist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionTypCdgCd("]]]");}


		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecodingi == 0) {m.addMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd("[[[");}
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasUserSelected()) {

			m.addMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getUserSelected()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd("NULL");
		}

		if(medicationknowledgeregulatorysubstitutiontypecodingi == medicationknowledgeregulatorysubstitutiontypecodinglist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd("]]]");}


		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecodingi == 0) {m.addMdctnKnldgRegulatorySubstitutionTypCdgSys("[[[");}
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasSystem()) {

			m.addMdctnKnldgRegulatorySubstitutionTypCdgSys(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getSystem()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionTypCdgSys("NULL");
		}

		if(medicationknowledgeregulatorysubstitutiontypecodingi == medicationknowledgeregulatorysubstitutiontypecodinglist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionTypCdgSys("]]]");}


		 };
		/******************** MdctnKnldg_Regulatory_Substitution_Allowed ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutioni == 0) {m.addMdctnKnldgRegulatorySubstitutionAllowed("[[");}
		if(medicationknowledgeregulatorysubstitution.hasAllowed()) {

			m.addMdctnKnldgRegulatorySubstitutionAllowed(String.valueOf(medicationknowledgeregulatorysubstitution.getAllowed()));
		} else {
			m.addMdctnKnldgRegulatorySubstitutionAllowed("NULL");
		}

		if(medicationknowledgeregulatorysubstitutioni == medicationknowledgeregulatorysubstitutionlist.size()-1) {m.addMdctnKnldgRegulatorySubstitutionAllowed("]]");}


		 };
		 };
		/******************** medicationknowledgekinetics ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent> medicationknowledgekineticslist = medicationknowledge.getKinetics();
		for(int medicationknowledgekineticsi = 0; medicationknowledgekineticsi<medicationknowledgekineticslist.size();medicationknowledgekineticsi++ ) {
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent  medicationknowledgekinetics = medicationknowledgekineticslist.get(medicationknowledgekineticsi);

		/******************** medicationknowledgekineticsareaundercurve ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Quantity> medicationknowledgekineticsareaundercurvelist = medicationknowledgekinetics.getAreaUnderCurve();
		for(int medicationknowledgekineticsareaundercurvei = 0; medicationknowledgekineticsareaundercurvei<medicationknowledgekineticsareaundercurvelist.size();medicationknowledgekineticsareaundercurvei++ ) {
		org.hl7.fhir.r4.model.Quantity  medicationknowledgekineticsareaundercurve = medicationknowledgekineticsareaundercurvelist.get(medicationknowledgekineticsareaundercurvei);

		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Vl ********************************************************************************/
		if(medicationknowledgekineticsareaundercurvei == 0) {m.addMdctnKnldgKineticsAreaUnderCurveVl("[[");}
		if(medicationknowledgekineticsareaundercurve.hasValue()) {

			m.addMdctnKnldgKineticsAreaUnderCurveVl(String.valueOf(medicationknowledgekineticsareaundercurve.getValue()));
		} else {
			m.addMdctnKnldgKineticsAreaUnderCurveVl("NULL");
		}

		if(medicationknowledgekineticsareaundercurvei == medicationknowledgekineticsareaundercurvelist.size()-1) {m.addMdctnKnldgKineticsAreaUnderCurveVl("]]");}


		/******************** medicationknowledgekineticsareaundercurvecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgekineticsareaundercurvecomparator = medicationknowledgekineticsareaundercurve.getComparator();
		if(medicationknowledgekineticsareaundercurvecomparator!=null) {
		if(medicationknowledgekineticsareaundercurvei == 0) {

		m.addMdctnKnldgKineticsAreaUnderCurveCmprtr("[[");		}
			m.addMdctnKnldgKineticsAreaUnderCurveCmprtr(medicationknowledgekineticsareaundercurvecomparator.toCode());
		if(medicationknowledgekineticsareaundercurvei == medicationknowledgekineticsareaundercurvelist.size()-1) {

		m.addMdctnKnldgKineticsAreaUnderCurveCmprtr("]]");		}

		} else {
			m.addMdctnKnldgKineticsAreaUnderCurveCmprtr("NULL");
		}

		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Cd ********************************************************************************/
		if(medicationknowledgekineticsareaundercurvei == 0) {m.addMdctnKnldgKineticsAreaUnderCurveCd("[[");}
		if(medicationknowledgekineticsareaundercurve.hasCode()) {

			m.addMdctnKnldgKineticsAreaUnderCurveCd(String.valueOf(medicationknowledgekineticsareaundercurve.getCode()));
		} else {
			m.addMdctnKnldgKineticsAreaUnderCurveCd("NULL");
		}

		if(medicationknowledgekineticsareaundercurvei == medicationknowledgekineticsareaundercurvelist.size()-1) {m.addMdctnKnldgKineticsAreaUnderCurveCd("]]");}


		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Unt ********************************************************************************/
		if(medicationknowledgekineticsareaundercurvei == 0) {m.addMdctnKnldgKineticsAreaUnderCurveUnt("[[");}
		if(medicationknowledgekineticsareaundercurve.hasUnit()) {

			m.addMdctnKnldgKineticsAreaUnderCurveUnt(String.valueOf(medicationknowledgekineticsareaundercurve.getUnit()));
		} else {
			m.addMdctnKnldgKineticsAreaUnderCurveUnt("NULL");
		}

		if(medicationknowledgekineticsareaundercurvei == medicationknowledgekineticsareaundercurvelist.size()-1) {m.addMdctnKnldgKineticsAreaUnderCurveUnt("]]");}


		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Sys ********************************************************************************/
		if(medicationknowledgekineticsareaundercurvei == 0) {m.addMdctnKnldgKineticsAreaUnderCurveSys("[[");}
		if(medicationknowledgekineticsareaundercurve.hasSystem()) {

			m.addMdctnKnldgKineticsAreaUnderCurveSys(String.valueOf(medicationknowledgekineticsareaundercurve.getSystem()));
		} else {
			m.addMdctnKnldgKineticsAreaUnderCurveSys("NULL");
		}

		if(medicationknowledgekineticsareaundercurvei == medicationknowledgekineticsareaundercurvelist.size()-1) {m.addMdctnKnldgKineticsAreaUnderCurveSys("]]");}


		 };
		/******************** medicationknowledgekineticshalflifeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgekineticshalflifeperiod = medicationknowledgekinetics.getHalfLifePeriod();

		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Vl ********************************************************************************/
		if(medicationknowledgekineticshalflifeperiod.hasValue()) {

			m.addMdctnKnldgKineticsHalfLifePrdVl(String.valueOf(medicationknowledgekineticshalflifeperiod.getValue()));
		} else {
			m.addMdctnKnldgKineticsHalfLifePrdVl("NULL");
		}


		/******************** medicationknowledgekineticshalflifeperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgekineticshalflifeperiodcomparator = medicationknowledgekineticshalflifeperiod.getComparator();
		if(medicationknowledgekineticshalflifeperiodcomparator!=null) {
			m.addMdctnKnldgKineticsHalfLifePrdCmprtr(medicationknowledgekineticshalflifeperiodcomparator.toCode());
		} else {
			m.addMdctnKnldgKineticsHalfLifePrdCmprtr("NULL");
		}

		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Cd ********************************************************************************/
		if(medicationknowledgekineticshalflifeperiod.hasCode()) {

			m.addMdctnKnldgKineticsHalfLifePrdCd(String.valueOf(medicationknowledgekineticshalflifeperiod.getCode()));
		} else {
			m.addMdctnKnldgKineticsHalfLifePrdCd("NULL");
		}


		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Unt ********************************************************************************/
		if(medicationknowledgekineticshalflifeperiod.hasUnit()) {

			m.addMdctnKnldgKineticsHalfLifePrdUnt(String.valueOf(medicationknowledgekineticshalflifeperiod.getUnit()));
		} else {
			m.addMdctnKnldgKineticsHalfLifePrdUnt("NULL");
		}


		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Sys ********************************************************************************/
		if(medicationknowledgekineticshalflifeperiod.hasSystem()) {

			m.addMdctnKnldgKineticsHalfLifePrdSys(String.valueOf(medicationknowledgekineticshalflifeperiod.getSystem()));
		} else {
			m.addMdctnKnldgKineticsHalfLifePrdSys("NULL");
		}


		/******************** medicationknowledgekineticslethaldose50 ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Quantity> medicationknowledgekineticslethaldose50list = medicationknowledgekinetics.getLethalDose50();
		for(int medicationknowledgekineticslethaldose50i = 0; medicationknowledgekineticslethaldose50i<medicationknowledgekineticslethaldose50list.size();medicationknowledgekineticslethaldose50i++ ) {
		org.hl7.fhir.r4.model.Quantity  medicationknowledgekineticslethaldose50 = medicationknowledgekineticslethaldose50list.get(medicationknowledgekineticslethaldose50i);

		/******************** MdctnKnldg_Kinetics_LethalDose50_Vl ********************************************************************************/
		if(medicationknowledgekineticslethaldose50i == 0) {m.addMdctnKnldgKineticsLethalDose50Vl("[[");}
		if(medicationknowledgekineticslethaldose50.hasValue()) {

			m.addMdctnKnldgKineticsLethalDose50Vl(String.valueOf(medicationknowledgekineticslethaldose50.getValue()));
		} else {
			m.addMdctnKnldgKineticsLethalDose50Vl("NULL");
		}

		if(medicationknowledgekineticslethaldose50i == medicationknowledgekineticslethaldose50list.size()-1) {m.addMdctnKnldgKineticsLethalDose50Vl("]]");}


		/******************** medicationknowledgekineticslethaldose50comparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgekineticslethaldose50comparator = medicationknowledgekineticslethaldose50.getComparator();
		if(medicationknowledgekineticslethaldose50comparator!=null) {
		if(medicationknowledgekineticslethaldose50i == 0) {

		m.addMdctnKnldgKineticsLethalDose50Cmprtr("[[");		}
			m.addMdctnKnldgKineticsLethalDose50Cmprtr(medicationknowledgekineticslethaldose50comparator.toCode());
		if(medicationknowledgekineticslethaldose50i == medicationknowledgekineticslethaldose50list.size()-1) {

		m.addMdctnKnldgKineticsLethalDose50Cmprtr("]]");		}

		} else {
			m.addMdctnKnldgKineticsLethalDose50Cmprtr("NULL");
		}

		/******************** MdctnKnldg_Kinetics_LethalDose50_Cd ********************************************************************************/
		if(medicationknowledgekineticslethaldose50i == 0) {m.addMdctnKnldgKineticsLethalDose50Cd("[[");}
		if(medicationknowledgekineticslethaldose50.hasCode()) {

			m.addMdctnKnldgKineticsLethalDose50Cd(String.valueOf(medicationknowledgekineticslethaldose50.getCode()));
		} else {
			m.addMdctnKnldgKineticsLethalDose50Cd("NULL");
		}

		if(medicationknowledgekineticslethaldose50i == medicationknowledgekineticslethaldose50list.size()-1) {m.addMdctnKnldgKineticsLethalDose50Cd("]]");}


		/******************** MdctnKnldg_Kinetics_LethalDose50_Unt ********************************************************************************/
		if(medicationknowledgekineticslethaldose50i == 0) {m.addMdctnKnldgKineticsLethalDose50Unt("[[");}
		if(medicationknowledgekineticslethaldose50.hasUnit()) {

			m.addMdctnKnldgKineticsLethalDose50Unt(String.valueOf(medicationknowledgekineticslethaldose50.getUnit()));
		} else {
			m.addMdctnKnldgKineticsLethalDose50Unt("NULL");
		}

		if(medicationknowledgekineticslethaldose50i == medicationknowledgekineticslethaldose50list.size()-1) {m.addMdctnKnldgKineticsLethalDose50Unt("]]");}


		/******************** MdctnKnldg_Kinetics_LethalDose50_Sys ********************************************************************************/
		if(medicationknowledgekineticslethaldose50i == 0) {m.addMdctnKnldgKineticsLethalDose50Sys("[[");}
		if(medicationknowledgekineticslethaldose50.hasSystem()) {

			m.addMdctnKnldgKineticsLethalDose50Sys(String.valueOf(medicationknowledgekineticslethaldose50.getSystem()));
		} else {
			m.addMdctnKnldgKineticsLethalDose50Sys("NULL");
		}

		if(medicationknowledgekineticslethaldose50i == medicationknowledgekineticslethaldose50list.size()-1) {m.addMdctnKnldgKineticsLethalDose50Sys("]]");}


		 };
		 };
		/******************** MdctnKnldg_Manufacturer ********************************************************************************/
		if(medicationknowledge.hasManufacturer()) {

			if(medicationknowledge.getManufacturer().getReference() != null) {
			m.addMdctnKnldgManufacturer(medicationknowledge.getManufacturer().getReference());
			}
		} else {
			m.addMdctnKnldgManufacturer("NULL");
		}


		return m;
	}
}
