package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskEvidenceSynthesis;
public class RiskEvidenceSynthesisConversion 
{
	public org.hl7.fhir.r4.model.RiskEvidenceSynthesis RiskEvidenceSynthesiss(RiskEvidenceSynthesis r) throws ParseException
	{
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis riskevidencesynthesis = new org.hl7.fhir.r4.model.RiskEvidenceSynthesis();

		/******************** id ********************************************************************************/
		riskevidencesynthesis.setId(r.getId());

		/******************** RskEvdnceSynths_ApprovalDt ********************************************************************************/
		if(r.getRskEvdnceSynthsApprovalDt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_ApprovalDtdate = RskEvdnceSynths_ApprovalDtsdf.parse(r.getRskEvdnceSynthsApprovalDt());
			riskevidencesynthesis.setApprovalDate(RskEvdnceSynths_ApprovalDtdate);
		}
		/******************** riskevidencesynthesisauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesisauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		riskevidencesynthesis.addAuthor(riskevidencesynthesisauthor);

		/******************** RskEvdnceSynths_Athr_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrNm() != null) {
			riskevidencesynthesisauthor.setName(r.getRskEvdnceSynthsAthrNm());
		}
		/******************** riskevidencesynthesisauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesisauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		riskevidencesynthesisauthor.addTelecom(riskevidencesynthesisauthortelecom);

		/******************** riskevidencesynthesisauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesisauthortelecom.setPeriod(riskevidencesynthesisauthortelecomperiod);

		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Athr_Tlcm_Prd_Enddate = RskEvdnceSynths_Athr_Tlcm_Prd_Endsdf.parse(r.getRskEvdnceSynthsAthrTlcmPrdEnd());
			riskevidencesynthesisauthortelecomperiod.setEnd(RskEvdnceSynths_Athr_Tlcm_Prd_Enddate);
		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Athr_Tlcm_Prd_Strtdate = RskEvdnceSynths_Athr_Tlcm_Prd_Strtsdf.parse(r.getRskEvdnceSynthsAthrTlcmPrdStrt());
			riskevidencesynthesisauthortelecomperiod.setStart(RskEvdnceSynths_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmRnk() != null) {
			riskevidencesynthesisauthortelecom.setRank(Integer.parseInt(r.getRskEvdnceSynthsAthrTlcmRnk()));
		}
		/******************** riskevidencesynthesisauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory riskevidencesynthesisauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		riskevidencesynthesisauthortelecom.setSystem(riskevidencesynthesisauthortelecomsystem.fromCode(r.getRskEvdnceSynthsAthrTlcmSys()));

		/******************** riskevidencesynthesisauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory riskevidencesynthesisauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		riskevidencesynthesisauthortelecom.setUse(riskevidencesynthesisauthortelecomuse.fromCode(r.getRskEvdnceSynthsAthrTlcmUse()));

		/******************** RskEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmVl() != null) {
			riskevidencesynthesisauthortelecom.setValue(r.getRskEvdnceSynthsAthrTlcmVl());
		}
		/******************** riskevidencesynthesiscertainty ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent riskevidencesynthesiscertainty =  new org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent();
		riskevidencesynthesis.addCertainty(riskevidencesynthesiscertainty);

		/******************** riskevidencesynthesiscertaintycertaintysubcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent riskevidencesynthesiscertaintycertaintysubcomponent =  new org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent();
		riskevidencesynthesiscertainty.addCertaintySubcomponent(riskevidencesynthesiscertaintycertaintysubcomponent);

		/******************** riskevidencesynthesiscertaintycertaintysubcomponentnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskevidencesynthesiscertaintycertaintysubcomponentnote =  new org.hl7.fhir.r4.model.Annotation();
		riskevidencesynthesiscertaintycertaintysubcomponent.addNote(riskevidencesynthesiscertaintycertaintysubcomponentnote);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentnote.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentnote.setAuthor( new org.hl7.fhir.r4.model.StringType(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentnote.setText(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timedate = RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timesdf.parse(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime());
			riskevidencesynthesiscertaintycertaintysubcomponentnote.setTime(RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Timedate);
		}
		/******************** riskevidencesynthesiscertaintycertaintysubcomponentrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintycertaintysubcomponentrating =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesiscertaintycertaintysubcomponent.addRating(riskevidencesynthesiscertaintycertaintysubcomponentrating);

		/******************** riskevidencesynthesiscertaintycertaintysubcomponentratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesiscertaintycertaintysubcomponentratingcoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesiscertaintycertaintysubcomponentrating.addCoding(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.setCode(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.setDisplay(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.setSystem(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.setVersion(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponentrating.setText(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt());
		}
		/******************** riskevidencesynthesiscertaintycertaintysubcomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintycertaintysubcomponenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesiscertaintycertaintysubcomponent.setType(riskevidencesynthesiscertaintycertaintysubcomponenttype);

		/******************** riskevidencesynthesiscertaintycertaintysubcomponenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesiscertaintycertaintysubcomponenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesiscertaintycertaintysubcomponenttype.addCoding(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.setCode(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.setDisplay(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.setSystem(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.setVersion(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn());
		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt() != null) {
			riskevidencesynthesiscertaintycertaintysubcomponenttype.setText(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt());
		}
		/******************** riskevidencesynthesiscertaintynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskevidencesynthesiscertaintynote =  new org.hl7.fhir.r4.model.Annotation();
		riskevidencesynthesiscertainty.addNote(riskevidencesynthesiscertaintynote);

		/******************** RskEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtAthrRfrnc() != null) {
			riskevidencesynthesiscertaintynote.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsCrtntyNtAthrRfrnc()));
		}
		/******************** RskEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtAthrStrgTyp() != null) {
			riskevidencesynthesiscertaintynote.setAuthor( new org.hl7.fhir.r4.model.StringType(r.getRskEvdnceSynthsCrtntyNtAthrStrgTyp()));
		}
		/******************** RskEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtTxt() != null) {
			riskevidencesynthesiscertaintynote.setText(r.getRskEvdnceSynthsCrtntyNtTxt());
		}
		/******************** RskEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtTime() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Crtnty_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Crtnty_Nt_Timedate = RskEvdnceSynths_Crtnty_Nt_Timesdf.parse(r.getRskEvdnceSynthsCrtntyNtTime());
			riskevidencesynthesiscertaintynote.setTime(RskEvdnceSynths_Crtnty_Nt_Timedate);
		}
		/******************** riskevidencesynthesiscertaintyrating ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintyrating =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesiscertainty.addRating(riskevidencesynthesiscertaintyrating);

		/******************** riskevidencesynthesiscertaintyratingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesiscertaintyratingcoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesiscertaintyrating.addCoding(riskevidencesynthesiscertaintyratingcoding);

		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgCd() != null) {
			riskevidencesynthesiscertaintyratingcoding.setCode(r.getRskEvdnceSynthsCrtntyRatingCdgCd());
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgDsply() != null) {
			riskevidencesynthesiscertaintyratingcoding.setDisplay(r.getRskEvdnceSynthsCrtntyRatingCdgDsply());
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgSys() != null) {
			riskevidencesynthesiscertaintyratingcoding.setSystem(r.getRskEvdnceSynthsCrtntyRatingCdgSys());
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgUsrSltd() != null) {
			riskevidencesynthesiscertaintyratingcoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsCrtntyRatingCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgVrsn() != null) {
			riskevidencesynthesiscertaintyratingcoding.setVersion(r.getRskEvdnceSynthsCrtntyRatingCdgVrsn());
		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingTxt() != null) {
			riskevidencesynthesiscertaintyrating.setText(r.getRskEvdnceSynthsCrtntyRatingTxt());
		}
		/******************** riskevidencesynthesiscontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesiscontact =  new org.hl7.fhir.r4.model.ContactDetail();
		riskevidencesynthesis.addContact(riskevidencesynthesiscontact);

		/******************** RskEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctNm() != null) {
			riskevidencesynthesiscontact.setName(r.getRskEvdnceSynthsCntctNm());
		}
		/******************** riskevidencesynthesiscontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesiscontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		riskevidencesynthesiscontact.addTelecom(riskevidencesynthesiscontacttelecom);

		/******************** riskevidencesynthesiscontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiscontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesiscontacttelecom.setPeriod(riskevidencesynthesiscontacttelecomperiod);

		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Cntct_Tlcm_Prd_Enddate = RskEvdnceSynths_Cntct_Tlcm_Prd_Endsdf.parse(r.getRskEvdnceSynthsCntctTlcmPrdEnd());
			riskevidencesynthesiscontacttelecomperiod.setEnd(RskEvdnceSynths_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Cntct_Tlcm_Prd_Strtdate = RskEvdnceSynths_Cntct_Tlcm_Prd_Strtsdf.parse(r.getRskEvdnceSynthsCntctTlcmPrdStrt());
			riskevidencesynthesiscontacttelecomperiod.setStart(RskEvdnceSynths_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmRnk() != null) {
			riskevidencesynthesiscontacttelecom.setRank(Integer.parseInt(r.getRskEvdnceSynthsCntctTlcmRnk()));
		}
		/******************** riskevidencesynthesiscontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory riskevidencesynthesiscontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		riskevidencesynthesiscontacttelecom.setSystem(riskevidencesynthesiscontacttelecomsystem.fromCode(r.getRskEvdnceSynthsCntctTlcmSys()));

		/******************** riskevidencesynthesiscontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory riskevidencesynthesiscontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		riskevidencesynthesiscontacttelecom.setUse(riskevidencesynthesiscontacttelecomuse.fromCode(r.getRskEvdnceSynthsCntctTlcmUse()));

		/******************** RskEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmVl() != null) {
			riskevidencesynthesiscontacttelecom.setValue(r.getRskEvdnceSynthsCntctTlcmVl());
		}
		/******************** RskEvdnceSynths_Copyright ********************************************************************************/
		if(r.getRskEvdnceSynthsCopyright() != null) {
			riskevidencesynthesis.setCopyright(r.getRskEvdnceSynthsCopyright());
		}
		/******************** RskEvdnceSynths_Dt ********************************************************************************/
		if(r.getRskEvdnceSynthsDt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Dtdate = RskEvdnceSynths_Dtsdf.parse(r.getRskEvdnceSynthsDt());
			riskevidencesynthesis.setDate(RskEvdnceSynths_Dtdate);
		}
		/******************** RskEvdnceSynths_Dscrptn ********************************************************************************/
		if(r.getRskEvdnceSynthsDscrptn() != null) {
			riskevidencesynthesis.setDescription(r.getRskEvdnceSynthsDscrptn());
		}
		/******************** riskevidencesynthesiseditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesiseditor =  new org.hl7.fhir.r4.model.ContactDetail();
		riskevidencesynthesis.addEditor(riskevidencesynthesiseditor);

		/******************** RskEvdnceSynths_Editor_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorNm() != null) {
			riskevidencesynthesiseditor.setName(r.getRskEvdnceSynthsEditorNm());
		}
		/******************** riskevidencesynthesiseditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesiseditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		riskevidencesynthesiseditor.addTelecom(riskevidencesynthesiseditortelecom);

		/******************** riskevidencesynthesiseditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiseditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesiseditortelecom.setPeriod(riskevidencesynthesiseditortelecomperiod);

		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Editor_Tlcm_Prd_Enddate = RskEvdnceSynths_Editor_Tlcm_Prd_Endsdf.parse(r.getRskEvdnceSynthsEditorTlcmPrdEnd());
			riskevidencesynthesiseditortelecomperiod.setEnd(RskEvdnceSynths_Editor_Tlcm_Prd_Enddate);
		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Editor_Tlcm_Prd_Strtdate = RskEvdnceSynths_Editor_Tlcm_Prd_Strtsdf.parse(r.getRskEvdnceSynthsEditorTlcmPrdStrt());
			riskevidencesynthesiseditortelecomperiod.setStart(RskEvdnceSynths_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmRnk() != null) {
			riskevidencesynthesiseditortelecom.setRank(Integer.parseInt(r.getRskEvdnceSynthsEditorTlcmRnk()));
		}
		/******************** riskevidencesynthesiseditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory riskevidencesynthesiseditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		riskevidencesynthesiseditortelecom.setSystem(riskevidencesynthesiseditortelecomsystem.fromCode(r.getRskEvdnceSynthsEditorTlcmSys()));

		/******************** riskevidencesynthesiseditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory riskevidencesynthesiseditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		riskevidencesynthesiseditortelecom.setUse(riskevidencesynthesiseditortelecomuse.fromCode(r.getRskEvdnceSynthsEditorTlcmUse()));

		/******************** RskEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmVl() != null) {
			riskevidencesynthesiseditortelecom.setValue(r.getRskEvdnceSynthsEditorTlcmVl());
		}
		/******************** riskevidencesynthesiseffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiseffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesis.setEffectivePeriod(riskevidencesynthesiseffectiveperiod);

		/******************** RskEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_EfctivePrd_Enddate = RskEvdnceSynths_EfctivePrd_Endsdf.parse(r.getRskEvdnceSynthsEfctivePrdEnd());
			riskevidencesynthesiseffectiveperiod.setEnd(RskEvdnceSynths_EfctivePrd_Enddate);
		}
		/******************** RskEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_EfctivePrd_Strtdate = RskEvdnceSynths_EfctivePrd_Strtsdf.parse(r.getRskEvdnceSynthsEfctivePrdStrt());
			riskevidencesynthesiseffectiveperiod.setStart(RskEvdnceSynths_EfctivePrd_Strtdate);
		}
		/******************** riskevidencesynthesisendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesisendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		riskevidencesynthesis.addEndorser(riskevidencesynthesisendorser);

		/******************** RskEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrNm() != null) {
			riskevidencesynthesisendorser.setName(r.getRskEvdnceSynthsEndsrNm());
		}
		/******************** riskevidencesynthesisendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesisendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		riskevidencesynthesisendorser.addTelecom(riskevidencesynthesisendorsertelecom);

		/******************** riskevidencesynthesisendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesisendorsertelecom.setPeriod(riskevidencesynthesisendorsertelecomperiod);

		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Endsr_Tlcm_Prd_Enddate = RskEvdnceSynths_Endsr_Tlcm_Prd_Endsdf.parse(r.getRskEvdnceSynthsEndsrTlcmPrdEnd());
			riskevidencesynthesisendorsertelecomperiod.setEnd(RskEvdnceSynths_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Endsr_Tlcm_Prd_Strtdate = RskEvdnceSynths_Endsr_Tlcm_Prd_Strtsdf.parse(r.getRskEvdnceSynthsEndsrTlcmPrdStrt());
			riskevidencesynthesisendorsertelecomperiod.setStart(RskEvdnceSynths_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmRnk() != null) {
			riskevidencesynthesisendorsertelecom.setRank(Integer.parseInt(r.getRskEvdnceSynthsEndsrTlcmRnk()));
		}
		/******************** riskevidencesynthesisendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory riskevidencesynthesisendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		riskevidencesynthesisendorsertelecom.setSystem(riskevidencesynthesisendorsertelecomsystem.fromCode(r.getRskEvdnceSynthsEndsrTlcmSys()));

		/******************** riskevidencesynthesisendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory riskevidencesynthesisendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		riskevidencesynthesisendorsertelecom.setUse(riskevidencesynthesisendorsertelecomuse.fromCode(r.getRskEvdnceSynthsEndsrTlcmUse()));

		/******************** RskEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmVl() != null) {
			riskevidencesynthesisendorsertelecom.setValue(r.getRskEvdnceSynthsEndsrTlcmVl());
		}
		/******************** RskEvdnceSynths_Exposure ********************************************************************************/
		if(r.getRskEvdnceSynthsExposure() != null) {
			riskevidencesynthesis.setExposure( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsExposure()));
		}
		/******************** riskevidencesynthesisidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier riskevidencesynthesisidentifier =  new org.hl7.fhir.r4.model.Identifier();
		riskevidencesynthesis.addIdentifier(riskevidencesynthesisidentifier);

		/******************** RskEvdnceSynths_Id_Assigner ********************************************************************************/
		if(r.getRskEvdnceSynthsIdAssigner() != null) {
			riskevidencesynthesisidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsIdAssigner()));
		}
		/******************** riskevidencesynthesisidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesisidentifier.setPeriod(riskevidencesynthesisidentifierperiod);

		/******************** RskEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsIdPrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Id_Prd_Enddate = RskEvdnceSynths_Id_Prd_Endsdf.parse(r.getRskEvdnceSynthsIdPrdEnd());
			riskevidencesynthesisidentifierperiod.setEnd(RskEvdnceSynths_Id_Prd_Enddate);
		}
		/******************** RskEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsIdPrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Id_Prd_Strtdate = RskEvdnceSynths_Id_Prd_Strtsdf.parse(r.getRskEvdnceSynthsIdPrdStrt());
			riskevidencesynthesisidentifierperiod.setStart(RskEvdnceSynths_Id_Prd_Strtdate);
		}
		/******************** RskEvdnceSynths_Id_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsIdSys() != null) {
			riskevidencesynthesisidentifier.setSystem(r.getRskEvdnceSynthsIdSys());
		}
		/******************** riskevidencesynthesisidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesisidentifier.setType(riskevidencesynthesisidentifiertype);

		/******************** riskevidencesynthesisidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisidentifiertype.addCoding(riskevidencesynthesisidentifiertypecoding);

		/******************** RskEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgCd() != null) {
			riskevidencesynthesisidentifiertypecoding.setCode(r.getRskEvdnceSynthsIdTypCdgCd());
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgDsply() != null) {
			riskevidencesynthesisidentifiertypecoding.setDisplay(r.getRskEvdnceSynthsIdTypCdgDsply());
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgSys() != null) {
			riskevidencesynthesisidentifiertypecoding.setSystem(r.getRskEvdnceSynthsIdTypCdgSys());
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgUsrSltd() != null) {
			riskevidencesynthesisidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsIdTypCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgVrsn() != null) {
			riskevidencesynthesisidentifiertypecoding.setVersion(r.getRskEvdnceSynthsIdTypCdgVrsn());
		}
		/******************** RskEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypTxt() != null) {
			riskevidencesynthesisidentifiertype.setText(r.getRskEvdnceSynthsIdTypTxt());
		}
		/******************** riskevidencesynthesisidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory riskevidencesynthesisidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		riskevidencesynthesisidentifier.setUse(riskevidencesynthesisidentifieruse.fromCode(r.getRskEvdnceSynthsIdUse()));

		/******************** RskEvdnceSynths_Id_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsIdVl() != null) {
			riskevidencesynthesisidentifier.setValue(r.getRskEvdnceSynthsIdVl());
		}
		/******************** riskevidencesynthesisjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesis.addJurisdiction(riskevidencesynthesisjurisdiction);

		/******************** riskevidencesynthesisjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisjurisdiction.addCoding(riskevidencesynthesisjurisdictioncoding);

		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgCd() != null) {
			riskevidencesynthesisjurisdictioncoding.setCode(r.getRskEvdnceSynthsJrsdctnCdgCd());
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgDsply() != null) {
			riskevidencesynthesisjurisdictioncoding.setDisplay(r.getRskEvdnceSynthsJrsdctnCdgDsply());
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgSys() != null) {
			riskevidencesynthesisjurisdictioncoding.setSystem(r.getRskEvdnceSynthsJrsdctnCdgSys());
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgUsrSltd() != null) {
			riskevidencesynthesisjurisdictioncoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsJrsdctnCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgVrsn() != null) {
			riskevidencesynthesisjurisdictioncoding.setVersion(r.getRskEvdnceSynthsJrsdctnCdgVrsn());
		}
		/******************** RskEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnTxt() != null) {
			riskevidencesynthesisjurisdiction.setText(r.getRskEvdnceSynthsJrsdctnTxt());
		}
		/******************** RskEvdnceSynths_LastReviewDt ********************************************************************************/
		if(r.getRskEvdnceSynthsLastReviewDt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_LastReviewDtdate = RskEvdnceSynths_LastReviewDtsdf.parse(r.getRskEvdnceSynthsLastReviewDt());
			riskevidencesynthesis.setLastReviewDate(RskEvdnceSynths_LastReviewDtdate);
		}
		/******************** RskEvdnceSynths_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsNm() != null) {
			riskevidencesynthesis.setName(r.getRskEvdnceSynthsNm());
		}
		/******************** riskevidencesynthesisnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskevidencesynthesisnote =  new org.hl7.fhir.r4.model.Annotation();
		riskevidencesynthesis.addNote(riskevidencesynthesisnote);

		/******************** RskEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsNtAthrRfrnc() != null) {
			riskevidencesynthesisnote.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsNtAthrRfrnc()));
		}
		/******************** RskEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsNtAthrStrgTyp() != null) {
			riskevidencesynthesisnote.setAuthor( new org.hl7.fhir.r4.model.StringType(r.getRskEvdnceSynthsNtAthrStrgTyp()));
		}
		/******************** RskEvdnceSynths_Nt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsNtTxt() != null) {
			riskevidencesynthesisnote.setText(r.getRskEvdnceSynthsNtTxt());
		}
		/******************** RskEvdnceSynths_Nt_Time ********************************************************************************/
		if(r.getRskEvdnceSynthsNtTime() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Nt_Timedate = RskEvdnceSynths_Nt_Timesdf.parse(r.getRskEvdnceSynthsNtTime());
			riskevidencesynthesisnote.setTime(RskEvdnceSynths_Nt_Timedate);
		}
		/******************** RskEvdnceSynths_Outcome ********************************************************************************/
		if(r.getRskEvdnceSynthsOutcome() != null) {
			riskevidencesynthesis.setOutcome( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsOutcome()));
		}
		/******************** RskEvdnceSynths_Popln ********************************************************************************/
		if(r.getRskEvdnceSynthsPopln() != null) {
			riskevidencesynthesis.setPopulation( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsPopln()));
		}
		/******************** RskEvdnceSynths_Pblshr ********************************************************************************/
		if(r.getRskEvdnceSynthsPblshr() != null) {
			riskevidencesynthesis.setPublisher(r.getRskEvdnceSynthsPblshr());
		}
		/******************** riskevidencesynthesisrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact riskevidencesynthesisrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		riskevidencesynthesis.addRelatedArtifact(riskevidencesynthesisrelatedartifact);

		/******************** RskEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctCitation() != null) {
			riskevidencesynthesisrelatedartifact.setCitation(r.getRskEvdnceSynthsRltedArtfctCitation());
		}
		/******************** RskEvdnceSynths_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDsply() != null) {
			riskevidencesynthesisrelatedartifact.setDisplay(r.getRskEvdnceSynthsRltedArtfctDsply());
		}
		/******************** riskevidencesynthesisrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment riskevidencesynthesisrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		riskevidencesynthesisrelatedartifact.setDocument(riskevidencesynthesisrelatedartifactdocument);

		/******************** RskEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocCntntTyp() != null) {
			riskevidencesynthesisrelatedartifactdocument.setContentType(r.getRskEvdnceSynthsRltedArtfctDocCntntTyp());
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_RltedArtfct_Doc_Creationdate = RskEvdnceSynths_RltedArtfct_Doc_Creationsdf.parse(r.getRskEvdnceSynthsRltedArtfctDocCreation());
			riskevidencesynthesisrelatedartifactdocument.setCreation(RskEvdnceSynths_RltedArtfct_Doc_Creationdate);
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocData() != null) {
			riskevidencesynthesisrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRskEvdnceSynthsRltedArtfctDocData()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocHash() != null) {
			riskevidencesynthesisrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRskEvdnceSynthsRltedArtfctDocHash()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocLnguage() != null) {
			riskevidencesynthesisrelatedartifactdocument.setLanguage(r.getRskEvdnceSynthsRltedArtfctDocLnguage());
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocSz() != null) {
			riskevidencesynthesisrelatedartifactdocument.setSize(Integer.parseInt(r.getRskEvdnceSynthsRltedArtfctDocSz()));
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocTtl() != null) {
			riskevidencesynthesisrelatedartifactdocument.setTitle(r.getRskEvdnceSynthsRltedArtfctDocTtl());
		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocUrl() != null) {
			riskevidencesynthesisrelatedartifactdocument.setUrl(r.getRskEvdnceSynthsRltedArtfctDocUrl());
		}
		/******************** RskEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctLbl() != null) {
			riskevidencesynthesisrelatedartifact.setLabel(r.getRskEvdnceSynthsRltedArtfctLbl());
		}
		/******************** RskEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctRsrc() != null) {
			riskevidencesynthesisrelatedartifact.setResource(r.getRskEvdnceSynthsRltedArtfctRsrc());
		}
		/******************** riskevidencesynthesisrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory riskevidencesynthesisrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		riskevidencesynthesisrelatedartifact.setType(riskevidencesynthesisrelatedartifacttype.fromCode(r.getRskEvdnceSynthsRltedArtfctTyp()));

		/******************** RskEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctUrl() != null) {
			riskevidencesynthesisrelatedartifact.setUrl(r.getRskEvdnceSynthsRltedArtfctUrl());
		}
		/******************** riskevidencesynthesisreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail riskevidencesynthesisreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		riskevidencesynthesis.addReviewer(riskevidencesynthesisreviewer);

		/******************** RskEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrNm() != null) {
			riskevidencesynthesisreviewer.setName(r.getRskEvdnceSynthsRviewrNm());
		}
		/******************** riskevidencesynthesisreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint riskevidencesynthesisreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		riskevidencesynthesisreviewer.addTelecom(riskevidencesynthesisreviewertelecom);

		/******************** riskevidencesynthesisreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		riskevidencesynthesisreviewertelecom.setPeriod(riskevidencesynthesisreviewertelecomperiod);

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Rviewr_Tlcm_Prd_Enddate = RskEvdnceSynths_Rviewr_Tlcm_Prd_Endsdf.parse(r.getRskEvdnceSynthsRviewrTlcmPrdEnd());
			riskevidencesynthesisreviewertelecomperiod.setEnd(RskEvdnceSynths_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RskEvdnceSynths_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskEvdnceSynths_Rviewr_Tlcm_Prd_Strtdate = RskEvdnceSynths_Rviewr_Tlcm_Prd_Strtsdf.parse(r.getRskEvdnceSynthsRviewrTlcmPrdStrt());
			riskevidencesynthesisreviewertelecomperiod.setStart(RskEvdnceSynths_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmRnk() != null) {
			riskevidencesynthesisreviewertelecom.setRank(Integer.parseInt(r.getRskEvdnceSynthsRviewrTlcmRnk()));
		}
		/******************** riskevidencesynthesisreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory riskevidencesynthesisreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		riskevidencesynthesisreviewertelecom.setSystem(riskevidencesynthesisreviewertelecomsystem.fromCode(r.getRskEvdnceSynthsRviewrTlcmSys()));

		/******************** riskevidencesynthesisreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory riskevidencesynthesisreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		riskevidencesynthesisreviewertelecom.setUse(riskevidencesynthesisreviewertelecomuse.fromCode(r.getRskEvdnceSynthsRviewrTlcmUse()));

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmVl() != null) {
			riskevidencesynthesisreviewertelecom.setValue(r.getRskEvdnceSynthsRviewrTlcmVl());
		}
		/******************** riskevidencesynthesisriskestimate ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent riskevidencesynthesisriskestimate =  new org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent();
		riskevidencesynthesis.setRiskEstimate(riskevidencesynthesisriskestimate);

		/******************** RskEvdnceSynths_RskEstmt_DnmntrCnt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtDnmntrCnt() != null) {
			riskevidencesynthesisriskestimate.setDenominatorCount(Integer.parseInt(r.getRskEvdnceSynthsRskEstmtDnmntrCnt()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Dscrptn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtDscrptn() != null) {
			riskevidencesynthesisriskestimate.setDescription(r.getRskEvdnceSynthsRskEstmtDscrptn());
		}
		/******************** RskEvdnceSynths_RskEstmt_NmrtrCnt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtNmrtrCnt() != null) {
			riskevidencesynthesisriskestimate.setNumeratorCount(Integer.parseInt(r.getRskEvdnceSynthsRskEstmtNmrtrCnt()));
		}
		/******************** riskevidencesynthesisriskestimateprecisionestimate ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent riskevidencesynthesisriskestimateprecisionestimate =  new org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent();
		riskevidencesynthesisriskestimate.addPrecisionEstimate(riskevidencesynthesisriskestimateprecisionestimate);

		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_From ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtFrom() != null) {
			riskevidencesynthesisriskestimateprecisionestimate.setFrom(Double.parseDouble((r.getRskEvdnceSynthsRskEstmtPrecisionEstmtFrom())));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtLevel() != null) {
			riskevidencesynthesisriskestimateprecisionestimate.setLevel(Double.parseDouble((r.getRskEvdnceSynthsRskEstmtPrecisionEstmtLevel())));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_To ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTo() != null) {
			riskevidencesynthesisriskestimateprecisionestimate.setTo(Double.parseDouble((r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTo())));
		}
		/******************** riskevidencesynthesisriskestimateprecisionestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimateprecisionestimatetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesisriskestimateprecisionestimate.setType(riskevidencesynthesisriskestimateprecisionestimatetype);

		/******************** riskevidencesynthesisriskestimateprecisionestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisriskestimateprecisionestimatetypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisriskestimateprecisionestimatetype.addCoding(riskevidencesynthesisriskestimateprecisionestimatetypecoding);

		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd() != null) {
			riskevidencesynthesisriskestimateprecisionestimatetypecoding.setCode(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd());
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply() != null) {
			riskevidencesynthesisriskestimateprecisionestimatetypecoding.setDisplay(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply());
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys() != null) {
			riskevidencesynthesisriskestimateprecisionestimatetypecoding.setSystem(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys());
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd() != null) {
			riskevidencesynthesisriskestimateprecisionestimatetypecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn() != null) {
			riskevidencesynthesisriskestimateprecisionestimatetypecoding.setVersion(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn());
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt() != null) {
			riskevidencesynthesisriskestimateprecisionestimatetype.setText(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt());
		}
		/******************** riskevidencesynthesisriskestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimatetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesisriskestimate.setType(riskevidencesynthesisriskestimatetype);

		/******************** riskevidencesynthesisriskestimatetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisriskestimatetypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisriskestimatetype.addCoding(riskevidencesynthesisriskestimatetypecoding);

		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgCd() != null) {
			riskevidencesynthesisriskestimatetypecoding.setCode(r.getRskEvdnceSynthsRskEstmtTypCdgCd());
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgDsply() != null) {
			riskevidencesynthesisriskestimatetypecoding.setDisplay(r.getRskEvdnceSynthsRskEstmtTypCdgDsply());
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgSys() != null) {
			riskevidencesynthesisriskestimatetypecoding.setSystem(r.getRskEvdnceSynthsRskEstmtTypCdgSys());
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgUsrSltd() != null) {
			riskevidencesynthesisriskestimatetypecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsRskEstmtTypCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgVrsn() != null) {
			riskevidencesynthesisriskestimatetypecoding.setVersion(r.getRskEvdnceSynthsRskEstmtTypCdgVrsn());
		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypTxt() != null) {
			riskevidencesynthesisriskestimatetype.setText(r.getRskEvdnceSynthsRskEstmtTypTxt());
		}
		/******************** riskevidencesynthesisriskestimateunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimateunitofmeasure =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesisriskestimate.setUnitOfMeasure(riskevidencesynthesisriskestimateunitofmeasure);

		/******************** riskevidencesynthesisriskestimateunitofmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisriskestimateunitofmeasurecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisriskestimateunitofmeasure.addCoding(riskevidencesynthesisriskestimateunitofmeasurecoding);

		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgCd() != null) {
			riskevidencesynthesisriskestimateunitofmeasurecoding.setCode(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgCd());
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply() != null) {
			riskevidencesynthesisriskestimateunitofmeasurecoding.setDisplay(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply());
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgSys() != null) {
			riskevidencesynthesisriskestimateunitofmeasurecoding.setSystem(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgSys());
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd() != null) {
			riskevidencesynthesisriskestimateunitofmeasurecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn() != null) {
			riskevidencesynthesisriskestimateunitofmeasurecoding.setVersion(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn());
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrTxt() != null) {
			riskevidencesynthesisriskestimateunitofmeasure.setText(r.getRskEvdnceSynthsRskEstmtUntOfMsrTxt());
		}
		/******************** RskEvdnceSynths_RskEstmt_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtVl() != null) {
			riskevidencesynthesisriskestimate.setValue(Double.parseDouble((r.getRskEvdnceSynthsRskEstmtVl())));
		}
		/******************** riskevidencesynthesissamplesize ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent riskevidencesynthesissamplesize =  new org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent();
		riskevidencesynthesis.setSampleSize(riskevidencesynthesissamplesize);

		/******************** RskEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(r.getRskEvdnceSynthsSampleSzDscrptn() != null) {
			riskevidencesynthesissamplesize.setDescription(r.getRskEvdnceSynthsSampleSzDscrptn());
		}
		/******************** RskEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(r.getRskEvdnceSynthsSampleSzNmbrOfPrtcpnts() != null) {
			riskevidencesynthesissamplesize.setNumberOfParticipants(Integer.parseInt(r.getRskEvdnceSynthsSampleSzNmbrOfPrtcpnts()));
		}
		/******************** RskEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(r.getRskEvdnceSynthsSampleSzNmbrOfStudies() != null) {
			riskevidencesynthesissamplesize.setNumberOfStudies(Integer.parseInt(r.getRskEvdnceSynthsSampleSzNmbrOfStudies()));
		}
		/******************** riskevidencesynthesisstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory riskevidencesynthesisstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		riskevidencesynthesis.setStatus(riskevidencesynthesisstatus.fromCode(r.getRskEvdnceSynthsSts()));

		/******************** riskevidencesynthesisstudytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisstudytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesis.setStudyType(riskevidencesynthesisstudytype);

		/******************** riskevidencesynthesisstudytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisstudytypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisstudytype.addCoding(riskevidencesynthesisstudytypecoding);

		/******************** RskEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgCd() != null) {
			riskevidencesynthesisstudytypecoding.setCode(r.getRskEvdnceSynthsStdyTypCdgCd());
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgDsply() != null) {
			riskevidencesynthesisstudytypecoding.setDisplay(r.getRskEvdnceSynthsStdyTypCdgDsply());
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgSys() != null) {
			riskevidencesynthesisstudytypecoding.setSystem(r.getRskEvdnceSynthsStdyTypCdgSys());
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgUsrSltd() != null) {
			riskevidencesynthesisstudytypecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsStdyTypCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgVrsn() != null) {
			riskevidencesynthesisstudytypecoding.setVersion(r.getRskEvdnceSynthsStdyTypCdgVrsn());
		}
		/******************** RskEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypTxt() != null) {
			riskevidencesynthesisstudytype.setText(r.getRskEvdnceSynthsStdyTypTxt());
		}
		/******************** riskevidencesynthesissynthesistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesissynthesistype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesis.setSynthesisType(riskevidencesynthesissynthesistype);

		/******************** riskevidencesynthesissynthesistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesissynthesistypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesissynthesistype.addCoding(riskevidencesynthesissynthesistypecoding);

		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgCd() != null) {
			riskevidencesynthesissynthesistypecoding.setCode(r.getRskEvdnceSynthsSynthsTypCdgCd());
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgDsply() != null) {
			riskevidencesynthesissynthesistypecoding.setDisplay(r.getRskEvdnceSynthsSynthsTypCdgDsply());
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgSys() != null) {
			riskevidencesynthesissynthesistypecoding.setSystem(r.getRskEvdnceSynthsSynthsTypCdgSys());
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgUsrSltd() != null) {
			riskevidencesynthesissynthesistypecoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsSynthsTypCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgVrsn() != null) {
			riskevidencesynthesissynthesistypecoding.setVersion(r.getRskEvdnceSynthsSynthsTypCdgVrsn());
		}
		/******************** RskEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypTxt() != null) {
			riskevidencesynthesissynthesistype.setText(r.getRskEvdnceSynthsSynthsTypTxt());
		}
		/******************** RskEvdnceSynths_Ttl ********************************************************************************/
		if(r.getRskEvdnceSynthsTtl() != null) {
			riskevidencesynthesis.setTitle(r.getRskEvdnceSynthsTtl());
		}
		/******************** riskevidencesynthesistopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesistopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesis.addTopic(riskevidencesynthesistopic);

		/******************** riskevidencesynthesistopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesistopiccoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesistopic.addCoding(riskevidencesynthesistopiccoding);

		/******************** RskEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgCd() != null) {
			riskevidencesynthesistopiccoding.setCode(r.getRskEvdnceSynthsTopicCdgCd());
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgDsply() != null) {
			riskevidencesynthesistopiccoding.setDisplay(r.getRskEvdnceSynthsTopicCdgDsply());
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgSys() != null) {
			riskevidencesynthesistopiccoding.setSystem(r.getRskEvdnceSynthsTopicCdgSys());
		}
		/******************** RskEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgUsrSltd() != null) {
			riskevidencesynthesistopiccoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsTopicCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgVrsn() != null) {
			riskevidencesynthesistopiccoding.setVersion(r.getRskEvdnceSynthsTopicCdgVrsn());
		}
		/******************** RskEvdnceSynths_Topic_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicTxt() != null) {
			riskevidencesynthesistopic.setText(r.getRskEvdnceSynthsTopicTxt());
		}
		/******************** RskEvdnceSynths_Url ********************************************************************************/
		if(r.getRskEvdnceSynthsUrl() != null) {
			riskevidencesynthesis.setUrl(r.getRskEvdnceSynthsUrl());
		}
		/******************** riskevidencesynthesisusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext riskevidencesynthesisusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		riskevidencesynthesis.addUseContext(riskevidencesynthesisusecontext);

		/******************** riskevidencesynthesisusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisusecontext.setCode(riskevidencesynthesisusecontextcode);

		/******************** RskEvdnceSynths_UseCntxt_Cd_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdCd() != null) {
			riskevidencesynthesisusecontextcode.setCode(r.getRskEvdnceSynthsUseCntxtCdCd());
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdDsply() != null) {
			riskevidencesynthesisusecontextcode.setDisplay(r.getRskEvdnceSynthsUseCntxtCdDsply());
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdSys() != null) {
			riskevidencesynthesisusecontextcode.setSystem(r.getRskEvdnceSynthsUseCntxtCdSys());
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdUsrSltd() != null) {
			riskevidencesynthesisusecontextcode.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsUseCntxtCdUsrSltd()));
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdVrsn() != null) {
			riskevidencesynthesisusecontextcode.setVersion(r.getRskEvdnceSynthsUseCntxtCdVrsn());
		}
		/******************** riskevidencesynthesisusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskevidencesynthesisusecontext.setValue(riskevidencesynthesisusecontextvaluecodeableconcept);

		/******************** riskevidencesynthesisusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		riskevidencesynthesisusecontextvaluecodeableconcept.addCoding(riskevidencesynthesisusecontextvaluecodeableconceptcoding);

		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd() != null) {
			riskevidencesynthesisusecontextvaluecodeableconceptcoding.setCode(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply() != null) {
			riskevidencesynthesisusecontextvaluecodeableconceptcoding.setDisplay(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys() != null) {
			riskevidencesynthesisusecontextvaluecodeableconceptcoding.setSystem(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			riskevidencesynthesisusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn() != null) {
			riskevidencesynthesisusecontextvaluecodeableconceptcoding.setVersion(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptTxt() != null) {
			riskevidencesynthesisusecontextvaluecodeableconcept.setText(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptTxt());
		}
		/******************** riskevidencesynthesisusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		riskevidencesynthesisusecontext.setValue(riskevidencesynthesisusecontextvaluequantity);

		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyCd() != null) {
			riskevidencesynthesisusecontextvaluequantity.setCode(r.getRskEvdnceSynthsUseCntxtVlQntyCd());
		}
		/******************** riskevidencesynthesisusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskevidencesynthesisusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskevidencesynthesisusecontextvaluequantity.setComparator(riskevidencesynthesisusecontextvaluequantitycomparator.fromCode(r.getRskEvdnceSynthsUseCntxtVlQntyCmprtr()));

		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntySys() != null) {
			riskevidencesynthesisusecontextvaluequantity.setSystem(r.getRskEvdnceSynthsUseCntxtVlQntySys());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyUnt() != null) {
			riskevidencesynthesisusecontextvaluequantity.setUnit(r.getRskEvdnceSynthsUseCntxtVlQntyUnt());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyVl() != null) {
			riskevidencesynthesisusecontextvaluequantity.setValue(Double.parseDouble((r.getRskEvdnceSynthsUseCntxtVlQntyVl())));
		}
		/******************** riskevidencesynthesisusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskevidencesynthesisusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		riskevidencesynthesisusecontext.setValue(riskevidencesynthesisusecontextvaluerange);

		/******************** riskevidencesynthesisusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		riskevidencesynthesisusecontextvaluerange.setHigh(riskevidencesynthesisusecontextvaluerangehigh);

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiCd() != null) {
			riskevidencesynthesisusecontextvaluerangehigh.setCode(r.getRskEvdnceSynthsUseCntxtVlRngHiCd());
		}
		/******************** riskevidencesynthesisusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskevidencesynthesisusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskevidencesynthesisusecontextvaluerangehigh.setComparator(riskevidencesynthesisusecontextvaluerangehighcomparator.fromCode(r.getRskEvdnceSynthsUseCntxtVlRngHiCmprtr()));

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiSys() != null) {
			riskevidencesynthesisusecontextvaluerangehigh.setSystem(r.getRskEvdnceSynthsUseCntxtVlRngHiSys());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiUnt() != null) {
			riskevidencesynthesisusecontextvaluerangehigh.setUnit(r.getRskEvdnceSynthsUseCntxtVlRngHiUnt());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiVl() != null) {
			riskevidencesynthesisusecontextvaluerangehigh.setValue(Double.parseDouble((r.getRskEvdnceSynthsUseCntxtVlRngHiVl())));
		}
		/******************** riskevidencesynthesisusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		riskevidencesynthesisusecontextvaluerange.setLow(riskevidencesynthesisusecontextvaluerangelow);

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwCd() != null) {
			riskevidencesynthesisusecontextvaluerangelow.setCode(r.getRskEvdnceSynthsUseCntxtVlRngLwCd());
		}
		/******************** riskevidencesynthesisusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskevidencesynthesisusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskevidencesynthesisusecontextvaluerangelow.setComparator(riskevidencesynthesisusecontextvaluerangelowcomparator.fromCode(r.getRskEvdnceSynthsUseCntxtVlRngLwCmprtr()));

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwSys() != null) {
			riskevidencesynthesisusecontextvaluerangelow.setSystem(r.getRskEvdnceSynthsUseCntxtVlRngLwSys());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwUnt() != null) {
			riskevidencesynthesisusecontextvaluerangelow.setUnit(r.getRskEvdnceSynthsUseCntxtVlRngLwUnt());
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwVl() != null) {
			riskevidencesynthesisusecontextvaluerangelow.setValue(Double.parseDouble((r.getRskEvdnceSynthsUseCntxtVlRngLwVl())));
		}
		/******************** RskEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRfrnc() != null) {
			riskevidencesynthesisusecontext.setValue( new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsUseCntxtVlRfrnc()));
		}
		/******************** RskEvdnceSynths_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsVrsn() != null) {
			riskevidencesynthesis.setVersion(r.getRskEvdnceSynthsVrsn());
		}
		return riskevidencesynthesis;
	}
}
