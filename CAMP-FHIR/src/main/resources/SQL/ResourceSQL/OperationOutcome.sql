drop table if exists `OperationOutcome`;
CREATE TABLE `OperationOutcome` (
 id varchar(64),
OprtnOutcome_Issue_Cd TEXT,
OprtnOutcome_Issue_Dtls_Cdg_Cd TEXT,
OprtnOutcome_Issue_Dtls_Cdg_Dsply TEXT,
OprtnOutcome_Issue_Dtls_Cdg_Sys TEXT,
OprtnOutcome_Issue_Dtls_Cdg_UsrSltd TEXT,
OprtnOutcome_Issue_Dtls_Cdg_Vrsn TEXT,
OprtnOutcome_Issue_Dtls_Txt TEXT,
OprtnOutcome_Issue_Diagnostics TEXT,
OprtnOutcome_Issue_Exprsn TEXT,
OprtnOutcome_Issue_Lctn TEXT,
OprtnOutcome_Issue_Severity TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;