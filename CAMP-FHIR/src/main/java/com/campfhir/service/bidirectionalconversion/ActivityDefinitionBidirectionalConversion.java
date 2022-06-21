package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ActivityDefinition;
public class ActivityDefinitionBidirectionalConversion 
{
	public ActivityDefinition ActivityDefinitions(org.hl7.fhir.r4.model.ActivityDefinition activitydefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ActivityDefinition a = new  main.java.com.campfhir.model.ActivityDefinition();

		/******************** id ********************************************************************************/
		activitydefinition.setId(a.getId());

		/******************** ActvtyDfn_Nm ********************************************************************************/
		if(activitydefinition.hasName()) {
			a.setActvtyDfnNm(String.valueOf(activitydefinition.getName()));
		}
		/******************** ActvtyDfn_Lctn ********************************************************************************/
		if(activitydefinition.hasLocation()) {
			a.setActvtyDfnLctn(String.valueOf(activitydefinition.getLocation()));
		}
		/******************** activitydefinitionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.RequestPriority activitydefinitionpriority = activitydefinition.getPriority();
		a.setActvtyDfnPriority(activitydefinitionpriority.toCode());

		/******************** ActvtyDfn_Vrsn ********************************************************************************/
		if(activitydefinition.hasVersion()) {
			a.setActvtyDfnVrsn(String.valueOf(activitydefinition.getVersion()));
		}
		/******************** ActvtyDfn_Dt ********************************************************************************/
		if(activitydefinition.hasDate()) {
			a.setActvtyDfnDt(String.valueOf(activitydefinition.getDate()));
		}
		/******************** activitydefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitioncode = activitydefinition.getCode();

		/******************** activitydefinitioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitioncodecoding = activitydefinitioncode.getCodingFirstRep();

		/******************** ActvtyDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitioncodecoding.hasDisplay()) {
			a.setActvtyDfnCdCdgDsply(String.valueOf(activitydefinitioncodecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitioncodecoding.hasVersion()) {
			a.setActvtyDfnCdCdgVrsn(String.valueOf(activitydefinitioncodecoding.getVersion()));
		}
		/******************** ActvtyDfn_Cd_Cdg_Cd ********************************************************************************/
		if(activitydefinitioncodecoding.hasCode()) {
			a.setActvtyDfnCdCdgCd(String.valueOf(activitydefinitioncodecoding.getCode()));
		}
		/******************** ActvtyDfn_Cd_Cdg_Sys ********************************************************************************/
		if(activitydefinitioncodecoding.hasSystem()) {
			a.setActvtyDfnCdCdgSys(String.valueOf(activitydefinitioncodecoding.getSystem()));
		}
		/******************** ActvtyDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitioncodecoding.hasUserSelected()) {
			a.setActvtyDfnCdCdgUsrSltd(String.valueOf(activitydefinitioncodecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Cd_Txt ********************************************************************************/
		if(activitydefinitioncode.hasText()) {
			a.setActvtyDfnCdTxt(String.valueOf(activitydefinitioncode.getText()));
		}
		/******************** ActvtyDfn_Url ********************************************************************************/
		if(activitydefinition.hasUrl()) {
			a.setActvtyDfnUrl(String.valueOf(activitydefinition.getUrl()));
		}
		/******************** activitydefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitionreviewer = activitydefinition.getReviewerFirstRep();

		/******************** ActvtyDfn_Rviewr_Nm ********************************************************************************/
		if(activitydefinitionreviewer.hasName()) {
			a.setActvtyDfnRviewrNm(String.valueOf(activitydefinitionreviewer.getName()));
		}
		/******************** activitydefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitionreviewertelecom = activitydefinitionreviewer.getTelecomFirstRep();

		/******************** ActvtyDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(activitydefinitionreviewertelecom.hasValue()) {
			a.setActvtyDfnRviewrTlcmVl(String.valueOf(activitydefinitionreviewertelecom.getValue()));
		}
		/******************** activitydefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitionreviewertelecomsystem = activitydefinitionreviewertelecom.getSystem();
		a.setActvtyDfnRviewrTlcmSys(activitydefinitionreviewertelecomsystem.toCode());

		/******************** activitydefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionreviewertelecomperiod = activitydefinitionreviewertelecom.getPeriod();

		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitionreviewertelecomperiod.hasEnd()) {
			a.setActvtyDfnRviewrTlcmPrdEnd(String.valueOf(activitydefinitionreviewertelecomperiod.getEnd()));
		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitionreviewertelecomperiod.hasStart()) {
			a.setActvtyDfnRviewrTlcmPrdStrt(String.valueOf(activitydefinitionreviewertelecomperiod.getStart()));
		}
		/******************** activitydefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitionreviewertelecomuse = activitydefinitionreviewertelecom.getUse();
		a.setActvtyDfnRviewrTlcmUse(activitydefinitionreviewertelecomuse.toCode());

		/******************** ActvtyDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitionreviewertelecom.hasRank()) {
			a.setActvtyDfnRviewrTlcmRnk(String.valueOf(activitydefinitionreviewertelecom.getRank()));
		}
		/******************** activitydefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitionendorser = activitydefinition.getEndorserFirstRep();

		/******************** ActvtyDfn_Endsr_Nm ********************************************************************************/
		if(activitydefinitionendorser.hasName()) {
			a.setActvtyDfnEndsrNm(String.valueOf(activitydefinitionendorser.getName()));
		}
		/******************** activitydefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitionendorsertelecom = activitydefinitionendorser.getTelecomFirstRep();

		/******************** ActvtyDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(activitydefinitionendorsertelecom.hasValue()) {
			a.setActvtyDfnEndsrTlcmVl(String.valueOf(activitydefinitionendorsertelecom.getValue()));
		}
		/******************** activitydefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitionendorsertelecomsystem = activitydefinitionendorsertelecom.getSystem();
		a.setActvtyDfnEndsrTlcmSys(activitydefinitionendorsertelecomsystem.toCode());

		/******************** activitydefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionendorsertelecomperiod = activitydefinitionendorsertelecom.getPeriod();

		/******************** ActvtyDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitionendorsertelecomperiod.hasEnd()) {
			a.setActvtyDfnEndsrTlcmPrdEnd(String.valueOf(activitydefinitionendorsertelecomperiod.getEnd()));
		}
		/******************** ActvtyDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitionendorsertelecomperiod.hasStart()) {
			a.setActvtyDfnEndsrTlcmPrdStrt(String.valueOf(activitydefinitionendorsertelecomperiod.getStart()));
		}
		/******************** activitydefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitionendorsertelecomuse = activitydefinitionendorsertelecom.getUse();
		a.setActvtyDfnEndsrTlcmUse(activitydefinitionendorsertelecomuse.toCode());

		/******************** ActvtyDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitionendorsertelecom.hasRank()) {
			a.setActvtyDfnEndsrTlcmRnk(String.valueOf(activitydefinitionendorsertelecom.getRank()));
		}
		/******************** ActvtyDfn_ObsrvtnRqrment ********************************************************************************/
		if(activitydefinition.hasObservationRequirement()) {
			a.setActvtyDfnObsrvtnRqrment(String.valueOf(activitydefinition.getObservationRequirementFirstRep()));
		}
		/******************** ActvtyDfn_SbjctRfrnc ********************************************************************************/
		if(activitydefinition.hasSubjectReference()) {
			a.setActvtyDfnSbjctRfrnc(String.valueOf(activitydefinition.getSubjectReference()));
		}
		/******************** activitydefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionsubjectcodeableconcept = activitydefinition.getSubjectCodeableConcept();

		/******************** activitydefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionsubjectcodeableconceptcoding = activitydefinitionsubjectcodeableconcept.getCodingFirstRep();

		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcoding.hasDisplay()) {
			a.setActvtyDfnSbjctCdbleCncptCdgDsply(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcoding.hasVersion()) {
			a.setActvtyDfnSbjctCdbleCncptCdgVrsn(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcoding.hasCode()) {
			a.setActvtyDfnSbjctCdbleCncptCdgCd(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getCode()));
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcoding.hasSystem()) {
			a.setActvtyDfnSbjctCdbleCncptCdgSys(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcoding.hasUserSelected()) {
			a.setActvtyDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitionsubjectcodeableconcept.hasText()) {
			a.setActvtyDfnSbjctCdbleCncptTxt(String.valueOf(activitydefinitionsubjectcodeableconcept.getText()));
		}
		/******************** ActvtyDfn_SpcmnRqrment ********************************************************************************/
		if(activitydefinition.hasSpecimenRequirement()) {
			a.setActvtyDfnSpcmnRqrment(String.valueOf(activitydefinition.getSpecimenRequirementFirstRep()));
		}
		/******************** activitydefinitiondynamicvalue ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent activitydefinitiondynamicvalue = activitydefinition.getDynamicValueFirstRep();

		/******************** ActvtyDfn_DynamicVl_Path ********************************************************************************/
		if(activitydefinitiondynamicvalue.hasPath()) {
			a.setActvtyDfnDynamicVlPath(String.valueOf(activitydefinitiondynamicvalue.getPath()));
		}
		/******************** activitydefinitiondynamicvalueexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression activitydefinitiondynamicvalueexpression = activitydefinitiondynamicvalue.getExpression();

		/******************** ActvtyDfn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(activitydefinitiondynamicvalueexpression.hasName()) {
			a.setActvtyDfnDynamicVlExprsnNm(String.valueOf(activitydefinitiondynamicvalueexpression.getName()));
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(activitydefinitiondynamicvalueexpression.hasReference()) {
			a.setActvtyDfnDynamicVlExprsnRfrnc(String.valueOf(activitydefinitiondynamicvalueexpression.getReference()));
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(activitydefinitiondynamicvalueexpression.hasLanguage()) {
			a.setActvtyDfnDynamicVlExprsnLnguage(String.valueOf(activitydefinitiondynamicvalueexpression.getLanguage()));
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(activitydefinitiondynamicvalueexpression.hasDescription()) {
			a.setActvtyDfnDynamicVlExprsnDscrptn(String.valueOf(activitydefinitiondynamicvalueexpression.getDescription()));
		}
		/******************** activitydefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionjurisdiction = activitydefinition.getJurisdictionFirstRep();

		/******************** activitydefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionjurisdictioncoding = activitydefinitionjurisdiction.getCodingFirstRep();

		/******************** ActvtyDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionjurisdictioncoding.hasDisplay()) {
			a.setActvtyDfnJrsdctnCdgDsply(String.valueOf(activitydefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionjurisdictioncoding.hasVersion()) {
			a.setActvtyDfnJrsdctnCdgVrsn(String.valueOf(activitydefinitionjurisdictioncoding.getVersion()));
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(activitydefinitionjurisdictioncoding.hasCode()) {
			a.setActvtyDfnJrsdctnCdgCd(String.valueOf(activitydefinitionjurisdictioncoding.getCode()));
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(activitydefinitionjurisdictioncoding.hasSystem()) {
			a.setActvtyDfnJrsdctnCdgSys(String.valueOf(activitydefinitionjurisdictioncoding.getSystem()));
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionjurisdictioncoding.hasUserSelected()) {
			a.setActvtyDfnJrsdctnCdgUsrSltd(String.valueOf(activitydefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Jrsdctn_Txt ********************************************************************************/
		if(activitydefinitionjurisdiction.hasText()) {
			a.setActvtyDfnJrsdctnTxt(String.valueOf(activitydefinitionjurisdiction.getText()));
		}
		/******************** activitydefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext activitydefinitionusecontext = activitydefinition.getUseContextFirstRep();

		/******************** activitydefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionusecontextcode = activitydefinitionusecontext.getCode();

		/******************** ActvtyDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(activitydefinitionusecontextcode.hasDisplay()) {
			a.setActvtyDfnUseCntxtCdDsply(String.valueOf(activitydefinitionusecontextcode.getDisplay()));
		}
		/******************** ActvtyDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(activitydefinitionusecontextcode.hasVersion()) {
			a.setActvtyDfnUseCntxtCdVrsn(String.valueOf(activitydefinitionusecontextcode.getVersion()));
		}
		/******************** ActvtyDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(activitydefinitionusecontextcode.hasSystem()) {
			a.setActvtyDfnUseCntxtCdSys(String.valueOf(activitydefinitionusecontextcode.getSystem()));
		}
		/******************** ActvtyDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(activitydefinitionusecontextcode.hasUserSelected()) {
			a.setActvtyDfnUseCntxtCdUsrSltd(String.valueOf(activitydefinitionusecontextcode.getUserSelected()));
		}
		/******************** activitydefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionusecontextvaluecodeableconcept = activitydefinitionusecontext.getValueCodeableConcept();

		/******************** activitydefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionusecontextvaluecodeableconceptcoding = activitydefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			a.setActvtyDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			a.setActvtyDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			a.setActvtyDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			a.setActvtyDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			a.setActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconcept.hasText()) {
			a.setActvtyDfnUseCntxtVlCdbleCncptTxt(String.valueOf(activitydefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** activitydefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluequantity = activitydefinitionusecontext.getValueQuantity();

		/******************** ActvtyDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(activitydefinitionusecontextvaluequantity.hasValue()) {
			a.setActvtyDfnUseCntxtVlQntyVl(String.valueOf(activitydefinitionusecontextvaluequantity.getValue()));
		}
		/******************** activitydefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionusecontextvaluequantitycomparator = activitydefinitionusecontextvaluequantity.getComparator();
		a.setActvtyDfnUseCntxtVlQntyCmprtr(activitydefinitionusecontextvaluequantitycomparator.toCode());

		/******************** ActvtyDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(activitydefinitionusecontextvaluequantity.hasCode()) {
			a.setActvtyDfnUseCntxtVlQntyCd(String.valueOf(activitydefinitionusecontextvaluequantity.getCode()));
		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(activitydefinitionusecontextvaluequantity.hasSystem()) {
			a.setActvtyDfnUseCntxtVlQntySys(String.valueOf(activitydefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(activitydefinitionusecontextvaluequantity.hasUnit()) {
			a.setActvtyDfnUseCntxtVlQntyUnt(String.valueOf(activitydefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** activitydefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitionusecontextvaluerange = activitydefinitionusecontext.getValueRange();

		/******************** activitydefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluerangelow = activitydefinitionusecontextvaluerange.getLow();

		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(activitydefinitionusecontextvaluerangelow.hasValue()) {
			a.setActvtyDfnUseCntxtVlRngLwVl(String.valueOf(activitydefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** activitydefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionusecontextvaluerangelowcomparator = activitydefinitionusecontextvaluerangelow.getComparator();
		a.setActvtyDfnUseCntxtVlRngLwCmprtr(activitydefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(activitydefinitionusecontextvaluerangelow.hasCode()) {
			a.setActvtyDfnUseCntxtVlRngLwCd(String.valueOf(activitydefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(activitydefinitionusecontextvaluerangelow.hasSystem()) {
			a.setActvtyDfnUseCntxtVlRngLwSys(String.valueOf(activitydefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(activitydefinitionusecontextvaluerangelow.hasUnit()) {
			a.setActvtyDfnUseCntxtVlRngLwUnt(String.valueOf(activitydefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** activitydefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluerangehigh = activitydefinitionusecontextvaluerange.getHigh();

		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(activitydefinitionusecontextvaluerangehigh.hasValue()) {
			a.setActvtyDfnUseCntxtVlRngHiVl(String.valueOf(activitydefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** activitydefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionusecontextvaluerangehighcomparator = activitydefinitionusecontextvaluerangehigh.getComparator();
		a.setActvtyDfnUseCntxtVlRngHiCmprtr(activitydefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(activitydefinitionusecontextvaluerangehigh.hasCode()) {
			a.setActvtyDfnUseCntxtVlRngHiCd(String.valueOf(activitydefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(activitydefinitionusecontextvaluerangehigh.hasSystem()) {
			a.setActvtyDfnUseCntxtVlRngHiSys(String.valueOf(activitydefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(activitydefinitionusecontextvaluerangehigh.hasUnit()) {
			a.setActvtyDfnUseCntxtVlRngHiUnt(String.valueOf(activitydefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** ActvtyDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(activitydefinitionusecontext.hasValueReference()) {
			a.setActvtyDfnUseCntxtVlRfrnc(String.valueOf(activitydefinitionusecontext.getValueReference()));
		}
		/******************** ActvtyDfn_PrdctRfrnc ********************************************************************************/
		if(activitydefinition.hasProductReference()) {
			a.setActvtyDfnPrdctRfrnc(String.valueOf(activitydefinition.getProductReference()));
		}
		/******************** activitydefinitionproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionproductcodeableconcept = activitydefinition.getProductCodeableConcept();

		/******************** activitydefinitionproductcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionproductcodeableconceptcoding = activitydefinitionproductcodeableconcept.getCodingFirstRep();

		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcoding.hasDisplay()) {
			a.setActvtyDfnPrdctCdbleCncptCdgDsply(String.valueOf(activitydefinitionproductcodeableconceptcoding.getDisplay()));
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcoding.hasVersion()) {
			a.setActvtyDfnPrdctCdbleCncptCdgVrsn(String.valueOf(activitydefinitionproductcodeableconceptcoding.getVersion()));
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcoding.hasCode()) {
			a.setActvtyDfnPrdctCdbleCncptCdgCd(String.valueOf(activitydefinitionproductcodeableconceptcoding.getCode()));
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcoding.hasSystem()) {
			a.setActvtyDfnPrdctCdbleCncptCdgSys(String.valueOf(activitydefinitionproductcodeableconceptcoding.getSystem()));
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcoding.hasUserSelected()) {
			a.setActvtyDfnPrdctCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitionproductcodeableconceptcoding.getUserSelected()));
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitionproductcodeableconcept.hasText()) {
			a.setActvtyDfnPrdctCdbleCncptTxt(String.valueOf(activitydefinitionproductcodeableconcept.getText()));
		}
		/******************** ActvtyDfn_Profile ********************************************************************************/
		if(activitydefinition.hasProfile()) {
			a.setActvtyDfnProfile(String.valueOf(activitydefinition.getProfile()));
		}
		/******************** activitydefinitionintent ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.RequestIntent activitydefinitionintent = activitydefinition.getIntent();
		a.setActvtyDfnIntent(activitydefinitionintent.toCode());

		/******************** activitydefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus activitydefinitionstatus = activitydefinition.getStatus();
		a.setActvtyDfnSts(activitydefinitionstatus.toCode());

		/******************** ActvtyDfn_Dscrptn ********************************************************************************/
		if(activitydefinition.hasDescription()) {
			a.setActvtyDfnDscrptn(String.valueOf(activitydefinition.getDescription()));
		}
		/******************** activitydefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitioncontact = activitydefinition.getContactFirstRep();

		/******************** ActvtyDfn_Cntct_Nm ********************************************************************************/
		if(activitydefinitioncontact.hasName()) {
			a.setActvtyDfnCntctNm(String.valueOf(activitydefinitioncontact.getName()));
		}
		/******************** activitydefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitioncontacttelecom = activitydefinitioncontact.getTelecomFirstRep();

		/******************** ActvtyDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(activitydefinitioncontacttelecom.hasValue()) {
			a.setActvtyDfnCntctTlcmVl(String.valueOf(activitydefinitioncontacttelecom.getValue()));
		}
		/******************** activitydefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitioncontacttelecomsystem = activitydefinitioncontacttelecom.getSystem();
		a.setActvtyDfnCntctTlcmSys(activitydefinitioncontacttelecomsystem.toCode());

		/******************** activitydefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioncontacttelecomperiod = activitydefinitioncontacttelecom.getPeriod();

		/******************** ActvtyDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitioncontacttelecomperiod.hasEnd()) {
			a.setActvtyDfnCntctTlcmPrdEnd(String.valueOf(activitydefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** ActvtyDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitioncontacttelecomperiod.hasStart()) {
			a.setActvtyDfnCntctTlcmPrdStrt(String.valueOf(activitydefinitioncontacttelecomperiod.getStart()));
		}
		/******************** activitydefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitioncontacttelecomuse = activitydefinitioncontacttelecom.getUse();
		a.setActvtyDfnCntctTlcmUse(activitydefinitioncontacttelecomuse.toCode());

		/******************** ActvtyDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitioncontacttelecom.hasRank()) {
			a.setActvtyDfnCntctTlcmRnk(String.valueOf(activitydefinitioncontacttelecom.getRank()));
		}
		/******************** activitydefinitiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiontimingperiod = activitydefinition.getTimingPeriod();

		/******************** ActvtyDfn_TmgPrd_End ********************************************************************************/
		if(activitydefinitiontimingperiod.hasEnd()) {
			a.setActvtyDfnTmgPrdEnd(String.valueOf(activitydefinitiontimingperiod.getEnd()));
		}
		/******************** ActvtyDfn_TmgPrd_Strt ********************************************************************************/
		if(activitydefinitiontimingperiod.hasStart()) {
			a.setActvtyDfnTmgPrdStrt(String.valueOf(activitydefinitiontimingperiod.getStart()));
		}
		/******************** activitydefinitiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing activitydefinitiontimingtiming = activitydefinition.getTimingTiming();

		/******************** activitydefinitiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiontimingtimingcode = activitydefinitiontimingtiming.getCode();

		/******************** activitydefinitiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiontimingtimingcodecoding = activitydefinitiontimingtimingcode.getCodingFirstRep();

		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiontimingtimingcodecoding.hasDisplay()) {
			a.setActvtyDfnTmgTmgCdCdgDsply(String.valueOf(activitydefinitiontimingtimingcodecoding.getDisplay()));
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiontimingtimingcodecoding.hasVersion()) {
			a.setActvtyDfnTmgTmgCdCdgVrsn(String.valueOf(activitydefinitiontimingtimingcodecoding.getVersion()));
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingcodecoding.hasCode()) {
			a.setActvtyDfnTmgTmgCdCdgCd(String.valueOf(activitydefinitiontimingtimingcodecoding.getCode()));
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingcodecoding.hasSystem()) {
			a.setActvtyDfnTmgTmgCdCdgSys(String.valueOf(activitydefinitiontimingtimingcodecoding.getSystem()));
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiontimingtimingcodecoding.hasUserSelected()) {
			a.setActvtyDfnTmgTmgCdCdgUsrSltd(String.valueOf(activitydefinitiontimingtimingcodecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(activitydefinitiontimingtimingcode.hasText()) {
			a.setActvtyDfnTmgTmgCdTxt(String.valueOf(activitydefinitiontimingtimingcode.getText()));
		}
		/******************** activitydefinitiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent activitydefinitiontimingtimingrepeat = activitydefinitiontimingtiming.getRepeat();

		/******************** ActvtyDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasOffset()) {
			a.setActvtyDfnTmgTmgRptOff(String.valueOf(activitydefinitiontimingtimingrepeat.getOffset()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasCount()) {
			a.setActvtyDfnTmgTmgRptCnt(String.valueOf(activitydefinitiontimingtimingrepeat.getCount()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasFrequency()) {
			a.setActvtyDfnTmgTmgRptFrqncy(String.valueOf(activitydefinitiontimingtimingrepeat.getFrequency()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasPeriod()) {
			a.setActvtyDfnTmgTmgRptPrd(String.valueOf(activitydefinitiontimingtimingrepeat.getPeriod()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasDuration()) {
			a.setActvtyDfnTmgTmgRptDuration(String.valueOf(activitydefinitiontimingtimingrepeat.getDuration()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasCountMax()) {
			a.setActvtyDfnTmgTmgRptCntMx(String.valueOf(activitydefinitiontimingtimingrepeat.getCountMax()));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiontimingtimingrepeatboundsduration = activitydefinitiontimingtimingrepeat.getBoundsDuration();

		/******************** activitydefinitiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiontimingtimingrepeatboundsperiod = activitydefinitiontimingtimingrepeat.getBoundsPeriod();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsperiod.hasEnd()) {
			a.setActvtyDfnTmgTmgRptBndsPrdEnd(String.valueOf(activitydefinitiontimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsperiod.hasStart()) {
			a.setActvtyDfnTmgTmgRptBndsPrdStrt(String.valueOf(activitydefinitiontimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiontimingtimingrepeatboundsrange = activitydefinitiontimingtimingrepeat.getBoundsRange();

		/******************** activitydefinitiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingtimingrepeatboundsrangelow = activitydefinitiontimingtimingrepeatboundsrange.getLow();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasValue()) {
			a.setActvtyDfnTmgTmgRptBndsRngLwVl(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingtimingrepeatboundsrangelowcomparator = activitydefinitiontimingtimingrepeatboundsrangelow.getComparator();
		a.setActvtyDfnTmgTmgRptBndsRngLwCmprtr(activitydefinitiontimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasCode()) {
			a.setActvtyDfnTmgTmgRptBndsRngLwCd(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasSystem()) {
			a.setActvtyDfnTmgTmgRptBndsRngLwSys(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasUnit()) {
			a.setActvtyDfnTmgTmgRptBndsRngLwUnt(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingtimingrepeatboundsrangehigh = activitydefinitiontimingtimingrepeatboundsrange.getHigh();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasValue()) {
			a.setActvtyDfnTmgTmgRptBndsRngHiVl(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingtimingrepeatboundsrangehighcomparator = activitydefinitiontimingtimingrepeatboundsrangehigh.getComparator();
		a.setActvtyDfnTmgTmgRptBndsRngHiCmprtr(activitydefinitiontimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasCode()) {
			a.setActvtyDfnTmgTmgRptBndsRngHiCd(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasSystem()) {
			a.setActvtyDfnTmgTmgRptBndsRngHiSys(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasUnit()) {
			a.setActvtyDfnTmgTmgRptBndsRngHiUnt(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasPeriodMax()) {
			a.setActvtyDfnTmgTmgRptPrdMx(String.valueOf(activitydefinitiontimingtimingrepeat.getPeriodMax()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasFrequencyMax()) {
			a.setActvtyDfnTmgTmgRptFrqncyMx(String.valueOf(activitydefinitiontimingtimingrepeat.getFrequencyMax()));
		}
		/******************** activitydefinitiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiontimingtimingrepeatperiodunit = activitydefinitiontimingtimingrepeat.getPeriodUnit();
		a.setActvtyDfnTmgTmgRptPrdUnt(activitydefinitiontimingtimingrepeatperiodunit.toCode());

		/******************** ActvtyDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasDurationMax()) {
			a.setActvtyDfnTmgTmgRptDurationMx(String.valueOf(activitydefinitiontimingtimingrepeat.getDurationMax()));
		}
		/******************** activitydefinitiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiontimingtimingrepeatdurationunit = activitydefinitiontimingtimingrepeat.getDurationUnit();
		a.setActvtyDfnTmgTmgRptDurationUnt(activitydefinitiontimingtimingrepeatdurationunit.toCode());

		/******************** activitydefinitionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionbodysite = activitydefinition.getBodySiteFirstRep();

		/******************** activitydefinitionbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionbodysitecoding = activitydefinitionbodysite.getCodingFirstRep();

		/******************** ActvtyDfn_BodySite_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionbodysitecoding.hasDisplay()) {
			a.setActvtyDfnBodySiteCdgDsply(String.valueOf(activitydefinitionbodysitecoding.getDisplay()));
		}
		/******************** ActvtyDfn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionbodysitecoding.hasVersion()) {
			a.setActvtyDfnBodySiteCdgVrsn(String.valueOf(activitydefinitionbodysitecoding.getVersion()));
		}
		/******************** ActvtyDfn_BodySite_Cdg_Cd ********************************************************************************/
		if(activitydefinitionbodysitecoding.hasCode()) {
			a.setActvtyDfnBodySiteCdgCd(String.valueOf(activitydefinitionbodysitecoding.getCode()));
		}
		/******************** ActvtyDfn_BodySite_Cdg_Sys ********************************************************************************/
		if(activitydefinitionbodysitecoding.hasSystem()) {
			a.setActvtyDfnBodySiteCdgSys(String.valueOf(activitydefinitionbodysitecoding.getSystem()));
		}
		/******************** ActvtyDfn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionbodysitecoding.hasUserSelected()) {
			a.setActvtyDfnBodySiteCdgUsrSltd(String.valueOf(activitydefinitionbodysitecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_BodySite_Txt ********************************************************************************/
		if(activitydefinitionbodysite.hasText()) {
			a.setActvtyDfnBodySiteTxt(String.valueOf(activitydefinitionbodysite.getText()));
		}
		/******************** activitydefinitionparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent activitydefinitionparticipant = activitydefinition.getParticipantFirstRep();

		/******************** activitydefinitionparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType activitydefinitionparticipanttype = activitydefinitionparticipant.getType();
		a.setActvtyDfnPrtcpntTyp(activitydefinitionparticipanttype.toCode());

		/******************** activitydefinitionparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionparticipantrole = activitydefinitionparticipant.getRole();

		/******************** activitydefinitionparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionparticipantrolecoding = activitydefinitionparticipantrole.getCodingFirstRep();

		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionparticipantrolecoding.hasDisplay()) {
			a.setActvtyDfnPrtcpntRoleCdgDsply(String.valueOf(activitydefinitionparticipantrolecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionparticipantrolecoding.hasVersion()) {
			a.setActvtyDfnPrtcpntRoleCdgVrsn(String.valueOf(activitydefinitionparticipantrolecoding.getVersion()));
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(activitydefinitionparticipantrolecoding.hasCode()) {
			a.setActvtyDfnPrtcpntRoleCdgCd(String.valueOf(activitydefinitionparticipantrolecoding.getCode()));
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(activitydefinitionparticipantrolecoding.hasSystem()) {
			a.setActvtyDfnPrtcpntRoleCdgSys(String.valueOf(activitydefinitionparticipantrolecoding.getSystem()));
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionparticipantrolecoding.hasUserSelected()) {
			a.setActvtyDfnPrtcpntRoleCdgUsrSltd(String.valueOf(activitydefinitionparticipantrolecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Txt ********************************************************************************/
		if(activitydefinitionparticipantrole.hasText()) {
			a.setActvtyDfnPrtcpntRoleTxt(String.valueOf(activitydefinitionparticipantrole.getText()));
		}
		/******************** ActvtyDfn_Ttl ********************************************************************************/
		if(activitydefinition.hasTitle()) {
			a.setActvtyDfnTtl(String.valueOf(activitydefinition.getTitle()));
		}
		/******************** activitydefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier activitydefinitionidentifier = activitydefinition.getIdentifierFirstRep();

		/******************** ActvtyDfn_Id_Vl ********************************************************************************/
		if(activitydefinitionidentifier.hasValue()) {
			a.setActvtyDfnIdVl(String.valueOf(activitydefinitionidentifier.getValue()));
		}
		/******************** activitydefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionidentifiertype = activitydefinitionidentifier.getType();

		/******************** activitydefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionidentifiertypecoding = activitydefinitionidentifiertype.getCodingFirstRep();

		/******************** ActvtyDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionidentifiertypecoding.hasDisplay()) {
			a.setActvtyDfnIdTypCdgDsply(String.valueOf(activitydefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionidentifiertypecoding.hasVersion()) {
			a.setActvtyDfnIdTypCdgVrsn(String.valueOf(activitydefinitionidentifiertypecoding.getVersion()));
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(activitydefinitionidentifiertypecoding.hasCode()) {
			a.setActvtyDfnIdTypCdgCd(String.valueOf(activitydefinitionidentifiertypecoding.getCode()));
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(activitydefinitionidentifiertypecoding.hasSystem()) {
			a.setActvtyDfnIdTypCdgSys(String.valueOf(activitydefinitionidentifiertypecoding.getSystem()));
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionidentifiertypecoding.hasUserSelected()) {
			a.setActvtyDfnIdTypCdgUsrSltd(String.valueOf(activitydefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Id_Typ_Txt ********************************************************************************/
		if(activitydefinitionidentifiertype.hasText()) {
			a.setActvtyDfnIdTypTxt(String.valueOf(activitydefinitionidentifiertype.getText()));
		}
		/******************** ActvtyDfn_Id_Sys ********************************************************************************/
		if(activitydefinitionidentifier.hasSystem()) {
			a.setActvtyDfnIdSys(String.valueOf(activitydefinitionidentifier.getSystem()));
		}
		/******************** ActvtyDfn_Id_Assigner ********************************************************************************/
		if(activitydefinitionidentifier.hasAssigner()) {
			a.setActvtyDfnIdAssigner(String.valueOf(activitydefinitionidentifier.getAssigner()));
		}
		/******************** activitydefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionidentifierperiod = activitydefinitionidentifier.getPeriod();

		/******************** ActvtyDfn_Id_Prd_End ********************************************************************************/
		if(activitydefinitionidentifierperiod.hasEnd()) {
			a.setActvtyDfnIdPrdEnd(String.valueOf(activitydefinitionidentifierperiod.getEnd()));
		}
		/******************** ActvtyDfn_Id_Prd_Strt ********************************************************************************/
		if(activitydefinitionidentifierperiod.hasStart()) {
			a.setActvtyDfnIdPrdStrt(String.valueOf(activitydefinitionidentifierperiod.getStart()));
		}
		/******************** activitydefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse activitydefinitionidentifieruse = activitydefinitionidentifier.getUse();
		a.setActvtyDfnIdUse(activitydefinitionidentifieruse.toCode());

		/******************** activitydefinitiondosage ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage activitydefinitiondosage = activitydefinition.getDosageFirstRep();

		/******************** activitydefinitiondosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagemethod = activitydefinitiondosage.getMethod();

		/******************** activitydefinitiondosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagemethodcoding = activitydefinitiondosagemethod.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagemethodcoding.hasDisplay()) {
			a.setActvtyDfnDsgMthdCdgDsply(String.valueOf(activitydefinitiondosagemethodcoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagemethodcoding.hasVersion()) {
			a.setActvtyDfnDsgMthdCdgVrsn(String.valueOf(activitydefinitiondosagemethodcoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagemethodcoding.hasCode()) {
			a.setActvtyDfnDsgMthdCdgCd(String.valueOf(activitydefinitiondosagemethodcoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagemethodcoding.hasSystem()) {
			a.setActvtyDfnDsgMthdCdgSys(String.valueOf(activitydefinitiondosagemethodcoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagemethodcoding.hasUserSelected()) {
			a.setActvtyDfnDsgMthdCdgUsrSltd(String.valueOf(activitydefinitiondosagemethodcoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_Mthd_Txt ********************************************************************************/
		if(activitydefinitiondosagemethod.hasText()) {
			a.setActvtyDfnDsgMthdTxt(String.valueOf(activitydefinitiondosagemethod.getText()));
		}
		/******************** activitydefinitiondosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageasneededcodeableconcept = activitydefinitiondosage.getAsNeededCodeableConcept();

		/******************** activitydefinitiondosageasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosageasneededcodeableconceptcoding = activitydefinitiondosageasneededcodeableconcept.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasDisplay()) {
			a.setActvtyDfnDsgAsNdCdbleCncptCdgDsply(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasVersion()) {
			a.setActvtyDfnDsgAsNdCdbleCncptCdgVrsn(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasCode()) {
			a.setActvtyDfnDsgAsNdCdbleCncptCdgCd(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasSystem()) {
			a.setActvtyDfnDsgAsNdCdbleCncptCdgSys(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasUserSelected()) {
			a.setActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconcept.hasText()) {
			a.setActvtyDfnDsgAsNdCdbleCncptTxt(String.valueOf(activitydefinitiondosageasneededcodeableconcept.getText()));
		}
		/******************** ActvtyDfn_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(activitydefinitiondosage.hasAsNeededBooleanType()) {
			a.setActvtyDfnDsgAsNdBooleanTyp(String.valueOf(activitydefinitiondosage.getAsNeededBooleanType()));
		}
		/******************** ActvtyDfn_Dsg_Txt ********************************************************************************/
		if(activitydefinitiondosage.hasText()) {
			a.setActvtyDfnDsgTxt(String.valueOf(activitydefinitiondosage.getText()));
		}
		/******************** ActvtyDfn_Dsg_PntInstrctn ********************************************************************************/
		if(activitydefinitiondosage.hasPatientInstruction()) {
			a.setActvtyDfnDsgPntInstrctn(String.valueOf(activitydefinitiondosage.getPatientInstruction()));
		}
		/******************** activitydefinitiondosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing activitydefinitiondosagetiming = activitydefinitiondosage.getTiming();

		/******************** activitydefinitiondosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagetimingcode = activitydefinitiondosagetiming.getCode();

		/******************** activitydefinitiondosagetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagetimingcodecoding = activitydefinitiondosagetimingcode.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagetimingcodecoding.hasDisplay()) {
			a.setActvtyDfnDsgTmgCdCdgDsply(String.valueOf(activitydefinitiondosagetimingcodecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagetimingcodecoding.hasVersion()) {
			a.setActvtyDfnDsgTmgCdCdgVrsn(String.valueOf(activitydefinitiondosagetimingcodecoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingcodecoding.hasCode()) {
			a.setActvtyDfnDsgTmgCdCdgCd(String.valueOf(activitydefinitiondosagetimingcodecoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingcodecoding.hasSystem()) {
			a.setActvtyDfnDsgTmgCdCdgSys(String.valueOf(activitydefinitiondosagetimingcodecoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagetimingcodecoding.hasUserSelected()) {
			a.setActvtyDfnDsgTmgCdCdgUsrSltd(String.valueOf(activitydefinitiondosagetimingcodecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(activitydefinitiondosagetimingcode.hasText()) {
			a.setActvtyDfnDsgTmgCdTxt(String.valueOf(activitydefinitiondosagetimingcode.getText()));
		}
		/******************** activitydefinitiondosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent activitydefinitiondosagetimingrepeat = activitydefinitiondosagetiming.getRepeat();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasOffset()) {
			a.setActvtyDfnDsgTmgRptOff(String.valueOf(activitydefinitiondosagetimingrepeat.getOffset()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasCount()) {
			a.setActvtyDfnDsgTmgRptCnt(String.valueOf(activitydefinitiondosagetimingrepeat.getCount()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasFrequency()) {
			a.setActvtyDfnDsgTmgRptFrqncy(String.valueOf(activitydefinitiondosagetimingrepeat.getFrequency()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasPeriod()) {
			a.setActvtyDfnDsgTmgRptPrd(String.valueOf(activitydefinitiondosagetimingrepeat.getPeriod()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasDuration()) {
			a.setActvtyDfnDsgTmgRptDuration(String.valueOf(activitydefinitiondosagetimingrepeat.getDuration()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasCountMax()) {
			a.setActvtyDfnDsgTmgRptCntMx(String.valueOf(activitydefinitiondosagetimingrepeat.getCountMax()));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiondosagetimingrepeatboundsduration = activitydefinitiondosagetimingrepeat.getBoundsDuration();

		/******************** activitydefinitiondosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiondosagetimingrepeatboundsperiod = activitydefinitiondosagetimingrepeat.getBoundsPeriod();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsperiod.hasEnd()) {
			a.setActvtyDfnDsgTmgRptBndsPrdEnd(String.valueOf(activitydefinitiondosagetimingrepeatboundsperiod.getEnd()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsperiod.hasStart()) {
			a.setActvtyDfnDsgTmgRptBndsPrdStrt(String.valueOf(activitydefinitiondosagetimingrepeatboundsperiod.getStart()));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagetimingrepeatboundsrange = activitydefinitiondosagetimingrepeat.getBoundsRange();

		/******************** activitydefinitiondosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagetimingrepeatboundsrangelow = activitydefinitiondosagetimingrepeatboundsrange.getLow();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasValue()) {
			a.setActvtyDfnDsgTmgRptBndsRngLwVl(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getValue()));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagetimingrepeatboundsrangelowcomparator = activitydefinitiondosagetimingrepeatboundsrangelow.getComparator();
		a.setActvtyDfnDsgTmgRptBndsRngLwCmprtr(activitydefinitiondosagetimingrepeatboundsrangelowcomparator.toCode());

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasCode()) {
			a.setActvtyDfnDsgTmgRptBndsRngLwCd(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getCode()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasSystem()) {
			a.setActvtyDfnDsgTmgRptBndsRngLwSys(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasUnit()) {
			a.setActvtyDfnDsgTmgRptBndsRngLwUnt(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagetimingrepeatboundsrangehigh = activitydefinitiondosagetimingrepeatboundsrange.getHigh();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasValue()) {
			a.setActvtyDfnDsgTmgRptBndsRngHiVl(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagetimingrepeatboundsrangehighcomparator = activitydefinitiondosagetimingrepeatboundsrangehigh.getComparator();
		a.setActvtyDfnDsgTmgRptBndsRngHiCmprtr(activitydefinitiondosagetimingrepeatboundsrangehighcomparator.toCode());

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasCode()) {
			a.setActvtyDfnDsgTmgRptBndsRngHiCd(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasSystem()) {
			a.setActvtyDfnDsgTmgRptBndsRngHiSys(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasUnit()) {
			a.setActvtyDfnDsgTmgRptBndsRngHiUnt(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasPeriodMax()) {
			a.setActvtyDfnDsgTmgRptPrdMx(String.valueOf(activitydefinitiondosagetimingrepeat.getPeriodMax()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasFrequencyMax()) {
			a.setActvtyDfnDsgTmgRptFrqncyMx(String.valueOf(activitydefinitiondosagetimingrepeat.getFrequencyMax()));
		}
		/******************** activitydefinitiondosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiondosagetimingrepeatperiodunit = activitydefinitiondosagetimingrepeat.getPeriodUnit();
		a.setActvtyDfnDsgTmgRptPrdUnt(activitydefinitiondosagetimingrepeatperiodunit.toCode());

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasDurationMax()) {
			a.setActvtyDfnDsgTmgRptDurationMx(String.valueOf(activitydefinitiondosagetimingrepeat.getDurationMax()));
		}
		/******************** activitydefinitiondosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiondosagetimingrepeatdurationunit = activitydefinitiondosagetimingrepeat.getDurationUnit();
		a.setActvtyDfnDsgTmgRptDurationUnt(activitydefinitiondosagetimingrepeatdurationunit.toCode());

		/******************** activitydefinitiondosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperlifetime = activitydefinitiondosage.getMaxDosePerLifetime();

		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasValue()) {
			a.setActvtyDfnDsgMxDosePerLifetimeVl(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getValue()));
		}
		/******************** activitydefinitiondosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperlifetimecomparator = activitydefinitiondosagemaxdoseperlifetime.getComparator();
		a.setActvtyDfnDsgMxDosePerLifetimeCmprtr(activitydefinitiondosagemaxdoseperlifetimecomparator.toCode());

		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasCode()) {
			a.setActvtyDfnDsgMxDosePerLifetimeCd(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getCode()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasSystem()) {
			a.setActvtyDfnDsgMxDosePerLifetimeSys(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasUnit()) {
			a.setActvtyDfnDsgMxDosePerLifetimeUnt(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getUnit()));
		}
		/******************** activitydefinitiondosageadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageadditionalinstruction = activitydefinitiondosage.getAdditionalInstructionFirstRep();

		/******************** activitydefinitiondosageadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosageadditionalinstructioncoding = activitydefinitiondosageadditionalinstruction.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncoding.hasDisplay()) {
			a.setActvtyDfnDsgAddtnlInstrctnCdgDsply(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncoding.hasVersion()) {
			a.setActvtyDfnDsgAddtnlInstrctnCdgVrsn(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncoding.hasCode()) {
			a.setActvtyDfnDsgAddtnlInstrctnCdgCd(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncoding.hasSystem()) {
			a.setActvtyDfnDsgAddtnlInstrctnCdgSys(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncoding.hasUserSelected()) {
			a.setActvtyDfnDsgAddtnlInstrctnCdgUsrSltd(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(activitydefinitiondosageadditionalinstruction.hasText()) {
			a.setActvtyDfnDsgAddtnlInstrctnTxt(String.valueOf(activitydefinitiondosageadditionalinstruction.getText()));
		}
		/******************** activitydefinitiondosagedoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent activitydefinitiondosagedoseandrate = activitydefinitiondosage.getDoseAndRateFirstRep();

		/******************** activitydefinitiondosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagedoseandratetype = activitydefinitiondosagedoseandrate.getType();

		/******************** activitydefinitiondosagedoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagedoseandratetypecoding = activitydefinitiondosagedoseandratetype.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecoding.hasDisplay()) {
			a.setActvtyDfnDsgDoseAndRtTypCdgDsply(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecoding.hasVersion()) {
			a.setActvtyDfnDsgDoseAndRtTypCdgVrsn(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecoding.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtTypCdgCd(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecoding.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtTypCdgSys(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecoding.hasUserSelected()) {
			a.setActvtyDfnDsgDoseAndRtTypCdgUsrSltd(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(activitydefinitiondosagedoseandratetype.hasText()) {
			a.setActvtyDfnDsgDoseAndRtTypTxt(String.valueOf(activitydefinitiondosagedoseandratetype.getText()));
		}
		/******************** activitydefinitiondosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateratequantity = activitydefinitiondosagedoseandrate.getRateQuantity();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandrateratequantity.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtRtQntyVl(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getValue()));
		}
		/******************** activitydefinitiondosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateratequantitycomparator = activitydefinitiondosagedoseandrateratequantity.getComparator();
		a.setActvtyDfnDsgDoseAndRtRtQntyCmprtr(activitydefinitiondosagedoseandrateratequantitycomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandrateratequantity.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtRtQntyCd(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandrateratequantity.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtRtQntySys(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandrateratequantity.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtRtQntyUnt(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagedoseandrateraterange = activitydefinitiondosagedoseandrate.getRateRange();

		/******************** activitydefinitiondosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterangelow = activitydefinitiondosagedoseandrateraterange.getLow();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangelow.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtRtRngLwVl(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getValue()));
		}
		/******************** activitydefinitiondosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateraterangelowcomparator = activitydefinitiondosagedoseandrateraterangelow.getComparator();
		a.setActvtyDfnDsgDoseAndRtRtRngLwCmprtr(activitydefinitiondosagedoseandrateraterangelowcomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangelow.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtRtRngLwCd(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangelow.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtRtRngLwSys(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangelow.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtRtRngLwUnt(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterangehigh = activitydefinitiondosagedoseandrateraterange.getHigh();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangehigh.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtRtRngHiVl(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getValue()));
		}
		/******************** activitydefinitiondosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateraterangehighcomparator = activitydefinitiondosagedoseandrateraterangehigh.getComparator();
		a.setActvtyDfnDsgDoseAndRtRtRngHiCmprtr(activitydefinitiondosagedoseandrateraterangehighcomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangehigh.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtRtRngHiCd(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangehigh.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtRtRngHiSys(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterangehigh.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtRtRngHiUnt(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagedoseandratedoserange = activitydefinitiondosagedoseandrate.getDoseRange();

		/******************** activitydefinitiondosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedoserangelow = activitydefinitiondosagedoseandratedoserange.getLow();

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangelow.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngLwVl(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getValue()));
		}
		/******************** activitydefinitiondosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandratedoserangelowcomparator = activitydefinitiondosagedoseandratedoserangelow.getComparator();
		a.setActvtyDfnDsgDoseAndRtDoseRngLwCmprtr(activitydefinitiondosagedoseandratedoserangelowcomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangelow.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngLwCd(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangelow.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngLwSys(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangelow.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngLwUnt(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedoserangehigh = activitydefinitiondosagedoseandratedoserange.getHigh();

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangehigh.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngHiVl(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getValue()));
		}
		/******************** activitydefinitiondosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandratedoserangehighcomparator = activitydefinitiondosagedoseandratedoserangehigh.getComparator();
		a.setActvtyDfnDsgDoseAndRtDoseRngHiCmprtr(activitydefinitiondosagedoseandratedoserangehighcomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangehigh.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngHiCd(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangehigh.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngHiSys(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratedoserangehigh.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtDoseRngHiUnt(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio activitydefinitiondosagedoseandraterateratio = activitydefinitiondosagedoseandrate.getRateRatio();

		/******************** activitydefinitiondosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterationumerator = activitydefinitiondosagedoseandraterateratio.getNumerator();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterationumerator.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioNmrtrVl(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getValue()));
		}
		/******************** activitydefinitiondosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateraterationumeratorcomparator = activitydefinitiondosagedoseandrateraterationumerator.getComparator();
		a.setActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr(activitydefinitiondosagedoseandrateraterationumeratorcomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterationumerator.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioNmrtrCd(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterationumerator.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioNmrtrSys(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandrateraterationumerator.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandraterateratiodenominator = activitydefinitiondosagedoseandraterateratio.getDenominator();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioDnmntrVl(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getValue()));
		}
		/******************** activitydefinitiondosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandraterateratiodenominatorcomparator = activitydefinitiondosagedoseandraterateratiodenominator.getComparator();
		a.setActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr(activitydefinitiondosagedoseandraterateratiodenominatorcomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioDnmntrCd(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioDnmntrSys(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getUnit()));
		}
		/******************** activitydefinitiondosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedosequantity = activitydefinitiondosagedoseandrate.getDoseQuantity();

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratedosequantity.hasValue()) {
			a.setActvtyDfnDsgDoseAndRtDoseQntyVl(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getValue()));
		}
		/******************** activitydefinitiondosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandratedosequantitycomparator = activitydefinitiondosagedoseandratedosequantity.getComparator();
		a.setActvtyDfnDsgDoseAndRtDoseQntyCmprtr(activitydefinitiondosagedoseandratedosequantitycomparator.toCode());

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratedosequantity.hasCode()) {
			a.setActvtyDfnDsgDoseAndRtDoseQntyCd(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getCode()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratedosequantity.hasSystem()) {
			a.setActvtyDfnDsgDoseAndRtDoseQntySys(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratedosequantity.hasUnit()) {
			a.setActvtyDfnDsgDoseAndRtDoseQntyUnt(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getUnit()));
		}
		/******************** activitydefinitiondosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperadministration = activitydefinitiondosage.getMaxDosePerAdministration();

		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasValue()) {
			a.setActvtyDfnDsgMxDosePerAdmnstnVl(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getValue()));
		}
		/******************** activitydefinitiondosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperadministrationcomparator = activitydefinitiondosagemaxdoseperadministration.getComparator();
		a.setActvtyDfnDsgMxDosePerAdmnstnCmprtr(activitydefinitiondosagemaxdoseperadministrationcomparator.toCode());

		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasCode()) {
			a.setActvtyDfnDsgMxDosePerAdmnstnCd(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getCode()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasSystem()) {
			a.setActvtyDfnDsgMxDosePerAdmnstnSys(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasUnit()) {
			a.setActvtyDfnDsgMxDosePerAdmnstnUnt(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getUnit()));
		}
		/******************** activitydefinitiondosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio activitydefinitiondosagemaxdoseperperiod = activitydefinitiondosage.getMaxDosePerPeriod();

		/******************** activitydefinitiondosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperperiodnumerator = activitydefinitiondosagemaxdoseperperiod.getNumerator();

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasValue()) {
			a.setActvtyDfnDsgMxDosePerPrdNmrtrVl(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getValue()));
		}
		/******************** activitydefinitiondosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperperiodnumeratorcomparator = activitydefinitiondosagemaxdoseperperiodnumerator.getComparator();
		a.setActvtyDfnDsgMxDosePerPrdNmrtrCmprtr(activitydefinitiondosagemaxdoseperperiodnumeratorcomparator.toCode());

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasCode()) {
			a.setActvtyDfnDsgMxDosePerPrdNmrtrCd(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getCode()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasSystem()) {
			a.setActvtyDfnDsgMxDosePerPrdNmrtrSys(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasUnit()) {
			a.setActvtyDfnDsgMxDosePerPrdNmrtrUnt(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getUnit()));
		}
		/******************** activitydefinitiondosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperperioddenominator = activitydefinitiondosagemaxdoseperperiod.getDenominator();

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasValue()) {
			a.setActvtyDfnDsgMxDosePerPrdDnmntrVl(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getValue()));
		}
		/******************** activitydefinitiondosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperperioddenominatorcomparator = activitydefinitiondosagemaxdoseperperioddenominator.getComparator();
		a.setActvtyDfnDsgMxDosePerPrdDnmntrCmprtr(activitydefinitiondosagemaxdoseperperioddenominatorcomparator.toCode());

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasCode()) {
			a.setActvtyDfnDsgMxDosePerPrdDnmntrCd(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getCode()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasSystem()) {
			a.setActvtyDfnDsgMxDosePerPrdDnmntrSys(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasUnit()) {
			a.setActvtyDfnDsgMxDosePerPrdDnmntrUnt(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getUnit()));
		}
		/******************** activitydefinitiondosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagesite = activitydefinitiondosage.getSite();

		/******************** activitydefinitiondosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagesitecoding = activitydefinitiondosagesite.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagesitecoding.hasDisplay()) {
			a.setActvtyDfnDsgSiteCdgDsply(String.valueOf(activitydefinitiondosagesitecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagesitecoding.hasVersion()) {
			a.setActvtyDfnDsgSiteCdgVrsn(String.valueOf(activitydefinitiondosagesitecoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagesitecoding.hasCode()) {
			a.setActvtyDfnDsgSiteCdgCd(String.valueOf(activitydefinitiondosagesitecoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagesitecoding.hasSystem()) {
			a.setActvtyDfnDsgSiteCdgSys(String.valueOf(activitydefinitiondosagesitecoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagesitecoding.hasUserSelected()) {
			a.setActvtyDfnDsgSiteCdgUsrSltd(String.valueOf(activitydefinitiondosagesitecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_Site_Txt ********************************************************************************/
		if(activitydefinitiondosagesite.hasText()) {
			a.setActvtyDfnDsgSiteTxt(String.valueOf(activitydefinitiondosagesite.getText()));
		}
		/******************** ActvtyDfn_Dsg_Sqnc ********************************************************************************/
		if(activitydefinitiondosage.hasSequence()) {
			a.setActvtyDfnDsgSqnc(String.valueOf(activitydefinitiondosage.getSequence()));
		}
		/******************** activitydefinitiondosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageroute = activitydefinitiondosage.getRoute();

		/******************** activitydefinitiondosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosageroutecoding = activitydefinitiondosageroute.getCodingFirstRep();

		/******************** ActvtyDfn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosageroutecoding.hasDisplay()) {
			a.setActvtyDfnDsgRouteCdgDsply(String.valueOf(activitydefinitiondosageroutecoding.getDisplay()));
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosageroutecoding.hasVersion()) {
			a.setActvtyDfnDsgRouteCdgVrsn(String.valueOf(activitydefinitiondosageroutecoding.getVersion()));
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosageroutecoding.hasCode()) {
			a.setActvtyDfnDsgRouteCdgCd(String.valueOf(activitydefinitiondosageroutecoding.getCode()));
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosageroutecoding.hasSystem()) {
			a.setActvtyDfnDsgRouteCdgSys(String.valueOf(activitydefinitiondosageroutecoding.getSystem()));
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosageroutecoding.hasUserSelected()) {
			a.setActvtyDfnDsgRouteCdgUsrSltd(String.valueOf(activitydefinitiondosageroutecoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Dsg_Route_Txt ********************************************************************************/
		if(activitydefinitiondosageroute.hasText()) {
			a.setActvtyDfnDsgRouteTxt(String.valueOf(activitydefinitiondosageroute.getText()));
		}
		/******************** ActvtyDfn_Subtitle ********************************************************************************/
		if(activitydefinition.hasSubtitle()) {
			a.setActvtyDfnSubtitle(String.valueOf(activitydefinition.getSubtitle()));
		}
		/******************** activitydefinitionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionquantity = activitydefinition.getQuantity();

		/******************** ActvtyDfn_Qnty_Vl ********************************************************************************/
		if(activitydefinitionquantity.hasValue()) {
			a.setActvtyDfnQntyVl(String.valueOf(activitydefinitionquantity.getValue()));
		}
		/******************** activitydefinitionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionquantitycomparator = activitydefinitionquantity.getComparator();
		a.setActvtyDfnQntyCmprtr(activitydefinitionquantitycomparator.toCode());

		/******************** ActvtyDfn_Qnty_Cd ********************************************************************************/
		if(activitydefinitionquantity.hasCode()) {
			a.setActvtyDfnQntyCd(String.valueOf(activitydefinitionquantity.getCode()));
		}
		/******************** ActvtyDfn_Qnty_Sys ********************************************************************************/
		if(activitydefinitionquantity.hasSystem()) {
			a.setActvtyDfnQntySys(String.valueOf(activitydefinitionquantity.getSystem()));
		}
		/******************** ActvtyDfn_Qnty_Unt ********************************************************************************/
		if(activitydefinitionquantity.hasUnit()) {
			a.setActvtyDfnQntyUnt(String.valueOf(activitydefinitionquantity.getUnit()));
		}
		/******************** ActvtyDfn_Exprmtl ********************************************************************************/
		if(activitydefinition.hasExperimental()) {
			a.setActvtyDfnExprmtl(String.valueOf(activitydefinition.getExperimental()));
		}
		/******************** ActvtyDfn_Pblshr ********************************************************************************/
		if(activitydefinition.hasPublisher()) {
			a.setActvtyDfnPblshr(String.valueOf(activitydefinition.getPublisher()));
		}
		/******************** activitydefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioneffectiveperiod = activitydefinition.getEffectivePeriod();

		/******************** ActvtyDfn_EfctivePrd_End ********************************************************************************/
		if(activitydefinitioneffectiveperiod.hasEnd()) {
			a.setActvtyDfnEfctivePrdEnd(String.valueOf(activitydefinitioneffectiveperiod.getEnd()));
		}
		/******************** ActvtyDfn_EfctivePrd_Strt ********************************************************************************/
		if(activitydefinitioneffectiveperiod.hasStart()) {
			a.setActvtyDfnEfctivePrdStrt(String.valueOf(activitydefinitioneffectiveperiod.getStart()));
		}
		/******************** ActvtyDfn_ObsrvtnRsltRqrment ********************************************************************************/
		if(activitydefinition.hasObservationResultRequirement()) {
			a.setActvtyDfnObsrvtnRsltRqrment(String.valueOf(activitydefinition.getObservationResultRequirementFirstRep()));
		}
		/******************** ActvtyDfn_Prpse ********************************************************************************/
		if(activitydefinition.hasPurpose()) {
			a.setActvtyDfnPrpse(String.valueOf(activitydefinition.getPurpose()));
		}
		/******************** activitydefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitionauthor = activitydefinition.getAuthorFirstRep();

		/******************** ActvtyDfn_Athr_Nm ********************************************************************************/
		if(activitydefinitionauthor.hasName()) {
			a.setActvtyDfnAthrNm(String.valueOf(activitydefinitionauthor.getName()));
		}
		/******************** activitydefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitionauthortelecom = activitydefinitionauthor.getTelecomFirstRep();

		/******************** ActvtyDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(activitydefinitionauthortelecom.hasValue()) {
			a.setActvtyDfnAthrTlcmVl(String.valueOf(activitydefinitionauthortelecom.getValue()));
		}
		/******************** activitydefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitionauthortelecomsystem = activitydefinitionauthortelecom.getSystem();
		a.setActvtyDfnAthrTlcmSys(activitydefinitionauthortelecomsystem.toCode());

		/******************** activitydefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionauthortelecomperiod = activitydefinitionauthortelecom.getPeriod();

		/******************** ActvtyDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitionauthortelecomperiod.hasEnd()) {
			a.setActvtyDfnAthrTlcmPrdEnd(String.valueOf(activitydefinitionauthortelecomperiod.getEnd()));
		}
		/******************** ActvtyDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitionauthortelecomperiod.hasStart()) {
			a.setActvtyDfnAthrTlcmPrdStrt(String.valueOf(activitydefinitionauthortelecomperiod.getStart()));
		}
		/******************** activitydefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitionauthortelecomuse = activitydefinitionauthortelecom.getUse();
		a.setActvtyDfnAthrTlcmUse(activitydefinitionauthortelecomuse.toCode());

		/******************** ActvtyDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitionauthortelecom.hasRank()) {
			a.setActvtyDfnAthrTlcmRnk(String.valueOf(activitydefinitionauthortelecom.getRank()));
		}
		/******************** ActvtyDfn_DoNotPerform ********************************************************************************/
		if(activitydefinition.hasDoNotPerform()) {
			a.setActvtyDfnDoNotPerform(String.valueOf(activitydefinition.getDoNotPerform()));
		}
		/******************** ActvtyDfn_Copyright ********************************************************************************/
		if(activitydefinition.hasCopyright()) {
			a.setActvtyDfnCopyright(String.valueOf(activitydefinition.getCopyright()));
		}
		/******************** ActvtyDfn_LastReviewDt ********************************************************************************/
		if(activitydefinition.hasLastReviewDate()) {
			a.setActvtyDfnLastReviewDt(String.valueOf(activitydefinition.getLastReviewDate()));
		}
		/******************** activitydefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitioneditor = activitydefinition.getEditorFirstRep();

		/******************** ActvtyDfn_Editor_Nm ********************************************************************************/
		if(activitydefinitioneditor.hasName()) {
			a.setActvtyDfnEditorNm(String.valueOf(activitydefinitioneditor.getName()));
		}
		/******************** activitydefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitioneditortelecom = activitydefinitioneditor.getTelecomFirstRep();

		/******************** ActvtyDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(activitydefinitioneditortelecom.hasValue()) {
			a.setActvtyDfnEditorTlcmVl(String.valueOf(activitydefinitioneditortelecom.getValue()));
		}
		/******************** activitydefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitioneditortelecomsystem = activitydefinitioneditortelecom.getSystem();
		a.setActvtyDfnEditorTlcmSys(activitydefinitioneditortelecomsystem.toCode());

		/******************** activitydefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioneditortelecomperiod = activitydefinitioneditortelecom.getPeriod();

		/******************** ActvtyDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitioneditortelecomperiod.hasEnd()) {
			a.setActvtyDfnEditorTlcmPrdEnd(String.valueOf(activitydefinitioneditortelecomperiod.getEnd()));
		}
		/******************** ActvtyDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitioneditortelecomperiod.hasStart()) {
			a.setActvtyDfnEditorTlcmPrdStrt(String.valueOf(activitydefinitioneditortelecomperiod.getStart()));
		}
		/******************** activitydefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitioneditortelecomuse = activitydefinitioneditortelecom.getUse();
		a.setActvtyDfnEditorTlcmUse(activitydefinitioneditortelecomuse.toCode());

		/******************** ActvtyDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitioneditortelecom.hasRank()) {
			a.setActvtyDfnEditorTlcmRnk(String.valueOf(activitydefinitioneditortelecom.getRank()));
		}
		/******************** ActvtyDfn_ApprovalDt ********************************************************************************/
		if(activitydefinition.hasApprovalDate()) {
			a.setActvtyDfnApprovalDt(String.valueOf(activitydefinition.getApprovalDate()));
		}
		/******************** activitydefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiontopic = activitydefinition.getTopicFirstRep();

		/******************** activitydefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiontopiccoding = activitydefinitiontopic.getCodingFirstRep();

		/******************** ActvtyDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiontopiccoding.hasDisplay()) {
			a.setActvtyDfnTopicCdgDsply(String.valueOf(activitydefinitiontopiccoding.getDisplay()));
		}
		/******************** ActvtyDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiontopiccoding.hasVersion()) {
			a.setActvtyDfnTopicCdgVrsn(String.valueOf(activitydefinitiontopiccoding.getVersion()));
		}
		/******************** ActvtyDfn_Topic_Cdg_Cd ********************************************************************************/
		if(activitydefinitiontopiccoding.hasCode()) {
			a.setActvtyDfnTopicCdgCd(String.valueOf(activitydefinitiontopiccoding.getCode()));
		}
		/******************** ActvtyDfn_Topic_Cdg_Sys ********************************************************************************/
		if(activitydefinitiontopiccoding.hasSystem()) {
			a.setActvtyDfnTopicCdgSys(String.valueOf(activitydefinitiontopiccoding.getSystem()));
		}
		/******************** ActvtyDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiontopiccoding.hasUserSelected()) {
			a.setActvtyDfnTopicCdgUsrSltd(String.valueOf(activitydefinitiontopiccoding.getUserSelected()));
		}
		/******************** ActvtyDfn_Topic_Txt ********************************************************************************/
		if(activitydefinitiontopic.hasText()) {
			a.setActvtyDfnTopicTxt(String.valueOf(activitydefinitiontopic.getText()));
		}
		/******************** ActvtyDfn_Usg ********************************************************************************/
		if(activitydefinition.hasUsage()) {
			a.setActvtyDfnUsg(String.valueOf(activitydefinition.getUsage()));
		}
		/******************** activitydefinitiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiontimingrange = activitydefinition.getTimingRange();

		/******************** activitydefinitiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingrangelow = activitydefinitiontimingrange.getLow();

		/******************** ActvtyDfn_TmgRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasValue()) {
			a.setActvtyDfnTmgRngLwVl(String.valueOf(activitydefinitiontimingrangelow.getValue()));
		}
		/******************** activitydefinitiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingrangelowcomparator = activitydefinitiontimingrangelow.getComparator();
		a.setActvtyDfnTmgRngLwCmprtr(activitydefinitiontimingrangelowcomparator.toCode());

		/******************** ActvtyDfn_TmgRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasCode()) {
			a.setActvtyDfnTmgRngLwCd(String.valueOf(activitydefinitiontimingrangelow.getCode()));
		}
		/******************** ActvtyDfn_TmgRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasSystem()) {
			a.setActvtyDfnTmgRngLwSys(String.valueOf(activitydefinitiontimingrangelow.getSystem()));
		}
		/******************** ActvtyDfn_TmgRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasUnit()) {
			a.setActvtyDfnTmgRngLwUnt(String.valueOf(activitydefinitiontimingrangelow.getUnit()));
		}
		/******************** activitydefinitiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingrangehigh = activitydefinitiontimingrange.getHigh();

		/******************** ActvtyDfn_TmgRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasValue()) {
			a.setActvtyDfnTmgRngHiVl(String.valueOf(activitydefinitiontimingrangehigh.getValue()));
		}
		/******************** activitydefinitiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingrangehighcomparator = activitydefinitiontimingrangehigh.getComparator();
		a.setActvtyDfnTmgRngHiCmprtr(activitydefinitiontimingrangehighcomparator.toCode());

		/******************** ActvtyDfn_TmgRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasCode()) {
			a.setActvtyDfnTmgRngHiCd(String.valueOf(activitydefinitiontimingrangehigh.getCode()));
		}
		/******************** ActvtyDfn_TmgRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasSystem()) {
			a.setActvtyDfnTmgRngHiSys(String.valueOf(activitydefinitiontimingrangehigh.getSystem()));
		}
		/******************** ActvtyDfn_TmgRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasUnit()) {
			a.setActvtyDfnTmgRngHiUnt(String.valueOf(activitydefinitiontimingrangehigh.getUnit()));
		}
		/******************** activitydefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind activitydefinitionkind = activitydefinition.getKind();
		a.setActvtyDfnKind(activitydefinitionkind.toCode());

		/******************** activitydefinitiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiontimingduration = activitydefinition.getTimingDuration();

		/******************** activitydefinitiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age activitydefinitiontimingage = activitydefinition.getTimingAge();

		/******************** ActvtyDfn_Transform ********************************************************************************/
		if(activitydefinition.hasTransform()) {
			a.setActvtyDfnTransform(String.valueOf(activitydefinition.getTransform()));
		}
		/******************** ActvtyDfn_TmgDtTimeTyp ********************************************************************************/
		if(activitydefinition.hasTimingDateTimeType()) {
			a.setActvtyDfnTmgDtTimeTyp(String.valueOf(activitydefinition.getTimingDateTimeType()));
		}
		/******************** activitydefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact activitydefinitionrelatedartifact = activitydefinition.getRelatedArtifactFirstRep();

		/******************** ActvtyDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(activitydefinitionrelatedartifact.hasResource()) {
			a.setActvtyDfnRltedArtfctRsrc(String.valueOf(activitydefinitionrelatedartifact.getResource()));
		}
		/******************** activitydefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType activitydefinitionrelatedartifacttype = activitydefinitionrelatedartifact.getType();
		a.setActvtyDfnRltedArtfctTyp(activitydefinitionrelatedartifacttype.toCode());

		/******************** ActvtyDfn_RltedArtfct_Url ********************************************************************************/
		if(activitydefinitionrelatedartifact.hasUrl()) {
			a.setActvtyDfnRltedArtfctUrl(String.valueOf(activitydefinitionrelatedartifact.getUrl()));
		}
		/******************** ActvtyDfn_RltedArtfct_Lbl ********************************************************************************/
		if(activitydefinitionrelatedartifact.hasLabel()) {
			a.setActvtyDfnRltedArtfctLbl(String.valueOf(activitydefinitionrelatedartifact.getLabel()));
		}
		/******************** ActvtyDfn_RltedArtfct_Citation ********************************************************************************/
		if(activitydefinitionrelatedartifact.hasCitation()) {
			a.setActvtyDfnRltedArtfctCitation(String.valueOf(activitydefinitionrelatedartifact.getCitation()));
		}
		/******************** activitydefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment activitydefinitionrelatedartifactdocument = activitydefinitionrelatedartifact.getDocument();

		/******************** ActvtyDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasSize()) {
			a.setActvtyDfnRltedArtfctDocSz(String.valueOf(activitydefinitionrelatedartifactdocument.getSize()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasLanguage()) {
			a.setActvtyDfnRltedArtfctDocLnguage(String.valueOf(activitydefinitionrelatedartifactdocument.getLanguage()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasContentType()) {
			a.setActvtyDfnRltedArtfctDocCntntTyp(String.valueOf(activitydefinitionrelatedartifactdocument.getContentType()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasUrl()) {
			a.setActvtyDfnRltedArtfctDocUrl(String.valueOf(activitydefinitionrelatedartifactdocument.getUrl()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasTitle()) {
			a.setActvtyDfnRltedArtfctDocTtl(String.valueOf(activitydefinitionrelatedartifactdocument.getTitle()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasHash()) {
			a.setActvtyDfnRltedArtfctDocHash(String.valueOf(activitydefinitionrelatedartifactdocument.getHash()));
		}

		/******************** ActvtyDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasData()) {
			a.setActvtyDfnRltedArtfctDocData(String.valueOf(activitydefinitionrelatedartifactdocument.getData()));
		}

		/******************** ActvtyDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(activitydefinitionrelatedartifactdocument.hasCreation()) {
			a.setActvtyDfnRltedArtfctDocCreation(String.valueOf(activitydefinitionrelatedartifactdocument.getCreation()));
		}
		return a;
	}
}
