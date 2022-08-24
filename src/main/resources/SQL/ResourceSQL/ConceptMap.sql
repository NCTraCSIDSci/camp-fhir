drop table if exists `ConceptMap`;
CREATE TABLE `ConceptMap` (
 id varchar(64),
CncptMap_Cntct_Nm TEXT,
CncptMap_Cntct_Tlcm_Prd_End TEXT,
CncptMap_Cntct_Tlcm_Prd_Strt TEXT,
CncptMap_Cntct_Tlcm_Rnk TEXT,
CncptMap_Cntct_Tlcm_Sys TEXT,
CncptMap_Cntct_Tlcm_Use TEXT,
CncptMap_Cntct_Tlcm_Vl TEXT,
CncptMap_Copyright TEXT,
CncptMap_Dt TEXT,
CncptMap_Dscrptn TEXT,
CncptMap_Exprmtl TEXT,
CncptMap_Grp_Src TEXT,
CncptMap_Grp_SrcVrsn TEXT,
CncptMap_Grp_TarVrsn TEXT,
CncptMap_Grp_Unmapped_Cd TEXT,
CncptMap_Grp_Unmapped_Dsply TEXT,
CncptMap_Grp_Unmapped_Mode TEXT,
CncptMap_Grp_Unmapped_Url TEXT,
CncptMap_Id_Assigner TEXT,
CncptMap_Id_Prd_End TEXT,
CncptMap_Id_Prd_Strt TEXT,
CncptMap_Id_Sys TEXT,
CncptMap_Id_Typ_Cdg_Cd TEXT,
CncptMap_Id_Typ_Cdg_Dsply TEXT,
CncptMap_Id_Typ_Cdg_Sys TEXT,
CncptMap_Id_Typ_Cdg_UsrSltd TEXT,
CncptMap_Id_Typ_Cdg_Vrsn TEXT,
CncptMap_Id_Typ_Txt TEXT,
CncptMap_Id_Use TEXT,
CncptMap_Id_Vl TEXT,
CncptMap_Jrsdctn_Cdg_Cd TEXT,
CncptMap_Jrsdctn_Cdg_Dsply TEXT,
CncptMap_Jrsdctn_Cdg_Sys TEXT,
CncptMap_Jrsdctn_Cdg_UsrSltd TEXT,
CncptMap_Jrsdctn_Cdg_Vrsn TEXT,
CncptMap_Jrsdctn_Txt TEXT,
CncptMap_Nm TEXT,
CncptMap_Pblshr TEXT,
CncptMap_Prpse TEXT,
CncptMap_SrcCanonicalTyp TEXT,
CncptMap_SrcUriTyp TEXT,
CncptMap_Sts TEXT,
CncptMap_TarCanonicalTyp TEXT,
CncptMap_TarUriTyp TEXT,
CncptMap_Ttl TEXT,
CncptMap_Url TEXT,
CncptMap_UseCntxt_Cd_Cd TEXT,
CncptMap_UseCntxt_Cd_Dsply TEXT,
CncptMap_UseCntxt_Cd_Sys TEXT,
CncptMap_UseCntxt_Cd_UsrSltd TEXT,
CncptMap_UseCntxt_Cd_Vrsn TEXT,
CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT,
CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT,
CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT,
CncptMap_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT,
CncptMap_UseCntxt_VlCdbleCncpt_Txt TEXT,
CncptMap_UseCntxt_VlQnty_Cd TEXT,
CncptMap_UseCntxt_VlQnty_Cmprtr TEXT,
CncptMap_UseCntxt_VlQnty_Sys TEXT,
CncptMap_UseCntxt_VlQnty_Unt TEXT,
CncptMap_UseCntxt_VlQnty_Vl TEXT,
CncptMap_UseCntxt_VlRng_Hi_Cd TEXT,
CncptMap_UseCntxt_VlRng_Hi_Cmprtr TEXT,
CncptMap_UseCntxt_VlRng_Hi_Sys TEXT,
CncptMap_UseCntxt_VlRng_Hi_Unt TEXT,
CncptMap_UseCntxt_VlRng_Hi_Vl TEXT,
CncptMap_UseCntxt_VlRng_Lw_Cd TEXT,
CncptMap_UseCntxt_VlRng_Lw_Cmprtr TEXT,
CncptMap_UseCntxt_VlRng_Lw_Sys TEXT,
CncptMap_UseCntxt_VlRng_Lw_Unt TEXT,
CncptMap_UseCntxt_VlRng_Lw_Vl TEXT,
CncptMap_UseCntxt_VlRfrnc TEXT,
CncptMap_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;