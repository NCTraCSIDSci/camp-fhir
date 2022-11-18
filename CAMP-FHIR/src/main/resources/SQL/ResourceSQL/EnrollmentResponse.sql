drop table if exists `EnrollmentResponse`;
CREATE TABLE `EnrollmentResponse` (
 id varchar(64),
EnrollmentRsps_Created TEXT COMMENT 'EnrollmentResponse.Created',
EnrollmentRsps_Disposition TEXT COMMENT 'EnrollmentResponse.Disposition',
EnrollmentRsps_Id_Assigner TEXT COMMENT 'EnrollmentResponse.Identifier.Assigner',
EnrollmentRsps_Id_Prd_End TEXT COMMENT 'EnrollmentResponse.Identifier.Period.End',
EnrollmentRsps_Id_Prd_Strt TEXT COMMENT 'EnrollmentResponse.Identifier.Period.Start',
EnrollmentRsps_Id_Sys TEXT COMMENT 'EnrollmentResponse.Identifier.System',
EnrollmentRsps_Id_Typ_Cdg_Cd TEXT COMMENT 'EnrollmentResponse.Identifier.Type.Coding.Code',
EnrollmentRsps_Id_Typ_Cdg_Dsply TEXT COMMENT 'EnrollmentResponse.Identifier.Type.Coding.Display',
EnrollmentRsps_Id_Typ_Cdg_Sys TEXT COMMENT 'EnrollmentResponse.Identifier.Type.Coding.System',
EnrollmentRsps_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'EnrollmentResponse.Identifier.Type.Coding.UserSelected',
EnrollmentRsps_Id_Typ_Cdg_Vrsn TEXT COMMENT 'EnrollmentResponse.Identifier.Type.Coding.Version',
EnrollmentRsps_Id_Typ_Txt TEXT COMMENT 'EnrollmentResponse.Identifier.Type.Text',
EnrollmentRsps_Id_Use TEXT COMMENT 'EnrollmentResponse.Identifier.Use',
EnrollmentRsps_Id_Vl TEXT COMMENT 'EnrollmentResponse.Identifier.Value',
EnrollmentRsps_Orgnztn TEXT COMMENT 'EnrollmentResponse.Organization',
EnrollmentRsps_Outcome TEXT COMMENT 'EnrollmentResponse.Outcome',
EnrollmentRsps_Rqst TEXT COMMENT 'EnrollmentResponse.Request',
EnrollmentRsps_RqstProvider TEXT COMMENT 'EnrollmentResponse.RequestProvider',
EnrollmentRsps_Sts TEXT COMMENT 'EnrollmentResponse.Status',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;