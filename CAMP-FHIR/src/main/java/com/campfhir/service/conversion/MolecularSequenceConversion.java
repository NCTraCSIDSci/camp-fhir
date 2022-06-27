package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MolecularSequence;
public class MolecularSequenceConversion 
{
	public org.hl7.fhir.r4.model.MolecularSequence MolecularSequences(MolecularSequence m) throws ParseException
	{
		org.hl7.fhir.r4.model.MolecularSequence molecularsequence = new org.hl7.fhir.r4.model.MolecularSequence();

		/******************** id ********************************************************************************/
		molecularsequence.setId(m.getId());

		/******************** MoleclrSqnc_CoordinateSys ********************************************************************************/
		if(m.getMoleclrSqncCoordinateSys() != null) {
			molecularsequence.setCoordinateSystem(Integer.parseInt(m.getMoleclrSqncCoordinateSys()));
		}
		/******************** MoleclrSqnc_Dvc ********************************************************************************/
		if(m.getMoleclrSqncDvc() != null) {
			molecularsequence.setDevice( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncDvc()));
		}
		/******************** molecularsequenceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier molecularsequenceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		molecularsequence.addIdentifier(molecularsequenceidentifier);

		/******************** MoleclrSqnc_Id_Assigner ********************************************************************************/
		if(m.getMoleclrSqncIdAssigner() != null) {
			molecularsequenceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncIdAssigner()));
		}
		/******************** molecularsequenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period molecularsequenceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		molecularsequenceidentifier.setPeriod(molecularsequenceidentifierperiod);

		/******************** MoleclrSqnc_Id_Prd_End ********************************************************************************/
		if(m.getMoleclrSqncIdPrdEnd() != null) {
			java.text.SimpleDateFormat MoleclrSqnc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MoleclrSqnc_Id_Prd_Enddate = MoleclrSqnc_Id_Prd_Endsdf.parse(m.getMoleclrSqncIdPrdEnd());
			molecularsequenceidentifierperiod.setEnd(MoleclrSqnc_Id_Prd_Enddate);
		}
		/******************** MoleclrSqnc_Id_Prd_Strt ********************************************************************************/
		if(m.getMoleclrSqncIdPrdStrt() != null) {
			java.text.SimpleDateFormat MoleclrSqnc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MoleclrSqnc_Id_Prd_Strtdate = MoleclrSqnc_Id_Prd_Strtsdf.parse(m.getMoleclrSqncIdPrdStrt());
			molecularsequenceidentifierperiod.setStart(MoleclrSqnc_Id_Prd_Strtdate);
		}
		/******************** MoleclrSqnc_Id_Sys ********************************************************************************/
		if(m.getMoleclrSqncIdSys() != null) {
			molecularsequenceidentifier.setSystem(m.getMoleclrSqncIdSys());
		}
		/******************** molecularsequenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequenceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		molecularsequenceidentifier.setType(molecularsequenceidentifiertype);

		/******************** molecularsequenceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequenceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		molecularsequenceidentifiertype.addCoding(molecularsequenceidentifiertypecoding);

		/******************** MoleclrSqnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgCd() != null) {
			molecularsequenceidentifiertypecoding.setCode(m.getMoleclrSqncIdTypCdgCd());
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgDsply() != null) {
			molecularsequenceidentifiertypecoding.setDisplay(m.getMoleclrSqncIdTypCdgDsply());
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgSys() != null) {
			molecularsequenceidentifiertypecoding.setSystem(m.getMoleclrSqncIdTypCdgSys());
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgUsrSltd() != null) {
			molecularsequenceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMoleclrSqncIdTypCdgUsrSltd()));
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgVrsn() != null) {
			molecularsequenceidentifiertypecoding.setVersion(m.getMoleclrSqncIdTypCdgVrsn());
		}
		/******************** MoleclrSqnc_Id_Typ_Txt ********************************************************************************/
		if(m.getMoleclrSqncIdTypTxt() != null) {
			molecularsequenceidentifiertype.setText(m.getMoleclrSqncIdTypTxt());
		}
		/******************** molecularsequenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory molecularsequenceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		molecularsequenceidentifier.setUse(molecularsequenceidentifieruse.fromCode(m.getMoleclrSqncIdUse()));

		/******************** MoleclrSqnc_Id_Vl ********************************************************************************/
		if(m.getMoleclrSqncIdVl() != null) {
			molecularsequenceidentifier.setValue(m.getMoleclrSqncIdVl());
		}
		/******************** MoleclrSqnc_ObservedSeq ********************************************************************************/
		if(m.getMoleclrSqncObservedSeq() != null) {
			molecularsequence.setObservedSeq(m.getMoleclrSqncObservedSeq());
		}
		/******************** MoleclrSqnc_Pnt ********************************************************************************/
		if(m.getMoleclrSqncPnt() != null) {
			molecularsequence.setPatient( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncPnt()));
		}
		/******************** MoleclrSqnc_Prfrmr ********************************************************************************/
		if(m.getMoleclrSqncPrfrmr() != null) {
			molecularsequence.setPerformer( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncPrfrmr()));
		}
		/******************** MoleclrSqnc_Pointer ********************************************************************************/
		if(m.getMoleclrSqncPointer() != null) {
			molecularsequence.addPointer( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncPointer()));
		}
		/******************** molecularsequencequality ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent molecularsequencequality =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent();
		molecularsequence.addQuality(molecularsequencequality);

		/******************** MoleclrSqnc_Quality_End ********************************************************************************/
		if(m.getMoleclrSqncQualityEnd() != null) {
			molecularsequencequality.setEnd(Integer.parseInt(m.getMoleclrSqncQualityEnd()));
		}
		/******************** MoleclrSqnc_Quality_Fscore ********************************************************************************/
		if(m.getMoleclrSqncQualityFscore() != null) {
			molecularsequencequality.setFScore(Double.parseDouble((m.getMoleclrSqncQualityFscore())));
		}
		/******************** MoleclrSqnc_Quality_GtFp ********************************************************************************/
		if(m.getMoleclrSqncQualityGtFp() != null) {
			molecularsequencequality.setGtFP(Double.parseDouble((m.getMoleclrSqncQualityGtFp())));
		}
		/******************** molecularsequencequalitymethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencequalitymethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		molecularsequencequality.setMethod(molecularsequencequalitymethod);

		/******************** molecularsequencequalitymethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencequalitymethodcoding =  new org.hl7.fhir.r4.model.Coding();
		molecularsequencequalitymethod.addCoding(molecularsequencequalitymethodcoding);

		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgCd() != null) {
			molecularsequencequalitymethodcoding.setCode(m.getMoleclrSqncQualityMthdCdgCd());
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgDsply() != null) {
			molecularsequencequalitymethodcoding.setDisplay(m.getMoleclrSqncQualityMthdCdgDsply());
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgSys() != null) {
			molecularsequencequalitymethodcoding.setSystem(m.getMoleclrSqncQualityMthdCdgSys());
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgUsrSltd() != null) {
			molecularsequencequalitymethodcoding.setUserSelected(Boolean.parseBoolean(m.getMoleclrSqncQualityMthdCdgUsrSltd()));
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgVrsn() != null) {
			molecularsequencequalitymethodcoding.setVersion(m.getMoleclrSqncQualityMthdCdgVrsn());
		}
		/******************** MoleclrSqnc_Quality_Mthd_Txt ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdTxt() != null) {
			molecularsequencequalitymethod.setText(m.getMoleclrSqncQualityMthdTxt());
		}
		/******************** MoleclrSqnc_Quality_Precision ********************************************************************************/
		if(m.getMoleclrSqncQualityPrecision() != null) {
			molecularsequencequality.setPrecision(new java.math.BigDecimal((m.getMoleclrSqncQualityPrecision())));
		}
		/******************** MoleclrSqnc_Quality_QueryFp ********************************************************************************/
		if(m.getMoleclrSqncQualityQueryFp() != null) {
			molecularsequencequality.setQueryFP(Double.parseDouble((m.getMoleclrSqncQualityQueryFp())));
		}
		/******************** MoleclrSqnc_Quality_QueryTp ********************************************************************************/
		if(m.getMoleclrSqncQualityQueryTp() != null) {
			molecularsequencequality.setQueryTP(Double.parseDouble((m.getMoleclrSqncQualityQueryTp())));
		}
		/******************** MoleclrSqnc_Quality_Recall ********************************************************************************/
		if(m.getMoleclrSqncQualityRecall() != null) {
			molecularsequencequality.setRecall(Double.parseDouble((m.getMoleclrSqncQualityRecall())));
		}
		/******************** molecularsequencequalityroc ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent molecularsequencequalityroc =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent();
		molecularsequencequality.setRoc(molecularsequencequalityroc);

		/******************** MoleclrSqnc_Quality_Roc_Fmsr ********************************************************************************/
		if(m.getMoleclrSqncQualityRocFmsr() != null) {
			molecularsequencequalityroc.addFMeasure(new java.math.BigDecimal((m.getMoleclrSqncQualityRocFmsr())));
		}
		/******************** MoleclrSqnc_Quality_Roc_NumFn ********************************************************************************/
		if(m.getMoleclrSqncQualityRocNumFn() != null) {
			molecularsequencequalityroc.addNumFN(Integer.parseInt(m.getMoleclrSqncQualityRocNumFn()));
		}
		/******************** MoleclrSqnc_Quality_Roc_NumFp ********************************************************************************/
		if(m.getMoleclrSqncQualityRocNumFp() != null) {
			molecularsequencequalityroc.addNumFP(Integer.parseInt(m.getMoleclrSqncQualityRocNumFp()));
		}
		/******************** MoleclrSqnc_Quality_Roc_NumTp ********************************************************************************/
		if(m.getMoleclrSqncQualityRocNumTp() != null) {
			molecularsequencequalityroc.addNumTP(Integer.parseInt(m.getMoleclrSqncQualityRocNumTp()));
		}
		/******************** MoleclrSqnc_Quality_Roc_Precision ********************************************************************************/
		if(m.getMoleclrSqncQualityRocPrecision() != null) {
			molecularsequencequalityroc.addPrecision(new java.math.BigDecimal((m.getMoleclrSqncQualityRocPrecision())));
		}
		/******************** MoleclrSqnc_Quality_Roc_Score ********************************************************************************/
		if(m.getMoleclrSqncQualityRocScore() != null) {
			molecularsequencequalityroc.addScore(Integer.parseInt(m.getMoleclrSqncQualityRocScore()));
		}
		/******************** MoleclrSqnc_Quality_Roc_Sensitivity ********************************************************************************/
		if(m.getMoleclrSqncQualityRocSensitivity() != null) {
			molecularsequencequalityroc.addSensitivity(new java.math.BigDecimal((m.getMoleclrSqncQualityRocSensitivity())));
		}
		/******************** molecularsequencequalityscore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity molecularsequencequalityscore =  new org.hl7.fhir.r4.model.Quantity();
		molecularsequencequality.setScore(molecularsequencequalityscore);

		/******************** MoleclrSqnc_Quality_Score_Cd ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreCd() != null) {
			molecularsequencequalityscore.setCode(m.getMoleclrSqncQualityScoreCd());
		}
		/******************** molecularsequencequalityscorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory molecularsequencequalityscorecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		molecularsequencequalityscore.setComparator(molecularsequencequalityscorecomparator.fromCode(m.getMoleclrSqncQualityScoreCmprtr()));

		/******************** MoleclrSqnc_Quality_Score_Sys ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreSys() != null) {
			molecularsequencequalityscore.setSystem(m.getMoleclrSqncQualityScoreSys());
		}
		/******************** MoleclrSqnc_Quality_Score_Unt ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreUnt() != null) {
			molecularsequencequalityscore.setUnit(m.getMoleclrSqncQualityScoreUnt());
		}
		/******************** MoleclrSqnc_Quality_Score_Vl ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreVl() != null) {
			molecularsequencequalityscore.setValue(Double.parseDouble((m.getMoleclrSqncQualityScoreVl())));
		}
		/******************** molecularsequencequalitystandardsequence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencequalitystandardsequence =  new org.hl7.fhir.r4.model.CodeableConcept();
		molecularsequencequality.setStandardSequence(molecularsequencequalitystandardsequence);

		/******************** molecularsequencequalitystandardsequencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencequalitystandardsequencecoding =  new org.hl7.fhir.r4.model.Coding();
		molecularsequencequalitystandardsequence.addCoding(molecularsequencequalitystandardsequencecoding);

		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgCd() != null) {
			molecularsequencequalitystandardsequencecoding.setCode(m.getMoleclrSqncQualityStandardSqncCdgCd());
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgDsply() != null) {
			molecularsequencequalitystandardsequencecoding.setDisplay(m.getMoleclrSqncQualityStandardSqncCdgDsply());
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgSys() != null) {
			molecularsequencequalitystandardsequencecoding.setSystem(m.getMoleclrSqncQualityStandardSqncCdgSys());
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgUsrSltd() != null) {
			molecularsequencequalitystandardsequencecoding.setUserSelected(Boolean.parseBoolean(m.getMoleclrSqncQualityStandardSqncCdgUsrSltd()));
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgVrsn() != null) {
			molecularsequencequalitystandardsequencecoding.setVersion(m.getMoleclrSqncQualityStandardSqncCdgVrsn());
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Txt ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncTxt() != null) {
			molecularsequencequalitystandardsequence.setText(m.getMoleclrSqncQualityStandardSqncTxt());
		}
		/******************** MoleclrSqnc_Quality_Strt ********************************************************************************/
		if(m.getMoleclrSqncQualityStrt() != null) {
			molecularsequencequality.setStart(Integer.parseInt(m.getMoleclrSqncQualityStrt()));
		}
		/******************** MoleclrSqnc_Quality_TruthFn ********************************************************************************/
		if(m.getMoleclrSqncQualityTruthFn() != null) {
			molecularsequencequality.setTruthFN(new java.math.BigDecimal((m.getMoleclrSqncQualityTruthFn())));
		}
		/******************** MoleclrSqnc_Quality_TruthTp ********************************************************************************/
		if(m.getMoleclrSqncQualityTruthTp() != null) {
			molecularsequencequality.setTruthTP(Double.parseDouble((m.getMoleclrSqncQualityTruthTp())));
		}
		/******************** molecularsequencequalitytype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.QualityTypeEnumFactory molecularsequencequalitytype =  new org.hl7.fhir.r4.model.MolecularSequence.QualityTypeEnumFactory();
		molecularsequencequality.setType(molecularsequencequalitytype.fromCode(m.getMoleclrSqncQualityTyp()));

		/******************** molecularsequencequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity molecularsequencequantity =  new org.hl7.fhir.r4.model.Quantity();
		molecularsequence.setQuantity(molecularsequencequantity);

		/******************** MoleclrSqnc_Qnty_Cd ********************************************************************************/
		if(m.getMoleclrSqncQntyCd() != null) {
			molecularsequencequantity.setCode(m.getMoleclrSqncQntyCd());
		}
		/******************** molecularsequencequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory molecularsequencequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		molecularsequencequantity.setComparator(molecularsequencequantitycomparator.fromCode(m.getMoleclrSqncQntyCmprtr()));

		/******************** MoleclrSqnc_Qnty_Sys ********************************************************************************/
		if(m.getMoleclrSqncQntySys() != null) {
			molecularsequencequantity.setSystem(m.getMoleclrSqncQntySys());
		}
		/******************** MoleclrSqnc_Qnty_Unt ********************************************************************************/
		if(m.getMoleclrSqncQntyUnt() != null) {
			molecularsequencequantity.setUnit(m.getMoleclrSqncQntyUnt());
		}
		/******************** MoleclrSqnc_Qnty_Vl ********************************************************************************/
		if(m.getMoleclrSqncQntyVl() != null) {
			molecularsequencequantity.setValue(Double.parseDouble((m.getMoleclrSqncQntyVl())));
		}
		/******************** MoleclrSqnc_ReadCvg ********************************************************************************/
		if(m.getMoleclrSqncReadCvg() != null) {
			molecularsequence.setReadCoverage(Integer.parseInt(m.getMoleclrSqncReadCvg()));
		}
		/******************** molecularsequencereferenceseq ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent molecularsequencereferenceseq =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent();
		molecularsequence.setReferenceSeq(molecularsequencereferenceseq);

		/******************** molecularsequencereferenceseqchromosome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencereferenceseqchromosome =  new org.hl7.fhir.r4.model.CodeableConcept();
		molecularsequencereferenceseq.setChromosome(molecularsequencereferenceseqchromosome);

		/******************** molecularsequencereferenceseqchromosomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencereferenceseqchromosomecoding =  new org.hl7.fhir.r4.model.Coding();
		molecularsequencereferenceseqchromosome.addCoding(molecularsequencereferenceseqchromosomecoding);

		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgCd() != null) {
			molecularsequencereferenceseqchromosomecoding.setCode(m.getMoleclrSqncRfrncSeqChromosomeCdgCd());
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgDsply() != null) {
			molecularsequencereferenceseqchromosomecoding.setDisplay(m.getMoleclrSqncRfrncSeqChromosomeCdgDsply());
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgSys() != null) {
			molecularsequencereferenceseqchromosomecoding.setSystem(m.getMoleclrSqncRfrncSeqChromosomeCdgSys());
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgUsrSltd() != null) {
			molecularsequencereferenceseqchromosomecoding.setUserSelected(Boolean.parseBoolean(m.getMoleclrSqncRfrncSeqChromosomeCdgUsrSltd()));
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgVrsn() != null) {
			molecularsequencereferenceseqchromosomecoding.setVersion(m.getMoleclrSqncRfrncSeqChromosomeCdgVrsn());
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Txt ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeTxt() != null) {
			molecularsequencereferenceseqchromosome.setText(m.getMoleclrSqncRfrncSeqChromosomeTxt());
		}
		/******************** MoleclrSqnc_RfrncSeq_GenomeBuild ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqGenomeBuild() != null) {
			molecularsequencereferenceseq.setGenomeBuild(m.getMoleclrSqncRfrncSeqGenomeBuild());
		}
		/******************** molecularsequencereferenceseqorientation ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.OrientationTypeEnumFactory molecularsequencereferenceseqorientation =  new org.hl7.fhir.r4.model.MolecularSequence.OrientationTypeEnumFactory();
		molecularsequencereferenceseq.setOrientation(molecularsequencereferenceseqorientation.fromCode(m.getMoleclrSqncRfrncSeqOrientation()));

		/******************** molecularsequencereferenceseqreferenceseqid ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencereferenceseqreferenceseqid =  new org.hl7.fhir.r4.model.CodeableConcept();
		molecularsequencereferenceseq.setReferenceSeqId(molecularsequencereferenceseqreferenceseqid);

		/******************** molecularsequencereferenceseqreferenceseqidcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencereferenceseqreferenceseqidcoding =  new org.hl7.fhir.r4.model.Coding();
		molecularsequencereferenceseqreferenceseqid.addCoding(molecularsequencereferenceseqreferenceseqidcoding);

		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgCd() != null) {
			molecularsequencereferenceseqreferenceseqidcoding.setCode(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgCd());
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply() != null) {
			molecularsequencereferenceseqreferenceseqidcoding.setDisplay(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply());
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgSys() != null) {
			molecularsequencereferenceseqreferenceseqidcoding.setSystem(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgSys());
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd() != null) {
			molecularsequencereferenceseqreferenceseqidcoding.setUserSelected(Boolean.parseBoolean(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd()));
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn() != null) {
			molecularsequencereferenceseqreferenceseqidcoding.setVersion(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn());
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Txt ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdTxt() != null) {
			molecularsequencereferenceseqreferenceseqid.setText(m.getMoleclrSqncRfrncSeqRfrncSeqIdTxt());
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqPointer ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqPointer() != null) {
			molecularsequencereferenceseq.setReferenceSeqPointer( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncRfrncSeqRfrncSeqPointer()));
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqStrg ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqStrg() != null) {
			molecularsequencereferenceseq.setReferenceSeqString(m.getMoleclrSqncRfrncSeqRfrncSeqStrg());
		}
		/******************** molecularsequencereferenceseqstrand ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.StrandTypeEnumFactory molecularsequencereferenceseqstrand =  new org.hl7.fhir.r4.model.MolecularSequence.StrandTypeEnumFactory();
		molecularsequencereferenceseq.setStrand(molecularsequencereferenceseqstrand.fromCode(m.getMoleclrSqncRfrncSeqStrand()));

		/******************** MoleclrSqnc_RfrncSeq_WindowEnd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqWindowEnd() != null) {
			molecularsequencereferenceseq.setWindowEnd(Integer.parseInt(m.getMoleclrSqncRfrncSeqWindowEnd()));
		}
		/******************** MoleclrSqnc_RfrncSeq_WindowStrt ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqWindowStrt() != null) {
			molecularsequencereferenceseq.setWindowStart(Integer.parseInt(m.getMoleclrSqncRfrncSeqWindowStrt()));
		}
		/******************** molecularsequencerepository ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent molecularsequencerepository =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent();
		molecularsequence.addRepository(molecularsequencerepository);

		/******************** MoleclrSqnc_Repository_DataId ********************************************************************************/
		if(m.getMoleclrSqncRepositoryDataId() != null) {
			molecularsequencerepository.setDatasetId(m.getMoleclrSqncRepositoryDataId());
		}
		/******************** MoleclrSqnc_Repository_Nm ********************************************************************************/
		if(m.getMoleclrSqncRepositoryNm() != null) {
			molecularsequencerepository.setName(m.getMoleclrSqncRepositoryNm());
		}
		/******************** MoleclrSqnc_Repository_ReadId ********************************************************************************/
		if(m.getMoleclrSqncRepositoryReadId() != null) {
			molecularsequencerepository.setReadsetId(m.getMoleclrSqncRepositoryReadId());
		}
		/******************** molecularsequencerepositorytype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.RepositoryTypeEnumFactory molecularsequencerepositorytype =  new org.hl7.fhir.r4.model.MolecularSequence.RepositoryTypeEnumFactory();
		molecularsequencerepository.setType(molecularsequencerepositorytype.fromCode(m.getMoleclrSqncRepositoryTyp()));

		/******************** MoleclrSqnc_Repository_Url ********************************************************************************/
		if(m.getMoleclrSqncRepositoryUrl() != null) {
			molecularsequencerepository.setUrl(m.getMoleclrSqncRepositoryUrl());
		}
		/******************** MoleclrSqnc_Repository_VariantId ********************************************************************************/
		if(m.getMoleclrSqncRepositoryVariantId() != null) {
			molecularsequencerepository.setVariantsetId(m.getMoleclrSqncRepositoryVariantId());
		}
		/******************** MoleclrSqnc_Spcmn ********************************************************************************/
		if(m.getMoleclrSqncSpcmn() != null) {
			molecularsequence.setSpecimen( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncSpcmn()));
		}
		/******************** molecularsequencestructurevariant ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent molecularsequencestructurevariant =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent();
		molecularsequence.addStructureVariant(molecularsequencestructurevariant);

		/******************** MoleclrSqnc_StrctrVariant_Exact ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantExact() != null) {
			molecularsequencestructurevariant.setExact(Boolean.parseBoolean(m.getMoleclrSqncStrctrVariantExact()));
		}
		/******************** molecularsequencestructurevariantinner ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent molecularsequencestructurevariantinner =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent();
		molecularsequencestructurevariant.setInner(molecularsequencestructurevariantinner);

		/******************** MoleclrSqnc_StrctrVariant_Inner_End ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantInnerEnd() != null) {
			molecularsequencestructurevariantinner.setEnd(Integer.parseInt(m.getMoleclrSqncStrctrVariantInnerEnd()));
		}
		/******************** MoleclrSqnc_StrctrVariant_Inner_Strt ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantInnerStrt() != null) {
			molecularsequencestructurevariantinner.setStart(Integer.parseInt(m.getMoleclrSqncStrctrVariantInnerStrt()));
		}
		/******************** MoleclrSqnc_StrctrVariant_Length ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantLength() != null) {
			molecularsequencestructurevariant.setLength(Integer.parseInt(m.getMoleclrSqncStrctrVariantLength()));
		}
		/******************** molecularsequencestructurevariantouter ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent molecularsequencestructurevariantouter =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent();
		molecularsequencestructurevariant.setOuter(molecularsequencestructurevariantouter);

		/******************** MoleclrSqnc_StrctrVariant_Outer_End ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantOuterEnd() != null) {
			molecularsequencestructurevariantouter.setEnd(Integer.parseInt(m.getMoleclrSqncStrctrVariantOuterEnd()));
		}
		/******************** MoleclrSqnc_StrctrVariant_Outer_Strt ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantOuterStrt() != null) {
			molecularsequencestructurevariantouter.setStart(Integer.parseInt(m.getMoleclrSqncStrctrVariantOuterStrt()));
		}
		/******************** molecularsequencestructurevariantvarianttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencestructurevariantvarianttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		molecularsequencestructurevariant.setVariantType(molecularsequencestructurevariantvarianttype);

		/******************** molecularsequencestructurevariantvarianttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencestructurevariantvarianttypecoding =  new org.hl7.fhir.r4.model.Coding();
		molecularsequencestructurevariantvarianttype.addCoding(molecularsequencestructurevariantvarianttypecoding);

		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgCd() != null) {
			molecularsequencestructurevariantvarianttypecoding.setCode(m.getMoleclrSqncStrctrVariantVariantTypCdgCd());
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgDsply() != null) {
			molecularsequencestructurevariantvarianttypecoding.setDisplay(m.getMoleclrSqncStrctrVariantVariantTypCdgDsply());
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgSys() != null) {
			molecularsequencestructurevariantvarianttypecoding.setSystem(m.getMoleclrSqncStrctrVariantVariantTypCdgSys());
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgUsrSltd() != null) {
			molecularsequencestructurevariantvarianttypecoding.setUserSelected(Boolean.parseBoolean(m.getMoleclrSqncStrctrVariantVariantTypCdgUsrSltd()));
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgVrsn() != null) {
			molecularsequencestructurevariantvarianttypecoding.setVersion(m.getMoleclrSqncStrctrVariantVariantTypCdgVrsn());
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Txt ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypTxt() != null) {
			molecularsequencestructurevariantvarianttype.setText(m.getMoleclrSqncStrctrVariantVariantTypTxt());
		}
		/******************** molecularsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.SequenceTypeEnumFactory molecularsequencetype =  new org.hl7.fhir.r4.model.MolecularSequence.SequenceTypeEnumFactory();
		molecularsequence.setType(molecularsequencetype.fromCode(m.getMoleclrSqncTyp()));

		/******************** molecularsequencevariant ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent molecularsequencevariant =  new org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent();
		molecularsequence.addVariant(molecularsequencevariant);

		/******************** MoleclrSqnc_Variant_Cigar ********************************************************************************/
		if(m.getMoleclrSqncVariantCigar() != null) {
			molecularsequencevariant.setCigar(m.getMoleclrSqncVariantCigar());
		}
		/******************** MoleclrSqnc_Variant_End ********************************************************************************/
		if(m.getMoleclrSqncVariantEnd() != null) {
			molecularsequencevariant.setEnd(Integer.parseInt(m.getMoleclrSqncVariantEnd()));
		}
		/******************** MoleclrSqnc_Variant_ObservedAllele ********************************************************************************/
		if(m.getMoleclrSqncVariantObservedAllele() != null) {
			molecularsequencevariant.setObservedAllele(m.getMoleclrSqncVariantObservedAllele());
		}
		/******************** MoleclrSqnc_Variant_RfrncAllele ********************************************************************************/
		if(m.getMoleclrSqncVariantRfrncAllele() != null) {
			molecularsequencevariant.setReferenceAllele(m.getMoleclrSqncVariantRfrncAllele());
		}
		/******************** MoleclrSqnc_Variant_Strt ********************************************************************************/
		if(m.getMoleclrSqncVariantStrt() != null) {
			molecularsequencevariant.setStart(Integer.parseInt(m.getMoleclrSqncVariantStrt()));
		}
		/******************** MoleclrSqnc_Variant_VariantPointer ********************************************************************************/
		if(m.getMoleclrSqncVariantVariantPointer() != null) {
			molecularsequencevariant.setVariantPointer( new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncVariantVariantPointer()));
		}
		return molecularsequence;
	}
}
