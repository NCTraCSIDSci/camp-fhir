package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Evidence;
public class EvidenceBidirectionalConversion 
{
	public Evidence Evidences(org.hl7.fhir.r4.model.Evidence evidence) throws ParseException
	{
		 main.java.com.campfhir.model.Evidence e = new  main.java.com.campfhir.model.Evidence();

		/******************** id ********************************************************************************/
		evidence.setId(e.getId());

		/******************** Evdnce_Nm ********************************************************************************/
		if(evidence.hasName()) {
			e.setEvdnceNm(String.valueOf(evidence.getName()));
		}
		/******************** Evdnce_Dt ********************************************************************************/
		if(evidence.hasDate()) {
			e.setEvdnceDt(String.valueOf(evidence.getDate()));
		}
		/******************** Evdnce_Vrsn ********************************************************************************/
		if(evidence.hasVersion()) {
			e.setEvdnceVrsn(String.valueOf(evidence.getVersion()));
		}
		/******************** evidencereviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencereviewer = evidence.getReviewerFirstRep();

		/******************** Evdnce_Rviewr_Nm ********************************************************************************/
		if(evidencereviewer.hasName()) {
			e.setEvdnceRviewrNm(String.valueOf(evidencereviewer.getName()));
		}
		/******************** evidencereviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencereviewertelecom = evidencereviewer.getTelecomFirstRep();

		/******************** Evdnce_Rviewr_Tlcm_Vl ********************************************************************************/
		if(evidencereviewertelecom.hasValue()) {
			e.setEvdnceRviewrTlcmVl(String.valueOf(evidencereviewertelecom.getValue()));
		}
		/******************** evidencereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencereviewertelecomperiod = evidencereviewertelecom.getPeriod();

		/******************** Evdnce_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencereviewertelecomperiod.hasStart()) {
			e.setEvdnceRviewrTlcmPrdStrt(String.valueOf(evidencereviewertelecomperiod.getStart()));
		}
		/******************** Evdnce_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(evidencereviewertelecomperiod.hasEnd()) {
			e.setEvdnceRviewrTlcmPrdEnd(String.valueOf(evidencereviewertelecomperiod.getEnd()));
		}
		/******************** evidencereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencereviewertelecomsystem = evidencereviewertelecom.getSystem();
		e.setEvdnceRviewrTlcmSys(evidencereviewertelecomsystem.toCode());

		/******************** evidencereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencereviewertelecomuse = evidencereviewertelecom.getUse();
		e.setEvdnceRviewrTlcmUse(evidencereviewertelecomuse.toCode());

		/******************** Evdnce_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(evidencereviewertelecom.hasRank()) {
			e.setEvdnceRviewrTlcmRnk(String.valueOf(evidencereviewertelecom.getRank()));
		}
		/******************** evidenceendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidenceendorser = evidence.getEndorserFirstRep();

		/******************** Evdnce_Endsr_Nm ********************************************************************************/
		if(evidenceendorser.hasName()) {
			e.setEvdnceEndsrNm(String.valueOf(evidenceendorser.getName()));
		}
		/******************** evidenceendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidenceendorsertelecom = evidenceendorser.getTelecomFirstRep();

		/******************** Evdnce_Endsr_Tlcm_Vl ********************************************************************************/
		if(evidenceendorsertelecom.hasValue()) {
			e.setEvdnceEndsrTlcmVl(String.valueOf(evidenceendorsertelecom.getValue()));
		}
		/******************** evidenceendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceendorsertelecomperiod = evidenceendorsertelecom.getPeriod();

		/******************** Evdnce_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidenceendorsertelecomperiod.hasStart()) {
			e.setEvdnceEndsrTlcmPrdStrt(String.valueOf(evidenceendorsertelecomperiod.getStart()));
		}
		/******************** Evdnce_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(evidenceendorsertelecomperiod.hasEnd()) {
			e.setEvdnceEndsrTlcmPrdEnd(String.valueOf(evidenceendorsertelecomperiod.getEnd()));
		}
		/******************** evidenceendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidenceendorsertelecomsystem = evidenceendorsertelecom.getSystem();
		e.setEvdnceEndsrTlcmSys(evidenceendorsertelecomsystem.toCode());

		/******************** evidenceendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidenceendorsertelecomuse = evidenceendorsertelecom.getUse();
		e.setEvdnceEndsrTlcmUse(evidenceendorsertelecomuse.toCode());

		/******************** Evdnce_Endsr_Tlcm_Rnk ********************************************************************************/
		if(evidenceendorsertelecom.hasRank()) {
			e.setEvdnceEndsrTlcmRnk(String.valueOf(evidenceendorsertelecom.getRank()));
		}
		/******************** Evdnce_ShortTtl ********************************************************************************/
		if(evidence.hasShortTitle()) {
			e.setEvdnceShortTtl(String.valueOf(evidence.getShortTitle()));
		}
		/******************** Evdnce_Outcome ********************************************************************************/
		if(evidence.hasOutcome()) {
			e.setEvdnceOutcome(String.valueOf(evidence.getOutcomeFirstRep()));
		}
		/******************** Evdnce_Ttl ********************************************************************************/
		if(evidence.hasTitle()) {
			e.setEvdnceTtl(String.valueOf(evidence.getTitle()));
		}
		/******************** Evdnce_Subtitle ********************************************************************************/
		if(evidence.hasSubtitle()) {
			e.setEvdnceSubtitle(String.valueOf(evidence.getSubtitle()));
		}
		/******************** evidencestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus evidencestatus = evidence.getStatus();
		e.setEvdnceSts(evidencestatus.toCode());

		/******************** evidencenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation evidencenote = evidence.getNoteFirstRep();

		/******************** Evdnce_Nt_Time ********************************************************************************/
		if(evidencenote.hasTime()) {
			e.setEvdnceNtTime(String.valueOf(evidencenote.getTime()));
		}
		/******************** Evdnce_Nt_Txt ********************************************************************************/
		if(evidencenote.hasText()) {
			e.setEvdnceNtTxt(String.valueOf(evidencenote.getText()));
		}
		/******************** Evdnce_Nt_AthrRfrnc ********************************************************************************/
		if(evidencenote.hasAuthorReference()) {
			e.setEvdnceNtAthrRfrnc(String.valueOf(evidencenote.getAuthorReference()));
		}
		/******************** Evdnce_Nt_AthrStrgTyp ********************************************************************************/
		if(evidencenote.hasAuthorStringType()) {
			e.setEvdnceNtAthrStrgTyp(String.valueOf(evidencenote.getAuthorStringType()));
		}
		/******************** Evdnce_Dscrptn ********************************************************************************/
		if(evidence.hasDescription()) {
			e.setEvdnceDscrptn(String.valueOf(evidence.getDescription()));
		}
		/******************** Evdnce_Url ********************************************************************************/
		if(evidence.hasUrl()) {
			e.setEvdnceUrl(String.valueOf(evidence.getUrl()));
		}
		/******************** Evdnce_Pblshr ********************************************************************************/
		if(evidence.hasPublisher()) {
			e.setEvdncePblshr(String.valueOf(evidence.getPublisher()));
		}
		/******************** evidenceeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceeffectiveperiod = evidence.getEffectivePeriod();

		/******************** Evdnce_EfctivePrd_Strt ********************************************************************************/
		if(evidenceeffectiveperiod.hasStart()) {
			e.setEvdnceEfctivePrdStrt(String.valueOf(evidenceeffectiveperiod.getStart()));
		}
		/******************** Evdnce_EfctivePrd_End ********************************************************************************/
		if(evidenceeffectiveperiod.hasEnd()) {
			e.setEvdnceEfctivePrdEnd(String.valueOf(evidenceeffectiveperiod.getEnd()));
		}
		/******************** evidenceauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidenceauthor = evidence.getAuthorFirstRep();

		/******************** Evdnce_Athr_Nm ********************************************************************************/
		if(evidenceauthor.hasName()) {
			e.setEvdnceAthrNm(String.valueOf(evidenceauthor.getName()));
		}
		/******************** evidenceauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidenceauthortelecom = evidenceauthor.getTelecomFirstRep();

		/******************** Evdnce_Athr_Tlcm_Vl ********************************************************************************/
		if(evidenceauthortelecom.hasValue()) {
			e.setEvdnceAthrTlcmVl(String.valueOf(evidenceauthortelecom.getValue()));
		}
		/******************** evidenceauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceauthortelecomperiod = evidenceauthortelecom.getPeriod();

		/******************** Evdnce_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidenceauthortelecomperiod.hasStart()) {
			e.setEvdnceAthrTlcmPrdStrt(String.valueOf(evidenceauthortelecomperiod.getStart()));
		}
		/******************** Evdnce_Athr_Tlcm_Prd_End ********************************************************************************/
		if(evidenceauthortelecomperiod.hasEnd()) {
			e.setEvdnceAthrTlcmPrdEnd(String.valueOf(evidenceauthortelecomperiod.getEnd()));
		}
		/******************** evidenceauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidenceauthortelecomsystem = evidenceauthortelecom.getSystem();
		e.setEvdnceAthrTlcmSys(evidenceauthortelecomsystem.toCode());

		/******************** evidenceauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidenceauthortelecomuse = evidenceauthortelecom.getUse();
		e.setEvdnceAthrTlcmUse(evidenceauthortelecomuse.toCode());

		/******************** Evdnce_Athr_Tlcm_Rnk ********************************************************************************/
		if(evidenceauthortelecom.hasRank()) {
			e.setEvdnceAthrTlcmRnk(String.valueOf(evidenceauthortelecom.getRank()));
		}
		/******************** Evdnce_ExposureVariant ********************************************************************************/
		if(evidence.hasExposureVariant()) {
			e.setEvdnceExposureVariant(String.valueOf(evidence.getExposureVariantFirstRep()));
		}
		/******************** Evdnce_ExposureBackground ********************************************************************************/
		if(evidence.hasExposureBackground()) {
			e.setEvdnceExposureBackground(String.valueOf(evidence.getExposureBackground()));
		}
		/******************** evidencecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencecontact = evidence.getContactFirstRep();

		/******************** Evdnce_Cntct_Nm ********************************************************************************/
		if(evidencecontact.hasName()) {
			e.setEvdnceCntctNm(String.valueOf(evidencecontact.getName()));
		}
		/******************** evidencecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencecontacttelecom = evidencecontact.getTelecomFirstRep();

		/******************** Evdnce_Cntct_Tlcm_Vl ********************************************************************************/
		if(evidencecontacttelecom.hasValue()) {
			e.setEvdnceCntctTlcmVl(String.valueOf(evidencecontacttelecom.getValue()));
		}
		/******************** evidencecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencecontacttelecomperiod = evidencecontacttelecom.getPeriod();

		/******************** Evdnce_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencecontacttelecomperiod.hasStart()) {
			e.setEvdnceCntctTlcmPrdStrt(String.valueOf(evidencecontacttelecomperiod.getStart()));
		}
		/******************** Evdnce_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(evidencecontacttelecomperiod.hasEnd()) {
			e.setEvdnceCntctTlcmPrdEnd(String.valueOf(evidencecontacttelecomperiod.getEnd()));
		}
		/******************** evidencecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencecontacttelecomsystem = evidencecontacttelecom.getSystem();
		e.setEvdnceCntctTlcmSys(evidencecontacttelecomsystem.toCode());

		/******************** evidencecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencecontacttelecomuse = evidencecontacttelecom.getUse();
		e.setEvdnceCntctTlcmUse(evidencecontacttelecomuse.toCode());

		/******************** Evdnce_Cntct_Tlcm_Rnk ********************************************************************************/
		if(evidencecontacttelecom.hasRank()) {
			e.setEvdnceCntctTlcmRnk(String.valueOf(evidencecontacttelecom.getRank()));
		}
		/******************** evidenceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier evidenceidentifier = evidence.getIdentifierFirstRep();

		/******************** Evdnce_Id_Vl ********************************************************************************/
		if(evidenceidentifier.hasValue()) {
			e.setEvdnceIdVl(String.valueOf(evidenceidentifier.getValue()));
		}
		/******************** evidenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidenceidentifiertype = evidenceidentifier.getType();

		/******************** Evdnce_Id_Typ_Txt ********************************************************************************/
		if(evidenceidentifiertype.hasText()) {
			e.setEvdnceIdTypTxt(String.valueOf(evidenceidentifiertype.getText()));
		}
		/******************** evidenceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceidentifiertypecoding = evidenceidentifiertype.getCodingFirstRep();

		/******************** Evdnce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(evidenceidentifiertypecoding.hasVersion()) {
			e.setEvdnceIdTypCdgVrsn(String.valueOf(evidenceidentifiertypecoding.getVersion()));
		}
		/******************** Evdnce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(evidenceidentifiertypecoding.hasDisplay()) {
			e.setEvdnceIdTypCdgDsply(String.valueOf(evidenceidentifiertypecoding.getDisplay()));
		}
		/******************** Evdnce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(evidenceidentifiertypecoding.hasCode()) {
			e.setEvdnceIdTypCdgCd(String.valueOf(evidenceidentifiertypecoding.getCode()));
		}
		/******************** Evdnce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(evidenceidentifiertypecoding.hasUserSelected()) {
			e.setEvdnceIdTypCdgUsrSltd(String.valueOf(evidenceidentifiertypecoding.getUserSelected()));
		}
		/******************** Evdnce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(evidenceidentifiertypecoding.hasSystem()) {
			e.setEvdnceIdTypCdgSys(String.valueOf(evidenceidentifiertypecoding.getSystem()));
		}
		/******************** evidenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceidentifierperiod = evidenceidentifier.getPeriod();

		/******************** Evdnce_Id_Prd_Strt ********************************************************************************/
		if(evidenceidentifierperiod.hasStart()) {
			e.setEvdnceIdPrdStrt(String.valueOf(evidenceidentifierperiod.getStart()));
		}
		/******************** Evdnce_Id_Prd_End ********************************************************************************/
		if(evidenceidentifierperiod.hasEnd()) {
			e.setEvdnceIdPrdEnd(String.valueOf(evidenceidentifierperiod.getEnd()));
		}
		/******************** Evdnce_Id_Assigner ********************************************************************************/
		if(evidenceidentifier.hasAssigner()) {
			e.setEvdnceIdAssigner(String.valueOf(evidenceidentifier.getAssigner()));
		}
		/******************** Evdnce_Id_Sys ********************************************************************************/
		if(evidenceidentifier.hasSystem()) {
			e.setEvdnceIdSys(String.valueOf(evidenceidentifier.getSystem()));
		}
		/******************** evidenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse evidenceidentifieruse = evidenceidentifier.getUse();
		e.setEvdnceIdUse(evidenceidentifieruse.toCode());

		/******************** Evdnce_Copyright ********************************************************************************/
		if(evidence.hasCopyright()) {
			e.setEvdnceCopyright(String.valueOf(evidence.getCopyright()));
		}
		/******************** evidencetopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencetopic = evidence.getTopicFirstRep();

		/******************** Evdnce_Topic_Txt ********************************************************************************/
		if(evidencetopic.hasText()) {
			e.setEvdnceTopicTxt(String.valueOf(evidencetopic.getText()));
		}
		/******************** evidencetopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencetopiccoding = evidencetopic.getCodingFirstRep();

		/******************** Evdnce_Topic_Cdg_Vrsn ********************************************************************************/
		if(evidencetopiccoding.hasVersion()) {
			e.setEvdnceTopicCdgVrsn(String.valueOf(evidencetopiccoding.getVersion()));
		}
		/******************** Evdnce_Topic_Cdg_Dsply ********************************************************************************/
		if(evidencetopiccoding.hasDisplay()) {
			e.setEvdnceTopicCdgDsply(String.valueOf(evidencetopiccoding.getDisplay()));
		}
		/******************** Evdnce_Topic_Cdg_Cd ********************************************************************************/
		if(evidencetopiccoding.hasCode()) {
			e.setEvdnceTopicCdgCd(String.valueOf(evidencetopiccoding.getCode()));
		}
		/******************** Evdnce_Topic_Cdg_UsrSltd ********************************************************************************/
		if(evidencetopiccoding.hasUserSelected()) {
			e.setEvdnceTopicCdgUsrSltd(String.valueOf(evidencetopiccoding.getUserSelected()));
		}
		/******************** Evdnce_Topic_Cdg_Sys ********************************************************************************/
		if(evidencetopiccoding.hasSystem()) {
			e.setEvdnceTopicCdgSys(String.valueOf(evidencetopiccoding.getSystem()));
		}
		/******************** Evdnce_LastReviewDt ********************************************************************************/
		if(evidence.hasLastReviewDate()) {
			e.setEvdnceLastReviewDt(String.valueOf(evidence.getLastReviewDate()));
		}
		/******************** Evdnce_ApprovalDt ********************************************************************************/
		if(evidence.hasApprovalDate()) {
			e.setEvdnceApprovalDt(String.valueOf(evidence.getApprovalDate()));
		}
		/******************** evidenceeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidenceeditor = evidence.getEditorFirstRep();

		/******************** Evdnce_Editor_Nm ********************************************************************************/
		if(evidenceeditor.hasName()) {
			e.setEvdnceEditorNm(String.valueOf(evidenceeditor.getName()));
		}
		/******************** evidenceeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidenceeditortelecom = evidenceeditor.getTelecomFirstRep();

		/******************** Evdnce_Editor_Tlcm_Vl ********************************************************************************/
		if(evidenceeditortelecom.hasValue()) {
			e.setEvdnceEditorTlcmVl(String.valueOf(evidenceeditortelecom.getValue()));
		}
		/******************** evidenceeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceeditortelecomperiod = evidenceeditortelecom.getPeriod();

		/******************** Evdnce_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(evidenceeditortelecomperiod.hasStart()) {
			e.setEvdnceEditorTlcmPrdStrt(String.valueOf(evidenceeditortelecomperiod.getStart()));
		}
		/******************** Evdnce_Editor_Tlcm_Prd_End ********************************************************************************/
		if(evidenceeditortelecomperiod.hasEnd()) {
			e.setEvdnceEditorTlcmPrdEnd(String.valueOf(evidenceeditortelecomperiod.getEnd()));
		}
		/******************** evidenceeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidenceeditortelecomsystem = evidenceeditortelecom.getSystem();
		e.setEvdnceEditorTlcmSys(evidenceeditortelecomsystem.toCode());

		/******************** evidenceeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidenceeditortelecomuse = evidenceeditortelecom.getUse();
		e.setEvdnceEditorTlcmUse(evidenceeditortelecomuse.toCode());

		/******************** Evdnce_Editor_Tlcm_Rnk ********************************************************************************/
		if(evidenceeditortelecom.hasRank()) {
			e.setEvdnceEditorTlcmRnk(String.valueOf(evidenceeditortelecom.getRank()));
		}
		/******************** evidencerelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact evidencerelatedartifact = evidence.getRelatedArtifactFirstRep();

		/******************** Evdnce_RltedArtfct_Rsrc ********************************************************************************/
		if(evidencerelatedartifact.hasResource()) {
			e.setEvdnceRltedArtfctRsrc(String.valueOf(evidencerelatedartifact.getResource()));
		}
		/******************** evidencerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType evidencerelatedartifacttype = evidencerelatedartifact.getType();
		e.setEvdnceRltedArtfctTyp(evidencerelatedartifacttype.toCode());

		/******************** evidencerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment evidencerelatedartifactdocument = evidencerelatedartifact.getDocument();

		/******************** Evdnce_RltedArtfct_Doc_Sz ********************************************************************************/
		if(evidencerelatedartifactdocument.hasSize()) {
			e.setEvdnceRltedArtfctDocSz(String.valueOf(evidencerelatedartifactdocument.getSize()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(evidencerelatedartifactdocument.hasLanguage()) {
			e.setEvdnceRltedArtfctDocLnguage(String.valueOf(evidencerelatedartifactdocument.getLanguage()));
		}
		/******************** Evdnce_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(evidencerelatedartifactdocument.hasContentType()) {
			e.setEvdnceRltedArtfctDocCntntTyp(String.valueOf(evidencerelatedartifactdocument.getContentType()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(evidencerelatedartifactdocument.hasTitle()) {
			e.setEvdnceRltedArtfctDocTtl(String.valueOf(evidencerelatedartifactdocument.getTitle()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Url ********************************************************************************/
		if(evidencerelatedartifactdocument.hasUrl()) {
			e.setEvdnceRltedArtfctDocUrl(String.valueOf(evidencerelatedartifactdocument.getUrl()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Data ********************************************************************************/
		if(evidencerelatedartifactdocument.hasData()) {
			e.setEvdnceRltedArtfctDocData(String.valueOf(evidencerelatedartifactdocument.getData()));
		}

		/******************** Evdnce_RltedArtfct_Doc_Hash ********************************************************************************/
		if(evidencerelatedartifactdocument.hasHash()) {
			e.setEvdnceRltedArtfctDocHash(String.valueOf(evidencerelatedartifactdocument.getHash()));
		}

		/******************** Evdnce_RltedArtfct_Doc_Creation ********************************************************************************/
		if(evidencerelatedartifactdocument.hasCreation()) {
			e.setEvdnceRltedArtfctDocCreation(String.valueOf(evidencerelatedartifactdocument.getCreation()));
		}
		/******************** Evdnce_RltedArtfct_Url ********************************************************************************/
		if(evidencerelatedartifact.hasUrl()) {
			e.setEvdnceRltedArtfctUrl(String.valueOf(evidencerelatedartifact.getUrl()));
		}
		/******************** Evdnce_RltedArtfct_Lbl ********************************************************************************/
		if(evidencerelatedartifact.hasLabel()) {
			e.setEvdnceRltedArtfctLbl(String.valueOf(evidencerelatedartifact.getLabel()));
		}
		/******************** Evdnce_RltedArtfct_Citation ********************************************************************************/
		if(evidencerelatedartifact.hasCitation()) {
			e.setEvdnceRltedArtfctCitation(String.valueOf(evidencerelatedartifact.getCitation()));
		}
		/******************** evidenceusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext evidenceusecontext = evidence.getUseContextFirstRep();

		/******************** evidenceusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceusecontextcode = evidenceusecontext.getCode();

		/******************** Evdnce_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(evidenceusecontextcode.hasVersion()) {
			e.setEvdnceUseCntxtCdVrsn(String.valueOf(evidenceusecontextcode.getVersion()));
		}
		/******************** Evdnce_UseCntxt_Cd_Dsply ********************************************************************************/
		if(evidenceusecontextcode.hasDisplay()) {
			e.setEvdnceUseCntxtCdDsply(String.valueOf(evidenceusecontextcode.getDisplay()));
		}
		/******************** Evdnce_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(evidenceusecontextcode.hasUserSelected()) {
			e.setEvdnceUseCntxtCdUsrSltd(String.valueOf(evidenceusecontextcode.getUserSelected()));
		}
		/******************** Evdnce_UseCntxt_Cd_Sys ********************************************************************************/
		if(evidenceusecontextcode.hasSystem()) {
			e.setEvdnceUseCntxtCdSys(String.valueOf(evidenceusecontextcode.getSystem()));
		}
		/******************** evidenceusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidenceusecontextvaluecodeableconcept = evidenceusecontext.getValueCodeableConcept();

		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(evidenceusecontextvaluecodeableconcept.hasText()) {
			e.setEvdnceUseCntxtVlCdbleCncptTxt(String.valueOf(evidenceusecontextvaluecodeableconcept.getText()));
		}
		/******************** evidenceusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceusecontextvaluecodeableconceptcoding = evidenceusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcoding.hasVersion()) {
			e.setEvdnceUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcoding.hasDisplay()) {
			e.setEvdnceUseCntxtVlCdbleCncptCdgDsply(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcoding.hasCode()) {
			e.setEvdnceUseCntxtVlCdbleCncptCdgCd(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			e.setEvdnceUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcoding.hasSystem()) {
			e.setEvdnceUseCntxtVlCdbleCncptCdgSys(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** evidenceusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluequantity = evidenceusecontext.getValueQuantity();

		/******************** Evdnce_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(evidenceusecontextvaluequantity.hasValue()) {
			e.setEvdnceUseCntxtVlQntyVl(String.valueOf(evidenceusecontextvaluequantity.getValue()));
		}
		/******************** evidenceusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidenceusecontextvaluequantitycomparator = evidenceusecontextvaluequantity.getComparator();
		e.setEvdnceUseCntxtVlQntyCmprtr(evidenceusecontextvaluequantitycomparator.toCode());

		/******************** Evdnce_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(evidenceusecontextvaluequantity.hasCode()) {
			e.setEvdnceUseCntxtVlQntyCd(String.valueOf(evidenceusecontextvaluequantity.getCode()));
		}
		/******************** Evdnce_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(evidenceusecontextvaluequantity.hasUnit()) {
			e.setEvdnceUseCntxtVlQntyUnt(String.valueOf(evidenceusecontextvaluequantity.getUnit()));
		}
		/******************** Evdnce_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(evidenceusecontextvaluequantity.hasSystem()) {
			e.setEvdnceUseCntxtVlQntySys(String.valueOf(evidenceusecontextvaluequantity.getSystem()));
		}
		/******************** evidenceusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidenceusecontextvaluerange = evidenceusecontext.getValueRange();

		/******************** evidenceusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluerangelow = evidenceusecontextvaluerange.getLow();

		/******************** Evdnce_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(evidenceusecontextvaluerangelow.hasValue()) {
			e.setEvdnceUseCntxtVlRngLwVl(String.valueOf(evidenceusecontextvaluerangelow.getValue()));
		}
		/******************** evidenceusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidenceusecontextvaluerangelowcomparator = evidenceusecontextvaluerangelow.getComparator();
		e.setEvdnceUseCntxtVlRngLwCmprtr(evidenceusecontextvaluerangelowcomparator.toCode());

		/******************** Evdnce_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(evidenceusecontextvaluerangelow.hasCode()) {
			e.setEvdnceUseCntxtVlRngLwCd(String.valueOf(evidenceusecontextvaluerangelow.getCode()));
		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(evidenceusecontextvaluerangelow.hasUnit()) {
			e.setEvdnceUseCntxtVlRngLwUnt(String.valueOf(evidenceusecontextvaluerangelow.getUnit()));
		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(evidenceusecontextvaluerangelow.hasSystem()) {
			e.setEvdnceUseCntxtVlRngLwSys(String.valueOf(evidenceusecontextvaluerangelow.getSystem()));
		}
		/******************** evidenceusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluerangehigh = evidenceusecontextvaluerange.getHigh();

		/******************** Evdnce_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(evidenceusecontextvaluerangehigh.hasValue()) {
			e.setEvdnceUseCntxtVlRngHiVl(String.valueOf(evidenceusecontextvaluerangehigh.getValue()));
		}
		/******************** evidenceusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidenceusecontextvaluerangehighcomparator = evidenceusecontextvaluerangehigh.getComparator();
		e.setEvdnceUseCntxtVlRngHiCmprtr(evidenceusecontextvaluerangehighcomparator.toCode());

		/******************** Evdnce_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(evidenceusecontextvaluerangehigh.hasCode()) {
			e.setEvdnceUseCntxtVlRngHiCd(String.valueOf(evidenceusecontextvaluerangehigh.getCode()));
		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(evidenceusecontextvaluerangehigh.hasUnit()) {
			e.setEvdnceUseCntxtVlRngHiUnt(String.valueOf(evidenceusecontextvaluerangehigh.getUnit()));
		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(evidenceusecontextvaluerangehigh.hasSystem()) {
			e.setEvdnceUseCntxtVlRngHiSys(String.valueOf(evidenceusecontextvaluerangehigh.getSystem()));
		}
		/******************** Evdnce_UseCntxt_VlRfrnc ********************************************************************************/
		if(evidenceusecontext.hasValueReference()) {
			e.setEvdnceUseCntxtVlRfrnc(String.valueOf(evidenceusecontext.getValueReference()));
		}
		/******************** evidencejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencejurisdiction = evidence.getJurisdictionFirstRep();

		/******************** Evdnce_Jrsdctn_Txt ********************************************************************************/
		if(evidencejurisdiction.hasText()) {
			e.setEvdnceJrsdctnTxt(String.valueOf(evidencejurisdiction.getText()));
		}
		/******************** evidencejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencejurisdictioncoding = evidencejurisdiction.getCodingFirstRep();

		/******************** Evdnce_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(evidencejurisdictioncoding.hasVersion()) {
			e.setEvdnceJrsdctnCdgVrsn(String.valueOf(evidencejurisdictioncoding.getVersion()));
		}
		/******************** Evdnce_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(evidencejurisdictioncoding.hasDisplay()) {
			e.setEvdnceJrsdctnCdgDsply(String.valueOf(evidencejurisdictioncoding.getDisplay()));
		}
		/******************** Evdnce_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(evidencejurisdictioncoding.hasCode()) {
			e.setEvdnceJrsdctnCdgCd(String.valueOf(evidencejurisdictioncoding.getCode()));
		}
		/******************** Evdnce_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(evidencejurisdictioncoding.hasUserSelected()) {
			e.setEvdnceJrsdctnCdgUsrSltd(String.valueOf(evidencejurisdictioncoding.getUserSelected()));
		}
		/******************** Evdnce_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(evidencejurisdictioncoding.hasSystem()) {
			e.setEvdnceJrsdctnCdgSys(String.valueOf(evidencejurisdictioncoding.getSystem()));
		}
		return e;
	}
}
