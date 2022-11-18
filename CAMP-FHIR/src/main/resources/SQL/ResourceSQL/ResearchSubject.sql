drop table if exists `ResearchSubject`;
CREATE TABLE `ResearchSubject` (
 id varchar(64),
RsrchSbjct_ActualArm TEXT COMMENT 'ResearchSubject.ActualArm',
RsrchSbjct_AssignedArm TEXT COMMENT 'ResearchSubject.AssignedArm',
RsrchSbjct_Cnsnt TEXT COMMENT 'ResearchSubject.Consent',
RsrchSbjct_Id_Assigner TEXT COMMENT 'ResearchSubject.Identifier.Assigner',
RsrchSbjct_Id_Prd_End TEXT COMMENT 'ResearchSubject.Identifier.Period.End',
RsrchSbjct_Id_Prd_Strt TEXT COMMENT 'ResearchSubject.Identifier.Period.Start',
RsrchSbjct_Id_Sys TEXT COMMENT 'ResearchSubject.Identifier.System',
RsrchSbjct_Id_Typ_Cdg_Cd TEXT COMMENT 'ResearchSubject.Identifier.Type.Coding.Code',
RsrchSbjct_Id_Typ_Cdg_Dsply TEXT COMMENT 'ResearchSubject.Identifier.Type.Coding.Display',
RsrchSbjct_Id_Typ_Cdg_Sys TEXT COMMENT 'ResearchSubject.Identifier.Type.Coding.System',
RsrchSbjct_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'ResearchSubject.Identifier.Type.Coding.UserSelected',
RsrchSbjct_Id_Typ_Cdg_Vrsn TEXT COMMENT 'ResearchSubject.Identifier.Type.Coding.Version',
RsrchSbjct_Id_Typ_Txt TEXT COMMENT 'ResearchSubject.Identifier.Type.Text',
RsrchSbjct_Id_Use TEXT COMMENT 'ResearchSubject.Identifier.Use',
RsrchSbjct_Id_Vl TEXT COMMENT 'ResearchSubject.Identifier.Value',
RsrchSbjct_Individual TEXT COMMENT 'ResearchSubject.Individual',
RsrchSbjct_Prd_End TEXT COMMENT 'ResearchSubject.Period.End',
RsrchSbjct_Prd_Strt TEXT COMMENT 'ResearchSubject.Period.Start',
RsrchSbjct_Sts TEXT COMMENT 'ResearchSubject.Status',
RsrchSbjct_Stdy TEXT COMMENT 'ResearchSubject.Study',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;