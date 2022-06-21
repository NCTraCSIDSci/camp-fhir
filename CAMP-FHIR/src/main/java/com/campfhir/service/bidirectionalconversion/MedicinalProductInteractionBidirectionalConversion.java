package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductInteraction;
public class MedicinalProductInteractionBidirectionalConversion 
{
	public MedicinalProductInteraction MedicinalProductInteractions(org.hl7.fhir.r4.model.MedicinalProductInteraction medicinalproductinteraction) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductInteraction m = new  main.java.com.campfhir.model.MedicinalProductInteraction();

		/******************** id ********************************************************************************/
		medicinalproductinteraction.setId(m.getId());

		/******************** medicinalproductinteractiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractiontype = medicinalproductinteraction.getType();

		/******************** medicinalproductinteractiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractiontypecoding = medicinalproductinteractiontype.getCodingFirstRep();

		/******************** MdcnlPrdctInteraction_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractiontypecoding.hasDisplay()) {
			m.setMdcnlPrdctInteractionTypCdgDsply(String.valueOf(medicinalproductinteractiontypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractiontypecoding.hasVersion()) {
			m.setMdcnlPrdctInteractionTypCdgVrsn(String.valueOf(medicinalproductinteractiontypecoding.getVersion()));
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractiontypecoding.hasCode()) {
			m.setMdcnlPrdctInteractionTypCdgCd(String.valueOf(medicinalproductinteractiontypecoding.getCode()));
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractiontypecoding.hasSystem()) {
			m.setMdcnlPrdctInteractionTypCdgSys(String.valueOf(medicinalproductinteractiontypecoding.getSystem()));
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractiontypecoding.hasUserSelected()) {
			m.setMdcnlPrdctInteractionTypCdgUsrSltd(String.valueOf(medicinalproductinteractiontypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctInteraction_Typ_Txt ********************************************************************************/
		if(medicinalproductinteractiontype.hasText()) {
			m.setMdcnlPrdctInteractionTypTxt(String.valueOf(medicinalproductinteractiontype.getText()));
		}
		/******************** medicinalproductinteractioninteractant ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent medicinalproductinteractioninteractant = medicinalproductinteraction.getInteractantFirstRep();

		/******************** medicinalproductinteractioninteractantitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractioninteractantitemcodeableconcept = medicinalproductinteractioninteractant.getItemCodeableConcept();

		/******************** medicinalproductinteractioninteractantitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractioninteractantitemcodeableconceptcoding = medicinalproductinteractioninteractantitemcodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getSystem()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductinteractioninteractantitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductinteractioninteractantitemcodeableconcept.hasText()) {
			m.setMdcnlPrdctInteractionInteractantItmCdbleCncptTxt(String.valueOf(medicinalproductinteractioninteractantitemcodeableconcept.getText()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmRfrnc ********************************************************************************/
		if(medicinalproductinteractioninteractant.hasItemReference()) {
			m.setMdcnlPrdctInteractionInteractantItmRfrnc(String.valueOf(medicinalproductinteractioninteractant.getItemReference()));
		}
		/******************** MdcnlPrdctInteraction_Dscrptn ********************************************************************************/
		if(medicinalproductinteraction.hasDescription()) {
			m.setMdcnlPrdctInteractionDscrptn(String.valueOf(medicinalproductinteraction.getDescription()));
		}
		/******************** MdcnlPrdctInteraction_Sbjct ********************************************************************************/
		if(medicinalproductinteraction.hasSubject()) {
			m.setMdcnlPrdctInteractionSbjct(String.valueOf(medicinalproductinteraction.getSubjectFirstRep()));
		}
		/******************** medicinalproductinteractionincidence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractionincidence = medicinalproductinteraction.getIncidence();

		/******************** medicinalproductinteractionincidencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractionincidencecoding = medicinalproductinteractionincidence.getCodingFirstRep();

		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractionincidencecoding.hasDisplay()) {
			m.setMdcnlPrdctInteractionIncidenceCdgDsply(String.valueOf(medicinalproductinteractionincidencecoding.getDisplay()));
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractionincidencecoding.hasVersion()) {
			m.setMdcnlPrdctInteractionIncidenceCdgVrsn(String.valueOf(medicinalproductinteractionincidencecoding.getVersion()));
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractionincidencecoding.hasCode()) {
			m.setMdcnlPrdctInteractionIncidenceCdgCd(String.valueOf(medicinalproductinteractionincidencecoding.getCode()));
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractionincidencecoding.hasSystem()) {
			m.setMdcnlPrdctInteractionIncidenceCdgSys(String.valueOf(medicinalproductinteractionincidencecoding.getSystem()));
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractionincidencecoding.hasUserSelected()) {
			m.setMdcnlPrdctInteractionIncidenceCdgUsrSltd(String.valueOf(medicinalproductinteractionincidencecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctInteraction_Incidence_Txt ********************************************************************************/
		if(medicinalproductinteractionincidence.hasText()) {
			m.setMdcnlPrdctInteractionIncidenceTxt(String.valueOf(medicinalproductinteractionincidence.getText()));
		}
		/******************** medicinalproductinteractionmanagement ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractionmanagement = medicinalproductinteraction.getManagement();

		/******************** medicinalproductinteractionmanagementcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractionmanagementcoding = medicinalproductinteractionmanagement.getCodingFirstRep();

		/******************** MdcnlPrdctInteraction_Management_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractionmanagementcoding.hasDisplay()) {
			m.setMdcnlPrdctInteractionManagementCdgDsply(String.valueOf(medicinalproductinteractionmanagementcoding.getDisplay()));
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractionmanagementcoding.hasVersion()) {
			m.setMdcnlPrdctInteractionManagementCdgVrsn(String.valueOf(medicinalproductinteractionmanagementcoding.getVersion()));
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractionmanagementcoding.hasCode()) {
			m.setMdcnlPrdctInteractionManagementCdgCd(String.valueOf(medicinalproductinteractionmanagementcoding.getCode()));
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractionmanagementcoding.hasSystem()) {
			m.setMdcnlPrdctInteractionManagementCdgSys(String.valueOf(medicinalproductinteractionmanagementcoding.getSystem()));
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractionmanagementcoding.hasUserSelected()) {
			m.setMdcnlPrdctInteractionManagementCdgUsrSltd(String.valueOf(medicinalproductinteractionmanagementcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctInteraction_Management_Txt ********************************************************************************/
		if(medicinalproductinteractionmanagement.hasText()) {
			m.setMdcnlPrdctInteractionManagementTxt(String.valueOf(medicinalproductinteractionmanagement.getText()));
		}
		/******************** medicinalproductinteractioneffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractioneffect = medicinalproductinteraction.getEffect();

		/******************** medicinalproductinteractioneffectcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractioneffectcoding = medicinalproductinteractioneffect.getCodingFirstRep();

		/******************** MdcnlPrdctInteraction_Efct_Cdg_Dsply ********************************************************************************/
		if(medicinalproductinteractioneffectcoding.hasDisplay()) {
			m.setMdcnlPrdctInteractionEfctCdgDsply(String.valueOf(medicinalproductinteractioneffectcoding.getDisplay()));
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductinteractioneffectcoding.hasVersion()) {
			m.setMdcnlPrdctInteractionEfctCdgVrsn(String.valueOf(medicinalproductinteractioneffectcoding.getVersion()));
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Cd ********************************************************************************/
		if(medicinalproductinteractioneffectcoding.hasCode()) {
			m.setMdcnlPrdctInteractionEfctCdgCd(String.valueOf(medicinalproductinteractioneffectcoding.getCode()));
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Sys ********************************************************************************/
		if(medicinalproductinteractioneffectcoding.hasSystem()) {
			m.setMdcnlPrdctInteractionEfctCdgSys(String.valueOf(medicinalproductinteractioneffectcoding.getSystem()));
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductinteractioneffectcoding.hasUserSelected()) {
			m.setMdcnlPrdctInteractionEfctCdgUsrSltd(String.valueOf(medicinalproductinteractioneffectcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctInteraction_Efct_Txt ********************************************************************************/
		if(medicinalproductinteractioneffect.hasText()) {
			m.setMdcnlPrdctInteractionEfctTxt(String.valueOf(medicinalproductinteractioneffect.getText()));
		}
		return m;
	}
}
