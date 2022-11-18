drop table if exists `Device`;
CREATE TABLE `Device` (
 id varchar(64),
Dvc_Cntct_Prd_End TEXT COMMENT 'Device.Contact.Period.End',
Dvc_Cntct_Prd_Strt TEXT COMMENT 'Device.Contact.Period.Start',
Dvc_Cntct_Rnk TEXT COMMENT 'Device.Contact.Rank',
Dvc_Cntct_Sys TEXT COMMENT 'Device.Contact.System',
Dvc_Cntct_Use TEXT COMMENT 'Device.Contact.Use',
Dvc_Cntct_Vl TEXT COMMENT 'Device.Contact.Value',
Dvc_Dfn TEXT COMMENT 'Device.Definition',
Dvc_DvcNm_Nm TEXT COMMENT 'Device.DeviceName.Name',
Dvc_DvcNm_Typ TEXT COMMENT 'Device.DeviceName.Type',
Dvc_DistinctId TEXT COMMENT 'Device.DistinctIdentifier',
Dvc_ExpirationDt TEXT COMMENT 'Device.ExpirationDate',
Dvc_Id_Assigner TEXT COMMENT 'Device.Identifier.Assigner',
Dvc_Id_Prd_End TEXT COMMENT 'Device.Identifier.Period.End',
Dvc_Id_Prd_Strt TEXT COMMENT 'Device.Identifier.Period.Start',
Dvc_Id_Sys TEXT COMMENT 'Device.Identifier.System',
Dvc_Id_Typ_Cdg_Cd TEXT COMMENT 'Device.Identifier.Type.Coding.Code',
Dvc_Id_Typ_Cdg_Dsply TEXT COMMENT 'Device.Identifier.Type.Coding.Display',
Dvc_Id_Typ_Cdg_Sys TEXT COMMENT 'Device.Identifier.Type.Coding.System',
Dvc_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'Device.Identifier.Type.Coding.UserSelected',
Dvc_Id_Typ_Cdg_Vrsn TEXT COMMENT 'Device.Identifier.Type.Coding.Version',
Dvc_Id_Typ_Txt TEXT COMMENT 'Device.Identifier.Type.Text',
Dvc_Id_Use TEXT COMMENT 'Device.Identifier.Use',
Dvc_Id_Vl TEXT COMMENT 'Device.Identifier.Value',
Dvc_Lctn TEXT COMMENT 'Device.Location',
Dvc_LotNmbr TEXT COMMENT 'Device.LotNumber',
Dvc_ManufactureDt TEXT COMMENT 'Device.ManufactureDate',
Dvc_Manufacturer TEXT COMMENT 'Device.Manufacturer',
Dvc_ModelNmbr TEXT COMMENT 'Device.ModelNumber',
Dvc_Nt_AthrRfrnc TEXT COMMENT 'Device.Note.AuthorReference',
Dvc_Nt_AthrStrgTyp TEXT COMMENT 'Device.Note.AuthorStringType',
Dvc_Nt_Txt TEXT COMMENT 'Device.Note.Text',
Dvc_Nt_Time TEXT COMMENT 'Device.Note.Time',
Dvc_Owner TEXT COMMENT 'Device.Owner',
Dvc_Parent TEXT COMMENT 'Device.Parent',
Dvc_PartNmbr TEXT COMMENT 'Device.PartNumber',
Dvc_Pnt TEXT COMMENT 'Device.Patient',
Dvc_Prpty_Typ_Cdg_Cd TEXT COMMENT 'Device.Property.Type.Coding.Code',
Dvc_Prpty_Typ_Cdg_Dsply TEXT COMMENT 'Device.Property.Type.Coding.Display',
Dvc_Prpty_Typ_Cdg_Sys TEXT COMMENT 'Device.Property.Type.Coding.System',
Dvc_Prpty_Typ_Cdg_UsrSltd TEXT COMMENT 'Device.Property.Type.Coding.UserSelected',
Dvc_Prpty_Typ_Cdg_Vrsn TEXT COMMENT 'Device.Property.Type.Coding.Version',
Dvc_Prpty_Typ_Txt TEXT COMMENT 'Device.Property.Type.Text',
Dvc_Prpty_VlCd_Cdg_Cd TEXT COMMENT 'Device.Property.ValueCode.Coding.Code',
Dvc_Prpty_VlCd_Cdg_Dsply TEXT COMMENT 'Device.Property.ValueCode.Coding.Display',
Dvc_Prpty_VlCd_Cdg_Sys TEXT COMMENT 'Device.Property.ValueCode.Coding.System',
Dvc_Prpty_VlCd_Cdg_UsrSltd TEXT COMMENT 'Device.Property.ValueCode.Coding.UserSelected',
Dvc_Prpty_VlCd_Cdg_Vrsn TEXT COMMENT 'Device.Property.ValueCode.Coding.Version',
Dvc_Prpty_VlCd_Txt TEXT COMMENT 'Device.Property.ValueCode.Text',
Dvc_Prpty_VlQnty_Cd TEXT COMMENT 'Device.Property.ValueQuantity.Code',
Dvc_Prpty_VlQnty_Cmprtr TEXT COMMENT 'Device.Property.ValueQuantity.Comparator',
Dvc_Prpty_VlQnty_Sys TEXT COMMENT 'Device.Property.ValueQuantity.System',
Dvc_Prpty_VlQnty_Unt TEXT COMMENT 'Device.Property.ValueQuantity.Unit',
Dvc_Prpty_VlQnty_Vl TEXT COMMENT 'Device.Property.ValueQuantity.Value',
Dvc_Safety_Cdg_Cd TEXT COMMENT 'Device.Safety.Coding.Code',
Dvc_Safety_Cdg_Dsply TEXT COMMENT 'Device.Safety.Coding.Display',
Dvc_Safety_Cdg_Sys TEXT COMMENT 'Device.Safety.Coding.System',
Dvc_Safety_Cdg_UsrSltd TEXT COMMENT 'Device.Safety.Coding.UserSelected',
Dvc_Safety_Cdg_Vrsn TEXT COMMENT 'Device.Safety.Coding.Version',
Dvc_Safety_Txt TEXT COMMENT 'Device.Safety.Text',
Dvc_SerialNmbr TEXT COMMENT 'Device.SerialNumber',
Dvc_Spclization_SysTyp_Cdg_Cd TEXT COMMENT 'Device.Specialization.SystemType.Coding.Code',
Dvc_Spclization_SysTyp_Cdg_Dsply TEXT COMMENT 'Device.Specialization.SystemType.Coding.Display',
Dvc_Spclization_SysTyp_Cdg_Sys TEXT COMMENT 'Device.Specialization.SystemType.Coding.System',
Dvc_Spclization_SysTyp_Cdg_UsrSltd TEXT COMMENT 'Device.Specialization.SystemType.Coding.UserSelected',
Dvc_Spclization_SysTyp_Cdg_Vrsn TEXT COMMENT 'Device.Specialization.SystemType.Coding.Version',
Dvc_Spclization_SysTyp_Txt TEXT COMMENT 'Device.Specialization.SystemType.Text',
Dvc_Spclization_Vrsn TEXT COMMENT 'Device.Specialization.Version',
Dvc_Sts TEXT COMMENT 'Device.Status',
Dvc_StsRsn_Cdg_Cd TEXT COMMENT 'Device.StatusReason.Coding.Code',
Dvc_StsRsn_Cdg_Dsply TEXT COMMENT 'Device.StatusReason.Coding.Display',
Dvc_StsRsn_Cdg_Sys TEXT COMMENT 'Device.StatusReason.Coding.System',
Dvc_StsRsn_Cdg_UsrSltd TEXT COMMENT 'Device.StatusReason.Coding.UserSelected',
Dvc_StsRsn_Cdg_Vrsn TEXT COMMENT 'Device.StatusReason.Coding.Version',
Dvc_StsRsn_Txt TEXT COMMENT 'Device.StatusReason.Text',
Dvc_Typ_Cdg_Cd TEXT COMMENT 'Device.Type.Coding.Code',
Dvc_Typ_Cdg_Dsply TEXT COMMENT 'Device.Type.Coding.Display',
Dvc_Typ_Cdg_Sys TEXT COMMENT 'Device.Type.Coding.System',
Dvc_Typ_Cdg_UsrSltd TEXT COMMENT 'Device.Type.Coding.UserSelected',
Dvc_Typ_Cdg_Vrsn TEXT COMMENT 'Device.Type.Coding.Version',
Dvc_Typ_Txt TEXT COMMENT 'Device.Type.Text',
Dvc_UdiCarrier_CarrierAidc TEXT COMMENT 'Device.UdiCarrier.CarrierAIDC',
Dvc_UdiCarrier_CarrierHrf TEXT COMMENT 'Device.UdiCarrier.CarrierHRF',
Dvc_UdiCarrier_DvcId TEXT COMMENT 'Device.UdiCarrier.DeviceIdentifier',
Dvc_UdiCarrier_EntryTyp TEXT COMMENT 'Device.UdiCarrier.EntryType',
Dvc_UdiCarrier_Issuer TEXT COMMENT 'Device.UdiCarrier.Issuer',
Dvc_UdiCarrier_Jrsdctn TEXT COMMENT 'Device.UdiCarrier.Jurisdiction',
Dvc_Url TEXT COMMENT 'Device.Url',
Dvc_Vrsn_Cmpnt_Assigner TEXT COMMENT 'Device.Version.Component.Assigner',
Dvc_Vrsn_Cmpnt_Prd_End TEXT COMMENT 'Device.Version.Component.Period.End',
Dvc_Vrsn_Cmpnt_Prd_Strt TEXT COMMENT 'Device.Version.Component.Period.Start',
Dvc_Vrsn_Cmpnt_Sys TEXT COMMENT 'Device.Version.Component.System',
Dvc_Vrsn_Cmpnt_Typ_Cdg_Cd TEXT COMMENT 'Device.Version.Component.Type.Coding.Code',
Dvc_Vrsn_Cmpnt_Typ_Cdg_Dsply TEXT COMMENT 'Device.Version.Component.Type.Coding.Display',
Dvc_Vrsn_Cmpnt_Typ_Cdg_Sys TEXT COMMENT 'Device.Version.Component.Type.Coding.System',
Dvc_Vrsn_Cmpnt_Typ_Cdg_UsrSltd TEXT COMMENT 'Device.Version.Component.Type.Coding.UserSelected',
Dvc_Vrsn_Cmpnt_Typ_Cdg_Vrsn TEXT COMMENT 'Device.Version.Component.Type.Coding.Version',
Dvc_Vrsn_Cmpnt_Typ_Txt TEXT COMMENT 'Device.Version.Component.Type.Text',
Dvc_Vrsn_Cmpnt_Use TEXT COMMENT 'Device.Version.Component.Use',
Dvc_Vrsn_Cmpnt_Vl TEXT COMMENT 'Device.Version.Component.Value',
Dvc_Vrsn_Typ_Cdg_Cd TEXT COMMENT 'Device.Version.Type.Coding.Code',
Dvc_Vrsn_Typ_Cdg_Dsply TEXT COMMENT 'Device.Version.Type.Coding.Display',
Dvc_Vrsn_Typ_Cdg_Sys TEXT COMMENT 'Device.Version.Type.Coding.System',
Dvc_Vrsn_Typ_Cdg_UsrSltd TEXT COMMENT 'Device.Version.Type.Coding.UserSelected',
Dvc_Vrsn_Typ_Cdg_Vrsn TEXT COMMENT 'Device.Version.Type.Coding.Version',
Dvc_Vrsn_Typ_Txt TEXT COMMENT 'Device.Version.Type.Text',
Dvc_Vrsn_Vl TEXT COMMENT 'Device.Version.Value',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;