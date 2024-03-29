drop table if exists `Patient`;
CREATE TABLE `Patient` (
 id varchar(64),
Pnt_Active TEXT COMMENT 'Patient.Active',
Pnt_Addr_City TEXT COMMENT 'Patient.Address.City',
Pnt_Addr_Cntry TEXT COMMENT 'Patient.Address.Country',
Pnt_Addr_District TEXT COMMENT 'Patient.Address.District',
Pnt_Addr_Line TEXT COMMENT 'Patient.Address.Line',
Pnt_Addr_Prd_End TEXT COMMENT 'Patient.Address.Period.End',
Pnt_Addr_Prd_Strt TEXT COMMENT 'Patient.Address.Period.Start',
Pnt_Addr_PostalCd TEXT COMMENT 'Patient.Address.PostalCode',
Pnt_Addr_State TEXT COMMENT 'Patient.Address.State',
Pnt_Addr_Txt TEXT COMMENT 'Patient.Address.Text',
Pnt_Addr_Typ TEXT COMMENT 'Patient.Address.Type',
Pnt_Addr_Use TEXT COMMENT 'Patient.Address.Use',
Pnt_BirthDt TEXT COMMENT 'Patient.BirthDate',
Pnt_Cmmnctn_Lnguage_Cdg_Cd TEXT COMMENT 'Patient.Communication.Language.Coding.Code',
Pnt_Cmmnctn_Lnguage_Cdg_Dsply TEXT COMMENT 'Patient.Communication.Language.Coding.Display',
Pnt_Cmmnctn_Lnguage_Cdg_Sys TEXT COMMENT 'Patient.Communication.Language.Coding.System',
Pnt_Cmmnctn_Lnguage_Cdg_UsrSltd TEXT COMMENT 'Patient.Communication.Language.Coding.UserSelected',
Pnt_Cmmnctn_Lnguage_Cdg_Vrsn TEXT COMMENT 'Patient.Communication.Language.Coding.Version',
Pnt_Cmmnctn_Lnguage_Txt TEXT COMMENT 'Patient.Communication.Language.Text',
Pnt_Cmmnctn_Preferred TEXT COMMENT 'Patient.Communication.Preferred',
Pnt_Cntct_Addr_City TEXT COMMENT 'Patient.Contact.Address.City',
Pnt_Cntct_Addr_Cntry TEXT COMMENT 'Patient.Contact.Address.Country',
Pnt_Cntct_Addr_District TEXT COMMENT 'Patient.Contact.Address.District',
Pnt_Cntct_Addr_Line TEXT COMMENT 'Patient.Contact.Address.Line',
Pnt_Cntct_Addr_Prd_End TEXT COMMENT 'Patient.Contact.Address.Period.End',
Pnt_Cntct_Addr_Prd_Strt TEXT COMMENT 'Patient.Contact.Address.Period.Start',
Pnt_Cntct_Addr_PostalCd TEXT COMMENT 'Patient.Contact.Address.PostalCode',
Pnt_Cntct_Addr_State TEXT COMMENT 'Patient.Contact.Address.State',
Pnt_Cntct_Addr_Txt TEXT COMMENT 'Patient.Contact.Address.Text',
Pnt_Cntct_Addr_Typ TEXT COMMENT 'Patient.Contact.Address.Type',
Pnt_Cntct_Addr_Use TEXT COMMENT 'Patient.Contact.Address.Use',
Pnt_Cntct_Gender TEXT COMMENT 'Patient.Contact.Gender',
Pnt_Cntct_Nm_Fmly TEXT COMMENT 'Patient.Contact.Name.Family',
Pnt_Cntct_Nm_Given TEXT COMMENT 'Patient.Contact.Name.Given',
Pnt_Cntct_Nm_Prd_End TEXT COMMENT 'Patient.Contact.Name.Period.End',
Pnt_Cntct_Nm_Prd_Strt TEXT COMMENT 'Patient.Contact.Name.Period.Start',
Pnt_Cntct_Nm_Prefix TEXT COMMENT 'Patient.Contact.Name.Prefix',
Pnt_Cntct_Nm_Suffix TEXT COMMENT 'Patient.Contact.Name.Suffix',
Pnt_Cntct_Nm_Txt TEXT COMMENT 'Patient.Contact.Name.Text',
Pnt_Cntct_Nm_Use TEXT COMMENT 'Patient.Contact.Name.Use',
Pnt_Cntct_Orgnztn TEXT COMMENT 'Patient.Contact.Organization',
Pnt_Cntct_Prd_End TEXT COMMENT 'Patient.Contact.Period.End',
Pnt_Cntct_Prd_Strt TEXT COMMENT 'Patient.Contact.Period.Start',
Pnt_Cntct_Rltnship_Cdg_Cd TEXT COMMENT 'Patient.Contact.Relationship.Coding.Code',
Pnt_Cntct_Rltnship_Cdg_Dsply TEXT COMMENT 'Patient.Contact.Relationship.Coding.Display',
Pnt_Cntct_Rltnship_Cdg_Sys TEXT COMMENT 'Patient.Contact.Relationship.Coding.System',
Pnt_Cntct_Rltnship_Cdg_UsrSltd TEXT COMMENT 'Patient.Contact.Relationship.Coding.UserSelected',
Pnt_Cntct_Rltnship_Cdg_Vrsn TEXT COMMENT 'Patient.Contact.Relationship.Coding.Version',
Pnt_Cntct_Rltnship_Txt TEXT COMMENT 'Patient.Contact.Relationship.Text',
Pnt_Cntct_Tlcm_Prd_End TEXT COMMENT 'Patient.Contact.Telecom.Period.End',
Pnt_Cntct_Tlcm_Prd_Strt TEXT COMMENT 'Patient.Contact.Telecom.Period.Start',
Pnt_Cntct_Tlcm_Rnk TEXT COMMENT 'Patient.Contact.Telecom.Rank',
Pnt_Cntct_Tlcm_Sys TEXT COMMENT 'Patient.Contact.Telecom.System',
Pnt_Cntct_Tlcm_Use TEXT COMMENT 'Patient.Contact.Telecom.Use',
Pnt_Cntct_Tlcm_Vl TEXT COMMENT 'Patient.Contact.Telecom.Value',
Pnt_DeceasedBooleanTyp TEXT COMMENT 'Patient.DeceasedBooleanType',
Pnt_DeceasedDtTimeTyp TEXT COMMENT 'Patient.DeceasedDateTimeType',
Pnt_Gender TEXT COMMENT 'Patient.Gender',
Pnt_GeneralPrctitnr TEXT COMMENT 'Patient.GeneralPractitioner',
Pnt_Id_Assigner TEXT COMMENT 'Patient.Identifier.Assigner',
Pnt_Id_Prd_End TEXT COMMENT 'Patient.Identifier.Period.End',
Pnt_Id_Prd_Strt TEXT COMMENT 'Patient.Identifier.Period.Start',
Pnt_Id_Sys TEXT COMMENT 'Patient.Identifier.System',
Pnt_Id_Typ_Cdg_Cd TEXT COMMENT 'Patient.Identifier.Type.Coding.Code',
Pnt_Id_Typ_Cdg_Dsply TEXT COMMENT 'Patient.Identifier.Type.Coding.Display',
Pnt_Id_Typ_Cdg_Sys TEXT COMMENT 'Patient.Identifier.Type.Coding.System',
Pnt_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'Patient.Identifier.Type.Coding.UserSelected',
Pnt_Id_Typ_Cdg_Vrsn TEXT COMMENT 'Patient.Identifier.Type.Coding.Version',
Pnt_Id_Typ_Txt TEXT COMMENT 'Patient.Identifier.Type.Text',
Pnt_Id_Use TEXT COMMENT 'Patient.Identifier.Use',
Pnt_Id_Vl TEXT COMMENT 'Patient.Identifier.Value',
Pnt_Link_Other TEXT COMMENT 'Patient.Link.Other',
Pnt_Link_Typ TEXT COMMENT 'Patient.Link.Type',
Pnt_ManagingOrgnztn TEXT COMMENT 'Patient.ManagingOrganization',
Pnt_MaritalSts_Cdg_Cd TEXT COMMENT 'Patient.MaritalStatus.Coding.Code',
Pnt_MaritalSts_Cdg_Dsply TEXT COMMENT 'Patient.MaritalStatus.Coding.Display',
Pnt_MaritalSts_Cdg_Sys TEXT COMMENT 'Patient.MaritalStatus.Coding.System',
Pnt_MaritalSts_Cdg_UsrSltd TEXT COMMENT 'Patient.MaritalStatus.Coding.UserSelected',
Pnt_MaritalSts_Cdg_Vrsn TEXT COMMENT 'Patient.MaritalStatus.Coding.Version',
Pnt_MaritalSts_Txt TEXT COMMENT 'Patient.MaritalStatus.Text',
Pnt_MultipleBirthBooleanTyp TEXT COMMENT 'Patient.MultipleBirthBooleanType',
Pnt_MultipleBirthIntegerTyp TEXT COMMENT 'Patient.MultipleBirthIntegerType',
Pnt_Nm_Fmly TEXT COMMENT 'Patient.Name.Family',
Pnt_Nm_Given TEXT COMMENT 'Patient.Name.Given',
Pnt_Nm_Prd_End TEXT COMMENT 'Patient.Name.Period.End',
Pnt_Nm_Prd_Strt TEXT COMMENT 'Patient.Name.Period.Start',
Pnt_Nm_Prefix TEXT COMMENT 'Patient.Name.Prefix',
Pnt_Nm_Suffix TEXT COMMENT 'Patient.Name.Suffix',
Pnt_Nm_Txt TEXT COMMENT 'Patient.Name.Text',
Pnt_Nm_Use TEXT COMMENT 'Patient.Name.Use',
Pnt_Photo_CntntTyp TEXT COMMENT 'Patient.Photo.ContentType',
Pnt_Photo_Creation TEXT COMMENT 'Patient.Photo.Creation',
Pnt_Photo_Data TEXT COMMENT 'Patient.Photo.Data',
Pnt_Photo_Hash TEXT COMMENT 'Patient.Photo.Hash',
Pnt_Photo_Lnguage TEXT COMMENT 'Patient.Photo.Language',
Pnt_Photo_Sz TEXT COMMENT 'Patient.Photo.Size',
Pnt_Photo_Ttl TEXT COMMENT 'Patient.Photo.Title',
Pnt_Photo_Url TEXT COMMENT 'Patient.Photo.Url',
Pnt_Tlcm_Prd_End TEXT COMMENT 'Patient.Telecom.Period.End',
Pnt_Tlcm_Prd_Strt TEXT COMMENT 'Patient.Telecom.Period.Start',
Pnt_Tlcm_Rnk TEXT COMMENT 'Patient.Telecom.Rank',
Pnt_Tlcm_Sys TEXT COMMENT 'Patient.Telecom.System',
Pnt_Tlcm_Use TEXT COMMENT 'Patient.Telecom.Use',
Pnt_Tlcm_Vl TEXT COMMENT 'Patient.Telecom.Value',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;