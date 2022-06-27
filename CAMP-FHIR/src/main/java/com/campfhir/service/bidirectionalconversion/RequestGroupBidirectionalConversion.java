package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RequestGroup;
public class RequestGroupBidirectionalConversion 
{
	public RequestGroup RequestGroups(org.hl7.fhir.r4.model.RequestGroup requestgroup) throws ParseException
	{
		 main.java.com.campfhir.model.RequestGroup r = new  main.java.com.campfhir.model.RequestGroup();

		/******************** id ********************************************************************************/
		requestgroup.setId(r.getId());

		/******************** requestgrouppriority ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestPriority requestgrouppriority = requestgroup.getPriority();
		r.setRqstGrpPriority(requestgrouppriority.toCode());

		/******************** requestgroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupcode = requestgroup.getCode();

		/******************** RqstGrp_Cd_Txt ********************************************************************************/
		if(requestgroupcode.hasText()) {
			r.setRqstGrpCdTxt(String.valueOf(requestgroupcode.getText()));
		}
		/******************** requestgroupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupcodecoding = requestgroupcode.getCodingFirstRep();

		/******************** RqstGrp_Cd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupcodecoding.hasVersion()) {
			r.setRqstGrpCdCdgVrsn(String.valueOf(requestgroupcodecoding.getVersion()));
		}
		/******************** RqstGrp_Cd_Cdg_Dsply ********************************************************************************/
		if(requestgroupcodecoding.hasDisplay()) {
			r.setRqstGrpCdCdgDsply(String.valueOf(requestgroupcodecoding.getDisplay()));
		}
		/******************** RqstGrp_Cd_Cdg_Cd ********************************************************************************/
		if(requestgroupcodecoding.hasCode()) {
			r.setRqstGrpCdCdgCd(String.valueOf(requestgroupcodecoding.getCode()));
		}
		/******************** RqstGrp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupcodecoding.hasUserSelected()) {
			r.setRqstGrpCdCdgUsrSltd(String.valueOf(requestgroupcodecoding.getUserSelected()));
		}
		/******************** RqstGrp_Cd_Cdg_Sys ********************************************************************************/
		if(requestgroupcodecoding.hasSystem()) {
			r.setRqstGrpCdCdgSys(String.valueOf(requestgroupcodecoding.getSystem()));
		}
		/******************** RqstGrp_Enc ********************************************************************************/
		if(requestgroup.hasEncounter()) {
			r.setRqstGrpEnc(String.valueOf(requestgroup.getEncounter()));
		}
		/******************** RqstGrp_Sbjct ********************************************************************************/
		if(requestgroup.hasSubject()) {
			r.setRqstGrpSbjct(String.valueOf(requestgroup.getSubject()));
		}
		/******************** requestgroupstatus ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestStatus requestgroupstatus = requestgroup.getStatus();
		r.setRqstGrpSts(requestgroupstatus.toCode());

		/******************** RqstGrp_BasedOn ********************************************************************************/
		if(requestgroup.hasBasedOn()) {
			r.setRqstGrpBasedOn(String.valueOf(requestgroup.getBasedOnFirstRep()));
		}
		/******************** requestgroupnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation requestgroupnote = requestgroup.getNoteFirstRep();

		/******************** RqstGrp_Nt_Time ********************************************************************************/
		if(requestgroupnote.hasTime()) {
			r.setRqstGrpNtTime(String.valueOf(requestgroupnote.getTime()));
		}
		/******************** RqstGrp_Nt_Txt ********************************************************************************/
		if(requestgroupnote.hasText()) {
			r.setRqstGrpNtTxt(String.valueOf(requestgroupnote.getText()));
		}
		/******************** RqstGrp_Nt_AthrRfrnc ********************************************************************************/
		if(requestgroupnote.hasAuthorReference()) {
			r.setRqstGrpNtAthrRfrnc(String.valueOf(requestgroupnote.getAuthorReference()));
		}
		/******************** RqstGrp_Nt_AthrStrgTyp ********************************************************************************/
		if(requestgroupnote.hasAuthorStringType()) {
			r.setRqstGrpNtAthrStrgTyp(String.valueOf(requestgroupnote.getAuthorStringType()));
		}
		/******************** RqstGrp_AthredOn ********************************************************************************/
		if(requestgroup.hasAuthoredOn()) {
			r.setRqstGrpAthredOn(String.valueOf(requestgroup.getAuthoredOn()));
		}
		/******************** RqstGrp_Athr ********************************************************************************/
		if(requestgroup.hasAuthor()) {
			r.setRqstGrpAthr(String.valueOf(requestgroup.getAuthor()));
		}
		/******************** requestgroupintent ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestIntent requestgroupintent = requestgroup.getIntent();
		r.setRqstGrpIntent(requestgroupintent.toCode());

		/******************** requestgroupgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier requestgroupgroupidentifier = requestgroup.getGroupIdentifier();

		/******************** RqstGrp_GrpId_Vl ********************************************************************************/
		if(requestgroupgroupidentifier.hasValue()) {
			r.setRqstGrpGrpIdVl(String.valueOf(requestgroupgroupidentifier.getValue()));
		}
		/******************** requestgroupgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupgroupidentifiertype = requestgroupgroupidentifier.getType();

		/******************** RqstGrp_GrpId_Typ_Txt ********************************************************************************/
		if(requestgroupgroupidentifiertype.hasText()) {
			r.setRqstGrpGrpIdTypTxt(String.valueOf(requestgroupgroupidentifiertype.getText()));
		}
		/******************** requestgroupgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupgroupidentifiertypecoding = requestgroupgroupidentifiertype.getCodingFirstRep();

		/******************** RqstGrp_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(requestgroupgroupidentifiertypecoding.hasVersion()) {
			r.setRqstGrpGrpIdTypCdgVrsn(String.valueOf(requestgroupgroupidentifiertypecoding.getVersion()));
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(requestgroupgroupidentifiertypecoding.hasDisplay()) {
			r.setRqstGrpGrpIdTypCdgDsply(String.valueOf(requestgroupgroupidentifiertypecoding.getDisplay()));
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(requestgroupgroupidentifiertypecoding.hasCode()) {
			r.setRqstGrpGrpIdTypCdgCd(String.valueOf(requestgroupgroupidentifiertypecoding.getCode()));
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupgroupidentifiertypecoding.hasUserSelected()) {
			r.setRqstGrpGrpIdTypCdgUsrSltd(String.valueOf(requestgroupgroupidentifiertypecoding.getUserSelected()));
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(requestgroupgroupidentifiertypecoding.hasSystem()) {
			r.setRqstGrpGrpIdTypCdgSys(String.valueOf(requestgroupgroupidentifiertypecoding.getSystem()));
		}
		/******************** requestgroupgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupgroupidentifierperiod = requestgroupgroupidentifier.getPeriod();

		/******************** RqstGrp_GrpId_Prd_Strt ********************************************************************************/
		if(requestgroupgroupidentifierperiod.hasStart()) {
			r.setRqstGrpGrpIdPrdStrt(String.valueOf(requestgroupgroupidentifierperiod.getStart()));
		}
		/******************** RqstGrp_GrpId_Prd_End ********************************************************************************/
		if(requestgroupgroupidentifierperiod.hasEnd()) {
			r.setRqstGrpGrpIdPrdEnd(String.valueOf(requestgroupgroupidentifierperiod.getEnd()));
		}
		/******************** RqstGrp_GrpId_Assigner ********************************************************************************/
		if(requestgroupgroupidentifier.hasAssigner()) {
			r.setRqstGrpGrpIdAssigner(String.valueOf(requestgroupgroupidentifier.getAssigner()));
		}
		/******************** RqstGrp_GrpId_Sys ********************************************************************************/
		if(requestgroupgroupidentifier.hasSystem()) {
			r.setRqstGrpGrpIdSys(String.valueOf(requestgroupgroupidentifier.getSystem()));
		}
		/******************** requestgroupgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse requestgroupgroupidentifieruse = requestgroupgroupidentifier.getUse();
		r.setRqstGrpGrpIdUse(requestgroupgroupidentifieruse.toCode());

		/******************** requestgroupaction ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent requestgroupaction = requestgroup.getActionFirstRep();

		/******************** RqstGrp_Actn_Rsrc ********************************************************************************/
		if(requestgroupaction.hasResource()) {
			r.setRqstGrpActnRsrc(String.valueOf(requestgroupaction.getResource()));
		}
		/******************** requestgroupactionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestPriority requestgroupactionpriority = requestgroupaction.getPriority();
		r.setRqstGrpActnPriority(requestgroupactionpriority.toCode());

		/******************** requestgroupactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactiontype = requestgroupaction.getType();

		/******************** RqstGrp_Actn_Typ_Txt ********************************************************************************/
		if(requestgroupactiontype.hasText()) {
			r.setRqstGrpActnTypTxt(String.valueOf(requestgroupactiontype.getText()));
		}
		/******************** requestgroupactiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupactiontypecoding = requestgroupactiontype.getCodingFirstRep();

		/******************** RqstGrp_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(requestgroupactiontypecoding.hasVersion()) {
			r.setRqstGrpActnTypCdgVrsn(String.valueOf(requestgroupactiontypecoding.getVersion()));
		}
		/******************** RqstGrp_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(requestgroupactiontypecoding.hasDisplay()) {
			r.setRqstGrpActnTypCdgDsply(String.valueOf(requestgroupactiontypecoding.getDisplay()));
		}
		/******************** RqstGrp_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(requestgroupactiontypecoding.hasCode()) {
			r.setRqstGrpActnTypCdgCd(String.valueOf(requestgroupactiontypecoding.getCode()));
		}
		/******************** RqstGrp_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupactiontypecoding.hasUserSelected()) {
			r.setRqstGrpActnTypCdgUsrSltd(String.valueOf(requestgroupactiontypecoding.getUserSelected()));
		}
		/******************** RqstGrp_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(requestgroupactiontypecoding.hasSystem()) {
			r.setRqstGrpActnTypCdgSys(String.valueOf(requestgroupactiontypecoding.getSystem()));
		}
		/******************** RqstGrp_Actn_Ttl ********************************************************************************/
		if(requestgroupaction.hasTitle()) {
			r.setRqstGrpActnTtl(String.valueOf(requestgroupaction.getTitle()));
		}
		/******************** RqstGrp_Actn_Dscrptn ********************************************************************************/
		if(requestgroupaction.hasDescription()) {
			r.setRqstGrpActnDscrptn(String.valueOf(requestgroupaction.getDescription()));
		}
		/******************** requestgroupactioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactioncode = requestgroupaction.getCodeFirstRep();

		/******************** RqstGrp_Actn_Cd_Txt ********************************************************************************/
		if(requestgroupactioncode.hasText()) {
			r.setRqstGrpActnCdTxt(String.valueOf(requestgroupactioncode.getText()));
		}
		/******************** requestgroupactioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupactioncodecoding = requestgroupactioncode.getCodingFirstRep();

		/******************** RqstGrp_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupactioncodecoding.hasVersion()) {
			r.setRqstGrpActnCdCdgVrsn(String.valueOf(requestgroupactioncodecoding.getVersion()));
		}
		/******************** RqstGrp_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(requestgroupactioncodecoding.hasDisplay()) {
			r.setRqstGrpActnCdCdgDsply(String.valueOf(requestgroupactioncodecoding.getDisplay()));
		}
		/******************** RqstGrp_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(requestgroupactioncodecoding.hasCode()) {
			r.setRqstGrpActnCdCdgCd(String.valueOf(requestgroupactioncodecoding.getCode()));
		}
		/******************** RqstGrp_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupactioncodecoding.hasUserSelected()) {
			r.setRqstGrpActnCdCdgUsrSltd(String.valueOf(requestgroupactioncodecoding.getUserSelected()));
		}
		/******************** RqstGrp_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(requestgroupactioncodecoding.hasSystem()) {
			r.setRqstGrpActnCdCdgSys(String.valueOf(requestgroupactioncodecoding.getSystem()));
		}
		/******************** requestgroupactionprecheckbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionPrecheckBehavior requestgroupactionprecheckbehavior = requestgroupaction.getPrecheckBehavior();
		r.setRqstGrpActnPrecheckBehavior(requestgroupactionprecheckbehavior.toCode());

		/******************** requestgroupactionselectionbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionSelectionBehavior requestgroupactionselectionbehavior = requestgroupaction.getSelectionBehavior();
		r.setRqstGrpActnSelectionBehavior(requestgroupactionselectionbehavior.toCode());

		/******************** requestgroupactiongroupingbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionGroupingBehavior requestgroupactiongroupingbehavior = requestgroupaction.getGroupingBehavior();
		r.setRqstGrpActnGrpingBehavior(requestgroupactiongroupingbehavior.toCode());

		/******************** requestgroupactionrequiredbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionRequiredBehavior requestgroupactionrequiredbehavior = requestgroupaction.getRequiredBehavior();
		r.setRqstGrpActnRequiredBehavior(requestgroupactionrequiredbehavior.toCode());

		/******************** requestgroupactioncardinalitybehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionCardinalityBehavior requestgroupactioncardinalitybehavior = requestgroupaction.getCardinalityBehavior();
		r.setRqstGrpActnCardinalityBehavior(requestgroupactioncardinalitybehavior.toCode());

		/******************** requestgroupactiondocumentation ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact requestgroupactiondocumentation = requestgroupaction.getDocumentationFirstRep();

		/******************** RqstGrp_Actn_Docation_Rsrc ********************************************************************************/
		if(requestgroupactiondocumentation.hasResource()) {
			r.setRqstGrpActnDocationRsrc(String.valueOf(requestgroupactiondocumentation.getResource()));
		}
		/******************** requestgroupactiondocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType requestgroupactiondocumentationtype = requestgroupactiondocumentation.getType();
		r.setRqstGrpActnDocationTyp(requestgroupactiondocumentationtype.toCode());

		/******************** requestgroupactiondocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment requestgroupactiondocumentationdocument = requestgroupactiondocumentation.getDocument();

		/******************** RqstGrp_Actn_Docation_Doc_Sz ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasSize()) {
			r.setRqstGrpActnDocationDocSz(String.valueOf(requestgroupactiondocumentationdocument.getSize()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasLanguage()) {
			r.setRqstGrpActnDocationDocLnguage(String.valueOf(requestgroupactiondocumentationdocument.getLanguage()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasContentType()) {
			r.setRqstGrpActnDocationDocCntntTyp(String.valueOf(requestgroupactiondocumentationdocument.getContentType()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasTitle()) {
			r.setRqstGrpActnDocationDocTtl(String.valueOf(requestgroupactiondocumentationdocument.getTitle()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Url ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasUrl()) {
			r.setRqstGrpActnDocationDocUrl(String.valueOf(requestgroupactiondocumentationdocument.getUrl()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Data ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasData()) {
			r.setRqstGrpActnDocationDocData(String.valueOf(requestgroupactiondocumentationdocument.getData()));
		}

		/******************** RqstGrp_Actn_Docation_Doc_Hash ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasHash()) {
			r.setRqstGrpActnDocationDocHash(String.valueOf(requestgroupactiondocumentationdocument.getHash()));
		}

		/******************** RqstGrp_Actn_Docation_Doc_Creation ********************************************************************************/
		if(requestgroupactiondocumentationdocument.hasCreation()) {
			r.setRqstGrpActnDocationDocCreation(String.valueOf(requestgroupactiondocumentationdocument.getCreation()));
		}
		/******************** RqstGrp_Actn_Docation_Url ********************************************************************************/
		if(requestgroupactiondocumentation.hasUrl()) {
			r.setRqstGrpActnDocationUrl(String.valueOf(requestgroupactiondocumentation.getUrl()));
		}
		/******************** RqstGrp_Actn_Docation_Lbl ********************************************************************************/
		if(requestgroupactiondocumentation.hasLabel()) {
			r.setRqstGrpActnDocationLbl(String.valueOf(requestgroupactiondocumentation.getLabel()));
		}
		/******************** RqstGrp_Actn_Docation_Citation ********************************************************************************/
		if(requestgroupactiondocumentation.hasCitation()) {
			r.setRqstGrpActnDocationCitation(String.valueOf(requestgroupactiondocumentation.getCitation()));
		}
		/******************** requestgroupactionrelatedaction ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent requestgroupactionrelatedaction = requestgroupaction.getRelatedActionFirstRep();

		/******************** requestgroupactionrelatedactionrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionRelationshipType requestgroupactionrelatedactionrelationship = requestgroupactionrelatedaction.getRelationship();
		r.setRqstGrpActnRltedActnRltnship(requestgroupactionrelatedactionrelationship.toCode());

		/******************** RqstGrp_Actn_RltedActn_ActnId ********************************************************************************/
		if(requestgroupactionrelatedaction.hasActionId()) {
			r.setRqstGrpActnRltedActnActnId(String.valueOf(requestgroupactionrelatedaction.getActionId()));
		}
		/******************** requestgroupactionrelatedactionoffduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactionrelatedactionoffduration = requestgroupactionrelatedaction.getOffsetDuration();

		/******************** RqstGrp_Actn_RltedActn_OffDuration_Vl ********************************************************************************/
		if(requestgroupactionrelatedactionoffduration.hasValue()) {
			r.setRqstGrpActnRltedActnOffDurationVl(String.valueOf(requestgroupactionrelatedactionoffduration.getValue()));
		}
		/******************** requestgroupactionrelatedactionoffdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactionrelatedactionoffdurationcomparator = requestgroupactionrelatedactionoffduration.getComparator();
		r.setRqstGrpActnRltedActnOffDurationCmprtr(requestgroupactionrelatedactionoffdurationcomparator.toCode());

		/******************** RqstGrp_Actn_RltedActn_OffDuration_Cd ********************************************************************************/
		if(requestgroupactionrelatedactionoffduration.hasCode()) {
			r.setRqstGrpActnRltedActnOffDurationCd(String.valueOf(requestgroupactionrelatedactionoffduration.getCode()));
		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Unt ********************************************************************************/
		if(requestgroupactionrelatedactionoffduration.hasUnit()) {
			r.setRqstGrpActnRltedActnOffDurationUnt(String.valueOf(requestgroupactionrelatedactionoffduration.getUnit()));
		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Sys ********************************************************************************/
		if(requestgroupactionrelatedactionoffduration.hasSystem()) {
			r.setRqstGrpActnRltedActnOffDurationSys(String.valueOf(requestgroupactionrelatedactionoffduration.getSystem()));
		}
		/******************** requestgroupactionrelatedactionoffrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactionrelatedactionoffrange = requestgroupactionrelatedaction.getOffsetRange();

		/******************** requestgroupactionrelatedactionoffrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactionrelatedactionoffrangelow = requestgroupactionrelatedactionoffrange.getLow();

		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangelow.hasValue()) {
			r.setRqstGrpActnRltedActnOffRngLwVl(String.valueOf(requestgroupactionrelatedactionoffrangelow.getValue()));
		}
		/******************** requestgroupactionrelatedactionoffrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactionrelatedactionoffrangelowcomparator = requestgroupactionrelatedactionoffrangelow.getComparator();
		r.setRqstGrpActnRltedActnOffRngLwCmprtr(requestgroupactionrelatedactionoffrangelowcomparator.toCode());

		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangelow.hasCode()) {
			r.setRqstGrpActnRltedActnOffRngLwCd(String.valueOf(requestgroupactionrelatedactionoffrangelow.getCode()));
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangelow.hasUnit()) {
			r.setRqstGrpActnRltedActnOffRngLwUnt(String.valueOf(requestgroupactionrelatedactionoffrangelow.getUnit()));
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangelow.hasSystem()) {
			r.setRqstGrpActnRltedActnOffRngLwSys(String.valueOf(requestgroupactionrelatedactionoffrangelow.getSystem()));
		}
		/******************** requestgroupactionrelatedactionoffrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactionrelatedactionoffrangehigh = requestgroupactionrelatedactionoffrange.getHigh();

		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangehigh.hasValue()) {
			r.setRqstGrpActnRltedActnOffRngHiVl(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getValue()));
		}
		/******************** requestgroupactionrelatedactionoffrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactionrelatedactionoffrangehighcomparator = requestgroupactionrelatedactionoffrangehigh.getComparator();
		r.setRqstGrpActnRltedActnOffRngHiCmprtr(requestgroupactionrelatedactionoffrangehighcomparator.toCode());

		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangehigh.hasCode()) {
			r.setRqstGrpActnRltedActnOffRngHiCd(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getCode()));
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangehigh.hasUnit()) {
			r.setRqstGrpActnRltedActnOffRngHiUnt(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getUnit()));
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(requestgroupactionrelatedactionoffrangehigh.hasSystem()) {
			r.setRqstGrpActnRltedActnOffRngHiSys(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getSystem()));
		}
		/******************** RqstGrp_Actn_Prefix ********************************************************************************/
		if(requestgroupaction.hasPrefix()) {
			r.setRqstGrpActnPrefix(String.valueOf(requestgroupaction.getPrefix()));
		}
		/******************** RqstGrp_Actn_TxtEquivalent ********************************************************************************/
		if(requestgroupaction.hasTextEquivalent()) {
			r.setRqstGrpActnTxtEquivalent(String.valueOf(requestgroupaction.getTextEquivalent()));
		}
		/******************** RqstGrp_Actn_Prtcpnt ********************************************************************************/
		if(requestgroupaction.hasParticipant()) {
			r.setRqstGrpActnPrtcpnt(String.valueOf(requestgroupaction.getParticipantFirstRep()));
		}
		/******************** RqstGrp_Actn_TmgDtTimeTyp ********************************************************************************/
		if(requestgroupaction.hasTimingDateTimeType()) {
			r.setRqstGrpActnTmgDtTimeTyp(String.valueOf(requestgroupaction.getTimingDateTimeType()));
		}
		/******************** requestgroupactiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupactiontimingperiod = requestgroupaction.getTimingPeriod();

		/******************** RqstGrp_Actn_TmgPrd_Strt ********************************************************************************/
		if(requestgroupactiontimingperiod.hasStart()) {
			r.setRqstGrpActnTmgPrdStrt(String.valueOf(requestgroupactiontimingperiod.getStart()));
		}
		/******************** RqstGrp_Actn_TmgPrd_End ********************************************************************************/
		if(requestgroupactiontimingperiod.hasEnd()) {
			r.setRqstGrpActnTmgPrdEnd(String.valueOf(requestgroupactiontimingperiod.getEnd()));
		}
		/******************** requestgroupactiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing requestgroupactiontimingtiming = requestgroupaction.getTimingTiming();

		/******************** requestgroupactiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactiontimingtimingcode = requestgroupactiontimingtiming.getCode();

		/******************** RqstGrp_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(requestgroupactiontimingtimingcode.hasText()) {
			r.setRqstGrpActnTmgTmgCdTxt(String.valueOf(requestgroupactiontimingtimingcode.getText()));
		}
		/******************** requestgroupactiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupactiontimingtimingcodecoding = requestgroupactiontimingtimingcode.getCodingFirstRep();

		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupactiontimingtimingcodecoding.hasVersion()) {
			r.setRqstGrpActnTmgTmgCdCdgVrsn(String.valueOf(requestgroupactiontimingtimingcodecoding.getVersion()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(requestgroupactiontimingtimingcodecoding.hasDisplay()) {
			r.setRqstGrpActnTmgTmgCdCdgDsply(String.valueOf(requestgroupactiontimingtimingcodecoding.getDisplay()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingcodecoding.hasCode()) {
			r.setRqstGrpActnTmgTmgCdCdgCd(String.valueOf(requestgroupactiontimingtimingcodecoding.getCode()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupactiontimingtimingcodecoding.hasUserSelected()) {
			r.setRqstGrpActnTmgTmgCdCdgUsrSltd(String.valueOf(requestgroupactiontimingtimingcodecoding.getUserSelected()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingcodecoding.hasSystem()) {
			r.setRqstGrpActnTmgTmgCdCdgSys(String.valueOf(requestgroupactiontimingtimingcodecoding.getSystem()));
		}
		/******************** requestgroupactiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent requestgroupactiontimingtimingrepeat = requestgroupactiontimingtiming.getRepeat();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasOffset()) {
			r.setRqstGrpActnTmgTmgRptOff(String.valueOf(requestgroupactiontimingtimingrepeat.getOffset()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasCount()) {
			r.setRqstGrpActnTmgTmgRptCnt(String.valueOf(requestgroupactiontimingtimingrepeat.getCount()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasFrequency()) {
			r.setRqstGrpActnTmgTmgRptFrqncy(String.valueOf(requestgroupactiontimingtimingrepeat.getFrequency()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasPeriod()) {
			r.setRqstGrpActnTmgTmgRptPrd(String.valueOf(requestgroupactiontimingtimingrepeat.getPeriod()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasDuration()) {
			r.setRqstGrpActnTmgTmgRptDuration(String.valueOf(requestgroupactiontimingtimingrepeat.getDuration()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactiontimingtimingrepeatboundsduration = requestgroupactiontimingtimingrepeat.getBoundsDuration();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasValue()) {
			r.setRqstGrpActnTmgTmgRptBndsDurationVl(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getValue()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingtimingrepeatboundsdurationcomparator = requestgroupactiontimingtimingrepeatboundsduration.getComparator();
		r.setRqstGrpActnTmgTmgRptBndsDurationCmprtr(requestgroupactiontimingtimingrepeatboundsdurationcomparator.toCode());

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasCode()) {
			r.setRqstGrpActnTmgTmgRptBndsDurationCd(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getCode()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasUnit()) {
			r.setRqstGrpActnTmgTmgRptBndsDurationUnt(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasSystem()) {
			r.setRqstGrpActnTmgTmgRptBndsDurationSys(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getSystem()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactiontimingtimingrepeatboundsrange = requestgroupactiontimingtimingrepeat.getBoundsRange();

		/******************** requestgroupactiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingtimingrepeatboundsrangelow = requestgroupactiontimingtimingrepeatboundsrange.getLow();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasValue()) {
			r.setRqstGrpActnTmgTmgRptBndsRngLwVl(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingtimingrepeatboundsrangelowcomparator = requestgroupactiontimingtimingrepeatboundsrangelow.getComparator();
		r.setRqstGrpActnTmgTmgRptBndsRngLwCmprtr(requestgroupactiontimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasCode()) {
			r.setRqstGrpActnTmgTmgRptBndsRngLwCd(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasUnit()) {
			r.setRqstGrpActnTmgTmgRptBndsRngLwUnt(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasSystem()) {
			r.setRqstGrpActnTmgTmgRptBndsRngLwSys(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingtimingrepeatboundsrangehigh = requestgroupactiontimingtimingrepeatboundsrange.getHigh();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasValue()) {
			r.setRqstGrpActnTmgTmgRptBndsRngHiVl(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingtimingrepeatboundsrangehighcomparator = requestgroupactiontimingtimingrepeatboundsrangehigh.getComparator();
		r.setRqstGrpActnTmgTmgRptBndsRngHiCmprtr(requestgroupactiontimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasCode()) {
			r.setRqstGrpActnTmgTmgRptBndsRngHiCd(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasUnit()) {
			r.setRqstGrpActnTmgTmgRptBndsRngHiUnt(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasSystem()) {
			r.setRqstGrpActnTmgTmgRptBndsRngHiSys(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupactiontimingtimingrepeatboundsperiod = requestgroupactiontimingtimingrepeat.getBoundsPeriod();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsperiod.hasStart()) {
			r.setRqstGrpActnTmgTmgRptBndsPrdStrt(String.valueOf(requestgroupactiontimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsperiod.hasEnd()) {
			r.setRqstGrpActnTmgTmgRptBndsPrdEnd(String.valueOf(requestgroupactiontimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasPeriodMax()) {
			r.setRqstGrpActnTmgTmgRptPrdMx(String.valueOf(requestgroupactiontimingtimingrepeat.getPeriodMax()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasDurationMax()) {
			r.setRqstGrpActnTmgTmgRptDurationMx(String.valueOf(requestgroupactiontimingtimingrepeat.getDurationMax()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasCountMax()) {
			r.setRqstGrpActnTmgTmgRptCntMx(String.valueOf(requestgroupactiontimingtimingrepeat.getCountMax()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasFrequencyMax()) {
			r.setRqstGrpActnTmgTmgRptFrqncyMx(String.valueOf(requestgroupactiontimingtimingrepeat.getFrequencyMax()));
		}
		/******************** requestgroupactiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime requestgroupactiontimingtimingrepeatdurationunit = requestgroupactiontimingtimingrepeat.getDurationUnit();
		r.setRqstGrpActnTmgTmgRptDurationUnt(requestgroupactiontimingtimingrepeatdurationunit.toCode());

		/******************** requestgroupactiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime requestgroupactiontimingtimingrepeatperiodunit = requestgroupactiontimingtimingrepeat.getPeriodUnit();
		r.setRqstGrpActnTmgTmgRptPrdUnt(requestgroupactiontimingtimingrepeatperiodunit.toCode());

		/******************** requestgroupactiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age requestgroupactiontimingage = requestgroupaction.getTimingAge();

		/******************** RqstGrp_Actn_TmgAge_Vl ********************************************************************************/
		if(requestgroupactiontimingage.hasValue()) {
			r.setRqstGrpActnTmgAgeVl(String.valueOf(requestgroupactiontimingage.getValue()));
		}
		/******************** requestgroupactiontimingagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingagecomparator = requestgroupactiontimingage.getComparator();
		r.setRqstGrpActnTmgAgeCmprtr(requestgroupactiontimingagecomparator.toCode());

		/******************** RqstGrp_Actn_TmgAge_Cd ********************************************************************************/
		if(requestgroupactiontimingage.hasCode()) {
			r.setRqstGrpActnTmgAgeCd(String.valueOf(requestgroupactiontimingage.getCode()));
		}
		/******************** RqstGrp_Actn_TmgAge_Unt ********************************************************************************/
		if(requestgroupactiontimingage.hasUnit()) {
			r.setRqstGrpActnTmgAgeUnt(String.valueOf(requestgroupactiontimingage.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgAge_Sys ********************************************************************************/
		if(requestgroupactiontimingage.hasSystem()) {
			r.setRqstGrpActnTmgAgeSys(String.valueOf(requestgroupactiontimingage.getSystem()));
		}
		/******************** requestgroupactiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactiontimingrange = requestgroupaction.getTimingRange();

		/******************** requestgroupactiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingrangelow = requestgroupactiontimingrange.getLow();

		/******************** RqstGrp_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasValue()) {
			r.setRqstGrpActnTmgRngLwVl(String.valueOf(requestgroupactiontimingrangelow.getValue()));
		}
		/******************** requestgroupactiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingrangelowcomparator = requestgroupactiontimingrangelow.getComparator();
		r.setRqstGrpActnTmgRngLwCmprtr(requestgroupactiontimingrangelowcomparator.toCode());

		/******************** RqstGrp_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasCode()) {
			r.setRqstGrpActnTmgRngLwCd(String.valueOf(requestgroupactiontimingrangelow.getCode()));
		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasUnit()) {
			r.setRqstGrpActnTmgRngLwUnt(String.valueOf(requestgroupactiontimingrangelow.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasSystem()) {
			r.setRqstGrpActnTmgRngLwSys(String.valueOf(requestgroupactiontimingrangelow.getSystem()));
		}
		/******************** requestgroupactiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingrangehigh = requestgroupactiontimingrange.getHigh();

		/******************** RqstGrp_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasValue()) {
			r.setRqstGrpActnTmgRngHiVl(String.valueOf(requestgroupactiontimingrangehigh.getValue()));
		}
		/******************** requestgroupactiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingrangehighcomparator = requestgroupactiontimingrangehigh.getComparator();
		r.setRqstGrpActnTmgRngHiCmprtr(requestgroupactiontimingrangehighcomparator.toCode());

		/******************** RqstGrp_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasCode()) {
			r.setRqstGrpActnTmgRngHiCd(String.valueOf(requestgroupactiontimingrangehigh.getCode()));
		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasUnit()) {
			r.setRqstGrpActnTmgRngHiUnt(String.valueOf(requestgroupactiontimingrangehigh.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasSystem()) {
			r.setRqstGrpActnTmgRngHiSys(String.valueOf(requestgroupactiontimingrangehigh.getSystem()));
		}
		/******************** requestgroupactiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactiontimingduration = requestgroupaction.getTimingDuration();

		/******************** RqstGrp_Actn_TmgDuration_Vl ********************************************************************************/
		if(requestgroupactiontimingduration.hasValue()) {
			r.setRqstGrpActnTmgDurationVl(String.valueOf(requestgroupactiontimingduration.getValue()));
		}
		/******************** requestgroupactiontimingdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingdurationcomparator = requestgroupactiontimingduration.getComparator();
		r.setRqstGrpActnTmgDurationCmprtr(requestgroupactiontimingdurationcomparator.toCode());

		/******************** RqstGrp_Actn_TmgDuration_Cd ********************************************************************************/
		if(requestgroupactiontimingduration.hasCode()) {
			r.setRqstGrpActnTmgDurationCd(String.valueOf(requestgroupactiontimingduration.getCode()));
		}
		/******************** RqstGrp_Actn_TmgDuration_Unt ********************************************************************************/
		if(requestgroupactiontimingduration.hasUnit()) {
			r.setRqstGrpActnTmgDurationUnt(String.valueOf(requestgroupactiontimingduration.getUnit()));
		}
		/******************** RqstGrp_Actn_TmgDuration_Sys ********************************************************************************/
		if(requestgroupactiontimingduration.hasSystem()) {
			r.setRqstGrpActnTmgDurationSys(String.valueOf(requestgroupactiontimingduration.getSystem()));
		}
		/******************** requestgroupactioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent requestgroupactioncondition = requestgroupaction.getConditionFirstRep();

		/******************** requestgroupactionconditionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression requestgroupactionconditionexpression = requestgroupactioncondition.getExpression();

		/******************** RqstGrp_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(requestgroupactionconditionexpression.hasName()) {
			r.setRqstGrpActnCndtnExprsnNm(String.valueOf(requestgroupactionconditionexpression.getName()));
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(requestgroupactionconditionexpression.hasReference()) {
			r.setRqstGrpActnCndtnExprsnRfrnc(String.valueOf(requestgroupactionconditionexpression.getReference()));
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(requestgroupactionconditionexpression.hasLanguage()) {
			r.setRqstGrpActnCndtnExprsnLnguage(String.valueOf(requestgroupactionconditionexpression.getLanguage()));
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(requestgroupactionconditionexpression.hasDescription()) {
			r.setRqstGrpActnCndtnExprsnDscrptn(String.valueOf(requestgroupactionconditionexpression.getDescription()));
		}
		/******************** requestgroupactionconditionkind ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionConditionKind requestgroupactionconditionkind = requestgroupactioncondition.getKind();
		r.setRqstGrpActnCndtnKind(requestgroupactionconditionkind.toCode());

		/******************** RqstGrp_Replaces ********************************************************************************/
		if(requestgroup.hasReplaces()) {
			r.setRqstGrpReplaces(String.valueOf(requestgroup.getReplacesFirstRep()));
		}
		/******************** requestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier requestgroupidentifier = requestgroup.getIdentifierFirstRep();

		/******************** RqstGrp_Id_Vl ********************************************************************************/
		if(requestgroupidentifier.hasValue()) {
			r.setRqstGrpIdVl(String.valueOf(requestgroupidentifier.getValue()));
		}
		/******************** requestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupidentifiertype = requestgroupidentifier.getType();

		/******************** RqstGrp_Id_Typ_Txt ********************************************************************************/
		if(requestgroupidentifiertype.hasText()) {
			r.setRqstGrpIdTypTxt(String.valueOf(requestgroupidentifiertype.getText()));
		}
		/******************** requestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupidentifiertypecoding = requestgroupidentifiertype.getCodingFirstRep();

		/******************** RqstGrp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(requestgroupidentifiertypecoding.hasVersion()) {
			r.setRqstGrpIdTypCdgVrsn(String.valueOf(requestgroupidentifiertypecoding.getVersion()));
		}
		/******************** RqstGrp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(requestgroupidentifiertypecoding.hasDisplay()) {
			r.setRqstGrpIdTypCdgDsply(String.valueOf(requestgroupidentifiertypecoding.getDisplay()));
		}
		/******************** RqstGrp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(requestgroupidentifiertypecoding.hasCode()) {
			r.setRqstGrpIdTypCdgCd(String.valueOf(requestgroupidentifiertypecoding.getCode()));
		}
		/******************** RqstGrp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupidentifiertypecoding.hasUserSelected()) {
			r.setRqstGrpIdTypCdgUsrSltd(String.valueOf(requestgroupidentifiertypecoding.getUserSelected()));
		}
		/******************** RqstGrp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(requestgroupidentifiertypecoding.hasSystem()) {
			r.setRqstGrpIdTypCdgSys(String.valueOf(requestgroupidentifiertypecoding.getSystem()));
		}
		/******************** requestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupidentifierperiod = requestgroupidentifier.getPeriod();

		/******************** RqstGrp_Id_Prd_Strt ********************************************************************************/
		if(requestgroupidentifierperiod.hasStart()) {
			r.setRqstGrpIdPrdStrt(String.valueOf(requestgroupidentifierperiod.getStart()));
		}
		/******************** RqstGrp_Id_Prd_End ********************************************************************************/
		if(requestgroupidentifierperiod.hasEnd()) {
			r.setRqstGrpIdPrdEnd(String.valueOf(requestgroupidentifierperiod.getEnd()));
		}
		/******************** RqstGrp_Id_Assigner ********************************************************************************/
		if(requestgroupidentifier.hasAssigner()) {
			r.setRqstGrpIdAssigner(String.valueOf(requestgroupidentifier.getAssigner()));
		}
		/******************** RqstGrp_Id_Sys ********************************************************************************/
		if(requestgroupidentifier.hasSystem()) {
			r.setRqstGrpIdSys(String.valueOf(requestgroupidentifier.getSystem()));
		}
		/******************** requestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse requestgroupidentifieruse = requestgroupidentifier.getUse();
		r.setRqstGrpIdUse(requestgroupidentifieruse.toCode());

		/******************** requestgroupreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupreasoncode = requestgroup.getReasonCodeFirstRep();

		/******************** RqstGrp_RsnCd_Txt ********************************************************************************/
		if(requestgroupreasoncode.hasText()) {
			r.setRqstGrpRsnCdTxt(String.valueOf(requestgroupreasoncode.getText()));
		}
		/******************** requestgroupreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupreasoncodecoding = requestgroupreasoncode.getCodingFirstRep();

		/******************** RqstGrp_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupreasoncodecoding.hasVersion()) {
			r.setRqstGrpRsnCdCdgVrsn(String.valueOf(requestgroupreasoncodecoding.getVersion()));
		}
		/******************** RqstGrp_RsnCd_Cdg_Dsply ********************************************************************************/
		if(requestgroupreasoncodecoding.hasDisplay()) {
			r.setRqstGrpRsnCdCdgDsply(String.valueOf(requestgroupreasoncodecoding.getDisplay()));
		}
		/******************** RqstGrp_RsnCd_Cdg_Cd ********************************************************************************/
		if(requestgroupreasoncodecoding.hasCode()) {
			r.setRqstGrpRsnCdCdgCd(String.valueOf(requestgroupreasoncodecoding.getCode()));
		}
		/******************** RqstGrp_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupreasoncodecoding.hasUserSelected()) {
			r.setRqstGrpRsnCdCdgUsrSltd(String.valueOf(requestgroupreasoncodecoding.getUserSelected()));
		}
		/******************** RqstGrp_RsnCd_Cdg_Sys ********************************************************************************/
		if(requestgroupreasoncodecoding.hasSystem()) {
			r.setRqstGrpRsnCdCdgSys(String.valueOf(requestgroupreasoncodecoding.getSystem()));
		}
		/******************** RqstGrp_RsnRfrnc ********************************************************************************/
		if(requestgroup.hasReasonReference()) {
			r.setRqstGrpRsnRfrnc(String.valueOf(requestgroup.getReasonReferenceFirstRep()));
		}
		return r;
	}
}
