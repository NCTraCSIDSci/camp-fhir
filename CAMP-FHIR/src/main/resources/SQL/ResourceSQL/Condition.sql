drop table if exists `condition`;
CREATE TABLE `condition` (
 id varchar(64),
Condition_Abatement TEXT,
Condition_AbatementDateTime TEXT,
Condition_Abatement_Period_End TEXT,
Condition_Abatement_Period_Start TEXT,
Condition_Abatement_Range_High_Code TEXT,
Condition_Abatement_Range_High_Compartr_Code TEXT,
Condition_Abatement_Range_High_System TEXT,
Condition_Abatement_Range_High_Unit TEXT,
Condition_Abatement_Range_High_Value TEXT,
Condition_Abatement_Range_Low_Code TEXT,
Condition_Abatement_Range_Low_Compartr_Code TEXT,
Condition_Abatement_Range_Low_System TEXT,
Condition_Abatement_Range_Low_Unit TEXT,
Condition_Abatement_Range_Low_Value TEXT,
Condition_AbatementString TEXT,
Condition_Asserter TEXT,
Condition_BodySite_Coding_Code TEXT,
Condition_BodySite_Coding_Display TEXT,
Condition_BodySite_Coding_System TEXT,
Condition_BodySite_Coding_Usrslt TEXT,
Condition_BodySite_Coding_Version TEXT,
Condition_BodySite_Text TEXT,
Condition_Category_Coding_Code TEXT,
Condition_Category_Coding_Display TEXT,
Condition_Category_Coding_System TEXT,
Condition_Category_Coding_Usrslt TEXT,
Condition_Category_Coding_Version TEXT,
Condition_Category_Text TEXT,
Condition_ClinicalStatus_Coding_Code TEXT,
Condition_ClinicalStatus_Coding_Display TEXT,
Condition_ClinicalStatus_Coding_System TEXT,
Condition_ClinicalStatus_Coding_Usrslt TEXT,
Condition_ClinicalStatus_Coding_Version TEXT,
Condition_ClinicalStatus_Text TEXT,
Condition_Code_Coding_Code TEXT,
Condition_Code_Coding_Display TEXT,
Condition_Code_Coding_System TEXT,
Condition_Code_Coding_Usrslt TEXT,
Condition_Code_Coding_Version TEXT,
Condition_Code_Text TEXT,
Condition_Enc TEXT,
Condition_Evidence_Code_Coding_Code TEXT,
Condition_Evidence_Code_Coding_Display TEXT,
Condition_Evidence_Code_Coding_System TEXT,
Condition_Evidence_Code_Coding_Usrslt TEXT,
Condition_Evidence_Code_Coding_Version TEXT,
Condition_Evidence_Code_Text TEXT,
Condition_Evidence_Detail TEXT,
Condition_Id_Assigner TEXT,
Condition_Id_Period_End TEXT,
Condition_Id_Period_Start TEXT,
Condition_Id_System TEXT,
Condition_Id_Type_Coding_Code TEXT,
Condition_Id_Type_Coding_Display TEXT,
Condition_Id_Type_Coding_System TEXT,
Condition_Id_Type_Coding_Usrslt TEXT,
Condition_Id_Type_Coding_Version TEXT,
Condition_Id_Type_Text TEXT,
Condition_Id_Use_Code TEXT,
Condition_Id_Value TEXT,
Condition_Note_AuthorReference TEXT,
Condition_Note_AuthorString TEXT,
Condition_Note_Text TEXT,
Condition_Note_Time TEXT,
Condition_On TEXT,
Condition_OnDateTime TEXT,
Condition_On_Period_End TEXT,
Condition_On_Period_Start TEXT,
Condition_On_Range_High_Code TEXT,
Condition_On_Range_High_Compartr_Code TEXT,
Condition_On_Range_High_System TEXT,
Condition_On_Range_High_Unit TEXT,
Condition_On_Range_High_Value TEXT,
Condition_On_Range_Low_Code TEXT,
Condition_On_Range_Low_Compartr_Code TEXT,
Condition_On_Range_Low_System TEXT,
Condition_On_Range_Low_Unit TEXT,
Condition_On_Range_Low_Value TEXT,
Condition_OnString TEXT,
Condition_RecordedDate TEXT,
Condition_Recorder TEXT,
Condition_Severity_Coding_Code TEXT,
Condition_Severity_Coding_Display TEXT,
Condition_Severity_Coding_System TEXT,
Condition_Severity_Coding_Usrslt TEXT,
Condition_Severity_Coding_Version TEXT,
Condition_Severity_Text TEXT,
Condition_Stage_Assessment TEXT,
Condition_Stage_Summary_Coding_Code TEXT,
Condition_Stage_Summary_Coding_Display TEXT,
Condition_Stage_Summary_Coding_System TEXT,
Condition_Stage_Summary_Coding_Usrslt TEXT,
Condition_Stage_Summary_Coding_Version TEXT,
Condition_Stage_Summary_Text TEXT,
Condition_Stage_Type_Coding_Code TEXT,
Condition_Stage_Type_Coding_Display TEXT,
Condition_Stage_Type_Coding_System TEXT,
Condition_Stage_Type_Coding_Usrslt TEXT,
Condition_Stage_Type_Coding_Version TEXT,
Condition_Stage_Type_Text TEXT,
Condition_Subject TEXT,
Condition_VerificationStatus_Coding_Code TEXT,
Condition_VerificationStatus_Coding_Display TEXT,
Condition_VerificationStatus_Coding_System TEXT,
Condition_VerificationStatus_Coding_Usrslt TEXT,
Condition_VerificationStatus_Coding_Version TEXT,
Condition_VerificationStatus_Text TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;