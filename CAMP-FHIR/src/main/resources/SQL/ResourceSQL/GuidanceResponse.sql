drop table if exists `GuidanceResponse`;
CREATE TABLE `GuidanceResponse` (
 id varchar(64),
GuidnceRsps_DataRqrment_CdFltr_Cd_Cd TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.Code.Code',
GuidnceRsps_DataRqrment_CdFltr_Cd_Dsply TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.Code.Display',
GuidnceRsps_DataRqrment_CdFltr_Cd_Sys TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.Code.System',
GuidnceRsps_DataRqrment_CdFltr_Cd_UsrSltd TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.Code.UserSelected',
GuidnceRsps_DataRqrment_CdFltr_Cd_Vrsn TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.Code.Version',
GuidnceRsps_DataRqrment_CdFltr_Path TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.Path',
GuidnceRsps_DataRqrment_CdFltr_SrchParam TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.SearchParam',
GuidnceRsps_DataRqrment_CdFltr_VlSt TEXT COMMENT 'GuidanceResponse.DataRequirement.CodeFilter.ValueSet',
GuidnceRsps_DataRqrment_DtFltr_Path TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.Path',
GuidnceRsps_DataRqrment_DtFltr_SrchParam TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.SearchParam',
GuidnceRsps_DataRqrment_DtFltr_VlDtTimeTyp TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValueDateTimeType',
GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cd TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValueDuration.Code',
GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cmprtr TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValueDuration.Comparator',
GuidnceRsps_DataRqrment_DtFltr_VlDuration_Sys TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValueDuration.System',
GuidnceRsps_DataRqrment_DtFltr_VlDuration_Unt TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValueDuration.Unit',
GuidnceRsps_DataRqrment_DtFltr_VlDuration_Vl TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValueDuration.Value',
GuidnceRsps_DataRqrment_DtFltr_VlPrd_End TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValuePeriod.End',
GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strt TEXT COMMENT 'GuidanceResponse.DataRequirement.DateFilter.ValuePeriod.Start',
GuidnceRsps_DataRqrment_Lmt TEXT COMMENT 'GuidanceResponse.DataRequirement.Limit',
GuidnceRsps_DataRqrment_MustSupport TEXT COMMENT 'GuidanceResponse.DataRequirement.MustSupport',
GuidnceRsps_DataRqrment_Profile TEXT COMMENT 'GuidanceResponse.DataRequirement.Profile',
GuidnceRsps_DataRqrment_Sort_Direction TEXT COMMENT 'GuidanceResponse.DataRequirement.Sort.Direction',
GuidnceRsps_DataRqrment_Sort_Path TEXT COMMENT 'GuidanceResponse.DataRequirement.Sort.Path',
GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Cd TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectCodeableConcept.Coding.Code',
GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectCodeableConcept.Coding.Display',
GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Sys TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectCodeableConcept.Coding.System',
GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectCodeableConcept.Coding.UserSelected',
GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectCodeableConcept.Coding.Version',
GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Txt TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectCodeableConcept.Text',
GuidnceRsps_DataRqrment_SbjctRfrnc TEXT COMMENT 'GuidanceResponse.DataRequirement.SubjectReference',
GuidnceRsps_DataRqrment_Typ TEXT COMMENT 'GuidanceResponse.DataRequirement.Type',
GuidnceRsps_Enc TEXT COMMENT 'GuidanceResponse.Encounter',
GuidnceRsps_EvaluationMsg TEXT COMMENT 'GuidanceResponse.EvaluationMessage',
GuidnceRsps_Id_Assigner TEXT COMMENT 'GuidanceResponse.Identifier.Assigner',
GuidnceRsps_Id_Prd_End TEXT COMMENT 'GuidanceResponse.Identifier.Period.End',
GuidnceRsps_Id_Prd_Strt TEXT COMMENT 'GuidanceResponse.Identifier.Period.Start',
GuidnceRsps_Id_Sys TEXT COMMENT 'GuidanceResponse.Identifier.System',
GuidnceRsps_Id_Typ_Cdg_Cd TEXT COMMENT 'GuidanceResponse.Identifier.Type.Coding.Code',
GuidnceRsps_Id_Typ_Cdg_Dsply TEXT COMMENT 'GuidanceResponse.Identifier.Type.Coding.Display',
GuidnceRsps_Id_Typ_Cdg_Sys TEXT COMMENT 'GuidanceResponse.Identifier.Type.Coding.System',
GuidnceRsps_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'GuidanceResponse.Identifier.Type.Coding.UserSelected',
GuidnceRsps_Id_Typ_Cdg_Vrsn TEXT COMMENT 'GuidanceResponse.Identifier.Type.Coding.Version',
GuidnceRsps_Id_Typ_Txt TEXT COMMENT 'GuidanceResponse.Identifier.Type.Text',
GuidnceRsps_Id_Use TEXT COMMENT 'GuidanceResponse.Identifier.Use',
GuidnceRsps_Id_Vl TEXT COMMENT 'GuidanceResponse.Identifier.Value',
GuidnceRsps_ModuleCanonicalTyp TEXT COMMENT 'GuidanceResponse.ModuleCanonicalType',
GuidnceRsps_ModuleCdbleCncpt_Cdg_Cd TEXT COMMENT 'GuidanceResponse.ModuleCodeableConcept.Coding.Code',
GuidnceRsps_ModuleCdbleCncpt_Cdg_Dsply TEXT COMMENT 'GuidanceResponse.ModuleCodeableConcept.Coding.Display',
GuidnceRsps_ModuleCdbleCncpt_Cdg_Sys TEXT COMMENT 'GuidanceResponse.ModuleCodeableConcept.Coding.System',
GuidnceRsps_ModuleCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'GuidanceResponse.ModuleCodeableConcept.Coding.UserSelected',
GuidnceRsps_ModuleCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'GuidanceResponse.ModuleCodeableConcept.Coding.Version',
GuidnceRsps_ModuleCdbleCncpt_Txt TEXT COMMENT 'GuidanceResponse.ModuleCodeableConcept.Text',
GuidnceRsps_ModuleUriTyp TEXT COMMENT 'GuidanceResponse.ModuleUriType',
GuidnceRsps_Nt_AthrRfrnc TEXT COMMENT 'GuidanceResponse.Note.AuthorReference',
GuidnceRsps_Nt_AthrStrgTyp TEXT COMMENT 'GuidanceResponse.Note.AuthorStringType',
GuidnceRsps_Nt_Txt TEXT COMMENT 'GuidanceResponse.Note.Text',
GuidnceRsps_Nt_Time TEXT COMMENT 'GuidanceResponse.Note.Time',
GuidnceRsps_OccrnceDtTime TEXT COMMENT 'GuidanceResponse.OccurrenceDateTime',
GuidnceRsps_OutputPrmtrs TEXT COMMENT 'GuidanceResponse.OutputParameters',
GuidnceRsps_Prfrmr TEXT COMMENT 'GuidanceResponse.Performer',
GuidnceRsps_RsnCd_Cdg_Cd TEXT COMMENT 'GuidanceResponse.ReasonCode.Coding.Code',
GuidnceRsps_RsnCd_Cdg_Dsply TEXT COMMENT 'GuidanceResponse.ReasonCode.Coding.Display',
GuidnceRsps_RsnCd_Cdg_Sys TEXT COMMENT 'GuidanceResponse.ReasonCode.Coding.System',
GuidnceRsps_RsnCd_Cdg_UsrSltd TEXT COMMENT 'GuidanceResponse.ReasonCode.Coding.UserSelected',
GuidnceRsps_RsnCd_Cdg_Vrsn TEXT COMMENT 'GuidanceResponse.ReasonCode.Coding.Version',
GuidnceRsps_RsnCd_Txt TEXT COMMENT 'GuidanceResponse.ReasonCode.Text',
GuidnceRsps_RsnRfrnc TEXT COMMENT 'GuidanceResponse.ReasonReference',
GuidnceRsps_RqstId_Assigner TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Assigner',
GuidnceRsps_RqstId_Prd_End TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Period.End',
GuidnceRsps_RqstId_Prd_Strt TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Period.Start',
GuidnceRsps_RqstId_Sys TEXT COMMENT 'GuidanceResponse.RequestIdentifier.System',
GuidnceRsps_RqstId_Typ_Cdg_Cd TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Type.Coding.Code',
GuidnceRsps_RqstId_Typ_Cdg_Dsply TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Type.Coding.Display',
GuidnceRsps_RqstId_Typ_Cdg_Sys TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Type.Coding.System',
GuidnceRsps_RqstId_Typ_Cdg_UsrSltd TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Type.Coding.UserSelected',
GuidnceRsps_RqstId_Typ_Cdg_Vrsn TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Type.Coding.Version',
GuidnceRsps_RqstId_Typ_Txt TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Type.Text',
GuidnceRsps_RqstId_Use TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Use',
GuidnceRsps_RqstId_Vl TEXT COMMENT 'GuidanceResponse.RequestIdentifier.Value',
GuidnceRsps_Rslt TEXT COMMENT 'GuidanceResponse.Result',
GuidnceRsps_Sts TEXT COMMENT 'GuidanceResponse.Status',
GuidnceRsps_Sbjct TEXT COMMENT 'GuidanceResponse.Subject',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;