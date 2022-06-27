package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationAdministration;
public class MedicationAdministrationBidirectionalConversion 
{
	public MedicationAdministration MedicationAdministrations(org.hl7.fhir.r4.model.MedicationAdministration medicationadministration) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationAdministration m = new  main.java.com.campfhir.model.MedicationAdministration();

		/******************** id ********************************************************************************/
		medicationadministration.setId(m.getId());

		/******************** MdctnAdmnstn_Cntxt ********************************************************************************/
		if(medicationadministration.hasContext()) {
			m.setMdctnAdmnstnCntxt(String.valueOf(medicationadministration.getContext()));
		}
		/******************** MdctnAdmnstn_PartOf ********************************************************************************/
		if(medicationadministration.hasPartOf()) {
			m.setMdctnAdmnstnPartOf(String.valueOf(medicationadministration.getPartOfFirstRep()));
		}
		/******************** MdctnAdmnstn_Sbjct ********************************************************************************/
		if(medicationadministration.hasSubject()) {
			m.setMdctnAdmnstnSbjct(String.valueOf(medicationadministration.getSubject()));
		}
		/******************** medicationadministrationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationStatus medicationadministrationstatus = medicationadministration.getStatus();
		m.setMdctnAdmnstnSts(medicationadministrationstatus.toCode());

		/******************** medicationadministrationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationadministrationnote = medicationadministration.getNoteFirstRep();

		/******************** MdctnAdmnstn_Nt_Time ********************************************************************************/
		if(medicationadministrationnote.hasTime()) {
			m.setMdctnAdmnstnNtTime(String.valueOf(medicationadministrationnote.getTime()));
		}
		/******************** MdctnAdmnstn_Nt_Txt ********************************************************************************/
		if(medicationadministrationnote.hasText()) {
			m.setMdctnAdmnstnNtTxt(String.valueOf(medicationadministrationnote.getText()));
		}
		/******************** MdctnAdmnstn_Nt_AthrRfrnc ********************************************************************************/
		if(medicationadministrationnote.hasAuthorReference()) {
			m.setMdctnAdmnstnNtAthrRfrnc(String.valueOf(medicationadministrationnote.getAuthorReference()));
		}
		/******************** MdctnAdmnstn_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationadministrationnote.hasAuthorStringType()) {
			m.setMdctnAdmnstnNtAthrStrgTyp(String.valueOf(medicationadministrationnote.getAuthorStringType()));
		}
		/******************** MdctnAdmnstn_Rqst ********************************************************************************/
		if(medicationadministration.hasRequest()) {
			m.setMdctnAdmnstnRqst(String.valueOf(medicationadministration.getRequest()));
		}
		/******************** medicationadministrationeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationadministrationeffectiveperiod = medicationadministration.getEffectivePeriod();

		/******************** MdctnAdmnstn_EfctivePrd_Strt ********************************************************************************/
		if(medicationadministrationeffectiveperiod.hasStart()) {
			m.setMdctnAdmnstnEfctivePrdStrt(String.valueOf(medicationadministrationeffectiveperiod.getStart()));
		}
		/******************** MdctnAdmnstn_EfctivePrd_End ********************************************************************************/
		if(medicationadministrationeffectiveperiod.hasEnd()) {
			m.setMdctnAdmnstnEfctivePrdEnd(String.valueOf(medicationadministrationeffectiveperiod.getEnd()));
		}
		/******************** medicationadministrationdosage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent medicationadministrationdosage = medicationadministration.getDosage();

		/******************** medicationadministrationdosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosagemethod = medicationadministrationdosage.getMethod();

		/******************** MdctnAdmnstn_Dsg_Mthd_Txt ********************************************************************************/
		if(medicationadministrationdosagemethod.hasText()) {
			m.setMdctnAdmnstnDsgMthdTxt(String.valueOf(medicationadministrationdosagemethod.getText()));
		}
		/******************** medicationadministrationdosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationdosagemethodcoding = medicationadministrationdosagemethod.getCodingFirstRep();

		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationdosagemethodcoding.hasVersion()) {
			m.setMdctnAdmnstnDsgMthdCdgVrsn(String.valueOf(medicationadministrationdosagemethodcoding.getVersion()));
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationdosagemethodcoding.hasDisplay()) {
			m.setMdctnAdmnstnDsgMthdCdgDsply(String.valueOf(medicationadministrationdosagemethodcoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationadministrationdosagemethodcoding.hasCode()) {
			m.setMdctnAdmnstnDsgMthdCdgCd(String.valueOf(medicationadministrationdosagemethodcoding.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationdosagemethodcoding.hasUserSelected()) {
			m.setMdctnAdmnstnDsgMthdCdgUsrSltd(String.valueOf(medicationadministrationdosagemethodcoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationadministrationdosagemethodcoding.hasSystem()) {
			m.setMdctnAdmnstnDsgMthdCdgSys(String.valueOf(medicationadministrationdosagemethodcoding.getSystem()));
		}
		/******************** medicationadministrationdosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosagesite = medicationadministrationdosage.getSite();

		/******************** MdctnAdmnstn_Dsg_Site_Txt ********************************************************************************/
		if(medicationadministrationdosagesite.hasText()) {
			m.setMdctnAdmnstnDsgSiteTxt(String.valueOf(medicationadministrationdosagesite.getText()));
		}
		/******************** medicationadministrationdosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationdosagesitecoding = medicationadministrationdosagesite.getCodingFirstRep();

		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationdosagesitecoding.hasVersion()) {
			m.setMdctnAdmnstnDsgSiteCdgVrsn(String.valueOf(medicationadministrationdosagesitecoding.getVersion()));
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationdosagesitecoding.hasDisplay()) {
			m.setMdctnAdmnstnDsgSiteCdgDsply(String.valueOf(medicationadministrationdosagesitecoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(medicationadministrationdosagesitecoding.hasCode()) {
			m.setMdctnAdmnstnDsgSiteCdgCd(String.valueOf(medicationadministrationdosagesitecoding.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationdosagesitecoding.hasUserSelected()) {
			m.setMdctnAdmnstnDsgSiteCdgUsrSltd(String.valueOf(medicationadministrationdosagesitecoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(medicationadministrationdosagesitecoding.hasSystem()) {
			m.setMdctnAdmnstnDsgSiteCdgSys(String.valueOf(medicationadministrationdosagesitecoding.getSystem()));
		}
		/******************** MdctnAdmnstn_Dsg_Txt ********************************************************************************/
		if(medicationadministrationdosage.hasText()) {
			m.setMdctnAdmnstnDsgTxt(String.valueOf(medicationadministrationdosage.getText()));
		}
		/******************** medicationadministrationdosagerateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationadministrationdosagerateratio = medicationadministrationdosage.getRateRatio();

		/******************** medicationadministrationdosagerateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosagerateratiodenominator = medicationadministrationdosagerateratio.getDenominator();

		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasValue()) {
			m.setMdctnAdmnstnDsgRtRtioDnmntrVl(String.valueOf(medicationadministrationdosagerateratiodenominator.getValue()));
		}
		/******************** medicationadministrationdosagerateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosagerateratiodenominatorcomparator = medicationadministrationdosagerateratiodenominator.getComparator();
		m.setMdctnAdmnstnDsgRtRtioDnmntrCmprtr(medicationadministrationdosagerateratiodenominatorcomparator.toCode());

		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasCode()) {
			m.setMdctnAdmnstnDsgRtRtioDnmntrCd(String.valueOf(medicationadministrationdosagerateratiodenominator.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasUnit()) {
			m.setMdctnAdmnstnDsgRtRtioDnmntrUnt(String.valueOf(medicationadministrationdosagerateratiodenominator.getUnit()));
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasSystem()) {
			m.setMdctnAdmnstnDsgRtRtioDnmntrSys(String.valueOf(medicationadministrationdosagerateratiodenominator.getSystem()));
		}
		/******************** medicationadministrationdosageraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosageraterationumerator = medicationadministrationdosagerateratio.getNumerator();

		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasValue()) {
			m.setMdctnAdmnstnDsgRtRtioNmrtrVl(String.valueOf(medicationadministrationdosageraterationumerator.getValue()));
		}
		/******************** medicationadministrationdosageraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosageraterationumeratorcomparator = medicationadministrationdosageraterationumerator.getComparator();
		m.setMdctnAdmnstnDsgRtRtioNmrtrCmprtr(medicationadministrationdosageraterationumeratorcomparator.toCode());

		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasCode()) {
			m.setMdctnAdmnstnDsgRtRtioNmrtrCd(String.valueOf(medicationadministrationdosageraterationumerator.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasUnit()) {
			m.setMdctnAdmnstnDsgRtRtioNmrtrUnt(String.valueOf(medicationadministrationdosageraterationumerator.getUnit()));
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasSystem()) {
			m.setMdctnAdmnstnDsgRtRtioNmrtrSys(String.valueOf(medicationadministrationdosageraterationumerator.getSystem()));
		}
		/******************** medicationadministrationdosagedose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosagedose = medicationadministrationdosage.getDose();

		/******************** MdctnAdmnstn_Dsg_Dose_Vl ********************************************************************************/
		if(medicationadministrationdosagedose.hasValue()) {
			m.setMdctnAdmnstnDsgDoseVl(String.valueOf(medicationadministrationdosagedose.getValue()));
		}
		/******************** medicationadministrationdosagedosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosagedosecomparator = medicationadministrationdosagedose.getComparator();
		m.setMdctnAdmnstnDsgDoseCmprtr(medicationadministrationdosagedosecomparator.toCode());

		/******************** MdctnAdmnstn_Dsg_Dose_Cd ********************************************************************************/
		if(medicationadministrationdosagedose.hasCode()) {
			m.setMdctnAdmnstnDsgDoseCd(String.valueOf(medicationadministrationdosagedose.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Unt ********************************************************************************/
		if(medicationadministrationdosagedose.hasUnit()) {
			m.setMdctnAdmnstnDsgDoseUnt(String.valueOf(medicationadministrationdosagedose.getUnit()));
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Sys ********************************************************************************/
		if(medicationadministrationdosagedose.hasSystem()) {
			m.setMdctnAdmnstnDsgDoseSys(String.valueOf(medicationadministrationdosagedose.getSystem()));
		}
		/******************** medicationadministrationdosageratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosageratequantity = medicationadministrationdosage.getRateQuantity();

		/******************** MdctnAdmnstn_Dsg_RtQnty_Vl ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasValue()) {
			m.setMdctnAdmnstnDsgRtQntyVl(String.valueOf(medicationadministrationdosageratequantity.getValue()));
		}
		/******************** medicationadministrationdosageratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosageratequantitycomparator = medicationadministrationdosageratequantity.getComparator();
		m.setMdctnAdmnstnDsgRtQntyCmprtr(medicationadministrationdosageratequantitycomparator.toCode());

		/******************** MdctnAdmnstn_Dsg_RtQnty_Cd ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasCode()) {
			m.setMdctnAdmnstnDsgRtQntyCd(String.valueOf(medicationadministrationdosageratequantity.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Unt ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasUnit()) {
			m.setMdctnAdmnstnDsgRtQntyUnt(String.valueOf(medicationadministrationdosageratequantity.getUnit()));
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Sys ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasSystem()) {
			m.setMdctnAdmnstnDsgRtQntySys(String.valueOf(medicationadministrationdosageratequantity.getSystem()));
		}
		/******************** medicationadministrationdosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosageroute = medicationadministrationdosage.getRoute();

		/******************** MdctnAdmnstn_Dsg_Route_Txt ********************************************************************************/
		if(medicationadministrationdosageroute.hasText()) {
			m.setMdctnAdmnstnDsgRouteTxt(String.valueOf(medicationadministrationdosageroute.getText()));
		}
		/******************** medicationadministrationdosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationdosageroutecoding = medicationadministrationdosageroute.getCodingFirstRep();

		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationdosageroutecoding.hasVersion()) {
			m.setMdctnAdmnstnDsgRouteCdgVrsn(String.valueOf(medicationadministrationdosageroutecoding.getVersion()));
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationdosageroutecoding.hasDisplay()) {
			m.setMdctnAdmnstnDsgRouteCdgDsply(String.valueOf(medicationadministrationdosageroutecoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(medicationadministrationdosageroutecoding.hasCode()) {
			m.setMdctnAdmnstnDsgRouteCdgCd(String.valueOf(medicationadministrationdosageroutecoding.getCode()));
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationdosageroutecoding.hasUserSelected()) {
			m.setMdctnAdmnstnDsgRouteCdgUsrSltd(String.valueOf(medicationadministrationdosageroutecoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(medicationadministrationdosageroutecoding.hasSystem()) {
			m.setMdctnAdmnstnDsgRouteCdgSys(String.valueOf(medicationadministrationdosageroutecoding.getSystem()));
		}
		/******************** MdctnAdmnstn_SprtingInfo ********************************************************************************/
		if(medicationadministration.hasSupportingInformation()) {
			m.setMdctnAdmnstnSprtingInfo(String.valueOf(medicationadministration.getSupportingInformationFirstRep()));
		}
		/******************** MdctnAdmnstn_EvntHis ********************************************************************************/
		if(medicationadministration.hasEventHistory()) {
			m.setMdctnAdmnstnEvntHis(String.valueOf(medicationadministration.getEventHistoryFirstRep()));
		}
		/******************** medicationadministrationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationcategory = medicationadministration.getCategory();

		/******************** MdctnAdmnstn_Ctgry_Txt ********************************************************************************/
		if(medicationadministrationcategory.hasText()) {
			m.setMdctnAdmnstnCtgryTxt(String.valueOf(medicationadministrationcategory.getText()));
		}
		/******************** medicationadministrationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationcategorycoding = medicationadministrationcategory.getCodingFirstRep();

		/******************** MdctnAdmnstn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationcategorycoding.hasVersion()) {
			m.setMdctnAdmnstnCtgryCdgVrsn(String.valueOf(medicationadministrationcategorycoding.getVersion()));
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationcategorycoding.hasDisplay()) {
			m.setMdctnAdmnstnCtgryCdgDsply(String.valueOf(medicationadministrationcategorycoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationadministrationcategorycoding.hasCode()) {
			m.setMdctnAdmnstnCtgryCdgCd(String.valueOf(medicationadministrationcategorycoding.getCode()));
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationcategorycoding.hasUserSelected()) {
			m.setMdctnAdmnstnCtgryCdgUsrSltd(String.valueOf(medicationadministrationcategorycoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationadministrationcategorycoding.hasSystem()) {
			m.setMdctnAdmnstnCtgryCdgSys(String.valueOf(medicationadministrationcategorycoding.getSystem()));
		}
		/******************** medicationadministrationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationstatusreason = medicationadministration.getStatusReasonFirstRep();

		/******************** MdctnAdmnstn_StsRsn_Txt ********************************************************************************/
		if(medicationadministrationstatusreason.hasText()) {
			m.setMdctnAdmnstnStsRsnTxt(String.valueOf(medicationadministrationstatusreason.getText()));
		}
		/******************** medicationadministrationstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationstatusreasoncoding = medicationadministrationstatusreason.getCodingFirstRep();

		/******************** MdctnAdmnstn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationstatusreasoncoding.hasVersion()) {
			m.setMdctnAdmnstnStsRsnCdgVrsn(String.valueOf(medicationadministrationstatusreasoncoding.getVersion()));
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationstatusreasoncoding.hasDisplay()) {
			m.setMdctnAdmnstnStsRsnCdgDsply(String.valueOf(medicationadministrationstatusreasoncoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Cd ********************************************************************************/
		if(medicationadministrationstatusreasoncoding.hasCode()) {
			m.setMdctnAdmnstnStsRsnCdgCd(String.valueOf(medicationadministrationstatusreasoncoding.getCode()));
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationstatusreasoncoding.hasUserSelected()) {
			m.setMdctnAdmnstnStsRsnCdgUsrSltd(String.valueOf(medicationadministrationstatusreasoncoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Sys ********************************************************************************/
		if(medicationadministrationstatusreasoncoding.hasSystem()) {
			m.setMdctnAdmnstnStsRsnCdgSys(String.valueOf(medicationadministrationstatusreasoncoding.getSystem()));
		}
		/******************** medicationadministrationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationadministrationidentifier = medicationadministration.getIdentifierFirstRep();

		/******************** MdctnAdmnstn_Id_Vl ********************************************************************************/
		if(medicationadministrationidentifier.hasValue()) {
			m.setMdctnAdmnstnIdVl(String.valueOf(medicationadministrationidentifier.getValue()));
		}
		/******************** medicationadministrationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationidentifiertype = medicationadministrationidentifier.getType();

		/******************** MdctnAdmnstn_Id_Typ_Txt ********************************************************************************/
		if(medicationadministrationidentifiertype.hasText()) {
			m.setMdctnAdmnstnIdTypTxt(String.valueOf(medicationadministrationidentifiertype.getText()));
		}
		/******************** medicationadministrationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationidentifiertypecoding = medicationadministrationidentifiertype.getCodingFirstRep();

		/******************** MdctnAdmnstn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationidentifiertypecoding.hasVersion()) {
			m.setMdctnAdmnstnIdTypCdgVrsn(String.valueOf(medicationadministrationidentifiertypecoding.getVersion()));
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationidentifiertypecoding.hasDisplay()) {
			m.setMdctnAdmnstnIdTypCdgDsply(String.valueOf(medicationadministrationidentifiertypecoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationadministrationidentifiertypecoding.hasCode()) {
			m.setMdctnAdmnstnIdTypCdgCd(String.valueOf(medicationadministrationidentifiertypecoding.getCode()));
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationidentifiertypecoding.hasUserSelected()) {
			m.setMdctnAdmnstnIdTypCdgUsrSltd(String.valueOf(medicationadministrationidentifiertypecoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationadministrationidentifiertypecoding.hasSystem()) {
			m.setMdctnAdmnstnIdTypCdgSys(String.valueOf(medicationadministrationidentifiertypecoding.getSystem()));
		}
		/******************** medicationadministrationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationadministrationidentifierperiod = medicationadministrationidentifier.getPeriod();

		/******************** MdctnAdmnstn_Id_Prd_Strt ********************************************************************************/
		if(medicationadministrationidentifierperiod.hasStart()) {
			m.setMdctnAdmnstnIdPrdStrt(String.valueOf(medicationadministrationidentifierperiod.getStart()));
		}
		/******************** MdctnAdmnstn_Id_Prd_End ********************************************************************************/
		if(medicationadministrationidentifierperiod.hasEnd()) {
			m.setMdctnAdmnstnIdPrdEnd(String.valueOf(medicationadministrationidentifierperiod.getEnd()));
		}
		/******************** MdctnAdmnstn_Id_Assigner ********************************************************************************/
		if(medicationadministrationidentifier.hasAssigner()) {
			m.setMdctnAdmnstnIdAssigner(String.valueOf(medicationadministrationidentifier.getAssigner()));
		}
		/******************** MdctnAdmnstn_Id_Sys ********************************************************************************/
		if(medicationadministrationidentifier.hasSystem()) {
			m.setMdctnAdmnstnIdSys(String.valueOf(medicationadministrationidentifier.getSystem()));
		}
		/******************** medicationadministrationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationadministrationidentifieruse = medicationadministrationidentifier.getUse();
		m.setMdctnAdmnstnIdUse(medicationadministrationidentifieruse.toCode());

		/******************** medicationadministrationreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationreasoncode = medicationadministration.getReasonCodeFirstRep();

		/******************** MdctnAdmnstn_RsnCd_Txt ********************************************************************************/
		if(medicationadministrationreasoncode.hasText()) {
			m.setMdctnAdmnstnRsnCdTxt(String.valueOf(medicationadministrationreasoncode.getText()));
		}
		/******************** medicationadministrationreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationreasoncodecoding = medicationadministrationreasoncode.getCodingFirstRep();

		/******************** MdctnAdmnstn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationreasoncodecoding.hasVersion()) {
			m.setMdctnAdmnstnRsnCdCdgVrsn(String.valueOf(medicationadministrationreasoncodecoding.getVersion()));
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationreasoncodecoding.hasDisplay()) {
			m.setMdctnAdmnstnRsnCdCdgDsply(String.valueOf(medicationadministrationreasoncodecoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Cd ********************************************************************************/
		if(medicationadministrationreasoncodecoding.hasCode()) {
			m.setMdctnAdmnstnRsnCdCdgCd(String.valueOf(medicationadministrationreasoncodecoding.getCode()));
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationreasoncodecoding.hasUserSelected()) {
			m.setMdctnAdmnstnRsnCdCdgUsrSltd(String.valueOf(medicationadministrationreasoncodecoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Sys ********************************************************************************/
		if(medicationadministrationreasoncodecoding.hasSystem()) {
			m.setMdctnAdmnstnRsnCdCdgSys(String.valueOf(medicationadministrationreasoncodecoding.getSystem()));
		}
		/******************** MdctnAdmnstn_RsnRfrnc ********************************************************************************/
		if(medicationadministration.hasReasonReference()) {
			m.setMdctnAdmnstnRsnRfrnc(String.valueOf(medicationadministration.getReasonReferenceFirstRep()));
		}
		/******************** MdctnAdmnstn_Dvc ********************************************************************************/
		if(medicationadministration.hasDevice()) {
			m.setMdctnAdmnstnDvc(String.valueOf(medicationadministration.getDeviceFirstRep()));
		}
		/******************** MdctnAdmnstn_EfctiveDtTimeTyp ********************************************************************************/
		if(medicationadministration.hasEffectiveDateTimeType()) {
			m.setMdctnAdmnstnEfctiveDtTimeTyp(String.valueOf(medicationadministration.getEffectiveDateTimeType()));
		}
		/******************** medicationadministrationperformer ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent medicationadministrationperformer = medicationadministration.getPerformerFirstRep();

		/******************** medicationadministrationperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationperformerfunction = medicationadministrationperformer.getFunction();

		/******************** MdctnAdmnstn_Prfrmr_Function_Txt ********************************************************************************/
		if(medicationadministrationperformerfunction.hasText()) {
			m.setMdctnAdmnstnPrfrmrFunctionTxt(String.valueOf(medicationadministrationperformerfunction.getText()));
		}
		/******************** medicationadministrationperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationperformerfunctioncoding = medicationadministrationperformerfunction.getCodingFirstRep();

		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationperformerfunctioncoding.hasVersion()) {
			m.setMdctnAdmnstnPrfrmrFunctionCdgVrsn(String.valueOf(medicationadministrationperformerfunctioncoding.getVersion()));
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationperformerfunctioncoding.hasDisplay()) {
			m.setMdctnAdmnstnPrfrmrFunctionCdgDsply(String.valueOf(medicationadministrationperformerfunctioncoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(medicationadministrationperformerfunctioncoding.hasCode()) {
			m.setMdctnAdmnstnPrfrmrFunctionCdgCd(String.valueOf(medicationadministrationperformerfunctioncoding.getCode()));
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationperformerfunctioncoding.hasUserSelected()) {
			m.setMdctnAdmnstnPrfrmrFunctionCdgUsrSltd(String.valueOf(medicationadministrationperformerfunctioncoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(medicationadministrationperformerfunctioncoding.hasSystem()) {
			m.setMdctnAdmnstnPrfrmrFunctionCdgSys(String.valueOf(medicationadministrationperformerfunctioncoding.getSystem()));
		}
		/******************** MdctnAdmnstn_Prfrmr_Actor ********************************************************************************/
		if(medicationadministrationperformer.hasActor()) {
			m.setMdctnAdmnstnPrfrmrActor(String.valueOf(medicationadministrationperformer.getActor()));
		}
		/******************** medicationadministrationmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationmedicationcodeableconcept = medicationadministration.getMedicationCodeableConcept();

		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationadministrationmedicationcodeableconcept.hasText()) {
			m.setMdctnAdmnstnMdctnCdbleCncptTxt(String.valueOf(medicationadministrationmedicationcodeableconcept.getText()));
		}
		/******************** medicationadministrationmedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationmedicationcodeableconceptcoding = medicationadministrationmedicationcodeableconcept.getCodingFirstRep();

		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcoding.hasVersion()) {
			m.setMdctnAdmnstnMdctnCdbleCncptCdgVrsn(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcoding.hasDisplay()) {
			m.setMdctnAdmnstnMdctnCdbleCncptCdgDsply(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcoding.hasCode()) {
			m.setMdctnAdmnstnMdctnCdbleCncptCdgCd(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getCode()));
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcoding.hasSystem()) {
			m.setMdctnAdmnstnMdctnCdbleCncptCdgSys(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdctnAdmnstn_MdctnRfrnc ********************************************************************************/
		if(medicationadministration.hasMedicationReference()) {
			m.setMdctnAdmnstnMdctnRfrnc(String.valueOf(medicationadministration.getMedicationReference()));
		}
		return m;
	}
}
