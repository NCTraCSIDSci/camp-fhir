drop table if exists `DetectedIssue`;
CREATE TABLE `DetectedIssue` (
 id varchar(64),
DetectedIssue_Athr TEXT,
DetectedIssue_Cd_Cdg_Cd TEXT,
DetectedIssue_Cd_Cdg_Dsply TEXT,
DetectedIssue_Cd_Cdg_Sys TEXT,
DetectedIssue_Cd_Cdg_UsrSltd TEXT,
DetectedIssue_Cd_Cdg_Vrsn TEXT,
DetectedIssue_Cd_Txt TEXT,
DetectedIssue_Dtl TEXT,
DetectedIssue_Evdnce_Cd_Cdg_Cd TEXT,
DetectedIssue_Evdnce_Cd_Cdg_Dsply TEXT,
DetectedIssue_Evdnce_Cd_Cdg_Sys TEXT,
DetectedIssue_Evdnce_Cd_Cdg_UsrSltd TEXT,
DetectedIssue_Evdnce_Cd_Cdg_Vrsn TEXT,
DetectedIssue_Evdnce_Cd_Txt TEXT,
DetectedIssue_Evdnce_Dtl TEXT,
DetectedIssue_IdentifiedDtTimeTyp TEXT,
DetectedIssue_IdentifiedPrd_End TEXT,
DetectedIssue_IdentifiedPrd_Strt TEXT,
DetectedIssue_Id_Assigner TEXT,
DetectedIssue_Id_Prd_End TEXT,
DetectedIssue_Id_Prd_Strt TEXT,
DetectedIssue_Id_Sys TEXT,
DetectedIssue_Id_Typ_Cdg_Cd TEXT,
DetectedIssue_Id_Typ_Cdg_Dsply TEXT,
DetectedIssue_Id_Typ_Cdg_Sys TEXT,
DetectedIssue_Id_Typ_Cdg_UsrSltd TEXT,
DetectedIssue_Id_Typ_Cdg_Vrsn TEXT,
DetectedIssue_Id_Typ_Txt TEXT,
DetectedIssue_Id_Use TEXT,
DetectedIssue_Id_Vl TEXT,
DetectedIssue_Implicated TEXT,
DetectedIssue_Mitigation_Actn_Cdg_Cd TEXT,
DetectedIssue_Mitigation_Actn_Cdg_Dsply TEXT,
DetectedIssue_Mitigation_Actn_Cdg_Sys TEXT,
DetectedIssue_Mitigation_Actn_Cdg_UsrSltd TEXT,
DetectedIssue_Mitigation_Actn_Cdg_Vrsn TEXT,
DetectedIssue_Mitigation_Actn_Txt TEXT,
DetectedIssue_Mitigation_Athr TEXT,
DetectedIssue_Mitigation_Dt TEXT,
DetectedIssue_Pnt TEXT,
DetectedIssue_Rfrnc TEXT,
DetectedIssue_Severity TEXT,
DetectedIssue_Sts TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;