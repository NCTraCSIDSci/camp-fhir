package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MolecularSequence;
public class MolecularSequenceBidirectionalConversion 
{
	public MolecularSequence MolecularSequences(org.hl7.fhir.r4.model.MolecularSequence molecularsequence) throws ParseException
	{
		 main.java.com.campfhir.model.MolecularSequence m = new  main.java.com.campfhir.model.MolecularSequence();

		/******************** id ********************************************************************************/
		m.setId(molecularsequence.getIdElement().getIdPart());

		/******************** molecularsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.SequenceType molecularsequencetype = molecularsequence.getType();
		if(molecularsequencetype!=null) {
			m.addMoleclrSqncTyp(molecularsequencetype.toCode());
		} else {
			m.addMoleclrSqncTyp("NULL");
		}

		/******************** molecularsequencevariant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent> molecularsequencevariantlist = molecularsequence.getVariant();
		for(int molecularsequencevarianti = 0; molecularsequencevarianti<molecularsequencevariantlist.size();molecularsequencevarianti++ ) {
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent  molecularsequencevariant = molecularsequencevariantlist.get(molecularsequencevarianti);

		/******************** MoleclrSqnc_Variant_Strt ********************************************************************************/
		if(molecularsequencevarianti == 0) {m.addMoleclrSqncVariantStrt("[");}
		if(molecularsequencevariant.hasStart()) {

			m.addMoleclrSqncVariantStrt(String.valueOf(molecularsequencevariant.getStart()));
		} else {
			m.addMoleclrSqncVariantStrt("NULL");
		}

		if(molecularsequencevarianti == molecularsequencevariantlist.size()-1) {m.addMoleclrSqncVariantStrt("]");}


		/******************** MoleclrSqnc_Variant_End ********************************************************************************/
		if(molecularsequencevarianti == 0) {m.addMoleclrSqncVariantEnd("[");}
		if(molecularsequencevariant.hasEnd()) {

			m.addMoleclrSqncVariantEnd(String.valueOf(molecularsequencevariant.getEnd()));
		} else {
			m.addMoleclrSqncVariantEnd("NULL");
		}

		if(molecularsequencevarianti == molecularsequencevariantlist.size()-1) {m.addMoleclrSqncVariantEnd("]");}


		/******************** MoleclrSqnc_Variant_RfrncAllele ********************************************************************************/
		if(molecularsequencevarianti == 0) {m.addMoleclrSqncVariantRfrncAllele("[");}
		if(molecularsequencevariant.hasReferenceAllele()) {

			m.addMoleclrSqncVariantRfrncAllele(String.valueOf(molecularsequencevariant.getReferenceAllele()));
		} else {
			m.addMoleclrSqncVariantRfrncAllele("NULL");
		}

		if(molecularsequencevarianti == molecularsequencevariantlist.size()-1) {m.addMoleclrSqncVariantRfrncAllele("]");}


		/******************** MoleclrSqnc_Variant_Cigar ********************************************************************************/
		if(molecularsequencevarianti == 0) {m.addMoleclrSqncVariantCigar("[");}
		if(molecularsequencevariant.hasCigar()) {

			m.addMoleclrSqncVariantCigar(String.valueOf(molecularsequencevariant.getCigar()));
		} else {
			m.addMoleclrSqncVariantCigar("NULL");
		}

		if(molecularsequencevarianti == molecularsequencevariantlist.size()-1) {m.addMoleclrSqncVariantCigar("]");}


		/******************** MoleclrSqnc_Variant_ObservedAllele ********************************************************************************/
		if(molecularsequencevarianti == 0) {m.addMoleclrSqncVariantObservedAllele("[");}
		if(molecularsequencevariant.hasObservedAllele()) {

			m.addMoleclrSqncVariantObservedAllele(String.valueOf(molecularsequencevariant.getObservedAllele()));
		} else {
			m.addMoleclrSqncVariantObservedAllele("NULL");
		}

		if(molecularsequencevarianti == molecularsequencevariantlist.size()-1) {m.addMoleclrSqncVariantObservedAllele("]");}


		 };
		/******************** molecularsequenceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> molecularsequenceidentifierlist = molecularsequence.getIdentifier();
		for(int molecularsequenceidentifieri = 0; molecularsequenceidentifieri<molecularsequenceidentifierlist.size();molecularsequenceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  molecularsequenceidentifier = molecularsequenceidentifierlist.get(molecularsequenceidentifieri);

		/******************** MoleclrSqnc_Id_Vl ********************************************************************************/
		if(molecularsequenceidentifieri == 0) {m.addMoleclrSqncIdVl("[");}
		if(molecularsequenceidentifier.hasValue()) {

			m.addMoleclrSqncIdVl(String.valueOf(molecularsequenceidentifier.getValue()));
		} else {
			m.addMoleclrSqncIdVl("NULL");
		}

		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {m.addMoleclrSqncIdVl("]");}


		/******************** molecularsequenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequenceidentifiertype = molecularsequenceidentifier.getType();

		/******************** MoleclrSqnc_Id_Typ_Txt ********************************************************************************/
		if(molecularsequenceidentifieri == 0) {m.addMoleclrSqncIdTypTxt("[");}
		if(molecularsequenceidentifiertype.hasText()) {

			m.addMoleclrSqncIdTypTxt(String.valueOf(molecularsequenceidentifiertype.getText()));
		} else {
			m.addMoleclrSqncIdTypTxt("NULL");
		}

		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {m.addMoleclrSqncIdTypTxt("]");}


