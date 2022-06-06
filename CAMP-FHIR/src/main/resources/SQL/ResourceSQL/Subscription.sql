drop table if exists `Subscription`;
CREATE TABLE `Subscription` (
 id varchar(64),
Subscription_Channel_Endpoint TEXT,
Subscription_Channel_Header TEXT,
Subscription_Channel_Payload TEXT,
Subscription_Channel_Typ TEXT,
Subscription_Cntct_Prd_End TEXT,
Subscription_Cntct_Prd_Strt TEXT,
Subscription_Cntct_Rnk TEXT,
Subscription_Cntct_Sys TEXT,
Subscription_Cntct_Use TEXT,
Subscription_Cntct_Vl TEXT,
Subscription_Criteria TEXT,
Subscription_End TEXT,
Subscription_Error TEXT,
Subscription_Rsn TEXT,
Subscription_Sts TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;