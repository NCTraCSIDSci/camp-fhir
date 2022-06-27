package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MolecularSequence;
public class MolecularSequenceBidirectionalConversion 
{
	public MolecularSequence MolecularSequences(org.hl7.fhir.r4.model.MolecularSequence molecularsequence) throws ParseException
	{
		 main.java.com.campfhir.model.MolecularSequence m = new  main.java.com.campfhir.model.MolecularSequence();

		/******************** id ********************************************************************************/
		molecularsequence.setId(m.getId());

		/******************** molecularsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.SequenceType molecularsequencetype = molecularsequence.getType();
		m.setMoleclrSqncTyp(molecularsequencetype.toCode());

		/******************** MoleclrSqnc_Prfrmr ********************************************************************************/
		if(molecularsequence.hasPerformer()) {
			m.setMoleclrSqncPrfrmr(String.valueOf(molecularsequence.getPerformer()));
		}
		/******************** MoleclrSqnc_Pnt ********************************************************************************/
		if(molecularsequence.hasPatient()) {
			m.setMoleclrSqncPnt(String.valueOf(molecularsequence.getPatient()));
		}
		/******************** molecularsequencequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity molecularsequencequantity = molecularsequence.getQuantity();

		/******************** MoleclrSqnc_Qnty_Vl ********************************************************************************/
		if(molecularsequencequantity.hasValue()) {
			m.setMoleclrSqncQntyVl(String.valueOf(molecularsequencequantity.getValue()));
		}
		/******************** molecularsequencequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator molecularsequencequantitycomparator = molecularsequencequantity.getComparator();
		m.setMoleclrSqncQntyCmprtr(molecularsequencequantitycomparator.toCode());

		/******************** MoleclrSqnc_Qnty_Cd ********************************************************************************/
		if(molecularsequencequantity.hasCode()) {
			m.setMoleclrSqncQntyCd(String.valueOf(molecularsequencequantity.getCode()));
		}
		/******************** MoleclrSqnc_Qnty_Unt ********************************************************************************/
		if(molecularsequencequantity.hasUnit()) {
			m.setMoleclrSqncQntyUnt(String.valueOf(molecularsequencequantity.getUnit()));
		}
		/******************** MoleclrSqnc_Qnty_Sys ********************************************************************************/
		if(molecularsequencequantity.hasSystem()) {
			m.setMoleclrSqncQntySys(String.valueOf(molecularsequencequantity.getSystem()));
		}
		/******************** MoleclrSqnc_Spcmn ********************************************************************************/
		if(molecularsequence.hasSpecimen()) {
			m.setMoleclrSqncSpcmn(String.valueOf(molecularsequence.getSpecimen()));
		}
		/******************** molecularsequencerepository ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent molecularsequencerepository = molecularsequence.getRepositoryFirstRep();

		/******************** MoleclrSqnc_Repository_Nm ********************************************************************************/
		if(molecularsequencerepository.hasName()) {
			m.setMoleclrSqncRepositoryNm(String.valueOf(molecularsequencerepository.getName()));
		}
		/******************** molecularsequencerepositorytype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.RepositoryType molecularsequencerepositorytype = molecularsequencerepository.getType();
		m.setMoleclrSqncRepositoryTyp(molecularsequencerepositorytype.toCode());

		/******************** MoleclrSqnc_Repository_ReadId ********************************************************************************/
		if(molecularsequencerepository.hasReadsetId()) {
			m.setMoleclrSqncRepositoryReadId(String.valueOf(molecularsequencerepository.getReadsetId()));
		}
		/******************** MoleclrSqnc_Repository_VariantId ********************************************************************************/
		if(molecularsequencerepository.hasVariantsetId()) {
			m.setMoleclrSqncRepositoryVariantId(String.valueOf(molecularsequencerepository.getVariantsetId()));
		}
		/******************** MoleclrSqnc_Repository_DataId ********************************************************************************/
		if(molecularsequencerepository.hasDatasetId()) {
			m.setMoleclrSqncRepositoryDataId(String.valueOf(molecularsequencerepository.getDatasetId()));
		}
		/******************** MoleclrSqnc_Repository_Url ********************************************************************************/
		if(molecularsequencerepository.hasUrl()) {
			m.setMoleclrSqncRepositoryUrl(String.valueOf(molecularsequencerepository.getUrl()));
		}
		/******************** MoleclrSqnc_CoordinateSys ********************************************************************************/
		if(molecularsequence.hasCoordinateSystem()) {
			m.setMoleclrSqncCoordinateSys(String.valueOf(molecularsequence.getCoordinateSystem()));
		}
		/******************** molecularsequencestructurevariant ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent molecularsequencestructurevariant = molecularsequence.getStructureVariantFirstRep();

		/******************** MoleclrSqnc_StrctrVariant_Length ********************************************************************************/
		if(molecularsequencestructurevariant.hasLength()) {
			m.setMoleclrSqncStrctrVariantLength(String.valueOf(molecularsequencestructurevariant.getLength()));
		}
		/******************** molecularsequencestructurevariantouter ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent molecularsequencestructurevariantouter = molecularsequencestructurevariant.getOuter();

		/******************** MoleclrSqnc_StrctrVariant_Outer_Strt ********************************************************************************/
		if(molecularsequencestructurevariantouter.hasStart()) {
			m.setMoleclrSqncStrctrVariantOuterStrt(String.valueOf(molecularsequencestructurevariantouter.getStart()));
		}
		/******************** MoleclrSqnc_StrctrVariant_Outer_End ********************************************************************************/
		if(molecularsequencestructurevariantouter.hasEnd()) {
			m.setMoleclrSqncStrctrVariantOuterEnd(String.valueOf(molecularsequencestructurevariantouter.getEnd()));
		}
		/******************** molecularsequencestructurevariantvarianttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencestructurevariantvarianttype = molecularsequencestructurevariant.getVariantType();

		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Txt ********************************************************************************/
		if(molecularsequencestructurevariantvarianttype.hasText()) {
			m.setMoleclrSqncStrctrVariantVariantTypTxt(String.valueOf(molecularsequencestructurevariantvarianttype.getText()));
		}
		/******************** molecularsequencestructurevariantvarianttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencestructurevariantvarianttypecoding = molecularsequencestructurevariantvarianttype.getCodingFirstRep();

		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecoding.hasVersion()) {
			m.setMoleclrSqncStrctrVariantVariantTypCdgVrsn(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getVersion()));
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Dsply ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecoding.hasDisplay()) {
			m.setMoleclrSqncStrctrVariantVariantTypCdgDsply(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getDisplay()));
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Cd ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecoding.hasCode()) {
			m.setMoleclrSqncStrctrVariantVariantTypCdgCd(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getCode()));
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecoding.hasUserSelected()) {
			m.setMoleclrSqncStrctrVariantVariantTypCdgUsrSltd(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getUserSelected()));
		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Sys ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecoding.hasSystem()) {
			m.setMoleclrSqncStrctrVariantVariantTypCdgSys(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getSystem()));
		}
		/******************** MoleclrSqnc_StrctrVariant_Exact ********************************************************************************/
		if(molecularsequencestructurevariant.hasExact()) {
			m.setMoleclrSqncStrctrVariantExact(String.valueOf(molecularsequencestructurevariant.getExact()));
		}
		/******************** molecularsequencestructurevariantinner ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent molecularsequencestructurevariantinner = molecularsequencestructurevariant.getInner();

		/******************** MoleclrSqnc_StrctrVariant_Inner_Strt ********************************************************************************/
		if(molecularsequencestructurevariantinner.hasStart()) {
			m.setMoleclrSqncStrctrVariantInnerStrt(String.valueOf(molecularsequencestructurevariantinner.getStart()));
		}
		/******************** MoleclrSqnc_StrctrVariant_Inner_End ********************************************************************************/
		if(molecularsequencestructurevariantinner.hasEnd()) {
			m.setMoleclrSqncStrctrVariantInnerEnd(String.valueOf(molecularsequencestructurevariantinner.getEnd()));
		}
		/******************** molecularsequencereferenceseq ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent molecularsequencereferenceseq = molecularsequence.getReferenceSeq();

		/******************** MoleclrSqnc_RfrncSeq_WindowEnd ********************************************************************************/
		if(molecularsequencereferenceseq.hasWindowEnd()) {
			m.setMoleclrSqncRfrncSeqWindowEnd(String.valueOf(molecularsequencereferenceseq.getWindowEnd()));
		}
		/******************** molecularsequencereferenceseqorientation ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.OrientationType molecularsequencereferenceseqorientation = molecularsequencereferenceseq.getOrientation();
		m.setMoleclrSqncRfrncSeqOrientation(molecularsequencereferenceseqorientation.toCode());

		/******************** molecularsequencereferenceseqreferenceseqid ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencereferenceseqreferenceseqid = molecularsequencereferenceseq.getReferenceSeqId();

		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Txt ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqid.hasText()) {
			m.setMoleclrSqncRfrncSeqRfrncSeqIdTxt(String.valueOf(molecularsequencereferenceseqreferenceseqid.getText()));
		}
		/******************** molecularsequencereferenceseqreferenceseqidcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencereferenceseqreferenceseqidcoding = molecularsequencereferenceseqreferenceseqid.getCodingFirstRep();

		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcoding.hasVersion()) {
			m.setMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getVersion()));
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Dsply ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcoding.hasDisplay()) {
			m.setMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getDisplay()));
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Cd ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcoding.hasCode()) {
			m.setMoleclrSqncRfrncSeqRfrncSeqIdCdgCd(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getCode()));
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcoding.hasUserSelected()) {
			m.setMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getUserSelected()));
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Sys ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcoding.hasSystem()) {
			m.setMoleclrSqncRfrncSeqRfrncSeqIdCdgSys(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getSystem()));
		}
		/******************** molecularsequencereferenceseqstrand ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.StrandType molecularsequencereferenceseqstrand = molecularsequencereferenceseq.getStrand();
		m.setMoleclrSqncRfrncSeqStrand(molecularsequencereferenceseqstrand.toCode());

		/******************** MoleclrSqnc_RfrncSeq_GenomeBuild ********************************************************************************/
		if(molecularsequencereferenceseq.hasGenomeBuild()) {
			m.setMoleclrSqncRfrncSeqGenomeBuild(String.valueOf(molecularsequencereferenceseq.getGenomeBuild()));
		}
		/******************** MoleclrSqnc_RfrncSeq_WindowStrt ********************************************************************************/
		if(molecularsequencereferenceseq.hasWindowStart()) {
			m.setMoleclrSqncRfrncSeqWindowStrt(String.valueOf(molecularsequencereferenceseq.getWindowStart()));
		}
		/******************** molecularsequencereferenceseqchromosome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencereferenceseqchromosome = molecularsequencereferenceseq.getChromosome();

		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Txt ********************************************************************************/
		if(molecularsequencereferenceseqchromosome.hasText()) {
			m.setMoleclrSqncRfrncSeqChromosomeTxt(String.valueOf(molecularsequencereferenceseqchromosome.getText()));
		}
		/******************** molecularsequencereferenceseqchromosomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencereferenceseqchromosomecoding = molecularsequencereferenceseqchromosome.getCodingFirstRep();

		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecoding.hasVersion()) {
			m.setMoleclrSqncRfrncSeqChromosomeCdgVrsn(String.valueOf(molecularsequencereferenceseqchromosomecoding.getVersion()));
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Dsply ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecoding.hasDisplay()) {
			m.setMoleclrSqncRfrncSeqChromosomeCdgDsply(String.valueOf(molecularsequencereferenceseqchromosomecoding.getDisplay()));
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Cd ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecoding.hasCode()) {
			m.setMoleclrSqncRfrncSeqChromosomeCdgCd(String.valueOf(molecularsequencereferenceseqchromosomecoding.getCode()));
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecoding.hasUserSelected()) {
			m.setMoleclrSqncRfrncSeqChromosomeCdgUsrSltd(String.valueOf(molecularsequencereferenceseqchromosomecoding.getUserSelected()));
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Sys ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecoding.hasSystem()) {
			m.setMoleclrSqncRfrncSeqChromosomeCdgSys(String.valueOf(molecularsequencereferenceseqchromosomecoding.getSystem()));
		}
		/******************** MoleclrSqnc_ObservedSeq ********************************************************************************/
		if(molecularsequence.hasObservedSeq()) {
			m.setMoleclrSqncObservedSeq(String.valueOf(molecularsequence.getObservedSeq()));
		}
		/******************** molecularsequencevariant ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent molecularsequencevariant = molecularsequence.getVariantFirstRep();

		/******************** MoleclrSqnc_Variant_RfrncAllele ********************************************************************************/
		if(molecularsequencevariant.hasReferenceAllele()) {
			m.setMoleclrSqncVariantRfrncAllele(String.valueOf(molecularsequencevariant.getReferenceAllele()));
		}
		/******************** MoleclrSqnc_Variant_ObservedAllele ********************************************************************************/
		if(molecularsequencevariant.hasObservedAllele()) {
			m.setMoleclrSqncVariantObservedAllele(String.valueOf(molecularsequencevariant.getObservedAllele()));
		}
		/******************** MoleclrSqnc_Variant_Cigar ********************************************************************************/
		if(molecularsequencevariant.hasCigar()) {
			m.setMoleclrSqncVariantCigar(String.valueOf(molecularsequencevariant.getCigar()));
		}
		/******************** MoleclrSqnc_Variant_Strt ********************************************************************************/
		if(molecularsequencevariant.hasStart()) {
			m.setMoleclrSqncVariantStrt(String.valueOf(molecularsequencevariant.getStart()));
		}
		/******************** MoleclrSqnc_Variant_End ********************************************************************************/
		if(molecularsequencevariant.hasEnd()) {
			m.setMoleclrSqncVariantEnd(String.valueOf(molecularsequencevariant.getEnd()));
		}
		/******************** MoleclrSqnc_ReadCvg ********************************************************************************/
		if(molecularsequence.hasReadCoverage()) {
			m.setMoleclrSqncReadCvg(String.valueOf(molecularsequence.getReadCoverage()));
		}
		/******************** molecularsequencequality ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent molecularsequencequality = molecularsequence.getQualityFirstRep();

		/******************** molecularsequencequalitymethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencequalitymethod = molecularsequencequality.getMethod();

		/******************** MoleclrSqnc_Quality_Mthd_Txt ********************************************************************************/
		if(molecularsequencequalitymethod.hasText()) {
			m.setMoleclrSqncQualityMthdTxt(String.valueOf(molecularsequencequalitymethod.getText()));
		}
		/******************** molecularsequencequalitymethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencequalitymethodcoding = molecularsequencequalitymethod.getCodingFirstRep();

		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencequalitymethodcoding.hasVersion()) {
			m.setMoleclrSqncQualityMthdCdgVrsn(String.valueOf(molecularsequencequalitymethodcoding.getVersion()));
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Dsply ********************************************************************************/
		if(molecularsequencequalitymethodcoding.hasDisplay()) {
			m.setMoleclrSqncQualityMthdCdgDsply(String.valueOf(molecularsequencequalitymethodcoding.getDisplay()));
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Cd ********************************************************************************/
		if(molecularsequencequalitymethodcoding.hasCode()) {
			m.setMoleclrSqncQualityMthdCdgCd(String.valueOf(molecularsequencequalitymethodcoding.getCode()));
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencequalitymethodcoding.hasUserSelected()) {
			m.setMoleclrSqncQualityMthdCdgUsrSltd(String.valueOf(molecularsequencequalitymethodcoding.getUserSelected()));
		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Sys ********************************************************************************/
		if(molecularsequencequalitymethodcoding.hasSystem()) {
			m.setMoleclrSqncQualityMthdCdgSys(String.valueOf(molecularsequencequalitymethodcoding.getSystem()));
		}
		/******************** molecularsequencequalitytype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.QualityType molecularsequencequalitytype = molecularsequencequality.getType();
		m.setMoleclrSqncQualityTyp(molecularsequencequalitytype.toCode());

		/******************** MoleclrSqnc_Quality_QueryFp ********************************************************************************/
		if(molecularsequencequality.hasQueryFP()) {
			m.setMoleclrSqncQualityQueryFp(String.valueOf(molecularsequencequality.getQueryFP()));
		}
		/******************** MoleclrSqnc_Quality_QueryTp ********************************************************************************/
		if(molecularsequencequality.hasQueryTP()) {
			m.setMoleclrSqncQualityQueryTp(String.valueOf(molecularsequencequality.getQueryTP()));
		}
		/******************** MoleclrSqnc_Quality_GtFp ********************************************************************************/
		if(molecularsequencequality.hasGtFP()) {
			m.setMoleclrSqncQualityGtFp(String.valueOf(molecularsequencequality.getGtFP()));
		}
		/******************** MoleclrSqnc_Quality_TruthFn ********************************************************************************/
		if(molecularsequencequality.hasTruthFN()) {
			m.setMoleclrSqncQualityTruthFn(String.valueOf(molecularsequencequality.getTruthFN()));
		}
		/******************** MoleclrSqnc_Quality_TruthTp ********************************************************************************/
		if(molecularsequencequality.hasTruthTP()) {
			m.setMoleclrSqncQualityTruthTp(String.valueOf(molecularsequencequality.getTruthTP()));
		}
		/******************** molecularsequencequalityroc ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent molecularsequencequalityroc = molecularsequencequality.getRoc();

		/******************** MoleclrSqnc_Quality_Recall ********************************************************************************/
		if(molecularsequencequality.hasRecall()) {
			m.setMoleclrSqncQualityRecall(String.valueOf(molecularsequencequality.getRecall()));
		}
		/******************** MoleclrSqnc_Quality_Fscore ********************************************************************************/
		if(molecularsequencequality.hasFScore()) {
			m.setMoleclrSqncQualityFscore(String.valueOf(molecularsequencequality.getFScore()));
		}
		/******************** molecularsequencequalitystandardsequence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencequalitystandardsequence = molecularsequencequality.getStandardSequence();

		/******************** MoleclrSqnc_Quality_StandardSqnc_Txt ********************************************************************************/
		if(molecularsequencequalitystandardsequence.hasText()) {
			m.setMoleclrSqncQualityStandardSqncTxt(String.valueOf(molecularsequencequalitystandardsequence.getText()));
		}
		/******************** molecularsequencequalitystandardsequencecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequencequalitystandardsequencecoding = molecularsequencequalitystandardsequence.getCodingFirstRep();

		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencequalitystandardsequencecoding.hasVersion()) {
			m.setMoleclrSqncQualityStandardSqncCdgVrsn(String.valueOf(molecularsequencequalitystandardsequencecoding.getVersion()));
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Dsply ********************************************************************************/
		if(molecularsequencequalitystandardsequencecoding.hasDisplay()) {
			m.setMoleclrSqncQualityStandardSqncCdgDsply(String.valueOf(molecularsequencequalitystandardsequencecoding.getDisplay()));
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Cd ********************************************************************************/
		if(molecularsequencequalitystandardsequencecoding.hasCode()) {
			m.setMoleclrSqncQualityStandardSqncCdgCd(String.valueOf(molecularsequencequalitystandardsequencecoding.getCode()));
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencequalitystandardsequencecoding.hasUserSelected()) {
			m.setMoleclrSqncQualityStandardSqncCdgUsrSltd(String.valueOf(molecularsequencequalitystandardsequencecoding.getUserSelected()));
		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Sys ********************************************************************************/
		if(molecularsequencequalitystandardsequencecoding.hasSystem()) {
			m.setMoleclrSqncQualityStandardSqncCdgSys(String.valueOf(molecularsequencequalitystandardsequencecoding.getSystem()));
		}
		/******************** MoleclrSqnc_Quality_Precision ********************************************************************************/
		if(molecularsequencequality.hasPrecision()) {
			m.setMoleclrSqncQualityPrecision(String.valueOf(molecularsequencequality.getPrecision()));
		}
		/******************** MoleclrSqnc_Quality_Strt ********************************************************************************/
		if(molecularsequencequality.hasStart()) {
			m.setMoleclrSqncQualityStrt(String.valueOf(molecularsequencequality.getStart()));
		}
		/******************** molecularsequencequalityscore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity molecularsequencequalityscore = molecularsequencequality.getScore();

		/******************** MoleclrSqnc_Quality_Score_Vl ********************************************************************************/
		if(molecularsequencequalityscore.hasValue()) {
			m.setMoleclrSqncQualityScoreVl(String.valueOf(molecularsequencequalityscore.getValue()));
		}
		/******************** molecularsequencequalityscorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator molecularsequencequalityscorecomparator = molecularsequencequalityscore.getComparator();
		m.setMoleclrSqncQualityScoreCmprtr(molecularsequencequalityscorecomparator.toCode());

		/******************** MoleclrSqnc_Quality_Score_Cd ********************************************************************************/
		if(molecularsequencequalityscore.hasCode()) {
			m.setMoleclrSqncQualityScoreCd(String.valueOf(molecularsequencequalityscore.getCode()));
		}
		/******************** MoleclrSqnc_Quality_Score_Unt ********************************************************************************/
		if(molecularsequencequalityscore.hasUnit()) {
			m.setMoleclrSqncQualityScoreUnt(String.valueOf(molecularsequencequalityscore.getUnit()));
		}
		/******************** MoleclrSqnc_Quality_Score_Sys ********************************************************************************/
		if(molecularsequencequalityscore.hasSystem()) {
			m.setMoleclrSqncQualityScoreSys(String.valueOf(molecularsequencequalityscore.getSystem()));
		}
		/******************** MoleclrSqnc_Quality_End ********************************************************************************/
		if(molecularsequencequality.hasEnd()) {
			m.setMoleclrSqncQualityEnd(String.valueOf(molecularsequencequality.getEnd()));
		}
		/******************** MoleclrSqnc_Pointer ********************************************************************************/
		if(molecularsequence.hasPointer()) {
			m.setMoleclrSqncPointer(String.valueOf(molecularsequence.getPointerFirstRep()));
		}
		/******************** molecularsequenceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier molecularsequenceidentifier = molecularsequence.getIdentifierFirstRep();

		/******************** MoleclrSqnc_Id_Vl ********************************************************************************/
		if(molecularsequenceidentifier.hasValue()) {
			m.setMoleclrSqncIdVl(String.valueOf(molecularsequenceidentifier.getValue()));
		}
		/******************** molecularsequenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequenceidentifiertype = molecularsequenceidentifier.getType();

		/******************** MoleclrSqnc_Id_Typ_Txt ********************************************************************************/
		if(molecularsequenceidentifiertype.hasText()) {
			m.setMoleclrSqncIdTypTxt(String.valueOf(molecularsequenceidentifiertype.getText()));
		}
		/******************** molecularsequenceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding molecularsequenceidentifiertypecoding = molecularsequenceidentifiertype.getCodingFirstRep();

		/******************** MoleclrSqnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(molecularsequenceidentifiertypecoding.hasVersion()) {
			m.setMoleclrSqncIdTypCdgVrsn(String.valueOf(molecularsequenceidentifiertypecoding.getVersion()));
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(molecularsequenceidentifiertypecoding.hasDisplay()) {
			m.setMoleclrSqncIdTypCdgDsply(String.valueOf(molecularsequenceidentifiertypecoding.getDisplay()));
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(molecularsequenceidentifiertypecoding.hasCode()) {
			m.setMoleclrSqncIdTypCdgCd(String.valueOf(molecularsequenceidentifiertypecoding.getCode()));
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequenceidentifiertypecoding.hasUserSelected()) {
			m.setMoleclrSqncIdTypCdgUsrSltd(String.valueOf(molecularsequenceidentifiertypecoding.getUserSelected()));
		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(molecularsequenceidentifiertypecoding.hasSystem()) {
			m.setMoleclrSqncIdTypCdgSys(String.valueOf(molecularsequenceidentifiertypecoding.getSystem()));
		}
		/******************** molecularsequenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period molecularsequenceidentifierperiod = molecularsequenceidentifier.getPeriod();

		/******************** MoleclrSqnc_Id_Prd_Strt ********************************************************************************/
		if(molecularsequenceidentifierperiod.hasStart()) {
			m.setMoleclrSqncIdPrdStrt(String.valueOf(molecularsequenceidentifierperiod.getStart()));
		}
		/******************** MoleclrSqnc_Id_Prd_End ********************************************************************************/
		if(molecularsequenceidentifierperiod.hasEnd()) {
			m.setMoleclrSqncIdPrdEnd(String.valueOf(molecularsequenceidentifierperiod.getEnd()));
		}
		/******************** MoleclrSqnc_Id_Assigner ********************************************************************************/
		if(molecularsequenceidentifier.hasAssigner()) {
			m.setMoleclrSqncIdAssigner(String.valueOf(molecularsequenceidentifier.getAssigner()));
		}
		/******************** MoleclrSqnc_Id_Sys ********************************************************************************/
		if(molecularsequenceidentifier.hasSystem()) {
			m.setMoleclrSqncIdSys(String.valueOf(molecularsequenceidentifier.getSystem()));
		}
		/******************** molecularsequenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse molecularsequenceidentifieruse = molecularsequenceidentifier.getUse();
		m.setMoleclrSqncIdUse(molecularsequenceidentifieruse.toCode());

		/******************** MoleclrSqnc_Dvc ********************************************************************************/
		if(molecularsequence.hasDevice()) {
			m.setMoleclrSqncDvc(String.valueOf(molecularsequence.getDevice()));
		}
		return m;
	}
}
