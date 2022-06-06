drop table if exists `SpecimenDefinition`;
CREATE TABLE `SpecimenDefinition` (
 id varchar(64),
SpcmnDfn_Collection_Cdg_Cd TEXT,
SpcmnDfn_Collection_Cdg_Dsply TEXT,
SpcmnDfn_Collection_Cdg_Sys TEXT,
SpcmnDfn_Collection_Cdg_UsrSltd TEXT,
SpcmnDfn_Collection_Cdg_Vrsn TEXT,
SpcmnDfn_Collection_Txt TEXT,
SpcmnDfn_Id_Assigner TEXT,
SpcmnDfn_Id_Prd_End TEXT,
SpcmnDfn_Id_Prd_Strt TEXT,
SpcmnDfn_Id_Sys TEXT,
SpcmnDfn_Id_Typ_Cdg_Cd TEXT,
SpcmnDfn_Id_Typ_Cdg_Dsply TEXT,
SpcmnDfn_Id_Typ_Cdg_Sys TEXT,
SpcmnDfn_Id_Typ_Cdg_UsrSltd TEXT,
SpcmnDfn_Id_Typ_Cdg_Vrsn TEXT,
SpcmnDfn_Id_Typ_Txt TEXT,
SpcmnDfn_Id_Use TEXT,
SpcmnDfn_Id_Vl TEXT,
SpcmnDfn_PntPreparation_Cdg_Cd TEXT,
SpcmnDfn_PntPreparation_Cdg_Dsply TEXT,
SpcmnDfn_PntPreparation_Cdg_Sys TEXT,
SpcmnDfn_PntPreparation_Cdg_UsrSltd TEXT,
SpcmnDfn_PntPreparation_Cdg_Vrsn TEXT,
SpcmnDfn_PntPreparation_Txt TEXT,
SpcmnDfn_TimeAspect TEXT,
SpcmnDfn_TypCollected_Cdg_Cd TEXT,
SpcmnDfn_TypCollected_Cdg_Dsply TEXT,
SpcmnDfn_TypCollected_Cdg_Sys TEXT,
SpcmnDfn_TypCollected_Cdg_UsrSltd TEXT,
SpcmnDfn_TypCollected_Cdg_Vrsn TEXT,
SpcmnDfn_TypCollected_Txt TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Txt TEXT,
SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvRfrnc TEXT,
SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_Cntainer_Cap_Txt TEXT,
SpcmnDfn_TypTsted_Cntainer_Capacity_Cd TEXT,
SpcmnDfn_TypTsted_Cntainer_Capacity_Cmprtr TEXT,
SpcmnDfn_TypTsted_Cntainer_Capacity_Sys TEXT,
SpcmnDfn_TypTsted_Cntainer_Capacity_Unt TEXT,
SpcmnDfn_TypTsted_Cntainer_Capacity_Vl TEXT,
SpcmnDfn_TypTsted_Cntainer_Dscrptn TEXT,
SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_Cntainer_Mtrl_Txt TEXT,
SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cd TEXT,
SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cmprtr TEXT,
SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Sys TEXT,
SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Unt TEXT,
SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Vl TEXT,
SpcmnDfn_TypTsted_Cntainer_MinimumVolumeStrgTyp TEXT,
SpcmnDfn_TypTsted_Cntainer_Preparation TEXT,
SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_Cntainer_Typ_Txt TEXT,
SpcmnDfn_TypTsted_Handling_Instrctn TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Txt TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cd TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cmprtr TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Sys TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Unt TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Vl TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cd TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cmprtr TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Sys TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Unt TEXT,
SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Vl TEXT,
SpcmnDfn_TypTsted_IsDerived TEXT,
SpcmnDfn_TypTsted_Preference TEXT,
SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_RejectionCriterion_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_RejectionCriterion_Txt TEXT,
SpcmnDfn_TypTsted_Rqrment TEXT,
SpcmnDfn_TypTsted_Typ_Cdg_Cd TEXT,
SpcmnDfn_TypTsted_Typ_Cdg_Dsply TEXT,
SpcmnDfn_TypTsted_Typ_Cdg_Sys TEXT,
SpcmnDfn_TypTsted_Typ_Cdg_UsrSltd TEXT,
SpcmnDfn_TypTsted_Typ_Cdg_Vrsn TEXT,
SpcmnDfn_TypTsted_Typ_Txt TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;