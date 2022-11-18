drop table if exists `HealthcareService`;
CREATE TABLE `HealthcareService` (
 id varchar(64),
HlthcrSrv_Active TEXT COMMENT 'HealthcareService.Active',
HlthcrSrv_AppmntRequired TEXT COMMENT 'HealthcareService.AppointmentRequired',
HlthcrSrv_AvailabilityExceptions TEXT COMMENT 'HealthcareService.AvailabilityExceptions',
HlthcrSrv_AvailableTime_AllDay TEXT COMMENT 'HealthcareService.AvailableTime.AllDay',
HlthcrSrv_AvailableTime_AvailableEndTime TEXT COMMENT 'HealthcareService.AvailableTime.AvailableEndTime',
HlthcrSrv_AvailableTime_AvailableStrtTime TEXT COMMENT 'HealthcareService.AvailableTime.AvailableStartTime',
HlthcrSrv_Ctgry_Cdg_Cd TEXT COMMENT 'HealthcareService.Category.Coding.Code',
HlthcrSrv_Ctgry_Cdg_Dsply TEXT COMMENT 'HealthcareService.Category.Coding.Display',
HlthcrSrv_Ctgry_Cdg_Sys TEXT COMMENT 'HealthcareService.Category.Coding.System',
HlthcrSrv_Ctgry_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Category.Coding.UserSelected',
HlthcrSrv_Ctgry_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Category.Coding.Version',
HlthcrSrv_Ctgry_Txt TEXT COMMENT 'HealthcareService.Category.Text',
HlthcrSrv_Crctrstc_Cdg_Cd TEXT COMMENT 'HealthcareService.Characteristic.Coding.Code',
HlthcrSrv_Crctrstc_Cdg_Dsply TEXT COMMENT 'HealthcareService.Characteristic.Coding.Display',
HlthcrSrv_Crctrstc_Cdg_Sys TEXT COMMENT 'HealthcareService.Characteristic.Coding.System',
HlthcrSrv_Crctrstc_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Characteristic.Coding.UserSelected',
HlthcrSrv_Crctrstc_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Characteristic.Coding.Version',
HlthcrSrv_Crctrstc_Txt TEXT COMMENT 'HealthcareService.Characteristic.Text',
HlthcrSrv_Comment TEXT COMMENT 'HealthcareService.Comment',
HlthcrSrv_Cmmnctn_Cdg_Cd TEXT COMMENT 'HealthcareService.Communication.Coding.Code',
HlthcrSrv_Cmmnctn_Cdg_Dsply TEXT COMMENT 'HealthcareService.Communication.Coding.Display',
HlthcrSrv_Cmmnctn_Cdg_Sys TEXT COMMENT 'HealthcareService.Communication.Coding.System',
HlthcrSrv_Cmmnctn_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Communication.Coding.UserSelected',
HlthcrSrv_Cmmnctn_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Communication.Coding.Version',
HlthcrSrv_Cmmnctn_Txt TEXT COMMENT 'HealthcareService.Communication.Text',
HlthcrSrv_CvgArea TEXT COMMENT 'HealthcareService.CoverageArea',
HlthcrSrv_Elgblty_Cd_Cdg_Cd TEXT COMMENT 'HealthcareService.Eligibility.Code.Coding.Code',
HlthcrSrv_Elgblty_Cd_Cdg_Dsply TEXT COMMENT 'HealthcareService.Eligibility.Code.Coding.Display',
HlthcrSrv_Elgblty_Cd_Cdg_Sys TEXT COMMENT 'HealthcareService.Eligibility.Code.Coding.System',
HlthcrSrv_Elgblty_Cd_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Eligibility.Code.Coding.UserSelected',
HlthcrSrv_Elgblty_Cd_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Eligibility.Code.Coding.Version',
HlthcrSrv_Elgblty_Cd_Txt TEXT COMMENT 'HealthcareService.Eligibility.Code.Text',
HlthcrSrv_Elgblty_Comment TEXT COMMENT 'HealthcareService.Eligibility.Comment',
HlthcrSrv_Endpoint TEXT COMMENT 'HealthcareService.Endpoint',
HlthcrSrv_ExtraDtls TEXT COMMENT 'HealthcareService.ExtraDetails',
HlthcrSrv_Id_Assigner TEXT COMMENT 'HealthcareService.Identifier.Assigner',
HlthcrSrv_Id_Prd_End TEXT COMMENT 'HealthcareService.Identifier.Period.End',
HlthcrSrv_Id_Prd_Strt TEXT COMMENT 'HealthcareService.Identifier.Period.Start',
HlthcrSrv_Id_Sys TEXT COMMENT 'HealthcareService.Identifier.System',
HlthcrSrv_Id_Typ_Cdg_Cd TEXT COMMENT 'HealthcareService.Identifier.Type.Coding.Code',
HlthcrSrv_Id_Typ_Cdg_Dsply TEXT COMMENT 'HealthcareService.Identifier.Type.Coding.Display',
HlthcrSrv_Id_Typ_Cdg_Sys TEXT COMMENT 'HealthcareService.Identifier.Type.Coding.System',
HlthcrSrv_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Identifier.Type.Coding.UserSelected',
HlthcrSrv_Id_Typ_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Identifier.Type.Coding.Version',
HlthcrSrv_Id_Typ_Txt TEXT COMMENT 'HealthcareService.Identifier.Type.Text',
HlthcrSrv_Id_Use TEXT COMMENT 'HealthcareService.Identifier.Use',
HlthcrSrv_Id_Vl TEXT COMMENT 'HealthcareService.Identifier.Value',
HlthcrSrv_Lctn TEXT COMMENT 'HealthcareService.Location',
HlthcrSrv_Nm TEXT COMMENT 'HealthcareService.Name',
HlthcrSrv_NotAvailable_Dscrptn TEXT COMMENT 'HealthcareService.NotAvailable.Description',
HlthcrSrv_NotAvailable_During_End TEXT COMMENT 'HealthcareService.NotAvailable.During.End',
HlthcrSrv_NotAvailable_During_Strt TEXT COMMENT 'HealthcareService.NotAvailable.During.Start',
HlthcrSrv_Photo_CntntTyp TEXT COMMENT 'HealthcareService.Photo.ContentType',
HlthcrSrv_Photo_Creation TEXT COMMENT 'HealthcareService.Photo.Creation',
HlthcrSrv_Photo_Data TEXT COMMENT 'HealthcareService.Photo.Data',
HlthcrSrv_Photo_Hash TEXT COMMENT 'HealthcareService.Photo.Hash',
HlthcrSrv_Photo_Lnguage TEXT COMMENT 'HealthcareService.Photo.Language',
HlthcrSrv_Photo_Sz TEXT COMMENT 'HealthcareService.Photo.Size',
HlthcrSrv_Photo_Ttl TEXT COMMENT 'HealthcareService.Photo.Title',
HlthcrSrv_Photo_Url TEXT COMMENT 'HealthcareService.Photo.Url',
HlthcrSrv_Prgrm_Cdg_Cd TEXT COMMENT 'HealthcareService.Program.Coding.Code',
HlthcrSrv_Prgrm_Cdg_Dsply TEXT COMMENT 'HealthcareService.Program.Coding.Display',
HlthcrSrv_Prgrm_Cdg_Sys TEXT COMMENT 'HealthcareService.Program.Coding.System',
HlthcrSrv_Prgrm_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Program.Coding.UserSelected',
HlthcrSrv_Prgrm_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Program.Coding.Version',
HlthcrSrv_Prgrm_Txt TEXT COMMENT 'HealthcareService.Program.Text',
HlthcrSrv_ProvidedBy TEXT COMMENT 'HealthcareService.ProvidedBy',
HlthcrSrv_ReferralMthd_Cdg_Cd TEXT COMMENT 'HealthcareService.ReferralMethod.Coding.Code',
HlthcrSrv_ReferralMthd_Cdg_Dsply TEXT COMMENT 'HealthcareService.ReferralMethod.Coding.Display',
HlthcrSrv_ReferralMthd_Cdg_Sys TEXT COMMENT 'HealthcareService.ReferralMethod.Coding.System',
HlthcrSrv_ReferralMthd_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.ReferralMethod.Coding.UserSelected',
HlthcrSrv_ReferralMthd_Cdg_Vrsn TEXT COMMENT 'HealthcareService.ReferralMethod.Coding.Version',
HlthcrSrv_ReferralMthd_Txt TEXT COMMENT 'HealthcareService.ReferralMethod.Text',
HlthcrSrv_SrvProvisionCd_Cdg_Cd TEXT COMMENT 'HealthcareService.ServiceProvisionCode.Coding.Code',
HlthcrSrv_SrvProvisionCd_Cdg_Dsply TEXT COMMENT 'HealthcareService.ServiceProvisionCode.Coding.Display',
HlthcrSrv_SrvProvisionCd_Cdg_Sys TEXT COMMENT 'HealthcareService.ServiceProvisionCode.Coding.System',
HlthcrSrv_SrvProvisionCd_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.ServiceProvisionCode.Coding.UserSelected',
HlthcrSrv_SrvProvisionCd_Cdg_Vrsn TEXT COMMENT 'HealthcareService.ServiceProvisionCode.Coding.Version',
HlthcrSrv_SrvProvisionCd_Txt TEXT COMMENT 'HealthcareService.ServiceProvisionCode.Text',
HlthcrSrv_Spclty_Cdg_Cd TEXT COMMENT 'HealthcareService.Specialty.Coding.Code',
HlthcrSrv_Spclty_Cdg_Dsply TEXT COMMENT 'HealthcareService.Specialty.Coding.Display',
HlthcrSrv_Spclty_Cdg_Sys TEXT COMMENT 'HealthcareService.Specialty.Coding.System',
HlthcrSrv_Spclty_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Specialty.Coding.UserSelected',
HlthcrSrv_Spclty_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Specialty.Coding.Version',
HlthcrSrv_Spclty_Txt TEXT COMMENT 'HealthcareService.Specialty.Text',
HlthcrSrv_Tlcm_Prd_End TEXT COMMENT 'HealthcareService.Telecom.Period.End',
HlthcrSrv_Tlcm_Prd_Strt TEXT COMMENT 'HealthcareService.Telecom.Period.Start',
HlthcrSrv_Tlcm_Rnk TEXT COMMENT 'HealthcareService.Telecom.Rank',
HlthcrSrv_Tlcm_Sys TEXT COMMENT 'HealthcareService.Telecom.System',
HlthcrSrv_Tlcm_Use TEXT COMMENT 'HealthcareService.Telecom.Use',
HlthcrSrv_Tlcm_Vl TEXT COMMENT 'HealthcareService.Telecom.Value',
HlthcrSrv_Typ_Cdg_Cd TEXT COMMENT 'HealthcareService.Type.Coding.Code',
HlthcrSrv_Typ_Cdg_Dsply TEXT COMMENT 'HealthcareService.Type.Coding.Display',
HlthcrSrv_Typ_Cdg_Sys TEXT COMMENT 'HealthcareService.Type.Coding.System',
HlthcrSrv_Typ_Cdg_UsrSltd TEXT COMMENT 'HealthcareService.Type.Coding.UserSelected',
HlthcrSrv_Typ_Cdg_Vrsn TEXT COMMENT 'HealthcareService.Type.Coding.Version',
HlthcrSrv_Typ_Txt TEXT COMMENT 'HealthcareService.Type.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;