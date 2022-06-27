package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EffectEvidenceSynthesis;
public class EffectEvidenceSynthesisBidirectionalConversion 
{
	public EffectEvidenceSynthesis EffectEvidenceSynthesiss(org.hl7.fhir.r4.model.EffectEvidenceSynthesis effectevidencesynthesis) throws ParseException
	{
		 main.java.com.campfhir.model.EffectEvidenceSynthesis e = new  main.java.com.campfhir.model.EffectEvidenceSynthesis();

		/******************** id ********************************************************************************/
		effectevidencesynthesis.setId(e.getId());

		/******************** EfctEvdnceSynths_Nm ********************************************************************************/
		if(effectevidencesynthesis.hasName()) {
			e.setEfctEvdnceSynthsNm(String.valueOf(effectevidencesynthesis.getName()));
		}
		/******************** EfctEvdnceSynths_Dt ********************************************************************************/
		if(effectevidencesynthesis.hasDate()) {
			e.setEfctEvdnceSynthsDt(String.valueOf(effectevidencesynthesis.getDate()));
		}
		/******************** EfctEvdnceSynths_Vrsn ********************************************************************************/
		if(effectevidencesynthesis.hasVersion()) {
			e.setEfctEvdnceSynthsVrsn(String.valueOf(effectevidencesynthesis.getVersion()));
		}
		/******************** effectevidencesynthesisreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesisreviewer = effectevidencesynthesis.getReviewerFirstRep();

		/******************** EfctEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(effectevidencesynthesisreviewer.hasName()) {
			e.setEfctEvdnceSynthsRviewrNm(String.valueOf(effectevidencesynthesisreviewer.getName()));
		}
		/******************** effectevidencesynthesisreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesisreviewertelecom = effectevidencesynthesisreviewer.getTelecomFirstRep();

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesisreviewertelecom.hasValue()) {
			e.setEfctEvdnceSynthsRviewrTlcmVl(String.valueOf(effectevidencesynthesisreviewertelecom.getValue()));
		}
		/******************** effectevidencesynthesisreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisreviewertelecomperiod = effectevidencesynthesisreviewertelecom.getPeriod();

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisreviewertelecomperiod.hasStart()) {
			e.setEfctEvdnceSynthsRviewrTlcmPrdStrt(String.valueOf(effectevidencesynthesisreviewertelecomperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesisreviewertelecomperiod.hasEnd()) {
			e.setEfctEvdnceSynthsRviewrTlcmPrdEnd(String.valueOf(effectevidencesynthesisreviewertelecomperiod.getEnd()));
		}
		/******************** effectevidencesynthesisreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesisreviewertelecomsystem = effectevidencesynthesisreviewertelecom.getSystem();
		e.setEfctEvdnceSynthsRviewrTlcmSys(effectevidencesynthesisreviewertelecomsystem.toCode());

		/******************** effectevidencesynthesisreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesisreviewertelecomuse = effectevidencesynthesisreviewertelecom.getUse();
		e.setEfctEvdnceSynthsRviewrTlcmUse(effectevidencesynthesisreviewertelecomuse.toCode());

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesisreviewertelecom.hasRank()) {
			e.setEfctEvdnceSynthsRviewrTlcmRnk(String.valueOf(effectevidencesynthesisreviewertelecom.getRank()));
		}
		/******************** effectevidencesynthesiscertainty ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyComponent effectevidencesynthesiscertainty = effectevidencesynthesis.getCertaintyFirstRep();

		/******************** effectevidencesynthesiscertaintycertaintysubcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent effectevidencesynthesiscertaintycertaintysubcomponent = effectevidencesynthesiscertainty.getCertaintySubcomponentFirstRep();

		/******************** effectevidencesynthesiscertaintycertaintysubcomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintycertaintysubcomponenttype = effectevidencesynthesiscertaintycertaintysubcomponent.getType();

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttype.hasText()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttype.getText()));
		}
		/******************** effectevidencesynthesiscertaintycertaintysubcomponenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiscertaintycertaintysubcomponenttypecoding = effectevidencesynthesiscertaintycertaintysubcomponenttype.getCodingFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasVersion()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasCode()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasSystem()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getSystem()));
		}
		/******************** effectevidencesynthesiscertaintycertaintysubcomponentnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation effectevidencesynthesiscertaintycertaintysubcomponentnote = effectevidencesynthesiscertaintycertaintysubcomponent.getNoteFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasTime()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentnote.getTime()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasText()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentnote.getText()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorReference()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorReference()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorStringType()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorStringType()));
		}
		/******************** effectevidencesynthesiscertaintycertaintysubcomponentrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintycertaintysubcomponentrating = effectevidencesynthesiscertaintycertaintysubcomponent.getRatingFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentrating.hasText()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentrating.getText()));
		}
		/******************** effectevidencesynthesiscertaintycertaintysubcomponentratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiscertaintycertaintysubcomponentratingcoding = effectevidencesynthesiscertaintycertaintysubcomponentrating.getCodingFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasVersion()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasDisplay()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasCode()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getCode()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasSystem()) {
			e.setEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getSystem()));
		}
		/******************** effectevidencesynthesiscertaintynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation effectevidencesynthesiscertaintynote = effectevidencesynthesiscertainty.getNoteFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(effectevidencesynthesiscertaintynote.hasTime()) {
			e.setEfctEvdnceSynthsCrtntyNtTime(String.valueOf(effectevidencesynthesiscertaintynote.getTime()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintynote.hasText()) {
			e.setEfctEvdnceSynthsCrtntyNtTxt(String.valueOf(effectevidencesynthesiscertaintynote.getText()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(effectevidencesynthesiscertaintynote.hasAuthorReference()) {
			e.setEfctEvdnceSynthsCrtntyNtAthrRfrnc(String.valueOf(effectevidencesynthesiscertaintynote.getAuthorReference()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(effectevidencesynthesiscertaintynote.hasAuthorStringType()) {
			e.setEfctEvdnceSynthsCrtntyNtAthrStrgTyp(String.valueOf(effectevidencesynthesiscertaintynote.getAuthorStringType()));
		}
		/******************** effectevidencesynthesiscertaintyrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintyrating = effectevidencesynthesiscertainty.getRatingFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintyrating.hasText()) {
			e.setEfctEvdnceSynthsCrtntyRatingTxt(String.valueOf(effectevidencesynthesiscertaintyrating.getText()));
		}
		/******************** effectevidencesynthesiscertaintyratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiscertaintyratingcoding = effectevidencesynthesiscertaintyrating.getCodingFirstRep();

		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcoding.hasVersion()) {
			e.setEfctEvdnceSynthsCrtntyRatingCdgVrsn(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcoding.hasDisplay()) {
			e.setEfctEvdnceSynthsCrtntyRatingCdgDsply(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcoding.hasCode()) {
			e.setEfctEvdnceSynthsCrtntyRatingCdgCd(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getCode()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsCrtntyRatingCdgUsrSltd(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcoding.hasSystem()) {
			e.setEfctEvdnceSynthsCrtntyRatingCdgSys(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getSystem()));
		}
		/******************** effectevidencesynthesisendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesisendorser = effectevidencesynthesis.getEndorserFirstRep();

		/******************** EfctEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(effectevidencesynthesisendorser.hasName()) {
			e.setEfctEvdnceSynthsEndsrNm(String.valueOf(effectevidencesynthesisendorser.getName()));
		}
		/******************** effectevidencesynthesisendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesisendorsertelecom = effectevidencesynthesisendorser.getTelecomFirstRep();

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesisendorsertelecom.hasValue()) {
			e.setEfctEvdnceSynthsEndsrTlcmVl(String.valueOf(effectevidencesynthesisendorsertelecom.getValue()));
		}
		/******************** effectevidencesynthesisendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisendorsertelecomperiod = effectevidencesynthesisendorsertelecom.getPeriod();

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisendorsertelecomperiod.hasStart()) {
			e.setEfctEvdnceSynthsEndsrTlcmPrdStrt(String.valueOf(effectevidencesynthesisendorsertelecomperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesisendorsertelecomperiod.hasEnd()) {
			e.setEfctEvdnceSynthsEndsrTlcmPrdEnd(String.valueOf(effectevidencesynthesisendorsertelecomperiod.getEnd()));
		}
		/******************** effectevidencesynthesisendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesisendorsertelecomsystem = effectevidencesynthesisendorsertelecom.getSystem();
		e.setEfctEvdnceSynthsEndsrTlcmSys(effectevidencesynthesisendorsertelecomsystem.toCode());

		/******************** effectevidencesynthesisendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesisendorsertelecomuse = effectevidencesynthesisendorsertelecom.getUse();
		e.setEfctEvdnceSynthsEndsrTlcmUse(effectevidencesynthesisendorsertelecomuse.toCode());

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesisendorsertelecom.hasRank()) {
			e.setEfctEvdnceSynthsEndsrTlcmRnk(String.valueOf(effectevidencesynthesisendorsertelecom.getRank()));
		}
		/******************** EfctEvdnceSynths_Ttl ********************************************************************************/
		if(effectevidencesynthesis.hasTitle()) {
			e.setEfctEvdnceSynthsTtl(String.valueOf(effectevidencesynthesis.getTitle()));
		}
		/******************** effectevidencesynthesisstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus effectevidencesynthesisstatus = effectevidencesynthesis.getStatus();
		e.setEfctEvdnceSynthsSts(effectevidencesynthesisstatus.toCode());

		/******************** effectevidencesynthesisnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation effectevidencesynthesisnote = effectevidencesynthesis.getNoteFirstRep();

		/******************** EfctEvdnceSynths_Nt_Time ********************************************************************************/
		if(effectevidencesynthesisnote.hasTime()) {
			e.setEfctEvdnceSynthsNtTime(String.valueOf(effectevidencesynthesisnote.getTime()));
		}
		/******************** EfctEvdnceSynths_Nt_Txt ********************************************************************************/
		if(effectevidencesynthesisnote.hasText()) {
			e.setEfctEvdnceSynthsNtTxt(String.valueOf(effectevidencesynthesisnote.getText()));
		}
		/******************** EfctEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(effectevidencesynthesisnote.hasAuthorReference()) {
			e.setEfctEvdnceSynthsNtAthrRfrnc(String.valueOf(effectevidencesynthesisnote.getAuthorReference()));
		}
		/******************** EfctEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(effectevidencesynthesisnote.hasAuthorStringType()) {
			e.setEfctEvdnceSynthsNtAthrStrgTyp(String.valueOf(effectevidencesynthesisnote.getAuthorStringType()));
		}
		/******************** EfctEvdnceSynths_Dscrptn ********************************************************************************/
		if(effectevidencesynthesis.hasDescription()) {
			e.setEfctEvdnceSynthsDscrptn(String.valueOf(effectevidencesynthesis.getDescription()));
		}
		/******************** EfctEvdnceSynths_Outcome ********************************************************************************/
		if(effectevidencesynthesis.hasOutcome()) {
			e.setEfctEvdnceSynthsOutcome(String.valueOf(effectevidencesynthesis.getOutcome()));
		}
		/******************** EfctEvdnceSynths_Url ********************************************************************************/
		if(effectevidencesynthesis.hasUrl()) {
			e.setEfctEvdnceSynthsUrl(String.valueOf(effectevidencesynthesis.getUrl()));
		}
		/******************** EfctEvdnceSynths_Popln ********************************************************************************/
		if(effectevidencesynthesis.hasPopulation()) {
			e.setEfctEvdnceSynthsPopln(String.valueOf(effectevidencesynthesis.getPopulation()));
		}
		/******************** EfctEvdnceSynths_Pblshr ********************************************************************************/
		if(effectevidencesynthesis.hasPublisher()) {
			e.setEfctEvdnceSynthsPblshr(String.valueOf(effectevidencesynthesis.getPublisher()));
		}
		/******************** effectevidencesynthesiseffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiseffectiveperiod = effectevidencesynthesis.getEffectivePeriod();

		/******************** EfctEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(effectevidencesynthesiseffectiveperiod.hasStart()) {
			e.setEfctEvdnceSynthsEfctivePrdStrt(String.valueOf(effectevidencesynthesiseffectiveperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(effectevidencesynthesiseffectiveperiod.hasEnd()) {
			e.setEfctEvdnceSynthsEfctivePrdEnd(String.valueOf(effectevidencesynthesiseffectiveperiod.getEnd()));
		}
		/******************** effectevidencesynthesisauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesisauthor = effectevidencesynthesis.getAuthorFirstRep();

		/******************** EfctEvdnceSynths_Athr_Nm ********************************************************************************/
		if(effectevidencesynthesisauthor.hasName()) {
			e.setEfctEvdnceSynthsAthrNm(String.valueOf(effectevidencesynthesisauthor.getName()));
		}
		/******************** effectevidencesynthesisauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesisauthortelecom = effectevidencesynthesisauthor.getTelecomFirstRep();

		/******************** EfctEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesisauthortelecom.hasValue()) {
			e.setEfctEvdnceSynthsAthrTlcmVl(String.valueOf(effectevidencesynthesisauthortelecom.getValue()));
		}
		/******************** effectevidencesynthesisauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisauthortelecomperiod = effectevidencesynthesisauthortelecom.getPeriod();

		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisauthortelecomperiod.hasStart()) {
			e.setEfctEvdnceSynthsAthrTlcmPrdStrt(String.valueOf(effectevidencesynthesisauthortelecomperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesisauthortelecomperiod.hasEnd()) {
			e.setEfctEvdnceSynthsAthrTlcmPrdEnd(String.valueOf(effectevidencesynthesisauthortelecomperiod.getEnd()));
		}
		/******************** effectevidencesynthesisauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesisauthortelecomsystem = effectevidencesynthesisauthortelecom.getSystem();
		e.setEfctEvdnceSynthsAthrTlcmSys(effectevidencesynthesisauthortelecomsystem.toCode());

		/******************** effectevidencesynthesisauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesisauthortelecomuse = effectevidencesynthesisauthortelecom.getUse();
		e.setEfctEvdnceSynthsAthrTlcmUse(effectevidencesynthesisauthortelecomuse.toCode());

		/******************** EfctEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesisauthortelecom.hasRank()) {
			e.setEfctEvdnceSynthsAthrTlcmRnk(String.valueOf(effectevidencesynthesisauthortelecom.getRank()));
		}
		/******************** EfctEvdnceSynths_ExposureAlternative ********************************************************************************/
		if(effectevidencesynthesis.hasExposureAlternative()) {
			e.setEfctEvdnceSynthsExposureAlternative(String.valueOf(effectevidencesynthesis.getExposureAlternative()));
		}
		/******************** effectevidencesynthesiseffectestimate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimateComponent effectevidencesynthesiseffectestimate = effectevidencesynthesis.getEffectEstimateFirstRep();

		/******************** EfctEvdnceSynths_EfctEstmt_Vl ********************************************************************************/
		if(effectevidencesynthesiseffectestimate.hasValue()) {
			e.setEfctEvdnceSynthsEfctEstmtVl(String.valueOf(effectevidencesynthesiseffectestimate.getValue()));
		}
		/******************** effectevidencesynthesiseffectestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimatetype = effectevidencesynthesiseffectestimate.getType();

		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetype.hasText()) {
			e.setEfctEvdnceSynthsEfctEstmtTypTxt(String.valueOf(effectevidencesynthesiseffectestimatetype.getText()));
		}
		/******************** effectevidencesynthesiseffectestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimatetypecoding = effectevidencesynthesiseffectestimatetype.getCodingFirstRep();

		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecoding.hasVersion()) {
			e.setEfctEvdnceSynthsEfctEstmtTypCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsEfctEstmtTypCdgDsply(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecoding.hasCode()) {
			e.setEfctEvdnceSynthsEfctEstmtTypCdgCd(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecoding.hasSystem()) {
			e.setEfctEvdnceSynthsEfctEstmtTypCdgSys(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getSystem()));
		}
		/******************** effectevidencesynthesiseffectestimateprecisionestimate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent effectevidencesynthesiseffectestimateprecisionestimate = effectevidencesynthesiseffectestimate.getPrecisionEstimateFirstRep();

		/******************** effectevidencesynthesiseffectestimateprecisionestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimateprecisionestimatetype = effectevidencesynthesiseffectestimateprecisionestimate.getType();

		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetype.hasText()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetype.getText()));
		}
		/******************** effectevidencesynthesiseffectestimateprecisionestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimateprecisionestimatetypecoding = effectevidencesynthesiseffectestimateprecisionestimatetype.getCodingFirstRep();

		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasVersion()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasCode()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasSystem()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getSystem()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimate.hasLevel()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimate.getLevel()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_To ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimate.hasTo()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimate.getTo()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_From ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimate.hasFrom()) {
			e.setEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimate.getFrom()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Dscrptn ********************************************************************************/
		if(effectevidencesynthesiseffectestimate.hasDescription()) {
			e.setEfctEvdnceSynthsEfctEstmtDscrptn(String.valueOf(effectevidencesynthesiseffectestimate.getDescription()));
		}
		/******************** effectevidencesynthesiseffectestimatevariantstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimatevariantstate = effectevidencesynthesiseffectestimate.getVariantState();

		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstate.hasText()) {
			e.setEfctEvdnceSynthsEfctEstmtVariantStateTxt(String.valueOf(effectevidencesynthesiseffectestimatevariantstate.getText()));
		}
		/******************** effectevidencesynthesiseffectestimatevariantstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimatevariantstatecoding = effectevidencesynthesiseffectestimatevariantstate.getCodingFirstRep();

		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasVersion()) {
			e.setEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasCode()) {
			e.setEfctEvdnceSynthsEfctEstmtVariantStateCdgCd(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasSystem()) {
			e.setEfctEvdnceSynthsEfctEstmtVariantStateCdgSys(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getSystem()));
		}
		/******************** effectevidencesynthesiseffectestimateunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimateunitofmeasure = effectevidencesynthesiseffectestimate.getUnitOfMeasure();

		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasure.hasText()) {
			e.setEfctEvdnceSynthsEfctEstmtUntOfMsrTxt(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasure.getText()));
		}
		/******************** effectevidencesynthesiseffectestimateunitofmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimateunitofmeasurecoding = effectevidencesynthesiseffectestimateunitofmeasure.getCodingFirstRep();

		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasVersion()) {
			e.setEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasCode()) {
			e.setEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasSystem()) {
			e.setEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getSystem()));
		}
		/******************** effectevidencesynthesisresultsbyexposure ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisResultsByExposureComponent effectevidencesynthesisresultsbyexposure = effectevidencesynthesis.getResultsByExposureFirstRep();

		/******************** EfctEvdnceSynths_RsltsByExposure_RskEvdnceSynths ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposure.hasRiskEvidenceSynthesis()) {
			e.setEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths(String.valueOf(effectevidencesynthesisresultsbyexposure.getRiskEvidenceSynthesis()));
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_Dscrptn ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposure.hasDescription()) {
			e.setEfctEvdnceSynthsRsltsByExposureDscrptn(String.valueOf(effectevidencesynthesisresultsbyexposure.getDescription()));
		}
		/******************** effectevidencesynthesisresultsbyexposureexposurestate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.ExposureState effectevidencesynthesisresultsbyexposureexposurestate = effectevidencesynthesisresultsbyexposure.getExposureState();
		e.setEfctEvdnceSynthsRsltsByExposureExposureState(effectevidencesynthesisresultsbyexposureexposurestate.toCode());

		/******************** effectevidencesynthesisresultsbyexposurevariantstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisresultsbyexposurevariantstate = effectevidencesynthesisresultsbyexposure.getVariantState();

		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Txt ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstate.hasText()) {
			e.setEfctEvdnceSynthsRsltsByExposureVariantStateTxt(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstate.getText()));
		}
		/******************** effectevidencesynthesisresultsbyexposurevariantstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisresultsbyexposurevariantstatecoding = effectevidencesynthesisresultsbyexposurevariantstate.getCodingFirstRep();

		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasVersion()) {
			e.setEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasCode()) {
			e.setEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasSystem()) {
			e.setEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getSystem()));
		}
		/******************** effectevidencesynthesiscontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesiscontact = effectevidencesynthesis.getContactFirstRep();

		/******************** EfctEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(effectevidencesynthesiscontact.hasName()) {
			e.setEfctEvdnceSynthsCntctNm(String.valueOf(effectevidencesynthesiscontact.getName()));
		}
		/******************** effectevidencesynthesiscontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesiscontacttelecom = effectevidencesynthesiscontact.getTelecomFirstRep();

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesiscontacttelecom.hasValue()) {
			e.setEfctEvdnceSynthsCntctTlcmVl(String.valueOf(effectevidencesynthesiscontacttelecom.getValue()));
		}
		/******************** effectevidencesynthesiscontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiscontacttelecomperiod = effectevidencesynthesiscontacttelecom.getPeriod();

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesiscontacttelecomperiod.hasStart()) {
			e.setEfctEvdnceSynthsCntctTlcmPrdStrt(String.valueOf(effectevidencesynthesiscontacttelecomperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesiscontacttelecomperiod.hasEnd()) {
			e.setEfctEvdnceSynthsCntctTlcmPrdEnd(String.valueOf(effectevidencesynthesiscontacttelecomperiod.getEnd()));
		}
		/******************** effectevidencesynthesiscontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesiscontacttelecomsystem = effectevidencesynthesiscontacttelecom.getSystem();
		e.setEfctEvdnceSynthsCntctTlcmSys(effectevidencesynthesiscontacttelecomsystem.toCode());

		/******************** effectevidencesynthesiscontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesiscontacttelecomuse = effectevidencesynthesiscontacttelecom.getUse();
		e.setEfctEvdnceSynthsCntctTlcmUse(effectevidencesynthesiscontacttelecomuse.toCode());

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesiscontacttelecom.hasRank()) {
			e.setEfctEvdnceSynthsCntctTlcmRnk(String.valueOf(effectevidencesynthesiscontacttelecom.getRank()));
		}
		/******************** effectevidencesynthesisidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier effectevidencesynthesisidentifier = effectevidencesynthesis.getIdentifierFirstRep();

		/******************** EfctEvdnceSynths_Id_Vl ********************************************************************************/
		if(effectevidencesynthesisidentifier.hasValue()) {
			e.setEfctEvdnceSynthsIdVl(String.valueOf(effectevidencesynthesisidentifier.getValue()));
		}
		/******************** effectevidencesynthesisidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisidentifiertype = effectevidencesynthesisidentifier.getType();

		/******************** EfctEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesisidentifiertype.hasText()) {
			e.setEfctEvdnceSynthsIdTypTxt(String.valueOf(effectevidencesynthesisidentifiertype.getText()));
		}
		/******************** effectevidencesynthesisidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisidentifiertypecoding = effectevidencesynthesisidentifiertype.getCodingFirstRep();

		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecoding.hasVersion()) {
			e.setEfctEvdnceSynthsIdTypCdgVrsn(String.valueOf(effectevidencesynthesisidentifiertypecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsIdTypCdgDsply(String.valueOf(effectevidencesynthesisidentifiertypecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecoding.hasCode()) {
			e.setEfctEvdnceSynthsIdTypCdgCd(String.valueOf(effectevidencesynthesisidentifiertypecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsIdTypCdgUsrSltd(String.valueOf(effectevidencesynthesisidentifiertypecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecoding.hasSystem()) {
			e.setEfctEvdnceSynthsIdTypCdgSys(String.valueOf(effectevidencesynthesisidentifiertypecoding.getSystem()));
		}
		/******************** effectevidencesynthesisidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisidentifierperiod = effectevidencesynthesisidentifier.getPeriod();

		/******************** EfctEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisidentifierperiod.hasStart()) {
			e.setEfctEvdnceSynthsIdPrdStrt(String.valueOf(effectevidencesynthesisidentifierperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(effectevidencesynthesisidentifierperiod.hasEnd()) {
			e.setEfctEvdnceSynthsIdPrdEnd(String.valueOf(effectevidencesynthesisidentifierperiod.getEnd()));
		}
		/******************** EfctEvdnceSynths_Id_Assigner ********************************************************************************/
		if(effectevidencesynthesisidentifier.hasAssigner()) {
			e.setEfctEvdnceSynthsIdAssigner(String.valueOf(effectevidencesynthesisidentifier.getAssigner()));
		}
		/******************** EfctEvdnceSynths_Id_Sys ********************************************************************************/
		if(effectevidencesynthesisidentifier.hasSystem()) {
			e.setEfctEvdnceSynthsIdSys(String.valueOf(effectevidencesynthesisidentifier.getSystem()));
		}
		/******************** effectevidencesynthesisidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse effectevidencesynthesisidentifieruse = effectevidencesynthesisidentifier.getUse();
		e.setEfctEvdnceSynthsIdUse(effectevidencesynthesisidentifieruse.toCode());

		/******************** EfctEvdnceSynths_Copyright ********************************************************************************/
		if(effectevidencesynthesis.hasCopyright()) {
			e.setEfctEvdnceSynthsCopyright(String.valueOf(effectevidencesynthesis.getCopyright()));
		}
		/******************** effectevidencesynthesistopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesistopic = effectevidencesynthesis.getTopicFirstRep();

		/******************** EfctEvdnceSynths_Topic_Txt ********************************************************************************/
		if(effectevidencesynthesistopic.hasText()) {
			e.setEfctEvdnceSynthsTopicTxt(String.valueOf(effectevidencesynthesistopic.getText()));
		}
		/******************** effectevidencesynthesistopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesistopiccoding = effectevidencesynthesistopic.getCodingFirstRep();

		/******************** EfctEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesistopiccoding.hasVersion()) {
			e.setEfctEvdnceSynthsTopicCdgVrsn(String.valueOf(effectevidencesynthesistopiccoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesistopiccoding.hasDisplay()) {
			e.setEfctEvdnceSynthsTopicCdgDsply(String.valueOf(effectevidencesynthesistopiccoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesistopiccoding.hasCode()) {
			e.setEfctEvdnceSynthsTopicCdgCd(String.valueOf(effectevidencesynthesistopiccoding.getCode()));
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesistopiccoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsTopicCdgUsrSltd(String.valueOf(effectevidencesynthesistopiccoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesistopiccoding.hasSystem()) {
			e.setEfctEvdnceSynthsTopicCdgSys(String.valueOf(effectevidencesynthesistopiccoding.getSystem()));
		}
		/******************** EfctEvdnceSynths_LastReviewDt ********************************************************************************/
		if(effectevidencesynthesis.hasLastReviewDate()) {
			e.setEfctEvdnceSynthsLastReviewDt(String.valueOf(effectevidencesynthesis.getLastReviewDate()));
		}
		/******************** EfctEvdnceSynths_ApprovalDt ********************************************************************************/
		if(effectevidencesynthesis.hasApprovalDate()) {
			e.setEfctEvdnceSynthsApprovalDt(String.valueOf(effectevidencesynthesis.getApprovalDate()));
		}
		/******************** effectevidencesynthesiseditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesiseditor = effectevidencesynthesis.getEditorFirstRep();

		/******************** EfctEvdnceSynths_Editor_Nm ********************************************************************************/
		if(effectevidencesynthesiseditor.hasName()) {
			e.setEfctEvdnceSynthsEditorNm(String.valueOf(effectevidencesynthesiseditor.getName()));
		}
		/******************** effectevidencesynthesiseditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesiseditortelecom = effectevidencesynthesiseditor.getTelecomFirstRep();

		/******************** EfctEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesiseditortelecom.hasValue()) {
			e.setEfctEvdnceSynthsEditorTlcmVl(String.valueOf(effectevidencesynthesiseditortelecom.getValue()));
		}
		/******************** effectevidencesynthesiseditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiseditortelecomperiod = effectevidencesynthesiseditortelecom.getPeriod();

		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesiseditortelecomperiod.hasStart()) {
			e.setEfctEvdnceSynthsEditorTlcmPrdStrt(String.valueOf(effectevidencesynthesiseditortelecomperiod.getStart()));
		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesiseditortelecomperiod.hasEnd()) {
			e.setEfctEvdnceSynthsEditorTlcmPrdEnd(String.valueOf(effectevidencesynthesiseditortelecomperiod.getEnd()));
		}
		/******************** effectevidencesynthesiseditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesiseditortelecomsystem = effectevidencesynthesiseditortelecom.getSystem();
		e.setEfctEvdnceSynthsEditorTlcmSys(effectevidencesynthesiseditortelecomsystem.toCode());

		/******************** effectevidencesynthesiseditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesiseditortelecomuse = effectevidencesynthesiseditortelecom.getUse();
		e.setEfctEvdnceSynthsEditorTlcmUse(effectevidencesynthesiseditortelecomuse.toCode());

		/******************** EfctEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesiseditortelecom.hasRank()) {
			e.setEfctEvdnceSynthsEditorTlcmRnk(String.valueOf(effectevidencesynthesiseditortelecom.getRank()));
		}
		/******************** effectevidencesynthesissynthesistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesissynthesistype = effectevidencesynthesis.getSynthesisType();

		/******************** EfctEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(effectevidencesynthesissynthesistype.hasText()) {
			e.setEfctEvdnceSynthsSynthsTypTxt(String.valueOf(effectevidencesynthesissynthesistype.getText()));
		}
		/******************** effectevidencesynthesissynthesistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesissynthesistypecoding = effectevidencesynthesissynthesistype.getCodingFirstRep();

		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesissynthesistypecoding.hasVersion()) {
			e.setEfctEvdnceSynthsSynthsTypCdgVrsn(String.valueOf(effectevidencesynthesissynthesistypecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesissynthesistypecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsSynthsTypCdgDsply(String.valueOf(effectevidencesynthesissynthesistypecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesissynthesistypecoding.hasCode()) {
			e.setEfctEvdnceSynthsSynthsTypCdgCd(String.valueOf(effectevidencesynthesissynthesistypecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesissynthesistypecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsSynthsTypCdgUsrSltd(String.valueOf(effectevidencesynthesissynthesistypecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesissynthesistypecoding.hasSystem()) {
			e.setEfctEvdnceSynthsSynthsTypCdgSys(String.valueOf(effectevidencesynthesissynthesistypecoding.getSystem()));
		}
		/******************** effectevidencesynthesisstudytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisstudytype = effectevidencesynthesis.getStudyType();

		/******************** EfctEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(effectevidencesynthesisstudytype.hasText()) {
			e.setEfctEvdnceSynthsStdyTypTxt(String.valueOf(effectevidencesynthesisstudytype.getText()));
		}
		/******************** effectevidencesynthesisstudytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisstudytypecoding = effectevidencesynthesisstudytype.getCodingFirstRep();

		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisstudytypecoding.hasVersion()) {
			e.setEfctEvdnceSynthsStdyTypCdgVrsn(String.valueOf(effectevidencesynthesisstudytypecoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisstudytypecoding.hasDisplay()) {
			e.setEfctEvdnceSynthsStdyTypCdgDsply(String.valueOf(effectevidencesynthesisstudytypecoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisstudytypecoding.hasCode()) {
			e.setEfctEvdnceSynthsStdyTypCdgCd(String.valueOf(effectevidencesynthesisstudytypecoding.getCode()));
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisstudytypecoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsStdyTypCdgUsrSltd(String.valueOf(effectevidencesynthesisstudytypecoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisstudytypecoding.hasSystem()) {
			e.setEfctEvdnceSynthsStdyTypCdgSys(String.valueOf(effectevidencesynthesisstudytypecoding.getSystem()));
		}
		/******************** EfctEvdnceSynths_Exposure ********************************************************************************/
		if(effectevidencesynthesis.hasExposure()) {
			e.setEfctEvdnceSynthsExposure(String.valueOf(effectevidencesynthesis.getExposure()));
		}
		/******************** effectevidencesynthesissamplesize ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSizeComponent effectevidencesynthesissamplesize = effectevidencesynthesis.getSampleSize();

		/******************** EfctEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(effectevidencesynthesissamplesize.hasNumberOfParticipants()) {
			e.setEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts(String.valueOf(effectevidencesynthesissamplesize.getNumberOfParticipants()));
		}
		/******************** EfctEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(effectevidencesynthesissamplesize.hasDescription()) {
			e.setEfctEvdnceSynthsSampleSzDscrptn(String.valueOf(effectevidencesynthesissamplesize.getDescription()));
		}
		/******************** EfctEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(effectevidencesynthesissamplesize.hasNumberOfStudies()) {
			e.setEfctEvdnceSynthsSampleSzNmbrOfStudies(String.valueOf(effectevidencesynthesissamplesize.getNumberOfStudies()));
		}
		/******************** effectevidencesynthesisrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact effectevidencesynthesisrelatedartifact = effectevidencesynthesis.getRelatedArtifactFirstRep();

		/******************** EfctEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(effectevidencesynthesisrelatedartifact.hasResource()) {
			e.setEfctEvdnceSynthsRltedArtfctRsrc(String.valueOf(effectevidencesynthesisrelatedartifact.getResource()));
		}
		/******************** effectevidencesynthesisrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType effectevidencesynthesisrelatedartifacttype = effectevidencesynthesisrelatedartifact.getType();
		e.setEfctEvdnceSynthsRltedArtfctTyp(effectevidencesynthesisrelatedartifacttype.toCode());

		/******************** effectevidencesynthesisrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment effectevidencesynthesisrelatedartifactdocument = effectevidencesynthesisrelatedartifact.getDocument();

		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasSize()) {
			e.setEfctEvdnceSynthsRltedArtfctDocSz(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getSize()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasLanguage()) {
			e.setEfctEvdnceSynthsRltedArtfctDocLnguage(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getLanguage()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasContentType()) {
			e.setEfctEvdnceSynthsRltedArtfctDocCntntTyp(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getContentType()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasTitle()) {
			e.setEfctEvdnceSynthsRltedArtfctDocTtl(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getTitle()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasUrl()) {
			e.setEfctEvdnceSynthsRltedArtfctDocUrl(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getUrl()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasData()) {
			e.setEfctEvdnceSynthsRltedArtfctDocData(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getData()));
		}

		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasHash()) {
			e.setEfctEvdnceSynthsRltedArtfctDocHash(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getHash()));
		}

		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(effectevidencesynthesisrelatedartifactdocument.hasCreation()) {
			e.setEfctEvdnceSynthsRltedArtfctDocCreation(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getCreation()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(effectevidencesynthesisrelatedartifact.hasUrl()) {
			e.setEfctEvdnceSynthsRltedArtfctUrl(String.valueOf(effectevidencesynthesisrelatedartifact.getUrl()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(effectevidencesynthesisrelatedartifact.hasLabel()) {
			e.setEfctEvdnceSynthsRltedArtfctLbl(String.valueOf(effectevidencesynthesisrelatedartifact.getLabel()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(effectevidencesynthesisrelatedartifact.hasCitation()) {
			e.setEfctEvdnceSynthsRltedArtfctCitation(String.valueOf(effectevidencesynthesisrelatedartifact.getCitation()));
		}
		/******************** effectevidencesynthesisusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext effectevidencesynthesisusecontext = effectevidencesynthesis.getUseContextFirstRep();

		/******************** effectevidencesynthesisusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisusecontextcode = effectevidencesynthesisusecontext.getCode();

		/******************** EfctEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(effectevidencesynthesisusecontextcode.hasVersion()) {
			e.setEfctEvdnceSynthsUseCntxtCdVrsn(String.valueOf(effectevidencesynthesisusecontextcode.getVersion()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(effectevidencesynthesisusecontextcode.hasDisplay()) {
			e.setEfctEvdnceSynthsUseCntxtCdDsply(String.valueOf(effectevidencesynthesisusecontextcode.getDisplay()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisusecontextcode.hasUserSelected()) {
			e.setEfctEvdnceSynthsUseCntxtCdUsrSltd(String.valueOf(effectevidencesynthesisusecontextcode.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontextcode.hasSystem()) {
			e.setEfctEvdnceSynthsUseCntxtCdSys(String.valueOf(effectevidencesynthesisusecontextcode.getSystem()));
		}
		/******************** effectevidencesynthesisusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisusecontextvaluecodeableconcept = effectevidencesynthesisusecontext.getValueCodeableConcept();

		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconcept.hasText()) {
			e.setEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconcept.getText()));
		}
		/******************** effectevidencesynthesisusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisusecontextvaluecodeableconceptcoding = effectevidencesynthesisusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasVersion()) {
			e.setEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasDisplay()) {
			e.setEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasCode()) {
			e.setEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasSystem()) {
			e.setEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** effectevidencesynthesisusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluequantity = effectevidencesynthesisusecontext.getValueQuantity();

		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluequantity.hasValue()) {
			e.setEfctEvdnceSynthsUseCntxtVlQntyVl(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getValue()));
		}
		/******************** effectevidencesynthesisusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator effectevidencesynthesisusecontextvaluequantitycomparator = effectevidencesynthesisusecontextvaluequantity.getComparator();
		e.setEfctEvdnceSynthsUseCntxtVlQntyCmprtr(effectevidencesynthesisusecontextvaluequantitycomparator.toCode());

		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluequantity.hasCode()) {
			e.setEfctEvdnceSynthsUseCntxtVlQntyCd(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getCode()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluequantity.hasUnit()) {
			e.setEfctEvdnceSynthsUseCntxtVlQntyUnt(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getUnit()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluequantity.hasSystem()) {
			e.setEfctEvdnceSynthsUseCntxtVlQntySys(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getSystem()));
		}
		/******************** effectevidencesynthesisusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range effectevidencesynthesisusecontextvaluerange = effectevidencesynthesisusecontext.getValueRange();

		/******************** effectevidencesynthesisusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluerangelow = effectevidencesynthesisusecontextvaluerange.getLow();

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangelow.hasValue()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngLwVl(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getValue()));
		}
		/******************** effectevidencesynthesisusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator effectevidencesynthesisusecontextvaluerangelowcomparator = effectevidencesynthesisusecontextvaluerangelow.getComparator();
		e.setEfctEvdnceSynthsUseCntxtVlRngLwCmprtr(effectevidencesynthesisusecontextvaluerangelowcomparator.toCode());

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangelow.hasCode()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngLwCd(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getCode()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangelow.hasUnit()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngLwUnt(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getUnit()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangelow.hasSystem()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngLwSys(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getSystem()));
		}
		/******************** effectevidencesynthesisusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluerangehigh = effectevidencesynthesisusecontextvaluerange.getHigh();

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangehigh.hasValue()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngHiVl(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getValue()));
		}
		/******************** effectevidencesynthesisusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator effectevidencesynthesisusecontextvaluerangehighcomparator = effectevidencesynthesisusecontextvaluerangehigh.getComparator();
		e.setEfctEvdnceSynthsUseCntxtVlRngHiCmprtr(effectevidencesynthesisusecontextvaluerangehighcomparator.toCode());

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangehigh.hasCode()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngHiCd(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getCode()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangehigh.hasUnit()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngHiUnt(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getUnit()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluerangehigh.hasSystem()) {
			e.setEfctEvdnceSynthsUseCntxtVlRngHiSys(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getSystem()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(effectevidencesynthesisusecontext.hasValueReference()) {
			e.setEfctEvdnceSynthsUseCntxtVlRfrnc(String.valueOf(effectevidencesynthesisusecontext.getValueReference()));
		}
		/******************** effectevidencesynthesisjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisjurisdiction = effectevidencesynthesis.getJurisdictionFirstRep();

		/******************** EfctEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(effectevidencesynthesisjurisdiction.hasText()) {
			e.setEfctEvdnceSynthsJrsdctnTxt(String.valueOf(effectevidencesynthesisjurisdiction.getText()));
		}
		/******************** effectevidencesynthesisjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisjurisdictioncoding = effectevidencesynthesisjurisdiction.getCodingFirstRep();

		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncoding.hasVersion()) {
			e.setEfctEvdnceSynthsJrsdctnCdgVrsn(String.valueOf(effectevidencesynthesisjurisdictioncoding.getVersion()));
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncoding.hasDisplay()) {
			e.setEfctEvdnceSynthsJrsdctnCdgDsply(String.valueOf(effectevidencesynthesisjurisdictioncoding.getDisplay()));
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncoding.hasCode()) {
			e.setEfctEvdnceSynthsJrsdctnCdgCd(String.valueOf(effectevidencesynthesisjurisdictioncoding.getCode()));
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncoding.hasUserSelected()) {
			e.setEfctEvdnceSynthsJrsdctnCdgUsrSltd(String.valueOf(effectevidencesynthesisjurisdictioncoding.getUserSelected()));
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncoding.hasSystem()) {
			e.setEfctEvdnceSynthsJrsdctnCdgSys(String.valueOf(effectevidencesynthesisjurisdictioncoding.getSystem()));
		}
		return e;
	}
}
