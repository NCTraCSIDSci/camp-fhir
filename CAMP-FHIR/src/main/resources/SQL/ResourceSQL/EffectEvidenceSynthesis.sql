drop table if exists `EffectEvidenceSynthesis`;
CREATE TABLE `EffectEvidenceSynthesis` (
 id varchar(64),
EfctEvdnceSynths_ApprovalDt TEXT,
EfctEvdnceSynths_Athr_Nm TEXT,
EfctEvdnceSynths_Athr_Tlcm_Prd_End TEXT,
EfctEvdnceSynths_Athr_Tlcm_Prd_Strt TEXT,
EfctEvdnceSynths_Athr_Tlcm_Rnk TEXT,
EfctEvdnceSynths_Athr_Tlcm_Sys TEXT,
EfctEvdnceSynths_Athr_Tlcm_Use TEXT,
EfctEvdnceSynths_Athr_Tlcm_Vl TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn TEXT,
EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt TEXT,
EfctEvdnceSynths_Crtnty_Nt_AthrRfrnc TEXT,
EfctEvdnceSynths_Crtnty_Nt_AthrStrgTyp TEXT,
EfctEvdnceSynths_Crtnty_Nt_Txt TEXT,
EfctEvdnceSynths_Crtnty_Nt_Time TEXT,
EfctEvdnceSynths_Crtnty_Rating_Cdg_Cd TEXT,
EfctEvdnceSynths_Crtnty_Rating_Cdg_Dsply TEXT,
EfctEvdnceSynths_Crtnty_Rating_Cdg_Sys TEXT,
EfctEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_Crtnty_Rating_Cdg_Vrsn TEXT,
EfctEvdnceSynths_Crtnty_Rating_Txt TEXT,
EfctEvdnceSynths_Cntct_Nm TEXT,
EfctEvdnceSynths_Cntct_Tlcm_Prd_End TEXT,
EfctEvdnceSynths_Cntct_Tlcm_Prd_Strt TEXT,
EfctEvdnceSynths_Cntct_Tlcm_Rnk TEXT,
EfctEvdnceSynths_Cntct_Tlcm_Sys TEXT,
EfctEvdnceSynths_Cntct_Tlcm_Use TEXT,
EfctEvdnceSynths_Cntct_Tlcm_Vl TEXT,
EfctEvdnceSynths_Copyright TEXT,
EfctEvdnceSynths_Dt TEXT,
EfctEvdnceSynths_Dscrptn TEXT,
EfctEvdnceSynths_Editor_Nm TEXT,
EfctEvdnceSynths_Editor_Tlcm_Prd_End TEXT,
EfctEvdnceSynths_Editor_Tlcm_Prd_Strt TEXT,
EfctEvdnceSynths_Editor_Tlcm_Rnk TEXT,
EfctEvdnceSynths_Editor_Tlcm_Sys TEXT,
EfctEvdnceSynths_Editor_Tlcm_Use TEXT,
EfctEvdnceSynths_Editor_Tlcm_Vl TEXT,
EfctEvdnceSynths_EfctEstmt_Dscrptn TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_From TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Level TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_To TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Cd TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Dsply TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Sys TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Vrsn TEXT,
EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Txt TEXT,
EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Cd TEXT,
EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Dsply TEXT,
EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Sys TEXT,
EfctEvdnceSynths_EfctEstmt_Typ_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Vrsn TEXT,
EfctEvdnceSynths_EfctEstmt_Typ_Txt TEXT,
EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Cd TEXT,
EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Dsply TEXT,
EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Sys TEXT,
EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Vrsn TEXT,
EfctEvdnceSynths_EfctEstmt_UntOfMsr_Txt TEXT,
EfctEvdnceSynths_EfctEstmt_Vl TEXT,
EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Cd TEXT,
EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Dsply TEXT,
EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Sys TEXT,
EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Vrsn TEXT,
EfctEvdnceSynths_EfctEstmt_VariantState_Txt TEXT,
EfctEvdnceSynths_EfctivePrd_End TEXT,
EfctEvdnceSynths_EfctivePrd_Strt TEXT,
EfctEvdnceSynths_Endsr_Nm TEXT,
EfctEvdnceSynths_Endsr_Tlcm_Prd_End TEXT,
EfctEvdnceSynths_Endsr_Tlcm_Prd_Strt TEXT,
EfctEvdnceSynths_Endsr_Tlcm_Rnk TEXT,
EfctEvdnceSynths_Endsr_Tlcm_Sys TEXT,
EfctEvdnceSynths_Endsr_Tlcm_Use TEXT,
EfctEvdnceSynths_Endsr_Tlcm_Vl TEXT,
EfctEvdnceSynths_Exposure TEXT,
EfctEvdnceSynths_ExposureAlternative TEXT,
EfctEvdnceSynths_Id_Assigner TEXT,
EfctEvdnceSynths_Id_Prd_End TEXT,
EfctEvdnceSynths_Id_Prd_Strt TEXT,
EfctEvdnceSynths_Id_Sys TEXT,
EfctEvdnceSynths_Id_Typ_Cdg_Cd TEXT,
EfctEvdnceSynths_Id_Typ_Cdg_Dsply TEXT,
EfctEvdnceSynths_Id_Typ_Cdg_Sys TEXT,
EfctEvdnceSynths_Id_Typ_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_Id_Typ_Cdg_Vrsn TEXT,
EfctEvdnceSynths_Id_Typ_Txt TEXT,
EfctEvdnceSynths_Id_Use TEXT,
EfctEvdnceSynths_Id_Vl TEXT,
EfctEvdnceSynths_Jrsdctn_Cdg_Cd TEXT,
EfctEvdnceSynths_Jrsdctn_Cdg_Dsply TEXT,
EfctEvdnceSynths_Jrsdctn_Cdg_Sys TEXT,
EfctEvdnceSynths_Jrsdctn_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_Jrsdctn_Cdg_Vrsn TEXT,
EfctEvdnceSynths_Jrsdctn_Txt TEXT,
EfctEvdnceSynths_LastReviewDt TEXT,
EfctEvdnceSynths_Nm TEXT,
EfctEvdnceSynths_Nt_AthrRfrnc TEXT,
EfctEvdnceSynths_Nt_AthrStrgTyp TEXT,
EfctEvdnceSynths_Nt_Txt TEXT,
EfctEvdnceSynths_Nt_Time TEXT,
EfctEvdnceSynths_Outcome TEXT,
EfctEvdnceSynths_Popln TEXT,
EfctEvdnceSynths_Pblshr TEXT,
EfctEvdnceSynths_RltedArtfct_Citation TEXT,
EfctEvdnceSynths_RltedArtfct_Dsply TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_CntntTyp TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Creation TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Data TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Hash TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Lnguage TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Sz TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Ttl TEXT,
EfctEvdnceSynths_RltedArtfct_Doc_Url TEXT,
EfctEvdnceSynths_RltedArtfct_Lbl TEXT,
EfctEvdnceSynths_RltedArtfct_Rsrc TEXT,
EfctEvdnceSynths_RltedArtfct_Typ TEXT,
EfctEvdnceSynths_RltedArtfct_Url TEXT,
EfctEvdnceSynths_RsltsByExposure_Dscrptn TEXT,
EfctEvdnceSynths_RsltsByExposure_ExposureState TEXT,
EfctEvdnceSynths_RsltsByExposure_RskEvdnceSynths TEXT,
EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Cd TEXT,
EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Dsply TEXT,
EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Sys TEXT,
EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Vrsn TEXT,
EfctEvdnceSynths_RsltsByExposure_VariantState_Txt TEXT,
EfctEvdnceSynths_Rviewr_Nm TEXT,
EfctEvdnceSynths_Rviewr_Tlcm_Prd_End TEXT,
EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strt TEXT,
EfctEvdnceSynths_Rviewr_Tlcm_Rnk TEXT,
EfctEvdnceSynths_Rviewr_Tlcm_Sys TEXT,
EfctEvdnceSynths_Rviewr_Tlcm_Use TEXT,
EfctEvdnceSynths_Rviewr_Tlcm_Vl TEXT,
EfctEvdnceSynths_SampleSz_Dscrptn TEXT,
EfctEvdnceSynths_SampleSz_NmbrOfPrtcpnts TEXT,
EfctEvdnceSynths_SampleSz_NmbrOfStudies TEXT,
EfctEvdnceSynths_Sts TEXT,
EfctEvdnceSynths_StdyTyp_Cdg_Cd TEXT,
EfctEvdnceSynths_StdyTyp_Cdg_Dsply TEXT,
EfctEvdnceSynths_StdyTyp_Cdg_Sys TEXT,
EfctEvdnceSynths_StdyTyp_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_StdyTyp_Cdg_Vrsn TEXT,
EfctEvdnceSynths_StdyTyp_Txt TEXT,
EfctEvdnceSynths_SynthsTyp_Cdg_Cd TEXT,
EfctEvdnceSynths_SynthsTyp_Cdg_Dsply TEXT,
EfctEvdnceSynths_SynthsTyp_Cdg_Sys TEXT,
EfctEvdnceSynths_SynthsTyp_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_SynthsTyp_Cdg_Vrsn TEXT,
EfctEvdnceSynths_SynthsTyp_Txt TEXT,
EfctEvdnceSynths_Ttl TEXT,
EfctEvdnceSynths_Topic_Cdg_Cd TEXT,
EfctEvdnceSynths_Topic_Cdg_Dsply TEXT,
EfctEvdnceSynths_Topic_Cdg_Sys TEXT,
EfctEvdnceSynths_Topic_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_Topic_Cdg_Vrsn TEXT,
EfctEvdnceSynths_Topic_Txt TEXT,
EfctEvdnceSynths_Url TEXT,
EfctEvdnceSynths_UseCntxt_Cd_Cd TEXT,
EfctEvdnceSynths_UseCntxt_Cd_Dsply TEXT,
EfctEvdnceSynths_UseCntxt_Cd_Sys TEXT,
EfctEvdnceSynths_UseCntxt_Cd_UsrSltd TEXT,
EfctEvdnceSynths_UseCntxt_Cd_Vrsn TEXT,
EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt TEXT,
EfctEvdnceSynths_UseCntxt_VlQnty_Cd TEXT,
EfctEvdnceSynths_UseCntxt_VlQnty_Cmprtr TEXT,
EfctEvdnceSynths_UseCntxt_VlQnty_Sys TEXT,
EfctEvdnceSynths_UseCntxt_VlQnty_Unt TEXT,
EfctEvdnceSynths_UseCntxt_VlQnty_Vl TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cd TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cmprtr TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Hi_Sys TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Hi_Unt TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Hi_Vl TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cd TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cmprtr TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Lw_Sys TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Lw_Unt TEXT,
EfctEvdnceSynths_UseCntxt_VlRng_Lw_Vl TEXT,
EfctEvdnceSynths_UseCntxt_VlRfrnc TEXT,
EfctEvdnceSynths_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;