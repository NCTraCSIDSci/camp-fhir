package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CodeSystem;
public class CodeSystemConversion 
{
	public org.hl7.fhir.r4.model.CodeSystem CodeSystems(CodeSystem c) throws ParseException
	{
		org.hl7.fhir.r4.model.CodeSystem codesystem = new org.hl7.fhir.r4.model.CodeSystem();

		/******************** id ********************************************************************************/
		codesystem.setId(c.getId());

		/******************** CdSys_CaseSensitive ********************************************************************************/
		if(c.getCdSysCaseSensitive() != null) {
			codesystem.setCaseSensitive(Boolean.parseBoolean(c.getCdSysCaseSensitive()));
		}
		/******************** CdSys_Cmpsitional ********************************************************************************/
		if(c.getCdSysCmpsitional() != null) {
			codesystem.setCompositional(Boolean.parseBoolean(c.getCdSysCmpsitional()));
		}
		/******************** codesystemconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent codesystemconcept =  new org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent();
		codesystem.addConcept(codesystemconcept);

		/******************** CdSys_Cncpt_Cd ********************************************************************************/
		if(c.getCdSysCncptCd() != null) {
			codesystemconcept.setCode(c.getCdSysCncptCd());
		}
		/******************** CdSys_Cncpt_Dfn ********************************************************************************/
		if(c.getCdSysCncptDfn() != null) {
			codesystemconcept.setDefinition(c.getCdSysCncptDfn());
		}
		/******************** codesystemconceptdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent codesystemconceptdesignation =  new org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent();
		codesystemconcept.addDesignation(codesystemconceptdesignation);

		/******************** CdSys_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(c.getCdSysCncptDsgnationLnguage() != null) {
			codesystemconceptdesignation.setLanguage(c.getCdSysCncptDsgnationLnguage());
		}
		/******************** codesystemconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemconceptdesignationuse =  new org.hl7.fhir.r4.model.Coding();
		codesystemconceptdesignation.setUse(codesystemconceptdesignationuse);

		/******************** CdSys_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseCd() != null) {
			codesystemconceptdesignationuse.setCode(c.getCdSysCncptDsgnationUseCd());
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseDsply() != null) {
			codesystemconceptdesignationuse.setDisplay(c.getCdSysCncptDsgnationUseDsply());
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseSys() != null) {
			codesystemconceptdesignationuse.setSystem(c.getCdSysCncptDsgnationUseSys());
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseUsrSltd() != null) {
			codesystemconceptdesignationuse.setUserSelected(Boolean.parseBoolean(c.getCdSysCncptDsgnationUseUsrSltd()));
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseVrsn() != null) {
			codesystemconceptdesignationuse.setVersion(c.getCdSysCncptDsgnationUseVrsn());
		}
		/******************** CdSys_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(c.getCdSysCncptDsgnationVl() != null) {
			codesystemconceptdesignation.setValue(c.getCdSysCncptDsgnationVl());
		}
		/******************** CdSys_Cncpt_Dsply ********************************************************************************/
		if(c.getCdSysCncptDsply() != null) {
			codesystemconcept.setDisplay(c.getCdSysCncptDsply());
		}
		/******************** codesystemconceptproperty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent codesystemconceptproperty =  new org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent();
		codesystemconcept.addProperty(codesystemconceptproperty);

		/******************** CdSys_Cncpt_Prpty_Cd ********************************************************************************/
		if(c.getCdSysCncptPrptyCd() != null) {
			codesystemconceptproperty.setCode(c.getCdSysCncptPrptyCd());
		}
		/******************** CdSys_Cncpt_Prpty_VlBooleanTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlBooleanTyp() != null) {
			codesystemconceptproperty.setValue( new org.hl7.fhir.r4.model.BooleanType(c.getCdSysCncptPrptyVlBooleanTyp()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdTyp() != null) {
			codesystemconceptproperty.setValue( new org.hl7.fhir.r4.model.CodeType(c.getCdSysCncptPrptyVlCdTyp()));
		}
		/******************** codesystemconceptpropertyvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemconceptpropertyvaluecoding =  new org.hl7.fhir.r4.model.Coding();
		codesystemconceptproperty.setValue(codesystemconceptpropertyvaluecoding);

		/******************** CdSys_Cncpt_Prpty_VlCdg_Cd ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgCd() != null) {
			codesystemconceptpropertyvaluecoding.setCode(c.getCdSysCncptPrptyVlCdgCd());
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Dsply ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgDsply() != null) {
			codesystemconceptpropertyvaluecoding.setDisplay(c.getCdSysCncptPrptyVlCdgDsply());
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Sys ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgSys() != null) {
			codesystemconceptpropertyvaluecoding.setSystem(c.getCdSysCncptPrptyVlCdgSys());
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_UsrSltd ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgUsrSltd() != null) {
			codesystemconceptpropertyvaluecoding.setUserSelected(Boolean.parseBoolean(c.getCdSysCncptPrptyVlCdgUsrSltd()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Vrsn ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgVrsn() != null) {
			codesystemconceptpropertyvaluecoding.setVersion(c.getCdSysCncptPrptyVlCdgVrsn());
		}
		/******************** CdSys_Cncpt_Prpty_VlDtTimeTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlDtTimeTyp() != null) {
			codesystemconceptproperty.setValue( new org.hl7.fhir.r4.model.DateTimeType(c.getCdSysCncptPrptyVlDtTimeTyp()));
		}
		/******************** CdSys_Cncpt_Prpty_VlDecimalTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlDecimalTyp() != null) {
			codesystemconceptproperty.setValue( new org.hl7.fhir.r4.model.DecimalType(c.getCdSysCncptPrptyVlDecimalTyp()));
		}
		/******************** CdSys_Cncpt_Prpty_VlIntegerTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlIntegerTyp() != null) {
			codesystemconceptproperty.setValue( new org.hl7.fhir.r4.model.IntegerType(c.getCdSysCncptPrptyVlIntegerTyp()));
		}
		/******************** CdSys_Cncpt_Prpty_VlStrgTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlStrgTyp() != null) {
			codesystemconceptproperty.setValue( new org.hl7.fhir.r4.model.StringType(c.getCdSysCncptPrptyVlStrgTyp()));
		}
		/******************** codesystemcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail codesystemcontact =  new org.hl7.fhir.r4.model.ContactDetail();
		codesystem.addContact(codesystemcontact);

		/******************** CdSys_Cntct_Nm ********************************************************************************/
		if(c.getCdSysCntctNm() != null) {
			codesystemcontact.setName(c.getCdSysCntctNm());
		}
		/******************** codesystemcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint codesystemcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		codesystemcontact.addTelecom(codesystemcontacttelecom);

		/******************** codesystemcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period codesystemcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		codesystemcontacttelecom.setPeriod(codesystemcontacttelecomperiod);

		/******************** CdSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCdSysCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat CdSys_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CdSys_Cntct_Tlcm_Prd_Enddate = CdSys_Cntct_Tlcm_Prd_Endsdf.parse(c.getCdSysCntctTlcmPrdEnd());
			codesystemcontacttelecomperiod.setEnd(CdSys_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** CdSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCdSysCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat CdSys_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CdSys_Cntct_Tlcm_Prd_Strtdate = CdSys_Cntct_Tlcm_Prd_Strtsdf.parse(c.getCdSysCntctTlcmPrdStrt());
			codesystemcontacttelecomperiod.setStart(CdSys_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** CdSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCdSysCntctTlcmRnk() != null) {
			codesystemcontacttelecom.setRank(Integer.parseInt(c.getCdSysCntctTlcmRnk()));
		}
		/******************** codesystemcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory codesystemcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		codesystemcontacttelecom.setSystem(codesystemcontacttelecomsystem.fromCode(c.getCdSysCntctTlcmSys()));

		/******************** codesystemcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory codesystemcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		codesystemcontacttelecom.setUse(codesystemcontacttelecomuse.fromCode(c.getCdSysCntctTlcmUse()));

		/******************** CdSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCdSysCntctTlcmVl() != null) {
			codesystemcontacttelecom.setValue(c.getCdSysCntctTlcmVl());
		}
		/******************** codesystemcontent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentModeEnumFactory codesystemcontent =  new org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentModeEnumFactory();
		codesystem.setContent(codesystemcontent.fromCode(c.getCdSysCntnt()));

		/******************** CdSys_Copyright ********************************************************************************/
		if(c.getCdSysCopyright() != null) {
			codesystem.setCopyright(c.getCdSysCopyright());
		}
		/******************** CdSys_Cnt ********************************************************************************/
		if(c.getCdSysCnt() != null) {
			codesystem.setCount(Integer.parseInt(c.getCdSysCnt()));
		}
		/******************** CdSys_Dt ********************************************************************************/
		if(c.getCdSysDt() != null) {
			java.text.SimpleDateFormat CdSys_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CdSys_Dtdate = CdSys_Dtsdf.parse(c.getCdSysDt());
			codesystem.setDate(CdSys_Dtdate);
		}
		/******************** CdSys_Dscrptn ********************************************************************************/
		if(c.getCdSysDscrptn() != null) {
			codesystem.setDescription(c.getCdSysDscrptn());
		}
		/******************** CdSys_Exprmtl ********************************************************************************/
		if(c.getCdSysExprmtl() != null) {
			codesystem.setExperimental(Boolean.parseBoolean(c.getCdSysExprmtl()));
		}
		/******************** codesystemfilter ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent codesystemfilter =  new org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent();
		codesystem.addFilter(codesystemfilter);

		/******************** CdSys_Fltr_Cd ********************************************************************************/
		if(c.getCdSysFltrCd() != null) {
			codesystemfilter.setCode(c.getCdSysFltrCd());
		}
		/******************** CdSys_Fltr_Dscrptn ********************************************************************************/
		if(c.getCdSysFltrDscrptn() != null) {
			codesystemfilter.setDescription(c.getCdSysFltrDscrptn());
		}
		/******************** codesystemfilteroperator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.FilterOperatorEnumFactory codesystemfilteroperator =  new org.hl7.fhir.r4.model.CodeSystem.FilterOperatorEnumFactory();
		codesystemfilter.addOperator(codesystemfilteroperator.fromCode(c.getCdSysFltrOperator()));

		/******************** CdSys_Fltr_Vl ********************************************************************************/
		if(c.getCdSysFltrVl() != null) {
			codesystemfilter.setValue(c.getCdSysFltrVl());
		}
		/******************** codesystemhierarchymeaning ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaningEnumFactory codesystemhierarchymeaning =  new org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaningEnumFactory();
		codesystem.setHierarchyMeaning(codesystemhierarchymeaning.fromCode(c.getCdSysHierarchyMeaning()));

		/******************** codesystemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier codesystemidentifier =  new org.hl7.fhir.r4.model.Identifier();
		codesystem.addIdentifier(codesystemidentifier);

		/******************** CdSys_Id_Assigner ********************************************************************************/
		if(c.getCdSysIdAssigner() != null) {
			codesystemidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCdSysIdAssigner()));
		}
		/******************** codesystemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period codesystemidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		codesystemidentifier.setPeriod(codesystemidentifierperiod);

		/******************** CdSys_Id_Prd_End ********************************************************************************/
		if(c.getCdSysIdPrdEnd() != null) {
			java.text.SimpleDateFormat CdSys_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CdSys_Id_Prd_Enddate = CdSys_Id_Prd_Endsdf.parse(c.getCdSysIdPrdEnd());
			codesystemidentifierperiod.setEnd(CdSys_Id_Prd_Enddate);
		}
		/******************** CdSys_Id_Prd_Strt ********************************************************************************/
		if(c.getCdSysIdPrdStrt() != null) {
			java.text.SimpleDateFormat CdSys_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CdSys_Id_Prd_Strtdate = CdSys_Id_Prd_Strtsdf.parse(c.getCdSysIdPrdStrt());
			codesystemidentifierperiod.setStart(CdSys_Id_Prd_Strtdate);
		}
		/******************** CdSys_Id_Sys ********************************************************************************/
		if(c.getCdSysIdSys() != null) {
			codesystemidentifier.setSystem(c.getCdSysIdSys());
		}
		/******************** codesystemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		codesystemidentifier.setType(codesystemidentifiertype);

		/******************** codesystemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		codesystemidentifiertype.addCoding(codesystemidentifiertypecoding);

		/******************** CdSys_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCdSysIdTypCdgCd() != null) {
			codesystemidentifiertypecoding.setCode(c.getCdSysIdTypCdgCd());
		}
		/******************** CdSys_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCdSysIdTypCdgDsply() != null) {
			codesystemidentifiertypecoding.setDisplay(c.getCdSysIdTypCdgDsply());
		}
		/******************** CdSys_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCdSysIdTypCdgSys() != null) {
			codesystemidentifiertypecoding.setSystem(c.getCdSysIdTypCdgSys());
		}
		/******************** CdSys_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCdSysIdTypCdgUsrSltd() != null) {
			codesystemidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCdSysIdTypCdgUsrSltd()));
		}
		/******************** CdSys_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCdSysIdTypCdgVrsn() != null) {
			codesystemidentifiertypecoding.setVersion(c.getCdSysIdTypCdgVrsn());
		}
		/******************** CdSys_Id_Typ_Txt ********************************************************************************/
		if(c.getCdSysIdTypTxt() != null) {
			codesystemidentifiertype.setText(c.getCdSysIdTypTxt());
		}
		/******************** codesystemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory codesystemidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		codesystemidentifier.setUse(codesystemidentifieruse.fromCode(c.getCdSysIdUse()));

		/******************** CdSys_Id_Vl ********************************************************************************/
		if(c.getCdSysIdVl() != null) {
			codesystemidentifier.setValue(c.getCdSysIdVl());
		}
		/******************** codesystemjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		codesystem.addJurisdiction(codesystemjurisdiction);

		/******************** codesystemjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		codesystemjurisdiction.addCoding(codesystemjurisdictioncoding);

		/******************** CdSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getCdSysJrsdctnCdgCd() != null) {
			codesystemjurisdictioncoding.setCode(c.getCdSysJrsdctnCdgCd());
		}
		/******************** CdSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getCdSysJrsdctnCdgDsply() != null) {
			codesystemjurisdictioncoding.setDisplay(c.getCdSysJrsdctnCdgDsply());
		}
		/******************** CdSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getCdSysJrsdctnCdgSys() != null) {
			codesystemjurisdictioncoding.setSystem(c.getCdSysJrsdctnCdgSys());
		}
		/******************** CdSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCdSysJrsdctnCdgUsrSltd() != null) {
			codesystemjurisdictioncoding.setUserSelected(Boolean.parseBoolean(c.getCdSysJrsdctnCdgUsrSltd()));
		}
		/******************** CdSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCdSysJrsdctnCdgVrsn() != null) {
			codesystemjurisdictioncoding.setVersion(c.getCdSysJrsdctnCdgVrsn());
		}
		/******************** CdSys_Jrsdctn_Txt ********************************************************************************/
		if(c.getCdSysJrsdctnTxt() != null) {
			codesystemjurisdiction.setText(c.getCdSysJrsdctnTxt());
		}
		/******************** CdSys_Nm ********************************************************************************/
		if(c.getCdSysNm() != null) {
			codesystem.setName(c.getCdSysNm());
		}
		/******************** codesystemproperty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.PropertyComponent codesystemproperty =  new org.hl7.fhir.r4.model.CodeSystem.PropertyComponent();
		codesystem.addProperty(codesystemproperty);

		/******************** CdSys_Prpty_Cd ********************************************************************************/
		if(c.getCdSysPrptyCd() != null) {
			codesystemproperty.setCode(c.getCdSysPrptyCd());
		}
		/******************** CdSys_Prpty_Dscrptn ********************************************************************************/
		if(c.getCdSysPrptyDscrptn() != null) {
			codesystemproperty.setDescription(c.getCdSysPrptyDscrptn());
		}
		/******************** codesystempropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.PropertyTypeEnumFactory codesystempropertytype =  new org.hl7.fhir.r4.model.CodeSystem.PropertyTypeEnumFactory();
		codesystemproperty.setType(codesystempropertytype.fromCode(c.getCdSysPrptyTyp()));

		/******************** CdSys_Prpty_Uri ********************************************************************************/
		if(c.getCdSysPrptyUri() != null) {
			codesystemproperty.setUri(c.getCdSysPrptyUri());
		}
		/******************** CdSys_Pblshr ********************************************************************************/
		if(c.getCdSysPblshr() != null) {
			codesystem.setPublisher(c.getCdSysPblshr());
		}
		/******************** CdSys_Prpse ********************************************************************************/
		if(c.getCdSysPrpse() != null) {
			codesystem.setPurpose(c.getCdSysPrpse());
		}
		/******************** codesystemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory codesystemstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		codesystem.setStatus(codesystemstatus.fromCode(c.getCdSysSts()));

		/******************** CdSys_Supplements ********************************************************************************/
		if(c.getCdSysSupplements() != null) {
			codesystem.setSupplements(c.getCdSysSupplements());
		}
		/******************** CdSys_Ttl ********************************************************************************/
		if(c.getCdSysTtl() != null) {
			codesystem.setTitle(c.getCdSysTtl());
		}
		/******************** CdSys_Url ********************************************************************************/
		if(c.getCdSysUrl() != null) {
			codesystem.setUrl(c.getCdSysUrl());
		}
		/******************** codesystemusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext codesystemusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		codesystem.addUseContext(codesystemusecontext);

		/******************** codesystemusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		codesystemusecontext.setCode(codesystemusecontextcode);

		/******************** CdSys_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtCdCd() != null) {
			codesystemusecontextcode.setCode(c.getCdSysUseCntxtCdCd());
		}
		/******************** CdSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCdSysUseCntxtCdDsply() != null) {
			codesystemusecontextcode.setDisplay(c.getCdSysUseCntxtCdDsply());
		}
		/******************** CdSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtCdSys() != null) {
			codesystemusecontextcode.setSystem(c.getCdSysUseCntxtCdSys());
		}
		/******************** CdSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCdSysUseCntxtCdUsrSltd() != null) {
			codesystemusecontextcode.setUserSelected(Boolean.parseBoolean(c.getCdSysUseCntxtCdUsrSltd()));
		}
		/******************** CdSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCdSysUseCntxtCdVrsn() != null) {
			codesystemusecontextcode.setVersion(c.getCdSysUseCntxtCdVrsn());
		}
		/******************** codesystemusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		codesystemusecontext.setValue(codesystemusecontextvaluecodeableconcept);

		/******************** codesystemusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		codesystemusecontextvaluecodeableconcept.addCoding(codesystemusecontextvaluecodeableconceptcoding);

		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgCd() != null) {
			codesystemusecontextvaluecodeableconceptcoding.setCode(c.getCdSysUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgDsply() != null) {
			codesystemusecontextvaluecodeableconceptcoding.setDisplay(c.getCdSysUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgSys() != null) {
			codesystemusecontextvaluecodeableconceptcoding.setSystem(c.getCdSysUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			codesystemusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCdSysUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgVrsn() != null) {
			codesystemusecontextvaluecodeableconceptcoding.setVersion(c.getCdSysUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptTxt() != null) {
			codesystemusecontextvaluecodeableconcept.setText(c.getCdSysUseCntxtVlCdbleCncptTxt());
		}
		/******************** codesystemusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		codesystemusecontext.setValue(codesystemusecontextvaluequantity);

		/******************** CdSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyCd() != null) {
			codesystemusecontextvaluequantity.setCode(c.getCdSysUseCntxtVlQntyCd());
		}
		/******************** codesystemusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory codesystemusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		codesystemusecontextvaluequantity.setComparator(codesystemusecontextvaluequantitycomparator.fromCode(c.getCdSysUseCntxtVlQntyCmprtr()));

		/******************** CdSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntySys() != null) {
			codesystemusecontextvaluequantity.setSystem(c.getCdSysUseCntxtVlQntySys());
		}
		/******************** CdSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyUnt() != null) {
			codesystemusecontextvaluequantity.setUnit(c.getCdSysUseCntxtVlQntyUnt());
		}
		/******************** CdSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyVl() != null) {
			codesystemusecontextvaluequantity.setValue(Double.parseDouble((c.getCdSysUseCntxtVlQntyVl())));
		}
		/******************** codesystemusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range codesystemusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		codesystemusecontext.setValue(codesystemusecontextvaluerange);

		/******************** codesystemusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		codesystemusecontextvaluerange.setHigh(codesystemusecontextvaluerangehigh);

		/******************** CdSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiCd() != null) {
			codesystemusecontextvaluerangehigh.setCode(c.getCdSysUseCntxtVlRngHiCd());
		}
		/******************** codesystemusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory codesystemusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		codesystemusecontextvaluerangehigh.setComparator(codesystemusecontextvaluerangehighcomparator.fromCode(c.getCdSysUseCntxtVlRngHiCmprtr()));

		/******************** CdSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiSys() != null) {
			codesystemusecontextvaluerangehigh.setSystem(c.getCdSysUseCntxtVlRngHiSys());
		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiUnt() != null) {
			codesystemusecontextvaluerangehigh.setUnit(c.getCdSysUseCntxtVlRngHiUnt());
		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiVl() != null) {
			codesystemusecontextvaluerangehigh.setValue(Double.parseDouble((c.getCdSysUseCntxtVlRngHiVl())));
		}
		/******************** codesystemusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		codesystemusecontextvaluerange.setLow(codesystemusecontextvaluerangelow);

		/******************** CdSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwCd() != null) {
			codesystemusecontextvaluerangelow.setCode(c.getCdSysUseCntxtVlRngLwCd());
		}
		/******************** codesystemusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory codesystemusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		codesystemusecontextvaluerangelow.setComparator(codesystemusecontextvaluerangelowcomparator.fromCode(c.getCdSysUseCntxtVlRngLwCmprtr()));

		/******************** CdSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwSys() != null) {
			codesystemusecontextvaluerangelow.setSystem(c.getCdSysUseCntxtVlRngLwSys());
		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwUnt() != null) {
			codesystemusecontextvaluerangelow.setUnit(c.getCdSysUseCntxtVlRngLwUnt());
		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwVl() != null) {
			codesystemusecontextvaluerangelow.setValue(Double.parseDouble((c.getCdSysUseCntxtVlRngLwVl())));
		}
		/******************** CdSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCdSysUseCntxtVlRfrnc() != null) {
			codesystemusecontext.setValue( new org.hl7.fhir.r4.model.Reference(c.getCdSysUseCntxtVlRfrnc()));
		}
		/******************** CdSys_VlSt ********************************************************************************/
		if(c.getCdSysVlSt() != null) {
			codesystem.setValueSet(c.getCdSysVlSt());
		}
		/******************** CdSys_Vrsn ********************************************************************************/
		if(c.getCdSysVrsn() != null) {
			codesystem.setVersion(c.getCdSysVrsn());
		}
		/******************** CdSys_VrsnNeeded ********************************************************************************/
		if(c.getCdSysVrsnNeeded() != null) {
			codesystem.setVersionNeeded(Boolean.parseBoolean(c.getCdSysVrsnNeeded()));
		}
		return codesystem;
	}
}