		/******************** molecularsequenceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> molecularsequenceidentifiertypecodinglist = molecularsequenceidentifiertype.getCoding();
		for(int molecularsequenceidentifiertypecodingi = 0; molecularsequenceidentifiertypecodingi<molecularsequenceidentifiertypecodinglist.size();molecularsequenceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  molecularsequenceidentifiertypecoding = molecularsequenceidentifiertypecodinglist.get(molecularsequenceidentifiertypecodingi);

		/******************** MoleclrSqnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(molecularsequenceidentifiertypecodingi == 0) {m.addMoleclrSqncIdTypCdgDsply("[[");}
		if(molecularsequenceidentifiertypecoding.hasDisplay()) {

			m.addMoleclrSqncIdTypCdgDsply(String.valueOf(molecularsequenceidentifiertypecoding.getDisplay()));
		} else {
			m.addMoleclrSqncIdTypCdgDsply("NULL");
		}

		if(molecularsequenceidentifiertypecodingi == molecularsequenceidentifiertypecodinglist.size()-1) {m.addMoleclrSqncIdTypCdgDsply("]]");}


		/******************** MoleclrSqnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(molecularsequenceidentifiertypecodingi == 0) {m.addMoleclrSqncIdTypCdgVrsn("[[");}
		if(molecularsequenceidentifiertypecoding.hasVersion()) {

			m.addMoleclrSqncIdTypCdgVrsn(String.valueOf(molecularsequenceidentifiertypecoding.getVersion()));
		} else {
			m.addMoleclrSqncIdTypCdgVrsn("NULL");
		}

		if(molecularsequenceidentifiertypecodingi == molecularsequenceidentifiertypecodinglist.size()-1) {m.addMoleclrSqncIdTypCdgVrsn("]]");}


		/******************** MoleclrSqnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(molecularsequenceidentifiertypecodingi == 0) {m.addMoleclrSqncIdTypCdgCd("[[");}
		if(molecularsequenceidentifiertypecoding.hasCode()) {

			m.addMoleclrSqncIdTypCdgCd(String.valueOf(molecularsequenceidentifiertypecoding.getCode()));
		} else {
			m.addMoleclrSqncIdTypCdgCd("NULL");
		}

		if(molecularsequenceidentifiertypecodingi == molecularsequenceidentifiertypecodinglist.size()-1) {m.addMoleclrSqncIdTypCdgCd("]]");}


		/******************** MoleclrSqnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequenceidentifiertypecodingi == 0) {m.addMoleclrSqncIdTypCdgUsrSltd("[[");}
		if(molecularsequenceidentifiertypecoding.hasUserSelected()) {

			m.addMoleclrSqncIdTypCdgUsrSltd(String.valueOf(molecularsequenceidentifiertypecoding.getUserSelected()));
		} else {
			m.addMoleclrSqncIdTypCdgUsrSltd("NULL");
		}

		if(molecularsequenceidentifiertypecodingi == molecularsequenceidentifiertypecodinglist.size()-1) {m.addMoleclrSqncIdTypCdgUsrSltd("]]");}


		/******************** MoleclrSqnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(molecularsequenceidentifiertypecodingi == 0) {m.addMoleclrSqncIdTypCdgSys("[[");}
		if(molecularsequenceidentifiertypecoding.hasSystem()) {

			m.addMoleclrSqncIdTypCdgSys(String.valueOf(molecularsequenceidentifiertypecoding.getSystem()));
		} else {
			m.addMoleclrSqncIdTypCdgSys("NULL");
		}

		if(molecularsequenceidentifiertypecodingi == molecularsequenceidentifiertypecodinglist.size()-1) {m.addMoleclrSqncIdTypCdgSys("]]");}


		 };
		/******************** molecularsequenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period molecularsequenceidentifierperiod = molecularsequenceidentifier.getPeriod();

		/******************** MoleclrSqnc_Id_Prd_Strt ********************************************************************************/
		if(molecularsequenceidentifieri == 0) {m.addMoleclrSqncIdPrdStrt("[");}
		if(molecularsequenceidentifierperiod.hasStart()) {

			m.addMoleclrSqncIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(molecularsequenceidentifierperiod.getStart())+"\"");
		} else {
			m.addMoleclrSqncIdPrdStrt("NULL");
		}

		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {m.addMoleclrSqncIdPrdStrt("]");}


		/******************** MoleclrSqnc_Id_Prd_End ********************************************************************************/
		if(molecularsequenceidentifieri == 0) {m.addMoleclrSqncIdPrdEnd("[");}
		if(molecularsequenceidentifierperiod.hasEnd()) {

			m.addMoleclrSqncIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(molecularsequenceidentifierperiod.getEnd())+"\"");
		} else {
			m.addMoleclrSqncIdPrdEnd("NULL");
		}

		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {m.addMoleclrSqncIdPrdEnd("]");}


		/******************** molecularsequenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse molecularsequenceidentifieruse = molecularsequenceidentifier.getUse();
		if(molecularsequenceidentifieruse!=null) {
		if(molecularsequenceidentifieri == 0) {

		m.addMoleclrSqncIdUse("[");		}
			m.addMoleclrSqncIdUse(molecularsequenceidentifieruse.toCode());
		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {

		m.addMoleclrSqncIdUse("]");		}

		} else {
			m.addMoleclrSqncIdUse("NULL");
		}

		/******************** MoleclrSqnc_Id_Assigner ********************************************************************************/
		if(molecularsequenceidentifieri == 0) {m.addMoleclrSqncIdAssigner("[");}
		if(molecularsequenceidentifier.hasAssigner()) {

			if(molecularsequenceidentifier.getAssigner().getReference() != null) {
			m.addMoleclrSqncIdAssigner(molecularsequenceidentifier.getAssigner().getReference());
			}
		} else {
			m.addMoleclrSqncIdAssigner("NULL");
		}

		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {m.addMoleclrSqncIdAssigner("]");}


		/******************** MoleclrSqnc_Id_Sys ********************************************************************************/
		if(molecularsequenceidentifieri == 0) {m.addMoleclrSqncIdSys("[");}
		if(molecularsequenceidentifier.hasSystem()) {

			m.addMoleclrSqncIdSys(String.valueOf(molecularsequenceidentifier.getSystem()));
		} else {
			m.addMoleclrSqncIdSys("NULL");
		}

		if(molecularsequenceidentifieri == molecularsequenceidentifierlist.size()-1) {m.addMoleclrSqncIdSys("]");}


		 };
		/******************** molecularsequencereferenceseq ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent molecularsequencereferenceseq = molecularsequence.getReferenceSeq();

		/******************** molecularsequencereferenceseqchromosome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencereferenceseqchromosome = molecularsequencereferenceseq.getChromosome();

		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Txt ********************************************************************************/
		if(molecularsequencereferenceseqchromosome.hasText()) {

			m.addMoleclrSqncRfrncSeqChromosomeTxt(String.valueOf(molecularsequencereferenceseqchromosome.getText()));
		} else {
			m.addMoleclrSqncRfrncSeqChromosomeTxt("NULL");
		}


		/******************** molecularsequencereferenceseqchromosomecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> molecularsequencereferenceseqchromosomecodinglist = molecularsequencereferenceseqchromosome.getCoding();
		for(int molecularsequencereferenceseqchromosomecodingi = 0; molecularsequencereferenceseqchromosomecodingi<molecularsequencereferenceseqchromosomecodinglist.size();molecularsequencereferenceseqchromosomecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  molecularsequencereferenceseqchromosomecoding = molecularsequencereferenceseqchromosomecodinglist.get(molecularsequencereferenceseqchromosomecodingi);

		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Dsply ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecodingi == 0) {m.addMoleclrSqncRfrncSeqChromosomeCdgDsply("[");}
		if(molecularsequencereferenceseqchromosomecoding.hasDisplay()) {

			m.addMoleclrSqncRfrncSeqChromosomeCdgDsply(String.valueOf(molecularsequencereferenceseqchromosomecoding.getDisplay()));
		} else {
			m.addMoleclrSqncRfrncSeqChromosomeCdgDsply("NULL");
		}

		if(molecularsequencereferenceseqchromosomecodingi == molecularsequencereferenceseqchromosomecodinglist.size()-1) {m.addMoleclrSqncRfrncSeqChromosomeCdgDsply("]");}


		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecodingi == 0) {m.addMoleclrSqncRfrncSeqChromosomeCdgVrsn("[");}
		if(molecularsequencereferenceseqchromosomecoding.hasVersion()) {

			m.addMoleclrSqncRfrncSeqChromosomeCdgVrsn(String.valueOf(molecularsequencereferenceseqchromosomecoding.getVersion()));
		} else {
			m.addMoleclrSqncRfrncSeqChromosomeCdgVrsn("NULL");
		}

		if(molecularsequencereferenceseqchromosomecodingi == molecularsequencereferenceseqchromosomecodinglist.size()-1) {m.addMoleclrSqncRfrncSeqChromosomeCdgVrsn("]");}


		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Cd ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecodingi == 0) {m.addMoleclrSqncRfrncSeqChromosomeCdgCd("[");}
		if(molecularsequencereferenceseqchromosomecoding.hasCode()) {

			m.addMoleclrSqncRfrncSeqChromosomeCdgCd(String.valueOf(molecularsequencereferenceseqchromosomecoding.getCode()));
		} else {
			m.addMoleclrSqncRfrncSeqChromosomeCdgCd("NULL");
		}

		if(molecularsequencereferenceseqchromosomecodingi == molecularsequencereferenceseqchromosomecodinglist.size()-1) {m.addMoleclrSqncRfrncSeqChromosomeCdgCd("]");}


		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecodingi == 0) {m.addMoleclrSqncRfrncSeqChromosomeCdgUsrSltd("[");}
		if(molecularsequencereferenceseqchromosomecoding.hasUserSelected()) {

			m.addMoleclrSqncRfrncSeqChromosomeCdgUsrSltd(String.valueOf(molecularsequencereferenceseqchromosomecoding.getUserSelected()));
		} else {
			m.addMoleclrSqncRfrncSeqChromosomeCdgUsrSltd("NULL");
		}

		if(molecularsequencereferenceseqchromosomecodingi == molecularsequencereferenceseqchromosomecodinglist.size()-1) {m.addMoleclrSqncRfrncSeqChromosomeCdgUsrSltd("]");}


		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Sys ********************************************************************************/
		if(molecularsequencereferenceseqchromosomecodingi == 0) {m.addMoleclrSqncRfrncSeqChromosomeCdgSys("[");}
		if(molecularsequencereferenceseqchromosomecoding.hasSystem()) {

			m.addMoleclrSqncRfrncSeqChromosomeCdgSys(String.valueOf(molecularsequencereferenceseqchromosomecoding.getSystem()));
		} else {
			m.addMoleclrSqncRfrncSeqChromosomeCdgSys("NULL");
		}

		if(molecularsequencereferenceseqchromosomecodingi == molecularsequencereferenceseqchromosomecodinglist.size()-1) {m.addMoleclrSqncRfrncSeqChromosomeCdgSys("]");}


		 };
		/******************** MoleclrSqnc_RfrncSeq_GenomeBuild ********************************************************************************/
		if(molecularsequencereferenceseq.hasGenomeBuild()) {

			m.addMoleclrSqncRfrncSeqGenomeBuild(String.valueOf(molecularsequencereferenceseq.getGenomeBuild()));
		} else {
			m.addMoleclrSqncRfrncSeqGenomeBuild("NULL");
		}


		/******************** molecularsequencereferenceseqorientation ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.OrientationType molecularsequencereferenceseqorientation = molecularsequencereferenceseq.getOrientation();
		if(molecularsequencereferenceseqorientation!=null) {
			m.addMoleclrSqncRfrncSeqOrientation(molecularsequencereferenceseqorientation.toCode());
		} else {
			m.addMoleclrSqncRfrncSeqOrientation("NULL");
		}

		/******************** molecularsequencereferenceseqreferenceseqid ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencereferenceseqreferenceseqid = molecularsequencereferenceseq.getReferenceSeqId();

		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Txt ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqid.hasText()) {

			m.addMoleclrSqncRfrncSeqRfrncSeqIdTxt(String.valueOf(molecularsequencereferenceseqreferenceseqid.getText()));
		} else {
			m.addMoleclrSqncRfrncSeqRfrncSeqIdTxt("NULL");
		}


		/******************** molecularsequencereferenceseqreferenceseqidcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> molecularsequencereferenceseqreferenceseqidcodinglist = molecularsequencereferenceseqreferenceseqid.getCoding();
		for(int molecularsequencereferenceseqreferenceseqidcodingi = 0; molecularsequencereferenceseqreferenceseqidcodingi<molecularsequencereferenceseqreferenceseqidcodinglist.size();molecularsequencereferenceseqreferenceseqidcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  molecularsequencereferenceseqreferenceseqidcoding = molecularsequencereferenceseqreferenceseqidcodinglist.get(molecularsequencereferenceseqreferenceseqidcodingi);

		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Dsply ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcodingi == 0) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply("[");}
		if(molecularsequencereferenceseqreferenceseqidcoding.hasDisplay()) {

			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getDisplay()));
		} else {
			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply("NULL");
		}

		if(molecularsequencereferenceseqreferenceseqidcodingi == molecularsequencereferenceseqreferenceseqidcodinglist.size()-1) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply("]");}


		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcodingi == 0) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn("[");}
		if(molecularsequencereferenceseqreferenceseqidcoding.hasVersion()) {

			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getVersion()));
		} else {
			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn("NULL");
		}

		if(molecularsequencereferenceseqreferenceseqidcodingi == molecularsequencereferenceseqreferenceseqidcodinglist.size()-1) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn("]");}


		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Cd ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcodingi == 0) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgCd("[");}
		if(molecularsequencereferenceseqreferenceseqidcoding.hasCode()) {

			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgCd(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getCode()));
		} else {
			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgCd("NULL");
		}

		if(molecularsequencereferenceseqreferenceseqidcodingi == molecularsequencereferenceseqreferenceseqidcodinglist.size()-1) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgCd("]");}


		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcodingi == 0) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd("[");}
		if(molecularsequencereferenceseqreferenceseqidcoding.hasUserSelected()) {

			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getUserSelected()));
		} else {
			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd("NULL");
		}

		if(molecularsequencereferenceseqreferenceseqidcodingi == molecularsequencereferenceseqreferenceseqidcodinglist.size()-1) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd("]");}


		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Sys ********************************************************************************/
		if(molecularsequencereferenceseqreferenceseqidcodingi == 0) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgSys("[");}
		if(molecularsequencereferenceseqreferenceseqidcoding.hasSystem()) {

			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgSys(String.valueOf(molecularsequencereferenceseqreferenceseqidcoding.getSystem()));
		} else {
			m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgSys("NULL");
		}

		if(molecularsequencereferenceseqreferenceseqidcodingi == molecularsequencereferenceseqreferenceseqidcodinglist.size()-1) {m.addMoleclrSqncRfrncSeqRfrncSeqIdCdgSys("]");}


		 };
		/******************** molecularsequencereferenceseqstrand ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.StrandType molecularsequencereferenceseqstrand = molecularsequencereferenceseq.getStrand();
		if(molecularsequencereferenceseqstrand!=null) {
			m.addMoleclrSqncRfrncSeqStrand(molecularsequencereferenceseqstrand.toCode());
		} else {
			m.addMoleclrSqncRfrncSeqStrand("NULL");
		}

		/******************** MoleclrSqnc_RfrncSeq_WindowStrt ********************************************************************************/
		if(molecularsequencereferenceseq.hasWindowStart()) {

			m.addMoleclrSqncRfrncSeqWindowStrt(String.valueOf(molecularsequencereferenceseq.getWindowStart()));
		} else {
			m.addMoleclrSqncRfrncSeqWindowStrt("NULL");
		}


		/******************** MoleclrSqnc_RfrncSeq_WindowEnd ********************************************************************************/
		if(molecularsequencereferenceseq.hasWindowEnd()) {

			m.addMoleclrSqncRfrncSeqWindowEnd(String.valueOf(molecularsequencereferenceseq.getWindowEnd()));
		} else {
			m.addMoleclrSqncRfrncSeqWindowEnd("NULL");
		}


		/******************** MoleclrSqnc_ObservedSeq ********************************************************************************/
		if(molecularsequence.hasObservedSeq()) {

			m.addMoleclrSqncObservedSeq(String.valueOf(molecularsequence.getObservedSeq()));
		} else {
			m.addMoleclrSqncObservedSeq("NULL");
		}


		/******************** molecularsequencequality ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent> molecularsequencequalitylist = molecularsequence.getQuality();
		for(int molecularsequencequalityi = 0; molecularsequencequalityi<molecularsequencequalitylist.size();molecularsequencequalityi++ ) {
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent  molecularsequencequality = molecularsequencequalitylist.get(molecularsequencequalityi);

		/******************** molecularsequencequalitymethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencequalitymethod = molecularsequencequality.getMethod();

		/******************** MoleclrSqnc_Quality_Mthd_Txt ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityMthdTxt("[");}
		if(molecularsequencequalitymethod.hasText()) {

			m.addMoleclrSqncQualityMthdTxt(String.valueOf(molecularsequencequalitymethod.getText()));
		} else {
			m.addMoleclrSqncQualityMthdTxt("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityMthdTxt("]");}


		/******************** molecularsequencequalitymethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> molecularsequencequalitymethodcodinglist = molecularsequencequalitymethod.getCoding();
		for(int molecularsequencequalitymethodcodingi = 0; molecularsequencequalitymethodcodingi<molecularsequencequalitymethodcodinglist.size();molecularsequencequalitymethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  molecularsequencequalitymethodcoding = molecularsequencequalitymethodcodinglist.get(molecularsequencequalitymethodcodingi);

		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Dsply ********************************************************************************/
		if(molecularsequencequalitymethodcodingi == 0) {m.addMoleclrSqncQualityMthdCdgDsply("[[");}
		if(molecularsequencequalitymethodcoding.hasDisplay()) {

			m.addMoleclrSqncQualityMthdCdgDsply(String.valueOf(molecularsequencequalitymethodcoding.getDisplay()));
		} else {
			m.addMoleclrSqncQualityMthdCdgDsply("NULL");
		}

		if(molecularsequencequalitymethodcodingi == molecularsequencequalitymethodcodinglist.size()-1) {m.addMoleclrSqncQualityMthdCdgDsply("]]");}


		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencequalitymethodcodingi == 0) {m.addMoleclrSqncQualityMthdCdgVrsn("[[");}
		if(molecularsequencequalitymethodcoding.hasVersion()) {

			m.addMoleclrSqncQualityMthdCdgVrsn(String.valueOf(molecularsequencequalitymethodcoding.getVersion()));
		} else {
			m.addMoleclrSqncQualityMthdCdgVrsn("NULL");
		}

		if(molecularsequencequalitymethodcodingi == molecularsequencequalitymethodcodinglist.size()-1) {m.addMoleclrSqncQualityMthdCdgVrsn("]]");}


		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Cd ********************************************************************************/
		if(molecularsequencequalitymethodcodingi == 0) {m.addMoleclrSqncQualityMthdCdgCd("[[");}
		if(molecularsequencequalitymethodcoding.hasCode()) {

			m.addMoleclrSqncQualityMthdCdgCd(String.valueOf(molecularsequencequalitymethodcoding.getCode()));
		} else {
			m.addMoleclrSqncQualityMthdCdgCd("NULL");
		}

		if(molecularsequencequalitymethodcodingi == molecularsequencequalitymethodcodinglist.size()-1) {m.addMoleclrSqncQualityMthdCdgCd("]]");}


		/******************** MoleclrSqnc_Quality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencequalitymethodcodingi == 0) {m.addMoleclrSqncQualityMthdCdgUsrSltd("[[");}
		if(molecularsequencequalitymethodcoding.hasUserSelected()) {

			m.addMoleclrSqncQualityMthdCdgUsrSltd(String.valueOf(molecularsequencequalitymethodcoding.getUserSelected()));
		} else {
			m.addMoleclrSqncQualityMthdCdgUsrSltd("NULL");
		}

		if(molecularsequencequalitymethodcodingi == molecularsequencequalitymethodcodinglist.size()-1) {m.addMoleclrSqncQualityMthdCdgUsrSltd("]]");}


		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Sys ********************************************************************************/
		if(molecularsequencequalitymethodcodingi == 0) {m.addMoleclrSqncQualityMthdCdgSys("[[");}
		if(molecularsequencequalitymethodcoding.hasSystem()) {

			m.addMoleclrSqncQualityMthdCdgSys(String.valueOf(molecularsequencequalitymethodcoding.getSystem()));
		} else {
			m.addMoleclrSqncQualityMthdCdgSys("NULL");
		}

		if(molecularsequencequalitymethodcodingi == molecularsequencequalitymethodcodinglist.size()-1) {m.addMoleclrSqncQualityMthdCdgSys("]]");}


		 };
		/******************** molecularsequencequalitytype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.QualityType molecularsequencequalitytype = molecularsequencequality.getType();
		if(molecularsequencequalitytype!=null) {
		if(molecularsequencequalityi == 0) {

		m.addMoleclrSqncQualityTyp("[");		}
			m.addMoleclrSqncQualityTyp(molecularsequencequalitytype.toCode());
		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {

		m.addMoleclrSqncQualityTyp("]");		}

		} else {
			m.addMoleclrSqncQualityTyp("NULL");
		}

		/******************** molecularsequencequalityscore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity molecularsequencequalityscore = molecularsequencequality.getScore();

		/******************** MoleclrSqnc_Quality_Score_Vl ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityScoreVl("[");}
		if(molecularsequencequalityscore.hasValue()) {

			m.addMoleclrSqncQualityScoreVl(String.valueOf(molecularsequencequalityscore.getValue()));
		} else {
			m.addMoleclrSqncQualityScoreVl("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityScoreVl("]");}


		/******************** molecularsequencequalityscorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator molecularsequencequalityscorecomparator = molecularsequencequalityscore.getComparator();
		if(molecularsequencequalityscorecomparator!=null) {
		if(molecularsequencequalityi == 0) {

		m.addMoleclrSqncQualityScoreCmprtr("[");		}
			m.addMoleclrSqncQualityScoreCmprtr(molecularsequencequalityscorecomparator.toCode());
		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {

		m.addMoleclrSqncQualityScoreCmprtr("]");		}

		} else {
			m.addMoleclrSqncQualityScoreCmprtr("NULL");
		}

		/******************** MoleclrSqnc_Quality_Score_Cd ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityScoreCd("[");}
		if(molecularsequencequalityscore.hasCode()) {

			m.addMoleclrSqncQualityScoreCd(String.valueOf(molecularsequencequalityscore.getCode()));
		} else {
			m.addMoleclrSqncQualityScoreCd("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityScoreCd("]");}


		/******************** MoleclrSqnc_Quality_Score_Unt ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityScoreUnt("[");}
		if(molecularsequencequalityscore.hasUnit()) {

			m.addMoleclrSqncQualityScoreUnt(String.valueOf(molecularsequencequalityscore.getUnit()));
		} else {
			m.addMoleclrSqncQualityScoreUnt("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityScoreUnt("]");}


		/******************** MoleclrSqnc_Quality_Score_Sys ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityScoreSys("[");}
		if(molecularsequencequalityscore.hasSystem()) {

			m.addMoleclrSqncQualityScoreSys(String.valueOf(molecularsequencequalityscore.getSystem()));
		} else {
			m.addMoleclrSqncQualityScoreSys("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityScoreSys("]");}


		/******************** MoleclrSqnc_Quality_Precision ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityPrecision("[");}
		if(molecularsequencequality.hasPrecision()) {

			m.addMoleclrSqncQualityPrecision(String.valueOf(molecularsequencequality.getPrecision()));
		} else {
			m.addMoleclrSqncQualityPrecision("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityPrecision("]");}


		/******************** MoleclrSqnc_Quality_Strt ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityStrt("[");}
		if(molecularsequencequality.hasStart()) {

			m.addMoleclrSqncQualityStrt(String.valueOf(molecularsequencequality.getStart()));
		} else {
			m.addMoleclrSqncQualityStrt("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityStrt("]");}


		/******************** MoleclrSqnc_Quality_End ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityEnd("[");}
		if(molecularsequencequality.hasEnd()) {

			m.addMoleclrSqncQualityEnd(String.valueOf(molecularsequencequality.getEnd()));
		} else {
			m.addMoleclrSqncQualityEnd("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityEnd("]");}


		/******************** molecularsequencequalitystandardsequence ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencequalitystandardsequence = molecularsequencequality.getStandardSequence();

		/******************** MoleclrSqnc_Quality_StandardSqnc_Txt ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityStandardSqncTxt("[");}
		if(molecularsequencequalitystandardsequence.hasText()) {

			m.addMoleclrSqncQualityStandardSqncTxt(String.valueOf(molecularsequencequalitystandardsequence.getText()));
		} else {
			m.addMoleclrSqncQualityStandardSqncTxt("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityStandardSqncTxt("]");}


		/******************** molecularsequencequalitystandardsequencecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> molecularsequencequalitystandardsequencecodinglist = molecularsequencequalitystandardsequence.getCoding();
		for(int molecularsequencequalitystandardsequencecodingi = 0; molecularsequencequalitystandardsequencecodingi<molecularsequencequalitystandardsequencecodinglist.size();molecularsequencequalitystandardsequencecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  molecularsequencequalitystandardsequencecoding = molecularsequencequalitystandardsequencecodinglist.get(molecularsequencequalitystandardsequencecodingi);

		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Dsply ********************************************************************************/
		if(molecularsequencequalitystandardsequencecodingi == 0) {m.addMoleclrSqncQualityStandardSqncCdgDsply("[[");}
		if(molecularsequencequalitystandardsequencecoding.hasDisplay()) {

			m.addMoleclrSqncQualityStandardSqncCdgDsply(String.valueOf(molecularsequencequalitystandardsequencecoding.getDisplay()));
		} else {
			m.addMoleclrSqncQualityStandardSqncCdgDsply("NULL");
		}

		if(molecularsequencequalitystandardsequencecodingi == molecularsequencequalitystandardsequencecodinglist.size()-1) {m.addMoleclrSqncQualityStandardSqncCdgDsply("]]");}


		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencequalitystandardsequencecodingi == 0) {m.addMoleclrSqncQualityStandardSqncCdgVrsn("[[");}
		if(molecularsequencequalitystandardsequencecoding.hasVersion()) {

			m.addMoleclrSqncQualityStandardSqncCdgVrsn(String.valueOf(molecularsequencequalitystandardsequencecoding.getVersion()));
		} else {
			m.addMoleclrSqncQualityStandardSqncCdgVrsn("NULL");
		}

		if(molecularsequencequalitystandardsequencecodingi == molecularsequencequalitystandardsequencecodinglist.size()-1) {m.addMoleclrSqncQualityStandardSqncCdgVrsn("]]");}


		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Cd ********************************************************************************/
		if(molecularsequencequalitystandardsequencecodingi == 0) {m.addMoleclrSqncQualityStandardSqncCdgCd("[[");}
		if(molecularsequencequalitystandardsequencecoding.hasCode()) {

			m.addMoleclrSqncQualityStandardSqncCdgCd(String.valueOf(molecularsequencequalitystandardsequencecoding.getCode()));
		} else {
			m.addMoleclrSqncQualityStandardSqncCdgCd("NULL");
		}

		if(molecularsequencequalitystandardsequencecodingi == molecularsequencequalitystandardsequencecodinglist.size()-1) {m.addMoleclrSqncQualityStandardSqncCdgCd("]]");}


		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencequalitystandardsequencecodingi == 0) {m.addMoleclrSqncQualityStandardSqncCdgUsrSltd("[[");}
		if(molecularsequencequalitystandardsequencecoding.hasUserSelected()) {

			m.addMoleclrSqncQualityStandardSqncCdgUsrSltd(String.valueOf(molecularsequencequalitystandardsequencecoding.getUserSelected()));
		} else {
			m.addMoleclrSqncQualityStandardSqncCdgUsrSltd("NULL");
		}

		if(molecularsequencequalitystandardsequencecodingi == molecularsequencequalitystandardsequencecodinglist.size()-1) {m.addMoleclrSqncQualityStandardSqncCdgUsrSltd("]]");}


		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Sys ********************************************************************************/
		if(molecularsequencequalitystandardsequencecodingi == 0) {m.addMoleclrSqncQualityStandardSqncCdgSys("[[");}
		if(molecularsequencequalitystandardsequencecoding.hasSystem()) {

			m.addMoleclrSqncQualityStandardSqncCdgSys(String.valueOf(molecularsequencequalitystandardsequencecoding.getSystem()));
		} else {
			m.addMoleclrSqncQualityStandardSqncCdgSys("NULL");
		}

		if(molecularsequencequalitystandardsequencecodingi == molecularsequencequalitystandardsequencecodinglist.size()-1) {m.addMoleclrSqncQualityStandardSqncCdgSys("]]");}


		 };
		/******************** MoleclrSqnc_Quality_TruthTp ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityTruthTp("[");}
		if(molecularsequencequality.hasTruthTP()) {

			m.addMoleclrSqncQualityTruthTp(String.valueOf(molecularsequencequality.getTruthTP()));
		} else {
			m.addMoleclrSqncQualityTruthTp("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityTruthTp("]");}


		/******************** MoleclrSqnc_Quality_TruthFn ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityTruthFn("[");}
		if(molecularsequencequality.hasTruthFN()) {

			m.addMoleclrSqncQualityTruthFn(String.valueOf(molecularsequencequality.getTruthFN()));
		} else {
			m.addMoleclrSqncQualityTruthFn("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityTruthFn("]");}


		/******************** MoleclrSqnc_Quality_QueryFp ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityQueryFp("[");}
		if(molecularsequencequality.hasQueryFP()) {

			m.addMoleclrSqncQualityQueryFp(String.valueOf(molecularsequencequality.getQueryFP()));
		} else {
			m.addMoleclrSqncQualityQueryFp("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityQueryFp("]");}


		/******************** MoleclrSqnc_Quality_GtFp ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityGtFp("[");}
		if(molecularsequencequality.hasGtFP()) {

			m.addMoleclrSqncQualityGtFp(String.valueOf(molecularsequencequality.getGtFP()));
		} else {
			m.addMoleclrSqncQualityGtFp("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityGtFp("]");}


		/******************** MoleclrSqnc_Quality_QueryTp ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityQueryTp("[");}
		if(molecularsequencequality.hasQueryTP()) {

			m.addMoleclrSqncQualityQueryTp(String.valueOf(molecularsequencequality.getQueryTP()));
		} else {
			m.addMoleclrSqncQualityQueryTp("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityQueryTp("]");}


		/******************** molecularsequencequalityroc ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent molecularsequencequalityroc = molecularsequencequality.getRoc();

		/******************** MoleclrSqnc_Quality_Roc_NumTp ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocNumTp("[");}
		if(molecularsequencequalityroc.hasNumTP()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getNumTP().size(); incr++) {
				array = array + molecularsequencequalityroc.getNumTP().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocNumTp(array);

		} else {
			m.addMoleclrSqncQualityRocNumTp("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocNumTp("]");}


		/******************** MoleclrSqnc_Quality_Roc_Fmsr ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocFmsr("[");}
		if(molecularsequencequalityroc.hasFMeasure()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getFMeasure().size(); incr++) {
				array = array + molecularsequencequalityroc.getFMeasure().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocFmsr(array);

		} else {
			m.addMoleclrSqncQualityRocFmsr("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocFmsr("]");}


		/******************** MoleclrSqnc_Quality_Roc_Sensitivity ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocSensitivity("[");}
		if(molecularsequencequalityroc.hasSensitivity()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getSensitivity().size(); incr++) {
				array = array + molecularsequencequalityroc.getSensitivity().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocSensitivity(array);

		} else {
			m.addMoleclrSqncQualityRocSensitivity("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocSensitivity("]");}


		/******************** MoleclrSqnc_Quality_Roc_NumFp ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocNumFp("[");}
		if(molecularsequencequalityroc.hasNumFP()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getNumFP().size(); incr++) {
				array = array + molecularsequencequalityroc.getNumFP().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocNumFp(array);

		} else {
			m.addMoleclrSqncQualityRocNumFp("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocNumFp("]");}


		/******************** MoleclrSqnc_Quality_Roc_NumFn ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocNumFn("[");}
		if(molecularsequencequalityroc.hasNumFN()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getNumFN().size(); incr++) {
				array = array + molecularsequencequalityroc.getNumFN().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocNumFn(array);

		} else {
			m.addMoleclrSqncQualityRocNumFn("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocNumFn("]");}


		/******************** MoleclrSqnc_Quality_Roc_Score ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocScore("[");}
		if(molecularsequencequalityroc.hasScore()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getScore().size(); incr++) {
				array = array + molecularsequencequalityroc.getScore().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocScore(array);

		} else {
			m.addMoleclrSqncQualityRocScore("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocScore("]");}


		/******************** MoleclrSqnc_Quality_Roc_Precision ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRocPrecision("[");}
		if(molecularsequencequalityroc.hasPrecision()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequencequalityroc.getPrecision().size(); incr++) {
				array = array + molecularsequencequalityroc.getPrecision().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncQualityRocPrecision(array);

		} else {
			m.addMoleclrSqncQualityRocPrecision("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRocPrecision("]");}


		/******************** MoleclrSqnc_Quality_Recall ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityRecall("[");}
		if(molecularsequencequality.hasRecall()) {

			m.addMoleclrSqncQualityRecall(String.valueOf(molecularsequencequality.getRecall()));
		} else {
			m.addMoleclrSqncQualityRecall("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityRecall("]");}


		/******************** MoleclrSqnc_Quality_Fscore ********************************************************************************/
		if(molecularsequencequalityi == 0) {m.addMoleclrSqncQualityFscore("[");}
		if(molecularsequencequality.hasFScore()) {

			m.addMoleclrSqncQualityFscore(String.valueOf(molecularsequencequality.getFScore()));
		} else {
			m.addMoleclrSqncQualityFscore("NULL");
		}

		if(molecularsequencequalityi == molecularsequencequalitylist.size()-1) {m.addMoleclrSqncQualityFscore("]");}


		 };
		/******************** molecularsequencerepository ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent> molecularsequencerepositorylist = molecularsequence.getRepository();
		for(int molecularsequencerepositoryi = 0; molecularsequencerepositoryi<molecularsequencerepositorylist.size();molecularsequencerepositoryi++ ) {
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent  molecularsequencerepository = molecularsequencerepositorylist.get(molecularsequencerepositoryi);

		/******************** MoleclrSqnc_Repository_Nm ********************************************************************************/
		if(molecularsequencerepositoryi == 0) {m.addMoleclrSqncRepositoryNm("[");}
		if(molecularsequencerepository.hasName()) {

			m.addMoleclrSqncRepositoryNm(String.valueOf(molecularsequencerepository.getName()));
		} else {
			m.addMoleclrSqncRepositoryNm("NULL");
		}

		if(molecularsequencerepositoryi == molecularsequencerepositorylist.size()-1) {m.addMoleclrSqncRepositoryNm("]");}


		/******************** molecularsequencerepositorytype ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.RepositoryType molecularsequencerepositorytype = molecularsequencerepository.getType();
		if(molecularsequencerepositorytype!=null) {
		if(molecularsequencerepositoryi == 0) {

		m.addMoleclrSqncRepositoryTyp("[");		}
			m.addMoleclrSqncRepositoryTyp(molecularsequencerepositorytype.toCode());
		if(molecularsequencerepositoryi == molecularsequencerepositorylist.size()-1) {

		m.addMoleclrSqncRepositoryTyp("]");		}

		} else {
			m.addMoleclrSqncRepositoryTyp("NULL");
		}

		/******************** MoleclrSqnc_Repository_Url ********************************************************************************/
		if(molecularsequencerepositoryi == 0) {m.addMoleclrSqncRepositoryUrl("[");}
		if(molecularsequencerepository.hasUrl()) {

			m.addMoleclrSqncRepositoryUrl(String.valueOf(molecularsequencerepository.getUrl()));
		} else {
			m.addMoleclrSqncRepositoryUrl("NULL");
		}

		if(molecularsequencerepositoryi == molecularsequencerepositorylist.size()-1) {m.addMoleclrSqncRepositoryUrl("]");}


		/******************** MoleclrSqnc_Repository_VariantId ********************************************************************************/
		if(molecularsequencerepositoryi == 0) {m.addMoleclrSqncRepositoryVariantId("[");}
		if(molecularsequencerepository.hasVariantsetId()) {

			m.addMoleclrSqncRepositoryVariantId(String.valueOf(molecularsequencerepository.getVariantsetId()));
		} else {
			m.addMoleclrSqncRepositoryVariantId("NULL");
		}

		if(molecularsequencerepositoryi == molecularsequencerepositorylist.size()-1) {m.addMoleclrSqncRepositoryVariantId("]");}


		/******************** MoleclrSqnc_Repository_DataId ********************************************************************************/
		if(molecularsequencerepositoryi == 0) {m.addMoleclrSqncRepositoryDataId("[");}
		if(molecularsequencerepository.hasDatasetId()) {

			m.addMoleclrSqncRepositoryDataId(String.valueOf(molecularsequencerepository.getDatasetId()));
		} else {
			m.addMoleclrSqncRepositoryDataId("NULL");
		}

		if(molecularsequencerepositoryi == molecularsequencerepositorylist.size()-1) {m.addMoleclrSqncRepositoryDataId("]");}


		/******************** MoleclrSqnc_Repository_ReadId ********************************************************************************/
		if(molecularsequencerepositoryi == 0) {m.addMoleclrSqncRepositoryReadId("[");}
		if(molecularsequencerepository.hasReadsetId()) {

			m.addMoleclrSqncRepositoryReadId(String.valueOf(molecularsequencerepository.getReadsetId()));
		} else {
			m.addMoleclrSqncRepositoryReadId("NULL");
		}

		if(molecularsequencerepositoryi == molecularsequencerepositorylist.size()-1) {m.addMoleclrSqncRepositoryReadId("]");}


		 };
		/******************** MoleclrSqnc_Pointer ********************************************************************************/
		if(molecularsequence.hasPointer()) {

			String  array = "[";
			for(int incr=0; incr<molecularsequence.getPointer().size(); incr++) {
				array = array + molecularsequence.getPointer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMoleclrSqncPointer(array);

		} else {
			m.addMoleclrSqncPointer("NULL");
		}


		/******************** MoleclrSqnc_ReadCvg ********************************************************************************/
		if(molecularsequence.hasReadCoverage()) {

			m.addMoleclrSqncReadCvg(String.valueOf(molecularsequence.getReadCoverage()));
		} else {
			m.addMoleclrSqncReadCvg("NULL");
		}


		/******************** MoleclrSqnc_CoordinateSys ********************************************************************************/
		if(molecularsequence.hasCoordinateSystem()) {

			m.addMoleclrSqncCoordinateSys(String.valueOf(molecularsequence.getCoordinateSystem()));
		} else {
			m.addMoleclrSqncCoordinateSys("NULL");
		}


		/******************** molecularsequencestructurevariant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent> molecularsequencestructurevariantlist = molecularsequence.getStructureVariant();
		for(int molecularsequencestructurevarianti = 0; molecularsequencestructurevarianti<molecularsequencestructurevariantlist.size();molecularsequencestructurevarianti++ ) {
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent  molecularsequencestructurevariant = molecularsequencestructurevariantlist.get(molecularsequencestructurevarianti);

		/******************** MoleclrSqnc_StrctrVariant_Length ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantLength("[");}
		if(molecularsequencestructurevariant.hasLength()) {

			m.addMoleclrSqncStrctrVariantLength(String.valueOf(molecularsequencestructurevariant.getLength()));
		} else {
			m.addMoleclrSqncStrctrVariantLength("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantLength("]");}


		/******************** molecularsequencestructurevariantouter ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent molecularsequencestructurevariantouter = molecularsequencestructurevariant.getOuter();

		/******************** MoleclrSqnc_StrctrVariant_Outer_Strt ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantOuterStrt("[");}
		if(molecularsequencestructurevariantouter.hasStart()) {

			m.addMoleclrSqncStrctrVariantOuterStrt(String.valueOf(molecularsequencestructurevariantouter.getStart()));
		} else {
			m.addMoleclrSqncStrctrVariantOuterStrt("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantOuterStrt("]");}


		/******************** MoleclrSqnc_StrctrVariant_Outer_End ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantOuterEnd("[");}
		if(molecularsequencestructurevariantouter.hasEnd()) {

			m.addMoleclrSqncStrctrVariantOuterEnd(String.valueOf(molecularsequencestructurevariantouter.getEnd()));
		} else {
			m.addMoleclrSqncStrctrVariantOuterEnd("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantOuterEnd("]");}


		/******************** molecularsequencestructurevariantinner ********************************************************************************/
		org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent molecularsequencestructurevariantinner = molecularsequencestructurevariant.getInner();

		/******************** MoleclrSqnc_StrctrVariant_Inner_Strt ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantInnerStrt("[");}
		if(molecularsequencestructurevariantinner.hasStart()) {

			m.addMoleclrSqncStrctrVariantInnerStrt(String.valueOf(molecularsequencestructurevariantinner.getStart()));
		} else {
			m.addMoleclrSqncStrctrVariantInnerStrt("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantInnerStrt("]");}


		/******************** MoleclrSqnc_StrctrVariant_Inner_End ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantInnerEnd("[");}
		if(molecularsequencestructurevariantinner.hasEnd()) {

			m.addMoleclrSqncStrctrVariantInnerEnd(String.valueOf(molecularsequencestructurevariantinner.getEnd()));
		} else {
			m.addMoleclrSqncStrctrVariantInnerEnd("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantInnerEnd("]");}


		/******************** MoleclrSqnc_StrctrVariant_Exact ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantExact("[");}
		if(molecularsequencestructurevariant.hasExact()) {

			m.addMoleclrSqncStrctrVariantExact(String.valueOf(molecularsequencestructurevariant.getExact()));
		} else {
			m.addMoleclrSqncStrctrVariantExact("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantExact("]");}


		/******************** molecularsequencestructurevariantvarianttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept molecularsequencestructurevariantvarianttype = molecularsequencestructurevariant.getVariantType();

		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Txt ********************************************************************************/
		if(molecularsequencestructurevarianti == 0) {m.addMoleclrSqncStrctrVariantVariantTypTxt("[");}
		if(molecularsequencestructurevariantvarianttype.hasText()) {

			m.addMoleclrSqncStrctrVariantVariantTypTxt(String.valueOf(molecularsequencestructurevariantvarianttype.getText()));
		} else {
			m.addMoleclrSqncStrctrVariantVariantTypTxt("NULL");
		}

		if(molecularsequencestructurevarianti == molecularsequencestructurevariantlist.size()-1) {m.addMoleclrSqncStrctrVariantVariantTypTxt("]");}


		/******************** molecularsequencestructurevariantvarianttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> molecularsequencestructurevariantvarianttypecodinglist = molecularsequencestructurevariantvarianttype.getCoding();
		for(int molecularsequencestructurevariantvarianttypecodingi = 0; molecularsequencestructurevariantvarianttypecodingi<molecularsequencestructurevariantvarianttypecodinglist.size();molecularsequencestructurevariantvarianttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  molecularsequencestructurevariantvarianttypecoding = molecularsequencestructurevariantvarianttypecodinglist.get(molecularsequencestructurevariantvarianttypecodingi);

		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Dsply ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecodingi == 0) {m.addMoleclrSqncStrctrVariantVariantTypCdgDsply("[[");}
		if(molecularsequencestructurevariantvarianttypecoding.hasDisplay()) {

			m.addMoleclrSqncStrctrVariantVariantTypCdgDsply(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getDisplay()));
		} else {
			m.addMoleclrSqncStrctrVariantVariantTypCdgDsply("NULL");
		}

		if(molecularsequencestructurevariantvarianttypecodingi == molecularsequencestructurevariantvarianttypecodinglist.size()-1) {m.addMoleclrSqncStrctrVariantVariantTypCdgDsply("]]");}


		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Vrsn ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecodingi == 0) {m.addMoleclrSqncStrctrVariantVariantTypCdgVrsn("[[");}
		if(molecularsequencestructurevariantvarianttypecoding.hasVersion()) {

			m.addMoleclrSqncStrctrVariantVariantTypCdgVrsn(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getVersion()));
		} else {
			m.addMoleclrSqncStrctrVariantVariantTypCdgVrsn("NULL");
		}

		if(molecularsequencestructurevariantvarianttypecodingi == molecularsequencestructurevariantvarianttypecodinglist.size()-1) {m.addMoleclrSqncStrctrVariantVariantTypCdgVrsn("]]");}


		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Cd ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecodingi == 0) {m.addMoleclrSqncStrctrVariantVariantTypCdgCd("[[");}
		if(molecularsequencestructurevariantvarianttypecoding.hasCode()) {

			m.addMoleclrSqncStrctrVariantVariantTypCdgCd(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getCode()));
		} else {
			m.addMoleclrSqncStrctrVariantVariantTypCdgCd("NULL");
		}

		if(molecularsequencestructurevariantvarianttypecodingi == molecularsequencestructurevariantvarianttypecodinglist.size()-1) {m.addMoleclrSqncStrctrVariantVariantTypCdgCd("]]");}


		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_UsrSltd ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecodingi == 0) {m.addMoleclrSqncStrctrVariantVariantTypCdgUsrSltd("[[");}
		if(molecularsequencestructurevariantvarianttypecoding.hasUserSelected()) {

			m.addMoleclrSqncStrctrVariantVariantTypCdgUsrSltd(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getUserSelected()));
		} else {
			m.addMoleclrSqncStrctrVariantVariantTypCdgUsrSltd("NULL");
		}

		if(molecularsequencestructurevariantvarianttypecodingi == molecularsequencestructurevariantvarianttypecodinglist.size()-1) {m.addMoleclrSqncStrctrVariantVariantTypCdgUsrSltd("]]");}


		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Sys ********************************************************************************/
		if(molecularsequencestructurevariantvarianttypecodingi == 0) {m.addMoleclrSqncStrctrVariantVariantTypCdgSys("[[");}
		if(molecularsequencestructurevariantvarianttypecoding.hasSystem()) {

			m.addMoleclrSqncStrctrVariantVariantTypCdgSys(String.valueOf(molecularsequencestructurevariantvarianttypecoding.getSystem()));
		} else {
			m.addMoleclrSqncStrctrVariantVariantTypCdgSys("NULL");
		}

		if(molecularsequencestructurevariantvarianttypecodingi == molecularsequencestructurevariantvarianttypecodinglist.size()-1) {m.addMoleclrSqncStrctrVariantVariantTypCdgSys("]]");}


		 };
		 };
		/******************** MoleclrSqnc_Prfrmr ********************************************************************************/
		if(molecularsequence.hasPerformer()) {

			if(molecularsequence.getPerformer().getReference() != null) {
			m.addMoleclrSqncPrfrmr(molecularsequence.getPerformer().getReference());
			}
		} else {
			m.addMoleclrSqncPrfrmr("NULL");
		}


		/******************** MoleclrSqnc_Pnt ********************************************************************************/
		if(molecularsequence.hasPatient()) {

			if(molecularsequence.getPatient().getReference() != null) {
			m.addMoleclrSqncPnt(molecularsequence.getPatient().getReference());
			}
		} else {
			m.addMoleclrSqncPnt("NULL");
		}


		/******************** MoleclrSqnc_Dvc ********************************************************************************/
		if(molecularsequence.hasDevice()) {

			if(molecularsequence.getDevice().getReference() != null) {
			m.addMoleclrSqncDvc(molecularsequence.getDevice().getReference());
			}
		} else {
			m.addMoleclrSqncDvc("NULL");
		}


		/******************** molecularsequencequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity molecularsequencequantity = molecularsequence.getQuantity();

		/******************** MoleclrSqnc_Qnty_Vl ********************************************************************************/
		if(molecularsequencequantity.hasValue()) {

			m.addMoleclrSqncQntyVl(String.valueOf(molecularsequencequantity.getValue()));
		} else {
			m.addMoleclrSqncQntyVl("NULL");
		}


		/******************** molecularsequencequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator molecularsequencequantitycomparator = molecularsequencequantity.getComparator();
		if(molecularsequencequantitycomparator!=null) {
			m.addMoleclrSqncQntyCmprtr(molecularsequencequantitycomparator.toCode());
		} else {
			m.addMoleclrSqncQntyCmprtr("NULL");
		}

		/******************** MoleclrSqnc_Qnty_Cd ********************************************************************************/
		if(molecularsequencequantity.hasCode()) {

			m.addMoleclrSqncQntyCd(String.valueOf(molecularsequencequantity.getCode()));
		} else {
			m.addMoleclrSqncQntyCd("NULL");
		}


		/******************** MoleclrSqnc_Qnty_Unt ********************************************************************************/
		if(molecularsequencequantity.hasUnit()) {

			m.addMoleclrSqncQntyUnt(String.valueOf(molecularsequencequantity.getUnit()));
		} else {
			m.addMoleclrSqncQntyUnt("NULL");
		}


		/******************** MoleclrSqnc_Qnty_Sys ********************************************************************************/
		if(molecularsequencequantity.hasSystem()) {

			m.addMoleclrSqncQntySys(String.valueOf(molecularsequencequantity.getSystem()));
		} else {
			m.addMoleclrSqncQntySys("NULL");
		}


		/******************** MoleclrSqnc_Spcmn ********************************************************************************/
		if(molecularsequence.hasSpecimen()) {

			if(molecularsequence.getSpecimen().getReference() != null) {
			m.addMoleclrSqncSpcmn(molecularsequence.getSpecimen().getReference());
			}
		} else {
			m.addMoleclrSqncSpcmn("NULL");
		}


		return m;
	}
}
