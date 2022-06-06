drop table if exists `CodeSystem`;
CREATE TABLE `CodeSystem` (
 id varchar(64),
CdSys_CaseSensitive TEXT,
CdSys_Cmpsitional TEXT,
CdSys_Cncpt_Cd TEXT,
CdSys_Cncpt_Dfn TEXT,
CdSys_Cncpt_Dsgnation_Lnguage TEXT,
CdSys_Cncpt_Dsgnation_Use_Cd TEXT,
CdSys_Cncpt_Dsgnation_Use_Dsply TEXT,
CdSys_Cncpt_Dsgnation_Use_Sys TEXT,
CdSys_Cncpt_Dsgnation_Use_UsrSltd TEXT,
CdSys_Cncpt_Dsgnation_Use_Vrsn TEXT,
CdSys_Cncpt_Dsgnation_Vl TEXT,
CdSys_Cncpt_Dsply TEXT,
CdSys_Cncpt_Prpty_Cd TEXT,
CdSys_Cncpt_Prpty_VlBooleanTyp TEXT,
CdSys_Cncpt_Prpty_VlCdTyp TEXT,
CdSys_Cncpt_Prpty_VlCdg_Cd TEXT,
CdSys_Cncpt_Prpty_VlCdg_Dsply TEXT,
CdSys_Cncpt_Prpty_VlCdg_Sys TEXT,
CdSys_Cncpt_Prpty_VlCdg_UsrSltd TEXT,
CdSys_Cncpt_Prpty_VlCdg_Vrsn TEXT,
CdSys_Cncpt_Prpty_VlDtTimeTyp TEXT,
CdSys_Cncpt_Prpty_VlDecimalTyp TEXT,
CdSys_Cncpt_Prpty_VlIntegerTyp TEXT,
CdSys_Cncpt_Prpty_VlStrgTyp TEXT,
CdSys_Cntct_Nm TEXT,
CdSys_Cntct_Tlcm_Prd_End TEXT,
CdSys_Cntct_Tlcm_Prd_Strt TEXT,
CdSys_Cntct_Tlcm_Rnk TEXT,
CdSys_Cntct_Tlcm_Sys TEXT,
CdSys_Cntct_Tlcm_Use TEXT,
CdSys_Cntct_Tlcm_Vl TEXT,
CdSys_Cntnt TEXT,
CdSys_Copyright TEXT,
CdSys_Cnt TEXT,
CdSys_Dt TEXT,
CdSys_Dscrptn TEXT,
CdSys_Exprmtl TEXT,
CdSys_Fltr_Cd TEXT,
CdSys_Fltr_Dscrptn TEXT,
CdSys_Fltr_Operator TEXT,
CdSys_Fltr_Vl TEXT,
CdSys_HierarchyMeaning TEXT,
CdSys_Id_Assigner TEXT,
CdSys_Id_Prd_End TEXT,
CdSys_Id_Prd_Strt TEXT,
CdSys_Id_Sys TEXT,
CdSys_Id_Typ_Cdg_Cd TEXT,
CdSys_Id_Typ_Cdg_Dsply TEXT,
CdSys_Id_Typ_Cdg_Sys TEXT,
CdSys_Id_Typ_Cdg_UsrSltd TEXT,
CdSys_Id_Typ_Cdg_Vrsn TEXT,
CdSys_Id_Typ_Txt TEXT,
CdSys_Id_Use TEXT,
CdSys_Id_Vl TEXT,
CdSys_Jrsdctn_Cdg_Cd TEXT,
CdSys_Jrsdctn_Cdg_Dsply TEXT,
CdSys_Jrsdctn_Cdg_Sys TEXT,
CdSys_Jrsdctn_Cdg_UsrSltd TEXT,
CdSys_Jrsdctn_Cdg_Vrsn TEXT,
CdSys_Jrsdctn_Txt TEXT,
CdSys_Nm TEXT,
CdSys_Prpty_Cd TEXT,
CdSys_Prpty_Dscrptn TEXT,
CdSys_Prpty_Typ TEXT,
CdSys_Prpty_Uri TEXT,
CdSys_Pblshr TEXT,
CdSys_Prpse TEXT,
CdSys_Sts TEXT,
CdSys_Supplements TEXT,
CdSys_Ttl TEXT,
CdSys_Url TEXT,
CdSys_UseCntxt_Cd_Cd TEXT,
CdSys_UseCntxt_Cd_Dsply TEXT,
CdSys_UseCntxt_Cd_Sys TEXT,
CdSys_UseCntxt_Cd_UsrSltd TEXT,
CdSys_UseCntxt_Cd_Vrsn TEXT,
CdSys_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
CdSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
CdSys_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
CdSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
CdSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
CdSys_UseCntxt_VlCdbleCncpt_Txt TEXT,
CdSys_UseCntxt_VlQnty_Cd TEXT,
CdSys_UseCntxt_VlQnty_Cmprtr TEXT,
CdSys_UseCntxt_VlQnty_Sys TEXT,
CdSys_UseCntxt_VlQnty_Unt TEXT,
CdSys_UseCntxt_VlQnty_Vl TEXT,
CdSys_UseCntxt_VlRng_Hi_Cd TEXT,
CdSys_UseCntxt_VlRng_Hi_Cmprtr TEXT,
CdSys_UseCntxt_VlRng_Hi_Sys TEXT,
CdSys_UseCntxt_VlRng_Hi_Unt TEXT,
CdSys_UseCntxt_VlRng_Hi_Vl TEXT,
CdSys_UseCntxt_VlRng_Lw_Cd TEXT,
CdSys_UseCntxt_VlRng_Lw_Cmprtr TEXT,
CdSys_UseCntxt_VlRng_Lw_Sys TEXT,
CdSys_UseCntxt_VlRng_Lw_Unt TEXT,
CdSys_UseCntxt_VlRng_Lw_Vl TEXT,
CdSys_UseCntxt_VlRfrnc TEXT,
CdSys_VlSt TEXT,
CdSys_Vrsn TEXT,
CdSys_VrsnNeeded TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;