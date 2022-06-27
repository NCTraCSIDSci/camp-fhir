package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceReferenceInformation;
public class SubstanceReferenceInformationBidirectionalConversion 
{
	public SubstanceReferenceInformation SubstanceReferenceInformations(org.hl7.fhir.r4.model.SubstanceReferenceInformation substancereferenceinformation) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceReferenceInformation s = new  main.java.com.campfhir.model.SubstanceReferenceInformation();

		/******************** id ********************************************************************************/
		substancereferenceinformation.setId(s.getId());

		/******************** SbstncRfrncInfo_Comment ********************************************************************************/
		if(substancereferenceinformation.hasComment()) {
			s.setSbstncRfrncInfoComment(String.valueOf(substancereferenceinformation.getComment()));
		}
		/******************** substancereferenceinformationgene ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent substancereferenceinformationgene = substancereferenceinformation.getGeneFirstRep();

		/******************** substancereferenceinformationgenegene ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgenegene = substancereferenceinformationgene.getGene();

		/******************** SbstncRfrncInfo_Gene_Gene_Txt ********************************************************************************/
		if(substancereferenceinformationgenegene.hasText()) {
			s.setSbstncRfrncInfoGeneGeneTxt(String.valueOf(substancereferenceinformationgenegene.getText()));
		}
		/******************** substancereferenceinformationgenegenecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationgenegenecoding = substancereferenceinformationgenegene.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationgenegenecoding.hasVersion()) {
			s.setSbstncRfrncInfoGeneGeneCdgVrsn(String.valueOf(substancereferenceinformationgenegenecoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationgenegenecoding.hasDisplay()) {
			s.setSbstncRfrncInfoGeneGeneCdgDsply(String.valueOf(substancereferenceinformationgenegenecoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationgenegenecoding.hasCode()) {
			s.setSbstncRfrncInfoGeneGeneCdgCd(String.valueOf(substancereferenceinformationgenegenecoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationgenegenecoding.hasUserSelected()) {
			s.setSbstncRfrncInfoGeneGeneCdgUsrSltd(String.valueOf(substancereferenceinformationgenegenecoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationgenegenecoding.hasSystem()) {
			s.setSbstncRfrncInfoGeneGeneCdgSys(String.valueOf(substancereferenceinformationgenegenecoding.getSystem()));
		}
		/******************** substancereferenceinformationgenegenesequenceorigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgenegenesequenceorigin = substancereferenceinformationgene.getGeneSequenceOrigin();

		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Txt ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigin.hasText()) {
			s.setSbstncRfrncInfoGeneGeneSqncOriginTxt(String.valueOf(substancereferenceinformationgenegenesequenceorigin.getText()));
		}
		/******************** substancereferenceinformationgenegenesequenceorigincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationgenegenesequenceorigincoding = substancereferenceinformationgenegenesequenceorigin.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincoding.hasVersion()) {
			s.setSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincoding.hasDisplay()) {
			s.setSbstncRfrncInfoGeneGeneSqncOriginCdgDsply(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincoding.hasCode()) {
			s.setSbstncRfrncInfoGeneGeneSqncOriginCdgCd(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincoding.hasUserSelected()) {
			s.setSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincoding.hasSystem()) {
			s.setSbstncRfrncInfoGeneGeneSqncOriginCdgSys(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getSystem()));
		}
		/******************** SbstncRfrncInfo_Gene_Src ********************************************************************************/
		if(substancereferenceinformationgene.hasSource()) {
			s.setSbstncRfrncInfoGeneSrc(String.valueOf(substancereferenceinformationgene.getSourceFirstRep()));
		}
		/******************** substancereferenceinformationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent substancereferenceinformationclassification = substancereferenceinformation.getClassificationFirstRep();

		/******************** substancereferenceinformationclassificationsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationsubtype = substancereferenceinformationclassification.getSubtypeFirstRep();

		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Txt ********************************************************************************/
		if(substancereferenceinformationclassificationsubtype.hasText()) {
			s.setSbstncRfrncInfoClsfctnSubtypeTxt(String.valueOf(substancereferenceinformationclassificationsubtype.getText()));
		}
		/******************** substancereferenceinformationclassificationsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationclassificationsubtypecoding = substancereferenceinformationclassificationsubtype.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecoding.hasVersion()) {
			s.setSbstncRfrncInfoClsfctnSubtypeCdgVrsn(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecoding.hasDisplay()) {
			s.setSbstncRfrncInfoClsfctnSubtypeCdgDsply(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecoding.hasCode()) {
			s.setSbstncRfrncInfoClsfctnSubtypeCdgCd(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecoding.hasUserSelected()) {
			s.setSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecoding.hasSystem()) {
			s.setSbstncRfrncInfoClsfctnSubtypeCdgSys(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getSystem()));
		}
		/******************** substancereferenceinformationclassificationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationclassification = substancereferenceinformationclassification.getClassification();

		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Txt ********************************************************************************/
		if(substancereferenceinformationclassificationclassification.hasText()) {
			s.setSbstncRfrncInfoClsfctnClsfctnTxt(String.valueOf(substancereferenceinformationclassificationclassification.getText()));
		}
		/******************** substancereferenceinformationclassificationclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationclassificationclassificationcoding = substancereferenceinformationclassificationclassification.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcoding.hasVersion()) {
			s.setSbstncRfrncInfoClsfctnClsfctnCdgVrsn(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcoding.hasDisplay()) {
			s.setSbstncRfrncInfoClsfctnClsfctnCdgDsply(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcoding.hasCode()) {
			s.setSbstncRfrncInfoClsfctnClsfctnCdgCd(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcoding.hasUserSelected()) {
			s.setSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcoding.hasSystem()) {
			s.setSbstncRfrncInfoClsfctnClsfctnCdgSys(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getSystem()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Src ********************************************************************************/
		if(substancereferenceinformationclassification.hasSource()) {
			s.setSbstncRfrncInfoClsfctnSrc(String.valueOf(substancereferenceinformationclassification.getSourceFirstRep()));
		}
		/******************** substancereferenceinformationclassificationdomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationdomain = substancereferenceinformationclassification.getDomain();

		/******************** SbstncRfrncInfo_Clsfctn_Domain_Txt ********************************************************************************/
		if(substancereferenceinformationclassificationdomain.hasText()) {
			s.setSbstncRfrncInfoClsfctnDomainTxt(String.valueOf(substancereferenceinformationclassificationdomain.getText()));
		}
		/******************** substancereferenceinformationclassificationdomaincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationclassificationdomaincoding = substancereferenceinformationclassificationdomain.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincoding.hasVersion()) {
			s.setSbstncRfrncInfoClsfctnDomainCdgVrsn(String.valueOf(substancereferenceinformationclassificationdomaincoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincoding.hasDisplay()) {
			s.setSbstncRfrncInfoClsfctnDomainCdgDsply(String.valueOf(substancereferenceinformationclassificationdomaincoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincoding.hasCode()) {
			s.setSbstncRfrncInfoClsfctnDomainCdgCd(String.valueOf(substancereferenceinformationclassificationdomaincoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincoding.hasUserSelected()) {
			s.setSbstncRfrncInfoClsfctnDomainCdgUsrSltd(String.valueOf(substancereferenceinformationclassificationdomaincoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincoding.hasSystem()) {
			s.setSbstncRfrncInfoClsfctnDomainCdgSys(String.valueOf(substancereferenceinformationclassificationdomaincoding.getSystem()));
		}
		/******************** substancereferenceinformationgeneelement ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneElementComponent substancereferenceinformationgeneelement = substancereferenceinformation.getGeneElementFirstRep();

		/******************** substancereferenceinformationgeneelementtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgeneelementtype = substancereferenceinformationgeneelement.getType();

		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Txt ********************************************************************************/
		if(substancereferenceinformationgeneelementtype.hasText()) {
			s.setSbstncRfrncInfoGeneElmntTypTxt(String.valueOf(substancereferenceinformationgeneelementtype.getText()));
		}
		/******************** substancereferenceinformationgeneelementtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationgeneelementtypecoding = substancereferenceinformationgeneelementtype.getCodingFirstRep();

		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationgeneelementtypecoding.hasVersion()) {
			s.setSbstncRfrncInfoGeneElmntTypCdgVrsn(String.valueOf(substancereferenceinformationgeneelementtypecoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationgeneelementtypecoding.hasDisplay()) {
			s.setSbstncRfrncInfoGeneElmntTypCdgDsply(String.valueOf(substancereferenceinformationgeneelementtypecoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationgeneelementtypecoding.hasCode()) {
			s.setSbstncRfrncInfoGeneElmntTypCdgCd(String.valueOf(substancereferenceinformationgeneelementtypecoding.getCode()));
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationgeneelementtypecoding.hasUserSelected()) {
			s.setSbstncRfrncInfoGeneElmntTypCdgUsrSltd(String.valueOf(substancereferenceinformationgeneelementtypecoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationgeneelementtypecoding.hasSystem()) {
			s.setSbstncRfrncInfoGeneElmntTypCdgSys(String.valueOf(substancereferenceinformationgeneelementtypecoding.getSystem()));
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Src ********************************************************************************/
		if(substancereferenceinformationgeneelement.hasSource()) {
			s.setSbstncRfrncInfoGeneElmntSrc(String.valueOf(substancereferenceinformationgeneelement.getSourceFirstRep()));
		}
		/******************** substancereferenceinformationtarget ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationTargetComponent substancereferenceinformationtarget = substancereferenceinformation.getTargetFirstRep();

		/******************** substancereferenceinformationtargettype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtargettype = substancereferenceinformationtarget.getType();

		/******************** SbstncRfrncInfo_Target_Typ_Txt ********************************************************************************/
		if(substancereferenceinformationtargettype.hasText()) {
			s.setSbstncRfrncInfoTarTypTxt(String.valueOf(substancereferenceinformationtargettype.getText()));
		}
		/******************** substancereferenceinformationtargettypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtargettypecoding = substancereferenceinformationtargettype.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Target_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationtargettypecoding.hasVersion()) {
			s.setSbstncRfrncInfoTarTypCdgVrsn(String.valueOf(substancereferenceinformationtargettypecoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Target_Typ_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationtargettypecoding.hasDisplay()) {
			s.setSbstncRfrncInfoTarTypCdgDsply(String.valueOf(substancereferenceinformationtargettypecoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Target_Typ_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationtargettypecoding.hasCode()) {
			s.setSbstncRfrncInfoTarTypCdgCd(String.valueOf(substancereferenceinformationtargettypecoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationtargettypecoding.hasUserSelected()) {
			s.setSbstncRfrncInfoTarTypCdgUsrSltd(String.valueOf(substancereferenceinformationtargettypecoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Target_Typ_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationtargettypecoding.hasSystem()) {
			s.setSbstncRfrncInfoTarTypCdgSys(String.valueOf(substancereferenceinformationtargettypecoding.getSystem()));
		}
		/******************** substancereferenceinformationtargetinteraction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtargetinteraction = substancereferenceinformationtarget.getInteraction();

		/******************** SbstncRfrncInfo_Target_Interaction_Txt ********************************************************************************/
		if(substancereferenceinformationtargetinteraction.hasText()) {
			s.setSbstncRfrncInfoTarInteractionTxt(String.valueOf(substancereferenceinformationtargetinteraction.getText()));
		}
		/******************** substancereferenceinformationtargetinteractioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtargetinteractioncoding = substancereferenceinformationtargetinteraction.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Target_Interaction_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationtargetinteractioncoding.hasVersion()) {
			s.setSbstncRfrncInfoTarInteractionCdgVrsn(String.valueOf(substancereferenceinformationtargetinteractioncoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Target_Interaction_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationtargetinteractioncoding.hasDisplay()) {
			s.setSbstncRfrncInfoTarInteractionCdgDsply(String.valueOf(substancereferenceinformationtargetinteractioncoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Target_Interaction_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationtargetinteractioncoding.hasCode()) {
			s.setSbstncRfrncInfoTarInteractionCdgCd(String.valueOf(substancereferenceinformationtargetinteractioncoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_Interaction_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationtargetinteractioncoding.hasUserSelected()) {
			s.setSbstncRfrncInfoTarInteractionCdgUsrSltd(String.valueOf(substancereferenceinformationtargetinteractioncoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Target_Interaction_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationtargetinteractioncoding.hasSystem()) {
			s.setSbstncRfrncInfoTarInteractionCdgSys(String.valueOf(substancereferenceinformationtargetinteractioncoding.getSystem()));
		}
		/******************** substancereferenceinformationtargetorganismtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtargetorganismtype = substancereferenceinformationtarget.getOrganismType();

		/******************** SbstncRfrncInfo_Target_OrgnsmTyp_Txt ********************************************************************************/
		if(substancereferenceinformationtargetorganismtype.hasText()) {
			s.setSbstncRfrncInfoTarOrgnsmTypTxt(String.valueOf(substancereferenceinformationtargetorganismtype.getText()));
		}
		/******************** substancereferenceinformationtargetorganismtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtargetorganismtypecoding = substancereferenceinformationtargetorganismtype.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Target_OrgnsmTyp_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationtargetorganismtypecoding.hasVersion()) {
			s.setSbstncRfrncInfoTarOrgnsmTypCdgVrsn(String.valueOf(substancereferenceinformationtargetorganismtypecoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Target_OrgnsmTyp_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationtargetorganismtypecoding.hasDisplay()) {
			s.setSbstncRfrncInfoTarOrgnsmTypCdgDsply(String.valueOf(substancereferenceinformationtargetorganismtypecoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Target_OrgnsmTyp_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationtargetorganismtypecoding.hasCode()) {
			s.setSbstncRfrncInfoTarOrgnsmTypCdgCd(String.valueOf(substancereferenceinformationtargetorganismtypecoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_OrgnsmTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationtargetorganismtypecoding.hasUserSelected()) {
			s.setSbstncRfrncInfoTarOrgnsmTypCdgUsrSltd(String.valueOf(substancereferenceinformationtargetorganismtypecoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Target_OrgnsmTyp_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationtargetorganismtypecoding.hasSystem()) {
			s.setSbstncRfrncInfoTarOrgnsmTypCdgSys(String.valueOf(substancereferenceinformationtargetorganismtypecoding.getSystem()));
		}
		/******************** substancereferenceinformationtargetamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancereferenceinformationtargetamountquantity = substancereferenceinformationtarget.getAmountQuantity();

		/******************** SbstncRfrncInfo_Target_AmntQnty_Vl ********************************************************************************/
		if(substancereferenceinformationtargetamountquantity.hasValue()) {
			s.setSbstncRfrncInfoTarAmntQntyVl(String.valueOf(substancereferenceinformationtargetamountquantity.getValue()));
		}
		/******************** substancereferenceinformationtargetamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancereferenceinformationtargetamountquantitycomparator = substancereferenceinformationtargetamountquantity.getComparator();
		s.setSbstncRfrncInfoTarAmntQntyCmprtr(substancereferenceinformationtargetamountquantitycomparator.toCode());

		/******************** SbstncRfrncInfo_Target_AmntQnty_Cd ********************************************************************************/
		if(substancereferenceinformationtargetamountquantity.hasCode()) {
			s.setSbstncRfrncInfoTarAmntQntyCd(String.valueOf(substancereferenceinformationtargetamountquantity.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_AmntQnty_Unt ********************************************************************************/
		if(substancereferenceinformationtargetamountquantity.hasUnit()) {
			s.setSbstncRfrncInfoTarAmntQntyUnt(String.valueOf(substancereferenceinformationtargetamountquantity.getUnit()));
		}
		/******************** SbstncRfrncInfo_Target_AmntQnty_Sys ********************************************************************************/
		if(substancereferenceinformationtargetamountquantity.hasSystem()) {
			s.setSbstncRfrncInfoTarAmntQntySys(String.valueOf(substancereferenceinformationtargetamountquantity.getSystem()));
		}
		/******************** substancereferenceinformationtargetamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancereferenceinformationtargetamountrange = substancereferenceinformationtarget.getAmountRange();

		/******************** substancereferenceinformationtargetamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancereferenceinformationtargetamountrangelow = substancereferenceinformationtargetamountrange.getLow();

		/******************** SbstncRfrncInfo_Target_AmntRng_Lw_Vl ********************************************************************************/
		if(substancereferenceinformationtargetamountrangelow.hasValue()) {
			s.setSbstncRfrncInfoTarAmntRngLwVl(String.valueOf(substancereferenceinformationtargetamountrangelow.getValue()));
		}
		/******************** substancereferenceinformationtargetamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancereferenceinformationtargetamountrangelowcomparator = substancereferenceinformationtargetamountrangelow.getComparator();
		s.setSbstncRfrncInfoTarAmntRngLwCmprtr(substancereferenceinformationtargetamountrangelowcomparator.toCode());

		/******************** SbstncRfrncInfo_Target_AmntRng_Lw_Cd ********************************************************************************/
		if(substancereferenceinformationtargetamountrangelow.hasCode()) {
			s.setSbstncRfrncInfoTarAmntRngLwCd(String.valueOf(substancereferenceinformationtargetamountrangelow.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_AmntRng_Lw_Unt ********************************************************************************/
		if(substancereferenceinformationtargetamountrangelow.hasUnit()) {
			s.setSbstncRfrncInfoTarAmntRngLwUnt(String.valueOf(substancereferenceinformationtargetamountrangelow.getUnit()));
		}
		/******************** SbstncRfrncInfo_Target_AmntRng_Lw_Sys ********************************************************************************/
		if(substancereferenceinformationtargetamountrangelow.hasSystem()) {
			s.setSbstncRfrncInfoTarAmntRngLwSys(String.valueOf(substancereferenceinformationtargetamountrangelow.getSystem()));
		}
		/******************** substancereferenceinformationtargetamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancereferenceinformationtargetamountrangehigh = substancereferenceinformationtargetamountrange.getHigh();

		/******************** SbstncRfrncInfo_Target_AmntRng_Hi_Vl ********************************************************************************/
		if(substancereferenceinformationtargetamountrangehigh.hasValue()) {
			s.setSbstncRfrncInfoTarAmntRngHiVl(String.valueOf(substancereferenceinformationtargetamountrangehigh.getValue()));
		}
		/******************** substancereferenceinformationtargetamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancereferenceinformationtargetamountrangehighcomparator = substancereferenceinformationtargetamountrangehigh.getComparator();
		s.setSbstncRfrncInfoTarAmntRngHiCmprtr(substancereferenceinformationtargetamountrangehighcomparator.toCode());

		/******************** SbstncRfrncInfo_Target_AmntRng_Hi_Cd ********************************************************************************/
		if(substancereferenceinformationtargetamountrangehigh.hasCode()) {
			s.setSbstncRfrncInfoTarAmntRngHiCd(String.valueOf(substancereferenceinformationtargetamountrangehigh.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_AmntRng_Hi_Unt ********************************************************************************/
		if(substancereferenceinformationtargetamountrangehigh.hasUnit()) {
			s.setSbstncRfrncInfoTarAmntRngHiUnt(String.valueOf(substancereferenceinformationtargetamountrangehigh.getUnit()));
		}
		/******************** SbstncRfrncInfo_Target_AmntRng_Hi_Sys ********************************************************************************/
		if(substancereferenceinformationtargetamountrangehigh.hasSystem()) {
			s.setSbstncRfrncInfoTarAmntRngHiSys(String.valueOf(substancereferenceinformationtargetamountrangehigh.getSystem()));
		}
		/******************** substancereferenceinformationtargetamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtargetamounttype = substancereferenceinformationtarget.getAmountType();

		/******************** SbstncRfrncInfo_Target_AmntTyp_Txt ********************************************************************************/
		if(substancereferenceinformationtargetamounttype.hasText()) {
			s.setSbstncRfrncInfoTarAmntTypTxt(String.valueOf(substancereferenceinformationtargetamounttype.getText()));
		}
		/******************** substancereferenceinformationtargetamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtargetamounttypecoding = substancereferenceinformationtargetamounttype.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Target_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationtargetamounttypecoding.hasVersion()) {
			s.setSbstncRfrncInfoTarAmntTypCdgVrsn(String.valueOf(substancereferenceinformationtargetamounttypecoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Target_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationtargetamounttypecoding.hasDisplay()) {
			s.setSbstncRfrncInfoTarAmntTypCdgDsply(String.valueOf(substancereferenceinformationtargetamounttypecoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Target_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationtargetamounttypecoding.hasCode()) {
			s.setSbstncRfrncInfoTarAmntTypCdgCd(String.valueOf(substancereferenceinformationtargetamounttypecoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationtargetamounttypecoding.hasUserSelected()) {
			s.setSbstncRfrncInfoTarAmntTypCdgUsrSltd(String.valueOf(substancereferenceinformationtargetamounttypecoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Target_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationtargetamounttypecoding.hasSystem()) {
			s.setSbstncRfrncInfoTarAmntTypCdgSys(String.valueOf(substancereferenceinformationtargetamounttypecoding.getSystem()));
		}
		/******************** SbstncRfrncInfo_Target_AmntStrgTyp ********************************************************************************/
		if(substancereferenceinformationtarget.hasAmountStringType()) {
			s.setSbstncRfrncInfoTarAmntStrgTyp(String.valueOf(substancereferenceinformationtarget.getAmountStringType()));
		}
		/******************** substancereferenceinformationtargetorganism ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtargetorganism = substancereferenceinformationtarget.getOrganism();

		/******************** SbstncRfrncInfo_Target_Orgnsm_Txt ********************************************************************************/
		if(substancereferenceinformationtargetorganism.hasText()) {
			s.setSbstncRfrncInfoTarOrgnsmTxt(String.valueOf(substancereferenceinformationtargetorganism.getText()));
		}
		/******************** substancereferenceinformationtargetorganismcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtargetorganismcoding = substancereferenceinformationtargetorganism.getCodingFirstRep();

		/******************** SbstncRfrncInfo_Target_Orgnsm_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationtargetorganismcoding.hasVersion()) {
			s.setSbstncRfrncInfoTarOrgnsmCdgVrsn(String.valueOf(substancereferenceinformationtargetorganismcoding.getVersion()));
		}
		/******************** SbstncRfrncInfo_Target_Orgnsm_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationtargetorganismcoding.hasDisplay()) {
			s.setSbstncRfrncInfoTarOrgnsmCdgDsply(String.valueOf(substancereferenceinformationtargetorganismcoding.getDisplay()));
		}
		/******************** SbstncRfrncInfo_Target_Orgnsm_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationtargetorganismcoding.hasCode()) {
			s.setSbstncRfrncInfoTarOrgnsmCdgCd(String.valueOf(substancereferenceinformationtargetorganismcoding.getCode()));
		}
		/******************** SbstncRfrncInfo_Target_Orgnsm_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationtargetorganismcoding.hasUserSelected()) {
			s.setSbstncRfrncInfoTarOrgnsmCdgUsrSltd(String.valueOf(substancereferenceinformationtargetorganismcoding.getUserSelected()));
		}
		/******************** SbstncRfrncInfo_Target_Orgnsm_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationtargetorganismcoding.hasSystem()) {
			s.setSbstncRfrncInfoTarOrgnsmCdgSys(String.valueOf(substancereferenceinformationtargetorganismcoding.getSystem()));
		}
		/******************** SbstncRfrncInfo_Target_Src ********************************************************************************/
		if(substancereferenceinformationtarget.hasSource()) {
			s.setSbstncRfrncInfoTarSrc(String.valueOf(substancereferenceinformationtarget.getSourceFirstRep()));
		}
		return s;
	}
}
