package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskEvidenceSynthesis;
public class RiskEvidenceSynthesisBidirectionalConversion 
{
	public RiskEvidenceSynthesis RiskEvidenceSynthesiss(org.hl7.fhir.r4.model.RiskEvidenceSynthesis riskevidencesynthesis) throws ParseException
	{
		 main.java.com.campfhir.model.RiskEvidenceSynthesis r = new  main.java.com.campfhir.model.RiskEvidenceSynthesis();

		/******************** id ********************************************************************************/
		riskevidencesynthesis.setId(r.getId());

		/******************** RskEvdnceSynths_Nm ********************************************************************************/
		if(riskevidencesynthesis.hasName()) {
			r.setRskEvdnceSynthsNm(String.valueOf(riskevidencesynthesis.getName()));
		}
		/******************** RskEvdnceSynths_Vrsn ********************************************************************************/
		if(riskevidencesynthesis.hasVersion()) {
			r.setRskEvdnceSynthsVrsn(String.valueOf(riskevidencesynthesis.getVersion()));
		}
		/******************** RskEvdnceSynths_Dt ********************************************************************************/
		if(riskevidencesynthesis.hasDate()) {
			r.setRskEvdnceSynthsDt(String.valueOf(riskevidencesynthesis.getDate()));
		}
		/******************** RskEvdnceSynths_Url ********************************************************************************/
		if(riskevidencesynthesis.hasUrl()) {
			r.setRskEvdnceSynthsUrl(String.valueOf(riskevidencesynthesis.getUrl()));
		}
		/******************** riskevidencesynthesiscertainty ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent riskevidencesynthesiscertainty = riskevidencesynthesis.getCertaintyFirstRep();

		/******************** riskevidencesynthesiscertaintynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskevidencesynthesiscertaintynote = riskevidencesynthesiscertainty.getNoteFirstRep();

		/******************** RskEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(riskevidencesynthesiscertaintynote.hasTime()) {
			r.setRskEvdnceSynthsCrtntyNtTime(String.valueOf(riskevidencesynthesiscertaintynote.getTime()));
		}
		/******************** RskEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(riskevidencesynthesiscertaintynote.hasAuthorReference()) {
			r.setRskEvdnceSynthsCrtntyNtAthrRfrnc(String.valueOf(riskevidencesynthesiscertaintynote.getAuthorReference()));
		}
		/******************** RskEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintynote.hasText()) {
			r.setRskEvdnceSynthsCrtntyNtTxt(String.valueOf(riskevidencesynthesiscertaintynote.getText()));
		}
		/******************** RskEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(riskevidencesynthesiscertaintynote.hasAuthorStringType()) {
			r.setRskEvdnceSynthsCrtntyNtAthrStrgTyp(String.valueOf(riskevidencesynthesiscertaintynote.getAuthorStringType()));
		}
		/******************** riskevidencesynthesiscertaintyrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintyrating = riskevidencesynthesiscertainty.getRatingFirstRep();

		/******************** riskevidencesynthesiscertaintyratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesiscertaintyratingcoding = riskevidencesynthesiscertaintyrating.getCodingFirstRep();

		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcoding.hasDisplay()) {
			r.setRskEvdnceSynthsCrtntyRatingCdgDsply(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcoding.hasVersion()) {
			r.setRskEvdnceSynthsCrtntyRatingCdgVrsn(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getVersion()));
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcoding.hasCode()) {
			r.setRskEvdnceSynthsCrtntyRatingCdgCd(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getCode()));
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcoding.hasSystem()) {
			r.setRskEvdnceSynthsCrtntyRatingCdgSys(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getSystem()));
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcoding.hasUserSelected()) {
			r.setRskEvdnceSynthsCrtntyRatingCdgUsrSltd(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintyrating.hasText()) {
			r.setRskEvdnceSynthsCrtntyRatingTxt(String.valueOf(riskevidencesynthesiscertaintyrating.getText()));
		}
		/******************** riskevidencesynthesiscertaintycertaintysubcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent riskevidencesynthesiscertaintycertaintysubcomponent = riskevidencesynthesiscertainty.getCertaintySubcomponentFirstRep();

		/******************** riskevidencesynthesiscertaintycertaintysubcomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintycertaintysubcomponenttype = riskevidencesynthesiscertaintycertaintysubcomponent.getType();

		/******************** riskevidencesynthesiscertaintycertaintysubcomponenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesiscertaintycertaintysubcomponenttypecoding = riskevidencesynthesiscertaintycertaintysubcomponenttype.getCodingFirstRep();

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasDisplay()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasVersion()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasCode()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getCode()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasSystem()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttype.hasText()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttype.getText()));
		}
		/******************** riskevidencesynthesiscertaintycertaintysubcomponentnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskevidencesynthesiscertaintycertaintysubcomponentnote = riskevidencesynthesiscertaintycertaintysubcomponent.getNoteFirstRep();

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasTime()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentnote.getTime()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorReference()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorReference()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasText()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentnote.getText()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorStringType()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorStringType()));
		}
		/******************** riskevidencesynthesiscertaintycertaintysubcomponentrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintycertaintysubcomponentrating = riskevidencesynthesiscertaintycertaintysubcomponent.getRatingFirstRep();

		/******************** riskevidencesynthesiscertaintycertaintysubcomponentratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesiscertaintycertaintysubcomponentratingcoding = riskevidencesynthesiscertaintycertaintysubcomponentrating.getCodingFirstRep();

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasDisplay()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasVersion()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getVersion()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasCode()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getCode()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasSystem()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getSystem()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasUserSelected()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentrating.hasText()) {
			r.setRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentrating.getText()));
		}
		/******************** riskevidencesynthesisreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesisreviewer = riskevidencesynthesis.getReviewerFirstRep();

		/******************** RskEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(riskevidencesynthesisreviewer.hasName()) {
			r.setRskEvdnceSynthsRviewrNm(String.valueOf(riskevidencesynthesisreviewer.getName()));
		}
		/******************** riskevidencesynthesisreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesisreviewertelecom = riskevidencesynthesisreviewer.getTelecomFirstRep();

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesisreviewertelecom.hasValue()) {
			r.setRskEvdnceSynthsRviewrTlcmVl(String.valueOf(riskevidencesynthesisreviewertelecom.getValue()));
		}
		/******************** riskevidencesynthesisreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesisreviewertelecomsystem = riskevidencesynthesisreviewertelecom.getSystem();
		r.setRskEvdnceSynthsRviewrTlcmSys(riskevidencesynthesisreviewertelecomsystem.toCode());

		/******************** riskevidencesynthesisreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisreviewertelecomperiod = riskevidencesynthesisreviewertelecom.getPeriod();

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesisreviewertelecomperiod.hasEnd()) {
			r.setRskEvdnceSynthsRviewrTlcmPrdEnd(String.valueOf(riskevidencesynthesisreviewertelecomperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisreviewertelecomperiod.hasStart()) {
			r.setRskEvdnceSynthsRviewrTlcmPrdStrt(String.valueOf(riskevidencesynthesisreviewertelecomperiod.getStart()));
		}
		/******************** riskevidencesynthesisreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesisreviewertelecomuse = riskevidencesynthesisreviewertelecom.getUse();
		r.setRskEvdnceSynthsRviewrTlcmUse(riskevidencesynthesisreviewertelecomuse.toCode());

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesisreviewertelecom.hasRank()) {
			r.setRskEvdnceSynthsRviewrTlcmRnk(String.valueOf(riskevidencesynthesisreviewertelecom.getRank()));
		}
		/******************** riskevidencesynthesisendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesisendorser = riskevidencesynthesis.getEndorserFirstRep();

		/******************** RskEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(riskevidencesynthesisendorser.hasName()) {
			r.setRskEvdnceSynthsEndsrNm(String.valueOf(riskevidencesynthesisendorser.getName()));
		}
		/******************** riskevidencesynthesisendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesisendorsertelecom = riskevidencesynthesisendorser.getTelecomFirstRep();

		/******************** RskEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesisendorsertelecom.hasValue()) {
			r.setRskEvdnceSynthsEndsrTlcmVl(String.valueOf(riskevidencesynthesisendorsertelecom.getValue()));
		}
		/******************** riskevidencesynthesisendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesisendorsertelecomsystem = riskevidencesynthesisendorsertelecom.getSystem();
		r.setRskEvdnceSynthsEndsrTlcmSys(riskevidencesynthesisendorsertelecomsystem.toCode());

		/******************** riskevidencesynthesisendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisendorsertelecomperiod = riskevidencesynthesisendorsertelecom.getPeriod();

		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesisendorsertelecomperiod.hasEnd()) {
			r.setRskEvdnceSynthsEndsrTlcmPrdEnd(String.valueOf(riskevidencesynthesisendorsertelecomperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisendorsertelecomperiod.hasStart()) {
			r.setRskEvdnceSynthsEndsrTlcmPrdStrt(String.valueOf(riskevidencesynthesisendorsertelecomperiod.getStart()));
		}
		/******************** riskevidencesynthesisendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesisendorsertelecomuse = riskevidencesynthesisendorsertelecom.getUse();
		r.setRskEvdnceSynthsEndsrTlcmUse(riskevidencesynthesisendorsertelecomuse.toCode());

		/******************** RskEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesisendorsertelecom.hasRank()) {
			r.setRskEvdnceSynthsEndsrTlcmRnk(String.valueOf(riskevidencesynthesisendorsertelecom.getRank()));
		}
		/******************** riskevidencesynthesisjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisjurisdiction = riskevidencesynthesis.getJurisdictionFirstRep();

		/******************** riskevidencesynthesisjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisjurisdictioncoding = riskevidencesynthesisjurisdiction.getCodingFirstRep();

		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncoding.hasDisplay()) {
			r.setRskEvdnceSynthsJrsdctnCdgDsply(String.valueOf(riskevidencesynthesisjurisdictioncoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncoding.hasVersion()) {
			r.setRskEvdnceSynthsJrsdctnCdgVrsn(String.valueOf(riskevidencesynthesisjurisdictioncoding.getVersion()));
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncoding.hasCode()) {
			r.setRskEvdnceSynthsJrsdctnCdgCd(String.valueOf(riskevidencesynthesisjurisdictioncoding.getCode()));
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncoding.hasSystem()) {
			r.setRskEvdnceSynthsJrsdctnCdgSys(String.valueOf(riskevidencesynthesisjurisdictioncoding.getSystem()));
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncoding.hasUserSelected()) {
			r.setRskEvdnceSynthsJrsdctnCdgUsrSltd(String.valueOf(riskevidencesynthesisjurisdictioncoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(riskevidencesynthesisjurisdiction.hasText()) {
			r.setRskEvdnceSynthsJrsdctnTxt(String.valueOf(riskevidencesynthesisjurisdiction.getText()));
		}
		/******************** riskevidencesynthesisusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext riskevidencesynthesisusecontext = riskevidencesynthesis.getUseContextFirstRep();

		/******************** riskevidencesynthesisusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisusecontextcode = riskevidencesynthesisusecontext.getCode();

		/******************** RskEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(riskevidencesynthesisusecontextcode.hasDisplay()) {
			r.setRskEvdnceSynthsUseCntxtCdDsply(String.valueOf(riskevidencesynthesisusecontextcode.getDisplay()));
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(riskevidencesynthesisusecontextcode.hasVersion()) {
			r.setRskEvdnceSynthsUseCntxtCdVrsn(String.valueOf(riskevidencesynthesisusecontextcode.getVersion()));
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontextcode.hasSystem()) {
			r.setRskEvdnceSynthsUseCntxtCdSys(String.valueOf(riskevidencesynthesisusecontextcode.getSystem()));
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisusecontextcode.hasUserSelected()) {
			r.setRskEvdnceSynthsUseCntxtCdUsrSltd(String.valueOf(riskevidencesynthesisusecontextcode.getUserSelected()));
		}
		/******************** riskevidencesynthesisusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisusecontextvaluecodeableconcept = riskevidencesynthesisusecontext.getValueCodeableConcept();

		/******************** riskevidencesynthesisusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisusecontextvaluecodeableconceptcoding = riskevidencesynthesisusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasDisplay()) {
			r.setRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasVersion()) {
			r.setRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasCode()) {
			r.setRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasSystem()) {
			r.setRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			r.setRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconcept.hasText()) {
			r.setRskEvdnceSynthsUseCntxtVlCdbleCncptTxt(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconcept.getText()));
		}
		/******************** riskevidencesynthesisusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluequantity = riskevidencesynthesisusecontext.getValueQuantity();

		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluequantity.hasValue()) {
			r.setRskEvdnceSynthsUseCntxtVlQntyVl(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getValue()));
		}
		/******************** riskevidencesynthesisusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskevidencesynthesisusecontextvaluequantitycomparator = riskevidencesynthesisusecontextvaluequantity.getComparator();
		r.setRskEvdnceSynthsUseCntxtVlQntyCmprtr(riskevidencesynthesisusecontextvaluequantitycomparator.toCode());

		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluequantity.hasCode()) {
			r.setRskEvdnceSynthsUseCntxtVlQntyCd(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getCode()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluequantity.hasSystem()) {
			r.setRskEvdnceSynthsUseCntxtVlQntySys(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getSystem()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluequantity.hasUnit()) {
			r.setRskEvdnceSynthsUseCntxtVlQntyUnt(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getUnit()));
		}
		/******************** riskevidencesynthesisusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskevidencesynthesisusecontextvaluerange = riskevidencesynthesisusecontext.getValueRange();

		/******************** riskevidencesynthesisusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluerangelow = riskevidencesynthesisusecontextvaluerange.getLow();

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangelow.hasValue()) {
			r.setRskEvdnceSynthsUseCntxtVlRngLwVl(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getValue()));
		}
		/******************** riskevidencesynthesisusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskevidencesynthesisusecontextvaluerangelowcomparator = riskevidencesynthesisusecontextvaluerangelow.getComparator();
		r.setRskEvdnceSynthsUseCntxtVlRngLwCmprtr(riskevidencesynthesisusecontextvaluerangelowcomparator.toCode());

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangelow.hasCode()) {
			r.setRskEvdnceSynthsUseCntxtVlRngLwCd(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getCode()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangelow.hasSystem()) {
			r.setRskEvdnceSynthsUseCntxtVlRngLwSys(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getSystem()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangelow.hasUnit()) {
			r.setRskEvdnceSynthsUseCntxtVlRngLwUnt(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getUnit()));
		}
		/******************** riskevidencesynthesisusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluerangehigh = riskevidencesynthesisusecontextvaluerange.getHigh();

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangehigh.hasValue()) {
			r.setRskEvdnceSynthsUseCntxtVlRngHiVl(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getValue()));
		}
		/******************** riskevidencesynthesisusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskevidencesynthesisusecontextvaluerangehighcomparator = riskevidencesynthesisusecontextvaluerangehigh.getComparator();
		r.setRskEvdnceSynthsUseCntxtVlRngHiCmprtr(riskevidencesynthesisusecontextvaluerangehighcomparator.toCode());

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangehigh.hasCode()) {
			r.setRskEvdnceSynthsUseCntxtVlRngHiCd(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getCode()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangehigh.hasSystem()) {
			r.setRskEvdnceSynthsUseCntxtVlRngHiSys(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getSystem()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluerangehigh.hasUnit()) {
			r.setRskEvdnceSynthsUseCntxtVlRngHiUnt(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getUnit()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(riskevidencesynthesisusecontext.hasValueReference()) {
			r.setRskEvdnceSynthsUseCntxtVlRfrnc(String.valueOf(riskevidencesynthesisusecontext.getValueReference()));
		}
		/******************** riskevidencesynthesisstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus riskevidencesynthesisstatus = riskevidencesynthesis.getStatus();
		r.setRskEvdnceSynthsSts(riskevidencesynthesisstatus.toCode());

		/******************** RskEvdnceSynths_Dscrptn ********************************************************************************/
		if(riskevidencesynthesis.hasDescription()) {
			r.setRskEvdnceSynthsDscrptn(String.valueOf(riskevidencesynthesis.getDescription()));
		}
		/******************** riskevidencesynthesisnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskevidencesynthesisnote = riskevidencesynthesis.getNoteFirstRep();

		/******************** RskEvdnceSynths_Nt_Time ********************************************************************************/
		if(riskevidencesynthesisnote.hasTime()) {
			r.setRskEvdnceSynthsNtTime(String.valueOf(riskevidencesynthesisnote.getTime()));
		}
		/******************** RskEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(riskevidencesynthesisnote.hasAuthorReference()) {
			r.setRskEvdnceSynthsNtAthrRfrnc(String.valueOf(riskevidencesynthesisnote.getAuthorReference()));
		}
		/******************** RskEvdnceSynths_Nt_Txt ********************************************************************************/
		if(riskevidencesynthesisnote.hasText()) {
			r.setRskEvdnceSynthsNtTxt(String.valueOf(riskevidencesynthesisnote.getText()));
		}
		/******************** RskEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(riskevidencesynthesisnote.hasAuthorStringType()) {
			r.setRskEvdnceSynthsNtAthrStrgTyp(String.valueOf(riskevidencesynthesisnote.getAuthorStringType()));
		}
		/******************** RskEvdnceSynths_Outcome ********************************************************************************/
		if(riskevidencesynthesis.hasOutcome()) {
			r.setRskEvdnceSynthsOutcome(String.valueOf(riskevidencesynthesis.getOutcome()));
		}
		/******************** riskevidencesynthesiscontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesiscontact = riskevidencesynthesis.getContactFirstRep();

		/******************** RskEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(riskevidencesynthesiscontact.hasName()) {
			r.setRskEvdnceSynthsCntctNm(String.valueOf(riskevidencesynthesiscontact.getName()));
		}
		/******************** riskevidencesynthesiscontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesiscontacttelecom = riskevidencesynthesiscontact.getTelecomFirstRep();

		/******************** RskEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesiscontacttelecom.hasValue()) {
			r.setRskEvdnceSynthsCntctTlcmVl(String.valueOf(riskevidencesynthesiscontacttelecom.getValue()));
		}
		/******************** riskevidencesynthesiscontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesiscontacttelecomsystem = riskevidencesynthesiscontacttelecom.getSystem();
		r.setRskEvdnceSynthsCntctTlcmSys(riskevidencesynthesiscontacttelecomsystem.toCode());

		/******************** riskevidencesynthesiscontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiscontacttelecomperiod = riskevidencesynthesiscontacttelecom.getPeriod();

		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesiscontacttelecomperiod.hasEnd()) {
			r.setRskEvdnceSynthsCntctTlcmPrdEnd(String.valueOf(riskevidencesynthesiscontacttelecomperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesiscontacttelecomperiod.hasStart()) {
			r.setRskEvdnceSynthsCntctTlcmPrdStrt(String.valueOf(riskevidencesynthesiscontacttelecomperiod.getStart()));
		}
		/******************** riskevidencesynthesiscontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesiscontacttelecomuse = riskevidencesynthesiscontacttelecom.getUse();
		r.setRskEvdnceSynthsCntctTlcmUse(riskevidencesynthesiscontacttelecomuse.toCode());

		/******************** RskEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesiscontacttelecom.hasRank()) {
			r.setRskEvdnceSynthsCntctTlcmRnk(String.valueOf(riskevidencesynthesiscontacttelecom.getRank()));
		}
		/******************** RskEvdnceSynths_Ttl ********************************************************************************/
		if(riskevidencesynthesis.hasTitle()) {
			r.setRskEvdnceSynthsTtl(String.valueOf(riskevidencesynthesis.getTitle()));
		}
		/******************** riskevidencesynthesisidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier riskevidencesynthesisidentifier = riskevidencesynthesis.getIdentifierFirstRep();

		/******************** RskEvdnceSynths_Id_Vl ********************************************************************************/
		if(riskevidencesynthesisidentifier.hasValue()) {
			r.setRskEvdnceSynthsIdVl(String.valueOf(riskevidencesynthesisidentifier.getValue()));
		}
		/******************** riskevidencesynthesisidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisidentifiertype = riskevidencesynthesisidentifier.getType();

		/******************** riskevidencesynthesisidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisidentifiertypecoding = riskevidencesynthesisidentifiertype.getCodingFirstRep();

		/******************** RskEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecoding.hasDisplay()) {
			r.setRskEvdnceSynthsIdTypCdgDsply(String.valueOf(riskevidencesynthesisidentifiertypecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecoding.hasVersion()) {
			r.setRskEvdnceSynthsIdTypCdgVrsn(String.valueOf(riskevidencesynthesisidentifiertypecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecoding.hasCode()) {
			r.setRskEvdnceSynthsIdTypCdgCd(String.valueOf(riskevidencesynthesisidentifiertypecoding.getCode()));
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecoding.hasSystem()) {
			r.setRskEvdnceSynthsIdTypCdgSys(String.valueOf(riskevidencesynthesisidentifiertypecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsIdTypCdgUsrSltd(String.valueOf(riskevidencesynthesisidentifiertypecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesisidentifiertype.hasText()) {
			r.setRskEvdnceSynthsIdTypTxt(String.valueOf(riskevidencesynthesisidentifiertype.getText()));
		}
		/******************** RskEvdnceSynths_Id_Sys ********************************************************************************/
		if(riskevidencesynthesisidentifier.hasSystem()) {
			r.setRskEvdnceSynthsIdSys(String.valueOf(riskevidencesynthesisidentifier.getSystem()));
		}
		/******************** RskEvdnceSynths_Id_Assigner ********************************************************************************/
		if(riskevidencesynthesisidentifier.hasAssigner()) {
			r.setRskEvdnceSynthsIdAssigner(String.valueOf(riskevidencesynthesisidentifier.getAssigner()));
		}
		/******************** riskevidencesynthesisidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisidentifierperiod = riskevidencesynthesisidentifier.getPeriod();

		/******************** RskEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(riskevidencesynthesisidentifierperiod.hasEnd()) {
			r.setRskEvdnceSynthsIdPrdEnd(String.valueOf(riskevidencesynthesisidentifierperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisidentifierperiod.hasStart()) {
			r.setRskEvdnceSynthsIdPrdStrt(String.valueOf(riskevidencesynthesisidentifierperiod.getStart()));
		}
		/******************** riskevidencesynthesisidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse riskevidencesynthesisidentifieruse = riskevidencesynthesisidentifier.getUse();
		r.setRskEvdnceSynthsIdUse(riskevidencesynthesisidentifieruse.toCode());

		/******************** RskEvdnceSynths_Popln ********************************************************************************/
		if(riskevidencesynthesis.hasPopulation()) {
			r.setRskEvdnceSynthsPopln(String.valueOf(riskevidencesynthesis.getPopulation()));
		}
		/******************** RskEvdnceSynths_Pblshr ********************************************************************************/
		if(riskevidencesynthesis.hasPublisher()) {
			r.setRskEvdnceSynthsPblshr(String.valueOf(riskevidencesynthesis.getPublisher()));
		}
		/******************** riskevidencesynthesiseffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiseffectiveperiod = riskevidencesynthesis.getEffectivePeriod();

		/******************** RskEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(riskevidencesynthesiseffectiveperiod.hasEnd()) {
			r.setRskEvdnceSynthsEfctivePrdEnd(String.valueOf(riskevidencesynthesiseffectiveperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(riskevidencesynthesiseffectiveperiod.hasStart()) {
			r.setRskEvdnceSynthsEfctivePrdStrt(String.valueOf(riskevidencesynthesiseffectiveperiod.getStart()));
		}
		/******************** riskevidencesynthesisauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesisauthor = riskevidencesynthesis.getAuthorFirstRep();

		/******************** RskEvdnceSynths_Athr_Nm ********************************************************************************/
		if(riskevidencesynthesisauthor.hasName()) {
			r.setRskEvdnceSynthsAthrNm(String.valueOf(riskevidencesynthesisauthor.getName()));
		}
		/******************** riskevidencesynthesisauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesisauthortelecom = riskevidencesynthesisauthor.getTelecomFirstRep();

		/******************** RskEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesisauthortelecom.hasValue()) {
			r.setRskEvdnceSynthsAthrTlcmVl(String.valueOf(riskevidencesynthesisauthortelecom.getValue()));
		}
		/******************** riskevidencesynthesisauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesisauthortelecomsystem = riskevidencesynthesisauthortelecom.getSystem();
		r.setRskEvdnceSynthsAthrTlcmSys(riskevidencesynthesisauthortelecomsystem.toCode());

		/******************** riskevidencesynthesisauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisauthortelecomperiod = riskevidencesynthesisauthortelecom.getPeriod();

		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesisauthortelecomperiod.hasEnd()) {
			r.setRskEvdnceSynthsAthrTlcmPrdEnd(String.valueOf(riskevidencesynthesisauthortelecomperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisauthortelecomperiod.hasStart()) {
			r.setRskEvdnceSynthsAthrTlcmPrdStrt(String.valueOf(riskevidencesynthesisauthortelecomperiod.getStart()));
		}
		/******************** riskevidencesynthesisauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesisauthortelecomuse = riskevidencesynthesisauthortelecom.getUse();
		r.setRskEvdnceSynthsAthrTlcmUse(riskevidencesynthesisauthortelecomuse.toCode());

		/******************** RskEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesisauthortelecom.hasRank()) {
			r.setRskEvdnceSynthsAthrTlcmRnk(String.valueOf(riskevidencesynthesisauthortelecom.getRank()));
		}
		/******************** RskEvdnceSynths_Copyright ********************************************************************************/
		if(riskevidencesynthesis.hasCopyright()) {
			r.setRskEvdnceSynthsCopyright(String.valueOf(riskevidencesynthesis.getCopyright()));
		}
		/******************** RskEvdnceSynths_LastReviewDt ********************************************************************************/
		if(riskevidencesynthesis.hasLastReviewDate()) {
			r.setRskEvdnceSynthsLastReviewDt(String.valueOf(riskevidencesynthesis.getLastReviewDate()));
		}
		/******************** riskevidencesynthesiseditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesiseditor = riskevidencesynthesis.getEditorFirstRep();

		/******************** RskEvdnceSynths_Editor_Nm ********************************************************************************/
		if(riskevidencesynthesiseditor.hasName()) {
			r.setRskEvdnceSynthsEditorNm(String.valueOf(riskevidencesynthesiseditor.getName()));
		}
		/******************** riskevidencesynthesiseditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesiseditortelecom = riskevidencesynthesiseditor.getTelecomFirstRep();

		/******************** RskEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesiseditortelecom.hasValue()) {
			r.setRskEvdnceSynthsEditorTlcmVl(String.valueOf(riskevidencesynthesiseditortelecom.getValue()));
		}
		/******************** riskevidencesynthesiseditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesiseditortelecomsystem = riskevidencesynthesiseditortelecom.getSystem();
		r.setRskEvdnceSynthsEditorTlcmSys(riskevidencesynthesiseditortelecomsystem.toCode());

		/******************** riskevidencesynthesiseditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiseditortelecomperiod = riskevidencesynthesiseditortelecom.getPeriod();

		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesiseditortelecomperiod.hasEnd()) {
			r.setRskEvdnceSynthsEditorTlcmPrdEnd(String.valueOf(riskevidencesynthesiseditortelecomperiod.getEnd()));
		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesiseditortelecomperiod.hasStart()) {
			r.setRskEvdnceSynthsEditorTlcmPrdStrt(String.valueOf(riskevidencesynthesiseditortelecomperiod.getStart()));
		}
		/******************** riskevidencesynthesiseditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesiseditortelecomuse = riskevidencesynthesiseditortelecom.getUse();
		r.setRskEvdnceSynthsEditorTlcmUse(riskevidencesynthesiseditortelecomuse.toCode());

		/******************** RskEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesiseditortelecom.hasRank()) {
			r.setRskEvdnceSynthsEditorTlcmRnk(String.valueOf(riskevidencesynthesiseditortelecom.getRank()));
		}
		/******************** RskEvdnceSynths_ApprovalDt ********************************************************************************/
		if(riskevidencesynthesis.hasApprovalDate()) {
			r.setRskEvdnceSynthsApprovalDt(String.valueOf(riskevidencesynthesis.getApprovalDate()));
		}
		/******************** riskevidencesynthesistopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesistopic = riskevidencesynthesis.getTopicFirstRep();

		/******************** riskevidencesynthesistopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesistopiccoding = riskevidencesynthesistopic.getCodingFirstRep();

		/******************** RskEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesistopiccoding.hasDisplay()) {
			r.setRskEvdnceSynthsTopicCdgDsply(String.valueOf(riskevidencesynthesistopiccoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesistopiccoding.hasVersion()) {
			r.setRskEvdnceSynthsTopicCdgVrsn(String.valueOf(riskevidencesynthesistopiccoding.getVersion()));
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesistopiccoding.hasCode()) {
			r.setRskEvdnceSynthsTopicCdgCd(String.valueOf(riskevidencesynthesistopiccoding.getCode()));
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesistopiccoding.hasSystem()) {
			r.setRskEvdnceSynthsTopicCdgSys(String.valueOf(riskevidencesynthesistopiccoding.getSystem()));
		}
		/******************** RskEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesistopiccoding.hasUserSelected()) {
			r.setRskEvdnceSynthsTopicCdgUsrSltd(String.valueOf(riskevidencesynthesistopiccoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_Topic_Txt ********************************************************************************/
		if(riskevidencesynthesistopic.hasText()) {
			r.setRskEvdnceSynthsTopicTxt(String.valueOf(riskevidencesynthesistopic.getText()));
		}
		/******************** RskEvdnceSynths_Exposure ********************************************************************************/
		if(riskevidencesynthesis.hasExposure()) {
			r.setRskEvdnceSynthsExposure(String.valueOf(riskevidencesynthesis.getExposure()));
		}
		/******************** riskevidencesynthesisstudytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisstudytype = riskevidencesynthesis.getStudyType();

		/******************** riskevidencesynthesisstudytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisstudytypecoding = riskevidencesynthesisstudytype.getCodingFirstRep();

		/******************** RskEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisstudytypecoding.hasDisplay()) {
			r.setRskEvdnceSynthsStdyTypCdgDsply(String.valueOf(riskevidencesynthesisstudytypecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisstudytypecoding.hasVersion()) {
			r.setRskEvdnceSynthsStdyTypCdgVrsn(String.valueOf(riskevidencesynthesisstudytypecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisstudytypecoding.hasCode()) {
			r.setRskEvdnceSynthsStdyTypCdgCd(String.valueOf(riskevidencesynthesisstudytypecoding.getCode()));
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisstudytypecoding.hasSystem()) {
			r.setRskEvdnceSynthsStdyTypCdgSys(String.valueOf(riskevidencesynthesisstudytypecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisstudytypecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsStdyTypCdgUsrSltd(String.valueOf(riskevidencesynthesisstudytypecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(riskevidencesynthesisstudytype.hasText()) {
			r.setRskEvdnceSynthsStdyTypTxt(String.valueOf(riskevidencesynthesisstudytype.getText()));
		}
		/******************** riskevidencesynthesissynthesistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesissynthesistype = riskevidencesynthesis.getSynthesisType();

		/******************** riskevidencesynthesissynthesistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesissynthesistypecoding = riskevidencesynthesissynthesistype.getCodingFirstRep();

		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesissynthesistypecoding.hasDisplay()) {
			r.setRskEvdnceSynthsSynthsTypCdgDsply(String.valueOf(riskevidencesynthesissynthesistypecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesissynthesistypecoding.hasVersion()) {
			r.setRskEvdnceSynthsSynthsTypCdgVrsn(String.valueOf(riskevidencesynthesissynthesistypecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesissynthesistypecoding.hasCode()) {
			r.setRskEvdnceSynthsSynthsTypCdgCd(String.valueOf(riskevidencesynthesissynthesistypecoding.getCode()));
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesissynthesistypecoding.hasSystem()) {
			r.setRskEvdnceSynthsSynthsTypCdgSys(String.valueOf(riskevidencesynthesissynthesistypecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesissynthesistypecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsSynthsTypCdgUsrSltd(String.valueOf(riskevidencesynthesissynthesistypecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(riskevidencesynthesissynthesistype.hasText()) {
			r.setRskEvdnceSynthsSynthsTypTxt(String.valueOf(riskevidencesynthesissynthesistype.getText()));
		}
		/******************** riskevidencesynthesissamplesize ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent riskevidencesynthesissamplesize = riskevidencesynthesis.getSampleSize();

		/******************** RskEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(riskevidencesynthesissamplesize.hasDescription()) {
			r.setRskEvdnceSynthsSampleSzDscrptn(String.valueOf(riskevidencesynthesissamplesize.getDescription()));
		}
		/******************** RskEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(riskevidencesynthesissamplesize.hasNumberOfStudies()) {
			r.setRskEvdnceSynthsSampleSzNmbrOfStudies(String.valueOf(riskevidencesynthesissamplesize.getNumberOfStudies()));
		}
		/******************** RskEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(riskevidencesynthesissamplesize.hasNumberOfParticipants()) {
			r.setRskEvdnceSynthsSampleSzNmbrOfPrtcpnts(String.valueOf(riskevidencesynthesissamplesize.getNumberOfParticipants()));
		}
		/******************** riskevidencesynthesisriskestimate ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent riskevidencesynthesisriskestimate = riskevidencesynthesis.getRiskEstimate();

		/******************** RskEvdnceSynths_RskEstmt_Vl ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasValue()) {
			r.setRskEvdnceSynthsRskEstmtVl(String.valueOf(riskevidencesynthesisriskestimate.getValue()));
		}
		/******************** riskevidencesynthesisriskestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimatetype = riskevidencesynthesisriskestimate.getType();

		/******************** riskevidencesynthesisriskestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisriskestimatetypecoding = riskevidencesynthesisriskestimatetype.getCodingFirstRep();

		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecoding.hasDisplay()) {
			r.setRskEvdnceSynthsRskEstmtTypCdgDsply(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecoding.hasVersion()) {
			r.setRskEvdnceSynthsRskEstmtTypCdgVrsn(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecoding.hasCode()) {
			r.setRskEvdnceSynthsRskEstmtTypCdgCd(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getCode()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecoding.hasSystem()) {
			r.setRskEvdnceSynthsRskEstmtTypCdgSys(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsRskEstmtTypCdgUsrSltd(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesisriskestimatetype.hasText()) {
			r.setRskEvdnceSynthsRskEstmtTypTxt(String.valueOf(riskevidencesynthesisriskestimatetype.getText()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Dscrptn ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasDescription()) {
			r.setRskEvdnceSynthsRskEstmtDscrptn(String.valueOf(riskevidencesynthesisriskestimate.getDescription()));
		}
		/******************** RskEvdnceSynths_RskEstmt_NmrtrCnt ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasNumeratorCount()) {
			r.setRskEvdnceSynthsRskEstmtNmrtrCnt(String.valueOf(riskevidencesynthesisriskestimate.getNumeratorCount()));
		}
		/******************** riskevidencesynthesisriskestimateunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimateunitofmeasure = riskevidencesynthesisriskestimate.getUnitOfMeasure();

		/******************** riskevidencesynthesisriskestimateunitofmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisriskestimateunitofmeasurecoding = riskevidencesynthesisriskestimateunitofmeasure.getCodingFirstRep();

		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasDisplay()) {
			r.setRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasVersion()) {
			r.setRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasCode()) {
			r.setRskEvdnceSynthsRskEstmtUntOfMsrCdgCd(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getCode()));
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasSystem()) {
			r.setRskEvdnceSynthsRskEstmtUntOfMsrCdgSys(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Txt ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasure.hasText()) {
			r.setRskEvdnceSynthsRskEstmtUntOfMsrTxt(String.valueOf(riskevidencesynthesisriskestimateunitofmeasure.getText()));
		}
		/******************** riskevidencesynthesisriskestimateprecisionestimate ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent riskevidencesynthesisriskestimateprecisionestimate = riskevidencesynthesisriskestimate.getPrecisionEstimateFirstRep();

		/******************** riskevidencesynthesisriskestimateprecisionestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimateprecisionestimatetype = riskevidencesynthesisriskestimateprecisionestimate.getType();

		/******************** riskevidencesynthesisriskestimateprecisionestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisriskestimateprecisionestimatetypecoding = riskevidencesynthesisriskestimateprecisionestimatetype.getCodingFirstRep();

		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasDisplay()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getDisplay()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasVersion()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getVersion()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasCode()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getCode()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasSystem()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getSystem()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasUserSelected()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getUserSelected()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetype.hasText()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetype.getText()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimate.hasLevel()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtLevel(String.valueOf(riskevidencesynthesisriskestimateprecisionestimate.getLevel()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_To ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimate.hasTo()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtTo(String.valueOf(riskevidencesynthesisriskestimateprecisionestimate.getTo()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_From ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimate.hasFrom()) {
			r.setRskEvdnceSynthsRskEstmtPrecisionEstmtFrom(String.valueOf(riskevidencesynthesisriskestimateprecisionestimate.getFrom()));
		}
		/******************** RskEvdnceSynths_RskEstmt_DnmntrCnt ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasDenominatorCount()) {
			r.setRskEvdnceSynthsRskEstmtDnmntrCnt(String.valueOf(riskevidencesynthesisriskestimate.getDenominatorCount()));
		}
		/******************** riskevidencesynthesisrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact riskevidencesynthesisrelatedartifact = riskevidencesynthesis.getRelatedArtifactFirstRep();

		/******************** RskEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(riskevidencesynthesisrelatedartifact.hasResource()) {
			r.setRskEvdnceSynthsRltedArtfctRsrc(String.valueOf(riskevidencesynthesisrelatedartifact.getResource()));
		}
		/******************** riskevidencesynthesisrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType riskevidencesynthesisrelatedartifacttype = riskevidencesynthesisrelatedartifact.getType();
		r.setRskEvdnceSynthsRltedArtfctTyp(riskevidencesynthesisrelatedartifacttype.toCode());

		/******************** RskEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(riskevidencesynthesisrelatedartifact.hasUrl()) {
			r.setRskEvdnceSynthsRltedArtfctUrl(String.valueOf(riskevidencesynthesisrelatedartifact.getUrl()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(riskevidencesynthesisrelatedartifact.hasLabel()) {
			r.setRskEvdnceSynthsRltedArtfctLbl(String.valueOf(riskevidencesynthesisrelatedartifact.getLabel()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(riskevidencesynthesisrelatedartifact.hasCitation()) {
			r.setRskEvdnceSynthsRltedArtfctCitation(String.valueOf(riskevidencesynthesisrelatedartifact.getCitation()));
		}
		/******************** riskevidencesynthesisrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment riskevidencesynthesisrelatedartifactdocument = riskevidencesynthesisrelatedartifact.getDocument();

		/******************** RskEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasSize()) {
			r.setRskEvdnceSynthsRltedArtfctDocSz(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getSize()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasLanguage()) {
			r.setRskEvdnceSynthsRltedArtfctDocLnguage(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getLanguage()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasContentType()) {
			r.setRskEvdnceSynthsRltedArtfctDocCntntTyp(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getContentType()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasUrl()) {
			r.setRskEvdnceSynthsRltedArtfctDocUrl(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getUrl()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasTitle()) {
			r.setRskEvdnceSynthsRltedArtfctDocTtl(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getTitle()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasHash()) {
			r.setRskEvdnceSynthsRltedArtfctDocHash(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getHash()));
		}

		/******************** RskEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasData()) {
			r.setRskEvdnceSynthsRltedArtfctDocData(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getData()));
		}

		/******************** RskEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(riskevidencesynthesisrelatedartifactdocument.hasCreation()) {
			r.setRskEvdnceSynthsRltedArtfctDocCreation(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getCreation()));
		}
		return r;
	}
}
