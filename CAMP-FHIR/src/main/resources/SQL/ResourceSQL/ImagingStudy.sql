drop table if exists `ImagingStudy`;
CREATE TABLE `ImagingStudy` (
 id varchar(64),
ImgngStdy_BasedOn TEXT,
ImgngStdy_Dscrptn TEXT,
ImgngStdy_Enc TEXT,
ImgngStdy_Endpoint TEXT,
ImgngStdy_Id_Assigner TEXT,
ImgngStdy_Id_Prd_End TEXT,
ImgngStdy_Id_Prd_Strt TEXT,
ImgngStdy_Id_Sys TEXT,
ImgngStdy_Id_Typ_Cdg_Cd TEXT,
ImgngStdy_Id_Typ_Cdg_Dsply TEXT,
ImgngStdy_Id_Typ_Cdg_Sys TEXT,
ImgngStdy_Id_Typ_Cdg_UsrSltd TEXT,
ImgngStdy_Id_Typ_Cdg_Vrsn TEXT,
ImgngStdy_Id_Typ_Txt TEXT,
ImgngStdy_Id_Use TEXT,
ImgngStdy_Id_Vl TEXT,
ImgngStdy_Interpreter TEXT,
ImgngStdy_Lctn TEXT,
ImgngStdy_Modality_Cd TEXT,
ImgngStdy_Modality_Dsply TEXT,
ImgngStdy_Modality_Sys TEXT,
ImgngStdy_Modality_UsrSltd TEXT,
ImgngStdy_Modality_Vrsn TEXT,
ImgngStdy_Nt_AthrRfrnc TEXT,
ImgngStdy_Nt_AthrStrgTyp TEXT,
ImgngStdy_Nt_Txt TEXT,
ImgngStdy_Nt_Time TEXT,
ImgngStdy_NmbrOfInstances TEXT,
ImgngStdy_NmbrOfSeries TEXT,
ImgngStdy_PrcdrCd_Cdg_Cd TEXT,
ImgngStdy_PrcdrCd_Cdg_Dsply TEXT,
ImgngStdy_PrcdrCd_Cdg_Sys TEXT,
ImgngStdy_PrcdrCd_Cdg_UsrSltd TEXT,
ImgngStdy_PrcdrCd_Cdg_Vrsn TEXT,
ImgngStdy_PrcdrCd_Txt TEXT,
ImgngStdy_PrcdrRfrnc TEXT,
ImgngStdy_RsnCd_Cdg_Cd TEXT,
ImgngStdy_RsnCd_Cdg_Dsply TEXT,
ImgngStdy_RsnCd_Cdg_Sys TEXT,
ImgngStdy_RsnCd_Cdg_UsrSltd TEXT,
ImgngStdy_RsnCd_Cdg_Vrsn TEXT,
ImgngStdy_RsnCd_Txt TEXT,
ImgngStdy_RsnRfrnc TEXT,
ImgngStdy_Referrer TEXT,
ImgngStdy_Series_BodySite_Cd TEXT,
ImgngStdy_Series_BodySite_Dsply TEXT,
ImgngStdy_Series_BodySite_Sys TEXT,
ImgngStdy_Series_BodySite_UsrSltd TEXT,
ImgngStdy_Series_BodySite_Vrsn TEXT,
ImgngStdy_Series_Dscrptn TEXT,
ImgngStdy_Series_Endpoint TEXT,
ImgngStdy_Series_Instance_Nmbr TEXT,
ImgngStdy_Series_Instance_SopCls_Cd TEXT,
ImgngStdy_Series_Instance_SopCls_Dsply TEXT,
ImgngStdy_Series_Instance_SopCls_Sys TEXT,
ImgngStdy_Series_Instance_SopCls_UsrSltd TEXT,
ImgngStdy_Series_Instance_SopCls_Vrsn TEXT,
ImgngStdy_Series_Instance_Ttl TEXT,
ImgngStdy_Series_Instance_Uid TEXT,
ImgngStdy_Series_Laterality_Cd TEXT,
ImgngStdy_Series_Laterality_Dsply TEXT,
ImgngStdy_Series_Laterality_Sys TEXT,
ImgngStdy_Series_Laterality_UsrSltd TEXT,
ImgngStdy_Series_Laterality_Vrsn TEXT,
ImgngStdy_Series_Modality_Cd TEXT,
ImgngStdy_Series_Modality_Dsply TEXT,
ImgngStdy_Series_Modality_Sys TEXT,
ImgngStdy_Series_Modality_UsrSltd TEXT,
ImgngStdy_Series_Modality_Vrsn TEXT,
ImgngStdy_Series_Nmbr TEXT,
ImgngStdy_Series_NmbrOfInstances TEXT,
ImgngStdy_Series_Prfrmr_Actor TEXT,
ImgngStdy_Series_Prfrmr_Function_Cdg_Cd TEXT,
ImgngStdy_Series_Prfrmr_Function_Cdg_Dsply TEXT,
ImgngStdy_Series_Prfrmr_Function_Cdg_Sys TEXT,
ImgngStdy_Series_Prfrmr_Function_Cdg_UsrSltd TEXT,
ImgngStdy_Series_Prfrmr_Function_Cdg_Vrsn TEXT,
ImgngStdy_Series_Prfrmr_Function_Txt TEXT,
ImgngStdy_Series_Spcmn TEXT,
ImgngStdy_Series_Strted TEXT,
ImgngStdy_Series_Uid TEXT,
ImgngStdy_Strted TEXT,
ImgngStdy_Sts TEXT,
ImgngStdy_Sbjct TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;