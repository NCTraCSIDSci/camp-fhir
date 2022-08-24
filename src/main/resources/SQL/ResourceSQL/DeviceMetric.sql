drop table if exists `DeviceMetric`;
CREATE TABLE `DeviceMetric` (
 id varchar(64),
DvcMetric_Calibration_State TEXT,
DvcMetric_Calibration_Time TEXT,
DvcMetric_Calibration_Typ TEXT,
DvcMetric_Ctgry TEXT,
DvcMetric_Color TEXT,
DvcMetric_Id_Assigner TEXT,
DvcMetric_Id_Prd_End TEXT,
DvcMetric_Id_Prd_Strt TEXT,
DvcMetric_Id_Sys TEXT,
DvcMetric_Id_Typ_Cdg_Cd TEXT,
DvcMetric_Id_Typ_Cdg_Dsply TEXT,
DvcMetric_Id_Typ_Cdg_Sys TEXT,
DvcMetric_Id_Typ_Cdg_UsrSltd TEXT,
DvcMetric_Id_Typ_Cdg_Vrsn TEXT,
DvcMetric_Id_Typ_Txt TEXT,
DvcMetric_Id_Use TEXT,
DvcMetric_Id_Vl TEXT,
DvcMetric_MsrmentPrd_Cd_Cdg_Cd TEXT,
DvcMetric_MsrmentPrd_Cd_Cdg_Dsply TEXT,
DvcMetric_MsrmentPrd_Cd_Cdg_Sys TEXT,
DvcMetric_MsrmentPrd_Cd_Cdg_UsrSltd TEXT,
DvcMetric_MsrmentPrd_Cd_Cdg_Vrsn TEXT,
DvcMetric_MsrmentPrd_Cd_Txt TEXT,
DvcMetric_MsrmentPrd_Evnt TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsDuration_Cd TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsDuration_Cmprtr TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsDuration_Sys TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsDuration_Unt TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsDuration_Vl TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsPrd_End TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strt TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cd TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cmprtr TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Sys TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Unt TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Vl TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cd TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cmprtr TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Sys TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Unt TEXT,
DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Vl TEXT,
DvcMetric_MsrmentPrd_Rpt_Cnt TEXT,
DvcMetric_MsrmentPrd_Rpt_CntMx TEXT,
DvcMetric_MsrmentPrd_Rpt_Duration TEXT,
DvcMetric_MsrmentPrd_Rpt_DurationMx TEXT,
DvcMetric_MsrmentPrd_Rpt_DurationUnt TEXT,
DvcMetric_MsrmentPrd_Rpt_Frqncy TEXT,
DvcMetric_MsrmentPrd_Rpt_FrqncyMx TEXT,
DvcMetric_MsrmentPrd_Rpt_Off TEXT,
DvcMetric_MsrmentPrd_Rpt_Prd TEXT,
DvcMetric_MsrmentPrd_Rpt_PrdMx TEXT,
DvcMetric_MsrmentPrd_Rpt_PrdUnt TEXT,
DvcMetric_MsrmentPrd_Rpt_TimeOfDay TEXT,
DvcMetric_OprtnalSts TEXT,
DvcMetric_Parent TEXT,
DvcMetric_Src TEXT,
DvcMetric_Typ_Cdg_Cd TEXT,
DvcMetric_Typ_Cdg_Dsply TEXT,
DvcMetric_Typ_Cdg_Sys TEXT,
DvcMetric_Typ_Cdg_UsrSltd TEXT,
DvcMetric_Typ_Cdg_Vrsn TEXT,
DvcMetric_Typ_Txt TEXT,
DvcMetric_Unt_Cdg_Cd TEXT,
DvcMetric_Unt_Cdg_Dsply TEXT,
DvcMetric_Unt_Cdg_Sys TEXT,
DvcMetric_Unt_Cdg_UsrSltd TEXT,
DvcMetric_Unt_Cdg_Vrsn TEXT,
DvcMetric_Unt_Txt TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;