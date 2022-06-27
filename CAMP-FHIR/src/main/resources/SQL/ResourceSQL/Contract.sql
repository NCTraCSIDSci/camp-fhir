drop table if exists `Contract`;
CREATE TABLE `Contract` (
 id varchar(64),
Cnct_Alias TEXT,
Cnct_Applies_End TEXT,
Cnct_Applies_Strt TEXT,
Cnct_Athr TEXT,
Cnct_Athrity TEXT,
Cnct_CntntDfn_Copyright TEXT,
Cnct_CntntDfn_PublicationDt TEXT,
Cnct_CntntDfn_PublicationSts TEXT,
Cnct_CntntDfn_Pblshr TEXT,
Cnct_CntntDfn_SubTyp_Cdg_Cd TEXT,
Cnct_CntntDfn_SubTyp_Cdg_Dsply TEXT,
Cnct_CntntDfn_SubTyp_Cdg_Sys TEXT,
Cnct_CntntDfn_SubTyp_Cdg_UsrSltd TEXT,
Cnct_CntntDfn_SubTyp_Cdg_Vrsn TEXT,
Cnct_CntntDfn_SubTyp_Txt TEXT,
Cnct_CntntDfn_Typ_Cdg_Cd TEXT,
Cnct_CntntDfn_Typ_Cdg_Dsply TEXT,
Cnct_CntntDfn_Typ_Cdg_Sys TEXT,
Cnct_CntntDfn_Typ_Cdg_UsrSltd TEXT,
Cnct_CntntDfn_Typ_Cdg_Vrsn TEXT,
Cnct_CntntDfn_Typ_Txt TEXT,
Cnct_CntntDerivative_Cdg_Cd TEXT,
Cnct_CntntDerivative_Cdg_Dsply TEXT,
Cnct_CntntDerivative_Cdg_Sys TEXT,
Cnct_CntntDerivative_Cdg_UsrSltd TEXT,
Cnct_CntntDerivative_Cdg_Vrsn TEXT,
Cnct_CntntDerivative_Txt TEXT,
Cnct_Domain TEXT,
Cnct_ExpirationTyp_Cdg_Cd TEXT,
Cnct_ExpirationTyp_Cdg_Dsply TEXT,
Cnct_ExpirationTyp_Cdg_Sys TEXT,
Cnct_ExpirationTyp_Cdg_UsrSltd TEXT,
Cnct_ExpirationTyp_Cdg_Vrsn TEXT,
Cnct_ExpirationTyp_Txt TEXT,
Cnct_Friendly_CntntAttchmnt_CntntTyp TEXT,
Cnct_Friendly_CntntAttchmnt_Creation TEXT,
Cnct_Friendly_CntntAttchmnt_Data TEXT,
Cnct_Friendly_CntntAttchmnt_Hash TEXT,
Cnct_Friendly_CntntAttchmnt_Lnguage TEXT,
Cnct_Friendly_CntntAttchmnt_Sz TEXT,
Cnct_Friendly_CntntAttchmnt_Ttl TEXT,
Cnct_Friendly_CntntAttchmnt_Url TEXT,
Cnct_Friendly_CntntRfrnc TEXT,
Cnct_Id_Assigner TEXT,
Cnct_Id_Prd_End TEXT,
Cnct_Id_Prd_Strt TEXT,
Cnct_Id_Sys TEXT,
Cnct_Id_Typ_Cdg_Cd TEXT,
Cnct_Id_Typ_Cdg_Dsply TEXT,
Cnct_Id_Typ_Cdg_Sys TEXT,
Cnct_Id_Typ_Cdg_UsrSltd TEXT,
Cnct_Id_Typ_Cdg_Vrsn TEXT,
Cnct_Id_Typ_Txt TEXT,
Cnct_Id_Use TEXT,
Cnct_Id_Vl TEXT,
Cnct_InstantiatesCanonical TEXT,
Cnct_InstantiatesUri TEXT,
Cnct_Issued TEXT,
Cnct_Legal_CntntAttchmnt_CntntTyp TEXT,
Cnct_Legal_CntntAttchmnt_Creation TEXT,
Cnct_Legal_CntntAttchmnt_Data TEXT,
Cnct_Legal_CntntAttchmnt_Hash TEXT,
Cnct_Legal_CntntAttchmnt_Lnguage TEXT,
Cnct_Legal_CntntAttchmnt_Sz TEXT,
Cnct_Legal_CntntAttchmnt_Ttl TEXT,
Cnct_Legal_CntntAttchmnt_Url TEXT,
Cnct_Legal_CntntRfrnc TEXT,
Cnct_LegalState_Cdg_Cd TEXT,
Cnct_LegalState_Cdg_Dsply TEXT,
Cnct_LegalState_Cdg_Sys TEXT,
Cnct_LegalState_Cdg_UsrSltd TEXT,
Cnct_LegalState_Cdg_Vrsn TEXT,
Cnct_LegalState_Txt TEXT,
Cnct_LegallyBindingAttchmnt_CntntTyp TEXT,
Cnct_LegallyBindingAttchmnt_Creation TEXT,
Cnct_LegallyBindingAttchmnt_Data TEXT,
Cnct_LegallyBindingAttchmnt_Hash TEXT,
Cnct_LegallyBindingAttchmnt_Lnguage TEXT,
Cnct_LegallyBindingAttchmnt_Sz TEXT,
Cnct_LegallyBindingAttchmnt_Ttl TEXT,
Cnct_LegallyBindingAttchmnt_Url TEXT,
Cnct_LegallyBindingRfrnc TEXT,
Cnct_Nm TEXT,
Cnct_RelevantHis TEXT,
Cnct_Rule_CntntAttchmnt_CntntTyp TEXT,
Cnct_Rule_CntntAttchmnt_Creation TEXT,
Cnct_Rule_CntntAttchmnt_Data TEXT,
Cnct_Rule_CntntAttchmnt_Hash TEXT,
Cnct_Rule_CntntAttchmnt_Lnguage TEXT,
Cnct_Rule_CntntAttchmnt_Sz TEXT,
Cnct_Rule_CntntAttchmnt_Ttl TEXT,
Cnct_Rule_CntntAttchmnt_Url TEXT,
Cnct_Rule_CntntRfrnc TEXT,
Cnct_Scope_Cdg_Cd TEXT,
Cnct_Scope_Cdg_Dsply TEXT,
Cnct_Scope_Cdg_Sys TEXT,
Cnct_Scope_Cdg_UsrSltd TEXT,
Cnct_Scope_Cdg_Vrsn TEXT,
Cnct_Scope_Txt TEXT,
Cnct_Signer_Party TEXT,
Cnct_Signer_Signature_Data TEXT,
Cnct_Signer_Signature_OnBehalfOf TEXT,
Cnct_Signer_Signature_SigFrmat TEXT,
Cnct_Signer_Signature_TarFrmat TEXT,
Cnct_Signer_Signature_Typ_Cd TEXT,
Cnct_Signer_Signature_Typ_Dsply TEXT,
Cnct_Signer_Signature_Typ_Sys TEXT,
Cnct_Signer_Signature_Typ_UsrSltd TEXT,
Cnct_Signer_Signature_Typ_Vrsn TEXT,
Cnct_Signer_Signature_When TEXT,
Cnct_Signer_Signature_Who TEXT,
Cnct_Signer_Typ_Cd TEXT,
Cnct_Signer_Typ_Dsply TEXT,
Cnct_Signer_Typ_Sys TEXT,
Cnct_Signer_Typ_UsrSltd TEXT,
Cnct_Signer_Typ_Vrsn TEXT,
Cnct_Site TEXT,
Cnct_Sts TEXT,
Cnct_SubTyp_Cdg_Cd TEXT,
Cnct_SubTyp_Cdg_Dsply TEXT,
Cnct_SubTyp_Cdg_Sys TEXT,
Cnct_SubTyp_Cdg_UsrSltd TEXT,
Cnct_SubTyp_Cdg_Vrsn TEXT,
Cnct_SubTyp_Txt TEXT,
Cnct_Sbjct TEXT,
Cnct_Subtitle TEXT,
Cnct_SprtingInfo TEXT,
Cnct_Trm_Actn_Cntxt TEXT,
Cnct_Trm_Actn_CntxtLinkId TEXT,
Cnct_Trm_Actn_DoNotPerform TEXT,
Cnct_Trm_Actn_Intent_Cdg_Cd TEXT,
Cnct_Trm_Actn_Intent_Cdg_Dsply TEXT,
Cnct_Trm_Actn_Intent_Cdg_Sys TEXT,
Cnct_Trm_Actn_Intent_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_Intent_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_Intent_Txt TEXT,
Cnct_Trm_Actn_LinkId TEXT,
Cnct_Trm_Actn_Nt_AthrRfrnc TEXT,
Cnct_Trm_Actn_Nt_AthrStrgTyp TEXT,
Cnct_Trm_Actn_Nt_Txt TEXT,
Cnct_Trm_Actn_Nt_Time TEXT,
Cnct_Trm_Actn_OccrnceDtTimeTyp TEXT,
Cnct_Trm_Actn_OccrncePrd_End TEXT,
Cnct_Trm_Actn_OccrncePrd_Strt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Cd TEXT,
Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Dsply TEXT,
Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Sys TEXT,
Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_OccrnceTmg_Cd_Txt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Evnt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Cd TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Cmprtr TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Sys TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Unt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Vl TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_End TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cd TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Sys TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Unt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Vl TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cd TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Sys TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Unt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Vl TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_Cnt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_CntMx TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_DayOfWeek TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_Duration TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationMx TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationUnt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_Frqncy TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_FrqncyMx TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_Off TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_Prd TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdMx TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdUnt TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_TimeOfDay TEXT,
Cnct_Trm_Actn_OccrnceTmg_Rpt_When TEXT,
Cnct_Trm_Actn_Prfrmr TEXT,
Cnct_Trm_Actn_PrfrmrLinkId TEXT,
Cnct_Trm_Actn_PrfrmrRole_Cdg_Cd TEXT,
Cnct_Trm_Actn_PrfrmrRole_Cdg_Dsply TEXT,
Cnct_Trm_Actn_PrfrmrRole_Cdg_Sys TEXT,
Cnct_Trm_Actn_PrfrmrRole_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_PrfrmrRole_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_PrfrmrRole_Txt TEXT,
Cnct_Trm_Actn_PrfrmrTyp_Cdg_Cd TEXT,
Cnct_Trm_Actn_PrfrmrTyp_Cdg_Dsply TEXT,
Cnct_Trm_Actn_PrfrmrTyp_Cdg_Sys TEXT,
Cnct_Trm_Actn_PrfrmrTyp_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_PrfrmrTyp_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_PrfrmrTyp_Txt TEXT,
Cnct_Trm_Actn_Rsn TEXT,
Cnct_Trm_Actn_RsnCd_Cdg_Cd TEXT,
Cnct_Trm_Actn_RsnCd_Cdg_Dsply TEXT,
Cnct_Trm_Actn_RsnCd_Cdg_Sys TEXT,
Cnct_Trm_Actn_RsnCd_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_RsnCd_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_RsnCd_Txt TEXT,
Cnct_Trm_Actn_RsnLinkId TEXT,
Cnct_Trm_Actn_RsnRfrnc TEXT,
Cnct_Trm_Actn_Rqster TEXT,
Cnct_Trm_Actn_RqsterLinkId TEXT,
Cnct_Trm_Actn_SecurityLblNmbr TEXT,
Cnct_Trm_Actn_Sts_Cdg_Cd TEXT,
Cnct_Trm_Actn_Sts_Cdg_Dsply TEXT,
Cnct_Trm_Actn_Sts_Cdg_Sys TEXT,
Cnct_Trm_Actn_Sts_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_Sts_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_Sts_Txt TEXT,
Cnct_Trm_Actn_Sbjct_Rfrnc TEXT,
Cnct_Trm_Actn_Sbjct_Role_Cdg_Cd TEXT,
Cnct_Trm_Actn_Sbjct_Role_Cdg_Dsply TEXT,
Cnct_Trm_Actn_Sbjct_Role_Cdg_Sys TEXT,
Cnct_Trm_Actn_Sbjct_Role_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_Sbjct_Role_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_Sbjct_Role_Txt TEXT,
Cnct_Trm_Actn_Typ_Cdg_Cd TEXT,
Cnct_Trm_Actn_Typ_Cdg_Dsply TEXT,
Cnct_Trm_Actn_Typ_Cdg_Sys TEXT,
Cnct_Trm_Actn_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_Actn_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_Actn_Typ_Txt TEXT,
Cnct_Trm_Applies_End TEXT,
Cnct_Trm_Applies_Strt TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_CntntTyp TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Creation TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Data TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Hash TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Lnguage TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Sz TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Ttl TEXT,
Cnct_Trm_As_Ans_VlAttchmnt_Url TEXT,
Cnct_Trm_As_Ans_VlBooleanTyp TEXT,
Cnct_Trm_As_Ans_VlCdg_Cd TEXT,
Cnct_Trm_As_Ans_VlCdg_Dsply TEXT,
Cnct_Trm_As_Ans_VlCdg_Sys TEXT,
Cnct_Trm_As_Ans_VlCdg_UsrSltd TEXT,
Cnct_Trm_As_Ans_VlCdg_Vrsn TEXT,
Cnct_Trm_As_Ans_VlDtTimeTyp TEXT,
Cnct_Trm_As_Ans_VlDtTyp TEXT,
Cnct_Trm_As_Ans_VlDecimalTyp TEXT,
Cnct_Trm_As_Ans_VlIntegerTyp TEXT,
Cnct_Trm_As_Ans_VlQnty_Cd TEXT,
Cnct_Trm_As_Ans_VlQnty_Cmprtr TEXT,
Cnct_Trm_As_Ans_VlQnty_Sys TEXT,
Cnct_Trm_As_Ans_VlQnty_Unt TEXT,
Cnct_Trm_As_Ans_VlQnty_Vl TEXT,
Cnct_Trm_As_Ans_VlRfrnc TEXT,
Cnct_Trm_As_Ans_VlStrgTyp TEXT,
Cnct_Trm_As_Ans_VlTimeTyp TEXT,
Cnct_Trm_As_Ans_VlUriTyp TEXT,
Cnct_Trm_As_Cndtn TEXT,
Cnct_Trm_As_Cntxt_Cd_Cdg_Cd TEXT,
Cnct_Trm_As_Cntxt_Cd_Cdg_Dsply TEXT,
Cnct_Trm_As_Cntxt_Cd_Cdg_Sys TEXT,
Cnct_Trm_As_Cntxt_Cd_Cdg_UsrSltd TEXT,
Cnct_Trm_As_Cntxt_Cd_Cdg_Vrsn TEXT,
Cnct_Trm_As_Cntxt_Cd_Txt TEXT,
Cnct_Trm_As_Cntxt_Rfrnc TEXT,
Cnct_Trm_As_Cntxt_Txt TEXT,
Cnct_Trm_As_LinkId TEXT,
Cnct_Trm_As_Prd_End TEXT,
Cnct_Trm_As_Prd_Strt TEXT,
Cnct_Trm_As_PrdTyp_Cdg_Cd TEXT,
Cnct_Trm_As_PrdTyp_Cdg_Dsply TEXT,
Cnct_Trm_As_PrdTyp_Cdg_Sys TEXT,
Cnct_Trm_As_PrdTyp_Cdg_UsrSltd TEXT,
Cnct_Trm_As_PrdTyp_Cdg_Vrsn TEXT,
Cnct_Trm_As_PrdTyp_Txt TEXT,
Cnct_Trm_As_Rltnship_Cd TEXT,
Cnct_Trm_As_Rltnship_Dsply TEXT,
Cnct_Trm_As_Rltnship_Sys TEXT,
Cnct_Trm_As_Rltnship_UsrSltd TEXT,
Cnct_Trm_As_Rltnship_Vrsn TEXT,
Cnct_Trm_As_Scope_Cdg_Cd TEXT,
Cnct_Trm_As_Scope_Cdg_Dsply TEXT,
Cnct_Trm_As_Scope_Cdg_Sys TEXT,
Cnct_Trm_As_Scope_Cdg_UsrSltd TEXT,
Cnct_Trm_As_Scope_Cdg_Vrsn TEXT,
Cnct_Trm_As_Scope_Txt TEXT,
Cnct_Trm_As_SecurityLblNmbr TEXT,
Cnct_Trm_As_Subtype_Cdg_Cd TEXT,
Cnct_Trm_As_Subtype_Cdg_Dsply TEXT,
Cnct_Trm_As_Subtype_Cdg_Sys TEXT,
Cnct_Trm_As_Subtype_Cdg_UsrSltd TEXT,
Cnct_Trm_As_Subtype_Cdg_Vrsn TEXT,
Cnct_Trm_As_Subtype_Txt TEXT,
Cnct_Trm_As_Txt TEXT,
Cnct_Trm_As_Typ_Cdg_Cd TEXT,
Cnct_Trm_As_Typ_Cdg_Dsply TEXT,
Cnct_Trm_As_Typ_Cdg_Sys TEXT,
Cnct_Trm_As_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_As_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_As_Typ_Txt TEXT,
Cnct_Trm_As_TypRfrnc TEXT,
Cnct_Trm_As_UsePrd_End TEXT,
Cnct_Trm_As_UsePrd_Strt TEXT,
Cnct_Trm_As_VldItm_EfctiveTime TEXT,
Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Cd TEXT,
Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Dsply TEXT,
Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Sys TEXT,
Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_UsrSltd TEXT,
Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Vrsn TEXT,
Cnct_Trm_As_VldItm_EntityCdbleCncpt_Txt TEXT,
Cnct_Trm_As_VldItm_EntityRfrnc TEXT,
Cnct_Trm_As_VldItm_Factor TEXT,
Cnct_Trm_As_VldItm_Id_Assigner TEXT,
Cnct_Trm_As_VldItm_Id_Prd_End TEXT,
Cnct_Trm_As_VldItm_Id_Prd_Strt TEXT,
Cnct_Trm_As_VldItm_Id_Sys TEXT,
Cnct_Trm_As_VldItm_Id_Typ_Cdg_Cd TEXT,
Cnct_Trm_As_VldItm_Id_Typ_Cdg_Dsply TEXT,
Cnct_Trm_As_VldItm_Id_Typ_Cdg_Sys TEXT,
Cnct_Trm_As_VldItm_Id_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_As_VldItm_Id_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_As_VldItm_Id_Typ_Txt TEXT,
Cnct_Trm_As_VldItm_Id_Use TEXT,
Cnct_Trm_As_VldItm_Id_Vl TEXT,
Cnct_Trm_As_VldItm_LinkId TEXT,
Cnct_Trm_As_VldItm_Net_Crncy TEXT,
Cnct_Trm_As_VldItm_Net_Vl TEXT,
Cnct_Trm_As_VldItm_Pymnt TEXT,
Cnct_Trm_As_VldItm_PymntDt TEXT,
Cnct_Trm_As_VldItm_Points TEXT,
Cnct_Trm_As_VldItm_Qnty_Cd TEXT,
Cnct_Trm_As_VldItm_Qnty_Cmprtr TEXT,
Cnct_Trm_As_VldItm_Qnty_Sys TEXT,
Cnct_Trm_As_VldItm_Qnty_Unt TEXT,
Cnct_Trm_As_VldItm_Qnty_Vl TEXT,
Cnct_Trm_As_VldItm_Recipient TEXT,
Cnct_Trm_As_VldItm_Responsible TEXT,
Cnct_Trm_As_VldItm_SecurityLblNmbr TEXT,
Cnct_Trm_As_VldItm_UntPrice_Crncy TEXT,
Cnct_Trm_As_VldItm_UntPrice_Vl TEXT,
Cnct_Trm_Id_Assigner TEXT,
Cnct_Trm_Id_Prd_End TEXT,
Cnct_Trm_Id_Prd_Strt TEXT,
Cnct_Trm_Id_Sys TEXT,
Cnct_Trm_Id_Typ_Cdg_Cd TEXT,
Cnct_Trm_Id_Typ_Cdg_Dsply TEXT,
Cnct_Trm_Id_Typ_Cdg_Sys TEXT,
Cnct_Trm_Id_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_Id_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_Id_Typ_Txt TEXT,
Cnct_Trm_Id_Use TEXT,
Cnct_Trm_Id_Vl TEXT,
Cnct_Trm_Issued TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_CntntTyp TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Creation TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Data TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Hash TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Lnguage TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Sz TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Ttl TEXT,
Cnct_Trm_Offr_Ans_VlAttchmnt_Url TEXT,
Cnct_Trm_Offr_Ans_VlBooleanTyp TEXT,
Cnct_Trm_Offr_Ans_VlCdg_Cd TEXT,
Cnct_Trm_Offr_Ans_VlCdg_Dsply TEXT,
Cnct_Trm_Offr_Ans_VlCdg_Sys TEXT,
Cnct_Trm_Offr_Ans_VlCdg_UsrSltd TEXT,
Cnct_Trm_Offr_Ans_VlCdg_Vrsn TEXT,
Cnct_Trm_Offr_Ans_VlDtTimeTyp TEXT,
Cnct_Trm_Offr_Ans_VlDtTyp TEXT,
Cnct_Trm_Offr_Ans_VlDecimalTyp TEXT,
Cnct_Trm_Offr_Ans_VlIntegerTyp TEXT,
Cnct_Trm_Offr_Ans_VlQnty_Cd TEXT,
Cnct_Trm_Offr_Ans_VlQnty_Cmprtr TEXT,
Cnct_Trm_Offr_Ans_VlQnty_Sys TEXT,
Cnct_Trm_Offr_Ans_VlQnty_Unt TEXT,
Cnct_Trm_Offr_Ans_VlQnty_Vl TEXT,
Cnct_Trm_Offr_Ans_VlRfrnc TEXT,
Cnct_Trm_Offr_Ans_VlStrgTyp TEXT,
Cnct_Trm_Offr_Ans_VlTimeTyp TEXT,
Cnct_Trm_Offr_Ans_VlUriTyp TEXT,
Cnct_Trm_Offr_Decision_Cdg_Cd TEXT,
Cnct_Trm_Offr_Decision_Cdg_Dsply TEXT,
Cnct_Trm_Offr_Decision_Cdg_Sys TEXT,
Cnct_Trm_Offr_Decision_Cdg_UsrSltd TEXT,
Cnct_Trm_Offr_Decision_Cdg_Vrsn TEXT,
Cnct_Trm_Offr_Decision_Txt TEXT,
Cnct_Trm_Offr_DecisionMode_Cdg_Cd TEXT,
Cnct_Trm_Offr_DecisionMode_Cdg_Dsply TEXT,
Cnct_Trm_Offr_DecisionMode_Cdg_Sys TEXT,
Cnct_Trm_Offr_DecisionMode_Cdg_UsrSltd TEXT,
Cnct_Trm_Offr_DecisionMode_Cdg_Vrsn TEXT,
Cnct_Trm_Offr_DecisionMode_Txt TEXT,
Cnct_Trm_Offr_Id_Assigner TEXT,
Cnct_Trm_Offr_Id_Prd_End TEXT,
Cnct_Trm_Offr_Id_Prd_Strt TEXT,
Cnct_Trm_Offr_Id_Sys TEXT,
Cnct_Trm_Offr_Id_Typ_Cdg_Cd TEXT,
Cnct_Trm_Offr_Id_Typ_Cdg_Dsply TEXT,
Cnct_Trm_Offr_Id_Typ_Cdg_Sys TEXT,
Cnct_Trm_Offr_Id_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_Offr_Id_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_Offr_Id_Typ_Txt TEXT,
Cnct_Trm_Offr_Id_Use TEXT,
Cnct_Trm_Offr_Id_Vl TEXT,
Cnct_Trm_Offr_LinkId TEXT,
Cnct_Trm_Offr_Party_Rfrnc TEXT,
Cnct_Trm_Offr_Party_Role_Cdg_Cd TEXT,
Cnct_Trm_Offr_Party_Role_Cdg_Dsply TEXT,
Cnct_Trm_Offr_Party_Role_Cdg_Sys TEXT,
Cnct_Trm_Offr_Party_Role_Cdg_UsrSltd TEXT,
Cnct_Trm_Offr_Party_Role_Cdg_Vrsn TEXT,
Cnct_Trm_Offr_Party_Role_Txt TEXT,
Cnct_Trm_Offr_SecurityLblNmbr TEXT,
Cnct_Trm_Offr_Txt TEXT,
Cnct_Trm_Offr_Topic TEXT,
Cnct_Trm_Offr_Typ_Cdg_Cd TEXT,
Cnct_Trm_Offr_Typ_Cdg_Dsply TEXT,
Cnct_Trm_Offr_Typ_Cdg_Sys TEXT,
Cnct_Trm_Offr_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_Offr_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_Offr_Typ_Txt TEXT,
Cnct_Trm_SecurityLbl_Ctgry_Cd TEXT,
Cnct_Trm_SecurityLbl_Ctgry_Dsply TEXT,
Cnct_Trm_SecurityLbl_Ctgry_Sys TEXT,
Cnct_Trm_SecurityLbl_Ctgry_UsrSltd TEXT,
Cnct_Trm_SecurityLbl_Ctgry_Vrsn TEXT,
Cnct_Trm_SecurityLbl_Clsfctn_Cd TEXT,
Cnct_Trm_SecurityLbl_Clsfctn_Dsply TEXT,
Cnct_Trm_SecurityLbl_Clsfctn_Sys TEXT,
Cnct_Trm_SecurityLbl_Clsfctn_UsrSltd TEXT,
Cnct_Trm_SecurityLbl_Clsfctn_Vrsn TEXT,
Cnct_Trm_SecurityLbl_Control_Cd TEXT,
Cnct_Trm_SecurityLbl_Control_Dsply TEXT,
Cnct_Trm_SecurityLbl_Control_Sys TEXT,
Cnct_Trm_SecurityLbl_Control_UsrSltd TEXT,
Cnct_Trm_SecurityLbl_Control_Vrsn TEXT,
Cnct_Trm_SecurityLbl_Nmbr TEXT,
Cnct_Trm_SubTyp_Cdg_Cd TEXT,
Cnct_Trm_SubTyp_Cdg_Dsply TEXT,
Cnct_Trm_SubTyp_Cdg_Sys TEXT,
Cnct_Trm_SubTyp_Cdg_UsrSltd TEXT,
Cnct_Trm_SubTyp_Cdg_Vrsn TEXT,
Cnct_Trm_SubTyp_Txt TEXT,
Cnct_Trm_Txt TEXT,
Cnct_Trm_TopicCdbleCncpt_Cdg_Cd TEXT,
Cnct_Trm_TopicCdbleCncpt_Cdg_Dsply TEXT,
Cnct_Trm_TopicCdbleCncpt_Cdg_Sys TEXT,
Cnct_Trm_TopicCdbleCncpt_Cdg_UsrSltd TEXT,
Cnct_Trm_TopicCdbleCncpt_Cdg_Vrsn TEXT,
Cnct_Trm_TopicCdbleCncpt_Txt TEXT,
Cnct_Trm_TopicRfrnc TEXT,
Cnct_Trm_Typ_Cdg_Cd TEXT,
Cnct_Trm_Typ_Cdg_Dsply TEXT,
Cnct_Trm_Typ_Cdg_Sys TEXT,
Cnct_Trm_Typ_Cdg_UsrSltd TEXT,
Cnct_Trm_Typ_Cdg_Vrsn TEXT,
Cnct_Trm_Typ_Txt TEXT,
Cnct_Ttl TEXT,
Cnct_TopicCdbleCncpt_Cdg_Cd TEXT,
Cnct_TopicCdbleCncpt_Cdg_Dsply TEXT,
Cnct_TopicCdbleCncpt_Cdg_Sys TEXT,
Cnct_TopicCdbleCncpt_Cdg_UsrSltd TEXT,
Cnct_TopicCdbleCncpt_Cdg_Vrsn TEXT,
Cnct_TopicCdbleCncpt_Txt TEXT,
Cnct_TopicRfrnc TEXT,
Cnct_Typ_Cdg_Cd TEXT,
Cnct_Typ_Cdg_Dsply TEXT,
Cnct_Typ_Cdg_Sys TEXT,
Cnct_Typ_Cdg_UsrSltd TEXT,
Cnct_Typ_Cdg_Vrsn TEXT,
Cnct_Typ_Txt TEXT,
Cnct_Url TEXT,
Cnct_Vrsn TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;