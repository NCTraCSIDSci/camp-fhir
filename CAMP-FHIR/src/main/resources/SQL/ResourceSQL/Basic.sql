drop table if exists `Basic`;
CREATE TABLE `Basic` (
 id varchar(64),
Basic_Athr TEXT,
Basic_Cd_Cdg_Cd TEXT,
Basic_Cd_Cdg_Dsply TEXT,
Basic_Cd_Cdg_Sys TEXT,
Basic_Cd_Cdg_UsrSltd TEXT,
Basic_Cd_Cdg_Vrsn TEXT,
Basic_Cd_Txt TEXT,
Basic_Created TEXT,
Basic_Id_Assigner TEXT,
Basic_Id_Prd_End TEXT,
Basic_Id_Prd_Strt TEXT,
Basic_Id_Sys TEXT,
Basic_Id_Typ_Cdg_Cd TEXT,
Basic_Id_Typ_Cdg_Dsply TEXT,
Basic_Id_Typ_Cdg_Sys TEXT,
Basic_Id_Typ_Cdg_UsrSltd TEXT,
Basic_Id_Typ_Cdg_Vrsn TEXT,
Basic_Id_Typ_Txt TEXT,
Basic_Id_Use TEXT,
Basic_Id_Vl TEXT,
Basic_Sbjct TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;