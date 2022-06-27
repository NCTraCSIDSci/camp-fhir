package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PlanDefinition;
public class PlanDefinitionBidirectionalConversion 
{
	public PlanDefinition PlanDefinitions(org.hl7.fhir.r4.model.PlanDefinition plandefinition) throws ParseException
	{
		 main.java.com.campfhir.model.PlanDefinition p = new  main.java.com.campfhir.model.PlanDefinition();

		/******************** id ********************************************************************************/
		plandefinition.setId(p.getId());

		/******************** PlnDfn_Nm ********************************************************************************/
		if(plandefinition.hasName()) {
			p.setPlnDfnNm(String.valueOf(plandefinition.getName()));
		}
		/******************** plandefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiontype = plandefinition.getType();

		/******************** PlnDfn_Typ_Txt ********************************************************************************/
		if(plandefinitiontype.hasText()) {
			p.setPlnDfnTypTxt(String.valueOf(plandefinitiontype.getText()));
		}
		/******************** plandefinitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiontypecoding = plandefinitiontype.getCodingFirstRep();

		/******************** PlnDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiontypecoding.hasVersion()) {
			p.setPlnDfnTypCdgVrsn(String.valueOf(plandefinitiontypecoding.getVersion()));
		}
		/******************** PlnDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(plandefinitiontypecoding.hasDisplay()) {
			p.setPlnDfnTypCdgDsply(String.valueOf(plandefinitiontypecoding.getDisplay()));
		}
		/******************** PlnDfn_Typ_Cdg_Cd ********************************************************************************/
		if(plandefinitiontypecoding.hasCode()) {
			p.setPlnDfnTypCdgCd(String.valueOf(plandefinitiontypecoding.getCode()));
		}
		/******************** PlnDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiontypecoding.hasUserSelected()) {
			p.setPlnDfnTypCdgUsrSltd(String.valueOf(plandefinitiontypecoding.getUserSelected()));
		}
		/******************** PlnDfn_Typ_Cdg_Sys ********************************************************************************/
		if(plandefinitiontypecoding.hasSystem()) {
			p.setPlnDfnTypCdgSys(String.valueOf(plandefinitiontypecoding.getSystem()));
		}
		/******************** PlnDfn_Dt ********************************************************************************/
		if(plandefinition.hasDate()) {
			p.setPlnDfnDt(String.valueOf(plandefinition.getDate()));
		}
		/******************** PlnDfn_Vrsn ********************************************************************************/
		if(plandefinition.hasVersion()) {
			p.setPlnDfnVrsn(String.valueOf(plandefinition.getVersion()));
		}
		/******************** plandefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitionreviewer = plandefinition.getReviewerFirstRep();

		/******************** PlnDfn_Rviewr_Nm ********************************************************************************/
		if(plandefinitionreviewer.hasName()) {
			p.setPlnDfnRviewrNm(String.valueOf(plandefinitionreviewer.getName()));
		}
		/******************** plandefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitionreviewertelecom = plandefinitionreviewer.getTelecomFirstRep();

		/******************** PlnDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(plandefinitionreviewertelecom.hasValue()) {
			p.setPlnDfnRviewrTlcmVl(String.valueOf(plandefinitionreviewertelecom.getValue()));
		}
		/******************** plandefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionreviewertelecomperiod = plandefinitionreviewertelecom.getPeriod();

		/******************** PlnDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitionreviewertelecomperiod.hasStart()) {
			p.setPlnDfnRviewrTlcmPrdStrt(String.valueOf(plandefinitionreviewertelecomperiod.getStart()));
		}
		/******************** PlnDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitionreviewertelecomperiod.hasEnd()) {
			p.setPlnDfnRviewrTlcmPrdEnd(String.valueOf(plandefinitionreviewertelecomperiod.getEnd()));
		}
		/******************** plandefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitionreviewertelecomsystem = plandefinitionreviewertelecom.getSystem();
		p.setPlnDfnRviewrTlcmSys(plandefinitionreviewertelecomsystem.toCode());

		/******************** plandefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitionreviewertelecomuse = plandefinitionreviewertelecom.getUse();
		p.setPlnDfnRviewrTlcmUse(plandefinitionreviewertelecomuse.toCode());

		/******************** PlnDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(plandefinitionreviewertelecom.hasRank()) {
			p.setPlnDfnRviewrTlcmRnk(String.valueOf(plandefinitionreviewertelecom.getRank()));
		}
		/******************** plandefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionsubjectcodeableconcept = plandefinition.getSubjectCodeableConcept();

		/******************** PlnDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionsubjectcodeableconcept.hasText()) {
			p.setPlnDfnSbjctCdbleCncptTxt(String.valueOf(plandefinitionsubjectcodeableconcept.getText()));
		}
		/******************** plandefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionsubjectcodeableconceptcoding = plandefinitionsubjectcodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcoding.hasVersion()) {
			p.setPlnDfnSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcoding.hasCode()) {
			p.setPlnDfnSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionsubjectcodeableconceptcoding.hasSystem()) {
			p.setPlnDfnSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** PlnDfn_SbjctRfrnc ********************************************************************************/
		if(plandefinition.hasSubjectReference()) {
			p.setPlnDfnSbjctRfrnc(String.valueOf(plandefinition.getSubjectReference()));
		}
		/******************** plandefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitionendorser = plandefinition.getEndorserFirstRep();

		/******************** PlnDfn_Endsr_Nm ********************************************************************************/
		if(plandefinitionendorser.hasName()) {
			p.setPlnDfnEndsrNm(String.valueOf(plandefinitionendorser.getName()));
		}
		/******************** plandefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitionendorsertelecom = plandefinitionendorser.getTelecomFirstRep();

		/******************** PlnDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(plandefinitionendorsertelecom.hasValue()) {
			p.setPlnDfnEndsrTlcmVl(String.valueOf(plandefinitionendorsertelecom.getValue()));
		}
		/******************** plandefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionendorsertelecomperiod = plandefinitionendorsertelecom.getPeriod();

		/******************** PlnDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitionendorsertelecomperiod.hasStart()) {
			p.setPlnDfnEndsrTlcmPrdStrt(String.valueOf(plandefinitionendorsertelecomperiod.getStart()));
		}
		/******************** PlnDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitionendorsertelecomperiod.hasEnd()) {
			p.setPlnDfnEndsrTlcmPrdEnd(String.valueOf(plandefinitionendorsertelecomperiod.getEnd()));
		}
		/******************** plandefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitionendorsertelecomsystem = plandefinitionendorsertelecom.getSystem();
		p.setPlnDfnEndsrTlcmSys(plandefinitionendorsertelecomsystem.toCode());

		/******************** plandefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitionendorsertelecomuse = plandefinitionendorsertelecom.getUse();
		p.setPlnDfnEndsrTlcmUse(plandefinitionendorsertelecomuse.toCode());

		/******************** PlnDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(plandefinitionendorsertelecom.hasRank()) {
			p.setPlnDfnEndsrTlcmRnk(String.valueOf(plandefinitionendorsertelecom.getRank()));
		}
		/******************** PlnDfn_Ttl ********************************************************************************/
		if(plandefinition.hasTitle()) {
			p.setPlnDfnTtl(String.valueOf(plandefinition.getTitle()));
		}
		/******************** PlnDfn_Subtitle ********************************************************************************/
		if(plandefinition.hasSubtitle()) {
			p.setPlnDfnSubtitle(String.valueOf(plandefinition.getSubtitle()));
		}
		/******************** plandefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus plandefinitionstatus = plandefinition.getStatus();
		p.setPlnDfnSts(plandefinitionstatus.toCode());

		/******************** PlnDfn_Dscrptn ********************************************************************************/
		if(plandefinition.hasDescription()) {
			p.setPlnDfnDscrptn(String.valueOf(plandefinition.getDescription()));
		}
		/******************** PlnDfn_Url ********************************************************************************/
		if(plandefinition.hasUrl()) {
			p.setPlnDfnUrl(String.valueOf(plandefinition.getUrl()));
		}
		/******************** PlnDfn_Pblshr ********************************************************************************/
		if(plandefinition.hasPublisher()) {
			p.setPlnDfnPblshr(String.valueOf(plandefinition.getPublisher()));
		}
		/******************** PlnDfn_Exprmtl ********************************************************************************/
		if(plandefinition.hasExperimental()) {
			p.setPlnDfnExprmtl(String.valueOf(plandefinition.getExperimental()));
		}
		/******************** plandefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioneffectiveperiod = plandefinition.getEffectivePeriod();

		/******************** PlnDfn_EfctivePrd_Strt ********************************************************************************/
		if(plandefinitioneffectiveperiod.hasStart()) {
			p.setPlnDfnEfctivePrdStrt(String.valueOf(plandefinitioneffectiveperiod.getStart()));
		}
		/******************** PlnDfn_EfctivePrd_End ********************************************************************************/
		if(plandefinitioneffectiveperiod.hasEnd()) {
			p.setPlnDfnEfctivePrdEnd(String.valueOf(plandefinitioneffectiveperiod.getEnd()));
		}
		/******************** plandefinitiongoal ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent plandefinitiongoal = plandefinition.getGoalFirstRep();

		/******************** plandefinitiongoalpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalpriority = plandefinitiongoal.getPriority();

		/******************** PlnDfn_Goal_Priority_Txt ********************************************************************************/
		if(plandefinitiongoalpriority.hasText()) {
			p.setPlnDfnGoalPriorityTxt(String.valueOf(plandefinitiongoalpriority.getText()));
		}
		/******************** plandefinitiongoalprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoalprioritycoding = plandefinitiongoalpriority.getCodingFirstRep();

		/******************** PlnDfn_Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoalprioritycoding.hasVersion()) {
			p.setPlnDfnGoalPriorityCdgVrsn(String.valueOf(plandefinitiongoalprioritycoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoalprioritycoding.hasDisplay()) {
			p.setPlnDfnGoalPriorityCdgDsply(String.valueOf(plandefinitiongoalprioritycoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Priority_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoalprioritycoding.hasCode()) {
			p.setPlnDfnGoalPriorityCdgCd(String.valueOf(plandefinitiongoalprioritycoding.getCode()));
		}
		/******************** PlnDfn_Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoalprioritycoding.hasUserSelected()) {
			p.setPlnDfnGoalPriorityCdgUsrSltd(String.valueOf(plandefinitiongoalprioritycoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Priority_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoalprioritycoding.hasSystem()) {
			p.setPlnDfnGoalPriorityCdgSys(String.valueOf(plandefinitiongoalprioritycoding.getSystem()));
		}
		/******************** plandefinitiongoaldescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaldescription = plandefinitiongoal.getDescription();

		/******************** PlnDfn_Goal_Dscrptn_Txt ********************************************************************************/
		if(plandefinitiongoaldescription.hasText()) {
			p.setPlnDfnGoalDscrptnTxt(String.valueOf(plandefinitiongoaldescription.getText()));
		}
		/******************** plandefinitiongoaldescriptioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaldescriptioncoding = plandefinitiongoaldescription.getCodingFirstRep();

		/******************** PlnDfn_Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoaldescriptioncoding.hasVersion()) {
			p.setPlnDfnGoalDscrptnCdgVrsn(String.valueOf(plandefinitiongoaldescriptioncoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoaldescriptioncoding.hasDisplay()) {
			p.setPlnDfnGoalDscrptnCdgDsply(String.valueOf(plandefinitiongoaldescriptioncoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoaldescriptioncoding.hasCode()) {
			p.setPlnDfnGoalDscrptnCdgCd(String.valueOf(plandefinitiongoaldescriptioncoding.getCode()));
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoaldescriptioncoding.hasUserSelected()) {
			p.setPlnDfnGoalDscrptnCdgUsrSltd(String.valueOf(plandefinitiongoaldescriptioncoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoaldescriptioncoding.hasSystem()) {
			p.setPlnDfnGoalDscrptnCdgSys(String.valueOf(plandefinitiongoaldescriptioncoding.getSystem()));
		}
		/******************** plandefinitiongoalstart ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalstart = plandefinitiongoal.getStart();

		/******************** PlnDfn_Goal_Strt_Txt ********************************************************************************/
		if(plandefinitiongoalstart.hasText()) {
			p.setPlnDfnGoalStrtTxt(String.valueOf(plandefinitiongoalstart.getText()));
		}
		/******************** plandefinitiongoalstartcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoalstartcoding = plandefinitiongoalstart.getCodingFirstRep();

		/******************** PlnDfn_Goal_Strt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoalstartcoding.hasVersion()) {
			p.setPlnDfnGoalStrtCdgVrsn(String.valueOf(plandefinitiongoalstartcoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Strt_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoalstartcoding.hasDisplay()) {
			p.setPlnDfnGoalStrtCdgDsply(String.valueOf(plandefinitiongoalstartcoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Strt_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoalstartcoding.hasCode()) {
			p.setPlnDfnGoalStrtCdgCd(String.valueOf(plandefinitiongoalstartcoding.getCode()));
		}
		/******************** PlnDfn_Goal_Strt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoalstartcoding.hasUserSelected()) {
			p.setPlnDfnGoalStrtCdgUsrSltd(String.valueOf(plandefinitiongoalstartcoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Strt_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoalstartcoding.hasSystem()) {
			p.setPlnDfnGoalStrtCdgSys(String.valueOf(plandefinitiongoalstartcoding.getSystem()));
		}
		/******************** plandefinitiongoaldocumentation ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact plandefinitiongoaldocumentation = plandefinitiongoal.getDocumentationFirstRep();

		/******************** PlnDfn_Goal_Docation_Rsrc ********************************************************************************/
		if(plandefinitiongoaldocumentation.hasResource()) {
			p.setPlnDfnGoalDocationRsrc(String.valueOf(plandefinitiongoaldocumentation.getResource()));
		}
		/******************** plandefinitiongoaldocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType plandefinitiongoaldocumentationtype = plandefinitiongoaldocumentation.getType();
		p.setPlnDfnGoalDocationTyp(plandefinitiongoaldocumentationtype.toCode());

		/******************** plandefinitiongoaldocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitiongoaldocumentationdocument = plandefinitiongoaldocumentation.getDocument();

		/******************** PlnDfn_Goal_Docation_Doc_Sz ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasSize()) {
			p.setPlnDfnGoalDocationDocSz(String.valueOf(plandefinitiongoaldocumentationdocument.getSize()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Lnguage ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasLanguage()) {
			p.setPlnDfnGoalDocationDocLnguage(String.valueOf(plandefinitiongoaldocumentationdocument.getLanguage()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_CntntTyp ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasContentType()) {
			p.setPlnDfnGoalDocationDocCntntTyp(String.valueOf(plandefinitiongoaldocumentationdocument.getContentType()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Ttl ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasTitle()) {
			p.setPlnDfnGoalDocationDocTtl(String.valueOf(plandefinitiongoaldocumentationdocument.getTitle()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Url ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasUrl()) {
			p.setPlnDfnGoalDocationDocUrl(String.valueOf(plandefinitiongoaldocumentationdocument.getUrl()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Data ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasData()) {
			p.setPlnDfnGoalDocationDocData(String.valueOf(plandefinitiongoaldocumentationdocument.getData()));
		}

		/******************** PlnDfn_Goal_Docation_Doc_Hash ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasHash()) {
			p.setPlnDfnGoalDocationDocHash(String.valueOf(plandefinitiongoaldocumentationdocument.getHash()));
		}

		/******************** PlnDfn_Goal_Docation_Doc_Creation ********************************************************************************/
		if(plandefinitiongoaldocumentationdocument.hasCreation()) {
			p.setPlnDfnGoalDocationDocCreation(String.valueOf(plandefinitiongoaldocumentationdocument.getCreation()));
		}
		/******************** PlnDfn_Goal_Docation_Url ********************************************************************************/
		if(plandefinitiongoaldocumentation.hasUrl()) {
			p.setPlnDfnGoalDocationUrl(String.valueOf(plandefinitiongoaldocumentation.getUrl()));
		}
		/******************** PlnDfn_Goal_Docation_Lbl ********************************************************************************/
		if(plandefinitiongoaldocumentation.hasLabel()) {
			p.setPlnDfnGoalDocationLbl(String.valueOf(plandefinitiongoaldocumentation.getLabel()));
		}
		/******************** PlnDfn_Goal_Docation_Citation ********************************************************************************/
		if(plandefinitiongoaldocumentation.hasCitation()) {
			p.setPlnDfnGoalDocationCitation(String.valueOf(plandefinitiongoaldocumentation.getCitation()));
		}
		/******************** plandefinitiongoalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalcategory = plandefinitiongoal.getCategory();

		/******************** PlnDfn_Goal_Ctgry_Txt ********************************************************************************/
		if(plandefinitiongoalcategory.hasText()) {
			p.setPlnDfnGoalCtgryTxt(String.valueOf(plandefinitiongoalcategory.getText()));
		}
		/******************** plandefinitiongoalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoalcategorycoding = plandefinitiongoalcategory.getCodingFirstRep();

		/******************** PlnDfn_Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoalcategorycoding.hasVersion()) {
			p.setPlnDfnGoalCtgryCdgVrsn(String.valueOf(plandefinitiongoalcategorycoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoalcategorycoding.hasDisplay()) {
			p.setPlnDfnGoalCtgryCdgDsply(String.valueOf(plandefinitiongoalcategorycoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoalcategorycoding.hasCode()) {
			p.setPlnDfnGoalCtgryCdgCd(String.valueOf(plandefinitiongoalcategorycoding.getCode()));
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoalcategorycoding.hasUserSelected()) {
			p.setPlnDfnGoalCtgryCdgUsrSltd(String.valueOf(plandefinitiongoalcategorycoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoalcategorycoding.hasSystem()) {
			p.setPlnDfnGoalCtgryCdgSys(String.valueOf(plandefinitiongoalcategorycoding.getSystem()));
		}
		/******************** plandefinitiongoaladdresses ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaladdresses = plandefinitiongoal.getAddressesFirstRep();

		/******************** PlnDfn_Goal_Addres_Txt ********************************************************************************/
		if(plandefinitiongoaladdresses.hasText()) {
			p.setPlnDfnGoalAddresTxt(String.valueOf(plandefinitiongoaladdresses.getText()));
		}
		/******************** plandefinitiongoaladdressescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaladdressescoding = plandefinitiongoaladdresses.getCodingFirstRep();

		/******************** PlnDfn_Goal_Addres_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoaladdressescoding.hasVersion()) {
			p.setPlnDfnGoalAddresCdgVrsn(String.valueOf(plandefinitiongoaladdressescoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoaladdressescoding.hasDisplay()) {
			p.setPlnDfnGoalAddresCdgDsply(String.valueOf(plandefinitiongoaladdressescoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoaladdressescoding.hasCode()) {
			p.setPlnDfnGoalAddresCdgCd(String.valueOf(plandefinitiongoaladdressescoding.getCode()));
		}
		/******************** PlnDfn_Goal_Addres_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoaladdressescoding.hasUserSelected()) {
			p.setPlnDfnGoalAddresCdgUsrSltd(String.valueOf(plandefinitiongoaladdressescoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoaladdressescoding.hasSystem()) {
			p.setPlnDfnGoalAddresCdgSys(String.valueOf(plandefinitiongoaladdressescoding.getSystem()));
		}
		/******************** plandefinitiongoaltarget ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalTargetComponent plandefinitiongoaltarget = plandefinitiongoal.getTargetFirstRep();

		/******************** plandefinitiongoaltargetdetailcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaltargetdetailcodeableconcept = plandefinitiongoaltarget.getDetailCodeableConcept();

		/******************** PlnDfn_Goal_Target_DtlCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitiongoaltargetdetailcodeableconcept.hasText()) {
			p.setPlnDfnGoalTarDtlCdbleCncptTxt(String.valueOf(plandefinitiongoaltargetdetailcodeableconcept.getText()));
		}
		/******************** plandefinitiongoaltargetdetailcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaltargetdetailcodeableconceptcoding = plandefinitiongoaltargetdetailcodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_Goal_Target_DtlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoaltargetdetailcodeableconceptcoding.hasVersion()) {
			p.setPlnDfnGoalTarDtlCdbleCncptCdgVrsn(String.valueOf(plandefinitiongoaltargetdetailcodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Target_DtlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoaltargetdetailcodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnGoalTarDtlCdbleCncptCdgDsply(String.valueOf(plandefinitiongoaltargetdetailcodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Target_DtlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoaltargetdetailcodeableconceptcoding.hasCode()) {
			p.setPlnDfnGoalTarDtlCdbleCncptCdgCd(String.valueOf(plandefinitiongoaltargetdetailcodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_Goal_Target_DtlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoaltargetdetailcodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnGoalTarDtlCdbleCncptCdgUsrSltd(String.valueOf(plandefinitiongoaltargetdetailcodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Target_DtlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoaltargetdetailcodeableconceptcoding.hasSystem()) {
			p.setPlnDfnGoalTarDtlCdbleCncptCdgSys(String.valueOf(plandefinitiongoaltargetdetailcodeableconceptcoding.getSystem()));
		}
		/******************** plandefinitiongoaltargetdue ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitiongoaltargetdue = plandefinitiongoaltarget.getDue();

		/******************** PlnDfn_Goal_Target_Due_Vl ********************************************************************************/
		if(plandefinitiongoaltargetdue.hasValue()) {
			p.setPlnDfnGoalTarDueVl(String.valueOf(plandefinitiongoaltargetdue.getValue()));
		}
		/******************** plandefinitiongoaltargetduecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitiongoaltargetduecomparator = plandefinitiongoaltargetdue.getComparator();
		p.setPlnDfnGoalTarDueCmprtr(plandefinitiongoaltargetduecomparator.toCode());

		/******************** PlnDfn_Goal_Target_Due_Cd ********************************************************************************/
		if(plandefinitiongoaltargetdue.hasCode()) {
			p.setPlnDfnGoalTarDueCd(String.valueOf(plandefinitiongoaltargetdue.getCode()));
		}
		/******************** PlnDfn_Goal_Target_Due_Unt ********************************************************************************/
		if(plandefinitiongoaltargetdue.hasUnit()) {
			p.setPlnDfnGoalTarDueUnt(String.valueOf(plandefinitiongoaltargetdue.getUnit()));
		}
		/******************** PlnDfn_Goal_Target_Due_Sys ********************************************************************************/
		if(plandefinitiongoaltargetdue.hasSystem()) {
			p.setPlnDfnGoalTarDueSys(String.valueOf(plandefinitiongoaltargetdue.getSystem()));
		}
		/******************** plandefinitiongoaltargetdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitiongoaltargetdetailquantity = plandefinitiongoaltarget.getDetailQuantity();

		/******************** PlnDfn_Goal_Target_DtlQnty_Vl ********************************************************************************/
		if(plandefinitiongoaltargetdetailquantity.hasValue()) {
			p.setPlnDfnGoalTarDtlQntyVl(String.valueOf(plandefinitiongoaltargetdetailquantity.getValue()));
		}
		/******************** plandefinitiongoaltargetdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitiongoaltargetdetailquantitycomparator = plandefinitiongoaltargetdetailquantity.getComparator();
		p.setPlnDfnGoalTarDtlQntyCmprtr(plandefinitiongoaltargetdetailquantitycomparator.toCode());

		/******************** PlnDfn_Goal_Target_DtlQnty_Cd ********************************************************************************/
		if(plandefinitiongoaltargetdetailquantity.hasCode()) {
			p.setPlnDfnGoalTarDtlQntyCd(String.valueOf(plandefinitiongoaltargetdetailquantity.getCode()));
		}
		/******************** PlnDfn_Goal_Target_DtlQnty_Unt ********************************************************************************/
		if(plandefinitiongoaltargetdetailquantity.hasUnit()) {
			p.setPlnDfnGoalTarDtlQntyUnt(String.valueOf(plandefinitiongoaltargetdetailquantity.getUnit()));
		}
		/******************** PlnDfn_Goal_Target_DtlQnty_Sys ********************************************************************************/
		if(plandefinitiongoaltargetdetailquantity.hasSystem()) {
			p.setPlnDfnGoalTarDtlQntySys(String.valueOf(plandefinitiongoaltargetdetailquantity.getSystem()));
		}
		/******************** plandefinitiongoaltargetdetailrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitiongoaltargetdetailrange = plandefinitiongoaltarget.getDetailRange();

		/******************** plandefinitiongoaltargetdetailrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitiongoaltargetdetailrangelow = plandefinitiongoaltargetdetailrange.getLow();

		/******************** PlnDfn_Goal_Target_DtlRng_Lw_Vl ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangelow.hasValue()) {
			p.setPlnDfnGoalTarDtlRngLwVl(String.valueOf(plandefinitiongoaltargetdetailrangelow.getValue()));
		}
		/******************** plandefinitiongoaltargetdetailrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitiongoaltargetdetailrangelowcomparator = plandefinitiongoaltargetdetailrangelow.getComparator();
		p.setPlnDfnGoalTarDtlRngLwCmprtr(plandefinitiongoaltargetdetailrangelowcomparator.toCode());

		/******************** PlnDfn_Goal_Target_DtlRng_Lw_Cd ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangelow.hasCode()) {
			p.setPlnDfnGoalTarDtlRngLwCd(String.valueOf(plandefinitiongoaltargetdetailrangelow.getCode()));
		}
		/******************** PlnDfn_Goal_Target_DtlRng_Lw_Unt ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangelow.hasUnit()) {
			p.setPlnDfnGoalTarDtlRngLwUnt(String.valueOf(plandefinitiongoaltargetdetailrangelow.getUnit()));
		}
		/******************** PlnDfn_Goal_Target_DtlRng_Lw_Sys ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangelow.hasSystem()) {
			p.setPlnDfnGoalTarDtlRngLwSys(String.valueOf(plandefinitiongoaltargetdetailrangelow.getSystem()));
		}
		/******************** plandefinitiongoaltargetdetailrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitiongoaltargetdetailrangehigh = plandefinitiongoaltargetdetailrange.getHigh();

		/******************** PlnDfn_Goal_Target_DtlRng_Hi_Vl ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangehigh.hasValue()) {
			p.setPlnDfnGoalTarDtlRngHiVl(String.valueOf(plandefinitiongoaltargetdetailrangehigh.getValue()));
		}
		/******************** plandefinitiongoaltargetdetailrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitiongoaltargetdetailrangehighcomparator = plandefinitiongoaltargetdetailrangehigh.getComparator();
		p.setPlnDfnGoalTarDtlRngHiCmprtr(plandefinitiongoaltargetdetailrangehighcomparator.toCode());

		/******************** PlnDfn_Goal_Target_DtlRng_Hi_Cd ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangehigh.hasCode()) {
			p.setPlnDfnGoalTarDtlRngHiCd(String.valueOf(plandefinitiongoaltargetdetailrangehigh.getCode()));
		}
		/******************** PlnDfn_Goal_Target_DtlRng_Hi_Unt ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangehigh.hasUnit()) {
			p.setPlnDfnGoalTarDtlRngHiUnt(String.valueOf(plandefinitiongoaltargetdetailrangehigh.getUnit()));
		}
		/******************** PlnDfn_Goal_Target_DtlRng_Hi_Sys ********************************************************************************/
		if(plandefinitiongoaltargetdetailrangehigh.hasSystem()) {
			p.setPlnDfnGoalTarDtlRngHiSys(String.valueOf(plandefinitiongoaltargetdetailrangehigh.getSystem()));
		}
		/******************** plandefinitiongoaltargetmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaltargetmeasure = plandefinitiongoaltarget.getMeasure();

		/******************** PlnDfn_Goal_Target_Msr_Txt ********************************************************************************/
		if(plandefinitiongoaltargetmeasure.hasText()) {
			p.setPlnDfnGoalTarMsrTxt(String.valueOf(plandefinitiongoaltargetmeasure.getText()));
		}
		/******************** plandefinitiongoaltargetmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaltargetmeasurecoding = plandefinitiongoaltargetmeasure.getCodingFirstRep();

		/******************** PlnDfn_Goal_Target_Msr_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiongoaltargetmeasurecoding.hasVersion()) {
			p.setPlnDfnGoalTarMsrCdgVrsn(String.valueOf(plandefinitiongoaltargetmeasurecoding.getVersion()));
		}
		/******************** PlnDfn_Goal_Target_Msr_Cdg_Dsply ********************************************************************************/
		if(plandefinitiongoaltargetmeasurecoding.hasDisplay()) {
			p.setPlnDfnGoalTarMsrCdgDsply(String.valueOf(plandefinitiongoaltargetmeasurecoding.getDisplay()));
		}
		/******************** PlnDfn_Goal_Target_Msr_Cdg_Cd ********************************************************************************/
		if(plandefinitiongoaltargetmeasurecoding.hasCode()) {
			p.setPlnDfnGoalTarMsrCdgCd(String.valueOf(plandefinitiongoaltargetmeasurecoding.getCode()));
		}
		/******************** PlnDfn_Goal_Target_Msr_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiongoaltargetmeasurecoding.hasUserSelected()) {
			p.setPlnDfnGoalTarMsrCdgUsrSltd(String.valueOf(plandefinitiongoaltargetmeasurecoding.getUserSelected()));
		}
		/******************** PlnDfn_Goal_Target_Msr_Cdg_Sys ********************************************************************************/
		if(plandefinitiongoaltargetmeasurecoding.hasSystem()) {
			p.setPlnDfnGoalTarMsrCdgSys(String.valueOf(plandefinitiongoaltargetmeasurecoding.getSystem()));
		}
		/******************** PlnDfn_Prpse ********************************************************************************/
		if(plandefinition.hasPurpose()) {
			p.setPlnDfnPrpse(String.valueOf(plandefinition.getPurpose()));
		}
		/******************** plandefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitionauthor = plandefinition.getAuthorFirstRep();

		/******************** PlnDfn_Athr_Nm ********************************************************************************/
		if(plandefinitionauthor.hasName()) {
			p.setPlnDfnAthrNm(String.valueOf(plandefinitionauthor.getName()));
		}
		/******************** plandefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitionauthortelecom = plandefinitionauthor.getTelecomFirstRep();

		/******************** PlnDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(plandefinitionauthortelecom.hasValue()) {
			p.setPlnDfnAthrTlcmVl(String.valueOf(plandefinitionauthortelecom.getValue()));
		}
		/******************** plandefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionauthortelecomperiod = plandefinitionauthortelecom.getPeriod();

		/******************** PlnDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitionauthortelecomperiod.hasStart()) {
			p.setPlnDfnAthrTlcmPrdStrt(String.valueOf(plandefinitionauthortelecomperiod.getStart()));
		}
		/******************** PlnDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitionauthortelecomperiod.hasEnd()) {
			p.setPlnDfnAthrTlcmPrdEnd(String.valueOf(plandefinitionauthortelecomperiod.getEnd()));
		}
		/******************** plandefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitionauthortelecomsystem = plandefinitionauthortelecom.getSystem();
		p.setPlnDfnAthrTlcmSys(plandefinitionauthortelecomsystem.toCode());

		/******************** plandefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitionauthortelecomuse = plandefinitionauthortelecom.getUse();
		p.setPlnDfnAthrTlcmUse(plandefinitionauthortelecomuse.toCode());

		/******************** PlnDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(plandefinitionauthortelecom.hasRank()) {
			p.setPlnDfnAthrTlcmRnk(String.valueOf(plandefinitionauthortelecom.getRank()));
		}
		/******************** plandefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitioncontact = plandefinition.getContactFirstRep();

		/******************** PlnDfn_Cntct_Nm ********************************************************************************/
		if(plandefinitioncontact.hasName()) {
			p.setPlnDfnCntctNm(String.valueOf(plandefinitioncontact.getName()));
		}
		/******************** plandefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitioncontacttelecom = plandefinitioncontact.getTelecomFirstRep();

		/******************** PlnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(plandefinitioncontacttelecom.hasValue()) {
			p.setPlnDfnCntctTlcmVl(String.valueOf(plandefinitioncontacttelecom.getValue()));
		}
		/******************** plandefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioncontacttelecomperiod = plandefinitioncontacttelecom.getPeriod();

		/******************** PlnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitioncontacttelecomperiod.hasStart()) {
			p.setPlnDfnCntctTlcmPrdStrt(String.valueOf(plandefinitioncontacttelecomperiod.getStart()));
		}
		/******************** PlnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitioncontacttelecomperiod.hasEnd()) {
			p.setPlnDfnCntctTlcmPrdEnd(String.valueOf(plandefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** plandefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitioncontacttelecomsystem = plandefinitioncontacttelecom.getSystem();
		p.setPlnDfnCntctTlcmSys(plandefinitioncontacttelecomsystem.toCode());

		/******************** plandefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitioncontacttelecomuse = plandefinitioncontacttelecom.getUse();
		p.setPlnDfnCntctTlcmUse(plandefinitioncontacttelecomuse.toCode());

		/******************** PlnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(plandefinitioncontacttelecom.hasRank()) {
			p.setPlnDfnCntctTlcmRnk(String.valueOf(plandefinitioncontacttelecom.getRank()));
		}
		/******************** plandefinitionaction ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent plandefinitionaction = plandefinition.getActionFirstRep();

		/******************** plandefinitionactionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.RequestPriority plandefinitionactionpriority = plandefinitionaction.getPriority();
		p.setPlnDfnActnPriority(plandefinitionactionpriority.toCode());

		/******************** plandefinitionactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontype = plandefinitionaction.getType();

		/******************** PlnDfn_Actn_Typ_Txt ********************************************************************************/
		if(plandefinitionactiontype.hasText()) {
			p.setPlnDfnActnTypTxt(String.valueOf(plandefinitionactiontype.getText()));
		}
		/******************** plandefinitionactiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontypecoding = plandefinitionactiontype.getCodingFirstRep();

		/******************** PlnDfn_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontypecoding.hasVersion()) {
			p.setPlnDfnActnTypCdgVrsn(String.valueOf(plandefinitionactiontypecoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontypecoding.hasDisplay()) {
			p.setPlnDfnActnTypCdgDsply(String.valueOf(plandefinitionactiontypecoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontypecoding.hasCode()) {
			p.setPlnDfnActnTypCdgCd(String.valueOf(plandefinitionactiontypecoding.getCode()));
		}
		/******************** PlnDfn_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontypecoding.hasUserSelected()) {
			p.setPlnDfnActnTypCdgUsrSltd(String.valueOf(plandefinitionactiontypecoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontypecoding.hasSystem()) {
			p.setPlnDfnActnTypCdgSys(String.valueOf(plandefinitionactiontypecoding.getSystem()));
		}
		/******************** PlnDfn_Actn_DfnUriTyp ********************************************************************************/
		if(plandefinitionaction.hasDefinitionUriType()) {
			p.setPlnDfnActnDfnUriTyp(String.valueOf(plandefinitionaction.getDefinitionUriType()));
		}
		/******************** PlnDfn_Actn_DfnCanonicalTyp ********************************************************************************/
		if(plandefinitionaction.hasDefinitionCanonicalType()) {
			p.setPlnDfnActnDfnCanonicalTyp(String.valueOf(plandefinitionaction.getDefinitionCanonicalType()));
		}
		/******************** plandefinitionactionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionsubjectcodeableconcept = plandefinitionaction.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconcept.hasText()) {
			p.setPlnDfnActnSbjctCdbleCncptTxt(String.valueOf(plandefinitionactionsubjectcodeableconcept.getText()));
		}
		/******************** plandefinitionactionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionsubjectcodeableconceptcoding = plandefinitionactionsubjectcodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcoding.hasVersion()) {
			p.setPlnDfnActnSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnActnSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcoding.hasCode()) {
			p.setPlnDfnActnSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnActnSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionsubjectcodeableconceptcoding.hasSystem()) {
			p.setPlnDfnActnSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactionsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** PlnDfn_Actn_SbjctRfrnc ********************************************************************************/
		if(plandefinitionaction.hasSubjectReference()) {
			p.setPlnDfnActnSbjctRfrnc(String.valueOf(plandefinitionaction.getSubjectReference()));
		}
		/******************** plandefinitionactiondynamicvalue ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent plandefinitionactiondynamicvalue = plandefinitionaction.getDynamicValueFirstRep();

		/******************** PlnDfn_Actn_DynamicVl_Path ********************************************************************************/
		if(plandefinitionactiondynamicvalue.hasPath()) {
			p.setPlnDfnActnDynamicVlPath(String.valueOf(plandefinitionactiondynamicvalue.getPath()));
		}
		/******************** plandefinitionactiondynamicvalueexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactiondynamicvalueexpression = plandefinitionactiondynamicvalue.getExpression();

		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(plandefinitionactiondynamicvalueexpression.hasName()) {
			p.setPlnDfnActnDynamicVlExprsnNm(String.valueOf(plandefinitionactiondynamicvalueexpression.getName()));
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(plandefinitionactiondynamicvalueexpression.hasReference()) {
			p.setPlnDfnActnDynamicVlExprsnRfrnc(String.valueOf(plandefinitionactiondynamicvalueexpression.getReference()));
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(plandefinitionactiondynamicvalueexpression.hasLanguage()) {
			p.setPlnDfnActnDynamicVlExprsnLnguage(String.valueOf(plandefinitionactiondynamicvalueexpression.getLanguage()));
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(plandefinitionactiondynamicvalueexpression.hasDescription()) {
			p.setPlnDfnActnDynamicVlExprsnDscrptn(String.valueOf(plandefinitionactiondynamicvalueexpression.getDescription()));
		}
		/******************** plandefinitionactionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionreason = plandefinitionaction.getReasonFirstRep();

		/******************** PlnDfn_Actn_Rsn_Txt ********************************************************************************/
		if(plandefinitionactionreason.hasText()) {
			p.setPlnDfnActnRsnTxt(String.valueOf(plandefinitionactionreason.getText()));
		}
		/******************** plandefinitionactionreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionreasoncoding = plandefinitionactionreason.getCodingFirstRep();

		/******************** PlnDfn_Actn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionreasoncoding.hasVersion()) {
			p.setPlnDfnActnRsnCdgVrsn(String.valueOf(plandefinitionactionreasoncoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionreasoncoding.hasDisplay()) {
			p.setPlnDfnActnRsnCdgDsply(String.valueOf(plandefinitionactionreasoncoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionreasoncoding.hasCode()) {
			p.setPlnDfnActnRsnCdgCd(String.valueOf(plandefinitionactionreasoncoding.getCode()));
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionreasoncoding.hasUserSelected()) {
			p.setPlnDfnActnRsnCdgUsrSltd(String.valueOf(plandefinitionactionreasoncoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionreasoncoding.hasSystem()) {
			p.setPlnDfnActnRsnCdgSys(String.valueOf(plandefinitionactionreasoncoding.getSystem()));
		}
		/******************** PlnDfn_Actn_Ttl ********************************************************************************/
		if(plandefinitionaction.hasTitle()) {
			p.setPlnDfnActnTtl(String.valueOf(plandefinitionaction.getTitle()));
		}
		/******************** PlnDfn_Actn_Dscrptn ********************************************************************************/
		if(plandefinitionaction.hasDescription()) {
			p.setPlnDfnActnDscrptn(String.valueOf(plandefinitionaction.getDescription()));
		}
		/******************** plandefinitionactiontrigger ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition plandefinitionactiontrigger = plandefinitionaction.getTriggerFirstRep();

		/******************** PlnDfn_Actn_Trgr_Nm ********************************************************************************/
		if(plandefinitionactiontrigger.hasName()) {
			p.setPlnDfnActnTrgrNm(String.valueOf(plandefinitionactiontrigger.getName()));
		}
		/******************** plandefinitionactiontriggertype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerType plandefinitionactiontriggertype = plandefinitionactiontrigger.getType();
		p.setPlnDfnActnTrgrTyp(plandefinitionactiontriggertype.toCode());

		/******************** plandefinitionactiontriggerdata ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement plandefinitionactiontriggerdata = plandefinitionactiontrigger.getDataFirstRep();

		/******************** PlnDfn_Actn_Trgr_Data_Typ ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasType()) {
			p.setPlnDfnActnTrgrDataTyp(String.valueOf(plandefinitionactiontriggerdata.getType()));
		}
		/******************** plandefinitionactiontriggerdatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontriggerdatasubjectcodeableconcept = plandefinitionactiontriggerdata.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconcept.hasText()) {
			p.setPlnDfnActnTrgrDataSbjctCdbleCncptTxt(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconcept.getText()));
		}
		/******************** plandefinitionactiontriggerdatasubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontriggerdatasubjectcodeableconceptcoding = plandefinitionactiontriggerdatasubjectcodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasVersion()) {
			p.setPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasCode()) {
			p.setPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.hasSystem()) {
			p.setPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactiontriggerdatasubjectcodeableconceptcoding.getSystem()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasSubjectReference()) {
			p.setPlnDfnActnTrgrDataSbjctRfrnc(String.valueOf(plandefinitionactiontriggerdata.getSubjectReference()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_Lmt ********************************************************************************/
		if(plandefinitionactiontriggerdata.hasLimit()) {
			p.setPlnDfnActnTrgrDataLmt(String.valueOf(plandefinitionactiontriggerdata.getLimit()));
		}
		/******************** plandefinitionactiontriggerdatasort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent plandefinitionactiontriggerdatasort = plandefinitionactiontriggerdata.getSortFirstRep();

		/******************** PlnDfn_Actn_Trgr_Data_Sort_Path ********************************************************************************/
		if(plandefinitionactiontriggerdatasort.hasPath()) {
			p.setPlnDfnActnTrgrDataSortPath(String.valueOf(plandefinitionactiontriggerdatasort.getPath()));
		}
		/******************** plandefinitionactiontriggerdatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection plandefinitionactiontriggerdatasortdirection = plandefinitionactiontriggerdatasort.getDirection();
		p.setPlnDfnActnTrgrDataSortDirection(plandefinitionactiontriggerdatasortdirection.toCode());

		/******************** plandefinitionactiontriggerdatadatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent plandefinitionactiontriggerdatadatefilter = plandefinitionactiontriggerdata.getDateFilterFirstRep();

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilter.hasPath()) {
			p.setPlnDfnActnTrgrDataDtFltrPath(String.valueOf(plandefinitionactiontriggerdatadatefilter.getPath()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilter.hasSearchParam()) {
			p.setPlnDfnActnTrgrDataDtFltrSrchParam(String.valueOf(plandefinitionactiontriggerdatadatefilter.getSearchParam()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefilter.hasValueDateTimeType()) {
			p.setPlnDfnActnTrgrDataDtFltrVlDtTimeTyp(String.valueOf(plandefinitionactiontriggerdatadatefilter.getValueDateTimeType()));
		}
		/******************** plandefinitionactiontriggerdatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontriggerdatadatefiltervalueduration = plandefinitionactiontriggerdatadatefilter.getValueDuration();

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasValue()) {
			p.setPlnDfnActnTrgrDataDtFltrVlDurationVl(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getValue()));
		}
		/******************** plandefinitionactiontriggerdatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggerdatadatefiltervaluedurationcomparator = plandefinitionactiontriggerdatadatefiltervalueduration.getComparator();
		p.setPlnDfnActnTrgrDataDtFltrVlDurationCmprtr(plandefinitionactiontriggerdatadatefiltervaluedurationcomparator.toCode());

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasCode()) {
			p.setPlnDfnActnTrgrDataDtFltrVlDurationCd(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getCode()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasUnit()) {
			p.setPlnDfnActnTrgrDataDtFltrVlDurationUnt(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getUnit()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefiltervalueduration.hasSystem()) {
			p.setPlnDfnActnTrgrDataDtFltrVlDurationSys(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueduration.getSystem()));
		}
		/******************** plandefinitionactiontriggerdatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontriggerdatadatefiltervalueperiod = plandefinitionactiontriggerdatadatefilter.getValuePeriod();

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefiltervalueperiod.hasStart()) {
			p.setPlnDfnActnTrgrDataDtFltrVlPrdStrt(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueperiod.getStart()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(plandefinitionactiontriggerdatadatefiltervalueperiod.hasEnd()) {
			p.setPlnDfnActnTrgrDataDtFltrVlPrdEnd(String.valueOf(plandefinitionactiontriggerdatadatefiltervalueperiod.getEnd()));
		}
		/******************** plandefinitionactiontriggerdatacodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent plandefinitionactiontriggerdatacodefilter = plandefinitionactiontriggerdata.getCodeFilterFirstRep();

		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefilter.hasPath()) {
			p.setPlnDfnActnTrgrDataCdFltrPath(String.valueOf(plandefinitionactiontriggerdatacodefilter.getPath()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefilter.hasSearchParam()) {
			p.setPlnDfnActnTrgrDataCdFltrSrchParam(String.valueOf(plandefinitionactiontriggerdatacodefilter.getSearchParam()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefilter.hasValueSet()) {
			p.setPlnDfnActnTrgrDataCdFltrVlSt(String.valueOf(plandefinitionactiontriggerdatacodefilter.getValueSet()));
		}
		/******************** plandefinitionactiontriggerdatacodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontriggerdatacodefiltercode = plandefinitionactiontriggerdatacodefilter.getCodeFirstRep();

		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercode.hasVersion()) {
			p.setPlnDfnActnTrgrDataCdFltrCdVrsn(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getVersion()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercode.hasDisplay()) {
			p.setPlnDfnActnTrgrDataCdFltrCdDsply(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getDisplay()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercode.hasUserSelected()) {
			p.setPlnDfnActnTrgrDataCdFltrCdUsrSltd(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(plandefinitionactiontriggerdatacodefiltercode.hasSystem()) {
			p.setPlnDfnActnTrgrDataCdFltrCdSys(String.valueOf(plandefinitionactiontriggerdatacodefiltercode.getSystem()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgRfrnc ********************************************************************************/
		if(plandefinitionactiontrigger.hasTimingReference()) {
			p.setPlnDfnActnTrgrTmgRfrnc(String.valueOf(plandefinitionactiontrigger.getTimingReference()));
		}
		/******************** plandefinitionactiontriggercondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactiontriggercondition = plandefinitionactiontrigger.getCondition();

		/******************** PlnDfn_Actn_Trgr_Cndtn_Nm ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasName()) {
			p.setPlnDfnActnTrgrCndtnNm(String.valueOf(plandefinitionactiontriggercondition.getName()));
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasReference()) {
			p.setPlnDfnActnTrgrCndtnRfrnc(String.valueOf(plandefinitionactiontriggercondition.getReference()));
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasLanguage()) {
			p.setPlnDfnActnTrgrCndtnLnguage(String.valueOf(plandefinitionactiontriggercondition.getLanguage()));
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasDescription()) {
			p.setPlnDfnActnTrgrCndtnDscrptn(String.valueOf(plandefinitionactiontriggercondition.getDescription()));
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(plandefinitionactiontriggercondition.hasExpression()) {
			p.setPlnDfnActnTrgrCndtnExprsn(String.valueOf(plandefinitionactiontriggercondition.getExpression()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgDtTyp ********************************************************************************/
		if(plandefinitionactiontrigger.hasTimingDateType()) {
			p.setPlnDfnActnTrgrTmgDtTyp(String.valueOf(plandefinitionactiontrigger.getTimingDateType()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(plandefinitionactiontrigger.hasTimingDateTimeType()) {
			p.setPlnDfnActnTrgrTmgDtTimeTyp(String.valueOf(plandefinitionactiontrigger.getTimingDateTimeType()));
		}
		/******************** plandefinitionactiontriggertimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing plandefinitionactiontriggertimingtiming = plandefinitionactiontrigger.getTimingTiming();

		/******************** plandefinitionactiontriggertimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontriggertimingtimingcode = plandefinitionactiontriggertimingtiming.getCode();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcode.hasText()) {
			p.setPlnDfnActnTrgrTmgTmgCdTxt(String.valueOf(plandefinitionactiontriggertimingtimingcode.getText()));
		}
		/******************** plandefinitionactiontriggertimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontriggertimingtimingcodecoding = plandefinitionactiontriggertimingtimingcode.getCodingFirstRep();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecoding.hasVersion()) {
			p.setPlnDfnActnTrgrTmgTmgCdCdgVrsn(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecoding.hasDisplay()) {
			p.setPlnDfnActnTrgrTmgTmgCdCdgDsply(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecoding.hasCode()) {
			p.setPlnDfnActnTrgrTmgTmgCdCdgCd(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getCode()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecoding.hasUserSelected()) {
			p.setPlnDfnActnTrgrTmgTmgCdCdgUsrSltd(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingcodecoding.hasSystem()) {
			p.setPlnDfnActnTrgrTmgTmgCdCdgSys(String.valueOf(plandefinitionactiontriggertimingtimingcodecoding.getSystem()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent plandefinitionactiontriggertimingtimingrepeat = plandefinitionactiontriggertimingtiming.getRepeat();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasOffset()) {
			p.setPlnDfnActnTrgrTmgTmgRptOff(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getOffset()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasCount()) {
			p.setPlnDfnActnTrgrTmgTmgRptCnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getCount()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasFrequency()) {
			p.setPlnDfnActnTrgrTmgTmgRptFrqncy(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getFrequency()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasPeriod()) {
			p.setPlnDfnActnTrgrTmgTmgRptPrd(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getPeriod()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasDuration()) {
			p.setPlnDfnActnTrgrTmgTmgRptDuration(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getDuration()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontriggertimingtimingrepeatboundsduration = plandefinitionactiontriggertimingtimingrepeat.getBoundsDuration();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasValue()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsDurationVl(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getValue()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator = plandefinitionactiontriggertimingtimingrepeatboundsduration.getComparator();
		p.setPlnDfnActnTrgrTmgTmgRptBndsDurationCmprtr(plandefinitionactiontriggertimingtimingrepeatboundsdurationcomparator.toCode());

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasCode()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsDurationCd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getCode()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasUnit()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsDurationUnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getUnit()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsduration.hasSystem()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsDurationSys(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsduration.getSystem()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontriggertimingtimingrepeatboundsrange = plandefinitionactiontriggertimingtimingrepeat.getBoundsRange();

		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontriggertimingtimingrepeatboundsrangelow = plandefinitionactiontriggertimingtimingrepeatboundsrange.getLow();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasValue()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngLwVl(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator = plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getComparator();
		p.setPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr(plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasCode()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngLwCd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasUnit()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.hasSystem()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngLwSys(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontriggertimingtimingrepeatboundsrangehigh = plandefinitionactiontriggertimingtimingrepeatboundsrange.getHigh();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasValue()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngHiVl(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator = plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getComparator();
		p.setPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr(plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasCode()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngHiCd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasUnit()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.hasSystem()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsRngHiSys(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontriggertimingtimingrepeatboundsperiod = plandefinitionactiontriggertimingtimingrepeat.getBoundsPeriod();

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsperiod.hasStart()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsPrdStrt(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeatboundsperiod.hasEnd()) {
			p.setPlnDfnActnTrgrTmgTmgRptBndsPrdEnd(String.valueOf(plandefinitionactiontriggertimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasPeriodMax()) {
			p.setPlnDfnActnTrgrTmgTmgRptPrdMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getPeriodMax()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasDurationMax()) {
			p.setPlnDfnActnTrgrTmgTmgRptDurationMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getDurationMax()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasCountMax()) {
			p.setPlnDfnActnTrgrTmgTmgRptCntMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getCountMax()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(plandefinitionactiontriggertimingtimingrepeat.hasFrequencyMax()) {
			p.setPlnDfnActnTrgrTmgTmgRptFrqncyMx(String.valueOf(plandefinitionactiontriggertimingtimingrepeat.getFrequencyMax()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontriggertimingtimingrepeatdurationunit = plandefinitionactiontriggertimingtimingrepeat.getDurationUnit();
		p.setPlnDfnActnTrgrTmgTmgRptDurationUnt(plandefinitionactiontriggertimingtimingrepeatdurationunit.toCode());

		/******************** plandefinitionactiontriggertimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontriggertimingtimingrepeatperiodunit = plandefinitionactiontriggertimingtimingrepeat.getPeriodUnit();
		p.setPlnDfnActnTrgrTmgTmgRptPrdUnt(plandefinitionactiontriggertimingtimingrepeatperiodunit.toCode());

		/******************** plandefinitionactioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactioncode = plandefinitionaction.getCodeFirstRep();

		/******************** PlnDfn_Actn_Cd_Txt ********************************************************************************/
		if(plandefinitionactioncode.hasText()) {
			p.setPlnDfnActnCdTxt(String.valueOf(plandefinitionactioncode.getText()));
		}
		/******************** plandefinitionactioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactioncodecoding = plandefinitionactioncode.getCodingFirstRep();

		/******************** PlnDfn_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactioncodecoding.hasVersion()) {
			p.setPlnDfnActnCdCdgVrsn(String.valueOf(plandefinitionactioncodecoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactioncodecoding.hasDisplay()) {
			p.setPlnDfnActnCdCdgDsply(String.valueOf(plandefinitionactioncodecoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(plandefinitionactioncodecoding.hasCode()) {
			p.setPlnDfnActnCdCdgCd(String.valueOf(plandefinitionactioncodecoding.getCode()));
		}
		/******************** PlnDfn_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactioncodecoding.hasUserSelected()) {
			p.setPlnDfnActnCdCdgUsrSltd(String.valueOf(plandefinitionactioncodecoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(plandefinitionactioncodecoding.hasSystem()) {
			p.setPlnDfnActnCdCdgSys(String.valueOf(plandefinitionactioncodecoding.getSystem()));
		}
		/******************** plandefinitionactionprecheckbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionPrecheckBehavior plandefinitionactionprecheckbehavior = plandefinitionaction.getPrecheckBehavior();
		p.setPlnDfnActnPrecheckBehavior(plandefinitionactionprecheckbehavior.toCode());

		/******************** plandefinitionactionselectionbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionSelectionBehavior plandefinitionactionselectionbehavior = plandefinitionaction.getSelectionBehavior();
		p.setPlnDfnActnSelectionBehavior(plandefinitionactionselectionbehavior.toCode());

		/******************** plandefinitionactiongroupingbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionGroupingBehavior plandefinitionactiongroupingbehavior = plandefinitionaction.getGroupingBehavior();
		p.setPlnDfnActnGrpingBehavior(plandefinitionactiongroupingbehavior.toCode());

		/******************** plandefinitionactionrequiredbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionRequiredBehavior plandefinitionactionrequiredbehavior = plandefinitionaction.getRequiredBehavior();
		p.setPlnDfnActnRequiredBehavior(plandefinitionactionrequiredbehavior.toCode());

		/******************** plandefinitionactioncardinalitybehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionCardinalityBehavior plandefinitionactioncardinalitybehavior = plandefinitionaction.getCardinalityBehavior();
		p.setPlnDfnActnCardinalityBehavior(plandefinitionactioncardinalitybehavior.toCode());

		/******************** plandefinitionactiondocumentation ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact plandefinitionactiondocumentation = plandefinitionaction.getDocumentationFirstRep();

		/******************** PlnDfn_Actn_Docation_Rsrc ********************************************************************************/
		if(plandefinitionactiondocumentation.hasResource()) {
			p.setPlnDfnActnDocationRsrc(String.valueOf(plandefinitionactiondocumentation.getResource()));
		}
		/******************** plandefinitionactiondocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType plandefinitionactiondocumentationtype = plandefinitionactiondocumentation.getType();
		p.setPlnDfnActnDocationTyp(plandefinitionactiondocumentationtype.toCode());

		/******************** plandefinitionactiondocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitionactiondocumentationdocument = plandefinitionactiondocumentation.getDocument();

		/******************** PlnDfn_Actn_Docation_Doc_Sz ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasSize()) {
			p.setPlnDfnActnDocationDocSz(String.valueOf(plandefinitionactiondocumentationdocument.getSize()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasLanguage()) {
			p.setPlnDfnActnDocationDocLnguage(String.valueOf(plandefinitionactiondocumentationdocument.getLanguage()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasContentType()) {
			p.setPlnDfnActnDocationDocCntntTyp(String.valueOf(plandefinitionactiondocumentationdocument.getContentType()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasTitle()) {
			p.setPlnDfnActnDocationDocTtl(String.valueOf(plandefinitionactiondocumentationdocument.getTitle()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Url ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasUrl()) {
			p.setPlnDfnActnDocationDocUrl(String.valueOf(plandefinitionactiondocumentationdocument.getUrl()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Data ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasData()) {
			p.setPlnDfnActnDocationDocData(String.valueOf(plandefinitionactiondocumentationdocument.getData()));
		}

		/******************** PlnDfn_Actn_Docation_Doc_Hash ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasHash()) {
			p.setPlnDfnActnDocationDocHash(String.valueOf(plandefinitionactiondocumentationdocument.getHash()));
		}

		/******************** PlnDfn_Actn_Docation_Doc_Creation ********************************************************************************/
		if(plandefinitionactiondocumentationdocument.hasCreation()) {
			p.setPlnDfnActnDocationDocCreation(String.valueOf(plandefinitionactiondocumentationdocument.getCreation()));
		}
		/******************** PlnDfn_Actn_Docation_Url ********************************************************************************/
		if(plandefinitionactiondocumentation.hasUrl()) {
			p.setPlnDfnActnDocationUrl(String.valueOf(plandefinitionactiondocumentation.getUrl()));
		}
		/******************** PlnDfn_Actn_Docation_Lbl ********************************************************************************/
		if(plandefinitionactiondocumentation.hasLabel()) {
			p.setPlnDfnActnDocationLbl(String.valueOf(plandefinitionactiondocumentation.getLabel()));
		}
		/******************** PlnDfn_Actn_Docation_Citation ********************************************************************************/
		if(plandefinitionactiondocumentation.hasCitation()) {
			p.setPlnDfnActnDocationCitation(String.valueOf(plandefinitionactiondocumentation.getCitation()));
		}
		/******************** plandefinitionactionrelatedaction ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent plandefinitionactionrelatedaction = plandefinitionaction.getRelatedActionFirstRep();

		/******************** plandefinitionactionrelatedactionrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionRelationshipType plandefinitionactionrelatedactionrelationship = plandefinitionactionrelatedaction.getRelationship();
		p.setPlnDfnActnRltedActnRltnship(plandefinitionactionrelatedactionrelationship.toCode());

		/******************** PlnDfn_Actn_RltedActn_ActnId ********************************************************************************/
		if(plandefinitionactionrelatedaction.hasActionId()) {
			p.setPlnDfnActnRltedActnActnId(String.valueOf(plandefinitionactionrelatedaction.getActionId()));
		}
		/******************** plandefinitionactionrelatedactionoffduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactionrelatedactionoffduration = plandefinitionactionrelatedaction.getOffsetDuration();

		/******************** PlnDfn_Actn_RltedActn_OffDuration_Vl ********************************************************************************/
		if(plandefinitionactionrelatedactionoffduration.hasValue()) {
			p.setPlnDfnActnRltedActnOffDurationVl(String.valueOf(plandefinitionactionrelatedactionoffduration.getValue()));
		}
		/******************** plandefinitionactionrelatedactionoffdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionrelatedactionoffdurationcomparator = plandefinitionactionrelatedactionoffduration.getComparator();
		p.setPlnDfnActnRltedActnOffDurationCmprtr(plandefinitionactionrelatedactionoffdurationcomparator.toCode());

		/******************** PlnDfn_Actn_RltedActn_OffDuration_Cd ********************************************************************************/
		if(plandefinitionactionrelatedactionoffduration.hasCode()) {
			p.setPlnDfnActnRltedActnOffDurationCd(String.valueOf(plandefinitionactionrelatedactionoffduration.getCode()));
		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Unt ********************************************************************************/
		if(plandefinitionactionrelatedactionoffduration.hasUnit()) {
			p.setPlnDfnActnRltedActnOffDurationUnt(String.valueOf(plandefinitionactionrelatedactionoffduration.getUnit()));
		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Sys ********************************************************************************/
		if(plandefinitionactionrelatedactionoffduration.hasSystem()) {
			p.setPlnDfnActnRltedActnOffDurationSys(String.valueOf(plandefinitionactionrelatedactionoffduration.getSystem()));
		}
		/******************** plandefinitionactionrelatedactionoffrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactionrelatedactionoffrange = plandefinitionactionrelatedaction.getOffsetRange();

		/******************** plandefinitionactionrelatedactionoffrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactionrelatedactionoffrangelow = plandefinitionactionrelatedactionoffrange.getLow();

		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangelow.hasValue()) {
			p.setPlnDfnActnRltedActnOffRngLwVl(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getValue()));
		}
		/******************** plandefinitionactionrelatedactionoffrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionrelatedactionoffrangelowcomparator = plandefinitionactionrelatedactionoffrangelow.getComparator();
		p.setPlnDfnActnRltedActnOffRngLwCmprtr(plandefinitionactionrelatedactionoffrangelowcomparator.toCode());

		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangelow.hasCode()) {
			p.setPlnDfnActnRltedActnOffRngLwCd(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getCode()));
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangelow.hasUnit()) {
			p.setPlnDfnActnRltedActnOffRngLwUnt(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getUnit()));
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangelow.hasSystem()) {
			p.setPlnDfnActnRltedActnOffRngLwSys(String.valueOf(plandefinitionactionrelatedactionoffrangelow.getSystem()));
		}
		/******************** plandefinitionactionrelatedactionoffrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactionrelatedactionoffrangehigh = plandefinitionactionrelatedactionoffrange.getHigh();

		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangehigh.hasValue()) {
			p.setPlnDfnActnRltedActnOffRngHiVl(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getValue()));
		}
		/******************** plandefinitionactionrelatedactionoffrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionrelatedactionoffrangehighcomparator = plandefinitionactionrelatedactionoffrangehigh.getComparator();
		p.setPlnDfnActnRltedActnOffRngHiCmprtr(plandefinitionactionrelatedactionoffrangehighcomparator.toCode());

		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangehigh.hasCode()) {
			p.setPlnDfnActnRltedActnOffRngHiCd(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getCode()));
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangehigh.hasUnit()) {
			p.setPlnDfnActnRltedActnOffRngHiUnt(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getUnit()));
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactionrelatedactionoffrangehigh.hasSystem()) {
			p.setPlnDfnActnRltedActnOffRngHiSys(String.valueOf(plandefinitionactionrelatedactionoffrangehigh.getSystem()));
		}
		/******************** PlnDfn_Actn_Prefix ********************************************************************************/
		if(plandefinitionaction.hasPrefix()) {
			p.setPlnDfnActnPrefix(String.valueOf(plandefinitionaction.getPrefix()));
		}
		/******************** PlnDfn_Actn_TxtEquivalent ********************************************************************************/
		if(plandefinitionaction.hasTextEquivalent()) {
			p.setPlnDfnActnTxtEquivalent(String.valueOf(plandefinitionaction.getTextEquivalent()));
		}
		/******************** plandefinitionactionparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent plandefinitionactionparticipant = plandefinitionaction.getParticipantFirstRep();

		/******************** plandefinitionactionparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionParticipantType plandefinitionactionparticipanttype = plandefinitionactionparticipant.getType();
		p.setPlnDfnActnPrtcpntTyp(plandefinitionactionparticipanttype.toCode());

		/******************** plandefinitionactionparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionparticipantrole = plandefinitionactionparticipant.getRole();

		/******************** PlnDfn_Actn_Prtcpnt_Role_Txt ********************************************************************************/
		if(plandefinitionactionparticipantrole.hasText()) {
			p.setPlnDfnActnPrtcpntRoleTxt(String.valueOf(plandefinitionactionparticipantrole.getText()));
		}
		/******************** plandefinitionactionparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionparticipantrolecoding = plandefinitionactionparticipantrole.getCodingFirstRep();

		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionparticipantrolecoding.hasVersion()) {
			p.setPlnDfnActnPrtcpntRoleCdgVrsn(String.valueOf(plandefinitionactionparticipantrolecoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionparticipantrolecoding.hasDisplay()) {
			p.setPlnDfnActnPrtcpntRoleCdgDsply(String.valueOf(plandefinitionactionparticipantrolecoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionparticipantrolecoding.hasCode()) {
			p.setPlnDfnActnPrtcpntRoleCdgCd(String.valueOf(plandefinitionactionparticipantrolecoding.getCode()));
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionparticipantrolecoding.hasUserSelected()) {
			p.setPlnDfnActnPrtcpntRoleCdgUsrSltd(String.valueOf(plandefinitionactionparticipantrolecoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionparticipantrolecoding.hasSystem()) {
			p.setPlnDfnActnPrtcpntRoleCdgSys(String.valueOf(plandefinitionactionparticipantrolecoding.getSystem()));
		}
		/******************** PlnDfn_Actn_TmgDtTimeTyp ********************************************************************************/
		if(plandefinitionaction.hasTimingDateTimeType()) {
			p.setPlnDfnActnTmgDtTimeTyp(String.valueOf(plandefinitionaction.getTimingDateTimeType()));
		}
		/******************** plandefinitionactiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontimingperiod = plandefinitionaction.getTimingPeriod();

		/******************** PlnDfn_Actn_TmgPrd_Strt ********************************************************************************/
		if(plandefinitionactiontimingperiod.hasStart()) {
			p.setPlnDfnActnTmgPrdStrt(String.valueOf(plandefinitionactiontimingperiod.getStart()));
		}
		/******************** PlnDfn_Actn_TmgPrd_End ********************************************************************************/
		if(plandefinitionactiontimingperiod.hasEnd()) {
			p.setPlnDfnActnTmgPrdEnd(String.valueOf(plandefinitionactiontimingperiod.getEnd()));
		}
		/******************** plandefinitionactiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing plandefinitionactiontimingtiming = plandefinitionaction.getTimingTiming();

		/******************** plandefinitionactiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontimingtimingcode = plandefinitionactiontimingtiming.getCode();

		/******************** PlnDfn_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(plandefinitionactiontimingtimingcode.hasText()) {
			p.setPlnDfnActnTmgTmgCdTxt(String.valueOf(plandefinitionactiontimingtimingcode.getText()));
		}
		/******************** plandefinitionactiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontimingtimingcodecoding = plandefinitionactiontimingtimingcode.getCodingFirstRep();

		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecoding.hasVersion()) {
			p.setPlnDfnActnTmgTmgCdCdgVrsn(String.valueOf(plandefinitionactiontimingtimingcodecoding.getVersion()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecoding.hasDisplay()) {
			p.setPlnDfnActnTmgTmgCdCdgDsply(String.valueOf(plandefinitionactiontimingtimingcodecoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecoding.hasCode()) {
			p.setPlnDfnActnTmgTmgCdCdgCd(String.valueOf(plandefinitionactiontimingtimingcodecoding.getCode()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecoding.hasUserSelected()) {
			p.setPlnDfnActnTmgTmgCdCdgUsrSltd(String.valueOf(plandefinitionactiontimingtimingcodecoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingcodecoding.hasSystem()) {
			p.setPlnDfnActnTmgTmgCdCdgSys(String.valueOf(plandefinitionactiontimingtimingcodecoding.getSystem()));
		}
		/******************** plandefinitionactiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent plandefinitionactiontimingtimingrepeat = plandefinitionactiontimingtiming.getRepeat();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasOffset()) {
			p.setPlnDfnActnTmgTmgRptOff(String.valueOf(plandefinitionactiontimingtimingrepeat.getOffset()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasCount()) {
			p.setPlnDfnActnTmgTmgRptCnt(String.valueOf(plandefinitionactiontimingtimingrepeat.getCount()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasFrequency()) {
			p.setPlnDfnActnTmgTmgRptFrqncy(String.valueOf(plandefinitionactiontimingtimingrepeat.getFrequency()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasPeriod()) {
			p.setPlnDfnActnTmgTmgRptPrd(String.valueOf(plandefinitionactiontimingtimingrepeat.getPeriod()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasDuration()) {
			p.setPlnDfnActnTmgTmgRptDuration(String.valueOf(plandefinitionactiontimingtimingrepeat.getDuration()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontimingtimingrepeatboundsduration = plandefinitionactiontimingtimingrepeat.getBoundsDuration();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasValue()) {
			p.setPlnDfnActnTmgTmgRptBndsDurationVl(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getValue()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingtimingrepeatboundsdurationcomparator = plandefinitionactiontimingtimingrepeatboundsduration.getComparator();
		p.setPlnDfnActnTmgTmgRptBndsDurationCmprtr(plandefinitionactiontimingtimingrepeatboundsdurationcomparator.toCode());

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasCode()) {
			p.setPlnDfnActnTmgTmgRptBndsDurationCd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getCode()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasUnit()) {
			p.setPlnDfnActnTmgTmgRptBndsDurationUnt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsduration.hasSystem()) {
			p.setPlnDfnActnTmgTmgRptBndsDurationSys(String.valueOf(plandefinitionactiontimingtimingrepeatboundsduration.getSystem()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontimingtimingrepeatboundsrange = plandefinitionactiontimingtimingrepeat.getBoundsRange();

		/******************** plandefinitionactiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingtimingrepeatboundsrangelow = plandefinitionactiontimingtimingrepeatboundsrange.getLow();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasValue()) {
			p.setPlnDfnActnTmgTmgRptBndsRngLwVl(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingtimingrepeatboundsrangelowcomparator = plandefinitionactiontimingtimingrepeatboundsrangelow.getComparator();
		p.setPlnDfnActnTmgTmgRptBndsRngLwCmprtr(plandefinitionactiontimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasCode()) {
			p.setPlnDfnActnTmgTmgRptBndsRngLwCd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasUnit()) {
			p.setPlnDfnActnTmgTmgRptBndsRngLwUnt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangelow.hasSystem()) {
			p.setPlnDfnActnTmgTmgRptBndsRngLwSys(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingtimingrepeatboundsrangehigh = plandefinitionactiontimingtimingrepeatboundsrange.getHigh();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasValue()) {
			p.setPlnDfnActnTmgTmgRptBndsRngHiVl(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingtimingrepeatboundsrangehighcomparator = plandefinitionactiontimingtimingrepeatboundsrangehigh.getComparator();
		p.setPlnDfnActnTmgTmgRptBndsRngHiCmprtr(plandefinitionactiontimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasCode()) {
			p.setPlnDfnActnTmgTmgRptBndsRngHiCd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasUnit()) {
			p.setPlnDfnActnTmgTmgRptBndsRngHiUnt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsrangehigh.hasSystem()) {
			p.setPlnDfnActnTmgTmgRptBndsRngHiSys(String.valueOf(plandefinitionactiontimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontimingtimingrepeatboundsperiod = plandefinitionactiontimingtimingrepeat.getBoundsPeriod();

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsperiod.hasStart()) {
			p.setPlnDfnActnTmgTmgRptBndsPrdStrt(String.valueOf(plandefinitionactiontimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeatboundsperiod.hasEnd()) {
			p.setPlnDfnActnTmgTmgRptBndsPrdEnd(String.valueOf(plandefinitionactiontimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasPeriodMax()) {
			p.setPlnDfnActnTmgTmgRptPrdMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getPeriodMax()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasDurationMax()) {
			p.setPlnDfnActnTmgTmgRptDurationMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getDurationMax()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasCountMax()) {
			p.setPlnDfnActnTmgTmgRptCntMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getCountMax()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(plandefinitionactiontimingtimingrepeat.hasFrequencyMax()) {
			p.setPlnDfnActnTmgTmgRptFrqncyMx(String.valueOf(plandefinitionactiontimingtimingrepeat.getFrequencyMax()));
		}
		/******************** plandefinitionactiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontimingtimingrepeatdurationunit = plandefinitionactiontimingtimingrepeat.getDurationUnit();
		p.setPlnDfnActnTmgTmgRptDurationUnt(plandefinitionactiontimingtimingrepeatdurationunit.toCode());

		/******************** plandefinitionactiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime plandefinitionactiontimingtimingrepeatperiodunit = plandefinitionactiontimingtimingrepeat.getPeriodUnit();
		p.setPlnDfnActnTmgTmgRptPrdUnt(plandefinitionactiontimingtimingrepeatperiodunit.toCode());

		/******************** plandefinitionactioninput ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement plandefinitionactioninput = plandefinitionaction.getInputFirstRep();

		/******************** PlnDfn_Actn_Input_Typ ********************************************************************************/
		if(plandefinitionactioninput.hasType()) {
			p.setPlnDfnActnInputTyp(String.valueOf(plandefinitionactioninput.getType()));
		}
		/******************** plandefinitionactioninputsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactioninputsubjectcodeableconcept = plandefinitionactioninput.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconcept.hasText()) {
			p.setPlnDfnActnInputSbjctCdbleCncptTxt(String.valueOf(plandefinitionactioninputsubjectcodeableconcept.getText()));
		}
		/******************** plandefinitionactioninputsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactioninputsubjectcodeableconceptcoding = plandefinitionactioninputsubjectcodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasVersion()) {
			p.setPlnDfnActnInputSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnActnInputSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasCode()) {
			p.setPlnDfnActnInputSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactioninputsubjectcodeableconceptcoding.hasSystem()) {
			p.setPlnDfnActnInputSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactioninputsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** PlnDfn_Actn_Input_SbjctRfrnc ********************************************************************************/
		if(plandefinitionactioninput.hasSubjectReference()) {
			p.setPlnDfnActnInputSbjctRfrnc(String.valueOf(plandefinitionactioninput.getSubjectReference()));
		}
		/******************** PlnDfn_Actn_Input_Lmt ********************************************************************************/
		if(plandefinitionactioninput.hasLimit()) {
			p.setPlnDfnActnInputLmt(String.valueOf(plandefinitionactioninput.getLimit()));
		}
		/******************** plandefinitionactioninputsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent plandefinitionactioninputsort = plandefinitionactioninput.getSortFirstRep();

		/******************** PlnDfn_Actn_Input_Sort_Path ********************************************************************************/
		if(plandefinitionactioninputsort.hasPath()) {
			p.setPlnDfnActnInputSortPath(String.valueOf(plandefinitionactioninputsort.getPath()));
		}
		/******************** plandefinitionactioninputsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection plandefinitionactioninputsortdirection = plandefinitionactioninputsort.getDirection();
		p.setPlnDfnActnInputSortDirection(plandefinitionactioninputsortdirection.toCode());

		/******************** plandefinitionactioninputdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent plandefinitionactioninputdatefilter = plandefinitionactioninput.getDateFilterFirstRep();

		/******************** PlnDfn_Actn_Input_DtFltr_Path ********************************************************************************/
		if(plandefinitionactioninputdatefilter.hasPath()) {
			p.setPlnDfnActnInputDtFltrPath(String.valueOf(plandefinitionactioninputdatefilter.getPath()));
		}
		/******************** PlnDfn_Actn_Input_DtFltr_SrchParam ********************************************************************************/
		if(plandefinitionactioninputdatefilter.hasSearchParam()) {
			p.setPlnDfnActnInputDtFltrSrchParam(String.valueOf(plandefinitionactioninputdatefilter.getSearchParam()));
		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(plandefinitionactioninputdatefilter.hasValueDateTimeType()) {
			p.setPlnDfnActnInputDtFltrVlDtTimeTyp(String.valueOf(plandefinitionactioninputdatefilter.getValueDateTimeType()));
		}
		/******************** plandefinitionactioninputdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactioninputdatefiltervalueduration = plandefinitionactioninputdatefilter.getValueDuration();

		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Vl ********************************************************************************/
		if(plandefinitionactioninputdatefiltervalueduration.hasValue()) {
			p.setPlnDfnActnInputDtFltrVlDurationVl(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getValue()));
		}
		/******************** plandefinitionactioninputdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactioninputdatefiltervaluedurationcomparator = plandefinitionactioninputdatefiltervalueduration.getComparator();
		p.setPlnDfnActnInputDtFltrVlDurationCmprtr(plandefinitionactioninputdatefiltervaluedurationcomparator.toCode());

		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Cd ********************************************************************************/
		if(plandefinitionactioninputdatefiltervalueduration.hasCode()) {
			p.setPlnDfnActnInputDtFltrVlDurationCd(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getCode()));
		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Unt ********************************************************************************/
		if(plandefinitionactioninputdatefiltervalueduration.hasUnit()) {
			p.setPlnDfnActnInputDtFltrVlDurationUnt(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getUnit()));
		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Sys ********************************************************************************/
		if(plandefinitionactioninputdatefiltervalueduration.hasSystem()) {
			p.setPlnDfnActnInputDtFltrVlDurationSys(String.valueOf(plandefinitionactioninputdatefiltervalueduration.getSystem()));
		}
		/******************** plandefinitionactioninputdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactioninputdatefiltervalueperiod = plandefinitionactioninputdatefilter.getValuePeriod();

		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_Strt ********************************************************************************/
		if(plandefinitionactioninputdatefiltervalueperiod.hasStart()) {
			p.setPlnDfnActnInputDtFltrVlPrdStrt(String.valueOf(plandefinitionactioninputdatefiltervalueperiod.getStart()));
		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_End ********************************************************************************/
		if(plandefinitionactioninputdatefiltervalueperiod.hasEnd()) {
			p.setPlnDfnActnInputDtFltrVlPrdEnd(String.valueOf(plandefinitionactioninputdatefiltervalueperiod.getEnd()));
		}
		/******************** plandefinitionactioninputcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent plandefinitionactioninputcodefilter = plandefinitionactioninput.getCodeFilterFirstRep();

		/******************** PlnDfn_Actn_Input_CdFltr_Path ********************************************************************************/
		if(plandefinitionactioninputcodefilter.hasPath()) {
			p.setPlnDfnActnInputCdFltrPath(String.valueOf(plandefinitionactioninputcodefilter.getPath()));
		}
		/******************** PlnDfn_Actn_Input_CdFltr_SrchParam ********************************************************************************/
		if(plandefinitionactioninputcodefilter.hasSearchParam()) {
			p.setPlnDfnActnInputCdFltrSrchParam(String.valueOf(plandefinitionactioninputcodefilter.getSearchParam()));
		}
		/******************** PlnDfn_Actn_Input_CdFltr_VlSt ********************************************************************************/
		if(plandefinitionactioninputcodefilter.hasValueSet()) {
			p.setPlnDfnActnInputCdFltrVlSt(String.valueOf(plandefinitionactioninputcodefilter.getValueSet()));
		}
		/******************** plandefinitionactioninputcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactioninputcodefiltercode = plandefinitionactioninputcodefilter.getCodeFirstRep();

		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Vrsn ********************************************************************************/
		if(plandefinitionactioninputcodefiltercode.hasVersion()) {
			p.setPlnDfnActnInputCdFltrCdVrsn(String.valueOf(plandefinitionactioninputcodefiltercode.getVersion()));
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Dsply ********************************************************************************/
		if(plandefinitionactioninputcodefiltercode.hasDisplay()) {
			p.setPlnDfnActnInputCdFltrCdDsply(String.valueOf(plandefinitionactioninputcodefiltercode.getDisplay()));
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionactioninputcodefiltercode.hasUserSelected()) {
			p.setPlnDfnActnInputCdFltrCdUsrSltd(String.valueOf(plandefinitionactioninputcodefiltercode.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Sys ********************************************************************************/
		if(plandefinitionactioninputcodefiltercode.hasSystem()) {
			p.setPlnDfnActnInputCdFltrCdSys(String.valueOf(plandefinitionactioninputcodefiltercode.getSystem()));
		}
		/******************** plandefinitionactionoutput ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement plandefinitionactionoutput = plandefinitionaction.getOutputFirstRep();

		/******************** PlnDfn_Actn_Output_Typ ********************************************************************************/
		if(plandefinitionactionoutput.hasType()) {
			p.setPlnDfnActnOutputTyp(String.valueOf(plandefinitionactionoutput.getType()));
		}
		/******************** plandefinitionactionoutputsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionoutputsubjectcodeableconcept = plandefinitionactionoutput.getSubjectCodeableConcept();

		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconcept.hasText()) {
			p.setPlnDfnActnOutputSbjctCdbleCncptTxt(String.valueOf(plandefinitionactionoutputsubjectcodeableconcept.getText()));
		}
		/******************** plandefinitionactionoutputsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionoutputsubjectcodeableconceptcoding = plandefinitionactionoutputsubjectcodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasVersion()) {
			p.setPlnDfnActnOutputSbjctCdbleCncptCdgVrsn(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnActnOutputSbjctCdbleCncptCdgDsply(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasCode()) {
			p.setPlnDfnActnOutputSbjctCdbleCncptCdgCd(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionactionoutputsubjectcodeableconceptcoding.hasSystem()) {
			p.setPlnDfnActnOutputSbjctCdbleCncptCdgSys(String.valueOf(plandefinitionactionoutputsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** PlnDfn_Actn_Output_SbjctRfrnc ********************************************************************************/
		if(plandefinitionactionoutput.hasSubjectReference()) {
			p.setPlnDfnActnOutputSbjctRfrnc(String.valueOf(plandefinitionactionoutput.getSubjectReference()));
		}
		/******************** PlnDfn_Actn_Output_Lmt ********************************************************************************/
		if(plandefinitionactionoutput.hasLimit()) {
			p.setPlnDfnActnOutputLmt(String.valueOf(plandefinitionactionoutput.getLimit()));
		}
		/******************** plandefinitionactionoutputsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent plandefinitionactionoutputsort = plandefinitionactionoutput.getSortFirstRep();

		/******************** PlnDfn_Actn_Output_Sort_Path ********************************************************************************/
		if(plandefinitionactionoutputsort.hasPath()) {
			p.setPlnDfnActnOutputSortPath(String.valueOf(plandefinitionactionoutputsort.getPath()));
		}
		/******************** plandefinitionactionoutputsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection plandefinitionactionoutputsortdirection = plandefinitionactionoutputsort.getDirection();
		p.setPlnDfnActnOutputSortDirection(plandefinitionactionoutputsortdirection.toCode());

		/******************** plandefinitionactionoutputdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent plandefinitionactionoutputdatefilter = plandefinitionactionoutput.getDateFilterFirstRep();

		/******************** PlnDfn_Actn_Output_DtFltr_Path ********************************************************************************/
		if(plandefinitionactionoutputdatefilter.hasPath()) {
			p.setPlnDfnActnOutputDtFltrPath(String.valueOf(plandefinitionactionoutputdatefilter.getPath()));
		}
		/******************** PlnDfn_Actn_Output_DtFltr_SrchParam ********************************************************************************/
		if(plandefinitionactionoutputdatefilter.hasSearchParam()) {
			p.setPlnDfnActnOutputDtFltrSrchParam(String.valueOf(plandefinitionactionoutputdatefilter.getSearchParam()));
		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(plandefinitionactionoutputdatefilter.hasValueDateTimeType()) {
			p.setPlnDfnActnOutputDtFltrVlDtTimeTyp(String.valueOf(plandefinitionactionoutputdatefilter.getValueDateTimeType()));
		}
		/******************** plandefinitionactionoutputdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactionoutputdatefiltervalueduration = plandefinitionactionoutputdatefilter.getValueDuration();

		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Vl ********************************************************************************/
		if(plandefinitionactionoutputdatefiltervalueduration.hasValue()) {
			p.setPlnDfnActnOutputDtFltrVlDurationVl(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getValue()));
		}
		/******************** plandefinitionactionoutputdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactionoutputdatefiltervaluedurationcomparator = plandefinitionactionoutputdatefiltervalueduration.getComparator();
		p.setPlnDfnActnOutputDtFltrVlDurationCmprtr(plandefinitionactionoutputdatefiltervaluedurationcomparator.toCode());

		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Cd ********************************************************************************/
		if(plandefinitionactionoutputdatefiltervalueduration.hasCode()) {
			p.setPlnDfnActnOutputDtFltrVlDurationCd(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getCode()));
		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Unt ********************************************************************************/
		if(plandefinitionactionoutputdatefiltervalueduration.hasUnit()) {
			p.setPlnDfnActnOutputDtFltrVlDurationUnt(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getUnit()));
		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Sys ********************************************************************************/
		if(plandefinitionactionoutputdatefiltervalueduration.hasSystem()) {
			p.setPlnDfnActnOutputDtFltrVlDurationSys(String.valueOf(plandefinitionactionoutputdatefiltervalueduration.getSystem()));
		}
		/******************** plandefinitionactionoutputdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactionoutputdatefiltervalueperiod = plandefinitionactionoutputdatefilter.getValuePeriod();

		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_Strt ********************************************************************************/
		if(plandefinitionactionoutputdatefiltervalueperiod.hasStart()) {
			p.setPlnDfnActnOutputDtFltrVlPrdStrt(String.valueOf(plandefinitionactionoutputdatefiltervalueperiod.getStart()));
		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_End ********************************************************************************/
		if(plandefinitionactionoutputdatefiltervalueperiod.hasEnd()) {
			p.setPlnDfnActnOutputDtFltrVlPrdEnd(String.valueOf(plandefinitionactionoutputdatefiltervalueperiod.getEnd()));
		}
		/******************** plandefinitionactionoutputcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent plandefinitionactionoutputcodefilter = plandefinitionactionoutput.getCodeFilterFirstRep();

		/******************** PlnDfn_Actn_Output_CdFltr_Path ********************************************************************************/
		if(plandefinitionactionoutputcodefilter.hasPath()) {
			p.setPlnDfnActnOutputCdFltrPath(String.valueOf(plandefinitionactionoutputcodefilter.getPath()));
		}
		/******************** PlnDfn_Actn_Output_CdFltr_SrchParam ********************************************************************************/
		if(plandefinitionactionoutputcodefilter.hasSearchParam()) {
			p.setPlnDfnActnOutputCdFltrSrchParam(String.valueOf(plandefinitionactionoutputcodefilter.getSearchParam()));
		}
		/******************** PlnDfn_Actn_Output_CdFltr_VlSt ********************************************************************************/
		if(plandefinitionactionoutputcodefilter.hasValueSet()) {
			p.setPlnDfnActnOutputCdFltrVlSt(String.valueOf(plandefinitionactionoutputcodefilter.getValueSet()));
		}
		/******************** plandefinitionactionoutputcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionoutputcodefiltercode = plandefinitionactionoutputcodefilter.getCodeFirstRep();

		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Vrsn ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercode.hasVersion()) {
			p.setPlnDfnActnOutputCdFltrCdVrsn(String.valueOf(plandefinitionactionoutputcodefiltercode.getVersion()));
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Dsply ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercode.hasDisplay()) {
			p.setPlnDfnActnOutputCdFltrCdDsply(String.valueOf(plandefinitionactionoutputcodefiltercode.getDisplay()));
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercode.hasUserSelected()) {
			p.setPlnDfnActnOutputCdFltrCdUsrSltd(String.valueOf(plandefinitionactionoutputcodefiltercode.getUserSelected()));
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Sys ********************************************************************************/
		if(plandefinitionactionoutputcodefiltercode.hasSystem()) {
			p.setPlnDfnActnOutputCdFltrCdSys(String.valueOf(plandefinitionactionoutputcodefiltercode.getSystem()));
		}
		/******************** plandefinitionactiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age plandefinitionactiontimingage = plandefinitionaction.getTimingAge();

		/******************** PlnDfn_Actn_TmgAge_Vl ********************************************************************************/
		if(plandefinitionactiontimingage.hasValue()) {
			p.setPlnDfnActnTmgAgeVl(String.valueOf(plandefinitionactiontimingage.getValue()));
		}
		/******************** plandefinitionactiontimingagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingagecomparator = plandefinitionactiontimingage.getComparator();
		p.setPlnDfnActnTmgAgeCmprtr(plandefinitionactiontimingagecomparator.toCode());

		/******************** PlnDfn_Actn_TmgAge_Cd ********************************************************************************/
		if(plandefinitionactiontimingage.hasCode()) {
			p.setPlnDfnActnTmgAgeCd(String.valueOf(plandefinitionactiontimingage.getCode()));
		}
		/******************** PlnDfn_Actn_TmgAge_Unt ********************************************************************************/
		if(plandefinitionactiontimingage.hasUnit()) {
			p.setPlnDfnActnTmgAgeUnt(String.valueOf(plandefinitionactiontimingage.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgAge_Sys ********************************************************************************/
		if(plandefinitionactiontimingage.hasSystem()) {
			p.setPlnDfnActnTmgAgeSys(String.valueOf(plandefinitionactiontimingage.getSystem()));
		}
		/******************** plandefinitionactiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontimingrange = plandefinitionaction.getTimingRange();

		/******************** plandefinitionactiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingrangelow = plandefinitionactiontimingrange.getLow();

		/******************** PlnDfn_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasValue()) {
			p.setPlnDfnActnTmgRngLwVl(String.valueOf(plandefinitionactiontimingrangelow.getValue()));
		}
		/******************** plandefinitionactiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingrangelowcomparator = plandefinitionactiontimingrangelow.getComparator();
		p.setPlnDfnActnTmgRngLwCmprtr(plandefinitionactiontimingrangelowcomparator.toCode());

		/******************** PlnDfn_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasCode()) {
			p.setPlnDfnActnTmgRngLwCd(String.valueOf(plandefinitionactiontimingrangelow.getCode()));
		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasUnit()) {
			p.setPlnDfnActnTmgRngLwUnt(String.valueOf(plandefinitionactiontimingrangelow.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(plandefinitionactiontimingrangelow.hasSystem()) {
			p.setPlnDfnActnTmgRngLwSys(String.valueOf(plandefinitionactiontimingrangelow.getSystem()));
		}
		/******************** plandefinitionactiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingrangehigh = plandefinitionactiontimingrange.getHigh();

		/******************** PlnDfn_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasValue()) {
			p.setPlnDfnActnTmgRngHiVl(String.valueOf(plandefinitionactiontimingrangehigh.getValue()));
		}
		/******************** plandefinitionactiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingrangehighcomparator = plandefinitionactiontimingrangehigh.getComparator();
		p.setPlnDfnActnTmgRngHiCmprtr(plandefinitionactiontimingrangehighcomparator.toCode());

		/******************** PlnDfn_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasCode()) {
			p.setPlnDfnActnTmgRngHiCd(String.valueOf(plandefinitionactiontimingrangehigh.getCode()));
		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasUnit()) {
			p.setPlnDfnActnTmgRngHiUnt(String.valueOf(plandefinitionactiontimingrangehigh.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(plandefinitionactiontimingrangehigh.hasSystem()) {
			p.setPlnDfnActnTmgRngHiSys(String.valueOf(plandefinitionactiontimingrangehigh.getSystem()));
		}
		/******************** PlnDfn_Actn_Transform ********************************************************************************/
		if(plandefinitionaction.hasTransform()) {
			p.setPlnDfnActnTransform(String.valueOf(plandefinitionaction.getTransform()));
		}
		/******************** plandefinitionactiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontimingduration = plandefinitionaction.getTimingDuration();

		/******************** PlnDfn_Actn_TmgDuration_Vl ********************************************************************************/
		if(plandefinitionactiontimingduration.hasValue()) {
			p.setPlnDfnActnTmgDurationVl(String.valueOf(plandefinitionactiontimingduration.getValue()));
		}
		/******************** plandefinitionactiontimingdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionactiontimingdurationcomparator = plandefinitionactiontimingduration.getComparator();
		p.setPlnDfnActnTmgDurationCmprtr(plandefinitionactiontimingdurationcomparator.toCode());

		/******************** PlnDfn_Actn_TmgDuration_Cd ********************************************************************************/
		if(plandefinitionactiontimingduration.hasCode()) {
			p.setPlnDfnActnTmgDurationCd(String.valueOf(plandefinitionactiontimingduration.getCode()));
		}
		/******************** PlnDfn_Actn_TmgDuration_Unt ********************************************************************************/
		if(plandefinitionactiontimingduration.hasUnit()) {
			p.setPlnDfnActnTmgDurationUnt(String.valueOf(plandefinitionactiontimingduration.getUnit()));
		}
		/******************** PlnDfn_Actn_TmgDuration_Sys ********************************************************************************/
		if(plandefinitionactiontimingduration.hasSystem()) {
			p.setPlnDfnActnTmgDurationSys(String.valueOf(plandefinitionactiontimingduration.getSystem()));
		}
		/******************** plandefinitionactioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent plandefinitionactioncondition = plandefinitionaction.getConditionFirstRep();

		/******************** plandefinitionactionconditionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactionconditionexpression = plandefinitionactioncondition.getExpression();

		/******************** PlnDfn_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(plandefinitionactionconditionexpression.hasName()) {
			p.setPlnDfnActnCndtnExprsnNm(String.valueOf(plandefinitionactionconditionexpression.getName()));
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(plandefinitionactionconditionexpression.hasReference()) {
			p.setPlnDfnActnCndtnExprsnRfrnc(String.valueOf(plandefinitionactionconditionexpression.getReference()));
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(plandefinitionactionconditionexpression.hasLanguage()) {
			p.setPlnDfnActnCndtnExprsnLnguage(String.valueOf(plandefinitionactionconditionexpression.getLanguage()));
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(plandefinitionactionconditionexpression.hasDescription()) {
			p.setPlnDfnActnCndtnExprsnDscrptn(String.valueOf(plandefinitionactionconditionexpression.getDescription()));
		}
		/******************** plandefinitionactionconditionkind ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionConditionKind plandefinitionactionconditionkind = plandefinitionactioncondition.getKind();
		p.setPlnDfnActnCndtnKind(plandefinitionactionconditionkind.toCode());

		/******************** plandefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier plandefinitionidentifier = plandefinition.getIdentifierFirstRep();

		/******************** PlnDfn_Id_Vl ********************************************************************************/
		if(plandefinitionidentifier.hasValue()) {
			p.setPlnDfnIdVl(String.valueOf(plandefinitionidentifier.getValue()));
		}
		/******************** plandefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionidentifiertype = plandefinitionidentifier.getType();

		/******************** PlnDfn_Id_Typ_Txt ********************************************************************************/
		if(plandefinitionidentifiertype.hasText()) {
			p.setPlnDfnIdTypTxt(String.valueOf(plandefinitionidentifiertype.getText()));
		}
		/******************** plandefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionidentifiertypecoding = plandefinitionidentifiertype.getCodingFirstRep();

		/******************** PlnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionidentifiertypecoding.hasVersion()) {
			p.setPlnDfnIdTypCdgVrsn(String.valueOf(plandefinitionidentifiertypecoding.getVersion()));
		}
		/******************** PlnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(plandefinitionidentifiertypecoding.hasDisplay()) {
			p.setPlnDfnIdTypCdgDsply(String.valueOf(plandefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** PlnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(plandefinitionidentifiertypecoding.hasCode()) {
			p.setPlnDfnIdTypCdgCd(String.valueOf(plandefinitionidentifiertypecoding.getCode()));
		}
		/******************** PlnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionidentifiertypecoding.hasUserSelected()) {
			p.setPlnDfnIdTypCdgUsrSltd(String.valueOf(plandefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** PlnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(plandefinitionidentifiertypecoding.hasSystem()) {
			p.setPlnDfnIdTypCdgSys(String.valueOf(plandefinitionidentifiertypecoding.getSystem()));
		}
		/******************** plandefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionidentifierperiod = plandefinitionidentifier.getPeriod();

		/******************** PlnDfn_Id_Prd_Strt ********************************************************************************/
		if(plandefinitionidentifierperiod.hasStart()) {
			p.setPlnDfnIdPrdStrt(String.valueOf(plandefinitionidentifierperiod.getStart()));
		}
		/******************** PlnDfn_Id_Prd_End ********************************************************************************/
		if(plandefinitionidentifierperiod.hasEnd()) {
			p.setPlnDfnIdPrdEnd(String.valueOf(plandefinitionidentifierperiod.getEnd()));
		}
		/******************** PlnDfn_Id_Assigner ********************************************************************************/
		if(plandefinitionidentifier.hasAssigner()) {
			p.setPlnDfnIdAssigner(String.valueOf(plandefinitionidentifier.getAssigner()));
		}
		/******************** PlnDfn_Id_Sys ********************************************************************************/
		if(plandefinitionidentifier.hasSystem()) {
			p.setPlnDfnIdSys(String.valueOf(plandefinitionidentifier.getSystem()));
		}
		/******************** plandefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse plandefinitionidentifieruse = plandefinitionidentifier.getUse();
		p.setPlnDfnIdUse(plandefinitionidentifieruse.toCode());

		/******************** PlnDfn_Copyright ********************************************************************************/
		if(plandefinition.hasCopyright()) {
			p.setPlnDfnCopyright(String.valueOf(plandefinition.getCopyright()));
		}
		/******************** plandefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiontopic = plandefinition.getTopicFirstRep();

		/******************** PlnDfn_Topic_Txt ********************************************************************************/
		if(plandefinitiontopic.hasText()) {
			p.setPlnDfnTopicTxt(String.valueOf(plandefinitiontopic.getText()));
		}
		/******************** plandefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiontopiccoding = plandefinitiontopic.getCodingFirstRep();

		/******************** PlnDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(plandefinitiontopiccoding.hasVersion()) {
			p.setPlnDfnTopicCdgVrsn(String.valueOf(plandefinitiontopiccoding.getVersion()));
		}
		/******************** PlnDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(plandefinitiontopiccoding.hasDisplay()) {
			p.setPlnDfnTopicCdgDsply(String.valueOf(plandefinitiontopiccoding.getDisplay()));
		}
		/******************** PlnDfn_Topic_Cdg_Cd ********************************************************************************/
		if(plandefinitiontopiccoding.hasCode()) {
			p.setPlnDfnTopicCdgCd(String.valueOf(plandefinitiontopiccoding.getCode()));
		}
		/******************** PlnDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitiontopiccoding.hasUserSelected()) {
			p.setPlnDfnTopicCdgUsrSltd(String.valueOf(plandefinitiontopiccoding.getUserSelected()));
		}
		/******************** PlnDfn_Topic_Cdg_Sys ********************************************************************************/
		if(plandefinitiontopiccoding.hasSystem()) {
			p.setPlnDfnTopicCdgSys(String.valueOf(plandefinitiontopiccoding.getSystem()));
		}
		/******************** PlnDfn_LastReviewDt ********************************************************************************/
		if(plandefinition.hasLastReviewDate()) {
			p.setPlnDfnLastReviewDt(String.valueOf(plandefinition.getLastReviewDate()));
		}
		/******************** PlnDfn_ApprovalDt ********************************************************************************/
		if(plandefinition.hasApprovalDate()) {
			p.setPlnDfnApprovalDt(String.valueOf(plandefinition.getApprovalDate()));
		}
		/******************** plandefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitioneditor = plandefinition.getEditorFirstRep();

		/******************** PlnDfn_Editor_Nm ********************************************************************************/
		if(plandefinitioneditor.hasName()) {
			p.setPlnDfnEditorNm(String.valueOf(plandefinitioneditor.getName()));
		}
		/******************** plandefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitioneditortelecom = plandefinitioneditor.getTelecomFirstRep();

		/******************** PlnDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(plandefinitioneditortelecom.hasValue()) {
			p.setPlnDfnEditorTlcmVl(String.valueOf(plandefinitioneditortelecom.getValue()));
		}
		/******************** plandefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioneditortelecomperiod = plandefinitioneditortelecom.getPeriod();

		/******************** PlnDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(plandefinitioneditortelecomperiod.hasStart()) {
			p.setPlnDfnEditorTlcmPrdStrt(String.valueOf(plandefinitioneditortelecomperiod.getStart()));
		}
		/******************** PlnDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(plandefinitioneditortelecomperiod.hasEnd()) {
			p.setPlnDfnEditorTlcmPrdEnd(String.valueOf(plandefinitioneditortelecomperiod.getEnd()));
		}
		/******************** plandefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem plandefinitioneditortelecomsystem = plandefinitioneditortelecom.getSystem();
		p.setPlnDfnEditorTlcmSys(plandefinitioneditortelecomsystem.toCode());

		/******************** plandefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse plandefinitioneditortelecomuse = plandefinitioneditortelecom.getUse();
		p.setPlnDfnEditorTlcmUse(plandefinitioneditortelecomuse.toCode());

		/******************** PlnDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(plandefinitioneditortelecom.hasRank()) {
			p.setPlnDfnEditorTlcmRnk(String.valueOf(plandefinitioneditortelecom.getRank()));
		}
		/******************** PlnDfn_Usg ********************************************************************************/
		if(plandefinition.hasUsage()) {
			p.setPlnDfnUsg(String.valueOf(plandefinition.getUsage()));
		}
		/******************** plandefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact plandefinitionrelatedartifact = plandefinition.getRelatedArtifactFirstRep();

		/******************** PlnDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(plandefinitionrelatedartifact.hasResource()) {
			p.setPlnDfnRltedArtfctRsrc(String.valueOf(plandefinitionrelatedartifact.getResource()));
		}
		/******************** plandefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType plandefinitionrelatedartifacttype = plandefinitionrelatedartifact.getType();
		p.setPlnDfnRltedArtfctTyp(plandefinitionrelatedartifacttype.toCode());

		/******************** plandefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitionrelatedartifactdocument = plandefinitionrelatedartifact.getDocument();

		/******************** PlnDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasSize()) {
			p.setPlnDfnRltedArtfctDocSz(String.valueOf(plandefinitionrelatedartifactdocument.getSize()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasLanguage()) {
			p.setPlnDfnRltedArtfctDocLnguage(String.valueOf(plandefinitionrelatedartifactdocument.getLanguage()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasContentType()) {
			p.setPlnDfnRltedArtfctDocCntntTyp(String.valueOf(plandefinitionrelatedartifactdocument.getContentType()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasTitle()) {
			p.setPlnDfnRltedArtfctDocTtl(String.valueOf(plandefinitionrelatedartifactdocument.getTitle()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasUrl()) {
			p.setPlnDfnRltedArtfctDocUrl(String.valueOf(plandefinitionrelatedartifactdocument.getUrl()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasData()) {
			p.setPlnDfnRltedArtfctDocData(String.valueOf(plandefinitionrelatedartifactdocument.getData()));
		}

		/******************** PlnDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasHash()) {
			p.setPlnDfnRltedArtfctDocHash(String.valueOf(plandefinitionrelatedartifactdocument.getHash()));
		}

		/******************** PlnDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(plandefinitionrelatedartifactdocument.hasCreation()) {
			p.setPlnDfnRltedArtfctDocCreation(String.valueOf(plandefinitionrelatedartifactdocument.getCreation()));
		}
		/******************** PlnDfn_RltedArtfct_Url ********************************************************************************/
		if(plandefinitionrelatedartifact.hasUrl()) {
			p.setPlnDfnRltedArtfctUrl(String.valueOf(plandefinitionrelatedartifact.getUrl()));
		}
		/******************** PlnDfn_RltedArtfct_Lbl ********************************************************************************/
		if(plandefinitionrelatedartifact.hasLabel()) {
			p.setPlnDfnRltedArtfctLbl(String.valueOf(plandefinitionrelatedartifact.getLabel()));
		}
		/******************** PlnDfn_RltedArtfct_Citation ********************************************************************************/
		if(plandefinitionrelatedartifact.hasCitation()) {
			p.setPlnDfnRltedArtfctCitation(String.valueOf(plandefinitionrelatedartifact.getCitation()));
		}
		/******************** plandefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext plandefinitionusecontext = plandefinition.getUseContextFirstRep();

		/******************** plandefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionusecontextcode = plandefinitionusecontext.getCode();

		/******************** PlnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(plandefinitionusecontextcode.hasVersion()) {
			p.setPlnDfnUseCntxtCdVrsn(String.valueOf(plandefinitionusecontextcode.getVersion()));
		}
		/******************** PlnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(plandefinitionusecontextcode.hasDisplay()) {
			p.setPlnDfnUseCntxtCdDsply(String.valueOf(plandefinitionusecontextcode.getDisplay()));
		}
		/******************** PlnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(plandefinitionusecontextcode.hasUserSelected()) {
			p.setPlnDfnUseCntxtCdUsrSltd(String.valueOf(plandefinitionusecontextcode.getUserSelected()));
		}
		/******************** PlnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(plandefinitionusecontextcode.hasSystem()) {
			p.setPlnDfnUseCntxtCdSys(String.valueOf(plandefinitionusecontextcode.getSystem()));
		}
		/******************** plandefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionusecontextvaluecodeableconcept = plandefinitionusecontext.getValueCodeableConcept();

		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconcept.hasText()) {
			p.setPlnDfnUseCntxtVlCdbleCncptTxt(String.valueOf(plandefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** plandefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionusecontextvaluecodeableconceptcoding = plandefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			p.setPlnDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			p.setPlnDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			p.setPlnDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			p.setPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(plandefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			p.setPlnDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(plandefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** plandefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluequantity = plandefinitionusecontext.getValueQuantity();

		/******************** PlnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(plandefinitionusecontextvaluequantity.hasValue()) {
			p.setPlnDfnUseCntxtVlQntyVl(String.valueOf(plandefinitionusecontextvaluequantity.getValue()));
		}
		/******************** plandefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionusecontextvaluequantitycomparator = plandefinitionusecontextvaluequantity.getComparator();
		p.setPlnDfnUseCntxtVlQntyCmprtr(plandefinitionusecontextvaluequantitycomparator.toCode());

		/******************** PlnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(plandefinitionusecontextvaluequantity.hasCode()) {
			p.setPlnDfnUseCntxtVlQntyCd(String.valueOf(plandefinitionusecontextvaluequantity.getCode()));
		}
		/******************** PlnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(plandefinitionusecontextvaluequantity.hasUnit()) {
			p.setPlnDfnUseCntxtVlQntyUnt(String.valueOf(plandefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** PlnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(plandefinitionusecontextvaluequantity.hasSystem()) {
			p.setPlnDfnUseCntxtVlQntySys(String.valueOf(plandefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** plandefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionusecontextvaluerange = plandefinitionusecontext.getValueRange();

		/******************** plandefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluerangelow = plandefinitionusecontextvaluerange.getLow();

		/******************** PlnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(plandefinitionusecontextvaluerangelow.hasValue()) {
			p.setPlnDfnUseCntxtVlRngLwVl(String.valueOf(plandefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** plandefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionusecontextvaluerangelowcomparator = plandefinitionusecontextvaluerangelow.getComparator();
		p.setPlnDfnUseCntxtVlRngLwCmprtr(plandefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** PlnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(plandefinitionusecontextvaluerangelow.hasCode()) {
			p.setPlnDfnUseCntxtVlRngLwCd(String.valueOf(plandefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(plandefinitionusecontextvaluerangelow.hasUnit()) {
			p.setPlnDfnUseCntxtVlRngLwUnt(String.valueOf(plandefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(plandefinitionusecontextvaluerangelow.hasSystem()) {
			p.setPlnDfnUseCntxtVlRngLwSys(String.valueOf(plandefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** plandefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluerangehigh = plandefinitionusecontextvaluerange.getHigh();

		/******************** PlnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(plandefinitionusecontextvaluerangehigh.hasValue()) {
			p.setPlnDfnUseCntxtVlRngHiVl(String.valueOf(plandefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** plandefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator plandefinitionusecontextvaluerangehighcomparator = plandefinitionusecontextvaluerangehigh.getComparator();
		p.setPlnDfnUseCntxtVlRngHiCmprtr(plandefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** PlnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(plandefinitionusecontextvaluerangehigh.hasCode()) {
			p.setPlnDfnUseCntxtVlRngHiCd(String.valueOf(plandefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(plandefinitionusecontextvaluerangehigh.hasUnit()) {
			p.setPlnDfnUseCntxtVlRngHiUnt(String.valueOf(plandefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(plandefinitionusecontextvaluerangehigh.hasSystem()) {
			p.setPlnDfnUseCntxtVlRngHiSys(String.valueOf(plandefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** PlnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(plandefinitionusecontext.hasValueReference()) {
			p.setPlnDfnUseCntxtVlRfrnc(String.valueOf(plandefinitionusecontext.getValueReference()));
		}
		/******************** plandefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionjurisdiction = plandefinition.getJurisdictionFirstRep();

		/******************** PlnDfn_Jrsdctn_Txt ********************************************************************************/
		if(plandefinitionjurisdiction.hasText()) {
			p.setPlnDfnJrsdctnTxt(String.valueOf(plandefinitionjurisdiction.getText()));
		}
		/******************** plandefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionjurisdictioncoding = plandefinitionjurisdiction.getCodingFirstRep();

		/******************** PlnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(plandefinitionjurisdictioncoding.hasVersion()) {
			p.setPlnDfnJrsdctnCdgVrsn(String.valueOf(plandefinitionjurisdictioncoding.getVersion()));
		}
		/******************** PlnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(plandefinitionjurisdictioncoding.hasDisplay()) {
			p.setPlnDfnJrsdctnCdgDsply(String.valueOf(plandefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** PlnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(plandefinitionjurisdictioncoding.hasCode()) {
			p.setPlnDfnJrsdctnCdgCd(String.valueOf(plandefinitionjurisdictioncoding.getCode()));
		}
		/******************** PlnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(plandefinitionjurisdictioncoding.hasUserSelected()) {
			p.setPlnDfnJrsdctnCdgUsrSltd(String.valueOf(plandefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** PlnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(plandefinitionjurisdictioncoding.hasSystem()) {
			p.setPlnDfnJrsdctnCdgSys(String.valueOf(plandefinitionjurisdictioncoding.getSystem()));
		}
		return p;
	}
}
