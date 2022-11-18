drop table if exists `Subscription`;
CREATE TABLE `Subscription` (
 id varchar(64),
Subscription_Channel_Endpoint TEXT COMMENT 'Subscription.Channel.Endpoint',
Subscription_Channel_Header TEXT COMMENT 'Subscription.Channel.Header',
Subscription_Channel_Payload TEXT COMMENT 'Subscription.Channel.Payload',
Subscription_Channel_Typ TEXT COMMENT 'Subscription.Channel.Type',
Subscription_Cntct_Prd_End TEXT COMMENT 'Subscription.Contact.Period.End',
Subscription_Cntct_Prd_Strt TEXT COMMENT 'Subscription.Contact.Period.Start',
Subscription_Cntct_Rnk TEXT COMMENT 'Subscription.Contact.Rank',
Subscription_Cntct_Sys TEXT COMMENT 'Subscription.Contact.System',
Subscription_Cntct_Use TEXT COMMENT 'Subscription.Contact.Use',
Subscription_Cntct_Vl TEXT COMMENT 'Subscription.Contact.Value',
Subscription_Criteria TEXT COMMENT 'Subscription.Criteria',
Subscription_End TEXT COMMENT 'Subscription.End',
Subscription_Error TEXT COMMENT 'Subscription.Error',
Subscription_Rsn TEXT COMMENT 'Subscription.Reason',
Subscription_Sts TEXT COMMENT 'Subscription.Status',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;