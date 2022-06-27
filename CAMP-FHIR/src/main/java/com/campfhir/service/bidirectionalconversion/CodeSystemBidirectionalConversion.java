package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CodeSystem;
public class CodeSystemBidirectionalConversion 
{
	public CodeSystem CodeSystems(org.hl7.fhir.r4.model.CodeSystem codesystem) throws ParseException
	{
		 main.java.com.campfhir.model.CodeSystem c = new  main.java.com.campfhir.model.CodeSystem();

		/******************** id ********************************************************************************/
		codesystem.setId(c.getId());

		/******************** CdSys_Nm ********************************************************************************/
		if(codesystem.hasName()) {
			c.setCdSysNm(String.valueOf(codesystem.getName()));
		}
		/******************** codesystemcontent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentMode codesystemcontent = codesystem.getContent();
		c.setCdSysCntnt(codesystemcontent.toCode());

		/******************** CdSys_Dt ********************************************************************************/
		if(codesystem.hasDate()) {
			c.setCdSysDt(String.valueOf(codesystem.getDate()));
		}
		/******************** CdSys_Cnt ********************************************************************************/
		if(codesystem.hasCount()) {
			c.setCdSysCnt(String.valueOf(codesystem.getCount()));
		}
		/******************** CdSys_Vrsn ********************************************************************************/
		if(codesystem.hasVersion()) {
			c.setCdSysVrsn(String.valueOf(codesystem.getVersion()));
		}
		/******************** CdSys_Ttl ********************************************************************************/
		if(codesystem.hasTitle()) {
			c.setCdSysTtl(String.valueOf(codesystem.getTitle()));
		}
		/******************** codesystemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus codesystemstatus = codesystem.getStatus();
		c.setCdSysSts(codesystemstatus.toCode());

		/******************** CdSys_Dscrptn ********************************************************************************/
		if(codesystem.hasDescription()) {
			c.setCdSysDscrptn(String.valueOf(codesystem.getDescription()));
		}
		/******************** CdSys_Url ********************************************************************************/
		if(codesystem.hasUrl()) {
			c.setCdSysUrl(String.valueOf(codesystem.getUrl()));
		}
		/******************** CdSys_CaseSensitive ********************************************************************************/
		if(codesystem.hasCaseSensitive()) {
			c.setCdSysCaseSensitive(String.valueOf(codesystem.getCaseSensitive()));
		}
		/******************** CdSys_VlSt ********************************************************************************/
		if(codesystem.hasValueSet()) {
			c.setCdSysVlSt(String.valueOf(codesystem.getValueSet()));
		}
		/******************** CdSys_Cmpsitional ********************************************************************************/
		if(codesystem.hasCompositional()) {
			c.setCdSysCmpsitional(String.valueOf(codesystem.getCompositional()));
		}
		/******************** CdSys_VrsnNeeded ********************************************************************************/
		if(codesystem.hasVersionNeeded()) {
			c.setCdSysVrsnNeeded(String.valueOf(codesystem.getVersionNeeded()));
		}
		/******************** CdSys_Supplements ********************************************************************************/
		if(codesystem.hasSupplements()) {
			c.setCdSysSupplements(String.valueOf(codesystem.getSupplements()));
		}
		/******************** codesystemfilter ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent codesystemfilter = codesystem.getFilterFirstRep();

		/******************** CdSys_Fltr_Vl ********************************************************************************/
		if(codesystemfilter.hasValue()) {
			c.setCdSysFltrVl(String.valueOf(codesystemfilter.getValue()));
		}
		/******************** CdSys_Fltr_Cd ********************************************************************************/
		if(codesystemfilter.hasCode()) {
			c.setCdSysFltrCd(String.valueOf(codesystemfilter.getCode()));
		}
		/******************** CdSys_Fltr_Dscrptn ********************************************************************************/
		if(codesystemfilter.hasDescription()) {
			c.setCdSysFltrDscrptn(String.valueOf(codesystemfilter.getDescription()));
		}
		/******************** codesystemconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent codesystemconcept = codesystem.getConceptFirstRep();

		/******************** CdSys_Cncpt_Dfn ********************************************************************************/
		if(codesystemconcept.hasDefinition()) {
			c.setCdSysCncptDfn(String.valueOf(codesystemconcept.getDefinition()));
		}
		/******************** CdSys_Cncpt_Cd ********************************************************************************/
		if(codesystemconcept.hasCode()) {
			c.setCdSysCncptCd(String.valueOf(codesystemconcept.getCode()));
		}
		/******************** codesystemconceptdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent codesystemconceptdesignation = codesystemconcept.getDesignationFirstRep();

		/******************** CdSys_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(codesystemconceptdesignation.hasValue()) {
			c.setCdSysCncptDsgnationVl(String.valueOf(codesystemconceptdesignation.getValue()));
		}
		/******************** CdSys_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(codesystemconceptdesignation.hasLanguage()) {
			c.setCdSysCncptDsgnationLnguage(String.valueOf(codesystemconceptdesignation.getLanguage()));
		}
		/******************** codesystemconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemconceptdesignationuse = codesystemconceptdesignation.getUse();

		/******************** CdSys_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(codesystemconceptdesignationuse.hasVersion()) {
			c.setCdSysCncptDsgnationUseVrsn(String.valueOf(codesystemconceptdesignationuse.getVersion()));
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(codesystemconceptdesignationuse.hasDisplay()) {
			c.setCdSysCncptDsgnationUseDsply(String.valueOf(codesystemconceptdesignationuse.getDisplay()));
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(codesystemconceptdesignationuse.hasCode()) {
			c.setCdSysCncptDsgnationUseCd(String.valueOf(codesystemconceptdesignationuse.getCode()));
		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(codesystemconceptdesignationuse.hasSystem()) {
			c.setCdSysCncptDsgnationUseSys(String.valueOf(codesystemconceptdesignationuse.getSystem()));
		}
		/******************** codesystemconceptproperty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent codesystemconceptproperty = codesystemconcept.getPropertyFirstRep();

		/******************** CdSys_Cncpt_Prpty_Cd ********************************************************************************/
		if(codesystemconceptproperty.hasCode()) {
			c.setCdSysCncptPrptyCd(String.valueOf(codesystemconceptproperty.getCode()));
		}
		/******************** CdSys_Cncpt_Prpty_VlBooleanTyp ********************************************************************************/
		if(codesystemconceptproperty.hasValueBooleanType()) {
			c.setCdSysCncptPrptyVlBooleanTyp(String.valueOf(codesystemconceptproperty.getValueBooleanType()));
		}
		/******************** CdSys_Cncpt_Prpty_VlDtTimeTyp ********************************************************************************/
		if(codesystemconceptproperty.hasValueDateTimeType()) {
			c.setCdSysCncptPrptyVlDtTimeTyp(String.valueOf(codesystemconceptproperty.getValueDateTimeType()));
		}
		/******************** CdSys_Cncpt_Prpty_VlIntegerTyp ********************************************************************************/
		if(codesystemconceptproperty.hasValueIntegerType()) {
			c.setCdSysCncptPrptyVlIntegerTyp(String.valueOf(codesystemconceptproperty.getValueIntegerType()));
		}
		/******************** CdSys_Cncpt_Prpty_VlDecimalTyp ********************************************************************************/
		if(codesystemconceptproperty.hasValueDecimalType()) {
			c.setCdSysCncptPrptyVlDecimalTyp(String.valueOf(codesystemconceptproperty.getValueDecimalType()));
		}
		/******************** CdSys_Cncpt_Prpty_VlStrgTyp ********************************************************************************/
		if(codesystemconceptproperty.hasValueStringType()) {
			c.setCdSysCncptPrptyVlStrgTyp(String.valueOf(codesystemconceptproperty.getValueStringType()));
		}
		/******************** codesystemconceptpropertyvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemconceptpropertyvaluecoding = codesystemconceptproperty.getValueCoding();

		/******************** CdSys_Cncpt_Prpty_VlCdg_Vrsn ********************************************************************************/
		if(codesystemconceptpropertyvaluecoding.hasVersion()) {
			c.setCdSysCncptPrptyVlCdgVrsn(String.valueOf(codesystemconceptpropertyvaluecoding.getVersion()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Dsply ********************************************************************************/
		if(codesystemconceptpropertyvaluecoding.hasDisplay()) {
			c.setCdSysCncptPrptyVlCdgDsply(String.valueOf(codesystemconceptpropertyvaluecoding.getDisplay()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Cd ********************************************************************************/
		if(codesystemconceptpropertyvaluecoding.hasCode()) {
			c.setCdSysCncptPrptyVlCdgCd(String.valueOf(codesystemconceptpropertyvaluecoding.getCode()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_UsrSltd ********************************************************************************/
		if(codesystemconceptpropertyvaluecoding.hasUserSelected()) {
			c.setCdSysCncptPrptyVlCdgUsrSltd(String.valueOf(codesystemconceptpropertyvaluecoding.getUserSelected()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Sys ********************************************************************************/
		if(codesystemconceptpropertyvaluecoding.hasSystem()) {
			c.setCdSysCncptPrptyVlCdgSys(String.valueOf(codesystemconceptpropertyvaluecoding.getSystem()));
		}
		/******************** CdSys_Cncpt_Prpty_VlCdTyp ********************************************************************************/
		if(codesystemconceptproperty.hasValueCodeType()) {
			c.setCdSysCncptPrptyVlCdTyp(String.valueOf(codesystemconceptproperty.getValueCodeType()));
		}
		/******************** CdSys_Pblshr ********************************************************************************/
		if(codesystem.hasPublisher()) {
			c.setCdSysPblshr(String.valueOf(codesystem.getPublisher()));
		}
		/******************** CdSys_Exprmtl ********************************************************************************/
		if(codesystem.hasExperimental()) {
			c.setCdSysExprmtl(String.valueOf(codesystem.getExperimental()));
		}
		/******************** CdSys_Prpse ********************************************************************************/
		if(codesystem.hasPurpose()) {
			c.setCdSysPrpse(String.valueOf(codesystem.getPurpose()));
		}
		/******************** codesystemhierarchymeaning ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaning codesystemhierarchymeaning = codesystem.getHierarchyMeaning();
		c.setCdSysHierarchyMeaning(codesystemhierarchymeaning.toCode());

		/******************** codesystemcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail codesystemcontact = codesystem.getContactFirstRep();

		/******************** CdSys_Cntct_Nm ********************************************************************************/
		if(codesystemcontact.hasName()) {
			c.setCdSysCntctNm(String.valueOf(codesystemcontact.getName()));
		}
		/******************** codesystemcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint codesystemcontacttelecom = codesystemcontact.getTelecomFirstRep();

		/******************** CdSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(codesystemcontacttelecom.hasValue()) {
			c.setCdSysCntctTlcmVl(String.valueOf(codesystemcontacttelecom.getValue()));
		}
		/******************** codesystemcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period codesystemcontacttelecomperiod = codesystemcontacttelecom.getPeriod();

		/******************** CdSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(codesystemcontacttelecomperiod.hasStart()) {
			c.setCdSysCntctTlcmPrdStrt(String.valueOf(codesystemcontacttelecomperiod.getStart()));
		}
		/******************** CdSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(codesystemcontacttelecomperiod.hasEnd()) {
			c.setCdSysCntctTlcmPrdEnd(String.valueOf(codesystemcontacttelecomperiod.getEnd()));
		}
		/******************** codesystemcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem codesystemcontacttelecomsystem = codesystemcontacttelecom.getSystem();
		c.setCdSysCntctTlcmSys(codesystemcontacttelecomsystem.toCode());

		/******************** codesystemcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse codesystemcontacttelecomuse = codesystemcontacttelecom.getUse();
		c.setCdSysCntctTlcmUse(codesystemcontacttelecomuse.toCode());

		/******************** CdSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(codesystemcontacttelecom.hasRank()) {
			c.setCdSysCntctTlcmRnk(String.valueOf(codesystemcontacttelecom.getRank()));
		}
		/******************** codesystemproperty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.PropertyComponent codesystemproperty = codesystem.getPropertyFirstRep();

		/******************** codesystempropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeSystem.PropertyType codesystempropertytype = codesystemproperty.getType();
		c.setCdSysPrptyTyp(codesystempropertytype.toCode());

		/******************** CdSys_Prpty_Cd ********************************************************************************/
		if(codesystemproperty.hasCode()) {
			c.setCdSysPrptyCd(String.valueOf(codesystemproperty.getCode()));
		}
		/******************** CdSys_Prpty_Uri ********************************************************************************/
		if(codesystemproperty.hasUri()) {
			c.setCdSysPrptyUri(String.valueOf(codesystemproperty.getUri()));
		}
		/******************** CdSys_Prpty_Dscrptn ********************************************************************************/
		if(codesystemproperty.hasDescription()) {
			c.setCdSysPrptyDscrptn(String.valueOf(codesystemproperty.getDescription()));
		}
		/******************** codesystemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier codesystemidentifier = codesystem.getIdentifierFirstRep();

		/******************** CdSys_Id_Vl ********************************************************************************/
		if(codesystemidentifier.hasValue()) {
			c.setCdSysIdVl(String.valueOf(codesystemidentifier.getValue()));
		}
		/******************** codesystemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemidentifiertype = codesystemidentifier.getType();

		/******************** CdSys_Id_Typ_Txt ********************************************************************************/
		if(codesystemidentifiertype.hasText()) {
			c.setCdSysIdTypTxt(String.valueOf(codesystemidentifiertype.getText()));
		}
		/******************** codesystemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemidentifiertypecoding = codesystemidentifiertype.getCodingFirstRep();

		/******************** CdSys_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(codesystemidentifiertypecoding.hasVersion()) {
			c.setCdSysIdTypCdgVrsn(String.valueOf(codesystemidentifiertypecoding.getVersion()));
		}
		/******************** CdSys_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(codesystemidentifiertypecoding.hasDisplay()) {
			c.setCdSysIdTypCdgDsply(String.valueOf(codesystemidentifiertypecoding.getDisplay()));
		}
		/******************** CdSys_Id_Typ_Cdg_Cd ********************************************************************************/
		if(codesystemidentifiertypecoding.hasCode()) {
			c.setCdSysIdTypCdgCd(String.valueOf(codesystemidentifiertypecoding.getCode()));
		}
		/******************** CdSys_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(codesystemidentifiertypecoding.hasUserSelected()) {
			c.setCdSysIdTypCdgUsrSltd(String.valueOf(codesystemidentifiertypecoding.getUserSelected()));
		}
		/******************** CdSys_Id_Typ_Cdg_Sys ********************************************************************************/
		if(codesystemidentifiertypecoding.hasSystem()) {
			c.setCdSysIdTypCdgSys(String.valueOf(codesystemidentifiertypecoding.getSystem()));
		}
		/******************** codesystemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period codesystemidentifierperiod = codesystemidentifier.getPeriod();

		/******************** CdSys_Id_Prd_Strt ********************************************************************************/
		if(codesystemidentifierperiod.hasStart()) {
			c.setCdSysIdPrdStrt(String.valueOf(codesystemidentifierperiod.getStart()));
		}
		/******************** CdSys_Id_Prd_End ********************************************************************************/
		if(codesystemidentifierperiod.hasEnd()) {
			c.setCdSysIdPrdEnd(String.valueOf(codesystemidentifierperiod.getEnd()));
		}
		/******************** CdSys_Id_Assigner ********************************************************************************/
		if(codesystemidentifier.hasAssigner()) {
			c.setCdSysIdAssigner(String.valueOf(codesystemidentifier.getAssigner()));
		}
		/******************** CdSys_Id_Sys ********************************************************************************/
		if(codesystemidentifier.hasSystem()) {
			c.setCdSysIdSys(String.valueOf(codesystemidentifier.getSystem()));
		}
		/******************** codesystemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse codesystemidentifieruse = codesystemidentifier.getUse();
		c.setCdSysIdUse(codesystemidentifieruse.toCode());

		/******************** CdSys_Copyright ********************************************************************************/
		if(codesystem.hasCopyright()) {
			c.setCdSysCopyright(String.valueOf(codesystem.getCopyright()));
		}
		/******************** codesystemusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext codesystemusecontext = codesystem.getUseContextFirstRep();

		/******************** codesystemusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemusecontextcode = codesystemusecontext.getCode();

		/******************** CdSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(codesystemusecontextcode.hasVersion()) {
			c.setCdSysUseCntxtCdVrsn(String.valueOf(codesystemusecontextcode.getVersion()));
		}
		/******************** CdSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(codesystemusecontextcode.hasDisplay()) {
			c.setCdSysUseCntxtCdDsply(String.valueOf(codesystemusecontextcode.getDisplay()));
		}
		/******************** CdSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(codesystemusecontextcode.hasUserSelected()) {
			c.setCdSysUseCntxtCdUsrSltd(String.valueOf(codesystemusecontextcode.getUserSelected()));
		}
		/******************** CdSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(codesystemusecontextcode.hasSystem()) {
			c.setCdSysUseCntxtCdSys(String.valueOf(codesystemusecontextcode.getSystem()));
		}
		/******************** codesystemusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemusecontextvaluecodeableconcept = codesystemusecontext.getValueCodeableConcept();

		/******************** CdSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(codesystemusecontextvaluecodeableconcept.hasText()) {
			c.setCdSysUseCntxtVlCdbleCncptTxt(String.valueOf(codesystemusecontextvaluecodeableconcept.getText()));
		}
		/******************** codesystemusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemusecontextvaluecodeableconceptcoding = codesystemusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcoding.hasVersion()) {
			c.setCdSysUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcoding.hasDisplay()) {
			c.setCdSysUseCntxtVlCdbleCncptCdgDsply(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcoding.hasCode()) {
			c.setCdSysUseCntxtVlCdbleCncptCdgCd(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			c.setCdSysUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(codesystemusecontextvaluecodeableconceptcoding.hasSystem()) {
			c.setCdSysUseCntxtVlCdbleCncptCdgSys(String.valueOf(codesystemusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** codesystemusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluequantity = codesystemusecontext.getValueQuantity();

		/******************** CdSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(codesystemusecontextvaluequantity.hasValue()) {
			c.setCdSysUseCntxtVlQntyVl(String.valueOf(codesystemusecontextvaluequantity.getValue()));
		}
		/******************** codesystemusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator codesystemusecontextvaluequantitycomparator = codesystemusecontextvaluequantity.getComparator();
		c.setCdSysUseCntxtVlQntyCmprtr(codesystemusecontextvaluequantitycomparator.toCode());

		/******************** CdSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(codesystemusecontextvaluequantity.hasCode()) {
			c.setCdSysUseCntxtVlQntyCd(String.valueOf(codesystemusecontextvaluequantity.getCode()));
		}
		/******************** CdSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(codesystemusecontextvaluequantity.hasUnit()) {
			c.setCdSysUseCntxtVlQntyUnt(String.valueOf(codesystemusecontextvaluequantity.getUnit()));
		}
		/******************** CdSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(codesystemusecontextvaluequantity.hasSystem()) {
			c.setCdSysUseCntxtVlQntySys(String.valueOf(codesystemusecontextvaluequantity.getSystem()));
		}
		/******************** codesystemusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range codesystemusecontextvaluerange = codesystemusecontext.getValueRange();

		/******************** codesystemusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluerangelow = codesystemusecontextvaluerange.getLow();

		/******************** CdSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(codesystemusecontextvaluerangelow.hasValue()) {
			c.setCdSysUseCntxtVlRngLwVl(String.valueOf(codesystemusecontextvaluerangelow.getValue()));
		}
		/******************** codesystemusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator codesystemusecontextvaluerangelowcomparator = codesystemusecontextvaluerangelow.getComparator();
		c.setCdSysUseCntxtVlRngLwCmprtr(codesystemusecontextvaluerangelowcomparator.toCode());

		/******************** CdSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(codesystemusecontextvaluerangelow.hasCode()) {
			c.setCdSysUseCntxtVlRngLwCd(String.valueOf(codesystemusecontextvaluerangelow.getCode()));
		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(codesystemusecontextvaluerangelow.hasUnit()) {
			c.setCdSysUseCntxtVlRngLwUnt(String.valueOf(codesystemusecontextvaluerangelow.getUnit()));
		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(codesystemusecontextvaluerangelow.hasSystem()) {
			c.setCdSysUseCntxtVlRngLwSys(String.valueOf(codesystemusecontextvaluerangelow.getSystem()));
		}
		/******************** codesystemusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity codesystemusecontextvaluerangehigh = codesystemusecontextvaluerange.getHigh();

		/******************** CdSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(codesystemusecontextvaluerangehigh.hasValue()) {
			c.setCdSysUseCntxtVlRngHiVl(String.valueOf(codesystemusecontextvaluerangehigh.getValue()));
		}
		/******************** codesystemusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator codesystemusecontextvaluerangehighcomparator = codesystemusecontextvaluerangehigh.getComparator();
		c.setCdSysUseCntxtVlRngHiCmprtr(codesystemusecontextvaluerangehighcomparator.toCode());

		/******************** CdSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(codesystemusecontextvaluerangehigh.hasCode()) {
			c.setCdSysUseCntxtVlRngHiCd(String.valueOf(codesystemusecontextvaluerangehigh.getCode()));
		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(codesystemusecontextvaluerangehigh.hasUnit()) {
			c.setCdSysUseCntxtVlRngHiUnt(String.valueOf(codesystemusecontextvaluerangehigh.getUnit()));
		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(codesystemusecontextvaluerangehigh.hasSystem()) {
			c.setCdSysUseCntxtVlRngHiSys(String.valueOf(codesystemusecontextvaluerangehigh.getSystem()));
		}
		/******************** CdSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(codesystemusecontext.hasValueReference()) {
			c.setCdSysUseCntxtVlRfrnc(String.valueOf(codesystemusecontext.getValueReference()));
		}
		/******************** codesystemjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept codesystemjurisdiction = codesystem.getJurisdictionFirstRep();

		/******************** CdSys_Jrsdctn_Txt ********************************************************************************/
		if(codesystemjurisdiction.hasText()) {
			c.setCdSysJrsdctnTxt(String.valueOf(codesystemjurisdiction.getText()));
		}
		/******************** codesystemjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding codesystemjurisdictioncoding = codesystemjurisdiction.getCodingFirstRep();

		/******************** CdSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(codesystemjurisdictioncoding.hasVersion()) {
			c.setCdSysJrsdctnCdgVrsn(String.valueOf(codesystemjurisdictioncoding.getVersion()));
		}
		/******************** CdSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(codesystemjurisdictioncoding.hasDisplay()) {
			c.setCdSysJrsdctnCdgDsply(String.valueOf(codesystemjurisdictioncoding.getDisplay()));
		}
		/******************** CdSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(codesystemjurisdictioncoding.hasCode()) {
			c.setCdSysJrsdctnCdgCd(String.valueOf(codesystemjurisdictioncoding.getCode()));
		}
		/******************** CdSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(codesystemjurisdictioncoding.hasUserSelected()) {
			c.setCdSysJrsdctnCdgUsrSltd(String.valueOf(codesystemjurisdictioncoding.getUserSelected()));
		}
		/******************** CdSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(codesystemjurisdictioncoding.hasSystem()) {
			c.setCdSysJrsdctnCdgSys(String.valueOf(codesystemjurisdictioncoding.getSystem()));
		}
		return c;
	}
}
