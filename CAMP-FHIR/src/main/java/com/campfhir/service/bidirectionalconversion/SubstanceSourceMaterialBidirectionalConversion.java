package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceSourceMaterial;
public class SubstanceSourceMaterialBidirectionalConversion 
{
	public SubstanceSourceMaterial SubstanceSourceMaterials(org.hl7.fhir.r4.model.SubstanceSourceMaterial substancesourcematerial) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceSourceMaterial s = new  main.java.com.campfhir.model.SubstanceSourceMaterial();

		/******************** id ********************************************************************************/
		substancesourcematerial.setId(s.getId());

		/******************** substancesourcematerialorganismid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancesourcematerialorganismid = substancesourcematerial.getOrganismId();

		/******************** SbstncSrcMtrl_OrgnsmId_Vl ********************************************************************************/
		if(substancesourcematerialorganismid.hasValue()) {
			s.setSbstncSrcMtrlOrgnsmIdVl(String.valueOf(substancesourcematerialorganismid.getValue()));
		}
		/******************** substancesourcematerialorganismidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismidtype = substancesourcematerialorganismid.getType();

		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Txt ********************************************************************************/
		if(substancesourcematerialorganismidtype.hasText()) {
			s.setSbstncSrcMtrlOrgnsmIdTypTxt(String.valueOf(substancesourcematerialorganismidtype.getText()));
		}
		/******************** substancesourcematerialorganismidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismidtypecoding = substancesourcematerialorganismidtype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismidtypecoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmIdTypCdgVrsn(String.valueOf(substancesourcematerialorganismidtypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismidtypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmIdTypCdgDsply(String.valueOf(substancesourcematerialorganismidtypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismidtypecoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmIdTypCdgCd(String.valueOf(substancesourcematerialorganismidtypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismidtypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismidtypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismidtypecoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmIdTypCdgSys(String.valueOf(substancesourcematerialorganismidtypecoding.getSystem()));
		}
		/******************** substancesourcematerialorganismidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancesourcematerialorganismidperiod = substancesourcematerialorganismid.getPeriod();

		/******************** SbstncSrcMtrl_OrgnsmId_Prd_Strt ********************************************************************************/
		if(substancesourcematerialorganismidperiod.hasStart()) {
			s.setSbstncSrcMtrlOrgnsmIdPrdStrt(String.valueOf(substancesourcematerialorganismidperiod.getStart()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Prd_End ********************************************************************************/
		if(substancesourcematerialorganismidperiod.hasEnd()) {
			s.setSbstncSrcMtrlOrgnsmIdPrdEnd(String.valueOf(substancesourcematerialorganismidperiod.getEnd()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Assigner ********************************************************************************/
		if(substancesourcematerialorganismid.hasAssigner()) {
			s.setSbstncSrcMtrlOrgnsmIdAssigner(String.valueOf(substancesourcematerialorganismid.getAssigner()));
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Sys ********************************************************************************/
		if(substancesourcematerialorganismid.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmIdSys(String.valueOf(substancesourcematerialorganismid.getSystem()));
		}
		/******************** substancesourcematerialorganismiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancesourcematerialorganismiduse = substancesourcematerialorganismid.getUse();
		s.setSbstncSrcMtrlOrgnsmIdUse(substancesourcematerialorganismiduse.toCode());

		/******************** SbstncSrcMtrl_OrgnsmNm ********************************************************************************/
		if(substancesourcematerial.hasOrganismName()) {
			s.setSbstncSrcMtrlOrgnsmNm(String.valueOf(substancesourcematerial.getOrganismName()));
		}
		/******************** substancesourcematerialorganism ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent substancesourcematerialorganism = substancesourcematerial.getOrganism();

		/******************** substancesourcematerialorganismspecies ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismspecies = substancesourcematerialorganism.getSpecies();

		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Txt ********************************************************************************/
		if(substancesourcematerialorganismspecies.hasText()) {
			s.setSbstncSrcMtrlOrgnsmSpcsTxt(String.valueOf(substancesourcematerialorganismspecies.getText()));
		}
		/******************** substancesourcematerialorganismspeciescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismspeciescoding = substancesourcematerialorganismspecies.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismspeciescoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmSpcsCdgVrsn(String.valueOf(substancesourcematerialorganismspeciescoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismspeciescoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmSpcsCdgDsply(String.valueOf(substancesourcematerialorganismspeciescoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismspeciescoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmSpcsCdgCd(String.valueOf(substancesourcematerialorganismspeciescoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismspeciescoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd(String.valueOf(substancesourcematerialorganismspeciescoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismspeciescoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmSpcsCdgSys(String.valueOf(substancesourcematerialorganismspeciescoding.getSystem()));
		}
		/******************** substancesourcematerialorganismgenus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismgenus = substancesourcematerialorganism.getGenus();

		/******************** SbstncSrcMtrl_Orgnsm_Genus_Txt ********************************************************************************/
		if(substancesourcematerialorganismgenus.hasText()) {
			s.setSbstncSrcMtrlOrgnsmGenusTxt(String.valueOf(substancesourcematerialorganismgenus.getText()));
		}
		/******************** substancesourcematerialorganismgenuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismgenuscoding = substancesourcematerialorganismgenus.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismgenuscoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmGenusCdgVrsn(String.valueOf(substancesourcematerialorganismgenuscoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismgenuscoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmGenusCdgDsply(String.valueOf(substancesourcematerialorganismgenuscoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismgenuscoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmGenusCdgCd(String.valueOf(substancesourcematerialorganismgenuscoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismgenuscoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmGenusCdgUsrSltd(String.valueOf(substancesourcematerialorganismgenuscoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismgenuscoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmGenusCdgSys(String.valueOf(substancesourcematerialorganismgenuscoding.getSystem()));
		}
		/******************** substancesourcematerialorganismorganismgeneral ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent substancesourcematerialorganismorganismgeneral = substancesourcematerialorganism.getOrganismGeneral();

		/******************** substancesourcematerialorganismorganismgeneralclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralclass = substancesourcematerialorganismorganismgeneral.getClass_();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclass.hasText()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt(String.valueOf(substancesourcematerialorganismorganismgeneralclass.getText()));
		}
		/******************** substancesourcematerialorganismorganismgeneralclasscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralclasscoding = substancesourcematerialorganismorganismgeneralclass.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralclasscoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralclasscoding.getSystem()));
		}
		/******************** substancesourcematerialorganismorganismgeneralphylum ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralphylum = substancesourcematerialorganismorganismgeneral.getPhylum();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylum.hasText()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt(String.valueOf(substancesourcematerialorganismorganismgeneralphylum.getText()));
		}
		/******************** substancesourcematerialorganismorganismgeneralphylumcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralphylumcoding = substancesourcematerialorganismorganismgeneralphylum.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralphylumcoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralphylumcoding.getSystem()));
		}
		/******************** substancesourcematerialorganismorganismgeneralkingdom ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralkingdom = substancesourcematerialorganismorganismgeneral.getKingdom();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdom.hasText()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt(String.valueOf(substancesourcematerialorganismorganismgeneralkingdom.getText()));
		}
		/******************** substancesourcematerialorganismorganismgeneralkingdomcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralkingdomcoding = substancesourcematerialorganismorganismgeneralkingdom.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralkingdomcoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralkingdomcoding.getSystem()));
		}
		/******************** substancesourcematerialorganismorganismgeneralorder ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismorganismgeneralorder = substancesourcematerialorganismorganismgeneral.getOrder();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Txt ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralorder.hasText()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt(String.valueOf(substancesourcematerialorganismorganismgeneralorder.getText()));
		}
		/******************** substancesourcematerialorganismorganismgeneralordercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismorganismgeneralordercoding = substancesourcematerialorganismorganismgeneralorder.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismorganismgeneralordercoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys(String.valueOf(substancesourcematerialorganismorganismgeneralordercoding.getSystem()));
		}
		/******************** substancesourcematerialorganismhybrid ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent substancesourcematerialorganismhybrid = substancesourcematerialorganism.getHybrid();

		/******************** substancesourcematerialorganismhybridhybridtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismhybridhybridtype = substancesourcematerialorganismhybrid.getHybridType();

		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Txt ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtype.hasText()) {
			s.setSbstncSrcMtrlOrgnsmHybridHybridTypTxt(String.valueOf(substancesourcematerialorganismhybridhybridtype.getText()));
		}
		/******************** substancesourcematerialorganismhybridhybridtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismhybridhybridtypecoding = substancesourcematerialorganismhybridhybridtype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismhybridhybridtypecoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys(String.valueOf(substancesourcematerialorganismhybridhybridtypecoding.getSystem()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmId ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasMaternalOrganismId()) {
			s.setSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId(String.valueOf(substancesourcematerialorganismhybrid.getMaternalOrganismId()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmId ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasPaternalOrganismId()) {
			s.setSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId(String.valueOf(substancesourcematerialorganismhybrid.getPaternalOrganismId()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmNm ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasMaternalOrganismName()) {
			s.setSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm(String.valueOf(substancesourcematerialorganismhybrid.getMaternalOrganismName()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmNm ********************************************************************************/
		if(substancesourcematerialorganismhybrid.hasPaternalOrganismName()) {
			s.setSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm(String.valueOf(substancesourcematerialorganismhybrid.getPaternalOrganismName()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificDscrptn ********************************************************************************/
		if(substancesourcematerialorganism.hasIntraspecificDescription()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificDscrptn(String.valueOf(substancesourcematerialorganism.getIntraspecificDescription()));
		}
		/******************** substancesourcematerialorganismintraspecifictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismintraspecifictype = substancesourcematerialorganism.getIntraspecificType();

		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Txt ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictype.hasText()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificTypTxt(String.valueOf(substancesourcematerialorganismintraspecifictype.getText()));
		}
		/******************** substancesourcematerialorganismintraspecifictypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismintraspecifictypecoding = substancesourcematerialorganismintraspecifictype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismintraspecifictypecoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys(String.valueOf(substancesourcematerialorganismintraspecifictypecoding.getSystem()));
		}
		/******************** substancesourcematerialorganismfamily ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismfamily = substancesourcematerialorganism.getFamily();

		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Txt ********************************************************************************/
		if(substancesourcematerialorganismfamily.hasText()) {
			s.setSbstncSrcMtrlOrgnsmFmlyTxt(String.valueOf(substancesourcematerialorganismfamily.getText()));
		}
		/******************** substancesourcematerialorganismfamilycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismfamilycoding = substancesourcematerialorganismfamily.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismfamilycoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmFmlyCdgVrsn(String.valueOf(substancesourcematerialorganismfamilycoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismfamilycoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmFmlyCdgDsply(String.valueOf(substancesourcematerialorganismfamilycoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismfamilycoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmFmlyCdgCd(String.valueOf(substancesourcematerialorganismfamilycoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismfamilycoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd(String.valueOf(substancesourcematerialorganismfamilycoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismfamilycoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmFmlyCdgSys(String.valueOf(substancesourcematerialorganismfamilycoding.getSystem()));
		}
		/******************** substancesourcematerialorganismauthor ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent substancesourcematerialorganismauthor = substancesourcematerialorganism.getAuthorFirstRep();

		/******************** substancesourcematerialorganismauthorauthortype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialorganismauthorauthortype = substancesourcematerialorganismauthor.getAuthorType();

		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Txt ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortype.hasText()) {
			s.setSbstncSrcMtrlOrgnsmAthrAthrTypTxt(String.valueOf(substancesourcematerialorganismauthorauthortype.getText()));
		}
		/******************** substancesourcematerialorganismauthorauthortypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialorganismauthorauthortypecoding = substancesourcematerialorganismauthorauthortype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecoding.hasVersion()) {
			s.setSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecoding.hasCode()) {
			s.setSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialorganismauthorauthortypecoding.hasSystem()) {
			s.setSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys(String.valueOf(substancesourcematerialorganismauthorauthortypecoding.getSystem()));
		}
		/******************** substancesourcematerialparentsubstanceid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancesourcematerialparentsubstanceid = substancesourcematerial.getParentSubstanceIdFirstRep();

		/******************** SbstncSrcMtrl_ParentSbstncId_Vl ********************************************************************************/
		if(substancesourcematerialparentsubstanceid.hasValue()) {
			s.setSbstncSrcMtrlParentSbstncIdVl(String.valueOf(substancesourcematerialparentsubstanceid.getValue()));
		}
		/******************** substancesourcematerialparentsubstanceidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialparentsubstanceidtype = substancesourcematerialparentsubstanceid.getType();

		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Txt ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtype.hasText()) {
			s.setSbstncSrcMtrlParentSbstncIdTypTxt(String.valueOf(substancesourcematerialparentsubstanceidtype.getText()));
		}
		/******************** substancesourcematerialparentsubstanceidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialparentsubstanceidtypecoding = substancesourcematerialparentsubstanceidtype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecoding.hasVersion()) {
			s.setSbstncSrcMtrlParentSbstncIdTypCdgVrsn(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlParentSbstncIdTypCdgDsply(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecoding.hasCode()) {
			s.setSbstncSrcMtrlParentSbstncIdTypCdgCd(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialparentsubstanceidtypecoding.hasSystem()) {
			s.setSbstncSrcMtrlParentSbstncIdTypCdgSys(String.valueOf(substancesourcematerialparentsubstanceidtypecoding.getSystem()));
		}
		/******************** substancesourcematerialparentsubstanceidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancesourcematerialparentsubstanceidperiod = substancesourcematerialparentsubstanceid.getPeriod();

		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_Strt ********************************************************************************/
		if(substancesourcematerialparentsubstanceidperiod.hasStart()) {
			s.setSbstncSrcMtrlParentSbstncIdPrdStrt(String.valueOf(substancesourcematerialparentsubstanceidperiod.getStart()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_End ********************************************************************************/
		if(substancesourcematerialparentsubstanceidperiod.hasEnd()) {
			s.setSbstncSrcMtrlParentSbstncIdPrdEnd(String.valueOf(substancesourcematerialparentsubstanceidperiod.getEnd()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Assigner ********************************************************************************/
		if(substancesourcematerialparentsubstanceid.hasAssigner()) {
			s.setSbstncSrcMtrlParentSbstncIdAssigner(String.valueOf(substancesourcematerialparentsubstanceid.getAssigner()));
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Sys ********************************************************************************/
		if(substancesourcematerialparentsubstanceid.hasSystem()) {
			s.setSbstncSrcMtrlParentSbstncIdSys(String.valueOf(substancesourcematerialparentsubstanceid.getSystem()));
		}
		/******************** substancesourcematerialparentsubstanceiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancesourcematerialparentsubstanceiduse = substancesourcematerialparentsubstanceid.getUse();
		s.setSbstncSrcMtrlParentSbstncIdUse(substancesourcematerialparentsubstanceiduse.toCode());

		/******************** substancesourcematerialdevelopmentstage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialdevelopmentstage = substancesourcematerial.getDevelopmentStage();

		/******************** SbstncSrcMtrl_DevelopmentStage_Txt ********************************************************************************/
		if(substancesourcematerialdevelopmentstage.hasText()) {
			s.setSbstncSrcMtrlDevelopmentStageTxt(String.valueOf(substancesourcematerialdevelopmentstage.getText()));
		}
		/******************** substancesourcematerialdevelopmentstagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialdevelopmentstagecoding = substancesourcematerialdevelopmentstage.getCodingFirstRep();

		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecoding.hasVersion()) {
			s.setSbstncSrcMtrlDevelopmentStageCdgVrsn(String.valueOf(substancesourcematerialdevelopmentstagecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecoding.hasDisplay()) {
			s.setSbstncSrcMtrlDevelopmentStageCdgDsply(String.valueOf(substancesourcematerialdevelopmentstagecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecoding.hasCode()) {
			s.setSbstncSrcMtrlDevelopmentStageCdgCd(String.valueOf(substancesourcematerialdevelopmentstagecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlDevelopmentStageCdgUsrSltd(String.valueOf(substancesourcematerialdevelopmentstagecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialdevelopmentstagecoding.hasSystem()) {
			s.setSbstncSrcMtrlDevelopmentStageCdgSys(String.valueOf(substancesourcematerialdevelopmentstagecoding.getSystem()));
		}
		/******************** substancesourcematerialsourcematerialstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialstate = substancesourcematerial.getSourceMaterialState();

		/******************** SbstncSrcMtrl_SrcMtrlState_Txt ********************************************************************************/
		if(substancesourcematerialsourcematerialstate.hasText()) {
			s.setSbstncSrcMtrlSrcMtrlStateTxt(String.valueOf(substancesourcematerialsourcematerialstate.getText()));
		}
		/******************** substancesourcematerialsourcematerialstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialsourcematerialstatecoding = substancesourcematerialsourcematerialstate.getCodingFirstRep();

		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecoding.hasVersion()) {
			s.setSbstncSrcMtrlSrcMtrlStateCdgVrsn(String.valueOf(substancesourcematerialsourcematerialstatecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecoding.hasDisplay()) {
			s.setSbstncSrcMtrlSrcMtrlStateCdgDsply(String.valueOf(substancesourcematerialsourcematerialstatecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecoding.hasCode()) {
			s.setSbstncSrcMtrlSrcMtrlStateCdgCd(String.valueOf(substancesourcematerialsourcematerialstatecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlSrcMtrlStateCdgUsrSltd(String.valueOf(substancesourcematerialsourcematerialstatecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialsourcematerialstatecoding.hasSystem()) {
			s.setSbstncSrcMtrlSrcMtrlStateCdgSys(String.valueOf(substancesourcematerialsourcematerialstatecoding.getSystem()));
		}
		/******************** substancesourcematerialsourcematerialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialtype = substancesourcematerial.getSourceMaterialType();

		/******************** SbstncSrcMtrl_SrcMtrlTyp_Txt ********************************************************************************/
		if(substancesourcematerialsourcematerialtype.hasText()) {
			s.setSbstncSrcMtrlSrcMtrlTypTxt(String.valueOf(substancesourcematerialsourcematerialtype.getText()));
		}
		/******************** substancesourcematerialsourcematerialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialsourcematerialtypecoding = substancesourcematerialsourcematerialtype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecoding.hasVersion()) {
			s.setSbstncSrcMtrlSrcMtrlTypCdgVrsn(String.valueOf(substancesourcematerialsourcematerialtypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlSrcMtrlTypCdgDsply(String.valueOf(substancesourcematerialsourcematerialtypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecoding.hasCode()) {
			s.setSbstncSrcMtrlSrcMtrlTypCdgCd(String.valueOf(substancesourcematerialsourcematerialtypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlSrcMtrlTypCdgUsrSltd(String.valueOf(substancesourcematerialsourcematerialtypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialsourcematerialtypecoding.hasSystem()) {
			s.setSbstncSrcMtrlSrcMtrlTypCdgSys(String.valueOf(substancesourcematerialsourcematerialtypecoding.getSystem()));
		}
		/******************** substancesourcematerialcountryoforigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialcountryoforigin = substancesourcematerial.getCountryOfOriginFirstRep();

		/******************** SbstncSrcMtrl_CntryOfOrigin_Txt ********************************************************************************/
		if(substancesourcematerialcountryoforigin.hasText()) {
			s.setSbstncSrcMtrlCntryOfOriginTxt(String.valueOf(substancesourcematerialcountryoforigin.getText()));
		}
		/******************** substancesourcematerialcountryoforigincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialcountryoforigincoding = substancesourcematerialcountryoforigin.getCodingFirstRep();

		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialcountryoforigincoding.hasVersion()) {
			s.setSbstncSrcMtrlCntryOfOriginCdgVrsn(String.valueOf(substancesourcematerialcountryoforigincoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialcountryoforigincoding.hasDisplay()) {
			s.setSbstncSrcMtrlCntryOfOriginCdgDsply(String.valueOf(substancesourcematerialcountryoforigincoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialcountryoforigincoding.hasCode()) {
			s.setSbstncSrcMtrlCntryOfOriginCdgCd(String.valueOf(substancesourcematerialcountryoforigincoding.getCode()));
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialcountryoforigincoding.hasUserSelected()) {
			s.setSbstncSrcMtrlCntryOfOriginCdgUsrSltd(String.valueOf(substancesourcematerialcountryoforigincoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialcountryoforigincoding.hasSystem()) {
			s.setSbstncSrcMtrlCntryOfOriginCdgSys(String.valueOf(substancesourcematerialcountryoforigincoding.getSystem()));
		}
		/******************** substancesourcematerialsourcematerialclass ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialsourcematerialclass = substancesourcematerial.getSourceMaterialClass();

		/******************** SbstncSrcMtrl_SrcMtrlCls_Txt ********************************************************************************/
		if(substancesourcematerialsourcematerialclass.hasText()) {
			s.setSbstncSrcMtrlSrcMtrlClsTxt(String.valueOf(substancesourcematerialsourcematerialclass.getText()));
		}
		/******************** substancesourcematerialsourcematerialclasscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialsourcematerialclasscoding = substancesourcematerialsourcematerialclass.getCodingFirstRep();

		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscoding.hasVersion()) {
			s.setSbstncSrcMtrlSrcMtrlClsCdgVrsn(String.valueOf(substancesourcematerialsourcematerialclasscoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscoding.hasDisplay()) {
			s.setSbstncSrcMtrlSrcMtrlClsCdgDsply(String.valueOf(substancesourcematerialsourcematerialclasscoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscoding.hasCode()) {
			s.setSbstncSrcMtrlSrcMtrlClsCdgCd(String.valueOf(substancesourcematerialsourcematerialclasscoding.getCode()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscoding.hasUserSelected()) {
			s.setSbstncSrcMtrlSrcMtrlClsCdgUsrSltd(String.valueOf(substancesourcematerialsourcematerialclasscoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialsourcematerialclasscoding.hasSystem()) {
			s.setSbstncSrcMtrlSrcMtrlClsCdgSys(String.valueOf(substancesourcematerialsourcematerialclasscoding.getSystem()));
		}
		/******************** substancesourcematerialpartdescription ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent substancesourcematerialpartdescription = substancesourcematerial.getPartDescriptionFirstRep();

		/******************** substancesourcematerialpartdescriptionpart ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialpartdescriptionpart = substancesourcematerialpartdescription.getPart();

		/******************** SbstncSrcMtrl_PartDscrptn_Part_Txt ********************************************************************************/
		if(substancesourcematerialpartdescriptionpart.hasText()) {
			s.setSbstncSrcMtrlPartDscrptnPartTxt(String.valueOf(substancesourcematerialpartdescriptionpart.getText()));
		}
		/******************** substancesourcematerialpartdescriptionpartcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialpartdescriptionpartcoding = substancesourcematerialpartdescriptionpart.getCodingFirstRep();

		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcoding.hasVersion()) {
			s.setSbstncSrcMtrlPartDscrptnPartCdgVrsn(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcoding.hasDisplay()) {
			s.setSbstncSrcMtrlPartDscrptnPartCdgDsply(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcoding.hasCode()) {
			s.setSbstncSrcMtrlPartDscrptnPartCdgCd(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getCode()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcoding.hasUserSelected()) {
			s.setSbstncSrcMtrlPartDscrptnPartCdgUsrSltd(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartcoding.hasSystem()) {
			s.setSbstncSrcMtrlPartDscrptnPartCdgSys(String.valueOf(substancesourcematerialpartdescriptionpartcoding.getSystem()));
		}
		/******************** substancesourcematerialpartdescriptionpartlocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialpartdescriptionpartlocation = substancesourcematerialpartdescription.getPartLocation();

		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Txt ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocation.hasText()) {
			s.setSbstncSrcMtrlPartDscrptnPartLctnTxt(String.valueOf(substancesourcematerialpartdescriptionpartlocation.getText()));
		}
		/******************** substancesourcematerialpartdescriptionpartlocationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialpartdescriptionpartlocationcoding = substancesourcematerialpartdescriptionpartlocation.getCodingFirstRep();

		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasVersion()) {
			s.setSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasDisplay()) {
			s.setSbstncSrcMtrlPartDscrptnPartLctnCdgDsply(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasCode()) {
			s.setSbstncSrcMtrlPartDscrptnPartLctnCdgCd(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getCode()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasUserSelected()) {
			s.setSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialpartdescriptionpartlocationcoding.hasSystem()) {
			s.setSbstncSrcMtrlPartDscrptnPartLctnCdgSys(String.valueOf(substancesourcematerialpartdescriptionpartlocationcoding.getSystem()));
		}
		/******************** substancesourcematerialfractiondescription ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent substancesourcematerialfractiondescription = substancesourcematerial.getFractionDescriptionFirstRep();

		/******************** substancesourcematerialfractiondescriptionmaterialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancesourcematerialfractiondescriptionmaterialtype = substancesourcematerialfractiondescription.getMaterialType();

		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Txt ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtype.hasText()) {
			s.setSbstncSrcMtrlFractionDscrptnMtrlTypTxt(String.valueOf(substancesourcematerialfractiondescriptionmaterialtype.getText()));
		}
		/******************** substancesourcematerialfractiondescriptionmaterialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancesourcematerialfractiondescriptionmaterialtypecoding = substancesourcematerialfractiondescriptionmaterialtype.getCodingFirstRep();

		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasVersion()) {
			s.setSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getVersion()));
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Dsply ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasDisplay()) {
			s.setSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getDisplay()));
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Cd ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasCode()) {
			s.setSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getCode()));
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasUserSelected()) {
			s.setSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getUserSelected()));
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Sys ********************************************************************************/
		if(substancesourcematerialfractiondescriptionmaterialtypecoding.hasSystem()) {
			s.setSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys(String.valueOf(substancesourcematerialfractiondescriptionmaterialtypecoding.getSystem()));
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_Fraction ********************************************************************************/
		if(substancesourcematerialfractiondescription.hasFraction()) {
			s.setSbstncSrcMtrlFractionDscrptnFraction(String.valueOf(substancesourcematerialfractiondescription.getFraction()));
		}
		return s;
	}
}
