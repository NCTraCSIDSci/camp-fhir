package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationKnowledge;
public class MedicationKnowledgeBidirectionalConversion 
{
	public MedicationKnowledge MedicationKnowledges(org.hl7.fhir.r4.model.MedicationKnowledge medicationknowledge) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationKnowledge m = new  main.java.com.campfhir.model.MedicationKnowledge();

		/******************** id ********************************************************************************/
		medicationknowledge.setId(m.getId());

		/******************** medicationknowledgecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgecode = medicationknowledge.getCode();

		/******************** medicationknowledgecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgecodecoding = medicationknowledgecode.getCodingFirstRep();

		/******************** MdctnKnldg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgecodecoding.hasDisplay()) {
			m.setMdctnKnldgCdCdgDsply(String.valueOf(medicationknowledgecodecoding.getDisplay()));
		}
		/******************** MdctnKnldg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgecodecoding.hasVersion()) {
			m.setMdctnKnldgCdCdgVrsn(String.valueOf(medicationknowledgecodecoding.getVersion()));
		}
		/******************** MdctnKnldg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationknowledgecodecoding.hasCode()) {
			m.setMdctnKnldgCdCdgCd(String.valueOf(medicationknowledgecodecoding.getCode()));
		}
		/******************** MdctnKnldg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationknowledgecodecoding.hasSystem()) {
			m.setMdctnKnldgCdCdgSys(String.valueOf(medicationknowledgecodecoding.getSystem()));
		}
		/******************** MdctnKnldg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgecodecoding.hasUserSelected()) {
			m.setMdctnKnldgCdCdgUsrSltd(String.valueOf(medicationknowledgecodecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Cd_Txt ********************************************************************************/
		if(medicationknowledgecode.hasText()) {
			m.setMdctnKnldgCdTxt(String.valueOf(medicationknowledgecode.getText()));
		}
		/******************** medicationknowledgestatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeStatus medicationknowledgestatus = medicationknowledge.getStatus();
		m.setMdctnKnldgSts(medicationknowledgestatus.toCode());

		/******************** MdctnKnldg_Manufacturer ********************************************************************************/
		if(medicationknowledge.hasManufacturer()) {
			m.setMdctnKnldgManufacturer(String.valueOf(medicationknowledge.getManufacturer()));
		}
		/******************** medicationknowledgedoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedoseform = medicationknowledge.getDoseForm();

		/******************** medicationknowledgedoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgedoseformcoding = medicationknowledgedoseform.getCodingFirstRep();

		/******************** MdctnKnldg_DoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgedoseformcoding.hasDisplay()) {
			m.setMdctnKnldgDoseFrmCdgDsply(String.valueOf(medicationknowledgedoseformcoding.getDisplay()));
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgedoseformcoding.hasVersion()) {
			m.setMdctnKnldgDoseFrmCdgVrsn(String.valueOf(medicationknowledgedoseformcoding.getVersion()));
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Cd ********************************************************************************/
		if(medicationknowledgedoseformcoding.hasCode()) {
			m.setMdctnKnldgDoseFrmCdgCd(String.valueOf(medicationknowledgedoseformcoding.getCode()));
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Sys ********************************************************************************/
		if(medicationknowledgedoseformcoding.hasSystem()) {
			m.setMdctnKnldgDoseFrmCdgSys(String.valueOf(medicationknowledgedoseformcoding.getSystem()));
		}
		/******************** MdctnKnldg_DoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgedoseformcoding.hasUserSelected()) {
			m.setMdctnKnldgDoseFrmCdgUsrSltd(String.valueOf(medicationknowledgedoseformcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_DoseFrm_Txt ********************************************************************************/
		if(medicationknowledgedoseform.hasText()) {
			m.setMdctnKnldgDoseFrmTxt(String.valueOf(medicationknowledgedoseform.getText()));
		}
		/******************** medicationknowledgeamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeamount = medicationknowledge.getAmount();

		/******************** MdctnKnldg_Amnt_Vl ********************************************************************************/
		if(medicationknowledgeamount.hasValue()) {
			m.setMdctnKnldgAmntVl(String.valueOf(medicationknowledgeamount.getValue()));
		}
		/******************** medicationknowledgeamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeamountcomparator = medicationknowledgeamount.getComparator();
		m.setMdctnKnldgAmntCmprtr(medicationknowledgeamountcomparator.toCode());

		/******************** MdctnKnldg_Amnt_Cd ********************************************************************************/
		if(medicationknowledgeamount.hasCode()) {
			m.setMdctnKnldgAmntCd(String.valueOf(medicationknowledgeamount.getCode()));
		}
		/******************** MdctnKnldg_Amnt_Sys ********************************************************************************/
		if(medicationknowledgeamount.hasSystem()) {
			m.setMdctnKnldgAmntSys(String.valueOf(medicationknowledgeamount.getSystem()));
		}
		/******************** MdctnKnldg_Amnt_Unt ********************************************************************************/
		if(medicationknowledgeamount.hasUnit()) {
			m.setMdctnKnldgAmntUnt(String.valueOf(medicationknowledgeamount.getUnit()));
		}
		/******************** medicationknowledgecost ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent medicationknowledgecost = medicationknowledge.getCostFirstRep();

		/******************** medicationknowledgecosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgecosttype = medicationknowledgecost.getType();

		/******************** medicationknowledgecosttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgecosttypecoding = medicationknowledgecosttype.getCodingFirstRep();

		/******************** MdctnKnldg_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgecosttypecoding.hasDisplay()) {
			m.setMdctnKnldgCstTypCdgDsply(String.valueOf(medicationknowledgecosttypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgecosttypecoding.hasVersion()) {
			m.setMdctnKnldgCstTypCdgVrsn(String.valueOf(medicationknowledgecosttypecoding.getVersion()));
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgecosttypecoding.hasCode()) {
			m.setMdctnKnldgCstTypCdgCd(String.valueOf(medicationknowledgecosttypecoding.getCode()));
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgecosttypecoding.hasSystem()) {
			m.setMdctnKnldgCstTypCdgSys(String.valueOf(medicationknowledgecosttypecoding.getSystem()));
		}
		/******************** MdctnKnldg_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgecosttypecoding.hasUserSelected()) {
			m.setMdctnKnldgCstTypCdgUsrSltd(String.valueOf(medicationknowledgecosttypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Cst_Typ_Txt ********************************************************************************/
		if(medicationknowledgecosttype.hasText()) {
			m.setMdctnKnldgCstTypTxt(String.valueOf(medicationknowledgecosttype.getText()));
		}
		/******************** MdctnKnldg_Cst_Src ********************************************************************************/
		if(medicationknowledgecost.hasSource()) {
			m.setMdctnKnldgCstSrc(String.valueOf(medicationknowledgecost.getSource()));
		}
		/******************** medicationknowledgecostcost ********************************************************************************/
		org.hl7.fhir.r4.model.Money medicationknowledgecostcost = medicationknowledgecost.getCost();

		/******************** MdctnKnldg_Cst_Cst_Vl ********************************************************************************/
		if(medicationknowledgecostcost.hasValue()) {
			m.setMdctnKnldgCstCstVl(String.valueOf(medicationknowledgecostcost.getValue()));
		}
		/******************** MdctnKnldg_Cst_Cst_Crncy ********************************************************************************/
		if(medicationknowledgecostcost.hasCurrency()) {
			m.setMdctnKnldgCstCstCrncy(String.valueOf(medicationknowledgecostcost.getCurrency()));
		}
		/******************** medicationknowledgepackaging ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent medicationknowledgepackaging = medicationknowledge.getPackaging();

		/******************** medicationknowledgepackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgepackagingtype = medicationknowledgepackaging.getType();

		/******************** medicationknowledgepackagingtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgepackagingtypecoding = medicationknowledgepackagingtype.getCodingFirstRep();

		/******************** MdctnKnldg_Packaging_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgepackagingtypecoding.hasDisplay()) {
			m.setMdctnKnldgPackagingTypCdgDsply(String.valueOf(medicationknowledgepackagingtypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgepackagingtypecoding.hasVersion()) {
			m.setMdctnKnldgPackagingTypCdgVrsn(String.valueOf(medicationknowledgepackagingtypecoding.getVersion()));
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgepackagingtypecoding.hasCode()) {
			m.setMdctnKnldgPackagingTypCdgCd(String.valueOf(medicationknowledgepackagingtypecoding.getCode()));
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgepackagingtypecoding.hasSystem()) {
			m.setMdctnKnldgPackagingTypCdgSys(String.valueOf(medicationknowledgepackagingtypecoding.getSystem()));
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgepackagingtypecoding.hasUserSelected()) {
			m.setMdctnKnldgPackagingTypCdgUsrSltd(String.valueOf(medicationknowledgepackagingtypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Packaging_Typ_Txt ********************************************************************************/
		if(medicationknowledgepackagingtype.hasText()) {
			m.setMdctnKnldgPackagingTypTxt(String.valueOf(medicationknowledgepackagingtype.getText()));
		}
		/******************** medicationknowledgepackagingquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgepackagingquantity = medicationknowledgepackaging.getQuantity();

		/******************** MdctnKnldg_Packaging_Qnty_Vl ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasValue()) {
			m.setMdctnKnldgPackagingQntyVl(String.valueOf(medicationknowledgepackagingquantity.getValue()));
		}
		/******************** medicationknowledgepackagingquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgepackagingquantitycomparator = medicationknowledgepackagingquantity.getComparator();
		m.setMdctnKnldgPackagingQntyCmprtr(medicationknowledgepackagingquantitycomparator.toCode());

		/******************** MdctnKnldg_Packaging_Qnty_Cd ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasCode()) {
			m.setMdctnKnldgPackagingQntyCd(String.valueOf(medicationknowledgepackagingquantity.getCode()));
		}
		/******************** MdctnKnldg_Packaging_Qnty_Sys ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasSystem()) {
			m.setMdctnKnldgPackagingQntySys(String.valueOf(medicationknowledgepackagingquantity.getSystem()));
		}
		/******************** MdctnKnldg_Packaging_Qnty_Unt ********************************************************************************/
		if(medicationknowledgepackagingquantity.hasUnit()) {
			m.setMdctnKnldgPackagingQntyUnt(String.valueOf(medicationknowledgepackagingquantity.getUnit()));
		}
		/******************** medicationknowledgerelatedmedicationknowledge ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent medicationknowledgerelatedmedicationknowledge = medicationknowledge.getRelatedMedicationKnowledgeFirstRep();

		/******************** medicationknowledgerelatedmedicationknowledgetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgerelatedmedicationknowledgetype = medicationknowledgerelatedmedicationknowledge.getType();

		/******************** medicationknowledgerelatedmedicationknowledgetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgerelatedmedicationknowledgetypecoding = medicationknowledgerelatedmedicationknowledgetype.getCodingFirstRep();

		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasDisplay()) {
			m.setMdctnKnldgRltedMdctnKnldgTypCdgDsply(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasVersion()) {
			m.setMdctnKnldgRltedMdctnKnldgTypCdgVrsn(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getVersion()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasCode()) {
			m.setMdctnKnldgRltedMdctnKnldgTypCdgCd(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getCode()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasSystem()) {
			m.setMdctnKnldgRltedMdctnKnldgTypCdgSys(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getSystem()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetypecoding.hasUserSelected()) {
			m.setMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd(String.valueOf(medicationknowledgerelatedmedicationknowledgetypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Txt ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledgetype.hasText()) {
			m.setMdctnKnldgRltedMdctnKnldgTypTxt(String.valueOf(medicationknowledgerelatedmedicationknowledgetype.getText()));
		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Rfrnc ********************************************************************************/
		if(medicationknowledgerelatedmedicationknowledge.hasReference()) {
			m.setMdctnKnldgRltedMdctnKnldgRfrnc(String.valueOf(medicationknowledgerelatedmedicationknowledge.getReferenceFirstRep()));
		}
		/******************** medicationknowledgeadministrationguidelines ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent medicationknowledgeadministrationguidelines = medicationknowledge.getAdministrationGuidelinesFirstRep();

		/******************** medicationknowledgeadministrationguidelinespatientcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent medicationknowledgeadministrationguidelinespatientcharacteristics = medicationknowledgeadministrationguidelines.getPatientCharacteristicsFirstRep();

		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity = medicationknowledgeadministrationguidelinespatientcharacteristics.getCharacteristicQuantity();

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator = medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getComparator();
		m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantitycomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristicquantity.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept = medicationknowledgeadministrationguidelinespatientcharacteristics.getCharacteristicCodeableConcept();

		/******************** medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding = medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.hasText()) {
			m.setMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt(String.valueOf(medicationknowledgeadministrationguidelinespatientcharacteristicscharacteristiccodeableconcept.getText()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnRfrnc ********************************************************************************/
		if(medicationknowledgeadministrationguidelines.hasIndicationReference()) {
			m.setMdctnKnldgAdmnGdlnsIndctnRfrnc(String.valueOf(medicationknowledgeadministrationguidelines.getIndicationReference()));
		}
		/******************** medicationknowledgeadministrationguidelinesindicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesindicationcodeableconcept = medicationknowledgeadministrationguidelines.getIndicationCodeableConcept();

		/******************** medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding = medicationknowledgeadministrationguidelinesindicationcodeableconcept.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesindicationcodeableconcept.hasText()) {
			m.setMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt(String.valueOf(medicationknowledgeadministrationguidelinesindicationcodeableconcept.getText()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent medicationknowledgeadministrationguidelinesdosage = medicationknowledgeadministrationguidelines.getDosageFirstRep();

		/******************** medicationknowledgeadministrationguidelinesdosagetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagetype = medicationknowledgeadministrationguidelinesdosage.getType();

		/******************** medicationknowledgeadministrationguidelinesdosagetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagetypecoding = medicationknowledgeadministrationguidelinesdosagetype.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgTypCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgTypCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgTypCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgTypCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetypecoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagetypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagetype.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgTypTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagetype.getText()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosage ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage medicationknowledgeadministrationguidelinesdosagedosage = medicationknowledgeadministrationguidelinesdosage.getDosageFirstRep();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagemethod = medicationknowledgeadministrationguidelinesdosagedosage.getMethod();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagemethodcoding = medicationknowledgeadministrationguidelinesdosagedosagemethod.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethodcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemethod.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMthdTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemethod.getText()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept = medicationknowledgeadministrationguidelinesdosagedosage.getAsNeededCodeableConcept();

		/******************** medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding = medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageasneededcodeableconcept.getText()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasAsNeededBooleanType()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getAsNeededBooleanType()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getText()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_PntInstrctn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasPatientInstruction()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getPatientInstruction()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationknowledgeadministrationguidelinesdosagedosagetiming = medicationknowledgeadministrationguidelinesdosagedosage.getTiming();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagetimingcode = medicationknowledgeadministrationguidelinesdosagedosagetiming.getCode();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding = medicationknowledgeadministrationguidelinesdosagedosagetimingcode.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcodecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingcode.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingcode.getText()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat = medicationknowledgeadministrationguidelinesdosagedosagetiming.getRepeat();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasOffset()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getOffset()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasCount()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getCount()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasFrequency()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getFrequency()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasPeriod()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getPeriod()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasDuration()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDuration()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasCountMax()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getCountMax()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsduration = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getBoundsDuration();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getBoundsPeriod();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.hasEnd()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.getEnd()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.hasStart()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsperiod.getStart()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getBoundsRange();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange.getLow();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelowcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrange.getHigh();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehighcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasPeriodMax()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getPeriodMax()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasFrequencyMax()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getFrequencyMax()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getPeriodUnit();
		m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatperiodunit.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.hasDurationMax()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDurationMax()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit = medicationknowledgeadministrationguidelinesdosagedosagetimingrepeat.getDurationUnit();
		m.setMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt(medicationknowledgeadministrationguidelinesdosagedosagetimingrepeatdurationunit.toCode());

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime = medicationknowledgeadministrationguidelinesdosagedosage.getMaxDosePerLifetime();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetimecomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperlifetime.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction = medicationknowledgeadministrationguidelinesdosagedosage.getAdditionalInstructionFirstRep();

		/******************** medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding = medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstructioncoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageadditionalinstruction.getText()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationknowledgeadministrationguidelinesdosagedosagedoseandrate = medicationknowledgeadministrationguidelinesdosagedosage.getDoseAndRateFirstRep();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getType();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding = medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratetype.getText()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getRateQuantity();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantitycomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateratequantity.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getRateRange();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange.getLow();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelowcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangelow.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterange.getHigh();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehighcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterangehigh.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getDoseRange();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange.getLow();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelowcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangelow.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserange.getHigh();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehighcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedoserangehigh.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getRateRatio();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator = medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio.getNumerator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumeratorcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandrateraterationumerator.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator = medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratio.getDenominator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominatorcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandraterateratiodenominator.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity = medicationknowledgeadministrationguidelinesdosagedosagedoseandrate.getDoseQuantity();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator = medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantitycomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagedoseandratedosequantity.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration = medicationknowledgeadministrationguidelinesdosagedosage.getMaxDosePerAdministration();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministrationcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperadministration.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod = medicationknowledgeadministrationguidelinesdosagedosage.getMaxDosePerPeriod();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod.getNumerator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumeratorcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiodnumerator.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperiod.getDenominator();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasValue()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getValue()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator = medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getComparator();
		m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominatorcomparator.toCode());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.hasUnit()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagemaxdoseperperioddenominator.getUnit()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosagesite = medicationknowledgeadministrationguidelinesdosagedosage.getSite();

		/******************** medicationknowledgeadministrationguidelinesdosagedosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosagesitecoding = medicationknowledgeadministrationguidelinesdosagedosagesite.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesitecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosagesite.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSiteTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosagesite.getText()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Sqnc ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosage.hasSequence()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgSqnc(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosage.getSequence()));
		}
		/******************** medicationknowledgeadministrationguidelinesdosagedosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeadministrationguidelinesdosagedosageroute = medicationknowledgeadministrationguidelinesdosagedosage.getRoute();

		/******************** medicationknowledgeadministrationguidelinesdosagedosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeadministrationguidelinesdosagedosageroutecoding = medicationknowledgeadministrationguidelinesdosagedosageroute.getCodingFirstRep();

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasDisplay()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getDisplay()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasVersion()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getVersion()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasCode()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getCode()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasSystem()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getSystem()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.hasUserSelected()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroutecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Txt ********************************************************************************/
		if(medicationknowledgeadministrationguidelinesdosagedosageroute.hasText()) {
			m.setMdctnKnldgAdmnGdlnsDsgDsgRouteTxt(String.valueOf(medicationknowledgeadministrationguidelinesdosagedosageroute.getText()));
		}
		/******************** MdctnKnldg_Cntraindctn ********************************************************************************/
		if(medicationknowledge.hasContraindication()) {
			m.setMdctnKnldgCntraindctn(String.valueOf(medicationknowledge.getContraindicationFirstRep()));
		}
		/******************** MdctnKnldg_AssociatedMdctn ********************************************************************************/
		if(medicationknowledge.hasAssociatedMedication()) {
			m.setMdctnKnldgAssociatedMdctn(String.valueOf(medicationknowledge.getAssociatedMedicationFirstRep()));
		}
		/******************** medicationknowledgemonitoringprogram ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent medicationknowledgemonitoringprogram = medicationknowledge.getMonitoringProgramFirstRep();

		/******************** MdctnKnldg_MonitoringPrgrm_Nm ********************************************************************************/
		if(medicationknowledgemonitoringprogram.hasName()) {
			m.setMdctnKnldgMonitoringPrgrmNm(String.valueOf(medicationknowledgemonitoringprogram.getName()));
		}
		/******************** medicationknowledgemonitoringprogramtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemonitoringprogramtype = medicationknowledgemonitoringprogram.getType();

		/******************** medicationknowledgemonitoringprogramtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemonitoringprogramtypecoding = medicationknowledgemonitoringprogramtype.getCodingFirstRep();

		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecoding.hasDisplay()) {
			m.setMdctnKnldgMonitoringPrgrmTypCdgDsply(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecoding.hasVersion()) {
			m.setMdctnKnldgMonitoringPrgrmTypCdgVrsn(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getVersion()));
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecoding.hasCode()) {
			m.setMdctnKnldgMonitoringPrgrmTypCdgCd(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getCode()));
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecoding.hasSystem()) {
			m.setMdctnKnldgMonitoringPrgrmTypCdgSys(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getSystem()));
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemonitoringprogramtypecoding.hasUserSelected()) {
			m.setMdctnKnldgMonitoringPrgrmTypCdgUsrSltd(String.valueOf(medicationknowledgemonitoringprogramtypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Txt ********************************************************************************/
		if(medicationknowledgemonitoringprogramtype.hasText()) {
			m.setMdctnKnldgMonitoringPrgrmTypTxt(String.valueOf(medicationknowledgemonitoringprogramtype.getText()));
		}
		/******************** medicationknowledgemedicineclassification ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent medicationknowledgemedicineclassification = medicationknowledge.getMedicineClassificationFirstRep();

		/******************** medicationknowledgemedicineclassificationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemedicineclassificationtype = medicationknowledgemedicineclassification.getType();

		/******************** medicationknowledgemedicineclassificationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemedicineclassificationtypecoding = medicationknowledgemedicineclassificationtype.getCodingFirstRep();

		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecoding.hasDisplay()) {
			m.setMdctnKnldgMedicineClsfctnTypCdgDsply(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecoding.hasVersion()) {
			m.setMdctnKnldgMedicineClsfctnTypCdgVrsn(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getVersion()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecoding.hasCode()) {
			m.setMdctnKnldgMedicineClsfctnTypCdgCd(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getCode()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecoding.hasSystem()) {
			m.setMdctnKnldgMedicineClsfctnTypCdgSys(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getSystem()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemedicineclassificationtypecoding.hasUserSelected()) {
			m.setMdctnKnldgMedicineClsfctnTypCdgUsrSltd(String.valueOf(medicationknowledgemedicineclassificationtypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Txt ********************************************************************************/
		if(medicationknowledgemedicineclassificationtype.hasText()) {
			m.setMdctnKnldgMedicineClsfctnTypTxt(String.valueOf(medicationknowledgemedicineclassificationtype.getText()));
		}
		/******************** medicationknowledgemedicineclassificationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemedicineclassificationclassification = medicationknowledgemedicineclassification.getClassificationFirstRep();

		/******************** medicationknowledgemedicineclassificationclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemedicineclassificationclassificationcoding = medicationknowledgemedicineclassificationclassification.getCodingFirstRep();

		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcoding.hasDisplay()) {
			m.setMdctnKnldgMedicineClsfctnClsfctnCdgDsply(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getDisplay()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcoding.hasVersion()) {
			m.setMdctnKnldgMedicineClsfctnClsfctnCdgVrsn(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getVersion()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcoding.hasCode()) {
			m.setMdctnKnldgMedicineClsfctnClsfctnCdgCd(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getCode()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcoding.hasSystem()) {
			m.setMdctnKnldgMedicineClsfctnClsfctnCdgSys(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getSystem()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassificationcoding.hasUserSelected()) {
			m.setMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd(String.valueOf(medicationknowledgemedicineclassificationclassificationcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Txt ********************************************************************************/
		if(medicationknowledgemedicineclassificationclassification.hasText()) {
			m.setMdctnKnldgMedicineClsfctnClsfctnTxt(String.valueOf(medicationknowledgemedicineclassificationclassification.getText()));
		}
		/******************** MdctnKnldg_PreparationInstrctn ********************************************************************************/
		if(medicationknowledge.hasPreparationInstruction()) {
			m.setMdctnKnldgPreparationInstrctn(String.valueOf(medicationknowledge.getPreparationInstruction()));
		}
		/******************** medicationknowledgedrugcharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent medicationknowledgedrugcharacteristic = medicationknowledge.getDrugCharacteristicFirstRep();

		/******************** medicationknowledgedrugcharacteristictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedrugcharacteristictype = medicationknowledgedrugcharacteristic.getType();

		/******************** medicationknowledgedrugcharacteristictypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgedrugcharacteristictypecoding = medicationknowledgedrugcharacteristictype.getCodingFirstRep();

		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecoding.hasDisplay()) {
			m.setMdctnKnldgDrugCrctrstcTypCdgDsply(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecoding.hasVersion()) {
			m.setMdctnKnldgDrugCrctrstcTypCdgVrsn(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getVersion()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecoding.hasCode()) {
			m.setMdctnKnldgDrugCrctrstcTypCdgCd(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getCode()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecoding.hasSystem()) {
			m.setMdctnKnldgDrugCrctrstcTypCdgSys(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getSystem()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgedrugcharacteristictypecoding.hasUserSelected()) {
			m.setMdctnKnldgDrugCrctrstcTypCdgUsrSltd(String.valueOf(medicationknowledgedrugcharacteristictypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Txt ********************************************************************************/
		if(medicationknowledgedrugcharacteristictype.hasText()) {
			m.setMdctnKnldgDrugCrctrstcTypTxt(String.valueOf(medicationknowledgedrugcharacteristictype.getText()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlBase64BinaryTyp ********************************************************************************/
		if(medicationknowledgedrugcharacteristic.hasValueBase64BinaryType()) {
			m.setMdctnKnldgDrugCrctrstcVlBase64binaryTyp(String.valueOf(medicationknowledgedrugcharacteristic.getValueBase64BinaryType()));
		}
		/******************** medicationknowledgedrugcharacteristicvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgedrugcharacteristicvaluecodeableconcept = medicationknowledgedrugcharacteristic.getValueCodeableConcept();

		/******************** medicationknowledgedrugcharacteristicvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgedrugcharacteristicvaluecodeableconceptcoding = medicationknowledgedrugcharacteristicvaluecodeableconcept.getCodingFirstRep();

		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasDisplay()) {
			m.setMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasVersion()) {
			m.setMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getVersion()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasCode()) {
			m.setMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getCode()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasSystem()) {
			m.setMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getSystem()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.hasUserSelected()) {
			m.setMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluecodeableconcept.hasText()) {
			m.setMdctnKnldgDrugCrctrstcVlCdbleCncptTxt(String.valueOf(medicationknowledgedrugcharacteristicvaluecodeableconcept.getText()));
		}
		/******************** medicationknowledgedrugcharacteristicvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgedrugcharacteristicvaluequantity = medicationknowledgedrugcharacteristic.getValueQuantity();

		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Vl ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluequantity.hasValue()) {
			m.setMdctnKnldgDrugCrctrstcVlQntyVl(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getValue()));
		}
		/******************** medicationknowledgedrugcharacteristicvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgedrugcharacteristicvaluequantitycomparator = medicationknowledgedrugcharacteristicvaluequantity.getComparator();
		m.setMdctnKnldgDrugCrctrstcVlQntyCmprtr(medicationknowledgedrugcharacteristicvaluequantitycomparator.toCode());

		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Cd ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluequantity.hasCode()) {
			m.setMdctnKnldgDrugCrctrstcVlQntyCd(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getCode()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Sys ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluequantity.hasSystem()) {
			m.setMdctnKnldgDrugCrctrstcVlQntySys(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getSystem()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Unt ********************************************************************************/
		if(medicationknowledgedrugcharacteristicvaluequantity.hasUnit()) {
			m.setMdctnKnldgDrugCrctrstcVlQntyUnt(String.valueOf(medicationknowledgedrugcharacteristicvaluequantity.getUnit()));
		}
		/******************** MdctnKnldg_DrugCrctrstc_VlStrgTyp ********************************************************************************/
		if(medicationknowledgedrugcharacteristic.hasValueStringType()) {
			m.setMdctnKnldgDrugCrctrstcVlStrgTyp(String.valueOf(medicationknowledgedrugcharacteristic.getValueStringType()));
		}
		/******************** medicationknowledgeproducttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeproducttype = medicationknowledge.getProductTypeFirstRep();

		/******************** medicationknowledgeproducttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeproducttypecoding = medicationknowledgeproducttype.getCodingFirstRep();

		/******************** MdctnKnldg_PrdctTyp_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeproducttypecoding.hasDisplay()) {
			m.setMdctnKnldgPrdctTypCdgDsply(String.valueOf(medicationknowledgeproducttypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeproducttypecoding.hasVersion()) {
			m.setMdctnKnldgPrdctTypCdgVrsn(String.valueOf(medicationknowledgeproducttypecoding.getVersion()));
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeproducttypecoding.hasCode()) {
			m.setMdctnKnldgPrdctTypCdgCd(String.valueOf(medicationknowledgeproducttypecoding.getCode()));
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeproducttypecoding.hasSystem()) {
			m.setMdctnKnldgPrdctTypCdgSys(String.valueOf(medicationknowledgeproducttypecoding.getSystem()));
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeproducttypecoding.hasUserSelected()) {
			m.setMdctnKnldgPrdctTypCdgUsrSltd(String.valueOf(medicationknowledgeproducttypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_PrdctTyp_Txt ********************************************************************************/
		if(medicationknowledgeproducttype.hasText()) {
			m.setMdctnKnldgPrdctTypTxt(String.valueOf(medicationknowledgeproducttype.getText()));
		}
		/******************** medicationknowledgeingredient ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent medicationknowledgeingredient = medicationknowledge.getIngredientFirstRep();

		/******************** medicationknowledgeingredientitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeingredientitemcodeableconcept = medicationknowledgeingredient.getItemCodeableConcept();

		/******************** medicationknowledgeingredientitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeingredientitemcodeableconceptcoding = medicationknowledgeingredientitemcodeableconcept.getCodingFirstRep();

		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasDisplay()) {
			m.setMdctnKnldgIgrdntItmCdbleCncptCdgDsply(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasVersion()) {
			m.setMdctnKnldgIgrdntItmCdbleCncptCdgVrsn(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasCode()) {
			m.setMdctnKnldgIgrdntItmCdbleCncptCdgCd(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getCode()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasSystem()) {
			m.setMdctnKnldgIgrdntItmCdbleCncptCdgSys(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd(String.valueOf(medicationknowledgeingredientitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(medicationknowledgeingredientitemcodeableconcept.hasText()) {
			m.setMdctnKnldgIgrdntItmCdbleCncptTxt(String.valueOf(medicationknowledgeingredientitemcodeableconcept.getText()));
		}
		/******************** MdctnKnldg_Igrdnt_ItmRfrnc ********************************************************************************/
		if(medicationknowledgeingredient.hasItemReference()) {
			m.setMdctnKnldgIgrdntItmRfrnc(String.valueOf(medicationknowledgeingredient.getItemReference()));
		}
		/******************** MdctnKnldg_Igrdnt_IsActive ********************************************************************************/
		if(medicationknowledgeingredient.hasIsActive()) {
			m.setMdctnKnldgIgrdntIsActive(String.valueOf(medicationknowledgeingredient.getIsActive()));
		}
		/******************** medicationknowledgeingredientstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationknowledgeingredientstrength = medicationknowledgeingredient.getStrength();

		/******************** medicationknowledgeingredientstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeingredientstrengthnumerator = medicationknowledgeingredientstrength.getNumerator();

		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(medicationknowledgeingredientstrengthnumerator.hasValue()) {
			m.setMdctnKnldgIgrdntStrNmrtrVl(String.valueOf(medicationknowledgeingredientstrengthnumerator.getValue()));
		}
		/******************** medicationknowledgeingredientstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeingredientstrengthnumeratorcomparator = medicationknowledgeingredientstrengthnumerator.getComparator();
		m.setMdctnKnldgIgrdntStrNmrtrCmprtr(medicationknowledgeingredientstrengthnumeratorcomparator.toCode());

		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(medicationknowledgeingredientstrengthnumerator.hasCode()) {
			m.setMdctnKnldgIgrdntStrNmrtrCd(String.valueOf(medicationknowledgeingredientstrengthnumerator.getCode()));
		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(medicationknowledgeingredientstrengthnumerator.hasSystem()) {
			m.setMdctnKnldgIgrdntStrNmrtrSys(String.valueOf(medicationknowledgeingredientstrengthnumerator.getSystem()));
		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(medicationknowledgeingredientstrengthnumerator.hasUnit()) {
			m.setMdctnKnldgIgrdntStrNmrtrUnt(String.valueOf(medicationknowledgeingredientstrengthnumerator.getUnit()));
		}
		/******************** medicationknowledgeingredientstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeingredientstrengthdenominator = medicationknowledgeingredientstrength.getDenominator();

		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(medicationknowledgeingredientstrengthdenominator.hasValue()) {
			m.setMdctnKnldgIgrdntStrDnmntrVl(String.valueOf(medicationknowledgeingredientstrengthdenominator.getValue()));
		}
		/******************** medicationknowledgeingredientstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeingredientstrengthdenominatorcomparator = medicationknowledgeingredientstrengthdenominator.getComparator();
		m.setMdctnKnldgIgrdntStrDnmntrCmprtr(medicationknowledgeingredientstrengthdenominatorcomparator.toCode());

		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(medicationknowledgeingredientstrengthdenominator.hasCode()) {
			m.setMdctnKnldgIgrdntStrDnmntrCd(String.valueOf(medicationknowledgeingredientstrengthdenominator.getCode()));
		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(medicationknowledgeingredientstrengthdenominator.hasSystem()) {
			m.setMdctnKnldgIgrdntStrDnmntrSys(String.valueOf(medicationknowledgeingredientstrengthdenominator.getSystem()));
		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(medicationknowledgeingredientstrengthdenominator.hasUnit()) {
			m.setMdctnKnldgIgrdntStrDnmntrUnt(String.valueOf(medicationknowledgeingredientstrengthdenominator.getUnit()));
		}
		/******************** medicationknowledgeregulatory ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent medicationknowledgeregulatory = medicationknowledge.getRegulatoryFirstRep();

		/******************** medicationknowledgeregulatoryschedule ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent medicationknowledgeregulatoryschedule = medicationknowledgeregulatory.getScheduleFirstRep();

		/******************** medicationknowledgeregulatoryscheduleschedule ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeregulatoryscheduleschedule = medicationknowledgeregulatoryschedule.getSchedule();

		/******************** medicationknowledgeregulatoryscheduleschedulecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeregulatoryscheduleschedulecoding = medicationknowledgeregulatoryscheduleschedule.getCodingFirstRep();

		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasDisplay()) {
			m.setMdctnKnldgRegulatorySchdlSchdlCdgDsply(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getDisplay()));
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasVersion()) {
			m.setMdctnKnldgRegulatorySchdlSchdlCdgVrsn(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getVersion()));
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasCode()) {
			m.setMdctnKnldgRegulatorySchdlSchdlCdgCd(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getCode()));
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasSystem()) {
			m.setMdctnKnldgRegulatorySchdlSchdlCdgSys(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getSystem()));
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedulecoding.hasUserSelected()) {
			m.setMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd(String.valueOf(medicationknowledgeregulatoryscheduleschedulecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Txt ********************************************************************************/
		if(medicationknowledgeregulatoryscheduleschedule.hasText()) {
			m.setMdctnKnldgRegulatorySchdlSchdlTxt(String.valueOf(medicationknowledgeregulatoryscheduleschedule.getText()));
		}
		/******************** medicationknowledgeregulatorysubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent medicationknowledgeregulatorysubstitution = medicationknowledgeregulatory.getSubstitutionFirstRep();

		/******************** medicationknowledgeregulatorysubstitutiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeregulatorysubstitutiontype = medicationknowledgeregulatorysubstitution.getType();

		/******************** medicationknowledgeregulatorysubstitutiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeregulatorysubstitutiontypecoding = medicationknowledgeregulatorysubstitutiontype.getCodingFirstRep();

		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasDisplay()) {
			m.setMdctnKnldgRegulatorySubstitutionTypCdgDsply(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasVersion()) {
			m.setMdctnKnldgRegulatorySubstitutionTypCdgVrsn(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getVersion()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasCode()) {
			m.setMdctnKnldgRegulatorySubstitutionTypCdgCd(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getCode()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasSystem()) {
			m.setMdctnKnldgRegulatorySubstitutionTypCdgSys(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getSystem()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontypecoding.hasUserSelected()) {
			m.setMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd(String.valueOf(medicationknowledgeregulatorysubstitutiontypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Txt ********************************************************************************/
		if(medicationknowledgeregulatorysubstitutiontype.hasText()) {
			m.setMdctnKnldgRegulatorySubstitutionTypTxt(String.valueOf(medicationknowledgeregulatorysubstitutiontype.getText()));
		}
		/******************** MdctnKnldg_Regulatory_Substitution_Allowed ********************************************************************************/
		if(medicationknowledgeregulatorysubstitution.hasAllowed()) {
			m.setMdctnKnldgRegulatorySubstitutionAllowed(String.valueOf(medicationknowledgeregulatorysubstitution.getAllowed()));
		}
		/******************** medicationknowledgeregulatorymaxdispense ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent medicationknowledgeregulatorymaxdispense = medicationknowledgeregulatory.getMaxDispense();

		/******************** medicationknowledgeregulatorymaxdispenseperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgeregulatorymaxdispenseperiod = medicationknowledgeregulatorymaxdispense.getPeriod();

		/******************** medicationknowledgeregulatorymaxdispensequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgeregulatorymaxdispensequantity = medicationknowledgeregulatorymaxdispense.getQuantity();

		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Vl ********************************************************************************/
		if(medicationknowledgeregulatorymaxdispensequantity.hasValue()) {
			m.setMdctnKnldgRegulatoryMxDispnsQntyVl(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getValue()));
		}
		/******************** medicationknowledgeregulatorymaxdispensequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgeregulatorymaxdispensequantitycomparator = medicationknowledgeregulatorymaxdispensequantity.getComparator();
		m.setMdctnKnldgRegulatoryMxDispnsQntyCmprtr(medicationknowledgeregulatorymaxdispensequantitycomparator.toCode());

		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Cd ********************************************************************************/
		if(medicationknowledgeregulatorymaxdispensequantity.hasCode()) {
			m.setMdctnKnldgRegulatoryMxDispnsQntyCd(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getCode()));
		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Sys ********************************************************************************/
		if(medicationknowledgeregulatorymaxdispensequantity.hasSystem()) {
			m.setMdctnKnldgRegulatoryMxDispnsQntySys(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getSystem()));
		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Unt ********************************************************************************/
		if(medicationknowledgeregulatorymaxdispensequantity.hasUnit()) {
			m.setMdctnKnldgRegulatoryMxDispnsQntyUnt(String.valueOf(medicationknowledgeregulatorymaxdispensequantity.getUnit()));
		}
		/******************** medicationknowledgeintendedroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgeintendedroute = medicationknowledge.getIntendedRouteFirstRep();

		/******************** medicationknowledgeintendedroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgeintendedroutecoding = medicationknowledgeintendedroute.getCodingFirstRep();

		/******************** MdctnKnldg_IntendedRoute_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgeintendedroutecoding.hasDisplay()) {
			m.setMdctnKnldgIntendedRouteCdgDsply(String.valueOf(medicationknowledgeintendedroutecoding.getDisplay()));
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgeintendedroutecoding.hasVersion()) {
			m.setMdctnKnldgIntendedRouteCdgVrsn(String.valueOf(medicationknowledgeintendedroutecoding.getVersion()));
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Cd ********************************************************************************/
		if(medicationknowledgeintendedroutecoding.hasCode()) {
			m.setMdctnKnldgIntendedRouteCdgCd(String.valueOf(medicationknowledgeintendedroutecoding.getCode()));
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Sys ********************************************************************************/
		if(medicationknowledgeintendedroutecoding.hasSystem()) {
			m.setMdctnKnldgIntendedRouteCdgSys(String.valueOf(medicationknowledgeintendedroutecoding.getSystem()));
		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgeintendedroutecoding.hasUserSelected()) {
			m.setMdctnKnldgIntendedRouteCdgUsrSltd(String.valueOf(medicationknowledgeintendedroutecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_IntendedRoute_Txt ********************************************************************************/
		if(medicationknowledgeintendedroute.hasText()) {
			m.setMdctnKnldgIntendedRouteTxt(String.valueOf(medicationknowledgeintendedroute.getText()));
		}
		/******************** medicationknowledgemonograph ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent medicationknowledgemonograph = medicationknowledge.getMonographFirstRep();

		/******************** medicationknowledgemonographtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationknowledgemonographtype = medicationknowledgemonograph.getType();

		/******************** medicationknowledgemonographtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationknowledgemonographtypecoding = medicationknowledgemonographtype.getCodingFirstRep();

		/******************** MdctnKnldg_Monograph_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationknowledgemonographtypecoding.hasDisplay()) {
			m.setMdctnKnldgMonographTypCdgDsply(String.valueOf(medicationknowledgemonographtypecoding.getDisplay()));
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationknowledgemonographtypecoding.hasVersion()) {
			m.setMdctnKnldgMonographTypCdgVrsn(String.valueOf(medicationknowledgemonographtypecoding.getVersion()));
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Cd ********************************************************************************/
		if(medicationknowledgemonographtypecoding.hasCode()) {
			m.setMdctnKnldgMonographTypCdgCd(String.valueOf(medicationknowledgemonographtypecoding.getCode()));
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Sys ********************************************************************************/
		if(medicationknowledgemonographtypecoding.hasSystem()) {
			m.setMdctnKnldgMonographTypCdgSys(String.valueOf(medicationknowledgemonographtypecoding.getSystem()));
		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationknowledgemonographtypecoding.hasUserSelected()) {
			m.setMdctnKnldgMonographTypCdgUsrSltd(String.valueOf(medicationknowledgemonographtypecoding.getUserSelected()));
		}
		/******************** MdctnKnldg_Monograph_Typ_Txt ********************************************************************************/
		if(medicationknowledgemonographtype.hasText()) {
			m.setMdctnKnldgMonographTypTxt(String.valueOf(medicationknowledgemonographtype.getText()));
		}
		/******************** MdctnKnldg_Monograph_Src ********************************************************************************/
		if(medicationknowledgemonograph.hasSource()) {
			m.setMdctnKnldgMonographSrc(String.valueOf(medicationknowledgemonograph.getSource()));
		}
		/******************** medicationknowledgekinetics ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent medicationknowledgekinetics = medicationknowledge.getKineticsFirstRep();

		/******************** medicationknowledgekineticsareaundercurve ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgekineticsareaundercurve = medicationknowledgekinetics.getAreaUnderCurveFirstRep();

		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Vl ********************************************************************************/
		if(medicationknowledgekineticsareaundercurve.hasValue()) {
			m.setMdctnKnldgKineticsAreaUnderCurveVl(String.valueOf(medicationknowledgekineticsareaundercurve.getValue()));
		}
		/******************** medicationknowledgekineticsareaundercurvecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgekineticsareaundercurvecomparator = medicationknowledgekineticsareaundercurve.getComparator();
		m.setMdctnKnldgKineticsAreaUnderCurveCmprtr(medicationknowledgekineticsareaundercurvecomparator.toCode());

		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Cd ********************************************************************************/
		if(medicationknowledgekineticsareaundercurve.hasCode()) {
			m.setMdctnKnldgKineticsAreaUnderCurveCd(String.valueOf(medicationknowledgekineticsareaundercurve.getCode()));
		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Sys ********************************************************************************/
		if(medicationknowledgekineticsareaundercurve.hasSystem()) {
			m.setMdctnKnldgKineticsAreaUnderCurveSys(String.valueOf(medicationknowledgekineticsareaundercurve.getSystem()));
		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Unt ********************************************************************************/
		if(medicationknowledgekineticsareaundercurve.hasUnit()) {
			m.setMdctnKnldgKineticsAreaUnderCurveUnt(String.valueOf(medicationknowledgekineticsareaundercurve.getUnit()));
		}
		/******************** medicationknowledgekineticslethaldose50 ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationknowledgekineticslethaldose50 = medicationknowledgekinetics.getLethalDose50FirstRep();

		/******************** MdctnKnldg_Kinetics_LethalDose50_Vl ********************************************************************************/
		if(medicationknowledgekineticslethaldose50.hasValue()) {
			m.setMdctnKnldgKineticsLethalDose50Vl(String.valueOf(medicationknowledgekineticslethaldose50.getValue()));
		}
		/******************** medicationknowledgekineticslethaldose50comparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationknowledgekineticslethaldose50comparator = medicationknowledgekineticslethaldose50.getComparator();
		m.setMdctnKnldgKineticsLethalDose50Cmprtr(medicationknowledgekineticslethaldose50comparator.toCode());

		/******************** MdctnKnldg_Kinetics_LethalDose50_Cd ********************************************************************************/
		if(medicationknowledgekineticslethaldose50.hasCode()) {
			m.setMdctnKnldgKineticsLethalDose50Cd(String.valueOf(medicationknowledgekineticslethaldose50.getCode()));
		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Sys ********************************************************************************/
		if(medicationknowledgekineticslethaldose50.hasSystem()) {
			m.setMdctnKnldgKineticsLethalDose50Sys(String.valueOf(medicationknowledgekineticslethaldose50.getSystem()));
		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Unt ********************************************************************************/
		if(medicationknowledgekineticslethaldose50.hasUnit()) {
			m.setMdctnKnldgKineticsLethalDose50Unt(String.valueOf(medicationknowledgekineticslethaldose50.getUnit()));
		}
		/******************** medicationknowledgekineticshalflifeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationknowledgekineticshalflifeperiod = medicationknowledgekinetics.getHalfLifePeriod();

		return m;
	}
}
