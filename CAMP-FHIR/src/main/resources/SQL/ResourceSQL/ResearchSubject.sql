drop table if exists `ResearchSubject`;
CREATE TABLE `ResearchSubject` (
 id varchar(64),
RsrchSbjct_ActualArm TEXT,
RsrchSbjct_AssignedArm TEXT,
RsrchSbjct_Cnsnt TEXT,
RsrchSbjct_Id_Assigner TEXT,
RsrchSbjct_Id_Prd_End TEXT,
RsrchSbjct_Id_Prd_Strt TEXT,
RsrchSbjct_Id_Sys TEXT,
RsrchSbjct_Id_Typ_Cdg_Cd TEXT,
RsrchSbjct_Id_Typ_Cdg_Dsply TEXT,
RsrchSbjct_Id_Typ_Cdg_Sys TEXT,
RsrchSbjct_Id_Typ_Cdg_UsrSltd TEXT,
RsrchSbjct_Id_Typ_Cdg_Vrsn TEXT,
RsrchSbjct_Id_Typ_Txt TEXT,
RsrchSbjct_Id_Use TEXT,
RsrchSbjct_Id_Vl TEXT,
RsrchSbjct_Individual TEXT,
RsrchSbjct_Prd_End TEXT,
RsrchSbjct_Prd_Strt TEXT,
RsrchSbjct_Sts TEXT,
RsrchSbjct_Stdy TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;