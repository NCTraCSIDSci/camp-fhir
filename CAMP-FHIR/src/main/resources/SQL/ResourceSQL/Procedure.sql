drop table if exists `Procedure`;
CREATE TABLE `Procedure` (
 id varchar(64),
Prcdr_Asserter TEXT,
Prcdr_BasedOn TEXT,
Prcdr_BodySite_Cdg_Cd TEXT,
Prcdr_BodySite_Cdg_Dsply TEXT,
Prcdr_BodySite_Cdg_Sys TEXT,
Prcdr_BodySite_Cdg_UsrSltd TEXT,
Prcdr_BodySite_Cdg_Vrsn TEXT,
Prcdr_BodySite_Txt TEXT,
Prcdr_Ctgry_Cdg_Cd TEXT,
Prcdr_Ctgry_Cdg_Dsply TEXT,
Prcdr_Ctgry_Cdg_Sys TEXT,
Prcdr_Ctgry_Cdg_UsrSltd TEXT,
Prcdr_Ctgry_Cdg_Vrsn TEXT,
Prcdr_Ctgry_Txt TEXT,
Prcdr_Cd_Cdg_Cd TEXT,
Prcdr_Cd_Cdg_Dsply TEXT,
Prcdr_Cd_Cdg_Sys TEXT,
Prcdr_Cd_Cdg_UsrSltd TEXT,
Prcdr_Cd_Cdg_Vrsn TEXT,
Prcdr_Cd_Txt TEXT,
Prcdr_Complication_Cdg_Cd TEXT,
Prcdr_Complication_Cdg_Dsply TEXT,
Prcdr_Complication_Cdg_Sys TEXT,
Prcdr_Complication_Cdg_UsrSltd TEXT,
Prcdr_Complication_Cdg_Vrsn TEXT,
Prcdr_Complication_Txt TEXT,
Prcdr_ComplicationDtl TEXT,
Prcdr_Enc TEXT,
Prcdr_FocalDvc_Actn_Cdg_Cd TEXT,
Prcdr_FocalDvc_Actn_Cdg_Dsply TEXT,
Prcdr_FocalDvc_Actn_Cdg_Sys TEXT,
Prcdr_FocalDvc_Actn_Cdg_UsrSltd TEXT,
Prcdr_FocalDvc_Actn_Cdg_Vrsn TEXT,
Prcdr_FocalDvc_Actn_Txt TEXT,
Prcdr_FocalDvc_Manipulated TEXT,
Prcdr_FollowUp_Cdg_Cd TEXT,
Prcdr_FollowUp_Cdg_Dsply TEXT,
Prcdr_FollowUp_Cdg_Sys TEXT,
Prcdr_FollowUp_Cdg_UsrSltd TEXT,
Prcdr_FollowUp_Cdg_Vrsn TEXT,
Prcdr_FollowUp_Txt TEXT,
Prcdr_Id_Assigner TEXT,
Prcdr_Id_Prd_End TEXT,
Prcdr_Id_Prd_Strt TEXT,
Prcdr_Id_Sys TEXT,
Prcdr_Id_Typ_Cdg_Cd TEXT,
Prcdr_Id_Typ_Cdg_Dsply TEXT,
Prcdr_Id_Typ_Cdg_Sys TEXT,
Prcdr_Id_Typ_Cdg_UsrSltd TEXT,
Prcdr_Id_Typ_Cdg_Vrsn TEXT,
Prcdr_Id_Typ_Txt TEXT,
Prcdr_Id_Use TEXT,
Prcdr_Id_Vl TEXT,
Prcdr_InstantiatesCanonical TEXT,
Prcdr_InstantiatesUri TEXT,
Prcdr_Lctn TEXT,
Prcdr_Nt_AthrRfrnc TEXT,
Prcdr_Nt_AthrStrgTyp TEXT,
Prcdr_Nt_Txt TEXT,
Prcdr_Nt_Time TEXT,
Prcdr_Outcome_Cdg_Cd TEXT,
Prcdr_Outcome_Cdg_Dsply TEXT,
Prcdr_Outcome_Cdg_Sys TEXT,
Prcdr_Outcome_Cdg_UsrSltd TEXT,
Prcdr_Outcome_Cdg_Vrsn TEXT,
Prcdr_Outcome_Txt TEXT,
Prcdr_PartOf TEXT,
Prcdr_PerformedDtTimeTyp TEXT,
Prcdr_PerformedPrd_End TEXT,
Prcdr_PerformedPrd_Strt TEXT,
Prcdr_PerformedRng_Hi_Cd TEXT,
Prcdr_PerformedRng_Hi_Cmprtr TEXT,
Prcdr_PerformedRng_Hi_Sys TEXT,
Prcdr_PerformedRng_Hi_Unt TEXT,
Prcdr_PerformedRng_Hi_Vl TEXT,
Prcdr_PerformedRng_Lw_Cd TEXT,
Prcdr_PerformedRng_Lw_Cmprtr TEXT,
Prcdr_PerformedRng_Lw_Sys TEXT,
Prcdr_PerformedRng_Lw_Unt TEXT,
Prcdr_PerformedRng_Lw_Vl TEXT,
Prcdr_PerformedStrgTyp TEXT,
Prcdr_Prfrmr_Actor TEXT,
Prcdr_Prfrmr_Function_Cdg_Cd TEXT,
Prcdr_Prfrmr_Function_Cdg_Dsply TEXT,
Prcdr_Prfrmr_Function_Cdg_Sys TEXT,
Prcdr_Prfrmr_Function_Cdg_UsrSltd TEXT,
Prcdr_Prfrmr_Function_Cdg_Vrsn TEXT,
Prcdr_Prfrmr_Function_Txt TEXT,
Prcdr_Prfrmr_OnBehalfOf TEXT,
Prcdr_RsnCd_Cdg_Cd TEXT,
Prcdr_RsnCd_Cdg_Dsply TEXT,
Prcdr_RsnCd_Cdg_Sys TEXT,
Prcdr_RsnCd_Cdg_UsrSltd TEXT,
Prcdr_RsnCd_Cdg_Vrsn TEXT,
Prcdr_RsnCd_Txt TEXT,
Prcdr_RsnRfrnc TEXT,
Prcdr_Recorder TEXT,
Prcdr_Rpt TEXT,
Prcdr_Sts TEXT,
Prcdr_StsRsn_Cdg_Cd TEXT,
Prcdr_StsRsn_Cdg_Dsply TEXT,
Prcdr_StsRsn_Cdg_Sys TEXT,
Prcdr_StsRsn_Cdg_UsrSltd TEXT,
Prcdr_StsRsn_Cdg_Vrsn TEXT,
Prcdr_StsRsn_Txt TEXT,
Prcdr_Sbjct TEXT,
Prcdr_UsedCd_Cdg_Cd TEXT,
Prcdr_UsedCd_Cdg_Dsply TEXT,
Prcdr_UsedCd_Cdg_Sys TEXT,
Prcdr_UsedCd_Cdg_UsrSltd TEXT,
Prcdr_UsedCd_Cdg_Vrsn TEXT,
Prcdr_UsedCd_Txt TEXT,
Prcdr_UsedRfrnc TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;