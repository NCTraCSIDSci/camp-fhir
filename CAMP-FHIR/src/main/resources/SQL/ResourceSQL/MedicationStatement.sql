drop table if exists `MedicationStatement`;
CREATE TABLE `MedicationStatement` (
 id varchar(64),
MdctnStmnt_BasedOn TEXT,
MdctnStmnt_Ctgry_Cdg_Cd TEXT,
MdctnStmnt_Ctgry_Cdg_Dsply TEXT,
MdctnStmnt_Ctgry_Cdg_Sys TEXT,
MdctnStmnt_Ctgry_Cdg_UsrSltd TEXT,
MdctnStmnt_Ctgry_Cdg_Vrsn TEXT,
MdctnStmnt_Ctgry_Txt TEXT,
MdctnStmnt_Cntxt TEXT,
MdctnStmnt_DtAsserted TEXT,
MdctnStmnt_DerivedFrom TEXT,
MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Cd TEXT,
MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Sys TEXT,
MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_AddtnlInstrctn_Txt TEXT,
MdctnStmnt_Dsg_AsNdBooleanTyp TEXT,
MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Cd TEXT,
MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Sys TEXT,
MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_AsNdCdbleCncpt_Txt TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtQnty_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtQnty_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtQnty_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cmprtr TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt TEXT,
MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl TEXT,
MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Cd TEXT,
MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Sys TEXT,
MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_DoseAndRt_Typ_Txt TEXT,
MdctnStmnt_Dsg_MxDosePerAdmnstn_Cd TEXT,
MdctnStmnt_Dsg_MxDosePerAdmnstn_Cmprtr TEXT,
MdctnStmnt_Dsg_MxDosePerAdmnstn_Sys TEXT,
MdctnStmnt_Dsg_MxDosePerAdmnstn_Unt TEXT,
MdctnStmnt_Dsg_MxDosePerAdmnstn_Vl TEXT,
MdctnStmnt_Dsg_MxDosePerLifetime_Cd TEXT,
MdctnStmnt_Dsg_MxDosePerLifetime_Cmprtr TEXT,
MdctnStmnt_Dsg_MxDosePerLifetime_Sys TEXT,
MdctnStmnt_Dsg_MxDosePerLifetime_Unt TEXT,
MdctnStmnt_Dsg_MxDosePerLifetime_Vl TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cd TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cmprtr TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Sys TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Unt TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Vl TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cd TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cmprtr TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Sys TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Unt TEXT,
MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Vl TEXT,
MdctnStmnt_Dsg_Mthd_Cdg_Cd TEXT,
MdctnStmnt_Dsg_Mthd_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_Mthd_Cdg_Sys TEXT,
MdctnStmnt_Dsg_Mthd_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_Mthd_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_Mthd_Txt TEXT,
MdctnStmnt_Dsg_PntInstrctn TEXT,
MdctnStmnt_Dsg_Route_Cdg_Cd TEXT,
MdctnStmnt_Dsg_Route_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_Route_Cdg_Sys TEXT,
MdctnStmnt_Dsg_Route_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_Route_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_Route_Txt TEXT,
MdctnStmnt_Dsg_Sqnc TEXT,
MdctnStmnt_Dsg_Site_Cdg_Cd TEXT,
MdctnStmnt_Dsg_Site_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_Site_Cdg_Sys TEXT,
MdctnStmnt_Dsg_Site_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_Site_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_Site_Txt TEXT,
MdctnStmnt_Dsg_Txt TEXT,
MdctnStmnt_Dsg_Tmg_Cd_Cdg_Cd TEXT,
MdctnStmnt_Dsg_Tmg_Cd_Cdg_Dsply TEXT,
MdctnStmnt_Dsg_Tmg_Cd_Cdg_Sys TEXT,
MdctnStmnt_Dsg_Tmg_Cd_Cdg_UsrSltd TEXT,
MdctnStmnt_Dsg_Tmg_Cd_Cdg_Vrsn TEXT,
MdctnStmnt_Dsg_Tmg_Cd_Txt TEXT,
MdctnStmnt_Dsg_Tmg_Evnt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Cd TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Cmprtr TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Sys TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Unt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Vl TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_End TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cd TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Sys TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Unt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Vl TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cd TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Sys TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Unt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Vl TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_Cnt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_CntMx TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_Duration TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_DurationMx TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_DurationUnt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_Frqncy TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_FrqncyMx TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_Off TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_Prd TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_PrdMx TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_PrdUnt TEXT,
MdctnStmnt_Dsg_Tmg_Rpt_TimeOfDay TEXT,
MdctnStmnt_EfctiveDtTimeTyp TEXT,
MdctnStmnt_EfctivePrd_End TEXT,
MdctnStmnt_EfctivePrd_Strt TEXT,
MdctnStmnt_Id_Assigner TEXT,
MdctnStmnt_Id_Prd_End TEXT,
MdctnStmnt_Id_Prd_Strt TEXT,
MdctnStmnt_Id_Sys TEXT,
MdctnStmnt_Id_Typ_Cdg_Cd TEXT,
MdctnStmnt_Id_Typ_Cdg_Dsply TEXT,
MdctnStmnt_Id_Typ_Cdg_Sys TEXT,
MdctnStmnt_Id_Typ_Cdg_UsrSltd TEXT,
MdctnStmnt_Id_Typ_Cdg_Vrsn TEXT,
MdctnStmnt_Id_Typ_Txt TEXT,
MdctnStmnt_Id_Use TEXT,
MdctnStmnt_Id_Vl TEXT,
MdctnStmnt_InfoSrc TEXT,
MdctnStmnt_MdctnCdbleCncpt_Cdg_Cd TEXT,
MdctnStmnt_MdctnCdbleCncpt_Cdg_Dsply TEXT,
MdctnStmnt_MdctnCdbleCncpt_Cdg_Sys TEXT,
MdctnStmnt_MdctnCdbleCncpt_Cdg_UsrSltd TEXT,
MdctnStmnt_MdctnCdbleCncpt_Cdg_Vrsn TEXT,
MdctnStmnt_MdctnCdbleCncpt_Txt TEXT,
MdctnStmnt_MdctnRfrnc TEXT,
MdctnStmnt_Nt_AthrRfrnc TEXT,
MdctnStmnt_Nt_AthrStrgTyp TEXT,
MdctnStmnt_Nt_Txt TEXT,
MdctnStmnt_Nt_Time TEXT,
MdctnStmnt_PartOf TEXT,
MdctnStmnt_RsnCd_Cdg_Cd TEXT,
MdctnStmnt_RsnCd_Cdg_Dsply TEXT,
MdctnStmnt_RsnCd_Cdg_Sys TEXT,
MdctnStmnt_RsnCd_Cdg_UsrSltd TEXT,
MdctnStmnt_RsnCd_Cdg_Vrsn TEXT,
MdctnStmnt_RsnCd_Txt TEXT,
MdctnStmnt_RsnRfrnc TEXT,
MdctnStmnt_Sts TEXT,
MdctnStmnt_StsRsn_Cdg_Cd TEXT,
MdctnStmnt_StsRsn_Cdg_Dsply TEXT,
MdctnStmnt_StsRsn_Cdg_Sys TEXT,
MdctnStmnt_StsRsn_Cdg_UsrSltd TEXT,
MdctnStmnt_StsRsn_Cdg_Vrsn TEXT,
MdctnStmnt_StsRsn_Txt TEXT,
MdctnStmnt_Sbjct TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;