drop table if exists `Basic`;
CREATE TABLE `Basic` (
 id varchar(64),
Basic_Athr TEXT COMMENT 'Basic.Author',
Basic_Cd_Cdg_Cd TEXT COMMENT 'Basic.Code.Coding.Code',
Basic_Cd_Cdg_Dsply TEXT COMMENT 'Basic.Code.Coding.Display',
Basic_Cd_Cdg_Sys TEXT COMMENT 'Basic.Code.Coding.System',
Basic_Cd_Cdg_UsrSltd TEXT COMMENT 'Basic.Code.Coding.UserSelected',
Basic_Cd_Cdg_Vrsn TEXT COMMENT 'Basic.Code.Coding.Version',
Basic_Cd_Txt TEXT COMMENT 'Basic.Code.Text',
Basic_Created TEXT COMMENT 'Basic.Created',
Basic_Id_Assigner TEXT COMMENT 'Basic.Identifier.Assigner',
Basic_Id_Prd_End TEXT COMMENT 'Basic.Identifier.Period.End',
Basic_Id_Prd_Strt TEXT COMMENT 'Basic.Identifier.Period.Start',
Basic_Id_Sys TEXT COMMENT 'Basic.Identifier.System',
Basic_Id_Typ_Cdg_Cd TEXT COMMENT 'Basic.Identifier.Type.Coding.Code',
Basic_Id_Typ_Cdg_Dsply TEXT COMMENT 'Basic.Identifier.Type.Coding.Display',
Basic_Id_Typ_Cdg_Sys TEXT COMMENT 'Basic.Identifier.Type.Coding.System',
Basic_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'Basic.Identifier.Type.Coding.UserSelected',
Basic_Id_Typ_Cdg_Vrsn TEXT COMMENT 'Basic.Identifier.Type.Coding.Version',
Basic_Id_Typ_Txt TEXT COMMENT 'Basic.Identifier.Type.Text',
Basic_Id_Use TEXT COMMENT 'Basic.Identifier.Use',
Basic_Id_Vl TEXT COMMENT 'Basic.Identifier.Value',
Basic_Sbjct TEXT COMMENT 'Basic.Subject',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;