package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchElementDefinition;
public class ResearchElementDefinitionBidirectionalConversion 
{
	public ResearchElementDefinition ResearchElementDefinitions(org.hl7.fhir.r4.model.ResearchElementDefinition researchelementdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchElementDefinition r = new  main.java.com.campfhir.model.ResearchElementDefinition();

		/******************** id ********************************************************************************/
		researchelementdefinition.setId(r.getId());

		/******************** RsrchElmntDfn_Nm ********************************************************************************/
		if(researchelementdefinition.hasName()) {
			r.setRsrchElmntDfnNm(String.valueOf(researchelementdefinition.getName()));
		}
		/******************** researchelementdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementType researchelementdefinitiontype = researchelementdefinition.getType();
		r.setRsrchElmntDfnTyp(researchelementdefinitiontype.toCode());

		/******************** RsrchElmntDfn_Dt ********************************************************************************/
		if(researchelementdefinition.hasDate()) {
			r.setRsrchElmntDfnDt(String.valueOf(researchelementdefinition.getDate()));
		}
		/******************** RsrchElmntDfn_Vrsn ********************************************************************************/
		if(researchelementdefinition.hasVersion()) {
			r.setRsrchElmntDfnVrsn(String.valueOf(researchelementdefinition.getVersion()));
		}
		/******************** researchelementdefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitionreviewer = researchelementdefinition.getReviewerFirstRep();

		/******************** RsrchElmntDfn_Rviewr_Nm ********************************************************************************/
		if(researchelementdefinitionreviewer.hasName()) {
			r.setRsrchElmntDfnRviewrNm(String.valueOf(researchelementdefinitionreviewer.getName()));
		}
		/******************** researchelementdefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitionreviewertelecom = researchelementdefinitionreviewer.getTelecomFirstRep();

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitionreviewertelecom.hasValue()) {
			r.setRsrchElmntDfnRviewrTlcmVl(String.valueOf(researchelementdefinitionreviewertelecom.getValue()));
		}
		/******************** researchelementdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionreviewertelecomperiod = researchelementdefinitionreviewertelecom.getPeriod();

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionreviewertelecomperiod.hasStart()) {
			r.setRsrchElmntDfnRviewrTlcmPrdStrt(String.valueOf(researchelementdefinitionreviewertelecomperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitionreviewertelecomperiod.hasEnd()) {
			r.setRsrchElmntDfnRviewrTlcmPrdEnd(String.valueOf(researchelementdefinitionreviewertelecomperiod.getEnd()));
		}
		/******************** researchelementdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitionreviewertelecomsystem = researchelementdefinitionreviewertelecom.getSystem();
		r.setRsrchElmntDfnRviewrTlcmSys(researchelementdefinitionreviewertelecomsystem.toCode());

		/******************** researchelementdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitionreviewertelecomuse = researchelementdefinitionreviewertelecom.getUse();
		r.setRsrchElmntDfnRviewrTlcmUse(researchelementdefinitionreviewertelecomuse.toCode());

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitionreviewertelecom.hasRank()) {
			r.setRsrchElmntDfnRviewrTlcmRnk(String.valueOf(researchelementdefinitionreviewertelecom.getRank()));
		}
		/******************** researchelementdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionsubjectcodeableconcept = researchelementdefinition.getSubjectCodeableConcept();

		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconcept.hasText()) {
			r.setRsrchElmntDfnSbjctCdbleCncptTxt(String.valueOf(researchelementdefinitionsubjectcodeableconcept.getText()));
		}
		/******************** researchelementdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionsubjectcodeableconceptcoding = researchelementdefinitionsubjectcodeableconcept.getCodingFirstRep();

		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasVersion()) {
			r.setRsrchElmntDfnSbjctCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasDisplay()) {
			r.setRsrchElmntDfnSbjctCdbleCncptCdgDsply(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasCode()) {
			r.setRsrchElmntDfnSbjctCdbleCncptCdgCd(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getCode()));
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasUserSelected()) {
			r.setRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasSystem()) {
			r.setRsrchElmntDfnSbjctCdbleCncptCdgSys(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** RsrchElmntDfn_SbjctRfrnc ********************************************************************************/
		if(researchelementdefinition.hasSubjectReference()) {
			r.setRsrchElmntDfnSbjctRfrnc(String.valueOf(researchelementdefinition.getSubjectReference()));
		}
		/******************** researchelementdefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitionendorser = researchelementdefinition.getEndorserFirstRep();

		/******************** RsrchElmntDfn_Endsr_Nm ********************************************************************************/
		if(researchelementdefinitionendorser.hasName()) {
			r.setRsrchElmntDfnEndsrNm(String.valueOf(researchelementdefinitionendorser.getName()));
		}
		/******************** researchelementdefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitionendorsertelecom = researchelementdefinitionendorser.getTelecomFirstRep();

		/******************** RsrchElmntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitionendorsertelecom.hasValue()) {
			r.setRsrchElmntDfnEndsrTlcmVl(String.valueOf(researchelementdefinitionendorsertelecom.getValue()));
		}
		/******************** researchelementdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionendorsertelecomperiod = researchelementdefinitionendorsertelecom.getPeriod();

		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionendorsertelecomperiod.hasStart()) {
			r.setRsrchElmntDfnEndsrTlcmPrdStrt(String.valueOf(researchelementdefinitionendorsertelecomperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitionendorsertelecomperiod.hasEnd()) {
			r.setRsrchElmntDfnEndsrTlcmPrdEnd(String.valueOf(researchelementdefinitionendorsertelecomperiod.getEnd()));
		}
		/******************** researchelementdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitionendorsertelecomsystem = researchelementdefinitionendorsertelecom.getSystem();
		r.setRsrchElmntDfnEndsrTlcmSys(researchelementdefinitionendorsertelecomsystem.toCode());

		/******************** researchelementdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitionendorsertelecomuse = researchelementdefinitionendorsertelecom.getUse();
		r.setRsrchElmntDfnEndsrTlcmUse(researchelementdefinitionendorsertelecomuse.toCode());

		/******************** RsrchElmntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitionendorsertelecom.hasRank()) {
			r.setRsrchElmntDfnEndsrTlcmRnk(String.valueOf(researchelementdefinitionendorsertelecom.getRank()));
		}
		/******************** RsrchElmntDfn_ShortTtl ********************************************************************************/
		if(researchelementdefinition.hasShortTitle()) {
			r.setRsrchElmntDfnShortTtl(String.valueOf(researchelementdefinition.getShortTitle()));
		}
		/******************** researchelementdefinitionvariabletype ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.VariableType researchelementdefinitionvariabletype = researchelementdefinition.getVariableType();
		r.setRsrchElmntDfnVrbleTyp(researchelementdefinitionvariabletype.toCode());

		/******************** RsrchElmntDfn_Ttl ********************************************************************************/
		if(researchelementdefinition.hasTitle()) {
			r.setRsrchElmntDfnTtl(String.valueOf(researchelementdefinition.getTitle()));
		}
		/******************** RsrchElmntDfn_Subtitle ********************************************************************************/
		if(researchelementdefinition.hasSubtitle()) {
			r.setRsrchElmntDfnSubtitle(String.valueOf(researchelementdefinition.getSubtitle()));
		}
		/******************** researchelementdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus researchelementdefinitionstatus = researchelementdefinition.getStatus();
		r.setRsrchElmntDfnSts(researchelementdefinitionstatus.toCode());

		/******************** RsrchElmntDfn_Dscrptn ********************************************************************************/
		if(researchelementdefinition.hasDescription()) {
			r.setRsrchElmntDfnDscrptn(String.valueOf(researchelementdefinition.getDescription()));
		}
		/******************** RsrchElmntDfn_Url ********************************************************************************/
		if(researchelementdefinition.hasUrl()) {
			r.setRsrchElmntDfnUrl(String.valueOf(researchelementdefinition.getUrl()));
		}
		/******************** RsrchElmntDfn_Pblshr ********************************************************************************/
		if(researchelementdefinition.hasPublisher()) {
			r.setRsrchElmntDfnPblshr(String.valueOf(researchelementdefinition.getPublisher()));
		}
		/******************** RsrchElmntDfn_Exprmtl ********************************************************************************/
		if(researchelementdefinition.hasExperimental()) {
			r.setRsrchElmntDfnExprmtl(String.valueOf(researchelementdefinition.getExperimental()));
		}
		/******************** researchelementdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioneffectiveperiod = researchelementdefinition.getEffectivePeriod();

		/******************** RsrchElmntDfn_EfctivePrd_Strt ********************************************************************************/
		if(researchelementdefinitioneffectiveperiod.hasStart()) {
			r.setRsrchElmntDfnEfctivePrdStrt(String.valueOf(researchelementdefinitioneffectiveperiod.getStart()));
		}
		/******************** RsrchElmntDfn_EfctivePrd_End ********************************************************************************/
		if(researchelementdefinitioneffectiveperiod.hasEnd()) {
			r.setRsrchElmntDfnEfctivePrdEnd(String.valueOf(researchelementdefinitioneffectiveperiod.getEnd()));
		}
		/******************** RsrchElmntDfn_Prpse ********************************************************************************/
		if(researchelementdefinition.hasPurpose()) {
			r.setRsrchElmntDfnPrpse(String.valueOf(researchelementdefinition.getPurpose()));
		}
		/******************** researchelementdefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitionauthor = researchelementdefinition.getAuthorFirstRep();

		/******************** RsrchElmntDfn_Athr_Nm ********************************************************************************/
		if(researchelementdefinitionauthor.hasName()) {
			r.setRsrchElmntDfnAthrNm(String.valueOf(researchelementdefinitionauthor.getName()));
		}
		/******************** researchelementdefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitionauthortelecom = researchelementdefinitionauthor.getTelecomFirstRep();

		/******************** RsrchElmntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitionauthortelecom.hasValue()) {
			r.setRsrchElmntDfnAthrTlcmVl(String.valueOf(researchelementdefinitionauthortelecom.getValue()));
		}
		/******************** researchelementdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionauthortelecomperiod = researchelementdefinitionauthortelecom.getPeriod();

		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionauthortelecomperiod.hasStart()) {
			r.setRsrchElmntDfnAthrTlcmPrdStrt(String.valueOf(researchelementdefinitionauthortelecomperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitionauthortelecomperiod.hasEnd()) {
			r.setRsrchElmntDfnAthrTlcmPrdEnd(String.valueOf(researchelementdefinitionauthortelecomperiod.getEnd()));
		}
		/******************** researchelementdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitionauthortelecomsystem = researchelementdefinitionauthortelecom.getSystem();
		r.setRsrchElmntDfnAthrTlcmSys(researchelementdefinitionauthortelecomsystem.toCode());

		/******************** researchelementdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitionauthortelecomuse = researchelementdefinitionauthortelecom.getUse();
		r.setRsrchElmntDfnAthrTlcmUse(researchelementdefinitionauthortelecomuse.toCode());

		/******************** RsrchElmntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitionauthortelecom.hasRank()) {
			r.setRsrchElmntDfnAthrTlcmRnk(String.valueOf(researchelementdefinitionauthortelecom.getRank()));
		}
		/******************** researchelementdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitioncontact = researchelementdefinition.getContactFirstRep();

		/******************** RsrchElmntDfn_Cntct_Nm ********************************************************************************/
		if(researchelementdefinitioncontact.hasName()) {
			r.setRsrchElmntDfnCntctNm(String.valueOf(researchelementdefinitioncontact.getName()));
		}
		/******************** researchelementdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitioncontacttelecom = researchelementdefinitioncontact.getTelecomFirstRep();

		/******************** RsrchElmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitioncontacttelecom.hasValue()) {
			r.setRsrchElmntDfnCntctTlcmVl(String.valueOf(researchelementdefinitioncontacttelecom.getValue()));
		}
		/******************** researchelementdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncontacttelecomperiod = researchelementdefinitioncontacttelecom.getPeriod();

		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitioncontacttelecomperiod.hasStart()) {
			r.setRsrchElmntDfnCntctTlcmPrdStrt(String.valueOf(researchelementdefinitioncontacttelecomperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitioncontacttelecomperiod.hasEnd()) {
			r.setRsrchElmntDfnCntctTlcmPrdEnd(String.valueOf(researchelementdefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** researchelementdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitioncontacttelecomsystem = researchelementdefinitioncontacttelecom.getSystem();
		r.setRsrchElmntDfnCntctTlcmSys(researchelementdefinitioncontacttelecomsystem.toCode());

		/******************** researchelementdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitioncontacttelecomuse = researchelementdefinitioncontacttelecom.getUse();
		r.setRsrchElmntDfnCntctTlcmUse(researchelementdefinitioncontacttelecomuse.toCode());

		/******************** RsrchElmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitioncontacttelecom.hasRank()) {
			r.setRsrchElmntDfnCntctTlcmRnk(String.valueOf(researchelementdefinitioncontacttelecom.getRank()));
		}
		/******************** researchelementdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchelementdefinitionidentifier = researchelementdefinition.getIdentifierFirstRep();

		/******************** RsrchElmntDfn_Id_Vl ********************************************************************************/
		if(researchelementdefinitionidentifier.hasValue()) {
			r.setRsrchElmntDfnIdVl(String.valueOf(researchelementdefinitionidentifier.getValue()));
		}
		/******************** researchelementdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionidentifiertype = researchelementdefinitionidentifier.getType();

		/******************** RsrchElmntDfn_Id_Typ_Txt ********************************************************************************/
		if(researchelementdefinitionidentifiertype.hasText()) {
			r.setRsrchElmntDfnIdTypTxt(String.valueOf(researchelementdefinitionidentifiertype.getText()));
		}
		/******************** researchelementdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionidentifiertypecoding = researchelementdefinitionidentifiertype.getCodingFirstRep();

		/******************** RsrchElmntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionidentifiertypecoding.hasVersion()) {
			r.setRsrchElmntDfnIdTypCdgVrsn(String.valueOf(researchelementdefinitionidentifiertypecoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionidentifiertypecoding.hasDisplay()) {
			r.setRsrchElmntDfnIdTypCdgDsply(String.valueOf(researchelementdefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionidentifiertypecoding.hasCode()) {
			r.setRsrchElmntDfnIdTypCdgCd(String.valueOf(researchelementdefinitionidentifiertypecoding.getCode()));
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionidentifiertypecoding.hasUserSelected()) {
			r.setRsrchElmntDfnIdTypCdgUsrSltd(String.valueOf(researchelementdefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionidentifiertypecoding.hasSystem()) {
			r.setRsrchElmntDfnIdTypCdgSys(String.valueOf(researchelementdefinitionidentifiertypecoding.getSystem()));
		}
		/******************** researchelementdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionidentifierperiod = researchelementdefinitionidentifier.getPeriod();

		/******************** RsrchElmntDfn_Id_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionidentifierperiod.hasStart()) {
			r.setRsrchElmntDfnIdPrdStrt(String.valueOf(researchelementdefinitionidentifierperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Id_Prd_End ********************************************************************************/
		if(researchelementdefinitionidentifierperiod.hasEnd()) {
			r.setRsrchElmntDfnIdPrdEnd(String.valueOf(researchelementdefinitionidentifierperiod.getEnd()));
		}
		/******************** RsrchElmntDfn_Id_Assigner ********************************************************************************/
		if(researchelementdefinitionidentifier.hasAssigner()) {
			r.setRsrchElmntDfnIdAssigner(String.valueOf(researchelementdefinitionidentifier.getAssigner()));
		}
		/******************** RsrchElmntDfn_Id_Sys ********************************************************************************/
		if(researchelementdefinitionidentifier.hasSystem()) {
			r.setRsrchElmntDfnIdSys(String.valueOf(researchelementdefinitionidentifier.getSystem()));
		}
		/******************** researchelementdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchelementdefinitionidentifieruse = researchelementdefinitionidentifier.getUse();
		r.setRsrchElmntDfnIdUse(researchelementdefinitionidentifieruse.toCode());

		/******************** RsrchElmntDfn_Copyright ********************************************************************************/
		if(researchelementdefinition.hasCopyright()) {
			r.setRsrchElmntDfnCopyright(String.valueOf(researchelementdefinition.getCopyright()));
		}
		/******************** researchelementdefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitiontopic = researchelementdefinition.getTopicFirstRep();

		/******************** RsrchElmntDfn_Topic_Txt ********************************************************************************/
		if(researchelementdefinitiontopic.hasText()) {
			r.setRsrchElmntDfnTopicTxt(String.valueOf(researchelementdefinitiontopic.getText()));
		}
		/******************** researchelementdefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitiontopiccoding = researchelementdefinitiontopic.getCodingFirstRep();

		/******************** RsrchElmntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitiontopiccoding.hasVersion()) {
			r.setRsrchElmntDfnTopicCdgVrsn(String.valueOf(researchelementdefinitiontopiccoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitiontopiccoding.hasDisplay()) {
			r.setRsrchElmntDfnTopicCdgDsply(String.valueOf(researchelementdefinitiontopiccoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitiontopiccoding.hasCode()) {
			r.setRsrchElmntDfnTopicCdgCd(String.valueOf(researchelementdefinitiontopiccoding.getCode()));
		}
		/******************** RsrchElmntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitiontopiccoding.hasUserSelected()) {
			r.setRsrchElmntDfnTopicCdgUsrSltd(String.valueOf(researchelementdefinitiontopiccoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitiontopiccoding.hasSystem()) {
			r.setRsrchElmntDfnTopicCdgSys(String.valueOf(researchelementdefinitiontopiccoding.getSystem()));
		}
		/******************** RsrchElmntDfn_LastReviewDt ********************************************************************************/
		if(researchelementdefinition.hasLastReviewDate()) {
			r.setRsrchElmntDfnLastReviewDt(String.valueOf(researchelementdefinition.getLastReviewDate()));
		}
		/******************** RsrchElmntDfn_ApprovalDt ********************************************************************************/
		if(researchelementdefinition.hasApprovalDate()) {
			r.setRsrchElmntDfnApprovalDt(String.valueOf(researchelementdefinition.getApprovalDate()));
		}
		/******************** researchelementdefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitioneditor = researchelementdefinition.getEditorFirstRep();

		/******************** RsrchElmntDfn_Editor_Nm ********************************************************************************/
		if(researchelementdefinitioneditor.hasName()) {
			r.setRsrchElmntDfnEditorNm(String.valueOf(researchelementdefinitioneditor.getName()));
		}
		/******************** researchelementdefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitioneditortelecom = researchelementdefinitioneditor.getTelecomFirstRep();

		/******************** RsrchElmntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitioneditortelecom.hasValue()) {
			r.setRsrchElmntDfnEditorTlcmVl(String.valueOf(researchelementdefinitioneditortelecom.getValue()));
		}
		/******************** researchelementdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioneditortelecomperiod = researchelementdefinitioneditortelecom.getPeriod();

		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitioneditortelecomperiod.hasStart()) {
			r.setRsrchElmntDfnEditorTlcmPrdStrt(String.valueOf(researchelementdefinitioneditortelecomperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitioneditortelecomperiod.hasEnd()) {
			r.setRsrchElmntDfnEditorTlcmPrdEnd(String.valueOf(researchelementdefinitioneditortelecomperiod.getEnd()));
		}
		/******************** researchelementdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitioneditortelecomsystem = researchelementdefinitioneditortelecom.getSystem();
		r.setRsrchElmntDfnEditorTlcmSys(researchelementdefinitioneditortelecomsystem.toCode());

		/******************** researchelementdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitioneditortelecomuse = researchelementdefinitioneditortelecom.getUse();
		r.setRsrchElmntDfnEditorTlcmUse(researchelementdefinitioneditortelecomuse.toCode());

		/******************** RsrchElmntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitioneditortelecom.hasRank()) {
			r.setRsrchElmntDfnEditorTlcmRnk(String.valueOf(researchelementdefinitioneditortelecom.getRank()));
		}
		/******************** RsrchElmntDfn_Usg ********************************************************************************/
		if(researchelementdefinition.hasUsage()) {
			r.setRsrchElmntDfnUsg(String.valueOf(researchelementdefinition.getUsage()));
		}
		/******************** researchelementdefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact researchelementdefinitionrelatedartifact = researchelementdefinition.getRelatedArtifactFirstRep();

		/******************** RsrchElmntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(researchelementdefinitionrelatedartifact.hasResource()) {
			r.setRsrchElmntDfnRltedArtfctRsrc(String.valueOf(researchelementdefinitionrelatedartifact.getResource()));
		}
		/******************** researchelementdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType researchelementdefinitionrelatedartifacttype = researchelementdefinitionrelatedartifact.getType();
		r.setRsrchElmntDfnRltedArtfctTyp(researchelementdefinitionrelatedartifacttype.toCode());

		/******************** researchelementdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchelementdefinitionrelatedartifactdocument = researchelementdefinitionrelatedartifact.getDocument();

		/******************** RsrchElmntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasSize()) {
			r.setRsrchElmntDfnRltedArtfctDocSz(String.valueOf(researchelementdefinitionrelatedartifactdocument.getSize()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasLanguage()) {
			r.setRsrchElmntDfnRltedArtfctDocLnguage(String.valueOf(researchelementdefinitionrelatedartifactdocument.getLanguage()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasContentType()) {
			r.setRsrchElmntDfnRltedArtfctDocCntntTyp(String.valueOf(researchelementdefinitionrelatedartifactdocument.getContentType()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasTitle()) {
			r.setRsrchElmntDfnRltedArtfctDocTtl(String.valueOf(researchelementdefinitionrelatedartifactdocument.getTitle()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasUrl()) {
			r.setRsrchElmntDfnRltedArtfctDocUrl(String.valueOf(researchelementdefinitionrelatedartifactdocument.getUrl()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasData()) {
			r.setRsrchElmntDfnRltedArtfctDocData(String.valueOf(researchelementdefinitionrelatedartifactdocument.getData()));
		}

		/******************** RsrchElmntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasHash()) {
			r.setRsrchElmntDfnRltedArtfctDocHash(String.valueOf(researchelementdefinitionrelatedartifactdocument.getHash()));
		}

		/******************** RsrchElmntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(researchelementdefinitionrelatedartifactdocument.hasCreation()) {
			r.setRsrchElmntDfnRltedArtfctDocCreation(String.valueOf(researchelementdefinitionrelatedartifactdocument.getCreation()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Url ********************************************************************************/
		if(researchelementdefinitionrelatedartifact.hasUrl()) {
			r.setRsrchElmntDfnRltedArtfctUrl(String.valueOf(researchelementdefinitionrelatedartifact.getUrl()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(researchelementdefinitionrelatedartifact.hasLabel()) {
			r.setRsrchElmntDfnRltedArtfctLbl(String.valueOf(researchelementdefinitionrelatedartifact.getLabel()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Citation ********************************************************************************/
		if(researchelementdefinitionrelatedartifact.hasCitation()) {
			r.setRsrchElmntDfnRltedArtfctCitation(String.valueOf(researchelementdefinitionrelatedartifact.getCitation()));
		}
		/******************** researchelementdefinitioncharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementDefinitionCharacteristicComponent researchelementdefinitioncharacteristic = researchelementdefinition.getCharacteristicFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasDefinitionCanonicalType()) {
			r.setRsrchElmntDfnCrctrstcDfnCanonicalTyp(String.valueOf(researchelementdefinitioncharacteristic.getDefinitionCanonicalType()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitioncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicdefinitioncodeableconcept = researchelementdefinitioncharacteristic.getDefinitionCodeableConcept();

		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconcept.hasText()) {
			r.setRsrchElmntDfnCrctrstcDfnCdbleCncptTxt(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconcept.getText()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding = researchelementdefinitioncharacteristicdefinitioncodeableconcept.getCodingFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasCode()) {
			r.setRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression researchelementdefinitioncharacteristicdefinitionexpression = researchelementdefinitioncharacteristic.getDefinitionExpression();

		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasName()) {
			r.setRsrchElmntDfnCrctrstcDfnExprsnNm(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getName()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasReference()) {
			r.setRsrchElmntDfnCrctrstcDfnExprsnRfrnc(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getReference()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasLanguage()) {
			r.setRsrchElmntDfnCrctrstcDfnExprsnLnguage(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getLanguage()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasDescription()) {
			r.setRsrchElmntDfnCrctrstcDfnExprsnDscrptn(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getDescription()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasExpression()) {
			r.setRsrchElmntDfnCrctrstcDfnExprsnExprsn(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getExpression()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement researchelementdefinitioncharacteristicdefinitiondatarequirement = researchelementdefinitioncharacteristic.getDefinitionDataRequirement();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasType()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentTyp(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirement.getType()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept = researchelementdefinitioncharacteristicdefinitiondatarequirement.getSubjectCodeableConcept();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.hasText()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.getText()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding = researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.getCodingFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasCode()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_US ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasSubjectReference()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirement.getSubjectReference()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasLimit()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentLmt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirement.getLimit()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent researchelementdefinitioncharacteristicdefinitiondatarequirementsort = researchelementdefinitioncharacteristicdefinitiondatarequirement.getSortFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsort.hasPath()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsort.getPath()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection = researchelementdefinitioncharacteristicdefinitiondatarequirementsort.getDirection();
		r.setRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection(researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection.toCode());

		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter = researchelementdefinitioncharacteristicdefinitiondatarequirement.getDateFilterFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.hasPath()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getPath()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.hasSearchParam()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getSearchParam()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.hasValueDateTimeType()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getValueDateTimeType()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getValueDuration();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasValue()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getComparator();
		r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasCode()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getValuePeriod();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasStart()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasEnd()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.getEnd()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter = researchelementdefinitioncharacteristicdefinitiondatarequirement.getCodeFilterFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.hasPath()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getPath()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.hasSearchParam()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getSearchParam()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.hasValueSet()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getValueSet()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode = researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getCodeFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext researchelementdefinitioncharacteristicusagecontext = researchelementdefinitioncharacteristic.getUsageContextFirstRep();

		/******************** researchelementdefinitioncharacteristicusagecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicusagecontextcode = researchelementdefinitioncharacteristicusagecontext.getCode();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextcode.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtCdVrsn(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextcode.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtCdDsply(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextcode.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextcode.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtCdSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept = researchelementdefinitioncharacteristicusagecontext.getValueCodeableConcept();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.hasText()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.getText()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding = researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasCode()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluequantity = researchelementdefinitioncharacteristicusagecontext.getValueQuantity();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasValue()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator = researchelementdefinitioncharacteristicusagecontextvaluequantity.getComparator();
		r.setRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr(researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasCode()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlQntySys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicusagecontextvaluerange = researchelementdefinitioncharacteristicusagecontext.getValueRange();

		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluerangelow = researchelementdefinitioncharacteristicusagecontextvaluerange.getLow();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasValue()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator = researchelementdefinitioncharacteristicusagecontextvaluerangelow.getComparator();
		r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr(researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasCode()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluerangehigh = researchelementdefinitioncharacteristicusagecontextvaluerange.getHigh();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasValue()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator = researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getComparator();
		r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr(researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasCode()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getSystem()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontext.hasValueReference()) {
			r.setRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc(String.valueOf(researchelementdefinitioncharacteristicusagecontext.getValueReference()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptn ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasStudyEffectiveDescription()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveDscrptn(String.valueOf(researchelementdefinitioncharacteristic.getStudyEffectiveDescription()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDtTimeTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasStudyEffectiveDateTimeType()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp(String.valueOf(researchelementdefinitioncharacteristic.getStudyEffectiveDateTimeType()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicparticipanteffectiveperiod = researchelementdefinitioncharacteristic.getParticipantEffectivePeriod();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectiveperiod.hasStart()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectiveperiod.hasEnd()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveperiod.getEnd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptn ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasParticipantEffectiveDescription()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn(String.valueOf(researchelementdefinitioncharacteristic.getParticipantEffectiveDescription()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectiveduration = researchelementdefinitioncharacteristic.getParticipantEffectiveDuration();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasValue()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator = researchelementdefinitioncharacteristicparticipanteffectiveduration.getComparator();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr(researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasCode()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectiveduration = researchelementdefinitioncharacteristic.getStudyEffectiveDuration();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasValue()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveDurationVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivedurationcomparator = researchelementdefinitioncharacteristicstudyeffectiveduration.getComparator();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr(researchelementdefinitioncharacteristicstudyeffectivedurationcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasCode()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveDurationCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveDurationSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivegroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasure researchelementdefinitioncharacteristicstudyeffectivegroupmeasure = researchelementdefinitioncharacteristic.getStudyEffectiveGroupMeasure();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr(researchelementdefinitioncharacteristicstudyeffectivegroupmeasure.toCode());

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectivetimefromstart = researchelementdefinitioncharacteristic.getStudyEffectiveTimeFromStart();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasValue()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator = researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getComparator();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasCode()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicstudyeffectiveperiod = researchelementdefinitioncharacteristic.getStudyEffectivePeriod();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectiveperiod.hasStart()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctivePrdStrt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectiveperiod.hasEnd()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctivePrdEnd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveperiod.getEnd()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing researchelementdefinitioncharacteristicparticipanteffectivetiming = researchelementdefinitioncharacteristic.getParticipantEffectiveTiming();

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicparticipanteffectivetimingcode = researchelementdefinitioncharacteristicparticipanteffectivetiming.getCode();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcode.hasText()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcode.getText()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding = researchelementdefinitioncharacteristicparticipanteffectivetimingcode.getCodingFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasCode()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat = researchelementdefinitioncharacteristicparticipanteffectivetiming.getRepeat();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasOffset()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getOffset()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasCount()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getCount()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasFrequency()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getFrequency()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasPeriod()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getPeriod()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasDuration()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDuration()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getBoundsDuration();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasValue()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getComparator();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasCode()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getBoundsRange();

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange.getLow();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasValue()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getComparator();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasCode()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange.getHigh();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasValue()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getComparator();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasCode()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getBoundsPeriod();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.hasStart()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.hasEnd()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.getEnd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasPeriodMax()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getPeriodMax()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasDurationMax()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDurationMax()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasCountMax()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getCountMax()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasFrequencyMax()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getFrequencyMax()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDurationUnit();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit.toCode());

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getPeriodUnit();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdUnt(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit.toCode());

		/******************** researchelementdefinitioncharacteristicstudyeffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing researchelementdefinitioncharacteristicstudyeffectivetiming = researchelementdefinitioncharacteristic.getStudyEffectiveTiming();

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicstudyeffectivetimingcode = researchelementdefinitioncharacteristicstudyeffectivetiming.getCode();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcode.hasText()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcode.getText()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding = researchelementdefinitioncharacteristicstudyeffectivetimingcode.getCodingFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasCode()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent researchelementdefinitioncharacteristicstudyeffectivetimingrepeat = researchelementdefinitioncharacteristicstudyeffectivetiming.getRepeat();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Off ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasOffset()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getOffset()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasCount()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getCount()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasFrequency()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getFrequency()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasPeriod()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getPeriod()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasDuration()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDuration()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getBoundsDuration();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasValue()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getComparator();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasCode()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getBoundsRange();

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange.getLow();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasValue()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getComparator();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasCode()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange.getHigh();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasValue()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getComparator();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasCode()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getBoundsPeriod();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.hasStart()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.getStart()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.hasEnd()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.getEnd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasPeriodMax()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getPeriodMax()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasDurationMax()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDurationMax()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasCountMax()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getCountMax()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasFrequencyMax()) {
			r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getFrequencyMax()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDurationUnit();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit.toCode());

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getPeriodUnit();
		r.setRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdUnt(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit.toCode());

		/******************** RsrchElmntDfn_Crctrstc_Exclude ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasExclude()) {
			r.setRsrchElmntDfnCrctrstcExclude(String.valueOf(researchelementdefinitioncharacteristic.getExclude()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasure researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure = researchelementdefinitioncharacteristic.getParticipantEffectiveGroupMeasure();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr(researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure.toCode());

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasParticipantEffectiveDateTimeType()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp(String.valueOf(researchelementdefinitioncharacteristic.getParticipantEffectiveDateTimeType()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectivetimefromstart = researchelementdefinitioncharacteristic.getParticipantEffectiveTimeFromStart();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasValue()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getValue()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getComparator();
		r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator.toCode());

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasCode()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasUnit()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getUnit()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getSystem()));
		}
		/******************** researchelementdefinitioncharacteristicunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicunitofmeasure = researchelementdefinitioncharacteristic.getUnitOfMeasure();

		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasure.hasText()) {
			r.setRsrchElmntDfnCrctrstcUntOfMsrTxt(String.valueOf(researchelementdefinitioncharacteristicunitofmeasure.getText()));
		}
		/******************** researchelementdefinitioncharacteristicunitofmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicunitofmeasurecoding = researchelementdefinitioncharacteristicunitofmeasure.getCodingFirstRep();

		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasVersion()) {
			r.setRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasDisplay()) {
			r.setRsrchElmntDfnCrctrstcUntOfMsrCdgDsply(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasCode()) {
			r.setRsrchElmntDfnCrctrstcUntOfMsrCdgCd(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getCode()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasUserSelected()) {
			r.setRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasSystem()) {
			r.setRsrchElmntDfnCrctrstcUntOfMsrCdgSys(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getSystem()));
		}
		/******************** researchelementdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext researchelementdefinitionusecontext = researchelementdefinition.getUseContextFirstRep();

		/******************** researchelementdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionusecontextcode = researchelementdefinitionusecontext.getCode();

		/******************** RsrchElmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(researchelementdefinitionusecontextcode.hasVersion()) {
			r.setRsrchElmntDfnUseCntxtCdVrsn(String.valueOf(researchelementdefinitionusecontextcode.getVersion()));
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(researchelementdefinitionusecontextcode.hasDisplay()) {
			r.setRsrchElmntDfnUseCntxtCdDsply(String.valueOf(researchelementdefinitionusecontextcode.getDisplay()));
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(researchelementdefinitionusecontextcode.hasUserSelected()) {
			r.setRsrchElmntDfnUseCntxtCdUsrSltd(String.valueOf(researchelementdefinitionusecontextcode.getUserSelected()));
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(researchelementdefinitionusecontextcode.hasSystem()) {
			r.setRsrchElmntDfnUseCntxtCdSys(String.valueOf(researchelementdefinitionusecontextcode.getSystem()));
		}
		/******************** researchelementdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionusecontextvaluecodeableconcept = researchelementdefinitionusecontext.getValueCodeableConcept();

		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconcept.hasText()) {
			r.setRsrchElmntDfnUseCntxtVlCdbleCncptTxt(String.valueOf(researchelementdefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** researchelementdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionusecontextvaluecodeableconceptcoding = researchelementdefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			r.setRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			r.setRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			r.setRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			r.setRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			r.setRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** researchelementdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluequantity = researchelementdefinitionusecontext.getValueQuantity();

		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(researchelementdefinitionusecontextvaluequantity.hasValue()) {
			r.setRsrchElmntDfnUseCntxtVlQntyVl(String.valueOf(researchelementdefinitionusecontextvaluequantity.getValue()));
		}
		/******************** researchelementdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitionusecontextvaluequantitycomparator = researchelementdefinitionusecontextvaluequantity.getComparator();
		r.setRsrchElmntDfnUseCntxtVlQntyCmprtr(researchelementdefinitionusecontextvaluequantitycomparator.toCode());

		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluequantity.hasCode()) {
			r.setRsrchElmntDfnUseCntxtVlQntyCd(String.valueOf(researchelementdefinitionusecontextvaluequantity.getCode()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(researchelementdefinitionusecontextvaluequantity.hasUnit()) {
			r.setRsrchElmntDfnUseCntxtVlQntyUnt(String.valueOf(researchelementdefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(researchelementdefinitionusecontextvaluequantity.hasSystem()) {
			r.setRsrchElmntDfnUseCntxtVlQntySys(String.valueOf(researchelementdefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** researchelementdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitionusecontextvaluerange = researchelementdefinitionusecontext.getValueRange();

		/******************** researchelementdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluerangelow = researchelementdefinitionusecontextvaluerange.getLow();

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangelow.hasValue()) {
			r.setRsrchElmntDfnUseCntxtVlRngLwVl(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** researchelementdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitionusecontextvaluerangelowcomparator = researchelementdefinitionusecontextvaluerangelow.getComparator();
		r.setRsrchElmntDfnUseCntxtVlRngLwCmprtr(researchelementdefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangelow.hasCode()) {
			r.setRsrchElmntDfnUseCntxtVlRngLwCd(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangelow.hasUnit()) {
			r.setRsrchElmntDfnUseCntxtVlRngLwUnt(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangelow.hasSystem()) {
			r.setRsrchElmntDfnUseCntxtVlRngLwSys(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** researchelementdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluerangehigh = researchelementdefinitionusecontextvaluerange.getHigh();

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangehigh.hasValue()) {
			r.setRsrchElmntDfnUseCntxtVlRngHiVl(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** researchelementdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitionusecontextvaluerangehighcomparator = researchelementdefinitionusecontextvaluerangehigh.getComparator();
		r.setRsrchElmntDfnUseCntxtVlRngHiCmprtr(researchelementdefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangehigh.hasCode()) {
			r.setRsrchElmntDfnUseCntxtVlRngHiCd(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangehigh.hasUnit()) {
			r.setRsrchElmntDfnUseCntxtVlRngHiUnt(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitionusecontextvaluerangehigh.hasSystem()) {
			r.setRsrchElmntDfnUseCntxtVlRngHiSys(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(researchelementdefinitionusecontext.hasValueReference()) {
			r.setRsrchElmntDfnUseCntxtVlRfrnc(String.valueOf(researchelementdefinitionusecontext.getValueReference()));
		}
		/******************** researchelementdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionjurisdiction = researchelementdefinition.getJurisdictionFirstRep();

		/******************** RsrchElmntDfn_Jrsdctn_Txt ********************************************************************************/
		if(researchelementdefinitionjurisdiction.hasText()) {
			r.setRsrchElmntDfnJrsdctnTxt(String.valueOf(researchelementdefinitionjurisdiction.getText()));
		}
		/******************** researchelementdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionjurisdictioncoding = researchelementdefinitionjurisdiction.getCodingFirstRep();

		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionjurisdictioncoding.hasVersion()) {
			r.setRsrchElmntDfnJrsdctnCdgVrsn(String.valueOf(researchelementdefinitionjurisdictioncoding.getVersion()));
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionjurisdictioncoding.hasDisplay()) {
			r.setRsrchElmntDfnJrsdctnCdgDsply(String.valueOf(researchelementdefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionjurisdictioncoding.hasCode()) {
			r.setRsrchElmntDfnJrsdctnCdgCd(String.valueOf(researchelementdefinitionjurisdictioncoding.getCode()));
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionjurisdictioncoding.hasUserSelected()) {
			r.setRsrchElmntDfnJrsdctnCdgUsrSltd(String.valueOf(researchelementdefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionjurisdictioncoding.hasSystem()) {
			r.setRsrchElmntDfnJrsdctnCdgSys(String.valueOf(researchelementdefinitionjurisdictioncoding.getSystem()));
		}
		return r;
	}
}
