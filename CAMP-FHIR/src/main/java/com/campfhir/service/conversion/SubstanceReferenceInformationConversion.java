package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceReferenceInformation;
public class SubstanceReferenceInformationConversion 
{
	public org.hl7.fhir.r4.model.SubstanceReferenceInformation SubstanceReferenceInformations(SubstanceReferenceInformation s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceReferenceInformation substancereferenceinformation = new org.hl7.fhir.r4.model.SubstanceReferenceInformation();

		/******************** id ********************************************************************************/
		substancereferenceinformation.setId(s.getId());

		/******************** substancereferenceinformationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent substancereferenceinformationclassification =  new org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent();
		substancereferenceinformation.addClassification(substancereferenceinformationclassification);

		/******************** substancereferenceinformationclassificationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationclassification =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationclassification.setClassification(substancereferenceinformationclassificationclassification);

		/******************** substancereferenceinformationclassificationclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationclassificationclassificationcoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationclassificationclassification.addCoding(substancereferenceinformationclassificationclassificationcoding);

		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnClsfctnCdgCd() != null) {
			substancereferenceinformationclassificationclassificationcoding.setCode(s.getSbstncRfrncInfoClsfctnClsfctnCdgCd());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnClsfctnCdgDsply() != null) {
			substancereferenceinformationclassificationclassificationcoding.setDisplay(s.getSbstncRfrncInfoClsfctnClsfctnCdgDsply());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnClsfctnCdgSys() != null) {
			substancereferenceinformationclassificationclassificationcoding.setSystem(s.getSbstncRfrncInfoClsfctnClsfctnCdgSys());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd() != null) {
			substancereferenceinformationclassificationclassificationcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnClsfctnCdgVrsn() != null) {
			substancereferenceinformationclassificationclassificationcoding.setVersion(s.getSbstncRfrncInfoClsfctnClsfctnCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnClsfctnTxt() != null) {
			substancereferenceinformationclassificationclassification.setText(s.getSbstncRfrncInfoClsfctnClsfctnTxt());
		}
		/******************** substancereferenceinformationclassificationdomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationdomain =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationclassification.setDomain(substancereferenceinformationclassificationdomain);

		/******************** substancereferenceinformationclassificationdomaincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationclassificationdomaincoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationclassificationdomain.addCoding(substancereferenceinformationclassificationdomaincoding);

		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnDomainCdgCd() != null) {
			substancereferenceinformationclassificationdomaincoding.setCode(s.getSbstncRfrncInfoClsfctnDomainCdgCd());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnDomainCdgDsply() != null) {
			substancereferenceinformationclassificationdomaincoding.setDisplay(s.getSbstncRfrncInfoClsfctnDomainCdgDsply());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnDomainCdgSys() != null) {
			substancereferenceinformationclassificationdomaincoding.setSystem(s.getSbstncRfrncInfoClsfctnDomainCdgSys());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnDomainCdgUsrSltd() != null) {
			substancereferenceinformationclassificationdomaincoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoClsfctnDomainCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnDomainCdgVrsn() != null) {
			substancereferenceinformationclassificationdomaincoding.setVersion(s.getSbstncRfrncInfoClsfctnDomainCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Domain_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnDomainTxt() != null) {
			substancereferenceinformationclassificationdomain.setText(s.getSbstncRfrncInfoClsfctnDomainTxt());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Src ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSrc() != null) {
			substancereferenceinformationclassification.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncRfrncInfoClsfctnSrc()));
		}
		/******************** substancereferenceinformationclassificationsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationsubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationclassification.addSubtype(substancereferenceinformationclassificationsubtype);

		/******************** substancereferenceinformationclassificationsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationclassificationsubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationclassificationsubtype.addCoding(substancereferenceinformationclassificationsubtypecoding);

		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSubtypeCdgCd() != null) {
			substancereferenceinformationclassificationsubtypecoding.setCode(s.getSbstncRfrncInfoClsfctnSubtypeCdgCd());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSubtypeCdgDsply() != null) {
			substancereferenceinformationclassificationsubtypecoding.setDisplay(s.getSbstncRfrncInfoClsfctnSubtypeCdgDsply());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSubtypeCdgSys() != null) {
			substancereferenceinformationclassificationsubtypecoding.setSystem(s.getSbstncRfrncInfoClsfctnSubtypeCdgSys());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd() != null) {
			substancereferenceinformationclassificationsubtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSubtypeCdgVrsn() != null) {
			substancereferenceinformationclassificationsubtypecoding.setVersion(s.getSbstncRfrncInfoClsfctnSubtypeCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoClsfctnSubtypeTxt() != null) {
			substancereferenceinformationclassificationsubtype.setText(s.getSbstncRfrncInfoClsfctnSubtypeTxt());
		}
		/******************** SbstncRfrncInfo_Comment ********************************************************************************/
		if(s.getSbstncRfrncInfoComment() != null) {
			substancereferenceinformation.setComment(s.getSbstncRfrncInfoComment());
		}
		/******************** substancereferenceinformationgene ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent substancereferenceinformationgene =  new org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent();
		substancereferenceinformation.addGene(substancereferenceinformationgene);

		/******************** substancereferenceinformationgenegene ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgenegene =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationgene.setGene(substancereferenceinformationgenegene);

		/******************** substancereferenceinformationgenegenecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationgenegenecoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationgenegene.addCoding(substancereferenceinformationgenegenecoding);

		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneCdgCd() != null) {
			substancereferenceinformationgenegenecoding.setCode(s.getSbstncRfrncInfoGeneGeneCdgCd());
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneCdgDsply() != null) {
			substancereferenceinformationgenegenecoding.setDisplay(s.getSbstncRfrncInfoGeneGeneCdgDsply());
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneCdgSys() != null) {
			substancereferenceinformationgenegenecoding.setSystem(s.getSbstncRfrncInfoGeneGeneCdgSys());
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneCdgUsrSltd() != null) {
			substancereferenceinformationgenegenecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoGeneGeneCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneCdgVrsn() != null) {
			substancereferenceinformationgenegenecoding.setVersion(s.getSbstncRfrncInfoGeneGeneCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Gene_Gene_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneTxt() != null) {
			substancereferenceinformationgenegene.setText(s.getSbstncRfrncInfoGeneGeneTxt());
		}
		/******************** substancereferenceinformationgenegenesequenceorigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgenegenesequenceorigin =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationgene.setGeneSequenceOrigin(substancereferenceinformationgenegenesequenceorigin);

		/******************** substancereferenceinformationgenegenesequenceorigincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationgenegenesequenceorigincoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationgenegenesequenceorigin.addCoding(substancereferenceinformationgenegenesequenceorigincoding);

		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgCd() != null) {
			substancereferenceinformationgenegenesequenceorigincoding.setCode(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgCd());
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgDsply() != null) {
			substancereferenceinformationgenegenesequenceorigincoding.setDisplay(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgDsply());
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgSys() != null) {
			substancereferenceinformationgenegenesequenceorigincoding.setSystem(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgSys());
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd() != null) {
			substancereferenceinformationgenegenesequenceorigincoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn() != null) {
			substancereferenceinformationgenegenesequenceorigincoding.setVersion(s.getSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneGeneSqncOriginTxt() != null) {
			substancereferenceinformationgenegenesequenceorigin.setText(s.getSbstncRfrncInfoGeneGeneSqncOriginTxt());
		}
		/******************** SbstncRfrncInfo_Gene_Src ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneSrc() != null) {
			substancereferenceinformationgene.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncRfrncInfoGeneSrc()));
		}
		/******************** substancereferenceinformationgeneelement ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneElementComponent substancereferenceinformationgeneelement =  new org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneElementComponent();
		substancereferenceinformation.addGeneElement(substancereferenceinformationgeneelement);

		/******************** SbstncRfrncInfo_GeneElmnt_Src ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntSrc() != null) {
			substancereferenceinformationgeneelement.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncRfrncInfoGeneElmntSrc()));
		}
		/******************** substancereferenceinformationgeneelementtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgeneelementtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationgeneelement.setType(substancereferenceinformationgeneelementtype);

		/******************** substancereferenceinformationgeneelementtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationgeneelementtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationgeneelementtype.addCoding(substancereferenceinformationgeneelementtypecoding);

		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntTypCdgCd() != null) {
			substancereferenceinformationgeneelementtypecoding.setCode(s.getSbstncRfrncInfoGeneElmntTypCdgCd());
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntTypCdgDsply() != null) {
			substancereferenceinformationgeneelementtypecoding.setDisplay(s.getSbstncRfrncInfoGeneElmntTypCdgDsply());
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntTypCdgSys() != null) {
			substancereferenceinformationgeneelementtypecoding.setSystem(s.getSbstncRfrncInfoGeneElmntTypCdgSys());
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntTypCdgUsrSltd() != null) {
			substancereferenceinformationgeneelementtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoGeneElmntTypCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntTypCdgVrsn() != null) {
			substancereferenceinformationgeneelementtypecoding.setVersion(s.getSbstncRfrncInfoGeneElmntTypCdgVrsn());
		}
		/******************** SbstncRfrncInfo_GeneElmnt_Typ_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoGeneElmntTypTxt() != null) {
			substancereferenceinformationgeneelementtype.setText(s.getSbstncRfrncInfoGeneElmntTypTxt());
		}
		/******************** substancereferenceinformationtar ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationTargetComponent substancereferenceinformationtar =  new org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationTargetComponent();
		substancereferenceinformation.addTarget(substancereferenceinformationtar);

		/******************** substancereferenceinformationtaramountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancereferenceinformationtaramountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancereferenceinformationtar.setAmount(substancereferenceinformationtaramountquantity);

		/******************** SbstncRfrncInfo_Tar_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntQntyCd() != null) {
			substancereferenceinformationtaramountquantity.setCode(s.getSbstncRfrncInfoTarAmntQntyCd());
		}
		/******************** substancereferenceinformationtaramountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancereferenceinformationtaramountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancereferenceinformationtaramountquantity.setComparator(substancereferenceinformationtaramountquantitycomparator.fromCode(s.getSbstncRfrncInfoTarAmntQntyCmprtr()));

		/******************** SbstncRfrncInfo_Tar_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntQntySys() != null) {
			substancereferenceinformationtaramountquantity.setSystem(s.getSbstncRfrncInfoTarAmntQntySys());
		}
		/******************** SbstncRfrncInfo_Tar_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntQntyUnt() != null) {
			substancereferenceinformationtaramountquantity.setUnit(s.getSbstncRfrncInfoTarAmntQntyUnt());
		}
		/******************** SbstncRfrncInfo_Tar_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntQntyVl() != null) {
			substancereferenceinformationtaramountquantity.setValue(Double.parseDouble((s.getSbstncRfrncInfoTarAmntQntyVl())));
		}
		/******************** substancereferenceinformationtaramountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancereferenceinformationtaramountrange =  new org.hl7.fhir.r4.model.Range();
		substancereferenceinformationtar.setAmount(substancereferenceinformationtaramountrange);

		/******************** substancereferenceinformationtaramountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancereferenceinformationtaramountrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		substancereferenceinformationtaramountrange.setHigh(substancereferenceinformationtaramountrangehigh);

		/******************** SbstncRfrncInfo_Tar_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngHiCd() != null) {
			substancereferenceinformationtaramountrangehigh.setCode(s.getSbstncRfrncInfoTarAmntRngHiCd());
		}
		/******************** substancereferenceinformationtaramountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancereferenceinformationtaramountrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancereferenceinformationtaramountrangehigh.setComparator(substancereferenceinformationtaramountrangehighcomparator.fromCode(s.getSbstncRfrncInfoTarAmntRngHiCmprtr()));

		/******************** SbstncRfrncInfo_Tar_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngHiSys() != null) {
			substancereferenceinformationtaramountrangehigh.setSystem(s.getSbstncRfrncInfoTarAmntRngHiSys());
		}
		/******************** SbstncRfrncInfo_Tar_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngHiUnt() != null) {
			substancereferenceinformationtaramountrangehigh.setUnit(s.getSbstncRfrncInfoTarAmntRngHiUnt());
		}
		/******************** SbstncRfrncInfo_Tar_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngHiVl() != null) {
			substancereferenceinformationtaramountrangehigh.setValue(Double.parseDouble((s.getSbstncRfrncInfoTarAmntRngHiVl())));
		}
		/******************** substancereferenceinformationtaramountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancereferenceinformationtaramountrangelow =  new org.hl7.fhir.r4.model.Quantity();
		substancereferenceinformationtaramountrange.setLow(substancereferenceinformationtaramountrangelow);

		/******************** SbstncRfrncInfo_Tar_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngLwCd() != null) {
			substancereferenceinformationtaramountrangelow.setCode(s.getSbstncRfrncInfoTarAmntRngLwCd());
		}
		/******************** substancereferenceinformationtaramountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancereferenceinformationtaramountrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancereferenceinformationtaramountrangelow.setComparator(substancereferenceinformationtaramountrangelowcomparator.fromCode(s.getSbstncRfrncInfoTarAmntRngLwCmprtr()));

		/******************** SbstncRfrncInfo_Tar_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngLwSys() != null) {
			substancereferenceinformationtaramountrangelow.setSystem(s.getSbstncRfrncInfoTarAmntRngLwSys());
		}
		/******************** SbstncRfrncInfo_Tar_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngLwUnt() != null) {
			substancereferenceinformationtaramountrangelow.setUnit(s.getSbstncRfrncInfoTarAmntRngLwUnt());
		}
		/******************** SbstncRfrncInfo_Tar_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntRngLwVl() != null) {
			substancereferenceinformationtaramountrangelow.setValue(Double.parseDouble((s.getSbstncRfrncInfoTarAmntRngLwVl())));
		}
		/******************** SbstncRfrncInfo_Tar_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntStrgTyp() != null) {
			substancereferenceinformationtar.setAmount( new org.hl7.fhir.r4.model.StringType(s.getSbstncRfrncInfoTarAmntStrgTyp()));
		}
		/******************** substancereferenceinformationtaramounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtaramounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationtar.setAmountType(substancereferenceinformationtaramounttype);

		/******************** substancereferenceinformationtaramounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtaramounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationtaramounttype.addCoding(substancereferenceinformationtaramounttypecoding);

		/******************** SbstncRfrncInfo_Tar_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntTypCdgCd() != null) {
			substancereferenceinformationtaramounttypecoding.setCode(s.getSbstncRfrncInfoTarAmntTypCdgCd());
		}
		/******************** SbstncRfrncInfo_Tar_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntTypCdgDsply() != null) {
			substancereferenceinformationtaramounttypecoding.setDisplay(s.getSbstncRfrncInfoTarAmntTypCdgDsply());
		}
		/******************** SbstncRfrncInfo_Tar_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntTypCdgSys() != null) {
			substancereferenceinformationtaramounttypecoding.setSystem(s.getSbstncRfrncInfoTarAmntTypCdgSys());
		}
		/******************** SbstncRfrncInfo_Tar_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntTypCdgUsrSltd() != null) {
			substancereferenceinformationtaramounttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoTarAmntTypCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Tar_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntTypCdgVrsn() != null) {
			substancereferenceinformationtaramounttypecoding.setVersion(s.getSbstncRfrncInfoTarAmntTypCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Tar_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarAmntTypTxt() != null) {
			substancereferenceinformationtaramounttype.setText(s.getSbstncRfrncInfoTarAmntTypTxt());
		}
		/******************** substancereferenceinformationtarinteraction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtarinteraction =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationtar.setInteraction(substancereferenceinformationtarinteraction);

		/******************** substancereferenceinformationtarinteractioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtarinteractioncoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationtarinteraction.addCoding(substancereferenceinformationtarinteractioncoding);

		/******************** SbstncRfrncInfo_Tar_Interaction_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarInteractionCdgCd() != null) {
			substancereferenceinformationtarinteractioncoding.setCode(s.getSbstncRfrncInfoTarInteractionCdgCd());
		}
		/******************** SbstncRfrncInfo_Tar_Interaction_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoTarInteractionCdgDsply() != null) {
			substancereferenceinformationtarinteractioncoding.setDisplay(s.getSbstncRfrncInfoTarInteractionCdgDsply());
		}
		/******************** SbstncRfrncInfo_Tar_Interaction_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarInteractionCdgSys() != null) {
			substancereferenceinformationtarinteractioncoding.setSystem(s.getSbstncRfrncInfoTarInteractionCdgSys());
		}
		/******************** SbstncRfrncInfo_Tar_Interaction_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarInteractionCdgUsrSltd() != null) {
			substancereferenceinformationtarinteractioncoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoTarInteractionCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Tar_Interaction_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoTarInteractionCdgVrsn() != null) {
			substancereferenceinformationtarinteractioncoding.setVersion(s.getSbstncRfrncInfoTarInteractionCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Tar_Interaction_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarInteractionTxt() != null) {
			substancereferenceinformationtarinteraction.setText(s.getSbstncRfrncInfoTarInteractionTxt());
		}
		/******************** substancereferenceinformationtarorganism ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtarorganism =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationtar.setOrganism(substancereferenceinformationtarorganism);

		/******************** substancereferenceinformationtarorganismcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtarorganismcoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationtarorganism.addCoding(substancereferenceinformationtarorganismcoding);

		/******************** SbstncRfrncInfo_Tar_Orgnsm_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmCdgCd() != null) {
			substancereferenceinformationtarorganismcoding.setCode(s.getSbstncRfrncInfoTarOrgnsmCdgCd());
		}
		/******************** SbstncRfrncInfo_Tar_Orgnsm_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmCdgDsply() != null) {
			substancereferenceinformationtarorganismcoding.setDisplay(s.getSbstncRfrncInfoTarOrgnsmCdgDsply());
		}
		/******************** SbstncRfrncInfo_Tar_Orgnsm_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmCdgSys() != null) {
			substancereferenceinformationtarorganismcoding.setSystem(s.getSbstncRfrncInfoTarOrgnsmCdgSys());
		}
		/******************** SbstncRfrncInfo_Tar_Orgnsm_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmCdgUsrSltd() != null) {
			substancereferenceinformationtarorganismcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoTarOrgnsmCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Tar_Orgnsm_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmCdgVrsn() != null) {
			substancereferenceinformationtarorganismcoding.setVersion(s.getSbstncRfrncInfoTarOrgnsmCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Tar_Orgnsm_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTxt() != null) {
			substancereferenceinformationtarorganism.setText(s.getSbstncRfrncInfoTarOrgnsmTxt());
		}
		/******************** substancereferenceinformationtarorganismtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtarorganismtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationtar.setOrganismType(substancereferenceinformationtarorganismtype);

		/******************** substancereferenceinformationtarorganismtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtarorganismtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationtarorganismtype.addCoding(substancereferenceinformationtarorganismtypecoding);

		/******************** SbstncRfrncInfo_Tar_OrgnsmTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTypCdgCd() != null) {
			substancereferenceinformationtarorganismtypecoding.setCode(s.getSbstncRfrncInfoTarOrgnsmTypCdgCd());
		}
		/******************** SbstncRfrncInfo_Tar_OrgnsmTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTypCdgDsply() != null) {
			substancereferenceinformationtarorganismtypecoding.setDisplay(s.getSbstncRfrncInfoTarOrgnsmTypCdgDsply());
		}
		/******************** SbstncRfrncInfo_Tar_OrgnsmTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTypCdgSys() != null) {
			substancereferenceinformationtarorganismtypecoding.setSystem(s.getSbstncRfrncInfoTarOrgnsmTypCdgSys());
		}
		/******************** SbstncRfrncInfo_Tar_OrgnsmTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTypCdgUsrSltd() != null) {
			substancereferenceinformationtarorganismtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoTarOrgnsmTypCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Tar_OrgnsmTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTypCdgVrsn() != null) {
			substancereferenceinformationtarorganismtypecoding.setVersion(s.getSbstncRfrncInfoTarOrgnsmTypCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Tar_OrgnsmTyp_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarOrgnsmTypTxt() != null) {
			substancereferenceinformationtarorganismtype.setText(s.getSbstncRfrncInfoTarOrgnsmTypTxt());
		}
		/******************** SbstncRfrncInfo_Tar_Src ********************************************************************************/
		if(s.getSbstncRfrncInfoTarSrc() != null) {
			substancereferenceinformationtar.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncRfrncInfoTarSrc()));
		}
		/******************** substancereferenceinformationtartype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationtartype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancereferenceinformationtar.setType(substancereferenceinformationtartype);

		/******************** substancereferenceinformationtartypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancereferenceinformationtartypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancereferenceinformationtartype.addCoding(substancereferenceinformationtartypecoding);

		/******************** SbstncRfrncInfo_Tar_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarTypCdgCd() != null) {
			substancereferenceinformationtartypecoding.setCode(s.getSbstncRfrncInfoTarTypCdgCd());
		}
		/******************** SbstncRfrncInfo_Tar_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncRfrncInfoTarTypCdgDsply() != null) {
			substancereferenceinformationtartypecoding.setDisplay(s.getSbstncRfrncInfoTarTypCdgDsply());
		}
		/******************** SbstncRfrncInfo_Tar_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncRfrncInfoTarTypCdgSys() != null) {
			substancereferenceinformationtartypecoding.setSystem(s.getSbstncRfrncInfoTarTypCdgSys());
		}
		/******************** SbstncRfrncInfo_Tar_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncRfrncInfoTarTypCdgUsrSltd() != null) {
			substancereferenceinformationtartypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncRfrncInfoTarTypCdgUsrSltd()));
		}
		/******************** SbstncRfrncInfo_Tar_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncRfrncInfoTarTypCdgVrsn() != null) {
			substancereferenceinformationtartypecoding.setVersion(s.getSbstncRfrncInfoTarTypCdgVrsn());
		}
		/******************** SbstncRfrncInfo_Tar_Typ_Txt ********************************************************************************/
		if(s.getSbstncRfrncInfoTarTypTxt() != null) {
			substancereferenceinformationtartype.setText(s.getSbstncRfrncInfoTarTypTxt());
		}
		return substancereferenceinformation;
	}
}
