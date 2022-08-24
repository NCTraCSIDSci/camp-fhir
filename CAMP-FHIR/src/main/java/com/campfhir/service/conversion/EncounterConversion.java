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
			org.hl7.fhir.r4.model.Reference EncAccountref = new org.hl7.fhir.r4.model.Reference();
			encounter.addAccount(EncAccountref.setReference(e.getEncAccount()));
		}
		/******************** Enc_Appointment ********************************************************************************/
		if(e.getEncAppointment() != null) {
			org.hl7.fhir.r4.model.Reference EncAppointmentref = new org.hl7.fhir.r4.model.Reference();
			encounter.addAppointment(EncAppointmentref.setReference(e.getEncAppointment()));
		}
		/******************** Enc_BasedOn ********************************************************************************/
		if(e.getEncBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference EncBasedOnref = new org.hl7.fhir.r4.model.Reference();
			encounter.addBasedOn(EncBasedOnref.setReference(e.getEncBasedOn()));
		}

		org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent encounteraddclasshistory = encounter.addClassHistory();


		org.hl7.fhir.r4.model.Coding encounteraddclasshistorysetclass_ = new org.hl7.fhir.r4.model.Coding();
		encounteraddclasshistory.setClass_(encounteraddclasshistorysetclass_);

		/******************** Enc_ClassHistory_Class__Code ********************************************************************************/
		if(e.getEncClassHistoryClassCode() != null) {
			encounteraddclasshistorysetclass_.setCode(e.getEncClassHistoryClassCode());
		}
		/******************** Enc_ClassHistory_Class__Display ********************************************************************************/
		if(e.getEncClassHistoryClassDisplay() != null) {
			encounteraddclasshistorysetclass_.setDisplay(e.getEncClassHistoryClassDisplay());
		}
		/******************** Enc_ClassHistory_Class__System ********************************************************************************/
		if(e.getEncClassHistoryClassSystem() != null) {
			encounteraddclasshistorysetclass_.setSystem(e.getEncClassHistoryClassSystem());
		}
		/******************** Enc_ClassHistory_Class__Usrslt ********************************************************************************/
		if(e.getEncClassHistoryClassUsrslt() != null) {
			encounteraddclasshistorysetclass_.setUserSelected(Boolean.parseBoolean(e.getEncClassHistoryClassUsrslt()));
		}
		/******************** Enc_ClassHistory_Class__Version ********************************************************************************/
		if(e.getEncClassHistoryClassVersion() != null) {
			encounteraddclasshistorysetclass_.setVersion(e.getEncClassHistoryClassVersion());
		}

		org.hl7.fhir.r4.model.Period encounteraddclasshistorysetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddclasshistory.setPeriod(encounteraddclasshistorysetperiod);

		/******************** Enc_ClassHistory_Period_End ********************************************************************************/
		if(e.getEncClassHistoryPeriodEnd() != null) {
			java.text.SimpleDateFormat EncClassHistoryPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncClassHistoryPeriodEnddate = EncClassHistoryPeriodEndsdf.parse(e.getEncClassHistoryPeriodEnd());
			encounteraddclasshistorysetperiod.setEnd(EncClassHistoryPeriodEnddate);
		}
		/******************** Enc_ClassHistory_Period_Start ********************************************************************************/
		if(e.getEncClassHistoryPeriodStart() != null) {
			java.text.SimpleDateFormat EncClassHistoryPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncClassHistoryPeriodStartdate = EncClassHistoryPeriodStartsdf.parse(e.getEncClassHistoryPeriodStart());
			encounteraddclasshistorysetperiod.setStart(EncClassHistoryPeriodStartdate);
		}

		org.hl7.fhir.r4.model.Coding encountersetclass_ = new org.hl7.fhir.r4.model.Coding();
		encounter.setClass_(encountersetclass_);

		/******************** Enc_Class__Code ********************************************************************************/
		if(e.getEncClassCode() != null) {
			encountersetclass_.setCode(e.getEncClassCode());
		}
		/******************** Enc_Class__Display ********************************************************************************/
		if(e.getEncClassDisplay() != null) {
			encountersetclass_.setDisplay(e.getEncClassDisplay());
		}
		/******************** Enc_Class__System ********************************************************************************/
		if(e.getEncClassSystem() != null) {
			encountersetclass_.setSystem(e.getEncClassSystem());
		}
		/******************** Enc_Class__Usrslt ********************************************************************************/
		if(e.getEncClassUsrslt() != null) {
			encountersetclass_.setUserSelected(Boolean.parseBoolean(e.getEncClassUsrslt()));
		}
		/******************** Enc_Class__Version ********************************************************************************/
		if(e.getEncClassVersion() != null) {
			encountersetclass_.setVersion(e.getEncClassVersion());
		}

		org.hl7.fhir.r4.model.Encounter.DiagnosisComponent encounteradddiagnosis = encounter.addDiagnosis();

		/******************** Enc_Diagnosis_Condition ********************************************************************************/
		if(e.getEncDiagnosisCondition() != null) {
			org.hl7.fhir.r4.model.Reference EncDiagnosisConditionref = new org.hl7.fhir.r4.model.Reference();
			encounteradddiagnosis.setCondition(EncDiagnosisConditionref.setReference(e.getEncDiagnosisCondition()));
		}
		/******************** Enc_Diagnosis_Rank ********************************************************************************/
		if(e.getEncDiagnosisRank() != null) {
			encounteradddiagnosis.setRank(Integer.parseInt(e.getEncDiagnosisRank()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteradddiagnosissetuse = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteradddiagnosis.setUse(encounteradddiagnosissetuse);


		org.hl7.fhir.r4.model.Coding encounteradddiagnosissetuseaddcoding = encounteradddiagnosissetuse.addCoding();

		/******************** Enc_Diagnosis_Use_Coding_Code ********************************************************************************/
		if(e.getEncDiagnosisUseCodingCode() != null) {
			encounteradddiagnosissetuseaddcoding.setCode(e.getEncDiagnosisUseCodingCode());
		}
		/******************** Enc_Diagnosis_Use_Coding_Display ********************************************************************************/
		if(e.getEncDiagnosisUseCodingDisplay() != null) {
			encounteradddiagnosissetuseaddcoding.setDisplay(e.getEncDiagnosisUseCodingDisplay());
		}
		/******************** Enc_Diagnosis_Use_Coding_System ********************************************************************************/
		if(e.getEncDiagnosisUseCodingSystem() != null) {
			encounteradddiagnosissetuseaddcoding.setSystem(e.getEncDiagnosisUseCodingSystem());
		}
		/******************** Enc_Diagnosis_Use_Coding_Usrslt ********************************************************************************/
		if(e.getEncDiagnosisUseCodingUsrslt() != null) {
			encounteradddiagnosissetuseaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncDiagnosisUseCodingUsrslt()));
		}
		/******************** Enc_Diagnosis_Use_Coding_Version ********************************************************************************/
		if(e.getEncDiagnosisUseCodingVersion() != null) {
			encounteradddiagnosissetuseaddcoding.setVersion(e.getEncDiagnosisUseCodingVersion());
		}
		/******************** Enc_Diagnosis_Use_Text ********************************************************************************/
		if(e.getEncDiagnosisUseText() != null) {
			encounteradddiagnosissetuse.setText(e.getEncDiagnosisUseText());
		}
		/******************** Enc_EpisodeOfCare ********************************************************************************/
		if(e.getEncEpisodeOfCare() != null) {
			org.hl7.fhir.r4.model.Reference EncEpisodeOfCareref = new org.hl7.fhir.r4.model.Reference();
			encounter.addEpisodeOfCare(EncEpisodeOfCareref.setReference(e.getEncEpisodeOfCare()));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent encountersethospitalization = new org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent();
		encounter.setHospitalization(encountersethospitalization);


		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetadmitsource = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setAdmitSource(encountersethospitalizationsetadmitsource);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetadmitsourceaddcoding = encountersethospitalizationsetadmitsource.addCoding();

		/******************** Enc_Hospitalization_AdmitSource_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingCode() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setCode(e.getEncHospitalizationAdmitSourceCodingCode());
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingDisplay() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setDisplay(e.getEncHospitalizationAdmitSourceCodingDisplay());
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingSystem() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setSystem(e.getEncHospitalizationAdmitSourceCodingSystem());
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingUsrslt() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationAdmitSourceCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingVersion() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setVersion(e.getEncHospitalizationAdmitSourceCodingVersion());
		}
		/******************** Enc_Hospitalization_AdmitSource_Text ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceText() != null) {
			encountersethospitalizationsetadmitsource.setText(e.getEncHospitalizationAdmitSourceText());
		}
		/******************** Enc_Hospitalization_Destination ********************************************************************************/
		if(e.getEncHospitalizationDestination() != null) {
			org.hl7.fhir.r4.model.Reference EncHospitalizationDestinationref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalization.setDestination(EncHospitalizationDestinationref.setReference(e.getEncHospitalizationDestination()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationadddietpreference = encountersethospitalization.addDietPreference();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationadddietpreferenceaddcoding = encountersethospitalizationadddietpreference.addCoding();

		/******************** Enc_Hospitalization_DietPreference_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingCode() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setCode(e.getEncHospitalizationDietPreferenceCodingCode());
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingDisplay() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setDisplay(e.getEncHospitalizationDietPreferenceCodingDisplay());
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingSystem() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setSystem(e.getEncHospitalizationDietPreferenceCodingSystem());
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingUsrslt() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDietPreferenceCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingVersion() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setVersion(e.getEncHospitalizationDietPreferenceCodingVersion());
		}
		/******************** Enc_Hospitalization_DietPreference_Text ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceText() != null) {
			encountersethospitalizationadddietpreference.setText(e.getEncHospitalizationDietPreferenceText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetdischargedisposition = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setDischargeDisposition(encountersethospitalizationsetdischargedisposition);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetdischargedispositionaddcoding = encountersethospitalizationsetdischargedisposition.addCoding();

		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingCode() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setCode(e.getEncHospitalizationDischargeDispositionCodingCode());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingDisplay() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setDisplay(e.getEncHospitalizationDischargeDispositionCodingDisplay());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingSystem() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setSystem(e.getEncHospitalizationDischargeDispositionCodingSystem());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingUsrslt() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDischargeDispositionCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingVersion() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setVersion(e.getEncHospitalizationDischargeDispositionCodingVersion());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Text ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionText() != null) {
			encountersethospitalizationsetdischargedisposition.setText(e.getEncHospitalizationDischargeDispositionText());
		}
		/******************** Enc_Hospitalization_Origin ********************************************************************************/
		if(e.getEncHospitalizationOrigin() != null) {
			org.hl7.fhir.r4.model.Reference EncHospitalizationOriginref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalization.setOrigin(EncHospitalizationOriginref.setReference(e.getEncHospitalizationOrigin()));
		}

		org.hl7.fhir.r4.model.Identifier encountersethospitalizationsetpreadmissionidentifier = new org.hl7.fhir.r4.model.Identifier();
		encountersethospitalization.setPreAdmissionIdentifier(encountersethospitalizationsetpreadmissionidentifier);

		/******************** Enc_Hospitalization_PreAdmissionId_Assigner ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference EncHospitalizationPreAdmissionIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalizationsetpreadmissionidentifier.setAssigner(EncHospitalizationPreAdmissionIdAssignerref.setReference(e.getEncHospitalizationPreAdmissionIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period encountersethospitalizationsetpreadmissionidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		encountersethospitalizationsetpreadmissionidentifier.setPeriod(encountersethospitalizationsetpreadmissionidentifiersetperiod);

		/******************** Enc_Hospitalization_PreAdmissionId_Period_End ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPeriodEnd() != null) {
			java.text.SimpleDateFormat EncHospitalizationPreAdmissionIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncHospitalizationPreAdmissionIdPeriodEnddate = EncHospitalizationPreAdmissionIdPeriodEndsdf.parse(e.getEncHospitalizationPreAdmissionIdPeriodEnd());
			encountersethospitalizationsetpreadmissionidentifiersetperiod.setEnd(EncHospitalizationPreAdmissionIdPeriodEnddate);
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Period_Start ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPeriodStart() != null) {
			java.text.SimpleDateFormat EncHospitalizationPreAdmissionIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncHospitalizationPreAdmissionIdPeriodStartdate = EncHospitalizationPreAdmissionIdPeriodStartsdf.parse(e.getEncHospitalizationPreAdmissionIdPeriodStart());
			encountersethospitalizationsetpreadmissionidentifiersetperiod.setStart(EncHospitalizationPreAdmissionIdPeriodStartdate);
		}
		/******************** Enc_Hospitalization_PreAdmissionId_System ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdSystem() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setSystem(e.getEncHospitalizationPreAdmissionIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetpreadmissionidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalizationsetpreadmissionidentifier.setType(encountersethospitalizationsetpreadmissionidentifiersettype);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding = encountersethospitalizationsetpreadmissionidentifiersettype.addCoding();

		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingCode() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setCode(e.getEncHospitalizationPreAdmissionIdTypeCodingCode());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingDisplay() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setDisplay(e.getEncHospitalizationPreAdmissionIdTypeCodingDisplay());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingSystem() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setSystem(e.getEncHospitalizationPreAdmissionIdTypeCodingSystem());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingUsrslt() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationPreAdmissionIdTypeCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingVersion() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setVersion(e.getEncHospitalizationPreAdmissionIdTypeCodingVersion());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Text ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeText() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettype.setText(e.getEncHospitalizationPreAdmissionIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encountersethospitalizationsetpreadmissionidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Enc_Hospitalization_PreAdmissionId_Use_Code ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdUseCode() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setUse(encountersethospitalizationsetpreadmissionidentifiersetuseEnumFactory.fromCode(e.getEncHospitalizationPreAdmissionIdUseCode()));

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Value ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdValue() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setValue(e.getEncHospitalizationPreAdmissionIdValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetreadmission = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setReAdmission(encountersethospitalizationsetreadmission);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetreadmissionaddcoding = encountersethospitalizationsetreadmission.addCoding();

		/******************** Enc_Hospitalization_ReAdmission_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingCode() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setCode(e.getEncHospitalizationReAdmissionCodingCode());
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingDisplay() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setDisplay(e.getEncHospitalizationReAdmissionCodingDisplay());
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingSystem() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setSystem(e.getEncHospitalizationReAdmissionCodingSystem());
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingUsrslt() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationReAdmissionCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingVersion() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setVersion(e.getEncHospitalizationReAdmissionCodingVersion());
		}
		/******************** Enc_Hospitalization_ReAdmission_Text ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionText() != null) {
			encountersethospitalizationsetreadmission.setText(e.getEncHospitalizationReAdmissionText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationaddspecialarrangement = encountersethospitalization.addSpecialArrangement();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationaddspecialarrangementaddcoding = encountersethospitalizationaddspecialarrangement.addCoding();

		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingCode() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setCode(e.getEncHospitalizationSpecialArrangementCodingCode());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingDisplay() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setDisplay(e.getEncHospitalizationSpecialArrangementCodingDisplay());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingSystem() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setSystem(e.getEncHospitalizationSpecialArrangementCodingSystem());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingUsrslt() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpecialArrangementCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingVersion() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setVersion(e.getEncHospitalizationSpecialArrangementCodingVersion());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Text ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementText() != null) {
			encountersethospitalizationaddspecialarrangement.setText(e.getEncHospitalizationSpecialArrangementText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationaddspecialcourtesy = encountersethospitalization.addSpecialCourtesy();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationaddspecialcourtesyaddcoding = encountersethospitalizationaddspecialcourtesy.addCoding();

		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingCode() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setCode(e.getEncHospitalizationSpecialCourtesyCodingCode());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingDisplay() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setDisplay(e.getEncHospitalizationSpecialCourtesyCodingDisplay());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingSystem() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setSystem(e.getEncHospitalizationSpecialCourtesyCodingSystem());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingUsrslt() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpecialCourtesyCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingVersion() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setVersion(e.getEncHospitalizationSpecialCourtesyCodingVersion());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Text ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyText() != null) {
			encountersethospitalizationaddspecialcourtesy.setText(e.getEncHospitalizationSpecialCourtesyText());
		}

		org.hl7.fhir.r4.model.Identifier encounteraddidentifier = encounter.addIdentifier();

		/******************** Enc_Id_Assigner ********************************************************************************/
		if(e.getEncIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference EncIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			encounteraddidentifier.setAssigner(EncIdAssignerref.setReference(e.getEncIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period encounteraddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddidentifier.setPeriod(encounteraddidentifiersetperiod);

		/******************** Enc_Id_Period_End ********************************************************************************/
		if(e.getEncIdPeriodEnd() != null) {
			java.text.SimpleDateFormat EncIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncIdPeriodEnddate = EncIdPeriodEndsdf.parse(e.getEncIdPeriodEnd());
			encounteraddidentifiersetperiod.setEnd(EncIdPeriodEnddate);
		}
		/******************** Enc_Id_Period_Start ********************************************************************************/
		if(e.getEncIdPeriodStart() != null) {
			java.text.SimpleDateFormat EncIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncIdPeriodStartdate = EncIdPeriodStartsdf.parse(e.getEncIdPeriodStart());
			encounteraddidentifiersetperiod.setStart(EncIdPeriodStartdate);
		}
		/******************** Enc_Id_System ********************************************************************************/
		if(e.getEncIdSystem() != null) {
			encounteraddidentifier.setSystem(e.getEncIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteraddidentifier.setType(encounteraddidentifiersettype);


		org.hl7.fhir.r4.model.Coding encounteraddidentifiersettypeaddcoding = encounteraddidentifiersettype.addCoding();

		/******************** Enc_Id_Type_Coding_Code ********************************************************************************/
		if(e.getEncIdTypeCodingCode() != null) {
			encounteraddidentifiersettypeaddcoding.setCode(e.getEncIdTypeCodingCode());
		}
		/******************** Enc_Id_Type_Coding_Display ********************************************************************************/
		if(e.getEncIdTypeCodingDisplay() != null) {
			encounteraddidentifiersettypeaddcoding.setDisplay(e.getEncIdTypeCodingDisplay());
		}
		/******************** Enc_Id_Type_Coding_System ********************************************************************************/
		if(e.getEncIdTypeCodingSystem() != null) {
			encounteraddidentifiersettypeaddcoding.setSystem(e.getEncIdTypeCodingSystem());
		}
		/******************** Enc_Id_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncIdTypeCodingUsrslt() != null) {
			encounteraddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncIdTypeCodingUsrslt()));
		}
		/******************** Enc_Id_Type_Coding_Version ********************************************************************************/
		if(e.getEncIdTypeCodingVersion() != null) {
			encounteraddidentifiersettypeaddcoding.setVersion(e.getEncIdTypeCodingVersion());
		}
		/******************** Enc_Id_Type_Text ********************************************************************************/
		if(e.getEncIdTypeText() != null) {
			encounteraddidentifiersettype.setText(e.getEncIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encounteraddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Enc_Id_Use_Code ********************************************************************************/
		if(e.getEncIdUseCode() != null) {
			encounteraddidentifier.setUse(encounteraddidentifiersetuseEnumFactory.fromCode(e.getEncIdUseCode()));

		}
		/******************** Enc_Id_Value ********************************************************************************/
		if(e.getEncIdValue() != null) {
			encounteraddidentifier.setValue(e.getEncIdValue());
		}
		/******************** Enc_Length ********************************************************************************/
		if(e.getEncLength() != null) {
			org.hl7.fhir.r4.model.Duration EncLengthdur = new org.hl7.fhir.r4.model.Duration();
			encounter.setLength((org.hl7.fhir.r4.model.Duration)EncLengthdur.setValue(Double.parseDouble(e.getEncLength())));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent encounteraddlocation = encounter.addLocation();

		/******************** Enc_Location_Location ********************************************************************************/
		if(e.getEncLocationLocation() != null) {
			org.hl7.fhir.r4.model.Reference EncLocationLocationref = new org.hl7.fhir.r4.model.Reference();
			encounteraddlocation.setLocation(EncLocationLocationref.setReference(e.getEncLocationLocation()));
		}

		org.hl7.fhir.r4.model.Period encounteraddlocationsetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddlocation.setPeriod(encounteraddlocationsetperiod);

		/******************** Enc_Location_Period_End ********************************************************************************/
		if(e.getEncLocationPeriodEnd() != null) {
			java.text.SimpleDateFormat EncLocationPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncLocationPeriodEnddate = EncLocationPeriodEndsdf.parse(e.getEncLocationPeriodEnd());
			encounteraddlocationsetperiod.setEnd(EncLocationPeriodEnddate);
		}
		/******************** Enc_Location_Period_Start ********************************************************************************/
		if(e.getEncLocationPeriodStart() != null) {
			java.text.SimpleDateFormat EncLocationPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncLocationPeriodStartdate = EncLocationPeriodStartsdf.parse(e.getEncLocationPeriodStart());
			encounteraddlocationsetperiod.setStart(EncLocationPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddlocationsetphysicaltype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteraddlocation.setPhysicalType(encounteraddlocationsetphysicaltype);


		org.hl7.fhir.r4.model.Coding encounteraddlocationsetphysicaltypeaddcoding = encounteraddlocationsetphysicaltype.addCoding();

		/******************** Enc_Location_PhysicalType_Coding_Code ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingCode() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setCode(e.getEncLocationPhysicalTypeCodingCode());
		}
		/******************** Enc_Location_PhysicalType_Coding_Display ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingDisplay() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setDisplay(e.getEncLocationPhysicalTypeCodingDisplay());
		}
		/******************** Enc_Location_PhysicalType_Coding_System ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingSystem() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setSystem(e.getEncLocationPhysicalTypeCodingSystem());
		}
		/******************** Enc_Location_PhysicalType_Coding_Usrslt ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingUsrslt() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncLocationPhysicalTypeCodingUsrslt()));
		}
		/******************** Enc_Location_PhysicalType_Coding_Version ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingVersion() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setVersion(e.getEncLocationPhysicalTypeCodingVersion());
		}
		/******************** Enc_Location_PhysicalType_Text ********************************************************************************/
		if(e.getEncLocationPhysicalTypeText() != null) {
			encounteraddlocationsetphysicaltype.setText(e.getEncLocationPhysicalTypeText());
		}

		org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory encounteraddlocationsetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory();

		/******************** Enc_Location_Status_Code ********************************************************************************/
		if(e.getEncLocationStatusCode() != null) {
			encounteraddlocation.setStatus(encounteraddlocationsetstatusEnumFactory.fromCode(e.getEncLocationStatusCode()));

		}
		/******************** Enc_PartOf ********************************************************************************/
		if(e.getEncPartOf() != null) {
			org.hl7.fhir.r4.model.Reference EncPartOfref = new org.hl7.fhir.r4.model.Reference();
			encounter.setPartOf(EncPartOfref.setReference(e.getEncPartOf()));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent encounteraddparticipant = encounter.addParticipant();

		/******************** Enc_Participant_Individual ********************************************************************************/
		if(e.getEncParticipantIndividual() != null) {
			org.hl7.fhir.r4.model.Reference EncParticipantIndividualref = new org.hl7.fhir.r4.model.Reference();
			encounteraddparticipant.setIndividual(EncParticipantIndividualref.setReference(e.getEncParticipantIndividual()));
		}

		org.hl7.fhir.r4.model.Period encounteraddparticipantsetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddparticipant.setPeriod(encounteraddparticipantsetperiod);

		/******************** Enc_Participant_Period_End ********************************************************************************/
		if(e.getEncParticipantPeriodEnd() != null) {
			java.text.SimpleDateFormat EncParticipantPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncParticipantPeriodEnddate = EncParticipantPeriodEndsdf.parse(e.getEncParticipantPeriodEnd());
			encounteraddparticipantsetperiod.setEnd(EncParticipantPeriodEnddate);
		}
		/******************** Enc_Participant_Period_Start ********************************************************************************/
		if(e.getEncParticipantPeriodStart() != null) {
			java.text.SimpleDateFormat EncParticipantPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncParticipantPeriodStartdate = EncParticipantPeriodStartsdf.parse(e.getEncParticipantPeriodStart());
			encounteraddparticipantsetperiod.setStart(EncParticipantPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddparticipantaddtype = encounteraddparticipant.addType();


		org.hl7.fhir.r4.model.Coding encounteraddparticipantaddtypeaddcoding = encounteraddparticipantaddtype.addCoding();

		/******************** Enc_Participant_Type_Coding_Code ********************************************************************************/
		if(e.getEncParticipantTypeCodingCode() != null) {
			encounteraddparticipantaddtypeaddcoding.setCode(e.getEncParticipantTypeCodingCode());
		}
		/******************** Enc_Participant_Type_Coding_Display ********************************************************************************/
		if(e.getEncParticipantTypeCodingDisplay() != null) {
			encounteraddparticipantaddtypeaddcoding.setDisplay(e.getEncParticipantTypeCodingDisplay());
		}
		/******************** Enc_Participant_Type_Coding_System ********************************************************************************/
		if(e.getEncParticipantTypeCodingSystem() != null) {
			encounteraddparticipantaddtypeaddcoding.setSystem(e.getEncParticipantTypeCodingSystem());
		}
		/******************** Enc_Participant_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncParticipantTypeCodingUsrslt() != null) {
			encounteraddparticipantaddtypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncParticipantTypeCodingUsrslt()));
		}
		/******************** Enc_Participant_Type_Coding_Version ********************************************************************************/
		if(e.getEncParticipantTypeCodingVersion() != null) {
			encounteraddparticipantaddtypeaddcoding.setVersion(e.getEncParticipantTypeCodingVersion());
		}
		/******************** Enc_Participant_Type_Text ********************************************************************************/
		if(e.getEncParticipantTypeText() != null) {
			encounteraddparticipantaddtype.setText(e.getEncParticipantTypeText());
		}

		org.hl7.fhir.r4.model.Period encountersetperiod = new org.hl7.fhir.r4.model.Period();
		encounter.setPeriod(encountersetperiod);

		/******************** Enc_Period_End ********************************************************************************/
		if(e.getEncPeriodEnd() != null) {
			java.text.SimpleDateFormat EncPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncPeriodEnddate = EncPeriodEndsdf.parse(e.getEncPeriodEnd());
			encountersetperiod.setEnd(EncPeriodEnddate);
		}
		/******************** Enc_Period_Start ********************************************************************************/
		if(e.getEncPeriodStart() != null) {
			java.text.SimpleDateFormat EncPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncPeriodStartdate = EncPeriodStartsdf.parse(e.getEncPeriodStart());
			encountersetperiod.setStart(EncPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersetpriority = new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setPriority(encountersetpriority);


		org.hl7.fhir.r4.model.Coding encountersetpriorityaddcoding = encountersetpriority.addCoding();

		/******************** Enc_Priority_Coding_Code ********************************************************************************/
		if(e.getEncPriorityCodingCode() != null) {
			encountersetpriorityaddcoding.setCode(e.getEncPriorityCodingCode());
		}
		/******************** Enc_Priority_Coding_Display ********************************************************************************/
		if(e.getEncPriorityCodingDisplay() != null) {
			encountersetpriorityaddcoding.setDisplay(e.getEncPriorityCodingDisplay());
		}
		/******************** Enc_Priority_Coding_System ********************************************************************************/
		if(e.getEncPriorityCodingSystem() != null) {
			encountersetpriorityaddcoding.setSystem(e.getEncPriorityCodingSystem());
		}
		/******************** Enc_Priority_Coding_Usrslt ********************************************************************************/
		if(e.getEncPriorityCodingUsrslt() != null) {
			encountersetpriorityaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncPriorityCodingUsrslt()));
		}
		/******************** Enc_Priority_Coding_Version ********************************************************************************/
		if(e.getEncPriorityCodingVersion() != null) {
			encountersetpriorityaddcoding.setVersion(e.getEncPriorityCodingVersion());
		}
		/******************** Enc_Priority_Text ********************************************************************************/
		if(e.getEncPriorityText() != null) {
			encountersetpriority.setText(e.getEncPriorityText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddreasoncode = encounter.addReasonCode();


		org.hl7.fhir.r4.model.Coding encounteraddreasoncodeaddcoding = encounteraddreasoncode.addCoding();

		/******************** Enc_ReasonCode_Coding_Code ********************************************************************************/
		if(e.getEncReasonCodeCodingCode() != null) {
			encounteraddreasoncodeaddcoding.setCode(e.getEncReasonCodeCodingCode());
		}
		/******************** Enc_ReasonCode_Coding_Display ********************************************************************************/
		if(e.getEncReasonCodeCodingDisplay() != null) {
			encounteraddreasoncodeaddcoding.setDisplay(e.getEncReasonCodeCodingDisplay());
		}
		/******************** Enc_ReasonCode_Coding_System ********************************************************************************/
		if(e.getEncReasonCodeCodingSystem() != null) {
			encounteraddreasoncodeaddcoding.setSystem(e.getEncReasonCodeCodingSystem());
		}
		/******************** Enc_ReasonCode_Coding_Usrslt ********************************************************************************/
		if(e.getEncReasonCodeCodingUsrslt() != null) {
			encounteraddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncReasonCodeCodingUsrslt()));
		}
		/******************** Enc_ReasonCode_Coding_Version ********************************************************************************/
		if(e.getEncReasonCodeCodingVersion() != null) {
			encounteraddreasoncodeaddcoding.setVersion(e.getEncReasonCodeCodingVersion());
		}
		/******************** Enc_ReasonCode_Text ********************************************************************************/
		if(e.getEncReasonCodeText() != null) {
			encounteraddreasoncode.setText(e.getEncReasonCodeText());
		}
		/******************** Enc_ReasonReference ********************************************************************************/
		if(e.getEncReasonReference() != null) {
			org.hl7.fhir.r4.model.Reference EncReasonReferenceref = new org.hl7.fhir.r4.model.Reference();
			encounter.addReasonReference(EncReasonReferenceref.setReference(e.getEncReasonReference()));
		}
		/******************** Enc_ServiceProvider ********************************************************************************/
		if(e.getEncServiceProvider() != null) {
			org.hl7.fhir.r4.model.Reference EncServiceProviderref = new org.hl7.fhir.r4.model.Reference();
			encounter.setServiceProvider(EncServiceProviderref.setReference(e.getEncServiceProvider()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersetservicetype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setServiceType(encountersetservicetype);


		org.hl7.fhir.r4.model.Coding encountersetservicetypeaddcoding = encountersetservicetype.addCoding();

		/******************** Enc_ServiceType_Coding_Code ********************************************************************************/
		if(e.getEncServiceTypeCodingCode() != null) {
			encountersetservicetypeaddcoding.setCode(e.getEncServiceTypeCodingCode());
		}
		/******************** Enc_ServiceType_Coding_Display ********************************************************************************/
		if(e.getEncServiceTypeCodingDisplay() != null) {
			encountersetservicetypeaddcoding.setDisplay(e.getEncServiceTypeCodingDisplay());
		}
		/******************** Enc_ServiceType_Coding_System ********************************************************************************/
		if(e.getEncServiceTypeCodingSystem() != null) {
			encountersetservicetypeaddcoding.setSystem(e.getEncServiceTypeCodingSystem());
		}
		/******************** Enc_ServiceType_Coding_Usrslt ********************************************************************************/
		if(e.getEncServiceTypeCodingUsrslt() != null) {
			encountersetservicetypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncServiceTypeCodingUsrslt()));
		}
		/******************** Enc_ServiceType_Coding_Version ********************************************************************************/
		if(e.getEncServiceTypeCodingVersion() != null) {
			encountersetservicetypeaddcoding.setVersion(e.getEncServiceTypeCodingVersion());
		}
		/******************** Enc_ServiceType_Text ********************************************************************************/
		if(e.getEncServiceTypeText() != null) {
			encountersetservicetype.setText(e.getEncServiceTypeText());
		}

		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encountersetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();

		/******************** Enc_Status_Code ********************************************************************************/
		if(e.getEncStatusCode() != null) {
			encounter.setStatus(encountersetstatusEnumFactory.fromCode(e.getEncStatusCode()));

		}

		org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent encounteraddstatushistory = encounter.addStatusHistory();


		org.hl7.fhir.r4.model.Period encounteraddstatushistorysetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddstatushistory.setPeriod(encounteraddstatushistorysetperiod);

		/******************** Enc_StatusHistory_Period_End ********************************************************************************/
		if(e.getEncStatusHistoryPeriodEnd() != null) {
			java.text.SimpleDateFormat EncStatusHistoryPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncStatusHistoryPeriodEnddate = EncStatusHistoryPeriodEndsdf.parse(e.getEncStatusHistoryPeriodEnd());
			encounteraddstatushistorysetperiod.setEnd(EncStatusHistoryPeriodEnddate);
		}
		/******************** Enc_StatusHistory_Period_Start ********************************************************************************/
		if(e.getEncStatusHistoryPeriodStart() != null) {
			java.text.SimpleDateFormat EncStatusHistoryPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncStatusHistoryPeriodStartdate = EncStatusHistoryPeriodStartsdf.parse(e.getEncStatusHistoryPeriodStart());
			encounteraddstatushistorysetperiod.setStart(EncStatusHistoryPeriodStartdate);
		}

		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encounteraddstatushistorysetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();

		/******************** Enc_StatusHistory_Status_Code ********************************************************************************/
		if(e.getEncStatusHistoryStatusCode() != null) {
			encounteraddstatushistory.setStatus(encounteraddstatushistorysetstatusEnumFactory.fromCode(e.getEncStatusHistoryStatusCode()));

		}
		/******************** Enc_Subject ********************************************************************************/
		if(e.getEncSubject() != null) {
			org.hl7.fhir.r4.model.Reference EncSubjectref = new org.hl7.fhir.r4.model.Reference();
			encounter.setSubject(EncSubjectref.setReference(e.getEncSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddtype = encounter.addType();


		org.hl7.fhir.r4.model.Coding encounteraddtypeaddcoding = encounteraddtype.addCoding();

		/******************** Enc_Type_Coding_Code ********************************************************************************/
		if(e.getEncTypeCodingCode() != null) {
			encounteraddtypeaddcoding.setCode(e.getEncTypeCodingCode());
		}
		/******************** Enc_Type_Coding_Display ********************************************************************************/
		if(e.getEncTypeCodingDisplay() != null) {
			encounteraddtypeaddcoding.setDisplay(e.getEncTypeCodingDisplay());
		}
		/******************** Enc_Type_Coding_System ********************************************************************************/
		if(e.getEncTypeCodingSystem() != null) {
			encounteraddtypeaddcoding.setSystem(e.getEncTypeCodingSystem());
		}
		/******************** Enc_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncTypeCodingUsrslt() != null) {
			encounteraddtypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncTypeCodingUsrslt()));
		}
		/******************** Enc_Type_Coding_Version ********************************************************************************/
		if(e.getEncTypeCodingVersion() != null) {
			encounteraddtypeaddcoding.setVersion(e.getEncTypeCodingVersion());
		}
		/******************** Enc_Type_Text ********************************************************************************/
		if(e.getEncTypeText() != null) {
			encounteraddtype.setText(e.getEncTypeText());
		}
		return encounter;
	}
}
