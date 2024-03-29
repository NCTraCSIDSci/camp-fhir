drop table if exists `Location`;
CREATE TABLE `Location` (
 id varchar(64),
Lctn_Addr_City TEXT COMMENT 'Location.Address.City',
Lctn_Addr_Cntry TEXT COMMENT 'Location.Address.Country',
Lctn_Addr_District TEXT COMMENT 'Location.Address.District',
Lctn_Addr_Line TEXT COMMENT 'Location.Address.Line',
Lctn_Addr_Prd_End TEXT COMMENT 'Location.Address.Period.End',
Lctn_Addr_Prd_Strt TEXT COMMENT 'Location.Address.Period.Start',
Lctn_Addr_PostalCd TEXT COMMENT 'Location.Address.PostalCode',
Lctn_Addr_State TEXT COMMENT 'Location.Address.State',
Lctn_Addr_Txt TEXT COMMENT 'Location.Address.Text',
Lctn_Addr_Typ TEXT COMMENT 'Location.Address.Type',
Lctn_Addr_Use TEXT COMMENT 'Location.Address.Use',
Lctn_Alias TEXT COMMENT 'Location.Alias',
Lctn_AvailabilityExceptions TEXT COMMENT 'Location.AvailabilityExceptions',
Lctn_Dscrptn TEXT COMMENT 'Location.Description',
Lctn_Endpoint TEXT COMMENT 'Location.Endpoint',
Lctn_HoursOfOprtn_AllDay TEXT COMMENT 'Location.HoursOfOperation.AllDay',
Lctn_HoursOfOprtn_ClosingTime TEXT COMMENT 'Location.HoursOfOperation.ClosingTime',
Lctn_HoursOfOprtn_OpeningTime TEXT COMMENT 'Location.HoursOfOperation.OpeningTime',
Lctn_Id_Assigner TEXT COMMENT 'Location.Identifier.Assigner',
Lctn_Id_Prd_End TEXT COMMENT 'Location.Identifier.Period.End',
Lctn_Id_Prd_Strt TEXT COMMENT 'Location.Identifier.Period.Start',
Lctn_Id_Sys TEXT COMMENT 'Location.Identifier.System',
Lctn_Id_Typ_Cdg_Cd TEXT COMMENT 'Location.Identifier.Type.Coding.Code',
Lctn_Id_Typ_Cdg_Dsply TEXT COMMENT 'Location.Identifier.Type.Coding.Display',
Lctn_Id_Typ_Cdg_Sys TEXT COMMENT 'Location.Identifier.Type.Coding.System',
Lctn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'Location.Identifier.Type.Coding.UserSelected',
Lctn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'Location.Identifier.Type.Coding.Version',
Lctn_Id_Typ_Txt TEXT COMMENT 'Location.Identifier.Type.Text',
Lctn_Id_Use TEXT COMMENT 'Location.Identifier.Use',
Lctn_Id_Vl TEXT COMMENT 'Location.Identifier.Value',
Lctn_ManagingOrgnztn TEXT COMMENT 'Location.ManagingOrganization',
Lctn_Mode TEXT COMMENT 'Location.Mode',
Lctn_Nm TEXT COMMENT 'Location.Name',
Lctn_OprtnalSts_Cd TEXT COMMENT 'Location.OperationalStatus.Code',
Lctn_OprtnalSts_Dsply TEXT COMMENT 'Location.OperationalStatus.Display',
Lctn_OprtnalSts_Sys TEXT COMMENT 'Location.OperationalStatus.System',
Lctn_OprtnalSts_UsrSltd TEXT COMMENT 'Location.OperationalStatus.UserSelected',
Lctn_OprtnalSts_Vrsn TEXT COMMENT 'Location.OperationalStatus.Version',
Lctn_PartOf TEXT COMMENT 'Location.PartOf',
Lctn_PhysclTyp_Cdg_Cd TEXT COMMENT 'Location.PhysicalType.Coding.Code',
Lctn_PhysclTyp_Cdg_Dsply TEXT COMMENT 'Location.PhysicalType.Coding.Display',
Lctn_PhysclTyp_Cdg_Sys TEXT COMMENT 'Location.PhysicalType.Coding.System',
Lctn_PhysclTyp_Cdg_UsrSltd TEXT COMMENT 'Location.PhysicalType.Coding.UserSelected',
Lctn_PhysclTyp_Cdg_Vrsn TEXT COMMENT 'Location.PhysicalType.Coding.Version',
Lctn_PhysclTyp_Txt TEXT COMMENT 'Location.PhysicalType.Text',
Lctn_Position_Altitude TEXT COMMENT 'Location.Position.Altitude',
Lctn_Position_Latitude TEXT COMMENT 'Location.Position.Latitude',
Lctn_Position_Longitude TEXT COMMENT 'Location.Position.Longitude',
Lctn_Sts TEXT COMMENT 'Location.Status',
Lctn_Tlcm_Prd_End TEXT COMMENT 'Location.Telecom.Period.End',
Lctn_Tlcm_Prd_Strt TEXT COMMENT 'Location.Telecom.Period.Start',
Lctn_Tlcm_Rnk TEXT COMMENT 'Location.Telecom.Rank',
Lctn_Tlcm_Sys TEXT COMMENT 'Location.Telecom.System',
Lctn_Tlcm_Use TEXT COMMENT 'Location.Telecom.Use',
Lctn_Tlcm_Vl TEXT COMMENT 'Location.Telecom.Value',
Lctn_Typ_Cdg_Cd TEXT COMMENT 'Location.Type.Coding.Code',
Lctn_Typ_Cdg_Dsply TEXT COMMENT 'Location.Type.Coding.Display',
Lctn_Typ_Cdg_Sys TEXT COMMENT 'Location.Type.Coding.System',
Lctn_Typ_Cdg_UsrSltd TEXT COMMENT 'Location.Type.Coding.UserSelected',
Lctn_Typ_Cdg_Vrsn TEXT COMMENT 'Location.Type.Coding.Version',
Lctn_Typ_Txt TEXT COMMENT 'Location.Type.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;