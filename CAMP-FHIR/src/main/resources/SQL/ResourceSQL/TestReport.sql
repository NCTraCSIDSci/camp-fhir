drop table if exists `TestReport`;
CREATE TABLE `TestReport` (
 id varchar(64),
TstRpt_Id_Assigner TEXT COMMENT 'TestReport.Identifier.Assigner',
TstRpt_Id_Prd_End TEXT COMMENT 'TestReport.Identifier.Period.End',
TstRpt_Id_Prd_Strt TEXT COMMENT 'TestReport.Identifier.Period.Start',
TstRpt_Id_Sys TEXT COMMENT 'TestReport.Identifier.System',
TstRpt_Id_Typ_Cdg_Cd TEXT COMMENT 'TestReport.Identifier.Type.Coding.Code',
TstRpt_Id_Typ_Cdg_Dsply TEXT COMMENT 'TestReport.Identifier.Type.Coding.Display',
TstRpt_Id_Typ_Cdg_Sys TEXT COMMENT 'TestReport.Identifier.Type.Coding.System',
TstRpt_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'TestReport.Identifier.Type.Coding.UserSelected',
TstRpt_Id_Typ_Cdg_Vrsn TEXT COMMENT 'TestReport.Identifier.Type.Coding.Version',
TstRpt_Id_Typ_Txt TEXT COMMENT 'TestReport.Identifier.Type.Text',
TstRpt_Id_Use TEXT COMMENT 'TestReport.Identifier.Use',
TstRpt_Id_Vl TEXT COMMENT 'TestReport.Identifier.Value',
TstRpt_Issued TEXT COMMENT 'TestReport.Issued',
TstRpt_Nm TEXT COMMENT 'TestReport.Name',
TstRpt_Prtcpnt_Dsply TEXT COMMENT 'TestReport.Participant.Display',
TstRpt_Prtcpnt_Typ TEXT COMMENT 'TestReport.Participant.Type',
TstRpt_Prtcpnt_Uri TEXT COMMENT 'TestReport.Participant.Uri',
TstRpt_Rslt TEXT COMMENT 'TestReport.Result',
TstRpt_Score TEXT COMMENT 'TestReport.Score',
TstRpt_Stup_Actn_Assert_Dtl TEXT COMMENT 'TestReport.Setup.Action.Assert.Detail',
TstRpt_Stup_Actn_Assert_Msg TEXT COMMENT 'TestReport.Setup.Action.Assert.Message',
TstRpt_Stup_Actn_Assert_Rslt TEXT COMMENT 'TestReport.Setup.Action.Assert.Result',
TstRpt_Stup_Actn_Oprtn_Dtl TEXT COMMENT 'TestReport.Setup.Action.Operation.Detail',
TstRpt_Stup_Actn_Oprtn_Msg TEXT COMMENT 'TestReport.Setup.Action.Operation.Message',
TstRpt_Stup_Actn_Oprtn_Rslt TEXT COMMENT 'TestReport.Setup.Action.Operation.Result',
TstRpt_Sts TEXT COMMENT 'TestReport.Status',
TstRpt_Teardown_Actn_Oprtn_Dtl TEXT COMMENT 'TestReport.Teardown.Action.Operation.Detail',
TstRpt_Teardown_Actn_Oprtn_Msg TEXT COMMENT 'TestReport.Teardown.Action.Operation.Message',
TstRpt_Teardown_Actn_Oprtn_Rslt TEXT COMMENT 'TestReport.Teardown.Action.Operation.Result',
TstRpt_Tst_Actn_Assert_Dtl TEXT COMMENT 'TestReport.Test.Action.Assert.Detail',
TstRpt_Tst_Actn_Assert_Msg TEXT COMMENT 'TestReport.Test.Action.Assert.Message',
TstRpt_Tst_Actn_Assert_Rslt TEXT COMMENT 'TestReport.Test.Action.Assert.Result',
TstRpt_Tst_Actn_Oprtn_Dtl TEXT COMMENT 'TestReport.Test.Action.Operation.Detail',
TstRpt_Tst_Actn_Oprtn_Msg TEXT COMMENT 'TestReport.Test.Action.Operation.Message',
TstRpt_Tst_Actn_Oprtn_Rslt TEXT COMMENT 'TestReport.Test.Action.Operation.Result',
TstRpt_Tst_Dscrptn TEXT COMMENT 'TestReport.Test.Description',
TstRpt_Tst_Nm TEXT COMMENT 'TestReport.Test.Name',
TstRpt_TstScrpt TEXT COMMENT 'TestReport.TestScript',
TstRpt_Tster TEXT COMMENT 'TestReport.Tester',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;