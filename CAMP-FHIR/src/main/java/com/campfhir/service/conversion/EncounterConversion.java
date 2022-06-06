package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Encounter;
public class EncounterConversion 
{
	public org.hl7.fhir.r4.model.Encounter Encounters(Encounter e) throws ParseException
	{
		org.hl7.fhir.r4.model.Encounter encounter = new org.hl7.fhir.r4.model.Encounter();

		/******************** id ********************************************************************************/
		encounter.setId(e.getId());

		/******************** Enc_Account ********************************************************************************/
		if(e.getEncAccount() != null) {
			encounter.addAccount( new org.hl7.fhir.r4.model.Reference(e.getEncAccount()));
		}
		/******************** Enc_Appmnt ********************************************************************************/
		if(e.getEncAppmnt() != null) {
			encounter.addAppointment( new org.hl7.fhir.r4.model.Reference(e.getEncAppmnt()));
		}
		/******************** Enc_BasedOn ********************************************************************************/
		if(e.getEncBasedOn() != null) {
			encounter.addBasedOn( new org.hl7.fhir.r4.model.Reference(e.getEncBasedOn()));
		}
		/******************** encounterclasshistory ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent encounterclasshistory =  new org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent();
		encounter.addClassHistory(encounterclasshistory);

		/******************** encounterclasshistoryclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterclasshistoryclass =  new org.hl7.fhir.r4.model.Coding();
		encounterclasshistory.setClass_(encounterclasshistoryclass);

		/******************** Enc_ClsHis_Cls__Cd ********************************************************************************/
		if(e.getEncClsHisClsCd() != null) {
			encounterclasshistoryclass.setCode(e.getEncClsHisClsCd());
		}
		/******************** Enc_ClsHis_Cls__Dsply ********************************************************************************/
		if(e.getEncClsHisClsDsply() != null) {
			encounterclasshistoryclass.setDisplay(e.getEncClsHisClsDsply());
		}
		/******************** Enc_ClsHis_Cls__Sys ********************************************************************************/
		if(e.getEncClsHisClsSys() != null) {
			encounterclasshistoryclass.setSystem(e.getEncClsHisClsSys());
		}
		/******************** Enc_ClsHis_Cls__UsrSltd ********************************************************************************/
		if(e.getEncClsHisClsUsrSltd() != null) {
			encounterclasshistoryclass.setUserSelected(Boolean.parseBoolean(e.getEncClsHisClsUsrSltd()));
		}
		/******************** Enc_ClsHis_Cls__Vrsn ********************************************************************************/
		if(e.getEncClsHisClsVrsn() != null) {
			encounterclasshistoryclass.setVersion(e.getEncClsHisClsVrsn());
		}
		/******************** encounterclasshistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterclasshistoryperiod =  new org.hl7.fhir.r4.model.Period();
		encounterclasshistory.setPeriod(encounterclasshistoryperiod);

		/******************** Enc_ClsHis_Prd_End ********************************************************************************/
		if(e.getEncClsHisPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_ClsHis_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_ClsHis_Prd_Enddate = Enc_ClsHis_Prd_Endsdf.parse(e.getEncClsHisPrdEnd());
			encounterclasshistoryperiod.setEnd(Enc_ClsHis_Prd_Enddate);
		}
		/******************** Enc_ClsHis_Prd_Strt ********************************************************************************/
		if(e.getEncClsHisPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_ClsHis_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_ClsHis_Prd_Strtdate = Enc_ClsHis_Prd_Strtsdf.parse(e.getEncClsHisPrdStrt());
			encounterclasshistoryperiod.setStart(Enc_ClsHis_Prd_Strtdate);
		}
		/******************** encounterclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterclass =  new org.hl7.fhir.r4.model.Coding();
		encounter.setClass_(encounterclass);

		/******************** Enc_Cls__Cd ********************************************************************************/
		if(e.getEncClsCd() != null) {
			encounterclass.setCode(e.getEncClsCd());
		}
		/******************** Enc_Cls__Dsply ********************************************************************************/
		if(e.getEncClsDsply() != null) {
			encounterclass.setDisplay(e.getEncClsDsply());
		}
		/******************** Enc_Cls__Sys ********************************************************************************/
		if(e.getEncClsSys() != null) {
			encounterclass.setSystem(e.getEncClsSys());
		}
		/******************** Enc_Cls__UsrSltd ********************************************************************************/
		if(e.getEncClsUsrSltd() != null) {
			encounterclass.setUserSelected(Boolean.parseBoolean(e.getEncClsUsrSltd()));
		}
		/******************** Enc_Cls__Vrsn ********************************************************************************/
		if(e.getEncClsVrsn() != null) {
			encounterclass.setVersion(e.getEncClsVrsn());
		}
		/******************** encounterdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.DiagnosisComponent encounterdiagnosis =  new org.hl7.fhir.r4.model.Encounter.DiagnosisComponent();
		encounter.addDiagnosis(encounterdiagnosis);

		/******************** Enc_Dgnsis_Cndtn ********************************************************************************/
		if(e.getEncDgnsisCndtn() != null) {
			encounterdiagnosis.setCondition( new org.hl7.fhir.r4.model.Reference(e.getEncDgnsisCndtn()));
		}
		/******************** Enc_Dgnsis_Rnk ********************************************************************************/
		if(e.getEncDgnsisRnk() != null) {
			encounterdiagnosis.setRank(Integer.parseInt(e.getEncDgnsisRnk()));
		}
		/******************** encounterdiagnosisuse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterdiagnosisuse =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterdiagnosis.setUse(encounterdiagnosisuse);

		/******************** encounterdiagnosisusecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterdiagnosisusecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterdiagnosisuse.addCoding(encounterdiagnosisusecoding);

		/******************** Enc_Dgnsis_Use_Cdg_Cd ********************************************************************************/
		if(e.getEncDgnsisUseCdgCd() != null) {
			encounterdiagnosisusecoding.setCode(e.getEncDgnsisUseCdgCd());
		}
		/******************** Enc_Dgnsis_Use_Cdg_Dsply ********************************************************************************/
		if(e.getEncDgnsisUseCdgDsply() != null) {
			encounterdiagnosisusecoding.setDisplay(e.getEncDgnsisUseCdgDsply());
		}
		/******************** Enc_Dgnsis_Use_Cdg_Sys ********************************************************************************/
		if(e.getEncDgnsisUseCdgSys() != null) {
			encounterdiagnosisusecoding.setSystem(e.getEncDgnsisUseCdgSys());
		}
		/******************** Enc_Dgnsis_Use_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncDgnsisUseCdgUsrSltd() != null) {
			encounterdiagnosisusecoding.setUserSelected(Boolean.parseBoolean(e.getEncDgnsisUseCdgUsrSltd()));
		}
		/******************** Enc_Dgnsis_Use_Cdg_Vrsn ********************************************************************************/
		if(e.getEncDgnsisUseCdgVrsn() != null) {
			encounterdiagnosisusecoding.setVersion(e.getEncDgnsisUseCdgVrsn());
		}
		/******************** Enc_Dgnsis_Use_Txt ********************************************************************************/
		if(e.getEncDgnsisUseTxt() != null) {
			encounterdiagnosisuse.setText(e.getEncDgnsisUseTxt());
		}
		/******************** Enc_EpisodeOfCare ********************************************************************************/
		if(e.getEncEpisodeOfCare() != null) {
			encounter.addEpisodeOfCare( new org.hl7.fhir.r4.model.Reference(e.getEncEpisodeOfCare()));
		}
		/******************** encounterhospitalization ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent encounterhospitalization =  new org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent();
		encounter.setHospitalization(encounterhospitalization);

		/******************** encounterhospitalizationadmitsource ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationadmitsource =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalization.setAdmitSource(encounterhospitalizationadmitsource);

		/******************** encounterhospitalizationadmitsourcecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationadmitsourcecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationadmitsource.addCoding(encounterhospitalizationadmitsourcecoding);

		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgCd() != null) {
			encounterhospitalizationadmitsourcecoding.setCode(e.getEncHospitalizationAdmitSrcCdgCd());
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgDsply() != null) {
			encounterhospitalizationadmitsourcecoding.setDisplay(e.getEncHospitalizationAdmitSrcCdgDsply());
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgSys() != null) {
			encounterhospitalizationadmitsourcecoding.setSystem(e.getEncHospitalizationAdmitSrcCdgSys());
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgUsrSltd() != null) {
			encounterhospitalizationadmitsourcecoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationAdmitSrcCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgVrsn() != null) {
			encounterhospitalizationadmitsourcecoding.setVersion(e.getEncHospitalizationAdmitSrcCdgVrsn());
		}
		/******************** Enc_Hospitalization_AdmitSrc_Txt ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcTxt() != null) {
			encounterhospitalizationadmitsource.setText(e.getEncHospitalizationAdmitSrcTxt());
		}
		/******************** Enc_Hospitalization_Destination ********************************************************************************/
		if(e.getEncHospitalizationDestination() != null) {
			encounterhospitalization.setDestination( new org.hl7.fhir.r4.model.Reference(e.getEncHospitalizationDestination()));
		}
		/******************** encounterhospitalizationdietpreference ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationdietpreference =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalization.addDietPreference(encounterhospitalizationdietpreference);

		/******************** encounterhospitalizationdietpreferencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationdietpreferencecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationdietpreference.addCoding(encounterhospitalizationdietpreferencecoding);

		/******************** Enc_Hospitalization_DietPreference_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgCd() != null) {
			encounterhospitalizationdietpreferencecoding.setCode(e.getEncHospitalizationDietPreferenceCdgCd());
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgDsply() != null) {
			encounterhospitalizationdietpreferencecoding.setDisplay(e.getEncHospitalizationDietPreferenceCdgDsply());
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgSys() != null) {
			encounterhospitalizationdietpreferencecoding.setSystem(e.getEncHospitalizationDietPreferenceCdgSys());
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgUsrSltd() != null) {
			encounterhospitalizationdietpreferencecoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDietPreferenceCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgVrsn() != null) {
			encounterhospitalizationdietpreferencecoding.setVersion(e.getEncHospitalizationDietPreferenceCdgVrsn());
		}
		/******************** Enc_Hospitalization_DietPreference_Txt ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceTxt() != null) {
			encounterhospitalizationdietpreference.setText(e.getEncHospitalizationDietPreferenceTxt());
		}
		/******************** encounterhospitalizationdischargedisposition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationdischargedisposition =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalization.setDischargeDisposition(encounterhospitalizationdischargedisposition);

		/******************** encounterhospitalizationdischargedispositioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationdischargedispositioncoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationdischargedisposition.addCoding(encounterhospitalizationdischargedispositioncoding);

		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgCd() != null) {
			encounterhospitalizationdischargedispositioncoding.setCode(e.getEncHospitalizationDischargeDispositionCdgCd());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgDsply() != null) {
			encounterhospitalizationdischargedispositioncoding.setDisplay(e.getEncHospitalizationDischargeDispositionCdgDsply());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgSys() != null) {
			encounterhospitalizationdischargedispositioncoding.setSystem(e.getEncHospitalizationDischargeDispositionCdgSys());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgUsrSltd() != null) {
			encounterhospitalizationdischargedispositioncoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDischargeDispositionCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgVrsn() != null) {
			encounterhospitalizationdischargedispositioncoding.setVersion(e.getEncHospitalizationDischargeDispositionCdgVrsn());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Txt ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionTxt() != null) {
			encounterhospitalizationdischargedisposition.setText(e.getEncHospitalizationDischargeDispositionTxt());
		}
		/******************** Enc_Hospitalization_Origin ********************************************************************************/
		if(e.getEncHospitalizationOrigin() != null) {
			encounterhospitalization.setOrigin( new org.hl7.fhir.r4.model.Reference(e.getEncHospitalizationOrigin()));
		}
		/******************** encounterhospitalizationpreadmissionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier encounterhospitalizationpreadmissionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		encounterhospitalization.setPreAdmissionIdentifier(encounterhospitalizationpreadmissionidentifier);

		/******************** Enc_Hospitalization_PreAdmissionId_Assigner ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdAssigner() != null) {
			encounterhospitalizationpreadmissionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEncHospitalizationPreAdmissionIdAssigner()));
		}
		/******************** encounterhospitalizationpreadmissionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterhospitalizationpreadmissionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		encounterhospitalizationpreadmissionidentifier.setPeriod(encounterhospitalizationpreadmissionidentifierperiod);

		/******************** Enc_Hospitalization_PreAdmissionId_Prd_End ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_Hospitalization_PreAdmissionId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Hospitalization_PreAdmissionId_Prd_Enddate = Enc_Hospitalization_PreAdmissionId_Prd_Endsdf.parse(e.getEncHospitalizationPreAdmissionIdPrdEnd());
			encounterhospitalizationpreadmissionidentifierperiod.setEnd(Enc_Hospitalization_PreAdmissionId_Prd_Enddate);
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Prd_Strt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_Hospitalization_PreAdmissionId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Hospitalization_PreAdmissionId_Prd_Strtdate = Enc_Hospitalization_PreAdmissionId_Prd_Strtsdf.parse(e.getEncHospitalizationPreAdmissionIdPrdStrt());
			encounterhospitalizationpreadmissionidentifierperiod.setStart(Enc_Hospitalization_PreAdmissionId_Prd_Strtdate);
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Sys ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdSys() != null) {
			encounterhospitalizationpreadmissionidentifier.setSystem(e.getEncHospitalizationPreAdmissionIdSys());
		}
		/******************** encounterhospitalizationpreadmissionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationpreadmissionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalizationpreadmissionidentifier.setType(encounterhospitalizationpreadmissionidentifiertype);

		/******************** encounterhospitalizationpreadmissionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationpreadmissionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationpreadmissionidentifiertype.addCoding(encounterhospitalizationpreadmissionidentifiertypecoding);

		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgCd() != null) {
			encounterhospitalizationpreadmissionidentifiertypecoding.setCode(e.getEncHospitalizationPreAdmissionIdTypCdgCd());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgDsply() != null) {
			encounterhospitalizationpreadmissionidentifiertypecoding.setDisplay(e.getEncHospitalizationPreAdmissionIdTypCdgDsply());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgSys() != null) {
			encounterhospitalizationpreadmissionidentifiertypecoding.setSystem(e.getEncHospitalizationPreAdmissionIdTypCdgSys());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgUsrSltd() != null) {
			encounterhospitalizationpreadmissionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationPreAdmissionIdTypCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgVrsn() != null) {
			encounterhospitalizationpreadmissionidentifiertypecoding.setVersion(e.getEncHospitalizationPreAdmissionIdTypCdgVrsn());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Txt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypTxt() != null) {
			encounterhospitalizationpreadmissionidentifiertype.setText(e.getEncHospitalizationPreAdmissionIdTypTxt());
		}
		/******************** encounterhospitalizationpreadmissionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encounterhospitalizationpreadmissionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		encounterhospitalizationpreadmissionidentifier.setUse(encounterhospitalizationpreadmissionidentifieruse.fromCode(e.getEncHospitalizationPreAdmissionIdUse()));

		/******************** Enc_Hospitalization_PreAdmissionId_Vl ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdVl() != null) {
			encounterhospitalizationpreadmissionidentifier.setValue(e.getEncHospitalizationPreAdmissionIdVl());
		}
		/******************** encounterhospitalizationreadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationreadmission =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalization.setReAdmission(encounterhospitalizationreadmission);

		/******************** encounterhospitalizationreadmissioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationreadmissioncoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationreadmission.addCoding(encounterhospitalizationreadmissioncoding);

		/******************** Enc_Hospitalization_ReAdmission_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgCd() != null) {
			encounterhospitalizationreadmissioncoding.setCode(e.getEncHospitalizationReAdmissionCdgCd());
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgDsply() != null) {
			encounterhospitalizationreadmissioncoding.setDisplay(e.getEncHospitalizationReAdmissionCdgDsply());
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgSys() != null) {
			encounterhospitalizationreadmissioncoding.setSystem(e.getEncHospitalizationReAdmissionCdgSys());
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgUsrSltd() != null) {
			encounterhospitalizationreadmissioncoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationReAdmissionCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgVrsn() != null) {
			encounterhospitalizationreadmissioncoding.setVersion(e.getEncHospitalizationReAdmissionCdgVrsn());
		}
		/******************** Enc_Hospitalization_ReAdmission_Txt ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionTxt() != null) {
			encounterhospitalizationreadmission.setText(e.getEncHospitalizationReAdmissionTxt());
		}
		/******************** encounterhospitalizationspecialarrangement ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationspecialarrangement =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalization.addSpecialArrangement(encounterhospitalizationspecialarrangement);

		/******************** encounterhospitalizationspecialarrangementcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationspecialarrangementcoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationspecialarrangement.addCoding(encounterhospitalizationspecialarrangementcoding);

		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgCd() != null) {
			encounterhospitalizationspecialarrangementcoding.setCode(e.getEncHospitalizationSpclArrangementCdgCd());
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgDsply() != null) {
			encounterhospitalizationspecialarrangementcoding.setDisplay(e.getEncHospitalizationSpclArrangementCdgDsply());
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgSys() != null) {
			encounterhospitalizationspecialarrangementcoding.setSystem(e.getEncHospitalizationSpclArrangementCdgSys());
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgUsrSltd() != null) {
			encounterhospitalizationspecialarrangementcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpclArrangementCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgVrsn() != null) {
			encounterhospitalizationspecialarrangementcoding.setVersion(e.getEncHospitalizationSpclArrangementCdgVrsn());
		}
		/******************** Enc_Hospitalization_SpclArrangement_Txt ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementTxt() != null) {
			encounterhospitalizationspecialarrangement.setText(e.getEncHospitalizationSpclArrangementTxt());
		}
		/******************** encounterhospitalizationspecialcourtesy ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterhospitalizationspecialcourtesy =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterhospitalization.addSpecialCourtesy(encounterhospitalizationspecialcourtesy);

		/******************** encounterhospitalizationspecialcourtesycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterhospitalizationspecialcourtesycoding =  new org.hl7.fhir.r4.model.Coding();
		encounterhospitalizationspecialcourtesy.addCoding(encounterhospitalizationspecialcourtesycoding);

		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgCd() != null) {
			encounterhospitalizationspecialcourtesycoding.setCode(e.getEncHospitalizationSpclCourtesyCdgCd());
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgDsply() != null) {
			encounterhospitalizationspecialcourtesycoding.setDisplay(e.getEncHospitalizationSpclCourtesyCdgDsply());
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgSys() != null) {
			encounterhospitalizationspecialcourtesycoding.setSystem(e.getEncHospitalizationSpclCourtesyCdgSys());
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgUsrSltd() != null) {
			encounterhospitalizationspecialcourtesycoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpclCourtesyCdgUsrSltd()));
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgVrsn() != null) {
			encounterhospitalizationspecialcourtesycoding.setVersion(e.getEncHospitalizationSpclCourtesyCdgVrsn());
		}
		/******************** Enc_Hospitalization_SpclCourtesy_Txt ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyTxt() != null) {
			encounterhospitalizationspecialcourtesy.setText(e.getEncHospitalizationSpclCourtesyTxt());
		}
		/******************** encounteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier encounteridentifier =  new org.hl7.fhir.r4.model.Identifier();
		encounter.addIdentifier(encounteridentifier);

		/******************** Enc_Id_Assigner ********************************************************************************/
		if(e.getEncIdAssigner() != null) {
			encounteridentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEncIdAssigner()));
		}
		/******************** encounteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounteridentifierperiod =  new org.hl7.fhir.r4.model.Period();
		encounteridentifier.setPeriod(encounteridentifierperiod);

		/******************** Enc_Id_Prd_End ********************************************************************************/
		if(e.getEncIdPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Id_Prd_Enddate = Enc_Id_Prd_Endsdf.parse(e.getEncIdPrdEnd());
			encounteridentifierperiod.setEnd(Enc_Id_Prd_Enddate);
		}
		/******************** Enc_Id_Prd_Strt ********************************************************************************/
		if(e.getEncIdPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Id_Prd_Strtdate = Enc_Id_Prd_Strtsdf.parse(e.getEncIdPrdStrt());
			encounteridentifierperiod.setStart(Enc_Id_Prd_Strtdate);
		}
		/******************** Enc_Id_Sys ********************************************************************************/
		if(e.getEncIdSys() != null) {
			encounteridentifier.setSystem(e.getEncIdSys());
		}
		/******************** encounteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounteridentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounteridentifier.setType(encounteridentifiertype);

		/******************** encounteridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounteridentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		encounteridentifiertype.addCoding(encounteridentifiertypecoding);

		/******************** Enc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncIdTypCdgCd() != null) {
			encounteridentifiertypecoding.setCode(e.getEncIdTypCdgCd());
		}
		/******************** Enc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncIdTypCdgDsply() != null) {
			encounteridentifiertypecoding.setDisplay(e.getEncIdTypCdgDsply());
		}
		/******************** Enc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncIdTypCdgSys() != null) {
			encounteridentifiertypecoding.setSystem(e.getEncIdTypCdgSys());
		}
		/******************** Enc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncIdTypCdgUsrSltd() != null) {
			encounteridentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEncIdTypCdgUsrSltd()));
		}
		/******************** Enc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncIdTypCdgVrsn() != null) {
			encounteridentifiertypecoding.setVersion(e.getEncIdTypCdgVrsn());
		}
		/******************** Enc_Id_Typ_Txt ********************************************************************************/
		if(e.getEncIdTypTxt() != null) {
			encounteridentifiertype.setText(e.getEncIdTypTxt());
		}
		/******************** encounteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encounteridentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		encounteridentifier.setUse(encounteridentifieruse.fromCode(e.getEncIdUse()));

		/******************** Enc_Id_Vl ********************************************************************************/
		if(e.getEncIdVl() != null) {
			encounteridentifier.setValue(e.getEncIdVl());
		}
		/******************** encounterlength ********************************************************************************/
		org.hl7.fhir.r4.model.Duration encounterlength =  new org.hl7.fhir.r4.model.Duration();
		encounter.setLength(encounterlength);

		/******************** encounterlocation ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent encounterlocation =  new org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent();
		encounter.addLocation(encounterlocation);

		/******************** Enc_Lctn_Lctn ********************************************************************************/
		if(e.getEncLctnLctn() != null) {
			encounterlocation.setLocation( new org.hl7.fhir.r4.model.Reference(e.getEncLctnLctn()));
		}
		/******************** encounterlocationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterlocationperiod =  new org.hl7.fhir.r4.model.Period();
		encounterlocation.setPeriod(encounterlocationperiod);

		/******************** Enc_Lctn_Prd_End ********************************************************************************/
		if(e.getEncLctnPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_Lctn_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Lctn_Prd_Enddate = Enc_Lctn_Prd_Endsdf.parse(e.getEncLctnPrdEnd());
			encounterlocationperiod.setEnd(Enc_Lctn_Prd_Enddate);
		}
		/******************** Enc_Lctn_Prd_Strt ********************************************************************************/
		if(e.getEncLctnPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_Lctn_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Lctn_Prd_Strtdate = Enc_Lctn_Prd_Strtsdf.parse(e.getEncLctnPrdStrt());
			encounterlocationperiod.setStart(Enc_Lctn_Prd_Strtdate);
		}
		/******************** encounterlocationphysicaltype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterlocationphysicaltype =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterlocation.setPhysicalType(encounterlocationphysicaltype);

		/******************** encounterlocationphysicaltypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterlocationphysicaltypecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterlocationphysicaltype.addCoding(encounterlocationphysicaltypecoding);

		/******************** Enc_Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgCd() != null) {
			encounterlocationphysicaltypecoding.setCode(e.getEncLctnPhysclTypCdgCd());
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgDsply() != null) {
			encounterlocationphysicaltypecoding.setDisplay(e.getEncLctnPhysclTypCdgDsply());
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgSys() != null) {
			encounterlocationphysicaltypecoding.setSystem(e.getEncLctnPhysclTypCdgSys());
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgUsrSltd() != null) {
			encounterlocationphysicaltypecoding.setUserSelected(Boolean.parseBoolean(e.getEncLctnPhysclTypCdgUsrSltd()));
		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgVrsn() != null) {
			encounterlocationphysicaltypecoding.setVersion(e.getEncLctnPhysclTypCdgVrsn());
		}
		/******************** Enc_Lctn_PhysclTyp_Txt ********************************************************************************/
		if(e.getEncLctnPhysclTypTxt() != null) {
			encounterlocationphysicaltype.setText(e.getEncLctnPhysclTypTxt());
		}
		/******************** encounterlocationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory encounterlocationstatus =  new org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory();
		encounterlocation.setStatus(encounterlocationstatus.fromCode(e.getEncLctnSts()));

		/******************** Enc_PartOf ********************************************************************************/
		if(e.getEncPartOf() != null) {
			encounter.setPartOf( new org.hl7.fhir.r4.model.Reference(e.getEncPartOf()));
		}
		/******************** encounterparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent encounterparticipant =  new org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent();
		encounter.addParticipant(encounterparticipant);

		/******************** Enc_Prtcpnt_Individual ********************************************************************************/
		if(e.getEncPrtcpntIndividual() != null) {
			encounterparticipant.setIndividual( new org.hl7.fhir.r4.model.Reference(e.getEncPrtcpntIndividual()));
		}
		/******************** encounterparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterparticipantperiod =  new org.hl7.fhir.r4.model.Period();
		encounterparticipant.setPeriod(encounterparticipantperiod);

		/******************** Enc_Prtcpnt_Prd_End ********************************************************************************/
		if(e.getEncPrtcpntPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_Prtcpnt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Prtcpnt_Prd_Enddate = Enc_Prtcpnt_Prd_Endsdf.parse(e.getEncPrtcpntPrdEnd());
			encounterparticipantperiod.setEnd(Enc_Prtcpnt_Prd_Enddate);
		}
		/******************** Enc_Prtcpnt_Prd_Strt ********************************************************************************/
		if(e.getEncPrtcpntPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_Prtcpnt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Prtcpnt_Prd_Strtdate = Enc_Prtcpnt_Prd_Strtsdf.parse(e.getEncPrtcpntPrdStrt());
			encounterparticipantperiod.setStart(Enc_Prtcpnt_Prd_Strtdate);
		}
		/******************** encounterparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterparticipanttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounterparticipant.addType(encounterparticipanttype);

		/******************** encounterparticipanttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterparticipanttypecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterparticipanttype.addCoding(encounterparticipanttypecoding);

		/******************** Enc_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncPrtcpntTypCdgCd() != null) {
			encounterparticipanttypecoding.setCode(e.getEncPrtcpntTypCdgCd());
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncPrtcpntTypCdgDsply() != null) {
			encounterparticipanttypecoding.setDisplay(e.getEncPrtcpntTypCdgDsply());
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncPrtcpntTypCdgSys() != null) {
			encounterparticipanttypecoding.setSystem(e.getEncPrtcpntTypCdgSys());
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncPrtcpntTypCdgUsrSltd() != null) {
			encounterparticipanttypecoding.setUserSelected(Boolean.parseBoolean(e.getEncPrtcpntTypCdgUsrSltd()));
		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncPrtcpntTypCdgVrsn() != null) {
			encounterparticipanttypecoding.setVersion(e.getEncPrtcpntTypCdgVrsn());
		}
		/******************** Enc_Prtcpnt_Typ_Txt ********************************************************************************/
		if(e.getEncPrtcpntTypTxt() != null) {
			encounterparticipanttype.setText(e.getEncPrtcpntTypTxt());
		}
		/******************** encounterperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterperiod =  new org.hl7.fhir.r4.model.Period();
		encounter.setPeriod(encounterperiod);

		/******************** Enc_Prd_End ********************************************************************************/
		if(e.getEncPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Prd_Enddate = Enc_Prd_Endsdf.parse(e.getEncPrdEnd());
			encounterperiod.setEnd(Enc_Prd_Enddate);
		}
		/******************** Enc_Prd_Strt ********************************************************************************/
		if(e.getEncPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_Prd_Strtdate = Enc_Prd_Strtsdf.parse(e.getEncPrdStrt());
			encounterperiod.setStart(Enc_Prd_Strtdate);
		}
		/******************** encounterpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterpriority =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setPriority(encounterpriority);

		/******************** encounterprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterprioritycoding =  new org.hl7.fhir.r4.model.Coding();
		encounterpriority.addCoding(encounterprioritycoding);

		/******************** Enc_Priority_Cdg_Cd ********************************************************************************/
		if(e.getEncPriorityCdgCd() != null) {
			encounterprioritycoding.setCode(e.getEncPriorityCdgCd());
		}
		/******************** Enc_Priority_Cdg_Dsply ********************************************************************************/
		if(e.getEncPriorityCdgDsply() != null) {
			encounterprioritycoding.setDisplay(e.getEncPriorityCdgDsply());
		}
		/******************** Enc_Priority_Cdg_Sys ********************************************************************************/
		if(e.getEncPriorityCdgSys() != null) {
			encounterprioritycoding.setSystem(e.getEncPriorityCdgSys());
		}
		/******************** Enc_Priority_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncPriorityCdgUsrSltd() != null) {
			encounterprioritycoding.setUserSelected(Boolean.parseBoolean(e.getEncPriorityCdgUsrSltd()));
		}
		/******************** Enc_Priority_Cdg_Vrsn ********************************************************************************/
		if(e.getEncPriorityCdgVrsn() != null) {
			encounterprioritycoding.setVersion(e.getEncPriorityCdgVrsn());
		}
		/******************** Enc_Priority_Txt ********************************************************************************/
		if(e.getEncPriorityTxt() != null) {
			encounterpriority.setText(e.getEncPriorityTxt());
		}
		/******************** encounterreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.addReasonCode(encounterreasoncode);

		/******************** encounterreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterreasoncode.addCoding(encounterreasoncodecoding);

		/******************** Enc_RsnCd_Cdg_Cd ********************************************************************************/
		if(e.getEncRsnCdCdgCd() != null) {
			encounterreasoncodecoding.setCode(e.getEncRsnCdCdgCd());
		}
		/******************** Enc_RsnCd_Cdg_Dsply ********************************************************************************/
		if(e.getEncRsnCdCdgDsply() != null) {
			encounterreasoncodecoding.setDisplay(e.getEncRsnCdCdgDsply());
		}
		/******************** Enc_RsnCd_Cdg_Sys ********************************************************************************/
		if(e.getEncRsnCdCdgSys() != null) {
			encounterreasoncodecoding.setSystem(e.getEncRsnCdCdgSys());
		}
		/******************** Enc_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncRsnCdCdgUsrSltd() != null) {
			encounterreasoncodecoding.setUserSelected(Boolean.parseBoolean(e.getEncRsnCdCdgUsrSltd()));
		}
		/******************** Enc_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(e.getEncRsnCdCdgVrsn() != null) {
			encounterreasoncodecoding.setVersion(e.getEncRsnCdCdgVrsn());
		}
		/******************** Enc_RsnCd_Txt ********************************************************************************/
		if(e.getEncRsnCdTxt() != null) {
			encounterreasoncode.setText(e.getEncRsnCdTxt());
		}
		/******************** Enc_RsnRfrnc ********************************************************************************/
		if(e.getEncRsnRfrnc() != null) {
			encounter.addReasonReference( new org.hl7.fhir.r4.model.Reference(e.getEncRsnRfrnc()));
		}
		/******************** Enc_SrvProvider ********************************************************************************/
		if(e.getEncSrvProvider() != null) {
			encounter.setServiceProvider( new org.hl7.fhir.r4.model.Reference(e.getEncSrvProvider()));
		}
		/******************** encounterservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encounterservicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setServiceType(encounterservicetype);

		/******************** encounterservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encounterservicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		encounterservicetype.addCoding(encounterservicetypecoding);

		/******************** Enc_SrvTyp_Cdg_Cd ********************************************************************************/
		if(e.getEncSrvTypCdgCd() != null) {
			encounterservicetypecoding.setCode(e.getEncSrvTypCdgCd());
		}
		/******************** Enc_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEncSrvTypCdgDsply() != null) {
			encounterservicetypecoding.setDisplay(e.getEncSrvTypCdgDsply());
		}
		/******************** Enc_SrvTyp_Cdg_Sys ********************************************************************************/
		if(e.getEncSrvTypCdgSys() != null) {
			encounterservicetypecoding.setSystem(e.getEncSrvTypCdgSys());
		}
		/******************** Enc_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncSrvTypCdgUsrSltd() != null) {
			encounterservicetypecoding.setUserSelected(Boolean.parseBoolean(e.getEncSrvTypCdgUsrSltd()));
		}
		/******************** Enc_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEncSrvTypCdgVrsn() != null) {
			encounterservicetypecoding.setVersion(e.getEncSrvTypCdgVrsn());
		}
		/******************** Enc_SrvTyp_Txt ********************************************************************************/
		if(e.getEncSrvTypTxt() != null) {
			encounterservicetype.setText(e.getEncSrvTypTxt());
		}
		/******************** encounterstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encounterstatus =  new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();
		encounter.setStatus(encounterstatus.fromCode(e.getEncSts()));

		/******************** encounterstatushistory ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent encounterstatushistory =  new org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent();
		encounter.addStatusHistory(encounterstatushistory);

		/******************** encounterstatushistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period encounterstatushistoryperiod =  new org.hl7.fhir.r4.model.Period();
		encounterstatushistory.setPeriod(encounterstatushistoryperiod);

		/******************** Enc_StsHis_Prd_End ********************************************************************************/
		if(e.getEncStsHisPrdEnd() != null) {
			java.text.SimpleDateFormat Enc_StsHis_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_StsHis_Prd_Enddate = Enc_StsHis_Prd_Endsdf.parse(e.getEncStsHisPrdEnd());
			encounterstatushistoryperiod.setEnd(Enc_StsHis_Prd_Enddate);
		}
		/******************** Enc_StsHis_Prd_Strt ********************************************************************************/
		if(e.getEncStsHisPrdStrt() != null) {
			java.text.SimpleDateFormat Enc_StsHis_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Enc_StsHis_Prd_Strtdate = Enc_StsHis_Prd_Strtsdf.parse(e.getEncStsHisPrdStrt());
			encounterstatushistoryperiod.setStart(Enc_StsHis_Prd_Strtdate);
		}
		/******************** encounterstatushistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encounterstatushistorystatus =  new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();
		encounterstatushistory.setStatus(encounterstatushistorystatus.fromCode(e.getEncStsHisSts()));

		/******************** Enc_Sbjct ********************************************************************************/
		if(e.getEncSbjct() != null) {
			encounter.setSubject( new org.hl7.fhir.r4.model.Reference(e.getEncSbjct()));
		}
		/******************** encountertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept encountertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.addType(encountertype);

		/******************** encountertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding encountertypecoding =  new org.hl7.fhir.r4.model.Coding();
		encountertype.addCoding(encountertypecoding);

		/******************** Enc_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncTypCdgCd() != null) {
			encountertypecoding.setCode(e.getEncTypCdgCd());
		}
		/******************** Enc_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncTypCdgDsply() != null) {
			encountertypecoding.setDisplay(e.getEncTypCdgDsply());
		}
		/******************** Enc_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncTypCdgSys() != null) {
			encountertypecoding.setSystem(e.getEncTypCdgSys());
		}
		/******************** Enc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncTypCdgUsrSltd() != null) {
			encountertypecoding.setUserSelected(Boolean.parseBoolean(e.getEncTypCdgUsrSltd()));
		}
		/******************** Enc_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncTypCdgVrsn() != null) {
			encountertypecoding.setVersion(e.getEncTypCdgVrsn());
		}
		/******************** Enc_Typ_Txt ********************************************************************************/
		if(e.getEncTypTxt() != null) {
			encountertype.setText(e.getEncTypTxt());
		}
		return encounter;
	}
}
