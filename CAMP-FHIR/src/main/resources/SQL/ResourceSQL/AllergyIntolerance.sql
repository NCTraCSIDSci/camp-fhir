drop table if exists `AllergyIntolerance`;
CREATE TABLE `AllergyIntolerance` (
 id varchar(64),
AlrgyIntolerance_Asserter TEXT COMMENT 'AllergyIntolerance.Asserter',
AlrgyIntolerance_ClnclSts_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.ClinicalStatus.Coding.Code',
AlrgyIntolerance_ClnclSts_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.ClinicalStatus.Coding.Display',
AlrgyIntolerance_ClnclSts_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.ClinicalStatus.Coding.System',
AlrgyIntolerance_ClnclSts_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.ClinicalStatus.Coding.UserSelected',
AlrgyIntolerance_ClnclSts_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.ClinicalStatus.Coding.Version',
AlrgyIntolerance_ClnclSts_Txt TEXT COMMENT 'AllergyIntolerance.ClinicalStatus.Text',
AlrgyIntolerance_Cd_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.Code.Coding.Code',
AlrgyIntolerance_Cd_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.Code.Coding.Display',
AlrgyIntolerance_Cd_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.Code.Coding.System',
AlrgyIntolerance_Cd_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.Code.Coding.UserSelected',
AlrgyIntolerance_Cd_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.Code.Coding.Version',
AlrgyIntolerance_Cd_Txt TEXT COMMENT 'AllergyIntolerance.Code.Text',
AlrgyIntolerance_Criticality TEXT COMMENT 'AllergyIntolerance.Criticality',
AlrgyIntolerance_Enc TEXT COMMENT 'AllergyIntolerance.Encounter',
AlrgyIntolerance_Id_Assigner TEXT COMMENT 'AllergyIntolerance.Identifier.Assigner',
AlrgyIntolerance_Id_Prd_End TEXT COMMENT 'AllergyIntolerance.Identifier.Period.End',
AlrgyIntolerance_Id_Prd_Strt TEXT COMMENT 'AllergyIntolerance.Identifier.Period.Start',
AlrgyIntolerance_Id_Sys TEXT COMMENT 'AllergyIntolerance.Identifier.System',
AlrgyIntolerance_Id_Typ_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.Identifier.Type.Coding.Code',
AlrgyIntolerance_Id_Typ_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.Identifier.Type.Coding.Display',
AlrgyIntolerance_Id_Typ_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.Identifier.Type.Coding.System',
AlrgyIntolerance_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.Identifier.Type.Coding.UserSelected',
AlrgyIntolerance_Id_Typ_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.Identifier.Type.Coding.Version',
AlrgyIntolerance_Id_Typ_Txt TEXT COMMENT 'AllergyIntolerance.Identifier.Type.Text',
AlrgyIntolerance_Id_Use TEXT COMMENT 'AllergyIntolerance.Identifier.Use',
AlrgyIntolerance_Id_Vl TEXT COMMENT 'AllergyIntolerance.Identifier.Value',
AlrgyIntolerance_LastOccrnce TEXT COMMENT 'AllergyIntolerance.LastOccurrence',
AlrgyIntolerance_Nt_AthrRfrnc TEXT COMMENT 'AllergyIntolerance.Note.AuthorReference',
AlrgyIntolerance_Nt_AthrStrgTyp TEXT COMMENT 'AllergyIntolerance.Note.AuthorStringType',
AlrgyIntolerance_Nt_Txt TEXT COMMENT 'AllergyIntolerance.Note.Text',
AlrgyIntolerance_Nt_Time TEXT COMMENT 'AllergyIntolerance.Note.Time',
AlrgyIntolerance_OnAge_Cd TEXT COMMENT 'AllergyIntolerance.OnAge.Code',
AlrgyIntolerance_OnAge_Cmprtr TEXT COMMENT 'AllergyIntolerance.OnAge.Comparator',
AlrgyIntolerance_OnAge_Sys TEXT COMMENT 'AllergyIntolerance.OnAge.System',
AlrgyIntolerance_OnAge_Unt TEXT COMMENT 'AllergyIntolerance.OnAge.Unit',
AlrgyIntolerance_OnAge_Vl TEXT COMMENT 'AllergyIntolerance.OnAge.Value',
AlrgyIntolerance_OnDtTimeTyp TEXT COMMENT 'AllergyIntolerance.OnDateTimeType',
AlrgyIntolerance_OnPrd_End TEXT COMMENT 'AllergyIntolerance.OnPeriod.End',
AlrgyIntolerance_OnPrd_Strt TEXT COMMENT 'AllergyIntolerance.OnPeriod.Start',
AlrgyIntolerance_OnRng_Hi_Cd TEXT COMMENT 'AllergyIntolerance.OnRange.High.Code',
AlrgyIntolerance_OnRng_Hi_Cmprtr TEXT COMMENT 'AllergyIntolerance.OnRange.High.Comparator',
AlrgyIntolerance_OnRng_Hi_Sys TEXT COMMENT 'AllergyIntolerance.OnRange.High.System',
AlrgyIntolerance_OnRng_Hi_Unt TEXT COMMENT 'AllergyIntolerance.OnRange.High.Unit',
AlrgyIntolerance_OnRng_Hi_Vl TEXT COMMENT 'AllergyIntolerance.OnRange.High.Value',
AlrgyIntolerance_OnRng_Lw_Cd TEXT COMMENT 'AllergyIntolerance.OnRange.Low.Code',
AlrgyIntolerance_OnRng_Lw_Cmprtr TEXT COMMENT 'AllergyIntolerance.OnRange.Low.Comparator',
AlrgyIntolerance_OnRng_Lw_Sys TEXT COMMENT 'AllergyIntolerance.OnRange.Low.System',
AlrgyIntolerance_OnRng_Lw_Unt TEXT COMMENT 'AllergyIntolerance.OnRange.Low.Unit',
AlrgyIntolerance_OnRng_Lw_Vl TEXT COMMENT 'AllergyIntolerance.OnRange.Low.Value',
AlrgyIntolerance_OnStrgTyp TEXT COMMENT 'AllergyIntolerance.OnStringType',
AlrgyIntolerance_Pnt TEXT COMMENT 'AllergyIntolerance.Patient',
AlrgyIntolerance_Reaction_Dscrptn TEXT COMMENT 'AllergyIntolerance.Reaction.Description',
AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.Reaction.ExposureRoute.Coding.Code',
AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.Reaction.ExposureRoute.Coding.Display',
AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.Reaction.ExposureRoute.Coding.System',
AlrgyIntolerance_Reaction_ExposureRoute_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.Reaction.ExposureRoute.Coding.UserSelected',
AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.Reaction.ExposureRoute.Coding.Version',
AlrgyIntolerance_Reaction_ExposureRoute_Txt TEXT COMMENT 'AllergyIntolerance.Reaction.ExposureRoute.Text',
AlrgyIntolerance_Reaction_Manifestation_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.Reaction.Manifestation.Coding.Code',
AlrgyIntolerance_Reaction_Manifestation_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.Reaction.Manifestation.Coding.Display',
AlrgyIntolerance_Reaction_Manifestation_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.Reaction.Manifestation.Coding.System',
AlrgyIntolerance_Reaction_Manifestation_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.Reaction.Manifestation.Coding.UserSelected',
AlrgyIntolerance_Reaction_Manifestation_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.Reaction.Manifestation.Coding.Version',
AlrgyIntolerance_Reaction_Manifestation_Txt TEXT COMMENT 'AllergyIntolerance.Reaction.Manifestation.Text',
AlrgyIntolerance_Reaction_Nt_AthrRfrnc TEXT COMMENT 'AllergyIntolerance.Reaction.Note.AuthorReference',
AlrgyIntolerance_Reaction_Nt_AthrStrgTyp TEXT COMMENT 'AllergyIntolerance.Reaction.Note.AuthorStringType',
AlrgyIntolerance_Reaction_Nt_Txt TEXT COMMENT 'AllergyIntolerance.Reaction.Note.Text',
AlrgyIntolerance_Reaction_Nt_Time TEXT COMMENT 'AllergyIntolerance.Reaction.Note.Time',
AlrgyIntolerance_Reaction_Onset TEXT COMMENT 'AllergyIntolerance.Reaction.Onset',
AlrgyIntolerance_Reaction_Severity TEXT COMMENT 'AllergyIntolerance.Reaction.Severity',
AlrgyIntolerance_Reaction_Sbstnc_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.Reaction.Substance.Coding.Code',
AlrgyIntolerance_Reaction_Sbstnc_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.Reaction.Substance.Coding.Display',
AlrgyIntolerance_Reaction_Sbstnc_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.Reaction.Substance.Coding.System',
AlrgyIntolerance_Reaction_Sbstnc_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.Reaction.Substance.Coding.UserSelected',
AlrgyIntolerance_Reaction_Sbstnc_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.Reaction.Substance.Coding.Version',
AlrgyIntolerance_Reaction_Sbstnc_Txt TEXT COMMENT 'AllergyIntolerance.Reaction.Substance.Text',
AlrgyIntolerance_RecordedDt TEXT COMMENT 'AllergyIntolerance.RecordedDate',
AlrgyIntolerance_Recorder TEXT COMMENT 'AllergyIntolerance.Recorder',
AlrgyIntolerance_Typ TEXT COMMENT 'AllergyIntolerance.Type',
AlrgyIntolerance_VrfctnSts_Cdg_Cd TEXT COMMENT 'AllergyIntolerance.VerificationStatus.Coding.Code',
AlrgyIntolerance_VrfctnSts_Cdg_Dsply TEXT COMMENT 'AllergyIntolerance.VerificationStatus.Coding.Display',
AlrgyIntolerance_VrfctnSts_Cdg_Sys TEXT COMMENT 'AllergyIntolerance.VerificationStatus.Coding.System',
AlrgyIntolerance_VrfctnSts_Cdg_UsrSltd TEXT COMMENT 'AllergyIntolerance.VerificationStatus.Coding.UserSelected',
AlrgyIntolerance_VrfctnSts_Cdg_Vrsn TEXT COMMENT 'AllergyIntolerance.VerificationStatus.Coding.Version',
AlrgyIntolerance_VrfctnSts_Txt TEXT COMMENT 'AllergyIntolerance.VerificationStatus.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;