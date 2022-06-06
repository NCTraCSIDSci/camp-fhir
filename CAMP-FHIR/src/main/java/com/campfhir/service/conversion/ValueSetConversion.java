package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ValueSet;
public class ValueSetConversion 
{
	public org.hl7.fhir.r4.model.ValueSet ValueSets(ValueSet v) throws ParseException
	{
		org.hl7.fhir.r4.model.ValueSet valueset = new org.hl7.fhir.r4.model.ValueSet();

		/******************** id ********************************************************************************/
		valueset.setId(v.getId());

		/******************** valuesetcompose ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent valuesetcompose =  new org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent();
		valueset.setCompose(valuesetcompose);

		/******************** valuesetcomposeexclude ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent valuesetcomposeexclude =  new org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent();
		valuesetcompose.addExclude(valuesetcomposeexclude);

		/******************** valuesetcomposeexcludeconcept ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent valuesetcomposeexcludeconcept =  new org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent();
		valuesetcomposeexclude.addConcept(valuesetcomposeexcludeconcept);

		/******************** VlSt_Compose_Exclude_Cncpt_Cd ********************************************************************************/
		if(v.getVlStComposeExcludeCncptCd() != null) {
			valuesetcomposeexcludeconcept.setCode(v.getVlStComposeExcludeCncptCd());
		}
		/******************** valuesetcomposeexcludeconceptdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent valuesetcomposeexcludeconceptdesignation =  new org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent();
		valuesetcomposeexcludeconcept.addDesignation(valuesetcomposeexcludeconceptdesignation);

		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationLnguage() != null) {
			valuesetcomposeexcludeconceptdesignation.setLanguage(v.getVlStComposeExcludeCncptDsgnationLnguage());
		}
		/******************** valuesetcomposeexcludeconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetcomposeexcludeconceptdesignationuse =  new org.hl7.fhir.r4.model.Coding();
		valuesetcomposeexcludeconceptdesignation.setUse(valuesetcomposeexcludeconceptdesignationuse);

		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseCd() != null) {
			valuesetcomposeexcludeconceptdesignationuse.setCode(v.getVlStComposeExcludeCncptDsgnationUseCd());
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseDsply() != null) {
			valuesetcomposeexcludeconceptdesignationuse.setDisplay(v.getVlStComposeExcludeCncptDsgnationUseDsply());
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseSys() != null) {
			valuesetcomposeexcludeconceptdesignationuse.setSystem(v.getVlStComposeExcludeCncptDsgnationUseSys());
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseUsrSltd() != null) {
			valuesetcomposeexcludeconceptdesignationuse.setUserSelected(Boolean.parseBoolean(v.getVlStComposeExcludeCncptDsgnationUseUsrSltd()));
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseVrsn() != null) {
			valuesetcomposeexcludeconceptdesignationuse.setVersion(v.getVlStComposeExcludeCncptDsgnationUseVrsn());
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationVl() != null) {
			valuesetcomposeexcludeconceptdesignation.setValue(v.getVlStComposeExcludeCncptDsgnationVl());
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsply ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsply() != null) {
			valuesetcomposeexcludeconcept.setDisplay(v.getVlStComposeExcludeCncptDsply());
		}
		/******************** valuesetcomposeexcludefilter ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent valuesetcomposeexcludefilter =  new org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent();
		valuesetcomposeexclude.addFilter(valuesetcomposeexcludefilter);

		/******************** valuesetcomposeexcludefilterop ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.FilterOperatorEnumFactory valuesetcomposeexcludefilterop =  new org.hl7.fhir.r4.model.ValueSet.FilterOperatorEnumFactory();
		valuesetcomposeexcludefilter.setOp(valuesetcomposeexcludefilterop.fromCode(v.getVlStComposeExcludeFltrOp()));

		/******************** VlSt_Compose_Exclude_Fltr_Prpty ********************************************************************************/
		if(v.getVlStComposeExcludeFltrPrpty() != null) {
			valuesetcomposeexcludefilter.setProperty(v.getVlStComposeExcludeFltrPrpty());
		}
		/******************** VlSt_Compose_Exclude_Fltr_Vl ********************************************************************************/
		if(v.getVlStComposeExcludeFltrVl() != null) {
			valuesetcomposeexcludefilter.setValue(v.getVlStComposeExcludeFltrVl());
		}
		/******************** VlSt_Compose_Exclude_Sys ********************************************************************************/
		if(v.getVlStComposeExcludeSys() != null) {
			valuesetcomposeexclude.setSystem(v.getVlStComposeExcludeSys());
		}
		/******************** VlSt_Compose_Exclude_VlSt ********************************************************************************/
		if(v.getVlStComposeExcludeVlSt() != null) {
			valuesetcomposeexclude.addValueSet(v.getVlStComposeExcludeVlSt());
		}
		/******************** VlSt_Compose_Exclude_Vrsn ********************************************************************************/
		if(v.getVlStComposeExcludeVrsn() != null) {
			valuesetcomposeexclude.setVersion(v.getVlStComposeExcludeVrsn());
		}
		/******************** VlSt_Compose_Inactive ********************************************************************************/
		if(v.getVlStComposeInactive() != null) {
			valuesetcompose.setInactive(Boolean.parseBoolean(v.getVlStComposeInactive()));
		}
		/******************** valuesetcomposeinclude ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent valuesetcomposeinclude =  new org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent();
		valuesetcompose.addInclude(valuesetcomposeinclude);

		/******************** valuesetcomposeincludeconcept ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent valuesetcomposeincludeconcept =  new org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent();
		valuesetcomposeinclude.addConcept(valuesetcomposeincludeconcept);

		/******************** VlSt_Compose_Include_Cncpt_Cd ********************************************************************************/
		if(v.getVlStComposeIncludeCncptCd() != null) {
			valuesetcomposeincludeconcept.setCode(v.getVlStComposeIncludeCncptCd());
		}
		/******************** valuesetcomposeincludeconceptdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent valuesetcomposeincludeconceptdesignation =  new org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent();
		valuesetcomposeincludeconcept.addDesignation(valuesetcomposeincludeconceptdesignation);

		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationLnguage() != null) {
			valuesetcomposeincludeconceptdesignation.setLanguage(v.getVlStComposeIncludeCncptDsgnationLnguage());
		}
		/******************** valuesetcomposeincludeconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetcomposeincludeconceptdesignationuse =  new org.hl7.fhir.r4.model.Coding();
		valuesetcomposeincludeconceptdesignation.setUse(valuesetcomposeincludeconceptdesignationuse);

		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseCd() != null) {
			valuesetcomposeincludeconceptdesignationuse.setCode(v.getVlStComposeIncludeCncptDsgnationUseCd());
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseDsply() != null) {
			valuesetcomposeincludeconceptdesignationuse.setDisplay(v.getVlStComposeIncludeCncptDsgnationUseDsply());
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseSys() != null) {
			valuesetcomposeincludeconceptdesignationuse.setSystem(v.getVlStComposeIncludeCncptDsgnationUseSys());
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseUsrSltd() != null) {
			valuesetcomposeincludeconceptdesignationuse.setUserSelected(Boolean.parseBoolean(v.getVlStComposeIncludeCncptDsgnationUseUsrSltd()));
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseVrsn() != null) {
			valuesetcomposeincludeconceptdesignationuse.setVersion(v.getVlStComposeIncludeCncptDsgnationUseVrsn());
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationVl() != null) {
			valuesetcomposeincludeconceptdesignation.setValue(v.getVlStComposeIncludeCncptDsgnationVl());
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsply ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsply() != null) {
			valuesetcomposeincludeconcept.setDisplay(v.getVlStComposeIncludeCncptDsply());
		}
		/******************** valuesetcomposeincludefilter ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent valuesetcomposeincludefilter =  new org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent();
		valuesetcomposeinclude.addFilter(valuesetcomposeincludefilter);

		/******************** valuesetcomposeincludefilterop ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.FilterOperatorEnumFactory valuesetcomposeincludefilterop =  new org.hl7.fhir.r4.model.ValueSet.FilterOperatorEnumFactory();
		valuesetcomposeincludefilter.setOp(valuesetcomposeincludefilterop.fromCode(v.getVlStComposeIncludeFltrOp()));

		/******************** VlSt_Compose_Include_Fltr_Prpty ********************************************************************************/
		if(v.getVlStComposeIncludeFltrPrpty() != null) {
			valuesetcomposeincludefilter.setProperty(v.getVlStComposeIncludeFltrPrpty());
		}
		/******************** VlSt_Compose_Include_Fltr_Vl ********************************************************************************/
		if(v.getVlStComposeIncludeFltrVl() != null) {
			valuesetcomposeincludefilter.setValue(v.getVlStComposeIncludeFltrVl());
		}
		/******************** VlSt_Compose_Include_Sys ********************************************************************************/
		if(v.getVlStComposeIncludeSys() != null) {
			valuesetcomposeinclude.setSystem(v.getVlStComposeIncludeSys());
		}
		/******************** VlSt_Compose_Include_VlSt ********************************************************************************/
		if(v.getVlStComposeIncludeVlSt() != null) {
			valuesetcomposeinclude.addValueSet(v.getVlStComposeIncludeVlSt());
		}
		/******************** VlSt_Compose_Include_Vrsn ********************************************************************************/
		if(v.getVlStComposeIncludeVrsn() != null) {
			valuesetcomposeinclude.setVersion(v.getVlStComposeIncludeVrsn());
		}
		/******************** VlSt_Compose_LockedDt ********************************************************************************/
		if(v.getVlStComposeLockedDt() != null) {
			java.text.SimpleDateFormat VlSt_Compose_LockedDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Compose_LockedDtdate = VlSt_Compose_LockedDtsdf.parse(v.getVlStComposeLockedDt());
			valuesetcompose.setLockedDate(VlSt_Compose_LockedDtdate);
		}
		/******************** valuesetcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail valuesetcontact =  new org.hl7.fhir.r4.model.ContactDetail();
		valueset.addContact(valuesetcontact);

		/******************** VlSt_Cntct_Nm ********************************************************************************/
		if(v.getVlStCntctNm() != null) {
			valuesetcontact.setName(v.getVlStCntctNm());
		}
		/******************** valuesetcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint valuesetcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		valuesetcontact.addTelecom(valuesetcontacttelecom);

		/******************** valuesetcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period valuesetcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		valuesetcontacttelecom.setPeriod(valuesetcontacttelecomperiod);

		/******************** VlSt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(v.getVlStCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat VlSt_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Cntct_Tlcm_Prd_Enddate = VlSt_Cntct_Tlcm_Prd_Endsdf.parse(v.getVlStCntctTlcmPrdEnd());
			valuesetcontacttelecomperiod.setEnd(VlSt_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** VlSt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(v.getVlStCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat VlSt_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Cntct_Tlcm_Prd_Strtdate = VlSt_Cntct_Tlcm_Prd_Strtsdf.parse(v.getVlStCntctTlcmPrdStrt());
			valuesetcontacttelecomperiod.setStart(VlSt_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** VlSt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(v.getVlStCntctTlcmRnk() != null) {
			valuesetcontacttelecom.setRank(Integer.parseInt(v.getVlStCntctTlcmRnk()));
		}
		/******************** valuesetcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory valuesetcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		valuesetcontacttelecom.setSystem(valuesetcontacttelecomsystem.fromCode(v.getVlStCntctTlcmSys()));

		/******************** valuesetcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory valuesetcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		valuesetcontacttelecom.setUse(valuesetcontacttelecomuse.fromCode(v.getVlStCntctTlcmUse()));

		/******************** VlSt_Cntct_Tlcm_Vl ********************************************************************************/
		if(v.getVlStCntctTlcmVl() != null) {
			valuesetcontacttelecom.setValue(v.getVlStCntctTlcmVl());
		}
		/******************** VlSt_Copyright ********************************************************************************/
		if(v.getVlStCopyright() != null) {
			valueset.setCopyright(v.getVlStCopyright());
		}
		/******************** VlSt_Dt ********************************************************************************/
		if(v.getVlStDt() != null) {
			java.text.SimpleDateFormat VlSt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Dtdate = VlSt_Dtsdf.parse(v.getVlStDt());
			valueset.setDate(VlSt_Dtdate);
		}
		/******************** VlSt_Dscrptn ********************************************************************************/
		if(v.getVlStDscrptn() != null) {
			valueset.setDescription(v.getVlStDscrptn());
		}
		/******************** valuesetexpansion ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent valuesetexpansion =  new org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent();
		valueset.setExpansion(valuesetexpansion);

		/******************** valuesetexpansioncontains ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent valuesetexpansioncontains =  new org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent();
		valuesetexpansion.addContains(valuesetexpansioncontains);

		/******************** VlSt_Expansion_Contains_Abstract ********************************************************************************/
		if(v.getVlStExpansionContainsAbstract() != null) {
			valuesetexpansioncontains.setAbstract(Boolean.parseBoolean(v.getVlStExpansionContainsAbstract()));
		}
		/******************** VlSt_Expansion_Contains_Cd ********************************************************************************/
		if(v.getVlStExpansionContainsCd() != null) {
			valuesetexpansioncontains.setCode(v.getVlStExpansionContainsCd());
		}
		/******************** valuesetexpansioncontainsdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent valuesetexpansioncontainsdesignation =  new org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent();
		valuesetexpansioncontains.addDesignation(valuesetexpansioncontainsdesignation);

		/******************** VlSt_Expansion_Contains_Dsgnation_Lnguage ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationLnguage() != null) {
			valuesetexpansioncontainsdesignation.setLanguage(v.getVlStExpansionContainsDsgnationLnguage());
		}
		/******************** valuesetexpansioncontainsdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetexpansioncontainsdesignationuse =  new org.hl7.fhir.r4.model.Coding();
		valuesetexpansioncontainsdesignation.setUse(valuesetexpansioncontainsdesignationuse);

		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Cd ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseCd() != null) {
			valuesetexpansioncontainsdesignationuse.setCode(v.getVlStExpansionContainsDsgnationUseCd());
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Dsply ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseDsply() != null) {
			valuesetexpansioncontainsdesignationuse.setDisplay(v.getVlStExpansionContainsDsgnationUseDsply());
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Sys ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseSys() != null) {
			valuesetexpansioncontainsdesignationuse.setSystem(v.getVlStExpansionContainsDsgnationUseSys());
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseUsrSltd() != null) {
			valuesetexpansioncontainsdesignationuse.setUserSelected(Boolean.parseBoolean(v.getVlStExpansionContainsDsgnationUseUsrSltd()));
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Vrsn ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseVrsn() != null) {
			valuesetexpansioncontainsdesignationuse.setVersion(v.getVlStExpansionContainsDsgnationUseVrsn());
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Vl ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationVl() != null) {
			valuesetexpansioncontainsdesignation.setValue(v.getVlStExpansionContainsDsgnationVl());
		}
		/******************** VlSt_Expansion_Contains_Dsply ********************************************************************************/
		if(v.getVlStExpansionContainsDsply() != null) {
			valuesetexpansioncontains.setDisplay(v.getVlStExpansionContainsDsply());
		}
		/******************** VlSt_Expansion_Contains_Inactive ********************************************************************************/
		if(v.getVlStExpansionContainsInactive() != null) {
			valuesetexpansioncontains.setInactive(Boolean.parseBoolean(v.getVlStExpansionContainsInactive()));
		}
		/******************** VlSt_Expansion_Contains_Sys ********************************************************************************/
		if(v.getVlStExpansionContainsSys() != null) {
			valuesetexpansioncontains.setSystem(v.getVlStExpansionContainsSys());
		}
		/******************** VlSt_Expansion_Contains_Vrsn ********************************************************************************/
		if(v.getVlStExpansionContainsVrsn() != null) {
			valuesetexpansioncontains.setVersion(v.getVlStExpansionContainsVrsn());
		}
		/******************** VlSt_Expansion_Id ********************************************************************************/
		if(v.getVlStExpansionId() != null) {
			valuesetexpansion.setIdentifier(v.getVlStExpansionId());
		}
		/******************** VlSt_Expansion_Off ********************************************************************************/
		if(v.getVlStExpansionOff() != null) {
			valuesetexpansion.setOffset(Integer.parseInt(v.getVlStExpansionOff()));
		}
		/******************** valuesetexpansionparameter ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent valuesetexpansionparameter =  new org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent();
		valuesetexpansion.addParameter(valuesetexpansionparameter);

		/******************** VlSt_Expansion_Prmtr_Nm ********************************************************************************/
		if(v.getVlStExpansionPrmtrNm() != null) {
			valuesetexpansionparameter.setName(v.getVlStExpansionPrmtrNm());
		}
		/******************** VlSt_Expansion_Prmtr_VlBooleanTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlBooleanTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.BooleanType(v.getVlStExpansionPrmtrVlBooleanTyp()));
		}
		/******************** VlSt_Expansion_Prmtr_VlCdTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlCdTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.CodeType(v.getVlStExpansionPrmtrVlCdTyp()));
		}
		/******************** VlSt_Expansion_Prmtr_VlDtTimeTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlDtTimeTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.DateTimeType(v.getVlStExpansionPrmtrVlDtTimeTyp()));
		}
		/******************** VlSt_Expansion_Prmtr_VlDecimalTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlDecimalTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.DecimalType(v.getVlStExpansionPrmtrVlDecimalTyp()));
		}
		/******************** VlSt_Expansion_Prmtr_VlIntegerTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlIntegerTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.IntegerType(v.getVlStExpansionPrmtrVlIntegerTyp()));
		}
		/******************** VlSt_Expansion_Prmtr_VlStrgTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlStrgTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.StringType(v.getVlStExpansionPrmtrVlStrgTyp()));
		}
		/******************** VlSt_Expansion_Prmtr_VlUriTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlUriTyp() != null) {
			valuesetexpansionparameter.setValue( new org.hl7.fhir.r4.model.UriType(v.getVlStExpansionPrmtrVlUriTyp()));
		}
		/******************** VlSt_Expansion_Timestamp ********************************************************************************/
		if(v.getVlStExpansionTimestamp() != null) {
			java.text.SimpleDateFormat VlSt_Expansion_Timestampsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Expansion_Timestampdate = VlSt_Expansion_Timestampsdf.parse(v.getVlStExpansionTimestamp());
			valuesetexpansion.setTimestamp(VlSt_Expansion_Timestampdate);
		}
		/******************** VlSt_Expansion_Total ********************************************************************************/
		if(v.getVlStExpansionTotal() != null) {
			valuesetexpansion.setTotal(Integer.parseInt(v.getVlStExpansionTotal()));
		}
		/******************** VlSt_Exprmtl ********************************************************************************/
		if(v.getVlStExprmtl() != null) {
			valueset.setExperimental(Boolean.parseBoolean(v.getVlStExprmtl()));
		}
		/******************** valuesetidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier valuesetidentifier =  new org.hl7.fhir.r4.model.Identifier();
		valueset.addIdentifier(valuesetidentifier);

		/******************** VlSt_Id_Assigner ********************************************************************************/
		if(v.getVlStIdAssigner() != null) {
			valuesetidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(v.getVlStIdAssigner()));
		}
		/******************** valuesetidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period valuesetidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		valuesetidentifier.setPeriod(valuesetidentifierperiod);

		/******************** VlSt_Id_Prd_End ********************************************************************************/
		if(v.getVlStIdPrdEnd() != null) {
			java.text.SimpleDateFormat VlSt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Id_Prd_Enddate = VlSt_Id_Prd_Endsdf.parse(v.getVlStIdPrdEnd());
			valuesetidentifierperiod.setEnd(VlSt_Id_Prd_Enddate);
		}
		/******************** VlSt_Id_Prd_Strt ********************************************************************************/
		if(v.getVlStIdPrdStrt() != null) {
			java.text.SimpleDateFormat VlSt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VlSt_Id_Prd_Strtdate = VlSt_Id_Prd_Strtsdf.parse(v.getVlStIdPrdStrt());
			valuesetidentifierperiod.setStart(VlSt_Id_Prd_Strtdate);
		}
		/******************** VlSt_Id_Sys ********************************************************************************/
		if(v.getVlStIdSys() != null) {
			valuesetidentifier.setSystem(v.getVlStIdSys());
		}
		/******************** valuesetidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		valuesetidentifier.setType(valuesetidentifiertype);

		/******************** valuesetidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		valuesetidentifiertype.addCoding(valuesetidentifiertypecoding);

		/******************** VlSt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(v.getVlStIdTypCdgCd() != null) {
			valuesetidentifiertypecoding.setCode(v.getVlStIdTypCdgCd());
		}
		/******************** VlSt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(v.getVlStIdTypCdgDsply() != null) {
			valuesetidentifiertypecoding.setDisplay(v.getVlStIdTypCdgDsply());
		}
		/******************** VlSt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(v.getVlStIdTypCdgSys() != null) {
			valuesetidentifiertypecoding.setSystem(v.getVlStIdTypCdgSys());
		}
		/******************** VlSt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(v.getVlStIdTypCdgUsrSltd() != null) {
			valuesetidentifiertypecoding.setUserSelected(Boolean.parseBoolean(v.getVlStIdTypCdgUsrSltd()));
		}
		/******************** VlSt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(v.getVlStIdTypCdgVrsn() != null) {
			valuesetidentifiertypecoding.setVersion(v.getVlStIdTypCdgVrsn());
		}
		/******************** VlSt_Id_Typ_Txt ********************************************************************************/
		if(v.getVlStIdTypTxt() != null) {
			valuesetidentifiertype.setText(v.getVlStIdTypTxt());
		}
		/******************** valuesetidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory valuesetidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		valuesetidentifier.setUse(valuesetidentifieruse.fromCode(v.getVlStIdUse()));

		/******************** VlSt_Id_Vl ********************************************************************************/
		if(v.getVlStIdVl() != null) {
			valuesetidentifier.setValue(v.getVlStIdVl());
		}
		/******************** VlSt_Immutable ********************************************************************************/
		if(v.getVlStImmutable() != null) {
			valueset.setImmutable(Boolean.parseBoolean(v.getVlStImmutable()));
		}
		/******************** valuesetjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		valueset.addJurisdiction(valuesetjurisdiction);

		/******************** valuesetjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		valuesetjurisdiction.addCoding(valuesetjurisdictioncoding);

		/******************** VlSt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(v.getVlStJrsdctnCdgCd() != null) {
			valuesetjurisdictioncoding.setCode(v.getVlStJrsdctnCdgCd());
		}
		/******************** VlSt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(v.getVlStJrsdctnCdgDsply() != null) {
			valuesetjurisdictioncoding.setDisplay(v.getVlStJrsdctnCdgDsply());
		}
		/******************** VlSt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(v.getVlStJrsdctnCdgSys() != null) {
			valuesetjurisdictioncoding.setSystem(v.getVlStJrsdctnCdgSys());
		}
		/******************** VlSt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(v.getVlStJrsdctnCdgUsrSltd() != null) {
			valuesetjurisdictioncoding.setUserSelected(Boolean.parseBoolean(v.getVlStJrsdctnCdgUsrSltd()));
		}
		/******************** VlSt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(v.getVlStJrsdctnCdgVrsn() != null) {
			valuesetjurisdictioncoding.setVersion(v.getVlStJrsdctnCdgVrsn());
		}
		/******************** VlSt_Jrsdctn_Txt ********************************************************************************/
		if(v.getVlStJrsdctnTxt() != null) {
			valuesetjurisdiction.setText(v.getVlStJrsdctnTxt());
		}
		/******************** VlSt_Nm ********************************************************************************/
		if(v.getVlStNm() != null) {
			valueset.setName(v.getVlStNm());
		}
		/******************** VlSt_Pblshr ********************************************************************************/
		if(v.getVlStPblshr() != null) {
			valueset.setPublisher(v.getVlStPblshr());
		}
		/******************** VlSt_Prpse ********************************************************************************/
		if(v.getVlStPrpse() != null) {
			valueset.setPurpose(v.getVlStPrpse());
		}
		/******************** valuesetstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory valuesetstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		valueset.setStatus(valuesetstatus.fromCode(v.getVlStSts()));

		/******************** VlSt_Ttl ********************************************************************************/
		if(v.getVlStTtl() != null) {
			valueset.setTitle(v.getVlStTtl());
		}
		/******************** VlSt_Url ********************************************************************************/
		if(v.getVlStUrl() != null) {
			valueset.setUrl(v.getVlStUrl());
		}
		/******************** valuesetusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext valuesetusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		valueset.addUseContext(valuesetusecontext);

		/******************** valuesetusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		valuesetusecontext.setCode(valuesetusecontextcode);

		/******************** VlSt_UseCntxt_Cd_Cd ********************************************************************************/
		if(v.getVlStUseCntxtCdCd() != null) {
			valuesetusecontextcode.setCode(v.getVlStUseCntxtCdCd());
		}
		/******************** VlSt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(v.getVlStUseCntxtCdDsply() != null) {
			valuesetusecontextcode.setDisplay(v.getVlStUseCntxtCdDsply());
		}
		/******************** VlSt_UseCntxt_Cd_Sys ********************************************************************************/
		if(v.getVlStUseCntxtCdSys() != null) {
			valuesetusecontextcode.setSystem(v.getVlStUseCntxtCdSys());
		}
		/******************** VlSt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(v.getVlStUseCntxtCdUsrSltd() != null) {
			valuesetusecontextcode.setUserSelected(Boolean.parseBoolean(v.getVlStUseCntxtCdUsrSltd()));
		}
		/******************** VlSt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(v.getVlStUseCntxtCdVrsn() != null) {
			valuesetusecontextcode.setVersion(v.getVlStUseCntxtCdVrsn());
		}
		/******************** valuesetusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		valuesetusecontext.setValue(valuesetusecontextvaluecodeableconcept);

		/******************** valuesetusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		valuesetusecontextvaluecodeableconcept.addCoding(valuesetusecontextvaluecodeableconceptcoding);

		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgCd() != null) {
			valuesetusecontextvaluecodeableconceptcoding.setCode(v.getVlStUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgDsply() != null) {
			valuesetusecontextvaluecodeableconceptcoding.setDisplay(v.getVlStUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgSys() != null) {
			valuesetusecontextvaluecodeableconceptcoding.setSystem(v.getVlStUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			valuesetusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(v.getVlStUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgVrsn() != null) {
			valuesetusecontextvaluecodeableconceptcoding.setVersion(v.getVlStUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptTxt() != null) {
			valuesetusecontextvaluecodeableconcept.setText(v.getVlStUseCntxtVlCdbleCncptTxt());
		}
		/******************** valuesetusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		valuesetusecontext.setValue(valuesetusecontextvaluequantity);

		/******************** VlSt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyCd() != null) {
			valuesetusecontextvaluequantity.setCode(v.getVlStUseCntxtVlQntyCd());
		}
		/******************** valuesetusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory valuesetusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		valuesetusecontextvaluequantity.setComparator(valuesetusecontextvaluequantitycomparator.fromCode(v.getVlStUseCntxtVlQntyCmprtr()));

		/******************** VlSt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlQntySys() != null) {
			valuesetusecontextvaluequantity.setSystem(v.getVlStUseCntxtVlQntySys());
		}
		/******************** VlSt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyUnt() != null) {
			valuesetusecontextvaluequantity.setUnit(v.getVlStUseCntxtVlQntyUnt());
		}
		/******************** VlSt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyVl() != null) {
			valuesetusecontextvaluequantity.setValue(Double.parseDouble((v.getVlStUseCntxtVlQntyVl())));
		}
		/******************** valuesetusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range valuesetusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		valuesetusecontext.setValue(valuesetusecontextvaluerange);

		/******************** valuesetusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		valuesetusecontextvaluerange.setHigh(valuesetusecontextvaluerangehigh);

		/******************** VlSt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiCd() != null) {
			valuesetusecontextvaluerangehigh.setCode(v.getVlStUseCntxtVlRngHiCd());
		}
		/******************** valuesetusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory valuesetusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		valuesetusecontextvaluerangehigh.setComparator(valuesetusecontextvaluerangehighcomparator.fromCode(v.getVlStUseCntxtVlRngHiCmprtr()));

		/******************** VlSt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiSys() != null) {
			valuesetusecontextvaluerangehigh.setSystem(v.getVlStUseCntxtVlRngHiSys());
		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiUnt() != null) {
			valuesetusecontextvaluerangehigh.setUnit(v.getVlStUseCntxtVlRngHiUnt());
		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiVl() != null) {
			valuesetusecontextvaluerangehigh.setValue(Double.parseDouble((v.getVlStUseCntxtVlRngHiVl())));
		}
		/******************** valuesetusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		valuesetusecontextvaluerange.setLow(valuesetusecontextvaluerangelow);

		/******************** VlSt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwCd() != null) {
			valuesetusecontextvaluerangelow.setCode(v.getVlStUseCntxtVlRngLwCd());
		}
		/******************** valuesetusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory valuesetusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		valuesetusecontextvaluerangelow.setComparator(valuesetusecontextvaluerangelowcomparator.fromCode(v.getVlStUseCntxtVlRngLwCmprtr()));

		/******************** VlSt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwSys() != null) {
			valuesetusecontextvaluerangelow.setSystem(v.getVlStUseCntxtVlRngLwSys());
		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwUnt() != null) {
			valuesetusecontextvaluerangelow.setUnit(v.getVlStUseCntxtVlRngLwUnt());
		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwVl() != null) {
			valuesetusecontextvaluerangelow.setValue(Double.parseDouble((v.getVlStUseCntxtVlRngLwVl())));
		}
		/******************** VlSt_UseCntxt_VlRfrnc ********************************************************************************/
		if(v.getVlStUseCntxtVlRfrnc() != null) {
			valuesetusecontext.setValue( new org.hl7.fhir.r4.model.Reference(v.getVlStUseCntxtVlRfrnc()));
		}
		/******************** VlSt_Vrsn ********************************************************************************/
		if(v.getVlStVrsn() != null) {
			valueset.setVersion(v.getVlStVrsn());
		}
		return valueset;
	}
}
