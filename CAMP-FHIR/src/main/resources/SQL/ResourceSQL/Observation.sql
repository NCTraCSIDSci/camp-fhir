drop table if exists `Observation`;
CREATE TABLE `Observation` (
 id varchar(64),
Obsrvtn_BasedOn TEXT COMMENT 'Observation.BasedOn',
Obsrvtn_BodySite_Cdg_Cd TEXT COMMENT 'Observation.BodySite.Coding.Code',
Obsrvtn_BodySite_Cdg_Dsply TEXT COMMENT 'Observation.BodySite.Coding.Display',
Obsrvtn_BodySite_Cdg_Sys TEXT COMMENT 'Observation.BodySite.Coding.System',
Obsrvtn_BodySite_Cdg_UsrSltd TEXT COMMENT 'Observation.BodySite.Coding.UserSelected',
Obsrvtn_BodySite_Cdg_Vrsn TEXT COMMENT 'Observation.BodySite.Coding.Version',
Obsrvtn_BodySite_Txt TEXT COMMENT 'Observation.BodySite.Text',
Obsrvtn_Ctgry_Cdg_Cd TEXT COMMENT 'Observation.Category.Coding.Code',
Obsrvtn_Ctgry_Cdg_Dsply TEXT COMMENT 'Observation.Category.Coding.Display',
Obsrvtn_Ctgry_Cdg_Sys TEXT COMMENT 'Observation.Category.Coding.System',
Obsrvtn_Ctgry_Cdg_UsrSltd TEXT COMMENT 'Observation.Category.Coding.UserSelected',
Obsrvtn_Ctgry_Cdg_Vrsn TEXT COMMENT 'Observation.Category.Coding.Version',
Obsrvtn_Ctgry_Txt TEXT COMMENT 'Observation.Category.Text',
Obsrvtn_Cd_Cdg_Cd TEXT COMMENT 'Observation.Code.Coding.Code',
Obsrvtn_Cd_Cdg_Dsply TEXT COMMENT 'Observation.Code.Coding.Display',
Obsrvtn_Cd_Cdg_Sys TEXT COMMENT 'Observation.Code.Coding.System',
Obsrvtn_Cd_Cdg_UsrSltd TEXT COMMENT 'Observation.Code.Coding.UserSelected',
Obsrvtn_Cd_Cdg_Vrsn TEXT COMMENT 'Observation.Code.Coding.Version',
Obsrvtn_Cd_Txt TEXT COMMENT 'Observation.Code.Text',
Obsrvtn_Cmpnt_Cd_Cdg_Cd TEXT COMMENT 'Observation.Component.Code.Coding.Code',
Obsrvtn_Cmpnt_Cd_Cdg_Dsply TEXT COMMENT 'Observation.Component.Code.Coding.Display',
Obsrvtn_Cmpnt_Cd_Cdg_Sys TEXT COMMENT 'Observation.Component.Code.Coding.System',
Obsrvtn_Cmpnt_Cd_Cdg_UsrSltd TEXT COMMENT 'Observation.Component.Code.Coding.UserSelected',
Obsrvtn_Cmpnt_Cd_Cdg_Vrsn TEXT COMMENT 'Observation.Component.Code.Coding.Version',
Obsrvtn_Cmpnt_Cd_Txt TEXT COMMENT 'Observation.Component.Code.Text',
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Cd TEXT COMMENT 'Observation.Component.DataAbsentReason.Coding.Code',
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Dsply TEXT COMMENT 'Observation.Component.DataAbsentReason.Coding.Display',
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Sys TEXT COMMENT 'Observation.Component.DataAbsentReason.Coding.System',
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_UsrSltd TEXT COMMENT 'Observation.Component.DataAbsentReason.Coding.UserSelected',
Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Vrsn TEXT COMMENT 'Observation.Component.DataAbsentReason.Coding.Version',
Obsrvtn_Cmpnt_DataAbsentRsn_Txt TEXT COMMENT 'Observation.Component.DataAbsentReason.Text',
Obsrvtn_Cmpnt_Interpretation_Cdg_Cd TEXT COMMENT 'Observation.Component.Interpretation.Coding.Code',
Obsrvtn_Cmpnt_Interpretation_Cdg_Dsply TEXT COMMENT 'Observation.Component.Interpretation.Coding.Display',
Obsrvtn_Cmpnt_Interpretation_Cdg_Sys TEXT COMMENT 'Observation.Component.Interpretation.Coding.System',
Obsrvtn_Cmpnt_Interpretation_Cdg_UsrSltd TEXT COMMENT 'Observation.Component.Interpretation.Coding.UserSelected',
Obsrvtn_Cmpnt_Interpretation_Cdg_Vrsn TEXT COMMENT 'Observation.Component.Interpretation.Coding.Version',
Obsrvtn_Cmpnt_Interpretation_Txt TEXT COMMENT 'Observation.Component.Interpretation.Text',
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cd TEXT COMMENT 'Observation.Component.ReferenceRange.Age.High.Code',
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cmprtr TEXT COMMENT 'Observation.Component.ReferenceRange.Age.High.Comparator',
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Sys TEXT COMMENT 'Observation.Component.ReferenceRange.Age.High.System',
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Unt TEXT COMMENT 'Observation.Component.ReferenceRange.Age.High.Unit',
Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Vl TEXT COMMENT 'Observation.Component.ReferenceRange.Age.High.Value',
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cd TEXT COMMENT 'Observation.Component.ReferenceRange.Age.Low.Code',
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cmprtr TEXT COMMENT 'Observation.Component.ReferenceRange.Age.Low.Comparator',
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Sys TEXT COMMENT 'Observation.Component.ReferenceRange.Age.Low.System',
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Unt TEXT COMMENT 'Observation.Component.ReferenceRange.Age.Low.Unit',
Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Vl TEXT COMMENT 'Observation.Component.ReferenceRange.Age.Low.Value',
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Cd TEXT COMMENT 'Observation.Component.ReferenceRange.AppliesTo.Coding.Code',
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Dsply TEXT COMMENT 'Observation.Component.ReferenceRange.AppliesTo.Coding.Display',
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Sys TEXT COMMENT 'Observation.Component.ReferenceRange.AppliesTo.Coding.System',
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_UsrSltd TEXT COMMENT 'Observation.Component.ReferenceRange.AppliesTo.Coding.UserSelected',
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Vrsn TEXT COMMENT 'Observation.Component.ReferenceRange.AppliesTo.Coding.Version',
Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Txt TEXT COMMENT 'Observation.Component.ReferenceRange.AppliesTo.Text',
Obsrvtn_Cmpnt_RfrncRng_Hi_Cd TEXT COMMENT 'Observation.Component.ReferenceRange.High.Code',
Obsrvtn_Cmpnt_RfrncRng_Hi_Cmprtr TEXT COMMENT 'Observation.Component.ReferenceRange.High.Comparator',
Obsrvtn_Cmpnt_RfrncRng_Hi_Sys TEXT COMMENT 'Observation.Component.ReferenceRange.High.System',
Obsrvtn_Cmpnt_RfrncRng_Hi_Unt TEXT COMMENT 'Observation.Component.ReferenceRange.High.Unit',
Obsrvtn_Cmpnt_RfrncRng_Hi_Vl TEXT COMMENT 'Observation.Component.ReferenceRange.High.Value',
Obsrvtn_Cmpnt_RfrncRng_Lw_Cd TEXT COMMENT 'Observation.Component.ReferenceRange.Low.Code',
Obsrvtn_Cmpnt_RfrncRng_Lw_Cmprtr TEXT COMMENT 'Observation.Component.ReferenceRange.Low.Comparator',
Obsrvtn_Cmpnt_RfrncRng_Lw_Sys TEXT COMMENT 'Observation.Component.ReferenceRange.Low.System',
Obsrvtn_Cmpnt_RfrncRng_Lw_Unt TEXT COMMENT 'Observation.Component.ReferenceRange.Low.Unit',
Obsrvtn_Cmpnt_RfrncRng_Lw_Vl TEXT COMMENT 'Observation.Component.ReferenceRange.Low.Value',
Obsrvtn_Cmpnt_RfrncRng_Txt TEXT COMMENT 'Observation.Component.ReferenceRange.Text',
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Cd TEXT COMMENT 'Observation.Component.ReferenceRange.Type.Coding.Code',
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Dsply TEXT COMMENT 'Observation.Component.ReferenceRange.Type.Coding.Display',
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Sys TEXT COMMENT 'Observation.Component.ReferenceRange.Type.Coding.System',
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_UsrSltd TEXT COMMENT 'Observation.Component.ReferenceRange.Type.Coding.UserSelected',
Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Vrsn TEXT COMMENT 'Observation.Component.ReferenceRange.Type.Coding.Version',
Obsrvtn_Cmpnt_RfrncRng_Typ_Txt TEXT COMMENT 'Observation.Component.ReferenceRange.Type.Text',
Obsrvtn_Cmpnt_VlBooleanTyp TEXT COMMENT 'Observation.Component.ValueBooleanType',
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Cd TEXT COMMENT 'Observation.Component.ValueCodeableConcept.Coding.Code',
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Dsply TEXT COMMENT 'Observation.Component.ValueCodeableConcept.Coding.Display',
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Sys TEXT COMMENT 'Observation.Component.ValueCodeableConcept.Coding.System',
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'Observation.Component.ValueCodeableConcept.Coding.UserSelected',
Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'Observation.Component.ValueCodeableConcept.Coding.Version',
Obsrvtn_Cmpnt_VlCdbleCncpt_Txt TEXT COMMENT 'Observation.Component.ValueCodeableConcept.Text',
Obsrvtn_Cmpnt_VlDtTimeTyp TEXT COMMENT 'Observation.Component.ValueDateTimeType',
Obsrvtn_Cmpnt_VlIntegerTyp TEXT COMMENT 'Observation.Component.ValueIntegerType',
Obsrvtn_Cmpnt_VlPrd_End TEXT COMMENT 'Observation.Component.ValuePeriod.End',
Obsrvtn_Cmpnt_VlPrd_Strt TEXT COMMENT 'Observation.Component.ValuePeriod.Start',
Obsrvtn_Cmpnt_VlQnty_Cd TEXT COMMENT 'Observation.Component.ValueQuantity.Code',
Obsrvtn_Cmpnt_VlQnty_Cmprtr TEXT COMMENT 'Observation.Component.ValueQuantity.Comparator',
Obsrvtn_Cmpnt_VlQnty_Sys TEXT COMMENT 'Observation.Component.ValueQuantity.System',
Obsrvtn_Cmpnt_VlQnty_Unt TEXT COMMENT 'Observation.Component.ValueQuantity.Unit',
Obsrvtn_Cmpnt_VlQnty_Vl TEXT COMMENT 'Observation.Component.ValueQuantity.Value',
Obsrvtn_Cmpnt_VlRng_Hi_Cd TEXT COMMENT 'Observation.Component.ValueRange.High.Code',
Obsrvtn_Cmpnt_VlRng_Hi_Cmprtr TEXT COMMENT 'Observation.Component.ValueRange.High.Comparator',
Obsrvtn_Cmpnt_VlRng_Hi_Sys TEXT COMMENT 'Observation.Component.ValueRange.High.System',
Obsrvtn_Cmpnt_VlRng_Hi_Unt TEXT COMMENT 'Observation.Component.ValueRange.High.Unit',
Obsrvtn_Cmpnt_VlRng_Hi_Vl TEXT COMMENT 'Observation.Component.ValueRange.High.Value',
Obsrvtn_Cmpnt_VlRng_Lw_Cd TEXT COMMENT 'Observation.Component.ValueRange.Low.Code',
Obsrvtn_Cmpnt_VlRng_Lw_Cmprtr TEXT COMMENT 'Observation.Component.ValueRange.Low.Comparator',
Obsrvtn_Cmpnt_VlRng_Lw_Sys TEXT COMMENT 'Observation.Component.ValueRange.Low.System',
Obsrvtn_Cmpnt_VlRng_Lw_Unt TEXT COMMENT 'Observation.Component.ValueRange.Low.Unit',
Obsrvtn_Cmpnt_VlRng_Lw_Vl TEXT COMMENT 'Observation.Component.ValueRange.Low.Value',
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cd TEXT COMMENT 'Observation.Component.ValueRatio.Denominator.Code',
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cmprtr TEXT COMMENT 'Observation.Component.ValueRatio.Denominator.Comparator',
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Sys TEXT COMMENT 'Observation.Component.ValueRatio.Denominator.System',
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Unt TEXT COMMENT 'Observation.Component.ValueRatio.Denominator.Unit',
Obsrvtn_Cmpnt_VlRtio_Dnmntr_Vl TEXT COMMENT 'Observation.Component.ValueRatio.Denominator.Value',
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cd TEXT COMMENT 'Observation.Component.ValueRatio.Numerator.Code',
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cmprtr TEXT COMMENT 'Observation.Component.ValueRatio.Numerator.Comparator',
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Sys TEXT COMMENT 'Observation.Component.ValueRatio.Numerator.System',
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Unt TEXT COMMENT 'Observation.Component.ValueRatio.Numerator.Unit',
Obsrvtn_Cmpnt_VlRtio_Nmrtr_Vl TEXT COMMENT 'Observation.Component.ValueRatio.Numerator.Value',
Obsrvtn_Cmpnt_VlSampledData_Data TEXT COMMENT 'Observation.Component.ValueSampledData.Data',
Obsrvtn_Cmpnt_VlSampledData_Dimensions TEXT COMMENT 'Observation.Component.ValueSampledData.Dimensions',
Obsrvtn_Cmpnt_VlSampledData_Factor TEXT COMMENT 'Observation.Component.ValueSampledData.Factor',
Obsrvtn_Cmpnt_VlSampledData_LwerLmt TEXT COMMENT 'Observation.Component.ValueSampledData.LowerLimit',
Obsrvtn_Cmpnt_VlSampledData_Origin_Cd TEXT COMMENT 'Observation.Component.ValueSampledData.Origin.Code',
Obsrvtn_Cmpnt_VlSampledData_Origin_Cmprtr TEXT COMMENT 'Observation.Component.ValueSampledData.Origin.Comparator',
Obsrvtn_Cmpnt_VlSampledData_Origin_Sys TEXT COMMENT 'Observation.Component.ValueSampledData.Origin.System',
Obsrvtn_Cmpnt_VlSampledData_Origin_Unt TEXT COMMENT 'Observation.Component.ValueSampledData.Origin.Unit',
Obsrvtn_Cmpnt_VlSampledData_Origin_Vl TEXT COMMENT 'Observation.Component.ValueSampledData.Origin.Value',
Obsrvtn_Cmpnt_VlSampledData_Prd TEXT COMMENT 'Observation.Component.ValueSampledData.Period',
Obsrvtn_Cmpnt_VlSampledData_UpperLmt TEXT COMMENT 'Observation.Component.ValueSampledData.UpperLimit',
Obsrvtn_Cmpnt_VlStrgTyp TEXT COMMENT 'Observation.Component.ValueStringType',
Obsrvtn_Cmpnt_VlTimeTyp TEXT COMMENT 'Observation.Component.ValueTimeType',
Obsrvtn_DataAbsentRsn_Cdg_Cd TEXT COMMENT 'Observation.DataAbsentReason.Coding.Code',
Obsrvtn_DataAbsentRsn_Cdg_Dsply TEXT COMMENT 'Observation.DataAbsentReason.Coding.Display',
Obsrvtn_DataAbsentRsn_Cdg_Sys TEXT COMMENT 'Observation.DataAbsentReason.Coding.System',
Obsrvtn_DataAbsentRsn_Cdg_UsrSltd TEXT COMMENT 'Observation.DataAbsentReason.Coding.UserSelected',
Obsrvtn_DataAbsentRsn_Cdg_Vrsn TEXT COMMENT 'Observation.DataAbsentReason.Coding.Version',
Obsrvtn_DataAbsentRsn_Txt TEXT COMMENT 'Observation.DataAbsentReason.Text',
Obsrvtn_DerivedFrom TEXT COMMENT 'Observation.DerivedFrom',
Obsrvtn_Dvc TEXT COMMENT 'Observation.Device',
Obsrvtn_EfctiveDtTimeTyp TEXT COMMENT 'Observation.EffectiveDateTimeType',
Obsrvtn_EfctiveInstantTyp TEXT COMMENT 'Observation.EffectiveInstantType',
Obsrvtn_EfctivePrd_End TEXT COMMENT 'Observation.EffectivePeriod.End',
Obsrvtn_EfctivePrd_Strt TEXT COMMENT 'Observation.EffectivePeriod.Start',
Obsrvtn_EfctiveTmg_Cd_Cdg_Cd TEXT COMMENT 'Observation.EffectiveTiming.Code.Coding.Code',
Obsrvtn_EfctiveTmg_Cd_Cdg_Dsply TEXT COMMENT 'Observation.EffectiveTiming.Code.Coding.Display',
Obsrvtn_EfctiveTmg_Cd_Cdg_Sys TEXT COMMENT 'Observation.EffectiveTiming.Code.Coding.System',
Obsrvtn_EfctiveTmg_Cd_Cdg_UsrSltd TEXT COMMENT 'Observation.EffectiveTiming.Code.Coding.UserSelected',
Obsrvtn_EfctiveTmg_Cd_Cdg_Vrsn TEXT COMMENT 'Observation.EffectiveTiming.Code.Coding.Version',
Obsrvtn_EfctiveTmg_Cd_Txt TEXT COMMENT 'Observation.EffectiveTiming.Code.Text',
Obsrvtn_EfctiveTmg_Evnt TEXT COMMENT 'Observation.EffectiveTiming.Event',
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cd TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsDuration.Code',
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cmprtr TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsDuration.Comparator',
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Sys TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsDuration.System',
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Unt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsDuration.Unit',
Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Vl TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsDuration.Value',
Obsrvtn_EfctiveTmg_Rpt_BndsPrd_End TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsPeriod.End',
Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsPeriod.Start',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cd TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.High.Code',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cmprtr TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.High.Comparator',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Sys TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.High.System',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Unt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.High.Unit',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Vl TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.High.Value',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cd TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.Low.Code',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cmprtr TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.Low.Comparator',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Sys TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.Low.System',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Unt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.Low.Unit',
Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Vl TEXT COMMENT 'Observation.EffectiveTiming.Repeat.BoundsRange.Low.Value', 
Obsrvtn_EfctiveTmg_Rpt_DayOfWeek TEXT COMMENT 'Observation.EffectiveTiming.Repeat.DayOfWeek',
Obsrvtn_EfctiveTmg_Rpt_When TEXT COMMENT 'Observation.EffectiveTiming.Repeat.When',
Obsrvtn_EfctiveTmg_Rpt_Cnt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.Count',
Obsrvtn_EfctiveTmg_Rpt_CntMx TEXT COMMENT 'Observation.EffectiveTiming.Repeat.CountMax',
Obsrvtn_EfctiveTmg_Rpt_Duration TEXT COMMENT 'Observation.EffectiveTiming.Repeat.Duration',
Obsrvtn_EfctiveTmg_Rpt_DurationMx TEXT COMMENT 'Observation.EffectiveTiming.Repeat.DurationMax',
Obsrvtn_EfctiveTmg_Rpt_DurationUnt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.DurationUnit',
Obsrvtn_EfctiveTmg_Rpt_Frqncy TEXT COMMENT 'Observation.EffectiveTiming.Repeat.Frequency',
Obsrvtn_EfctiveTmg_Rpt_FrqncyMx TEXT COMMENT 'Observation.EffectiveTiming.Repeat.FrequencyMax',
Obsrvtn_EfctiveTmg_Rpt_Off TEXT COMMENT 'Observation.EffectiveTiming.Repeat.Offset',
Obsrvtn_EfctiveTmg_Rpt_Prd TEXT COMMENT 'Observation.EffectiveTiming.Repeat.Period',
Obsrvtn_EfctiveTmg_Rpt_PrdMx TEXT COMMENT 'Observation.EffectiveTiming.Repeat.PeriodMax',
Obsrvtn_EfctiveTmg_Rpt_PrdUnt TEXT COMMENT 'Observation.EffectiveTiming.Repeat.PeriodUnit',
Obsrvtn_EfctiveTmg_Rpt_TimeOfDay TEXT COMMENT 'Observation.EffectiveTiming.Repeat.TimeOfDay',
Obsrvtn_Enc TEXT COMMENT 'Observation.Encounter',
Obsrvtn_Focus TEXT COMMENT 'Observation.Focus',
Obsrvtn_HasMmbr TEXT COMMENT 'Observation.HasMember',
Obsrvtn_Id_Assigner TEXT COMMENT 'Observation.Identifier.Assigner',
Obsrvtn_Id_Prd_End TEXT COMMENT 'Observation.Identifier.Period.End',
Obsrvtn_Id_Prd_Strt TEXT COMMENT 'Observation.Identifier.Period.Start',
Obsrvtn_Id_Sys TEXT COMMENT 'Observation.Identifier.System',
Obsrvtn_Id_Typ_Cdg_Cd TEXT COMMENT 'Observation.Identifier.Type.Coding.Code',
Obsrvtn_Id_Typ_Cdg_Dsply TEXT COMMENT 'Observation.Identifier.Type.Coding.Display',
Obsrvtn_Id_Typ_Cdg_Sys TEXT COMMENT 'Observation.Identifier.Type.Coding.System',
Obsrvtn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'Observation.Identifier.Type.Coding.UserSelected',
Obsrvtn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'Observation.Identifier.Type.Coding.Version',
Obsrvtn_Id_Typ_Txt TEXT COMMENT 'Observation.Identifier.Type.Text',
Obsrvtn_Id_Use TEXT COMMENT 'Observation.Identifier.Use',
Obsrvtn_Id_Vl TEXT COMMENT 'Observation.Identifier.Value',
Obsrvtn_Interpretation_Cdg_Cd TEXT COMMENT 'Observation.Interpretation.Coding.Code',
Obsrvtn_Interpretation_Cdg_Dsply TEXT COMMENT 'Observation.Interpretation.Coding.Display',
Obsrvtn_Interpretation_Cdg_Sys TEXT COMMENT 'Observation.Interpretation.Coding.System',
Obsrvtn_Interpretation_Cdg_UsrSltd TEXT COMMENT 'Observation.Interpretation.Coding.UserSelected',
Obsrvtn_Interpretation_Cdg_Vrsn TEXT COMMENT 'Observation.Interpretation.Coding.Version',
Obsrvtn_Interpretation_Txt TEXT COMMENT 'Observation.Interpretation.Text',
Obsrvtn_Issued TEXT COMMENT 'Observation.Issued',
Obsrvtn_Mthd_Cdg_Cd TEXT COMMENT 'Observation.Method.Coding.Code',
Obsrvtn_Mthd_Cdg_Dsply TEXT COMMENT 'Observation.Method.Coding.Display',
Obsrvtn_Mthd_Cdg_Sys TEXT COMMENT 'Observation.Method.Coding.System',
Obsrvtn_Mthd_Cdg_UsrSltd TEXT COMMENT 'Observation.Method.Coding.UserSelected',
Obsrvtn_Mthd_Cdg_Vrsn TEXT COMMENT 'Observation.Method.Coding.Version',
Obsrvtn_Mthd_Txt TEXT COMMENT 'Observation.Method.Text',
Obsrvtn_Nt_AthrRfrnc TEXT COMMENT 'Observation.Note.AuthorReference',
Obsrvtn_Nt_AthrStrgTyp TEXT COMMENT 'Observation.Note.AuthorStringType',
Obsrvtn_Nt_Txt TEXT COMMENT 'Observation.Note.Text',
Obsrvtn_Nt_Time TEXT COMMENT 'Observation.Note.Time',
Obsrvtn_PartOf TEXT COMMENT 'Observation.PartOf',
Obsrvtn_Prfrmr TEXT COMMENT 'Observation.Performer',
Obsrvtn_RfrncRng_Age_Hi_Cd TEXT COMMENT 'Observation.ReferenceRange.Age.High.Code',
Obsrvtn_RfrncRng_Age_Hi_Cmprtr TEXT COMMENT 'Observation.ReferenceRange.Age.High.Comparator',
Obsrvtn_RfrncRng_Age_Hi_Sys TEXT COMMENT 'Observation.ReferenceRange.Age.High.System',
Obsrvtn_RfrncRng_Age_Hi_Unt TEXT COMMENT 'Observation.ReferenceRange.Age.High.Unit',
Obsrvtn_RfrncRng_Age_Hi_Vl TEXT COMMENT 'Observation.ReferenceRange.Age.High.Value',
Obsrvtn_RfrncRng_Age_Lw_Cd TEXT COMMENT 'Observation.ReferenceRange.Age.Low.Code',
Obsrvtn_RfrncRng_Age_Lw_Cmprtr TEXT COMMENT 'Observation.ReferenceRange.Age.Low.Comparator',
Obsrvtn_RfrncRng_Age_Lw_Sys TEXT COMMENT 'Observation.ReferenceRange.Age.Low.System',
Obsrvtn_RfrncRng_Age_Lw_Unt TEXT COMMENT 'Observation.ReferenceRange.Age.Low.Unit',
Obsrvtn_RfrncRng_Age_Lw_Vl TEXT COMMENT 'Observation.ReferenceRange.Age.Low.Value',
Obsrvtn_RfrncRng_AppliesTo_Cdg_Cd TEXT COMMENT 'Observation.ReferenceRange.AppliesTo.Coding.Code',
Obsrvtn_RfrncRng_AppliesTo_Cdg_Dsply TEXT COMMENT 'Observation.ReferenceRange.AppliesTo.Coding.Display',
Obsrvtn_RfrncRng_AppliesTo_Cdg_Sys TEXT COMMENT 'Observation.ReferenceRange.AppliesTo.Coding.System',
Obsrvtn_RfrncRng_AppliesTo_Cdg_UsrSltd TEXT COMMENT 'Observation.ReferenceRange.AppliesTo.Coding.UserSelected',
Obsrvtn_RfrncRng_AppliesTo_Cdg_Vrsn TEXT COMMENT 'Observation.ReferenceRange.AppliesTo.Coding.Version',
Obsrvtn_RfrncRng_AppliesTo_Txt TEXT COMMENT 'Observation.ReferenceRange.AppliesTo.Text',
Obsrvtn_RfrncRng_Hi_Cd TEXT COMMENT 'Observation.ReferenceRange.High.Code',
Obsrvtn_RfrncRng_Hi_Cmprtr TEXT COMMENT 'Observation.ReferenceRange.High.Comparator',
Obsrvtn_RfrncRng_Hi_Sys TEXT COMMENT 'Observation.ReferenceRange.High.System',
Obsrvtn_RfrncRng_Hi_Unt TEXT COMMENT 'Observation.ReferenceRange.High.Unit',
Obsrvtn_RfrncRng_Hi_Vl TEXT COMMENT 'Observation.ReferenceRange.High.Value',
Obsrvtn_RfrncRng_Lw_Cd TEXT COMMENT 'Observation.ReferenceRange.Low.Code',
Obsrvtn_RfrncRng_Lw_Cmprtr TEXT COMMENT 'Observation.ReferenceRange.Low.Comparator',
Obsrvtn_RfrncRng_Lw_Sys TEXT COMMENT 'Observation.ReferenceRange.Low.System',
Obsrvtn_RfrncRng_Lw_Unt TEXT COMMENT 'Observation.ReferenceRange.Low.Unit',
Obsrvtn_RfrncRng_Lw_Vl TEXT COMMENT 'Observation.ReferenceRange.Low.Value',
Obsrvtn_RfrncRng_Txt TEXT COMMENT 'Observation.ReferenceRange.Text',
Obsrvtn_RfrncRng_Typ_Cdg_Cd TEXT COMMENT 'Observation.ReferenceRange.Type.Coding.Code',
Obsrvtn_RfrncRng_Typ_Cdg_Dsply TEXT COMMENT 'Observation.ReferenceRange.Type.Coding.Display',
Obsrvtn_RfrncRng_Typ_Cdg_Sys TEXT COMMENT 'Observation.ReferenceRange.Type.Coding.System',
Obsrvtn_RfrncRng_Typ_Cdg_UsrSltd TEXT COMMENT 'Observation.ReferenceRange.Type.Coding.UserSelected',
Obsrvtn_RfrncRng_Typ_Cdg_Vrsn TEXT COMMENT 'Observation.ReferenceRange.Type.Coding.Version',
Obsrvtn_RfrncRng_Typ_Txt TEXT COMMENT 'Observation.ReferenceRange.Type.Text',
Obsrvtn_Spcmn TEXT COMMENT 'Observation.Specimen',
Obsrvtn_Sts TEXT COMMENT 'Observation.Status',
Obsrvtn_Sbjct TEXT COMMENT 'Observation.Subject',
Obsrvtn_VlBooleanTyp TEXT COMMENT 'Observation.ValueBooleanType',
Obsrvtn_VlCdbleCncpt_Cdg_Cd TEXT COMMENT 'Observation.ValueCodeableConcept.Coding.Code',
Obsrvtn_VlCdbleCncpt_Cdg_Dsply TEXT COMMENT 'Observation.ValueCodeableConcept.Coding.Display',
Obsrvtn_VlCdbleCncpt_Cdg_Sys TEXT COMMENT 'Observation.ValueCodeableConcept.Coding.System',
Obsrvtn_VlCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'Observation.ValueCodeableConcept.Coding.UserSelected',
Obsrvtn_VlCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'Observation.ValueCodeableConcept.Coding.Version',
Obsrvtn_VlCdbleCncpt_Txt TEXT COMMENT 'Observation.ValueCodeableConcept.Text',
Obsrvtn_VlDtTimeTyp TEXT COMMENT 'Observation.ValueDateTimeType',
Obsrvtn_VlIntegerTyp TEXT COMMENT 'Observation.ValueIntegerType',
Obsrvtn_VlPrd_End TEXT COMMENT 'Observation.ValuePeriod.End',
Obsrvtn_VlPrd_Strt TEXT COMMENT 'Observation.ValuePeriod.Start',
Obsrvtn_VlQnty_Cd TEXT COMMENT 'Observation.ValueQuantity.Code',
Obsrvtn_VlQnty_Cmprtr TEXT COMMENT 'Observation.ValueQuantity.Comparator',
Obsrvtn_VlQnty_Sys TEXT COMMENT 'Observation.ValueQuantity.System',
Obsrvtn_VlQnty_Unt TEXT COMMENT 'Observation.ValueQuantity.Unit',
Obsrvtn_VlQnty_Vl TEXT COMMENT 'Observation.ValueQuantity.Value',
Obsrvtn_VlRng_Hi_Cd TEXT COMMENT 'Observation.ValueRange.High.Code',
Obsrvtn_VlRng_Hi_Cmprtr TEXT COMMENT 'Observation.ValueRange.High.Comparator',
Obsrvtn_VlRng_Hi_Sys TEXT COMMENT 'Observation.ValueRange.High.System',
Obsrvtn_VlRng_Hi_Unt TEXT COMMENT 'Observation.ValueRange.High.Unit',
Obsrvtn_VlRng_Hi_Vl TEXT COMMENT 'Observation.ValueRange.High.Value',
Obsrvtn_VlRng_Lw_Cd TEXT COMMENT 'Observation.ValueRange.Low.Code',
Obsrvtn_VlRng_Lw_Cmprtr TEXT COMMENT 'Observation.ValueRange.Low.Comparator',
Obsrvtn_VlRng_Lw_Sys TEXT COMMENT 'Observation.ValueRange.Low.System',
Obsrvtn_VlRng_Lw_Unt TEXT COMMENT 'Observation.ValueRange.Low.Unit',
Obsrvtn_VlRng_Lw_Vl TEXT COMMENT 'Observation.ValueRange.Low.Value',
Obsrvtn_VlRtio_Dnmntr_Cd TEXT COMMENT 'Observation.ValueRatio.Denominator.Code',
Obsrvtn_VlRtio_Dnmntr_Cmprtr TEXT COMMENT 'Observation.ValueRatio.Denominator.Comparator',
Obsrvtn_VlRtio_Dnmntr_Sys TEXT COMMENT 'Observation.ValueRatio.Denominator.System',
Obsrvtn_VlRtio_Dnmntr_Unt TEXT COMMENT 'Observation.ValueRatio.Denominator.Unit',
Obsrvtn_VlRtio_Dnmntr_Vl TEXT COMMENT 'Observation.ValueRatio.Denominator.Value',
Obsrvtn_VlRtio_Nmrtr_Cd TEXT COMMENT 'Observation.ValueRatio.Numerator.Code',
Obsrvtn_VlRtio_Nmrtr_Cmprtr TEXT COMMENT 'Observation.ValueRatio.Numerator.Comparator',
Obsrvtn_VlRtio_Nmrtr_Sys TEXT COMMENT 'Observation.ValueRatio.Numerator.System',
Obsrvtn_VlRtio_Nmrtr_Unt TEXT COMMENT 'Observation.ValueRatio.Numerator.Unit',
Obsrvtn_VlRtio_Nmrtr_Vl TEXT COMMENT 'Observation.ValueRatio.Numerator.Value',
Obsrvtn_VlSampledData_Data TEXT COMMENT 'Observation.ValueSampledData.Data',
Obsrvtn_VlSampledData_Dimensions TEXT COMMENT 'Observation.ValueSampledData.Dimensions',
Obsrvtn_VlSampledData_Factor TEXT COMMENT 'Observation.ValueSampledData.Factor',
Obsrvtn_VlSampledData_LwerLmt TEXT COMMENT 'Observation.ValueSampledData.LowerLimit',
Obsrvtn_VlSampledData_Origin_Cd TEXT COMMENT 'Observation.ValueSampledData.Origin.Code',
Obsrvtn_VlSampledData_Origin_Cmprtr TEXT COMMENT 'Observation.ValueSampledData.Origin.Comparator',
Obsrvtn_VlSampledData_Origin_Sys TEXT COMMENT 'Observation.ValueSampledData.Origin.System',
Obsrvtn_VlSampledData_Origin_Unt TEXT COMMENT 'Observation.ValueSampledData.Origin.Unit',
Obsrvtn_VlSampledData_Origin_Vl TEXT COMMENT 'Observation.ValueSampledData.Origin.Value',
Obsrvtn_VlSampledData_Prd TEXT COMMENT 'Observation.ValueSampledData.Period',
Obsrvtn_VlSampledData_UpperLmt TEXT COMMENT 'Observation.ValueSampledData.UpperLimit',
Obsrvtn_VlStrgTyp TEXT COMMENT 'Observation.ValueStringType',
Obsrvtn_VlTimeTyp TEXT COMMENT 'Observation.ValueTimeType',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;