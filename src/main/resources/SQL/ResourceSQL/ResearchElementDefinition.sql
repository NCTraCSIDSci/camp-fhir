drop table if exists `ResearchElementDefinition`;
CREATE TABLE `ResearchElementDefinition` (
 id varchar(64),
RsrchElmntDfn_ApprovalDt TEXT,
RsrchElmntDfn_Athr_Nm TEXT,
RsrchElmntDfn_Athr_Tlcm_Prd_End TEXT,
RsrchElmntDfn_Athr_Tlcm_Prd_Strt TEXT,
RsrchElmntDfn_Athr_Tlcm_Rnk TEXT,
RsrchElmntDfn_Athr_Tlcm_Sys TEXT,
RsrchElmntDfn_Athr_Tlcm_Use TEXT,
RsrchElmntDfn_Athr_Tlcm_Vl TEXT,
RsrchElmntDfn_Crctrstc_DfnCanonicalTyp TEXT,
RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Cd TEXT,
RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Dsply TEXT,
RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Sys TEXT,
RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Txt TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Cd TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Path TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_SrchParam TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_VlSt TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_Path TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_SrchParam TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_Lmt TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_MustSupport TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_Profile TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Direction TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Path TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_US TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctRfrnc TEXT,
RsrchElmntDfn_Crctrstc_DfnDataRqrment_Typ TEXT,
RsrchElmntDfn_Crctrstc_DfnExprsn_Dscrptn TEXT,
RsrchElmntDfn_Crctrstc_DfnExprsn_Exprsn TEXT,
RsrchElmntDfn_Crctrstc_DfnExprsn_Lnguage TEXT,
RsrchElmntDfn_Crctrstc_DfnExprsn_Nm TEXT,
RsrchElmntDfn_Crctrstc_DfnExprsn_Rfrnc TEXT,
RsrchElmntDfn_Crctrstc_Exclude TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDtTimeTyp TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptn TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptnElmnt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Cd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Sys TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Unt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Vl TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveGrpMsr TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveGrpMsrElmnt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_End TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Cd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Sys TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Unt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Vl TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evnt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationUnt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdUnt TEXT,
RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDtTimeTyp TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptn TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptnElmnt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Cd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Sys TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Unt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Vl TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveGrpMsr TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveGrpMsrElmnt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctivePrd_End TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Cd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Sys TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Unt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Vl TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Cd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Dsply TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Sys TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Txt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evnt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Cd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Sys TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Unt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Vl TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_End TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Sys TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Unt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Vl TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Sys TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Unt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Vl TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Cnt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_CntMx TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Duration TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationMx TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationUnt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Frqncy TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_FrqncyMx TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Off TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Prd TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdMx TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdUnt TEXT,
RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_TimeOfDay TEXT,
RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Cd TEXT,
RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Dsply TEXT,
RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Sys TEXT,
RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_UntOfMsr_Txt TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Cd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Dsply TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Sys TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Sys TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Unt TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Vl TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Sys TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Unt TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Vl TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cd TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cmprtr TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Sys TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Unt TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Vl TEXT,
RsrchElmntDfn_Crctrstc_UsgCntxt_VlRfrnc TEXT,
RsrchElmntDfn_Comment TEXT,
RsrchElmntDfn_Cntct_Nm TEXT,
RsrchElmntDfn_Cntct_Tlcm_Prd_End TEXT,
RsrchElmntDfn_Cntct_Tlcm_Prd_Strt TEXT,
RsrchElmntDfn_Cntct_Tlcm_Rnk TEXT,
RsrchElmntDfn_Cntct_Tlcm_Sys TEXT,
RsrchElmntDfn_Cntct_Tlcm_Use TEXT,
RsrchElmntDfn_Cntct_Tlcm_Vl TEXT,
RsrchElmntDfn_Copyright TEXT,
RsrchElmntDfn_Dt TEXT,
RsrchElmntDfn_Dscrptn TEXT,
RsrchElmntDfn_Editor_Nm TEXT,
RsrchElmntDfn_Editor_Tlcm_Prd_End TEXT,
RsrchElmntDfn_Editor_Tlcm_Prd_Strt TEXT,
RsrchElmntDfn_Editor_Tlcm_Rnk TEXT,
RsrchElmntDfn_Editor_Tlcm_Sys TEXT,
RsrchElmntDfn_Editor_Tlcm_Use TEXT,
RsrchElmntDfn_Editor_Tlcm_Vl TEXT,
RsrchElmntDfn_EfctivePrd_End TEXT,
RsrchElmntDfn_EfctivePrd_Strt TEXT,
RsrchElmntDfn_Endsr_Nm TEXT,
RsrchElmntDfn_Endsr_Tlcm_Prd_End TEXT,
RsrchElmntDfn_Endsr_Tlcm_Prd_Strt TEXT,
RsrchElmntDfn_Endsr_Tlcm_Rnk TEXT,
RsrchElmntDfn_Endsr_Tlcm_Sys TEXT,
RsrchElmntDfn_Endsr_Tlcm_Use TEXT,
RsrchElmntDfn_Endsr_Tlcm_Vl TEXT,
RsrchElmntDfn_Exprmtl TEXT,
RsrchElmntDfn_Id_Assigner TEXT,
RsrchElmntDfn_Id_Prd_End TEXT,
RsrchElmntDfn_Id_Prd_Strt TEXT,
RsrchElmntDfn_Id_Sys TEXT,
RsrchElmntDfn_Id_Typ_Cdg_Cd TEXT,
RsrchElmntDfn_Id_Typ_Cdg_Dsply TEXT,
RsrchElmntDfn_Id_Typ_Cdg_Sys TEXT,
RsrchElmntDfn_Id_Typ_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Id_Typ_Cdg_Vrsn TEXT,
RsrchElmntDfn_Id_Typ_Txt TEXT,
RsrchElmntDfn_Id_Use TEXT,
RsrchElmntDfn_Id_Vl TEXT,
RsrchElmntDfn_Jrsdctn_Cdg_Cd TEXT,
RsrchElmntDfn_Jrsdctn_Cdg_Dsply TEXT,
RsrchElmntDfn_Jrsdctn_Cdg_Sys TEXT,
RsrchElmntDfn_Jrsdctn_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Jrsdctn_Cdg_Vrsn TEXT,
RsrchElmntDfn_Jrsdctn_Txt TEXT,
RsrchElmntDfn_LastReviewDt TEXT,
RsrchElmntDfn_Library TEXT,
RsrchElmntDfn_Nm TEXT,
RsrchElmntDfn_Pblshr TEXT,
RsrchElmntDfn_Prpse TEXT,
RsrchElmntDfn_RltedArtfct_Citation TEXT,
RsrchElmntDfn_RltedArtfct_Dsply TEXT,
RsrchElmntDfn_RltedArtfct_Doc_CntntTyp TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Creation TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Data TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Hash TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Lnguage TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Sz TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Ttl TEXT,
RsrchElmntDfn_RltedArtfct_Doc_Url TEXT,
RsrchElmntDfn_RltedArtfct_Lbl TEXT,
RsrchElmntDfn_RltedArtfct_Rsrc TEXT,
RsrchElmntDfn_RltedArtfct_Typ TEXT,
RsrchElmntDfn_RltedArtfct_Url TEXT,
RsrchElmntDfn_Rviewr_Nm TEXT,
RsrchElmntDfn_Rviewr_Tlcm_Prd_End TEXT,
RsrchElmntDfn_Rviewr_Tlcm_Prd_Strt TEXT,
RsrchElmntDfn_Rviewr_Tlcm_Rnk TEXT,
RsrchElmntDfn_Rviewr_Tlcm_Sys TEXT,
RsrchElmntDfn_Rviewr_Tlcm_Use TEXT,
RsrchElmntDfn_Rviewr_Tlcm_Vl TEXT,
RsrchElmntDfn_ShortTtl TEXT,
RsrchElmntDfn_Sts TEXT,
RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Cd TEXT,
RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Dsply TEXT,
RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Sys TEXT,
RsrchElmntDfn_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
RsrchElmntDfn_SbjctCdbleCncpt_Txt TEXT,
RsrchElmntDfn_SbjctRfrnc TEXT,
RsrchElmntDfn_Subtitle TEXT,
RsrchElmntDfn_Ttl TEXT,
RsrchElmntDfn_Topic_Cdg_Cd TEXT,
RsrchElmntDfn_Topic_Cdg_Dsply TEXT,
RsrchElmntDfn_Topic_Cdg_Sys TEXT,
RsrchElmntDfn_Topic_Cdg_UsrSltd TEXT,
RsrchElmntDfn_Topic_Cdg_Vrsn TEXT,
RsrchElmntDfn_Topic_Txt TEXT,
RsrchElmntDfn_Typ TEXT,
RsrchElmntDfn_Url TEXT,
RsrchElmntDfn_Usg TEXT,
RsrchElmntDfn_UseCntxt_Cd_Cd TEXT,
RsrchElmntDfn_UseCntxt_Cd_Dsply TEXT,
RsrchElmntDfn_UseCntxt_Cd_Sys TEXT,
RsrchElmntDfn_UseCntxt_Cd_UsrSltd TEXT,
RsrchElmntDfn_UseCntxt_Cd_Vrsn TEXT,
RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Txt TEXT,
RsrchElmntDfn_UseCntxt_VlQnty_Cd TEXT,
RsrchElmntDfn_UseCntxt_VlQnty_Cmprtr TEXT,
RsrchElmntDfn_UseCntxt_VlQnty_Sys TEXT,
RsrchElmntDfn_UseCntxt_VlQnty_Unt TEXT,
RsrchElmntDfn_UseCntxt_VlQnty_Vl TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Hi_Cd TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Hi_Cmprtr TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Hi_Sys TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Hi_Unt TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Hi_Vl TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Lw_Cd TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Lw_Cmprtr TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Lw_Sys TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Lw_Unt TEXT,
RsrchElmntDfn_UseCntxt_VlRng_Lw_Vl TEXT,
RsrchElmntDfn_UseCntxt_VlRfrnc TEXT,
RsrchElmntDfn_VrbleTyp TEXT,
RsrchElmntDfn_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;