package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceReferenceInformation;
public class SubstanceReferenceInformationBidirectionalConversion 
{
	public SubstanceReferenceInformation SubstanceReferenceInformations(org.hl7.fhir.r4.model.SubstanceReferenceInformation substancereferenceinformation) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceReferenceInformation s = new  main.java.com.campfhir.model.SubstanceReferenceInformation();

		/******************** id ********************************************************************************/
		s.setId(substancereferenceinformation.getIdElement().getIdPart());

		/******************** SbstncRfrncInfo_Comment ********************************************************************************/
		if(substancereferenceinformation.hasComment()) {

			s.addSbstncRfrncInfoComment(String.valueOf(substancereferenceinformation.getComment()));
		} else {
			s.addSbstncRfrncInfoComment("NULL");
		}


		/******************** substancereferenceinformationgene ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent> substancereferenceinformationgenelist = substancereferenceinformation.getGene();
		for(int substancereferenceinformationgenei = 0; substancereferenceinformationgenei<substancereferenceinformationgenelist.size();substancereferenceinformationgenei++ ) {
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent  substancereferenceinformationgene = substancereferenceinformationgenelist.get(substancereferenceinformationgenei);

		/******************** SbstncRfrncInfo_Gene_Src ********************************************************************************/
		if(substancereferenceinformationgenei == 0) {s.addSbstncRfrncInfoGeneSrc("[");}
		if(substancereferenceinformationgene.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancereferenceinformationgene.getSource().size(); incr++) {
				array = array + substancereferenceinformationgene.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncRfrncInfoGeneSrc(array);

		} else {
			s.addSbstncRfrncInfoGeneSrc("NULL");
		}

		if(substancereferenceinformationgenei == substancereferenceinformationgenelist.size()-1) {s.addSbstncRfrncInfoGeneSrc("]");}


		/******************** substancereferenceinformationgenegene ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgenegene = substancereferenceinformationgene.getGene();

		/******************** SbstncRfrncInfo_Gene_Gene_Txt ********************************************************************************/
		if(substancereferenceinformationgenei == 0) {s.addSbstncRfrncInfoGeneGeneTxt("[");}
		if(substancereferenceinformationgenegene.hasText()) {

			s.addSbstncRfrncInfoGeneGeneTxt(String.valueOf(substancereferenceinformationgenegene.getText()));
		} else {
			s.addSbstncRfrncInfoGeneGeneTxt("NULL");
		}

		if(substancereferenceinformationgenei == substancereferenceinformationgenelist.size()-1) {s.addSbstncRfrncInfoGeneGeneTxt("]");}


		/******************** substancereferenceinformationgenegenecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancereferenceinformationgenegenecodinglist = substancereferenceinformationgenegene.getCoding();
		for(int substancereferenceinformationgenegenecodingi = 0; substancereferenceinformationgenegenecodingi<substancereferenceinformationgenegenecodinglist.size();substancereferenceinformationgenegenecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancereferenceinformationgenegenecoding = substancereferenceinformationgenegenecodinglist.get(substancereferenceinformationgenegenecodingi);

		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationgenegenecodingi == 0) {s.addSbstncRfrncInfoGeneGeneCdgDsply("[[");}
		if(substancereferenceinformationgenegenecoding.hasDisplay()) {

			s.addSbstncRfrncInfoGeneGeneCdgDsply(String.valueOf(substancereferenceinformationgenegenecoding.getDisplay()));
		} else {
			s.addSbstncRfrncInfoGeneGeneCdgDsply("NULL");
		}

		if(substancereferenceinformationgenegenecodingi == substancereferenceinformationgenegenecodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneCdgDsply("]]");}


		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationgenegenecodingi == 0) {s.addSbstncRfrncInfoGeneGeneCdgVrsn("[[");}
		if(substancereferenceinformationgenegenecoding.hasVersion()) {

			s.addSbstncRfrncInfoGeneGeneCdgVrsn(String.valueOf(substancereferenceinformationgenegenecoding.getVersion()));
		} else {
			s.addSbstncRfrncInfoGeneGeneCdgVrsn("NULL");
		}

		if(substancereferenceinformationgenegenecodingi == substancereferenceinformationgenegenecodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneCdgVrsn("]]");}


		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationgenegenecodingi == 0) {s.addSbstncRfrncInfoGeneGeneCdgCd("[[");}
		if(substancereferenceinformationgenegenecoding.hasCode()) {

			s.addSbstncRfrncInfoGeneGeneCdgCd(String.valueOf(substancereferenceinformationgenegenecoding.getCode()));
		} else {
			s.addSbstncRfrncInfoGeneGeneCdgCd("NULL");
		}

		if(substancereferenceinformationgenegenecodingi == substancereferenceinformationgenegenecodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneCdgCd("]]");}


		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationgenegenecodingi == 0) {s.addSbstncRfrncInfoGeneGeneCdgUsrSltd("[[");}
		if(substancereferenceinformationgenegenecoding.hasUserSelected()) {

			s.addSbstncRfrncInfoGeneGeneCdgUsrSltd(String.valueOf(substancereferenceinformationgenegenecoding.getUserSelected()));
		} else {
			s.addSbstncRfrncInfoGeneGeneCdgUsrSltd("NULL");
		}

		if(substancereferenceinformationgenegenecodingi == substancereferenceinformationgenegenecodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneCdgUsrSltd("]]");}


		/******************** SbstncRfrncInfo_Gene_Gene_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationgenegenecodingi == 0) {s.addSbstncRfrncInfoGeneGeneCdgSys("[[");}
		if(substancereferenceinformationgenegenecoding.hasSystem()) {

			s.addSbstncRfrncInfoGeneGeneCdgSys(String.valueOf(substancereferenceinformationgenegenecoding.getSystem()));
		} else {
			s.addSbstncRfrncInfoGeneGeneCdgSys("NULL");
		}

		if(substancereferenceinformationgenegenecodingi == substancereferenceinformationgenegenecodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneCdgSys("]]");}


		 };
		/******************** substancereferenceinformationgenegenesequenceorigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationgenegenesequenceorigin = substancereferenceinformationgene.getGeneSequenceOrigin();

		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Txt ********************************************************************************/
		if(substancereferenceinformationgenei == 0) {s.addSbstncRfrncInfoGeneGeneSqncOriginTxt("[");}
		if(substancereferenceinformationgenegenesequenceorigin.hasText()) {

			s.addSbstncRfrncInfoGeneGeneSqncOriginTxt(String.valueOf(substancereferenceinformationgenegenesequenceorigin.getText()));
		} else {
			s.addSbstncRfrncInfoGeneGeneSqncOriginTxt("NULL");
		}

		if(substancereferenceinformationgenei == substancereferenceinformationgenelist.size()-1) {s.addSbstncRfrncInfoGeneGeneSqncOriginTxt("]");}


