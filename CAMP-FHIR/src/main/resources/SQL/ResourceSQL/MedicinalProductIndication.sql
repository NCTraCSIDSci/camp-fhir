drop table if exists `MedicinalProductIndication`;
CREATE TABLE `MedicinalProductIndication` (
 id varchar(64),
MdcnlPrdctIndctn_Comorbidity_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.Comorbidity.Coding.Code',
MdcnlPrdctIndctn_Comorbidity_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.Comorbidity.Coding.Display',
MdcnlPrdctIndctn_Comorbidity_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.Comorbidity.Coding.System',
MdcnlPrdctIndctn_Comorbidity_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.Comorbidity.Coding.UserSelected',
MdcnlPrdctIndctn_Comorbidity_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.Comorbidity.Coding.Version',
MdcnlPrdctIndctn_Comorbidity_Txt TEXT COMMENT 'MedicinalProductIndication.Comorbidity.Text',
MdcnlPrdctIndctn_DiseaseSts_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.DiseaseStatus.Coding.Code',
MdcnlPrdctIndctn_DiseaseSts_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.DiseaseStatus.Coding.Display',
MdcnlPrdctIndctn_DiseaseSts_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.DiseaseStatus.Coding.System',
MdcnlPrdctIndctn_DiseaseSts_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.DiseaseStatus.Coding.UserSelected',
MdcnlPrdctIndctn_DiseaseSts_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.DiseaseStatus.Coding.Version',
MdcnlPrdctIndctn_DiseaseSts_Txt TEXT COMMENT 'MedicinalProductIndication.DiseaseStatus.Text',
MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.DiseaseSymptomProcedure.Coding.Code',
MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.DiseaseSymptomProcedure.Coding.Display',
MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.DiseaseSymptomProcedure.Coding.System',
MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.DiseaseSymptomProcedure.Coding.UserSelected',
MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.DiseaseSymptomProcedure.Coding.Version',
MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Txt TEXT COMMENT 'MedicinalProductIndication.DiseaseSymptomProcedure.Text',
MdcnlPrdctIndctn_Duration_Cd TEXT COMMENT 'MedicinalProductIndication.Duration.Code',
MdcnlPrdctIndctn_Duration_Cmprtr TEXT COMMENT 'MedicinalProductIndication.Duration.Comparator',
MdcnlPrdctIndctn_Duration_Sys TEXT COMMENT 'MedicinalProductIndication.Duration.System',
MdcnlPrdctIndctn_Duration_Unt TEXT COMMENT 'MedicinalProductIndication.Duration.Unit',
MdcnlPrdctIndctn_Duration_Vl TEXT COMMENT 'MedicinalProductIndication.Duration.Value',
MdcnlPrdctIndctn_IntendedEfct_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.IntendedEffect.Coding.Code',
MdcnlPrdctIndctn_IntendedEfct_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.IntendedEffect.Coding.Display',
MdcnlPrdctIndctn_IntendedEfct_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.IntendedEffect.Coding.System',
MdcnlPrdctIndctn_IntendedEfct_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.IntendedEffect.Coding.UserSelected',
MdcnlPrdctIndctn_IntendedEfct_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.IntendedEffect.Coding.Version',
MdcnlPrdctIndctn_IntendedEfct_Txt TEXT COMMENT 'MedicinalProductIndication.IntendedEffect.Text',
MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationCodeableConcept.Coding.Code',
MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationCodeableConcept.Coding.Display',
MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationCodeableConcept.Coding.System',
MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationCodeableConcept.Coding.UserSelected',
MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationCodeableConcept.Coding.Version',
MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Txt TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationCodeableConcept.Text',
MdcnlPrdctIndctn_OtherThrpy_MdctnRfrnc TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.MedicationReference',
MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.TherapyRelationshipType.Coding.Code',
MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.TherapyRelationshipType.Coding.Display',
MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.TherapyRelationshipType.Coding.System',
MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.TherapyRelationshipType.Coding.UserSelected',
MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.TherapyRelationshipType.Coding.Version',
MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Txt TEXT COMMENT 'MedicinalProductIndication.OtherTherapy.TherapyRelationshipType.Text',
MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.Population.AgeCodeableConcept.Coding.Code',
MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.Population.AgeCodeableConcept.Coding.Display',
MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.Population.AgeCodeableConcept.Coding.System',
MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.Population.AgeCodeableConcept.Coding.UserSelected',
MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.Population.AgeCodeableConcept.Coding.Version',
MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Txt TEXT COMMENT 'MedicinalProductIndication.Population.AgeCodeableConcept.Text',
MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cd TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.High.Code',
MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cmprtr TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.High.Comparator',
MdcnlPrdctIndctn_Popln_AgeRng_Hi_Sys TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.High.System',
MdcnlPrdctIndctn_Popln_AgeRng_Hi_Unt TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.High.Unit',
MdcnlPrdctIndctn_Popln_AgeRng_Hi_Vl TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.High.Value',
MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cd TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.Low.Code',
MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cmprtr TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.Low.Comparator',
MdcnlPrdctIndctn_Popln_AgeRng_Lw_Sys TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.Low.System',
MdcnlPrdctIndctn_Popln_AgeRng_Lw_Unt TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.Low.Unit',
MdcnlPrdctIndctn_Popln_AgeRng_Lw_Vl TEXT COMMENT 'MedicinalProductIndication.Population.AgeRange.Low.Value',
MdcnlPrdctIndctn_Popln_Gender_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.Population.Gender.Coding.Code',
MdcnlPrdctIndctn_Popln_Gender_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.Population.Gender.Coding.Display',
MdcnlPrdctIndctn_Popln_Gender_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.Population.Gender.Coding.System',
MdcnlPrdctIndctn_Popln_Gender_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.Population.Gender.Coding.UserSelected',
MdcnlPrdctIndctn_Popln_Gender_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.Population.Gender.Coding.Version',
MdcnlPrdctIndctn_Popln_Gender_Txt TEXT COMMENT 'MedicinalProductIndication.Population.Gender.Text',
MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.Population.PhysiologicalCondition.Coding.Code',
MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.Population.PhysiologicalCondition.Coding.Display',
MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.Population.PhysiologicalCondition.Coding.System',
MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.Population.PhysiologicalCondition.Coding.UserSelected',
MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.Population.PhysiologicalCondition.Coding.Version',
MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Txt TEXT COMMENT 'MedicinalProductIndication.Population.PhysiologicalCondition.Text',
MdcnlPrdctIndctn_Popln_Race_Cdg_Cd TEXT COMMENT 'MedicinalProductIndication.Population.Race.Coding.Code',
MdcnlPrdctIndctn_Popln_Race_Cdg_Dsply TEXT COMMENT 'MedicinalProductIndication.Population.Race.Coding.Display',
MdcnlPrdctIndctn_Popln_Race_Cdg_Sys TEXT COMMENT 'MedicinalProductIndication.Population.Race.Coding.System',
MdcnlPrdctIndctn_Popln_Race_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductIndication.Population.Race.Coding.UserSelected',
MdcnlPrdctIndctn_Popln_Race_Cdg_Vrsn TEXT COMMENT 'MedicinalProductIndication.Population.Race.Coding.Version',
MdcnlPrdctIndctn_Popln_Race_Txt TEXT COMMENT 'MedicinalProductIndication.Population.Race.Text',
MdcnlPrdctIndctn_Sbjct TEXT COMMENT 'MedicinalProductIndication.Subject',
MdcnlPrdctIndctn_UndesirableEfct TEXT COMMENT 'MedicinalProductIndication.UndesirableEffect',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;