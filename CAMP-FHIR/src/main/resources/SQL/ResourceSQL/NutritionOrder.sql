drop table if exists `NutritionOrder`;
CREATE TABLE `NutritionOrder` (
 id varchar(64),
NtritnOrdr_AlrgyIntolerance TEXT COMMENT 'NutritionOrder.AllergyIntolerance',
NtritnOrdr_DtTime TEXT COMMENT 'NutritionOrder.DateTime',
NtritnOrdr_Enc TEXT COMMENT 'NutritionOrder.Encounter',
NtritnOrdr_EnteralFrmula_AddtvPrdctNm TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveProductName',
NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveType.Coding.Code',
NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Dsply TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveType.Coding.Display',
NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveType.Coding.System',
NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveType.Coding.UserSelected',
NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveType.Coding.Version',
NtritnOrdr_EnteralFrmula_AddtvTyp_Txt TEXT COMMENT 'NutritionOrder.EnteralFormula.AdditiveType.Text',
NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Quantity.Code',
NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Quantity.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Quantity.System',
NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Quantity.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Quantity.Value',
NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateQuantity.Code',
NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateQuantity.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateQuantity.System',
NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateQuantity.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateQuantity.Value',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Denominator.Code',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Denominator.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Denominator.System',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Denominator.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Denominator.Value',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Numerator.Code',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Numerator.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Numerator.System',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Numerator.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.RateRatio.Numerator.Value',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Code.Coding.Code',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Dsply TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Code.Coding.Display',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Code.Coding.System',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Code.Coding.UserSelected',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Code.Coding.Version',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Txt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Code.Text',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evnt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Event',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsDuration.Code',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsDuration.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsDuration.System',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsDuration.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsDuration.Value',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_End TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsPeriod.End',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsPeriod.Start',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.High.Code',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.High.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.High.System',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.High.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.High.Value',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.Low.Code',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.Low.Comparator',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.Low.System',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.Low.Unit',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.BoundsRange.Low.Value',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Cnt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.Count',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_CntMx TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.CountMax',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Duration TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.Duration',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationMx TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.DurationMax',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationUnt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.DurationUnit',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Frqncy TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.Frequency',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_FrqncyMx TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.FrequencyMax',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Off TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.Offset',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Prd TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.Period',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdMx TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.PeriodMax',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdUnt TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.PeriodUnit',
NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_TimeOfDay TEXT COMMENT 'NutritionOrder.EnteralFormula.Administration.Schedule.Repeat.TimeOfDay',
NtritnOrdr_EnteralFrmula_AdmnstnInstrctn TEXT COMMENT 'NutritionOrder.EnteralFormula.AdministrationInstruction',
NtritnOrdr_EnteralFrmula_BaseFrmulaPrdctNm TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaProductName',
NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaType.Coding.Code',
NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Dsply TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaType.Coding.Display',
NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaType.Coding.System',
NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaType.Coding.UserSelected',
NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaType.Coding.Version',
NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Txt TEXT COMMENT 'NutritionOrder.EnteralFormula.BaseFormulaType.Text',
NtritnOrdr_EnteralFrmula_CaloricDensity_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.CaloricDensity.Code',
NtritnOrdr_EnteralFrmula_CaloricDensity_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.CaloricDensity.Comparator',
NtritnOrdr_EnteralFrmula_CaloricDensity_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.CaloricDensity.System',
NtritnOrdr_EnteralFrmula_CaloricDensity_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.CaloricDensity.Unit',
NtritnOrdr_EnteralFrmula_CaloricDensity_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.CaloricDensity.Value',
NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.MaxVolumeToDeliver.Code',
NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cmprtr TEXT COMMENT 'NutritionOrder.EnteralFormula.MaxVolumeToDeliver.Comparator',
NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.MaxVolumeToDeliver.System',
NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Unt TEXT COMMENT 'NutritionOrder.EnteralFormula.MaxVolumeToDeliver.Unit',
NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Vl TEXT COMMENT 'NutritionOrder.EnteralFormula.MaxVolumeToDeliver.Value',
NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Cd TEXT COMMENT 'NutritionOrder.EnteralFormula.RouteofAdministration.Coding.Code',
NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Dsply TEXT COMMENT 'NutritionOrder.EnteralFormula.RouteofAdministration.Coding.Display',
NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Sys TEXT COMMENT 'NutritionOrder.EnteralFormula.RouteofAdministration.Coding.System',
NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.EnteralFormula.RouteofAdministration.Coding.UserSelected',
NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.EnteralFormula.RouteofAdministration.Coding.Version',
NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Txt TEXT COMMENT 'NutritionOrder.EnteralFormula.RouteofAdministration.Text',
NtritnOrdr_ExcludeFoodMdfr_Cdg_Cd TEXT COMMENT 'NutritionOrder.ExcludeFoodModifier.Coding.Code',
NtritnOrdr_ExcludeFoodMdfr_Cdg_Dsply TEXT COMMENT 'NutritionOrder.ExcludeFoodModifier.Coding.Display',
NtritnOrdr_ExcludeFoodMdfr_Cdg_Sys TEXT COMMENT 'NutritionOrder.ExcludeFoodModifier.Coding.System',
NtritnOrdr_ExcludeFoodMdfr_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.ExcludeFoodModifier.Coding.UserSelected',
NtritnOrdr_ExcludeFoodMdfr_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.ExcludeFoodModifier.Coding.Version',
NtritnOrdr_ExcludeFoodMdfr_Txt TEXT COMMENT 'NutritionOrder.ExcludeFoodModifier.Text',
NtritnOrdr_FoodPreferenceMdfr_Cdg_Cd TEXT COMMENT 'NutritionOrder.FoodPreferenceModifier.Coding.Code',
NtritnOrdr_FoodPreferenceMdfr_Cdg_Dsply TEXT COMMENT 'NutritionOrder.FoodPreferenceModifier.Coding.Display',
NtritnOrdr_FoodPreferenceMdfr_Cdg_Sys TEXT COMMENT 'NutritionOrder.FoodPreferenceModifier.Coding.System',
NtritnOrdr_FoodPreferenceMdfr_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.FoodPreferenceModifier.Coding.UserSelected',
NtritnOrdr_FoodPreferenceMdfr_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.FoodPreferenceModifier.Coding.Version',
NtritnOrdr_FoodPreferenceMdfr_Txt TEXT COMMENT 'NutritionOrder.FoodPreferenceModifier.Text',
NtritnOrdr_Id_Assigner TEXT COMMENT 'NutritionOrder.Identifier.Assigner',
NtritnOrdr_Id_Prd_End TEXT COMMENT 'NutritionOrder.Identifier.Period.End',
NtritnOrdr_Id_Prd_Strt TEXT COMMENT 'NutritionOrder.Identifier.Period.Start',
NtritnOrdr_Id_Sys TEXT COMMENT 'NutritionOrder.Identifier.System',
NtritnOrdr_Id_Typ_Cdg_Cd TEXT COMMENT 'NutritionOrder.Identifier.Type.Coding.Code',
NtritnOrdr_Id_Typ_Cdg_Dsply TEXT COMMENT 'NutritionOrder.Identifier.Type.Coding.Display',
NtritnOrdr_Id_Typ_Cdg_Sys TEXT COMMENT 'NutritionOrder.Identifier.Type.Coding.System',
NtritnOrdr_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.Identifier.Type.Coding.UserSelected',
NtritnOrdr_Id_Typ_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.Identifier.Type.Coding.Version',
NtritnOrdr_Id_Typ_Txt TEXT COMMENT 'NutritionOrder.Identifier.Type.Text',
NtritnOrdr_Id_Use TEXT COMMENT 'NutritionOrder.Identifier.Use',
NtritnOrdr_Id_Vl TEXT COMMENT 'NutritionOrder.Identifier.Value',
NtritnOrdr_Instantiates TEXT COMMENT 'NutritionOrder.Instantiates',
NtritnOrdr_InstantiatesCanonical TEXT COMMENT 'NutritionOrder.InstantiatesCanonical',
NtritnOrdr_InstantiatesUri TEXT COMMENT 'NutritionOrder.InstantiatesUri',
NtritnOrdr_Intent TEXT COMMENT 'NutritionOrder.Intent',
NtritnOrdr_Nt_AthrRfrnc TEXT COMMENT 'NutritionOrder.Note.AuthorReference',
NtritnOrdr_Nt_AthrStrgTyp TEXT COMMENT 'NutritionOrder.Note.AuthorStringType',
NtritnOrdr_Nt_Txt TEXT COMMENT 'NutritionOrder.Note.Text',
NtritnOrdr_Nt_Time TEXT COMMENT 'NutritionOrder.Note.Time',
NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Cd TEXT COMMENT 'NutritionOrder.OralDiet.FluidConsistencyType.Coding.Code',
NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Dsply TEXT COMMENT 'NutritionOrder.OralDiet.FluidConsistencyType.Coding.Display',
NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Sys TEXT COMMENT 'NutritionOrder.OralDiet.FluidConsistencyType.Coding.System',
NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.OralDiet.FluidConsistencyType.Coding.UserSelected',
NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.OralDiet.FluidConsistencyType.Coding.Version',
NtritnOrdr_OralDiet_FluidConsistencyTyp_Txt TEXT COMMENT 'NutritionOrder.OralDiet.FluidConsistencyType.Text',
NtritnOrdr_OralDiet_Instrctn TEXT COMMENT 'NutritionOrder.OralDiet.Instruction',
NtritnOrdr_OralDiet_Nutrient_Amnt_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Amount.Code',
NtritnOrdr_OralDiet_Nutrient_Amnt_Cmprtr TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Amount.Comparator',
NtritnOrdr_OralDiet_Nutrient_Amnt_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Amount.System',
NtritnOrdr_OralDiet_Nutrient_Amnt_Unt TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Amount.Unit',
NtritnOrdr_OralDiet_Nutrient_Amnt_Vl TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Amount.Value',
NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Modifier.Coding.Code',
NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Dsply TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Modifier.Coding.Display',
NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Modifier.Coding.System',
NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Modifier.Coding.UserSelected',
NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Modifier.Coding.Version',
NtritnOrdr_OralDiet_Nutrient_Mdfr_Txt TEXT COMMENT 'NutritionOrder.OralDiet.Nutrient.Modifier.Text',
NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Code.Coding.Code',
NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Dsply TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Code.Coding.Display',
NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Code.Coding.System',
NtritnOrdr_OralDiet_Schdl_Cd_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Code.Coding.UserSelected',
NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Code.Coding.Version',
NtritnOrdr_OralDiet_Schdl_Cd_Txt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Code.Text',
NtritnOrdr_OralDiet_Schdl_Evnt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Event',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsDuration.Code',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Cmprtr TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsDuration.Comparator',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsDuration.System',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Unt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsDuration.Unit',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Vl TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsDuration.Value',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_End TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsPeriod.End',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsPeriod.Start',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.High.Code',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cmprtr TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.High.Comparator',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.High.System',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Unt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.High.Unit',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Vl TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.High.Value',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.Low.Code',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cmprtr TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.Low.Comparator',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.Low.System',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Unt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.Low.Unit',
NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Vl TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.BoundsRange.Low.Value',
NtritnOrdr_OralDiet_Schdl_Rpt_Cnt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.Count',
NtritnOrdr_OralDiet_Schdl_Rpt_CntMx TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.CountMax',
NtritnOrdr_OralDiet_Schdl_Rpt_Duration TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.Duration',
NtritnOrdr_OralDiet_Schdl_Rpt_DurationMx TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.DurationMax',
NtritnOrdr_OralDiet_Schdl_Rpt_DurationUnt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.DurationUnit',
NtritnOrdr_OralDiet_Schdl_Rpt_Frqncy TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.Frequency',
NtritnOrdr_OralDiet_Schdl_Rpt_FrqncyMx TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.FrequencyMax',
NtritnOrdr_OralDiet_Schdl_Rpt_Off TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.Offset',
NtritnOrdr_OralDiet_Schdl_Rpt_Prd TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.Period',
NtritnOrdr_OralDiet_Schdl_Rpt_PrdMx TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.PeriodMax',
NtritnOrdr_OralDiet_Schdl_Rpt_PrdUnt TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.PeriodUnit',
NtritnOrdr_OralDiet_Schdl_Rpt_TimeOfDay TEXT COMMENT 'NutritionOrder.OralDiet.Schedule.Repeat.TimeOfDay',
NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Texture.FoodType.Coding.Code',
NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Dsply TEXT COMMENT 'NutritionOrder.OralDiet.Texture.FoodType.Coding.Display',
NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Texture.FoodType.Coding.System',
NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.OralDiet.Texture.FoodType.Coding.UserSelected',
NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.OralDiet.Texture.FoodType.Coding.Version',
NtritnOrdr_OralDiet_Txture_FoodTyp_Txt TEXT COMMENT 'NutritionOrder.OralDiet.Texture.FoodType.Text',
NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Texture.Modifier.Coding.Code',
NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Dsply TEXT COMMENT 'NutritionOrder.OralDiet.Texture.Modifier.Coding.Display',
NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Texture.Modifier.Coding.System',
NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.OralDiet.Texture.Modifier.Coding.UserSelected',
NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.OralDiet.Texture.Modifier.Coding.Version',
NtritnOrdr_OralDiet_Txture_Mdfr_Txt TEXT COMMENT 'NutritionOrder.OralDiet.Texture.Modifier.Text',
NtritnOrdr_OralDiet_Typ_Cdg_Cd TEXT COMMENT 'NutritionOrder.OralDiet.Type.Coding.Code',
NtritnOrdr_OralDiet_Typ_Cdg_Dsply TEXT COMMENT 'NutritionOrder.OralDiet.Type.Coding.Display',
NtritnOrdr_OralDiet_Typ_Cdg_Sys TEXT COMMENT 'NutritionOrder.OralDiet.Type.Coding.System',
NtritnOrdr_OralDiet_Typ_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.OralDiet.Type.Coding.UserSelected',
NtritnOrdr_OralDiet_Typ_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.OralDiet.Type.Coding.Version',
NtritnOrdr_OralDiet_Typ_Txt TEXT COMMENT 'NutritionOrder.OralDiet.Type.Text',
NtritnOrdr_Ordrer TEXT COMMENT 'NutritionOrder.Orderer',
NtritnOrdr_Pnt TEXT COMMENT 'NutritionOrder.Patient',
NtritnOrdr_Sts TEXT COMMENT 'NutritionOrder.Status',
NtritnOrdr_Supplement_Instrctn TEXT COMMENT 'NutritionOrder.Supplement.Instruction',
NtritnOrdr_Supplement_PrdctNm TEXT COMMENT 'NutritionOrder.Supplement.ProductName',
NtritnOrdr_Supplement_Qnty_Cd TEXT COMMENT 'NutritionOrder.Supplement.Quantity.Code',
NtritnOrdr_Supplement_Qnty_Cmprtr TEXT COMMENT 'NutritionOrder.Supplement.Quantity.Comparator',
NtritnOrdr_Supplement_Qnty_Sys TEXT COMMENT 'NutritionOrder.Supplement.Quantity.System',
NtritnOrdr_Supplement_Qnty_Unt TEXT COMMENT 'NutritionOrder.Supplement.Quantity.Unit',
NtritnOrdr_Supplement_Qnty_Vl TEXT COMMENT 'NutritionOrder.Supplement.Quantity.Value',
NtritnOrdr_Supplement_Schdl_Cd_Cdg_Cd TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Code.Coding.Code',
NtritnOrdr_Supplement_Schdl_Cd_Cdg_Dsply TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Code.Coding.Display',
NtritnOrdr_Supplement_Schdl_Cd_Cdg_Sys TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Code.Coding.System',
NtritnOrdr_Supplement_Schdl_Cd_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Code.Coding.UserSelected',
NtritnOrdr_Supplement_Schdl_Cd_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Code.Coding.Version',
NtritnOrdr_Supplement_Schdl_Cd_Txt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Code.Text',
NtritnOrdr_Supplement_Schdl_Evnt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Event',
NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Cd TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsDuration.Code',
NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Cmprtr TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsDuration.Comparator',
NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Sys TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsDuration.System',
NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Unt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsDuration.Unit',
NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Vl TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsDuration.Value',
NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_End TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsPeriod.End',
NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsPeriod.Start',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cd TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.High.Code',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cmprtr TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.High.Comparator',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Sys TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.High.System',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Unt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.High.Unit',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Vl TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.High.Value',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cd TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.Low.Code',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cmprtr TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.Low.Comparator',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Sys TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.Low.System',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Unt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.Low.Unit',
NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Vl TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.BoundsRange.Low.Value',
NtritnOrdr_Supplement_Schdl_Rpt_Cnt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.Count',
NtritnOrdr_Supplement_Schdl_Rpt_CntMx TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.CountMax',
NtritnOrdr_Supplement_Schdl_Rpt_Duration TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.Duration',
NtritnOrdr_Supplement_Schdl_Rpt_DurationMx TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.DurationMax',
NtritnOrdr_Supplement_Schdl_Rpt_DurationUnt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.DurationUnit',
NtritnOrdr_Supplement_Schdl_Rpt_Frqncy TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.Frequency',
NtritnOrdr_Supplement_Schdl_Rpt_FrqncyMx TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.FrequencyMax',
NtritnOrdr_Supplement_Schdl_Rpt_Off TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.Offset',
NtritnOrdr_Supplement_Schdl_Rpt_Prd TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.Period',
NtritnOrdr_Supplement_Schdl_Rpt_PrdMx TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.PeriodMax',
NtritnOrdr_Supplement_Schdl_Rpt_PrdUnt TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.PeriodUnit',
NtritnOrdr_Supplement_Schdl_Rpt_TimeOfDay TEXT COMMENT 'NutritionOrder.Supplement.Schedule.Repeat.TimeOfDay',
NtritnOrdr_Supplement_Typ_Cdg_Cd TEXT COMMENT 'NutritionOrder.Supplement.Type.Coding.Code',
NtritnOrdr_Supplement_Typ_Cdg_Dsply TEXT COMMENT 'NutritionOrder.Supplement.Type.Coding.Display',
NtritnOrdr_Supplement_Typ_Cdg_Sys TEXT COMMENT 'NutritionOrder.Supplement.Type.Coding.System',
NtritnOrdr_Supplement_Typ_Cdg_UsrSltd TEXT COMMENT 'NutritionOrder.Supplement.Type.Coding.UserSelected',
NtritnOrdr_Supplement_Typ_Cdg_Vrsn TEXT COMMENT 'NutritionOrder.Supplement.Type.Coding.Version',
NtritnOrdr_Supplement_Typ_Txt TEXT COMMENT 'NutritionOrder.Supplement.Type.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;