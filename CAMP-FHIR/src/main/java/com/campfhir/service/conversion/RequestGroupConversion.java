package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RequestGroup;
public class RequestGroupConversion 
{
	public org.hl7.fhir.r4.model.RequestGroup RequestGroups(RequestGroup r) throws ParseException
	{
		org.hl7.fhir.r4.model.RequestGroup requestgroup = new org.hl7.fhir.r4.model.RequestGroup();

		/******************** id ********************************************************************************/
		requestgroup.setId(r.getId());

		/******************** requestgroupaction ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent requestgroupaction =  new org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent();
		requestgroup.addAction(requestgroupaction);

		/******************** requestgroupactioncardinalitybehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionCardinalityBehaviorEnumFactory requestgroupactioncardinalitybehavior =  new org.hl7.fhir.r4.model.RequestGroup.ActionCardinalityBehaviorEnumFactory();
		requestgroupaction.setCardinalityBehavior(requestgroupactioncardinalitybehavior.fromCode(r.getRqstGrpActnCardinalityBehavior()));

		/******************** requestgroupactioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroupaction.addCode(requestgroupactioncode);

		/******************** requestgroupactioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupactioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupactioncode.addCoding(requestgroupactioncodecoding);

		/******************** RqstGrp_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpActnCdCdgCd() != null) {
			requestgroupactioncodecoding.setCode(r.getRqstGrpActnCdCdgCd());
		}
		/******************** RqstGrp_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpActnCdCdgDsply() != null) {
			requestgroupactioncodecoding.setDisplay(r.getRqstGrpActnCdCdgDsply());
		}
		/******************** RqstGrp_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpActnCdCdgSys() != null) {
			requestgroupactioncodecoding.setSystem(r.getRqstGrpActnCdCdgSys());
		}
		/******************** RqstGrp_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpActnCdCdgUsrSltd() != null) {
			requestgroupactioncodecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpActnCdCdgUsrSltd()));
		}
		/******************** RqstGrp_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpActnCdCdgVrsn() != null) {
			requestgroupactioncodecoding.setVersion(r.getRqstGrpActnCdCdgVrsn());
		}
		/******************** RqstGrp_Actn_Cd_Txt ********************************************************************************/
		if(r.getRqstGrpActnCdTxt() != null) {
			requestgroupactioncode.setText(r.getRqstGrpActnCdTxt());
		}
		/******************** requestgroupactioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent requestgroupactioncondition =  new org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent();
		requestgroupaction.addCondition(requestgroupactioncondition);

		/******************** requestgroupactionconditionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression requestgroupactionconditionexpression =  new org.hl7.fhir.r4.model.Expression();
		requestgroupactioncondition.setExpression(requestgroupactionconditionexpression);

		/******************** RqstGrp_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnDscrptn() != null) {
			requestgroupactionconditionexpression.setDescription(r.getRqstGrpActnCndtnExprsnDscrptn());
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Exprsn ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnExprsn() != null) {
			requestgroupactionconditionexpression.setExpression(r.getRqstGrpActnCndtnExprsnExprsn());
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnLnguage() != null) {
			requestgroupactionconditionexpression.setLanguage(r.getRqstGrpActnCndtnExprsnLnguage());
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnNm() != null) {
			requestgroupactionconditionexpression.setName(r.getRqstGrpActnCndtnExprsnNm());
		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnRfrnc() != null) {
			requestgroupactionconditionexpression.setReference(r.getRqstGrpActnCndtnExprsnRfrnc());
		}
		/******************** requestgroupactionconditionkind ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionConditionKindEnumFactory requestgroupactionconditionkind =  new org.hl7.fhir.r4.model.RequestGroup.ActionConditionKindEnumFactory();
		requestgroupactioncondition.setKind(requestgroupactionconditionkind.fromCode(r.getRqstGrpActnCndtnKind()));

		/******************** RqstGrp_Actn_Dscrptn ********************************************************************************/
		if(r.getRqstGrpActnDscrptn() != null) {
			requestgroupaction.setDescription(r.getRqstGrpActnDscrptn());
		}
		/******************** requestgroupactiondocumentation ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact requestgroupactiondocumentation =  new org.hl7.fhir.r4.model.RelatedArtifact();
		requestgroupaction.addDocumentation(requestgroupactiondocumentation);

		/******************** RqstGrp_Actn_Docation_Citation ********************************************************************************/
		if(r.getRqstGrpActnDocationCitation() != null) {
			requestgroupactiondocumentation.setCitation(r.getRqstGrpActnDocationCitation());
		}
		/******************** RqstGrp_Actn_Docation_Dsply ********************************************************************************/
		if(r.getRqstGrpActnDocationDsply() != null) {
			requestgroupactiondocumentation.setDisplay(r.getRqstGrpActnDocationDsply());
		}
		/******************** requestgroupactiondocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment requestgroupactiondocumentationdocument =  new org.hl7.fhir.r4.model.Attachment();
		requestgroupactiondocumentation.setDocument(requestgroupactiondocumentationdocument);

		/******************** RqstGrp_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(r.getRqstGrpActnDocationDocCntntTyp() != null) {
			requestgroupactiondocumentationdocument.setContentType(r.getRqstGrpActnDocationDocCntntTyp());
		}
		/******************** RqstGrp_Actn_Docation_Doc_Creation ********************************************************************************/
		if(r.getRqstGrpActnDocationDocCreation() != null) {
			java.text.SimpleDateFormat RqstGrp_Actn_Docation_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Actn_Docation_Doc_Creationdate = RqstGrp_Actn_Docation_Doc_Creationsdf.parse(r.getRqstGrpActnDocationDocCreation());
			requestgroupactiondocumentationdocument.setCreation(RqstGrp_Actn_Docation_Doc_Creationdate);
		}
		/******************** RqstGrp_Actn_Docation_Doc_Data ********************************************************************************/
		if(r.getRqstGrpActnDocationDocData() != null) {
			requestgroupactiondocumentationdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRqstGrpActnDocationDocData()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Hash ********************************************************************************/
		if(r.getRqstGrpActnDocationDocHash() != null) {
			requestgroupactiondocumentationdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRqstGrpActnDocationDocHash()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(r.getRqstGrpActnDocationDocLnguage() != null) {
			requestgroupactiondocumentationdocument.setLanguage(r.getRqstGrpActnDocationDocLnguage());
		}
		/******************** RqstGrp_Actn_Docation_Doc_Sz ********************************************************************************/
		if(r.getRqstGrpActnDocationDocSz() != null) {
			requestgroupactiondocumentationdocument.setSize(Integer.parseInt(r.getRqstGrpActnDocationDocSz()));
		}
		/******************** RqstGrp_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(r.getRqstGrpActnDocationDocTtl() != null) {
			requestgroupactiondocumentationdocument.setTitle(r.getRqstGrpActnDocationDocTtl());
		}
		/******************** RqstGrp_Actn_Docation_Doc_Url ********************************************************************************/
		if(r.getRqstGrpActnDocationDocUrl() != null) {
			requestgroupactiondocumentationdocument.setUrl(r.getRqstGrpActnDocationDocUrl());
		}
		/******************** RqstGrp_Actn_Docation_Lbl ********************************************************************************/
		if(r.getRqstGrpActnDocationLbl() != null) {
			requestgroupactiondocumentation.setLabel(r.getRqstGrpActnDocationLbl());
		}
		/******************** RqstGrp_Actn_Docation_Rsrc ********************************************************************************/
		if(r.getRqstGrpActnDocationRsrc() != null) {
			requestgroupactiondocumentation.setResource(r.getRqstGrpActnDocationRsrc());
		}
		/******************** requestgroupactiondocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory requestgroupactiondocumentationtype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		requestgroupactiondocumentation.setType(requestgroupactiondocumentationtype.fromCode(r.getRqstGrpActnDocationTyp()));

		/******************** RqstGrp_Actn_Docation_Url ********************************************************************************/
		if(r.getRqstGrpActnDocationUrl() != null) {
			requestgroupactiondocumentation.setUrl(r.getRqstGrpActnDocationUrl());
		}
		/******************** requestgroupactiongroupingbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionGroupingBehaviorEnumFactory requestgroupactiongroupingbehavior =  new org.hl7.fhir.r4.model.RequestGroup.ActionGroupingBehaviorEnumFactory();
		requestgroupaction.setGroupingBehavior(requestgroupactiongroupingbehavior.fromCode(r.getRqstGrpActnGrpingBehavior()));

		/******************** RqstGrp_Actn_Prtcpnt ********************************************************************************/
		if(r.getRqstGrpActnPrtcpnt() != null) {
			requestgroupaction.addParticipant( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpActnPrtcpnt()));
		}
		/******************** requestgroupactionprecheckbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionPrecheckBehaviorEnumFactory requestgroupactionprecheckbehavior =  new org.hl7.fhir.r4.model.RequestGroup.ActionPrecheckBehaviorEnumFactory();
		requestgroupaction.setPrecheckBehavior(requestgroupactionprecheckbehavior.fromCode(r.getRqstGrpActnPrecheckBehavior()));

		/******************** RqstGrp_Actn_Prefix ********************************************************************************/
		if(r.getRqstGrpActnPrefix() != null) {
			requestgroupaction.setPrefix(r.getRqstGrpActnPrefix());
		}
		/******************** requestgroupactionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestPriorityEnumFactory requestgroupactionpriority =  new org.hl7.fhir.r4.model.RequestGroup.RequestPriorityEnumFactory();
		requestgroupaction.setPriority(requestgroupactionpriority.fromCode(r.getRqstGrpActnPriority()));

		/******************** requestgroupactionrelatedaction ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent requestgroupactionrelatedaction =  new org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent();
		requestgroupaction.addRelatedAction(requestgroupactionrelatedaction);

		/******************** RqstGrp_Actn_RltedActn_ActnId ********************************************************************************/
		if(r.getRqstGrpActnRltedActnActnId() != null) {
			requestgroupactionrelatedaction.setActionId(r.getRqstGrpActnRltedActnActnId());
		}
		/******************** requestgroupactionrelatedactionoffduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactionrelatedactionoffduration =  new org.hl7.fhir.r4.model.Duration();
		requestgroupactionrelatedaction.setOffset(requestgroupactionrelatedactionoffduration);

		/******************** requestgroupactionrelatedactionoffrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactionrelatedactionoffrange =  new org.hl7.fhir.r4.model.Range();
		requestgroupactionrelatedaction.setOffset(requestgroupactionrelatedactionoffrange);

		/******************** requestgroupactionrelatedactionoffrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactionrelatedactionoffrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		requestgroupactionrelatedactionoffrange.setHigh(requestgroupactionrelatedactionoffrangehigh);

		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiCd() != null) {
			requestgroupactionrelatedactionoffrangehigh.setCode(r.getRqstGrpActnRltedActnOffRngHiCd());
		}
		/******************** requestgroupactionrelatedactionoffrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory requestgroupactionrelatedactionoffrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		requestgroupactionrelatedactionoffrangehigh.setComparator(requestgroupactionrelatedactionoffrangehighcomparator.fromCode(r.getRqstGrpActnRltedActnOffRngHiCmprtr()));

		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiSys() != null) {
			requestgroupactionrelatedactionoffrangehigh.setSystem(r.getRqstGrpActnRltedActnOffRngHiSys());
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiUnt() != null) {
			requestgroupactionrelatedactionoffrangehigh.setUnit(r.getRqstGrpActnRltedActnOffRngHiUnt());
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiVl() != null) {
			requestgroupactionrelatedactionoffrangehigh.setValue(Double.parseDouble((r.getRqstGrpActnRltedActnOffRngHiVl())));
		}
		/******************** requestgroupactionrelatedactionoffrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactionrelatedactionoffrangelow =  new org.hl7.fhir.r4.model.Quantity();
		requestgroupactionrelatedactionoffrange.setLow(requestgroupactionrelatedactionoffrangelow);

		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwCd() != null) {
			requestgroupactionrelatedactionoffrangelow.setCode(r.getRqstGrpActnRltedActnOffRngLwCd());
		}
		/******************** requestgroupactionrelatedactionoffrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory requestgroupactionrelatedactionoffrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		requestgroupactionrelatedactionoffrangelow.setComparator(requestgroupactionrelatedactionoffrangelowcomparator.fromCode(r.getRqstGrpActnRltedActnOffRngLwCmprtr()));

		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwSys() != null) {
			requestgroupactionrelatedactionoffrangelow.setSystem(r.getRqstGrpActnRltedActnOffRngLwSys());
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwUnt() != null) {
			requestgroupactionrelatedactionoffrangelow.setUnit(r.getRqstGrpActnRltedActnOffRngLwUnt());
		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwVl() != null) {
			requestgroupactionrelatedactionoffrangelow.setValue(Double.parseDouble((r.getRqstGrpActnRltedActnOffRngLwVl())));
		}
		/******************** requestgroupactionrelatedactionrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionRelationshipTypeEnumFactory requestgroupactionrelatedactionrelationship =  new org.hl7.fhir.r4.model.RequestGroup.ActionRelationshipTypeEnumFactory();
		requestgroupactionrelatedaction.setRelationship(requestgroupactionrelatedactionrelationship.fromCode(r.getRqstGrpActnRltedActnRltnship()));

		/******************** requestgroupactionrequiredbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionRequiredBehaviorEnumFactory requestgroupactionrequiredbehavior =  new org.hl7.fhir.r4.model.RequestGroup.ActionRequiredBehaviorEnumFactory();
		requestgroupaction.setRequiredBehavior(requestgroupactionrequiredbehavior.fromCode(r.getRqstGrpActnRequiredBehavior()));

		/******************** RqstGrp_Actn_Rsrc ********************************************************************************/
		if(r.getRqstGrpActnRsrc() != null) {
			requestgroupaction.setResource( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpActnRsrc()));
		}
		/******************** requestgroupactionselectionbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionSelectionBehaviorEnumFactory requestgroupactionselectionbehavior =  new org.hl7.fhir.r4.model.RequestGroup.ActionSelectionBehaviorEnumFactory();
		requestgroupaction.setSelectionBehavior(requestgroupactionselectionbehavior.fromCode(r.getRqstGrpActnSelectionBehavior()));

		/******************** RqstGrp_Actn_TxtEquivalent ********************************************************************************/
		if(r.getRqstGrpActnTxtEquivalent() != null) {
			requestgroupaction.setTextEquivalent(r.getRqstGrpActnTxtEquivalent());
		}
		/******************** requestgroupactiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age requestgroupactiontimingage =  new org.hl7.fhir.r4.model.Age();
		requestgroupaction.setTiming(requestgroupactiontimingage);

		/******************** RqstGrp_Actn_TmgDtTimeTyp ********************************************************************************/
		if(r.getRqstGrpActnTmgDtTimeTyp() != null) {
			requestgroupaction.setTiming( new org.hl7.fhir.r4.model.DateTimeType(r.getRqstGrpActnTmgDtTimeTyp()));
		}
		/******************** requestgroupactiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactiontimingduration =  new org.hl7.fhir.r4.model.Duration();
		requestgroupaction.setTiming(requestgroupactiontimingduration);

		/******************** requestgroupactiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupactiontimingperiod =  new org.hl7.fhir.r4.model.Period();
		requestgroupaction.setTiming(requestgroupactiontimingperiod);

		/******************** RqstGrp_Actn_TmgPrd_End ********************************************************************************/
		if(r.getRqstGrpActnTmgPrdEnd() != null) {
			java.text.SimpleDateFormat RqstGrp_Actn_TmgPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Actn_TmgPrd_Enddate = RqstGrp_Actn_TmgPrd_Endsdf.parse(r.getRqstGrpActnTmgPrdEnd());
			requestgroupactiontimingperiod.setEnd(RqstGrp_Actn_TmgPrd_Enddate);
		}
		/******************** RqstGrp_Actn_TmgPrd_Strt ********************************************************************************/
		if(r.getRqstGrpActnTmgPrdStrt() != null) {
			java.text.SimpleDateFormat RqstGrp_Actn_TmgPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Actn_TmgPrd_Strtdate = RqstGrp_Actn_TmgPrd_Strtsdf.parse(r.getRqstGrpActnTmgPrdStrt());
			requestgroupactiontimingperiod.setStart(RqstGrp_Actn_TmgPrd_Strtdate);
		}
		/******************** requestgroupactiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactiontimingrange =  new org.hl7.fhir.r4.model.Range();
		requestgroupaction.setTiming(requestgroupactiontimingrange);

		/******************** requestgroupactiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		requestgroupactiontimingrange.setHigh(requestgroupactiontimingrangehigh);

		/******************** RqstGrp_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiCd() != null) {
			requestgroupactiontimingrangehigh.setCode(r.getRqstGrpActnTmgRngHiCd());
		}
		/******************** requestgroupactiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory requestgroupactiontimingrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		requestgroupactiontimingrangehigh.setComparator(requestgroupactiontimingrangehighcomparator.fromCode(r.getRqstGrpActnTmgRngHiCmprtr()));

		/******************** RqstGrp_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiSys() != null) {
			requestgroupactiontimingrangehigh.setSystem(r.getRqstGrpActnTmgRngHiSys());
		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiUnt() != null) {
			requestgroupactiontimingrangehigh.setUnit(r.getRqstGrpActnTmgRngHiUnt());
		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiVl() != null) {
			requestgroupactiontimingrangehigh.setValue(Double.parseDouble((r.getRqstGrpActnTmgRngHiVl())));
		}
		/******************** requestgroupactiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingrangelow =  new org.hl7.fhir.r4.model.Quantity();
		requestgroupactiontimingrange.setLow(requestgroupactiontimingrangelow);

		/******************** RqstGrp_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwCd() != null) {
			requestgroupactiontimingrangelow.setCode(r.getRqstGrpActnTmgRngLwCd());
		}
		/******************** requestgroupactiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory requestgroupactiontimingrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		requestgroupactiontimingrangelow.setComparator(requestgroupactiontimingrangelowcomparator.fromCode(r.getRqstGrpActnTmgRngLwCmprtr()));

		/******************** RqstGrp_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwSys() != null) {
			requestgroupactiontimingrangelow.setSystem(r.getRqstGrpActnTmgRngLwSys());
		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwUnt() != null) {
			requestgroupactiontimingrangelow.setUnit(r.getRqstGrpActnTmgRngLwUnt());
		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwVl() != null) {
			requestgroupactiontimingrangelow.setValue(Double.parseDouble((r.getRqstGrpActnTmgRngLwVl())));
		}
		/******************** requestgroupactiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing requestgroupactiontimingtiming =  new org.hl7.fhir.r4.model.Timing();
		requestgroupaction.setTiming(requestgroupactiontimingtiming);

		/******************** requestgroupactiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactiontimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroupactiontimingtiming.setCode(requestgroupactiontimingtimingcode);

		/******************** requestgroupactiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupactiontimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupactiontimingtimingcode.addCoding(requestgroupactiontimingtimingcodecoding);

		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgCd() != null) {
			requestgroupactiontimingtimingcodecoding.setCode(r.getRqstGrpActnTmgTmgCdCdgCd());
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgDsply() != null) {
			requestgroupactiontimingtimingcodecoding.setDisplay(r.getRqstGrpActnTmgTmgCdCdgDsply());
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgSys() != null) {
			requestgroupactiontimingtimingcodecoding.setSystem(r.getRqstGrpActnTmgTmgCdCdgSys());
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgUsrSltd() != null) {
			requestgroupactiontimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpActnTmgTmgCdCdgUsrSltd()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgVrsn() != null) {
			requestgroupactiontimingtimingcodecoding.setVersion(r.getRqstGrpActnTmgTmgCdCdgVrsn());
		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdTxt() != null) {
			requestgroupactiontimingtimingcode.setText(r.getRqstGrpActnTmgTmgCdTxt());
		}
		/******************** RqstGrp_Actn_TmgTmg_Evnt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat RqstGrp_Actn_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Actn_TmgTmg_Evntdate = RqstGrp_Actn_TmgTmg_Evntsdf.parse(r.getRqstGrpActnTmgTmgEvnt());
			requestgroupactiontimingtiming.addEvent(RqstGrp_Actn_TmgTmg_Evntdate);
		}
		/******************** requestgroupactiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent requestgroupactiontimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		requestgroupactiontimingtiming.setRepeat(requestgroupactiontimingtimingrepeat);

		/******************** requestgroupactiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactiontimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		requestgroupactiontimingtimingrepeat.setBounds(requestgroupactiontimingtimingrepeatboundsduration);

		/******************** requestgroupactiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupactiontimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		requestgroupactiontimingtimingrepeat.setBounds(requestgroupactiontimingtimingrepeatboundsperiod);

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Enddate = RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Endsdf.parse(r.getRqstGrpActnTmgTmgRptBndsPrdEnd());
			requestgroupactiontimingtimingrepeatboundsperiod.setEnd(RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strtdate = RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(r.getRqstGrpActnTmgTmgRptBndsPrdStrt());
			requestgroupactiontimingtimingrepeatboundsperiod.setStart(RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactiontimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		requestgroupactiontimingtimingrepeat.setBounds(requestgroupactiontimingtimingrepeatboundsrange);

		/******************** requestgroupactiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		requestgroupactiontimingtimingrepeatboundsrange.setHigh(requestgroupactiontimingtimingrepeatboundsrangehigh);

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiCd() != null) {
			requestgroupactiontimingtimingrepeatboundsrangehigh.setCode(r.getRqstGrpActnTmgTmgRptBndsRngHiCd());
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory requestgroupactiontimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		requestgroupactiontimingtimingrepeatboundsrangehigh.setComparator(requestgroupactiontimingtimingrepeatboundsrangehighcomparator.fromCode(r.getRqstGrpActnTmgTmgRptBndsRngHiCmprtr()));

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiSys() != null) {
			requestgroupactiontimingtimingrepeatboundsrangehigh.setSystem(r.getRqstGrpActnTmgTmgRptBndsRngHiSys());
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiUnt() != null) {
			requestgroupactiontimingtimingrepeatboundsrangehigh.setUnit(r.getRqstGrpActnTmgTmgRptBndsRngHiUnt());
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiVl() != null) {
			requestgroupactiontimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((r.getRqstGrpActnTmgTmgRptBndsRngHiVl())));
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		requestgroupactiontimingtimingrepeatboundsrange.setLow(requestgroupactiontimingtimingrepeatboundsrangelow);

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwCd() != null) {
			requestgroupactiontimingtimingrepeatboundsrangelow.setCode(r.getRqstGrpActnTmgTmgRptBndsRngLwCd());
		}
		/******************** requestgroupactiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory requestgroupactiontimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		requestgroupactiontimingtimingrepeatboundsrangelow.setComparator(requestgroupactiontimingtimingrepeatboundsrangelowcomparator.fromCode(r.getRqstGrpActnTmgTmgRptBndsRngLwCmprtr()));

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwSys() != null) {
			requestgroupactiontimingtimingrepeatboundsrangelow.setSystem(r.getRqstGrpActnTmgTmgRptBndsRngLwSys());
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwUnt() != null) {
			requestgroupactiontimingtimingrepeatboundsrangelow.setUnit(r.getRqstGrpActnTmgTmgRptBndsRngLwUnt());
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwVl() != null) {
			requestgroupactiontimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((r.getRqstGrpActnTmgTmgRptBndsRngLwVl())));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptCnt() != null) {
			requestgroupactiontimingtimingrepeat.setCount(Integer.parseInt(r.getRqstGrpActnTmgTmgRptCnt()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptCntMx() != null) {
			requestgroupactiontimingtimingrepeat.setCountMax(Integer.parseInt(r.getRqstGrpActnTmgTmgRptCntMx()));
		}
		/******************** requestgroupactiontimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory requestgroupactiontimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		requestgroupactiontimingtimingrepeat.addDayOfWeek(requestgroupactiontimingtimingrepeatdayofweek.fromCode(r.getRqstGrpActnTmgTmgRptDayOfWeek()));

		/******************** RqstGrp_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptDuration() != null) {
			requestgroupactiontimingtimingrepeat.setDuration(Double.parseDouble((r.getRqstGrpActnTmgTmgRptDuration())));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptDurationMx() != null) {
			requestgroupactiontimingtimingrepeat.setDurationMax(Double.parseDouble((r.getRqstGrpActnTmgTmgRptDurationMx())));
		}
		/******************** requestgroupactiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory requestgroupactiontimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		requestgroupactiontimingtimingrepeat.setDurationUnit(requestgroupactiontimingtimingrepeatdurationunit.fromCode(r.getRqstGrpActnTmgTmgRptDurationUnt()));

		/******************** RqstGrp_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptFrqncy() != null) {
			requestgroupactiontimingtimingrepeat.setFrequency(Integer.parseInt(r.getRqstGrpActnTmgTmgRptFrqncy()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptFrqncyMx() != null) {
			requestgroupactiontimingtimingrepeat.setFrequencyMax(Integer.parseInt(r.getRqstGrpActnTmgTmgRptFrqncyMx()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptOff() != null) {
			requestgroupactiontimingtimingrepeat.setOffset(Integer.parseInt(r.getRqstGrpActnTmgTmgRptOff()));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptPrd() != null) {
			requestgroupactiontimingtimingrepeat.setPeriod(Double.parseDouble((r.getRqstGrpActnTmgTmgRptPrd())));
		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptPrdMx() != null) {
			requestgroupactiontimingtimingrepeat.setPeriodMax(Double.parseDouble((r.getRqstGrpActnTmgTmgRptPrdMx())));
		}
		/******************** requestgroupactiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory requestgroupactiontimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		requestgroupactiontimingtimingrepeat.setPeriodUnit(requestgroupactiontimingtimingrepeatperiodunit.fromCode(r.getRqstGrpActnTmgTmgRptPrdUnt()));

		/******************** RqstGrp_Actn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptTimeOfDay() != null) {
			requestgroupactiontimingtimingrepeat.addTimeOfDay(r.getRqstGrpActnTmgTmgRptTimeOfDay());
		}
		/******************** requestgroupactiontimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory requestgroupactiontimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		requestgroupactiontimingtimingrepeat.addWhen(requestgroupactiontimingtimingrepeatwhen.fromCode(r.getRqstGrpActnTmgTmgRptWhen()));

		/******************** RqstGrp_Actn_Ttl ********************************************************************************/
		if(r.getRqstGrpActnTtl() != null) {
			requestgroupaction.setTitle(r.getRqstGrpActnTtl());
		}
		/******************** requestgroupactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroupaction.setType(requestgroupactiontype);

		/******************** requestgroupactiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupactiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupactiontype.addCoding(requestgroupactiontypecoding);

		/******************** RqstGrp_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpActnTypCdgCd() != null) {
			requestgroupactiontypecoding.setCode(r.getRqstGrpActnTypCdgCd());
		}
		/******************** RqstGrp_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpActnTypCdgDsply() != null) {
			requestgroupactiontypecoding.setDisplay(r.getRqstGrpActnTypCdgDsply());
		}
		/******************** RqstGrp_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpActnTypCdgSys() != null) {
			requestgroupactiontypecoding.setSystem(r.getRqstGrpActnTypCdgSys());
		}
		/******************** RqstGrp_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpActnTypCdgUsrSltd() != null) {
			requestgroupactiontypecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpActnTypCdgUsrSltd()));
		}
		/******************** RqstGrp_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpActnTypCdgVrsn() != null) {
			requestgroupactiontypecoding.setVersion(r.getRqstGrpActnTypCdgVrsn());
		}
		/******************** RqstGrp_Actn_Typ_Txt ********************************************************************************/
		if(r.getRqstGrpActnTypTxt() != null) {
			requestgroupactiontype.setText(r.getRqstGrpActnTypTxt());
		}
		/******************** RqstGrp_Athr ********************************************************************************/
		if(r.getRqstGrpAthr() != null) {
			requestgroup.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpAthr()));
		}
		/******************** RqstGrp_AthredOn ********************************************************************************/
		if(r.getRqstGrpAthredOn() != null) {
			java.text.SimpleDateFormat RqstGrp_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_AthredOndate = RqstGrp_AthredOnsdf.parse(r.getRqstGrpAthredOn());
			requestgroup.setAuthoredOn(RqstGrp_AthredOndate);
		}
		/******************** RqstGrp_BasedOn ********************************************************************************/
		if(r.getRqstGrpBasedOn() != null) {
			requestgroup.addBasedOn( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpBasedOn()));
		}
		/******************** requestgroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroup.setCode(requestgroupcode);

		/******************** requestgroupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupcodecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupcode.addCoding(requestgroupcodecoding);

		/******************** RqstGrp_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpCdCdgCd() != null) {
			requestgroupcodecoding.setCode(r.getRqstGrpCdCdgCd());
		}
		/******************** RqstGrp_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpCdCdgDsply() != null) {
			requestgroupcodecoding.setDisplay(r.getRqstGrpCdCdgDsply());
		}
		/******************** RqstGrp_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpCdCdgSys() != null) {
			requestgroupcodecoding.setSystem(r.getRqstGrpCdCdgSys());
		}
		/******************** RqstGrp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpCdCdgUsrSltd() != null) {
			requestgroupcodecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpCdCdgUsrSltd()));
		}
		/******************** RqstGrp_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpCdCdgVrsn() != null) {
			requestgroupcodecoding.setVersion(r.getRqstGrpCdCdgVrsn());
		}
		/******************** RqstGrp_Cd_Txt ********************************************************************************/
		if(r.getRqstGrpCdTxt() != null) {
			requestgroupcode.setText(r.getRqstGrpCdTxt());
		}
		/******************** RqstGrp_Enc ********************************************************************************/
		if(r.getRqstGrpEnc() != null) {
			requestgroup.setEncounter( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpEnc()));
		}
		/******************** requestgroupgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier requestgroupgroupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		requestgroup.setGroupIdentifier(requestgroupgroupidentifier);

		/******************** RqstGrp_GrpId_Assigner ********************************************************************************/
		if(r.getRqstGrpGrpIdAssigner() != null) {
			requestgroupgroupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpGrpIdAssigner()));
		}
		/******************** requestgroupgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupgroupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		requestgroupgroupidentifier.setPeriod(requestgroupgroupidentifierperiod);

		/******************** RqstGrp_GrpId_Prd_End ********************************************************************************/
		if(r.getRqstGrpGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat RqstGrp_GrpId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_GrpId_Prd_Enddate = RqstGrp_GrpId_Prd_Endsdf.parse(r.getRqstGrpGrpIdPrdEnd());
			requestgroupgroupidentifierperiod.setEnd(RqstGrp_GrpId_Prd_Enddate);
		}
		/******************** RqstGrp_GrpId_Prd_Strt ********************************************************************************/
		if(r.getRqstGrpGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat RqstGrp_GrpId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_GrpId_Prd_Strtdate = RqstGrp_GrpId_Prd_Strtsdf.parse(r.getRqstGrpGrpIdPrdStrt());
			requestgroupgroupidentifierperiod.setStart(RqstGrp_GrpId_Prd_Strtdate);
		}
		/******************** RqstGrp_GrpId_Sys ********************************************************************************/
		if(r.getRqstGrpGrpIdSys() != null) {
			requestgroupgroupidentifier.setSystem(r.getRqstGrpGrpIdSys());
		}
		/******************** requestgroupgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupgroupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroupgroupidentifier.setType(requestgroupgroupidentifiertype);

		/******************** requestgroupgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupgroupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupgroupidentifiertype.addCoding(requestgroupgroupidentifiertypecoding);

		/******************** RqstGrp_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgCd() != null) {
			requestgroupgroupidentifiertypecoding.setCode(r.getRqstGrpGrpIdTypCdgCd());
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgDsply() != null) {
			requestgroupgroupidentifiertypecoding.setDisplay(r.getRqstGrpGrpIdTypCdgDsply());
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgSys() != null) {
			requestgroupgroupidentifiertypecoding.setSystem(r.getRqstGrpGrpIdTypCdgSys());
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgUsrSltd() != null) {
			requestgroupgroupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpGrpIdTypCdgUsrSltd()));
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgVrsn() != null) {
			requestgroupgroupidentifiertypecoding.setVersion(r.getRqstGrpGrpIdTypCdgVrsn());
		}
		/******************** RqstGrp_GrpId_Typ_Txt ********************************************************************************/
		if(r.getRqstGrpGrpIdTypTxt() != null) {
			requestgroupgroupidentifiertype.setText(r.getRqstGrpGrpIdTypTxt());
		}
		/******************** requestgroupgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory requestgroupgroupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		requestgroupgroupidentifier.setUse(requestgroupgroupidentifieruse.fromCode(r.getRqstGrpGrpIdUse()));

		/******************** RqstGrp_GrpId_Vl ********************************************************************************/
		if(r.getRqstGrpGrpIdVl() != null) {
			requestgroupgroupidentifier.setValue(r.getRqstGrpGrpIdVl());
		}
		/******************** requestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier requestgroupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		requestgroup.addIdentifier(requestgroupidentifier);

		/******************** RqstGrp_Id_Assigner ********************************************************************************/
		if(r.getRqstGrpIdAssigner() != null) {
			requestgroupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpIdAssigner()));
		}
		/******************** requestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		requestgroupidentifier.setPeriod(requestgroupidentifierperiod);

		/******************** RqstGrp_Id_Prd_End ********************************************************************************/
		if(r.getRqstGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat RqstGrp_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Id_Prd_Enddate = RqstGrp_Id_Prd_Endsdf.parse(r.getRqstGrpIdPrdEnd());
			requestgroupidentifierperiod.setEnd(RqstGrp_Id_Prd_Enddate);
		}
		/******************** RqstGrp_Id_Prd_Strt ********************************************************************************/
		if(r.getRqstGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat RqstGrp_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Id_Prd_Strtdate = RqstGrp_Id_Prd_Strtsdf.parse(r.getRqstGrpIdPrdStrt());
			requestgroupidentifierperiod.setStart(RqstGrp_Id_Prd_Strtdate);
		}
		/******************** RqstGrp_Id_Sys ********************************************************************************/
		if(r.getRqstGrpIdSys() != null) {
			requestgroupidentifier.setSystem(r.getRqstGrpIdSys());
		}
		/******************** requestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroupidentifier.setType(requestgroupidentifiertype);

		/******************** requestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupidentifiertype.addCoding(requestgroupidentifiertypecoding);

		/******************** RqstGrp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpIdTypCdgCd() != null) {
			requestgroupidentifiertypecoding.setCode(r.getRqstGrpIdTypCdgCd());
		}
		/******************** RqstGrp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpIdTypCdgDsply() != null) {
			requestgroupidentifiertypecoding.setDisplay(r.getRqstGrpIdTypCdgDsply());
		}
		/******************** RqstGrp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpIdTypCdgSys() != null) {
			requestgroupidentifiertypecoding.setSystem(r.getRqstGrpIdTypCdgSys());
		}
		/******************** RqstGrp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpIdTypCdgUsrSltd() != null) {
			requestgroupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpIdTypCdgUsrSltd()));
		}
		/******************** RqstGrp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpIdTypCdgVrsn() != null) {
			requestgroupidentifiertypecoding.setVersion(r.getRqstGrpIdTypCdgVrsn());
		}
		/******************** RqstGrp_Id_Typ_Txt ********************************************************************************/
		if(r.getRqstGrpIdTypTxt() != null) {
			requestgroupidentifiertype.setText(r.getRqstGrpIdTypTxt());
		}
		/******************** requestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory requestgroupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		requestgroupidentifier.setUse(requestgroupidentifieruse.fromCode(r.getRqstGrpIdUse()));

		/******************** RqstGrp_Id_Vl ********************************************************************************/
		if(r.getRqstGrpIdVl() != null) {
			requestgroupidentifier.setValue(r.getRqstGrpIdVl());
		}
		/******************** RqstGrp_InstantiatesCanonical ********************************************************************************/
		if(r.getRqstGrpInstantiatesCanonical() != null) {
			requestgroup.addInstantiatesCanonical(r.getRqstGrpInstantiatesCanonical());
		}
		/******************** RqstGrp_InstantiatesUri ********************************************************************************/
		if(r.getRqstGrpInstantiatesUri() != null) {
			requestgroup.addInstantiatesUri(r.getRqstGrpInstantiatesUri());
		}
		/******************** requestgroupintent ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestIntentEnumFactory requestgroupintent =  new org.hl7.fhir.r4.model.RequestGroup.RequestIntentEnumFactory();
		requestgroup.setIntent(requestgroupintent.fromCode(r.getRqstGrpIntent()));

		/******************** requestgroupnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation requestgroupnote =  new org.hl7.fhir.r4.model.Annotation();
		requestgroup.addNote(requestgroupnote);

		/******************** RqstGrp_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRqstGrpNtAthrRfrnc() != null) {
			requestgroupnote.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpNtAthrRfrnc()));
		}
		/******************** RqstGrp_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRqstGrpNtAthrStrgTyp() != null) {
			requestgroupnote.setAuthor( new org.hl7.fhir.r4.model.StringType(r.getRqstGrpNtAthrStrgTyp()));
		}
		/******************** RqstGrp_Nt_Txt ********************************************************************************/
		if(r.getRqstGrpNtTxt() != null) {
			requestgroupnote.setText(r.getRqstGrpNtTxt());
		}
		/******************** RqstGrp_Nt_Time ********************************************************************************/
		if(r.getRqstGrpNtTime() != null) {
			java.text.SimpleDateFormat RqstGrp_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RqstGrp_Nt_Timedate = RqstGrp_Nt_Timesdf.parse(r.getRqstGrpNtTime());
			requestgroupnote.setTime(RqstGrp_Nt_Timedate);
		}
		/******************** requestgrouppriority ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestPriorityEnumFactory requestgrouppriority =  new org.hl7.fhir.r4.model.RequestGroup.RequestPriorityEnumFactory();
		requestgroup.setPriority(requestgrouppriority.fromCode(r.getRqstGrpPriority()));

		/******************** requestgroupreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		requestgroup.addReasonCode(requestgroupreasoncode);

		/******************** requestgroupreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding requestgroupreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		requestgroupreasoncode.addCoding(requestgroupreasoncodecoding);

		/******************** RqstGrp_RsnCd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgCd() != null) {
			requestgroupreasoncodecoding.setCode(r.getRqstGrpRsnCdCdgCd());
		}
		/******************** RqstGrp_RsnCd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgDsply() != null) {
			requestgroupreasoncodecoding.setDisplay(r.getRqstGrpRsnCdCdgDsply());
		}
		/******************** RqstGrp_RsnCd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgSys() != null) {
			requestgroupreasoncodecoding.setSystem(r.getRqstGrpRsnCdCdgSys());
		}
		/******************** RqstGrp_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgUsrSltd() != null) {
			requestgroupreasoncodecoding.setUserSelected(Boolean.parseBoolean(r.getRqstGrpRsnCdCdgUsrSltd()));
		}
		/******************** RqstGrp_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgVrsn() != null) {
			requestgroupreasoncodecoding.setVersion(r.getRqstGrpRsnCdCdgVrsn());
		}
		/******************** RqstGrp_RsnCd_Txt ********************************************************************************/
		if(r.getRqstGrpRsnCdTxt() != null) {
			requestgroupreasoncode.setText(r.getRqstGrpRsnCdTxt());
		}
		/******************** RqstGrp_RsnRfrnc ********************************************************************************/
		if(r.getRqstGrpRsnRfrnc() != null) {
			requestgroup.addReasonReference( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpRsnRfrnc()));
		}
		/******************** RqstGrp_Replaces ********************************************************************************/
		if(r.getRqstGrpReplaces() != null) {
			requestgroup.addReplaces( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpReplaces()));
		}
		/******************** requestgroupstatus ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestStatusEnumFactory requestgroupstatus =  new org.hl7.fhir.r4.model.RequestGroup.RequestStatusEnumFactory();
		requestgroup.setStatus(requestgroupstatus.fromCode(r.getRqstGrpSts()));

		/******************** RqstGrp_Sbjct ********************************************************************************/
		if(r.getRqstGrpSbjct() != null) {
			requestgroup.setSubject( new org.hl7.fhir.r4.model.Reference(r.getRqstGrpSbjct()));
		}
		return requestgroup;
	}
}
