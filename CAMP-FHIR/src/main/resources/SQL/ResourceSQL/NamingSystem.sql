drop table if exists `NamingSystem`;
CREATE TABLE `NamingSystem` (
 id varchar(64),
NmingSys_Cntct_Nm TEXT,
NmingSys_Cntct_Tlcm_Prd_End TEXT,
NmingSys_Cntct_Tlcm_Prd_Strt TEXT,
NmingSys_Cntct_Tlcm_Rnk TEXT,
NmingSys_Cntct_Tlcm_Sys TEXT,
NmingSys_Cntct_Tlcm_Use TEXT,
NmingSys_Cntct_Tlcm_Vl TEXT,
NmingSys_Dt TEXT,
NmingSys_Dscrptn TEXT,
NmingSys_Jrsdctn_Cdg_Cd TEXT,
NmingSys_Jrsdctn_Cdg_Dsply TEXT,
NmingSys_Jrsdctn_Cdg_Sys TEXT,
NmingSys_Jrsdctn_Cdg_UsrSltd TEXT,
NmingSys_Jrsdctn_Cdg_Vrsn TEXT,
NmingSys_Jrsdctn_Txt TEXT,
NmingSys_Kind TEXT,
NmingSys_Nm TEXT,
NmingSys_Pblshr TEXT,
NmingSys_Responsible TEXT,
NmingSys_Sts TEXT,
NmingSys_Typ_Cdg_Cd TEXT,
NmingSys_Typ_Cdg_Dsply TEXT,
NmingSys_Typ_Cdg_Sys TEXT,
NmingSys_Typ_Cdg_UsrSltd TEXT,
NmingSys_Typ_Cdg_Vrsn TEXT,
NmingSys_Typ_Txt TEXT,
NmingSys_UniqueId_Comment TEXT,
NmingSys_UniqueId_Prd_End TEXT,
NmingSys_UniqueId_Prd_Strt TEXT,
NmingSys_UniqueId_Preferred TEXT,
NmingSys_UniqueId_Typ TEXT,
NmingSys_UniqueId_Vl TEXT,
NmingSys_Usg TEXT,
NmingSys_UseCntxt_Cd_Cd TEXT,
NmingSys_UseCntxt_Cd_Dsply TEXT,
NmingSys_UseCntxt_Cd_Sys TEXT,
NmingSys_UseCntxt_Cd_UsrSltd TEXT,
NmingSys_UseCntxt_Cd_Vrsn TEXT,
NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
NmingSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
NmingSys_UseCntxt_VlCdbleCncpt_Txt TEXT,
NmingSys_UseCntxt_VlQnty_Cd TEXT,
NmingSys_UseCntxt_VlQnty_Cmprtr TEXT,
NmingSys_UseCntxt_VlQnty_Sys TEXT,
NmingSys_UseCntxt_VlQnty_Unt TEXT,
NmingSys_UseCntxt_VlQnty_Vl TEXT,
NmingSys_UseCntxt_VlRng_Hi_Cd TEXT,
NmingSys_UseCntxt_VlRng_Hi_Cmprtr TEXT,
NmingSys_UseCntxt_VlRng_Hi_Sys TEXT,
NmingSys_UseCntxt_VlRng_Hi_Unt TEXT,
NmingSys_UseCntxt_VlRng_Hi_Vl TEXT,
NmingSys_UseCntxt_VlRng_Lw_Cd TEXT,
NmingSys_UseCntxt_VlRng_Lw_Cmprtr TEXT,
NmingSys_UseCntxt_VlRng_Lw_Sys TEXT,
NmingSys_UseCntxt_VlRng_Lw_Unt TEXT,
NmingSys_UseCntxt_VlRng_Lw_Vl TEXT,
NmingSys_UseCntxt_VlRfrnc TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;