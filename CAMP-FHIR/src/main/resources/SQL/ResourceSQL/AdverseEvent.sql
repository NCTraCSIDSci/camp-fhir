drop table if exists `AdverseEvent`;
CREATE TABLE `AdverseEvent` (
 id varchar(64),
AdvsEvnt_Actuality TEXT,
AdvsEvnt_Ctgry_Cdg_Cd TEXT,
AdvsEvnt_Ctgry_Cdg_Dsply TEXT,
AdvsEvnt_Ctgry_Cdg_Sys TEXT,
AdvsEvnt_Ctgry_Cdg_UsrSltd TEXT,
AdvsEvnt_Ctgry_Cdg_Vrsn TEXT,
AdvsEvnt_Ctgry_Txt TEXT,
AdvsEvnt_Contributor TEXT,
AdvsEvnt_Dt TEXT,
AdvsEvnt_Detected TEXT,
AdvsEvnt_Enc TEXT,
AdvsEvnt_Evnt_Cdg_Cd TEXT,
AdvsEvnt_Evnt_Cdg_Dsply TEXT,
AdvsEvnt_Evnt_Cdg_Sys TEXT,
AdvsEvnt_Evnt_Cdg_UsrSltd TEXT,
AdvsEvnt_Evnt_Cdg_Vrsn TEXT,
AdvsEvnt_Evnt_Txt TEXT,
AdvsEvnt_Id_Assigner TEXT,
AdvsEvnt_Id_Prd_End TEXT,
AdvsEvnt_Id_Prd_Strt TEXT,
AdvsEvnt_Id_Sys TEXT,
AdvsEvnt_Id_Typ_Cdg_Cd TEXT,
AdvsEvnt_Id_Typ_Cdg_Dsply TEXT,
AdvsEvnt_Id_Typ_Cdg_Sys TEXT,
AdvsEvnt_Id_Typ_Cdg_UsrSltd TEXT,
AdvsEvnt_Id_Typ_Cdg_Vrsn TEXT,
AdvsEvnt_Id_Typ_Txt TEXT,
AdvsEvnt_Id_Use TEXT,
AdvsEvnt_Id_Vl TEXT,
AdvsEvnt_Lctn TEXT,
AdvsEvnt_Outcome_Cdg_Cd TEXT,
AdvsEvnt_Outcome_Cdg_Dsply TEXT,
AdvsEvnt_Outcome_Cdg_Sys TEXT,
AdvsEvnt_Outcome_Cdg_UsrSltd TEXT,
AdvsEvnt_Outcome_Cdg_Vrsn TEXT,
AdvsEvnt_Outcome_Txt TEXT,
AdvsEvnt_RecordedDt TEXT,
AdvsEvnt_Recorder TEXT,
AdvsEvnt_RfrncDoc TEXT,
AdvsEvnt_RsltingCndtn TEXT,
AdvsEvnt_Seriousness_Cdg_Cd TEXT,
AdvsEvnt_Seriousness_Cdg_Dsply TEXT,
AdvsEvnt_Seriousness_Cdg_Sys TEXT,
AdvsEvnt_Seriousness_Cdg_UsrSltd TEXT,
AdvsEvnt_Seriousness_Cdg_Vrsn TEXT,
AdvsEvnt_Seriousness_Txt TEXT,
AdvsEvnt_Severity_Cdg_Cd TEXT,
AdvsEvnt_Severity_Cdg_Dsply TEXT,
AdvsEvnt_Severity_Cdg_Sys TEXT,
AdvsEvnt_Severity_Cdg_UsrSltd TEXT,
AdvsEvnt_Severity_Cdg_Vrsn TEXT,
AdvsEvnt_Severity_Txt TEXT,
AdvsEvnt_Stdy TEXT,
AdvsEvnt_Sbjct TEXT,
AdvsEvnt_SbjctMedicalHis TEXT,
AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Cd TEXT,
AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Dsply TEXT,
AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Sys TEXT,
AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_UsrSltd TEXT,
AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Vrsn TEXT,
AdvsEvnt_SuspectEntity_Causality_Assmnt_Txt TEXT,
AdvsEvnt_SuspectEntity_Causality_Athr TEXT,
AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Cd TEXT,
AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Dsply TEXT,
AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Sys TEXT,
AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_UsrSltd TEXT,
AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Vrsn TEXT,
AdvsEvnt_SuspectEntity_Causality_Mthd_Txt TEXT,
AdvsEvnt_SuspectEntity_Causality_PrdctRltedness TEXT,
AdvsEvnt_SuspectEntity_Instance TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;