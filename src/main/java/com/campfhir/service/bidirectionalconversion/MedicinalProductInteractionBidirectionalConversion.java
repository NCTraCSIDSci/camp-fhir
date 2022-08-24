package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductInteraction;
public class MedicinalProductInteractionBidirectionalConversion 
{
	public MedicinalProductInteraction MedicinalProductInteractions(org.hl7.fhir.r4.model.MedicinalProductInteraction medicinalproductinteraction) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductInteraction m = new  main.java.com.campfhir.model.MedicinalProductInteraction();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductinteraction.getIdElement().getIdPart());

		/******************** medicinalproductinteractiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractiontype = medicinalproductinteraction.getType();

		/******************** MdcnlPrdctInteraction_Typ_Txt ********************************************************************************/
		if(medicinalproductinteractiontype.hasText()) {

			m.addMdcnlPrdctInteractionTypTxt(String.valueOf(medicinalproductinteractiontype.getText()));
		} else {
			m.addMdcnlPrdctInteractionTypTxt("NULL");
		}


		/******************** medicinalproductinteractiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductinteractiontypecodinglist = medicinalproductinteractiontype.getCoding();
		for(int medicinalproductinteractiontypecodingi = 0; medicinalproductinteractiontypecodingi<medicinalproductinteractiontypecodinglist.size();medicinalproductinteractiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductinteractiontypecoding = medicinalproductinteractiontypecodinglist.get(medicinalproductinteractiontypecodingi);

		/******************** MdcnlPrdctInteraction_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractiontypecodingi == 0) {m.addMdcnlPrdctInteractionTypCdgDsply("[");}
		if(medicinalproductinteractiontypecoding.hasDisplay()) {

			m.addMdcnlPrdctInteractionTypCdgDsply(String.valueOf(medicinalproductinteractiontypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctInteractionTypCdgDsply("NULL");
		}

		if(medicinalproductinteractiontypecodingi == medicinalproductinteractiontypecodinglist.size()-1) {m.addMdcnlPrdctInteractionTypCdgDsply("]");}


		/******************** MdcnlPrdctInteraction_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractiontypecodingi == 0) {m.addMdcnlPrdctInteractionTypCdgVrsn("[");}
		if(medicinalproductinteractiontypecoding.hasVersion()) {

			m.addMdcnlPrdctInteractionTypCdgVrsn(String.valueOf(medicinalproductinteractiontypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctInteractionTypCdgVrsn("NULL");
		}

		if(medicinalproductinteractiontypecodingi == medicinalproductinteractiontypecodinglist.size()-1) {m.addMdcnlPrdctInteractionTypCdgVrsn("]");}


		/******************** MdcnlPrdctInteraction_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractiontypecodingi == 0) {m.addMdcnlPrdctInteractionTypCdgCd("[");}
		if(medicinalproductinteractiontypecoding.hasCode()) {

			m.addMdcnlPrdctInteractionTypCdgCd(String.valueOf(medicinalproductinteractiontypecoding.getCode()));
		} else {
			m.addMdcnlPrdctInteractionTypCdgCd("NULL");
		}

		if(medicinalproductinteractiontypecodingi == medicinalproductinteractiontypecodinglist.size()-1) {m.addMdcnlPrdctInteractionTypCdgCd("]");}


		/******************** MdcnlPrdctInteraction_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractiontypecodingi == 0) {m.addMdcnlPrdctInteractionTypCdgUsrSltd("[");}
		if(medicinalproductinteractiontypecoding.hasUserSelected()) {

			m.addMdcnlPrdctInteractionTypCdgUsrSltd(String.valueOf(medicinalproductinteractiontypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctInteractionTypCdgUsrSltd("NULL");
		}

		if(medicinalproductinteractiontypecodingi == medicinalproductinteractiontypecodinglist.size()-1) {m.addMdcnlPrdctInteractionTypCdgUsrSltd("]");}


		/******************** MdcnlPrdctInteraction_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractiontypecodingi == 0) {m.addMdcnlPrdctInteractionTypCdgSys("[");}
		if(medicinalproductinteractiontypecoding.hasSystem()) {

			m.addMdcnlPrdctInteractionTypCdgSys(String.valueOf(medicinalproductinteractiontypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctInteractionTypCdgSys("NULL");
		}

		if(medicinalproductinteractiontypecodingi == medicinalproductinteractiontypecodinglist.size()-1) {m.addMdcnlPrdctInteractionTypCdgSys("]");}


		 };
		/******************** MdcnlPrdctInteraction_Sbjct ********************************************************************************/
		if(medicinalproductinteraction.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductinteraction.getSubject().size(); incr++) {
				array = array + medicinalproductinteraction.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctInteractionSbjct(array);

		} else {
			m.addMdcnlPrdctInteractionSbjct("NULL");
		}


		/******************** MdcnlPrdctInteraction_Dscrptn ********************************************************************************/
		if(medicinalproductinteraction.hasDescription()) {

			m.addMdcnlPrdctInteractionDscrptn(String.valueOf(medicinalproductinteraction.getDescription()));
		} else {
			m.addMdcnlPrdctInteractionDscrptn("NULL");
		}


		/******************** medicinalproductinteractioneffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractioneffect = medicinalproductinteraction.getEffect();

		/******************** MdcnlPrdctInteraction_Efct_Txt ********************************************************************************/
		if(medicinalproductinteractioneffect.hasText()) {

			m.addMdcnlPrdctInteractionEfctTxt(String.valueOf(medicinalproductinteractioneffect.getText()));
		} else {
			m.addMdcnlPrdctInteractionEfctTxt("NULL");
		}


		/******************** medicinalproductinteractioneffectcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductinteractioneffectcodinglist = medicinalproductinteractioneffect.getCoding();
		for(int medicinalproductinteractioneffectcodingi = 0; medicinalproductinteractioneffectcodingi<medicinalproductinteractioneffectcodinglist.size();medicinalproductinteractioneffectcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductinteractioneffectcoding = medicinalproductinteractioneffectcodinglist.get(medicinalproductinteractioneffectcodingi);

		/******************** MdcnlPrdctInteraction_Efct_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractioneffectcodingi == 0) {m.addMdcnlPrdctInteractionEfctCdgDsply("[");}
		if(medicinalproductinteractioneffectcoding.hasDisplay()) {

			m.addMdcnlPrdctInteractionEfctCdgDsply(String.valueOf(medicinalproductinteractioneffectcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctInteractionEfctCdgDsply("NULL");
		}

		if(medicinalproductinteractioneffectcodingi == medicinalproductinteractioneffectcodinglist.size()-1) {m.addMdcnlPrdctInteractionEfctCdgDsply("]");}


		/******************** MdcnlPrdctInteraction_Efct_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractioneffectcodingi == 0) {m.addMdcnlPrdctInteractionEfctCdgVrsn("[");}
		if(medicinalproductinteractioneffectcoding.hasVersion()) {

			m.addMdcnlPrdctInteractionEfctCdgVrsn(String.valueOf(medicinalproductinteractioneffectcoding.getVersion()));
		} else {
			m.addMdcnlPrdctInteractionEfctCdgVrsn("NULL");
		}

		if(medicinalproductinteractioneffectcodingi == medicinalproductinteractioneffectcodinglist.size()-1) {m.addMdcnlPrdctInteractionEfctCdgVrsn("]");}


		/******************** MdcnlPrdctInteraction_Efct_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractioneffectcodingi == 0) {m.addMdcnlPrdctInteractionEfctCdgCd("[");}
		if(medicinalproductinteractioneffectcoding.hasCode()) {

			m.addMdcnlPrdctInteractionEfctCdgCd(String.valueOf(medicinalproductinteractioneffectcoding.getCode()));
		} else {
			m.addMdcnlPrdctInteractionEfctCdgCd("NULL");
		}

		if(medicinalproductinteractioneffectcodingi == medicinalproductinteractioneffectcodinglist.size()-1) {m.addMdcnlPrdctInteractionEfctCdgCd("]");}


		/******************** MdcnlPrdctInteraction_Efct_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractioneffectcodingi == 0) {m.addMdcnlPrdctInteractionEfctCdgUsrSltd("[");}
		if(medicinalproductinteractioneffectcoding.hasUserSelected()) {

			m.addMdcnlPrdctInteractionEfctCdgUsrSltd(String.valueOf(medicinalproductinteractioneffectcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctInteractionEfctCdgUsrSltd("NULL");
		}

		if(medicinalproductinteractioneffectcodingi == medicinalproductinteractioneffectcodinglist.size()-1) {m.addMdcnlPrdctInteractionEfctCdgUsrSltd("]");}


		/******************** MdcnlPrdctInteraction_Efct_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractioneffectcodingi == 0) {m.addMdcnlPrdctInteractionEfctCdgSys("[");}
		if(medicinalproductinteractioneffectcoding.hasSystem()) {

			m.addMdcnlPrdctInteractionEfctCdgSys(String.valueOf(medicinalproductinteractioneffectcoding.getSystem()));
		} else {
			m.addMdcnlPrdctInteractionEfctCdgSys("NULL");
		}

		if(medicinalproductinteractioneffectcodingi == medicinalproductinteractioneffectcodinglist.size()-1) {m.addMdcnlPrdctInteractionEfctCdgSys("]");}


		 };
		/******************** medicinalproductinteractionmanagement ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractionmanagement = medicinalproductinteraction.getManagement();

		/******************** MdcnlPrdctInteraction_Management_Txt ********************************************************************************/
		if(medicinalproductinteractionmanagement.hasText()) {

			m.addMdcnlPrdctInteractionManagementTxt(String.valueOf(medicinalproductinteractionmanagement.getText()));
		} else {
			m.addMdcnlPrdctInteractionManagementTxt("NULL");
		}


		/******************** medicinalproductinteractionmanagementcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductinteractionmanagementcodinglist = medicinalproductinteractionmanagement.getCoding();
		for(int medicinalproductinteractionmanagementcodingi = 0; medicinalproductinteractionmanagementcodingi<medicinalproductinteractionmanagementcodinglist.size();medicinalproductinteractionmanagementcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductinteractionmanagementcoding = medicinalproductinteractionmanagementcodinglist.get(medicinalproductinteractionmanagementcodingi);

		/******************** MdcnlPrdctInteraction_Management_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractionmanagementcodingi == 0) {m.addMdcnlPrdctInteractionManagementCdgDsply("[");}
		if(medicinalproductinteractionmanagementcoding.hasDisplay()) {

			m.addMdcnlPrdctInteractionManagementCdgDsply(String.valueOf(medicinalproductinteractionmanagementcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctInteractionManagementCdgDsply("NULL");
		}

		if(medicinalproductinteractionmanagementcodingi == medicinalproductinteractionmanagementcodinglist.size()-1) {m.addMdcnlPrdctInteractionManagementCdgDsply("]");}


		/******************** MdcnlPrdctInteraction_Management_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractionmanagementcodingi == 0) {m.addMdcnlPrdctInteractionManagementCdgVrsn("[");}
		if(medicinalproductinteractionmanagementcoding.hasVersion()) {

			m.addMdcnlPrdctInteractionManagementCdgVrsn(String.valueOf(medicinalproductinteractionmanagementcoding.getVersion()));
		} else {
			m.addMdcnlPrdctInteractionManagementCdgVrsn("NULL");
		}

		if(medicinalproductinteractionmanagementcodingi == medicinalproductinteractionmanagementcodinglist.size()-1) {m.addMdcnlPrdctInteractionManagementCdgVrsn("]");}


		/******************** MdcnlPrdctInteraction_Management_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractionmanagementcodingi == 0) {m.addMdcnlPrdctInteractionManagementCdgCd("[");}
		if(medicinalproductinteractionmanagementcoding.hasCode()) {

			m.addMdcnlPrdctInteractionManagementCdgCd(String.valueOf(medicinalproductinteractionmanagementcoding.getCode()));
		} else {
			m.addMdcnlPrdctInteractionManagementCdgCd("NULL");
		}

		if(medicinalproductinteractionmanagementcodingi == medicinalproductinteractionmanagementcodinglist.size()-1) {m.addMdcnlPrdctInteractionManagementCdgCd("]");}


		/******************** MdcnlPrdctInteraction_Management_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractionmanagementcodingi == 0) {m.addMdcnlPrdctInteractionManagementCdgUsrSltd("[");}
		if(medicinalproductinteractionmanagementcoding.hasUserSelected()) {

			m.addMdcnlPrdctInteractionManagementCdgUsrSltd(String.valueOf(medicinalproductinteractionmanagementcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctInteractionManagementCdgUsrSltd("NULL");
		}

		if(medicinalproductinteractionmanagementcodingi == medicinalproductinteractionmanagementcodinglist.size()-1) {m.addMdcnlPrdctInteractionManagementCdgUsrSltd("]");}


		/******************** MdcnlPrdctInteraction_Management_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractionmanagementcodingi == 0) {m.addMdcnlPrdctInteractionManagementCdgSys("[");}
		if(medicinalproductinteractionmanagementcoding.hasSystem()) {

			m.addMdcnlPrdctInteractionManagementCdgSys(String.valueOf(medicinalproductinteractionmanagementcoding.getSystem()));
		} else {
			m.addMdcnlPrdctInteractionManagementCdgSys("NULL");
		}

		if(medicinalproductinteractionmanagementcodingi == medicinalproductinteractionmanagementcodinglist.size()-1) {m.addMdcnlPrdctInteractionManagementCdgSys("]");}


		 };
		/******************** medicinalproductinteractioninteractant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent> medicinalproductinteractioninteractantlist = medicinalproductinteraction.getInteractant();
		for(int medicinalproductinteractioninteractanti = 0; medicinalproductinteractioninteractanti<medicinalproductinteractioninteractantlist.size();medicinalproductinteractioninteractanti++ ) {
		org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent  medicinalproductinteractioninteractant = medicinalproductinteractioninteractantlist.get(medicinalproductinteractioninteractanti);

		/******************** MdcnlPrdctInteraction_Interactant_ItmRfrnc ********************************************************************************/
		if(medicinalproductinteractioninteractanti == 0) {m.addMdcnlPrdctInteractionInteractantItmRfrnc("[");}
		if(medicinalproductinteractioninteractant.hasItemReference()) {

			if(medicinalproductinteractioninteractant.getItemReference().getReference() != null) {
			m.addMdcnlPrdctInteractionInteractantItmRfrnc(medicinalproductinteractioninteractant.getItemReference().getReference());
			}
		} else {
			m.addMdcnlPrdctInteractionInteractantItmRfrnc("NULL");
		}

		if(medicinalproductinteractioninteractanti == medicinalproductinteractioninteractantlist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmRfrnc("]");}


		/******************** medicinalproductinteractioninteractantitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractioninteractantitemcodeableconcept = medicinalproductinteractioninteractant.getItemCodeableConcept();

		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductinteractioninteractanti == 0) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptTxt("[");}
		if(medicinalproductinteractioninteractantitemcodeableconcept.hasText()) {

			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptTxt(String.valueOf(medicinalproductinteractioninteractantitemcodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptTxt("NULL");
		}

		if(medicinalproductinteractioninteractanti == medicinalproductinteractioninteractantlist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptTxt("]");}


		/******************** medicinalproductinteractioninteractantitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductinteractioninteractantitemcodeableconceptcodinglist = medicinalproductinteractioninteractantitemcodeableconcept.getCoding();
		for(int medicinalproductinteractioninteractantitemcodeableconceptcodingi = 0; medicinalproductinteractioninteractantitemcodeableconceptcodingi<medicinalproductinteractioninteractantitemcodeableconceptcodinglist.size();medicinalproductinteractioninteractantitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductinteractioninteractantitemcodeableconceptcoding = medicinalproductinteractioninteractantitemcodeableconceptcodinglist.get(medicinalproductinteractioninteractantitemcodeableconceptcodingi);

		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == 0) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply("[[");}
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == medicinalproductinteractioninteractantitemcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == 0) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn("[[");}
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == medicinalproductinteractioninteractantitemcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == 0) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd("[[");}
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == medicinalproductinteractioninteractantitemcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == 0) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == medicinalproductinteractioninteractantitemcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == 0) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys("[[");}
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductinteractioninteractantitemcodeableconceptcodingi == medicinalproductinteractioninteractantitemcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductinteractionincidence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractionincidence = medicinalproductinteraction.getIncidence();

		/******************** MdcnlPrdctInteraction_Incidence_Txt ********************************************************************************/
		if(medicinalproductinteractionincidence.hasText()) {

			m.addMdcnlPrdctInteractionIncidenceTxt(String.valueOf(medicinalproductinteractionincidence.getText()));
		} else {
			m.addMdcnlPrdctInteractionIncidenceTxt("NULL");
		}


		/******************** medicinalproductinteractionincidencecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductinteractionincidencecodinglist = medicinalproductinteractionincidence.getCoding();
		for(int medicinalproductinteractionincidencecodingi = 0; medicinalproductinteractionincidencecodingi<medicinalproductinteractionincidencecodinglist.size();medicinalproductinteractionincidencecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductinteractionincidencecoding = medicinalproductinteractionincidencecodinglist.get(medicinalproductinteractionincidencecodingi);

		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractionincidencecodingi == 0) {m.addMdcnlPrdctInteractionIncidenceCdgDsply("[");}
		if(medicinalproductinteractionincidencecoding.hasDisplay()) {

			m.addMdcnlPrdctInteractionIncidenceCdgDsply(String.valueOf(medicinalproductinteractionincidencecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctInteractionIncidenceCdgDsply("NULL");
		}

		if(medicinalproductinteractionincidencecodingi == medicinalproductinteractionincidencecodinglist.size()-1) {m.addMdcnlPrdctInteractionIncidenceCdgDsply("]");}


		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractionincidencecodingi == 0) {m.addMdcnlPrdctInteractionIncidenceCdgVrsn("[");}
		if(medicinalproductinteractionincidencecoding.hasVersion()) {

			m.addMdcnlPrdctInteractionIncidenceCdgVrsn(String.valueOf(medicinalproductinteractionincidencecoding.getVersion()));
		} else {
			m.addMdcnlPrdctInteractionIncidenceCdgVrsn("NULL");
		}

		if(medicinalproductinteractionincidencecodingi == medicinalproductinteractionincidencecodinglist.size()-1) {m.addMdcnlPrdctInteractionIncidenceCdgVrsn("]");}


		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractionincidencecodingi == 0) {m.addMdcnlPrdctInteractionIncidenceCdgCd("[");}
		if(medicinalproductinteractionincidencecoding.hasCode()) {

			m.addMdcnlPrdctInteractionIncidenceCdgCd(String.valueOf(medicinalproductinteractionincidencecoding.getCode()));
		} else {
			m.addMdcnlPrdctInteractionIncidenceCdgCd("NULL");
		}

		if(medicinalproductinteractionincidencecodingi == medicinalproductinteractionincidencecodinglist.size()-1) {m.addMdcnlPrdctInteractionIncidenceCdgCd("]");}


		/******************** MdcnlPrdctInteraction_Incidence_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractionincidencecodingi == 0) {m.addMdcnlPrdctInteractionIncidenceCdgUsrSltd("[");}
		if(medicinalproductinteractionincidencecoding.hasUserSelected()) {

			m.addMdcnlPrdctInteractionIncidenceCdgUsrSltd(String.valueOf(medicinalproductinteractionincidencecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctInteractionIncidenceCdgUsrSltd("NULL");
		}

		if(medicinalproductinteractionincidencecodingi == medicinalproductinteractionincidencecodinglist.size()-1) {m.addMdcnlPrdctInteractionIncidenceCdgUsrSltd("]");}


		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractionincidencecodingi == 0) {m.addMdcnlPrdctInteractionIncidenceCdgSys("[");}
		if(medicinalproductinteractionincidencecoding.hasSystem()) {

			m.addMdcnlPrdctInteractionIncidenceCdgSys(String.valueOf(medicinalproductinteractionincidencecoding.getSystem()));
		} else {
			m.addMdcnlPrdctInteractionIncidenceCdgSys("NULL");
		}

		if(medicinalproductinteractionincidencecodingi == medicinalproductinteractionincidencecodinglist.size()-1) {m.addMdcnlPrdctInteractionIncidenceCdgSys("]");}


		 };
		return m;
	}
}
