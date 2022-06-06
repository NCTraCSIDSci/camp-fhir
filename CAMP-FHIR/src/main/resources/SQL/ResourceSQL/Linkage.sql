drop table if exists `Linkage`;
CREATE TABLE `Linkage` (
 id varchar(64),
Linkage_Active TEXT,
Linkage_Athr TEXT,
Linkage_Itm_Rsrc TEXT,
Linkage_Itm_Typ TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;