drop table if exists `MedicationAdministration`;
CREATE TABLE `MedicationAdministration` (
 id varchar(64),
MdctnAdmnstn_Ctgry_Cdg_Cd TEXT COMMENT 'MedicationAdministration.Category.Coding.Code',
MdctnAdmnstn_Ctgry_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.Category.Coding.Display',
MdctnAdmnstn_Ctgry_Cdg_Sys TEXT COMMENT 'MedicationAdministration.Category.Coding.System',
MdctnAdmnstn_Ctgry_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.Category.Coding.UserSelected',
MdctnAdmnstn_Ctgry_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.Category.Coding.Version',
MdctnAdmnstn_Ctgry_Txt TEXT COMMENT 'MedicationAdministration.Category.Text',
MdctnAdmnstn_Cntxt TEXT COMMENT 'MedicationAdministration.Context',
MdctnAdmnstn_Dvc TEXT COMMENT 'MedicationAdministration.Device',
MdctnAdmnstn_Dsg_Dose_Cd TEXT COMMENT 'MedicationAdministration.Dosage.Dose.Code',
MdctnAdmnstn_Dsg_Dose_Cmprtr TEXT COMMENT 'MedicationAdministration.Dosage.Dose.Comparator',
MdctnAdmnstn_Dsg_Dose_Sys TEXT COMMENT 'MedicationAdministration.Dosage.Dose.System',
MdctnAdmnstn_Dsg_Dose_Unt TEXT COMMENT 'MedicationAdministration.Dosage.Dose.Unit',
MdctnAdmnstn_Dsg_Dose_Vl TEXT COMMENT 'MedicationAdministration.Dosage.Dose.Value',
MdctnAdmnstn_Dsg_Mthd_Cdg_Cd TEXT COMMENT 'MedicationAdministration.Dosage.Method.Coding.Code',
MdctnAdmnstn_Dsg_Mthd_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.Dosage.Method.Coding.Display',
MdctnAdmnstn_Dsg_Mthd_Cdg_Sys TEXT COMMENT 'MedicationAdministration.Dosage.Method.Coding.System',
MdctnAdmnstn_Dsg_Mthd_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.Dosage.Method.Coding.UserSelected',
MdctnAdmnstn_Dsg_Mthd_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.Dosage.Method.Coding.Version',
MdctnAdmnstn_Dsg_Mthd_Txt TEXT COMMENT 'MedicationAdministration.Dosage.Method.Text',
MdctnAdmnstn_Dsg_RtQnty_Cd TEXT COMMENT 'MedicationAdministration.Dosage.RateQuantity.Code',
MdctnAdmnstn_Dsg_RtQnty_Cmprtr TEXT COMMENT 'MedicationAdministration.Dosage.RateQuantity.Comparator',
MdctnAdmnstn_Dsg_RtQnty_Sys TEXT COMMENT 'MedicationAdministration.Dosage.RateQuantity.System',
MdctnAdmnstn_Dsg_RtQnty_Unt TEXT COMMENT 'MedicationAdministration.Dosage.RateQuantity.Unit',
MdctnAdmnstn_Dsg_RtQnty_Vl TEXT COMMENT 'MedicationAdministration.Dosage.RateQuantity.Value',
MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cd TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Denominator.Code',
MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cmprtr TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Denominator.Comparator',
MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Sys TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Denominator.System',
MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Unt TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Denominator.Unit',
MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Vl TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Denominator.Value',
MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cd TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Numerator.Code',
MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cmprtr TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Numerator.Comparator',
MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Sys TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Numerator.System',
MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Unt TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Numerator.Unit',
MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Vl TEXT COMMENT 'MedicationAdministration.Dosage.RateRatio.Numerator.Value',
MdctnAdmnstn_Dsg_Route_Cdg_Cd TEXT COMMENT 'MedicationAdministration.Dosage.Route.Coding.Code',
MdctnAdmnstn_Dsg_Route_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.Dosage.Route.Coding.Display',
MdctnAdmnstn_Dsg_Route_Cdg_Sys TEXT COMMENT 'MedicationAdministration.Dosage.Route.Coding.System',
MdctnAdmnstn_Dsg_Route_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.Dosage.Route.Coding.UserSelected',
MdctnAdmnstn_Dsg_Route_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.Dosage.Route.Coding.Version',
MdctnAdmnstn_Dsg_Route_Txt TEXT COMMENT 'MedicationAdministration.Dosage.Route.Text',
MdctnAdmnstn_Dsg_Site_Cdg_Cd TEXT COMMENT 'MedicationAdministration.Dosage.Site.Coding.Code',
MdctnAdmnstn_Dsg_Site_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.Dosage.Site.Coding.Display',
MdctnAdmnstn_Dsg_Site_Cdg_Sys TEXT COMMENT 'MedicationAdministration.Dosage.Site.Coding.System',
MdctnAdmnstn_Dsg_Site_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.Dosage.Site.Coding.UserSelected',
MdctnAdmnstn_Dsg_Site_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.Dosage.Site.Coding.Version',
MdctnAdmnstn_Dsg_Site_Txt TEXT COMMENT 'MedicationAdministration.Dosage.Site.Text',
MdctnAdmnstn_Dsg_Txt TEXT COMMENT 'MedicationAdministration.Dosage.Text',
MdctnAdmnstn_EfctiveDtTimeTyp TEXT COMMENT 'MedicationAdministration.EffectiveDateTimeType',
MdctnAdmnstn_EfctivePrd_End TEXT COMMENT 'MedicationAdministration.EffectivePeriod.End',
MdctnAdmnstn_EfctivePrd_Strt TEXT COMMENT 'MedicationAdministration.EffectivePeriod.Start',
MdctnAdmnstn_EvntHis TEXT COMMENT 'MedicationAdministration.EventHistory',
MdctnAdmnstn_Id_Assigner TEXT COMMENT 'MedicationAdministration.Identifier.Assigner',
MdctnAdmnstn_Id_Prd_End TEXT COMMENT 'MedicationAdministration.Identifier.Period.End',
MdctnAdmnstn_Id_Prd_Strt TEXT COMMENT 'MedicationAdministration.Identifier.Period.Start',
MdctnAdmnstn_Id_Sys TEXT COMMENT 'MedicationAdministration.Identifier.System',
MdctnAdmnstn_Id_Typ_Cdg_Cd TEXT COMMENT 'MedicationAdministration.Identifier.Type.Coding.Code',
MdctnAdmnstn_Id_Typ_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.Identifier.Type.Coding.Display',
MdctnAdmnstn_Id_Typ_Cdg_Sys TEXT COMMENT 'MedicationAdministration.Identifier.Type.Coding.System',
MdctnAdmnstn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.Identifier.Type.Coding.UserSelected',
MdctnAdmnstn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.Identifier.Type.Coding.Version',
MdctnAdmnstn_Id_Typ_Txt TEXT COMMENT 'MedicationAdministration.Identifier.Type.Text',
MdctnAdmnstn_Id_Use TEXT COMMENT 'MedicationAdministration.Identifier.Use',
MdctnAdmnstn_Id_Vl TEXT COMMENT 'MedicationAdministration.Identifier.Value',
MdctnAdmnstn_Instantiates TEXT COMMENT 'MedicationAdministration.Instantiates',
MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicationAdministration.MedicationCodeableConcept.Coding.Code',
MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.MedicationCodeableConcept.Coding.Display',
MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicationAdministration.MedicationCodeableConcept.Coding.System',
MdctnAdmnstn_MdctnCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.MedicationCodeableConcept.Coding.UserSelected',
MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.MedicationCodeableConcept.Coding.Version',
MdctnAdmnstn_MdctnCdbleCncpt_Txt TEXT COMMENT 'MedicationAdministration.MedicationCodeableConcept.Text',
MdctnAdmnstn_MdctnRfrnc TEXT COMMENT 'MedicationAdministration.MedicationReference',
MdctnAdmnstn_Nt_AthrRfrnc TEXT COMMENT 'MedicationAdministration.Note.AuthorReference',
MdctnAdmnstn_Nt_AthrStrgTyp TEXT COMMENT 'MedicationAdministration.Note.AuthorStringType',
MdctnAdmnstn_Nt_Txt TEXT COMMENT 'MedicationAdministration.Note.Text',
MdctnAdmnstn_Nt_Time TEXT COMMENT 'MedicationAdministration.Note.Time',
MdctnAdmnstn_PartOf TEXT COMMENT 'MedicationAdministration.PartOf',
MdctnAdmnstn_Prfrmr_Actor TEXT COMMENT 'MedicationAdministration.Performer.Actor',
MdctnAdmnstn_Prfrmr_Function_Cdg_Cd TEXT COMMENT 'MedicationAdministration.Performer.Function.Coding.Code',
MdctnAdmnstn_Prfrmr_Function_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.Performer.Function.Coding.Display',
MdctnAdmnstn_Prfrmr_Function_Cdg_Sys TEXT COMMENT 'MedicationAdministration.Performer.Function.Coding.System',
MdctnAdmnstn_Prfrmr_Function_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.Performer.Function.Coding.UserSelected',
MdctnAdmnstn_Prfrmr_Function_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.Performer.Function.Coding.Version',
MdctnAdmnstn_Prfrmr_Function_Txt TEXT COMMENT 'MedicationAdministration.Performer.Function.Text',
MdctnAdmnstn_RsnCd_Cdg_Cd TEXT COMMENT 'MedicationAdministration.ReasonCode.Coding.Code',
MdctnAdmnstn_RsnCd_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.ReasonCode.Coding.Display',
MdctnAdmnstn_RsnCd_Cdg_Sys TEXT COMMENT 'MedicationAdministration.ReasonCode.Coding.System',
MdctnAdmnstn_RsnCd_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.ReasonCode.Coding.UserSelected',
MdctnAdmnstn_RsnCd_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.ReasonCode.Coding.Version',
MdctnAdmnstn_RsnCd_Txt TEXT COMMENT 'MedicationAdministration.ReasonCode.Text',
MdctnAdmnstn_RsnRfrnc TEXT COMMENT 'MedicationAdministration.ReasonReference',
MdctnAdmnstn_Rqst TEXT COMMENT 'MedicationAdministration.Request',
MdctnAdmnstn_Sts TEXT COMMENT 'MedicationAdministration.Status',
MdctnAdmnstn_StsRsn_Cdg_Cd TEXT COMMENT 'MedicationAdministration.StatusReason.Coding.Code',
MdctnAdmnstn_StsRsn_Cdg_Dsply TEXT COMMENT 'MedicationAdministration.StatusReason.Coding.Display',
MdctnAdmnstn_StsRsn_Cdg_Sys TEXT COMMENT 'MedicationAdministration.StatusReason.Coding.System',
MdctnAdmnstn_StsRsn_Cdg_UsrSltd TEXT COMMENT 'MedicationAdministration.StatusReason.Coding.UserSelected',
MdctnAdmnstn_StsRsn_Cdg_Vrsn TEXT COMMENT 'MedicationAdministration.StatusReason.Coding.Version',
MdctnAdmnstn_StsRsn_Txt TEXT COMMENT 'MedicationAdministration.StatusReason.Text',
MdctnAdmnstn_Sbjct TEXT COMMENT 'MedicationAdministration.Subject',
MdctnAdmnstn_SprtingInfo TEXT COMMENT 'MedicationAdministration.SupportingInformation',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;