drop table if exists `CoverageEligibilityRequest`;
CREATE TABLE `CoverageEligibilityRequest` (
 id varchar(64),
CvgElgbltyRqst_Created TEXT COMMENT 'CoverageEligibilityRequest.Created',
CvgElgbltyRqst_Enterer TEXT COMMENT 'CoverageEligibilityRequest.Enterer',
CvgElgbltyRqst_Facility TEXT COMMENT 'CoverageEligibilityRequest.Facility',
CvgElgbltyRqst_Id_Assigner TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Assigner',
CvgElgbltyRqst_Id_Prd_End TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Period.End',
CvgElgbltyRqst_Id_Prd_Strt TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Period.Start',
CvgElgbltyRqst_Id_Sys TEXT COMMENT 'CoverageEligibilityRequest.Identifier.System',
CvgElgbltyRqst_Id_Typ_Cdg_Cd TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Type.Coding.Code',
CvgElgbltyRqst_Id_Typ_Cdg_Dsply TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Type.Coding.Display',
CvgElgbltyRqst_Id_Typ_Cdg_Sys TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Type.Coding.System',
CvgElgbltyRqst_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Type.Coding.UserSelected',
CvgElgbltyRqst_Id_Typ_Cdg_Vrsn TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Type.Coding.Version',
CvgElgbltyRqst_Id_Typ_Txt TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Type.Text',
CvgElgbltyRqst_Id_Use TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Use',
CvgElgbltyRqst_Id_Vl TEXT COMMENT 'CoverageEligibilityRequest.Identifier.Value',
CvgElgbltyRqst_Insrnc_BusinessArrangement TEXT COMMENT 'CoverageEligibilityRequest.Insurance.BusinessArrangement',
CvgElgbltyRqst_Insrnc_Cvg TEXT COMMENT 'CoverageEligibilityRequest.Insurance.Coverage',
CvgElgbltyRqst_Insrnc_Focal TEXT COMMENT 'CoverageEligibilityRequest.Insurance.Focal',
CvgElgbltyRqst_Insurer TEXT COMMENT 'CoverageEligibilityRequest.Insurer',
CvgElgbltyRqst_Itm_Ctgry_Cdg_Cd TEXT COMMENT 'CoverageEligibilityRequest.Item.Category.Coding.Code',
CvgElgbltyRqst_Itm_Ctgry_Cdg_Dsply TEXT COMMENT 'CoverageEligibilityRequest.Item.Category.Coding.Display',
CvgElgbltyRqst_Itm_Ctgry_Cdg_Sys TEXT COMMENT 'CoverageEligibilityRequest.Item.Category.Coding.System',
CvgElgbltyRqst_Itm_Ctgry_Cdg_UsrSltd TEXT COMMENT 'CoverageEligibilityRequest.Item.Category.Coding.UserSelected',
CvgElgbltyRqst_Itm_Ctgry_Cdg_Vrsn TEXT COMMENT 'CoverageEligibilityRequest.Item.Category.Coding.Version',
CvgElgbltyRqst_Itm_Ctgry_Txt TEXT COMMENT 'CoverageEligibilityRequest.Item.Category.Text',
CvgElgbltyRqst_Itm_Dtl TEXT COMMENT 'CoverageEligibilityRequest.Item.Detail',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisCodeableConcept.Coding.Code',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisCodeableConcept.Coding.Display',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisCodeableConcept.Coding.System',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisCodeableConcept.Coding.UserSelected',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisCodeableConcept.Coding.Version',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Txt TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisCodeableConcept.Text',
CvgElgbltyRqst_Itm_Dgnsis_DgnsisRfrnc TEXT COMMENT 'CoverageEligibilityRequest.Item.Diagnosis.DiagnosisReference',
CvgElgbltyRqst_Itm_Facility TEXT COMMENT 'CoverageEligibilityRequest.Item.Facility',
CvgElgbltyRqst_Itm_Mdfr_Cdg_Cd TEXT COMMENT 'CoverageEligibilityRequest.Item.Modifier.Coding.Code',
CvgElgbltyRqst_Itm_Mdfr_Cdg_Dsply TEXT COMMENT 'CoverageEligibilityRequest.Item.Modifier.Coding.Display',
CvgElgbltyRqst_Itm_Mdfr_Cdg_Sys TEXT COMMENT 'CoverageEligibilityRequest.Item.Modifier.Coding.System',
CvgElgbltyRqst_Itm_Mdfr_Cdg_UsrSltd TEXT COMMENT 'CoverageEligibilityRequest.Item.Modifier.Coding.UserSelected',
CvgElgbltyRqst_Itm_Mdfr_Cdg_Vrsn TEXT COMMENT 'CoverageEligibilityRequest.Item.Modifier.Coding.Version',
CvgElgbltyRqst_Itm_Mdfr_Txt TEXT COMMENT 'CoverageEligibilityRequest.Item.Modifier.Text',
CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Cd TEXT COMMENT 'CoverageEligibilityRequest.Item.ProductOrService.Coding.Code',
CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Dsply TEXT COMMENT 'CoverageEligibilityRequest.Item.ProductOrService.Coding.Display',
CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Sys TEXT COMMENT 'CoverageEligibilityRequest.Item.ProductOrService.Coding.System',
CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_UsrSltd TEXT COMMENT 'CoverageEligibilityRequest.Item.ProductOrService.Coding.UserSelected',
CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Vrsn TEXT COMMENT 'CoverageEligibilityRequest.Item.ProductOrService.Coding.Version',
CvgElgbltyRqst_Itm_PrdctOrSrv_Txt TEXT COMMENT 'CoverageEligibilityRequest.Item.ProductOrService.Text',
CvgElgbltyRqst_Itm_Provider TEXT COMMENT 'CoverageEligibilityRequest.Item.Provider',
CvgElgbltyRqst_Itm_Qnty_Cd TEXT COMMENT 'CoverageEligibilityRequest.Item.Quantity.Code',
CvgElgbltyRqst_Itm_Qnty_Cmprtr TEXT COMMENT 'CoverageEligibilityRequest.Item.Quantity.Comparator',
CvgElgbltyRqst_Itm_Qnty_Sys TEXT COMMENT 'CoverageEligibilityRequest.Item.Quantity.System',
CvgElgbltyRqst_Itm_Qnty_Unt TEXT COMMENT 'CoverageEligibilityRequest.Item.Quantity.Unit',
CvgElgbltyRqst_Itm_Qnty_Vl TEXT COMMENT 'CoverageEligibilityRequest.Item.Quantity.Value',
CvgElgbltyRqst_Itm_SprtingInfoSqnc TEXT COMMENT 'CoverageEligibilityRequest.Item.SupportingInfoSequence',
CvgElgbltyRqst_Itm_UntPrice_Crncy TEXT COMMENT 'CoverageEligibilityRequest.Item.UnitPrice.Currency',
CvgElgbltyRqst_Itm_UntPrice_Vl TEXT COMMENT 'CoverageEligibilityRequest.Item.UnitPrice.Value',
CvgElgbltyRqst_Pnt TEXT COMMENT 'CoverageEligibilityRequest.Patient',
CvgElgbltyRqst_Priority_Cdg_Cd TEXT COMMENT 'CoverageEligibilityRequest.Priority.Coding.Code',
CvgElgbltyRqst_Priority_Cdg_Dsply TEXT COMMENT 'CoverageEligibilityRequest.Priority.Coding.Display',
CvgElgbltyRqst_Priority_Cdg_Sys TEXT COMMENT 'CoverageEligibilityRequest.Priority.Coding.System',
CvgElgbltyRqst_Priority_Cdg_UsrSltd TEXT COMMENT 'CoverageEligibilityRequest.Priority.Coding.UserSelected',
CvgElgbltyRqst_Priority_Cdg_Vrsn TEXT COMMENT 'CoverageEligibilityRequest.Priority.Coding.Version',
CvgElgbltyRqst_Priority_Txt TEXT COMMENT 'CoverageEligibilityRequest.Priority.Text',
CvgElgbltyRqst_Provider TEXT COMMENT 'CoverageEligibilityRequest.Provider',
CvgElgbltyRqst_SrvdDtTyp TEXT COMMENT 'CoverageEligibilityRequest.ServicedDateType',
CvgElgbltyRqst_SrvdPrd_End TEXT COMMENT 'CoverageEligibilityRequest.ServicedPeriod.End',
CvgElgbltyRqst_SrvdPrd_Strt TEXT COMMENT 'CoverageEligibilityRequest.ServicedPeriod.Start',
CvgElgbltyRqst_Sts TEXT COMMENT 'CoverageEligibilityRequest.Status',
CvgElgbltyRqst_SprtingInfo_AppliesToAll TEXT COMMENT 'CoverageEligibilityRequest.SupportingInfo.AppliesToAll',
CvgElgbltyRqst_SprtingInfo_Info TEXT COMMENT 'CoverageEligibilityRequest.SupportingInfo.Information',
CvgElgbltyRqst_SprtingInfo_Sqnc TEXT COMMENT 'CoverageEligibilityRequest.SupportingInfo.Sequence',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;