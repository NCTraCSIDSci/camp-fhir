package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EventDefinition;
public class EventDefinitionConversion 
{
	public org.hl7.fhir.r4.model.EventDefinition EventDefinitions(EventDefinition e) throws ParseException
	{
		org.hl7.fhir.r4.model.EventDefinition eventdefinition = new org.hl7.fhir.r4.model.EventDefinition();

		/******************** id ********************************************************************************/
		eventdefinition.setId(e.getId());

		/******************** EvntDfn_ApprovalDt ********************************************************************************/
		if(e.getEvntDfnApprovalDt() != null) {
			java.text.SimpleDateFormat EvntDfn_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_ApprovalDtdate = EvntDfn_ApprovalDtsdf.parse(e.getEvntDfnApprovalDt());
			eventdefinition.setApprovalDate(EvntDfn_ApprovalDtdate);
		}
		/******************** eventdefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitionauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		eventdefinition.addAuthor(eventdefinitionauthor);

		/******************** EvntDfn_Athr_Nm ********************************************************************************/
		if(e.getEvntDfnAthrNm() != null) {
			eventdefinitionauthor.setName(e.getEvntDfnAthrNm());
		}
		/******************** eventdefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitionauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		eventdefinitionauthor.addTelecom(eventdefinitionauthortelecom);

		/******************** eventdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitionauthortelecom.setPeriod(eventdefinitionauthortelecomperiod);

		/******************** EvntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Athr_Tlcm_Prd_Enddate = EvntDfn_Athr_Tlcm_Prd_Endsdf.parse(e.getEvntDfnAthrTlcmPrdEnd());
			eventdefinitionauthortelecomperiod.setEnd(EvntDfn_Athr_Tlcm_Prd_Enddate);
		}
		/******************** EvntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Athr_Tlcm_Prd_Strtdate = EvntDfn_Athr_Tlcm_Prd_Strtsdf.parse(e.getEvntDfnAthrTlcmPrdStrt());
			eventdefinitionauthortelecomperiod.setStart(EvntDfn_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** EvntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnAthrTlcmRnk() != null) {
			eventdefinitionauthortelecom.setRank(Integer.parseInt(e.getEvntDfnAthrTlcmRnk()));
		}
		/******************** eventdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory eventdefinitionauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		eventdefinitionauthortelecom.setSystem(eventdefinitionauthortelecomsystem.fromCode(e.getEvntDfnAthrTlcmSys()));

		/******************** eventdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory eventdefinitionauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		eventdefinitionauthortelecom.setUse(eventdefinitionauthortelecomuse.fromCode(e.getEvntDfnAthrTlcmUse()));

		/******************** EvntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnAthrTlcmVl() != null) {
			eventdefinitionauthortelecom.setValue(e.getEvntDfnAthrTlcmVl());
		}
		/******************** eventdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		eventdefinition.addContact(eventdefinitioncontact);

		/******************** EvntDfn_Cntct_Nm ********************************************************************************/
		if(e.getEvntDfnCntctNm() != null) {
			eventdefinitioncontact.setName(e.getEvntDfnCntctNm());
		}
		/******************** eventdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		eventdefinitioncontact.addTelecom(eventdefinitioncontacttelecom);

		/******************** eventdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitioncontacttelecom.setPeriod(eventdefinitioncontacttelecomperiod);

		/******************** EvntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Cntct_Tlcm_Prd_Enddate = EvntDfn_Cntct_Tlcm_Prd_Endsdf.parse(e.getEvntDfnCntctTlcmPrdEnd());
			eventdefinitioncontacttelecomperiod.setEnd(EvntDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** EvntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Cntct_Tlcm_Prd_Strtdate = EvntDfn_Cntct_Tlcm_Prd_Strtsdf.parse(e.getEvntDfnCntctTlcmPrdStrt());
			eventdefinitioncontacttelecomperiod.setStart(EvntDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** EvntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnCntctTlcmRnk() != null) {
			eventdefinitioncontacttelecom.setRank(Integer.parseInt(e.getEvntDfnCntctTlcmRnk()));
		}
		/******************** eventdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory eventdefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		eventdefinitioncontacttelecom.setSystem(eventdefinitioncontacttelecomsystem.fromCode(e.getEvntDfnCntctTlcmSys()));

		/******************** eventdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory eventdefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		eventdefinitioncontacttelecom.setUse(eventdefinitioncontacttelecomuse.fromCode(e.getEvntDfnCntctTlcmUse()));

		/******************** EvntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnCntctTlcmVl() != null) {
			eventdefinitioncontacttelecom.setValue(e.getEvntDfnCntctTlcmVl());
		}
		/******************** EvntDfn_Copyright ********************************************************************************/
		if(e.getEvntDfnCopyright() != null) {
			eventdefinition.setCopyright(e.getEvntDfnCopyright());
		}
		/******************** EvntDfn_Dt ********************************************************************************/
		if(e.getEvntDfnDt() != null) {
			java.text.SimpleDateFormat EvntDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Dtdate = EvntDfn_Dtsdf.parse(e.getEvntDfnDt());
			eventdefinition.setDate(EvntDfn_Dtdate);
		}
		/******************** EvntDfn_Dscrptn ********************************************************************************/
		if(e.getEvntDfnDscrptn() != null) {
			eventdefinition.setDescription(e.getEvntDfnDscrptn());
		}
		/******************** eventdefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitioneditor =  new org.hl7.fhir.r4.model.ContactDetail();
		eventdefinition.addEditor(eventdefinitioneditor);

		/******************** EvntDfn_Editor_Nm ********************************************************************************/
		if(e.getEvntDfnEditorNm() != null) {
			eventdefinitioneditor.setName(e.getEvntDfnEditorNm());
		}
		/******************** eventdefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitioneditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		eventdefinitioneditor.addTelecom(eventdefinitioneditortelecom);

		/******************** eventdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioneditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitioneditortelecom.setPeriod(eventdefinitioneditortelecomperiod);

		/******************** EvntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Editor_Tlcm_Prd_Enddate = EvntDfn_Editor_Tlcm_Prd_Endsdf.parse(e.getEvntDfnEditorTlcmPrdEnd());
			eventdefinitioneditortelecomperiod.setEnd(EvntDfn_Editor_Tlcm_Prd_Enddate);
		}
		/******************** EvntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Editor_Tlcm_Prd_Strtdate = EvntDfn_Editor_Tlcm_Prd_Strtsdf.parse(e.getEvntDfnEditorTlcmPrdStrt());
			eventdefinitioneditortelecomperiod.setStart(EvntDfn_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** EvntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnEditorTlcmRnk() != null) {
			eventdefinitioneditortelecom.setRank(Integer.parseInt(e.getEvntDfnEditorTlcmRnk()));
		}
		/******************** eventdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory eventdefinitioneditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		eventdefinitioneditortelecom.setSystem(eventdefinitioneditortelecomsystem.fromCode(e.getEvntDfnEditorTlcmSys()));

		/******************** eventdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory eventdefinitioneditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		eventdefinitioneditortelecom.setUse(eventdefinitioneditortelecomuse.fromCode(e.getEvntDfnEditorTlcmUse()));

		/******************** EvntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnEditorTlcmVl() != null) {
			eventdefinitioneditortelecom.setValue(e.getEvntDfnEditorTlcmVl());
		}
		/******************** eventdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinition.setEffectivePeriod(eventdefinitioneffectiveperiod);

		/******************** EvntDfn_EfctivePrd_End ********************************************************************************/
		if(e.getEvntDfnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_EfctivePrd_Enddate = EvntDfn_EfctivePrd_Endsdf.parse(e.getEvntDfnEfctivePrdEnd());
			eventdefinitioneffectiveperiod.setEnd(EvntDfn_EfctivePrd_Enddate);
		}
		/******************** EvntDfn_EfctivePrd_Strt ********************************************************************************/
		if(e.getEvntDfnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_EfctivePrd_Strtdate = EvntDfn_EfctivePrd_Strtsdf.parse(e.getEvntDfnEfctivePrdStrt());
			eventdefinitioneffectiveperiod.setStart(EvntDfn_EfctivePrd_Strtdate);
		}
		/******************** eventdefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitionendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		eventdefinition.addEndorser(eventdefinitionendorser);

		/******************** EvntDfn_Endsr_Nm ********************************************************************************/
		if(e.getEvntDfnEndsrNm() != null) {
			eventdefinitionendorser.setName(e.getEvntDfnEndsrNm());
		}
		/******************** eventdefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitionendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		eventdefinitionendorser.addTelecom(eventdefinitionendorsertelecom);

		/******************** eventdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitionendorsertelecom.setPeriod(eventdefinitionendorsertelecomperiod);

		/******************** EvntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Endsr_Tlcm_Prd_Enddate = EvntDfn_Endsr_Tlcm_Prd_Endsdf.parse(e.getEvntDfnEndsrTlcmPrdEnd());
			eventdefinitionendorsertelecomperiod.setEnd(EvntDfn_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** EvntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Endsr_Tlcm_Prd_Strtdate = EvntDfn_Endsr_Tlcm_Prd_Strtsdf.parse(e.getEvntDfnEndsrTlcmPrdStrt());
			eventdefinitionendorsertelecomperiod.setStart(EvntDfn_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** EvntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmRnk() != null) {
			eventdefinitionendorsertelecom.setRank(Integer.parseInt(e.getEvntDfnEndsrTlcmRnk()));
		}
		/******************** eventdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory eventdefinitionendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		eventdefinitionendorsertelecom.setSystem(eventdefinitionendorsertelecomsystem.fromCode(e.getEvntDfnEndsrTlcmSys()));

		/******************** eventdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory eventdefinitionendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		eventdefinitionendorsertelecom.setUse(eventdefinitionendorsertelecomuse.fromCode(e.getEvntDfnEndsrTlcmUse()));

		/******************** EvntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmVl() != null) {
			eventdefinitionendorsertelecom.setValue(e.getEvntDfnEndsrTlcmVl());
		}
		/******************** EvntDfn_Exprmtl ********************************************************************************/
		if(e.getEvntDfnExprmtl() != null) {
			eventdefinition.setExperimental(Boolean.parseBoolean(e.getEvntDfnExprmtl()));
		}
		/******************** eventdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier eventdefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		eventdefinition.addIdentifier(eventdefinitionidentifier);

		/******************** EvntDfn_Id_Assigner ********************************************************************************/
		if(e.getEvntDfnIdAssigner() != null) {
			eventdefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEvntDfnIdAssigner()));
		}
		/******************** eventdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitionidentifier.setPeriod(eventdefinitionidentifierperiod);

		/******************** EvntDfn_Id_Prd_End ********************************************************************************/
		if(e.getEvntDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Id_Prd_Enddate = EvntDfn_Id_Prd_Endsdf.parse(e.getEvntDfnIdPrdEnd());
			eventdefinitionidentifierperiod.setEnd(EvntDfn_Id_Prd_Enddate);
		}
		/******************** EvntDfn_Id_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Id_Prd_Strtdate = EvntDfn_Id_Prd_Strtsdf.parse(e.getEvntDfnIdPrdStrt());
			eventdefinitionidentifierperiod.setStart(EvntDfn_Id_Prd_Strtdate);
		}
		/******************** EvntDfn_Id_Sys ********************************************************************************/
		if(e.getEvntDfnIdSys() != null) {
			eventdefinitionidentifier.setSystem(e.getEvntDfnIdSys());
		}
		/******************** eventdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinitionidentifier.setType(eventdefinitionidentifiertype);

		/******************** eventdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitionidentifiertype.addCoding(eventdefinitionidentifiertypecoding);

		/******************** EvntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnIdTypCdgCd() != null) {
			eventdefinitionidentifiertypecoding.setCode(e.getEvntDfnIdTypCdgCd());
		}
		/******************** EvntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnIdTypCdgDsply() != null) {
			eventdefinitionidentifiertypecoding.setDisplay(e.getEvntDfnIdTypCdgDsply());
		}
		/******************** EvntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnIdTypCdgSys() != null) {
			eventdefinitionidentifiertypecoding.setSystem(e.getEvntDfnIdTypCdgSys());
		}
		/******************** EvntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnIdTypCdgUsrSltd() != null) {
			eventdefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnIdTypCdgUsrSltd()));
		}
		/******************** EvntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnIdTypCdgVrsn() != null) {
			eventdefinitionidentifiertypecoding.setVersion(e.getEvntDfnIdTypCdgVrsn());
		}
		/******************** EvntDfn_Id_Typ_Txt ********************************************************************************/
		if(e.getEvntDfnIdTypTxt() != null) {
			eventdefinitionidentifiertype.setText(e.getEvntDfnIdTypTxt());
		}
		/******************** eventdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory eventdefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		eventdefinitionidentifier.setUse(eventdefinitionidentifieruse.fromCode(e.getEvntDfnIdUse()));

		/******************** EvntDfn_Id_Vl ********************************************************************************/
		if(e.getEvntDfnIdVl() != null) {
			eventdefinitionidentifier.setValue(e.getEvntDfnIdVl());
		}
		/******************** eventdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinition.addJurisdiction(eventdefinitionjurisdiction);

		/******************** eventdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitionjurisdiction.addCoding(eventdefinitionjurisdictioncoding);

		/******************** EvntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgCd() != null) {
			eventdefinitionjurisdictioncoding.setCode(e.getEvntDfnJrsdctnCdgCd());
		}
		/******************** EvntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgDsply() != null) {
			eventdefinitionjurisdictioncoding.setDisplay(e.getEvntDfnJrsdctnCdgDsply());
		}
		/******************** EvntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgSys() != null) {
			eventdefinitionjurisdictioncoding.setSystem(e.getEvntDfnJrsdctnCdgSys());
		}
		/******************** EvntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgUsrSltd() != null) {
			eventdefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnJrsdctnCdgUsrSltd()));
		}
		/******************** EvntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgVrsn() != null) {
			eventdefinitionjurisdictioncoding.setVersion(e.getEvntDfnJrsdctnCdgVrsn());
		}
		/******************** EvntDfn_Jrsdctn_Txt ********************************************************************************/
		if(e.getEvntDfnJrsdctnTxt() != null) {
			eventdefinitionjurisdiction.setText(e.getEvntDfnJrsdctnTxt());
		}
		/******************** EvntDfn_LastReviewDt ********************************************************************************/
		if(e.getEvntDfnLastReviewDt() != null) {
			java.text.SimpleDateFormat EvntDfn_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_LastReviewDtdate = EvntDfn_LastReviewDtsdf.parse(e.getEvntDfnLastReviewDt());
			eventdefinition.setLastReviewDate(EvntDfn_LastReviewDtdate);
		}
		/******************** EvntDfn_Nm ********************************************************************************/
		if(e.getEvntDfnNm() != null) {
			eventdefinition.setName(e.getEvntDfnNm());
		}
		/******************** EvntDfn_Pblshr ********************************************************************************/
		if(e.getEvntDfnPblshr() != null) {
			eventdefinition.setPublisher(e.getEvntDfnPblshr());
		}
		/******************** EvntDfn_Prpse ********************************************************************************/
		if(e.getEvntDfnPrpse() != null) {
			eventdefinition.setPurpose(e.getEvntDfnPrpse());
		}
		/******************** eventdefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact eventdefinitionrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		eventdefinition.addRelatedArtifact(eventdefinitionrelatedartifact);

		/******************** EvntDfn_RltedArtfct_Citation ********************************************************************************/
		if(e.getEvntDfnRltedArtfctCitation() != null) {
			eventdefinitionrelatedartifact.setCitation(e.getEvntDfnRltedArtfctCitation());
		}
		/******************** EvntDfn_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDsply() != null) {
			eventdefinitionrelatedartifact.setDisplay(e.getEvntDfnRltedArtfctDsply());
		}
		/******************** eventdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment eventdefinitionrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		eventdefinitionrelatedartifact.setDocument(eventdefinitionrelatedartifactdocument);

		/******************** EvntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocCntntTyp() != null) {
			eventdefinitionrelatedartifactdocument.setContentType(e.getEvntDfnRltedArtfctDocCntntTyp());
		}
		/******************** EvntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat EvntDfn_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_RltedArtfct_Doc_Creationdate = EvntDfn_RltedArtfct_Doc_Creationsdf.parse(e.getEvntDfnRltedArtfctDocCreation());
			eventdefinitionrelatedartifactdocument.setCreation(EvntDfn_RltedArtfct_Doc_Creationdate);
		}
		/******************** EvntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocData() != null) {
			eventdefinitionrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEvntDfnRltedArtfctDocData()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocHash() != null) {
			eventdefinitionrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEvntDfnRltedArtfctDocHash()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocLnguage() != null) {
			eventdefinitionrelatedartifactdocument.setLanguage(e.getEvntDfnRltedArtfctDocLnguage());
		}
		/******************** EvntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocSz() != null) {
			eventdefinitionrelatedartifactdocument.setSize(Integer.parseInt(e.getEvntDfnRltedArtfctDocSz()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocTtl() != null) {
			eventdefinitionrelatedartifactdocument.setTitle(e.getEvntDfnRltedArtfctDocTtl());
		}
		/******************** EvntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocUrl() != null) {
			eventdefinitionrelatedartifactdocument.setUrl(e.getEvntDfnRltedArtfctDocUrl());
		}
		/******************** EvntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEvntDfnRltedArtfctLbl() != null) {
			eventdefinitionrelatedartifact.setLabel(e.getEvntDfnRltedArtfctLbl());
		}
		/******************** EvntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEvntDfnRltedArtfctRsrc() != null) {
			eventdefinitionrelatedartifact.setResource(e.getEvntDfnRltedArtfctRsrc());
		}
		/******************** eventdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory eventdefinitionrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		eventdefinitionrelatedartifact.setType(eventdefinitionrelatedartifacttype.fromCode(e.getEvntDfnRltedArtfctTyp()));

		/******************** EvntDfn_RltedArtfct_Url ********************************************************************************/
		if(e.getEvntDfnRltedArtfctUrl() != null) {
			eventdefinitionrelatedartifact.setUrl(e.getEvntDfnRltedArtfctUrl());
		}
		/******************** eventdefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitionreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		eventdefinition.addReviewer(eventdefinitionreviewer);

		/******************** EvntDfn_Rviewr_Nm ********************************************************************************/
		if(e.getEvntDfnRviewrNm() != null) {
			eventdefinitionreviewer.setName(e.getEvntDfnRviewrNm());
		}
		/******************** eventdefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitionreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		eventdefinitionreviewer.addTelecom(eventdefinitionreviewertelecom);

		/******************** eventdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitionreviewertelecom.setPeriod(eventdefinitionreviewertelecomperiod);

		/******************** EvntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Rviewr_Tlcm_Prd_Enddate = EvntDfn_Rviewr_Tlcm_Prd_Endsdf.parse(e.getEvntDfnRviewrTlcmPrdEnd());
			eventdefinitionreviewertelecomperiod.setEnd(EvntDfn_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** EvntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Rviewr_Tlcm_Prd_Strtdate = EvntDfn_Rviewr_Tlcm_Prd_Strtsdf.parse(e.getEvntDfnRviewrTlcmPrdStrt());
			eventdefinitionreviewertelecomperiod.setStart(EvntDfn_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** EvntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmRnk() != null) {
			eventdefinitionreviewertelecom.setRank(Integer.parseInt(e.getEvntDfnRviewrTlcmRnk()));
		}
		/******************** eventdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory eventdefinitionreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		eventdefinitionreviewertelecom.setSystem(eventdefinitionreviewertelecomsystem.fromCode(e.getEvntDfnRviewrTlcmSys()));

		/******************** eventdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory eventdefinitionreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		eventdefinitionreviewertelecom.setUse(eventdefinitionreviewertelecomuse.fromCode(e.getEvntDfnRviewrTlcmUse()));

		/******************** EvntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmVl() != null) {
			eventdefinitionreviewertelecom.setValue(e.getEvntDfnRviewrTlcmVl());
		}
		/******************** eventdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory eventdefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		eventdefinition.setStatus(eventdefinitionstatus.fromCode(e.getEvntDfnSts()));

		/******************** eventdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinition.setSubject(eventdefinitionsubjectcodeableconcept);

		/******************** eventdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitionsubjectcodeableconcept.addCoding(eventdefinitionsubjectcodeableconceptcoding);

		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgCd() != null) {
			eventdefinitionsubjectcodeableconceptcoding.setCode(e.getEvntDfnSbjctCdbleCncptCdgCd());
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgDsply() != null) {
			eventdefinitionsubjectcodeableconceptcoding.setDisplay(e.getEvntDfnSbjctCdbleCncptCdgDsply());
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgSys() != null) {
			eventdefinitionsubjectcodeableconceptcoding.setSystem(e.getEvntDfnSbjctCdbleCncptCdgSys());
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgUsrSltd() != null) {
			eventdefinitionsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgVrsn() != null) {
			eventdefinitionsubjectcodeableconceptcoding.setVersion(e.getEvntDfnSbjctCdbleCncptCdgVrsn());
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptTxt() != null) {
			eventdefinitionsubjectcodeableconcept.setText(e.getEvntDfnSbjctCdbleCncptTxt());
		}
		/******************** EvntDfn_SbjctRfrnc ********************************************************************************/
		if(e.getEvntDfnSbjctRfrnc() != null) {
			eventdefinition.setSubject( new org.hl7.fhir.r4.model.Reference(e.getEvntDfnSbjctRfrnc()));
		}
		/******************** EvntDfn_Subtitle ********************************************************************************/
		if(e.getEvntDfnSubtitle() != null) {
			eventdefinition.setSubtitle(e.getEvntDfnSubtitle());
		}
		/******************** EvntDfn_Ttl ********************************************************************************/
		if(e.getEvntDfnTtl() != null) {
			eventdefinition.setTitle(e.getEvntDfnTtl());
		}
		/******************** eventdefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinition.addTopic(eventdefinitiontopic);

		/******************** eventdefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontopiccoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitiontopic.addCoding(eventdefinitiontopiccoding);

		/******************** EvntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnTopicCdgCd() != null) {
			eventdefinitiontopiccoding.setCode(e.getEvntDfnTopicCdgCd());
		}
		/******************** EvntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnTopicCdgDsply() != null) {
			eventdefinitiontopiccoding.setDisplay(e.getEvntDfnTopicCdgDsply());
		}
		/******************** EvntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnTopicCdgSys() != null) {
			eventdefinitiontopiccoding.setSystem(e.getEvntDfnTopicCdgSys());
		}
		/******************** EvntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTopicCdgUsrSltd() != null) {
			eventdefinitiontopiccoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnTopicCdgUsrSltd()));
		}
		/******************** EvntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnTopicCdgVrsn() != null) {
			eventdefinitiontopiccoding.setVersion(e.getEvntDfnTopicCdgVrsn());
		}
		/******************** EvntDfn_Topic_Txt ********************************************************************************/
		if(e.getEvntDfnTopicTxt() != null) {
			eventdefinitiontopic.setText(e.getEvntDfnTopicTxt());
		}
		/******************** eventdefinitiontrigger ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition eventdefinitiontrigger =  new org.hl7.fhir.r4.model.TriggerDefinition();
		eventdefinition.addTrigger(eventdefinitiontrigger);

		/******************** eventdefinitiontriggercondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression eventdefinitiontriggercondition =  new org.hl7.fhir.r4.model.Expression();
		eventdefinitiontrigger.setCondition(eventdefinitiontriggercondition);

		/******************** EvntDfn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnDscrptn() != null) {
			eventdefinitiontriggercondition.setDescription(e.getEvntDfnTrgrCndtnDscrptn());
		}
		/******************** EvntDfn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnExprsn() != null) {
			eventdefinitiontriggercondition.setExpression(e.getEvntDfnTrgrCndtnExprsn());
		}
		/******************** EvntDfn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnLnguage() != null) {
			eventdefinitiontriggercondition.setLanguage(e.getEvntDfnTrgrCndtnLnguage());
		}
		/******************** EvntDfn_Trgr_Cndtn_Nm ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnNm() != null) {
			eventdefinitiontriggercondition.setName(e.getEvntDfnTrgrCndtnNm());
		}
		/******************** EvntDfn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnRfrnc() != null) {
			eventdefinitiontriggercondition.setReference(e.getEvntDfnTrgrCndtnRfrnc());
		}
		/******************** eventdefinitiontriggerdata ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement eventdefinitiontriggerdata =  new org.hl7.fhir.r4.model.DataRequirement();
		eventdefinitiontrigger.addData(eventdefinitiontriggerdata);

		/******************** eventdefinitiontriggerdatacodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent eventdefinitiontriggerdatacodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		eventdefinitiontriggerdata.addCodeFilter(eventdefinitiontriggerdatacodefilter);

		/******************** eventdefinitiontriggerdatacodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontriggerdatacodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitiontriggerdatacodefilter.addCode(eventdefinitiontriggerdatacodefiltercode);

		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdCd() != null) {
			eventdefinitiontriggerdatacodefiltercode.setCode(e.getEvntDfnTrgrDataCdFltrCdCd());
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdDsply() != null) {
			eventdefinitiontriggerdatacodefiltercode.setDisplay(e.getEvntDfnTrgrDataCdFltrCdDsply());
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdSys() != null) {
			eventdefinitiontriggerdatacodefiltercode.setSystem(e.getEvntDfnTrgrDataCdFltrCdSys());
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdUsrSltd() != null) {
			eventdefinitiontriggerdatacodefiltercode.setUserSelected(Boolean.parseBoolean(e.getEvntDfnTrgrDataCdFltrCdUsrSltd()));
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdVrsn() != null) {
			eventdefinitiontriggerdatacodefiltercode.setVersion(e.getEvntDfnTrgrDataCdFltrCdVrsn());
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrPath() != null) {
			eventdefinitiontriggerdatacodefilter.setPath(e.getEvntDfnTrgrDataCdFltrPath());
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrSrchParam() != null) {
			eventdefinitiontriggerdatacodefilter.setSearchParam(e.getEvntDfnTrgrDataCdFltrSrchParam());
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrVlSt() != null) {
			eventdefinitiontriggerdatacodefilter.setValueSet(e.getEvntDfnTrgrDataCdFltrVlSt());
		}
		/******************** eventdefinitiontriggerdatadatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent eventdefinitiontriggerdatadatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		eventdefinitiontriggerdata.addDateFilter(eventdefinitiontriggerdatadatefilter);

		/******************** EvntDfn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrPath() != null) {
			eventdefinitiontriggerdatadatefilter.setPath(e.getEvntDfnTrgrDataDtFltrPath());
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrSrchParam() != null) {
			eventdefinitiontriggerdatadatefilter.setSearchParam(e.getEvntDfnTrgrDataDtFltrSrchParam());
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDtTimeTyp() != null) {
			eventdefinitiontriggerdatadatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(e.getEvntDfnTrgrDataDtFltrVlDtTimeTyp()));
		}
		/******************** eventdefinitiontriggerdatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration eventdefinitiontriggerdatadatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		eventdefinitiontriggerdatadatefilter.setValue(eventdefinitiontriggerdatadatefiltervalueduration);

		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationCd() != null) {
			eventdefinitiontriggerdatadatefiltervalueduration.setCode(e.getEvntDfnTrgrDataDtFltrVlDurationCd());
		}
		/******************** eventdefinitiontriggerdatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitiontriggerdatadatefiltervaluedurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitiontriggerdatadatefiltervalueduration.setComparator(eventdefinitiontriggerdatadatefiltervaluedurationcomparator.fromCode(e.getEvntDfnTrgrDataDtFltrVlDurationCmprtr()));

		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationSys() != null) {
			eventdefinitiontriggerdatadatefiltervalueduration.setSystem(e.getEvntDfnTrgrDataDtFltrVlDurationSys());
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationUnt() != null) {
			eventdefinitiontriggerdatadatefiltervalueduration.setUnit(e.getEvntDfnTrgrDataDtFltrVlDurationUnt());
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationVl() != null) {
			eventdefinitiontriggerdatadatefiltervalueduration.setValue(Double.parseDouble((e.getEvntDfnTrgrDataDtFltrVlDurationVl())));
		}
		/******************** eventdefinitiontriggerdatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitiontriggerdatadatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitiontriggerdatadatefilter.setValue(eventdefinitiontriggerdatadatefiltervalueperiod);

		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Trgr_Data_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Trgr_Data_DtFltr_VlPrd_Enddate = EvntDfn_Trgr_Data_DtFltr_VlPrd_Endsdf.parse(e.getEvntDfnTrgrDataDtFltrVlPrdEnd());
			eventdefinitiontriggerdatadatefiltervalueperiod.setEnd(EvntDfn_Trgr_Data_DtFltr_VlPrd_Enddate);
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Trgr_Data_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Trgr_Data_DtFltr_VlPrd_Strtdate = EvntDfn_Trgr_Data_DtFltr_VlPrd_Strtsdf.parse(e.getEvntDfnTrgrDataDtFltrVlPrdStrt());
			eventdefinitiontriggerdatadatefiltervalueperiod.setStart(EvntDfn_Trgr_Data_DtFltr_VlPrd_Strtdate);
		}
		/******************** EvntDfn_Trgr_Data_Lmt ********************************************************************************/
		if(e.getEvntDfnTrgrDataLmt() != null) {
			eventdefinitiontriggerdata.setLimit(Integer.parseInt(e.getEvntDfnTrgrDataLmt()));
		}
		/******************** EvntDfn_Trgr_Data_MustSupport ********************************************************************************/
		if(e.getEvntDfnTrgrDataMustSupport() != null) {
			eventdefinitiontriggerdata.addMustSupport(e.getEvntDfnTrgrDataMustSupport());
		}
		/******************** EvntDfn_Trgr_Data_Profile ********************************************************************************/
		if(e.getEvntDfnTrgrDataProfile() != null) {
			eventdefinitiontriggerdata.addProfile(e.getEvntDfnTrgrDataProfile());
		}
		/******************** eventdefinitiontriggerdatasort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent eventdefinitiontriggerdatasort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		eventdefinitiontriggerdata.addSort(eventdefinitiontriggerdatasort);

		/******************** eventdefinitiontriggerdatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory eventdefinitiontriggerdatasortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		eventdefinitiontriggerdatasort.setDirection(eventdefinitiontriggerdatasortdirection.fromCode(e.getEvntDfnTrgrDataSortDirection()));

		/******************** EvntDfn_Trgr_Data_Sort_Path ********************************************************************************/
		if(e.getEvntDfnTrgrDataSortPath() != null) {
			eventdefinitiontriggerdatasort.setPath(e.getEvntDfnTrgrDataSortPath());
		}
		/******************** eventdefinitiontriggerdatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontriggerdatasubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinitiontriggerdata.setSubject(eventdefinitiontriggerdatasubjectcodeableconcept);

		/******************** eventdefinitiontriggerdatasubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontriggerdatasubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitiontriggerdatasubjectcodeableconcept.addCoding(eventdefinitiontriggerdatasubjectcodeableconceptcoding);

		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgCd() != null) {
			eventdefinitiontriggerdatasubjectcodeableconceptcoding.setCode(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgCd());
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgDsply() != null) {
			eventdefinitiontriggerdatasubjectcodeableconceptcoding.setDisplay(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgDsply());
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgSys() != null) {
			eventdefinitiontriggerdatasubjectcodeableconceptcoding.setSystem(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgSys());
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd() != null) {
			eventdefinitiontriggerdatasubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn() != null) {
			eventdefinitiontriggerdatasubjectcodeableconceptcoding.setVersion(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn());
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptTxt() != null) {
			eventdefinitiontriggerdatasubjectcodeableconcept.setText(e.getEvntDfnTrgrDataSbjctCdbleCncptTxt());
		}
		/******************** EvntDfn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctRfrnc() != null) {
			eventdefinitiontriggerdata.setSubject( new org.hl7.fhir.r4.model.Reference(e.getEvntDfnTrgrDataSbjctRfrnc()));
		}
		/******************** EvntDfn_Trgr_Data_Typ ********************************************************************************/
		if(e.getEvntDfnTrgrDataTyp() != null) {
			eventdefinitiontriggerdata.setType(e.getEvntDfnTrgrDataTyp());
		}
		/******************** EvntDfn_Trgr_Nm ********************************************************************************/
		if(e.getEvntDfnTrgrNm() != null) {
			eventdefinitiontrigger.setName(e.getEvntDfnTrgrNm());
		}
		/******************** EvntDfn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(e.getEvntDfnTrgrTmgDtTimeTyp() != null) {
			eventdefinitiontrigger.setTiming( new org.hl7.fhir.r4.model.DateTimeType(e.getEvntDfnTrgrTmgDtTimeTyp()));
		}
		/******************** EvntDfn_Trgr_TmgDtTyp ********************************************************************************/
		if(e.getEvntDfnTrgrTmgDtTyp() != null) {
			eventdefinitiontrigger.setTiming( new org.hl7.fhir.r4.model.DateType(e.getEvntDfnTrgrTmgDtTyp()));
		}
		/******************** EvntDfn_Trgr_TmgRfrnc ********************************************************************************/
		if(e.getEvntDfnTrgrTmgRfrnc() != null) {
			eventdefinitiontrigger.setTiming( new org.hl7.fhir.r4.model.Reference(e.getEvntDfnTrgrTmgRfrnc()));
		}
		/******************** eventdefinitiontriggertimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing eventdefinitiontriggertimingtiming =  new org.hl7.fhir.r4.model.Timing();
		eventdefinitiontrigger.setTiming(eventdefinitiontriggertimingtiming);

		/******************** eventdefinitiontriggertimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontriggertimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinitiontriggertimingtiming.setCode(eventdefinitiontriggertimingtimingcode);

		/******************** eventdefinitiontriggertimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontriggertimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitiontriggertimingtimingcode.addCoding(eventdefinitiontriggertimingtimingcodecoding);

		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgCd() != null) {
			eventdefinitiontriggertimingtimingcodecoding.setCode(e.getEvntDfnTrgrTmgTmgCdCdgCd());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgDsply() != null) {
			eventdefinitiontriggertimingtimingcodecoding.setDisplay(e.getEvntDfnTrgrTmgTmgCdCdgDsply());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgSys() != null) {
			eventdefinitiontriggertimingtimingcodecoding.setSystem(e.getEvntDfnTrgrTmgTmgCdCdgSys());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgUsrSltd() != null) {
			eventdefinitiontriggertimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnTrgrTmgTmgCdCdgUsrSltd()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgVrsn() != null) {
			eventdefinitiontriggertimingtimingcodecoding.setVersion(e.getEvntDfnTrgrTmgTmgCdCdgVrsn());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdTxt() != null) {
			eventdefinitiontriggertimingtimingcode.setText(e.getEvntDfnTrgrTmgTmgCdTxt());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Evnt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat EvntDfn_Trgr_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Trgr_TmgTmg_Evntdate = EvntDfn_Trgr_TmgTmg_Evntsdf.parse(e.getEvntDfnTrgrTmgTmgEvnt());
			eventdefinitiontriggertimingtiming.addEvent(EvntDfn_Trgr_TmgTmg_Evntdate);
		}
		/******************** eventdefinitiontriggertimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent eventdefinitiontriggertimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		eventdefinitiontriggertimingtiming.setRepeat(eventdefinitiontriggertimingtimingrepeat);

		/******************** eventdefinitiontriggertimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration eventdefinitiontriggertimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		eventdefinitiontriggertimingtimingrepeat.setBounds(eventdefinitiontriggertimingtimingrepeatboundsduration);

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationCd() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsduration.setCode(e.getEvntDfnTrgrTmgTmgRptBndsDurationCd());
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitiontriggertimingtimingrepeatboundsduration.setComparator(eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator.fromCode(e.getEvntDfnTrgrTmgTmgRptBndsDurationCmprtr()));

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationSys() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsduration.setSystem(e.getEvntDfnTrgrTmgTmgRptBndsDurationSys());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationUnt() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsduration.setUnit(e.getEvntDfnTrgrTmgTmgRptBndsDurationUnt());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationVl() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsduration.setValue(Double.parseDouble((e.getEvntDfnTrgrTmgTmgRptBndsDurationVl())));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitiontriggertimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		eventdefinitiontriggertimingtimingrepeat.setBounds(eventdefinitiontriggertimingtimingrepeatboundsperiod);

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Enddate = EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Endsdf.parse(e.getEvntDfnTrgrTmgTmgRptBndsPrdEnd());
			eventdefinitiontriggertimingtimingrepeatboundsperiod.setEnd(EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strtdate = EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(e.getEvntDfnTrgrTmgTmgRptBndsPrdStrt());
			eventdefinitiontriggertimingtimingrepeatboundsperiod.setStart(EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range eventdefinitiontriggertimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		eventdefinitiontriggertimingtimingrepeat.setBounds(eventdefinitiontriggertimingtimingrepeatboundsrange);

		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitiontriggertimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		eventdefinitiontriggertimingtimingrepeatboundsrange.setHigh(eventdefinitiontriggertimingtimingrepeatboundsrangehigh);

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiCd() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangehigh.setCode(e.getEvntDfnTrgrTmgTmgRptBndsRngHiCd());
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitiontriggertimingtimingrepeatboundsrangehigh.setComparator(eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator.fromCode(e.getEvntDfnTrgrTmgTmgRptBndsRngHiCmprtr()));

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiSys() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangehigh.setSystem(e.getEvntDfnTrgrTmgTmgRptBndsRngHiSys());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiUnt() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangehigh.setUnit(e.getEvntDfnTrgrTmgTmgRptBndsRngHiUnt());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiVl() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((e.getEvntDfnTrgrTmgTmgRptBndsRngHiVl())));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitiontriggertimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		eventdefinitiontriggertimingtimingrepeatboundsrange.setLow(eventdefinitiontriggertimingtimingrepeatboundsrangelow);

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwCd() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangelow.setCode(e.getEvntDfnTrgrTmgTmgRptBndsRngLwCd());
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitiontriggertimingtimingrepeatboundsrangelow.setComparator(eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator.fromCode(e.getEvntDfnTrgrTmgTmgRptBndsRngLwCmprtr()));

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwSys() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangelow.setSystem(e.getEvntDfnTrgrTmgTmgRptBndsRngLwSys());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwUnt() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangelow.setUnit(e.getEvntDfnTrgrTmgTmgRptBndsRngLwUnt());
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwVl() != null) {
			eventdefinitiontriggertimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((e.getEvntDfnTrgrTmgTmgRptBndsRngLwVl())));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptCnt() != null) {
			eventdefinitiontriggertimingtimingrepeat.setCount(Integer.parseInt(e.getEvntDfnTrgrTmgTmgRptCnt()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptCntMx() != null) {
			eventdefinitiontriggertimingtimingrepeat.setCountMax(Integer.parseInt(e.getEvntDfnTrgrTmgTmgRptCntMx()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory eventdefinitiontriggertimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		eventdefinitiontriggertimingtimingrepeat.addDayOfWeek(eventdefinitiontriggertimingtimingrepeatdayofweek.fromCode(e.getEvntDfnTrgrTmgTmgRptDayOfWeek()));

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptDuration() != null) {
			eventdefinitiontriggertimingtimingrepeat.setDuration(Double.parseDouble((e.getEvntDfnTrgrTmgTmgRptDuration())));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptDurationMx() != null) {
			eventdefinitiontriggertimingtimingrepeat.setDurationMax(Double.parseDouble((e.getEvntDfnTrgrTmgTmgRptDurationMx())));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory eventdefinitiontriggertimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		eventdefinitiontriggertimingtimingrepeat.setDurationUnit(eventdefinitiontriggertimingtimingrepeatdurationunit.fromCode(e.getEvntDfnTrgrTmgTmgRptDurationUnt()));

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptFrqncy() != null) {
			eventdefinitiontriggertimingtimingrepeat.setFrequency(Integer.parseInt(e.getEvntDfnTrgrTmgTmgRptFrqncy()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptFrqncyMx() != null) {
			eventdefinitiontriggertimingtimingrepeat.setFrequencyMax(Integer.parseInt(e.getEvntDfnTrgrTmgTmgRptFrqncyMx()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptOff() != null) {
			eventdefinitiontriggertimingtimingrepeat.setOffset(Integer.parseInt(e.getEvntDfnTrgrTmgTmgRptOff()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptPrd() != null) {
			eventdefinitiontriggertimingtimingrepeat.setPeriod(Double.parseDouble((e.getEvntDfnTrgrTmgTmgRptPrd())));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptPrdMx() != null) {
			eventdefinitiontriggertimingtimingrepeat.setPeriodMax(new java.math.BigDecimal((e.getEvntDfnTrgrTmgTmgRptPrdMx())));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory eventdefinitiontriggertimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		eventdefinitiontriggertimingtimingrepeat.setPeriodUnit(eventdefinitiontriggertimingtimingrepeatperiodunit.fromCode(e.getEvntDfnTrgrTmgTmgRptPrdUnt()));

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptTimeOfDay() != null) {
			eventdefinitiontriggertimingtimingrepeat.addTimeOfDay(e.getEvntDfnTrgrTmgTmgRptTimeOfDay());
		}
		/******************** eventdefinitiontriggertimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory eventdefinitiontriggertimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		eventdefinitiontriggertimingtimingrepeat.addWhen(eventdefinitiontriggertimingtimingrepeatwhen.fromCode(e.getEvntDfnTrgrTmgTmgRptWhen()));

		/******************** eventdefinitiontriggertype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory eventdefinitiontriggertype =  new org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory();
		eventdefinitiontrigger.setType(eventdefinitiontriggertype.fromCode(e.getEvntDfnTrgrTyp()));

		/******************** EvntDfn_Url ********************************************************************************/
		if(e.getEvntDfnUrl() != null) {
			eventdefinition.setUrl(e.getEvntDfnUrl());
		}
		/******************** EvntDfn_Usg ********************************************************************************/
		if(e.getEvntDfnUsg() != null) {
			eventdefinition.setUsage(e.getEvntDfnUsg());
		}
		/******************** eventdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext eventdefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		eventdefinition.addUseContext(eventdefinitionusecontext);

		/******************** eventdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitionusecontext.setCode(eventdefinitionusecontextcode);

		/******************** EvntDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdCd() != null) {
			eventdefinitionusecontextcode.setCode(e.getEvntDfnUseCntxtCdCd());
		}
		/******************** EvntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdDsply() != null) {
			eventdefinitionusecontextcode.setDisplay(e.getEvntDfnUseCntxtCdDsply());
		}
		/******************** EvntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdSys() != null) {
			eventdefinitionusecontextcode.setSystem(e.getEvntDfnUseCntxtCdSys());
		}
		/******************** EvntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdUsrSltd() != null) {
			eventdefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(e.getEvntDfnUseCntxtCdUsrSltd()));
		}
		/******************** EvntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdVrsn() != null) {
			eventdefinitionusecontextcode.setVersion(e.getEvntDfnUseCntxtCdVrsn());
		}
		/******************** eventdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		eventdefinitionusecontext.setValue(eventdefinitionusecontextvaluecodeableconcept);

		/******************** eventdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		eventdefinitionusecontextvaluecodeableconcept.addCoding(eventdefinitionusecontextvaluecodeableconceptcoding);

		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			eventdefinitionusecontextvaluecodeableconceptcoding.setCode(e.getEvntDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			eventdefinitionusecontextvaluecodeableconceptcoding.setDisplay(e.getEvntDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			eventdefinitionusecontextvaluecodeableconceptcoding.setSystem(e.getEvntDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			eventdefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			eventdefinitionusecontextvaluecodeableconceptcoding.setVersion(e.getEvntDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptTxt() != null) {
			eventdefinitionusecontextvaluecodeableconcept.setText(e.getEvntDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** eventdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		eventdefinitionusecontext.setValue(eventdefinitionusecontextvaluequantity);

		/******************** EvntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyCd() != null) {
			eventdefinitionusecontextvaluequantity.setCode(e.getEvntDfnUseCntxtVlQntyCd());
		}
		/******************** eventdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitionusecontextvaluequantity.setComparator(eventdefinitionusecontextvaluequantitycomparator.fromCode(e.getEvntDfnUseCntxtVlQntyCmprtr()));

		/******************** EvntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntySys() != null) {
			eventdefinitionusecontextvaluequantity.setSystem(e.getEvntDfnUseCntxtVlQntySys());
		}
		/******************** EvntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyUnt() != null) {
			eventdefinitionusecontextvaluequantity.setUnit(e.getEvntDfnUseCntxtVlQntyUnt());
		}
		/******************** EvntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyVl() != null) {
			eventdefinitionusecontextvaluequantity.setValue(Double.parseDouble((e.getEvntDfnUseCntxtVlQntyVl())));
		}
		/******************** eventdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range eventdefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		eventdefinitionusecontext.setValue(eventdefinitionusecontextvaluerange);

		/******************** eventdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		eventdefinitionusecontextvaluerange.setHigh(eventdefinitionusecontextvaluerangehigh);

		/******************** EvntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiCd() != null) {
			eventdefinitionusecontextvaluerangehigh.setCode(e.getEvntDfnUseCntxtVlRngHiCd());
		}
		/******************** eventdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitionusecontextvaluerangehigh.setComparator(eventdefinitionusecontextvaluerangehighcomparator.fromCode(e.getEvntDfnUseCntxtVlRngHiCmprtr()));

		/******************** EvntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiSys() != null) {
			eventdefinitionusecontextvaluerangehigh.setSystem(e.getEvntDfnUseCntxtVlRngHiSys());
		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiUnt() != null) {
			eventdefinitionusecontextvaluerangehigh.setUnit(e.getEvntDfnUseCntxtVlRngHiUnt());
		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiVl() != null) {
			eventdefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((e.getEvntDfnUseCntxtVlRngHiVl())));
		}
		/******************** eventdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		eventdefinitionusecontextvaluerange.setLow(eventdefinitionusecontextvaluerangelow);

		/******************** EvntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwCd() != null) {
			eventdefinitionusecontextvaluerangelow.setCode(e.getEvntDfnUseCntxtVlRngLwCd());
		}
		/******************** eventdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory eventdefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		eventdefinitionusecontextvaluerangelow.setComparator(eventdefinitionusecontextvaluerangelowcomparator.fromCode(e.getEvntDfnUseCntxtVlRngLwCmprtr()));

		/******************** EvntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwSys() != null) {
			eventdefinitionusecontextvaluerangelow.setSystem(e.getEvntDfnUseCntxtVlRngLwSys());
		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwUnt() != null) {
			eventdefinitionusecontextvaluerangelow.setUnit(e.getEvntDfnUseCntxtVlRngLwUnt());
		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwVl() != null) {
			eventdefinitionusecontextvaluerangelow.setValue(Double.parseDouble((e.getEvntDfnUseCntxtVlRngLwVl())));
		}
		/******************** EvntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRfrnc() != null) {
			eventdefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(e.getEvntDfnUseCntxtVlRfrnc()));
		}
		/******************** EvntDfn_Vrsn ********************************************************************************/
		if(e.getEvntDfnVrsn() != null) {
			eventdefinition.setVersion(e.getEvntDfnVrsn());
		}
		return eventdefinition;
	}
}
