package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceSpecification;
public class SubstanceSpecificationBidirectionalConversion 
{
	public SubstanceSpecification SubstanceSpecifications(org.hl7.fhir.r4.model.SubstanceSpecification substancespecification) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceSpecification s = new  main.java.com.campfhir.model.SubstanceSpecification();

		/******************** id ********************************************************************************/
		substancespecification.setId(s.getId());

		/******************** substancespecificationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationtype = substancespecification.getType();

		/******************** substancespecificationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationtypecoding = substancespecificationtype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationtypecoding.hasDisplay()) {
			s.setSbstncSpcfctnTypCdgDsply(String.valueOf(substancespecificationtypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationtypecoding.hasVersion()) {
			s.setSbstncSpcfctnTypCdgVrsn(String.valueOf(substancespecificationtypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationtypecoding.hasCode()) {
			s.setSbstncSpcfctnTypCdgCd(String.valueOf(substancespecificationtypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationtypecoding.hasSystem()) {
			s.setSbstncSpcfctnTypCdgSys(String.valueOf(substancespecificationtypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationtypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnTypCdgUsrSltd(String.valueOf(substancespecificationtypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Typ_Txt ********************************************************************************/
		if(substancespecificationtype.hasText()) {
			s.setSbstncSpcfctnTypTxt(String.valueOf(substancespecificationtype.getText()));
		}
		/******************** SbstncSpcfctn_Comment ********************************************************************************/
		if(substancespecification.hasComment()) {
			s.setSbstncSpcfctnComment(String.valueOf(substancespecification.getComment()));
		}
		/******************** substancespecificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstatus = substancespecification.getStatus();

		/******************** substancespecificationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstatuscoding = substancespecificationstatus.getCodingFirstRep();

		/******************** SbstncSpcfctn_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstatuscoding.hasDisplay()) {
			s.setSbstncSpcfctnStsCdgDsply(String.valueOf(substancespecificationstatuscoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstatuscoding.hasVersion()) {
			s.setSbstncSpcfctnStsCdgVrsn(String.valueOf(substancespecificationstatuscoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationstatuscoding.hasCode()) {
			s.setSbstncSpcfctnStsCdgCd(String.valueOf(substancespecificationstatuscoding.getCode()));
		}
		/******************** SbstncSpcfctn_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationstatuscoding.hasSystem()) {
			s.setSbstncSpcfctnStsCdgSys(String.valueOf(substancespecificationstatuscoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstatuscoding.hasUserSelected()) {
			s.setSbstncSpcfctnStsCdgUsrSltd(String.valueOf(substancespecificationstatuscoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Sts_Txt ********************************************************************************/
		if(substancespecificationstatus.hasText()) {
			s.setSbstncSpcfctnStsTxt(String.valueOf(substancespecificationstatus.getText()));
		}
		/******************** SbstncSpcfctn_Dscrptn ********************************************************************************/
		if(substancespecification.hasDescription()) {
			s.setSbstncSpcfctnDscrptn(String.valueOf(substancespecification.getDescription()));
		}
		/******************** substancespecificationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationidentifier = substancespecification.getIdentifier();

		/******************** SbstncSpcfctn_Id_Vl ********************************************************************************/
		if(substancespecificationidentifier.hasValue()) {
			s.setSbstncSpcfctnIdVl(String.valueOf(substancespecificationidentifier.getValue()));
		}
		/******************** substancespecificationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationidentifiertype = substancespecificationidentifier.getType();

		/******************** substancespecificationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationidentifiertypecoding = substancespecificationidentifiertype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationidentifiertypecoding.hasDisplay()) {
			s.setSbstncSpcfctnIdTypCdgDsply(String.valueOf(substancespecificationidentifiertypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationidentifiertypecoding.hasVersion()) {
			s.setSbstncSpcfctnIdTypCdgVrsn(String.valueOf(substancespecificationidentifiertypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationidentifiertypecoding.hasCode()) {
			s.setSbstncSpcfctnIdTypCdgCd(String.valueOf(substancespecificationidentifiertypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationidentifiertypecoding.hasSystem()) {
			s.setSbstncSpcfctnIdTypCdgSys(String.valueOf(substancespecificationidentifiertypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationidentifiertypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnIdTypCdgUsrSltd(String.valueOf(substancespecificationidentifiertypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Id_Typ_Txt ********************************************************************************/
		if(substancespecificationidentifiertype.hasText()) {
			s.setSbstncSpcfctnIdTypTxt(String.valueOf(substancespecificationidentifiertype.getText()));
		}
		/******************** SbstncSpcfctn_Id_Sys ********************************************************************************/
		if(substancespecificationidentifier.hasSystem()) {
			s.setSbstncSpcfctnIdSys(String.valueOf(substancespecificationidentifier.getSystem()));
		}
		/******************** SbstncSpcfctn_Id_Assigner ********************************************************************************/
		if(substancespecificationidentifier.hasAssigner()) {
			s.setSbstncSpcfctnIdAssigner(String.valueOf(substancespecificationidentifier.getAssigner()));
		}
		/******************** substancespecificationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationidentifierperiod = substancespecificationidentifier.getPeriod();

		/******************** SbstncSpcfctn_Id_Prd_End ********************************************************************************/
		if(substancespecificationidentifierperiod.hasEnd()) {
			s.setSbstncSpcfctnIdPrdEnd(String.valueOf(substancespecificationidentifierperiod.getEnd()));
		}
		/******************** SbstncSpcfctn_Id_Prd_Strt ********************************************************************************/
		if(substancespecificationidentifierperiod.hasStart()) {
			s.setSbstncSpcfctnIdPrdStrt(String.valueOf(substancespecificationidentifierperiod.getStart()));
		}
		/******************** substancespecificationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancespecificationidentifieruse = substancespecificationidentifier.getUse();
		s.setSbstncSpcfctnIdUse(substancespecificationidentifieruse.toCode());

		/******************** SbstncSpcfctn_Src ********************************************************************************/
		if(substancespecification.hasSource()) {
			s.setSbstncSpcfctnSrc(String.valueOf(substancespecification.getSourceFirstRep()));
		}
		/******************** substancespecificationdomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationdomain = substancespecification.getDomain();

		/******************** substancespecificationdomaincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationdomaincoding = substancespecificationdomain.getCodingFirstRep();

		/******************** SbstncSpcfctn_Domain_Cdg_Dsply ********************************************************************************/
		if(substancespecificationdomaincoding.hasDisplay()) {
			s.setSbstncSpcfctnDomainCdgDsply(String.valueOf(substancespecificationdomaincoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Domain_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationdomaincoding.hasVersion()) {
			s.setSbstncSpcfctnDomainCdgVrsn(String.valueOf(substancespecificationdomaincoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Domain_Cdg_Cd ********************************************************************************/
		if(substancespecificationdomaincoding.hasCode()) {
			s.setSbstncSpcfctnDomainCdgCd(String.valueOf(substancespecificationdomaincoding.getCode()));
		}
		/******************** SbstncSpcfctn_Domain_Cdg_Sys ********************************************************************************/
		if(substancespecificationdomaincoding.hasSystem()) {
			s.setSbstncSpcfctnDomainCdgSys(String.valueOf(substancespecificationdomaincoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Domain_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationdomaincoding.hasUserSelected()) {
			s.setSbstncSpcfctnDomainCdgUsrSltd(String.valueOf(substancespecificationdomaincoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Domain_Txt ********************************************************************************/
		if(substancespecificationdomain.hasText()) {
			s.setSbstncSpcfctnDomainTxt(String.valueOf(substancespecificationdomain.getText()));
		}
		/******************** substancespecificationmoiety ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent substancespecificationmoiety = substancespecification.getMoietyFirstRep();

		/******************** SbstncSpcfctn_Moiety_Nm ********************************************************************************/
		if(substancespecificationmoiety.hasName()) {
			s.setSbstncSpcfctnMoietyNm(String.valueOf(substancespecificationmoiety.getName()));
		}
		/******************** substancespecificationmoietyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationmoietyidentifier = substancespecificationmoiety.getIdentifier();

		/******************** SbstncSpcfctn_Moiety_Id_Vl ********************************************************************************/
		if(substancespecificationmoietyidentifier.hasValue()) {
			s.setSbstncSpcfctnMoietyIdVl(String.valueOf(substancespecificationmoietyidentifier.getValue()));
		}
		/******************** substancespecificationmoietyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyidentifiertype = substancespecificationmoietyidentifier.getType();

		/******************** substancespecificationmoietyidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietyidentifiertypecoding = substancespecificationmoietyidentifiertype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecoding.hasDisplay()) {
			s.setSbstncSpcfctnMoietyIdTypCdgDsply(String.valueOf(substancespecificationmoietyidentifiertypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecoding.hasVersion()) {
			s.setSbstncSpcfctnMoietyIdTypCdgVrsn(String.valueOf(substancespecificationmoietyidentifiertypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecoding.hasCode()) {
			s.setSbstncSpcfctnMoietyIdTypCdgCd(String.valueOf(substancespecificationmoietyidentifiertypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecoding.hasSystem()) {
			s.setSbstncSpcfctnMoietyIdTypCdgSys(String.valueOf(substancespecificationmoietyidentifiertypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnMoietyIdTypCdgUsrSltd(String.valueOf(substancespecificationmoietyidentifiertypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Txt ********************************************************************************/
		if(substancespecificationmoietyidentifiertype.hasText()) {
			s.setSbstncSpcfctnMoietyIdTypTxt(String.valueOf(substancespecificationmoietyidentifiertype.getText()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Sys ********************************************************************************/
		if(substancespecificationmoietyidentifier.hasSystem()) {
			s.setSbstncSpcfctnMoietyIdSys(String.valueOf(substancespecificationmoietyidentifier.getSystem()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Assigner ********************************************************************************/
		if(substancespecificationmoietyidentifier.hasAssigner()) {
			s.setSbstncSpcfctnMoietyIdAssigner(String.valueOf(substancespecificationmoietyidentifier.getAssigner()));
		}
		/******************** substancespecificationmoietyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationmoietyidentifierperiod = substancespecificationmoietyidentifier.getPeriod();

		/******************** SbstncSpcfctn_Moiety_Id_Prd_End ********************************************************************************/
		if(substancespecificationmoietyidentifierperiod.hasEnd()) {
			s.setSbstncSpcfctnMoietyIdPrdEnd(String.valueOf(substancespecificationmoietyidentifierperiod.getEnd()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Prd_Strt ********************************************************************************/
		if(substancespecificationmoietyidentifierperiod.hasStart()) {
			s.setSbstncSpcfctnMoietyIdPrdStrt(String.valueOf(substancespecificationmoietyidentifierperiod.getStart()));
		}
		/******************** substancespecificationmoietyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancespecificationmoietyidentifieruse = substancespecificationmoietyidentifier.getUse();
		s.setSbstncSpcfctnMoietyIdUse(substancespecificationmoietyidentifieruse.toCode());

		/******************** SbstncSpcfctn_Moiety_MoleclrFrmula ********************************************************************************/
		if(substancespecificationmoiety.hasMolecularFormula()) {
			s.setSbstncSpcfctnMoietyMoleclrFrmula(String.valueOf(substancespecificationmoiety.getMolecularFormula()));
		}
		/******************** SbstncSpcfctn_Moiety_AmntStrgTyp ********************************************************************************/
		if(substancespecificationmoiety.hasAmountStringType()) {
			s.setSbstncSpcfctnMoietyAmntStrgTyp(String.valueOf(substancespecificationmoiety.getAmountStringType()));
		}
		/******************** substancespecificationmoietyopticalactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyopticalactivity = substancespecificationmoiety.getOpticalActivity();

		/******************** substancespecificationmoietyopticalactivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietyopticalactivitycoding = substancespecificationmoietyopticalactivity.getCodingFirstRep();

		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycoding.hasDisplay()) {
			s.setSbstncSpcfctnMoietyOpticalActvtyCdgDsply(String.valueOf(substancespecificationmoietyopticalactivitycoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycoding.hasVersion()) {
			s.setSbstncSpcfctnMoietyOpticalActvtyCdgVrsn(String.valueOf(substancespecificationmoietyopticalactivitycoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycoding.hasCode()) {
			s.setSbstncSpcfctnMoietyOpticalActvtyCdgCd(String.valueOf(substancespecificationmoietyopticalactivitycoding.getCode()));
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycoding.hasSystem()) {
			s.setSbstncSpcfctnMoietyOpticalActvtyCdgSys(String.valueOf(substancespecificationmoietyopticalactivitycoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycoding.hasUserSelected()) {
			s.setSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd(String.valueOf(substancespecificationmoietyopticalactivitycoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Txt ********************************************************************************/
		if(substancespecificationmoietyopticalactivity.hasText()) {
			s.setSbstncSpcfctnMoietyOpticalActvtyTxt(String.valueOf(substancespecificationmoietyopticalactivity.getText()));
		}
		/******************** substancespecificationmoietystereochemistry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietystereochemistry = substancespecificationmoiety.getStereochemistry();

		/******************** substancespecificationmoietystereochemistrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietystereochemistrycoding = substancespecificationmoietystereochemistry.getCodingFirstRep();

		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietystereochemistrycoding.hasDisplay()) {
			s.setSbstncSpcfctnMoietyStereochemistryCdgDsply(String.valueOf(substancespecificationmoietystereochemistrycoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietystereochemistrycoding.hasVersion()) {
			s.setSbstncSpcfctnMoietyStereochemistryCdgVrsn(String.valueOf(substancespecificationmoietystereochemistrycoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietystereochemistrycoding.hasCode()) {
			s.setSbstncSpcfctnMoietyStereochemistryCdgCd(String.valueOf(substancespecificationmoietystereochemistrycoding.getCode()));
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietystereochemistrycoding.hasSystem()) {
			s.setSbstncSpcfctnMoietyStereochemistryCdgSys(String.valueOf(substancespecificationmoietystereochemistrycoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietystereochemistrycoding.hasUserSelected()) {
			s.setSbstncSpcfctnMoietyStereochemistryCdgUsrSltd(String.valueOf(substancespecificationmoietystereochemistrycoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Txt ********************************************************************************/
		if(substancespecificationmoietystereochemistry.hasText()) {
			s.setSbstncSpcfctnMoietyStereochemistryTxt(String.valueOf(substancespecificationmoietystereochemistry.getText()));
		}
		/******************** substancespecificationmoietyamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationmoietyamountquantity = substancespecificationmoiety.getAmountQuantity();

		/******************** SbstncSpcfctn_Moiety_AmntQnty_Vl ********************************************************************************/
		if(substancespecificationmoietyamountquantity.hasValue()) {
			s.setSbstncSpcfctnMoietyAmntQntyVl(String.valueOf(substancespecificationmoietyamountquantity.getValue()));
		}
		/******************** substancespecificationmoietyamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationmoietyamountquantitycomparator = substancespecificationmoietyamountquantity.getComparator();
		s.setSbstncSpcfctnMoietyAmntQntyCmprtr(substancespecificationmoietyamountquantitycomparator.toCode());

		/******************** SbstncSpcfctn_Moiety_AmntQnty_Cd ********************************************************************************/
		if(substancespecificationmoietyamountquantity.hasCode()) {
			s.setSbstncSpcfctnMoietyAmntQntyCd(String.valueOf(substancespecificationmoietyamountquantity.getCode()));
		}
		/******************** SbstncSpcfctn_Moiety_AmntQnty_Sys ********************************************************************************/
		if(substancespecificationmoietyamountquantity.hasSystem()) {
			s.setSbstncSpcfctnMoietyAmntQntySys(String.valueOf(substancespecificationmoietyamountquantity.getSystem()));
		}
		/******************** SbstncSpcfctn_Moiety_AmntQnty_Unt ********************************************************************************/
		if(substancespecificationmoietyamountquantity.hasUnit()) {
			s.setSbstncSpcfctnMoietyAmntQntyUnt(String.valueOf(substancespecificationmoietyamountquantity.getUnit()));
		}
		/******************** substancespecificationmoietyrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyrole = substancespecificationmoiety.getRole();

		/******************** substancespecificationmoietyrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietyrolecoding = substancespecificationmoietyrole.getCodingFirstRep();

		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietyrolecoding.hasDisplay()) {
			s.setSbstncSpcfctnMoietyRoleCdgDsply(String.valueOf(substancespecificationmoietyrolecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietyrolecoding.hasVersion()) {
			s.setSbstncSpcfctnMoietyRoleCdgVrsn(String.valueOf(substancespecificationmoietyrolecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietyrolecoding.hasCode()) {
			s.setSbstncSpcfctnMoietyRoleCdgCd(String.valueOf(substancespecificationmoietyrolecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietyrolecoding.hasSystem()) {
			s.setSbstncSpcfctnMoietyRoleCdgSys(String.valueOf(substancespecificationmoietyrolecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietyrolecoding.hasUserSelected()) {
			s.setSbstncSpcfctnMoietyRoleCdgUsrSltd(String.valueOf(substancespecificationmoietyrolecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Moiety_Role_Txt ********************************************************************************/
		if(substancespecificationmoietyrole.hasText()) {
			s.setSbstncSpcfctnMoietyRoleTxt(String.valueOf(substancespecificationmoietyrole.getText()));
		}
		/******************** substancespecificationcode ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent substancespecificationcode = substancespecification.getCodeFirstRep();

		/******************** SbstncSpcfctn_Cd_Comment ********************************************************************************/
		if(substancespecificationcode.hasComment()) {
			s.setSbstncSpcfctnCdComment(String.valueOf(substancespecificationcode.getComment()));
		}
		/******************** substancespecificationcodecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationcodecode = substancespecificationcode.getCode();

		/******************** substancespecificationcodecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationcodecodecoding = substancespecificationcodecode.getCodingFirstRep();

		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationcodecodecoding.hasDisplay()) {
			s.setSbstncSpcfctnCdCdCdgDsply(String.valueOf(substancespecificationcodecodecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationcodecodecoding.hasVersion()) {
			s.setSbstncSpcfctnCdCdCdgVrsn(String.valueOf(substancespecificationcodecodecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Cd ********************************************************************************/
		if(substancespecificationcodecodecoding.hasCode()) {
			s.setSbstncSpcfctnCdCdCdgCd(String.valueOf(substancespecificationcodecodecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Sys ********************************************************************************/
		if(substancespecificationcodecodecoding.hasSystem()) {
			s.setSbstncSpcfctnCdCdCdgSys(String.valueOf(substancespecificationcodecodecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationcodecodecoding.hasUserSelected()) {
			s.setSbstncSpcfctnCdCdCdgUsrSltd(String.valueOf(substancespecificationcodecodecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Cd_Cd_Txt ********************************************************************************/
		if(substancespecificationcodecode.hasText()) {
			s.setSbstncSpcfctnCdCdTxt(String.valueOf(substancespecificationcodecode.getText()));
		}
		/******************** substancespecificationcodestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationcodestatus = substancespecificationcode.getStatus();

		/******************** substancespecificationcodestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationcodestatuscoding = substancespecificationcodestatus.getCodingFirstRep();

		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationcodestatuscoding.hasDisplay()) {
			s.setSbstncSpcfctnCdStsCdgDsply(String.valueOf(substancespecificationcodestatuscoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationcodestatuscoding.hasVersion()) {
			s.setSbstncSpcfctnCdStsCdgVrsn(String.valueOf(substancespecificationcodestatuscoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationcodestatuscoding.hasCode()) {
			s.setSbstncSpcfctnCdStsCdgCd(String.valueOf(substancespecificationcodestatuscoding.getCode()));
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationcodestatuscoding.hasSystem()) {
			s.setSbstncSpcfctnCdStsCdgSys(String.valueOf(substancespecificationcodestatuscoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationcodestatuscoding.hasUserSelected()) {
			s.setSbstncSpcfctnCdStsCdgUsrSltd(String.valueOf(substancespecificationcodestatuscoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Cd_Sts_Txt ********************************************************************************/
		if(substancespecificationcodestatus.hasText()) {
			s.setSbstncSpcfctnCdStsTxt(String.valueOf(substancespecificationcodestatus.getText()));
		}
		/******************** SbstncSpcfctn_Cd_Src ********************************************************************************/
		if(substancespecificationcode.hasSource()) {
			s.setSbstncSpcfctnCdSrc(String.valueOf(substancespecificationcode.getSourceFirstRep()));
		}
		/******************** SbstncSpcfctn_Cd_StsDt ********************************************************************************/
		if(substancespecificationcode.hasStatusDate()) {
			s.setSbstncSpcfctnCdStsDt(String.valueOf(substancespecificationcode.getStatusDate()));
		}
		/******************** substancespecificationstructure ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent substancespecificationstructure = substancespecification.getStructure();

		/******************** SbstncSpcfctn_Strctr_MoleclrFrmula ********************************************************************************/
		if(substancespecificationstructure.hasMolecularFormula()) {
			s.setSbstncSpcfctnStrctrMoleclrFrmula(String.valueOf(substancespecificationstructure.getMolecularFormula()));
		}
		/******************** substancespecificationstructurerepresentation ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent substancespecificationstructurerepresentation = substancespecificationstructure.getRepresentationFirstRep();

		/******************** substancespecificationstructurerepresentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructurerepresentationtype = substancespecificationstructurerepresentation.getType();

		/******************** substancespecificationstructurerepresentationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructurerepresentationtypecoding = substancespecificationstructurerepresentationtype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrRepresentationTypCdgDsply(String.valueOf(substancespecificationstructurerepresentationtypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrRepresentationTypCdgVrsn(String.valueOf(substancespecificationstructurerepresentationtypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecoding.hasCode()) {
			s.setSbstncSpcfctnStrctrRepresentationTypCdgCd(String.valueOf(substancespecificationstructurerepresentationtypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrRepresentationTypCdgSys(String.valueOf(substancespecificationstructurerepresentationtypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd(String.valueOf(substancespecificationstructurerepresentationtypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Txt ********************************************************************************/
		if(substancespecificationstructurerepresentationtype.hasText()) {
			s.setSbstncSpcfctnStrctrRepresentationTypTxt(String.valueOf(substancespecificationstructurerepresentationtype.getText()));
		}
		/******************** substancespecificationstructurerepresentationattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancespecificationstructurerepresentationattachment = substancespecificationstructurerepresentation.getAttachment();

		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Sz ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasSize()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntSz(String.valueOf(substancespecificationstructurerepresentationattachment.getSize()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Lnguage ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasLanguage()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntLnguage(String.valueOf(substancespecificationstructurerepresentationattachment.getLanguage()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_CntntTyp ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasContentType()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp(String.valueOf(substancespecificationstructurerepresentationattachment.getContentType()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Url ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasUrl()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntUrl(String.valueOf(substancespecificationstructurerepresentationattachment.getUrl()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Ttl ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasTitle()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntTtl(String.valueOf(substancespecificationstructurerepresentationattachment.getTitle()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Hash ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasHash()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntHash(String.valueOf(substancespecificationstructurerepresentationattachment.getHash()));
		}

		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Data ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasData()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntData(String.valueOf(substancespecificationstructurerepresentationattachment.getData()));
		}

		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Creation ********************************************************************************/
		if(substancespecificationstructurerepresentationattachment.hasCreation()) {
			s.setSbstncSpcfctnStrctrRepresentationAttchmntCreation(String.valueOf(substancespecificationstructurerepresentationattachment.getCreation()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrFrmulaByMoiety ********************************************************************************/
		if(substancespecificationstructure.hasMolecularFormulaByMoiety()) {
			s.setSbstncSpcfctnStrctrMoleclrFrmulaByMoiety(String.valueOf(substancespecificationstructure.getMolecularFormulaByMoiety()));
		}
		/******************** SbstncSpcfctn_Strctr_Src ********************************************************************************/
		if(substancespecificationstructure.hasSource()) {
			s.setSbstncSpcfctnStrctrSrc(String.valueOf(substancespecificationstructure.getSourceFirstRep()));
		}
		/******************** substancespecificationstructuremolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationstructuremolecularweight = substancespecificationstructure.getMolecularWeight();

		/******************** substancespecificationstructuremolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructuremolecularweightmethod = substancespecificationstructuremolecularweight.getMethod();

		/******************** substancespecificationstructuremolecularweightmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructuremolecularweightmethodcoding = substancespecificationstructuremolecularweightmethod.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcoding.hasCode()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethod.hasText()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtMthdTxt(String.valueOf(substancespecificationstructuremolecularweightmethod.getText()));
		}
		/******************** substancespecificationstructuremolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructuremolecularweighttype = substancespecificationstructuremolecularweight.getType();

		/******************** substancespecificationstructuremolecularweighttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructuremolecularweighttypecoding = substancespecificationstructuremolecularweighttype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecoding.hasCode()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtTypCdgCd(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtTypCdgSys(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Txt ********************************************************************************/
		if(substancespecificationstructuremolecularweighttype.hasText()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtTypTxt(String.valueOf(substancespecificationstructuremolecularweighttype.getText()));
		}
		/******************** substancespecificationstructuremolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructuremolecularweightamount = substancespecificationstructuremolecularweight.getAmount();

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasValue()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtAmntVl(String.valueOf(substancespecificationstructuremolecularweightamount.getValue()));
		}
		/******************** substancespecificationstructuremolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationstructuremolecularweightamountcomparator = substancespecificationstructuremolecularweightamount.getComparator();
		s.setSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr(substancespecificationstructuremolecularweightamountcomparator.toCode());

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasCode()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtAmntCd(String.valueOf(substancespecificationstructuremolecularweightamount.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasSystem()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtAmntSys(String.valueOf(substancespecificationstructuremolecularweightamount.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasUnit()) {
			s.setSbstncSpcfctnStrctrMoleclrWghtAmntUnt(String.valueOf(substancespecificationstructuremolecularweightamount.getUnit()));
		}
		/******************** substancespecificationstructureopticalactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureopticalactivity = substancespecificationstructure.getOpticalActivity();

		/******************** substancespecificationstructureopticalactivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureopticalactivitycoding = substancespecificationstructureopticalactivity.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureopticalactivitycoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrOpticalActvtyCdgDsply(String.valueOf(substancespecificationstructureopticalactivitycoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureopticalactivitycoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrOpticalActvtyCdgVrsn(String.valueOf(substancespecificationstructureopticalactivitycoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureopticalactivitycoding.hasCode()) {
			s.setSbstncSpcfctnStrctrOpticalActvtyCdgCd(String.valueOf(substancespecificationstructureopticalactivitycoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureopticalactivitycoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrOpticalActvtyCdgSys(String.valueOf(substancespecificationstructureopticalactivitycoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureopticalactivitycoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd(String.valueOf(substancespecificationstructureopticalactivitycoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Txt ********************************************************************************/
		if(substancespecificationstructureopticalactivity.hasText()) {
			s.setSbstncSpcfctnStrctrOpticalActvtyTxt(String.valueOf(substancespecificationstructureopticalactivity.getText()));
		}
		/******************** substancespecificationstructurestereochemistry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructurestereochemistry = substancespecificationstructure.getStereochemistry();

		/******************** substancespecificationstructurestereochemistrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructurestereochemistrycoding = substancespecificationstructurestereochemistry.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructurestereochemistrycoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrStereochemistryCdgDsply(String.valueOf(substancespecificationstructurestereochemistrycoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructurestereochemistrycoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrStereochemistryCdgVrsn(String.valueOf(substancespecificationstructurestereochemistrycoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructurestereochemistrycoding.hasCode()) {
			s.setSbstncSpcfctnStrctrStereochemistryCdgCd(String.valueOf(substancespecificationstructurestereochemistrycoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructurestereochemistrycoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrStereochemistryCdgSys(String.valueOf(substancespecificationstructurestereochemistrycoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructurestereochemistrycoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrStereochemistryCdgUsrSltd(String.valueOf(substancespecificationstructurestereochemistrycoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Txt ********************************************************************************/
		if(substancespecificationstructurestereochemistry.hasText()) {
			s.setSbstncSpcfctnStrctrStereochemistryTxt(String.valueOf(substancespecificationstructurestereochemistry.getText()));
		}
		/******************** substancespecificationstructureisotope ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent substancespecificationstructureisotope = substancespecificationstructure.getIsotopeFirstRep();

		/******************** substancespecificationstructureisotopename ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopename = substancespecificationstructureisotope.getName();

		/******************** substancespecificationstructureisotopenamecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopenamecoding = substancespecificationstructureisotopename.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopenamecoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrIsotopeNmCdgDsply(String.valueOf(substancespecificationstructureisotopenamecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopenamecoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrIsotopeNmCdgVrsn(String.valueOf(substancespecificationstructureisotopenamecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopenamecoding.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeNmCdgCd(String.valueOf(substancespecificationstructureisotopenamecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopenamecoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeNmCdgSys(String.valueOf(substancespecificationstructureisotopenamecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopenamecoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd(String.valueOf(substancespecificationstructureisotopenamecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Txt ********************************************************************************/
		if(substancespecificationstructureisotopename.hasText()) {
			s.setSbstncSpcfctnStrctrIsotopeNmTxt(String.valueOf(substancespecificationstructureisotopename.getText()));
		}
		/******************** substancespecificationstructureisotopesubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopesubstitution = substancespecificationstructureisotope.getSubstitution();

		/******************** substancespecificationstructureisotopesubstitutioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopesubstitutioncoding = substancespecificationstructureisotopesubstitution.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncoding.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Txt ********************************************************************************/
		if(substancespecificationstructureisotopesubstitution.hasText()) {
			s.setSbstncSpcfctnStrctrIsotopeSubstitutionTxt(String.valueOf(substancespecificationstructureisotopesubstitution.getText()));
		}
		/******************** substancespecificationstructureisotopeidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationstructureisotopeidentifier = substancespecificationstructureisotope.getIdentifier();

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Vl ********************************************************************************/
		if(substancespecificationstructureisotopeidentifier.hasValue()) {
			s.setSbstncSpcfctnStrctrIsotopeIdVl(String.valueOf(substancespecificationstructureisotopeidentifier.getValue()));
		}
		/******************** substancespecificationstructureisotopeidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopeidentifiertype = substancespecificationstructureisotopeidentifier.getType();

		/******************** substancespecificationstructureisotopeidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopeidentifiertypecoding = substancespecificationstructureisotopeidentifiertype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrIsotopeIdTypCdgDsply(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecoding.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeIdTypCdgCd(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeIdTypCdgSys(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Txt ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertype.hasText()) {
			s.setSbstncSpcfctnStrctrIsotopeIdTypTxt(String.valueOf(substancespecificationstructureisotopeidentifiertype.getText()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Sys ********************************************************************************/
		if(substancespecificationstructureisotopeidentifier.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeIdSys(String.valueOf(substancespecificationstructureisotopeidentifier.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Assigner ********************************************************************************/
		if(substancespecificationstructureisotopeidentifier.hasAssigner()) {
			s.setSbstncSpcfctnStrctrIsotopeIdAssigner(String.valueOf(substancespecificationstructureisotopeidentifier.getAssigner()));
		}
		/******************** substancespecificationstructureisotopeidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationstructureisotopeidentifierperiod = substancespecificationstructureisotopeidentifier.getPeriod();

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_End ********************************************************************************/
		if(substancespecificationstructureisotopeidentifierperiod.hasEnd()) {
			s.setSbstncSpcfctnStrctrIsotopeIdPrdEnd(String.valueOf(substancespecificationstructureisotopeidentifierperiod.getEnd()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strt ********************************************************************************/
		if(substancespecificationstructureisotopeidentifierperiod.hasStart()) {
			s.setSbstncSpcfctnStrctrIsotopeIdPrdStrt(String.valueOf(substancespecificationstructureisotopeidentifierperiod.getStart()));
		}
		/******************** substancespecificationstructureisotopeidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancespecificationstructureisotopeidentifieruse = substancespecificationstructureisotopeidentifier.getUse();
		s.setSbstncSpcfctnStrctrIsotopeIdUse(substancespecificationstructureisotopeidentifieruse.toCode());

		/******************** substancespecificationstructureisotopemolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationstructureisotopemolecularweight = substancespecificationstructureisotope.getMolecularWeight();

		/******************** substancespecificationstructureisotopemolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopemolecularweightmethod = substancespecificationstructureisotopemolecularweight.getMethod();

		/******************** substancespecificationstructureisotopemolecularweightmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopemolecularweightmethodcoding = substancespecificationstructureisotopemolecularweightmethod.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethod.hasText()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt(String.valueOf(substancespecificationstructureisotopemolecularweightmethod.getText()));
		}
		/******************** substancespecificationstructureisotopemolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopemolecularweighttype = substancespecificationstructureisotopemolecularweight.getType();

		/******************** substancespecificationstructureisotopemolecularweighttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopemolecularweighttypecoding = substancespecificationstructureisotopemolecularweighttype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasDisplay()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasVersion()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Txt ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttype.hasText()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt(String.valueOf(substancespecificationstructureisotopemolecularweighttype.getText()));
		}
		/******************** substancespecificationstructureisotopemolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructureisotopemolecularweightamount = substancespecificationstructureisotopemolecularweight.getAmount();

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightamount.hasValue()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getValue()));
		}
		/******************** substancespecificationstructureisotopemolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationstructureisotopemolecularweightamountcomparator = substancespecificationstructureisotopemolecularweightamount.getComparator();
		s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr(substancespecificationstructureisotopemolecularweightamountcomparator.toCode());

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightamount.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightamount.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightamount.hasUnit()) {
			s.setSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getUnit()));
		}
		/******************** substancespecificationstructureisotopehalflife ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructureisotopehalflife = substancespecificationstructureisotope.getHalfLife();

		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Vl ********************************************************************************/
		if(substancespecificationstructureisotopehalflife.hasValue()) {
			s.setSbstncSpcfctnStrctrIsotopeHalfLifeVl(String.valueOf(substancespecificationstructureisotopehalflife.getValue()));
		}
		/******************** substancespecificationstructureisotopehalflifecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationstructureisotopehalflifecomparator = substancespecificationstructureisotopehalflife.getComparator();
		s.setSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr(substancespecificationstructureisotopehalflifecomparator.toCode());

		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Cd ********************************************************************************/
		if(substancespecificationstructureisotopehalflife.hasCode()) {
			s.setSbstncSpcfctnStrctrIsotopeHalfLifeCd(String.valueOf(substancespecificationstructureisotopehalflife.getCode()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Sys ********************************************************************************/
		if(substancespecificationstructureisotopehalflife.hasSystem()) {
			s.setSbstncSpcfctnStrctrIsotopeHalfLifeSys(String.valueOf(substancespecificationstructureisotopehalflife.getSystem()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Unt ********************************************************************************/
		if(substancespecificationstructureisotopehalflife.hasUnit()) {
			s.setSbstncSpcfctnStrctrIsotopeHalfLifeUnt(String.valueOf(substancespecificationstructureisotopehalflife.getUnit()));
		}
		/******************** SbstncSpcfctn_Protein ********************************************************************************/
		if(substancespecification.hasProtein()) {
			s.setSbstncSpcfctnProtein(String.valueOf(substancespecification.getProtein()));
		}
		/******************** SbstncSpcfctn_NclicAcid ********************************************************************************/
		if(substancespecification.hasNucleicAcid()) {
			s.setSbstncSpcfctnNclicAcid(String.valueOf(substancespecification.getNucleicAcid()));
		}
		/******************** SbstncSpcfctn_SrcMtrl ********************************************************************************/
		if(substancespecification.hasSourceMaterial()) {
			s.setSbstncSpcfctnSrcMtrl(String.valueOf(substancespecification.getSourceMaterial()));
		}
		/******************** SbstncSpcfctn_Plymr ********************************************************************************/
		if(substancespecification.hasPolymer()) {
			s.setSbstncSpcfctnPlymr(String.valueOf(substancespecification.getPolymer()));
		}
		/******************** substancespecificationname ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent substancespecificationname = substancespecification.getNameFirstRep();

		/******************** substancespecificationnametype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnametype = substancespecificationname.getType();

		/******************** substancespecificationnametypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnametypecoding = substancespecificationnametype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnametypecoding.hasDisplay()) {
			s.setSbstncSpcfctnNmTypCdgDsply(String.valueOf(substancespecificationnametypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnametypecoding.hasVersion()) {
			s.setSbstncSpcfctnNmTypCdgVrsn(String.valueOf(substancespecificationnametypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationnametypecoding.hasCode()) {
			s.setSbstncSpcfctnNmTypCdgCd(String.valueOf(substancespecificationnametypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationnametypecoding.hasSystem()) {
			s.setSbstncSpcfctnNmTypCdgSys(String.valueOf(substancespecificationnametypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnametypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmTypCdgUsrSltd(String.valueOf(substancespecificationnametypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Typ_Txt ********************************************************************************/
		if(substancespecificationnametype.hasText()) {
			s.setSbstncSpcfctnNmTypTxt(String.valueOf(substancespecificationnametype.getText()));
		}
		/******************** substancespecificationnamejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamejurisdiction = substancespecificationname.getJurisdictionFirstRep();

		/******************** substancespecificationnamejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamejurisdictioncoding = substancespecificationnamejurisdiction.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamejurisdictioncoding.hasDisplay()) {
			s.setSbstncSpcfctnNmJrsdctnCdgDsply(String.valueOf(substancespecificationnamejurisdictioncoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamejurisdictioncoding.hasVersion()) {
			s.setSbstncSpcfctnNmJrsdctnCdgVrsn(String.valueOf(substancespecificationnamejurisdictioncoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamejurisdictioncoding.hasCode()) {
			s.setSbstncSpcfctnNmJrsdctnCdgCd(String.valueOf(substancespecificationnamejurisdictioncoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamejurisdictioncoding.hasSystem()) {
			s.setSbstncSpcfctnNmJrsdctnCdgSys(String.valueOf(substancespecificationnamejurisdictioncoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamejurisdictioncoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmJrsdctnCdgUsrSltd(String.valueOf(substancespecificationnamejurisdictioncoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Txt ********************************************************************************/
		if(substancespecificationnamejurisdiction.hasText()) {
			s.setSbstncSpcfctnNmJrsdctnTxt(String.valueOf(substancespecificationnamejurisdiction.getText()));
		}
		/******************** substancespecificationnamestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamestatus = substancespecificationname.getStatus();

		/******************** substancespecificationnamestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamestatuscoding = substancespecificationnamestatus.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamestatuscoding.hasDisplay()) {
			s.setSbstncSpcfctnNmStsCdgDsply(String.valueOf(substancespecificationnamestatuscoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamestatuscoding.hasVersion()) {
			s.setSbstncSpcfctnNmStsCdgVrsn(String.valueOf(substancespecificationnamestatuscoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamestatuscoding.hasCode()) {
			s.setSbstncSpcfctnNmStsCdgCd(String.valueOf(substancespecificationnamestatuscoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamestatuscoding.hasSystem()) {
			s.setSbstncSpcfctnNmStsCdgSys(String.valueOf(substancespecificationnamestatuscoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamestatuscoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmStsCdgUsrSltd(String.valueOf(substancespecificationnamestatuscoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Sts_Txt ********************************************************************************/
		if(substancespecificationnamestatus.hasText()) {
			s.setSbstncSpcfctnNmStsTxt(String.valueOf(substancespecificationnamestatus.getText()));
		}
		/******************** substancespecificationnameofficial ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent substancespecificationnameofficial = substancespecificationname.getOfficialFirstRep();

		/******************** substancespecificationnameofficialauthority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnameofficialauthority = substancespecificationnameofficial.getAuthority();

		/******************** substancespecificationnameofficialauthoritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnameofficialauthoritycoding = substancespecificationnameofficialauthority.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnameofficialauthoritycoding.hasDisplay()) {
			s.setSbstncSpcfctnNmOfficialAthrityCdgDsply(String.valueOf(substancespecificationnameofficialauthoritycoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnameofficialauthoritycoding.hasVersion()) {
			s.setSbstncSpcfctnNmOfficialAthrityCdgVrsn(String.valueOf(substancespecificationnameofficialauthoritycoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Cd ********************************************************************************/
		if(substancespecificationnameofficialauthoritycoding.hasCode()) {
			s.setSbstncSpcfctnNmOfficialAthrityCdgCd(String.valueOf(substancespecificationnameofficialauthoritycoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Sys ********************************************************************************/
		if(substancespecificationnameofficialauthoritycoding.hasSystem()) {
			s.setSbstncSpcfctnNmOfficialAthrityCdgSys(String.valueOf(substancespecificationnameofficialauthoritycoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnameofficialauthoritycoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmOfficialAthrityCdgUsrSltd(String.valueOf(substancespecificationnameofficialauthoritycoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Txt ********************************************************************************/
		if(substancespecificationnameofficialauthority.hasText()) {
			s.setSbstncSpcfctnNmOfficialAthrityTxt(String.valueOf(substancespecificationnameofficialauthority.getText()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Dt ********************************************************************************/
		if(substancespecificationnameofficial.hasDate()) {
			s.setSbstncSpcfctnNmOfficialDt(String.valueOf(substancespecificationnameofficial.getDate()));
		}
		/******************** substancespecificationnameofficialstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnameofficialstatus = substancespecificationnameofficial.getStatus();

		/******************** substancespecificationnameofficialstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnameofficialstatuscoding = substancespecificationnameofficialstatus.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnameofficialstatuscoding.hasDisplay()) {
			s.setSbstncSpcfctnNmOfficialStsCdgDsply(String.valueOf(substancespecificationnameofficialstatuscoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnameofficialstatuscoding.hasVersion()) {
			s.setSbstncSpcfctnNmOfficialStsCdgVrsn(String.valueOf(substancespecificationnameofficialstatuscoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationnameofficialstatuscoding.hasCode()) {
			s.setSbstncSpcfctnNmOfficialStsCdgCd(String.valueOf(substancespecificationnameofficialstatuscoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationnameofficialstatuscoding.hasSystem()) {
			s.setSbstncSpcfctnNmOfficialStsCdgSys(String.valueOf(substancespecificationnameofficialstatuscoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnameofficialstatuscoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmOfficialStsCdgUsrSltd(String.valueOf(substancespecificationnameofficialstatuscoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Txt ********************************************************************************/
		if(substancespecificationnameofficialstatus.hasText()) {
			s.setSbstncSpcfctnNmOfficialStsTxt(String.valueOf(substancespecificationnameofficialstatus.getText()));
		}
		/******************** substancespecificationnamelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamelanguage = substancespecificationname.getLanguageFirstRep();

		/******************** substancespecificationnamelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamelanguagecoding = substancespecificationnamelanguage.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamelanguagecoding.hasDisplay()) {
			s.setSbstncSpcfctnNmLnguageCdgDsply(String.valueOf(substancespecificationnamelanguagecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamelanguagecoding.hasVersion()) {
			s.setSbstncSpcfctnNmLnguageCdgVrsn(String.valueOf(substancespecificationnamelanguagecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamelanguagecoding.hasCode()) {
			s.setSbstncSpcfctnNmLnguageCdgCd(String.valueOf(substancespecificationnamelanguagecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamelanguagecoding.hasSystem()) {
			s.setSbstncSpcfctnNmLnguageCdgSys(String.valueOf(substancespecificationnamelanguagecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamelanguagecoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmLnguageCdgUsrSltd(String.valueOf(substancespecificationnamelanguagecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Txt ********************************************************************************/
		if(substancespecificationnamelanguage.hasText()) {
			s.setSbstncSpcfctnNmLnguageTxt(String.valueOf(substancespecificationnamelanguage.getText()));
		}
		/******************** SbstncSpcfctn_Nm_Src ********************************************************************************/
		if(substancespecificationname.hasSource()) {
			s.setSbstncSpcfctnNmSrc(String.valueOf(substancespecificationname.getSourceFirstRep()));
		}
		/******************** substancespecificationnamedomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamedomain = substancespecificationname.getDomainFirstRep();

		/******************** substancespecificationnamedomaincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamedomaincoding = substancespecificationnamedomain.getCodingFirstRep();

		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamedomaincoding.hasDisplay()) {
			s.setSbstncSpcfctnNmDomainCdgDsply(String.valueOf(substancespecificationnamedomaincoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamedomaincoding.hasVersion()) {
			s.setSbstncSpcfctnNmDomainCdgVrsn(String.valueOf(substancespecificationnamedomaincoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamedomaincoding.hasCode()) {
			s.setSbstncSpcfctnNmDomainCdgCd(String.valueOf(substancespecificationnamedomaincoding.getCode()));
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamedomaincoding.hasSystem()) {
			s.setSbstncSpcfctnNmDomainCdgSys(String.valueOf(substancespecificationnamedomaincoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamedomaincoding.hasUserSelected()) {
			s.setSbstncSpcfctnNmDomainCdgUsrSltd(String.valueOf(substancespecificationnamedomaincoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Nm_Domain_Txt ********************************************************************************/
		if(substancespecificationnamedomain.hasText()) {
			s.setSbstncSpcfctnNmDomainTxt(String.valueOf(substancespecificationnamedomain.getText()));
		}
		/******************** SbstncSpcfctn_Nm_Preferred ********************************************************************************/
		if(substancespecificationname.hasPreferred()) {
			s.setSbstncSpcfctnNmPreferred(String.valueOf(substancespecificationname.getPreferred()));
		}
		/******************** substancespecificationproperty ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent substancespecificationproperty = substancespecification.getPropertyFirstRep();

		/******************** SbstncSpcfctn_Prpty_Prmtrs ********************************************************************************/
		if(substancespecificationproperty.hasParameters()) {
			s.setSbstncSpcfctnPrptyPrmtrs(String.valueOf(substancespecificationproperty.getParameters()));
		}
		/******************** substancespecificationpropertycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertycode = substancespecificationproperty.getCode();

		/******************** substancespecificationpropertycodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationpropertycodecoding = substancespecificationpropertycode.getCodingFirstRep();

		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationpropertycodecoding.hasDisplay()) {
			s.setSbstncSpcfctnPrptyCdCdgDsply(String.valueOf(substancespecificationpropertycodecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationpropertycodecoding.hasVersion()) {
			s.setSbstncSpcfctnPrptyCdCdgVrsn(String.valueOf(substancespecificationpropertycodecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Cd ********************************************************************************/
		if(substancespecificationpropertycodecoding.hasCode()) {
			s.setSbstncSpcfctnPrptyCdCdgCd(String.valueOf(substancespecificationpropertycodecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Sys ********************************************************************************/
		if(substancespecificationpropertycodecoding.hasSystem()) {
			s.setSbstncSpcfctnPrptyCdCdgSys(String.valueOf(substancespecificationpropertycodecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationpropertycodecoding.hasUserSelected()) {
			s.setSbstncSpcfctnPrptyCdCdgUsrSltd(String.valueOf(substancespecificationpropertycodecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Txt ********************************************************************************/
		if(substancespecificationpropertycode.hasText()) {
			s.setSbstncSpcfctnPrptyCdTxt(String.valueOf(substancespecificationpropertycode.getText()));
		}
		/******************** substancespecificationpropertycategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertycategory = substancespecificationproperty.getCategory();

		/******************** substancespecificationpropertycategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationpropertycategorycoding = substancespecificationpropertycategory.getCodingFirstRep();

		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Dsply ********************************************************************************/
		if(substancespecificationpropertycategorycoding.hasDisplay()) {
			s.setSbstncSpcfctnPrptyCtgryCdgDsply(String.valueOf(substancespecificationpropertycategorycoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationpropertycategorycoding.hasVersion()) {
			s.setSbstncSpcfctnPrptyCtgryCdgVrsn(String.valueOf(substancespecificationpropertycategorycoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Cd ********************************************************************************/
		if(substancespecificationpropertycategorycoding.hasCode()) {
			s.setSbstncSpcfctnPrptyCtgryCdgCd(String.valueOf(substancespecificationpropertycategorycoding.getCode()));
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Sys ********************************************************************************/
		if(substancespecificationpropertycategorycoding.hasSystem()) {
			s.setSbstncSpcfctnPrptyCtgryCdgSys(String.valueOf(substancespecificationpropertycategorycoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationpropertycategorycoding.hasUserSelected()) {
			s.setSbstncSpcfctnPrptyCtgryCdgUsrSltd(String.valueOf(substancespecificationpropertycategorycoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Txt ********************************************************************************/
		if(substancespecificationpropertycategory.hasText()) {
			s.setSbstncSpcfctnPrptyCtgryTxt(String.valueOf(substancespecificationpropertycategory.getText()));
		}
		/******************** substancespecificationpropertydefiningsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertydefiningsubstancecodeableconcept = substancespecificationproperty.getDefiningSubstanceCodeableConcept();

		/******************** substancespecificationpropertydefiningsubstancecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationpropertydefiningsubstancecodeableconceptcoding = substancespecificationpropertydefiningsubstancecodeableconcept.getCodingFirstRep();

		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasDisplay()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasVersion()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasCode()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getCode()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasSystem()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasUserSelected()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Txt ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconcept.hasText()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconcept.getText()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncRfrnc ********************************************************************************/
		if(substancespecificationproperty.hasDefiningSubstanceReference()) {
			s.setSbstncSpcfctnPrptyDefiningSbstncRfrnc(String.valueOf(substancespecificationproperty.getDefiningSubstanceReference()));
		}
		/******************** SbstncSpcfctn_Prpty_AmntStrgTyp ********************************************************************************/
		if(substancespecificationproperty.hasAmountStringType()) {
			s.setSbstncSpcfctnPrptyAmntStrgTyp(String.valueOf(substancespecificationproperty.getAmountStringType()));
		}
		/******************** substancespecificationpropertyamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationpropertyamountquantity = substancespecificationproperty.getAmountQuantity();

		/******************** SbstncSpcfctn_Prpty_AmntQnty_Vl ********************************************************************************/
		if(substancespecificationpropertyamountquantity.hasValue()) {
			s.setSbstncSpcfctnPrptyAmntQntyVl(String.valueOf(substancespecificationpropertyamountquantity.getValue()));
		}
		/******************** substancespecificationpropertyamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationpropertyamountquantitycomparator = substancespecificationpropertyamountquantity.getComparator();
		s.setSbstncSpcfctnPrptyAmntQntyCmprtr(substancespecificationpropertyamountquantitycomparator.toCode());

		/******************** SbstncSpcfctn_Prpty_AmntQnty_Cd ********************************************************************************/
		if(substancespecificationpropertyamountquantity.hasCode()) {
			s.setSbstncSpcfctnPrptyAmntQntyCd(String.valueOf(substancespecificationpropertyamountquantity.getCode()));
		}
		/******************** SbstncSpcfctn_Prpty_AmntQnty_Sys ********************************************************************************/
		if(substancespecificationpropertyamountquantity.hasSystem()) {
			s.setSbstncSpcfctnPrptyAmntQntySys(String.valueOf(substancespecificationpropertyamountquantity.getSystem()));
		}
		/******************** SbstncSpcfctn_Prpty_AmntQnty_Unt ********************************************************************************/
		if(substancespecificationpropertyamountquantity.hasUnit()) {
			s.setSbstncSpcfctnPrptyAmntQntyUnt(String.valueOf(substancespecificationpropertyamountquantity.getUnit()));
		}
		/******************** substancespecificationmolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationmolecularweight = substancespecification.getMolecularWeightFirstRep();

		/******************** substancespecificationmolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmolecularweightmethod = substancespecificationmolecularweight.getMethod();

		/******************** substancespecificationmolecularweightmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmolecularweightmethodcoding = substancespecificationmolecularweightmethod.getCodingFirstRep();

		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmolecularweightmethodcoding.hasDisplay()) {
			s.setSbstncSpcfctnMoleclrWghtMthdCdgDsply(String.valueOf(substancespecificationmolecularweightmethodcoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmolecularweightmethodcoding.hasVersion()) {
			s.setSbstncSpcfctnMoleclrWghtMthdCdgVrsn(String.valueOf(substancespecificationmolecularweightmethodcoding.getVersion()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(substancespecificationmolecularweightmethodcoding.hasCode()) {
			s.setSbstncSpcfctnMoleclrWghtMthdCdgCd(String.valueOf(substancespecificationmolecularweightmethodcoding.getCode()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(substancespecificationmolecularweightmethodcoding.hasSystem()) {
			s.setSbstncSpcfctnMoleclrWghtMthdCdgSys(String.valueOf(substancespecificationmolecularweightmethodcoding.getSystem()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmolecularweightmethodcoding.hasUserSelected()) {
			s.setSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd(String.valueOf(substancespecificationmolecularweightmethodcoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(substancespecificationmolecularweightmethod.hasText()) {
			s.setSbstncSpcfctnMoleclrWghtMthdTxt(String.valueOf(substancespecificationmolecularweightmethod.getText()));
		}
		/******************** substancespecificationmolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmolecularweighttype = substancespecificationmolecularweight.getType();

		/******************** substancespecificationmolecularweighttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmolecularweighttypecoding = substancespecificationmolecularweighttype.getCodingFirstRep();

		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmolecularweighttypecoding.hasDisplay()) {
			s.setSbstncSpcfctnMoleclrWghtTypCdgDsply(String.valueOf(substancespecificationmolecularweighttypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmolecularweighttypecoding.hasVersion()) {
			s.setSbstncSpcfctnMoleclrWghtTypCdgVrsn(String.valueOf(substancespecificationmolecularweighttypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationmolecularweighttypecoding.hasCode()) {
			s.setSbstncSpcfctnMoleclrWghtTypCdgCd(String.valueOf(substancespecificationmolecularweighttypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationmolecularweighttypecoding.hasSystem()) {
			s.setSbstncSpcfctnMoleclrWghtTypCdgSys(String.valueOf(substancespecificationmolecularweighttypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmolecularweighttypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnMoleclrWghtTypCdgUsrSltd(String.valueOf(substancespecificationmolecularweighttypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Txt ********************************************************************************/
		if(substancespecificationmolecularweighttype.hasText()) {
			s.setSbstncSpcfctnMoleclrWghtTypTxt(String.valueOf(substancespecificationmolecularweighttype.getText()));
		}
		/******************** substancespecificationmolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationmolecularweightamount = substancespecificationmolecularweight.getAmount();

		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(substancespecificationmolecularweightamount.hasValue()) {
			s.setSbstncSpcfctnMoleclrWghtAmntVl(String.valueOf(substancespecificationmolecularweightamount.getValue()));
		}
		/******************** substancespecificationmolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationmolecularweightamountcomparator = substancespecificationmolecularweightamount.getComparator();
		s.setSbstncSpcfctnMoleclrWghtAmntCmprtr(substancespecificationmolecularweightamountcomparator.toCode());

		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(substancespecificationmolecularweightamount.hasCode()) {
			s.setSbstncSpcfctnMoleclrWghtAmntCd(String.valueOf(substancespecificationmolecularweightamount.getCode()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(substancespecificationmolecularweightamount.hasSystem()) {
			s.setSbstncSpcfctnMoleclrWghtAmntSys(String.valueOf(substancespecificationmolecularweightamount.getSystem()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(substancespecificationmolecularweightamount.hasUnit()) {
			s.setSbstncSpcfctnMoleclrWghtAmntUnt(String.valueOf(substancespecificationmolecularweightamount.getUnit()));
		}
		/******************** SbstncSpcfctn_RfrncInfo ********************************************************************************/
		if(substancespecification.hasReferenceInformation()) {
			s.setSbstncSpcfctnRfrncInfo(String.valueOf(substancespecification.getReferenceInformation()));
		}
		/******************** substancespecificationrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent substancespecificationrelationship = substancespecification.getRelationshipFirstRep();

		/******************** substancespecificationrelationshipsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshipsubstancecodeableconcept = substancespecificationrelationship.getSubstanceCodeableConcept();

		/******************** substancespecificationrelationshipsubstancecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationrelationshipsubstancecodeableconceptcoding = substancespecificationrelationshipsubstancecodeableconcept.getCodingFirstRep();

		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasDisplay()) {
			s.setSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasVersion()) {
			s.setSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasCode()) {
			s.setSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasSystem()) {
			s.setSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasUserSelected()) {
			s.setSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconcept.hasText()) {
			s.setSbstncSpcfctnRltnshipSbstncCdbleCncptTxt(String.valueOf(substancespecificationrelationshipsubstancecodeableconcept.getText()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncRfrnc ********************************************************************************/
		if(substancespecificationrelationship.hasSubstanceReference()) {
			s.setSbstncSpcfctnRltnshipSbstncRfrnc(String.valueOf(substancespecificationrelationship.getSubstanceReference()));
		}
		/******************** substancespecificationrelationshipamountratiolowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substancespecificationrelationshipamountratiolowlimit = substancespecificationrelationship.getAmountRatioLowLimit();

		/******************** substancespecificationrelationshipamountratiolowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiolowlimitnumerator = substancespecificationrelationshipamountratiolowlimit.getNumerator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getValue()));
		}
		/******************** substancespecificationrelationshipamountratiolowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountratiolowlimitnumeratorcomparator = substancespecificationrelationshipamountratiolowlimitnumerator.getComparator();
		s.setSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr(substancespecificationrelationshipamountratiolowlimitnumeratorcomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getUnit()));
		}
		/******************** substancespecificationrelationshipamountratiolowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiolowlimitdenominator = substancespecificationrelationshipamountratiolowlimit.getDenominator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getValue()));
		}
		/******************** substancespecificationrelationshipamountratiolowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountratiolowlimitdenominatorcomparator = substancespecificationrelationshipamountratiolowlimitdenominator.getComparator();
		s.setSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr(substancespecificationrelationshipamountratiolowlimitdenominatorcomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getUnit()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntStrgTyp ********************************************************************************/
		if(substancespecificationrelationship.hasAmountStringType()) {
			s.setSbstncSpcfctnRltnshipAmntStrgTyp(String.valueOf(substancespecificationrelationship.getAmountStringType()));
		}
		/******************** SbstncSpcfctn_Rltnship_Src ********************************************************************************/
		if(substancespecificationrelationship.hasSource()) {
			s.setSbstncSpcfctnRltnshipSrc(String.valueOf(substancespecificationrelationship.getSourceFirstRep()));
		}
		/******************** substancespecificationrelationshipamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancespecificationrelationshipamountrange = substancespecificationrelationship.getAmountRange();

		/******************** substancespecificationrelationshipamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrangelow = substancespecificationrelationshipamountrange.getLow();

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountrangelow.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntRngLwVl(String.valueOf(substancespecificationrelationshipamountrangelow.getValue()));
		}
		/******************** substancespecificationrelationshipamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountrangelowcomparator = substancespecificationrelationshipamountrangelow.getComparator();
		s.setSbstncSpcfctnRltnshipAmntRngLwCmprtr(substancespecificationrelationshipamountrangelowcomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountrangelow.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntRngLwCd(String.valueOf(substancespecificationrelationshipamountrangelow.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountrangelow.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntRngLwSys(String.valueOf(substancespecificationrelationshipamountrangelow.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountrangelow.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntRngLwUnt(String.valueOf(substancespecificationrelationshipamountrangelow.getUnit()));
		}
		/******************** substancespecificationrelationshipamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrangehigh = substancespecificationrelationshipamountrange.getHigh();

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountrangehigh.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntRngHiVl(String.valueOf(substancespecificationrelationshipamountrangehigh.getValue()));
		}
		/******************** substancespecificationrelationshipamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountrangehighcomparator = substancespecificationrelationshipamountrangehigh.getComparator();
		s.setSbstncSpcfctnRltnshipAmntRngHiCmprtr(substancespecificationrelationshipamountrangehighcomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountrangehigh.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntRngHiCd(String.valueOf(substancespecificationrelationshipamountrangehigh.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountrangehigh.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntRngHiSys(String.valueOf(substancespecificationrelationshipamountrangehigh.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountrangehigh.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntRngHiUnt(String.valueOf(substancespecificationrelationshipamountrangehigh.getUnit()));
		}
		/******************** substancespecificationrelationshipamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountquantity = substancespecificationrelationship.getAmountQuantity();

		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountquantity.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntQntyVl(String.valueOf(substancespecificationrelationshipamountquantity.getValue()));
		}
		/******************** substancespecificationrelationshipamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountquantitycomparator = substancespecificationrelationshipamountquantity.getComparator();
		s.setSbstncSpcfctnRltnshipAmntQntyCmprtr(substancespecificationrelationshipamountquantitycomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountquantity.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntQntyCd(String.valueOf(substancespecificationrelationshipamountquantity.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountquantity.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntQntySys(String.valueOf(substancespecificationrelationshipamountquantity.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountquantity.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntQntyUnt(String.valueOf(substancespecificationrelationshipamountquantity.getUnit()));
		}
		/******************** substancespecificationrelationshipamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshipamounttype = substancespecificationrelationship.getAmountType();

		/******************** substancespecificationrelationshipamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationrelationshipamounttypecoding = substancespecificationrelationshipamounttype.getCodingFirstRep();

		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancespecificationrelationshipamounttypecoding.hasDisplay()) {
			s.setSbstncSpcfctnRltnshipAmntTypCdgDsply(String.valueOf(substancespecificationrelationshipamounttypecoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationrelationshipamounttypecoding.hasVersion()) {
			s.setSbstncSpcfctnRltnshipAmntTypCdgVrsn(String.valueOf(substancespecificationrelationshipamounttypecoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancespecificationrelationshipamounttypecoding.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntTypCdgCd(String.valueOf(substancespecificationrelationshipamounttypecoding.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancespecificationrelationshipamounttypecoding.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntTypCdgSys(String.valueOf(substancespecificationrelationshipamounttypecoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationrelationshipamounttypecoding.hasUserSelected()) {
			s.setSbstncSpcfctnRltnshipAmntTypCdgUsrSltd(String.valueOf(substancespecificationrelationshipamounttypecoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Txt ********************************************************************************/
		if(substancespecificationrelationshipamounttype.hasText()) {
			s.setSbstncSpcfctnRltnshipAmntTypTxt(String.valueOf(substancespecificationrelationshipamounttype.getText()));
		}
		/******************** substancespecificationrelationshiprelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshiprelationship = substancespecificationrelationship.getRelationship();

		/******************** substancespecificationrelationshiprelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationrelationshiprelationshipcoding = substancespecificationrelationshiprelationship.getCodingFirstRep();

		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Dsply ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcoding.hasDisplay()) {
			s.setSbstncSpcfctnRltnshipRltnshipCdgDsply(String.valueOf(substancespecificationrelationshiprelationshipcoding.getDisplay()));
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcoding.hasVersion()) {
			s.setSbstncSpcfctnRltnshipRltnshipCdgVrsn(String.valueOf(substancespecificationrelationshiprelationshipcoding.getVersion()));
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Cd ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcoding.hasCode()) {
			s.setSbstncSpcfctnRltnshipRltnshipCdgCd(String.valueOf(substancespecificationrelationshiprelationshipcoding.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Sys ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcoding.hasSystem()) {
			s.setSbstncSpcfctnRltnshipRltnshipCdgSys(String.valueOf(substancespecificationrelationshiprelationshipcoding.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcoding.hasUserSelected()) {
			s.setSbstncSpcfctnRltnshipRltnshipCdgUsrSltd(String.valueOf(substancespecificationrelationshiprelationshipcoding.getUserSelected()));
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Txt ********************************************************************************/
		if(substancespecificationrelationshiprelationship.hasText()) {
			s.setSbstncSpcfctnRltnshipRltnshipTxt(String.valueOf(substancespecificationrelationshiprelationship.getText()));
		}
		/******************** SbstncSpcfctn_Rltnship_IsDefining ********************************************************************************/
		if(substancespecificationrelationship.hasIsDefining()) {
			s.setSbstncSpcfctnRltnshipIsDefining(String.valueOf(substancespecificationrelationship.getIsDefining()));
		}
		/******************** substancespecificationrelationshipamountratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substancespecificationrelationshipamountratio = substancespecificationrelationship.getAmountRatio();

		/******************** substancespecificationrelationshipamountrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrationumerator = substancespecificationrelationshipamountratio.getNumerator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountrationumerator.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntRtioNmrtrVl(String.valueOf(substancespecificationrelationshipamountrationumerator.getValue()));
		}
		/******************** substancespecificationrelationshipamountrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountrationumeratorcomparator = substancespecificationrelationshipamountrationumerator.getComparator();
		s.setSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr(substancespecificationrelationshipamountrationumeratorcomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountrationumerator.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntRtioNmrtrCd(String.valueOf(substancespecificationrelationshipamountrationumerator.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountrationumerator.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntRtioNmrtrSys(String.valueOf(substancespecificationrelationshipamountrationumerator.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountrationumerator.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntRtioNmrtrUnt(String.valueOf(substancespecificationrelationshipamountrationumerator.getUnit()));
		}
		/******************** substancespecificationrelationshipamountratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiodenominator = substancespecificationrelationshipamountratio.getDenominator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Vl ********************************************************************************/
		if(substancespecificationrelationshipamountratiodenominator.hasValue()) {
			s.setSbstncSpcfctnRltnshipAmntRtioDnmntrVl(String.valueOf(substancespecificationrelationshipamountratiodenominator.getValue()));
		}
		/******************** substancespecificationrelationshipamountratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountratiodenominatorcomparator = substancespecificationrelationshipamountratiodenominator.getComparator();
		s.setSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr(substancespecificationrelationshipamountratiodenominatorcomparator.toCode());

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cd ********************************************************************************/
		if(substancespecificationrelationshipamountratiodenominator.hasCode()) {
			s.setSbstncSpcfctnRltnshipAmntRtioDnmntrCd(String.valueOf(substancespecificationrelationshipamountratiodenominator.getCode()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Sys ********************************************************************************/
		if(substancespecificationrelationshipamountratiodenominator.hasSystem()) {
			s.setSbstncSpcfctnRltnshipAmntRtioDnmntrSys(String.valueOf(substancespecificationrelationshipamountratiodenominator.getSystem()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Unt ********************************************************************************/
		if(substancespecificationrelationshipamountratiodenominator.hasUnit()) {
			s.setSbstncSpcfctnRltnshipAmntRtioDnmntrUnt(String.valueOf(substancespecificationrelationshipamountratiodenominator.getUnit()));
		}
		return s;
	}
}
