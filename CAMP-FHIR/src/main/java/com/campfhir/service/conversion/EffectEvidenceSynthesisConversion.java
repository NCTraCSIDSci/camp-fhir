package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EffectEvidenceSynthesis;
public class EffectEvidenceSynthesisConversion 
{
	public org.hl7.fhir.r4.model.EffectEvidenceSynthesis EffectEvidenceSynthesiss(EffectEvidenceSynthesis e) throws ParseException
	{
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis effectevidencesynthesis = new org.hl7.fhir.r4.model.EffectEvidenceSynthesis();

		/******************** id ********************************************************************************/
		effectevidencesynthesis.setId(e.getId());

		/******************** EfctEvdnceSynths_ApprovalDt ********************************************************************************/
		if(e.getEfctEvdnceSynthsApprovalDt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_ApprovalDtdate = EfctEvdnceSynths_ApprovalDtsdf.parse(e.getEfctEvdnceSynthsApprovalDt());
			effectevidencesynthesis.setApprovalDate(EfctEvdnceSynths_ApprovalDtdate);
		}
		/******************** effectevidencesynthesisauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesisauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		effectevidencesynthesis.addAuthor(effectevidencesynthesisauthor);

		/******************** EfctEvdnceSynths_Athr_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrNm() != null) {
			effectevidencesynthesisauthor.setName(e.getEfctEvdnceSynthsAthrNm());
		}
		/******************** effectevidencesynthesisauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesisauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		effectevidencesynthesisauthor.addTelecom(effectevidencesynthesisauthortelecom);

		/******************** effectevidencesynthesisauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesisauthortelecom.setPeriod(effectevidencesynthesisauthortelecomperiod);

		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Athr_Tlcm_Prd_Enddate = EfctEvdnceSynths_Athr_Tlcm_Prd_Endsdf.parse(e.getEfctEvdnceSynthsAthrTlcmPrdEnd());
			effectevidencesynthesisauthortelecomperiod.setEnd(EfctEvdnceSynths_Athr_Tlcm_Prd_Enddate);
		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Athr_Tlcm_Prd_Strtdate = EfctEvdnceSynths_Athr_Tlcm_Prd_Strtsdf.parse(e.getEfctEvdnceSynthsAthrTlcmPrdStrt());
			effectevidencesynthesisauthortelecomperiod.setStart(EfctEvdnceSynths_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmRnk() != null) {
			effectevidencesynthesisauthortelecom.setRank(Integer.parseInt(e.getEfctEvdnceSynthsAthrTlcmRnk()));
		}
		/******************** effectevidencesynthesisauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory effectevidencesynthesisauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		effectevidencesynthesisauthortelecom.setSystem(effectevidencesynthesisauthortelecomsystem.fromCode(e.getEfctEvdnceSynthsAthrTlcmSys()));

		/******************** effectevidencesynthesisauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory effectevidencesynthesisauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		effectevidencesynthesisauthortelecom.setUse(effectevidencesynthesisauthortelecomuse.fromCode(e.getEfctEvdnceSynthsAthrTlcmUse()));

		/******************** EfctEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmVl() != null) {
			effectevidencesynthesisauthortelecom.setValue(e.getEfctEvdnceSynthsAthrTlcmVl());
		}
		/******************** effectevidencesynthesiscertainty ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyComponent effectevidencesynthesiscertainty =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyComponent();
		effectevidencesynthesis.addCertainty(effectevidencesynthesiscertainty);

		/******************** effectevidencesynthesiscertaintycertaintysubcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent effectevidencesynthesiscertaintycertaintysubcomponent =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent();
		effectevidencesynthesiscertainty.addCertaintySubcomponent(effectevidencesynthesiscertaintycertaintysubcomponent);

		/******************** effectevidencesynthesiscertaintycertaintysubcomponentnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation effectevidencesynthesiscertaintycertaintysubcomponentnote =  new org.hl7.fhir.r4.model.Annotation();
		effectevidencesynthesiscertaintycertaintysubcomponent.addNote(effectevidencesynthesiscertaintycertaintysubcomponentnote);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentnote.setAuthor( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentnote.setAuthor( new org.hl7.fhir.r4.model.StringType(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentnote.setText(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timedate = EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timesdf.parse(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime());
			effectevidencesynthesiscertaintycertaintysubcomponentnote.setTime(EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timedate);
		}
		/******************** effectevidencesynthesiscertaintycertaintysubcomponentrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintycertaintysubcomponentrating =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiscertaintycertaintysubcomponent.addRating(effectevidencesynthesiscertaintycertaintysubcomponentrating);

		/******************** effectevidencesynthesiscertaintycertaintysubcomponentratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiscertaintycertaintysubcomponentratingcoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiscertaintycertaintysubcomponentrating.addCoding(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.setCode(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.setDisplay(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.setSystem(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.setVersion(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponentrating.setText(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt());
		}
		/******************** effectevidencesynthesiscertaintycertaintysubcomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintycertaintysubcomponenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiscertaintycertaintysubcomponent.setType(effectevidencesynthesiscertaintycertaintysubcomponenttype);

		/******************** effectevidencesynthesiscertaintycertaintysubcomponenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiscertaintycertaintysubcomponenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiscertaintycertaintysubcomponenttype.addCoding(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.setCode(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.setDisplay(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.setSystem(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.setVersion(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn());
		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt() != null) {
			effectevidencesynthesiscertaintycertaintysubcomponenttype.setText(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt());
		}
		/******************** effectevidencesynthesiscertaintynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation effectevidencesynthesiscertaintynote =  new org.hl7.fhir.r4.model.Annotation();
		effectevidencesynthesiscertainty.addNote(effectevidencesynthesiscertaintynote);

		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtAthrRfrnc() != null) {
			effectevidencesynthesiscertaintynote.setAuthor( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsCrtntyNtAthrRfrnc()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtAthrStrgTyp() != null) {
			effectevidencesynthesiscertaintynote.setAuthor( new org.hl7.fhir.r4.model.StringType(e.getEfctEvdnceSynthsCrtntyNtAthrStrgTyp()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtTxt() != null) {
			effectevidencesynthesiscertaintynote.setText(e.getEfctEvdnceSynthsCrtntyNtTxt());
		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtTime() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Crtnty_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Crtnty_Nt_Timedate = EfctEvdnceSynths_Crtnty_Nt_Timesdf.parse(e.getEfctEvdnceSynthsCrtntyNtTime());
			effectevidencesynthesiscertaintynote.setTime(EfctEvdnceSynths_Crtnty_Nt_Timedate);
		}
		/******************** effectevidencesynthesiscertaintyrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintyrating =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiscertainty.addRating(effectevidencesynthesiscertaintyrating);

		/******************** effectevidencesynthesiscertaintyratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiscertaintyratingcoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiscertaintyrating.addCoding(effectevidencesynthesiscertaintyratingcoding);

		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgCd() != null) {
			effectevidencesynthesiscertaintyratingcoding.setCode(e.getEfctEvdnceSynthsCrtntyRatingCdgCd());
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgDsply() != null) {
			effectevidencesynthesiscertaintyratingcoding.setDisplay(e.getEfctEvdnceSynthsCrtntyRatingCdgDsply());
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgSys() != null) {
			effectevidencesynthesiscertaintyratingcoding.setSystem(e.getEfctEvdnceSynthsCrtntyRatingCdgSys());
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgUsrSltd() != null) {
			effectevidencesynthesiscertaintyratingcoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsCrtntyRatingCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgVrsn() != null) {
			effectevidencesynthesiscertaintyratingcoding.setVersion(e.getEfctEvdnceSynthsCrtntyRatingCdgVrsn());
		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingTxt() != null) {
			effectevidencesynthesiscertaintyrating.setText(e.getEfctEvdnceSynthsCrtntyRatingTxt());
		}
		/******************** effectevidencesynthesiscontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesiscontact =  new org.hl7.fhir.r4.model.ContactDetail();
		effectevidencesynthesis.addContact(effectevidencesynthesiscontact);

		/******************** EfctEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctNm() != null) {
			effectevidencesynthesiscontact.setName(e.getEfctEvdnceSynthsCntctNm());
		}
		/******************** effectevidencesynthesiscontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesiscontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		effectevidencesynthesiscontact.addTelecom(effectevidencesynthesiscontacttelecom);

		/******************** effectevidencesynthesiscontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiscontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesiscontacttelecom.setPeriod(effectevidencesynthesiscontacttelecomperiod);

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Cntct_Tlcm_Prd_Enddate = EfctEvdnceSynths_Cntct_Tlcm_Prd_Endsdf.parse(e.getEfctEvdnceSynthsCntctTlcmPrdEnd());
			effectevidencesynthesiscontacttelecomperiod.setEnd(EfctEvdnceSynths_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Cntct_Tlcm_Prd_Strtdate = EfctEvdnceSynths_Cntct_Tlcm_Prd_Strtsdf.parse(e.getEfctEvdnceSynthsCntctTlcmPrdStrt());
			effectevidencesynthesiscontacttelecomperiod.setStart(EfctEvdnceSynths_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmRnk() != null) {
			effectevidencesynthesiscontacttelecom.setRank(Integer.parseInt(e.getEfctEvdnceSynthsCntctTlcmRnk()));
		}
		/******************** effectevidencesynthesiscontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory effectevidencesynthesiscontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		effectevidencesynthesiscontacttelecom.setSystem(effectevidencesynthesiscontacttelecomsystem.fromCode(e.getEfctEvdnceSynthsCntctTlcmSys()));

		/******************** effectevidencesynthesiscontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory effectevidencesynthesiscontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		effectevidencesynthesiscontacttelecom.setUse(effectevidencesynthesiscontacttelecomuse.fromCode(e.getEfctEvdnceSynthsCntctTlcmUse()));

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmVl() != null) {
			effectevidencesynthesiscontacttelecom.setValue(e.getEfctEvdnceSynthsCntctTlcmVl());
		}
		/******************** EfctEvdnceSynths_Copyright ********************************************************************************/
		if(e.getEfctEvdnceSynthsCopyright() != null) {
			effectevidencesynthesis.setCopyright(e.getEfctEvdnceSynthsCopyright());
		}
		/******************** EfctEvdnceSynths_Dt ********************************************************************************/
		if(e.getEfctEvdnceSynthsDt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Dtdate = EfctEvdnceSynths_Dtsdf.parse(e.getEfctEvdnceSynthsDt());
			effectevidencesynthesis.setDate(EfctEvdnceSynths_Dtdate);
		}
		/******************** EfctEvdnceSynths_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsDscrptn() != null) {
			effectevidencesynthesis.setDescription(e.getEfctEvdnceSynthsDscrptn());
		}
		/******************** effectevidencesynthesiseditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesiseditor =  new org.hl7.fhir.r4.model.ContactDetail();
		effectevidencesynthesis.addEditor(effectevidencesynthesiseditor);

		/******************** EfctEvdnceSynths_Editor_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorNm() != null) {
			effectevidencesynthesiseditor.setName(e.getEfctEvdnceSynthsEditorNm());
		}
		/******************** effectevidencesynthesiseditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesiseditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		effectevidencesynthesiseditor.addTelecom(effectevidencesynthesiseditortelecom);

		/******************** effectevidencesynthesiseditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiseditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesiseditortelecom.setPeriod(effectevidencesynthesiseditortelecomperiod);

		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Editor_Tlcm_Prd_Enddate = EfctEvdnceSynths_Editor_Tlcm_Prd_Endsdf.parse(e.getEfctEvdnceSynthsEditorTlcmPrdEnd());
			effectevidencesynthesiseditortelecomperiod.setEnd(EfctEvdnceSynths_Editor_Tlcm_Prd_Enddate);
		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Editor_Tlcm_Prd_Strtdate = EfctEvdnceSynths_Editor_Tlcm_Prd_Strtsdf.parse(e.getEfctEvdnceSynthsEditorTlcmPrdStrt());
			effectevidencesynthesiseditortelecomperiod.setStart(EfctEvdnceSynths_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmRnk() != null) {
			effectevidencesynthesiseditortelecom.setRank(Integer.parseInt(e.getEfctEvdnceSynthsEditorTlcmRnk()));
		}
		/******************** effectevidencesynthesiseditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory effectevidencesynthesiseditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		effectevidencesynthesiseditortelecom.setSystem(effectevidencesynthesiseditortelecomsystem.fromCode(e.getEfctEvdnceSynthsEditorTlcmSys()));

		/******************** effectevidencesynthesiseditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory effectevidencesynthesiseditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		effectevidencesynthesiseditortelecom.setUse(effectevidencesynthesiseditortelecomuse.fromCode(e.getEfctEvdnceSynthsEditorTlcmUse()));

		/******************** EfctEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmVl() != null) {
			effectevidencesynthesiseditortelecom.setValue(e.getEfctEvdnceSynthsEditorTlcmVl());
		}
		/******************** effectevidencesynthesiseffectestimate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimateComponent effectevidencesynthesiseffectestimate =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimateComponent();
		effectevidencesynthesis.addEffectEstimate(effectevidencesynthesiseffectestimate);

		/******************** EfctEvdnceSynths_EfctEstmt_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtDscrptn() != null) {
			effectevidencesynthesiseffectestimate.setDescription(e.getEfctEvdnceSynthsEfctEstmtDscrptn());
		}
		/******************** effectevidencesynthesiseffectestimateprecisionestimate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent effectevidencesynthesiseffectestimateprecisionestimate =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent();
		effectevidencesynthesiseffectestimate.addPrecisionEstimate(effectevidencesynthesiseffectestimateprecisionestimate);

		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_From ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom() != null) {
			effectevidencesynthesiseffectestimateprecisionestimate.setFrom(Double.parseDouble((e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom())));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel() != null) {
			effectevidencesynthesiseffectestimateprecisionestimate.setLevel(new java.math.BigDecimal((e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel())));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_To ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo() != null) {
			effectevidencesynthesiseffectestimateprecisionestimate.setTo(Double.parseDouble((e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo())));
		}
		/******************** effectevidencesynthesiseffectestimateprecisionestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimateprecisionestimatetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiseffectestimateprecisionestimate.setType(effectevidencesynthesiseffectestimateprecisionestimatetype);

		/******************** effectevidencesynthesiseffectestimateprecisionestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimateprecisionestimatetypecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiseffectestimateprecisionestimatetype.addCoding(effectevidencesynthesiseffectestimateprecisionestimatetypecoding);

		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd() != null) {
			effectevidencesynthesiseffectestimateprecisionestimatetypecoding.setCode(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply() != null) {
			effectevidencesynthesiseffectestimateprecisionestimatetypecoding.setDisplay(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys() != null) {
			effectevidencesynthesiseffectestimateprecisionestimatetypecoding.setSystem(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd() != null) {
			effectevidencesynthesiseffectestimateprecisionestimatetypecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn() != null) {
			effectevidencesynthesiseffectestimateprecisionestimatetypecoding.setVersion(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt() != null) {
			effectevidencesynthesiseffectestimateprecisionestimatetype.setText(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt());
		}
		/******************** effectevidencesynthesiseffectestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimatetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiseffectestimate.setType(effectevidencesynthesiseffectestimatetype);

		/******************** effectevidencesynthesiseffectestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimatetypecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiseffectestimatetype.addCoding(effectevidencesynthesiseffectestimatetypecoding);

		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgCd() != null) {
			effectevidencesynthesiseffectestimatetypecoding.setCode(e.getEfctEvdnceSynthsEfctEstmtTypCdgCd());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgDsply() != null) {
			effectevidencesynthesiseffectestimatetypecoding.setDisplay(e.getEfctEvdnceSynthsEfctEstmtTypCdgDsply());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgSys() != null) {
			effectevidencesynthesiseffectestimatetypecoding.setSystem(e.getEfctEvdnceSynthsEfctEstmtTypCdgSys());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd() != null) {
			effectevidencesynthesiseffectestimatetypecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgVrsn() != null) {
			effectevidencesynthesiseffectestimatetypecoding.setVersion(e.getEfctEvdnceSynthsEfctEstmtTypCdgVrsn());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypTxt() != null) {
			effectevidencesynthesiseffectestimatetype.setText(e.getEfctEvdnceSynthsEfctEstmtTypTxt());
		}
		/******************** effectevidencesynthesiseffectestimateunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimateunitofmeasure =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiseffectestimate.setUnitOfMeasure(effectevidencesynthesiseffectestimateunitofmeasure);

		/******************** effectevidencesynthesiseffectestimateunitofmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimateunitofmeasurecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiseffectestimateunitofmeasure.addCoding(effectevidencesynthesiseffectestimateunitofmeasurecoding);

		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd() != null) {
			effectevidencesynthesiseffectestimateunitofmeasurecoding.setCode(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply() != null) {
			effectevidencesynthesiseffectestimateunitofmeasurecoding.setDisplay(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys() != null) {
			effectevidencesynthesiseffectestimateunitofmeasurecoding.setSystem(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd() != null) {
			effectevidencesynthesiseffectestimateunitofmeasurecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn() != null) {
			effectevidencesynthesiseffectestimateunitofmeasurecoding.setVersion(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrTxt() != null) {
			effectevidencesynthesiseffectestimateunitofmeasure.setText(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrTxt());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVl() != null) {
			effectevidencesynthesiseffectestimate.setValue(Double.parseDouble((e.getEfctEvdnceSynthsEfctEstmtVl())));
		}
		/******************** effectevidencesynthesiseffectestimatevariantstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimatevariantstate =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesiseffectestimate.setVariantState(effectevidencesynthesiseffectestimatevariantstate);

		/******************** effectevidencesynthesiseffectestimatevariantstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesiseffectestimatevariantstatecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesiseffectestimatevariantstate.addCoding(effectevidencesynthesiseffectestimatevariantstatecoding);

		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgCd() != null) {
			effectevidencesynthesiseffectestimatevariantstatecoding.setCode(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgCd());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply() != null) {
			effectevidencesynthesiseffectestimatevariantstatecoding.setDisplay(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgSys() != null) {
			effectevidencesynthesiseffectestimatevariantstatecoding.setSystem(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgSys());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd() != null) {
			effectevidencesynthesiseffectestimatevariantstatecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn() != null) {
			effectevidencesynthesiseffectestimatevariantstatecoding.setVersion(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn());
		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateTxt() != null) {
			effectevidencesynthesiseffectestimatevariantstate.setText(e.getEfctEvdnceSynthsEfctEstmtVariantStateTxt());
		}
		/******************** effectevidencesynthesiseffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiseffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesis.setEffectivePeriod(effectevidencesynthesiseffectiveperiod);

		/******************** EfctEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_EfctivePrd_Enddate = EfctEvdnceSynths_EfctivePrd_Endsdf.parse(e.getEfctEvdnceSynthsEfctivePrdEnd());
			effectevidencesynthesiseffectiveperiod.setEnd(EfctEvdnceSynths_EfctivePrd_Enddate);
		}
		/******************** EfctEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_EfctivePrd_Strtdate = EfctEvdnceSynths_EfctivePrd_Strtsdf.parse(e.getEfctEvdnceSynthsEfctivePrdStrt());
			effectevidencesynthesiseffectiveperiod.setStart(EfctEvdnceSynths_EfctivePrd_Strtdate);
		}
		/******************** effectevidencesynthesisendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesisendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		effectevidencesynthesis.addEndorser(effectevidencesynthesisendorser);

		/******************** EfctEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrNm() != null) {
			effectevidencesynthesisendorser.setName(e.getEfctEvdnceSynthsEndsrNm());
		}
		/******************** effectevidencesynthesisendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesisendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		effectevidencesynthesisendorser.addTelecom(effectevidencesynthesisendorsertelecom);

		/******************** effectevidencesynthesisendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesisendorsertelecom.setPeriod(effectevidencesynthesisendorsertelecomperiod);

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Endsr_Tlcm_Prd_Enddate = EfctEvdnceSynths_Endsr_Tlcm_Prd_Endsdf.parse(e.getEfctEvdnceSynthsEndsrTlcmPrdEnd());
			effectevidencesynthesisendorsertelecomperiod.setEnd(EfctEvdnceSynths_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Endsr_Tlcm_Prd_Strtdate = EfctEvdnceSynths_Endsr_Tlcm_Prd_Strtsdf.parse(e.getEfctEvdnceSynthsEndsrTlcmPrdStrt());
			effectevidencesynthesisendorsertelecomperiod.setStart(EfctEvdnceSynths_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmRnk() != null) {
			effectevidencesynthesisendorsertelecom.setRank(Integer.parseInt(e.getEfctEvdnceSynthsEndsrTlcmRnk()));
		}
		/******************** effectevidencesynthesisendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory effectevidencesynthesisendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		effectevidencesynthesisendorsertelecom.setSystem(effectevidencesynthesisendorsertelecomsystem.fromCode(e.getEfctEvdnceSynthsEndsrTlcmSys()));

		/******************** effectevidencesynthesisendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory effectevidencesynthesisendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		effectevidencesynthesisendorsertelecom.setUse(effectevidencesynthesisendorsertelecomuse.fromCode(e.getEfctEvdnceSynthsEndsrTlcmUse()));

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmVl() != null) {
			effectevidencesynthesisendorsertelecom.setValue(e.getEfctEvdnceSynthsEndsrTlcmVl());
		}
		/******************** EfctEvdnceSynths_Exposure ********************************************************************************/
		if(e.getEfctEvdnceSynthsExposure() != null) {
			effectevidencesynthesis.setExposure( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsExposure()));
		}
		/******************** EfctEvdnceSynths_ExposureAlternative ********************************************************************************/
		if(e.getEfctEvdnceSynthsExposureAlternative() != null) {
			effectevidencesynthesis.setExposureAlternative( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsExposureAlternative()));
		}
		/******************** effectevidencesynthesisidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier effectevidencesynthesisidentifier =  new org.hl7.fhir.r4.model.Identifier();
		effectevidencesynthesis.addIdentifier(effectevidencesynthesisidentifier);

		/******************** EfctEvdnceSynths_Id_Assigner ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdAssigner() != null) {
			effectevidencesynthesisidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsIdAssigner()));
		}
		/******************** effectevidencesynthesisidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesisidentifier.setPeriod(effectevidencesynthesisidentifierperiod);

		/******************** EfctEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdPrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Id_Prd_Enddate = EfctEvdnceSynths_Id_Prd_Endsdf.parse(e.getEfctEvdnceSynthsIdPrdEnd());
			effectevidencesynthesisidentifierperiod.setEnd(EfctEvdnceSynths_Id_Prd_Enddate);
		}
		/******************** EfctEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdPrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Id_Prd_Strtdate = EfctEvdnceSynths_Id_Prd_Strtsdf.parse(e.getEfctEvdnceSynthsIdPrdStrt());
			effectevidencesynthesisidentifierperiod.setStart(EfctEvdnceSynths_Id_Prd_Strtdate);
		}
		/******************** EfctEvdnceSynths_Id_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdSys() != null) {
			effectevidencesynthesisidentifier.setSystem(e.getEfctEvdnceSynthsIdSys());
		}
		/******************** effectevidencesynthesisidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesisidentifier.setType(effectevidencesynthesisidentifiertype);

		/******************** effectevidencesynthesisidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesisidentifiertype.addCoding(effectevidencesynthesisidentifiertypecoding);

		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgCd() != null) {
			effectevidencesynthesisidentifiertypecoding.setCode(e.getEfctEvdnceSynthsIdTypCdgCd());
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgDsply() != null) {
			effectevidencesynthesisidentifiertypecoding.setDisplay(e.getEfctEvdnceSynthsIdTypCdgDsply());
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgSys() != null) {
			effectevidencesynthesisidentifiertypecoding.setSystem(e.getEfctEvdnceSynthsIdTypCdgSys());
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgUsrSltd() != null) {
			effectevidencesynthesisidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsIdTypCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgVrsn() != null) {
			effectevidencesynthesisidentifiertypecoding.setVersion(e.getEfctEvdnceSynthsIdTypCdgVrsn());
		}
		/******************** EfctEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypTxt() != null) {
			effectevidencesynthesisidentifiertype.setText(e.getEfctEvdnceSynthsIdTypTxt());
		}
		/******************** effectevidencesynthesisidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory effectevidencesynthesisidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		effectevidencesynthesisidentifier.setUse(effectevidencesynthesisidentifieruse.fromCode(e.getEfctEvdnceSynthsIdUse()));

		/******************** EfctEvdnceSynths_Id_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdVl() != null) {
			effectevidencesynthesisidentifier.setValue(e.getEfctEvdnceSynthsIdVl());
		}
		/******************** effectevidencesynthesisjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesis.addJurisdiction(effectevidencesynthesisjurisdiction);

		/******************** effectevidencesynthesisjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesisjurisdiction.addCoding(effectevidencesynthesisjurisdictioncoding);

		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgCd() != null) {
			effectevidencesynthesisjurisdictioncoding.setCode(e.getEfctEvdnceSynthsJrsdctnCdgCd());
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgDsply() != null) {
			effectevidencesynthesisjurisdictioncoding.setDisplay(e.getEfctEvdnceSynthsJrsdctnCdgDsply());
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgSys() != null) {
			effectevidencesynthesisjurisdictioncoding.setSystem(e.getEfctEvdnceSynthsJrsdctnCdgSys());
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgUsrSltd() != null) {
			effectevidencesynthesisjurisdictioncoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsJrsdctnCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgVrsn() != null) {
			effectevidencesynthesisjurisdictioncoding.setVersion(e.getEfctEvdnceSynthsJrsdctnCdgVrsn());
		}
		/******************** EfctEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnTxt() != null) {
			effectevidencesynthesisjurisdiction.setText(e.getEfctEvdnceSynthsJrsdctnTxt());
		}
		/******************** EfctEvdnceSynths_LastReviewDt ********************************************************************************/
		if(e.getEfctEvdnceSynthsLastReviewDt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_LastReviewDtdate = EfctEvdnceSynths_LastReviewDtsdf.parse(e.getEfctEvdnceSynthsLastReviewDt());
			effectevidencesynthesis.setLastReviewDate(EfctEvdnceSynths_LastReviewDtdate);
		}
		/******************** EfctEvdnceSynths_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsNm() != null) {
			effectevidencesynthesis.setName(e.getEfctEvdnceSynthsNm());
		}
		/******************** effectevidencesynthesisnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation effectevidencesynthesisnote =  new org.hl7.fhir.r4.model.Annotation();
		effectevidencesynthesis.addNote(effectevidencesynthesisnote);

		/******************** EfctEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtAthrRfrnc() != null) {
			effectevidencesynthesisnote.setAuthor( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsNtAthrRfrnc()));
		}
		/******************** EfctEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtAthrStrgTyp() != null) {
			effectevidencesynthesisnote.setAuthor( new org.hl7.fhir.r4.model.StringType(e.getEfctEvdnceSynthsNtAthrStrgTyp()));
		}
		/******************** EfctEvdnceSynths_Nt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtTxt() != null) {
			effectevidencesynthesisnote.setText(e.getEfctEvdnceSynthsNtTxt());
		}
		/******************** EfctEvdnceSynths_Nt_Time ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtTime() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Nt_Timedate = EfctEvdnceSynths_Nt_Timesdf.parse(e.getEfctEvdnceSynthsNtTime());
			effectevidencesynthesisnote.setTime(EfctEvdnceSynths_Nt_Timedate);
		}
		/******************** EfctEvdnceSynths_Outcome ********************************************************************************/
		if(e.getEfctEvdnceSynthsOutcome() != null) {
			effectevidencesynthesis.setOutcome( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsOutcome()));
		}
		/******************** EfctEvdnceSynths_Popln ********************************************************************************/
		if(e.getEfctEvdnceSynthsPopln() != null) {
			effectevidencesynthesis.setPopulation( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsPopln()));
		}
		/******************** EfctEvdnceSynths_Pblshr ********************************************************************************/
		if(e.getEfctEvdnceSynthsPblshr() != null) {
			effectevidencesynthesis.setPublisher(e.getEfctEvdnceSynthsPblshr());
		}
		/******************** effectevidencesynthesisrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact effectevidencesynthesisrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		effectevidencesynthesis.addRelatedArtifact(effectevidencesynthesisrelatedartifact);

		/******************** EfctEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctCitation() != null) {
			effectevidencesynthesisrelatedartifact.setCitation(e.getEfctEvdnceSynthsRltedArtfctCitation());
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDsply() != null) {
			effectevidencesynthesisrelatedartifact.setDisplay(e.getEfctEvdnceSynthsRltedArtfctDsply());
		}
		/******************** effectevidencesynthesisrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment effectevidencesynthesisrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		effectevidencesynthesisrelatedartifact.setDocument(effectevidencesynthesisrelatedartifactdocument);

		/******************** EfctEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocCntntTyp() != null) {
			effectevidencesynthesisrelatedartifactdocument.setContentType(e.getEfctEvdnceSynthsRltedArtfctDocCntntTyp());
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_RltedArtfct_Doc_Creationdate = EfctEvdnceSynths_RltedArtfct_Doc_Creationsdf.parse(e.getEfctEvdnceSynthsRltedArtfctDocCreation());
			effectevidencesynthesisrelatedartifactdocument.setCreation(EfctEvdnceSynths_RltedArtfct_Doc_Creationdate);
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocData() != null) {
			effectevidencesynthesisrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEfctEvdnceSynthsRltedArtfctDocData()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocHash() != null) {
			effectevidencesynthesisrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEfctEvdnceSynthsRltedArtfctDocHash()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocLnguage() != null) {
			effectevidencesynthesisrelatedartifactdocument.setLanguage(e.getEfctEvdnceSynthsRltedArtfctDocLnguage());
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocSz() != null) {
			effectevidencesynthesisrelatedartifactdocument.setSize(Integer.parseInt(e.getEfctEvdnceSynthsRltedArtfctDocSz()));
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocTtl() != null) {
			effectevidencesynthesisrelatedartifactdocument.setTitle(e.getEfctEvdnceSynthsRltedArtfctDocTtl());
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocUrl() != null) {
			effectevidencesynthesisrelatedartifactdocument.setUrl(e.getEfctEvdnceSynthsRltedArtfctDocUrl());
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctLbl() != null) {
			effectevidencesynthesisrelatedartifact.setLabel(e.getEfctEvdnceSynthsRltedArtfctLbl());
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctRsrc() != null) {
			effectevidencesynthesisrelatedartifact.setResource(e.getEfctEvdnceSynthsRltedArtfctRsrc());
		}
		/******************** effectevidencesynthesisrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory effectevidencesynthesisrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		effectevidencesynthesisrelatedartifact.setType(effectevidencesynthesisrelatedartifacttype.fromCode(e.getEfctEvdnceSynthsRltedArtfctTyp()));

		/******************** EfctEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctUrl() != null) {
			effectevidencesynthesisrelatedartifact.setUrl(e.getEfctEvdnceSynthsRltedArtfctUrl());
		}
		/******************** effectevidencesynthesisresultsbyexposure ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisResultsByExposureComponent effectevidencesynthesisresultsbyexposure =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisResultsByExposureComponent();
		effectevidencesynthesis.addResultsByExposure(effectevidencesynthesisresultsbyexposure);

		/******************** EfctEvdnceSynths_RsltsByExposure_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureDscrptn() != null) {
			effectevidencesynthesisresultsbyexposure.setDescription(e.getEfctEvdnceSynthsRsltsByExposureDscrptn());
		}
		/******************** effectevidencesynthesisresultsbyexposureexposurestate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.ExposureStateEnumFactory effectevidencesynthesisresultsbyexposureexposurestate =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.ExposureStateEnumFactory();
		effectevidencesynthesisresultsbyexposure.setExposureState(effectevidencesynthesisresultsbyexposureexposurestate.fromCode(e.getEfctEvdnceSynthsRsltsByExposureExposureState()));

		/******************** EfctEvdnceSynths_RsltsByExposure_RskEvdnceSynths ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths() != null) {
			effectevidencesynthesisresultsbyexposure.setRiskEvidenceSynthesis( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths()));
		}
		/******************** effectevidencesynthesisresultsbyexposurevariantstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisresultsbyexposurevariantstate =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesisresultsbyexposure.setVariantState(effectevidencesynthesisresultsbyexposurevariantstate);

		/******************** effectevidencesynthesisresultsbyexposurevariantstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisresultsbyexposurevariantstatecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesisresultsbyexposurevariantstate.addCoding(effectevidencesynthesisresultsbyexposurevariantstatecoding);

		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd() != null) {
			effectevidencesynthesisresultsbyexposurevariantstatecoding.setCode(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd());
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply() != null) {
			effectevidencesynthesisresultsbyexposurevariantstatecoding.setDisplay(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply());
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys() != null) {
			effectevidencesynthesisresultsbyexposurevariantstatecoding.setSystem(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys());
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd() != null) {
			effectevidencesynthesisresultsbyexposurevariantstatecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn() != null) {
			effectevidencesynthesisresultsbyexposurevariantstatecoding.setVersion(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn());
		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateTxt() != null) {
			effectevidencesynthesisresultsbyexposurevariantstate.setText(e.getEfctEvdnceSynthsRsltsByExposureVariantStateTxt());
		}
		/******************** effectevidencesynthesisreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail effectevidencesynthesisreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		effectevidencesynthesis.addReviewer(effectevidencesynthesisreviewer);

		/******************** EfctEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrNm() != null) {
			effectevidencesynthesisreviewer.setName(e.getEfctEvdnceSynthsRviewrNm());
		}
		/******************** effectevidencesynthesisreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint effectevidencesynthesisreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		effectevidencesynthesisreviewer.addTelecom(effectevidencesynthesisreviewertelecom);

		/******************** effectevidencesynthesisreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		effectevidencesynthesisreviewertelecom.setPeriod(effectevidencesynthesisreviewertelecomperiod);

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Rviewr_Tlcm_Prd_Enddate = EfctEvdnceSynths_Rviewr_Tlcm_Prd_Endsdf.parse(e.getEfctEvdnceSynthsRviewrTlcmPrdEnd());
			effectevidencesynthesisreviewertelecomperiod.setEnd(EfctEvdnceSynths_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strtdate = EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strtsdf.parse(e.getEfctEvdnceSynthsRviewrTlcmPrdStrt());
			effectevidencesynthesisreviewertelecomperiod.setStart(EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmRnk() != null) {
			effectevidencesynthesisreviewertelecom.setRank(Integer.parseInt(e.getEfctEvdnceSynthsRviewrTlcmRnk()));
		}
		/******************** effectevidencesynthesisreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory effectevidencesynthesisreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		effectevidencesynthesisreviewertelecom.setSystem(effectevidencesynthesisreviewertelecomsystem.fromCode(e.getEfctEvdnceSynthsRviewrTlcmSys()));

		/******************** effectevidencesynthesisreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory effectevidencesynthesisreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		effectevidencesynthesisreviewertelecom.setUse(effectevidencesynthesisreviewertelecomuse.fromCode(e.getEfctEvdnceSynthsRviewrTlcmUse()));

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmVl() != null) {
			effectevidencesynthesisreviewertelecom.setValue(e.getEfctEvdnceSynthsRviewrTlcmVl());
		}
		/******************** effectevidencesynthesissamplesize ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSizeComponent effectevidencesynthesissamplesize =  new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSizeComponent();
		effectevidencesynthesis.setSampleSize(effectevidencesynthesissamplesize);

		/******************** EfctEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsSampleSzDscrptn() != null) {
			effectevidencesynthesissamplesize.setDescription(e.getEfctEvdnceSynthsSampleSzDscrptn());
		}
		/******************** EfctEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(e.getEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts() != null) {
			effectevidencesynthesissamplesize.setNumberOfParticipants(Integer.parseInt(e.getEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts()));
		}
		/******************** EfctEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(e.getEfctEvdnceSynthsSampleSzNmbrOfStudies() != null) {
			effectevidencesynthesissamplesize.setNumberOfStudies(Integer.parseInt(e.getEfctEvdnceSynthsSampleSzNmbrOfStudies()));
		}
		/******************** effectevidencesynthesisstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory effectevidencesynthesisstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		effectevidencesynthesis.setStatus(effectevidencesynthesisstatus.fromCode(e.getEfctEvdnceSynthsSts()));

		/******************** effectevidencesynthesisstudytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisstudytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesis.setStudyType(effectevidencesynthesisstudytype);

		/******************** effectevidencesynthesisstudytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisstudytypecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesisstudytype.addCoding(effectevidencesynthesisstudytypecoding);

		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgCd() != null) {
			effectevidencesynthesisstudytypecoding.setCode(e.getEfctEvdnceSynthsStdyTypCdgCd());
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgDsply() != null) {
			effectevidencesynthesisstudytypecoding.setDisplay(e.getEfctEvdnceSynthsStdyTypCdgDsply());
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgSys() != null) {
			effectevidencesynthesisstudytypecoding.setSystem(e.getEfctEvdnceSynthsStdyTypCdgSys());
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgUsrSltd() != null) {
			effectevidencesynthesisstudytypecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsStdyTypCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgVrsn() != null) {
			effectevidencesynthesisstudytypecoding.setVersion(e.getEfctEvdnceSynthsStdyTypCdgVrsn());
		}
		/******************** EfctEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypTxt() != null) {
			effectevidencesynthesisstudytype.setText(e.getEfctEvdnceSynthsStdyTypTxt());
		}
		/******************** effectevidencesynthesissynthesistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesissynthesistype =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesis.setSynthesisType(effectevidencesynthesissynthesistype);

		/******************** effectevidencesynthesissynthesistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesissynthesistypecoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesissynthesistype.addCoding(effectevidencesynthesissynthesistypecoding);

		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgCd() != null) {
			effectevidencesynthesissynthesistypecoding.setCode(e.getEfctEvdnceSynthsSynthsTypCdgCd());
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgDsply() != null) {
			effectevidencesynthesissynthesistypecoding.setDisplay(e.getEfctEvdnceSynthsSynthsTypCdgDsply());
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgSys() != null) {
			effectevidencesynthesissynthesistypecoding.setSystem(e.getEfctEvdnceSynthsSynthsTypCdgSys());
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgUsrSltd() != null) {
			effectevidencesynthesissynthesistypecoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsSynthsTypCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgVrsn() != null) {
			effectevidencesynthesissynthesistypecoding.setVersion(e.getEfctEvdnceSynthsSynthsTypCdgVrsn());
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypTxt() != null) {
			effectevidencesynthesissynthesistype.setText(e.getEfctEvdnceSynthsSynthsTypTxt());
		}
		/******************** EfctEvdnceSynths_Ttl ********************************************************************************/
		if(e.getEfctEvdnceSynthsTtl() != null) {
			effectevidencesynthesis.setTitle(e.getEfctEvdnceSynthsTtl());
		}
		/******************** effectevidencesynthesistopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesistopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesis.addTopic(effectevidencesynthesistopic);

		/******************** effectevidencesynthesistopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesistopiccoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesistopic.addCoding(effectevidencesynthesistopiccoding);

		/******************** EfctEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgCd() != null) {
			effectevidencesynthesistopiccoding.setCode(e.getEfctEvdnceSynthsTopicCdgCd());
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgDsply() != null) {
			effectevidencesynthesistopiccoding.setDisplay(e.getEfctEvdnceSynthsTopicCdgDsply());
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgSys() != null) {
			effectevidencesynthesistopiccoding.setSystem(e.getEfctEvdnceSynthsTopicCdgSys());
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgUsrSltd() != null) {
			effectevidencesynthesistopiccoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsTopicCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgVrsn() != null) {
			effectevidencesynthesistopiccoding.setVersion(e.getEfctEvdnceSynthsTopicCdgVrsn());
		}
		/******************** EfctEvdnceSynths_Topic_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicTxt() != null) {
			effectevidencesynthesistopic.setText(e.getEfctEvdnceSynthsTopicTxt());
		}
		/******************** EfctEvdnceSynths_Url ********************************************************************************/
		if(e.getEfctEvdnceSynthsUrl() != null) {
			effectevidencesynthesis.setUrl(e.getEfctEvdnceSynthsUrl());
		}
		/******************** effectevidencesynthesisusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext effectevidencesynthesisusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		effectevidencesynthesis.addUseContext(effectevidencesynthesisusecontext);

		/******************** effectevidencesynthesisusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesisusecontext.setCode(effectevidencesynthesisusecontextcode);

		/******************** EfctEvdnceSynths_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdCd() != null) {
			effectevidencesynthesisusecontextcode.setCode(e.getEfctEvdnceSynthsUseCntxtCdCd());
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdDsply() != null) {
			effectevidencesynthesisusecontextcode.setDisplay(e.getEfctEvdnceSynthsUseCntxtCdDsply());
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdSys() != null) {
			effectevidencesynthesisusecontextcode.setSystem(e.getEfctEvdnceSynthsUseCntxtCdSys());
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdUsrSltd() != null) {
			effectevidencesynthesisusecontextcode.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsUseCntxtCdUsrSltd()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdVrsn() != null) {
			effectevidencesynthesisusecontextcode.setVersion(e.getEfctEvdnceSynthsUseCntxtCdVrsn());
		}
		/******************** effectevidencesynthesisusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		effectevidencesynthesisusecontext.setValue(effectevidencesynthesisusecontextvaluecodeableconcept);

		/******************** effectevidencesynthesisusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		effectevidencesynthesisusecontextvaluecodeableconcept.addCoding(effectevidencesynthesisusecontextvaluecodeableconceptcoding);

		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd() != null) {
			effectevidencesynthesisusecontextvaluecodeableconceptcoding.setCode(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply() != null) {
			effectevidencesynthesisusecontextvaluecodeableconceptcoding.setDisplay(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys() != null) {
			effectevidencesynthesisusecontextvaluecodeableconceptcoding.setSystem(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			effectevidencesynthesisusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn() != null) {
			effectevidencesynthesisusecontextvaluecodeableconceptcoding.setVersion(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt() != null) {
			effectevidencesynthesisusecontextvaluecodeableconcept.setText(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt());
		}
		/******************** effectevidencesynthesisusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		effectevidencesynthesisusecontext.setValue(effectevidencesynthesisusecontextvaluequantity);

		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyCd() != null) {
			effectevidencesynthesisusecontextvaluequantity.setCode(e.getEfctEvdnceSynthsUseCntxtVlQntyCd());
		}
		/******************** effectevidencesynthesisusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory effectevidencesynthesisusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		effectevidencesynthesisusecontextvaluequantity.setComparator(effectevidencesynthesisusecontextvaluequantitycomparator.fromCode(e.getEfctEvdnceSynthsUseCntxtVlQntyCmprtr()));

		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntySys() != null) {
			effectevidencesynthesisusecontextvaluequantity.setSystem(e.getEfctEvdnceSynthsUseCntxtVlQntySys());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyUnt() != null) {
			effectevidencesynthesisusecontextvaluequantity.setUnit(e.getEfctEvdnceSynthsUseCntxtVlQntyUnt());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyVl() != null) {
			effectevidencesynthesisusecontextvaluequantity.setValue(Double.parseDouble((e.getEfctEvdnceSynthsUseCntxtVlQntyVl())));
		}
		/******************** effectevidencesynthesisusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range effectevidencesynthesisusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		effectevidencesynthesisusecontext.setValue(effectevidencesynthesisusecontextvaluerange);

		/******************** effectevidencesynthesisusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		effectevidencesynthesisusecontextvaluerange.setHigh(effectevidencesynthesisusecontextvaluerangehigh);

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiCd() != null) {
			effectevidencesynthesisusecontextvaluerangehigh.setCode(e.getEfctEvdnceSynthsUseCntxtVlRngHiCd());
		}
		/******************** effectevidencesynthesisusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory effectevidencesynthesisusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		effectevidencesynthesisusecontextvaluerangehigh.setComparator(effectevidencesynthesisusecontextvaluerangehighcomparator.fromCode(e.getEfctEvdnceSynthsUseCntxtVlRngHiCmprtr()));

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiSys() != null) {
			effectevidencesynthesisusecontextvaluerangehigh.setSystem(e.getEfctEvdnceSynthsUseCntxtVlRngHiSys());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiUnt() != null) {
			effectevidencesynthesisusecontextvaluerangehigh.setUnit(e.getEfctEvdnceSynthsUseCntxtVlRngHiUnt());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiVl() != null) {
			effectevidencesynthesisusecontextvaluerangehigh.setValue(Double.parseDouble((e.getEfctEvdnceSynthsUseCntxtVlRngHiVl())));
		}
		/******************** effectevidencesynthesisusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		effectevidencesynthesisusecontextvaluerange.setLow(effectevidencesynthesisusecontextvaluerangelow);

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwCd() != null) {
			effectevidencesynthesisusecontextvaluerangelow.setCode(e.getEfctEvdnceSynthsUseCntxtVlRngLwCd());
		}
		/******************** effectevidencesynthesisusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory effectevidencesynthesisusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		effectevidencesynthesisusecontextvaluerangelow.setComparator(effectevidencesynthesisusecontextvaluerangelowcomparator.fromCode(e.getEfctEvdnceSynthsUseCntxtVlRngLwCmprtr()));

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwSys() != null) {
			effectevidencesynthesisusecontextvaluerangelow.setSystem(e.getEfctEvdnceSynthsUseCntxtVlRngLwSys());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwUnt() != null) {
			effectevidencesynthesisusecontextvaluerangelow.setUnit(e.getEfctEvdnceSynthsUseCntxtVlRngLwUnt());
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwVl() != null) {
			effectevidencesynthesisusecontextvaluerangelow.setValue(Double.parseDouble((e.getEfctEvdnceSynthsUseCntxtVlRngLwVl())));
		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRfrnc() != null) {
			effectevidencesynthesisusecontext.setValue( new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsUseCntxtVlRfrnc()));
		}
		/******************** EfctEvdnceSynths_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsVrsn() != null) {
			effectevidencesynthesis.setVersion(e.getEfctEvdnceSynthsVrsn());
		}
		return effectevidencesynthesis;
	}
}
