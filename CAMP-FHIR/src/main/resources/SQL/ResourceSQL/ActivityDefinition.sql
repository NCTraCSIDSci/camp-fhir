drop table if exists `ActivityDefinition`;
CREATE TABLE `ActivityDefinition` (
 id varchar(64),
ActvtyDfn_ApprovalDt TEXT,
ActvtyDfn_Athr_Nm TEXT,
ActvtyDfn_Athr_Tlcm_Prd_End TEXT,
ActvtyDfn_Athr_Tlcm_Prd_Strt TEXT,
ActvtyDfn_Athr_Tlcm_Rnk TEXT,
ActvtyDfn_Athr_Tlcm_Sys TEXT,
ActvtyDfn_Athr_Tlcm_Use TEXT,
ActvtyDfn_Athr_Tlcm_Vl TEXT,
ActvtyDfn_BodySite_Cdg_Cd TEXT,
ActvtyDfn_BodySite_Cdg_Dsply TEXT,
ActvtyDfn_BodySite_Cdg_Sys TEXT,
ActvtyDfn_BodySite_Cdg_UsrSltd TEXT,
ActvtyDfn_BodySite_Cdg_Vrsn TEXT,
ActvtyDfn_BodySite_Txt TEXT,
ActvtyDfn_Cd_Cdg_Cd TEXT,
ActvtyDfn_Cd_Cdg_Dsply TEXT,
ActvtyDfn_Cd_Cdg_Sys TEXT,
ActvtyDfn_Cd_Cdg_UsrSltd TEXT,
ActvtyDfn_Cd_Cdg_Vrsn TEXT,
ActvtyDfn_Cd_Txt TEXT,
ActvtyDfn_Cntct_Nm TEXT,
ActvtyDfn_Cntct_Tlcm_Prd_End TEXT,
ActvtyDfn_Cntct_Tlcm_Prd_Strt TEXT,
ActvtyDfn_Cntct_Tlcm_Rnk TEXT,
ActvtyDfn_Cntct_Tlcm_Sys TEXT,
ActvtyDfn_Cntct_Tlcm_Use TEXT,
ActvtyDfn_Cntct_Tlcm_Vl TEXT,
ActvtyDfn_Copyright TEXT,
ActvtyDfn_Dt TEXT,
ActvtyDfn_Dscrptn TEXT,
ActvtyDfn_DoNotPerform TEXT,
ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Cd TEXT,
ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Sys TEXT,
ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_AddtnlInstrctn_Txt TEXT,
ActvtyDfn_Dsg_AsNdBooleanTyp TEXT,
ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Cd TEXT,
ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Sys TEXT,
ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_AsNdCdbleCncpt_Txt TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtQnty_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtQnty_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtQnty_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cmprtr TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt TEXT,
ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl TEXT,
ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Cd TEXT,
ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Sys TEXT,
ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_DoseAndRt_Typ_Txt TEXT,
ActvtyDfn_Dsg_MxDosePerAdmnstn_Cd TEXT,
ActvtyDfn_Dsg_MxDosePerAdmnstn_Cmprtr TEXT,
ActvtyDfn_Dsg_MxDosePerAdmnstn_Sys TEXT,
ActvtyDfn_Dsg_MxDosePerAdmnstn_Unt TEXT,
ActvtyDfn_Dsg_MxDosePerAdmnstn_Vl TEXT,
ActvtyDfn_Dsg_MxDosePerLifetime_Cd TEXT,
ActvtyDfn_Dsg_MxDosePerLifetime_Cmprtr TEXT,
ActvtyDfn_Dsg_MxDosePerLifetime_Sys TEXT,
ActvtyDfn_Dsg_MxDosePerLifetime_Unt TEXT,
ActvtyDfn_Dsg_MxDosePerLifetime_Vl TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cd TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cmprtr TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Sys TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Unt TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Vl TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cd TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cmprtr TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Sys TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Unt TEXT,
ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Vl TEXT,
ActvtyDfn_Dsg_Mthd_Cdg_Cd TEXT,
ActvtyDfn_Dsg_Mthd_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_Mthd_Cdg_Sys TEXT,
ActvtyDfn_Dsg_Mthd_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_Mthd_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_Mthd_Txt TEXT,
ActvtyDfn_Dsg_PntInstrctn TEXT,
ActvtyDfn_Dsg_Route_Cdg_Cd TEXT,
ActvtyDfn_Dsg_Route_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_Route_Cdg_Sys TEXT,
ActvtyDfn_Dsg_Route_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_Route_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_Route_Txt TEXT,
ActvtyDfn_Dsg_Sqnc TEXT,
ActvtyDfn_Dsg_Site_Cdg_Cd TEXT,
ActvtyDfn_Dsg_Site_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_Site_Cdg_Sys TEXT,
ActvtyDfn_Dsg_Site_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_Site_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_Site_Txt TEXT,
ActvtyDfn_Dsg_Txt TEXT,
ActvtyDfn_Dsg_Tmg_Cd_Cdg_Cd TEXT,
ActvtyDfn_Dsg_Tmg_Cd_Cdg_Dsply TEXT,
ActvtyDfn_Dsg_Tmg_Cd_Cdg_Sys TEXT,
ActvtyDfn_Dsg_Tmg_Cd_Cdg_UsrSltd TEXT,
ActvtyDfn_Dsg_Tmg_Cd_Cdg_Vrsn TEXT,
ActvtyDfn_Dsg_Tmg_Cd_Txt TEXT,
ActvtyDfn_Dsg_Tmg_Evnt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_End TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cd TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Sys TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Unt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Vl TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cd TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Sys TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Unt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Vl TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_Cnt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_CntMx TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_DayOfWeek TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_Duration TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_DurationMx TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_DurationUnt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_Frqncy TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_FrqncyMx TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_Off TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_Prd TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_PrdMx TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_PrdUnt TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_TimeOfDay TEXT,
ActvtyDfn_Dsg_Tmg_Rpt_When TEXT,
ActvtyDfn_DynamicVl_Exprsn_Dscrptn TEXT,
ActvtyDfn_DynamicVl_Exprsn_Exprsn TEXT,
ActvtyDfn_DynamicVl_Exprsn_Lnguage TEXT,
ActvtyDfn_DynamicVl_Exprsn_Nm TEXT,
ActvtyDfn_DynamicVl_Exprsn_Rfrnc TEXT,
ActvtyDfn_DynamicVl_Path TEXT,
ActvtyDfn_Editor_Nm TEXT,
ActvtyDfn_Editor_Tlcm_Prd_End TEXT,
ActvtyDfn_Editor_Tlcm_Prd_Strt TEXT,
ActvtyDfn_Editor_Tlcm_Rnk TEXT,
ActvtyDfn_Editor_Tlcm_Sys TEXT,
ActvtyDfn_Editor_Tlcm_Use TEXT,
ActvtyDfn_Editor_Tlcm_Vl TEXT,
ActvtyDfn_EfctivePrd_End TEXT,
ActvtyDfn_EfctivePrd_Strt TEXT,
ActvtyDfn_Endsr_Nm TEXT,
ActvtyDfn_Endsr_Tlcm_Prd_End TEXT,
ActvtyDfn_Endsr_Tlcm_Prd_Strt TEXT,
ActvtyDfn_Endsr_Tlcm_Rnk TEXT,
ActvtyDfn_Endsr_Tlcm_Sys TEXT,
ActvtyDfn_Endsr_Tlcm_Use TEXT,
ActvtyDfn_Endsr_Tlcm_Vl TEXT,
ActvtyDfn_Exprmtl TEXT,
ActvtyDfn_Id_Assigner TEXT,
ActvtyDfn_Id_Prd_End TEXT,
ActvtyDfn_Id_Prd_Strt TEXT,
ActvtyDfn_Id_Sys TEXT,
ActvtyDfn_Id_Typ_Cdg_Cd TEXT,
ActvtyDfn_Id_Typ_Cdg_Dsply TEXT,
ActvtyDfn_Id_Typ_Cdg_Sys TEXT,
ActvtyDfn_Id_Typ_Cdg_UsrSltd TEXT,
ActvtyDfn_Id_Typ_Cdg_Vrsn TEXT,
ActvtyDfn_Id_Typ_Txt TEXT,
ActvtyDfn_Id_Use TEXT,
ActvtyDfn_Id_Vl TEXT,
ActvtyDfn_Intent TEXT,
ActvtyDfn_Jrsdctn_Cdg_Cd TEXT,
ActvtyDfn_Jrsdctn_Cdg_Dsply TEXT,
ActvtyDfn_Jrsdctn_Cdg_Sys TEXT,
ActvtyDfn_Jrsdctn_Cdg_UsrSltd TEXT,
ActvtyDfn_Jrsdctn_Cdg_Vrsn TEXT,
ActvtyDfn_Jrsdctn_Txt TEXT,
ActvtyDfn_Kind TEXT,
ActvtyDfn_LastReviewDt TEXT,
ActvtyDfn_Library TEXT,
ActvtyDfn_Lctn TEXT,
ActvtyDfn_Nm TEXT,
ActvtyDfn_ObsrvtnRqrment TEXT,
ActvtyDfn_ObsrvtnRsltRqrment TEXT,
ActvtyDfn_Prtcpnt_Role_Cdg_Cd TEXT,
ActvtyDfn_Prtcpnt_Role_Cdg_Dsply TEXT,
ActvtyDfn_Prtcpnt_Role_Cdg_Sys TEXT,
ActvtyDfn_Prtcpnt_Role_Cdg_UsrSltd TEXT,
ActvtyDfn_Prtcpnt_Role_Cdg_Vrsn TEXT,
ActvtyDfn_Prtcpnt_Role_Txt TEXT,
ActvtyDfn_Prtcpnt_Typ TEXT,
ActvtyDfn_Priority TEXT,
ActvtyDfn_PrdctCdbleCncpt_Cdg_Cd TEXT,
ActvtyDfn_PrdctCdbleCncpt_Cdg_Dsply TEXT,
ActvtyDfn_PrdctCdbleCncpt_Cdg_Sys TEXT,
ActvtyDfn_PrdctCdbleCncpt_Cdg_UsrSltd TEXT,
ActvtyDfn_PrdctCdbleCncpt_Cdg_Vrsn TEXT,
ActvtyDfn_PrdctCdbleCncpt_Txt TEXT,
ActvtyDfn_PrdctRfrnc TEXT,
ActvtyDfn_Profile TEXT,
ActvtyDfn_Pblshr TEXT,
ActvtyDfn_Prpse TEXT,
ActvtyDfn_Qnty_Cd TEXT,
ActvtyDfn_Qnty_Cmprtr TEXT,
ActvtyDfn_Qnty_Sys TEXT,
ActvtyDfn_Qnty_Unt TEXT,
ActvtyDfn_Qnty_Vl TEXT,
ActvtyDfn_RltedArtfct_Citation TEXT,
ActvtyDfn_RltedArtfct_Dsply TEXT,
ActvtyDfn_RltedArtfct_Doc_CntntTyp TEXT,
ActvtyDfn_RltedArtfct_Doc_Creation TEXT,
ActvtyDfn_RltedArtfct_Doc_Data TEXT,
ActvtyDfn_RltedArtfct_Doc_Hash TEXT,
ActvtyDfn_RltedArtfct_Doc_Lnguage TEXT,
ActvtyDfn_RltedArtfct_Doc_Sz TEXT,
ActvtyDfn_RltedArtfct_Doc_Ttl TEXT,
ActvtyDfn_RltedArtfct_Doc_Url TEXT,
ActvtyDfn_RltedArtfct_Lbl TEXT,
ActvtyDfn_RltedArtfct_Rsrc TEXT,
ActvtyDfn_RltedArtfct_Typ TEXT,
ActvtyDfn_RltedArtfct_Url TEXT,
ActvtyDfn_Rviewr_Nm TEXT,
ActvtyDfn_Rviewr_Tlcm_Prd_End TEXT,
ActvtyDfn_Rviewr_Tlcm_Prd_Strt TEXT,
ActvtyDfn_Rviewr_Tlcm_Rnk TEXT,
ActvtyDfn_Rviewr_Tlcm_Sys TEXT,
ActvtyDfn_Rviewr_Tlcm_Use TEXT,
ActvtyDfn_Rviewr_Tlcm_Vl TEXT,
ActvtyDfn_SpcmnRqrment TEXT,
ActvtyDfn_Sts TEXT,
ActvtyDfn_SbjctCdbleCncpt_Cdg_Cd TEXT,
ActvtyDfn_SbjctCdbleCncpt_Cdg_Dsply TEXT,
ActvtyDfn_SbjctCdbleCncpt_Cdg_Sys TEXT,
ActvtyDfn_SbjctCdbleCncpt_Cdg_UsrSltd TEXT,
ActvtyDfn_SbjctCdbleCncpt_Cdg_Vrsn TEXT,
ActvtyDfn_SbjctCdbleCncpt_Txt TEXT,
ActvtyDfn_SbjctRfrnc TEXT,
ActvtyDfn_Subtitle TEXT,
ActvtyDfn_TmgDtTimeTyp TEXT,
ActvtyDfn_TmgPrd_End TEXT,
ActvtyDfn_TmgPrd_Strt TEXT,
ActvtyDfn_TmgRng_Hi_Cd TEXT,
ActvtyDfn_TmgRng_Hi_Cmprtr TEXT,
ActvtyDfn_TmgRng_Hi_Sys TEXT,
ActvtyDfn_TmgRng_Hi_Unt TEXT,
ActvtyDfn_TmgRng_Hi_Vl TEXT,
ActvtyDfn_TmgRng_Lw_Cd TEXT,
ActvtyDfn_TmgRng_Lw_Cmprtr TEXT,
ActvtyDfn_TmgRng_Lw_Sys TEXT,
ActvtyDfn_TmgRng_Lw_Unt TEXT,
ActvtyDfn_TmgRng_Lw_Vl TEXT,
ActvtyDfn_TmgTmg_Cd_Cdg_Cd TEXT,
ActvtyDfn_TmgTmg_Cd_Cdg_Dsply TEXT,
ActvtyDfn_TmgTmg_Cd_Cdg_Sys TEXT,
ActvtyDfn_TmgTmg_Cd_Cdg_UsrSltd TEXT,
ActvtyDfn_TmgTmg_Cd_Cdg_Vrsn TEXT,
ActvtyDfn_TmgTmg_Cd_Txt TEXT,
ActvtyDfn_TmgTmg_Evnt TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsPrd_End TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strt TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cd TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Sys TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Unt TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Vl TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cd TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Sys TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Unt TEXT,
ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Vl TEXT,
ActvtyDfn_TmgTmg_Rpt_Cnt TEXT,
ActvtyDfn_TmgTmg_Rpt_CntMx TEXT,
ActvtyDfn_TmgTmg_Rpt_DayOfWeek TEXT,
ActvtyDfn_TmgTmg_Rpt_Duration TEXT,
ActvtyDfn_TmgTmg_Rpt_DurationMx TEXT,
ActvtyDfn_TmgTmg_Rpt_DurationUnt TEXT,
ActvtyDfn_TmgTmg_Rpt_Frqncy TEXT,
ActvtyDfn_TmgTmg_Rpt_FrqncyMx TEXT,
ActvtyDfn_TmgTmg_Rpt_Off TEXT,
ActvtyDfn_TmgTmg_Rpt_Prd TEXT,
ActvtyDfn_TmgTmg_Rpt_PrdMx TEXT,
ActvtyDfn_TmgTmg_Rpt_PrdUnt TEXT,
ActvtyDfn_TmgTmg_Rpt_TimeOfDay TEXT,
ActvtyDfn_TmgTmg_Rpt_When TEXT,
ActvtyDfn_Ttl TEXT,
ActvtyDfn_Topic_Cdg_Cd TEXT,
ActvtyDfn_Topic_Cdg_Dsply TEXT,
ActvtyDfn_Topic_Cdg_Sys TEXT,
ActvtyDfn_Topic_Cdg_UsrSltd TEXT,
ActvtyDfn_Topic_Cdg_Vrsn TEXT,
ActvtyDfn_Topic_Txt TEXT,
ActvtyDfn_Transform TEXT,
ActvtyDfn_Url TEXT,
ActvtyDfn_Usg TEXT,
ActvtyDfn_UseCntxt_Cd_Cd TEXT,
ActvtyDfn_UseCntxt_Cd_Dsply TEXT,
ActvtyDfn_UseCntxt_Cd_Sys TEXT,
ActvtyDfn_UseCntxt_Cd_UsrSltd TEXT,
ActvtyDfn_UseCntxt_Cd_Vrsn TEXT,
ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
ActvtyDfn_UseCntxt_VlCdbleCncpt_Txt TEXT,
ActvtyDfn_UseCntxt_VlQnty_Cd TEXT,
ActvtyDfn_UseCntxt_VlQnty_Cmprtr TEXT,
ActvtyDfn_UseCntxt_VlQnty_Sys TEXT,
ActvtyDfn_UseCntxt_VlQnty_Unt TEXT,
ActvtyDfn_UseCntxt_VlQnty_Vl TEXT,
ActvtyDfn_UseCntxt_VlRng_Hi_Cd TEXT,
ActvtyDfn_UseCntxt_VlRng_Hi_Cmprtr TEXT,
ActvtyDfn_UseCntxt_VlRng_Hi_Sys TEXT,
ActvtyDfn_UseCntxt_VlRng_Hi_Unt TEXT,
ActvtyDfn_UseCntxt_VlRng_Hi_Vl TEXT,
ActvtyDfn_UseCntxt_VlRng_Lw_Cd TEXT,
ActvtyDfn_UseCntxt_VlRng_Lw_Cmprtr TEXT,
ActvtyDfn_UseCntxt_VlRng_Lw_Sys TEXT,
ActvtyDfn_UseCntxt_VlRng_Lw_Unt TEXT,
ActvtyDfn_UseCntxt_VlRng_Lw_Vl TEXT,
ActvtyDfn_UseCntxt_VlRfrnc TEXT,
ActvtyDfn_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;