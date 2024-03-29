drop table if exists `MedicinalProductIngredient`;
CREATE TABLE `MedicinalProductIngredient` (
 id varchar(64),
MdcnlPrdctIgrdnt_AllergenicIndicator TEXT COMMENT 'MedicinalProductIngredient.AllergenicIndicator',
MdcnlPrdctIgrdnt_Id_Assigner TEXT COMMENT 'MedicinalProductIngredient.Identifier.Assigner',
MdcnlPrdctIgrdnt_Id_Prd_End TEXT COMMENT 'MedicinalProductIngredient.Identifier.Period.End',
MdcnlPrdctIgrdnt_Id_Prd_Strt TEXT COMMENT 'MedicinalProductIngredient.Identifier.Period.Start',
MdcnlPrdctIgrdnt_Id_Sys TEXT COMMENT 'MedicinalProductIngredient.Identifier.System',
MdcnlPrdctIgrdnt_Id_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.Identifier.Type.Coding.Code',
MdcnlPrdctIgrdnt_Id_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.Identifier.Type.Coding.Display',
MdcnlPrdctIgrdnt_Id_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.Identifier.Type.Coding.System',
MdcnlPrdctIgrdnt_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.Identifier.Type.Coding.UserSelected',
MdcnlPrdctIgrdnt_Id_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.Identifier.Type.Coding.Version',
MdcnlPrdctIgrdnt_Id_Typ_Txt TEXT COMMENT 'MedicinalProductIngredient.Identifier.Type.Text',
MdcnlPrdctIgrdnt_Id_Use TEXT COMMENT 'MedicinalProductIngredient.Identifier.Use',
MdcnlPrdctIgrdnt_Id_Vl TEXT COMMENT 'MedicinalProductIngredient.Identifier.Value',
MdcnlPrdctIgrdnt_Manufacturer TEXT COMMENT 'MedicinalProductIngredient.Manufacturer',
MdcnlPrdctIgrdnt_Role_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.Role.Coding.Code',
MdcnlPrdctIgrdnt_Role_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.Role.Coding.Display',
MdcnlPrdctIgrdnt_Role_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.Role.Coding.System',
MdcnlPrdctIgrdnt_Role_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.Role.Coding.UserSelected',
MdcnlPrdctIgrdnt_Role_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.Role.Coding.Version',
MdcnlPrdctIgrdnt_Role_Txt TEXT COMMENT 'MedicinalProductIngredient.Role.Text',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Code.Coding.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Code.Coding.Display',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Code.Coding.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Code.Coding.UserSelected',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Code.Coding.Version',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Txt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Code.Text',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Confidentiality.Coding.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Confidentiality.Coding.Display',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Confidentiality.Coding.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Confidentiality.Coding.UserSelected',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Confidentiality.Coding.Version',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Txt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Confidentiality.Text',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Group.Coding.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Group.Coding.Display',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Group.Coding.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Group.Coding.UserSelected',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Group.Coding.Version',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Txt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Group.Text',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Denominator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Denominator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Denominator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Denominator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Denominator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Numerator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Numerator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Numerator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Numerator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Concentration.Numerator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Denominator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Denominator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Denominator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Denominator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Denominator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Numerator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Numerator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Numerator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Numerator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ConcentrationLowLimit.Numerator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Country.Coding.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Country.Coding.Display',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Country.Coding.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Country.Coding.UserSelected',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Country.Coding.Version',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Txt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Country.Text',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_MsrmentPoint TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.MeasurementPoint',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Denominator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Denominator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Denominator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Denominator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Denominator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Numerator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Numerator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Numerator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Numerator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.Presentation.Numerator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Denominator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Denominator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Denominator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Denominator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Denominator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Numerator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Numerator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Numerator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Numerator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.PresentationLowLimit.Numerator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Country.Coding.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Country.Coding.Display',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Country.Coding.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Country.Coding.UserSelected',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Country.Coding.Version',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Txt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Country.Text',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_MsrmentPoint TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.MeasurementPoint',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Denominator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Denominator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Denominator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Denominator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Denominator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Numerator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Numerator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Numerator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Numerator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Strength.Numerator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Comparator',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Unit',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Value',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Substance.Coding.Code',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Substance.Coding.Display',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Substance.Coding.System',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Substance.Coding.UserSelected',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Substance.Coding.Version',
MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Txt TEXT COMMENT 'MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.Substance.Text',
MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Code.Coding.Code',
MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.Substance.Code.Coding.Display',
MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Code.Coding.System',
MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.Substance.Code.Coding.UserSelected',
MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.Substance.Code.Coding.Version',
MdcnlPrdctIgrdnt_Sbstnc_Cd_Txt TEXT COMMENT 'MedicinalProductIngredient.Substance.Code.Text',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Denominator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Denominator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Denominator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Denominator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Denominator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Numerator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Numerator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Numerator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Numerator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Concentration.Numerator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Denominator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Denominator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Denominator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Denominator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Denominator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Numerator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Numerator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Numerator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Numerator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ConcentrationLowLimit.Numerator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Country.Coding.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Country.Coding.Display',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Country.Coding.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Country.Coding.UserSelected',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Country.Coding.Version',
MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Txt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Country.Text',
MdcnlPrdctIgrdnt_Sbstnc_Str_MsrmentPoint TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.MeasurementPoint',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Denominator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Denominator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Denominator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Denominator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Denominator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Numerator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Numerator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Numerator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Numerator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.Presentation.Numerator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Denominator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Denominator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Denominator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Denominator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Denominator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Numerator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Numerator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Numerator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Numerator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.PresentationLowLimit.Numerator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Country.Coding.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Country.Coding.Display',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Country.Coding.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Country.Coding.UserSelected',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Country.Coding.Version',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Txt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Country.Text',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_MsrmentPoint TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.MeasurementPoint',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Denominator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Denominator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Denominator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Denominator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Denominator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Numerator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Numerator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Numerator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Numerator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Strength.Numerator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Denominator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Comparator',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Unit',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.StrengthLowLimit.Numerator.Value',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Substance.Coding.Code',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Substance.Coding.Display',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Substance.Coding.System',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Substance.Coding.UserSelected',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Substance.Coding.Version',
MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Txt TEXT COMMENT 'MedicinalProductIngredient.Substance.Strength.ReferenceStrength.Substance.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;