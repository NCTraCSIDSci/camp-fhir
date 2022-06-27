drop table if exists `Device`;
CREATE TABLE `Device` (
 id varchar(64),
Dvc_Cntct_Prd_End TEXT,
Dvc_Cntct_Prd_Strt TEXT,
Dvc_Cntct_Rnk TEXT,
Dvc_Cntct_Sys TEXT,
Dvc_Cntct_Use TEXT,
Dvc_Cntct_Vl TEXT,
Dvc_Dfn TEXT,
Dvc_DvcNm_Nm TEXT,
Dvc_DvcNm_Typ TEXT,
Dvc_DistinctId TEXT,
Dvc_ExpirationDt TEXT,
Dvc_Id_Assigner TEXT,
Dvc_Id_Prd_End TEXT,
Dvc_Id_Prd_Strt TEXT,
Dvc_Id_Sys TEXT,
Dvc_Id_Typ_Cdg_Cd TEXT,
Dvc_Id_Typ_Cdg_Dsply TEXT,
Dvc_Id_Typ_Cdg_Sys TEXT,
Dvc_Id_Typ_Cdg_UsrSltd TEXT,
Dvc_Id_Typ_Cdg_Vrsn TEXT,
Dvc_Id_Typ_Txt TEXT,
Dvc_Id_Use TEXT,
Dvc_Id_Vl TEXT,
Dvc_Lctn TEXT,
Dvc_LotNmbr TEXT,
Dvc_ManufactureDt TEXT,
Dvc_Manufacturer TEXT,
Dvc_ModelNmbr TEXT,
Dvc_Nt_AthrRfrnc TEXT,
Dvc_Nt_AthrStrgTyp TEXT,
Dvc_Nt_Txt TEXT,
Dvc_Nt_Time TEXT,
Dvc_Owner TEXT,
Dvc_Parent TEXT,
Dvc_PartNmbr TEXT,
Dvc_Pnt TEXT,
Dvc_Prpty_Typ_Cdg_Cd TEXT,
Dvc_Prpty_Typ_Cdg_Dsply TEXT,
Dvc_Prpty_Typ_Cdg_Sys TEXT,
Dvc_Prpty_Typ_Cdg_UsrSltd TEXT,
Dvc_Prpty_Typ_Cdg_Vrsn TEXT,
Dvc_Prpty_Typ_Txt TEXT,
Dvc_Prpty_VlCd_Cdg_Cd TEXT,
Dvc_Prpty_VlCd_Cdg_Dsply TEXT,
Dvc_Prpty_VlCd_Cdg_Sys TEXT,
Dvc_Prpty_VlCd_Cdg_UsrSltd TEXT,
Dvc_Prpty_VlCd_Cdg_Vrsn TEXT,
Dvc_Prpty_VlCd_Txt TEXT,
Dvc_Prpty_VlQnty_Cd TEXT,
Dvc_Prpty_VlQnty_Cmprtr TEXT,
Dvc_Prpty_VlQnty_Sys TEXT,
Dvc_Prpty_VlQnty_Unt TEXT,
Dvc_Prpty_VlQnty_Vl TEXT,
Dvc_Safety_Cdg_Cd TEXT,
Dvc_Safety_Cdg_Dsply TEXT,
Dvc_Safety_Cdg_Sys TEXT,
Dvc_Safety_Cdg_UsrSltd TEXT,
Dvc_Safety_Cdg_Vrsn TEXT,
Dvc_Safety_Txt TEXT,
Dvc_SerialNmbr TEXT,
Dvc_Spclization_SysTyp_Cdg_Cd TEXT,
Dvc_Spclization_SysTyp_Cdg_Dsply TEXT,
Dvc_Spclization_SysTyp_Cdg_Sys TEXT,
Dvc_Spclization_SysTyp_Cdg_UsrSltd TEXT,
Dvc_Spclization_SysTyp_Cdg_Vrsn TEXT,
Dvc_Spclization_SysTyp_Txt TEXT,
Dvc_Spclization_Vrsn TEXT,
Dvc_Sts TEXT,
Dvc_StsRsn_Cdg_Cd TEXT,
Dvc_StsRsn_Cdg_Dsply TEXT,
Dvc_StsRsn_Cdg_Sys TEXT,
Dvc_StsRsn_Cdg_UsrSltd TEXT,
Dvc_StsRsn_Cdg_Vrsn TEXT,
Dvc_StsRsn_Txt TEXT,
Dvc_Typ_Cdg_Cd TEXT,
Dvc_Typ_Cdg_Dsply TEXT,
Dvc_Typ_Cdg_Sys TEXT,
Dvc_Typ_Cdg_UsrSltd TEXT,
Dvc_Typ_Cdg_Vrsn TEXT,
Dvc_Typ_Txt TEXT,
Dvc_UdiCarrier_CarrierAidc TEXT,
Dvc_UdiCarrier_CarrierHrf TEXT,
Dvc_UdiCarrier_DvcId TEXT,
Dvc_UdiCarrier_EntryTyp TEXT,
Dvc_UdiCarrier_Issuer TEXT,
Dvc_UdiCarrier_Jrsdctn TEXT,
Dvc_Url TEXT,
Dvc_Vrsn_Cmpnt_Assigner TEXT,
Dvc_Vrsn_Cmpnt_Prd_End TEXT,
Dvc_Vrsn_Cmpnt_Prd_Strt TEXT,
Dvc_Vrsn_Cmpnt_Sys TEXT,
Dvc_Vrsn_Cmpnt_Typ_Cdg_Cd TEXT,
Dvc_Vrsn_Cmpnt_Typ_Cdg_Dsply TEXT,
Dvc_Vrsn_Cmpnt_Typ_Cdg_Sys TEXT,
Dvc_Vrsn_Cmpnt_Typ_Cdg_UsrSltd TEXT,
Dvc_Vrsn_Cmpnt_Typ_Cdg_Vrsn TEXT,
Dvc_Vrsn_Cmpnt_Typ_Txt TEXT,
Dvc_Vrsn_Cmpnt_Use TEXT,
Dvc_Vrsn_Cmpnt_Vl TEXT,
Dvc_Vrsn_Typ_Cdg_Cd TEXT,
Dvc_Vrsn_Typ_Cdg_Dsply TEXT,
Dvc_Vrsn_Typ_Cdg_Sys TEXT,
Dvc_Vrsn_Typ_Cdg_UsrSltd TEXT,
Dvc_Vrsn_Typ_Cdg_Vrsn TEXT,
Dvc_Vrsn_Typ_Txt TEXT,
Dvc_Vrsn_Vl TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;