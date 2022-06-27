drop table if exists `ChargeItem`;
CREATE TABLE `ChargeItem` (
 id varchar(64),
ChrgItm_Account TEXT,
ChrgItm_Bodysite_Cdg_Cd TEXT,
ChrgItm_Bodysite_Cdg_Dsply TEXT,
ChrgItm_Bodysite_Cdg_Sys TEXT,
ChrgItm_Bodysite_Cdg_UsrSltd TEXT,
ChrgItm_Bodysite_Cdg_Vrsn TEXT,
ChrgItm_Bodysite_Txt TEXT,
ChrgItm_Cd_Cdg_Cd TEXT,
ChrgItm_Cd_Cdg_Dsply TEXT,
ChrgItm_Cd_Cdg_Sys TEXT,
ChrgItm_Cd_Cdg_UsrSltd TEXT,
ChrgItm_Cd_Cdg_Vrsn TEXT,
ChrgItm_Cd_Txt TEXT,
ChrgItm_Cntxt TEXT,
ChrgItm_CstCenter TEXT,
ChrgItm_DfnCanonical TEXT,
ChrgItm_DfnUri TEXT,
ChrgItm_EnteredDt TEXT,
ChrgItm_Enterer TEXT,
ChrgItm_FactorOverride TEXT,
ChrgItm_Id_Assigner TEXT,
ChrgItm_Id_Prd_End TEXT,
ChrgItm_Id_Prd_Strt TEXT,
ChrgItm_Id_Sys TEXT,
ChrgItm_Id_Typ_Cdg_Cd TEXT,
ChrgItm_Id_Typ_Cdg_Dsply TEXT,
ChrgItm_Id_Typ_Cdg_Sys TEXT,
ChrgItm_Id_Typ_Cdg_UsrSltd TEXT,
ChrgItm_Id_Typ_Cdg_Vrsn TEXT,
ChrgItm_Id_Typ_Txt TEXT,
ChrgItm_Id_Use TEXT,
ChrgItm_Id_Vl TEXT,
ChrgItm_Nt_AthrRfrnc TEXT,
ChrgItm_Nt_AthrStrgTyp TEXT,
ChrgItm_Nt_Txt TEXT,
ChrgItm_Nt_Time TEXT,
ChrgItm_OccrnceDtTimeTyp TEXT,
ChrgItm_OccrncePrd_End TEXT,
ChrgItm_OccrncePrd_Strt TEXT,
ChrgItm_OccrnceTmg_Cd_Cdg_Cd TEXT,
ChrgItm_OccrnceTmg_Cd_Cdg_Dsply TEXT,
ChrgItm_OccrnceTmg_Cd_Cdg_Sys TEXT,
ChrgItm_OccrnceTmg_Cd_Cdg_UsrSltd TEXT,
ChrgItm_OccrnceTmg_Cd_Cdg_Vrsn TEXT,
ChrgItm_OccrnceTmg_Cd_Txt TEXT,
ChrgItm_OccrnceTmg_Evnt TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cd TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cmprtr TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsDuration_Sys TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsDuration_Unt TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsDuration_Vl TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsPrd_End TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strt TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cd TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Sys TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Unt TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Vl TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cd TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Sys TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Unt TEXT,
ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Vl TEXT,
ChrgItm_OccrnceTmg_Rpt_Cnt TEXT,
ChrgItm_OccrnceTmg_Rpt_CntMx TEXT,
ChrgItm_OccrnceTmg_Rpt_DayOfWeek TEXT,
ChrgItm_OccrnceTmg_Rpt_Duration TEXT,
ChrgItm_OccrnceTmg_Rpt_DurationMx TEXT,
ChrgItm_OccrnceTmg_Rpt_DurationUnt TEXT,
ChrgItm_OccrnceTmg_Rpt_Frqncy TEXT,
ChrgItm_OccrnceTmg_Rpt_FrqncyMx TEXT,
ChrgItm_OccrnceTmg_Rpt_Off TEXT,
ChrgItm_OccrnceTmg_Rpt_Prd TEXT,
ChrgItm_OccrnceTmg_Rpt_PrdMx TEXT,
ChrgItm_OccrnceTmg_Rpt_PrdUnt TEXT,
ChrgItm_OccrnceTmg_Rpt_TimeOfDay TEXT,
ChrgItm_OccrnceTmg_Rpt_When TEXT,
ChrgItm_OverrideRsn TEXT,
ChrgItm_PartOf TEXT,
ChrgItm_Prfrmr_Actor TEXT,
ChrgItm_Prfrmr_Function_Cdg_Cd TEXT,
ChrgItm_Prfrmr_Function_Cdg_Dsply TEXT,
ChrgItm_Prfrmr_Function_Cdg_Sys TEXT,
ChrgItm_Prfrmr_Function_Cdg_UsrSltd TEXT,
ChrgItm_Prfrmr_Function_Cdg_Vrsn TEXT,
ChrgItm_Prfrmr_Function_Txt TEXT,
ChrgItm_PerformingOrgnztn TEXT,
ChrgItm_PriceOverride_Crncy TEXT,
ChrgItm_PriceOverride_Vl TEXT,
ChrgItm_PrdctCdbleCncpt_Cdg_Cd TEXT,
ChrgItm_PrdctCdbleCncpt_Cdg_Dsply TEXT,
ChrgItm_PrdctCdbleCncpt_Cdg_Sys TEXT,
ChrgItm_PrdctCdbleCncpt_Cdg_UsrSltd TEXT,
ChrgItm_PrdctCdbleCncpt_Cdg_Vrsn TEXT,
ChrgItm_PrdctCdbleCncpt_Txt TEXT,
ChrgItm_PrdctRfrnc TEXT,
ChrgItm_Qnty_Cd TEXT,
ChrgItm_Qnty_Cmprtr TEXT,
ChrgItm_Qnty_Sys TEXT,
ChrgItm_Qnty_Unt TEXT,
ChrgItm_Qnty_Vl TEXT,
ChrgItm_Rsn_Cdg_Cd TEXT,
ChrgItm_Rsn_Cdg_Dsply TEXT,
ChrgItm_Rsn_Cdg_Sys TEXT,
ChrgItm_Rsn_Cdg_UsrSltd TEXT,
ChrgItm_Rsn_Cdg_Vrsn TEXT,
ChrgItm_Rsn_Txt TEXT,
ChrgItm_RqstingOrgnztn TEXT,
ChrgItm_Srv TEXT,
ChrgItm_Sts TEXT,
ChrgItm_Sbjct TEXT,
ChrgItm_SprtingInfo TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;