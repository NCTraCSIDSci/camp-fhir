drop table if exists `Appointment`;
CREATE TABLE `Appointment` (
 id varchar(64),
Appmnt_AppmntTyp_Cdg_Cd TEXT,
Appmnt_AppmntTyp_Cdg_Dsply TEXT,
Appmnt_AppmntTyp_Cdg_Sys TEXT,
Appmnt_AppmntTyp_Cdg_UsrSltd TEXT,
Appmnt_AppmntTyp_Cdg_Vrsn TEXT,
Appmnt_AppmntTyp_Txt TEXT,
Appmnt_BasedOn TEXT,
Appmnt_CancelationRsn_Cdg_Cd TEXT,
Appmnt_CancelationRsn_Cdg_Dsply TEXT,
Appmnt_CancelationRsn_Cdg_Sys TEXT,
Appmnt_CancelationRsn_Cdg_UsrSltd TEXT,
Appmnt_CancelationRsn_Cdg_Vrsn TEXT,
Appmnt_CancelationRsn_Txt TEXT,
Appmnt_Comment TEXT,
Appmnt_Created TEXT,
Appmnt_Dscrptn TEXT,
Appmnt_End TEXT,
Appmnt_Id_Assigner TEXT,
Appmnt_Id_Prd_End TEXT,
Appmnt_Id_Prd_Strt TEXT,
Appmnt_Id_Sys TEXT,
Appmnt_Id_Typ_Cdg_Cd TEXT,
Appmnt_Id_Typ_Cdg_Dsply TEXT,
Appmnt_Id_Typ_Cdg_Sys TEXT,
Appmnt_Id_Typ_Cdg_UsrSltd TEXT,
Appmnt_Id_Typ_Cdg_Vrsn TEXT,
Appmnt_Id_Typ_Txt TEXT,
Appmnt_Id_Use TEXT,
Appmnt_Id_Vl TEXT,
Appmnt_MinutesDuration TEXT,
Appmnt_Prtcpnt_Actor TEXT,
Appmnt_Prtcpnt_Prd_End TEXT,
Appmnt_Prtcpnt_Prd_Strt TEXT,
Appmnt_Prtcpnt_Required TEXT,
Appmnt_Prtcpnt_Sts TEXT,
Appmnt_Prtcpnt_Typ_Cdg_Cd TEXT,
Appmnt_Prtcpnt_Typ_Cdg_Dsply TEXT,
Appmnt_Prtcpnt_Typ_Cdg_Sys TEXT,
Appmnt_Prtcpnt_Typ_Cdg_UsrSltd TEXT,
Appmnt_Prtcpnt_Typ_Cdg_Vrsn TEXT,
Appmnt_Prtcpnt_Typ_Txt TEXT,
Appmnt_PntInstrctn TEXT,
Appmnt_Priority TEXT,
Appmnt_RsnCd_Cdg_Cd TEXT,
Appmnt_RsnCd_Cdg_Dsply TEXT,
Appmnt_RsnCd_Cdg_Sys TEXT,
Appmnt_RsnCd_Cdg_UsrSltd TEXT,
Appmnt_RsnCd_Cdg_Vrsn TEXT,
Appmnt_RsnCd_Txt TEXT,
Appmnt_RsnRfrnc TEXT,
Appmnt_RqstedPrd_End TEXT,
Appmnt_RqstedPrd_Strt TEXT,
Appmnt_SrvCtgry_Cdg_Cd TEXT,
Appmnt_SrvCtgry_Cdg_Dsply TEXT,
Appmnt_SrvCtgry_Cdg_Sys TEXT,
Appmnt_SrvCtgry_Cdg_UsrSltd TEXT,
Appmnt_SrvCtgry_Cdg_Vrsn TEXT,
Appmnt_SrvCtgry_Txt TEXT,
Appmnt_SrvTyp_Cdg_Cd TEXT,
Appmnt_SrvTyp_Cdg_Dsply TEXT,
Appmnt_SrvTyp_Cdg_Sys TEXT,
Appmnt_SrvTyp_Cdg_UsrSltd TEXT,
Appmnt_SrvTyp_Cdg_Vrsn TEXT,
Appmnt_SrvTyp_Txt TEXT,
Appmnt_Slot TEXT,
Appmnt_Spclty_Cdg_Cd TEXT,
Appmnt_Spclty_Cdg_Dsply TEXT,
Appmnt_Spclty_Cdg_Sys TEXT,
Appmnt_Spclty_Cdg_UsrSltd TEXT,
Appmnt_Spclty_Cdg_Vrsn TEXT,
Appmnt_Spclty_Txt TEXT,
Appmnt_Strt TEXT,
Appmnt_Sts TEXT,
Appmnt_SprtingInfo TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;