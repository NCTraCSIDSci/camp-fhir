drop table if exists `EnrollmentRequest`;
CREATE TABLE `EnrollmentRequest` (
 id varchar(64),
EnrollmentRqst_Candidate TEXT,
EnrollmentRqst_Cvg TEXT,
EnrollmentRqst_Created TEXT,
EnrollmentRqst_Id_Assigner TEXT,
EnrollmentRqst_Id_Prd_End TEXT,
EnrollmentRqst_Id_Prd_Strt TEXT,
EnrollmentRqst_Id_Sys TEXT,
EnrollmentRqst_Id_Typ_Cdg_Cd TEXT,
EnrollmentRqst_Id_Typ_Cdg_Dsply TEXT,
EnrollmentRqst_Id_Typ_Cdg_Sys TEXT,
EnrollmentRqst_Id_Typ_Cdg_UsrSltd TEXT,
EnrollmentRqst_Id_Typ_Cdg_Vrsn TEXT,
EnrollmentRqst_Id_Typ_Txt TEXT,
EnrollmentRqst_Id_Use TEXT,
EnrollmentRqst_Id_Vl TEXT,
EnrollmentRqst_Insurer TEXT,
EnrollmentRqst_Provider TEXT,
EnrollmentRqst_Sts TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;