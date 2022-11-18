drop table if exists `Linkage`;
CREATE TABLE `Linkage` (
 id varchar(64),
Linkage_Active TEXT COMMENT 'Linkage.Active',
Linkage_Athr TEXT COMMENT 'Linkage.Author',
Linkage_Itm_Rsrc TEXT COMMENT 'Linkage.Item.Resource',
Linkage_Itm_Typ TEXT COMMENT 'Linkage.Item.Type',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;