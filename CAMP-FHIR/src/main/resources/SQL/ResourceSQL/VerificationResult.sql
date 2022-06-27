drop table if exists `VerificationResult`;
CREATE TABLE `VerificationResult` (
 id varchar(64),
VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Cd TEXT,
VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Dsply TEXT,
VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Sys TEXT,
VrfctnRslt_Attestation_CmmnctnMthd_Cdg_UsrSltd TEXT,
VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Vrsn TEXT,
VrfctnRslt_Attestation_CmmnctnMthd_Txt TEXT,
VrfctnRslt_Attestation_Dt TEXT,
VrfctnRslt_Attestation_OnBehalfOf TEXT,
VrfctnRslt_Attestation_ProxyIdentityCertificate TEXT,
VrfctnRslt_Attestation_ProxySignature_Data TEXT,
VrfctnRslt_Attestation_ProxySignature_OnBehalfOf TEXT,
VrfctnRslt_Attestation_ProxySignature_SigFrmat TEXT,
VrfctnRslt_Attestation_ProxySignature_TarFrmat TEXT,
VrfctnRslt_Attestation_ProxySignature_Typ_Cd TEXT,
VrfctnRslt_Attestation_ProxySignature_Typ_Dsply TEXT,
VrfctnRslt_Attestation_ProxySignature_Typ_Sys TEXT,
VrfctnRslt_Attestation_ProxySignature_Typ_UsrSltd TEXT,
VrfctnRslt_Attestation_ProxySignature_Typ_Vrsn TEXT,
VrfctnRslt_Attestation_ProxySignature_When TEXT,
VrfctnRslt_Attestation_ProxySignature_Who TEXT,
VrfctnRslt_Attestation_SrcIdentityCertificate TEXT,
VrfctnRslt_Attestation_SrcSignature_Data TEXT,
VrfctnRslt_Attestation_SrcSignature_OnBehalfOf TEXT,
VrfctnRslt_Attestation_SrcSignature_SigFrmat TEXT,
VrfctnRslt_Attestation_SrcSignature_TarFrmat TEXT,
VrfctnRslt_Attestation_SrcSignature_Typ_Cd TEXT,
VrfctnRslt_Attestation_SrcSignature_Typ_Dsply TEXT,
VrfctnRslt_Attestation_SrcSignature_Typ_Sys TEXT,
VrfctnRslt_Attestation_SrcSignature_Typ_UsrSltd TEXT,
VrfctnRslt_Attestation_SrcSignature_Typ_Vrsn TEXT,
VrfctnRslt_Attestation_SrcSignature_When TEXT,
VrfctnRslt_Attestation_SrcSignature_Who TEXT,
VrfctnRslt_Attestation_Who TEXT,
VrfctnRslt_FailureActn_Cdg_Cd TEXT,
VrfctnRslt_FailureActn_Cdg_Dsply TEXT,
VrfctnRslt_FailureActn_Cdg_Sys TEXT,
VrfctnRslt_FailureActn_Cdg_UsrSltd TEXT,
VrfctnRslt_FailureActn_Cdg_Vrsn TEXT,
VrfctnRslt_FailureActn_Txt TEXT,
VrfctnRslt_Frqncy_Cd_Cdg_Cd TEXT,
VrfctnRslt_Frqncy_Cd_Cdg_Dsply TEXT,
VrfctnRslt_Frqncy_Cd_Cdg_Sys TEXT,
VrfctnRslt_Frqncy_Cd_Cdg_UsrSltd TEXT,
VrfctnRslt_Frqncy_Cd_Cdg_Vrsn TEXT,
VrfctnRslt_Frqncy_Cd_Txt TEXT,
VrfctnRslt_Frqncy_Evnt TEXT,
VrfctnRslt_Frqncy_Rpt_BndsDuration_Cd TEXT,
VrfctnRslt_Frqncy_Rpt_BndsDuration_Cmprtr TEXT,
VrfctnRslt_Frqncy_Rpt_BndsDuration_Sys TEXT,
VrfctnRslt_Frqncy_Rpt_BndsDuration_Unt TEXT,
VrfctnRslt_Frqncy_Rpt_BndsDuration_Vl TEXT,
VrfctnRslt_Frqncy_Rpt_BndsPrd_End TEXT,
VrfctnRslt_Frqncy_Rpt_BndsPrd_Strt TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cd TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cmprtr TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Sys TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Unt TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Vl TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cd TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cmprtr TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Sys TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Unt TEXT,
VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Vl TEXT,
VrfctnRslt_Frqncy_Rpt_Cnt TEXT,
VrfctnRslt_Frqncy_Rpt_CntMx TEXT,
VrfctnRslt_Frqncy_Rpt_DayOfWeek TEXT,
VrfctnRslt_Frqncy_Rpt_Duration TEXT,
VrfctnRslt_Frqncy_Rpt_DurationMx TEXT,
VrfctnRslt_Frqncy_Rpt_DurationUnt TEXT,
VrfctnRslt_Frqncy_Rpt_Frqncy TEXT,
VrfctnRslt_Frqncy_Rpt_FrqncyMx TEXT,
VrfctnRslt_Frqncy_Rpt_Off TEXT,
VrfctnRslt_Frqncy_Rpt_Prd TEXT,
VrfctnRslt_Frqncy_Rpt_PrdMx TEXT,
VrfctnRslt_Frqncy_Rpt_PrdUnt TEXT,
VrfctnRslt_Frqncy_Rpt_TimeOfDay TEXT,
VrfctnRslt_Frqncy_Rpt_When TEXT,
VrfctnRslt_LastPerformed TEXT,
VrfctnRslt_Need_Cdg_Cd TEXT,
VrfctnRslt_Need_Cdg_Dsply TEXT,
VrfctnRslt_Need_Cdg_Sys TEXT,
VrfctnRslt_Need_Cdg_UsrSltd TEXT,
VrfctnRslt_Need_Cdg_Vrsn TEXT,
VrfctnRslt_Need_Txt TEXT,
VrfctnRslt_NextSchdld TEXT,
VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Cd TEXT,
VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Dsply TEXT,
VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Sys TEXT,
VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_UsrSltd TEXT,
VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Vrsn TEXT,
VrfctnRslt_PrimarySrc_CanPushUpdates_Txt TEXT,
VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Cd TEXT,
VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Dsply TEXT,
VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Sys TEXT,
VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_UsrSltd TEXT,
VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Vrsn TEXT,
VrfctnRslt_PrimarySrc_CmmnctnMthd_Txt TEXT,
VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Cd TEXT,
VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Dsply TEXT,
VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Sys TEXT,
VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_UsrSltd TEXT,
VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Vrsn TEXT,
VrfctnRslt_PrimarySrc_PushTypAvailable_Txt TEXT,
VrfctnRslt_PrimarySrc_Typ_Cdg_Cd TEXT,
VrfctnRslt_PrimarySrc_Typ_Cdg_Dsply TEXT,
VrfctnRslt_PrimarySrc_Typ_Cdg_Sys TEXT,
VrfctnRslt_PrimarySrc_Typ_Cdg_UsrSltd TEXT,
VrfctnRslt_PrimarySrc_Typ_Cdg_Vrsn TEXT,
VrfctnRslt_PrimarySrc_Typ_Txt TEXT,
VrfctnRslt_PrimarySrc_ValidationDt TEXT,
VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Cd TEXT,
VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Dsply TEXT,
VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Sys TEXT,
VrfctnRslt_PrimarySrc_ValidationSts_Cdg_UsrSltd TEXT,
VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Vrsn TEXT,
VrfctnRslt_PrimarySrc_ValidationSts_Txt TEXT,
VrfctnRslt_PrimarySrc_Who TEXT,
VrfctnRslt_Sts TEXT,
VrfctnRslt_StsDt TEXT,
VrfctnRslt_Tar TEXT,
VrfctnRslt_TarLctn TEXT,
VrfctnRslt_ValidationProcess_Cdg_Cd TEXT,
VrfctnRslt_ValidationProcess_Cdg_Dsply TEXT,
VrfctnRslt_ValidationProcess_Cdg_Sys TEXT,
VrfctnRslt_ValidationProcess_Cdg_UsrSltd TEXT,
VrfctnRslt_ValidationProcess_Cdg_Vrsn TEXT,
VrfctnRslt_ValidationProcess_Txt TEXT,
VrfctnRslt_ValidationTyp_Cdg_Cd TEXT,
VrfctnRslt_ValidationTyp_Cdg_Dsply TEXT,
VrfctnRslt_ValidationTyp_Cdg_Sys TEXT,
VrfctnRslt_ValidationTyp_Cdg_UsrSltd TEXT,
VrfctnRslt_ValidationTyp_Cdg_Vrsn TEXT,
VrfctnRslt_ValidationTyp_Txt TEXT,
VrfctnRslt_Validator_AttestationSignature_Data TEXT,
VrfctnRslt_Validator_AttestationSignature_OnBehalfOf TEXT,
VrfctnRslt_Validator_AttestationSignature_SigFrmat TEXT,
VrfctnRslt_Validator_AttestationSignature_TarFrmat TEXT,
VrfctnRslt_Validator_AttestationSignature_Typ_Cd TEXT,
VrfctnRslt_Validator_AttestationSignature_Typ_Dsply TEXT,
VrfctnRslt_Validator_AttestationSignature_Typ_Sys TEXT,
VrfctnRslt_Validator_AttestationSignature_Typ_UsrSltd TEXT,
VrfctnRslt_Validator_AttestationSignature_Typ_Vrsn TEXT,
VrfctnRslt_Validator_AttestationSignature_When TEXT,
VrfctnRslt_Validator_AttestationSignature_Who TEXT,
VrfctnRslt_Validator_IdentityCertificate TEXT,
VrfctnRslt_Validator_Orgnztn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;