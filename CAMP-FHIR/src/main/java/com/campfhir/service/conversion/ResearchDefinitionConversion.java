package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchDefinition;
public class ResearchDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ResearchDefinition ResearchDefinitions(ResearchDefinition r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchDefinition researchdefinition = new org.hl7.fhir.r4.model.ResearchDefinition();

		/******************** id ********************************************************************************/
		researchdefinition.setId(r.getId());

		/******************** RsrchDfn_ApprovalDt ********************************************************************************/
		if(r.getRsrchDfnApprovalDt() != null) {
			java.text.SimpleDateFormat RsrchDfn_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_ApprovalDtdate = RsrchDfn_ApprovalDtsdf.parse(r.getRsrchDfnApprovalDt());
			researchdefinition.setApprovalDate(RsrchDfn_ApprovalDtdate);
		}
		/******************** researchdefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitionauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		researchdefinition.addAuthor(researchdefinitionauthor);

		/******************** RsrchDfn_Athr_Nm ********************************************************************************/
		if(r.getRsrchDfnAthrNm() != null) {
			researchdefinitionauthor.setName(r.getRsrchDfnAthrNm());
		}
		/******************** researchdefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitionauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchdefinitionauthor.addTelecom(researchdefinitionauthortelecom);

		/******************** researchdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinitionauthortelecom.setPeriod(researchdefinitionauthortelecomperiod);

		/******************** RsrchDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Athr_Tlcm_Prd_Enddate = RsrchDfn_Athr_Tlcm_Prd_Endsdf.parse(r.getRsrchDfnAthrTlcmPrdEnd());
			researchdefinitionauthortelecomperiod.setEnd(RsrchDfn_Athr_Tlcm_Prd_Enddate);
		}
		/******************** RsrchDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Athr_Tlcm_Prd_Strtdate = RsrchDfn_Athr_Tlcm_Prd_Strtsdf.parse(r.getRsrchDfnAthrTlcmPrdStrt());
			researchdefinitionauthortelecomperiod.setStart(RsrchDfn_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmRnk() != null) {
			researchdefinitionauthortelecom.setRank(Integer.parseInt(r.getRsrchDfnAthrTlcmRnk()));
		}
		/******************** researchdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchdefinitionauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchdefinitionauthortelecom.setSystem(researchdefinitionauthortelecomsystem.fromCode(r.getRsrchDfnAthrTlcmSys()));

		/******************** researchdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchdefinitionauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchdefinitionauthortelecom.setUse(researchdefinitionauthortelecomuse.fromCode(r.getRsrchDfnAthrTlcmUse()));

		/******************** RsrchDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmVl() != null) {
			researchdefinitionauthortelecom.setValue(r.getRsrchDfnAthrTlcmVl());
		}
		/******************** RsrchDfn_Comment ********************************************************************************/
		if(r.getRsrchDfnComment() != null) {
			researchdefinition.addComment(r.getRsrchDfnComment());
		}
		/******************** researchdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		researchdefinition.addContact(researchdefinitioncontact);

		/******************** RsrchDfn_Cntct_Nm ********************************************************************************/
		if(r.getRsrchDfnCntctNm() != null) {
			researchdefinitioncontact.setName(r.getRsrchDfnCntctNm());
		}
		/******************** researchdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchdefinitioncontact.addTelecom(researchdefinitioncontacttelecom);

		/******************** researchdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinitioncontacttelecom.setPeriod(researchdefinitioncontacttelecomperiod);

		/******************** RsrchDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Cntct_Tlcm_Prd_Enddate = RsrchDfn_Cntct_Tlcm_Prd_Endsdf.parse(r.getRsrchDfnCntctTlcmPrdEnd());
			researchdefinitioncontacttelecomperiod.setEnd(RsrchDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** RsrchDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Cntct_Tlcm_Prd_Strtdate = RsrchDfn_Cntct_Tlcm_Prd_Strtsdf.parse(r.getRsrchDfnCntctTlcmPrdStrt());
			researchdefinitioncontacttelecomperiod.setStart(RsrchDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmRnk() != null) {
			researchdefinitioncontacttelecom.setRank(Integer.parseInt(r.getRsrchDfnCntctTlcmRnk()));
		}
		/******************** researchdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchdefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchdefinitioncontacttelecom.setSystem(researchdefinitioncontacttelecomsystem.fromCode(r.getRsrchDfnCntctTlcmSys()));

		/******************** researchdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchdefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchdefinitioncontacttelecom.setUse(researchdefinitioncontacttelecomuse.fromCode(r.getRsrchDfnCntctTlcmUse()));

		/******************** RsrchDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmVl() != null) {
			researchdefinitioncontacttelecom.setValue(r.getRsrchDfnCntctTlcmVl());
		}
		/******************** RsrchDfn_Copyright ********************************************************************************/
		if(r.getRsrchDfnCopyright() != null) {
			researchdefinition.setCopyright(r.getRsrchDfnCopyright());
		}
		/******************** RsrchDfn_Dt ********************************************************************************/
		if(r.getRsrchDfnDt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Dtdate = RsrchDfn_Dtsdf.parse(r.getRsrchDfnDt());
			researchdefinition.setDate(RsrchDfn_Dtdate);
		}
		/******************** RsrchDfn_Dscrptn ********************************************************************************/
		if(r.getRsrchDfnDscrptn() != null) {
			researchdefinition.setDescription(r.getRsrchDfnDscrptn());
		}
		/******************** researchdefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitioneditor =  new org.hl7.fhir.r4.model.ContactDetail();
		researchdefinition.addEditor(researchdefinitioneditor);

		/******************** RsrchDfn_Editor_Nm ********************************************************************************/
		if(r.getRsrchDfnEditorNm() != null) {
			researchdefinitioneditor.setName(r.getRsrchDfnEditorNm());
		}
		/******************** researchdefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitioneditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchdefinitioneditor.addTelecom(researchdefinitioneditortelecom);

		/******************** researchdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioneditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinitioneditortelecom.setPeriod(researchdefinitioneditortelecomperiod);

		/******************** RsrchDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Editor_Tlcm_Prd_Enddate = RsrchDfn_Editor_Tlcm_Prd_Endsdf.parse(r.getRsrchDfnEditorTlcmPrdEnd());
			researchdefinitioneditortelecomperiod.setEnd(RsrchDfn_Editor_Tlcm_Prd_Enddate);
		}
		/******************** RsrchDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Editor_Tlcm_Prd_Strtdate = RsrchDfn_Editor_Tlcm_Prd_Strtsdf.parse(r.getRsrchDfnEditorTlcmPrdStrt());
			researchdefinitioneditortelecomperiod.setStart(RsrchDfn_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmRnk() != null) {
			researchdefinitioneditortelecom.setRank(Integer.parseInt(r.getRsrchDfnEditorTlcmRnk()));
		}
		/******************** researchdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchdefinitioneditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchdefinitioneditortelecom.setSystem(researchdefinitioneditortelecomsystem.fromCode(r.getRsrchDfnEditorTlcmSys()));

		/******************** researchdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchdefinitioneditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchdefinitioneditortelecom.setUse(researchdefinitioneditortelecomuse.fromCode(r.getRsrchDfnEditorTlcmUse()));

		/******************** RsrchDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmVl() != null) {
			researchdefinitioneditortelecom.setValue(r.getRsrchDfnEditorTlcmVl());
		}
		/******************** researchdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinition.setEffectivePeriod(researchdefinitioneffectiveperiod);

		/******************** RsrchDfn_EfctivePrd_End ********************************************************************************/
		if(r.getRsrchDfnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_EfctivePrd_Enddate = RsrchDfn_EfctivePrd_Endsdf.parse(r.getRsrchDfnEfctivePrdEnd());
			researchdefinitioneffectiveperiod.setEnd(RsrchDfn_EfctivePrd_Enddate);
		}
		/******************** RsrchDfn_EfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchDfnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_EfctivePrd_Strtdate = RsrchDfn_EfctivePrd_Strtsdf.parse(r.getRsrchDfnEfctivePrdStrt());
			researchdefinitioneffectiveperiod.setStart(RsrchDfn_EfctivePrd_Strtdate);
		}
		/******************** researchdefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitionendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		researchdefinition.addEndorser(researchdefinitionendorser);

		/******************** RsrchDfn_Endsr_Nm ********************************************************************************/
		if(r.getRsrchDfnEndsrNm() != null) {
			researchdefinitionendorser.setName(r.getRsrchDfnEndsrNm());
		}
		/******************** researchdefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitionendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchdefinitionendorser.addTelecom(researchdefinitionendorsertelecom);

		/******************** researchdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinitionendorsertelecom.setPeriod(researchdefinitionendorsertelecomperiod);

		/******************** RsrchDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Endsr_Tlcm_Prd_Enddate = RsrchDfn_Endsr_Tlcm_Prd_Endsdf.parse(r.getRsrchDfnEndsrTlcmPrdEnd());
			researchdefinitionendorsertelecomperiod.setEnd(RsrchDfn_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** RsrchDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Endsr_Tlcm_Prd_Strtdate = RsrchDfn_Endsr_Tlcm_Prd_Strtsdf.parse(r.getRsrchDfnEndsrTlcmPrdStrt());
			researchdefinitionendorsertelecomperiod.setStart(RsrchDfn_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmRnk() != null) {
			researchdefinitionendorsertelecom.setRank(Integer.parseInt(r.getRsrchDfnEndsrTlcmRnk()));
		}
		/******************** researchdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchdefinitionendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchdefinitionendorsertelecom.setSystem(researchdefinitionendorsertelecomsystem.fromCode(r.getRsrchDfnEndsrTlcmSys()));

		/******************** researchdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchdefinitionendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchdefinitionendorsertelecom.setUse(researchdefinitionendorsertelecomuse.fromCode(r.getRsrchDfnEndsrTlcmUse()));

		/******************** RsrchDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmVl() != null) {
			researchdefinitionendorsertelecom.setValue(r.getRsrchDfnEndsrTlcmVl());
		}
		/******************** RsrchDfn_Exprmtl ********************************************************************************/
		if(r.getRsrchDfnExprmtl() != null) {
			researchdefinition.setExperimental(Boolean.parseBoolean(r.getRsrchDfnExprmtl()));
		}
		/******************** RsrchDfn_Exposure ********************************************************************************/
		if(r.getRsrchDfnExposure() != null) {
			researchdefinition.setExposure( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnExposure()));
		}
		/******************** RsrchDfn_ExposureAlternative ********************************************************************************/
		if(r.getRsrchDfnExposureAlternative() != null) {
			researchdefinition.setExposureAlternative( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnExposureAlternative()));
		}
		/******************** researchdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchdefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		researchdefinition.addIdentifier(researchdefinitionidentifier);

		/******************** RsrchDfn_Id_Assigner ********************************************************************************/
		if(r.getRsrchDfnIdAssigner() != null) {
			researchdefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnIdAssigner()));
		}
		/******************** researchdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinitionidentifier.setPeriod(researchdefinitionidentifierperiod);

		/******************** RsrchDfn_Id_Prd_End ********************************************************************************/
		if(r.getRsrchDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Id_Prd_Enddate = RsrchDfn_Id_Prd_Endsdf.parse(r.getRsrchDfnIdPrdEnd());
			researchdefinitionidentifierperiod.setEnd(RsrchDfn_Id_Prd_Enddate);
		}
		/******************** RsrchDfn_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Id_Prd_Strtdate = RsrchDfn_Id_Prd_Strtsdf.parse(r.getRsrchDfnIdPrdStrt());
			researchdefinitionidentifierperiod.setStart(RsrchDfn_Id_Prd_Strtdate);
		}
		/******************** RsrchDfn_Id_Sys ********************************************************************************/
		if(r.getRsrchDfnIdSys() != null) {
			researchdefinitionidentifier.setSystem(r.getRsrchDfnIdSys());
		}
		/******************** researchdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchdefinitionidentifier.setType(researchdefinitionidentifiertype);

		/******************** researchdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchdefinitionidentifiertype.addCoding(researchdefinitionidentifiertypecoding);

		/******************** RsrchDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgCd() != null) {
			researchdefinitionidentifiertypecoding.setCode(r.getRsrchDfnIdTypCdgCd());
		}
		/******************** RsrchDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgDsply() != null) {
			researchdefinitionidentifiertypecoding.setDisplay(r.getRsrchDfnIdTypCdgDsply());
		}
		/******************** RsrchDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgSys() != null) {
			researchdefinitionidentifiertypecoding.setSystem(r.getRsrchDfnIdTypCdgSys());
		}
		/******************** RsrchDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgUsrSltd() != null) {
			researchdefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchDfnIdTypCdgUsrSltd()));
		}
		/******************** RsrchDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgVrsn() != null) {
			researchdefinitionidentifiertypecoding.setVersion(r.getRsrchDfnIdTypCdgVrsn());
		}
		/******************** RsrchDfn_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchDfnIdTypTxt() != null) {
			researchdefinitionidentifiertype.setText(r.getRsrchDfnIdTypTxt());
		}
		/******************** researchdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory researchdefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		researchdefinitionidentifier.setUse(researchdefinitionidentifieruse.fromCode(r.getRsrchDfnIdUse()));

		/******************** RsrchDfn_Id_Vl ********************************************************************************/
		if(r.getRsrchDfnIdVl() != null) {
			researchdefinitionidentifier.setValue(r.getRsrchDfnIdVl());
		}
		/******************** researchdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchdefinition.addJurisdiction(researchdefinitionjurisdiction);

		/******************** researchdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		researchdefinitionjurisdiction.addCoding(researchdefinitionjurisdictioncoding);

		/******************** RsrchDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgCd() != null) {
			researchdefinitionjurisdictioncoding.setCode(r.getRsrchDfnJrsdctnCdgCd());
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgDsply() != null) {
			researchdefinitionjurisdictioncoding.setDisplay(r.getRsrchDfnJrsdctnCdgDsply());
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgSys() != null) {
			researchdefinitionjurisdictioncoding.setSystem(r.getRsrchDfnJrsdctnCdgSys());
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgUsrSltd() != null) {
			researchdefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(r.getRsrchDfnJrsdctnCdgUsrSltd()));
		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgVrsn() != null) {
			researchdefinitionjurisdictioncoding.setVersion(r.getRsrchDfnJrsdctnCdgVrsn());
		}
		/******************** RsrchDfn_Jrsdctn_Txt ********************************************************************************/
		if(r.getRsrchDfnJrsdctnTxt() != null) {
			researchdefinitionjurisdiction.setText(r.getRsrchDfnJrsdctnTxt());
		}
		/******************** RsrchDfn_LastReviewDt ********************************************************************************/
		if(r.getRsrchDfnLastReviewDt() != null) {
			java.text.SimpleDateFormat RsrchDfn_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_LastReviewDtdate = RsrchDfn_LastReviewDtsdf.parse(r.getRsrchDfnLastReviewDt());
			researchdefinition.setLastReviewDate(RsrchDfn_LastReviewDtdate);
		}
		/******************** RsrchDfn_Library ********************************************************************************/
		if(r.getRsrchDfnLibrary() != null) {
			researchdefinition.addLibrary(r.getRsrchDfnLibrary());
		}
		/******************** RsrchDfn_Nm ********************************************************************************/
		if(r.getRsrchDfnNm() != null) {
			researchdefinition.setName(r.getRsrchDfnNm());
		}
		/******************** RsrchDfn_Outcome ********************************************************************************/
		if(r.getRsrchDfnOutcome() != null) {
			researchdefinition.setOutcome( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnOutcome()));
		}
		/******************** RsrchDfn_Popln ********************************************************************************/
		if(r.getRsrchDfnPopln() != null) {
			researchdefinition.setPopulation( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnPopln()));
		}
		/******************** RsrchDfn_Pblshr ********************************************************************************/
		if(r.getRsrchDfnPblshr() != null) {
			researchdefinition.setPublisher(r.getRsrchDfnPblshr());
		}
		/******************** RsrchDfn_Prpse ********************************************************************************/
		if(r.getRsrchDfnPrpse() != null) {
			researchdefinition.setPurpose(r.getRsrchDfnPrpse());
		}
		/******************** researchdefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact researchdefinitionrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		researchdefinition.addRelatedArtifact(researchdefinitionrelatedartifact);

		/******************** RsrchDfn_RltedArtfct_Citation ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctCitation() != null) {
			researchdefinitionrelatedartifact.setCitation(r.getRsrchDfnRltedArtfctCitation());
		}
		/******************** RsrchDfn_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDsply() != null) {
			researchdefinitionrelatedartifact.setDisplay(r.getRsrchDfnRltedArtfctDsply());
		}
		/******************** researchdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchdefinitionrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		researchdefinitionrelatedartifact.setDocument(researchdefinitionrelatedartifactdocument);

		/******************** RsrchDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocCntntTyp() != null) {
			researchdefinitionrelatedartifactdocument.setContentType(r.getRsrchDfnRltedArtfctDocCntntTyp());
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat RsrchDfn_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_RltedArtfct_Doc_Creationdate = RsrchDfn_RltedArtfct_Doc_Creationsdf.parse(r.getRsrchDfnRltedArtfctDocCreation());
			researchdefinitionrelatedartifactdocument.setCreation(RsrchDfn_RltedArtfct_Doc_Creationdate);
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocData() != null) {
			researchdefinitionrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRsrchDfnRltedArtfctDocData()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocHash() != null) {
			researchdefinitionrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRsrchDfnRltedArtfctDocHash()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocLnguage() != null) {
			researchdefinitionrelatedartifactdocument.setLanguage(r.getRsrchDfnRltedArtfctDocLnguage());
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocSz() != null) {
			researchdefinitionrelatedartifactdocument.setSize(Integer.parseInt(r.getRsrchDfnRltedArtfctDocSz()));
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocTtl() != null) {
			researchdefinitionrelatedartifactdocument.setTitle(r.getRsrchDfnRltedArtfctDocTtl());
		}
		/******************** RsrchDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocUrl() != null) {
			researchdefinitionrelatedartifactdocument.setUrl(r.getRsrchDfnRltedArtfctDocUrl());
		}
		/******************** RsrchDfn_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctLbl() != null) {
			researchdefinitionrelatedartifact.setLabel(r.getRsrchDfnRltedArtfctLbl());
		}
		/******************** RsrchDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctRsrc() != null) {
			researchdefinitionrelatedartifact.setResource(r.getRsrchDfnRltedArtfctRsrc());
		}
		/******************** researchdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory researchdefinitionrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		researchdefinitionrelatedartifact.setType(researchdefinitionrelatedartifacttype.fromCode(r.getRsrchDfnRltedArtfctTyp()));

		/******************** RsrchDfn_RltedArtfct_Url ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctUrl() != null) {
			researchdefinitionrelatedartifact.setUrl(r.getRsrchDfnRltedArtfctUrl());
		}
		/******************** researchdefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchdefinitionreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		researchdefinition.addReviewer(researchdefinitionreviewer);

		/******************** RsrchDfn_Rviewr_Nm ********************************************************************************/
		if(r.getRsrchDfnRviewrNm() != null) {
			researchdefinitionreviewer.setName(r.getRsrchDfnRviewrNm());
		}
		/******************** researchdefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchdefinitionreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchdefinitionreviewer.addTelecom(researchdefinitionreviewertelecom);

		/******************** researchdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchdefinitionreviewertelecom.setPeriod(researchdefinitionreviewertelecomperiod);

		/******************** RsrchDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchDfn_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Rviewr_Tlcm_Prd_Enddate = RsrchDfn_Rviewr_Tlcm_Prd_Endsdf.parse(r.getRsrchDfnRviewrTlcmPrdEnd());
			researchdefinitionreviewertelecomperiod.setEnd(RsrchDfn_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** RsrchDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchDfn_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchDfn_Rviewr_Tlcm_Prd_Strtdate = RsrchDfn_Rviewr_Tlcm_Prd_Strtsdf.parse(r.getRsrchDfnRviewrTlcmPrdStrt());
			researchdefinitionreviewertelecomperiod.setStart(RsrchDfn_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmRnk() != null) {
			researchdefinitionreviewertelecom.setRank(Integer.parseInt(r.getRsrchDfnRviewrTlcmRnk()));
		}
		/******************** researchdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchdefinitionreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchdefinitionreviewertelecom.setSystem(researchdefinitionreviewertelecomsystem.fromCode(r.getRsrchDfnRviewrTlcmSys()));

		/******************** researchdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchdefinitionreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchdefinitionreviewertelecom.setUse(researchdefinitionreviewertelecomuse.fromCode(r.getRsrchDfnRviewrTlcmUse()));

		/******************** RsrchDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmVl() != null) {
			researchdefinitionreviewertelecom.setValue(r.getRsrchDfnRviewrTlcmVl());
		}
		/******************** RsrchDfn_ShortTtl ********************************************************************************/
		if(r.getRsrchDfnShortTtl() != null) {
			researchdefinition.setShortTitle(r.getRsrchDfnShortTtl());
		}
		/******************** researchdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory researchdefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		researchdefinition.setStatus(researchdefinitionstatus.fromCode(r.getRsrchDfnSts()));

		/******************** researchdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchdefinition.setSubject(researchdefinitionsubjectcodeableconcept);

		/******************** researchdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchdefinitionsubjectcodeableconcept.addCoding(researchdefinitionsubjectcodeableconceptcoding);

		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgCd() != null) {
			researchdefinitionsubjectcodeableconceptcoding.setCode(r.getRsrchDfnSbjctCdbleCncptCdgCd());
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgDsply() != null) {
			researchdefinitionsubjectcodeableconceptcoding.setDisplay(r.getRsrchDfnSbjctCdbleCncptCdgDsply());
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgSys() != null) {
			researchdefinitionsubjectcodeableconceptcoding.setSystem(r.getRsrchDfnSbjctCdbleCncptCdgSys());
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgUsrSltd() != null) {
			researchdefinitionsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchDfnSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgVrsn() != null) {
			researchdefinitionsubjectcodeableconceptcoding.setVersion(r.getRsrchDfnSbjctCdbleCncptCdgVrsn());
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptTxt() != null) {
			researchdefinitionsubjectcodeableconcept.setText(r.getRsrchDfnSbjctCdbleCncptTxt());
		}
		/******************** RsrchDfn_SbjctRfrnc ********************************************************************************/
		if(r.getRsrchDfnSbjctRfrnc() != null) {
			researchdefinition.setSubject( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnSbjctRfrnc()));
		}
		/******************** RsrchDfn_Subtitle ********************************************************************************/
		if(r.getRsrchDfnSubtitle() != null) {
			researchdefinition.setSubtitle(r.getRsrchDfnSubtitle());
		}
		/******************** RsrchDfn_Ttl ********************************************************************************/
		if(r.getRsrchDfnTtl() != null) {
			researchdefinition.setTitle(r.getRsrchDfnTtl());
		}
		/******************** researchdefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitiontopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchdefinition.addTopic(researchdefinitiontopic);

		/******************** researchdefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitiontopiccoding =  new org.hl7.fhir.r4.model.Coding();
		researchdefinitiontopic.addCoding(researchdefinitiontopiccoding);

		/******************** RsrchDfn_Topic_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnTopicCdgCd() != null) {
			researchdefinitiontopiccoding.setCode(r.getRsrchDfnTopicCdgCd());
		}
		/******************** RsrchDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnTopicCdgDsply() != null) {
			researchdefinitiontopiccoding.setDisplay(r.getRsrchDfnTopicCdgDsply());
		}
		/******************** RsrchDfn_Topic_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnTopicCdgSys() != null) {
			researchdefinitiontopiccoding.setSystem(r.getRsrchDfnTopicCdgSys());
		}
		/******************** RsrchDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnTopicCdgUsrSltd() != null) {
			researchdefinitiontopiccoding.setUserSelected(Boolean.parseBoolean(r.getRsrchDfnTopicCdgUsrSltd()));
		}
		/******************** RsrchDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnTopicCdgVrsn() != null) {
			researchdefinitiontopiccoding.setVersion(r.getRsrchDfnTopicCdgVrsn());
		}
		/******************** RsrchDfn_Topic_Txt ********************************************************************************/
		if(r.getRsrchDfnTopicTxt() != null) {
			researchdefinitiontopic.setText(r.getRsrchDfnTopicTxt());
		}
		/******************** RsrchDfn_Url ********************************************************************************/
		if(r.getRsrchDfnUrl() != null) {
			researchdefinition.setUrl(r.getRsrchDfnUrl());
		}
		/******************** RsrchDfn_Usg ********************************************************************************/
		if(r.getRsrchDfnUsg() != null) {
			researchdefinition.setUsage(r.getRsrchDfnUsg());
		}
		/******************** researchdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext researchdefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		researchdefinition.addUseContext(researchdefinitionusecontext);

		/******************** researchdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		researchdefinitionusecontext.setCode(researchdefinitionusecontextcode);

		/******************** RsrchDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdCd() != null) {
			researchdefinitionusecontextcode.setCode(r.getRsrchDfnUseCntxtCdCd());
		}
		/******************** RsrchDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdDsply() != null) {
			researchdefinitionusecontextcode.setDisplay(r.getRsrchDfnUseCntxtCdDsply());
		}
		/******************** RsrchDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdSys() != null) {
			researchdefinitionusecontextcode.setSystem(r.getRsrchDfnUseCntxtCdSys());
		}
		/******************** RsrchDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdUsrSltd() != null) {
			researchdefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(r.getRsrchDfnUseCntxtCdUsrSltd()));
		}
		/******************** RsrchDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdVrsn() != null) {
			researchdefinitionusecontextcode.setVersion(r.getRsrchDfnUseCntxtCdVrsn());
		}
		/******************** researchdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchdefinitionusecontext.setValue(researchdefinitionusecontextvaluecodeableconcept);

		/******************** researchdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchdefinitionusecontextvaluecodeableconcept.addCoding(researchdefinitionusecontextvaluecodeableconceptcoding);

		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			researchdefinitionusecontextvaluecodeableconceptcoding.setCode(r.getRsrchDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			researchdefinitionusecontextvaluecodeableconceptcoding.setDisplay(r.getRsrchDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			researchdefinitionusecontextvaluecodeableconceptcoding.setSystem(r.getRsrchDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			researchdefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			researchdefinitionusecontextvaluecodeableconceptcoding.setVersion(r.getRsrchDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptTxt() != null) {
			researchdefinitionusecontextvaluecodeableconcept.setText(r.getRsrchDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** researchdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		researchdefinitionusecontext.setValue(researchdefinitionusecontextvaluequantity);

		/******************** RsrchDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyCd() != null) {
			researchdefinitionusecontextvaluequantity.setCode(r.getRsrchDfnUseCntxtVlQntyCd());
		}
		/******************** researchdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchdefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchdefinitionusecontextvaluequantity.setComparator(researchdefinitionusecontextvaluequantitycomparator.fromCode(r.getRsrchDfnUseCntxtVlQntyCmprtr()));

		/******************** RsrchDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntySys() != null) {
			researchdefinitionusecontextvaluequantity.setSystem(r.getRsrchDfnUseCntxtVlQntySys());
		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyUnt() != null) {
			researchdefinitionusecontextvaluequantity.setUnit(r.getRsrchDfnUseCntxtVlQntyUnt());
		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyVl() != null) {
			researchdefinitionusecontextvaluequantity.setValue(Double.parseDouble((r.getRsrchDfnUseCntxtVlQntyVl())));
		}
		/******************** researchdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchdefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		researchdefinitionusecontext.setValue(researchdefinitionusecontextvaluerange);

		/******************** researchdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		researchdefinitionusecontextvaluerange.setHigh(researchdefinitionusecontextvaluerangehigh);

		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiCd() != null) {
			researchdefinitionusecontextvaluerangehigh.setCode(r.getRsrchDfnUseCntxtVlRngHiCd());
		}
		/******************** researchdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchdefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchdefinitionusecontextvaluerangehigh.setComparator(researchdefinitionusecontextvaluerangehighcomparator.fromCode(r.getRsrchDfnUseCntxtVlRngHiCmprtr()));

		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiSys() != null) {
			researchdefinitionusecontextvaluerangehigh.setSystem(r.getRsrchDfnUseCntxtVlRngHiSys());
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiUnt() != null) {
			researchdefinitionusecontextvaluerangehigh.setUnit(r.getRsrchDfnUseCntxtVlRngHiUnt());
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiVl() != null) {
			researchdefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((r.getRsrchDfnUseCntxtVlRngHiVl())));
		}
		/******************** researchdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		researchdefinitionusecontextvaluerange.setLow(researchdefinitionusecontextvaluerangelow);

		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwCd() != null) {
			researchdefinitionusecontextvaluerangelow.setCode(r.getRsrchDfnUseCntxtVlRngLwCd());
		}
		/******************** researchdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchdefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchdefinitionusecontextvaluerangelow.setComparator(researchdefinitionusecontextvaluerangelowcomparator.fromCode(r.getRsrchDfnUseCntxtVlRngLwCmprtr()));

		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwSys() != null) {
			researchdefinitionusecontextvaluerangelow.setSystem(r.getRsrchDfnUseCntxtVlRngLwSys());
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwUnt() != null) {
			researchdefinitionusecontextvaluerangelow.setUnit(r.getRsrchDfnUseCntxtVlRngLwUnt());
		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwVl() != null) {
			researchdefinitionusecontextvaluerangelow.setValue(Double.parseDouble((r.getRsrchDfnUseCntxtVlRngLwVl())));
		}
		/******************** RsrchDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRfrnc() != null) {
			researchdefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnUseCntxtVlRfrnc()));
		}
		/******************** RsrchDfn_Vrsn ********************************************************************************/
		if(r.getRsrchDfnVrsn() != null) {
			researchdefinition.setVersion(r.getRsrchDfnVrsn());
		}
		return researchdefinition;
	}
}
