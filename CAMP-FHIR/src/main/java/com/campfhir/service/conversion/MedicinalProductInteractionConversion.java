package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductInteraction;
public class MedicinalProductInteractionConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductInteraction MedicinalProductInteractions(MedicinalProductInteraction m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductInteraction medicinalproductinteraction = new org.hl7.fhir.r4.model.MedicinalProductInteraction();

		/******************** id ********************************************************************************/
		medicinalproductinteraction.setId(m.getId());

		/******************** MdcnlPrdctInteraction_Dscrptn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionDscrptn() != null) {
			medicinalproductinteraction.setDescription(m.getMdcnlPrdctInteractionDscrptn());
		}
		/******************** medicinalproductinteractioneffect ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractioneffect =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductinteraction.setEffect(medicinalproductinteractioneffect);

		/******************** medicinalproductinteractioneffectcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractioneffectcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductinteractioneffect.addCoding(medicinalproductinteractioneffectcoding);

		/******************** MdcnlPrdctInteraction_Efct_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgCd() != null) {
			medicinalproductinteractioneffectcoding.setCode(m.getMdcnlPrdctInteractionEfctCdgCd());
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgDsply() != null) {
			medicinalproductinteractioneffectcoding.setDisplay(m.getMdcnlPrdctInteractionEfctCdgDsply());
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgSys() != null) {
			medicinalproductinteractioneffectcoding.setSystem(m.getMdcnlPrdctInteractionEfctCdgSys());
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgUsrSltd() != null) {
			medicinalproductinteractioneffectcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctInteractionEfctCdgUsrSltd()));
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgVrsn() != null) {
			medicinalproductinteractioneffectcoding.setVersion(m.getMdcnlPrdctInteractionEfctCdgVrsn());
		}
		/******************** MdcnlPrdctInteraction_Efct_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctTxt() != null) {
			medicinalproductinteractioneffect.setText(m.getMdcnlPrdctInteractionEfctTxt());
		}
		/******************** medicinalproductinteractionincidence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractionincidence =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductinteraction.setIncidence(medicinalproductinteractionincidence);

		/******************** medicinalproductinteractionincidencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractionincidencecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductinteractionincidence.addCoding(medicinalproductinteractionincidencecoding);

		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgCd() != null) {
			medicinalproductinteractionincidencecoding.setCode(m.getMdcnlPrdctInteractionIncidenceCdgCd());
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgDsply() != null) {
			medicinalproductinteractionincidencecoding.setDisplay(m.getMdcnlPrdctInteractionIncidenceCdgDsply());
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgSys() != null) {
			medicinalproductinteractionincidencecoding.setSystem(m.getMdcnlPrdctInteractionIncidenceCdgSys());
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgUsrSltd() != null) {
			medicinalproductinteractionincidencecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctInteractionIncidenceCdgUsrSltd()));
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgVrsn() != null) {
			medicinalproductinteractionincidencecoding.setVersion(m.getMdcnlPrdctInteractionIncidenceCdgVrsn());
		}
		/******************** MdcnlPrdctInteraction_Incidence_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceTxt() != null) {
			medicinalproductinteractionincidence.setText(m.getMdcnlPrdctInteractionIncidenceTxt());
		}
		/******************** medicinalproductinteractioninteractant ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent medicinalproductinteractioninteractant =  new org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent();
		medicinalproductinteraction.addInteractant(medicinalproductinteractioninteractant);

		/******************** medicinalproductinteractioninteractantitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractioninteractantitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductinteractioninteractant.setItem(medicinalproductinteractioninteractantitemcodeableconcept);

		/******************** medicinalproductinteractioninteractantitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractioninteractantitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductinteractioninteractantitemcodeableconcept.addCoding(medicinalproductinteractioninteractantitemcodeableconceptcoding);

		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd() != null) {
			medicinalproductinteractioninteractantitemcodeableconceptcoding.setCode(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply() != null) {
			medicinalproductinteractioninteractantitemcodeableconceptcoding.setDisplay(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys() != null) {
			medicinalproductinteractioninteractantitemcodeableconceptcoding.setSystem(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd() != null) {
			medicinalproductinteractioninteractantitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn() != null) {
			medicinalproductinteractioninteractantitemcodeableconceptcoding.setVersion(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptTxt() != null) {
			medicinalproductinteractioninteractantitemcodeableconcept.setText(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptTxt());
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmRfrnc() != null) {
			medicinalproductinteractioninteractant.setItem( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctInteractionInteractantItmRfrnc()));
		}
		/******************** medicinalproductinteractionmanagement ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractionmanagement =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductinteraction.setManagement(medicinalproductinteractionmanagement);

		/******************** medicinalproductinteractionmanagementcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractionmanagementcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductinteractionmanagement.addCoding(medicinalproductinteractionmanagementcoding);

		/******************** MdcnlPrdctInteraction_Management_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgCd() != null) {
			medicinalproductinteractionmanagementcoding.setCode(m.getMdcnlPrdctInteractionManagementCdgCd());
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgDsply() != null) {
			medicinalproductinteractionmanagementcoding.setDisplay(m.getMdcnlPrdctInteractionManagementCdgDsply());
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgSys() != null) {
			medicinalproductinteractionmanagementcoding.setSystem(m.getMdcnlPrdctInteractionManagementCdgSys());
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgUsrSltd() != null) {
			medicinalproductinteractionmanagementcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctInteractionManagementCdgUsrSltd()));
		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgVrsn() != null) {
			medicinalproductinteractionmanagementcoding.setVersion(m.getMdcnlPrdctInteractionManagementCdgVrsn());
		}
		/******************** MdcnlPrdctInteraction_Management_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementTxt() != null) {
			medicinalproductinteractionmanagement.setText(m.getMdcnlPrdctInteractionManagementTxt());
		}
		/******************** MdcnlPrdctInteraction_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctInteractionSbjct() != null) {
			medicinalproductinteraction.addSubject( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctInteractionSbjct()));
		}
		/******************** medicinalproductinteractiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductinteractiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductinteraction.setType(medicinalproductinteractiontype);

		/******************** medicinalproductinteractiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductinteractiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductinteractiontype.addCoding(medicinalproductinteractiontypecoding);

		/******************** MdcnlPrdctInteraction_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgCd() != null) {
			medicinalproductinteractiontypecoding.setCode(m.getMdcnlPrdctInteractionTypCdgCd());
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgDsply() != null) {
			medicinalproductinteractiontypecoding.setDisplay(m.getMdcnlPrdctInteractionTypCdgDsply());
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgSys() != null) {
			medicinalproductinteractiontypecoding.setSystem(m.getMdcnlPrdctInteractionTypCdgSys());
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgUsrSltd() != null) {
			medicinalproductinteractiontypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctInteractionTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgVrsn() != null) {
			medicinalproductinteractiontypecoding.setVersion(m.getMdcnlPrdctInteractionTypCdgVrsn());
		}
		/******************** MdcnlPrdctInteraction_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypTxt() != null) {
			medicinalproductinteractiontype.setText(m.getMdcnlPrdctInteractionTypTxt());
		}
		return medicinalproductinteraction;
	}
}
