drop table if exists `PlanDefinition`;
CREATE TABLE `PlanDefinition` (
 id varchar(64),
PlnDfn_Actn_CardinalityBehavior TEXT,
PlnDfn_Actn_Cd_Cdg_Cd TEXT,
PlnDfn_Actn_Cd_Cdg_Dsply TEXT,
PlnDfn_Actn_Cd_Cdg_Sys TEXT,
PlnDfn_Actn_Cd_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Cd_Cdg_Vrsn TEXT,
PlnDfn_Actn_Cd_Txt TEXT,
PlnDfn_Actn_Cndtn_Exprsn_Dscrptn TEXT,
PlnDfn_Actn_Cndtn_Exprsn_Exprsn TEXT,
PlnDfn_Actn_Cndtn_Exprsn_Lnguage TEXT,
PlnDfn_Actn_Cndtn_Exprsn_Nm TEXT,
PlnDfn_Actn_Cndtn_Exprsn_Rfrnc TEXT,
PlnDfn_Actn_Cndtn_Kind TEXT,
PlnDfn_Actn_DfnCanonicalTyp TEXT,
PlnDfn_Actn_DfnUriTyp TEXT,
PlnDfn_Actn_Dscrptn TEXT,
PlnDfn_Actn_Docation_Citation TEXT,
PlnDfn_Actn_Docation_Dsply TEXT,
PlnDfn_Actn_Docation_Doc_CntntTyp TEXT,
PlnDfn_Actn_Docation_Doc_Creation TEXT,
PlnDfn_Actn_Docation_Doc_Data TEXT,
PlnDfn_Actn_Docation_Doc_Hash TEXT,
PlnDfn_Actn_Docation_Doc_Lnguage TEXT,
PlnDfn_Actn_Docation_Doc_Sz TEXT,
PlnDfn_Actn_Docation_Doc_Ttl TEXT,
PlnDfn_Actn_Docation_Doc_Url TEXT,
PlnDfn_Actn_Docation_Lbl TEXT,
PlnDfn_Actn_Docation_Rsrc TEXT,
PlnDfn_Actn_Docation_Typ TEXT,
PlnDfn_Actn_Docation_Url TEXT,
PlnDfn_Actn_DynamicVl_Exprsn_Dscrptn TEXT,
PlnDfn_Actn_DynamicVl_Exprsn_Exprsn TEXT,
PlnDfn_Actn_DynamicVl_Exprsn_Lnguage TEXT,
PlnDfn_Actn_DynamicVl_Exprsn_Nm TEXT,
PlnDfn_Actn_DynamicVl_Exprsn_Rfrnc TEXT,
PlnDfn_Actn_DynamicVl_Path TEXT,
PlnDfn_Actn_GoalId TEXT,
PlnDfn_Actn_GrpingBehavior TEXT,
PlnDfn_Actn_Input_CdFltr_Cd_Cd TEXT,
PlnDfn_Actn_Input_CdFltr_Cd_Dsply TEXT,
PlnDfn_Actn_Input_CdFltr_Cd_Sys TEXT,
PlnDfn_Actn_Input_CdFltr_Cd_UsrSltd TEXT,
PlnDfn_Actn_Input_CdFltr_Cd_Vrsn TEXT,
PlnDfn_Actn_Input_CdFltr_Path TEXT,
PlnDfn_Actn_Input_CdFltr_SrchParam TEXT,
PlnDfn_Actn_Input_CdFltr_VlSt TEXT,
PlnDfn_Actn_Input_DtFltr_Path TEXT,
PlnDfn_Actn_Input_DtFltr_SrchParam TEXT,
PlnDfn_Actn_Input_DtFltr_VlDtTimeTyp TEXT,
PlnDfn_Actn_Input_DtFltr_VlDuration_Cd TEXT,
PlnDfn_Actn_Input_DtFltr_VlDuration_Cmprtr TEXT,
PlnDfn_Actn_Input_DtFltr_VlDuration_Sys TEXT,
PlnDfn_Actn_Input_DtFltr_VlDuration_Unt TEXT,
PlnDfn_Actn_Input_DtFltr_VlDuration_Vl TEXT,
PlnDfn_Actn_Input_DtFltr_VlPrd_End TEXT,
PlnDfn_Actn_Input_DtFltr_VlPrd_Strt TEXT,
PlnDfn_Actn_Input_Lmt TEXT,
PlnDfn_Actn_Input_MustSupport TEXT,
PlnDfn_Actn_Input_Profile TEXT,
PlnDfn_Actn_Input_Sort_Direction TEXT,
PlnDfn_Actn_Input_Sort_Path TEXT,
PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Cd TEXT,
PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Dsply TEXT,
PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Sys TEXT,
PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
PlnDfn_Actn_Input_SbjctCdbleCncpt_Txt TEXT,
PlnDfn_Actn_Input_SbjctRfrnc TEXT,
PlnDfn_Actn_Input_Typ TEXT,
PlnDfn_Actn_Output_CdFltr_Cd_Cd TEXT,
PlnDfn_Actn_Output_CdFltr_Cd_Dsply TEXT,
PlnDfn_Actn_Output_CdFltr_Cd_Sys TEXT,
PlnDfn_Actn_Output_CdFltr_Cd_UsrSltd TEXT,
PlnDfn_Actn_Output_CdFltr_Cd_Vrsn TEXT,
PlnDfn_Actn_Output_CdFltr_Path TEXT,
PlnDfn_Actn_Output_CdFltr_SrchParam TEXT,
PlnDfn_Actn_Output_CdFltr_VlSt TEXT,
PlnDfn_Actn_Output_DtFltr_Path TEXT,
PlnDfn_Actn_Output_DtFltr_SrchParam TEXT,
PlnDfn_Actn_Output_DtFltr_VlDtTimeTyp TEXT,
PlnDfn_Actn_Output_DtFltr_VlDuration_Cd TEXT,
PlnDfn_Actn_Output_DtFltr_VlDuration_Cmprtr TEXT,
PlnDfn_Actn_Output_DtFltr_VlDuration_Sys TEXT,
PlnDfn_Actn_Output_DtFltr_VlDuration_Unt TEXT,
PlnDfn_Actn_Output_DtFltr_VlDuration_Vl TEXT,
PlnDfn_Actn_Output_DtFltr_VlPrd_End TEXT,
PlnDfn_Actn_Output_DtFltr_VlPrd_Strt TEXT,
PlnDfn_Actn_Output_Lmt TEXT,
PlnDfn_Actn_Output_MustSupport TEXT,
PlnDfn_Actn_Output_Profile TEXT,
PlnDfn_Actn_Output_Sort_Direction TEXT,
PlnDfn_Actn_Output_Sort_Path TEXT,
PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Cd TEXT,
PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Dsply TEXT,
PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Sys TEXT,
PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
PlnDfn_Actn_Output_SbjctCdbleCncpt_Txt TEXT,
PlnDfn_Actn_Output_SbjctRfrnc TEXT,
PlnDfn_Actn_Output_Typ TEXT,
PlnDfn_Actn_Prtcpnt_Role_Cdg_Cd TEXT,
PlnDfn_Actn_Prtcpnt_Role_Cdg_Dsply TEXT,
PlnDfn_Actn_Prtcpnt_Role_Cdg_Sys TEXT,
PlnDfn_Actn_Prtcpnt_Role_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Prtcpnt_Role_Cdg_Vrsn TEXT,
PlnDfn_Actn_Prtcpnt_Role_Txt TEXT,
PlnDfn_Actn_Prtcpnt_Typ TEXT,
PlnDfn_Actn_PrecheckBehavior TEXT,
PlnDfn_Actn_Prefix TEXT,
PlnDfn_Actn_Priority TEXT,
PlnDfn_Actn_Rsn_Cdg_Cd TEXT,
PlnDfn_Actn_Rsn_Cdg_Dsply TEXT,
PlnDfn_Actn_Rsn_Cdg_Sys TEXT,
PlnDfn_Actn_Rsn_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Rsn_Cdg_Vrsn TEXT,
PlnDfn_Actn_Rsn_Txt TEXT,
PlnDfn_Actn_RltedActn_ActnId TEXT,
PlnDfn_Actn_RltedActn_OffDuration_Cd TEXT,
PlnDfn_Actn_RltedActn_OffDuration_Cmprtr TEXT,
PlnDfn_Actn_RltedActn_OffDuration_Sys TEXT,
PlnDfn_Actn_RltedActn_OffDuration_Unt TEXT,
PlnDfn_Actn_RltedActn_OffDuration_Vl TEXT,
PlnDfn_Actn_RltedActn_OffRng_Hi_Cd TEXT,
PlnDfn_Actn_RltedActn_OffRng_Hi_Cmprtr TEXT,
PlnDfn_Actn_RltedActn_OffRng_Hi_Sys TEXT,
PlnDfn_Actn_RltedActn_OffRng_Hi_Unt TEXT,
PlnDfn_Actn_RltedActn_OffRng_Hi_Vl TEXT,
PlnDfn_Actn_RltedActn_OffRng_Lw_Cd TEXT,
PlnDfn_Actn_RltedActn_OffRng_Lw_Cmprtr TEXT,
PlnDfn_Actn_RltedActn_OffRng_Lw_Sys TEXT,
PlnDfn_Actn_RltedActn_OffRng_Lw_Unt TEXT,
PlnDfn_Actn_RltedActn_OffRng_Lw_Vl TEXT,
PlnDfn_Actn_RltedActn_Rltnship TEXT,
PlnDfn_Actn_RequiredBehavior TEXT,
PlnDfn_Actn_SelectionBehavior TEXT,
PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Cd TEXT,
PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Dsply TEXT,
PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Sys TEXT,
PlnDfn_Actn_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
PlnDfn_Actn_SbjctCdbleCncpt_Txt TEXT,
PlnDfn_Actn_SbjctRfrnc TEXT,
PlnDfn_Actn_TxtEquivalent TEXT,
PlnDfn_Actn_TmgAge_Cd TEXT,
PlnDfn_Actn_TmgAge_Cmprtr TEXT,
PlnDfn_Actn_TmgAge_Sys TEXT,
PlnDfn_Actn_TmgAge_Unt TEXT,
PlnDfn_Actn_TmgAge_Vl TEXT,
PlnDfn_Actn_TmgDtTimeTyp TEXT,
PlnDfn_Actn_TmgDuration_Cd TEXT,
PlnDfn_Actn_TmgDuration_Cmprtr TEXT,
PlnDfn_Actn_TmgDuration_Sys TEXT,
PlnDfn_Actn_TmgDuration_Unt TEXT,
PlnDfn_Actn_TmgDuration_Vl TEXT,
PlnDfn_Actn_TmgPrd_End TEXT,
PlnDfn_Actn_TmgPrd_Strt TEXT,
PlnDfn_Actn_TmgRng_Hi_Cd TEXT,
PlnDfn_Actn_TmgRng_Hi_Cmprtr TEXT,
PlnDfn_Actn_TmgRng_Hi_Sys TEXT,
PlnDfn_Actn_TmgRng_Hi_Unt TEXT,
PlnDfn_Actn_TmgRng_Hi_Vl TEXT,
PlnDfn_Actn_TmgRng_Lw_Cd TEXT,
PlnDfn_Actn_TmgRng_Lw_Cmprtr TEXT,
PlnDfn_Actn_TmgRng_Lw_Sys TEXT,
PlnDfn_Actn_TmgRng_Lw_Unt TEXT,
PlnDfn_Actn_TmgRng_Lw_Vl TEXT,
PlnDfn_Actn_TmgTmg_Cd_Cdg_Cd TEXT,
PlnDfn_Actn_TmgTmg_Cd_Cdg_Dsply TEXT,
PlnDfn_Actn_TmgTmg_Cd_Cdg_Sys TEXT,
PlnDfn_Actn_TmgTmg_Cd_Cdg_UsrSltd TEXT,
PlnDfn_Actn_TmgTmg_Cd_Cdg_Vrsn TEXT,
PlnDfn_Actn_TmgTmg_Cd_Txt TEXT,
PlnDfn_Actn_TmgTmg_Evnt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Cd TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Cmprtr TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Sys TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Unt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Vl TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_End TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl TEXT,
PlnDfn_Actn_TmgTmg_Rpt_Cnt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_CntMx TEXT,
PlnDfn_Actn_TmgTmg_Rpt_Duration TEXT,
PlnDfn_Actn_TmgTmg_Rpt_DurationMx TEXT,
PlnDfn_Actn_TmgTmg_Rpt_DurationUnt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_Frqncy TEXT,
PlnDfn_Actn_TmgTmg_Rpt_FrqncyMx TEXT,
PlnDfn_Actn_TmgTmg_Rpt_Off TEXT,
PlnDfn_Actn_TmgTmg_Rpt_Prd TEXT,
PlnDfn_Actn_TmgTmg_Rpt_PrdMx TEXT,
PlnDfn_Actn_TmgTmg_Rpt_PrdUnt TEXT,
PlnDfn_Actn_TmgTmg_Rpt_TimeOfDay TEXT,
PlnDfn_Actn_Ttl TEXT,
PlnDfn_Actn_Transform TEXT,
PlnDfn_Actn_Trgr_Cndtn_Dscrptn TEXT,
PlnDfn_Actn_Trgr_Cndtn_Exprsn TEXT,
PlnDfn_Actn_Trgr_Cndtn_Lnguage TEXT,
PlnDfn_Actn_Trgr_Cndtn_Nm TEXT,
PlnDfn_Actn_Trgr_Cndtn_Rfrnc TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Cd TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Dsply TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Sys TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_Cd_UsrSltd TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Vrsn TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_Path TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_SrchParam TEXT,
PlnDfn_Actn_Trgr_Data_CdFltr_VlSt TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_Path TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_SrchParam TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlDtTimeTyp TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Cd TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Cmprtr TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Sys TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Unt TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Vl TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_End TEXT,
PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strt TEXT,
PlnDfn_Actn_Trgr_Data_Lmt TEXT,
PlnDfn_Actn_Trgr_Data_MustSupport TEXT,
PlnDfn_Actn_Trgr_Data_Profile TEXT,
PlnDfn_Actn_Trgr_Data_Sort_Direction TEXT,
PlnDfn_Actn_Trgr_Data_Sort_Path TEXT,
PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd TEXT,
PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply TEXT,
PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys TEXT,
PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Txt TEXT,
PlnDfn_Actn_Trgr_Data_SbjctRfrnc TEXT,
PlnDfn_Actn_Trgr_Data_Typ TEXT,
PlnDfn_Actn_Trgr_Nm TEXT,
PlnDfn_Actn_Trgr_TmgDtTimeTyp TEXT,
PlnDfn_Actn_Trgr_TmgDtTyp TEXT,
PlnDfn_Actn_Trgr_TmgRfrnc TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Cd TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Dsply TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Sys TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Vrsn TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Cd_Txt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Evnt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Cd TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Cmprtr TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Sys TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Unt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Vl TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_End TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_Cnt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_CntMx TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_Duration TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationMx TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationUnt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_Frqncy TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_FrqncyMx TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_Off TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_Prd TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdMx TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdUnt TEXT,
PlnDfn_Actn_Trgr_TmgTmg_Rpt_TimeOfDay TEXT,
PlnDfn_Actn_Trgr_Typ TEXT,
PlnDfn_Actn_Typ_Cdg_Cd TEXT,
PlnDfn_Actn_Typ_Cdg_Dsply TEXT,
PlnDfn_Actn_Typ_Cdg_Sys TEXT,
PlnDfn_Actn_Typ_Cdg_UsrSltd TEXT,
PlnDfn_Actn_Typ_Cdg_Vrsn TEXT,
PlnDfn_Actn_Typ_Txt TEXT,
PlnDfn_ApprovalDt TEXT,
PlnDfn_Athr_Nm TEXT,
PlnDfn_Athr_Tlcm_Prd_End TEXT,
PlnDfn_Athr_Tlcm_Prd_Strt TEXT,
PlnDfn_Athr_Tlcm_Rnk TEXT,
PlnDfn_Athr_Tlcm_Sys TEXT,
PlnDfn_Athr_Tlcm_Use TEXT,
PlnDfn_Athr_Tlcm_Vl TEXT,
PlnDfn_Cntct_Nm TEXT,
PlnDfn_Cntct_Tlcm_Prd_End TEXT,
PlnDfn_Cntct_Tlcm_Prd_Strt TEXT,
PlnDfn_Cntct_Tlcm_Rnk TEXT,
PlnDfn_Cntct_Tlcm_Sys TEXT,
PlnDfn_Cntct_Tlcm_Use TEXT,
PlnDfn_Cntct_Tlcm_Vl TEXT,
PlnDfn_Copyright TEXT,
PlnDfn_Dt TEXT,
PlnDfn_Dscrptn TEXT,
PlnDfn_Editor_Nm TEXT,
PlnDfn_Editor_Tlcm_Prd_End TEXT,
PlnDfn_Editor_Tlcm_Prd_Strt TEXT,
PlnDfn_Editor_Tlcm_Rnk TEXT,
PlnDfn_Editor_Tlcm_Sys TEXT,
PlnDfn_Editor_Tlcm_Use TEXT,
PlnDfn_Editor_Tlcm_Vl TEXT,
PlnDfn_EfctivePrd_End TEXT,
PlnDfn_EfctivePrd_Strt TEXT,
PlnDfn_Endsr_Nm TEXT,
PlnDfn_Endsr_Tlcm_Prd_End TEXT,
PlnDfn_Endsr_Tlcm_Prd_Strt TEXT,
PlnDfn_Endsr_Tlcm_Rnk TEXT,
PlnDfn_Endsr_Tlcm_Sys TEXT,
PlnDfn_Endsr_Tlcm_Use TEXT,
PlnDfn_Endsr_Tlcm_Vl TEXT,
PlnDfn_Exprmtl TEXT,
PlnDfn_Goal_Addres_Cdg_Cd TEXT,
PlnDfn_Goal_Addres_Cdg_Dsply TEXT,
PlnDfn_Goal_Addres_Cdg_Sys TEXT,
PlnDfn_Goal_Addres_Cdg_UsrSltd TEXT,
PlnDfn_Goal_Addres_Cdg_Vrsn TEXT,
PlnDfn_Goal_Addres_Txt TEXT,
PlnDfn_Goal_Ctgry_Cdg_Cd TEXT,
PlnDfn_Goal_Ctgry_Cdg_Dsply TEXT,
PlnDfn_Goal_Ctgry_Cdg_Sys TEXT,
PlnDfn_Goal_Ctgry_Cdg_UsrSltd TEXT,
PlnDfn_Goal_Ctgry_Cdg_Vrsn TEXT,
PlnDfn_Goal_Ctgry_Txt TEXT,
PlnDfn_Goal_Dscrptn_Cdg_Cd TEXT,
PlnDfn_Goal_Dscrptn_Cdg_Dsply TEXT,
PlnDfn_Goal_Dscrptn_Cdg_Sys TEXT,
PlnDfn_Goal_Dscrptn_Cdg_UsrSltd TEXT,
PlnDfn_Goal_Dscrptn_Cdg_Vrsn TEXT,
PlnDfn_Goal_Dscrptn_Txt TEXT,
PlnDfn_Goal_Docation_Citation TEXT,
PlnDfn_Goal_Docation_Dsply TEXT,
PlnDfn_Goal_Docation_Doc_CntntTyp TEXT,
PlnDfn_Goal_Docation_Doc_Creation TEXT,
PlnDfn_Goal_Docation_Doc_Data TEXT,
PlnDfn_Goal_Docation_Doc_Hash TEXT,
PlnDfn_Goal_Docation_Doc_Lnguage TEXT,
PlnDfn_Goal_Docation_Doc_Sz TEXT,
PlnDfn_Goal_Docation_Doc_Ttl TEXT,
PlnDfn_Goal_Docation_Doc_Url TEXT,
PlnDfn_Goal_Docation_Lbl TEXT,
PlnDfn_Goal_Docation_Rsrc TEXT,
PlnDfn_Goal_Docation_Typ TEXT,
PlnDfn_Goal_Docation_Url TEXT,
PlnDfn_Goal_Priority_Cdg_Cd TEXT,
PlnDfn_Goal_Priority_Cdg_Dsply TEXT,
PlnDfn_Goal_Priority_Cdg_Sys TEXT,
PlnDfn_Goal_Priority_Cdg_UsrSltd TEXT,
PlnDfn_Goal_Priority_Cdg_Vrsn TEXT,
PlnDfn_Goal_Priority_Txt TEXT,
PlnDfn_Goal_Strt_Cdg_Cd TEXT,
PlnDfn_Goal_Strt_Cdg_Dsply TEXT,
PlnDfn_Goal_Strt_Cdg_Sys TEXT,
PlnDfn_Goal_Strt_Cdg_UsrSltd TEXT,
PlnDfn_Goal_Strt_Cdg_Vrsn TEXT,
PlnDfn_Goal_Strt_Txt TEXT,
PlnDfn_Id_Assigner TEXT,
PlnDfn_Id_Prd_End TEXT,
PlnDfn_Id_Prd_Strt TEXT,
PlnDfn_Id_Sys TEXT,
PlnDfn_Id_Typ_Cdg_Cd TEXT,
PlnDfn_Id_Typ_Cdg_Dsply TEXT,
PlnDfn_Id_Typ_Cdg_Sys TEXT,
PlnDfn_Id_Typ_Cdg_UsrSltd TEXT,
PlnDfn_Id_Typ_Cdg_Vrsn TEXT,
PlnDfn_Id_Typ_Txt TEXT,
PlnDfn_Id_Use TEXT,
PlnDfn_Id_Vl TEXT,
PlnDfn_Jrsdctn_Cdg_Cd TEXT,
PlnDfn_Jrsdctn_Cdg_Dsply TEXT,
PlnDfn_Jrsdctn_Cdg_Sys TEXT,
PlnDfn_Jrsdctn_Cdg_UsrSltd TEXT,
PlnDfn_Jrsdctn_Cdg_Vrsn TEXT,
PlnDfn_Jrsdctn_Txt TEXT,
PlnDfn_LastReviewDt TEXT,
PlnDfn_Library TEXT,
PlnDfn_Nm TEXT,
PlnDfn_Pblshr TEXT,
PlnDfn_Prpse TEXT,
PlnDfn_RltedArtfct_Citation TEXT,
PlnDfn_RltedArtfct_Dsply TEXT,
PlnDfn_RltedArtfct_Doc_CntntTyp TEXT,
PlnDfn_RltedArtfct_Doc_Creation TEXT,
PlnDfn_RltedArtfct_Doc_Data TEXT,
PlnDfn_RltedArtfct_Doc_Hash TEXT,
PlnDfn_RltedArtfct_Doc_Lnguage TEXT,
PlnDfn_RltedArtfct_Doc_Sz TEXT,
PlnDfn_RltedArtfct_Doc_Ttl TEXT,
PlnDfn_RltedArtfct_Doc_Url TEXT,
PlnDfn_RltedArtfct_Lbl TEXT,
PlnDfn_RltedArtfct_Rsrc TEXT,
PlnDfn_RltedArtfct_Typ TEXT,
PlnDfn_RltedArtfct_Url TEXT,
PlnDfn_Rviewr_Nm TEXT,
PlnDfn_Rviewr_Tlcm_Prd_End TEXT,
PlnDfn_Rviewr_Tlcm_Prd_Strt TEXT,
PlnDfn_Rviewr_Tlcm_Rnk TEXT,
PlnDfn_Rviewr_Tlcm_Sys TEXT,
PlnDfn_Rviewr_Tlcm_Use TEXT,
PlnDfn_Rviewr_Tlcm_Vl TEXT,
PlnDfn_Sts TEXT,
PlnDfn_SbjctCdbleCncpt_Cdg_Cd TEXT,
PlnDfn_SbjctCdbleCncpt_Cdg_Dsply TEXT,
PlnDfn_SbjctCdbleCncpt_Cdg_Sys TEXT,
PlnDfn_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
PlnDfn_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
PlnDfn_SbjctCdbleCncpt_Txt TEXT,
PlnDfn_SbjctRfrnc TEXT,
PlnDfn_Subtitle TEXT,
PlnDfn_Ttl TEXT,
PlnDfn_Topic_Cdg_Cd TEXT,
PlnDfn_Topic_Cdg_Dsply TEXT,
PlnDfn_Topic_Cdg_Sys TEXT,
PlnDfn_Topic_Cdg_UsrSltd TEXT,
PlnDfn_Topic_Cdg_Vrsn TEXT,
PlnDfn_Topic_Txt TEXT,
PlnDfn_Typ_Cdg_Cd TEXT,
PlnDfn_Typ_Cdg_Dsply TEXT,
PlnDfn_Typ_Cdg_Sys TEXT,
PlnDfn_Typ_Cdg_UsrSltd TEXT,
PlnDfn_Typ_Cdg_Vrsn TEXT,
PlnDfn_Typ_Txt TEXT,
PlnDfn_Url TEXT,
PlnDfn_Usg TEXT,
PlnDfn_UseCntxt_Cd_Cd TEXT,
PlnDfn_UseCntxt_Cd_Dsply TEXT,
PlnDfn_UseCntxt_Cd_Sys TEXT,
PlnDfn_UseCntxt_Cd_UsrSltd TEXT,
PlnDfn_UseCntxt_Cd_Vrsn TEXT,
PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
PlnDfn_UseCntxt_VlCdbleCncpt_Txt TEXT,
PlnDfn_UseCntxt_VlQnty_Cd TEXT,
PlnDfn_UseCntxt_VlQnty_Cmprtr TEXT,
PlnDfn_UseCntxt_VlQnty_Sys TEXT,
PlnDfn_UseCntxt_VlQnty_Unt TEXT,
PlnDfn_UseCntxt_VlQnty_Vl TEXT,
PlnDfn_UseCntxt_VlRng_Hi_Cd TEXT,
PlnDfn_UseCntxt_VlRng_Hi_Cmprtr TEXT,
PlnDfn_UseCntxt_VlRng_Hi_Sys TEXT,
PlnDfn_UseCntxt_VlRng_Hi_Unt TEXT,
PlnDfn_UseCntxt_VlRng_Hi_Vl TEXT,
PlnDfn_UseCntxt_VlRng_Lw_Cd TEXT,
PlnDfn_UseCntxt_VlRng_Lw_Cmprtr TEXT,
PlnDfn_UseCntxt_VlRng_Lw_Sys TEXT,
PlnDfn_UseCntxt_VlRng_Lw_Unt TEXT,
PlnDfn_UseCntxt_VlRng_Lw_Vl TEXT,
PlnDfn_UseCntxt_VlRfrnc TEXT,
PlnDfn_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;