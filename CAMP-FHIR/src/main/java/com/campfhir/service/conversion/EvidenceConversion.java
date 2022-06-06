package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Evidence;
public class EvidenceConversion 
{
	public org.hl7.fhir.r4.model.Evidence Evidences(Evidence e) throws ParseException
	{
		org.hl7.fhir.r4.model.Evidence evidence = new org.hl7.fhir.r4.model.Evidence();

		/******************** id ********************************************************************************/
		evidence.setId(e.getId());

		/******************** Evdnce_ApprovalDt ********************************************************************************/
		if(e.getEvdnceApprovalDt() != null) {
			java.text.SimpleDateFormat Evdnce_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_ApprovalDtdate = Evdnce_ApprovalDtsdf.parse(e.getEvdnceApprovalDt());
			evidence.setApprovalDate(Evdnce_ApprovalDtdate);
		}
		/******************** evidenceauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidenceauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		evidence.addAuthor(evidenceauthor);

		/******************** Evdnce_Athr_Nm ********************************************************************************/
		if(e.getEvdnceAthrNm() != null) {
			evidenceauthor.setName(e.getEvdnceAthrNm());
		}
		/******************** evidenceauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidenceauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidenceauthor.addTelecom(evidenceauthortelecom);

		/******************** evidenceauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidenceauthortelecom.setPeriod(evidenceauthortelecomperiod);

		/******************** Evdnce_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Athr_Tlcm_Prd_Enddate = Evdnce_Athr_Tlcm_Prd_Endsdf.parse(e.getEvdnceAthrTlcmPrdEnd());
			evidenceauthortelecomperiod.setEnd(Evdnce_Athr_Tlcm_Prd_Enddate);
		}
		/******************** Evdnce_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Athr_Tlcm_Prd_Strtdate = Evdnce_Athr_Tlcm_Prd_Strtsdf.parse(e.getEvdnceAthrTlcmPrdStrt());
			evidenceauthortelecomperiod.setStart(Evdnce_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** Evdnce_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceAthrTlcmRnk() != null) {
			evidenceauthortelecom.setRank(Integer.parseInt(e.getEvdnceAthrTlcmRnk()));
		}
		/******************** evidenceauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidenceauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidenceauthortelecom.setSystem(evidenceauthortelecomsystem.fromCode(e.getEvdnceAthrTlcmSys()));

		/******************** evidenceauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidenceauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidenceauthortelecom.setUse(evidenceauthortelecomuse.fromCode(e.getEvdnceAthrTlcmUse()));

		/******************** Evdnce_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceAthrTlcmVl() != null) {
			evidenceauthortelecom.setValue(e.getEvdnceAthrTlcmVl());
		}
		/******************** evidencecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencecontact =  new org.hl7.fhir.r4.model.ContactDetail();
		evidence.addContact(evidencecontact);

		/******************** Evdnce_Cntct_Nm ********************************************************************************/
		if(e.getEvdnceCntctNm() != null) {
			evidencecontact.setName(e.getEvdnceCntctNm());
		}
		/******************** evidencecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencecontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencecontact.addTelecom(evidencecontacttelecom);

		/******************** evidencecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencecontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencecontacttelecom.setPeriod(evidencecontacttelecomperiod);

		/******************** Evdnce_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Cntct_Tlcm_Prd_Enddate = Evdnce_Cntct_Tlcm_Prd_Endsdf.parse(e.getEvdnceCntctTlcmPrdEnd());
			evidencecontacttelecomperiod.setEnd(Evdnce_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** Evdnce_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Cntct_Tlcm_Prd_Strtdate = Evdnce_Cntct_Tlcm_Prd_Strtsdf.parse(e.getEvdnceCntctTlcmPrdStrt());
			evidencecontacttelecomperiod.setStart(Evdnce_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** Evdnce_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceCntctTlcmRnk() != null) {
			evidencecontacttelecom.setRank(Integer.parseInt(e.getEvdnceCntctTlcmRnk()));
		}
		/******************** evidencecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencecontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencecontacttelecom.setSystem(evidencecontacttelecomsystem.fromCode(e.getEvdnceCntctTlcmSys()));

		/******************** evidencecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencecontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencecontacttelecom.setUse(evidencecontacttelecomuse.fromCode(e.getEvdnceCntctTlcmUse()));

		/******************** Evdnce_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceCntctTlcmVl() != null) {
			evidencecontacttelecom.setValue(e.getEvdnceCntctTlcmVl());
		}
		/******************** Evdnce_Copyright ********************************************************************************/
		if(e.getEvdnceCopyright() != null) {
			evidence.setCopyright(e.getEvdnceCopyright());
		}
		/******************** Evdnce_Dt ********************************************************************************/
		if(e.getEvdnceDt() != null) {
			java.text.SimpleDateFormat Evdnce_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Dtdate = Evdnce_Dtsdf.parse(e.getEvdnceDt());
			evidence.setDate(Evdnce_Dtdate);
		}
		/******************** Evdnce_Dscrptn ********************************************************************************/
		if(e.getEvdnceDscrptn() != null) {
			evidence.setDescription(e.getEvdnceDscrptn());
		}
		/******************** evidenceeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidenceeditor =  new org.hl7.fhir.r4.model.ContactDetail();
		evidence.addEditor(evidenceeditor);

		/******************** Evdnce_Editor_Nm ********************************************************************************/
		if(e.getEvdnceEditorNm() != null) {
			evidenceeditor.setName(e.getEvdnceEditorNm());
		}
		/******************** evidenceeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidenceeditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidenceeditor.addTelecom(evidenceeditortelecom);

		/******************** evidenceeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceeditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidenceeditortelecom.setPeriod(evidenceeditortelecomperiod);

		/******************** Evdnce_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Editor_Tlcm_Prd_Enddate = Evdnce_Editor_Tlcm_Prd_Endsdf.parse(e.getEvdnceEditorTlcmPrdEnd());
			evidenceeditortelecomperiod.setEnd(Evdnce_Editor_Tlcm_Prd_Enddate);
		}
		/******************** Evdnce_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Editor_Tlcm_Prd_Strtdate = Evdnce_Editor_Tlcm_Prd_Strtsdf.parse(e.getEvdnceEditorTlcmPrdStrt());
			evidenceeditortelecomperiod.setStart(Evdnce_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** Evdnce_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceEditorTlcmRnk() != null) {
			evidenceeditortelecom.setRank(Integer.parseInt(e.getEvdnceEditorTlcmRnk()));
		}
		/******************** evidenceeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidenceeditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidenceeditortelecom.setSystem(evidenceeditortelecomsystem.fromCode(e.getEvdnceEditorTlcmSys()));

		/******************** evidenceeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidenceeditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidenceeditortelecom.setUse(evidenceeditortelecomuse.fromCode(e.getEvdnceEditorTlcmUse()));

		/******************** Evdnce_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceEditorTlcmVl() != null) {
			evidenceeditortelecom.setValue(e.getEvdnceEditorTlcmVl());
		}
		/******************** evidenceeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		evidence.setEffectivePeriod(evidenceeffectiveperiod);

		/******************** Evdnce_EfctivePrd_End ********************************************************************************/
		if(e.getEvdnceEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_EfctivePrd_Enddate = Evdnce_EfctivePrd_Endsdf.parse(e.getEvdnceEfctivePrdEnd());
			evidenceeffectiveperiod.setEnd(Evdnce_EfctivePrd_Enddate);
		}
		/******************** Evdnce_EfctivePrd_Strt ********************************************************************************/
		if(e.getEvdnceEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_EfctivePrd_Strtdate = Evdnce_EfctivePrd_Strtsdf.parse(e.getEvdnceEfctivePrdStrt());
			evidenceeffectiveperiod.setStart(Evdnce_EfctivePrd_Strtdate);
		}
		/******************** evidenceendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidenceendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		evidence.addEndorser(evidenceendorser);

		/******************** Evdnce_Endsr_Nm ********************************************************************************/
		if(e.getEvdnceEndsrNm() != null) {
			evidenceendorser.setName(e.getEvdnceEndsrNm());
		}
		/******************** evidenceendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidenceendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidenceendorser.addTelecom(evidenceendorsertelecom);

		/******************** evidenceendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidenceendorsertelecom.setPeriod(evidenceendorsertelecomperiod);

		/******************** Evdnce_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Endsr_Tlcm_Prd_Enddate = Evdnce_Endsr_Tlcm_Prd_Endsdf.parse(e.getEvdnceEndsrTlcmPrdEnd());
			evidenceendorsertelecomperiod.setEnd(Evdnce_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** Evdnce_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Endsr_Tlcm_Prd_Strtdate = Evdnce_Endsr_Tlcm_Prd_Strtsdf.parse(e.getEvdnceEndsrTlcmPrdStrt());
			evidenceendorsertelecomperiod.setStart(Evdnce_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** Evdnce_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceEndsrTlcmRnk() != null) {
			evidenceendorsertelecom.setRank(Integer.parseInt(e.getEvdnceEndsrTlcmRnk()));
		}
		/******************** evidenceendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidenceendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidenceendorsertelecom.setSystem(evidenceendorsertelecomsystem.fromCode(e.getEvdnceEndsrTlcmSys()));

		/******************** evidenceendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidenceendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidenceendorsertelecom.setUse(evidenceendorsertelecomuse.fromCode(e.getEvdnceEndsrTlcmUse()));

		/******************** Evdnce_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceEndsrTlcmVl() != null) {
			evidenceendorsertelecom.setValue(e.getEvdnceEndsrTlcmVl());
		}
		/******************** Evdnce_ExposureBackground ********************************************************************************/
		if(e.getEvdnceExposureBackground() != null) {
			evidence.setExposureBackground( new org.hl7.fhir.r4.model.Reference(e.getEvdnceExposureBackground()));
		}
		/******************** Evdnce_ExposureVariant ********************************************************************************/
		if(e.getEvdnceExposureVariant() != null) {
			evidence.addExposureVariant( new org.hl7.fhir.r4.model.Reference(e.getEvdnceExposureVariant()));
		}
		/******************** evidenceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier evidenceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		evidence.addIdentifier(evidenceidentifier);

		/******************** Evdnce_Id_Assigner ********************************************************************************/
		if(e.getEvdnceIdAssigner() != null) {
			evidenceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEvdnceIdAssigner()));
		}
		/******************** evidenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		evidenceidentifier.setPeriod(evidenceidentifierperiod);

		/******************** Evdnce_Id_Prd_End ********************************************************************************/
		if(e.getEvdnceIdPrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Id_Prd_Enddate = Evdnce_Id_Prd_Endsdf.parse(e.getEvdnceIdPrdEnd());
			evidenceidentifierperiod.setEnd(Evdnce_Id_Prd_Enddate);
		}
		/******************** Evdnce_Id_Prd_Strt ********************************************************************************/
		if(e.getEvdnceIdPrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Id_Prd_Strtdate = Evdnce_Id_Prd_Strtsdf.parse(e.getEvdnceIdPrdStrt());
			evidenceidentifierperiod.setStart(Evdnce_Id_Prd_Strtdate);
		}
		/******************** Evdnce_Id_Sys ********************************************************************************/
		if(e.getEvdnceIdSys() != null) {
			evidenceidentifier.setSystem(e.getEvdnceIdSys());
		}
		/******************** evidenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidenceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidenceidentifier.setType(evidenceidentifiertype);

		/******************** evidenceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		evidenceidentifiertype.addCoding(evidenceidentifiertypecoding);

		/******************** Evdnce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceIdTypCdgCd() != null) {
			evidenceidentifiertypecoding.setCode(e.getEvdnceIdTypCdgCd());
		}
		/******************** Evdnce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceIdTypCdgDsply() != null) {
			evidenceidentifiertypecoding.setDisplay(e.getEvdnceIdTypCdgDsply());
		}
		/******************** Evdnce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceIdTypCdgSys() != null) {
			evidenceidentifiertypecoding.setSystem(e.getEvdnceIdTypCdgSys());
		}
		/******************** Evdnce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceIdTypCdgUsrSltd() != null) {
			evidenceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceIdTypCdgUsrSltd()));
		}
		/******************** Evdnce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceIdTypCdgVrsn() != null) {
			evidenceidentifiertypecoding.setVersion(e.getEvdnceIdTypCdgVrsn());
		}
		/******************** Evdnce_Id_Typ_Txt ********************************************************************************/
		if(e.getEvdnceIdTypTxt() != null) {
			evidenceidentifiertype.setText(e.getEvdnceIdTypTxt());
		}
		/******************** evidenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory evidenceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		evidenceidentifier.setUse(evidenceidentifieruse.fromCode(e.getEvdnceIdUse()));

		/******************** Evdnce_Id_Vl ********************************************************************************/
		if(e.getEvdnceIdVl() != null) {
			evidenceidentifier.setValue(e.getEvdnceIdVl());
		}
		/******************** evidencejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencejurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidence.addJurisdiction(evidencejurisdiction);

		/******************** evidencejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencejurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		evidencejurisdiction.addCoding(evidencejurisdictioncoding);

		/******************** Evdnce_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgCd() != null) {
			evidencejurisdictioncoding.setCode(e.getEvdnceJrsdctnCdgCd());
		}
		/******************** Evdnce_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgDsply() != null) {
			evidencejurisdictioncoding.setDisplay(e.getEvdnceJrsdctnCdgDsply());
		}
		/******************** Evdnce_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgSys() != null) {
			evidencejurisdictioncoding.setSystem(e.getEvdnceJrsdctnCdgSys());
		}
		/******************** Evdnce_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgUsrSltd() != null) {
			evidencejurisdictioncoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceJrsdctnCdgUsrSltd()));
		}
		/******************** Evdnce_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgVrsn() != null) {
			evidencejurisdictioncoding.setVersion(e.getEvdnceJrsdctnCdgVrsn());
		}
		/******************** Evdnce_Jrsdctn_Txt ********************************************************************************/
		if(e.getEvdnceJrsdctnTxt() != null) {
			evidencejurisdiction.setText(e.getEvdnceJrsdctnTxt());
		}
		/******************** Evdnce_LastReviewDt ********************************************************************************/
		if(e.getEvdnceLastReviewDt() != null) {
			java.text.SimpleDateFormat Evdnce_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_LastReviewDtdate = Evdnce_LastReviewDtsdf.parse(e.getEvdnceLastReviewDt());
			evidence.setLastReviewDate(Evdnce_LastReviewDtdate);
		}
		/******************** Evdnce_Nm ********************************************************************************/
		if(e.getEvdnceNm() != null) {
			evidence.setName(e.getEvdnceNm());
		}
		/******************** evidencenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation evidencenote =  new org.hl7.fhir.r4.model.Annotation();
		evidence.addNote(evidencenote);

		/******************** Evdnce_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEvdnceNtAthrRfrnc() != null) {
			evidencenote.setAuthor( new org.hl7.fhir.r4.model.Reference(e.getEvdnceNtAthrRfrnc()));
		}
		/******************** Evdnce_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEvdnceNtAthrStrgTyp() != null) {
			evidencenote.setAuthor( new org.hl7.fhir.r4.model.StringType(e.getEvdnceNtAthrStrgTyp()));
		}
		/******************** Evdnce_Nt_Txt ********************************************************************************/
		if(e.getEvdnceNtTxt() != null) {
			evidencenote.setText(e.getEvdnceNtTxt());
		}
		/******************** Evdnce_Nt_Time ********************************************************************************/
		if(e.getEvdnceNtTime() != null) {
			java.text.SimpleDateFormat Evdnce_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Nt_Timedate = Evdnce_Nt_Timesdf.parse(e.getEvdnceNtTime());
			evidencenote.setTime(Evdnce_Nt_Timedate);
		}
		/******************** Evdnce_Outcome ********************************************************************************/
		if(e.getEvdnceOutcome() != null) {
			evidence.addOutcome( new org.hl7.fhir.r4.model.Reference(e.getEvdnceOutcome()));
		}
		/******************** Evdnce_Pblshr ********************************************************************************/
		if(e.getEvdncePblshr() != null) {
			evidence.setPublisher(e.getEvdncePblshr());
		}
		/******************** evidencerelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact evidencerelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		evidence.addRelatedArtifact(evidencerelatedartifact);

		/******************** Evdnce_RltedArtfct_Citation ********************************************************************************/
		if(e.getEvdnceRltedArtfctCitation() != null) {
			evidencerelatedartifact.setCitation(e.getEvdnceRltedArtfctCitation());
		}
		/******************** Evdnce_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEvdnceRltedArtfctDsply() != null) {
			evidencerelatedartifact.setDisplay(e.getEvdnceRltedArtfctDsply());
		}
		/******************** evidencerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment evidencerelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		evidencerelatedartifact.setDocument(evidencerelatedartifactdocument);

		/******************** Evdnce_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocCntntTyp() != null) {
			evidencerelatedartifactdocument.setContentType(e.getEvdnceRltedArtfctDocCntntTyp());
		}
		/******************** Evdnce_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat Evdnce_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_RltedArtfct_Doc_Creationdate = Evdnce_RltedArtfct_Doc_Creationsdf.parse(e.getEvdnceRltedArtfctDocCreation());
			evidencerelatedartifactdocument.setCreation(Evdnce_RltedArtfct_Doc_Creationdate);
		}
		/******************** Evdnce_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocData() != null) {
			evidencerelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEvdnceRltedArtfctDocData()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocHash() != null) {
			evidencerelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEvdnceRltedArtfctDocHash()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocLnguage() != null) {
			evidencerelatedartifactdocument.setLanguage(e.getEvdnceRltedArtfctDocLnguage());
		}
		/******************** Evdnce_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocSz() != null) {
			evidencerelatedartifactdocument.setSize(Integer.parseInt(e.getEvdnceRltedArtfctDocSz()));
		}
		/******************** Evdnce_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocTtl() != null) {
			evidencerelatedartifactdocument.setTitle(e.getEvdnceRltedArtfctDocTtl());
		}
		/******************** Evdnce_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocUrl() != null) {
			evidencerelatedartifactdocument.setUrl(e.getEvdnceRltedArtfctDocUrl());
		}
		/******************** Evdnce_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEvdnceRltedArtfctLbl() != null) {
			evidencerelatedartifact.setLabel(e.getEvdnceRltedArtfctLbl());
		}
		/******************** Evdnce_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEvdnceRltedArtfctRsrc() != null) {
			evidencerelatedartifact.setResource(e.getEvdnceRltedArtfctRsrc());
		}
		/******************** evidencerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory evidencerelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		evidencerelatedartifact.setType(evidencerelatedartifacttype.fromCode(e.getEvdnceRltedArtfctTyp()));

		/******************** Evdnce_RltedArtfct_Url ********************************************************************************/
		if(e.getEvdnceRltedArtfctUrl() != null) {
			evidencerelatedartifact.setUrl(e.getEvdnceRltedArtfctUrl());
		}
		/******************** evidencereviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencereviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		evidence.addReviewer(evidencereviewer);

		/******************** Evdnce_Rviewr_Nm ********************************************************************************/
		if(e.getEvdnceRviewrNm() != null) {
			evidencereviewer.setName(e.getEvdnceRviewrNm());
		}
		/******************** evidencereviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencereviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencereviewer.addTelecom(evidencereviewertelecom);

		/******************** evidencereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencereviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencereviewertelecom.setPeriod(evidencereviewertelecomperiod);

		/******************** Evdnce_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Evdnce_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Rviewr_Tlcm_Prd_Enddate = Evdnce_Rviewr_Tlcm_Prd_Endsdf.parse(e.getEvdnceRviewrTlcmPrdEnd());
			evidencereviewertelecomperiod.setEnd(Evdnce_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** Evdnce_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Evdnce_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Evdnce_Rviewr_Tlcm_Prd_Strtdate = Evdnce_Rviewr_Tlcm_Prd_Strtsdf.parse(e.getEvdnceRviewrTlcmPrdStrt());
			evidencereviewertelecomperiod.setStart(Evdnce_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** Evdnce_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceRviewrTlcmRnk() != null) {
			evidencereviewertelecom.setRank(Integer.parseInt(e.getEvdnceRviewrTlcmRnk()));
		}
		/******************** evidencereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencereviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencereviewertelecom.setSystem(evidencereviewertelecomsystem.fromCode(e.getEvdnceRviewrTlcmSys()));

		/******************** evidencereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencereviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencereviewertelecom.setUse(evidencereviewertelecomuse.fromCode(e.getEvdnceRviewrTlcmUse()));

		/******************** Evdnce_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceRviewrTlcmVl() != null) {
			evidencereviewertelecom.setValue(e.getEvdnceRviewrTlcmVl());
		}
		/******************** Evdnce_ShortTtl ********************************************************************************/
		if(e.getEvdnceShortTtl() != null) {
			evidence.setShortTitle(e.getEvdnceShortTtl());
		}
		/******************** evidencestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory evidencestatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		evidence.setStatus(evidencestatus.fromCode(e.getEvdnceSts()));

		/******************** Evdnce_Subtitle ********************************************************************************/
		if(e.getEvdnceSubtitle() != null) {
			evidence.setSubtitle(e.getEvdnceSubtitle());
		}
		/******************** Evdnce_Ttl ********************************************************************************/
		if(e.getEvdnceTtl() != null) {
			evidence.setTitle(e.getEvdnceTtl());
		}
		/******************** evidencetopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencetopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidence.addTopic(evidencetopic);

		/******************** evidencetopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencetopiccoding =  new org.hl7.fhir.r4.model.Coding();
		evidencetopic.addCoding(evidencetopiccoding);

		/******************** Evdnce_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceTopicCdgCd() != null) {
			evidencetopiccoding.setCode(e.getEvdnceTopicCdgCd());
		}
		/******************** Evdnce_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceTopicCdgDsply() != null) {
			evidencetopiccoding.setDisplay(e.getEvdnceTopicCdgDsply());
		}
		/******************** Evdnce_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceTopicCdgSys() != null) {
			evidencetopiccoding.setSystem(e.getEvdnceTopicCdgSys());
		}
		/******************** Evdnce_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceTopicCdgUsrSltd() != null) {
			evidencetopiccoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceTopicCdgUsrSltd()));
		}
		/******************** Evdnce_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceTopicCdgVrsn() != null) {
			evidencetopiccoding.setVersion(e.getEvdnceTopicCdgVrsn());
		}
		/******************** Evdnce_Topic_Txt ********************************************************************************/
		if(e.getEvdnceTopicTxt() != null) {
			evidencetopic.setText(e.getEvdnceTopicTxt());
		}
		/******************** Evdnce_Url ********************************************************************************/
		if(e.getEvdnceUrl() != null) {
			evidence.setUrl(e.getEvdnceUrl());
		}
		/******************** evidenceusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext evidenceusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		evidence.addUseContext(evidenceusecontext);

		/******************** evidenceusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		evidenceusecontext.setCode(evidenceusecontextcode);

		/******************** Evdnce_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtCdCd() != null) {
			evidenceusecontextcode.setCode(e.getEvdnceUseCntxtCdCd());
		}
		/******************** Evdnce_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceUseCntxtCdDsply() != null) {
			evidenceusecontextcode.setDisplay(e.getEvdnceUseCntxtCdDsply());
		}
		/******************** Evdnce_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtCdSys() != null) {
			evidenceusecontextcode.setSystem(e.getEvdnceUseCntxtCdSys());
		}
		/******************** Evdnce_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceUseCntxtCdUsrSltd() != null) {
			evidenceusecontextcode.setUserSelected(Boolean.parseBoolean(e.getEvdnceUseCntxtCdUsrSltd()));
		}
		/******************** Evdnce_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceUseCntxtCdVrsn() != null) {
			evidenceusecontextcode.setVersion(e.getEvdnceUseCntxtCdVrsn());
		}
		/******************** evidenceusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidenceusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidenceusecontext.setValue(evidenceusecontextvaluecodeableconcept);

		/******************** evidenceusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		evidenceusecontextvaluecodeableconcept.addCoding(evidenceusecontextvaluecodeableconceptcoding);

		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgCd() != null) {
			evidenceusecontextvaluecodeableconceptcoding.setCode(e.getEvdnceUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgDsply() != null) {
			evidenceusecontextvaluecodeableconceptcoding.setDisplay(e.getEvdnceUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgSys() != null) {
			evidenceusecontextvaluecodeableconceptcoding.setSystem(e.getEvdnceUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			evidenceusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgVrsn() != null) {
			evidenceusecontextvaluecodeableconceptcoding.setVersion(e.getEvdnceUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptTxt() != null) {
			evidenceusecontextvaluecodeableconcept.setText(e.getEvdnceUseCntxtVlCdbleCncptTxt());
		}
		/******************** evidenceusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		evidenceusecontext.setValue(evidenceusecontextvaluequantity);

		/******************** Evdnce_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyCd() != null) {
			evidenceusecontextvaluequantity.setCode(e.getEvdnceUseCntxtVlQntyCd());
		}
		/******************** evidenceusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidenceusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidenceusecontextvaluequantity.setComparator(evidenceusecontextvaluequantitycomparator.fromCode(e.getEvdnceUseCntxtVlQntyCmprtr()));

		/******************** Evdnce_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntySys() != null) {
			evidenceusecontextvaluequantity.setSystem(e.getEvdnceUseCntxtVlQntySys());
		}
		/******************** Evdnce_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyUnt() != null) {
			evidenceusecontextvaluequantity.setUnit(e.getEvdnceUseCntxtVlQntyUnt());
		}
		/******************** Evdnce_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyVl() != null) {
			evidenceusecontextvaluequantity.setValue(Double.parseDouble((e.getEvdnceUseCntxtVlQntyVl())));
		}
		/******************** evidenceusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidenceusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		evidenceusecontext.setValue(evidenceusecontextvaluerange);

		/******************** evidenceusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		evidenceusecontextvaluerange.setHigh(evidenceusecontextvaluerangehigh);

		/******************** Evdnce_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiCd() != null) {
			evidenceusecontextvaluerangehigh.setCode(e.getEvdnceUseCntxtVlRngHiCd());
		}
		/******************** evidenceusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidenceusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidenceusecontextvaluerangehigh.setComparator(evidenceusecontextvaluerangehighcomparator.fromCode(e.getEvdnceUseCntxtVlRngHiCmprtr()));

		/******************** Evdnce_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiSys() != null) {
			evidenceusecontextvaluerangehigh.setSystem(e.getEvdnceUseCntxtVlRngHiSys());
		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiUnt() != null) {
			evidenceusecontextvaluerangehigh.setUnit(e.getEvdnceUseCntxtVlRngHiUnt());
		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiVl() != null) {
			evidenceusecontextvaluerangehigh.setValue(Double.parseDouble((e.getEvdnceUseCntxtVlRngHiVl())));
		}
		/******************** evidenceusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		evidenceusecontextvaluerange.setLow(evidenceusecontextvaluerangelow);

		/******************** Evdnce_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwCd() != null) {
			evidenceusecontextvaluerangelow.setCode(e.getEvdnceUseCntxtVlRngLwCd());
		}
		/******************** evidenceusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidenceusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidenceusecontextvaluerangelow.setComparator(evidenceusecontextvaluerangelowcomparator.fromCode(e.getEvdnceUseCntxtVlRngLwCmprtr()));

		/******************** Evdnce_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwSys() != null) {
			evidenceusecontextvaluerangelow.setSystem(e.getEvdnceUseCntxtVlRngLwSys());
		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwUnt() != null) {
			evidenceusecontextvaluerangelow.setUnit(e.getEvdnceUseCntxtVlRngLwUnt());
		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwVl() != null) {
			evidenceusecontextvaluerangelow.setValue(Double.parseDouble((e.getEvdnceUseCntxtVlRngLwVl())));
		}
		/******************** Evdnce_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRfrnc() != null) {
			evidenceusecontext.setValue( new org.hl7.fhir.r4.model.Reference(e.getEvdnceUseCntxtVlRfrnc()));
		}
		/******************** Evdnce_Vrsn ********************************************************************************/
		if(e.getEvdnceVrsn() != null) {
			evidence.setVersion(e.getEvdnceVrsn());
		}
		return evidence;
	}
}
