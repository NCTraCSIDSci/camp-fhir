drop table if exists `Observation`;
CREATE TABLE `Observation` (
 id varchar(64),
Obsrvtn_BasedOn TEXT,
Obsrvtn_BodySite_Cdg_Cd TEXT,
Obsrvtn_BodySite_Cdg_Dsply TEXT,
Obsrvtn_BodySite_Cdg_Sys TEXT,
Obsrvtn_BodySite_Cdg_UsrSltd TEXT,
Obsrvtn_BodySite_Cdg_Vrsn TEXT,
Obsrvtn_BodySite_Txt TEXT,
Obsrvtn_Ctgry_Cdg_Cd TEXT,
Obsrvtn_Ctgry_Cdg_Dsply TEXT,
Obsrvtn_Ctgry_Cdg_Sys TEXT,
Obsrvtn_Ctgry_Cdg_UsrSltd TEXT,
Obsrvtn_Ctgry_Cdg_Vrsn TEXT,
Obsrvtn_Ctgry_Txt TEXT,
Obsrvtn_Cd_Cdg_Cd TEXT,
Obsrvtn_Cd_Cdg_Dsply TEXT,
Obsrvtn_Cd_Cdg_Sys TEXT,
Obsrvtn_Cd_Cdg_UsrSltd TEXT,
Obsrvtn_Cd_Cdg_Vrsn TEXT,
Obsrvtn_Cd_Txt TEXT,
Obsrvtn_Cmpnt_Cd_Cdg_Cd TEXT,
Obsrvtn_Cmpnt_Cd_Cdg_Dsply TEXT,
Obsrvtn_Cmpnt_Cd_Cdg_Sys TEXT,
Obsrvtn_Cmpnt_Cd_Cdg_UsrSltd TEXT,
Obsrvtn_Cmpnt_Cd_Cdg_Vrsn TEXT,
Obsrvtn_Cmpnt_Cd_Txt TEXT,
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Cd TEXT,
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Dsply TEXT,
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Sys TEXT,
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_UsrSltd TEXT,
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Vrsn TEXT,
Obsrvtn_Cmpnt_DataAbsentRsn_Txt TEXT,
Obsrvtn_Cmpnt_Interpretation_Cdg_Cd TEXT,
Obsrvtn_Cmpnt_Interpretation_Cdg_Dsply TEXT,
Obsrvtn_Cmpnt_Interpretation_Cdg_Sys TEXT,
Obsrvtn_Cmpnt_Interpretation_Cdg_UsrSltd TEXT,
Obsrvtn_Cmpnt_Interpretation_Cdg_Vrsn TEXT,
Obsrvtn_Cmpnt_Interpretation_Txt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cd TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cmprtr TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Sys TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Unt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Vl TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cd TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cmprtr TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Sys TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Unt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Vl TEXT,
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Cd TEXT,
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Dsply TEXT,
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Sys TEXT,
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_UsrSltd TEXT,
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Vrsn TEXT,
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Txt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Hi_Cd TEXT,
Obsrvtn_Cmpnt_RfrncRng_Hi_Cmprtr TEXT,
Obsrvtn_Cmpnt_RfrncRng_Hi_Sys TEXT,
Obsrvtn_Cmpnt_RfrncRng_Hi_Unt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Hi_Vl TEXT,
Obsrvtn_Cmpnt_RfrncRng_Lw_Cd TEXT,
Obsrvtn_Cmpnt_RfrncRng_Lw_Cmprtr TEXT,
Obsrvtn_Cmpnt_RfrncRng_Lw_Sys TEXT,
Obsrvtn_Cmpnt_RfrncRng_Lw_Unt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Lw_Vl TEXT,
Obsrvtn_Cmpnt_RfrncRng_Txt TEXT,
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Cd TEXT,
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Dsply TEXT,
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Sys TEXT,
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_UsrSltd TEXT,
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Vrsn TEXT,
Obsrvtn_Cmpnt_RfrncRng_Typ_Txt TEXT,
Obsrvtn_Cmpnt_VlBooleanTyp TEXT,
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Cd TEXT,
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Dsply TEXT,
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Sys TEXT,
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_UsrSltd TEXT,
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Vrsn TEXT,
Obsrvtn_Cmpnt_VlCdbleCncpt_Txt TEXT,
Obsrvtn_Cmpnt_VlDtTimeTyp TEXT,
Obsrvtn_Cmpnt_VlIntegerTyp TEXT,
Obsrvtn_Cmpnt_VlPrd_End TEXT,
Obsrvtn_Cmpnt_VlPrd_Strt TEXT,
Obsrvtn_Cmpnt_VlQnty_Cd TEXT,
Obsrvtn_Cmpnt_VlQnty_Cmprtr TEXT,
Obsrvtn_Cmpnt_VlQnty_Sys TEXT,
Obsrvtn_Cmpnt_VlQnty_Unt TEXT,
Obsrvtn_Cmpnt_VlQnty_Vl TEXT,
Obsrvtn_Cmpnt_VlRng_Hi_Cd TEXT,
Obsrvtn_Cmpnt_VlRng_Hi_Cmprtr TEXT,
Obsrvtn_Cmpnt_VlRng_Hi_Sys TEXT,
Obsrvtn_Cmpnt_VlRng_Hi_Unt TEXT,
Obsrvtn_Cmpnt_VlRng_Hi_Vl TEXT,
Obsrvtn_Cmpnt_VlRng_Lw_Cd TEXT,
Obsrvtn_Cmpnt_VlRng_Lw_Cmprtr TEXT,
Obsrvtn_Cmpnt_VlRng_Lw_Sys TEXT,
Obsrvtn_Cmpnt_VlRng_Lw_Unt TEXT,
Obsrvtn_Cmpnt_VlRng_Lw_Vl TEXT,
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cd TEXT,
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cmprtr TEXT,
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Sys TEXT,
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Unt TEXT,
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Vl TEXT,
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cd TEXT,
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cmprtr TEXT,
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Sys TEXT,
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Unt TEXT,
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Vl TEXT,
Obsrvtn_Cmpnt_VlSampledData_Data TEXT,
Obsrvtn_Cmpnt_VlSampledData_Dimensions TEXT,
Obsrvtn_Cmpnt_VlSampledData_Factor TEXT,
Obsrvtn_Cmpnt_VlSampledData_LwerLmt TEXT,
Obsrvtn_Cmpnt_VlSampledData_Origin_Cd TEXT,
Obsrvtn_Cmpnt_VlSampledData_Origin_Cmprtr TEXT,
Obsrvtn_Cmpnt_VlSampledData_Origin_Sys TEXT,
Obsrvtn_Cmpnt_VlSampledData_Origin_Unt TEXT,
Obsrvtn_Cmpnt_VlSampledData_Origin_Vl TEXT,
Obsrvtn_Cmpnt_VlSampledData_Prd TEXT,
Obsrvtn_Cmpnt_VlSampledData_UpperLmt TEXT,
Obsrvtn_Cmpnt_VlStrgTyp TEXT,
Obsrvtn_Cmpnt_VlTimeTyp TEXT,
Obsrvtn_DataAbsentRsn_Cdg_Cd TEXT,
Obsrvtn_DataAbsentRsn_Cdg_Dsply TEXT,
Obsrvtn_DataAbsentRsn_Cdg_Sys TEXT,
Obsrvtn_DataAbsentRsn_Cdg_UsrSltd TEXT,
Obsrvtn_DataAbsentRsn_Cdg_Vrsn TEXT,
Obsrvtn_DataAbsentRsn_Txt TEXT,
Obsrvtn_DerivedFrom TEXT,
Obsrvtn_Dvc TEXT,
Obsrvtn_EfctiveDtTimeTyp TEXT,
Obsrvtn_EfctiveInstantTyp TEXT,
Obsrvtn_EfctivePrd_End TEXT,
Obsrvtn_EfctivePrd_Strt TEXT,
Obsrvtn_EfctiveTmg_Cd_Cdg_Cd TEXT,
Obsrvtn_EfctiveTmg_Cd_Cdg_Dsply TEXT,
Obsrvtn_EfctiveTmg_Cd_Cdg_Sys TEXT,
Obsrvtn_EfctiveTmg_Cd_Cdg_UsrSltd TEXT,
Obsrvtn_EfctiveTmg_Cd_Cdg_Vrsn TEXT,
Obsrvtn_EfctiveTmg_Cd_Txt TEXT,
Obsrvtn_EfctiveTmg_Evnt TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cd TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cmprtr TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Sys TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Unt TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Vl TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsPrd_End TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strt TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cd TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Sys TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Unt TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Vl TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cd TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Sys TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Unt TEXT,
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Vl TEXT,
Obsrvtn_EfctiveTmg_Rpt_Cnt TEXT,
Obsrvtn_EfctiveTmg_Rpt_CntMx TEXT,
Obsrvtn_EfctiveTmg_Rpt_Duration TEXT,
Obsrvtn_EfctiveTmg_Rpt_DurationMx TEXT,
Obsrvtn_EfctiveTmg_Rpt_DurationUnt TEXT,
Obsrvtn_EfctiveTmg_Rpt_Frqncy TEXT,
Obsrvtn_EfctiveTmg_Rpt_FrqncyMx TEXT,
Obsrvtn_EfctiveTmg_Rpt_Off TEXT,
Obsrvtn_EfctiveTmg_Rpt_Prd TEXT,
Obsrvtn_EfctiveTmg_Rpt_PrdMx TEXT,
Obsrvtn_EfctiveTmg_Rpt_PrdUnt TEXT,
Obsrvtn_EfctiveTmg_Rpt_TimeOfDay TEXT,
Obsrvtn_Enc TEXT,
Obsrvtn_Focus TEXT,
Obsrvtn_HasMmbr TEXT,
Obsrvtn_Id_Assigner TEXT,
Obsrvtn_Id_Prd_End TEXT,
Obsrvtn_Id_Prd_Strt TEXT,
Obsrvtn_Id_Sys TEXT,
Obsrvtn_Id_Typ_Cdg_Cd TEXT,
Obsrvtn_Id_Typ_Cdg_Dsply TEXT,
Obsrvtn_Id_Typ_Cdg_Sys TEXT,
Obsrvtn_Id_Typ_Cdg_UsrSltd TEXT,
Obsrvtn_Id_Typ_Cdg_Vrsn TEXT,
Obsrvtn_Id_Typ_Txt TEXT,
Obsrvtn_Id_Use TEXT,
Obsrvtn_Id_Vl TEXT,
Obsrvtn_Interpretation_Cdg_Cd TEXT,
Obsrvtn_Interpretation_Cdg_Dsply TEXT,
Obsrvtn_Interpretation_Cdg_Sys TEXT,
Obsrvtn_Interpretation_Cdg_UsrSltd TEXT,
Obsrvtn_Interpretation_Cdg_Vrsn TEXT,
Obsrvtn_Interpretation_Txt TEXT,
Obsrvtn_Issued TEXT,
Obsrvtn_Mthd_Cdg_Cd TEXT,
Obsrvtn_Mthd_Cdg_Dsply TEXT,
Obsrvtn_Mthd_Cdg_Sys TEXT,
Obsrvtn_Mthd_Cdg_UsrSltd TEXT,
Obsrvtn_Mthd_Cdg_Vrsn TEXT,
Obsrvtn_Mthd_Txt TEXT,
Obsrvtn_Nt_AthrRfrnc TEXT,
Obsrvtn_Nt_AthrStrgTyp TEXT,
Obsrvtn_Nt_Txt TEXT,
Obsrvtn_Nt_Time TEXT,
Obsrvtn_PartOf TEXT,
Obsrvtn_Prfrmr TEXT,
Obsrvtn_RfrncRng_Age_Hi_Cd TEXT,
Obsrvtn_RfrncRng_Age_Hi_Cmprtr TEXT,
Obsrvtn_RfrncRng_Age_Hi_Sys TEXT,
Obsrvtn_RfrncRng_Age_Hi_Unt TEXT,
Obsrvtn_RfrncRng_Age_Hi_Vl TEXT,
Obsrvtn_RfrncRng_Age_Lw_Cd TEXT,
Obsrvtn_RfrncRng_Age_Lw_Cmprtr TEXT,
Obsrvtn_RfrncRng_Age_Lw_Sys TEXT,
Obsrvtn_RfrncRng_Age_Lw_Unt TEXT,
Obsrvtn_RfrncRng_Age_Lw_Vl TEXT,
Obsrvtn_RfrncRng_AppliesTo_Cdg_Cd TEXT,
Obsrvtn_RfrncRng_AppliesTo_Cdg_Dsply TEXT,
Obsrvtn_RfrncRng_AppliesTo_Cdg_Sys TEXT,
Obsrvtn_RfrncRng_AppliesTo_Cdg_UsrSltd TEXT,
Obsrvtn_RfrncRng_AppliesTo_Cdg_Vrsn TEXT,
Obsrvtn_RfrncRng_AppliesTo_Txt TEXT,
Obsrvtn_RfrncRng_Hi_Cd TEXT,
Obsrvtn_RfrncRng_Hi_Cmprtr TEXT,
Obsrvtn_RfrncRng_Hi_Sys TEXT,
Obsrvtn_RfrncRng_Hi_Unt TEXT,
Obsrvtn_RfrncRng_Hi_Vl TEXT,
Obsrvtn_RfrncRng_Lw_Cd TEXT,
Obsrvtn_RfrncRng_Lw_Cmprtr TEXT,
Obsrvtn_RfrncRng_Lw_Sys TEXT,
Obsrvtn_RfrncRng_Lw_Unt TEXT,
Obsrvtn_RfrncRng_Lw_Vl TEXT,
Obsrvtn_RfrncRng_Txt TEXT,
Obsrvtn_RfrncRng_Typ_Cdg_Cd TEXT,
Obsrvtn_RfrncRng_Typ_Cdg_Dsply TEXT,
Obsrvtn_RfrncRng_Typ_Cdg_Sys TEXT,
Obsrvtn_RfrncRng_Typ_Cdg_UsrSltd TEXT,
Obsrvtn_RfrncRng_Typ_Cdg_Vrsn TEXT,
Obsrvtn_RfrncRng_Typ_Txt TEXT,
Obsrvtn_Spcmn TEXT,
Obsrvtn_Sts TEXT,
Obsrvtn_Sbjct TEXT,
Obsrvtn_VlBooleanTyp TEXT,
Obsrvtn_VlCdbleCncpt_Cdg_Cd TEXT,
Obsrvtn_VlCdbleCncpt_Cdg_Dsply TEXT,
Obsrvtn_VlCdbleCncpt_Cdg_Sys TEXT,
Obsrvtn_VlCdbleCncpt_Cdg_UsrSltd TEXT,
Obsrvtn_VlCdbleCncpt_Cdg_Vrsn TEXT,
Obsrvtn_VlCdbleCncpt_Txt TEXT,
Obsrvtn_VlDtTimeTyp TEXT,
Obsrvtn_VlIntegerTyp TEXT,
Obsrvtn_VlPrd_End TEXT,
Obsrvtn_VlPrd_Strt TEXT,
Obsrvtn_VlQnty_Cd TEXT,
Obsrvtn_VlQnty_Cmprtr TEXT,
Obsrvtn_VlQnty_Sys TEXT,
Obsrvtn_VlQnty_Unt TEXT,
Obsrvtn_VlQnty_Vl TEXT,
Obsrvtn_VlRng_Hi_Cd TEXT,
Obsrvtn_VlRng_Hi_Cmprtr TEXT,
Obsrvtn_VlRng_Hi_Sys TEXT,
Obsrvtn_VlRng_Hi_Unt TEXT,
Obsrvtn_VlRng_Hi_Vl TEXT,
Obsrvtn_VlRng_Lw_Cd TEXT,
Obsrvtn_VlRng_Lw_Cmprtr TEXT,
Obsrvtn_VlRng_Lw_Sys TEXT,
Obsrvtn_VlRng_Lw_Unt TEXT,
Obsrvtn_VlRng_Lw_Vl TEXT,
Obsrvtn_VlRtio_Dnmntr_Cd TEXT,
Obsrvtn_VlRtio_Dnmntr_Cmprtr TEXT,
Obsrvtn_VlRtio_Dnmntr_Sys TEXT,
Obsrvtn_VlRtio_Dnmntr_Unt TEXT,
Obsrvtn_VlRtio_Dnmntr_Vl TEXT,
Obsrvtn_VlRtio_Nmrtr_Cd TEXT,
Obsrvtn_VlRtio_Nmrtr_Cmprtr TEXT,
Obsrvtn_VlRtio_Nmrtr_Sys TEXT,
Obsrvtn_VlRtio_Nmrtr_Unt TEXT,
Obsrvtn_VlRtio_Nmrtr_Vl TEXT,
Obsrvtn_VlSampledData_Data TEXT,
Obsrvtn_VlSampledData_Dimensions TEXT,
Obsrvtn_VlSampledData_Factor TEXT,
Obsrvtn_VlSampledData_LwerLmt TEXT,
Obsrvtn_VlSampledData_Origin_Cd TEXT,
Obsrvtn_VlSampledData_Origin_Cmprtr TEXT,
Obsrvtn_VlSampledData_Origin_Sys TEXT,
Obsrvtn_VlSampledData_Origin_Unt TEXT,
Obsrvtn_VlSampledData_Origin_Vl TEXT,
Obsrvtn_VlSampledData_Prd TEXT,
Obsrvtn_VlSampledData_UpperLmt TEXT,
Obsrvtn_VlStrgTyp TEXT,
Obsrvtn_VlTimeTyp TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;