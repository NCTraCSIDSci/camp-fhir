drop table if exists `Claim`;
CREATE TABLE `Claim` (
 id varchar(64),
Clm_Accident_Dt TEXT,
Clm_Accident_LctnAddr_City TEXT,
Clm_Accident_LctnAddr_Cntry TEXT,
Clm_Accident_LctnAddr_District TEXT,
Clm_Accident_LctnAddr_Line TEXT,
Clm_Accident_LctnAddr_Prd_End TEXT,
Clm_Accident_LctnAddr_Prd_Strt TEXT,
Clm_Accident_LctnAddr_PostalCd TEXT,
Clm_Accident_LctnAddr_State TEXT,
Clm_Accident_LctnAddr_Txt TEXT,
Clm_Accident_LctnAddr_Typ TEXT,
Clm_Accident_LctnAddr_Use TEXT,
Clm_Accident_LctnRfrnc TEXT,
Clm_Accident_Typ_Cdg_Cd TEXT,
Clm_Accident_Typ_Cdg_Dsply TEXT,
Clm_Accident_Typ_Cdg_Sys TEXT,
Clm_Accident_Typ_Cdg_UsrSltd TEXT,
Clm_Accident_Typ_Cdg_Vrsn TEXT,
Clm_Accident_Typ_Txt TEXT,
Clm_BillablePrd_End TEXT,
Clm_BillablePrd_Strt TEXT,
Clm_CareTeam_Provider TEXT,
Clm_CareTeam_Qualification_Cdg_Cd TEXT,
Clm_CareTeam_Qualification_Cdg_Dsply TEXT,
Clm_CareTeam_Qualification_Cdg_Sys TEXT,
Clm_CareTeam_Qualification_Cdg_UsrSltd TEXT,
Clm_CareTeam_Qualification_Cdg_Vrsn TEXT,
Clm_CareTeam_Qualification_Txt TEXT,
Clm_CareTeam_Responsible TEXT,
Clm_CareTeam_Role_Cdg_Cd TEXT,
Clm_CareTeam_Role_Cdg_Dsply TEXT,
Clm_CareTeam_Role_Cdg_Sys TEXT,
Clm_CareTeam_Role_Cdg_UsrSltd TEXT,
Clm_CareTeam_Role_Cdg_Vrsn TEXT,
Clm_CareTeam_Role_Txt TEXT,
Clm_CareTeam_Sqnc TEXT,
Clm_Created TEXT,
Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd TEXT,
Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply TEXT,
Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys TEXT,
Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd TEXT,
Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn TEXT,
Clm_Dgnsis_DgnsisCdbleCncpt_Txt TEXT,
Clm_Dgnsis_DgnsisRfrnc TEXT,
Clm_Dgnsis_OnAdmission_Cdg_Cd TEXT,
Clm_Dgnsis_OnAdmission_Cdg_Dsply TEXT,
Clm_Dgnsis_OnAdmission_Cdg_Sys TEXT,
Clm_Dgnsis_OnAdmission_Cdg_UsrSltd TEXT,
Clm_Dgnsis_OnAdmission_Cdg_Vrsn TEXT,
Clm_Dgnsis_OnAdmission_Txt TEXT,
Clm_Dgnsis_PckgCd_Cdg_Cd TEXT,
Clm_Dgnsis_PckgCd_Cdg_Dsply TEXT,
Clm_Dgnsis_PckgCd_Cdg_Sys TEXT,
Clm_Dgnsis_PckgCd_Cdg_UsrSltd TEXT,
Clm_Dgnsis_PckgCd_Cdg_Vrsn TEXT,
Clm_Dgnsis_PckgCd_Txt TEXT,
Clm_Dgnsis_Sqnc TEXT,
Clm_Dgnsis_Typ_Cdg_Cd TEXT,
Clm_Dgnsis_Typ_Cdg_Dsply TEXT,
Clm_Dgnsis_Typ_Cdg_Sys TEXT,
Clm_Dgnsis_Typ_Cdg_UsrSltd TEXT,
Clm_Dgnsis_Typ_Cdg_Vrsn TEXT,
Clm_Dgnsis_Typ_Txt TEXT,
Clm_Enterer TEXT,
Clm_Facility TEXT,
Clm_FundsReserve_Cdg_Cd TEXT,
Clm_FundsReserve_Cdg_Dsply TEXT,
Clm_FundsReserve_Cdg_Sys TEXT,
Clm_FundsReserve_Cdg_UsrSltd TEXT,
Clm_FundsReserve_Cdg_Vrsn TEXT,
Clm_FundsReserve_Txt TEXT,
Clm_Id_Assigner TEXT,
Clm_Id_Prd_End TEXT,
Clm_Id_Prd_Strt TEXT,
Clm_Id_Sys TEXT,
Clm_Id_Typ_Cdg_Cd TEXT,
Clm_Id_Typ_Cdg_Dsply TEXT,
Clm_Id_Typ_Cdg_Sys TEXT,
Clm_Id_Typ_Cdg_UsrSltd TEXT,
Clm_Id_Typ_Cdg_Vrsn TEXT,
Clm_Id_Typ_Txt TEXT,
Clm_Id_Use TEXT,
Clm_Id_Vl TEXT,
Clm_Insrnc_BusinessArrangement TEXT,
Clm_Insrnc_ClmRsps TEXT,
Clm_Insrnc_Cvg TEXT,
Clm_Insrnc_Focal TEXT,
Clm_Insrnc_Id_Assigner TEXT,
Clm_Insrnc_Id_Prd_End TEXT,
Clm_Insrnc_Id_Prd_Strt TEXT,
Clm_Insrnc_Id_Sys TEXT,
Clm_Insrnc_Id_Typ_Cdg_Cd TEXT,
Clm_Insrnc_Id_Typ_Cdg_Dsply TEXT,
Clm_Insrnc_Id_Typ_Cdg_Sys TEXT,
Clm_Insrnc_Id_Typ_Cdg_UsrSltd TEXT,
Clm_Insrnc_Id_Typ_Cdg_Vrsn TEXT,
Clm_Insrnc_Id_Typ_Txt TEXT,
Clm_Insrnc_Id_Use TEXT,
Clm_Insrnc_Id_Vl TEXT,
Clm_Insrnc_PreAuthRef TEXT,
Clm_Insrnc_Sqnc TEXT,
Clm_Insurer TEXT,
Clm_Itm_BodySite_Cdg_Cd TEXT,
Clm_Itm_BodySite_Cdg_Dsply TEXT,
Clm_Itm_BodySite_Cdg_Sys TEXT,
Clm_Itm_BodySite_Cdg_UsrSltd TEXT,
Clm_Itm_BodySite_Cdg_Vrsn TEXT,
Clm_Itm_BodySite_Txt TEXT,
Clm_Itm_CareTeamSqnc TEXT,
Clm_Itm_Ctgry_Cdg_Cd TEXT,
Clm_Itm_Ctgry_Cdg_Dsply TEXT,
Clm_Itm_Ctgry_Cdg_Sys TEXT,
Clm_Itm_Ctgry_Cdg_UsrSltd TEXT,
Clm_Itm_Ctgry_Cdg_Vrsn TEXT,
Clm_Itm_Ctgry_Txt TEXT,
Clm_Itm_Dtl_Ctgry_Cdg_Cd TEXT,
Clm_Itm_Dtl_Ctgry_Cdg_Dsply TEXT,
Clm_Itm_Dtl_Ctgry_Cdg_Sys TEXT,
Clm_Itm_Dtl_Ctgry_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_Ctgry_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_Ctgry_Txt TEXT,
Clm_Itm_Dtl_Factor TEXT,
Clm_Itm_Dtl_Mdfr_Cdg_Cd TEXT,
Clm_Itm_Dtl_Mdfr_Cdg_Dsply TEXT,
Clm_Itm_Dtl_Mdfr_Cdg_Sys TEXT,
Clm_Itm_Dtl_Mdfr_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_Mdfr_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_Mdfr_Txt TEXT,
Clm_Itm_Dtl_Net_Crncy TEXT,
Clm_Itm_Dtl_Net_Vl TEXT,
Clm_Itm_Dtl_PrdctOrSrv_Cdg_Cd TEXT,
Clm_Itm_Dtl_PrdctOrSrv_Cdg_Dsply TEXT,
Clm_Itm_Dtl_PrdctOrSrv_Cdg_Sys TEXT,
Clm_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_PrdctOrSrv_Txt TEXT,
Clm_Itm_Dtl_PrgrmCd_Cdg_Cd TEXT,
Clm_Itm_Dtl_PrgrmCd_Cdg_Dsply TEXT,
Clm_Itm_Dtl_PrgrmCd_Cdg_Sys TEXT,
Clm_Itm_Dtl_PrgrmCd_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_PrgrmCd_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_PrgrmCd_Txt TEXT,
Clm_Itm_Dtl_Qnty_Cd TEXT,
Clm_Itm_Dtl_Qnty_Cmprtr TEXT,
Clm_Itm_Dtl_Qnty_Sys TEXT,
Clm_Itm_Dtl_Qnty_Unt TEXT,
Clm_Itm_Dtl_Qnty_Vl TEXT,
Clm_Itm_Dtl_Revenue_Cdg_Cd TEXT,
Clm_Itm_Dtl_Revenue_Cdg_Dsply TEXT,
Clm_Itm_Dtl_Revenue_Cdg_Sys TEXT,
Clm_Itm_Dtl_Revenue_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_Revenue_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_Revenue_Txt TEXT,
Clm_Itm_Dtl_Sqnc TEXT,
Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd TEXT,
Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply TEXT,
Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys TEXT,
Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_SubDtl_Ctgry_Txt TEXT,
Clm_Itm_Dtl_SubDtl_Factor TEXT,
Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd TEXT,
Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply TEXT,
Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys TEXT,
Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_SubDtl_Mdfr_Txt TEXT,
Clm_Itm_Dtl_SubDtl_Net_Crncy TEXT,
Clm_Itm_Dtl_SubDtl_Net_Vl TEXT,
Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd TEXT,
Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply TEXT,
Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys TEXT,
Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Txt TEXT,
Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd TEXT,
Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply TEXT,
Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys TEXT,
Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_SubDtl_PrgrmCd_Txt TEXT,
Clm_Itm_Dtl_SubDtl_Qnty_Cd TEXT,
Clm_Itm_Dtl_SubDtl_Qnty_Cmprtr TEXT,
Clm_Itm_Dtl_SubDtl_Qnty_Sys TEXT,
Clm_Itm_Dtl_SubDtl_Qnty_Unt TEXT,
Clm_Itm_Dtl_SubDtl_Qnty_Vl TEXT,
Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Cd TEXT,
Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply TEXT,
Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Sys TEXT,
Clm_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd TEXT,
Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn TEXT,
Clm_Itm_Dtl_SubDtl_Revenue_Txt TEXT,
Clm_Itm_Dtl_SubDtl_Sqnc TEXT,
Clm_Itm_Dtl_SubDtl_Udi TEXT,
Clm_Itm_Dtl_SubDtl_UntPrice_Crncy TEXT,
Clm_Itm_Dtl_SubDtl_UntPrice_Vl TEXT,
Clm_Itm_Dtl_Udi TEXT,
Clm_Itm_Dtl_UntPrice_Crncy TEXT,
Clm_Itm_Dtl_UntPrice_Vl TEXT,
Clm_Itm_DgnsisSqnc TEXT,
Clm_Itm_Enc TEXT,
Clm_Itm_Factor TEXT,
Clm_Itm_InfoSqnc TEXT,
Clm_Itm_LctnAddr_City TEXT,
Clm_Itm_LctnAddr_Cntry TEXT,
Clm_Itm_LctnAddr_District TEXT,
Clm_Itm_LctnAddr_Line TEXT,
Clm_Itm_LctnAddr_Prd_End TEXT,
Clm_Itm_LctnAddr_Prd_Strt TEXT,
Clm_Itm_LctnAddr_PostalCd TEXT,
Clm_Itm_LctnAddr_State TEXT,
Clm_Itm_LctnAddr_Txt TEXT,
Clm_Itm_LctnAddr_Typ TEXT,
Clm_Itm_LctnAddr_Use TEXT,
Clm_Itm_LctnCdbleCncpt_Cdg_Cd TEXT,
Clm_Itm_LctnCdbleCncpt_Cdg_Dsply TEXT,
Clm_Itm_LctnCdbleCncpt_Cdg_Sys TEXT,
Clm_Itm_LctnCdbleCncpt_Cdg_UsrSltd TEXT,
Clm_Itm_LctnCdbleCncpt_Cdg_Vrsn TEXT,
Clm_Itm_LctnCdbleCncpt_Txt TEXT,
Clm_Itm_LctnRfrnc TEXT,
Clm_Itm_Mdfr_Cdg_Cd TEXT,
Clm_Itm_Mdfr_Cdg_Dsply TEXT,
Clm_Itm_Mdfr_Cdg_Sys TEXT,
Clm_Itm_Mdfr_Cdg_UsrSltd TEXT,
Clm_Itm_Mdfr_Cdg_Vrsn TEXT,
Clm_Itm_Mdfr_Txt TEXT,
Clm_Itm_Net_Crncy TEXT,
Clm_Itm_Net_Vl TEXT,
Clm_Itm_PrcdrSqnc TEXT,
Clm_Itm_PrdctOrSrv_Cdg_Cd TEXT,
Clm_Itm_PrdctOrSrv_Cdg_Dsply TEXT,
Clm_Itm_PrdctOrSrv_Cdg_Sys TEXT,
Clm_Itm_PrdctOrSrv_Cdg_UsrSltd TEXT,
Clm_Itm_PrdctOrSrv_Cdg_Vrsn TEXT,
Clm_Itm_PrdctOrSrv_Txt TEXT,
Clm_Itm_PrgrmCd_Cdg_Cd TEXT,
Clm_Itm_PrgrmCd_Cdg_Dsply TEXT,
Clm_Itm_PrgrmCd_Cdg_Sys TEXT,
Clm_Itm_PrgrmCd_Cdg_UsrSltd TEXT,
Clm_Itm_PrgrmCd_Cdg_Vrsn TEXT,
Clm_Itm_PrgrmCd_Txt TEXT,
Clm_Itm_Qnty_Cd TEXT,
Clm_Itm_Qnty_Cmprtr TEXT,
Clm_Itm_Qnty_Sys TEXT,
Clm_Itm_Qnty_Unt TEXT,
Clm_Itm_Qnty_Vl TEXT,
Clm_Itm_Revenue_Cdg_Cd TEXT,
Clm_Itm_Revenue_Cdg_Dsply TEXT,
Clm_Itm_Revenue_Cdg_Sys TEXT,
Clm_Itm_Revenue_Cdg_UsrSltd TEXT,
Clm_Itm_Revenue_Cdg_Vrsn TEXT,
Clm_Itm_Revenue_Txt TEXT,
Clm_Itm_Sqnc TEXT,
Clm_Itm_SrvdDtTyp TEXT,
Clm_Itm_SrvdPrd_End TEXT,
Clm_Itm_SrvdPrd_Strt TEXT,
Clm_Itm_SubSite_Cdg_Cd TEXT,
Clm_Itm_SubSite_Cdg_Dsply TEXT,
Clm_Itm_SubSite_Cdg_Sys TEXT,
Clm_Itm_SubSite_Cdg_UsrSltd TEXT,
Clm_Itm_SubSite_Cdg_Vrsn TEXT,
Clm_Itm_SubSite_Txt TEXT,
Clm_Itm_Udi TEXT,
Clm_Itm_UntPrice_Crncy TEXT,
Clm_Itm_UntPrice_Vl TEXT,
Clm_OriginalPrescription TEXT,
Clm_Pnt TEXT,
Clm_Payee_Party TEXT,
Clm_Payee_Typ_Cdg_Cd TEXT,
Clm_Payee_Typ_Cdg_Dsply TEXT,
Clm_Payee_Typ_Cdg_Sys TEXT,
Clm_Payee_Typ_Cdg_UsrSltd TEXT,
Clm_Payee_Typ_Cdg_Vrsn TEXT,
Clm_Payee_Typ_Txt TEXT,
Clm_Prescription TEXT,
Clm_Priority_Cdg_Cd TEXT,
Clm_Priority_Cdg_Dsply TEXT,
Clm_Priority_Cdg_Sys TEXT,
Clm_Priority_Cdg_UsrSltd TEXT,
Clm_Priority_Cdg_Vrsn TEXT,
Clm_Priority_Txt TEXT,
Clm_Prcdr_Dt TEXT,
Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Cd TEXT,
Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply TEXT,
Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Sys TEXT,
Clm_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd TEXT,
Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn TEXT,
Clm_Prcdr_PrcdrCdbleCncpt_Txt TEXT,
Clm_Prcdr_PrcdrRfrnc TEXT,
Clm_Prcdr_Sqnc TEXT,
Clm_Prcdr_Typ_Cdg_Cd TEXT,
Clm_Prcdr_Typ_Cdg_Dsply TEXT,
Clm_Prcdr_Typ_Cdg_Sys TEXT,
Clm_Prcdr_Typ_Cdg_UsrSltd TEXT,
Clm_Prcdr_Typ_Cdg_Vrsn TEXT,
Clm_Prcdr_Typ_Txt TEXT,
Clm_Prcdr_Udi TEXT,
Clm_Provider TEXT,
Clm_Referral TEXT,
Clm_Rlted_Clm TEXT,
Clm_Rlted_Rfrnc_Assigner TEXT,
Clm_Rlted_Rfrnc_Prd_End TEXT,
Clm_Rlted_Rfrnc_Prd_Strt TEXT,
Clm_Rlted_Rfrnc_Sys TEXT,
Clm_Rlted_Rfrnc_Typ_Cdg_Cd TEXT,
Clm_Rlted_Rfrnc_Typ_Cdg_Dsply TEXT,
Clm_Rlted_Rfrnc_Typ_Cdg_Sys TEXT,
Clm_Rlted_Rfrnc_Typ_Cdg_UsrSltd TEXT,
Clm_Rlted_Rfrnc_Typ_Cdg_Vrsn TEXT,
Clm_Rlted_Rfrnc_Typ_Txt TEXT,
Clm_Rlted_Rfrnc_Use TEXT,
Clm_Rlted_Rfrnc_Vl TEXT,
Clm_Rlted_Rltnship_Cdg_Cd TEXT,
Clm_Rlted_Rltnship_Cdg_Dsply TEXT,
Clm_Rlted_Rltnship_Cdg_Sys TEXT,
Clm_Rlted_Rltnship_Cdg_UsrSltd TEXT,
Clm_Rlted_Rltnship_Cdg_Vrsn TEXT,
Clm_Rlted_Rltnship_Txt TEXT,
Clm_Sts TEXT,
Clm_SubTyp_Cdg_Cd TEXT,
Clm_SubTyp_Cdg_Dsply TEXT,
Clm_SubTyp_Cdg_Sys TEXT,
Clm_SubTyp_Cdg_UsrSltd TEXT,
Clm_SubTyp_Cdg_Vrsn TEXT,
Clm_SubTyp_Txt TEXT,
Clm_SprtingInfo_Ctgry_Cdg_Cd TEXT,
Clm_SprtingInfo_Ctgry_Cdg_Dsply TEXT,
Clm_SprtingInfo_Ctgry_Cdg_Sys TEXT,
Clm_SprtingInfo_Ctgry_Cdg_UsrSltd TEXT,
Clm_SprtingInfo_Ctgry_Cdg_Vrsn TEXT,
Clm_SprtingInfo_Ctgry_Txt TEXT,
Clm_SprtingInfo_Cd_Cdg_Cd TEXT,
Clm_SprtingInfo_Cd_Cdg_Dsply TEXT,
Clm_SprtingInfo_Cd_Cdg_Sys TEXT,
Clm_SprtingInfo_Cd_Cdg_UsrSltd TEXT,
Clm_SprtingInfo_Cd_Cdg_Vrsn TEXT,
Clm_SprtingInfo_Cd_Txt TEXT,
Clm_SprtingInfo_Rsn_Cdg_Cd TEXT,
Clm_SprtingInfo_Rsn_Cdg_Dsply TEXT,
Clm_SprtingInfo_Rsn_Cdg_Sys TEXT,
Clm_SprtingInfo_Rsn_Cdg_UsrSltd TEXT,
Clm_SprtingInfo_Rsn_Cdg_Vrsn TEXT,
Clm_SprtingInfo_Rsn_Txt TEXT,
Clm_SprtingInfo_Sqnc TEXT,
Clm_SprtingInfo_TmgDtTyp TEXT,
Clm_SprtingInfo_TmgPrd_End TEXT,
Clm_SprtingInfo_TmgPrd_Strt TEXT,
Clm_SprtingInfo_VlAttchmnt_CntntTyp TEXT,
Clm_SprtingInfo_VlAttchmnt_Creation TEXT,
Clm_SprtingInfo_VlAttchmnt_Data TEXT,
Clm_SprtingInfo_VlAttchmnt_Hash TEXT,
Clm_SprtingInfo_VlAttchmnt_Lnguage TEXT,
Clm_SprtingInfo_VlAttchmnt_Sz TEXT,
Clm_SprtingInfo_VlAttchmnt_Ttl TEXT,
Clm_SprtingInfo_VlAttchmnt_Url TEXT,
Clm_SprtingInfo_VlBooleanTyp TEXT,
Clm_SprtingInfo_VlQnty_Cd TEXT,
Clm_SprtingInfo_VlQnty_Cmprtr TEXT,
Clm_SprtingInfo_VlQnty_Sys TEXT,
Clm_SprtingInfo_VlQnty_Unt TEXT,
Clm_SprtingInfo_VlQnty_Vl TEXT,
Clm_SprtingInfo_VlRfrnc TEXT,
Clm_SprtingInfo_VlStrgTyp TEXT,
Clm_Total_Crncy TEXT,
Clm_Total_Vl TEXT,
Clm_Typ_Cdg_Cd TEXT,
Clm_Typ_Cdg_Dsply TEXT,
Clm_Typ_Cdg_Sys TEXT,
Clm_Typ_Cdg_UsrSltd TEXT,
Clm_Typ_Cdg_Vrsn TEXT,
Clm_Typ_Txt TEXT,
Clm_Use TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;