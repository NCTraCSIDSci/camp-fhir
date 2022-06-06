drop table if exists `Practitioner`;
CREATE TABLE `Practitioner` (
 id varchar(64),
Prctitnr_Active TEXT,
Prctitnr_Addr_City TEXT,
Prctitnr_Addr_Cntry TEXT,
Prctitnr_Addr_District TEXT,
Prctitnr_Addr_Line TEXT,
Prctitnr_Addr_Prd_End TEXT,
Prctitnr_Addr_Prd_Strt TEXT,
Prctitnr_Addr_PostalCd TEXT,
Prctitnr_Addr_State TEXT,
Prctitnr_Addr_Txt TEXT,
Prctitnr_Addr_Typ TEXT,
Prctitnr_Addr_Use TEXT,
Prctitnr_BirthDt TEXT,
Prctitnr_Cmmnctn_Cdg_Cd TEXT,
Prctitnr_Cmmnctn_Cdg_Dsply TEXT,
Prctitnr_Cmmnctn_Cdg_Sys TEXT,
Prctitnr_Cmmnctn_Cdg_UsrSltd TEXT,
Prctitnr_Cmmnctn_Cdg_Vrsn TEXT,
Prctitnr_Cmmnctn_Txt TEXT,
Prctitnr_Gender TEXT,
Prctitnr_Id_Assigner TEXT,
Prctitnr_Id_Prd_End TEXT,
Prctitnr_Id_Prd_Strt TEXT,
Prctitnr_Id_Sys TEXT,
Prctitnr_Id_Typ_Cdg_Cd TEXT,
Prctitnr_Id_Typ_Cdg_Dsply TEXT,
Prctitnr_Id_Typ_Cdg_Sys TEXT,
Prctitnr_Id_Typ_Cdg_UsrSltd TEXT,
Prctitnr_Id_Typ_Cdg_Vrsn TEXT,
Prctitnr_Id_Typ_Txt TEXT,
Prctitnr_Id_Use TEXT,
Prctitnr_Id_Vl TEXT,
Prctitnr_Nm_Fmly TEXT,
Prctitnr_Nm_Given TEXT,
Prctitnr_Nm_Prd_End TEXT,
Prctitnr_Nm_Prd_Strt TEXT,
Prctitnr_Nm_Prefix TEXT,
Prctitnr_Nm_Suffix TEXT,
Prctitnr_Nm_Txt TEXT,
Prctitnr_Nm_Use TEXT,
Prctitnr_Photo_CntntTyp TEXT,
Prctitnr_Photo_Creation TEXT,
Prctitnr_Photo_Data TEXT,
Prctitnr_Photo_Hash TEXT,
Prctitnr_Photo_Lnguage TEXT,
Prctitnr_Photo_Sz TEXT,
Prctitnr_Photo_Ttl TEXT,
Prctitnr_Photo_Url TEXT,
Prctitnr_Qualification_Cd_Cdg_Cd TEXT,
Prctitnr_Qualification_Cd_Cdg_Dsply TEXT,
Prctitnr_Qualification_Cd_Cdg_Sys TEXT,
Prctitnr_Qualification_Cd_Cdg_UsrSltd TEXT,
Prctitnr_Qualification_Cd_Cdg_Vrsn TEXT,
Prctitnr_Qualification_Cd_Txt TEXT,
Prctitnr_Qualification_Id_Assigner TEXT,
Prctitnr_Qualification_Id_Prd_End TEXT,
Prctitnr_Qualification_Id_Prd_Strt TEXT,
Prctitnr_Qualification_Id_Sys TEXT,
Prctitnr_Qualification_Id_Typ_Cdg_Cd TEXT,
Prctitnr_Qualification_Id_Typ_Cdg_Dsply TEXT,
Prctitnr_Qualification_Id_Typ_Cdg_Sys TEXT,
Prctitnr_Qualification_Id_Typ_Cdg_UsrSltd TEXT,
Prctitnr_Qualification_Id_Typ_Cdg_Vrsn TEXT,
Prctitnr_Qualification_Id_Typ_Txt TEXT,
Prctitnr_Qualification_Id_Use TEXT,
Prctitnr_Qualification_Id_Vl TEXT,
Prctitnr_Qualification_Issuer TEXT,
Prctitnr_Qualification_Prd_End TEXT,
Prctitnr_Qualification_Prd_Strt TEXT,
Prctitnr_Tlcm_Prd_End TEXT,
Prctitnr_Tlcm_Prd_Strt TEXT,
Prctitnr_Tlcm_Rnk TEXT,
Prctitnr_Tlcm_Sys TEXT,
Prctitnr_Tlcm_Use TEXT,
Prctitnr_Tlcm_Vl TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;