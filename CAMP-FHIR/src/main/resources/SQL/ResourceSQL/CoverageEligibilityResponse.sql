drop table if exists `CoverageEligibilityResponse`;
CREATE TABLE `CoverageEligibilityResponse` (
 id varchar(64),
CvgElgbltyRsps_Created TEXT,
CvgElgbltyRsps_Disposition TEXT,
CvgElgbltyRsps_Error_Cd_Cdg_Cd TEXT,
CvgElgbltyRsps_Error_Cd_Cdg_Dsply TEXT,
CvgElgbltyRsps_Error_Cd_Cdg_Sys TEXT,
CvgElgbltyRsps_Error_Cd_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Error_Cd_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Error_Cd_Txt TEXT,
CvgElgbltyRsps_Frm_Cdg_Cd TEXT,
CvgElgbltyRsps_Frm_Cdg_Dsply TEXT,
CvgElgbltyRsps_Frm_Cdg_Sys TEXT,
CvgElgbltyRsps_Frm_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Frm_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Frm_Txt TEXT,
CvgElgbltyRsps_Id_Assigner TEXT,
CvgElgbltyRsps_Id_Prd_End TEXT,
CvgElgbltyRsps_Id_Prd_Strt TEXT,
CvgElgbltyRsps_Id_Sys TEXT,
CvgElgbltyRsps_Id_Typ_Cdg_Cd TEXT,
CvgElgbltyRsps_Id_Typ_Cdg_Dsply TEXT,
CvgElgbltyRsps_Id_Typ_Cdg_Sys TEXT,
CvgElgbltyRsps_Id_Typ_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Id_Typ_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Id_Typ_Txt TEXT,
CvgElgbltyRsps_Id_Use TEXT,
CvgElgbltyRsps_Id_Vl TEXT,
CvgElgbltyRsps_Insrnc_BnftPrd_End TEXT,
CvgElgbltyRsps_Insrnc_BnftPrd_Strt TEXT,
CvgElgbltyRsps_Insrnc_Cvg TEXT,
CvgElgbltyRsps_Insrnc_Inforce TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnRequired TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_AthztnUrl TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Crncy TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Vl TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedStrgTyp TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedUnsignedIntTyp TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Crncy TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Vl TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedStrgTyp TEXT,
CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedUnsignedIntTyp TEXT,
CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Ctgry_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_Dscrptn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Excluded TEXT,
CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Mdfr_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_Nm TEXT,
CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Network_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_Provider TEXT,
CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Trm_Txt TEXT,
CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Cd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Dsply TEXT,
CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Sys TEXT,
CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_UsrSltd TEXT,
CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Vrsn TEXT,
CvgElgbltyRsps_Insrnc_Itm_Unt_Txt TEXT,
CvgElgbltyRsps_Insurer TEXT,
CvgElgbltyRsps_Outcome TEXT,
CvgElgbltyRsps_Pnt TEXT,
CvgElgbltyRsps_PreAuthRef TEXT,
CvgElgbltyRsps_Prpse TEXT,
CvgElgbltyRsps_Rqst TEXT,
CvgElgbltyRsps_Rqstor TEXT,
CvgElgbltyRsps_SrvdDtTyp TEXT,
CvgElgbltyRsps_SrvdPrd_End TEXT,
CvgElgbltyRsps_SrvdPrd_Strt TEXT,
CvgElgbltyRsps_Sts TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;