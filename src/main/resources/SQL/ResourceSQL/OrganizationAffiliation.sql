drop table if exists `OrganizationAffiliation`;
CREATE TABLE `OrganizationAffiliation` (
 id varchar(64),
OrgnztnAffiliation_Active TEXT,
OrgnztnAffiliation_Cd_Cdg_Cd TEXT,
OrgnztnAffiliation_Cd_Cdg_Dsply TEXT,
OrgnztnAffiliation_Cd_Cdg_Sys TEXT,
OrgnztnAffiliation_Cd_Cdg_UsrSltd TEXT,
OrgnztnAffiliation_Cd_Cdg_Vrsn TEXT,
OrgnztnAffiliation_Cd_Txt TEXT,
OrgnztnAffiliation_Endpoint TEXT,
OrgnztnAffiliation_HlthcrSrv TEXT,
OrgnztnAffiliation_Id_Assigner TEXT,
OrgnztnAffiliation_Id_Prd_End TEXT,
OrgnztnAffiliation_Id_Prd_Strt TEXT,
OrgnztnAffiliation_Id_Sys TEXT,
OrgnztnAffiliation_Id_Typ_Cdg_Cd TEXT,
OrgnztnAffiliation_Id_Typ_Cdg_Dsply TEXT,
OrgnztnAffiliation_Id_Typ_Cdg_Sys TEXT,
OrgnztnAffiliation_Id_Typ_Cdg_UsrSltd TEXT,
OrgnztnAffiliation_Id_Typ_Cdg_Vrsn TEXT,
OrgnztnAffiliation_Id_Typ_Txt TEXT,
OrgnztnAffiliation_Id_Use TEXT,
OrgnztnAffiliation_Id_Vl TEXT,
OrgnztnAffiliation_Lctn TEXT,
OrgnztnAffiliation_Network TEXT,
OrgnztnAffiliation_Orgnztn TEXT,
OrgnztnAffiliation_ParticipatingOrgnztn TEXT,
OrgnztnAffiliation_Prd_End TEXT,
OrgnztnAffiliation_Prd_Strt TEXT,
OrgnztnAffiliation_Spclty_Cdg_Cd TEXT,
OrgnztnAffiliation_Spclty_Cdg_Dsply TEXT,
OrgnztnAffiliation_Spclty_Cdg_Sys TEXT,
OrgnztnAffiliation_Spclty_Cdg_UsrSltd TEXT,
OrgnztnAffiliation_Spclty_Cdg_Vrsn TEXT,
OrgnztnAffiliation_Spclty_Txt TEXT,
OrgnztnAffiliation_Tlcm_Prd_End TEXT,
OrgnztnAffiliation_Tlcm_Prd_Strt TEXT,
OrgnztnAffiliation_Tlcm_Rnk TEXT,
OrgnztnAffiliation_Tlcm_Sys TEXT,
OrgnztnAffiliation_Tlcm_Use TEXT,
OrgnztnAffiliation_Tlcm_Vl TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;