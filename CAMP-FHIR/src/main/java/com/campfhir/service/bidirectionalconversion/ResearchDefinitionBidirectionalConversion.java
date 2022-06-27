package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchDefinition;
public class ResearchDefinitionBidirectionalConversion 
{
	public ResearchDefinition ResearchDefinitions(org.hl7.fhir.r4.model.ResearchDefinition researchdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchDefinition r = new  main.java.com.campfhir.model.ResearchDefinition();

		/******************** id ********************************************************************************/
		researchdefinition.setId(r.getId());

		/******************** RsrchDfn_Nm ********************************************************************************/
		if(researchdefinition.hasName()) {
			r.setRsrchDfnNm(String.valueOf(researchdefinition.getName()));
		}
		/******************** RsrchDfn_Dt ********************************************************************************/
		if(researchdefinition.hasDate()) {
			r.setRsrchDfnDt(String.valueOf(researchdefinition.getDate()));
		}
		/******************** RsrchDfn_Vrsn ********************************************************************************/
		if(researchdefinition.hasVersion()) {
			r.setRsrchDfnVrsn(String.valueOf(researchdefinition.getVersion()));
		}
		/******************** researchdefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitionreviewer = researchdefinition.getReviewerFirstRep();

		/******************** RsrchDfn_Rviewr_Nm ********************************************************************************/
		if(researchdefinitionreviewer.hasName()) {
			r.setRsrchDfnRviewrNm(String.valueOf(researchdefinitionreviewer.getName()));
		}
		/******************** researchdefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitionreviewertelecom = researchdefinitionreviewer.getTelecomFirstRep();

		/******************** RsrchDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(researchdefinitionreviewertelecom.hasValue()) {
			r.setRsrchDfnRviewrTlcmVl(String.valueOf(researchdefinitionreviewertelecom.getValue()));
		}
		/******************** researchdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionreviewertelecomperiod = researchdefinitionreviewertelecom.getPeriod();

		/******************** RsrchDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitionreviewertelecomperiod.hasStart()) {
			r.setRsrchDfnRviewrTlcmPrdStrt(String.valueOf(researchdefinitionreviewertelecomperiod.getStart()));
		}
		/******************** RsrchDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitionreviewertelecomperiod.hasEnd()) {
			r.setRsrchDfnRviewrTlcmPrdEnd(String.valueOf(researchdefinitionreviewertelecomperiod.getEnd()));
		}
		/******************** researchdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitionreviewertelecomsystem = researchdefinitionreviewertelecom.getSystem();
		r.setRsrchDfnRviewrTlcmSys(researchdefinitionreviewertelecomsystem.toCode());

		/******************** researchdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitionreviewertelecomuse = researchdefinitionreviewertelecom.getUse();
		r.setRsrchDfnRviewrTlcmUse(researchdefinitionreviewertelecomuse.toCode());

		/******************** RsrchDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitionreviewertelecom.hasRank()) {
			r.setRsrchDfnRviewrTlcmRnk(String.valueOf(researchdefinitionreviewertelecom.getRank()));
		}
		/******************** researchdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionsubjectcodeableconcept = researchdefinition.getSubjectCodeableConcept();

		/******************** RsrchDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(researchdefinitionsubjectcodeableconcept.hasText()) {
			r.setRsrchDfnSbjctCdbleCncptTxt(String.valueOf(researchdefinitionsubjectcodeableconcept.getText()));
		}
		/******************** researchdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionsubjectcodeableconceptcoding = researchdefinitionsubjectcodeableconcept.getCodingFirstRep();

		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcoding.hasVersion()) {
			r.setRsrchDfnSbjctCdbleCncptCdgVrsn(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcoding.hasDisplay()) {
			r.setRsrchDfnSbjctCdbleCncptCdgDsply(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcoding.hasCode()) {
			r.setRsrchDfnSbjctCdbleCncptCdgCd(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getCode()));
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcoding.hasUserSelected()) {
			r.setRsrchDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcoding.hasSystem()) {
			r.setRsrchDfnSbjctCdbleCncptCdgSys(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** RsrchDfn_SbjctRfrnc ********************************************************************************/
		if(researchdefinition.hasSubjectReference()) {
			r.setRsrchDfnSbjctRfrnc(String.valueOf(researchdefinition.getSubjectReference()));
		}
		/******************** researchdefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitionendorser = researchdefinition.getEndorserFirstRep();

		/******************** RsrchDfn_Endsr_Nm ********************************************************************************/
		if(researchdefinitionendorser.hasName()) {
			r.setRsrchDfnEndsrNm(String.valueOf(researchdefinitionendorser.getName()));
		}
		/******************** researchdefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitionendorsertelecom = researchdefinitionendorser.getTelecomFirstRep();

		/******************** RsrchDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(researchdefinitionendorsertelecom.hasValue()) {
			r.setRsrchDfnEndsrTlcmVl(String.valueOf(researchdefinitionendorsertelecom.getValue()));
		}
		/******************** researchdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionendorsertelecomperiod = researchdefinitionendorsertelecom.getPeriod();

		/******************** RsrchDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitionendorsertelecomperiod.hasStart()) {
			r.setRsrchDfnEndsrTlcmPrdStrt(String.valueOf(researchdefinitionendorsertelecomperiod.getStart()));
		}
		/******************** RsrchDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitionendorsertelecomperiod.hasEnd()) {
			r.setRsrchDfnEndsrTlcmPrdEnd(String.valueOf(researchdefinitionendorsertelecomperiod.getEnd()));
		}
		/******************** researchdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitionendorsertelecomsystem = researchdefinitionendorsertelecom.getSystem();
		r.setRsrchDfnEndsrTlcmSys(researchdefinitionendorsertelecomsystem.toCode());

		/******************** researchdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitionendorsertelecomuse = researchdefinitionendorsertelecom.getUse();
		r.setRsrchDfnEndsrTlcmUse(researchdefinitionendorsertelecomuse.toCode());

		/******************** RsrchDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitionendorsertelecom.hasRank()) {
			r.setRsrchDfnEndsrTlcmRnk(String.valueOf(researchdefinitionendorsertelecom.getRank()));
		}
		/******************** RsrchDfn_ShortTtl ********************************************************************************/
		if(researchdefinition.hasShortTitle()) {
			r.setRsrchDfnShortTtl(String.valueOf(researchdefinition.getShortTitle()));
		}
		/******************** RsrchDfn_Ttl ********************************************************************************/
		if(researchdefinition.hasTitle()) {
			r.setRsrchDfnTtl(String.valueOf(researchdefinition.getTitle()));
		}
		/******************** RsrchDfn_Subtitle ********************************************************************************/
		if(researchdefinition.hasSubtitle()) {
			r.setRsrchDfnSubtitle(String.valueOf(researchdefinition.getSubtitle()));
		}
		/******************** researchdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus researchdefinitionstatus = researchdefinition.getStatus();
		r.setRsrchDfnSts(researchdefinitionstatus.toCode());

		/******************** RsrchDfn_Dscrptn ********************************************************************************/
		if(researchdefinition.hasDescription()) {
			r.setRsrchDfnDscrptn(String.valueOf(researchdefinition.getDescription()));
		}
		/******************** RsrchDfn_Outcome ********************************************************************************/
		if(researchdefinition.hasOutcome()) {
			r.setRsrchDfnOutcome(String.valueOf(researchdefinition.getOutcome()));
		}
		/******************** RsrchDfn_Url ********************************************************************************/
		if(researchdefinition.hasUrl()) {
			r.setRsrchDfnUrl(String.valueOf(researchdefinition.getUrl()));
		}
		/******************** RsrchDfn_Popln ********************************************************************************/
		if(researchdefinition.hasPopulation()) {
			r.setRsrchDfnPopln(String.valueOf(researchdefinition.getPopulation()));
		}
		/******************** RsrchDfn_Pblshr ********************************************************************************/
		if(researchdefinition.hasPublisher()) {
			r.setRsrchDfnPblshr(String.valueOf(researchdefinition.getPublisher()));
		}
		/******************** RsrchDfn_Exprmtl ********************************************************************************/
		if(researchdefinition.hasExperimental()) {
			r.setRsrchDfnExprmtl(String.valueOf(researchdefinition.getExperimental()));
		}
		/******************** researchdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioneffectiveperiod = researchdefinition.getEffectivePeriod();

		/******************** RsrchDfn_EfctivePrd_Strt ********************************************************************************/
		if(researchdefinitioneffectiveperiod.hasStart()) {
			r.setRsrchDfnEfctivePrdStrt(String.valueOf(researchdefinitioneffectiveperiod.getStart()));
		}
		/******************** RsrchDfn_EfctivePrd_End ********************************************************************************/
		if(researchdefinitioneffectiveperiod.hasEnd()) {
			r.setRsrchDfnEfctivePrdEnd(String.valueOf(researchdefinitioneffectiveperiod.getEnd()));
		}
		/******************** RsrchDfn_Prpse ********************************************************************************/
		if(researchdefinition.hasPurpose()) {
			r.setRsrchDfnPrpse(String.valueOf(researchdefinition.getPurpose()));
		}
		/******************** researchdefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitionauthor = researchdefinition.getAuthorFirstRep();

		/******************** RsrchDfn_Athr_Nm ********************************************************************************/
		if(researchdefinitionauthor.hasName()) {
			r.setRsrchDfnAthrNm(String.valueOf(researchdefinitionauthor.getName()));
		}
		/******************** researchdefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitionauthortelecom = researchdefinitionauthor.getTelecomFirstRep();

		/******************** RsrchDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(researchdefinitionauthortelecom.hasValue()) {
			r.setRsrchDfnAthrTlcmVl(String.valueOf(researchdefinitionauthortelecom.getValue()));
		}
		/******************** researchdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionauthortelecomperiod = researchdefinitionauthortelecom.getPeriod();

		/******************** RsrchDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitionauthortelecomperiod.hasStart()) {
			r.setRsrchDfnAthrTlcmPrdStrt(String.valueOf(researchdefinitionauthortelecomperiod.getStart()));
		}
		/******************** RsrchDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitionauthortelecomperiod.hasEnd()) {
			r.setRsrchDfnAthrTlcmPrdEnd(String.valueOf(researchdefinitionauthortelecomperiod.getEnd()));
		}
		/******************** researchdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitionauthortelecomsystem = researchdefinitionauthortelecom.getSystem();
		r.setRsrchDfnAthrTlcmSys(researchdefinitionauthortelecomsystem.toCode());

		/******************** researchdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitionauthortelecomuse = researchdefinitionauthortelecom.getUse();
		r.setRsrchDfnAthrTlcmUse(researchdefinitionauthortelecomuse.toCode());

		/******************** RsrchDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitionauthortelecom.hasRank()) {
			r.setRsrchDfnAthrTlcmRnk(String.valueOf(researchdefinitionauthortelecom.getRank()));
		}
		/******************** RsrchDfn_ExposureAlternative ********************************************************************************/
		if(researchdefinition.hasExposureAlternative()) {
			r.setRsrchDfnExposureAlternative(String.valueOf(researchdefinition.getExposureAlternative()));
		}
		/******************** researchdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitioncontact = researchdefinition.getContactFirstRep();

		/******************** RsrchDfn_Cntct_Nm ********************************************************************************/
		if(researchdefinitioncontact.hasName()) {
			r.setRsrchDfnCntctNm(String.valueOf(researchdefinitioncontact.getName()));
		}
		/******************** researchdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitioncontacttelecom = researchdefinitioncontact.getTelecomFirstRep();

		/******************** RsrchDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(researchdefinitioncontacttelecom.hasValue()) {
			r.setRsrchDfnCntctTlcmVl(String.valueOf(researchdefinitioncontacttelecom.getValue()));
		}
		/******************** researchdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioncontacttelecomperiod = researchdefinitioncontacttelecom.getPeriod();

		/******************** RsrchDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitioncontacttelecomperiod.hasStart()) {
			r.setRsrchDfnCntctTlcmPrdStrt(String.valueOf(researchdefinitioncontacttelecomperiod.getStart()));
		}
		/******************** RsrchDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitioncontacttelecomperiod.hasEnd()) {
			r.setRsrchDfnCntctTlcmPrdEnd(String.valueOf(researchdefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** researchdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitioncontacttelecomsystem = researchdefinitioncontacttelecom.getSystem();
		r.setRsrchDfnCntctTlcmSys(researchdefinitioncontacttelecomsystem.toCode());

		/******************** researchdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitioncontacttelecomuse = researchdefinitioncontacttelecom.getUse();
		r.setRsrchDfnCntctTlcmUse(researchdefinitioncontacttelecomuse.toCode());

		/******************** RsrchDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitioncontacttelecom.hasRank()) {
			r.setRsrchDfnCntctTlcmRnk(String.valueOf(researchdefinitioncontacttelecom.getRank()));
		}
		/******************** researchdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchdefinitionidentifier = researchdefinition.getIdentifierFirstRep();

		/******************** RsrchDfn_Id_Vl ********************************************************************************/
		if(researchdefinitionidentifier.hasValue()) {
			r.setRsrchDfnIdVl(String.valueOf(researchdefinitionidentifier.getValue()));
		}
		/******************** researchdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionidentifiertype = researchdefinitionidentifier.getType();

		/******************** RsrchDfn_Id_Typ_Txt ********************************************************************************/
		if(researchdefinitionidentifiertype.hasText()) {
			r.setRsrchDfnIdTypTxt(String.valueOf(researchdefinitionidentifiertype.getText()));
		}
		/******************** researchdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionidentifiertypecoding = researchdefinitionidentifiertype.getCodingFirstRep();

		/******************** RsrchDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionidentifiertypecoding.hasVersion()) {
			r.setRsrchDfnIdTypCdgVrsn(String.valueOf(researchdefinitionidentifiertypecoding.getVersion()));
		}
		/******************** RsrchDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionidentifiertypecoding.hasDisplay()) {
			r.setRsrchDfnIdTypCdgDsply(String.valueOf(researchdefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** RsrchDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchdefinitionidentifiertypecoding.hasCode()) {
			r.setRsrchDfnIdTypCdgCd(String.valueOf(researchdefinitionidentifiertypecoding.getCode()));
		}
		/******************** RsrchDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionidentifiertypecoding.hasUserSelected()) {
			r.setRsrchDfnIdTypCdgUsrSltd(String.valueOf(researchdefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** RsrchDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchdefinitionidentifiertypecoding.hasSystem()) {
			r.setRsrchDfnIdTypCdgSys(String.valueOf(researchdefinitionidentifiertypecoding.getSystem()));
		}
		/******************** researchdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionidentifierperiod = researchdefinitionidentifier.getPeriod();

		/******************** RsrchDfn_Id_Prd_Strt ********************************************************************************/
		if(researchdefinitionidentifierperiod.hasStart()) {
			r.setRsrchDfnIdPrdStrt(String.valueOf(researchdefinitionidentifierperiod.getStart()));
		}
		/******************** RsrchDfn_Id_Prd_End ********************************************************************************/
		if(researchdefinitionidentifierperiod.hasEnd()) {
			r.setRsrchDfnIdPrdEnd(String.valueOf(researchdefinitionidentifierperiod.getEnd()));
		}
		/******************** RsrchDfn_Id_Assigner ********************************************************************************/
		if(researchdefinitionidentifier.hasAssigner()) {
			r.setRsrchDfnIdAssigner(String.valueOf(researchdefinitionidentifier.getAssigner()));
		}
		/******************** RsrchDfn_Id_Sys ********************************************************************************/
		if(researchdefinitionidentifier.hasSystem()) {
			r.setRsrchDfnIdSys(String.valueOf(researchdefinitionidentifier.getSystem()));
		}
		/******************** researchdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchdefinitionidentifieruse = researchdefinitionidentifier.getUse();
		r.setRsrchDfnIdUse(researchdefinitionidentifieruse.toCode());

		/******************** RsrchDfn_Copyright ********************************************************************************/
		if(researchdefinition.hasCopyright()) {
			r.setRsrchDfnCopyright(String.valueOf(researchdefinition.getCopyright()));
		}
		/******************** researchdefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitiontopic = researchdefinition.getTopicFirstRep();

		/******************** RsrchDfn_Topic_Txt ********************************************************************************/
		if(researchdefinitiontopic.hasText()) {
			r.setRsrchDfnTopicTxt(String.valueOf(researchdefinitiontopic.getText()));
		}
		/******************** researchdefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitiontopiccoding = researchdefinitiontopic.getCodingFirstRep();

		/******************** RsrchDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitiontopiccoding.hasVersion()) {
			r.setRsrchDfnTopicCdgVrsn(String.valueOf(researchdefinitiontopiccoding.getVersion()));
		}
		/******************** RsrchDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(researchdefinitiontopiccoding.hasDisplay()) {
			r.setRsrchDfnTopicCdgDsply(String.valueOf(researchdefinitiontopiccoding.getDisplay()));
		}
		/******************** RsrchDfn_Topic_Cdg_Cd ********************************************************************************/
		if(researchdefinitiontopiccoding.hasCode()) {
			r.setRsrchDfnTopicCdgCd(String.valueOf(researchdefinitiontopiccoding.getCode()));
		}
		/******************** RsrchDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitiontopiccoding.hasUserSelected()) {
			r.setRsrchDfnTopicCdgUsrSltd(String.valueOf(researchdefinitiontopiccoding.getUserSelected()));
		}
		/******************** RsrchDfn_Topic_Cdg_Sys ********************************************************************************/
		if(researchdefinitiontopiccoding.hasSystem()) {
			r.setRsrchDfnTopicCdgSys(String.valueOf(researchdefinitiontopiccoding.getSystem()));
		}
		/******************** RsrchDfn_LastReviewDt ********************************************************************************/
		if(researchdefinition.hasLastReviewDate()) {
			r.setRsrchDfnLastReviewDt(String.valueOf(researchdefinition.getLastReviewDate()));
		}
		/******************** RsrchDfn_ApprovalDt ********************************************************************************/
		if(researchdefinition.hasApprovalDate()) {
			r.setRsrchDfnApprovalDt(String.valueOf(researchdefinition.getApprovalDate()));
		}
		/******************** researchdefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitioneditor = researchdefinition.getEditorFirstRep();

		/******************** RsrchDfn_Editor_Nm ********************************************************************************/
		if(researchdefinitioneditor.hasName()) {
			r.setRsrchDfnEditorNm(String.valueOf(researchdefinitioneditor.getName()));
		}
		/******************** researchdefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitioneditortelecom = researchdefinitioneditor.getTelecomFirstRep();

		/******************** RsrchDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(researchdefinitioneditortelecom.hasValue()) {
			r.setRsrchDfnEditorTlcmVl(String.valueOf(researchdefinitioneditortelecom.getValue()));
		}
		/******************** researchdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioneditortelecomperiod = researchdefinitioneditortelecom.getPeriod();

		/******************** RsrchDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitioneditortelecomperiod.hasStart()) {
			r.setRsrchDfnEditorTlcmPrdStrt(String.valueOf(researchdefinitioneditortelecomperiod.getStart()));
		}
		/******************** RsrchDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitioneditortelecomperiod.hasEnd()) {
			r.setRsrchDfnEditorTlcmPrdEnd(String.valueOf(researchdefinitioneditortelecomperiod.getEnd()));
		}
		/******************** researchdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitioneditortelecomsystem = researchdefinitioneditortelecom.getSystem();
		r.setRsrchDfnEditorTlcmSys(researchdefinitioneditortelecomsystem.toCode());

		/******************** researchdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitioneditortelecomuse = researchdefinitioneditortelecom.getUse();
		r.setRsrchDfnEditorTlcmUse(researchdefinitioneditortelecomuse.toCode());

		/******************** RsrchDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitioneditortelecom.hasRank()) {
			r.setRsrchDfnEditorTlcmRnk(String.valueOf(researchdefinitioneditortelecom.getRank()));
		}
		/******************** RsrchDfn_Exposure ********************************************************************************/
		if(researchdefinition.hasExposure()) {
			r.setRsrchDfnExposure(String.valueOf(researchdefinition.getExposure()));
		}
		/******************** RsrchDfn_Usg ********************************************************************************/
		if(researchdefinition.hasUsage()) {
			r.setRsrchDfnUsg(String.valueOf(researchdefinition.getUsage()));
		}
		/******************** researchdefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact researchdefinitionrelatedartifact = researchdefinition.getRelatedArtifactFirstRep();

		/******************** RsrchDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(researchdefinitionrelatedartifact.hasResource()) {
			r.setRsrchDfnRltedArtfctRsrc(String.valueOf(researchdefinitionrelatedartifact.getResource()));
		}
		/******************** researchdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType researchdefinitionrelatedartifacttype = researchdefinitionrelatedartifact.getType();
		r.setRsrchDfnRltedArtfctTyp(researchdefinitionrelatedartifacttype.toCode());

		/******************** researchdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchdefinitionrelatedartifactdocument = researchdefinitionrelatedartifact.getDocument();

		/******************** RsrchDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasSize()) {
			r.setRsrchDfnRltedArtfctDocSz(String.valueOf(researchdefinitionrelatedartifactdocument.getSize()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasLanguage()) {
			r.setRsrchDfnRltedArtfctDocLnguage(String.valueOf(researchdefinitionrelatedartifactdocument.getLanguage()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasContentType()) {
			r.setRsrchDfnRltedArtfctDocCntntTyp(String.valueOf(researchdefinitionrelatedartifactdocument.getContentType()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasTitle()) {
			r.setRsrchDfnRltedArtfctDocTtl(String.valueOf(researchdefinitionrelatedartifactdocument.getTitle()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasUrl()) {
			r.setRsrchDfnRltedArtfctDocUrl(String.valueOf(researchdefinitionrelatedartifactdocument.getUrl()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasData()) {
			r.setRsrchDfnRltedArtfctDocData(String.valueOf(researchdefinitionrelatedartifactdocument.getData()));
		}

		/******************** RsrchDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasHash()) {
			r.setRsrchDfnRltedArtfctDocHash(String.valueOf(researchdefinitionrelatedartifactdocument.getHash()));
		}

		/******************** RsrchDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(researchdefinitionrelatedartifactdocument.hasCreation()) {
			r.setRsrchDfnRltedArtfctDocCreation(String.valueOf(researchdefinitionrelatedartifactdocument.getCreation()));
		}
		/******************** RsrchDfn_RltedArtfct_Url ********************************************************************************/
		if(researchdefinitionrelatedartifact.hasUrl()) {
			r.setRsrchDfnRltedArtfctUrl(String.valueOf(researchdefinitionrelatedartifact.getUrl()));
		}
		/******************** RsrchDfn_RltedArtfct_Lbl ********************************************************************************/
		if(researchdefinitionrelatedartifact.hasLabel()) {
			r.setRsrchDfnRltedArtfctLbl(String.valueOf(researchdefinitionrelatedartifact.getLabel()));
		}
		/******************** RsrchDfn_RltedArtfct_Citation ********************************************************************************/
		if(researchdefinitionrelatedartifact.hasCitation()) {
			r.setRsrchDfnRltedArtfctCitation(String.valueOf(researchdefinitionrelatedartifact.getCitation()));
		}
		/******************** researchdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext researchdefinitionusecontext = researchdefinition.getUseContextFirstRep();

		/******************** researchdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionusecontextcode = researchdefinitionusecontext.getCode();

		/******************** RsrchDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(researchdefinitionusecontextcode.hasVersion()) {
			r.setRsrchDfnUseCntxtCdVrsn(String.valueOf(researchdefinitionusecontextcode.getVersion()));
		}
		/******************** RsrchDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(researchdefinitionusecontextcode.hasDisplay()) {
			r.setRsrchDfnUseCntxtCdDsply(String.valueOf(researchdefinitionusecontextcode.getDisplay()));
		}
		/******************** RsrchDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(researchdefinitionusecontextcode.hasUserSelected()) {
			r.setRsrchDfnUseCntxtCdUsrSltd(String.valueOf(researchdefinitionusecontextcode.getUserSelected()));
		}
		/******************** RsrchDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(researchdefinitionusecontextcode.hasSystem()) {
			r.setRsrchDfnUseCntxtCdSys(String.valueOf(researchdefinitionusecontextcode.getSystem()));
		}
		/******************** researchdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionusecontextvaluecodeableconcept = researchdefinitionusecontext.getValueCodeableConcept();

		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconcept.hasText()) {
			r.setRsrchDfnUseCntxtVlCdbleCncptTxt(String.valueOf(researchdefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** researchdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionusecontextvaluecodeableconceptcoding = researchdefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			r.setRsrchDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			r.setRsrchDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			r.setRsrchDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			r.setRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			r.setRsrchDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** researchdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluequantity = researchdefinitionusecontext.getValueQuantity();

		/******************** RsrchDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(researchdefinitionusecontextvaluequantity.hasValue()) {
			r.setRsrchDfnUseCntxtVlQntyVl(String.valueOf(researchdefinitionusecontextvaluequantity.getValue()));
		}
		/******************** researchdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchdefinitionusecontextvaluequantitycomparator = researchdefinitionusecontextvaluequantity.getComparator();
		r.setRsrchDfnUseCntxtVlQntyCmprtr(researchdefinitionusecontextvaluequantitycomparator.toCode());

		/******************** RsrchDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(researchdefinitionusecontextvaluequantity.hasCode()) {
			r.setRsrchDfnUseCntxtVlQntyCd(String.valueOf(researchdefinitionusecontextvaluequantity.getCode()));
		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(researchdefinitionusecontextvaluequantity.hasUnit()) {
			r.setRsrchDfnUseCntxtVlQntyUnt(String.valueOf(researchdefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(researchdefinitionusecontextvaluequantity.hasSystem()) {
			r.setRsrchDfnUseCntxtVlQntySys(String.valueOf(researchdefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** researchdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchdefinitionusecontextvaluerange = researchdefinitionusecontext.getValueRange();

		/******************** researchdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluerangelow = researchdefinitionusecontextvaluerange.getLow();

		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(researchdefinitionusecontextvaluerangelow.hasValue()) {
			r.setRsrchDfnUseCntxtVlRngLwVl(String.valueOf(researchdefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** researchdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchdefinitionusecontextvaluerangelowcomparator = researchdefinitionusecontextvaluerangelow.getComparator();
		r.setRsrchDfnUseCntxtVlRngLwCmprtr(researchdefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(researchdefinitionusecontextvaluerangelow.hasCode()) {
			r.setRsrchDfnUseCntxtVlRngLwCd(String.valueOf(researchdefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(researchdefinitionusecontextvaluerangelow.hasUnit()) {
			r.setRsrchDfnUseCntxtVlRngLwUnt(String.valueOf(researchdefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(researchdefinitionusecontextvaluerangelow.hasSystem()) {
			r.setRsrchDfnUseCntxtVlRngLwSys(String.valueOf(researchdefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** researchdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluerangehigh = researchdefinitionusecontextvaluerange.getHigh();

		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(researchdefinitionusecontextvaluerangehigh.hasValue()) {
			r.setRsrchDfnUseCntxtVlRngHiVl(String.valueOf(researchdefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** researchdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchdefinitionusecontextvaluerangehighcomparator = researchdefinitionusecontextvaluerangehigh.getComparator();
		r.setRsrchDfnUseCntxtVlRngHiCmprtr(researchdefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(researchdefinitionusecontextvaluerangehigh.hasCode()) {
			r.setRsrchDfnUseCntxtVlRngHiCd(String.valueOf(researchdefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(researchdefinitionusecontextvaluerangehigh.hasUnit()) {
			r.setRsrchDfnUseCntxtVlRngHiUnt(String.valueOf(researchdefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(researchdefinitionusecontextvaluerangehigh.hasSystem()) {
			r.setRsrchDfnUseCntxtVlRngHiSys(String.valueOf(researchdefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** RsrchDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(researchdefinitionusecontext.hasValueReference()) {
			r.setRsrchDfnUseCntxtVlRfrnc(String.valueOf(researchdefinitionusecontext.getValueReference()));
		}
		/******************** researchdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionjurisdiction = researchdefinition.getJurisdictionFirstRep();

		/******************** RsrchDfn_Jrsdctn_Txt ********************************************************************************/
		if(researchdefinitionjurisdiction.hasText()) {
			r.setRsrchDfnJrsdctnTxt(String.valueOf(researchdefinitionjurisdiction.getText()));
		}
		/******************** researchdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionjurisdictioncoding = researchdefinitionjurisdiction.getCodingFirstRep();

		/******************** RsrchDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionjurisdictioncoding.hasVersion()) {
			r.setRsrchDfnJrsdctnCdgVrsn(String.valueOf(researchdefinitionjurisdictioncoding.getVersion()));
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionjurisdictioncoding.hasDisplay()) {
			r.setRsrchDfnJrsdctnCdgDsply(String.valueOf(researchdefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(researchdefinitionjurisdictioncoding.hasCode()) {
			r.setRsrchDfnJrsdctnCdgCd(String.valueOf(researchdefinitionjurisdictioncoding.getCode()));
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionjurisdictioncoding.hasUserSelected()) {
			r.setRsrchDfnJrsdctnCdgUsrSltd(String.valueOf(researchdefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(researchdefinitionjurisdictioncoding.hasSystem()) {
			r.setRsrchDfnJrsdctnCdgSys(String.valueOf(researchdefinitionjurisdictioncoding.getSystem()));
		}
		return r;
	}
}
