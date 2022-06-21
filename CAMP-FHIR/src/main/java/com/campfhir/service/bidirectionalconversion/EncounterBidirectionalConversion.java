package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Encounter;
public class EncounterBidirectionalConversion 
{
	public Encounter Encounters(org.hl7.fhir.r4.model.Encounter encounter) throws ParseException
	{
		 main.java.com.campfhir.model.Encounter e = new  main.java.com.campfhir.model.Encounter();

		/******************** id ********************************************************************************/
		encounter.setId(e.getId());

		/******************** encounterlength ********************************************************************************/
		org.hl7.fhir.r4.model.Duration encounterlength = encounter.getLength();

		/******************** encounterpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterpriority = encounter.getPriority();

		/******************** encounterprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterprioritycoding = encounterpriority.getCodingFirstRep();

		/******************** Enc_Priority_Cdg_Dsply ********************************************************************************/
		if(encounterprioritycoding.hasDisplay()) {
			e.setEncPriorityCdgDsply(String.valueOf(encounterprioritycoding.getDisplay()));
		}
		/******************** Enc_Priority_Cdg_Vrsn ********************************************************************************/
		if(encounterprioritycoding.hasVersion()) {
			e.setEncPriorityCdgVrsn(String.valueOf(encounterprioritycoding.getVersion()));
		}
		/******************** Enc_Priority_Cdg_Cd ********************************************************************************/
		if(encounterprioritycoding.hasCode()) {
			e.setEncPriorityCdgCd(String.valueOf(encounterprioritycoding.getCode()));
		}
		/******************** Enc_Priority_Cdg_Sys ********************************************************************************/
		if(encounterprioritycoding.hasSystem()) {
			e.setEncPriorityCdgSys(String.valueOf(encounterprioritycoding.getSystem()));
		}
		/******************** Enc_Priority_Cdg_UsrSltd ********************************************************************************/
		if(encounterprioritycoding.hasUserSelected()) {
			e.setEncPriorityCdgUsrSltd(String.valueOf(encounterprioritycoding.getUserSelected()));
		}
		/******************** Enc_Priority_Txt ********************************************************************************/
		if(encounterpriority.hasText()) {
			e.setEncPriorityTxt(String.valueOf(encounterpriority.getText()));
		}
		/******************** Enc_Sbjct ********************************************************************************/
		if(encounter.hasSubject()) {
			e.setEncSbjct(String.valueOf(encounter.getSubject()));
		}
		/******************** encounterstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterStatus encounterstatus = encounter.getStatus();
		e.setEncSts(encounterstatus.toCode());

		/******************** Enc_BasedOn ********************************************************************************/
		if(encounter.hasBasedOn()) {
			e.setEncBasedOn(String.valueOf(encounter.getBasedOnFirstRep()));
		}
		/******************** encounterperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterperiod = encounter.getPeriod();

		/******************** Enc_Prd_End ********************************************************************************/
		if(encounterperiod.hasEnd()) {
			e.setEncPrdEnd(String.valueOf(encounterperiod.getEnd()));
		}
		/******************** Enc_Prd_Strt ********************************************************************************/
		if(encounterperiod.hasStart()) {
			e.setEncPrdStrt(String.valueOf(encounterperiod.getStart()));
		}
		/******************** encounterservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterservicetype = encounter.getServiceType();

		/******************** encounterservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterservicetypecoding = encounterservicetype.getCodingFirstRep();

		/******************** Enc_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(encounterservicetypecoding.hasDisplay()) {
			e.setEncSrvTypCdgDsply(String.valueOf(encounterservicetypecoding.getDisplay()));
		}
		/******************** Enc_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(encounterservicetypecoding.hasVersion()) {
			e.setEncSrvTypCdgVrsn(String.valueOf(encounterservicetypecoding.getVersion()));
		}
		/******************** Enc_SrvTyp_Cdg_Cd ********************************************************************************/
		if(encounterservicetypecoding.hasCode()) {
			e.setEncSrvTypCdgCd(String.valueOf(encounterservicetypecoding.getCode()));
		}
		/******************** Enc_SrvTyp_Cdg_Sys ********************************************************************************/
		if(encounterservicetypecoding.hasSystem()) {
			e.setEncSrvTypCdgSys(String.valueOf(encounterservicetypecoding.getSystem()));
		}
		/******************** Enc_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(encounterservicetypecoding.hasUserSelected()) {
			e.setEncSrvTypCdgUsrSltd(String.valueOf(encounterservicetypecoding.getUserSelected()));
		}
		/******************** Enc_SrvTyp_Txt ********************************************************************************/
		if(encounterservicetype.hasText()) {
			e.setEncSrvTypTxt(String.valueOf(encounterservicetype.getText()));
		}
		/******************** encountertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encountertype = encounter.getTypeFirstRep();

		/******************** encountertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encountertypecoding = encountertype.getCodingFirstRep();

		/******************** Enc_Typ_Cdg_Dsply ********************************************************************************/
		if(encountertypecoding.hasDisplay()) {
			e.setEncTypCdgDsply(String.valueOf(encountertypecoding.getDisplay()));
		}
		/******************** Enc_Typ_Cdg_Vrsn ********************************************************************************/
		if(encountertypecoding.hasVersion()) {
			e.setEncTypCdgVrsn(String.valueOf(encountertypecoding.getVersion()));
		}
		/******************** Enc_Typ_Cdg_Cd ********************************************************************************/
		if(encountertypecoding.hasCode()) {
			e.setEncTypCdgCd(String.valueOf(encountertypecoding.getCode()));
		}
		/******************** Enc_Typ_Cdg_Sys ********************************************************************************/
		if(encountertypecoding.hasSystem()) {
			e.setEncTypCdgSys(String.valueOf(encountertypecoding.getSystem()));
		}
		/******************** Enc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encountertypecoding.hasUserSelected()) {
			e.setEncTypCdgUsrSltd(String.valueOf(encountertypecoding.getUserSelected()));
		}
		/******************** Enc_Typ_Txt ********************************************************************************/
		if(encountertype.hasText()) {
			e.setEncTypTxt(String.valueOf(encountertype.getText()));
		}
		/******************** encounterclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterclass = encounter.getClass_();

		/******************** Enc_Cls__Dsply ********************************************************************************/
		if(encounterclass.hasDisplay()) {
			e.setEncClsDsply(String.valueOf(encounterclass.getDisplay()));
		}
		/******************** Enc_Cls__Vrsn ********************************************************************************/
		if(encounterclass.hasVersion()) {
			e.setEncClsVrsn(String.valueOf(encounterclass.getVersion()));
		}
		/******************** Enc_Cls__Cd ********************************************************************************/
		if(encounterclass.hasCode()) {
			e.setEncClsCd(String.valueOf(encounterclass.getCode()));
		}
		/******************** Enc_Cls__Sys ********************************************************************************/
		if(encounterclass.hasSystem()) {
			e.setEncClsSys(String.valueOf(encounterclass.getSystem()));
		}
		/******************** Enc_Cls__UsrSltd ********************************************************************************/
		if(encounterclass.hasUserSelected()) {
			e.setEncClsUsrSltd(String.valueOf(encounterclass.getUserSelected()));
		}
		/******************** Enc_SrvProvider ********************************************************************************/
		if(encounter.hasServiceProvider()) {
			e.setEncSrvProvider(String.valueOf(encounter.getServiceProvider()));
		}
		/******************** encounterhospitalization ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent encounterhospitalization = encounter.getHospitalization();

		/******************** encounterhospitalizationspecialarrangement ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationspecialarrangement = encounterhospitalization.getSpecialArrangementFirstRep();

		/******************** encounterhospitalizationspecialarrangementcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationspecialarrangementcoding = encounterhospitalizationspecialarrangement.getCodingFirstRep();

		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcoding.hasDisplay()) {
			e.setEncHospitalizationSpclArrangementCdgDsply(String.valueOf(encounterhospitalizationspecialarrangementcoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcoding.hasVersion()) {
			e.setEncHospitalizationSpclArrangementCdgVrsn(String.valueOf(encounterhospitalizationspecialarrangementcoding.getVersion()));
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcoding.hasCode()) {
			e.setEncHospitalizationSpclArrangementCdgCd(String.valueOf(encounterhospitalizationspecialarrangementcoding.getCode()));
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcoding.hasSystem()) {
			e.setEncHospitalizationSpclArrangementCdgSys(String.valueOf(encounterhospitalizationspecialarrangementcoding.getSystem()));
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationspecialarrangementcoding.hasUserSelected()) {
			e.setEncHospitalizationSpclArrangementCdgUsrSltd(String.valueOf(encounterhospitalizationspecialarrangementcoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_SpclArrangement_Txt ********************************************************************************/
		if(encounterhospitalizationspecialarrangement.hasText()) {
			e.setEncHospitalizationSpclArrangementTxt(String.valueOf(encounterhospitalizationspecialarrangement.getText()));
		}
		/******************** encounterhospitalizationpreadmissionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier encounterhospitalizationpreadmissionidentifier = encounterhospitalization.getPreAdmissionIdentifier();

		/******************** Enc_Hospitalization_PreAdmissionId_Vl ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifier.hasValue()) {
			e.setEncHospitalizationPreAdmissionIdVl(String.valueOf(encounterhospitalizationpreadmissionidentifier.getValue()));
		}
		/******************** encounterhospitalizationpreadmissionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationpreadmissionidentifiertype = encounterhospitalizationpreadmissionidentifier.getType();

		/******************** encounterhospitalizationpreadmissionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationpreadmissionidentifiertypecoding = encounterhospitalizationpreadmissionidentifiertype.getCodingFirstRep();

		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasDisplay()) {
			e.setEncHospitalizationPreAdmissionIdTypCdgDsply(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasVersion()) {
			e.setEncHospitalizationPreAdmissionIdTypCdgVrsn(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getVersion()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasCode()) {
			e.setEncHospitalizationPreAdmissionIdTypCdgCd(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getCode()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasSystem()) {
			e.setEncHospitalizationPreAdmissionIdTypCdgSys(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getSystem()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertypecoding.hasUserSelected()) {
			e.setEncHospitalizationPreAdmissionIdTypCdgUsrSltd(String.valueOf(encounterhospitalizationpreadmissionidentifiertypecoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Txt ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifiertype.hasText()) {
			e.setEncHospitalizationPreAdmissionIdTypTxt(String.valueOf(encounterhospitalizationpreadmissionidentifiertype.getText()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Sys ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifier.hasSystem()) {
			e.setEncHospitalizationPreAdmissionIdSys(String.valueOf(encounterhospitalizationpreadmissionidentifier.getSystem()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Assigner ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifier.hasAssigner()) {
			e.setEncHospitalizationPreAdmissionIdAssigner(String.valueOf(encounterhospitalizationpreadmissionidentifier.getAssigner()));
		}
		/******************** encounterhospitalizationpreadmissionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterhospitalizationpreadmissionidentifierperiod = encounterhospitalizationpreadmissionidentifier.getPeriod();

		/******************** Enc_Hospitalization_PreAdmissionId_Prd_End ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifierperiod.hasEnd()) {
			e.setEncHospitalizationPreAdmissionIdPrdEnd(String.valueOf(encounterhospitalizationpreadmissionidentifierperiod.getEnd()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Prd_Strt ********************************************************************************/
		if(encounterhospitalizationpreadmissionidentifierperiod.hasStart()) {
			e.setEncHospitalizationPreAdmissionIdPrdStrt(String.valueOf(encounterhospitalizationpreadmissionidentifierperiod.getStart()));
		}
		/******************** encounterhospitalizationpreadmissionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse encounterhospitalizationpreadmissionidentifieruse = encounterhospitalizationpreadmissionidentifier.getUse();
		e.setEncHospitalizationPreAdmissionIdUse(encounterhospitalizationpreadmissionidentifieruse.toCode());

		/******************** encounterhospitalizationdietpreference ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationdietpreference = encounterhospitalization.getDietPreferenceFirstRep();

		/******************** encounterhospitalizationdietpreferencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationdietpreferencecoding = encounterhospitalizationdietpreference.getCodingFirstRep();

		/******************** Enc_Hospitalization_DietPreference_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationdietpreferencecoding.hasDisplay()) {
			e.setEncHospitalizationDietPreferenceCdgDsply(String.valueOf(encounterhospitalizationdietpreferencecoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationdietpreferencecoding.hasVersion()) {
			e.setEncHospitalizationDietPreferenceCdgVrsn(String.valueOf(encounterhospitalizationdietpreferencecoding.getVersion()));
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationdietpreferencecoding.hasCode()) {
			e.setEncHospitalizationDietPreferenceCdgCd(String.valueOf(encounterhospitalizationdietpreferencecoding.getCode()));
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationdietpreferencecoding.hasSystem()) {
			e.setEncHospitalizationDietPreferenceCdgSys(String.valueOf(encounterhospitalizationdietpreferencecoding.getSystem()));
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationdietpreferencecoding.hasUserSelected()) {
			e.setEncHospitalizationDietPreferenceCdgUsrSltd(String.valueOf(encounterhospitalizationdietpreferencecoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_DietPreference_Txt ********************************************************************************/
		if(encounterhospitalizationdietpreference.hasText()) {
			e.setEncHospitalizationDietPreferenceTxt(String.valueOf(encounterhospitalizationdietpreference.getText()));
		}
		/******************** encounterhospitalizationdischargedisposition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationdischargedisposition = encounterhospitalization.getDischargeDisposition();

		/******************** encounterhospitalizationdischargedispositioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationdischargedispositioncoding = encounterhospitalizationdischargedisposition.getCodingFirstRep();

		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncoding.hasDisplay()) {
			e.setEncHospitalizationDischargeDispositionCdgDsply(String.valueOf(encounterhospitalizationdischargedispositioncoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncoding.hasVersion()) {
			e.setEncHospitalizationDischargeDispositionCdgVrsn(String.valueOf(encounterhospitalizationdischargedispositioncoding.getVersion()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncoding.hasCode()) {
			e.setEncHospitalizationDischargeDispositionCdgCd(String.valueOf(encounterhospitalizationdischargedispositioncoding.getCode()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncoding.hasSystem()) {
			e.setEncHospitalizationDischargeDispositionCdgSys(String.valueOf(encounterhospitalizationdischargedispositioncoding.getSystem()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationdischargedispositioncoding.hasUserSelected()) {
			e.setEncHospitalizationDischargeDispositionCdgUsrSltd(String.valueOf(encounterhospitalizationdischargedispositioncoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Txt ********************************************************************************/
		if(encounterhospitalizationdischargedisposition.hasText()) {
			e.setEncHospitalizationDischargeDispositionTxt(String.valueOf(encounterhospitalizationdischargedisposition.getText()));
		}
		/******************** encounterhospitalizationspecialcourtesy ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationspecialcourtesy = encounterhospitalization.getSpecialCourtesyFirstRep();

		/******************** encounterhospitalizationspecialcourtesycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationspecialcourtesycoding = encounterhospitalizationspecialcourtesy.getCodingFirstRep();

		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycoding.hasDisplay()) {
			e.setEncHospitalizationSpclCourtesyCdgDsply(String.valueOf(encounterhospitalizationspecialcourtesycoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycoding.hasVersion()) {
			e.setEncHospitalizationSpclCourtesyCdgVrsn(String.valueOf(encounterhospitalizationspecialcourtesycoding.getVersion()));
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycoding.hasCode()) {
			e.setEncHospitalizationSpclCourtesyCdgCd(String.valueOf(encounterhospitalizationspecialcourtesycoding.getCode()));
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycoding.hasSystem()) {
			e.setEncHospitalizationSpclCourtesyCdgSys(String.valueOf(encounterhospitalizationspecialcourtesycoding.getSystem()));
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationspecialcourtesycoding.hasUserSelected()) {
			e.setEncHospitalizationSpclCourtesyCdgUsrSltd(String.valueOf(encounterhospitalizationspecialcourtesycoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Txt ********************************************************************************/
		if(encounterhospitalizationspecialcourtesy.hasText()) {
			e.setEncHospitalizationSpclCourtesyTxt(String.valueOf(encounterhospitalizationspecialcourtesy.getText()));
		}
		/******************** encounterhospitalizationadmitsource ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationadmitsource = encounterhospitalization.getAdmitSource();

		/******************** encounterhospitalizationadmitsourcecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationadmitsourcecoding = encounterhospitalizationadmitsource.getCodingFirstRep();

		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationadmitsourcecoding.hasDisplay()) {
			e.setEncHospitalizationAdmitSrcCdgDsply(String.valueOf(encounterhospitalizationadmitsourcecoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationadmitsourcecoding.hasVersion()) {
			e.setEncHospitalizationAdmitSrcCdgVrsn(String.valueOf(encounterhospitalizationadmitsourcecoding.getVersion()));
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationadmitsourcecoding.hasCode()) {
			e.setEncHospitalizationAdmitSrcCdgCd(String.valueOf(encounterhospitalizationadmitsourcecoding.getCode()));
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationadmitsourcecoding.hasSystem()) {
			e.setEncHospitalizationAdmitSrcCdgSys(String.valueOf(encounterhospitalizationadmitsourcecoding.getSystem()));
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationadmitsourcecoding.hasUserSelected()) {
			e.setEncHospitalizationAdmitSrcCdgUsrSltd(String.valueOf(encounterhospitalizationadmitsourcecoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_AdmitSrc_Txt ********************************************************************************/
		if(encounterhospitalizationadmitsource.hasText()) {
			e.setEncHospitalizationAdmitSrcTxt(String.valueOf(encounterhospitalizationadmitsource.getText()));
		}
		/******************** encounterhospitalizationreadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationreadmission = encounterhospitalization.getReAdmission();

		/******************** encounterhospitalizationreadmissioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationreadmissioncoding = encounterhospitalizationreadmission.getCodingFirstRep();

		/******************** Enc_Hospitalization_ReAdmission_Cdg_Dsply ********************************************************************************/
		if(encounterhospitalizationreadmissioncoding.hasDisplay()) {
			e.setEncHospitalizationReAdmissionCdgDsply(String.valueOf(encounterhospitalizationreadmissioncoding.getDisplay()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Vrsn ********************************************************************************/
		if(encounterhospitalizationreadmissioncoding.hasVersion()) {
			e.setEncHospitalizationReAdmissionCdgVrsn(String.valueOf(encounterhospitalizationreadmissioncoding.getVersion()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Cd ********************************************************************************/
		if(encounterhospitalizationreadmissioncoding.hasCode()) {
			e.setEncHospitalizationReAdmissionCdgCd(String.valueOf(encounterhospitalizationreadmissioncoding.getCode()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Sys ********************************************************************************/
		if(encounterhospitalizationreadmissioncoding.hasSystem()) {
			e.setEncHospitalizationReAdmissionCdgSys(String.valueOf(encounterhospitalizationreadmissioncoding.getSystem()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_UsrSltd ********************************************************************************/
		if(encounterhospitalizationreadmissioncoding.hasUserSelected()) {
			e.setEncHospitalizationReAdmissionCdgUsrSltd(String.valueOf(encounterhospitalizationreadmissioncoding.getUserSelected()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Txt ********************************************************************************/
		if(encounterhospitalizationreadmission.hasText()) {
			e.setEncHospitalizationReAdmissionTxt(String.valueOf(encounterhospitalizationreadmission.getText()));
		}
		/******************** Enc_Hospitalization_Destination ********************************************************************************/
		if(encounterhospitalization.hasDestination()) {
			e.setEncHospitalizationDestination(String.valueOf(encounterhospitalization.getDestination()));
		}
		/******************** Enc_Hospitalization_Origin ********************************************************************************/
		if(encounterhospitalization.hasOrigin()) {
			e.setEncHospitalizationOrigin(String.valueOf(encounterhospitalization.getOrigin()));
		}
		/******************** Enc_Account ********************************************************************************/
		if(encounter.hasAccount()) {
			e.setEncAccount(String.valueOf(encounter.getAccountFirstRep()));
		}
		/******************** Enc_PartOf ********************************************************************************/
		if(encounter.hasPartOf()) {
			e.setEncPartOf(String.valueOf(encounter.getPartOf()));
		}
		/******************** Enc_RsnRfrnc ********************************************************************************/
		if(encounter.hasReasonReference()) {
			e.setEncRsnRfrnc(String.valueOf(encounter.getReasonReferenceFirstRep()));
		}
		/******************** encounterreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterreasoncode = encounter.getReasonCodeFirstRep();

		/******************** encounterreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterreasoncodecoding = encounterreasoncode.getCodingFirstRep();

		/******************** Enc_RsnCd_Cdg_Dsply ********************************************************************************/
		if(encounterreasoncodecoding.hasDisplay()) {
			e.setEncRsnCdCdgDsply(String.valueOf(encounterreasoncodecoding.getDisplay()));
		}
		/******************** Enc_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(encounterreasoncodecoding.hasVersion()) {
			e.setEncRsnCdCdgVrsn(String.valueOf(encounterreasoncodecoding.getVersion()));
		}
		/******************** Enc_RsnCd_Cdg_Cd ********************************************************************************/
		if(encounterreasoncodecoding.hasCode()) {
			e.setEncRsnCdCdgCd(String.valueOf(encounterreasoncodecoding.getCode()));
		}
		/******************** Enc_RsnCd_Cdg_Sys ********************************************************************************/
		if(encounterreasoncodecoding.hasSystem()) {
			e.setEncRsnCdCdgSys(String.valueOf(encounterreasoncodecoding.getSystem()));
		}
		/******************** Enc_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(encounterreasoncodecoding.hasUserSelected()) {
			e.setEncRsnCdCdgUsrSltd(String.valueOf(encounterreasoncodecoding.getUserSelected()));
		}
		/******************** Enc_RsnCd_Txt ********************************************************************************/
		if(encounterreasoncode.hasText()) {
			e.setEncRsnCdTxt(String.valueOf(encounterreasoncode.getText()));
		}
		/******************** encounterdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.DiagnosisComponent encounterdiagnosis = encounter.getDiagnosisFirstRep();

		/******************** Enc_Dgnsis_Cndtn ********************************************************************************/
		if(encounterdiagnosis.hasCondition()) {
			e.setEncDgnsisCndtn(String.valueOf(encounterdiagnosis.getCondition()));
		}
		/******************** encounterdiagnosisuse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterdiagnosisuse = encounterdiagnosis.getUse();

		/******************** encounterdiagnosisusecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterdiagnosisusecoding = encounterdiagnosisuse.getCodingFirstRep();

		/******************** Enc_Dgnsis_Use_Cdg_Dsply ********************************************************************************/
		if(encounterdiagnosisusecoding.hasDisplay()) {
			e.setEncDgnsisUseCdgDsply(String.valueOf(encounterdiagnosisusecoding.getDisplay()));
		}
		/******************** Enc_Dgnsis_Use_Cdg_Vrsn ********************************************************************************/
		if(encounterdiagnosisusecoding.hasVersion()) {
			e.setEncDgnsisUseCdgVrsn(String.valueOf(encounterdiagnosisusecoding.getVersion()));
		}
		/******************** Enc_Dgnsis_Use_Cdg_Cd ********************************************************************************/
		if(encounterdiagnosisusecoding.hasCode()) {
			e.setEncDgnsisUseCdgCd(String.valueOf(encounterdiagnosisusecoding.getCode()));
		}
		/******************** Enc_Dgnsis_Use_Cdg_Sys ********************************************************************************/
		if(encounterdiagnosisusecoding.hasSystem()) {
			e.setEncDgnsisUseCdgSys(String.valueOf(encounterdiagnosisusecoding.getSystem()));
		}
		/******************** Enc_Dgnsis_Use_Cdg_UsrSltd ********************************************************************************/
		if(encounterdiagnosisusecoding.hasUserSelected()) {
			e.setEncDgnsisUseCdgUsrSltd(String.valueOf(encounterdiagnosisusecoding.getUserSelected()));
		}
		/******************** Enc_Dgnsis_Use_Txt ********************************************************************************/
		if(encounterdiagnosisuse.hasText()) {
			e.setEncDgnsisUseTxt(String.valueOf(encounterdiagnosisuse.getText()));
		}
		/******************** Enc_Dgnsis_Rnk ********************************************************************************/
		if(encounterdiagnosis.hasRank()) {
			e.setEncDgnsisRnk(String.valueOf(encounterdiagnosis.getRank()));
		}
		/******************** encounterclasshistory ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent encounterclasshistory = encounter.getClassHistoryFirstRep();

		/******************** encounterclasshistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterclasshistoryperiod = encounterclasshistory.getPeriod();

		/******************** Enc_ClsHis_Prd_End ********************************************************************************/
		if(encounterclasshistoryperiod.hasEnd()) {
			e.setEncClsHisPrdEnd(String.valueOf(encounterclasshistoryperiod.getEnd()));
		}
		/******************** Enc_ClsHis_Prd_Strt ********************************************************************************/
		if(encounterclasshistoryperiod.hasStart()) {
			e.setEncClsHisPrdStrt(String.valueOf(encounterclasshistoryperiod.getStart()));
		}
		/******************** encounterclasshistoryclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterclasshistoryclass = encounterclasshistory.getClass_();

		/******************** Enc_ClsHis_Cls__Dsply ********************************************************************************/
		if(encounterclasshistoryclass.hasDisplay()) {
			e.setEncClsHisClsDsply(String.valueOf(encounterclasshistoryclass.getDisplay()));
		}
		/******************** Enc_ClsHis_Cls__Vrsn ********************************************************************************/
		if(encounterclasshistoryclass.hasVersion()) {
			e.setEncClsHisClsVrsn(String.valueOf(encounterclasshistoryclass.getVersion()));
		}
		/******************** Enc_ClsHis_Cls__Cd ********************************************************************************/
		if(encounterclasshistoryclass.hasCode()) {
			e.setEncClsHisClsCd(String.valueOf(encounterclasshistoryclass.getCode()));
		}
		/******************** Enc_ClsHis_Cls__Sys ********************************************************************************/
		if(encounterclasshistoryclass.hasSystem()) {
			e.setEncClsHisClsSys(String.valueOf(encounterclasshistoryclass.getSystem()));
		}
		/******************** Enc_ClsHis_Cls__UsrSltd ********************************************************************************/
		if(encounterclasshistoryclass.hasUserSelected()) {
			e.setEncClsHisClsUsrSltd(String.valueOf(encounterclasshistoryclass.getUserSelected()));
		}
		/******************** Enc_Appmnt ********************************************************************************/
		if(encounter.hasAppointment()) {
			e.setEncAppmnt(String.valueOf(encounter.getAppointmentFirstRep()));
		}
		/******************** encounterlocation ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent encounterlocation = encounter.getLocationFirstRep();

		/******************** encounterlocationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterLocationStatus encounterlocationstatus = encounterlocation.getStatus();
		e.setEncLctnSts(encounterlocationstatus.toCode());

		/******************** encounterlocationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterlocationperiod = encounterlocation.getPeriod();

		/******************** Enc_Lctn_Prd_End ********************************************************************************/
		if(encounterlocationperiod.hasEnd()) {
			e.setEncLctnPrdEnd(String.valueOf(encounterlocationperiod.getEnd()));
		}
		/******************** Enc_Lctn_Prd_Strt ********************************************************************************/
		if(encounterlocationperiod.hasStart()) {
			e.setEncLctnPrdStrt(String.valueOf(encounterlocationperiod.getStart()));
		}
		/******************** encounterlocationphysicaltype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterlocationphysicaltype = encounterlocation.getPhysicalType();

		/******************** encounterlocationphysicaltypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterlocationphysicaltypecoding = encounterlocationphysicaltype.getCodingFirstRep();

		/******************** Enc_Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(encounterlocationphysicaltypecoding.hasDisplay()) {
			e.setEncLctnPhysclTypCdgDsply(String.valueOf(encounterlocationphysicaltypecoding.getDisplay()));
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(encounterlocationphysicaltypecoding.hasVersion()) {
			e.setEncLctnPhysclTypCdgVrsn(String.valueOf(encounterlocationphysicaltypecoding.getVersion()));
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(encounterlocationphysicaltypecoding.hasCode()) {
			e.setEncLctnPhysclTypCdgCd(String.valueOf(encounterlocationphysicaltypecoding.getCode()));
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(encounterlocationphysicaltypecoding.hasSystem()) {
			e.setEncLctnPhysclTypCdgSys(String.valueOf(encounterlocationphysicaltypecoding.getSystem()));
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(encounterlocationphysicaltypecoding.hasUserSelected()) {
			e.setEncLctnPhysclTypCdgUsrSltd(String.valueOf(encounterlocationphysicaltypecoding.getUserSelected()));
		}
		/******************** Enc_Lctn_PhysclTyp_Txt ********************************************************************************/
		if(encounterlocationphysicaltype.hasText()) {
			e.setEncLctnPhysclTypTxt(String.valueOf(encounterlocationphysicaltype.getText()));
		}
		/******************** encounterstatushistory ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent encounterstatushistory = encounter.getStatusHistoryFirstRep();

		/******************** encounterstatushistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterStatus encounterstatushistorystatus = encounterstatushistory.getStatus();
		e.setEncStsHisSts(encounterstatushistorystatus.toCode());

		/******************** encounterstatushistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterstatushistoryperiod = encounterstatushistory.getPeriod();

		/******************** Enc_StsHis_Prd_End ********************************************************************************/
		if(encounterstatushistoryperiod.hasEnd()) {
			e.setEncStsHisPrdEnd(String.valueOf(encounterstatushistoryperiod.getEnd()));
		}
		/******************** Enc_StsHis_Prd_Strt ********************************************************************************/
		if(encounterstatushistoryperiod.hasStart()) {
			e.setEncStsHisPrdStrt(String.valueOf(encounterstatushistoryperiod.getStart()));
		}
		/******************** encounterparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent encounterparticipant = encounter.getParticipantFirstRep();

		/******************** encounterparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterparticipantperiod = encounterparticipant.getPeriod();

		/******************** Enc_Prtcpnt_Prd_End ********************************************************************************/
		if(encounterparticipantperiod.hasEnd()) {
			e.setEncPrtcpntPrdEnd(String.valueOf(encounterparticipantperiod.getEnd()));
		}
		/******************** Enc_Prtcpnt_Prd_Strt ********************************************************************************/
		if(encounterparticipantperiod.hasStart()) {
			e.setEncPrtcpntPrdStrt(String.valueOf(encounterparticipantperiod.getStart()));
		}
		/******************** encounterparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterparticipanttype = encounterparticipant.getTypeFirstRep();

		/******************** encounterparticipanttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterparticipanttypecoding = encounterparticipanttype.getCodingFirstRep();

		/******************** Enc_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(encounterparticipanttypecoding.hasDisplay()) {
			e.setEncPrtcpntTypCdgDsply(String.valueOf(encounterparticipanttypecoding.getDisplay()));
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(encounterparticipanttypecoding.hasVersion()) {
			e.setEncPrtcpntTypCdgVrsn(String.valueOf(encounterparticipanttypecoding.getVersion()));
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(encounterparticipanttypecoding.hasCode()) {
			e.setEncPrtcpntTypCdgCd(String.valueOf(encounterparticipanttypecoding.getCode()));
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(encounterparticipanttypecoding.hasSystem()) {
			e.setEncPrtcpntTypCdgSys(String.valueOf(encounterparticipanttypecoding.getSystem()));
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encounterparticipanttypecoding.hasUserSelected()) {
			e.setEncPrtcpntTypCdgUsrSltd(String.valueOf(encounterparticipanttypecoding.getUserSelected()));
		}
		/******************** Enc_Prtcpnt_Typ_Txt ********************************************************************************/
		if(encounterparticipanttype.hasText()) {
			e.setEncPrtcpntTypTxt(String.valueOf(encounterparticipanttype.getText()));
		}
		/******************** Enc_Prtcpnt_Individual ********************************************************************************/
		if(encounterparticipant.hasIndividual()) {
			e.setEncPrtcpntIndividual(String.valueOf(encounterparticipant.getIndividual()));
		}
		/******************** Enc_EpisodeOfCare ********************************************************************************/
		if(encounter.hasEpisodeOfCare()) {
			e.setEncEpisodeOfCare(String.valueOf(encounter.getEpisodeOfCareFirstRep()));
		}
		/******************** encounteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier encounteridentifier = encounter.getIdentifierFirstRep();

		/******************** Enc_Id_Vl ********************************************************************************/
		if(encounteridentifier.hasValue()) {
			e.setEncIdVl(String.valueOf(encounteridentifier.getValue()));
		}
		/******************** encounteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounteridentifiertype = encounteridentifier.getType();

		/******************** encounteridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounteridentifiertypecoding = encounteridentifiertype.getCodingFirstRep();

		/******************** Enc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(encounteridentifiertypecoding.hasDisplay()) {
			e.setEncIdTypCdgDsply(String.valueOf(encounteridentifiertypecoding.getDisplay()));
		}
		/******************** Enc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(encounteridentifiertypecoding.hasVersion()) {
			e.setEncIdTypCdgVrsn(String.valueOf(encounteridentifiertypecoding.getVersion()));
		}
		/******************** Enc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(encounteridentifiertypecoding.hasCode()) {
			e.setEncIdTypCdgCd(String.valueOf(encounteridentifiertypecoding.getCode()));
		}
		/******************** Enc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(encounteridentifiertypecoding.hasSystem()) {
			e.setEncIdTypCdgSys(String.valueOf(encounteridentifiertypecoding.getSystem()));
		}
		/******************** Enc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(encounteridentifiertypecoding.hasUserSelected()) {
			e.setEncIdTypCdgUsrSltd(String.valueOf(encounteridentifiertypecoding.getUserSelected()));
		}
		/******************** Enc_Id_Typ_Txt ********************************************************************************/
		if(encounteridentifiertype.hasText()) {
			e.setEncIdTypTxt(String.valueOf(encounteridentifiertype.getText()));
		}
		/******************** Enc_Id_Sys ********************************************************************************/
		if(encounteridentifier.hasSystem()) {
			e.setEncIdSys(String.valueOf(encounteridentifier.getSystem()));
		}
		/******************** Enc_Id_Assigner ********************************************************************************/
		if(encounteridentifier.hasAssigner()) {
			e.setEncIdAssigner(String.valueOf(encounteridentifier.getAssigner()));
		}
		/******************** encounteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounteridentifierperiod = encounteridentifier.getPeriod();

		/******************** Enc_Id_Prd_End ********************************************************************************/
		if(encounteridentifierperiod.hasEnd()) {
			e.setEncIdPrdEnd(String.valueOf(encounteridentifierperiod.getEnd()));
		}
		/******************** Enc_Id_Prd_Strt ********************************************************************************/
		if(encounteridentifierperiod.hasStart()) {
			e.setEncIdPrdStrt(String.valueOf(encounteridentifierperiod.getStart()));
		}
		/******************** encounteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse encounteridentifieruse = encounteridentifier.getUse();
		e.setEncIdUse(encounteridentifieruse.toCode());

		return e;
	}
}
