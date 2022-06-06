drop table if exists `OperationDefinition`;
CREATE TABLE `OperationDefinition` (
 id varchar(64),
OprtnDfn_AffectsState TEXT,
OprtnDfn_Base TEXT,
OprtnDfn_Cd TEXT,
OprtnDfn_Comment TEXT,
OprtnDfn_Cntct_Nm TEXT,
OprtnDfn_Cntct_Tlcm_Prd_End TEXT,
OprtnDfn_Cntct_Tlcm_Prd_Strt TEXT,
OprtnDfn_Cntct_Tlcm_Rnk TEXT,
OprtnDfn_Cntct_Tlcm_Sys TEXT,
OprtnDfn_Cntct_Tlcm_Use TEXT,
OprtnDfn_Cntct_Tlcm_Vl TEXT,
OprtnDfn_Dt TEXT,
OprtnDfn_Dscrptn TEXT,
OprtnDfn_Exprmtl TEXT,
OprtnDfn_InputProfile TEXT,
OprtnDfn_Instance TEXT,
OprtnDfn_Jrsdctn_Cdg_Cd TEXT,
OprtnDfn_Jrsdctn_Cdg_Dsply TEXT,
OprtnDfn_Jrsdctn_Cdg_Sys TEXT,
OprtnDfn_Jrsdctn_Cdg_UsrSltd TEXT,
OprtnDfn_Jrsdctn_Cdg_Vrsn TEXT,
OprtnDfn_Jrsdctn_Txt TEXT,
OprtnDfn_Kind TEXT,
OprtnDfn_Nm TEXT,
OprtnDfn_OutputProfile TEXT,
OprtnDfn_Overload_Comment TEXT,
OprtnDfn_Overload_PrmtrNm TEXT,
OprtnDfn_Prmtr_Binding_Str TEXT,
OprtnDfn_Prmtr_Binding_VlSt TEXT,
OprtnDfn_Prmtr_Docation TEXT,
OprtnDfn_Prmtr_Mx TEXT,
OprtnDfn_Prmtr_Min TEXT,
OprtnDfn_Prmtr_Nm TEXT,
OprtnDfn_Prmtr_RfrncdFrom_Src TEXT,
OprtnDfn_Prmtr_RfrncdFrom_SrcId TEXT,
OprtnDfn_Prmtr_SrchTyp TEXT,
OprtnDfn_Prmtr_TarProfile TEXT,
OprtnDfn_Prmtr_Typ TEXT,
OprtnDfn_Prmtr_Use TEXT,
OprtnDfn_Pblshr TEXT,
OprtnDfn_Prpse TEXT,
OprtnDfn_Rsrc TEXT,
OprtnDfn_Sts TEXT,
OprtnDfn_Sys TEXT,
OprtnDfn_Ttl TEXT,
OprtnDfn_Typ TEXT,
OprtnDfn_Url TEXT,
OprtnDfn_UseCntxt_Cd_Cd TEXT,
OprtnDfn_UseCntxt_Cd_Dsply TEXT,
OprtnDfn_UseCntxt_Cd_Sys TEXT,
OprtnDfn_UseCntxt_Cd_UsrSltd TEXT,
OprtnDfn_UseCntxt_Cd_Vrsn TEXT,
OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
OprtnDfn_UseCntxt_VlCdbleCncpt_Txt TEXT,
OprtnDfn_UseCntxt_VlQnty_Cd TEXT,
OprtnDfn_UseCntxt_VlQnty_Cmprtr TEXT,
OprtnDfn_UseCntxt_VlQnty_Sys TEXT,
OprtnDfn_UseCntxt_VlQnty_Unt TEXT,
OprtnDfn_UseCntxt_VlQnty_Vl TEXT,
OprtnDfn_UseCntxt_VlRng_Hi_Cd TEXT,
OprtnDfn_UseCntxt_VlRng_Hi_Cmprtr TEXT,
OprtnDfn_UseCntxt_VlRng_Hi_Sys TEXT,
OprtnDfn_UseCntxt_VlRng_Hi_Unt TEXT,
OprtnDfn_UseCntxt_VlRng_Hi_Vl TEXT,
OprtnDfn_UseCntxt_VlRng_Lw_Cd TEXT,
OprtnDfn_UseCntxt_VlRng_Lw_Cmprtr TEXT,
OprtnDfn_UseCntxt_VlRng_Lw_Sys TEXT,
OprtnDfn_UseCntxt_VlRng_Lw_Unt TEXT,
OprtnDfn_UseCntxt_VlRng_Lw_Vl TEXT,
OprtnDfn_UseCntxt_VlRfrnc TEXT,
OprtnDfn_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;