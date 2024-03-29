drop table if exists `Condition`;
CREATE TABLE `Condition` (
 id varchar(64),
Cndtn_AbatementAge_Cd TEXT COMMENT 'Condition.AbatementAge.Code',
Cndtn_AbatementAge_Cmprtr TEXT COMMENT 'Condition.AbatementAge.Comparator',
Cndtn_AbatementAge_Sys TEXT COMMENT 'Condition.AbatementAge.System',
Cndtn_AbatementAge_Unt TEXT COMMENT 'Condition.AbatementAge.Unit',
Cndtn_AbatementAge_Vl TEXT COMMENT 'Condition.AbatementAge.Value',
Cndtn_AbatementDtTimeTyp TEXT COMMENT 'Condition.AbatementDateTimeType',
Cndtn_AbatementPrd_End TEXT COMMENT 'Condition.AbatementPeriod.End',
Cndtn_AbatementPrd_Strt TEXT COMMENT 'Condition.AbatementPeriod.Start',
Cndtn_AbatementRng_Hi_Cd TEXT COMMENT 'Condition.AbatementRange.High.Code',
Cndtn_AbatementRng_Hi_Cmprtr TEXT COMMENT 'Condition.AbatementRange.High.Comparator',
Cndtn_AbatementRng_Hi_Sys TEXT COMMENT 'Condition.AbatementRange.High.System',
Cndtn_AbatementRng_Hi_Unt TEXT COMMENT 'Condition.AbatementRange.High.Unit',
Cndtn_AbatementRng_Hi_Vl TEXT COMMENT 'Condition.AbatementRange.High.Value',
Cndtn_AbatementRng_Lw_Cd TEXT COMMENT 'Condition.AbatementRange.Low.Code',
Cndtn_AbatementRng_Lw_Cmprtr TEXT COMMENT 'Condition.AbatementRange.Low.Comparator',
Cndtn_AbatementRng_Lw_Sys TEXT COMMENT 'Condition.AbatementRange.Low.System',
Cndtn_AbatementRng_Lw_Unt TEXT COMMENT 'Condition.AbatementRange.Low.Unit',
Cndtn_AbatementRng_Lw_Vl TEXT COMMENT 'Condition.AbatementRange.Low.Value',
Cndtn_AbatementStrgTyp TEXT COMMENT 'Condition.AbatementStringType',
Cndtn_Asserter TEXT COMMENT 'Condition.Asserter',
Cndtn_BodySite_Cdg_Cd TEXT COMMENT 'Condition.BodySite.Coding.Code',
Cndtn_BodySite_Cdg_Dsply TEXT COMMENT 'Condition.BodySite.Coding.Display',
Cndtn_BodySite_Cdg_Sys TEXT COMMENT 'Condition.BodySite.Coding.System',
Cndtn_BodySite_Cdg_UsrSltd TEXT COMMENT 'Condition.BodySite.Coding.UserSelected',
Cndtn_BodySite_Cdg_Vrsn TEXT COMMENT 'Condition.BodySite.Coding.Version',
Cndtn_BodySite_Txt TEXT COMMENT 'Condition.BodySite.Text',
Cndtn_Ctgry_Cdg_Cd TEXT COMMENT 'Condition.Category.Coding.Code',
Cndtn_Ctgry_Cdg_Dsply TEXT COMMENT 'Condition.Category.Coding.Display',
Cndtn_Ctgry_Cdg_Sys TEXT COMMENT 'Condition.Category.Coding.System',
Cndtn_Ctgry_Cdg_UsrSltd TEXT COMMENT 'Condition.Category.Coding.UserSelected',
Cndtn_Ctgry_Cdg_Vrsn TEXT COMMENT 'Condition.Category.Coding.Version',
Cndtn_Ctgry_Txt TEXT COMMENT 'Condition.Category.Text',
Cndtn_ClnclSts_Cdg_Cd TEXT COMMENT 'Condition.ClinicalStatus.Coding.Code',
Cndtn_ClnclSts_Cdg_Dsply TEXT COMMENT 'Condition.ClinicalStatus.Coding.Display',
Cndtn_ClnclSts_Cdg_Sys TEXT COMMENT 'Condition.ClinicalStatus.Coding.System',
Cndtn_ClnclSts_Cdg_UsrSltd TEXT COMMENT 'Condition.ClinicalStatus.Coding.UserSelected',
Cndtn_ClnclSts_Cdg_Vrsn TEXT COMMENT 'Condition.ClinicalStatus.Coding.Version',
Cndtn_ClnclSts_Txt TEXT COMMENT 'Condition.ClinicalStatus.Text',
Cndtn_Cd_Cdg_Cd TEXT COMMENT 'Condition.Code.Coding.Code',
Cndtn_Cd_Cdg_Dsply TEXT COMMENT 'Condition.Code.Coding.Display',
Cndtn_Cd_Cdg_Sys TEXT COMMENT 'Condition.Code.Coding.System',
Cndtn_Cd_Cdg_UsrSltd TEXT COMMENT 'Condition.Code.Coding.UserSelected',
Cndtn_Cd_Cdg_Vrsn TEXT COMMENT 'Condition.Code.Coding.Version',
Cndtn_Cd_Txt TEXT COMMENT 'Condition.Code.Text',
Cndtn_Enc TEXT COMMENT 'Condition.Encounter',
Cndtn_Evdnce_Cd_Cdg_Cd TEXT COMMENT 'Condition.Evidence.Code.Coding.Code',
Cndtn_Evdnce_Cd_Cdg_Dsply TEXT COMMENT 'Condition.Evidence.Code.Coding.Display',
Cndtn_Evdnce_Cd_Cdg_Sys TEXT COMMENT 'Condition.Evidence.Code.Coding.System',
Cndtn_Evdnce_Cd_Cdg_UsrSltd TEXT COMMENT 'Condition.Evidence.Code.Coding.UserSelected',
Cndtn_Evdnce_Cd_Cdg_Vrsn TEXT COMMENT 'Condition.Evidence.Code.Coding.Version',
Cndtn_Evdnce_Cd_Txt TEXT COMMENT 'Condition.Evidence.Code.Text',
Cndtn_Evdnce_Dtl TEXT COMMENT 'Condition.Evidence.Detail',
Cndtn_Id_Assigner TEXT COMMENT 'Condition.Identifier.Assigner',
Cndtn_Id_Prd_End TEXT COMMENT 'Condition.Identifier.Period.End',
Cndtn_Id_Prd_Strt TEXT COMMENT 'Condition.Identifier.Period.Start',
Cndtn_Id_Sys TEXT COMMENT 'Condition.Identifier.System',
Cndtn_Id_Typ_Cdg_Cd TEXT COMMENT 'Condition.Identifier.Type.Coding.Code',
Cndtn_Id_Typ_Cdg_Dsply TEXT COMMENT 'Condition.Identifier.Type.Coding.Display',
Cndtn_Id_Typ_Cdg_Sys TEXT COMMENT 'Condition.Identifier.Type.Coding.System',
Cndtn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'Condition.Identifier.Type.Coding.UserSelected',
Cndtn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'Condition.Identifier.Type.Coding.Version',
Cndtn_Id_Typ_Txt TEXT COMMENT 'Condition.Identifier.Type.Text',
Cndtn_Id_Use TEXT COMMENT 'Condition.Identifier.Use',
Cndtn_Id_Vl TEXT COMMENT 'Condition.Identifier.Value',
Cndtn_Nt_AthrRfrnc TEXT COMMENT 'Condition.Note.AuthorReference',
Cndtn_Nt_AthrStrgTyp TEXT COMMENT 'Condition.Note.AuthorStringType',
Cndtn_Nt_Txt TEXT COMMENT 'Condition.Note.Text',
Cndtn_Nt_Time TEXT COMMENT 'Condition.Note.Time',
Cndtn_OnAge_Cd TEXT COMMENT 'Condition.OnAge.Code',
Cndtn_OnAge_Cmprtr TEXT COMMENT 'Condition.OnAge.Comparator',
Cndtn_OnAge_Sys TEXT COMMENT 'Condition.OnAge.System',
Cndtn_OnAge_Unt TEXT COMMENT 'Condition.OnAge.Unit',
Cndtn_OnAge_Vl TEXT COMMENT 'Condition.OnAge.Value',
Cndtn_OnDtTimeTyp TEXT COMMENT 'Condition.OnDateTimeType',
Cndtn_OnPrd_End TEXT COMMENT 'Condition.OnPeriod.End',
Cndtn_OnPrd_Strt TEXT COMMENT 'Condition.OnPeriod.Start',
Cndtn_OnRng_Hi_Cd TEXT COMMENT 'Condition.OnRange.High.Code',
Cndtn_OnRng_Hi_Cmprtr TEXT COMMENT 'Condition.OnRange.High.Comparator',
Cndtn_OnRng_Hi_Sys TEXT COMMENT 'Condition.OnRange.High.System',
Cndtn_OnRng_Hi_Unt TEXT COMMENT 'Condition.OnRange.High.Unit',
Cndtn_OnRng_Hi_Vl TEXT COMMENT 'Condition.OnRange.High.Value',
Cndtn_OnRng_Lw_Cd TEXT COMMENT 'Condition.OnRange.Low.Code',
Cndtn_OnRng_Lw_Cmprtr TEXT COMMENT 'Condition.OnRange.Low.Comparator',
Cndtn_OnRng_Lw_Sys TEXT COMMENT 'Condition.OnRange.Low.System',
Cndtn_OnRng_Lw_Unt TEXT COMMENT 'Condition.OnRange.Low.Unit',
Cndtn_OnRng_Lw_Vl TEXT COMMENT 'Condition.OnRange.Low.Value',
Cndtn_OnStrgTyp TEXT COMMENT 'Condition.OnStringType',
Cndtn_RecordedDt TEXT COMMENT 'Condition.RecordedDate',
Cndtn_Recorder TEXT COMMENT 'Condition.Recorder',
Cndtn_Severity_Cdg_Cd TEXT COMMENT 'Condition.Severity.Coding.Code',
Cndtn_Severity_Cdg_Dsply TEXT COMMENT 'Condition.Severity.Coding.Display',
Cndtn_Severity_Cdg_Sys TEXT COMMENT 'Condition.Severity.Coding.System',
Cndtn_Severity_Cdg_UsrSltd TEXT COMMENT 'Condition.Severity.Coding.UserSelected',
Cndtn_Severity_Cdg_Vrsn TEXT COMMENT 'Condition.Severity.Coding.Version',
Cndtn_Severity_Txt TEXT COMMENT 'Condition.Severity.Text',
Cndtn_Stage_Assmnt TEXT COMMENT 'Condition.Stage.Assessment',
Cndtn_Stage_Summary_Cdg_Cd TEXT COMMENT 'Condition.Stage.Summary.Coding.Code',
Cndtn_Stage_Summary_Cdg_Dsply TEXT COMMENT 'Condition.Stage.Summary.Coding.Display',
Cndtn_Stage_Summary_Cdg_Sys TEXT COMMENT 'Condition.Stage.Summary.Coding.System',
Cndtn_Stage_Summary_Cdg_UsrSltd TEXT COMMENT 'Condition.Stage.Summary.Coding.UserSelected',
Cndtn_Stage_Summary_Cdg_Vrsn TEXT COMMENT 'Condition.Stage.Summary.Coding.Version',
Cndtn_Stage_Summary_Txt TEXT COMMENT 'Condition.Stage.Summary.Text',
Cndtn_Stage_Typ_Cdg_Cd TEXT COMMENT 'Condition.Stage.Type.Coding.Code',
Cndtn_Stage_Typ_Cdg_Dsply TEXT COMMENT 'Condition.Stage.Type.Coding.Display',
Cndtn_Stage_Typ_Cdg_Sys TEXT COMMENT 'Condition.Stage.Type.Coding.System',
Cndtn_Stage_Typ_Cdg_UsrSltd TEXT COMMENT 'Condition.Stage.Type.Coding.UserSelected',
Cndtn_Stage_Typ_Cdg_Vrsn TEXT COMMENT 'Condition.Stage.Type.Coding.Version',
Cndtn_Stage_Typ_Txt TEXT COMMENT 'Condition.Stage.Type.Text',
Cndtn_Sbjct TEXT COMMENT 'Condition.Subject',
Cndtn_VrfctnSts_Cdg_Cd TEXT COMMENT 'Condition.VerificationStatus.Coding.Code',
Cndtn_VrfctnSts_Cdg_Dsply TEXT COMMENT 'Condition.VerificationStatus.Coding.Display',
Cndtn_VrfctnSts_Cdg_Sys TEXT COMMENT 'Condition.VerificationStatus.Coding.System',
Cndtn_VrfctnSts_Cdg_UsrSltd TEXT COMMENT 'Condition.VerificationStatus.Coding.UserSelected',
Cndtn_VrfctnSts_Cdg_Vrsn TEXT COMMENT 'Condition.VerificationStatus.Coding.Version',
Cndtn_VrfctnSts_Txt TEXT COMMENT 'Condition.VerificationStatus.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;