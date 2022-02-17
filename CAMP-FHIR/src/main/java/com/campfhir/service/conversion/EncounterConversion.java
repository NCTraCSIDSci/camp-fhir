package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Encounter;
public class EncounterConversion 
{
	public org.hl7.fhir.r4.model.Encounter Encounters(Encounter e) throws ParseException
	{
		org.hl7.fhir.r4.model.Encounter encounter = new org.hl7.fhir.r4.model.Encounter();
		/******************** Encounter_Account ********************************************************************************/
		if(e.getEncounterAccount() != null) {
			org.hl7.fhir.r4.model.Reference EncounterAccountref = new org.hl7.fhir.r4.model.Reference();
			encounter.addAccount(EncounterAccountref.setReference(e.getEncounterAccount()));
		}
		/******************** Encounter_Appointment ********************************************************************************/
		if(e.getEncounterAppointment() != null) {
			org.hl7.fhir.r4.model.Reference EncounterAppointmentref = new org.hl7.fhir.r4.model.Reference();
			encounter.addAppointment(EncounterAppointmentref.setReference(e.getEncounterAppointment()));
		}
		/******************** Encounter_BasedOn ********************************************************************************/
		if(e.getEncounterBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference EncounterBasedOnref = new org.hl7.fhir.r4.model.Reference();
			encounter.addBasedOn(EncounterBasedOnref.setReference(e.getEncounterBasedOn()));
		}

		org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent encounteraddclasshistory = encounter.addClassHistory();


		org.hl7.fhir.r4.model.Coding encounteraddclasshistorysetclass_ = new org.hl7.fhir.r4.model.Coding();
		encounteraddclasshistory.setClass_(encounteraddclasshistorysetclass_);

		/******************** Encounter_ClassHistory_Class__Code ********************************************************************************/
		if(e.getEncounterClassHistoryClassCode() != null) {
			encounteraddclasshistorysetclass_.setCode(e.getEncounterClassHistoryClassCode());
		}
		/******************** Encounter_ClassHistory_Class__Display ********************************************************************************/
		if(e.getEncounterClassHistoryClassDisplay() != null) {
			encounteraddclasshistorysetclass_.setDisplay(e.getEncounterClassHistoryClassDisplay());
		}
		/******************** Encounter_ClassHistory_Class__System ********************************************************************************/
		if(e.getEncounterClassHistoryClassSystem() != null) {
			encounteraddclasshistorysetclass_.setSystem(e.getEncounterClassHistoryClassSystem());
		}
		/******************** Encounter_ClassHistory_Class__UserSelected ********************************************************************************/
		if(e.getEncounterClassHistoryClassUserSelected() != null) {
			encounteraddclasshistorysetclass_.setUserSelected(Boolean.parseBoolean(e.getEncounterClassHistoryClassUserSelected()));
		}
		/******************** Encounter_ClassHistory_Class__Version ********************************************************************************/
		if(e.getEncounterClassHistoryClassVersion() != null) {
			encounteraddclasshistorysetclass_.setVersion(e.getEncounterClassHistoryClassVersion());
		}

		org.hl7.fhir.r4.model.Period encounteraddclasshistorysetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddclasshistory.setPeriod(encounteraddclasshistorysetperiod);

		/******************** Encounter_ClassHistory_Period_End ********************************************************************************/
		if(e.getEncounterClassHistoryPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterClassHistoryPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterClassHistoryPeriodEnddate = EncounterClassHistoryPeriodEndsdf.parse(e.getEncounterClassHistoryPeriodEnd());
			encounteraddclasshistorysetperiod.setEnd(EncounterClassHistoryPeriodEnddate);
		}
		/******************** Encounter_ClassHistory_Period_Start ********************************************************************************/
		if(e.getEncounterClassHistoryPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterClassHistoryPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterClassHistoryPeriodStartdate = EncounterClassHistoryPeriodStartsdf.parse(e.getEncounterClassHistoryPeriodStart());
			encounteraddclasshistorysetperiod.setStart(EncounterClassHistoryPeriodStartdate);
		}

		org.hl7.fhir.r4.model.Coding encountersetclass_ = new org.hl7.fhir.r4.model.Coding();
		encounter.setClass_(encountersetclass_);

		/******************** Encounter_Class__Code ********************************************************************************/
		if(e.getEncounterClassCode() != null) {
			encountersetclass_.setCode(e.getEncounterClassCode());
		}
		/******************** Encounter_Class__Display ********************************************************************************/
		if(e.getEncounterClassDisplay() != null) {
			encountersetclass_.setDisplay(e.getEncounterClassDisplay());
		}
		/******************** Encounter_Class__System ********************************************************************************/
		if(e.getEncounterClassSystem() != null) {
			encountersetclass_.setSystem(e.getEncounterClassSystem());
		}
		/******************** Encounter_Class__UserSelected ********************************************************************************/
		if(e.getEncounterClassUserSelected() != null) {
			encountersetclass_.setUserSelected(Boolean.parseBoolean(e.getEncounterClassUserSelected()));
		}
		/******************** Encounter_Class__Version ********************************************************************************/
		if(e.getEncounterClassVersion() != null) {
			encountersetclass_.setVersion(e.getEncounterClassVersion());
		}

		org.hl7.fhir.r4.model.Encounter.DiagnosisComponent encounteradddiagnosis = encounter.addDiagnosis();

		/******************** Encounter_Diagnosis_Condition ********************************************************************************/
		if(e.getEncounterDiagnosisCondition() != null) {
			org.hl7.fhir.r4.model.Reference EncounterDiagnosisConditionref = new org.hl7.fhir.r4.model.Reference();
			encounteradddiagnosis.setCondition(EncounterDiagnosisConditionref.setReference(e.getEncounterDiagnosisCondition()));
		}
		/******************** Encounter_Diagnosis_Rank ********************************************************************************/
		if(e.getEncounterDiagnosisRank() != null) {
			encounteradddiagnosis.setRank(Integer.parseInt(e.getEncounterDiagnosisRank()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteradddiagnosissetuse = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteradddiagnosis.setUse(encounteradddiagnosissetuse);


		org.hl7.fhir.r4.model.Coding encounteradddiagnosissetuseaddcoding = encounteradddiagnosissetuse.addCoding();

		/******************** Encounter_Diagnosis_Use_Coding_Code ********************************************************************************/
		if(e.getEncounterDiagnosisUseCodingCode() != null) {
			encounteradddiagnosissetuseaddcoding.setCode(e.getEncounterDiagnosisUseCodingCode());
		}
		/******************** Encounter_Diagnosis_Use_Coding_Display ********************************************************************************/
		if(e.getEncounterDiagnosisUseCodingDisplay() != null) {
			encounteradddiagnosissetuseaddcoding.setDisplay(e.getEncounterDiagnosisUseCodingDisplay());
		}
		/******************** Encounter_Diagnosis_Use_Coding_System ********************************************************************************/
		if(e.getEncounterDiagnosisUseCodingSystem() != null) {
			encounteradddiagnosissetuseaddcoding.setSystem(e.getEncounterDiagnosisUseCodingSystem());
		}
		/******************** Encounter_Diagnosis_Use_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterDiagnosisUseCodingUserSelected() != null) {
			encounteradddiagnosissetuseaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterDiagnosisUseCodingUserSelected()));
		}
		/******************** Encounter_Diagnosis_Use_Coding_Version ********************************************************************************/
		if(e.getEncounterDiagnosisUseCodingVersion() != null) {
			encounteradddiagnosissetuseaddcoding.setVersion(e.getEncounterDiagnosisUseCodingVersion());
		}
		/******************** Encounter_Diagnosis_Use_Text ********************************************************************************/
		if(e.getEncounterDiagnosisUseText() != null) {
			encounteradddiagnosissetuse.setText(e.getEncounterDiagnosisUseText());
		}
		/******************** Encounter_EpisodeOfCare ********************************************************************************/
		if(e.getEncounterEpisodeOfCare() != null) {
			org.hl7.fhir.r4.model.Reference EncounterEpisodeOfCareref = new org.hl7.fhir.r4.model.Reference();
			encounter.addEpisodeOfCare(EncounterEpisodeOfCareref.setReference(e.getEncounterEpisodeOfCare()));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent encountersethospitalization = new org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent();
		encounter.setHospitalization(encountersethospitalization);


		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetadmitsource = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setAdmitSource(encountersethospitalizationsetadmitsource);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetadmitsourceaddcoding = encountersethospitalizationsetadmitsource.addCoding();

		/******************** Encounter_Hospitalization_AdmitSource_Coding_Code ********************************************************************************/
		if(e.getEncounterHospitalizationAdmitSourceCodingCode() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setCode(e.getEncounterHospitalizationAdmitSourceCodingCode());
		}
		/******************** Encounter_Hospitalization_AdmitSource_Coding_Display ********************************************************************************/
		if(e.getEncounterHospitalizationAdmitSourceCodingDisplay() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setDisplay(e.getEncounterHospitalizationAdmitSourceCodingDisplay());
		}
		/******************** Encounter_Hospitalization_AdmitSource_Coding_System ********************************************************************************/
		if(e.getEncounterHospitalizationAdmitSourceCodingSystem() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setSystem(e.getEncounterHospitalizationAdmitSourceCodingSystem());
		}
		/******************** Encounter_Hospitalization_AdmitSource_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterHospitalizationAdmitSourceCodingUserSelected() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterHospitalizationAdmitSourceCodingUserSelected()));
		}
		/******************** Encounter_Hospitalization_AdmitSource_Coding_Version ********************************************************************************/
		if(e.getEncounterHospitalizationAdmitSourceCodingVersion() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setVersion(e.getEncounterHospitalizationAdmitSourceCodingVersion());
		}
		/******************** Encounter_Hospitalization_AdmitSource_Text ********************************************************************************/
		if(e.getEncounterHospitalizationAdmitSourceText() != null) {
			encountersethospitalizationsetadmitsource.setText(e.getEncounterHospitalizationAdmitSourceText());
		}
		/******************** Encounter_Hospitalization_Destination ********************************************************************************/
		if(e.getEncounterHospitalizationDestination() != null) {
			org.hl7.fhir.r4.model.Reference EncounterHospitalizationDestinationref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalization.setDestination(EncounterHospitalizationDestinationref.setReference(e.getEncounterHospitalizationDestination()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationadddietpreference = encountersethospitalization.addDietPreference();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationadddietpreferenceaddcoding = encountersethospitalizationadddietpreference.addCoding();

		/******************** Encounter_Hospitalization_DietPreference_Coding_Code ********************************************************************************/
		if(e.getEncounterHospitalizationDietPreferenceCodingCode() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setCode(e.getEncounterHospitalizationDietPreferenceCodingCode());
		}
		/******************** Encounter_Hospitalization_DietPreference_Coding_Display ********************************************************************************/
		if(e.getEncounterHospitalizationDietPreferenceCodingDisplay() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setDisplay(e.getEncounterHospitalizationDietPreferenceCodingDisplay());
		}
		/******************** Encounter_Hospitalization_DietPreference_Coding_System ********************************************************************************/
		if(e.getEncounterHospitalizationDietPreferenceCodingSystem() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setSystem(e.getEncounterHospitalizationDietPreferenceCodingSystem());
		}
		/******************** Encounter_Hospitalization_DietPreference_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterHospitalizationDietPreferenceCodingUserSelected() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterHospitalizationDietPreferenceCodingUserSelected()));
		}
		/******************** Encounter_Hospitalization_DietPreference_Coding_Version ********************************************************************************/
		if(e.getEncounterHospitalizationDietPreferenceCodingVersion() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setVersion(e.getEncounterHospitalizationDietPreferenceCodingVersion());
		}
		/******************** Encounter_Hospitalization_DietPreference_Text ********************************************************************************/
		if(e.getEncounterHospitalizationDietPreferenceText() != null) {
			encountersethospitalizationadddietpreference.setText(e.getEncounterHospitalizationDietPreferenceText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetdischargedisposition = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setDischargeDisposition(encountersethospitalizationsetdischargedisposition);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetdischargedispositionaddcoding = encountersethospitalizationsetdischargedisposition.addCoding();

		/******************** Encounter_Hospitalization_DischargeDisposition_Coding_Code ********************************************************************************/
		if(e.getEncounterHospitalizationDischargeDispositionCodingCode() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setCode(e.getEncounterHospitalizationDischargeDispositionCodingCode());
		}
		/******************** Encounter_Hospitalization_DischargeDisposition_Coding_Display ********************************************************************************/
		if(e.getEncounterHospitalizationDischargeDispositionCodingDisplay() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setDisplay(e.getEncounterHospitalizationDischargeDispositionCodingDisplay());
		}
		/******************** Encounter_Hospitalization_DischargeDisposition_Coding_System ********************************************************************************/
		if(e.getEncounterHospitalizationDischargeDispositionCodingSystem() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setSystem(e.getEncounterHospitalizationDischargeDispositionCodingSystem());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_US ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingUs() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDischargeDispositionCodingUs()));
		}
		/******************** Encounter_Hospitalization_DischargeDisposition_Coding_Version ********************************************************************************/
		if(e.getEncounterHospitalizationDischargeDispositionCodingVersion() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setVersion(e.getEncounterHospitalizationDischargeDispositionCodingVersion());
		}
		/******************** Encounter_Hospitalization_DischargeDisposition_Text ********************************************************************************/
		if(e.getEncounterHospitalizationDischargeDispositionText() != null) {
			encountersethospitalizationsetdischargedisposition.setText(e.getEncounterHospitalizationDischargeDispositionText());
		}
		/******************** Encounter_Hospitalization_Origin ********************************************************************************/
		if(e.getEncounterHospitalizationOrigin() != null) {
			org.hl7.fhir.r4.model.Reference EncounterHospitalizationOriginref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalization.setOrigin(EncounterHospitalizationOriginref.setReference(e.getEncounterHospitalizationOrigin()));
		}

		org.hl7.fhir.r4.model.Identifier encountersethospitalizationsetpreadmissionidentifier = new org.hl7.fhir.r4.model.Identifier();
		encountersethospitalization.setPreAdmissionIdentifier(encountersethospitalizationsetpreadmissionidentifier);

		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_Assigner ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference EncounterHospitalizationPreAdmissionIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalizationsetpreadmissionidentifier.setAssigner(EncounterHospitalizationPreAdmissionIdentifierAssignerref.setReference(e.getEncounterHospitalizationPreAdmissionIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period encountersethospitalizationsetpreadmissionidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		encountersethospitalizationsetpreadmissionidentifier.setPeriod(encountersethospitalizationsetpreadmissionidentifiersetperiod);

		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_Period_End ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterHospitalizationPreAdmissionIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterHospitalizationPreAdmissionIdentifierPeriodEnddate = EncounterHospitalizationPreAdmissionIdentifierPeriodEndsdf.parse(e.getEncounterHospitalizationPreAdmissionIdentifierPeriodEnd());
			encountersethospitalizationsetpreadmissionidentifiersetperiod.setEnd(EncounterHospitalizationPreAdmissionIdentifierPeriodEnddate);
		}
		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_Period_Start ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterHospitalizationPreAdmissionIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterHospitalizationPreAdmissionIdentifierPeriodStartdate = EncounterHospitalizationPreAdmissionIdentifierPeriodStartsdf.parse(e.getEncounterHospitalizationPreAdmissionIdentifierPeriodStart());
			encountersethospitalizationsetpreadmissionidentifiersetperiod.setStart(EncounterHospitalizationPreAdmissionIdentifierPeriodStartdate);
		}
		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_System ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierSystem() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setSystem(e.getEncounterHospitalizationPreAdmissionIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetpreadmissionidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalizationsetpreadmissionidentifier.setType(encountersethospitalizationsetpreadmissionidentifiersettype);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding = encountersethospitalizationsetpreadmissionidentifiersettype.addCoding();

		/******************** Enc_Hospitalization_PreAdmissionIdentifier_Type_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingCode() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setCode(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingCode());
		}
		/******************** Enc_Hospitalization_PreAdmissionIdentifier_Type_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingDisplay() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setDisplay(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingDisplay());
		}
		/******************** Enc_Hospitalization_PreAdmissionIdentifier_Type_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingSystem() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setSystem(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingSystem());
		}
		/******************** Enc_Hospitalization_PreAdmissionIdentifier_Type_Coding_US ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingUs() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingUs()));
		}
		/******************** Enc_Hospitalization_PreAdmissionIdentifier_Type_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingVersion() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setVersion(e.getEncHospitalizationPreAdmissionIdentifierTypeCodingVersion());
		}
		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_Type_Text ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierTypeText() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettype.setText(e.getEncounterHospitalizationPreAdmissionIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encountersethospitalizationsetpreadmissionidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_Use_Code ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierUseCode() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setUse(encountersethospitalizationsetpreadmissionidentifiersetuseEnumFactory.fromCode(e.getEncounterHospitalizationPreAdmissionIdentifierUseCode()));

		}
		/******************** Encounter_Hospitalization_PreAdmissionIdentifier_Value ********************************************************************************/
		if(e.getEncounterHospitalizationPreAdmissionIdentifierValue() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setValue(e.getEncounterHospitalizationPreAdmissionIdentifierValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetreadmission = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setReAdmission(encountersethospitalizationsetreadmission);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetreadmissionaddcoding = encountersethospitalizationsetreadmission.addCoding();

		/******************** Encounter_Hospitalization_ReAdmission_Coding_Code ********************************************************************************/
		if(e.getEncounterHospitalizationReAdmissionCodingCode() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setCode(e.getEncounterHospitalizationReAdmissionCodingCode());
		}
		/******************** Encounter_Hospitalization_ReAdmission_Coding_Display ********************************************************************************/
		if(e.getEncounterHospitalizationReAdmissionCodingDisplay() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setDisplay(e.getEncounterHospitalizationReAdmissionCodingDisplay());
		}
		/******************** Encounter_Hospitalization_ReAdmission_Coding_System ********************************************************************************/
		if(e.getEncounterHospitalizationReAdmissionCodingSystem() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setSystem(e.getEncounterHospitalizationReAdmissionCodingSystem());
		}
		/******************** Encounter_Hospitalization_ReAdmission_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterHospitalizationReAdmissionCodingUserSelected() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterHospitalizationReAdmissionCodingUserSelected()));
		}
		/******************** Encounter_Hospitalization_ReAdmission_Coding_Version ********************************************************************************/
		if(e.getEncounterHospitalizationReAdmissionCodingVersion() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setVersion(e.getEncounterHospitalizationReAdmissionCodingVersion());
		}
		/******************** Encounter_Hospitalization_ReAdmission_Text ********************************************************************************/
		if(e.getEncounterHospitalizationReAdmissionText() != null) {
			encountersethospitalizationsetreadmission.setText(e.getEncounterHospitalizationReAdmissionText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationaddspecialarrangement = encountersethospitalization.addSpecialArrangement();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationaddspecialarrangementaddcoding = encountersethospitalizationaddspecialarrangement.addCoding();

		/******************** Encounter_Hospitalization_SpecialArrangement_Coding_Code ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialArrangementCodingCode() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setCode(e.getEncounterHospitalizationSpecialArrangementCodingCode());
		}
		/******************** Encounter_Hospitalization_SpecialArrangement_Coding_Display ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialArrangementCodingDisplay() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setDisplay(e.getEncounterHospitalizationSpecialArrangementCodingDisplay());
		}
		/******************** Encounter_Hospitalization_SpecialArrangement_Coding_System ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialArrangementCodingSystem() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setSystem(e.getEncounterHospitalizationSpecialArrangementCodingSystem());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_US ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingUs() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpecialArrangementCodingUs()));
		}
		/******************** Encounter_Hospitalization_SpecialArrangement_Coding_Version ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialArrangementCodingVersion() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setVersion(e.getEncounterHospitalizationSpecialArrangementCodingVersion());
		}
		/******************** Encounter_Hospitalization_SpecialArrangement_Text ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialArrangementText() != null) {
			encountersethospitalizationaddspecialarrangement.setText(e.getEncounterHospitalizationSpecialArrangementText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationaddspecialcourtesy = encountersethospitalization.addSpecialCourtesy();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationaddspecialcourtesyaddcoding = encountersethospitalizationaddspecialcourtesy.addCoding();

		/******************** Encounter_Hospitalization_SpecialCourtesy_Coding_Code ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialCourtesyCodingCode() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setCode(e.getEncounterHospitalizationSpecialCourtesyCodingCode());
		}
		/******************** Encounter_Hospitalization_SpecialCourtesy_Coding_Display ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialCourtesyCodingDisplay() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setDisplay(e.getEncounterHospitalizationSpecialCourtesyCodingDisplay());
		}
		/******************** Encounter_Hospitalization_SpecialCourtesy_Coding_System ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialCourtesyCodingSystem() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setSystem(e.getEncounterHospitalizationSpecialCourtesyCodingSystem());
		}
		/******************** Encounter_Hospitalization_SpecialCourtesy_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialCourtesyCodingUserSelected() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterHospitalizationSpecialCourtesyCodingUserSelected()));
		}
		/******************** Encounter_Hospitalization_SpecialCourtesy_Coding_Version ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialCourtesyCodingVersion() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setVersion(e.getEncounterHospitalizationSpecialCourtesyCodingVersion());
		}
		/******************** Encounter_Hospitalization_SpecialCourtesy_Text ********************************************************************************/
		if(e.getEncounterHospitalizationSpecialCourtesyText() != null) {
			encountersethospitalizationaddspecialcourtesy.setText(e.getEncounterHospitalizationSpecialCourtesyText());
		}

		org.hl7.fhir.r4.model.Identifier encounteraddidentifier = encounter.addIdentifier();

		/******************** Encounter_Identifier_Assigner ********************************************************************************/
		if(e.getEncounterIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference EncounterIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			encounteraddidentifier.setAssigner(EncounterIdentifierAssignerref.setReference(e.getEncounterIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period encounteraddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddidentifier.setPeriod(encounteraddidentifiersetperiod);

		/******************** Encounter_Identifier_Period_End ********************************************************************************/
		if(e.getEncounterIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterIdentifierPeriodEnddate = EncounterIdentifierPeriodEndsdf.parse(e.getEncounterIdentifierPeriodEnd());
			encounteraddidentifiersetperiod.setEnd(EncounterIdentifierPeriodEnddate);
		}
		/******************** Encounter_Identifier_Period_Start ********************************************************************************/
		if(e.getEncounterIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterIdentifierPeriodStartdate = EncounterIdentifierPeriodStartsdf.parse(e.getEncounterIdentifierPeriodStart());
			encounteraddidentifiersetperiod.setStart(EncounterIdentifierPeriodStartdate);
		}
		/******************** Encounter_Identifier_System ********************************************************************************/
		if(e.getEncounterIdentifierSystem() != null) {
			encounteraddidentifier.setSystem(e.getEncounterIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteraddidentifier.setType(encounteraddidentifiersettype);


		org.hl7.fhir.r4.model.Coding encounteraddidentifiersettypeaddcoding = encounteraddidentifiersettype.addCoding();

		/******************** Encounter_Identifier_Type_Coding_Code ********************************************************************************/
		if(e.getEncounterIdentifierTypeCodingCode() != null) {
			encounteraddidentifiersettypeaddcoding.setCode(e.getEncounterIdentifierTypeCodingCode());
		}
		/******************** Encounter_Identifier_Type_Coding_Display ********************************************************************************/
		if(e.getEncounterIdentifierTypeCodingDisplay() != null) {
			encounteraddidentifiersettypeaddcoding.setDisplay(e.getEncounterIdentifierTypeCodingDisplay());
		}
		/******************** Encounter_Identifier_Type_Coding_System ********************************************************************************/
		if(e.getEncounterIdentifierTypeCodingSystem() != null) {
			encounteraddidentifiersettypeaddcoding.setSystem(e.getEncounterIdentifierTypeCodingSystem());
		}
		/******************** Encounter_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterIdentifierTypeCodingUserSelected() != null) {
			encounteraddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterIdentifierTypeCodingUserSelected()));
		}
		/******************** Encounter_Identifier_Type_Coding_Version ********************************************************************************/
		if(e.getEncounterIdentifierTypeCodingVersion() != null) {
			encounteraddidentifiersettypeaddcoding.setVersion(e.getEncounterIdentifierTypeCodingVersion());
		}
		/******************** Encounter_Identifier_Type_Text ********************************************************************************/
		if(e.getEncounterIdentifierTypeText() != null) {
			encounteraddidentifiersettype.setText(e.getEncounterIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encounteraddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Encounter_Identifier_Use_Code ********************************************************************************/
		if(e.getEncounterIdentifierUseCode() != null) {
			encounteraddidentifier.setUse(encounteraddidentifiersetuseEnumFactory.fromCode(e.getEncounterIdentifierUseCode()));

		}
		/******************** Encounter_Identifier_Value ********************************************************************************/
		if(e.getEncounterIdentifierValue() != null) {
			encounteraddidentifier.setValue(e.getEncounterIdentifierValue());
		}
		/******************** Encounter_Length ********************************************************************************/
		if(e.getEncounterLength() != null) {
			org.hl7.fhir.r4.model.Duration EncounterLengthdur = new org.hl7.fhir.r4.model.Duration();
			encounter.setLength((org.hl7.fhir.r4.model.Duration)EncounterLengthdur.setValue(Double.parseDouble(e.getEncounterLength())));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent encounteraddlocation = encounter.addLocation();

		/******************** Encounter_Location_Location ********************************************************************************/
		if(e.getEncounterLocationLocation() != null) {
			org.hl7.fhir.r4.model.Reference EncounterLocationLocationref = new org.hl7.fhir.r4.model.Reference();
			encounteraddlocation.setLocation(EncounterLocationLocationref.setReference(e.getEncounterLocationLocation()));
		}

		org.hl7.fhir.r4.model.Period encounteraddlocationsetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddlocation.setPeriod(encounteraddlocationsetperiod);

		/******************** Encounter_Location_Period_End ********************************************************************************/
		if(e.getEncounterLocationPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterLocationPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterLocationPeriodEnddate = EncounterLocationPeriodEndsdf.parse(e.getEncounterLocationPeriodEnd());
			encounteraddlocationsetperiod.setEnd(EncounterLocationPeriodEnddate);
		}
		/******************** Encounter_Location_Period_Start ********************************************************************************/
		if(e.getEncounterLocationPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterLocationPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterLocationPeriodStartdate = EncounterLocationPeriodStartsdf.parse(e.getEncounterLocationPeriodStart());
			encounteraddlocationsetperiod.setStart(EncounterLocationPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddlocationsetphysicaltype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteraddlocation.setPhysicalType(encounteraddlocationsetphysicaltype);


		org.hl7.fhir.r4.model.Coding encounteraddlocationsetphysicaltypeaddcoding = encounteraddlocationsetphysicaltype.addCoding();

		/******************** Encounter_Location_PhysicalType_Coding_Code ********************************************************************************/
		if(e.getEncounterLocationPhysicalTypeCodingCode() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setCode(e.getEncounterLocationPhysicalTypeCodingCode());
		}
		/******************** Encounter_Location_PhysicalType_Coding_Display ********************************************************************************/
		if(e.getEncounterLocationPhysicalTypeCodingDisplay() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setDisplay(e.getEncounterLocationPhysicalTypeCodingDisplay());
		}
		/******************** Encounter_Location_PhysicalType_Coding_System ********************************************************************************/
		if(e.getEncounterLocationPhysicalTypeCodingSystem() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setSystem(e.getEncounterLocationPhysicalTypeCodingSystem());
		}
		/******************** Encounter_Location_PhysicalType_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterLocationPhysicalTypeCodingUserSelected() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterLocationPhysicalTypeCodingUserSelected()));
		}
		/******************** Encounter_Location_PhysicalType_Coding_Version ********************************************************************************/
		if(e.getEncounterLocationPhysicalTypeCodingVersion() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setVersion(e.getEncounterLocationPhysicalTypeCodingVersion());
		}
		/******************** Encounter_Location_PhysicalType_Text ********************************************************************************/
		if(e.getEncounterLocationPhysicalTypeText() != null) {
			encounteraddlocationsetphysicaltype.setText(e.getEncounterLocationPhysicalTypeText());
		}

		org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory encounteraddlocationsetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory();

		/******************** Encounter_Location_Status_Code ********************************************************************************/
		if(e.getEncounterLocationStatusCode() != null) {
			encounteraddlocation.setStatus(encounteraddlocationsetstatusEnumFactory.fromCode(e.getEncounterLocationStatusCode()));

		}
		/******************** Encounter_PartOf ********************************************************************************/
		if(e.getEncounterPartOf() != null) {
			org.hl7.fhir.r4.model.Reference EncounterPartOfref = new org.hl7.fhir.r4.model.Reference();
			encounter.setPartOf(EncounterPartOfref.setReference(e.getEncounterPartOf()));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent encounteraddparticipant = encounter.addParticipant();

		/******************** Encounter_Participant_Individual ********************************************************************************/
		if(e.getEncounterParticipantIndividual() != null) {
			org.hl7.fhir.r4.model.Reference EncounterParticipantIndividualref = new org.hl7.fhir.r4.model.Reference();
			encounteraddparticipant.setIndividual(EncounterParticipantIndividualref.setReference(e.getEncounterParticipantIndividual()));
		}

		org.hl7.fhir.r4.model.Period encounteraddparticipantsetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddparticipant.setPeriod(encounteraddparticipantsetperiod);

		/******************** Encounter_Participant_Period_End ********************************************************************************/
		if(e.getEncounterParticipantPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterParticipantPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterParticipantPeriodEnddate = EncounterParticipantPeriodEndsdf.parse(e.getEncounterParticipantPeriodEnd());
			encounteraddparticipantsetperiod.setEnd(EncounterParticipantPeriodEnddate);
		}
		/******************** Encounter_Participant_Period_Start ********************************************************************************/
		if(e.getEncounterParticipantPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterParticipantPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterParticipantPeriodStartdate = EncounterParticipantPeriodStartsdf.parse(e.getEncounterParticipantPeriodStart());
			encounteraddparticipantsetperiod.setStart(EncounterParticipantPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddparticipantaddtype = encounteraddparticipant.addType();


		org.hl7.fhir.r4.model.Coding encounteraddparticipantaddtypeaddcoding = encounteraddparticipantaddtype.addCoding();

		/******************** Encounter_Participant_Type_Coding_Code ********************************************************************************/
		if(e.getEncounterParticipantTypeCodingCode() != null) {
			encounteraddparticipantaddtypeaddcoding.setCode(e.getEncounterParticipantTypeCodingCode());
		}
		/******************** Encounter_Participant_Type_Coding_Display ********************************************************************************/
		if(e.getEncounterParticipantTypeCodingDisplay() != null) {
			encounteraddparticipantaddtypeaddcoding.setDisplay(e.getEncounterParticipantTypeCodingDisplay());
		}
		/******************** Encounter_Participant_Type_Coding_System ********************************************************************************/
		if(e.getEncounterParticipantTypeCodingSystem() != null) {
			encounteraddparticipantaddtypeaddcoding.setSystem(e.getEncounterParticipantTypeCodingSystem());
		}
		/******************** Encounter_Participant_Type_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterParticipantTypeCodingUserSelected() != null) {
			encounteraddparticipantaddtypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterParticipantTypeCodingUserSelected()));
		}
		/******************** Encounter_Participant_Type_Coding_Version ********************************************************************************/
		if(e.getEncounterParticipantTypeCodingVersion() != null) {
			encounteraddparticipantaddtypeaddcoding.setVersion(e.getEncounterParticipantTypeCodingVersion());
		}
		/******************** Encounter_Participant_Type_Text ********************************************************************************/
		if(e.getEncounterParticipantTypeText() != null) {
			encounteraddparticipantaddtype.setText(e.getEncounterParticipantTypeText());
		}

		org.hl7.fhir.r4.model.Period encountersetperiod = new org.hl7.fhir.r4.model.Period();
		encounter.setPeriod(encountersetperiod);

		/******************** Encounter_Period_End ********************************************************************************/
		if(e.getEncounterPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterPeriodEnddate = EncounterPeriodEndsdf.parse(e.getEncounterPeriodEnd());
			encountersetperiod.setEnd(EncounterPeriodEnddate);
		}
		/******************** Encounter_Period_Start ********************************************************************************/
		if(e.getEncounterPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterPeriodStartdate = EncounterPeriodStartsdf.parse(e.getEncounterPeriodStart());
			encountersetperiod.setStart(EncounterPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersetpriority = new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setPriority(encountersetpriority);


		org.hl7.fhir.r4.model.Coding encountersetpriorityaddcoding = encountersetpriority.addCoding();

		/******************** Encounter_Priority_Coding_Code ********************************************************************************/
		if(e.getEncounterPriorityCodingCode() != null) {
			encountersetpriorityaddcoding.setCode(e.getEncounterPriorityCodingCode());
		}
		/******************** Encounter_Priority_Coding_Display ********************************************************************************/
		if(e.getEncounterPriorityCodingDisplay() != null) {
			encountersetpriorityaddcoding.setDisplay(e.getEncounterPriorityCodingDisplay());
		}
		/******************** Encounter_Priority_Coding_System ********************************************************************************/
		if(e.getEncounterPriorityCodingSystem() != null) {
			encountersetpriorityaddcoding.setSystem(e.getEncounterPriorityCodingSystem());
		}
		/******************** Encounter_Priority_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterPriorityCodingUserSelected() != null) {
			encountersetpriorityaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterPriorityCodingUserSelected()));
		}
		/******************** Encounter_Priority_Coding_Version ********************************************************************************/
		if(e.getEncounterPriorityCodingVersion() != null) {
			encountersetpriorityaddcoding.setVersion(e.getEncounterPriorityCodingVersion());
		}
		/******************** Encounter_Priority_Text ********************************************************************************/
		if(e.getEncounterPriorityText() != null) {
			encountersetpriority.setText(e.getEncounterPriorityText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddreasoncode = encounter.addReasonCode();


		org.hl7.fhir.r4.model.Coding encounteraddreasoncodeaddcoding = encounteraddreasoncode.addCoding();

		/******************** Encounter_ReasonCode_Coding_Code ********************************************************************************/
		if(e.getEncounterReasonCodeCodingCode() != null) {
			encounteraddreasoncodeaddcoding.setCode(e.getEncounterReasonCodeCodingCode());
		}
		/******************** Encounter_ReasonCode_Coding_Display ********************************************************************************/
		if(e.getEncounterReasonCodeCodingDisplay() != null) {
			encounteraddreasoncodeaddcoding.setDisplay(e.getEncounterReasonCodeCodingDisplay());
		}
		/******************** Encounter_ReasonCode_Coding_System ********************************************************************************/
		if(e.getEncounterReasonCodeCodingSystem() != null) {
			encounteraddreasoncodeaddcoding.setSystem(e.getEncounterReasonCodeCodingSystem());
		}
		/******************** Encounter_ReasonCode_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterReasonCodeCodingUserSelected() != null) {
			encounteraddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterReasonCodeCodingUserSelected()));
		}
		/******************** Encounter_ReasonCode_Coding_Version ********************************************************************************/
		if(e.getEncounterReasonCodeCodingVersion() != null) {
			encounteraddreasoncodeaddcoding.setVersion(e.getEncounterReasonCodeCodingVersion());
		}
		/******************** Encounter_ReasonCode_Text ********************************************************************************/
		if(e.getEncounterReasonCodeText() != null) {
			encounteraddreasoncode.setText(e.getEncounterReasonCodeText());
		}
		/******************** Encounter_ReasonReference ********************************************************************************/
		if(e.getEncounterReasonReference() != null) {
			org.hl7.fhir.r4.model.Reference EncounterReasonReferenceref = new org.hl7.fhir.r4.model.Reference();
			encounter.addReasonReference(EncounterReasonReferenceref.setReference(e.getEncounterReasonReference()));
		}
		/******************** Encounter_ServiceProvider ********************************************************************************/
		if(e.getEncounterServiceProvider() != null) {
			org.hl7.fhir.r4.model.Reference EncounterServiceProviderref = new org.hl7.fhir.r4.model.Reference();
			encounter.setServiceProvider(EncounterServiceProviderref.setReference(e.getEncounterServiceProvider()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersetservicetype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setServiceType(encountersetservicetype);


		org.hl7.fhir.r4.model.Coding encountersetservicetypeaddcoding = encountersetservicetype.addCoding();

		/******************** Encounter_ServiceType_Coding_Code ********************************************************************************/
		if(e.getEncounterServiceTypeCodingCode() != null) {
			encountersetservicetypeaddcoding.setCode(e.getEncounterServiceTypeCodingCode());
		}
		/******************** Encounter_ServiceType_Coding_Display ********************************************************************************/
		if(e.getEncounterServiceTypeCodingDisplay() != null) {
			encountersetservicetypeaddcoding.setDisplay(e.getEncounterServiceTypeCodingDisplay());
		}
		/******************** Encounter_ServiceType_Coding_System ********************************************************************************/
		if(e.getEncounterServiceTypeCodingSystem() != null) {
			encountersetservicetypeaddcoding.setSystem(e.getEncounterServiceTypeCodingSystem());
		}
		/******************** Encounter_ServiceType_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterServiceTypeCodingUserSelected() != null) {
			encountersetservicetypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterServiceTypeCodingUserSelected()));
		}
		/******************** Encounter_ServiceType_Coding_Version ********************************************************************************/
		if(e.getEncounterServiceTypeCodingVersion() != null) {
			encountersetservicetypeaddcoding.setVersion(e.getEncounterServiceTypeCodingVersion());
		}
		/******************** Encounter_ServiceType_Text ********************************************************************************/
		if(e.getEncounterServiceTypeText() != null) {
			encountersetservicetype.setText(e.getEncounterServiceTypeText());
		}

		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encountersetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();

		/******************** Encounter_Status_Code ********************************************************************************/
		if(e.getEncounterStatusCode() != null) {
			encounter.setStatus(encountersetstatusEnumFactory.fromCode(e.getEncounterStatusCode()));

		}

		org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent encounteraddstatushistory = encounter.addStatusHistory();


		org.hl7.fhir.r4.model.Period encounteraddstatushistorysetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddstatushistory.setPeriod(encounteraddstatushistorysetperiod);

		/******************** Encounter_StatusHistory_Period_End ********************************************************************************/
		if(e.getEncounterStatusHistoryPeriodEnd() != null) {
			java.text.SimpleDateFormat EncounterStatusHistoryPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterStatusHistoryPeriodEnddate = EncounterStatusHistoryPeriodEndsdf.parse(e.getEncounterStatusHistoryPeriodEnd());
			encounteraddstatushistorysetperiod.setEnd(EncounterStatusHistoryPeriodEnddate);
		}
		/******************** Encounter_StatusHistory_Period_Start ********************************************************************************/
		if(e.getEncounterStatusHistoryPeriodStart() != null) {
			java.text.SimpleDateFormat EncounterStatusHistoryPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncounterStatusHistoryPeriodStartdate = EncounterStatusHistoryPeriodStartsdf.parse(e.getEncounterStatusHistoryPeriodStart());
			encounteraddstatushistorysetperiod.setStart(EncounterStatusHistoryPeriodStartdate);
		}

		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encounteraddstatushistorysetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();

		/******************** Encounter_StatusHistory_Status_Code ********************************************************************************/
		if(e.getEncounterStatusHistoryStatusCode() != null) {
			encounteraddstatushistory.setStatus(encounteraddstatushistorysetstatusEnumFactory.fromCode(e.getEncounterStatusHistoryStatusCode()));

		}
		/******************** Encounter_Subject ********************************************************************************/
		if(e.getEncounterSubject() != null) {
			org.hl7.fhir.r4.model.Reference EncounterSubjectref = new org.hl7.fhir.r4.model.Reference();
			encounter.setSubject(EncounterSubjectref.setReference(e.getEncounterSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddtype = encounter.addType();


		org.hl7.fhir.r4.model.Coding encounteraddtypeaddcoding = encounteraddtype.addCoding();

		/******************** Encounter_Type_Coding_Code ********************************************************************************/
		if(e.getEncounterTypeCodingCode() != null) {
			encounteraddtypeaddcoding.setCode(e.getEncounterTypeCodingCode());
		}
		/******************** Encounter_Type_Coding_Display ********************************************************************************/
		if(e.getEncounterTypeCodingDisplay() != null) {
			encounteraddtypeaddcoding.setDisplay(e.getEncounterTypeCodingDisplay());
		}
		/******************** Encounter_Type_Coding_System ********************************************************************************/
		if(e.getEncounterTypeCodingSystem() != null) {
			encounteraddtypeaddcoding.setSystem(e.getEncounterTypeCodingSystem());
		}
		/******************** Encounter_Type_Coding_UserSelected ********************************************************************************/
		if(e.getEncounterTypeCodingUserSelected() != null) {
			encounteraddtypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncounterTypeCodingUserSelected()));
		}
		/******************** Encounter_Type_Coding_Version ********************************************************************************/
		if(e.getEncounterTypeCodingVersion() != null) {
			encounteraddtypeaddcoding.setVersion(e.getEncounterTypeCodingVersion());
		}
		return encounter;
	}
}
