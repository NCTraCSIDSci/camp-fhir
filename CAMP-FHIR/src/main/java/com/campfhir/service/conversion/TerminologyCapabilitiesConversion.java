package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TerminologyCapabilities;
public class TerminologyCapabilitiesConversion 
{
	public org.hl7.fhir.r4.model.TerminologyCapabilities TerminologyCapabilitiess(TerminologyCapabilities t) throws ParseException
	{
		org.hl7.fhir.r4.model.TerminologyCapabilities terminologycapabilities = new org.hl7.fhir.r4.model.TerminologyCapabilities();

		/******************** id ********************************************************************************/
		terminologycapabilities.setId(t.getId());

		/******************** terminologycapabilitiesclosure ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent terminologycapabilitiesclosure =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent();
		terminologycapabilities.setClosure(terminologycapabilitiesclosure);

		/******************** TrminologyCpnlties_Closure_Translation ********************************************************************************/
		if(t.getTrminologyCpnltiesClosureTranslation() != null) {
			terminologycapabilitiesclosure.setTranslation(Boolean.parseBoolean(t.getTrminologyCpnltiesClosureTranslation()));
		}
		/******************** terminologycapabilitiescodesearch ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.CodeSearchSupportEnumFactory terminologycapabilitiescodesearch =  new org.hl7.fhir.r4.model.TerminologyCapabilities.CodeSearchSupportEnumFactory();
		terminologycapabilities.setCodeSearch(terminologycapabilitiescodesearch.fromCode(t.getTrminologyCpnltiesCdSrch()));

		/******************** terminologycapabilitiescodesystem ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent terminologycapabilitiescodesystem =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent();
		terminologycapabilities.addCodeSystem(terminologycapabilitiescodesystem);

		/******************** TrminologyCpnlties_CdSys_Subsumption ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysSubsumption() != null) {
			terminologycapabilitiescodesystem.setSubsumption(Boolean.parseBoolean(t.getTrminologyCpnltiesCdSysSubsumption()));
		}
		/******************** TrminologyCpnlties_CdSys_Uri ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysUri() != null) {
			terminologycapabilitiescodesystem.setUri(t.getTrminologyCpnltiesCdSysUri());
		}
		/******************** terminologycapabilitiescodesystemversion ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent terminologycapabilitiescodesystemversion =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent();
		terminologycapabilitiescodesystem.addVersion(terminologycapabilitiescodesystemversion);

		/******************** TrminologyCpnlties_CdSys_Vrsn_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnCd() != null) {
			terminologycapabilitiescodesystemversion.setCode(t.getTrminologyCpnltiesCdSysVrsnCd());
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Cmpsitional ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnCmpsitional() != null) {
			terminologycapabilitiescodesystemversion.setCompositional(Boolean.parseBoolean(t.getTrminologyCpnltiesCdSysVrsnCmpsitional()));
		}
		/******************** terminologycapabilitiescodesystemversionfilter ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent terminologycapabilitiescodesystemversionfilter =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent();
		terminologycapabilitiescodesystemversion.addFilter(terminologycapabilitiescodesystemversionfilter);

		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnFltrCd() != null) {
			terminologycapabilitiescodesystemversionfilter.setCode(t.getTrminologyCpnltiesCdSysVrsnFltrCd());
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Op ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnFltrOp() != null) {
			terminologycapabilitiescodesystemversionfilter.addOp(t.getTrminologyCpnltiesCdSysVrsnFltrOp());
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_IsDefault ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnIsDefault() != null) {
			terminologycapabilitiescodesystemversion.setIsDefault(Boolean.parseBoolean(t.getTrminologyCpnltiesCdSysVrsnIsDefault()));
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Lnguage ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnLnguage() != null) {
			terminologycapabilitiescodesystemversion.addLanguage(t.getTrminologyCpnltiesCdSysVrsnLnguage());
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Prpty ********************************************************************************/
		if(t.getTrminologyCpnltiesCdSysVrsnPrpty() != null) {
			terminologycapabilitiescodesystemversion.addProperty(t.getTrminologyCpnltiesCdSysVrsnPrpty());
		}
		/******************** terminologycapabilitiescontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail terminologycapabilitiescontact =  new org.hl7.fhir.r4.model.ContactDetail();
		terminologycapabilities.addContact(terminologycapabilitiescontact);

		/******************** TrminologyCpnlties_Cntct_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctNm() != null) {
			terminologycapabilitiescontact.setName(t.getTrminologyCpnltiesCntctNm());
		}
		/******************** terminologycapabilitiescontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint terminologycapabilitiescontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		terminologycapabilitiescontact.addTelecom(terminologycapabilitiescontacttelecom);

		/******************** terminologycapabilitiescontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period terminologycapabilitiescontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		terminologycapabilitiescontacttelecom.setPeriod(terminologycapabilitiescontacttelecomperiod);

		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat TrminologyCpnlties_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TrminologyCpnlties_Cntct_Tlcm_Prd_Enddate = TrminologyCpnlties_Cntct_Tlcm_Prd_Endsdf.parse(t.getTrminologyCpnltiesCntctTlcmPrdEnd());
			terminologycapabilitiescontacttelecomperiod.setEnd(TrminologyCpnlties_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat TrminologyCpnlties_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TrminologyCpnlties_Cntct_Tlcm_Prd_Strtdate = TrminologyCpnlties_Cntct_Tlcm_Prd_Strtsdf.parse(t.getTrminologyCpnltiesCntctTlcmPrdStrt());
			terminologycapabilitiescontacttelecomperiod.setStart(TrminologyCpnlties_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Rnk ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmRnk() != null) {
			terminologycapabilitiescontacttelecom.setRank(Integer.parseInt(t.getTrminologyCpnltiesCntctTlcmRnk()));
		}
		/******************** terminologycapabilitiescontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory terminologycapabilitiescontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		terminologycapabilitiescontacttelecom.setSystem(terminologycapabilitiescontacttelecomsystem.fromCode(t.getTrminologyCpnltiesCntctTlcmSys()));

		/******************** terminologycapabilitiescontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory terminologycapabilitiescontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		terminologycapabilitiescontacttelecom.setUse(terminologycapabilitiescontacttelecomuse.fromCode(t.getTrminologyCpnltiesCntctTlcmUse()));

		/******************** TrminologyCpnlties_Cntct_Tlcm_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesCntctTlcmVl() != null) {
			terminologycapabilitiescontacttelecom.setValue(t.getTrminologyCpnltiesCntctTlcmVl());
		}
		/******************** TrminologyCpnlties_Copyright ********************************************************************************/
		if(t.getTrminologyCpnltiesCopyright() != null) {
			terminologycapabilities.setCopyright(t.getTrminologyCpnltiesCopyright());
		}
		/******************** TrminologyCpnlties_Dt ********************************************************************************/
		if(t.getTrminologyCpnltiesDt() != null) {
			java.text.SimpleDateFormat TrminologyCpnlties_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TrminologyCpnlties_Dtdate = TrminologyCpnlties_Dtsdf.parse(t.getTrminologyCpnltiesDt());
			terminologycapabilities.setDate(TrminologyCpnlties_Dtdate);
		}
		/******************** TrminologyCpnlties_Dscrptn ********************************************************************************/
		if(t.getTrminologyCpnltiesDscrptn() != null) {
			terminologycapabilities.setDescription(t.getTrminologyCpnltiesDscrptn());
		}
		/******************** terminologycapabilitiesexpansion ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent terminologycapabilitiesexpansion =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent();
		terminologycapabilities.setExpansion(terminologycapabilitiesexpansion);

		/******************** TrminologyCpnlties_Expansion_Hierarchical ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionHierarchical() != null) {
			terminologycapabilitiesexpansion.setHierarchical(Boolean.parseBoolean(t.getTrminologyCpnltiesExpansionHierarchical()));
		}
		/******************** TrminologyCpnlties_Expansion_Incomplete ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionIncomplete() != null) {
			terminologycapabilitiesexpansion.setIncomplete(Boolean.parseBoolean(t.getTrminologyCpnltiesExpansionIncomplete()));
		}
		/******************** TrminologyCpnlties_Expansion_Paging ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionPaging() != null) {
			terminologycapabilitiesexpansion.setPaging(Boolean.parseBoolean(t.getTrminologyCpnltiesExpansionPaging()));
		}
		/******************** terminologycapabilitiesexpansionparameter ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent terminologycapabilitiesexpansionparameter =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent();
		terminologycapabilitiesexpansion.addParameter(terminologycapabilitiesexpansionparameter);

		/******************** TrminologyCpnlties_Expansion_Prmtr_Docation ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionPrmtrDocation() != null) {
			terminologycapabilitiesexpansionparameter.setDocumentation(t.getTrminologyCpnltiesExpansionPrmtrDocation());
		}
		/******************** TrminologyCpnlties_Expansion_Prmtr_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionPrmtrNm() != null) {
			terminologycapabilitiesexpansionparameter.setName(t.getTrminologyCpnltiesExpansionPrmtrNm());
		}
		/******************** TrminologyCpnlties_Expansion_TxtFltr ********************************************************************************/
		if(t.getTrminologyCpnltiesExpansionTxtFltr() != null) {
			terminologycapabilitiesexpansion.setTextFilter(t.getTrminologyCpnltiesExpansionTxtFltr());
		}
		/******************** TrminologyCpnlties_Exprmtl ********************************************************************************/
		if(t.getTrminologyCpnltiesExprmtl() != null) {
			terminologycapabilities.setExperimental(Boolean.parseBoolean(t.getTrminologyCpnltiesExprmtl()));
		}
		/******************** terminologycapabilitiesimplementation ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent terminologycapabilitiesimplementation =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent();
		terminologycapabilities.setImplementation(terminologycapabilitiesimplementation);

		/******************** TrminologyCpnlties_Implementation_Dscrptn ********************************************************************************/
		if(t.getTrminologyCpnltiesImplementationDscrptn() != null) {
			terminologycapabilitiesimplementation.setDescription(t.getTrminologyCpnltiesImplementationDscrptn());
		}
		/******************** TrminologyCpnlties_Implementation_Url ********************************************************************************/
		if(t.getTrminologyCpnltiesImplementationUrl() != null) {
			terminologycapabilitiesimplementation.setUrl(t.getTrminologyCpnltiesImplementationUrl());
		}
		/******************** terminologycapabilitiesjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept terminologycapabilitiesjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		terminologycapabilities.addJurisdiction(terminologycapabilitiesjurisdiction);

		/******************** terminologycapabilitiesjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		terminologycapabilitiesjurisdiction.addCoding(terminologycapabilitiesjurisdictioncoding);

		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgCd() != null) {
			terminologycapabilitiesjurisdictioncoding.setCode(t.getTrminologyCpnltiesJrsdctnCdgCd());
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgDsply() != null) {
			terminologycapabilitiesjurisdictioncoding.setDisplay(t.getTrminologyCpnltiesJrsdctnCdgDsply());
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgSys() != null) {
			terminologycapabilitiesjurisdictioncoding.setSystem(t.getTrminologyCpnltiesJrsdctnCdgSys());
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgUsrSltd() != null) {
			terminologycapabilitiesjurisdictioncoding.setUserSelected(Boolean.parseBoolean(t.getTrminologyCpnltiesJrsdctnCdgUsrSltd()));
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnCdgVrsn() != null) {
			terminologycapabilitiesjurisdictioncoding.setVersion(t.getTrminologyCpnltiesJrsdctnCdgVrsn());
		}
		/******************** TrminologyCpnlties_Jrsdctn_Txt ********************************************************************************/
		if(t.getTrminologyCpnltiesJrsdctnTxt() != null) {
			terminologycapabilitiesjurisdiction.setText(t.getTrminologyCpnltiesJrsdctnTxt());
		}
		/******************** terminologycapabilitieskind ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.CapabilityStatementKindEnumFactory terminologycapabilitieskind =  new org.hl7.fhir.r4.model.TerminologyCapabilities.CapabilityStatementKindEnumFactory();
		terminologycapabilities.setKind(terminologycapabilitieskind.fromCode(t.getTrminologyCpnltiesKind()));

		/******************** TrminologyCpnlties_LockedDt ********************************************************************************/
		if(t.getTrminologyCpnltiesLockedDt() != null) {
			terminologycapabilities.setLockedDate(Boolean.parseBoolean(t.getTrminologyCpnltiesLockedDt()));
		}
		/******************** TrminologyCpnlties_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesNm() != null) {
			terminologycapabilities.setName(t.getTrminologyCpnltiesNm());
		}
		/******************** TrminologyCpnlties_Pblshr ********************************************************************************/
		if(t.getTrminologyCpnltiesPblshr() != null) {
			terminologycapabilities.setPublisher(t.getTrminologyCpnltiesPblshr());
		}
		/******************** TrminologyCpnlties_Prpse ********************************************************************************/
		if(t.getTrminologyCpnltiesPrpse() != null) {
			terminologycapabilities.setPurpose(t.getTrminologyCpnltiesPrpse());
		}
		/******************** terminologycapabilitiessoftware ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent terminologycapabilitiessoftware =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent();
		terminologycapabilities.setSoftware(terminologycapabilitiessoftware);

		/******************** TrminologyCpnlties_Software_Nm ********************************************************************************/
		if(t.getTrminologyCpnltiesSoftwareNm() != null) {
			terminologycapabilitiessoftware.setName(t.getTrminologyCpnltiesSoftwareNm());
		}
		/******************** TrminologyCpnlties_Software_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesSoftwareVrsn() != null) {
			terminologycapabilitiessoftware.setVersion(t.getTrminologyCpnltiesSoftwareVrsn());
		}
		/******************** terminologycapabilitiesstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory terminologycapabilitiesstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		terminologycapabilities.setStatus(terminologycapabilitiesstatus.fromCode(t.getTrminologyCpnltiesSts()));

		/******************** TrminologyCpnlties_Ttl ********************************************************************************/
		if(t.getTrminologyCpnltiesTtl() != null) {
			terminologycapabilities.setTitle(t.getTrminologyCpnltiesTtl());
		}
		/******************** terminologycapabilitiestranslation ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent terminologycapabilitiestranslation =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent();
		terminologycapabilities.setTranslation(terminologycapabilitiestranslation);

		/******************** TrminologyCpnlties_Translation_NeedsMap ********************************************************************************/
		if(t.getTrminologyCpnltiesTranslationNeedsMap() != null) {
			terminologycapabilitiestranslation.setNeedsMap(Boolean.parseBoolean(t.getTrminologyCpnltiesTranslationNeedsMap()));
		}
		/******************** TrminologyCpnlties_Url ********************************************************************************/
		if(t.getTrminologyCpnltiesUrl() != null) {
			terminologycapabilities.setUrl(t.getTrminologyCpnltiesUrl());
		}
		/******************** terminologycapabilitiesusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext terminologycapabilitiesusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		terminologycapabilities.addUseContext(terminologycapabilitiesusecontext);

		/******************** terminologycapabilitiesusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		terminologycapabilitiesusecontext.setCode(terminologycapabilitiesusecontextcode);

		/******************** TrminologyCpnlties_UseCntxt_Cd_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdCd() != null) {
			terminologycapabilitiesusecontextcode.setCode(t.getTrminologyCpnltiesUseCntxtCdCd());
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Dsply ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdDsply() != null) {
			terminologycapabilitiesusecontextcode.setDisplay(t.getTrminologyCpnltiesUseCntxtCdDsply());
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdSys() != null) {
			terminologycapabilitiesusecontextcode.setSystem(t.getTrminologyCpnltiesUseCntxtCdSys());
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdUsrSltd() != null) {
			terminologycapabilitiesusecontextcode.setUserSelected(Boolean.parseBoolean(t.getTrminologyCpnltiesUseCntxtCdUsrSltd()));
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtCdVrsn() != null) {
			terminologycapabilitiesusecontextcode.setVersion(t.getTrminologyCpnltiesUseCntxtCdVrsn());
		}
		/******************** terminologycapabilitiesusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept terminologycapabilitiesusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		terminologycapabilitiesusecontext.setValue(terminologycapabilitiesusecontextvaluecodeableconcept);

		/******************** terminologycapabilitiesusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		terminologycapabilitiesusecontextvaluecodeableconcept.addCoding(terminologycapabilitiesusecontextvaluecodeableconceptcoding);

		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd() != null) {
			terminologycapabilitiesusecontextvaluecodeableconceptcoding.setCode(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply() != null) {
			terminologycapabilitiesusecontextvaluecodeableconceptcoding.setDisplay(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys() != null) {
			terminologycapabilitiesusecontextvaluecodeableconceptcoding.setSystem(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			terminologycapabilitiesusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn() != null) {
			terminologycapabilitiesusecontextvaluecodeableconceptcoding.setVersion(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptTxt() != null) {
			terminologycapabilitiesusecontextvaluecodeableconcept.setText(t.getTrminologyCpnltiesUseCntxtVlCdbleCncptTxt());
		}
		/******************** terminologycapabilitiesusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		terminologycapabilitiesusecontext.setValue(terminologycapabilitiesusecontextvaluequantity);

		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyCd() != null) {
			terminologycapabilitiesusecontextvaluequantity.setCode(t.getTrminologyCpnltiesUseCntxtVlQntyCd());
		}
		/******************** terminologycapabilitiesusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory terminologycapabilitiesusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		terminologycapabilitiesusecontextvaluequantity.setComparator(terminologycapabilitiesusecontextvaluequantitycomparator.fromCode(t.getTrminologyCpnltiesUseCntxtVlQntyCmprtr()));

		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntySys() != null) {
			terminologycapabilitiesusecontextvaluequantity.setSystem(t.getTrminologyCpnltiesUseCntxtVlQntySys());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyUnt() != null) {
			terminologycapabilitiesusecontextvaluequantity.setUnit(t.getTrminologyCpnltiesUseCntxtVlQntyUnt());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlQntyVl() != null) {
			terminologycapabilitiesusecontextvaluequantity.setValue(Double.parseDouble((t.getTrminologyCpnltiesUseCntxtVlQntyVl())));
		}
		/******************** terminologycapabilitiesusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range terminologycapabilitiesusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		terminologycapabilitiesusecontext.setValue(terminologycapabilitiesusecontextvaluerange);

		/******************** terminologycapabilitiesusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		terminologycapabilitiesusecontextvaluerange.setHigh(terminologycapabilitiesusecontextvaluerangehigh);

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiCd() != null) {
			terminologycapabilitiesusecontextvaluerangehigh.setCode(t.getTrminologyCpnltiesUseCntxtVlRngHiCd());
		}
		/******************** terminologycapabilitiesusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory terminologycapabilitiesusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		terminologycapabilitiesusecontextvaluerangehigh.setComparator(terminologycapabilitiesusecontextvaluerangehighcomparator.fromCode(t.getTrminologyCpnltiesUseCntxtVlRngHiCmprtr()));

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiSys() != null) {
			terminologycapabilitiesusecontextvaluerangehigh.setSystem(t.getTrminologyCpnltiesUseCntxtVlRngHiSys());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiUnt() != null) {
			terminologycapabilitiesusecontextvaluerangehigh.setUnit(t.getTrminologyCpnltiesUseCntxtVlRngHiUnt());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngHiVl() != null) {
			terminologycapabilitiesusecontextvaluerangehigh.setValue(Double.parseDouble((t.getTrminologyCpnltiesUseCntxtVlRngHiVl())));
		}
		/******************** terminologycapabilitiesusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		terminologycapabilitiesusecontextvaluerange.setLow(terminologycapabilitiesusecontextvaluerangelow);

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwCd() != null) {
			terminologycapabilitiesusecontextvaluerangelow.setCode(t.getTrminologyCpnltiesUseCntxtVlRngLwCd());
		}
		/******************** terminologycapabilitiesusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory terminologycapabilitiesusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		terminologycapabilitiesusecontextvaluerangelow.setComparator(terminologycapabilitiesusecontextvaluerangelowcomparator.fromCode(t.getTrminologyCpnltiesUseCntxtVlRngLwCmprtr()));

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwSys() != null) {
			terminologycapabilitiesusecontextvaluerangelow.setSystem(t.getTrminologyCpnltiesUseCntxtVlRngLwSys());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwUnt() != null) {
			terminologycapabilitiesusecontextvaluerangelow.setUnit(t.getTrminologyCpnltiesUseCntxtVlRngLwUnt());
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRngLwVl() != null) {
			terminologycapabilitiesusecontextvaluerangelow.setValue(Double.parseDouble((t.getTrminologyCpnltiesUseCntxtVlRngLwVl())));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRfrnc ********************************************************************************/
		if(t.getTrminologyCpnltiesUseCntxtVlRfrnc() != null) {
			terminologycapabilitiesusecontext.setValue( new org.hl7.fhir.r4.model.Reference(t.getTrminologyCpnltiesUseCntxtVlRfrnc()));
		}
		/******************** terminologycapabilitiesvalidatecode ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent terminologycapabilitiesvalidatecode =  new org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent();
		terminologycapabilities.setValidateCode(terminologycapabilitiesvalidatecode);

		/******************** TrminologyCpnlties_ValidateCd_Translations ********************************************************************************/
		if(t.getTrminologyCpnltiesValidateCdTranslations() != null) {
			terminologycapabilitiesvalidatecode.setTranslations(Boolean.parseBoolean(t.getTrminologyCpnltiesValidateCdTranslations()));
		}
		/******************** TrminologyCpnlties_Vrsn ********************************************************************************/
		if(t.getTrminologyCpnltiesVrsn() != null) {
			terminologycapabilities.setVersion(t.getTrminologyCpnltiesVrsn());
		}
		return terminologycapabilities;
	}
}