		/******************** substancereferenceinformationgenegenesequenceorigincoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancereferenceinformationgenegenesequenceorigincodinglist = substancereferenceinformationgenegenesequenceorigin.getCoding();
		for(int substancereferenceinformationgenegenesequenceorigincodingi = 0; substancereferenceinformationgenegenesequenceorigincodingi<substancereferenceinformationgenegenesequenceorigincodinglist.size();substancereferenceinformationgenegenesequenceorigincodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancereferenceinformationgenegenesequenceorigincoding = substancereferenceinformationgenegenesequenceorigincodinglist.get(substancereferenceinformationgenegenesequenceorigincodingi);

		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincodingi == 0) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgDsply("[[");}
		if(substancereferenceinformationgenegenesequenceorigincoding.hasDisplay()) {

			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgDsply(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getDisplay()));
		} else {
			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgDsply("NULL");
		}

		if(substancereferenceinformationgenegenesequenceorigincodingi == substancereferenceinformationgenegenesequenceorigincodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgDsply("]]");}


		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincodingi == 0) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn("[[");}
		if(substancereferenceinformationgenegenesequenceorigincoding.hasVersion()) {

			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getVersion()));
		} else {
			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn("NULL");
		}

		if(substancereferenceinformationgenegenesequenceorigincodingi == substancereferenceinformationgenegenesequenceorigincodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgVrsn("]]");}


		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincodingi == 0) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgCd("[[");}
		if(substancereferenceinformationgenegenesequenceorigincoding.hasCode()) {

			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgCd(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getCode()));
		} else {
			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgCd("NULL");
		}

		if(substancereferenceinformationgenegenesequenceorigincodingi == substancereferenceinformationgenegenesequenceorigincodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgCd("]]");}


		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincodingi == 0) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd("[[");}
		if(substancereferenceinformationgenegenesequenceorigincoding.hasUserSelected()) {

			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getUserSelected()));
		} else {
			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd("NULL");
		}

		if(substancereferenceinformationgenegenesequenceorigincodingi == substancereferenceinformationgenegenesequenceorigincodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgUsrSltd("]]");}


		/******************** SbstncRfrncInfo_Gene_GeneSqncOrigin_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationgenegenesequenceorigincodingi == 0) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgSys("[[");}
		if(substancereferenceinformationgenegenesequenceorigincoding.hasSystem()) {

			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgSys(String.valueOf(substancereferenceinformationgenegenesequenceorigincoding.getSystem()));
		} else {
			s.addSbstncRfrncInfoGeneGeneSqncOriginCdgSys("NULL");
		}

		if(substancereferenceinformationgenegenesequenceorigincodingi == substancereferenceinformationgenegenesequenceorigincodinglist.size()-1) {s.addSbstncRfrncInfoGeneGeneSqncOriginCdgSys("]]");}


		 };
		 };
		/******************** substancereferenceinformationclassification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent> substancereferenceinformationclassificationlist = substancereferenceinformation.getClassification();
		for(int substancereferenceinformationclassificationi = 0; substancereferenceinformationclassificationi<substancereferenceinformationclassificationlist.size();substancereferenceinformationclassificationi++ ) {
		org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent  substancereferenceinformationclassification = substancereferenceinformationclassificationlist.get(substancereferenceinformationclassificationi);

		/******************** SbstncRfrncInfo_Clsfctn_Src ********************************************************************************/
		if(substancereferenceinformationclassificationi == 0) {s.addSbstncRfrncInfoClsfctnSrc("[");}
		if(substancereferenceinformationclassification.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancereferenceinformationclassification.getSource().size(); incr++) {
				array = array + substancereferenceinformationclassification.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncRfrncInfoClsfctnSrc(array);

		} else {
			s.addSbstncRfrncInfoClsfctnSrc("NULL");
		}

		if(substancereferenceinformationclassificationi == substancereferenceinformationclassificationlist.size()-1) {s.addSbstncRfrncInfoClsfctnSrc("]");}


		/******************** substancereferenceinformationclassificationdomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationdomain = substancereferenceinformationclassification.getDomain();

		/******************** SbstncRfrncInfo_Clsfctn_Domain_Txt ********************************************************************************/
		if(substancereferenceinformationclassificationi == 0) {s.addSbstncRfrncInfoClsfctnDomainTxt("[");}
		if(substancereferenceinformationclassificationdomain.hasText()) {

			s.addSbstncRfrncInfoClsfctnDomainTxt(String.valueOf(substancereferenceinformationclassificationdomain.getText()));
		} else {
			s.addSbstncRfrncInfoClsfctnDomainTxt("NULL");
		}

		if(substancereferenceinformationclassificationi == substancereferenceinformationclassificationlist.size()-1) {s.addSbstncRfrncInfoClsfctnDomainTxt("]");}


		/******************** substancereferenceinformationclassificationdomaincoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancereferenceinformationclassificationdomaincodinglist = substancereferenceinformationclassificationdomain.getCoding();
		for(int substancereferenceinformationclassificationdomaincodingi = 0; substancereferenceinformationclassificationdomaincodingi<substancereferenceinformationclassificationdomaincodinglist.size();substancereferenceinformationclassificationdomaincodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancereferenceinformationclassificationdomaincoding = substancereferenceinformationclassificationdomaincodinglist.get(substancereferenceinformationclassificationdomaincodingi);

		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincodingi == 0) {s.addSbstncRfrncInfoClsfctnDomainCdgDsply("[[");}
		if(substancereferenceinformationclassificationdomaincoding.hasDisplay()) {

			s.addSbstncRfrncInfoClsfctnDomainCdgDsply(String.valueOf(substancereferenceinformationclassificationdomaincoding.getDisplay()));
		} else {
			s.addSbstncRfrncInfoClsfctnDomainCdgDsply("NULL");
		}

		if(substancereferenceinformationclassificationdomaincodingi == substancereferenceinformationclassificationdomaincodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnDomainCdgDsply("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincodingi == 0) {s.addSbstncRfrncInfoClsfctnDomainCdgVrsn("[[");}
		if(substancereferenceinformationclassificationdomaincoding.hasVersion()) {

			s.addSbstncRfrncInfoClsfctnDomainCdgVrsn(String.valueOf(substancereferenceinformationclassificationdomaincoding.getVersion()));
		} else {
			s.addSbstncRfrncInfoClsfctnDomainCdgVrsn("NULL");
		}

		if(substancereferenceinformationclassificationdomaincodingi == substancereferenceinformationclassificationdomaincodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnDomainCdgVrsn("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincodingi == 0) {s.addSbstncRfrncInfoClsfctnDomainCdgCd("[[");}
		if(substancereferenceinformationclassificationdomaincoding.hasCode()) {

			s.addSbstncRfrncInfoClsfctnDomainCdgCd(String.valueOf(substancereferenceinformationclassificationdomaincoding.getCode()));
		} else {
			s.addSbstncRfrncInfoClsfctnDomainCdgCd("NULL");
		}

		if(substancereferenceinformationclassificationdomaincodingi == substancereferenceinformationclassificationdomaincodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnDomainCdgCd("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincodingi == 0) {s.addSbstncRfrncInfoClsfctnDomainCdgUsrSltd("[[");}
		if(substancereferenceinformationclassificationdomaincoding.hasUserSelected()) {

			s.addSbstncRfrncInfoClsfctnDomainCdgUsrSltd(String.valueOf(substancereferenceinformationclassificationdomaincoding.getUserSelected()));
		} else {
			s.addSbstncRfrncInfoClsfctnDomainCdgUsrSltd("NULL");
		}

		if(substancereferenceinformationclassificationdomaincodingi == substancereferenceinformationclassificationdomaincodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnDomainCdgUsrSltd("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Domain_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationclassificationdomaincodingi == 0) {s.addSbstncRfrncInfoClsfctnDomainCdgSys("[[");}
		if(substancereferenceinformationclassificationdomaincoding.hasSystem()) {

			s.addSbstncRfrncInfoClsfctnDomainCdgSys(String.valueOf(substancereferenceinformationclassificationdomaincoding.getSystem()));
		} else {
			s.addSbstncRfrncInfoClsfctnDomainCdgSys("NULL");
		}

		if(substancereferenceinformationclassificationdomaincodingi == substancereferenceinformationclassificationdomaincodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnDomainCdgSys("]]");}


		 };
		/******************** substancereferenceinformationclassificationsubtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancereferenceinformationclassificationsubtypelist = substancereferenceinformationclassification.getSubtype();
		for(int substancereferenceinformationclassificationsubtypei = 0; substancereferenceinformationclassificationsubtypei<substancereferenceinformationclassificationsubtypelist.size();substancereferenceinformationclassificationsubtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancereferenceinformationclassificationsubtype = substancereferenceinformationclassificationsubtypelist.get(substancereferenceinformationclassificationsubtypei);

		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Txt ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypei == 0) {s.addSbstncRfrncInfoClsfctnSubtypeTxt("[[");}
		if(substancereferenceinformationclassificationsubtype.hasText()) {

			s.addSbstncRfrncInfoClsfctnSubtypeTxt(String.valueOf(substancereferenceinformationclassificationsubtype.getText()));
		} else {
			s.addSbstncRfrncInfoClsfctnSubtypeTxt("NULL");
		}

		if(substancereferenceinformationclassificationsubtypei == substancereferenceinformationclassificationsubtypelist.size()-1) {s.addSbstncRfrncInfoClsfctnSubtypeTxt("]]");}


		/******************** substancereferenceinformationclassificationsubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancereferenceinformationclassificationsubtypecodinglist = substancereferenceinformationclassificationsubtype.getCoding();
		for(int substancereferenceinformationclassificationsubtypecodingi = 0; substancereferenceinformationclassificationsubtypecodingi<substancereferenceinformationclassificationsubtypecodinglist.size();substancereferenceinformationclassificationsubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancereferenceinformationclassificationsubtypecoding = substancereferenceinformationclassificationsubtypecodinglist.get(substancereferenceinformationclassificationsubtypecodingi);

		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecodingi == 0) {s.addSbstncRfrncInfoClsfctnSubtypeCdgDsply("[[[");}
		if(substancereferenceinformationclassificationsubtypecoding.hasDisplay()) {

			s.addSbstncRfrncInfoClsfctnSubtypeCdgDsply(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getDisplay()));
		} else {
			s.addSbstncRfrncInfoClsfctnSubtypeCdgDsply("NULL");
		}

		if(substancereferenceinformationclassificationsubtypecodingi == substancereferenceinformationclassificationsubtypecodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnSubtypeCdgDsply("]]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecodingi == 0) {s.addSbstncRfrncInfoClsfctnSubtypeCdgVrsn("[[[");}
		if(substancereferenceinformationclassificationsubtypecoding.hasVersion()) {

			s.addSbstncRfrncInfoClsfctnSubtypeCdgVrsn(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getVersion()));
		} else {
			s.addSbstncRfrncInfoClsfctnSubtypeCdgVrsn("NULL");
		}

		if(substancereferenceinformationclassificationsubtypecodingi == substancereferenceinformationclassificationsubtypecodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnSubtypeCdgVrsn("]]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecodingi == 0) {s.addSbstncRfrncInfoClsfctnSubtypeCdgCd("[[[");}
		if(substancereferenceinformationclassificationsubtypecoding.hasCode()) {

			s.addSbstncRfrncInfoClsfctnSubtypeCdgCd(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getCode()));
		} else {
			s.addSbstncRfrncInfoClsfctnSubtypeCdgCd("NULL");
		}

		if(substancereferenceinformationclassificationsubtypecodingi == substancereferenceinformationclassificationsubtypecodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnSubtypeCdgCd("]]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecodingi == 0) {s.addSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd("[[[");}
		if(substancereferenceinformationclassificationsubtypecoding.hasUserSelected()) {

			s.addSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getUserSelected()));
		} else {
			s.addSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd("NULL");
		}

		if(substancereferenceinformationclassificationsubtypecodingi == substancereferenceinformationclassificationsubtypecodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnSubtypeCdgUsrSltd("]]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Subtype_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationclassificationsubtypecodingi == 0) {s.addSbstncRfrncInfoClsfctnSubtypeCdgSys("[[[");}
		if(substancereferenceinformationclassificationsubtypecoding.hasSystem()) {

			s.addSbstncRfrncInfoClsfctnSubtypeCdgSys(String.valueOf(substancereferenceinformationclassificationsubtypecoding.getSystem()));
		} else {
			s.addSbstncRfrncInfoClsfctnSubtypeCdgSys("NULL");
		}

		if(substancereferenceinformationclassificationsubtypecodingi == substancereferenceinformationclassificationsubtypecodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnSubtypeCdgSys("]]]");}


		 };
		 };
		/******************** substancereferenceinformationclassificationclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancereferenceinformationclassificationclassification = substancereferenceinformationclassification.getClassification();

		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Txt ********************************************************************************/
		if(substancereferenceinformationclassificationclassification.hasText()) {

			s.addSbstncRfrncInfoClsfctnClsfctnTxt(String.valueOf(substancereferenceinformationclassificationclassification.getText()));
		} else {
			s.addSbstncRfrncInfoClsfctnClsfctnTxt("NULL");
		}


		/******************** substancereferenceinformationclassificationclassificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancereferenceinformationclassificationclassificationcodinglist = substancereferenceinformationclassificationclassification.getCoding();
		for(int substancereferenceinformationclassificationclassificationcodingi = 0; substancereferenceinformationclassificationclassificationcodingi<substancereferenceinformationclassificationclassificationcodinglist.size();substancereferenceinformationclassificationclassificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancereferenceinformationclassificationclassificationcoding = substancereferenceinformationclassificationclassificationcodinglist.get(substancereferenceinformationclassificationclassificationcodingi);

		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcodingi == 0) {s.addSbstncRfrncInfoClsfctnClsfctnCdgDsply("[[");}
		if(substancereferenceinformationclassificationclassificationcoding.hasDisplay()) {

			s.addSbstncRfrncInfoClsfctnClsfctnCdgDsply(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getDisplay()));
		} else {
			s.addSbstncRfrncInfoClsfctnClsfctnCdgDsply("NULL");
		}

		if(substancereferenceinformationclassificationclassificationcodingi == substancereferenceinformationclassificationclassificationcodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnClsfctnCdgDsply("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcodingi == 0) {s.addSbstncRfrncInfoClsfctnClsfctnCdgVrsn("[[");}
		if(substancereferenceinformationclassificationclassificationcoding.hasVersion()) {

			s.addSbstncRfrncInfoClsfctnClsfctnCdgVrsn(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getVersion()));
		} else {
			s.addSbstncRfrncInfoClsfctnClsfctnCdgVrsn("NULL");
		}

		if(substancereferenceinformationclassificationclassificationcodingi == substancereferenceinformationclassificationclassificationcodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnClsfctnCdgVrsn("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcodingi == 0) {s.addSbstncRfrncInfoClsfctnClsfctnCdgCd("[[");}
		if(substancereferenceinformationclassificationclassificationcoding.hasCode()) {

			s.addSbstncRfrncInfoClsfctnClsfctnCdgCd(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getCode()));
		} else {
			s.addSbstncRfrncInfoClsfctnClsfctnCdgCd("NULL");
		}

		if(substancereferenceinformationclassificationclassificationcodingi == substancereferenceinformationclassificationclassificationcodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnClsfctnCdgCd("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcodingi == 0) {s.addSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd("[[");}
		if(substancereferenceinformationclassificationclassificationcoding.hasUserSelected()) {

			s.addSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getUserSelected()));
		} else {
			s.addSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd("NULL");
		}

		if(substancereferenceinformationclassificationclassificationcodingi == substancereferenceinformationclassificationclassificationcodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnClsfctnCdgUsrSltd("]]");}


		/******************** SbstncRfrncInfo_Clsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(substancereferenceinformationclassificationclassificationcodingi == 0) {s.addSbstncRfrncInfoClsfctnClsfctnCdgSys("[[");}
		if(substancereferenceinformationclassificationclassificationcoding.hasSystem()) {

			s.addSbstncRfrncInfoClsfctnClsfctnCdgSys(String.valueOf(substancereferenceinformationclassificationclassificationcoding.getSystem()));
		} else {
			s.addSbstncRfrncInfoClsfctnClsfctnCdgSys("NULL");
		}

		if(substancereferenceinformationclassificationclassificationcodingi == substancereferenceinformationclassificationclassificationcodinglist.size()-1) {s.addSbstncRfrncInfoClsfctnClsfctnCdgSys("]]");}


		 };
		 };
		return s;
	}
}
