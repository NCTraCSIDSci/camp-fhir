drop table if exists `RequestGroup`;
CREATE TABLE `RequestGroup` (
 id varchar(64),
RqstGrp_Actn_CardinalityBehavior TEXT,
RqstGrp_Actn_Cd_Cdg_Cd TEXT,
RqstGrp_Actn_Cd_Cdg_Dsply TEXT,
RqstGrp_Actn_Cd_Cdg_Sys TEXT,
RqstGrp_Actn_Cd_Cdg_UsrSltd TEXT,
RqstGrp_Actn_Cd_Cdg_Vrsn TEXT,
RqstGrp_Actn_Cd_Txt TEXT,
RqstGrp_Actn_Cndtn_Exprsn_Dscrptn TEXT,
RqstGrp_Actn_Cndtn_Exprsn_Exprsn TEXT,
RqstGrp_Actn_Cndtn_Exprsn_Lnguage TEXT,
RqstGrp_Actn_Cndtn_Exprsn_Nm TEXT,
RqstGrp_Actn_Cndtn_Exprsn_Rfrnc TEXT,
RqstGrp_Actn_Cndtn_Kind TEXT,
RqstGrp_Actn_Dscrptn TEXT,
RqstGrp_Actn_Docation_Citation TEXT,
RqstGrp_Actn_Docation_Dsply TEXT,
RqstGrp_Actn_Docation_Doc_CntntTyp TEXT,
RqstGrp_Actn_Docation_Doc_Creation TEXT,
RqstGrp_Actn_Docation_Doc_Data TEXT,
RqstGrp_Actn_Docation_Doc_Hash TEXT,
RqstGrp_Actn_Docation_Doc_Lnguage TEXT,
RqstGrp_Actn_Docation_Doc_Sz TEXT,
RqstGrp_Actn_Docation_Doc_Ttl TEXT,
RqstGrp_Actn_Docation_Doc_Url TEXT,
RqstGrp_Actn_Docation_Lbl TEXT,
RqstGrp_Actn_Docation_Rsrc TEXT,
RqstGrp_Actn_Docation_Typ TEXT,
RqstGrp_Actn_Docation_Url TEXT,
RqstGrp_Actn_GrpingBehavior TEXT,
RqstGrp_Actn_Prtcpnt TEXT,
RqstGrp_Actn_PrecheckBehavior TEXT,
RqstGrp_Actn_Prefix TEXT,
RqstGrp_Actn_Priority TEXT,
RqstGrp_Actn_RltedActn_ActnId TEXT,
RqstGrp_Actn_RltedActn_OffRng_Hi_Cd TEXT,
RqstGrp_Actn_RltedActn_OffRng_Hi_Cmprtr TEXT,
RqstGrp_Actn_RltedActn_OffRng_Hi_Sys TEXT,
RqstGrp_Actn_RltedActn_OffRng_Hi_Unt TEXT,
RqstGrp_Actn_RltedActn_OffRng_Hi_Vl TEXT,
RqstGrp_Actn_RltedActn_OffRng_Lw_Cd TEXT,
RqstGrp_Actn_RltedActn_OffRng_Lw_Cmprtr TEXT,
RqstGrp_Actn_RltedActn_OffRng_Lw_Sys TEXT,
RqstGrp_Actn_RltedActn_OffRng_Lw_Unt TEXT,
RqstGrp_Actn_RltedActn_OffRng_Lw_Vl TEXT,
RqstGrp_Actn_RltedActn_Rltnship TEXT,
RqstGrp_Actn_RequiredBehavior TEXT,
RqstGrp_Actn_Rsrc TEXT,
RqstGrp_Actn_SelectionBehavior TEXT,
RqstGrp_Actn_TxtEquivalent TEXT,
RqstGrp_Actn_TmgDtTimeTyp TEXT,
RqstGrp_Actn_TmgPrd_End TEXT,
RqstGrp_Actn_TmgPrd_Strt TEXT,
RqstGrp_Actn_TmgRng_Hi_Cd TEXT,
RqstGrp_Actn_TmgRng_Hi_Cmprtr TEXT,
RqstGrp_Actn_TmgRng_Hi_Sys TEXT,
RqstGrp_Actn_TmgRng_Hi_Unt TEXT,
RqstGrp_Actn_TmgRng_Hi_Vl TEXT,
RqstGrp_Actn_TmgRng_Lw_Cd TEXT,
RqstGrp_Actn_TmgRng_Lw_Cmprtr TEXT,
RqstGrp_Actn_TmgRng_Lw_Sys TEXT,
RqstGrp_Actn_TmgRng_Lw_Unt TEXT,
RqstGrp_Actn_TmgRng_Lw_Vl TEXT,
RqstGrp_Actn_TmgTmg_Cd_Cdg_Cd TEXT,
RqstGrp_Actn_TmgTmg_Cd_Cdg_Dsply TEXT,
RqstGrp_Actn_TmgTmg_Cd_Cdg_Sys TEXT,
RqstGrp_Actn_TmgTmg_Cd_Cdg_UsrSltd TEXT,
RqstGrp_Actn_TmgTmg_Cd_Cdg_Vrsn TEXT,
RqstGrp_Actn_TmgTmg_Cd_Txt TEXT,
RqstGrp_Actn_TmgTmg_Evnt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_End TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl TEXT,
RqstGrp_Actn_TmgTmg_Rpt_Cnt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_CntMx TEXT,
RqstGrp_Actn_TmgTmg_Rpt_DayOfWeek TEXT,
RqstGrp_Actn_TmgTmg_Rpt_Duration TEXT,
RqstGrp_Actn_TmgTmg_Rpt_DurationMx TEXT,
RqstGrp_Actn_TmgTmg_Rpt_DurationUnt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_Frqncy TEXT,
RqstGrp_Actn_TmgTmg_Rpt_FrqncyMx TEXT,
RqstGrp_Actn_TmgTmg_Rpt_Off TEXT,
RqstGrp_Actn_TmgTmg_Rpt_Prd TEXT,
RqstGrp_Actn_TmgTmg_Rpt_PrdMx TEXT,
RqstGrp_Actn_TmgTmg_Rpt_PrdUnt TEXT,
RqstGrp_Actn_TmgTmg_Rpt_TimeOfDay TEXT,
RqstGrp_Actn_TmgTmg_Rpt_When TEXT,
RqstGrp_Actn_Ttl TEXT,
RqstGrp_Actn_Typ_Cdg_Cd TEXT,
RqstGrp_Actn_Typ_Cdg_Dsply TEXT,
RqstGrp_Actn_Typ_Cdg_Sys TEXT,
RqstGrp_Actn_Typ_Cdg_UsrSltd TEXT,
RqstGrp_Actn_Typ_Cdg_Vrsn TEXT,
RqstGrp_Actn_Typ_Txt TEXT,
RqstGrp_Athr TEXT,
RqstGrp_AthredOn TEXT,
RqstGrp_BasedOn TEXT,
RqstGrp_Cd_Cdg_Cd TEXT,
RqstGrp_Cd_Cdg_Dsply TEXT,
RqstGrp_Cd_Cdg_Sys TEXT,
RqstGrp_Cd_Cdg_UsrSltd TEXT,
RqstGrp_Cd_Cdg_Vrsn TEXT,
RqstGrp_Cd_Txt TEXT,
RqstGrp_Enc TEXT,
RqstGrp_GrpId_Assigner TEXT,
RqstGrp_GrpId_Prd_End TEXT,
RqstGrp_GrpId_Prd_Strt TEXT,
RqstGrp_GrpId_Sys TEXT,
RqstGrp_GrpId_Typ_Cdg_Cd TEXT,
RqstGrp_GrpId_Typ_Cdg_Dsply TEXT,
RqstGrp_GrpId_Typ_Cdg_Sys TEXT,
RqstGrp_GrpId_Typ_Cdg_UsrSltd TEXT,
RqstGrp_GrpId_Typ_Cdg_Vrsn TEXT,
RqstGrp_GrpId_Typ_Txt TEXT,
RqstGrp_GrpId_Use TEXT,
RqstGrp_GrpId_Vl TEXT,
RqstGrp_Id_Assigner TEXT,
RqstGrp_Id_Prd_End TEXT,
RqstGrp_Id_Prd_Strt TEXT,
RqstGrp_Id_Sys TEXT,
RqstGrp_Id_Typ_Cdg_Cd TEXT,
RqstGrp_Id_Typ_Cdg_Dsply TEXT,
RqstGrp_Id_Typ_Cdg_Sys TEXT,
RqstGrp_Id_Typ_Cdg_UsrSltd TEXT,
RqstGrp_Id_Typ_Cdg_Vrsn TEXT,
RqstGrp_Id_Typ_Txt TEXT,
RqstGrp_Id_Use TEXT,
RqstGrp_Id_Vl TEXT,
RqstGrp_InstantiatesCanonical TEXT,
RqstGrp_InstantiatesUri TEXT,
RqstGrp_Intent TEXT,
RqstGrp_Nt_AthrRfrnc TEXT,
RqstGrp_Nt_AthrStrgTyp TEXT,
RqstGrp_Nt_Txt TEXT,
RqstGrp_Nt_Time TEXT,
RqstGrp_Priority TEXT,
RqstGrp_RsnCd_Cdg_Cd TEXT,
RqstGrp_RsnCd_Cdg_Dsply TEXT,
RqstGrp_RsnCd_Cdg_Sys TEXT,
RqstGrp_RsnCd_Cdg_UsrSltd TEXT,
RqstGrp_RsnCd_Cdg_Vrsn TEXT,
RqstGrp_RsnCd_Txt TEXT,
RqstGrp_RsnRfrnc TEXT,
RqstGrp_Replaces TEXT,
RqstGrp_Sts TEXT,
RqstGrp_Sbjct TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;