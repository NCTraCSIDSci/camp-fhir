drop table if exists `EnrollmentResponse`;
CREATE TABLE `EnrollmentResponse` (
 id varchar(64),
EnrollmentRsps_Created TEXT,
EnrollmentRsps_Disposition TEXT,
EnrollmentRsps_Id_Assigner TEXT,
EnrollmentRsps_Id_Prd_End TEXT,
EnrollmentRsps_Id_Prd_Strt TEXT,
EnrollmentRsps_Id_Sys TEXT,
EnrollmentRsps_Id_Typ_Cdg_Cd TEXT,
EnrollmentRsps_Id_Typ_Cdg_Dsply TEXT,
EnrollmentRsps_Id_Typ_Cdg_Sys TEXT,
EnrollmentRsps_Id_Typ_Cdg_UsrSltd TEXT,
EnrollmentRsps_Id_Typ_Cdg_Vrsn TEXT,
EnrollmentRsps_Id_Typ_Txt TEXT,
EnrollmentRsps_Id_Use TEXT,
EnrollmentRsps_Id_Vl TEXT,
EnrollmentRsps_Orgnztn TEXT,
EnrollmentRsps_Outcome TEXT,
EnrollmentRsps_Rqst TEXT,
EnrollmentRsps_RqstProvider TEXT,
EnrollmentRsps_Sts TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;