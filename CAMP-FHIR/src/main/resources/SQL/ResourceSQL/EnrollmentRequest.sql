drop table if exists `EnrollmentRequest`;
CREATE TABLE `EnrollmentRequest` (
 id varchar(64),
EnrollmentRqst_Candidate TEXT COMMENT 'EnrollmentRequest.Candidate',
EnrollmentRqst_Cvg TEXT COMMENT 'EnrollmentRequest.Coverage',
EnrollmentRqst_Created TEXT COMMENT 'EnrollmentRequest.Created',
EnrollmentRqst_Id_Assigner TEXT COMMENT 'EnrollmentRequest.Identifier.Assigner',
EnrollmentRqst_Id_Prd_End TEXT COMMENT 'EnrollmentRequest.Identifier.Period.End',
EnrollmentRqst_Id_Prd_Strt TEXT COMMENT 'EnrollmentRequest.Identifier.Period.Start',
EnrollmentRqst_Id_Sys TEXT COMMENT 'EnrollmentRequest.Identifier.System',
EnrollmentRqst_Id_Typ_Cdg_Cd TEXT COMMENT 'EnrollmentRequest.Identifier.Type.Coding.Code',
EnrollmentRqst_Id_Typ_Cdg_Dsply TEXT COMMENT 'EnrollmentRequest.Identifier.Type.Coding.Display',
EnrollmentRqst_Id_Typ_Cdg_Sys TEXT COMMENT 'EnrollmentRequest.Identifier.Type.Coding.System',
EnrollmentRqst_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'EnrollmentRequest.Identifier.Type.Coding.UserSelected',
EnrollmentRqst_Id_Typ_Cdg_Vrsn TEXT COMMENT 'EnrollmentRequest.Identifier.Type.Coding.Version',
EnrollmentRqst_Id_Typ_Txt TEXT COMMENT 'EnrollmentRequest.Identifier.Type.Text',
EnrollmentRqst_Id_Use TEXT COMMENT 'EnrollmentRequest.Identifier.Use',
EnrollmentRqst_Id_Vl TEXT COMMENT 'EnrollmentRequest.Identifier.Value',
EnrollmentRqst_Insurer TEXT COMMENT 'EnrollmentRequest.Insurer',
EnrollmentRqst_Provider TEXT COMMENT 'EnrollmentRequest.Provider',
EnrollmentRqst_Sts TEXT COMMENT 'EnrollmentRequest.Status',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;