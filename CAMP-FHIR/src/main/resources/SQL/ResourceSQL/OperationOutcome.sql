drop table if exists `OperationOutcome`;
CREATE TABLE `OperationOutcome` (
 id varchar(64),
OprtnOutcome_Issue_Cd TEXT COMMENT 'OperationOutcome.Issue.Code',
OprtnOutcome_Issue_Dtls_Cdg_Cd TEXT COMMENT 'OperationOutcome.Issue.Details.Coding.Code',
OprtnOutcome_Issue_Dtls_Cdg_Dsply TEXT COMMENT 'OperationOutcome.Issue.Details.Coding.Display',
OprtnOutcome_Issue_Dtls_Cdg_Sys TEXT COMMENT 'OperationOutcome.Issue.Details.Coding.System',
OprtnOutcome_Issue_Dtls_Cdg_UsrSltd TEXT COMMENT 'OperationOutcome.Issue.Details.Coding.UserSelected',
OprtnOutcome_Issue_Dtls_Cdg_Vrsn TEXT COMMENT 'OperationOutcome.Issue.Details.Coding.Version',
OprtnOutcome_Issue_Dtls_Txt TEXT COMMENT 'OperationOutcome.Issue.Details.Text',
OprtnOutcome_Issue_Diagnostics TEXT COMMENT 'OperationOutcome.Issue.Diagnostics',
OprtnOutcome_Issue_Exprsn TEXT COMMENT 'OperationOutcome.Issue.Expression',
OprtnOutcome_Issue_Lctn TEXT COMMENT 'OperationOutcome.Issue.Location',
OprtnOutcome_Issue_Severity TEXT COMMENT 'OperationOutcome.Issue.Severity',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;