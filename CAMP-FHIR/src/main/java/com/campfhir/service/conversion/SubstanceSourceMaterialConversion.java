package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceSourceMaterial;
public class SubstanceSourceMaterialConversion 
{
	public org.hl7.fhir.r4.model.SubstanceSourceMaterial SubstanceSourceMaterials(SubstanceSourceMaterial s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceSourceMaterial substancesourcematerial = new org.hl7.fhir.r4.model.SubstanceSourceMaterial();

		/******************** id ********************************************************************************/
		substancesourcematerial.setId(s.getId());

		/******************** substancesourcematerialcountryoforigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialcountryoforigin =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerial.addCountryOfOrigin(substancesourcematerialcountryoforigin);

		/******************** substancesourcematerialcountryoforigincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialcountryoforigincoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialcountryoforigin.addCoding(substancesourcematerialcountryoforigincoding);

		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgCd() != null) {
			substancesourcematerialcountryoforigincoding.setCode(s.getSbstncSrcMtrlCntryOfOriginCdgCd());
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgDsply() != null) {
			substancesourcematerialcountryoforigincoding.setDisplay(s.getSbstncSrcMtrlCntryOfOriginCdgDsply());
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgSys() != null) {
			substancesourcematerialcountryoforigincoding.setSystem(s.getSbstncSrcMtrlCntryOfOriginCdgSys());
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgUsrSltd() != null) {
			substancesourcematerialcountryoforigincoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlCntryOfOriginCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgVrsn() != null) {
			substancesourcematerialcountryoforigincoding.setVersion(s.getSbstncSrcMtrlCntryOfOriginCdgVrsn());
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginTxt() != null) {
			substancesourcematerialcountryoforigin.setText(s.getSbstncSrcMtrlCntryOfOriginTxt());
		}
		/******************** substancesourcematerialdevelopmentstage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialdevelopmentstage =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerial.setDevelopmentStage(substancesourcematerialdevelopmentstage);

		/******************** substancesourcematerialdevelopmentstagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialdevelopmentstagecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialdevelopmentstage.addCoding(substancesourcematerialdevelopmentstagecoding);

		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgCd() != null) {
			substancesourcematerialdevelopmentstagecoding.setCode(s.getSbstncSrcMtrlDevelopmentStageCdgCd());
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgDsply() != null) {
			substancesourcematerialdevelopmentstagecoding.setDisplay(s.getSbstncSrcMtrlDevelopmentStageCdgDsply());
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgSys() != null) {
			substancesourcematerialdevelopmentstagecoding.setSystem(s.getSbstncSrcMtrlDevelopmentStageCdgSys());
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgUsrSltd() != null) {
			substancesourcematerialdevelopmentstagecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlDevelopmentStageCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgVrsn() != null) {
			substancesourcematerialdevelopmentstagecoding.setVersion(s.getSbstncSrcMtrlDevelopmentStageCdgVrsn());
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageTxt() != null) {
			substancesourcematerialdevelopmentstage.setText(s.getSbstncSrcMtrlDevelopmentStageTxt());
		}
		/******************** substancesourcematerialfractiondescription ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent substancesourcematerialfractiondescription =  new org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent();
		substancesourcematerial.addFractionDescription(substancesourcematerialfractiondescription);

		/******************** SbstncSrcMtrl_FractionDscrptn_Fraction ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnFraction() != null) {
			substancesourcematerialfractiondescription.setFraction(s.getSbstncSrcMtrlFractionDscrptnFraction());
		}
		/******************** substancesourcematerialfractiondescriptionmaterialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialfractiondescriptionmaterialtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialfractiondescription.setMaterialType(substancesourcematerialfractiondescriptionmaterialtype);

		/******************** substancesourcematerialfractiondescriptionmaterialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialfractiondescriptionmaterialtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialfractiondescriptionmaterialtype.addCoding(substancesourcematerialfractiondescriptionmaterialtypecoding);

		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd() != null) {
			substancesourcematerialfractiondescriptionmaterialtypecoding.setCode(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd());
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply() != null) {
			substancesourcematerialfractiondescriptionmaterialtypecoding.setDisplay(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys() != null) {
			substancesourcematerialfractiondescriptionmaterialtypecoding.setSystem(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys());
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd() != null) {
			substancesourcematerialfractiondescriptionmaterialtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn() != null) {
			substancesourcematerialfractiondescriptionmaterialtypecoding.setVersion(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypTxt() != null) {
			substancesourcematerialfractiondescriptionmaterialtype.setText(s.getSbstncSrcMtrlFractionDscrptnMtrlTypTxt());
		}
		/******************** SbstncSrcMtrl_GeographicalLctn ********************************************************************************/
		if(s.getSbstncSrcMtrlGeographicalLctn() != null) {
			substancesourcematerial.addGeographicalLocation(s.getSbstncSrcMtrlGeographicalLctn());
		}
		/******************** substancesourcematerialorganism ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent substancesourcematerialorganism =  new org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent();
		substancesourcematerial.setOrganism(substancesourcematerialorganism);

		/******************** substancesourcematerialorganismauthor ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent substancesourcematerialorganismauthor =  new org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent();
		substancesourcematerialorganism.addAuthor(substancesourcematerialorganismauthor);

		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrDscrptn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrDscrptn() != null) {
			substancesourcematerialorganismauthor.setAuthorDescription(s.getSbstncSrcMtrlOrgnsmAthrAthrDscrptn());
		}
		/******************** substancesourcematerialorganismauthorauthortype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismauthorauthortype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismauthor.setAuthorType(substancesourcematerialorganismauthorauthortype);

		/******************** substancesourcematerialorganismauthorauthortypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismauthorauthortypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismauthorauthortype.addCoding(substancesourcematerialorganismauthorauthortypecoding);

		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd() != null) {
			substancesourcematerialorganismauthorauthortypecoding.setCode(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply() != null) {
			substancesourcematerialorganismauthorauthortypecoding.setDisplay(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys() != null) {
			substancesourcematerialorganismauthorauthortypecoding.setSystem(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd() != null) {
			substancesourcematerialorganismauthorauthortypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn() != null) {
			substancesourcematerialorganismauthorauthortypecoding.setVersion(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypTxt() != null) {
			substancesourcematerialorganismauthorauthortype.setText(s.getSbstncSrcMtrlOrgnsmAthrAthrTypTxt());
		}
		/******************** substancesourcematerialorganismfamily ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismfamily =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganism.setFamily(substancesourcematerialorganismfamily);

		/******************** substancesourcematerialorganismfamilycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismfamilycoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismfamily.addCoding(substancesourcematerialorganismfamilycoding);

		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgCd() != null) {
			substancesourcematerialorganismfamilycoding.setCode(s.getSbstncSrcMtrlOrgnsmFmlyCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgDsply() != null) {
			substancesourcematerialorganismfamilycoding.setDisplay(s.getSbstncSrcMtrlOrgnsmFmlyCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgSys() != null) {
			substancesourcematerialorganismfamilycoding.setSystem(s.getSbstncSrcMtrlOrgnsmFmlyCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd() != null) {
			substancesourcematerialorganismfamilycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgVrsn() != null) {
			substancesourcematerialorganismfamilycoding.setVersion(s.getSbstncSrcMtrlOrgnsmFmlyCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyTxt() != null) {
			substancesourcematerialorganismfamily.setText(s.getSbstncSrcMtrlOrgnsmFmlyTxt());
		}
		/******************** substancesourcematerialorganismgenus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismgenus =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganism.setGenus(substancesourcematerialorganismgenus);

		/******************** substancesourcematerialorganismgenuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismgenuscoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismgenus.addCoding(substancesourcematerialorganismgenuscoding);

		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgCd() != null) {
			substancesourcematerialorganismgenuscoding.setCode(s.getSbstncSrcMtrlOrgnsmGenusCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgDsply() != null) {
			substancesourcematerialorganismgenuscoding.setDisplay(s.getSbstncSrcMtrlOrgnsmGenusCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgSys() != null) {
			substancesourcematerialorganismgenuscoding.setSystem(s.getSbstncSrcMtrlOrgnsmGenusCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgUsrSltd() != null) {
			substancesourcematerialorganismgenuscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmGenusCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgVrsn() != null) {
			substancesourcematerialorganismgenuscoding.setVersion(s.getSbstncSrcMtrlOrgnsmGenusCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusTxt() != null) {
			substancesourcematerialorganismgenus.setText(s.getSbstncSrcMtrlOrgnsmGenusTxt());
		}
		/******************** substancesourcematerialorganismhybrid ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent substancesourcematerialorganismhybrid =  new org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent();
		substancesourcematerialorganism.setHybrid(substancesourcematerialorganismhybrid);

		/******************** substancesourcematerialorganismhybridhybridtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismhybridhybridtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismhybrid.setHybridType(substancesourcematerialorganismhybridhybridtype);

		/******************** substancesourcematerialorganismhybridhybridtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismhybridhybridtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismhybridhybridtype.addCoding(substancesourcematerialorganismhybridhybridtypecoding);

		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd() != null) {
			substancesourcematerialorganismhybridhybridtypecoding.setCode(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply() != null) {
			substancesourcematerialorganismhybridhybridtypecoding.setDisplay(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys() != null) {
			substancesourcematerialorganismhybridhybridtypecoding.setSystem(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd() != null) {
			substancesourcematerialorganismhybridhybridtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn() != null) {
			substancesourcematerialorganismhybridhybridtypecoding.setVersion(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypTxt() != null) {
			substancesourcematerialorganismhybridhybridtype.setText(s.getSbstncSrcMtrlOrgnsmHybridHybridTypTxt());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmId ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId() != null) {
			substancesourcematerialorganismhybrid.setMaternalOrganismId(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmNm ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm() != null) {
			substancesourcematerialorganismhybrid.setMaternalOrganismName(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmId ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId() != null) {
			substancesourcematerialorganismhybrid.setPaternalOrganismId(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmNm ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm() != null) {
			substancesourcematerialorganismhybrid.setPaternalOrganismName(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm());
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificDscrptn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificDscrptn() != null) {
			substancesourcematerialorganism.setIntraspecificDescription(s.getSbstncSrcMtrlOrgnsmIntraspecificDscrptn());
		}
		/******************** substancesourcematerialorganismintraspecifictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismintraspecifictype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganism.setIntraspecificType(substancesourcematerialorganismintraspecifictype);

		/******************** substancesourcematerialorganismintraspecifictypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismintraspecifictypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismintraspecifictype.addCoding(substancesourcematerialorganismintraspecifictypecoding);

		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd() != null) {
			substancesourcematerialorganismintraspecifictypecoding.setCode(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply() != null) {
			substancesourcematerialorganismintraspecifictypecoding.setDisplay(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys() != null) {
			substancesourcematerialorganismintraspecifictypecoding.setSystem(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd() != null) {
			substancesourcematerialorganismintraspecifictypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn() != null) {
			substancesourcematerialorganismintraspecifictypecoding.setVersion(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypTxt() != null) {
			substancesourcematerialorganismintraspecifictype.setText(s.getSbstncSrcMtrlOrgnsmIntraspecificTypTxt());
		}
		/******************** substancesourcematerialorganismorganismgeneral ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent substancesourcematerialorganismorganismgeneral =  new org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent();
		substancesourcematerialorganism.setOrganismGeneral(substancesourcematerialorganismorganismgeneral);

		/******************** substancesourcematerialorganismorganismgeneralclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralclass =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismorganismgeneral.setClass_(substancesourcematerialorganismorganismgeneralclass);

		/******************** substancesourcematerialorganismorganismgeneralclasscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralclasscoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismorganismgeneralclass.addCoding(substancesourcematerialorganismorganismgeneralclasscoding);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd() != null) {
			substancesourcematerialorganismorganismgeneralclasscoding.setCode(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply() != null) {
			substancesourcematerialorganismorganismgeneralclasscoding.setDisplay(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys() != null) {
			substancesourcematerialorganismorganismgeneralclasscoding.setSystem(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd() != null) {
			substancesourcematerialorganismorganismgeneralclasscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn() != null) {
			substancesourcematerialorganismorganismgeneralclasscoding.setVersion(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt() != null) {
			substancesourcematerialorganismorganismgeneralclass.setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt());
		}
		/******************** substancesourcematerialorganismorganismgeneralkingdom ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralkingdom =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismorganismgeneral.setKingdom(substancesourcematerialorganismorganismgeneralkingdom);

		/******************** substancesourcematerialorganismorganismgeneralkingdomcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralkingdomcoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismorganismgeneralkingdom.addCoding(substancesourcematerialorganismorganismgeneralkingdomcoding);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd() != null) {
			substancesourcematerialorganismorganismgeneralkingdomcoding.setCode(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply() != null) {
			substancesourcematerialorganismorganismgeneralkingdomcoding.setDisplay(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys() != null) {
			substancesourcematerialorganismorganismgeneralkingdomcoding.setSystem(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd() != null) {
			substancesourcematerialorganismorganismgeneralkingdomcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn() != null) {
			substancesourcematerialorganismorganismgeneralkingdomcoding.setVersion(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt() != null) {
			substancesourcematerialorganismorganismgeneralkingdom.setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt());
		}
		/******************** substancesourcematerialorganismorganismgeneralorder ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralorder =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismorganismgeneral.setOrder(substancesourcematerialorganismorganismgeneralorder);

		/******************** substancesourcematerialorganismorganismgeneralordercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralordercoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismorganismgeneralorder.addCoding(substancesourcematerialorganismorganismgeneralordercoding);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd() != null) {
			substancesourcematerialorganismorganismgeneralordercoding.setCode(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply() != null) {
			substancesourcematerialorganismorganismgeneralordercoding.setDisplay(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys() != null) {
			substancesourcematerialorganismorganismgeneralordercoding.setSystem(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd() != null) {
			substancesourcematerialorganismorganismgeneralordercoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn() != null) {
			substancesourcematerialorganismorganismgeneralordercoding.setVersion(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt() != null) {
			substancesourcematerialorganismorganismgeneralorder.setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt());
		}
		/******************** substancesourcematerialorganismorganismgeneralphylum ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralphylum =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismorganismgeneral.setPhylum(substancesourcematerialorganismorganismgeneralphylum);

		/******************** substancesourcematerialorganismorganismgeneralphylumcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralphylumcoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismorganismgeneralphylum.addCoding(substancesourcematerialorganismorganismgeneralphylumcoding);

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd() != null) {
			substancesourcematerialorganismorganismgeneralphylumcoding.setCode(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply() != null) {
			substancesourcematerialorganismorganismgeneralphylumcoding.setDisplay(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys() != null) {
			substancesourcematerialorganismorganismgeneralphylumcoding.setSystem(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd() != null) {
			substancesourcematerialorganismorganismgeneralphylumcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn() != null) {
			substancesourcematerialorganismorganismgeneralphylumcoding.setVersion(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt() != null) {
			substancesourcematerialorganismorganismgeneralphylum.setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt());
		}
		/******************** substancesourcematerialorganismspecies ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismspecies =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganism.setSpecies(substancesourcematerialorganismspecies);

		/******************** substancesourcematerialorganismspeciescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismspeciescoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismspecies.addCoding(substancesourcematerialorganismspeciescoding);

		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgCd() != null) {
			substancesourcematerialorganismspeciescoding.setCode(s.getSbstncSrcMtrlOrgnsmSpcsCdgCd());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgDsply() != null) {
			substancesourcematerialorganismspeciescoding.setDisplay(s.getSbstncSrcMtrlOrgnsmSpcsCdgDsply());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgSys() != null) {
			substancesourcematerialorganismspeciescoding.setSystem(s.getSbstncSrcMtrlOrgnsmSpcsCdgSys());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd() != null) {
			substancesourcematerialorganismspeciescoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgVrsn() != null) {
			substancesourcematerialorganismspeciescoding.setVersion(s.getSbstncSrcMtrlOrgnsmSpcsCdgVrsn());
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsTxt() != null) {
			substancesourcematerialorganismspecies.setText(s.getSbstncSrcMtrlOrgnsmSpcsTxt());
		}
		/******************** substancesourcematerialorganismid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancesourcematerialorganismid =  new org.hl7.fhir.r4.model.Identifier();
		substancesourcematerial.setOrganismId(substancesourcematerialorganismid);

		/******************** SbstncSrcMtrl_OrgnsmId_Assigner ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdAssigner() != null) {
			substancesourcematerialorganismid.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncSrcMtrlOrgnsmIdAssigner()));
		}
		/******************** substancesourcematerialorganismidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancesourcematerialorganismidperiod =  new org.hl7.fhir.r4.model.Period();
		substancesourcematerialorganismid.setPeriod(substancesourcematerialorganismidperiod);

		/******************** SbstncSrcMtrl_OrgnsmId_Prd_End ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncSrcMtrl_OrgnsmId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSrcMtrl_OrgnsmId_Prd_Enddate = SbstncSrcMtrl_OrgnsmId_Prd_Endsdf.parse(s.getSbstncSrcMtrlOrgnsmIdPrdEnd());
			substancesourcematerialorganismidperiod.setEnd(SbstncSrcMtrl_OrgnsmId_Prd_Enddate);
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Prd_Strt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncSrcMtrl_OrgnsmId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSrcMtrl_OrgnsmId_Prd_Strtdate = SbstncSrcMtrl_OrgnsmId_Prd_Strtsdf.parse(s.getSbstncSrcMtrlOrgnsmIdPrdStrt());
			substancesourcematerialorganismidperiod.setStart(SbstncSrcMtrl_OrgnsmId_Prd_Strtdate);
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdSys() != null) {
			substancesourcematerialorganismid.setSystem(s.getSbstncSrcMtrlOrgnsmIdSys());
		}
		/******************** substancesourcematerialorganismidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismidtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialorganismid.setType(substancesourcematerialorganismidtype);

		/******************** substancesourcematerialorganismidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismidtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialorganismidtype.addCoding(substancesourcematerialorganismidtypecoding);

		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgCd() != null) {
			substancesourcematerialorganismidtypecoding.setCode(s.getSbstncSrcMtrlOrgnsmIdTypCdgCd());
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgDsply() != null) {
			substancesourcematerialorganismidtypecoding.setDisplay(s.getSbstncSrcMtrlOrgnsmIdTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgSys() != null) {
			substancesourcematerialorganismidtypecoding.setSystem(s.getSbstncSrcMtrlOrgnsmIdTypCdgSys());
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd() != null) {
			substancesourcematerialorganismidtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgVrsn() != null) {
			substancesourcematerialorganismidtypecoding.setVersion(s.getSbstncSrcMtrlOrgnsmIdTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypTxt() != null) {
			substancesourcematerialorganismidtype.setText(s.getSbstncSrcMtrlOrgnsmIdTypTxt());
		}
		/******************** substancesourcematerialorganismiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancesourcematerialorganismiduse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancesourcematerialorganismid.setUse(substancesourcematerialorganismiduse.fromCode(s.getSbstncSrcMtrlOrgnsmIdUse()));

		/******************** SbstncSrcMtrl_OrgnsmId_Vl ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdVl() != null) {
			substancesourcematerialorganismid.setValue(s.getSbstncSrcMtrlOrgnsmIdVl());
		}
		/******************** SbstncSrcMtrl_OrgnsmNm ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmNm() != null) {
			substancesourcematerial.setOrganismName(s.getSbstncSrcMtrlOrgnsmNm());
		}
		/******************** substancesourcematerialparentsubstanceid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancesourcematerialparentsubstanceid =  new org.hl7.fhir.r4.model.Identifier();
		substancesourcematerial.addParentSubstanceId(substancesourcematerialparentsubstanceid);

		/******************** SbstncSrcMtrl_ParentSbstncId_Assigner ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdAssigner() != null) {
			substancesourcematerialparentsubstanceid.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncSrcMtrlParentSbstncIdAssigner()));
		}
		/******************** substancesourcematerialparentsubstanceidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancesourcematerialparentsubstanceidperiod =  new org.hl7.fhir.r4.model.Period();
		substancesourcematerialparentsubstanceid.setPeriod(substancesourcematerialparentsubstanceidperiod);

		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_End ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncSrcMtrl_ParentSbstncId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSrcMtrl_ParentSbstncId_Prd_Enddate = SbstncSrcMtrl_ParentSbstncId_Prd_Endsdf.parse(s.getSbstncSrcMtrlParentSbstncIdPrdEnd());
			substancesourcematerialparentsubstanceidperiod.setEnd(SbstncSrcMtrl_ParentSbstncId_Prd_Enddate);
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_Strt ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncSrcMtrl_ParentSbstncId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSrcMtrl_ParentSbstncId_Prd_Strtdate = SbstncSrcMtrl_ParentSbstncId_Prd_Strtsdf.parse(s.getSbstncSrcMtrlParentSbstncIdPrdStrt());
			substancesourcematerialparentsubstanceidperiod.setStart(SbstncSrcMtrl_ParentSbstncId_Prd_Strtdate);
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdSys() != null) {
			substancesourcematerialparentsubstanceid.setSystem(s.getSbstncSrcMtrlParentSbstncIdSys());
		}
		/******************** substancesourcematerialparentsubstanceidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialparentsubstanceidtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialparentsubstanceid.setType(substancesourcematerialparentsubstanceidtype);

		/******************** substancesourcematerialparentsubstanceidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialparentsubstanceidtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialparentsubstanceidtype.addCoding(substancesourcematerialparentsubstanceidtypecoding);

		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgCd() != null) {
			substancesourcematerialparentsubstanceidtypecoding.setCode(s.getSbstncSrcMtrlParentSbstncIdTypCdgCd());
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgDsply() != null) {
			substancesourcematerialparentsubstanceidtypecoding.setDisplay(s.getSbstncSrcMtrlParentSbstncIdTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgSys() != null) {
			substancesourcematerialparentsubstanceidtypecoding.setSystem(s.getSbstncSrcMtrlParentSbstncIdTypCdgSys());
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd() != null) {
			substancesourcematerialparentsubstanceidtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgVrsn() != null) {
			substancesourcematerialparentsubstanceidtypecoding.setVersion(s.getSbstncSrcMtrlParentSbstncIdTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypTxt() != null) {
			substancesourcematerialparentsubstanceidtype.setText(s.getSbstncSrcMtrlParentSbstncIdTypTxt());
		}
		/******************** substancesourcematerialparentsubstanceiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancesourcematerialparentsubstanceiduse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancesourcematerialparentsubstanceid.setUse(substancesourcematerialparentsubstanceiduse.fromCode(s.getSbstncSrcMtrlParentSbstncIdUse()));

		/******************** SbstncSrcMtrl_ParentSbstncId_Vl ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdVl() != null) {
			substancesourcematerialparentsubstanceid.setValue(s.getSbstncSrcMtrlParentSbstncIdVl());
		}
		/******************** SbstncSrcMtrl_ParentSbstncNm ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncNm() != null) {
			substancesourcematerial.addParentSubstanceName(s.getSbstncSrcMtrlParentSbstncNm());
		}
		/******************** substancesourcematerialpartdescription ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent substancesourcematerialpartdescription =  new org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent();
		substancesourcematerial.addPartDescription(substancesourcematerialpartdescription);

		/******************** substancesourcematerialpartdescriptionpart ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialpartdescriptionpart =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialpartdescription.setPart(substancesourcematerialpartdescriptionpart);

		/******************** substancesourcematerialpartdescriptionpartcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialpartdescriptionpartcoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialpartdescriptionpart.addCoding(substancesourcematerialpartdescriptionpartcoding);

		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgCd() != null) {
			substancesourcematerialpartdescriptionpartcoding.setCode(s.getSbstncSrcMtrlPartDscrptnPartCdgCd());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgDsply() != null) {
			substancesourcematerialpartdescriptionpartcoding.setDisplay(s.getSbstncSrcMtrlPartDscrptnPartCdgDsply());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgSys() != null) {
			substancesourcematerialpartdescriptionpartcoding.setSystem(s.getSbstncSrcMtrlPartDscrptnPartCdgSys());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgUsrSltd() != null) {
			substancesourcematerialpartdescriptionpartcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlPartDscrptnPartCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgVrsn() != null) {
			substancesourcematerialpartdescriptionpartcoding.setVersion(s.getSbstncSrcMtrlPartDscrptnPartCdgVrsn());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartTxt() != null) {
			substancesourcematerialpartdescriptionpart.setText(s.getSbstncSrcMtrlPartDscrptnPartTxt());
		}
		/******************** substancesourcematerialpartdescriptionpartlocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialpartdescriptionpartlocation =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerialpartdescription.setPartLocation(substancesourcematerialpartdescriptionpartlocation);

		/******************** substancesourcematerialpartdescriptionpartlocationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialpartdescriptionpartlocationcoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialpartdescriptionpartlocation.addCoding(substancesourcematerialpartdescriptionpartlocationcoding);

		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgCd() != null) {
			substancesourcematerialpartdescriptionpartlocationcoding.setCode(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgCd());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgDsply() != null) {
			substancesourcematerialpartdescriptionpartlocationcoding.setDisplay(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgDsply());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgSys() != null) {
			substancesourcematerialpartdescriptionpartlocationcoding.setSystem(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgSys());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd() != null) {
			substancesourcematerialpartdescriptionpartlocationcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn() != null) {
			substancesourcematerialpartdescriptionpartlocationcoding.setVersion(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn());
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnTxt() != null) {
			substancesourcematerialpartdescriptionpartlocation.setText(s.getSbstncSrcMtrlPartDscrptnPartLctnTxt());
		}
		/******************** substancesourcematerialsourcematerialclass ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialclass =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerial.setSourceMaterialClass(substancesourcematerialsourcematerialclass);

		/******************** substancesourcematerialsourcematerialclasscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialsourcematerialclasscoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialsourcematerialclass.addCoding(substancesourcematerialsourcematerialclasscoding);

		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgCd() != null) {
			substancesourcematerialsourcematerialclasscoding.setCode(s.getSbstncSrcMtrlSrcMtrlClsCdgCd());
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgDsply() != null) {
			substancesourcematerialsourcematerialclasscoding.setDisplay(s.getSbstncSrcMtrlSrcMtrlClsCdgDsply());
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgSys() != null) {
			substancesourcematerialsourcematerialclasscoding.setSystem(s.getSbstncSrcMtrlSrcMtrlClsCdgSys());
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgUsrSltd() != null) {
			substancesourcematerialsourcematerialclasscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlSrcMtrlClsCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgVrsn() != null) {
			substancesourcematerialsourcematerialclasscoding.setVersion(s.getSbstncSrcMtrlSrcMtrlClsCdgVrsn());
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsTxt() != null) {
			substancesourcematerialsourcematerialclass.setText(s.getSbstncSrcMtrlSrcMtrlClsTxt());
		}
		/******************** substancesourcematerialsourcematerialstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialstate =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerial.setSourceMaterialState(substancesourcematerialsourcematerialstate);

		/******************** substancesourcematerialsourcematerialstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialsourcematerialstatecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialsourcematerialstate.addCoding(substancesourcematerialsourcematerialstatecoding);

		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgCd() != null) {
			substancesourcematerialsourcematerialstatecoding.setCode(s.getSbstncSrcMtrlSrcMtrlStateCdgCd());
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgDsply() != null) {
			substancesourcematerialsourcematerialstatecoding.setDisplay(s.getSbstncSrcMtrlSrcMtrlStateCdgDsply());
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgSys() != null) {
			substancesourcematerialsourcematerialstatecoding.setSystem(s.getSbstncSrcMtrlSrcMtrlStateCdgSys());
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgUsrSltd() != null) {
			substancesourcematerialsourcematerialstatecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlSrcMtrlStateCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgVrsn() != null) {
			substancesourcematerialsourcematerialstatecoding.setVersion(s.getSbstncSrcMtrlSrcMtrlStateCdgVrsn());
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateTxt() != null) {
			substancesourcematerialsourcematerialstate.setText(s.getSbstncSrcMtrlSrcMtrlStateTxt());
		}
		/******************** substancesourcematerialsourcematerialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancesourcematerial.setSourceMaterialType(substancesourcematerialsourcematerialtype);

		/******************** substancesourcematerialsourcematerialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialsourcematerialtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancesourcematerialsourcematerialtype.addCoding(substancesourcematerialsourcematerialtypecoding);

		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgCd() != null) {
			substancesourcematerialsourcematerialtypecoding.setCode(s.getSbstncSrcMtrlSrcMtrlTypCdgCd());
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgDsply() != null) {
			substancesourcematerialsourcematerialtypecoding.setDisplay(s.getSbstncSrcMtrlSrcMtrlTypCdgDsply());
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgSys() != null) {
			substancesourcematerialsourcematerialtypecoding.setSystem(s.getSbstncSrcMtrlSrcMtrlTypCdgSys());
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgUsrSltd() != null) {
			substancesourcematerialsourcematerialtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSrcMtrlSrcMtrlTypCdgUsrSltd()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgVrsn() != null) {
			substancesourcematerialsourcematerialtypecoding.setVersion(s.getSbstncSrcMtrlSrcMtrlTypCdgVrsn());
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypTxt() != null) {
			substancesourcematerialsourcematerialtype.setText(s.getSbstncSrcMtrlSrcMtrlTypTxt());
		}
		return substancesourcematerial;
	}
}
