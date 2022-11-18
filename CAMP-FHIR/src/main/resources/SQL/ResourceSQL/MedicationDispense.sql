drop table if exists `MedicationDispense`;
CREATE TABLE `MedicationDispense` (
 id varchar(64),
MdctnDispns_AthrizingPrescription TEXT COMMENT 'MedicationDispense.AuthorizingPrescription',
MdctnDispns_Ctgry_Cdg_Cd TEXT COMMENT 'MedicationDispense.Category.Coding.Code',
MdctnDispns_Ctgry_Cdg_Dsply TEXT COMMENT 'MedicationDispense.Category.Coding.Display',
MdctnDispns_Ctgry_Cdg_Sys TEXT COMMENT 'MedicationDispense.Category.Coding.System',
MdctnDispns_Ctgry_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.Category.Coding.UserSelected',
MdctnDispns_Ctgry_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.Category.Coding.Version',
MdctnDispns_Ctgry_Txt TEXT COMMENT 'MedicationDispense.Category.Text',
MdctnDispns_Cntxt TEXT COMMENT 'MedicationDispense.Context',
MdctnDispns_DaysSpply_Cd TEXT COMMENT 'MedicationDispense.DaysSupply.Code',
MdctnDispns_DaysSpply_Cmprtr TEXT COMMENT 'MedicationDispense.DaysSupply.Comparator',
MdctnDispns_DaysSpply_Sys TEXT COMMENT 'MedicationDispense.DaysSupply.System',
MdctnDispns_DaysSpply_Unt TEXT COMMENT 'MedicationDispense.DaysSupply.Unit',
MdctnDispns_DaysSpply_Vl TEXT COMMENT 'MedicationDispense.DaysSupply.Value',
MdctnDispns_Destination TEXT COMMENT 'MedicationDispense.Destination',
MdctnDispns_DetectedIssue TEXT COMMENT 'MedicationDispense.DetectedIssue',
MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.AdditionalInstruction.Coding.Code',
MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.AdditionalInstruction.Coding.Display',
MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.AdditionalInstruction.Coding.System',
MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.AdditionalInstruction.Coding.UserSelected',
MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.AdditionalInstruction.Coding.Version',
MdctnDispns_DsgInstrctn_AddtnlInstrctn_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.AdditionalInstruction.Text',
MdctnDispns_DsgInstrctn_AsNdBooleanTyp TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededBooleanType',
MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededCodeableConcept.Coding.Code',
MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededCodeableConcept.Coding.Display',
MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededCodeableConcept.Coding.System',
MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededCodeableConcept.Coding.UserSelected',
MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededCodeableConcept.Coding.Version',
MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.AsNeededCodeableConcept.Text',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseQuantity.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseQuantity.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseQuantity.System',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseQuantity.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseQuantity.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.High.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.High.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.High.System',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.High.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.High.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.Low.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.Low.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.Low.System',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.Low.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.DoseRange.Low.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateQuantity.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateQuantity.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateQuantity.System',
MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateQuantity.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateQuantity.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.High.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.High.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.High.System',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.High.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.High.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.Low.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.Low.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.Low.System',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.Low.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRange.Low.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Denominator.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Denominator.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Denominator.System',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Denominator.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Denominator.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Numerator.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Numerator.Comparator',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Numerator.System',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Numerator.Unit',
MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.RateRatio.Numerator.Value',
MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.Type.Coding.Code',
MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.Type.Coding.Display',
MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.Type.Coding.System',
MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.Type.Coding.UserSelected',
MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.Type.Coding.Version',
MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.DoseAndRate.Type.Text',
MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerAdministration.Code',
MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerAdministration.Comparator',
MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerAdministration.System',
MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerAdministration.Unit',
MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerAdministration.Value',
MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerLifetime.Code',
MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerLifetime.Comparator',
MdctnDispns_DsgInstrctn_MxDosePerLifetime_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerLifetime.System',
MdctnDispns_DsgInstrctn_MxDosePerLifetime_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerLifetime.Unit',
MdctnDispns_DsgInstrctn_MxDosePerLifetime_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerLifetime.Value',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Denominator.Code',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Denominator.Comparator',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Denominator.System',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Denominator.Unit',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Denominator.Value',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Numerator.Code',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Numerator.Comparator',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Numerator.System',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Numerator.Unit',
MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.MaxDosePerPeriod.Numerator.Value',
MdctnDispns_DsgInstrctn_Mthd_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Method.Coding.Code',
MdctnDispns_DsgInstrctn_Mthd_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.Method.Coding.Display',
MdctnDispns_DsgInstrctn_Mthd_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Method.Coding.System',
MdctnDispns_DsgInstrctn_Mthd_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.Method.Coding.UserSelected',
MdctnDispns_DsgInstrctn_Mthd_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.Method.Coding.Version',
MdctnDispns_DsgInstrctn_Mthd_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.Method.Text',
MdctnDispns_DsgInstrctn_PntInstrctn TEXT COMMENT 'MedicationDispense.DosageInstruction.PatientInstruction',
MdctnDispns_DsgInstrctn_Route_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Route.Coding.Code',
MdctnDispns_DsgInstrctn_Route_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.Route.Coding.Display',
MdctnDispns_DsgInstrctn_Route_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Route.Coding.System',
MdctnDispns_DsgInstrctn_Route_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.Route.Coding.UserSelected',
MdctnDispns_DsgInstrctn_Route_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.Route.Coding.Version',
MdctnDispns_DsgInstrctn_Route_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.Route.Text',
MdctnDispns_DsgInstrctn_Sqnc TEXT COMMENT 'MedicationDispense.DosageInstruction.Sequence',
MdctnDispns_DsgInstrctn_Site_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Site.Coding.Code',
MdctnDispns_DsgInstrctn_Site_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.Site.Coding.Display',
MdctnDispns_DsgInstrctn_Site_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Site.Coding.System',
MdctnDispns_DsgInstrctn_Site_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.Site.Coding.UserSelected',
MdctnDispns_DsgInstrctn_Site_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.Site.Coding.Version',
MdctnDispns_DsgInstrctn_Site_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.Site.Text',
MdctnDispns_DsgInstrctn_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.Text',
MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Code.Coding.Code',
MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Dsply TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Code.Coding.Display',
MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Code.Coding.System',
MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Code.Coding.UserSelected',
MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Code.Coding.Version',
MdctnDispns_DsgInstrctn_Tmg_Cd_Txt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Code.Text',
MdctnDispns_DsgInstrctn_Tmg_Evnt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Event',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsDuration.Code',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsDuration.Comparator',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsDuration.System',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsDuration.Unit',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsDuration.Value',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_End TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsPeriod.End',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsPeriod.Start',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.High.Code',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.High.Comparator',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.High.System',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.High.Unit',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.High.Value',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.Low.Code',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cmprtr TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.Low.Comparator',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.Low.System',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.Low.Unit',
MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.BoundsRange.Low.Value',
MdctnDispns_DsgInstrctn_Tmg_Rpt_Cnt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.Count',
MdctnDispns_DsgInstrctn_Tmg_Rpt_CntMx TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.CountMax',
MdctnDispns_DsgInstrctn_Tmg_Rpt_Duration TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.Duration',
MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationMx TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.DurationMax',
MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationUnt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.DurationUnit',
MdctnDispns_DsgInstrctn_Tmg_Rpt_Frqncy TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.Frequency',
MdctnDispns_DsgInstrctn_Tmg_Rpt_FrqncyMx TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.FrequencyMax',
MdctnDispns_DsgInstrctn_Tmg_Rpt_Off TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.Offset',
MdctnDispns_DsgInstrctn_Tmg_Rpt_Prd TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.Period',
MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdMx TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.PeriodMax',
MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdUnt TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.PeriodUnit',
MdctnDispns_DsgInstrctn_Tmg_Rpt_TimeOfDay TEXT COMMENT 'MedicationDispense.DosageInstruction.Timing.Repeat.TimeOfDay',
MdctnDispns_EvntHis TEXT COMMENT 'MedicationDispense.EventHistory',
MdctnDispns_Id_Assigner TEXT COMMENT 'MedicationDispense.Identifier.Assigner',
MdctnDispns_Id_Prd_End TEXT COMMENT 'MedicationDispense.Identifier.Period.End',
MdctnDispns_Id_Prd_Strt TEXT COMMENT 'MedicationDispense.Identifier.Period.Start',
MdctnDispns_Id_Sys TEXT COMMENT 'MedicationDispense.Identifier.System',
MdctnDispns_Id_Typ_Cdg_Cd TEXT COMMENT 'MedicationDispense.Identifier.Type.Coding.Code',
MdctnDispns_Id_Typ_Cdg_Dsply TEXT COMMENT 'MedicationDispense.Identifier.Type.Coding.Display',
MdctnDispns_Id_Typ_Cdg_Sys TEXT COMMENT 'MedicationDispense.Identifier.Type.Coding.System',
MdctnDispns_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.Identifier.Type.Coding.UserSelected',
MdctnDispns_Id_Typ_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.Identifier.Type.Coding.Version',
MdctnDispns_Id_Typ_Txt TEXT COMMENT 'MedicationDispense.Identifier.Type.Text',
MdctnDispns_Id_Use TEXT COMMENT 'MedicationDispense.Identifier.Use',
MdctnDispns_Id_Vl TEXT COMMENT 'MedicationDispense.Identifier.Value',
MdctnDispns_Lctn TEXT COMMENT 'MedicationDispense.Location',
MdctnDispns_MdctnCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicationDispense.MedicationCodeableConcept.Coding.Code',
MdctnDispns_MdctnCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicationDispense.MedicationCodeableConcept.Coding.Display',
MdctnDispns_MdctnCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicationDispense.MedicationCodeableConcept.Coding.System',
MdctnDispns_MdctnCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.MedicationCodeableConcept.Coding.UserSelected',
MdctnDispns_MdctnCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.MedicationCodeableConcept.Coding.Version',
MdctnDispns_MdctnCdbleCncpt_Txt TEXT COMMENT 'MedicationDispense.MedicationCodeableConcept.Text',
MdctnDispns_MdctnRfrnc TEXT COMMENT 'MedicationDispense.MedicationReference',
MdctnDispns_Nt_AthrRfrnc TEXT COMMENT 'MedicationDispense.Note.AuthorReference',
MdctnDispns_Nt_AthrStrgTyp TEXT COMMENT 'MedicationDispense.Note.AuthorStringType',
MdctnDispns_Nt_Txt TEXT COMMENT 'MedicationDispense.Note.Text',
MdctnDispns_Nt_Time TEXT COMMENT 'MedicationDispense.Note.Time',
MdctnDispns_PartOf TEXT COMMENT 'MedicationDispense.PartOf',
MdctnDispns_Prfrmr_Actor TEXT COMMENT 'MedicationDispense.Performer.Actor',
MdctnDispns_Prfrmr_Function_Cdg_Cd TEXT COMMENT 'MedicationDispense.Performer.Function.Coding.Code',
MdctnDispns_Prfrmr_Function_Cdg_Dsply TEXT COMMENT 'MedicationDispense.Performer.Function.Coding.Display',
MdctnDispns_Prfrmr_Function_Cdg_Sys TEXT COMMENT 'MedicationDispense.Performer.Function.Coding.System',
MdctnDispns_Prfrmr_Function_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.Performer.Function.Coding.UserSelected',
MdctnDispns_Prfrmr_Function_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.Performer.Function.Coding.Version',
MdctnDispns_Prfrmr_Function_Txt TEXT COMMENT 'MedicationDispense.Performer.Function.Text',
MdctnDispns_Qnty_Cd TEXT COMMENT 'MedicationDispense.Quantity.Code',
MdctnDispns_Qnty_Cmprtr TEXT COMMENT 'MedicationDispense.Quantity.Comparator',
MdctnDispns_Qnty_Sys TEXT COMMENT 'MedicationDispense.Quantity.System',
MdctnDispns_Qnty_Unt TEXT COMMENT 'MedicationDispense.Quantity.Unit',
MdctnDispns_Qnty_Vl TEXT COMMENT 'MedicationDispense.Quantity.Value',
MdctnDispns_Receiver TEXT COMMENT 'MedicationDispense.Receiver',
MdctnDispns_Sts TEXT COMMENT 'MedicationDispense.Status',
MdctnDispns_StsRsnCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicationDispense.StatusReasonCodeableConcept.Coding.Code',
MdctnDispns_StsRsnCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicationDispense.StatusReasonCodeableConcept.Coding.Display',
MdctnDispns_StsRsnCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicationDispense.StatusReasonCodeableConcept.Coding.System',
MdctnDispns_StsRsnCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.StatusReasonCodeableConcept.Coding.UserSelected',
MdctnDispns_StsRsnCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.StatusReasonCodeableConcept.Coding.Version',
MdctnDispns_StsRsnCdbleCncpt_Txt TEXT COMMENT 'MedicationDispense.StatusReasonCodeableConcept.Text',
MdctnDispns_StsRsnRfrnc TEXT COMMENT 'MedicationDispense.StatusReasonReference',
MdctnDispns_Sbjct TEXT COMMENT 'MedicationDispense.Subject',
MdctnDispns_Substitution_Rsn_Cdg_Cd TEXT COMMENT 'MedicationDispense.Substitution.Reason.Coding.Code',
MdctnDispns_Substitution_Rsn_Cdg_Dsply TEXT COMMENT 'MedicationDispense.Substitution.Reason.Coding.Display',
MdctnDispns_Substitution_Rsn_Cdg_Sys TEXT COMMENT 'MedicationDispense.Substitution.Reason.Coding.System',
MdctnDispns_Substitution_Rsn_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.Substitution.Reason.Coding.UserSelected',
MdctnDispns_Substitution_Rsn_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.Substitution.Reason.Coding.Version',
MdctnDispns_Substitution_Rsn_Txt TEXT COMMENT 'MedicationDispense.Substitution.Reason.Text',
MdctnDispns_Substitution_ResponsibleParty TEXT COMMENT 'MedicationDispense.Substitution.ResponsibleParty',
MdctnDispns_Substitution_Typ_Cdg_Cd TEXT COMMENT 'MedicationDispense.Substitution.Type.Coding.Code',
MdctnDispns_Substitution_Typ_Cdg_Dsply TEXT COMMENT 'MedicationDispense.Substitution.Type.Coding.Display',
MdctnDispns_Substitution_Typ_Cdg_Sys TEXT COMMENT 'MedicationDispense.Substitution.Type.Coding.System',
MdctnDispns_Substitution_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.Substitution.Type.Coding.UserSelected',
MdctnDispns_Substitution_Typ_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.Substitution.Type.Coding.Version',
MdctnDispns_Substitution_Typ_Txt TEXT COMMENT 'MedicationDispense.Substitution.Type.Text',
MdctnDispns_Substitution_WasSubstituted TEXT COMMENT 'MedicationDispense.Substitution.WasSubstituted',
MdctnDispns_SprtingInfo TEXT COMMENT 'MedicationDispense.SupportingInformation',
MdctnDispns_Typ_Cdg_Cd TEXT COMMENT 'MedicationDispense.Type.Coding.Code',
MdctnDispns_Typ_Cdg_Dsply TEXT COMMENT 'MedicationDispense.Type.Coding.Display',
MdctnDispns_Typ_Cdg_Sys TEXT COMMENT 'MedicationDispense.Type.Coding.System',
MdctnDispns_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicationDispense.Type.Coding.UserSelected',
MdctnDispns_Typ_Cdg_Vrsn TEXT COMMENT 'MedicationDispense.Type.Coding.Version',
MdctnDispns_Typ_Txt TEXT COMMENT 'MedicationDispense.Type.Text',
MdctnDispns_WhenHandedOver TEXT COMMENT 'MedicationDispense.WhenHandedOver',
MdctnDispns_WhenPrepared TEXT COMMENT 'MedicationDispense.WhenPrepared',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;