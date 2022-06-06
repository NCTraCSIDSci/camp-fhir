package main.java.com.campfhir.service.conversion;
import java.text.ParseException;

import org.hl7.fhir.r4.model.StringType;

import main.java.com.campfhir.model.SubstanceSpecification;
public class SubstanceSpecificationConversion 
{
	public org.hl7.fhir.r4.model.SubstanceSpecification SubstanceSpecifications(SubstanceSpecification s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceSpecification substancespecification = new org.hl7.fhir.r4.model.SubstanceSpecification();

		/******************** id ********************************************************************************/
		substancespecification.setId(s.getId());

		/******************** substancespecificationcode ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent substancespecificationcode =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent();
		substancespecification.addCode(substancespecificationcode);

		/******************** substancespecificationcodecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationcodecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationcode.setCode(substancespecificationcodecode);

		/******************** substancespecificationcodecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationcodecodecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationcodecode.addCoding(substancespecificationcodecodecoding);

		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnCdCdCdgCd() != null) {
			substancespecificationcodecodecoding.setCode(s.getSbstncSpcfctnCdCdCdgCd());
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnCdCdCdgDsply() != null) {
			substancespecificationcodecodecoding.setDisplay(s.getSbstncSpcfctnCdCdCdgDsply());
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnCdCdCdgSys() != null) {
			substancespecificationcodecodecoding.setSystem(s.getSbstncSpcfctnCdCdCdgSys());
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnCdCdCdgUsrSltd() != null) {
			substancespecificationcodecodecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnCdCdCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnCdCdCdgVrsn() != null) {
			substancespecificationcodecodecoding.setVersion(s.getSbstncSpcfctnCdCdCdgVrsn());
		}
		/******************** SbstncSpcfctn_Cd_Cd_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnCdCdTxt() != null) {
			substancespecificationcodecode.setText(s.getSbstncSpcfctnCdCdTxt());
		}
		/******************** SbstncSpcfctn_Cd_Comment ********************************************************************************/
		if(s.getSbstncSpcfctnCdComment() != null) {
			substancespecificationcode.setComment(s.getSbstncSpcfctnCdComment());
		}
		/******************** SbstncSpcfctn_Cd_Src ********************************************************************************/
		if(s.getSbstncSpcfctnCdSrc() != null) {
			substancespecificationcode.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnCdSrc()));
		}
		/******************** substancespecificationcodestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationcodestatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationcode.setStatus(substancespecificationcodestatus);

		/******************** substancespecificationcodestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationcodestatuscoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationcodestatus.addCoding(substancespecificationcodestatuscoding);

		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsCdgCd() != null) {
			substancespecificationcodestatuscoding.setCode(s.getSbstncSpcfctnCdStsCdgCd());
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsCdgDsply() != null) {
			substancespecificationcodestatuscoding.setDisplay(s.getSbstncSpcfctnCdStsCdgDsply());
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsCdgSys() != null) {
			substancespecificationcodestatuscoding.setSystem(s.getSbstncSpcfctnCdStsCdgSys());
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsCdgUsrSltd() != null) {
			substancespecificationcodestatuscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnCdStsCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsCdgVrsn() != null) {
			substancespecificationcodestatuscoding.setVersion(s.getSbstncSpcfctnCdStsCdgVrsn());
		}
		/******************** SbstncSpcfctn_Cd_Sts_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsTxt() != null) {
			substancespecificationcodestatus.setText(s.getSbstncSpcfctnCdStsTxt());
		}
		/******************** SbstncSpcfctn_Cd_StsDt ********************************************************************************/
		if(s.getSbstncSpcfctnCdStsDt() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Cd_StsDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Cd_StsDtdate = SbstncSpcfctn_Cd_StsDtsdf.parse(s.getSbstncSpcfctnCdStsDt());
			substancespecificationcode.setStatusDate(SbstncSpcfctn_Cd_StsDtdate);
		}
		/******************** SbstncSpcfctn_Comment ********************************************************************************/
		if(s.getSbstncSpcfctnComment() != null) {
			substancespecification.setComment(s.getSbstncSpcfctnComment());
		}
		/******************** SbstncSpcfctn_Dscrptn ********************************************************************************/
		if(s.getSbstncSpcfctnDscrptn() != null) {
			substancespecification.setDescription(s.getSbstncSpcfctnDscrptn());
		}
		/******************** substancespecificationdomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationdomain =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecification.setDomain(substancespecificationdomain);

		/******************** substancespecificationdomaincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationdomaincoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationdomain.addCoding(substancespecificationdomaincoding);

		/******************** SbstncSpcfctn_Domain_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnDomainCdgCd() != null) {
			substancespecificationdomaincoding.setCode(s.getSbstncSpcfctnDomainCdgCd());
		}
		/******************** SbstncSpcfctn_Domain_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnDomainCdgDsply() != null) {
			substancespecificationdomaincoding.setDisplay(s.getSbstncSpcfctnDomainCdgDsply());
		}
		/******************** SbstncSpcfctn_Domain_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnDomainCdgSys() != null) {
			substancespecificationdomaincoding.setSystem(s.getSbstncSpcfctnDomainCdgSys());
		}
		/******************** SbstncSpcfctn_Domain_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnDomainCdgUsrSltd() != null) {
			substancespecificationdomaincoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnDomainCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Domain_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnDomainCdgVrsn() != null) {
			substancespecificationdomaincoding.setVersion(s.getSbstncSpcfctnDomainCdgVrsn());
		}
		/******************** SbstncSpcfctn_Domain_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnDomainTxt() != null) {
			substancespecificationdomain.setText(s.getSbstncSpcfctnDomainTxt());
		}
		/******************** substancespecificationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		substancespecification.setIdentifier(substancespecificationidentifier);

		/******************** SbstncSpcfctn_Id_Assigner ********************************************************************************/
		if(s.getSbstncSpcfctnIdAssigner() != null) {
			substancespecificationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnIdAssigner()));
		}
		/******************** substancespecificationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substancespecificationidentifier.setPeriod(substancespecificationidentifierperiod);

		/******************** SbstncSpcfctn_Id_Prd_End ********************************************************************************/
		if(s.getSbstncSpcfctnIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Id_Prd_Enddate = SbstncSpcfctn_Id_Prd_Endsdf.parse(s.getSbstncSpcfctnIdPrdEnd());
			substancespecificationidentifierperiod.setEnd(SbstncSpcfctn_Id_Prd_Enddate);
		}
		/******************** SbstncSpcfctn_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncSpcfctnIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Id_Prd_Strtdate = SbstncSpcfctn_Id_Prd_Strtsdf.parse(s.getSbstncSpcfctnIdPrdStrt());
			substancespecificationidentifierperiod.setStart(SbstncSpcfctn_Id_Prd_Strtdate);
		}
		/******************** SbstncSpcfctn_Id_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnIdSys() != null) {
			substancespecificationidentifier.setSystem(s.getSbstncSpcfctnIdSys());
		}
		/******************** substancespecificationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationidentifier.setType(substancespecificationidentifiertype);

		/******************** substancespecificationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationidentifiertype.addCoding(substancespecificationidentifiertypecoding);

		/******************** SbstncSpcfctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnIdTypCdgCd() != null) {
			substancespecificationidentifiertypecoding.setCode(s.getSbstncSpcfctnIdTypCdgCd());
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnIdTypCdgDsply() != null) {
			substancespecificationidentifiertypecoding.setDisplay(s.getSbstncSpcfctnIdTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnIdTypCdgSys() != null) {
			substancespecificationidentifiertypecoding.setSystem(s.getSbstncSpcfctnIdTypCdgSys());
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnIdTypCdgUsrSltd() != null) {
			substancespecificationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnIdTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnIdTypCdgVrsn() != null) {
			substancespecificationidentifiertypecoding.setVersion(s.getSbstncSpcfctnIdTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnIdTypTxt() != null) {
			substancespecificationidentifiertype.setText(s.getSbstncSpcfctnIdTypTxt());
		}
		/******************** substancespecificationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancespecificationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancespecificationidentifier.setUse(substancespecificationidentifieruse.fromCode(s.getSbstncSpcfctnIdUse()));

		/******************** SbstncSpcfctn_Id_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnIdVl() != null) {
			substancespecificationidentifier.setValue(s.getSbstncSpcfctnIdVl());
		}
		/******************** substancespecificationmoiety ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent substancespecificationmoiety =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent();
		substancespecification.addMoiety(substancespecificationmoiety);

		/******************** substancespecificationmoietyamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationmoietyamountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationmoiety.setAmount(substancespecificationmoietyamountquantity);

		/******************** SbstncSpcfctn_Moiety_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyAmntQntyCd() != null) {
			substancespecificationmoietyamountquantity.setCode(s.getSbstncSpcfctnMoietyAmntQntyCd());
		}
		/******************** substancespecificationmoietyamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationmoietyamountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationmoietyamountquantity.setComparator(substancespecificationmoietyamountquantitycomparator.fromCode(s.getSbstncSpcfctnMoietyAmntQntyCmprtr()));

		/******************** SbstncSpcfctn_Moiety_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyAmntQntySys() != null) {
			substancespecificationmoietyamountquantity.setSystem(s.getSbstncSpcfctnMoietyAmntQntySys());
		}
		/******************** SbstncSpcfctn_Moiety_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyAmntQntyUnt() != null) {
			substancespecificationmoietyamountquantity.setUnit(s.getSbstncSpcfctnMoietyAmntQntyUnt());
		}
		/******************** SbstncSpcfctn_Moiety_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyAmntQntyVl() != null) {
			substancespecificationmoietyamountquantity.setValue(Double.parseDouble((s.getSbstncSpcfctnMoietyAmntQntyVl())));
		}
		/******************** SbstncSpcfctn_Moiety_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyAmntStrgTyp() != null) {
			substancespecificationmoiety.setAmount( new org.hl7.fhir.r4.model.StringType(s.getSbstncSpcfctnMoietyAmntStrgTyp()));
		}
		/******************** substancespecificationmoietyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationmoietyidentifier =  new org.hl7.fhir.r4.model.Identifier();
		substancespecificationmoiety.setIdentifier(substancespecificationmoietyidentifier);

		/******************** SbstncSpcfctn_Moiety_Id_Assigner ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdAssigner() != null) {
			substancespecificationmoietyidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnMoietyIdAssigner()));
		}
		/******************** substancespecificationmoietyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationmoietyidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substancespecificationmoietyidentifier.setPeriod(substancespecificationmoietyidentifierperiod);

		/******************** SbstncSpcfctn_Moiety_Id_Prd_End ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Moiety_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Moiety_Id_Prd_Enddate = SbstncSpcfctn_Moiety_Id_Prd_Endsdf.parse(s.getSbstncSpcfctnMoietyIdPrdEnd());
			substancespecificationmoietyidentifierperiod.setEnd(SbstncSpcfctn_Moiety_Id_Prd_Enddate);
		}
		/******************** SbstncSpcfctn_Moiety_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Moiety_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Moiety_Id_Prd_Strtdate = SbstncSpcfctn_Moiety_Id_Prd_Strtsdf.parse(s.getSbstncSpcfctnMoietyIdPrdStrt());
			substancespecificationmoietyidentifierperiod.setStart(SbstncSpcfctn_Moiety_Id_Prd_Strtdate);
		}
		/******************** SbstncSpcfctn_Moiety_Id_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdSys() != null) {
			substancespecificationmoietyidentifier.setSystem(s.getSbstncSpcfctnMoietyIdSys());
		}
		/******************** substancespecificationmoietyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationmoietyidentifier.setType(substancespecificationmoietyidentifiertype);

		/******************** substancespecificationmoietyidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietyidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationmoietyidentifiertype.addCoding(substancespecificationmoietyidentifiertypecoding);

		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdTypCdgCd() != null) {
			substancespecificationmoietyidentifiertypecoding.setCode(s.getSbstncSpcfctnMoietyIdTypCdgCd());
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdTypCdgDsply() != null) {
			substancespecificationmoietyidentifiertypecoding.setDisplay(s.getSbstncSpcfctnMoietyIdTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdTypCdgSys() != null) {
			substancespecificationmoietyidentifiertypecoding.setSystem(s.getSbstncSpcfctnMoietyIdTypCdgSys());
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdTypCdgUsrSltd() != null) {
			substancespecificationmoietyidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnMoietyIdTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdTypCdgVrsn() != null) {
			substancespecificationmoietyidentifiertypecoding.setVersion(s.getSbstncSpcfctnMoietyIdTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Moiety_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdTypTxt() != null) {
			substancespecificationmoietyidentifiertype.setText(s.getSbstncSpcfctnMoietyIdTypTxt());
		}
		/******************** substancespecificationmoietyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancespecificationmoietyidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancespecificationmoietyidentifier.setUse(substancespecificationmoietyidentifieruse.fromCode(s.getSbstncSpcfctnMoietyIdUse()));

		/******************** SbstncSpcfctn_Moiety_Id_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyIdVl() != null) {
			substancespecificationmoietyidentifier.setValue(s.getSbstncSpcfctnMoietyIdVl());
		}
		/******************** SbstncSpcfctn_Moiety_MoleclrFrmula ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyMoleclrFrmula() != null) {
			substancespecificationmoiety.setMolecularFormula(s.getSbstncSpcfctnMoietyMoleclrFrmula());
		}
		/******************** SbstncSpcfctn_Moiety_Nm ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyNm() != null) {
			substancespecificationmoiety.setName(s.getSbstncSpcfctnMoietyNm());
		}
		/******************** substancespecificationmoietyopticalactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyopticalactivity =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationmoiety.setOpticalActivity(substancespecificationmoietyopticalactivity);

		/******************** substancespecificationmoietyopticalactivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietyopticalactivitycoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationmoietyopticalactivity.addCoding(substancespecificationmoietyopticalactivitycoding);

		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgCd() != null) {
			substancespecificationmoietyopticalactivitycoding.setCode(s.getSbstncSpcfctnMoietyOpticalActvtyCdgCd());
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgDsply() != null) {
			substancespecificationmoietyopticalactivitycoding.setDisplay(s.getSbstncSpcfctnMoietyOpticalActvtyCdgDsply());
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgSys() != null) {
			substancespecificationmoietyopticalactivitycoding.setSystem(s.getSbstncSpcfctnMoietyOpticalActvtyCdgSys());
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd() != null) {
			substancespecificationmoietyopticalactivitycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgVrsn() != null) {
			substancespecificationmoietyopticalactivitycoding.setVersion(s.getSbstncSpcfctnMoietyOpticalActvtyCdgVrsn());
		}
		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyOpticalActvtyTxt() != null) {
			substancespecificationmoietyopticalactivity.setText(s.getSbstncSpcfctnMoietyOpticalActvtyTxt());
		}
		/******************** substancespecificationmoietyrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationmoiety.setRole(substancespecificationmoietyrole);

		/******************** substancespecificationmoietyrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietyrolecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationmoietyrole.addCoding(substancespecificationmoietyrolecoding);

		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyRoleCdgCd() != null) {
			substancespecificationmoietyrolecoding.setCode(s.getSbstncSpcfctnMoietyRoleCdgCd());
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyRoleCdgDsply() != null) {
			substancespecificationmoietyrolecoding.setDisplay(s.getSbstncSpcfctnMoietyRoleCdgDsply());
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyRoleCdgSys() != null) {
			substancespecificationmoietyrolecoding.setSystem(s.getSbstncSpcfctnMoietyRoleCdgSys());
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyRoleCdgUsrSltd() != null) {
			substancespecificationmoietyrolecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnMoietyRoleCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyRoleCdgVrsn() != null) {
			substancespecificationmoietyrolecoding.setVersion(s.getSbstncSpcfctnMoietyRoleCdgVrsn());
		}
		/******************** SbstncSpcfctn_Moiety_Role_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyRoleTxt() != null) {
			substancespecificationmoietyrole.setText(s.getSbstncSpcfctnMoietyRoleTxt());
		}
		/******************** substancespecificationmoietystereochemistry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietystereochemistry =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationmoiety.setStereochemistry(substancespecificationmoietystereochemistry);

		/******************** substancespecificationmoietystereochemistrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmoietystereochemistrycoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationmoietystereochemistry.addCoding(substancespecificationmoietystereochemistrycoding);

		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyStereochemistryCdgCd() != null) {
			substancespecificationmoietystereochemistrycoding.setCode(s.getSbstncSpcfctnMoietyStereochemistryCdgCd());
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyStereochemistryCdgDsply() != null) {
			substancespecificationmoietystereochemistrycoding.setDisplay(s.getSbstncSpcfctnMoietyStereochemistryCdgDsply());
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyStereochemistryCdgSys() != null) {
			substancespecificationmoietystereochemistrycoding.setSystem(s.getSbstncSpcfctnMoietyStereochemistryCdgSys());
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyStereochemistryCdgUsrSltd() != null) {
			substancespecificationmoietystereochemistrycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnMoietyStereochemistryCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyStereochemistryCdgVrsn() != null) {
			substancespecificationmoietystereochemistrycoding.setVersion(s.getSbstncSpcfctnMoietyStereochemistryCdgVrsn());
		}
		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnMoietyStereochemistryTxt() != null) {
			substancespecificationmoietystereochemistry.setText(s.getSbstncSpcfctnMoietyStereochemistryTxt());
		}
		/******************** substancespecificationmolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationmolecularweight =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent();
		substancespecification.addMolecularWeight(substancespecificationmolecularweight);

		/******************** substancespecificationmolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationmolecularweightamount =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationmolecularweight.setAmount(substancespecificationmolecularweightamount);

		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtAmntCd() != null) {
			substancespecificationmolecularweightamount.setCode(s.getSbstncSpcfctnMoleclrWghtAmntCd());
		}
		/******************** substancespecificationmolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationmolecularweightamountcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationmolecularweightamount.setComparator(substancespecificationmolecularweightamountcomparator.fromCode(s.getSbstncSpcfctnMoleclrWghtAmntCmprtr()));

		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtAmntSys() != null) {
			substancespecificationmolecularweightamount.setSystem(s.getSbstncSpcfctnMoleclrWghtAmntSys());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtAmntUnt() != null) {
			substancespecificationmolecularweightamount.setUnit(s.getSbstncSpcfctnMoleclrWghtAmntUnt());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtAmntVl() != null) {
			substancespecificationmolecularweightamount.setValue(Double.parseDouble((s.getSbstncSpcfctnMoleclrWghtAmntVl())));
		}
		/******************** substancespecificationmolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmolecularweightmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationmolecularweight.setMethod(substancespecificationmolecularweightmethod);

		/******************** substancespecificationmolecularweightmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmolecularweightmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationmolecularweightmethod.addCoding(substancespecificationmolecularweightmethodcoding);

		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgCd() != null) {
			substancespecificationmolecularweightmethodcoding.setCode(s.getSbstncSpcfctnMoleclrWghtMthdCdgCd());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgDsply() != null) {
			substancespecificationmolecularweightmethodcoding.setDisplay(s.getSbstncSpcfctnMoleclrWghtMthdCdgDsply());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgSys() != null) {
			substancespecificationmolecularweightmethodcoding.setSystem(s.getSbstncSpcfctnMoleclrWghtMthdCdgSys());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd() != null) {
			substancespecificationmolecularweightmethodcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgVrsn() != null) {
			substancespecificationmolecularweightmethodcoding.setVersion(s.getSbstncSpcfctnMoleclrWghtMthdCdgVrsn());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtMthdTxt() != null) {
			substancespecificationmolecularweightmethod.setText(s.getSbstncSpcfctnMoleclrWghtMthdTxt());
		}
		/******************** substancespecificationmolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmolecularweighttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationmolecularweight.setType(substancespecificationmolecularweighttype);

		/******************** substancespecificationmolecularweighttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationmolecularweighttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationmolecularweighttype.addCoding(substancespecificationmolecularweighttypecoding);

		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtTypCdgCd() != null) {
			substancespecificationmolecularweighttypecoding.setCode(s.getSbstncSpcfctnMoleclrWghtTypCdgCd());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtTypCdgDsply() != null) {
			substancespecificationmolecularweighttypecoding.setDisplay(s.getSbstncSpcfctnMoleclrWghtTypCdgDsply());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtTypCdgSys() != null) {
			substancespecificationmolecularweighttypecoding.setSystem(s.getSbstncSpcfctnMoleclrWghtTypCdgSys());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtTypCdgUsrSltd() != null) {
			substancespecificationmolecularweighttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnMoleclrWghtTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtTypCdgVrsn() != null) {
			substancespecificationmolecularweighttypecoding.setVersion(s.getSbstncSpcfctnMoleclrWghtTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_MoleclrWght_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnMoleclrWghtTypTxt() != null) {
			substancespecificationmolecularweighttype.setText(s.getSbstncSpcfctnMoleclrWghtTypTxt());
		}
		/******************** substancespecificationname ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent substancespecificationname =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent();
		substancespecification.addName(substancespecificationname);

		/******************** substancespecificationnamedomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamedomain =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationname.addDomain(substancespecificationnamedomain);

		/******************** substancespecificationnamedomaincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamedomaincoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnamedomain.addCoding(substancespecificationnamedomaincoding);

		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmDomainCdgCd() != null) {
			substancespecificationnamedomaincoding.setCode(s.getSbstncSpcfctnNmDomainCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmDomainCdgDsply() != null) {
			substancespecificationnamedomaincoding.setDisplay(s.getSbstncSpcfctnNmDomainCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmDomainCdgSys() != null) {
			substancespecificationnamedomaincoding.setSystem(s.getSbstncSpcfctnNmDomainCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmDomainCdgUsrSltd() != null) {
			substancespecificationnamedomaincoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmDomainCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmDomainCdgVrsn() != null) {
			substancespecificationnamedomaincoding.setVersion(s.getSbstncSpcfctnNmDomainCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Domain_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmDomainTxt() != null) {
			substancespecificationnamedomain.setText(s.getSbstncSpcfctnNmDomainTxt());
		}
		/******************** substancespecificationnamejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamejurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationname.addJurisdiction(substancespecificationnamejurisdiction);

		/******************** substancespecificationnamejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamejurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnamejurisdiction.addCoding(substancespecificationnamejurisdictioncoding);

		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmJrsdctnCdgCd() != null) {
			substancespecificationnamejurisdictioncoding.setCode(s.getSbstncSpcfctnNmJrsdctnCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmJrsdctnCdgDsply() != null) {
			substancespecificationnamejurisdictioncoding.setDisplay(s.getSbstncSpcfctnNmJrsdctnCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmJrsdctnCdgSys() != null) {
			substancespecificationnamejurisdictioncoding.setSystem(s.getSbstncSpcfctnNmJrsdctnCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmJrsdctnCdgUsrSltd() != null) {
			substancespecificationnamejurisdictioncoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmJrsdctnCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmJrsdctnCdgVrsn() != null) {
			substancespecificationnamejurisdictioncoding.setVersion(s.getSbstncSpcfctnNmJrsdctnCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Jrsdctn_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmJrsdctnTxt() != null) {
			substancespecificationnamejurisdiction.setText(s.getSbstncSpcfctnNmJrsdctnTxt());
		}
		/******************** substancespecificationnamelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamelanguage =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationname.addLanguage(substancespecificationnamelanguage);

		/******************** substancespecificationnamelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamelanguagecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnamelanguage.addCoding(substancespecificationnamelanguagecoding);

		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmLnguageCdgCd() != null) {
			substancespecificationnamelanguagecoding.setCode(s.getSbstncSpcfctnNmLnguageCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmLnguageCdgDsply() != null) {
			substancespecificationnamelanguagecoding.setDisplay(s.getSbstncSpcfctnNmLnguageCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmLnguageCdgSys() != null) {
			substancespecificationnamelanguagecoding.setSystem(s.getSbstncSpcfctnNmLnguageCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmLnguageCdgUsrSltd() != null) {
			substancespecificationnamelanguagecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmLnguageCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmLnguageCdgVrsn() != null) {
			substancespecificationnamelanguagecoding.setVersion(s.getSbstncSpcfctnNmLnguageCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Lnguage_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmLnguageTxt() != null) {
			substancespecificationnamelanguage.setText(s.getSbstncSpcfctnNmLnguageTxt());
		}
		/******************** SbstncSpcfctn_Nm_Nm ********************************************************************************/
		if(s.getSbstncSpcfctnNmNm() != null) {
			substancespecificationname.setName(s.getSbstncSpcfctnNmNm());
		}
		/******************** substancespecificationnameofficial ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent substancespecificationnameofficial =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent();
		substancespecificationname.addOfficial(substancespecificationnameofficial);

		/******************** substancespecificationnameofficialauthority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnameofficialauthority =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationnameofficial.setAuthority(substancespecificationnameofficialauthority);

		/******************** substancespecificationnameofficialauthoritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnameofficialauthoritycoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnameofficialauthority.addCoding(substancespecificationnameofficialauthoritycoding);

		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialAthrityCdgCd() != null) {
			substancespecificationnameofficialauthoritycoding.setCode(s.getSbstncSpcfctnNmOfficialAthrityCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialAthrityCdgDsply() != null) {
			substancespecificationnameofficialauthoritycoding.setDisplay(s.getSbstncSpcfctnNmOfficialAthrityCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialAthrityCdgSys() != null) {
			substancespecificationnameofficialauthoritycoding.setSystem(s.getSbstncSpcfctnNmOfficialAthrityCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialAthrityCdgUsrSltd() != null) {
			substancespecificationnameofficialauthoritycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmOfficialAthrityCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialAthrityCdgVrsn() != null) {
			substancespecificationnameofficialauthoritycoding.setVersion(s.getSbstncSpcfctnNmOfficialAthrityCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Official_Athrity_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialAthrityTxt() != null) {
			substancespecificationnameofficialauthority.setText(s.getSbstncSpcfctnNmOfficialAthrityTxt());
		}
		/******************** SbstncSpcfctn_Nm_Official_Dt ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialDt() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Nm_Official_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Nm_Official_Dtdate = SbstncSpcfctn_Nm_Official_Dtsdf.parse(s.getSbstncSpcfctnNmOfficialDt());
			substancespecificationnameofficial.setDate(SbstncSpcfctn_Nm_Official_Dtdate);
		}
		/******************** substancespecificationnameofficialstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnameofficialstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationnameofficial.setStatus(substancespecificationnameofficialstatus);

		/******************** substancespecificationnameofficialstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnameofficialstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnameofficialstatus.addCoding(substancespecificationnameofficialstatuscoding);

		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialStsCdgCd() != null) {
			substancespecificationnameofficialstatuscoding.setCode(s.getSbstncSpcfctnNmOfficialStsCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialStsCdgDsply() != null) {
			substancespecificationnameofficialstatuscoding.setDisplay(s.getSbstncSpcfctnNmOfficialStsCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialStsCdgSys() != null) {
			substancespecificationnameofficialstatuscoding.setSystem(s.getSbstncSpcfctnNmOfficialStsCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialStsCdgUsrSltd() != null) {
			substancespecificationnameofficialstatuscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmOfficialStsCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialStsCdgVrsn() != null) {
			substancespecificationnameofficialstatuscoding.setVersion(s.getSbstncSpcfctnNmOfficialStsCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Official_Sts_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmOfficialStsTxt() != null) {
			substancespecificationnameofficialstatus.setText(s.getSbstncSpcfctnNmOfficialStsTxt());
		}
		/******************** SbstncSpcfctn_Nm_Preferred ********************************************************************************/
		if(s.getSbstncSpcfctnNmPreferred() != null) {
			substancespecificationname.setPreferred(Boolean.parseBoolean(s.getSbstncSpcfctnNmPreferred()));
		}
		/******************** SbstncSpcfctn_Nm_Src ********************************************************************************/
		if(s.getSbstncSpcfctnNmSrc() != null) {
			substancespecificationname.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnNmSrc()));
		}
		/******************** substancespecificationnamestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamestatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationname.setStatus(substancespecificationnamestatus);

		/******************** substancespecificationnamestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnamestatuscoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnamestatus.addCoding(substancespecificationnamestatuscoding);

		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmStsCdgCd() != null) {
			substancespecificationnamestatuscoding.setCode(s.getSbstncSpcfctnNmStsCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmStsCdgDsply() != null) {
			substancespecificationnamestatuscoding.setDisplay(s.getSbstncSpcfctnNmStsCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmStsCdgSys() != null) {
			substancespecificationnamestatuscoding.setSystem(s.getSbstncSpcfctnNmStsCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmStsCdgUsrSltd() != null) {
			substancespecificationnamestatuscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmStsCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmStsCdgVrsn() != null) {
			substancespecificationnamestatuscoding.setVersion(s.getSbstncSpcfctnNmStsCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Sts_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmStsTxt() != null) {
			substancespecificationnamestatus.setText(s.getSbstncSpcfctnNmStsTxt());
		}
		/******************** substancespecificationnametype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnametype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationname.setType(substancespecificationnametype);

		/******************** substancespecificationnametypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationnametypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationnametype.addCoding(substancespecificationnametypecoding);

		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnNmTypCdgCd() != null) {
			substancespecificationnametypecoding.setCode(s.getSbstncSpcfctnNmTypCdgCd());
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnNmTypCdgDsply() != null) {
			substancespecificationnametypecoding.setDisplay(s.getSbstncSpcfctnNmTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnNmTypCdgSys() != null) {
			substancespecificationnametypecoding.setSystem(s.getSbstncSpcfctnNmTypCdgSys());
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnNmTypCdgUsrSltd() != null) {
			substancespecificationnametypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnNmTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnNmTypCdgVrsn() != null) {
			substancespecificationnametypecoding.setVersion(s.getSbstncSpcfctnNmTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Nm_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnNmTypTxt() != null) {
			substancespecificationnametype.setText(s.getSbstncSpcfctnNmTypTxt());
		}
		/******************** SbstncSpcfctn_NclicAcid ********************************************************************************/
		if(s.getSbstncSpcfctnNclicAcid() != null) {
			substancespecification.setNucleicAcid( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnNclicAcid()));
		}
		/******************** SbstncSpcfctn_Plymr ********************************************************************************/
		if(s.getSbstncSpcfctnPlymr() != null) {
			substancespecification.setPolymer( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnPlymr()));
		}
		/******************** substancespecificationproperty ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent substancespecificationproperty =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent();
		substancespecification.addProperty(substancespecificationproperty);

		/******************** substancespecificationpropertyamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationpropertyamountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationproperty.setAmount(substancespecificationpropertyamountquantity);

		/******************** SbstncSpcfctn_Prpty_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyAmntQntyCd() != null) {
			substancespecificationpropertyamountquantity.setCode(s.getSbstncSpcfctnPrptyAmntQntyCd());
		}
		/******************** substancespecificationpropertyamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationpropertyamountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationpropertyamountquantity.setComparator(substancespecificationpropertyamountquantitycomparator.fromCode(s.getSbstncSpcfctnPrptyAmntQntyCmprtr()));

		/******************** SbstncSpcfctn_Prpty_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyAmntQntySys() != null) {
			substancespecificationpropertyamountquantity.setSystem(s.getSbstncSpcfctnPrptyAmntQntySys());
		}
		/******************** SbstncSpcfctn_Prpty_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyAmntQntyUnt() != null) {
			substancespecificationpropertyamountquantity.setUnit(s.getSbstncSpcfctnPrptyAmntQntyUnt());
		}
		/******************** SbstncSpcfctn_Prpty_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyAmntQntyVl() != null) {
			substancespecificationpropertyamountquantity.setValue(Double.parseDouble((s.getSbstncSpcfctnPrptyAmntQntyVl())));
		}
		/******************** SbstncSpcfctn_Prpty_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyAmntStrgTyp() != null) {
			substancespecificationproperty.setAmount( new org.hl7.fhir.r4.model.StringType(s.getSbstncSpcfctnPrptyAmntStrgTyp()));
		}
		/******************** substancespecificationpropertycategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertycategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationproperty.setCategory(substancespecificationpropertycategory);

		/******************** substancespecificationpropertycategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationpropertycategorycoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationpropertycategory.addCoding(substancespecificationpropertycategorycoding);

		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCtgryCdgCd() != null) {
			substancespecificationpropertycategorycoding.setCode(s.getSbstncSpcfctnPrptyCtgryCdgCd());
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCtgryCdgDsply() != null) {
			substancespecificationpropertycategorycoding.setDisplay(s.getSbstncSpcfctnPrptyCtgryCdgDsply());
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCtgryCdgSys() != null) {
			substancespecificationpropertycategorycoding.setSystem(s.getSbstncSpcfctnPrptyCtgryCdgSys());
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCtgryCdgUsrSltd() != null) {
			substancespecificationpropertycategorycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnPrptyCtgryCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCtgryCdgVrsn() != null) {
			substancespecificationpropertycategorycoding.setVersion(s.getSbstncSpcfctnPrptyCtgryCdgVrsn());
		}
		/******************** SbstncSpcfctn_Prpty_Ctgry_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCtgryTxt() != null) {
			substancespecificationpropertycategory.setText(s.getSbstncSpcfctnPrptyCtgryTxt());
		}
		/******************** substancespecificationpropertycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertycode =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationproperty.setCode(substancespecificationpropertycode);

		/******************** substancespecificationpropertycodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationpropertycodecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationpropertycode.addCoding(substancespecificationpropertycodecoding);

		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCdCdgCd() != null) {
			substancespecificationpropertycodecoding.setCode(s.getSbstncSpcfctnPrptyCdCdgCd());
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCdCdgDsply() != null) {
			substancespecificationpropertycodecoding.setDisplay(s.getSbstncSpcfctnPrptyCdCdgDsply());
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCdCdgSys() != null) {
			substancespecificationpropertycodecoding.setSystem(s.getSbstncSpcfctnPrptyCdCdgSys());
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCdCdgUsrSltd() != null) {
			substancespecificationpropertycodecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnPrptyCdCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCdCdgVrsn() != null) {
			substancespecificationpropertycodecoding.setVersion(s.getSbstncSpcfctnPrptyCdCdgVrsn());
		}
		/******************** SbstncSpcfctn_Prpty_Cd_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyCdTxt() != null) {
			substancespecificationpropertycode.setText(s.getSbstncSpcfctnPrptyCdTxt());
		}
		/******************** substancespecificationpropertydefiningsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertydefiningsubstancecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationproperty.setDefiningSubstance(substancespecificationpropertydefiningsubstancecodeableconcept);

		/******************** substancespecificationpropertydefiningsubstancecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationpropertydefiningsubstancecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationpropertydefiningsubstancecodeableconcept.addCoding(substancespecificationpropertydefiningsubstancecodeableconceptcoding);

		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd() != null) {
			substancespecificationpropertydefiningsubstancecodeableconceptcoding.setCode(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd());
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply() != null) {
			substancespecificationpropertydefiningsubstancecodeableconceptcoding.setDisplay(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply());
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys() != null) {
			substancespecificationpropertydefiningsubstancecodeableconceptcoding.setSystem(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys());
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd() != null) {
			substancespecificationpropertydefiningsubstancecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn() != null) {
			substancespecificationpropertydefiningsubstancecodeableconceptcoding.setVersion(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn());
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt() != null) {
			substancespecificationpropertydefiningsubstancecodeableconcept.setText(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt());
		}
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncRfrnc ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyDefiningSbstncRfrnc() != null) {
			substancespecificationproperty.setDefiningSubstance( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnPrptyDefiningSbstncRfrnc()));
		}
		/******************** SbstncSpcfctn_Prpty_Prmtrs ********************************************************************************/
		if(s.getSbstncSpcfctnPrptyPrmtrs() != null) {
			substancespecificationproperty.setParameters(s.getSbstncSpcfctnPrptyPrmtrs());
		}
		/******************** SbstncSpcfctn_Protein ********************************************************************************/
		if(s.getSbstncSpcfctnProtein() != null) {
			substancespecification.setProtein( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnProtein()));
		}
		/******************** SbstncSpcfctn_RfrncInfo ********************************************************************************/
		if(s.getSbstncSpcfctnRfrncInfo() != null) {
			substancespecification.setReferenceInformation( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnRfrncInfo()));
		}
		/******************** substancespecificationrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent substancespecificationrelationship =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent();
		substancespecification.addRelationship(substancespecificationrelationship);

		/******************** substancespecificationrelationshipamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountquantity =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationship.setAmount(substancespecificationrelationshipamountquantity);

		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntQntyCd() != null) {
			substancespecificationrelationshipamountquantity.setCode(s.getSbstncSpcfctnRltnshipAmntQntyCd());
		}
		/******************** substancespecificationrelationshipamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountquantity.setComparator(substancespecificationrelationshipamountquantitycomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntQntyCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntQntySys() != null) {
			substancespecificationrelationshipamountquantity.setSystem(s.getSbstncSpcfctnRltnshipAmntQntySys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntQntyUnt() != null) {
			substancespecificationrelationshipamountquantity.setUnit(s.getSbstncSpcfctnRltnshipAmntQntyUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntQntyVl() != null) {
			substancespecificationrelationshipamountquantity.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntQntyVl())));
		}
		/******************** substancespecificationrelationshipamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancespecificationrelationshipamountrange =  new org.hl7.fhir.r4.model.Range();
		substancespecificationrelationship.setAmount(substancespecificationrelationshipamountrange);

		/******************** substancespecificationrelationshipamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationshipamountrange.setHigh(substancespecificationrelationshipamountrangehigh);

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngHiCd() != null) {
			substancespecificationrelationshipamountrangehigh.setCode(s.getSbstncSpcfctnRltnshipAmntRngHiCd());
		}
		/******************** substancespecificationrelationshipamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountrangehigh.setComparator(substancespecificationrelationshipamountrangehighcomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntRngHiCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngHiSys() != null) {
			substancespecificationrelationshipamountrangehigh.setSystem(s.getSbstncSpcfctnRltnshipAmntRngHiSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngHiUnt() != null) {
			substancespecificationrelationshipamountrangehigh.setUnit(s.getSbstncSpcfctnRltnshipAmntRngHiUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngHiVl() != null) {
			substancespecificationrelationshipamountrangehigh.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntRngHiVl())));
		}
		/******************** substancespecificationrelationshipamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrangelow =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationshipamountrange.setLow(substancespecificationrelationshipamountrangelow);

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngLwCd() != null) {
			substancespecificationrelationshipamountrangelow.setCode(s.getSbstncSpcfctnRltnshipAmntRngLwCd());
		}
		/******************** substancespecificationrelationshipamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountrangelow.setComparator(substancespecificationrelationshipamountrangelowcomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntRngLwCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngLwSys() != null) {
			substancespecificationrelationshipamountrangelow.setSystem(s.getSbstncSpcfctnRltnshipAmntRngLwSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngLwUnt() != null) {
			substancespecificationrelationshipamountrangelow.setUnit(s.getSbstncSpcfctnRltnshipAmntRngLwUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRngLwVl() != null) {
			substancespecificationrelationshipamountrangelow.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntRngLwVl())));
		}
		/******************** substancespecificationrelationshipamountratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substancespecificationrelationshipamountratio =  new org.hl7.fhir.r4.model.Ratio();
		substancespecificationrelationship.setAmount(substancespecificationrelationshipamountratio);

		/******************** substancespecificationrelationshipamountratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationshipamountratio.setDenominator(substancespecificationrelationshipamountratiodenominator);

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCd() != null) {
			substancespecificationrelationshipamountratiodenominator.setCode(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCd());
		}
		/******************** substancespecificationrelationshipamountratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountratiodenominator.setComparator(substancespecificationrelationshipamountratiodenominatorcomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrSys() != null) {
			substancespecificationrelationshipamountratiodenominator.setSystem(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrUnt() != null) {
			substancespecificationrelationshipamountratiodenominator.setUnit(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrVl() != null) {
			substancespecificationrelationshipamountratiodenominator.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntRtioDnmntrVl())));
		}
		/******************** substancespecificationrelationshipamountrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrationumerator =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationshipamountratio.setNumerator(substancespecificationrelationshipamountrationumerator);

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCd() != null) {
			substancespecificationrelationshipamountrationumerator.setCode(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCd());
		}
		/******************** substancespecificationrelationshipamountrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountrationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountrationumerator.setComparator(substancespecificationrelationshipamountrationumeratorcomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrSys() != null) {
			substancespecificationrelationshipamountrationumerator.setSystem(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrUnt() != null) {
			substancespecificationrelationshipamountrationumerator.setUnit(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrVl() != null) {
			substancespecificationrelationshipamountrationumerator.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntRtioNmrtrVl())));
		}
		/******************** substancespecificationrelationshipamountratiolowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substancespecificationrelationshipamountratiolowlimit =  new org.hl7.fhir.r4.model.Ratio();
		substancespecificationrelationship.setAmountRatioLowLimit(substancespecificationrelationshipamountratiolowlimit);

		/******************** substancespecificationrelationshipamountratiolowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiolowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationshipamountratiolowlimit.setDenominator(substancespecificationrelationshipamountratiolowlimitdenominator);

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd() != null) {
			substancespecificationrelationshipamountratiolowlimitdenominator.setCode(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd());
		}
		/******************** substancespecificationrelationshipamountratiolowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountratiolowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountratiolowlimitdenominator.setComparator(substancespecificationrelationshipamountratiolowlimitdenominatorcomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys() != null) {
			substancespecificationrelationshipamountratiolowlimitdenominator.setSystem(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt() != null) {
			substancespecificationrelationshipamountratiolowlimitdenominator.setUnit(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl() != null) {
			substancespecificationrelationshipamountratiolowlimitdenominator.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl())));
		}
		/******************** substancespecificationrelationshipamountratiolowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiolowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationrelationshipamountratiolowlimit.setNumerator(substancespecificationrelationshipamountratiolowlimitnumerator);

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd() != null) {
			substancespecificationrelationshipamountratiolowlimitnumerator.setCode(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd());
		}
		/******************** substancespecificationrelationshipamountratiolowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationrelationshipamountratiolowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationrelationshipamountratiolowlimitnumerator.setComparator(substancespecificationrelationshipamountratiolowlimitnumeratorcomparator.fromCode(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr()));

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys() != null) {
			substancespecificationrelationshipamountratiolowlimitnumerator.setSystem(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt() != null) {
			substancespecificationrelationshipamountratiolowlimitnumerator.setUnit(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl() != null) {
			substancespecificationrelationshipamountratiolowlimitnumerator.setValue(Double.parseDouble((s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl())));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntStrgTyp() != null) {
			substancespecificationrelationship.setAmount(new StringType(s.getSbstncSpcfctnRltnshipAmntStrgTyp()));
		}
		/******************** substancespecificationrelationshipamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshipamounttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationrelationship.setAmountType(substancespecificationrelationshipamounttype);

		/******************** substancespecificationrelationshipamounttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationrelationshipamounttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationrelationshipamounttype.addCoding(substancespecificationrelationshipamounttypecoding);

		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntTypCdgCd() != null) {
			substancespecificationrelationshipamounttypecoding.setCode(s.getSbstncSpcfctnRltnshipAmntTypCdgCd());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntTypCdgDsply() != null) {
			substancespecificationrelationshipamounttypecoding.setDisplay(s.getSbstncSpcfctnRltnshipAmntTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntTypCdgSys() != null) {
			substancespecificationrelationshipamounttypecoding.setSystem(s.getSbstncSpcfctnRltnshipAmntTypCdgSys());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntTypCdgUsrSltd() != null) {
			substancespecificationrelationshipamounttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnRltnshipAmntTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntTypCdgVrsn() != null) {
			substancespecificationrelationshipamounttypecoding.setVersion(s.getSbstncSpcfctnRltnshipAmntTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipAmntTypTxt() != null) {
			substancespecificationrelationshipamounttype.setText(s.getSbstncSpcfctnRltnshipAmntTypTxt());
		}
		/******************** SbstncSpcfctn_Rltnship_IsDefining ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipIsDefining() != null) {
			substancespecificationrelationship.setIsDefining(Boolean.parseBoolean(s.getSbstncSpcfctnRltnshipIsDefining()));
		}
		/******************** substancespecificationrelationshiprelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshiprelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationrelationship.setRelationship(substancespecificationrelationshiprelationship);

		/******************** substancespecificationrelationshiprelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationrelationshiprelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationrelationshiprelationship.addCoding(substancespecificationrelationshiprelationshipcoding);

		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipRltnshipCdgCd() != null) {
			substancespecificationrelationshiprelationshipcoding.setCode(s.getSbstncSpcfctnRltnshipRltnshipCdgCd());
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipRltnshipCdgDsply() != null) {
			substancespecificationrelationshiprelationshipcoding.setDisplay(s.getSbstncSpcfctnRltnshipRltnshipCdgDsply());
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipRltnshipCdgSys() != null) {
			substancespecificationrelationshiprelationshipcoding.setSystem(s.getSbstncSpcfctnRltnshipRltnshipCdgSys());
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipRltnshipCdgUsrSltd() != null) {
			substancespecificationrelationshiprelationshipcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnRltnshipRltnshipCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipRltnshipCdgVrsn() != null) {
			substancespecificationrelationshiprelationshipcoding.setVersion(s.getSbstncSpcfctnRltnshipRltnshipCdgVrsn());
		}
		/******************** SbstncSpcfctn_Rltnship_Rltnship_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipRltnshipTxt() != null) {
			substancespecificationrelationshiprelationship.setText(s.getSbstncSpcfctnRltnshipRltnshipTxt());
		}
		/******************** SbstncSpcfctn_Rltnship_Src ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSrc() != null) {
			substancespecificationrelationship.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnRltnshipSrc()));
		}
		/******************** substancespecificationrelationshipsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshipsubstancecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationrelationship.setSubstance(substancespecificationrelationshipsubstancecodeableconcept);

		/******************** substancespecificationrelationshipsubstancecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationrelationshipsubstancecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationrelationshipsubstancecodeableconcept.addCoding(substancespecificationrelationshipsubstancecodeableconceptcoding);

		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd() != null) {
			substancespecificationrelationshipsubstancecodeableconceptcoding.setCode(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd());
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply() != null) {
			substancespecificationrelationshipsubstancecodeableconceptcoding.setDisplay(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply());
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys() != null) {
			substancespecificationrelationshipsubstancecodeableconceptcoding.setSystem(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys());
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd() != null) {
			substancespecificationrelationshipsubstancecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn() != null) {
			substancespecificationrelationshipsubstancecodeableconceptcoding.setVersion(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn());
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptTxt() != null) {
			substancespecificationrelationshipsubstancecodeableconcept.setText(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptTxt());
		}
		/******************** SbstncSpcfctn_Rltnship_SbstncRfrnc ********************************************************************************/
		if(s.getSbstncSpcfctnRltnshipSbstncRfrnc() != null) {
			substancespecificationrelationship.setSubstance( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnRltnshipSbstncRfrnc()));
		}
		/******************** SbstncSpcfctn_Src ********************************************************************************/
		if(s.getSbstncSpcfctnSrc() != null) {
			substancespecification.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnSrc()));
		}
		/******************** SbstncSpcfctn_SrcMtrl ********************************************************************************/
		if(s.getSbstncSpcfctnSrcMtrl() != null) {
			substancespecification.setSourceMaterial( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnSrcMtrl()));
		}
		/******************** substancespecificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecification.setStatus(substancespecificationstatus);

		/******************** substancespecificationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstatus.addCoding(substancespecificationstatuscoding);

		/******************** SbstncSpcfctn_Sts_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStsCdgCd() != null) {
			substancespecificationstatuscoding.setCode(s.getSbstncSpcfctnStsCdgCd());
		}
		/******************** SbstncSpcfctn_Sts_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStsCdgDsply() != null) {
			substancespecificationstatuscoding.setDisplay(s.getSbstncSpcfctnStsCdgDsply());
		}
		/******************** SbstncSpcfctn_Sts_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStsCdgSys() != null) {
			substancespecificationstatuscoding.setSystem(s.getSbstncSpcfctnStsCdgSys());
		}
		/******************** SbstncSpcfctn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStsCdgUsrSltd() != null) {
			substancespecificationstatuscoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStsCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Sts_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStsCdgVrsn() != null) {
			substancespecificationstatuscoding.setVersion(s.getSbstncSpcfctnStsCdgVrsn());
		}
		/******************** SbstncSpcfctn_Sts_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStsTxt() != null) {
			substancespecificationstatus.setText(s.getSbstncSpcfctnStsTxt());
		}
		/******************** substancespecificationstructure ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent substancespecificationstructure =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent();
		substancespecification.setStructure(substancespecificationstructure);

		/******************** substancespecificationstructureisotope ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent substancespecificationstructureisotope =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent();
		substancespecificationstructure.addIsotope(substancespecificationstructureisotope);

		/******************** substancespecificationstructureisotopehalflife ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructureisotopehalflife =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationstructureisotope.setHalfLife(substancespecificationstructureisotopehalflife);

		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeCd() != null) {
			substancespecificationstructureisotopehalflife.setCode(s.getSbstncSpcfctnStrctrIsotopeHalfLifeCd());
		}
		/******************** substancespecificationstructureisotopehalflifecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationstructureisotopehalflifecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationstructureisotopehalflife.setComparator(substancespecificationstructureisotopehalflifecomparator.fromCode(s.getSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr()));

		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeSys() != null) {
			substancespecificationstructureisotopehalflife.setSystem(s.getSbstncSpcfctnStrctrIsotopeHalfLifeSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeUnt() != null) {
			substancespecificationstructureisotopehalflife.setUnit(s.getSbstncSpcfctnStrctrIsotopeHalfLifeUnt());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeVl() != null) {
			substancespecificationstructureisotopehalflife.setValue(Double.parseDouble((s.getSbstncSpcfctnStrctrIsotopeHalfLifeVl())));
		}
		/******************** substancespecificationstructureisotopeidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationstructureisotopeidentifier =  new org.hl7.fhir.r4.model.Identifier();
		substancespecificationstructureisotope.setIdentifier(substancespecificationstructureisotopeidentifier);

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Assigner ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdAssigner() != null) {
			substancespecificationstructureisotopeidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnStrctrIsotopeIdAssigner()));
		}
		/******************** substancespecificationstructureisotopeidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationstructureisotopeidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substancespecificationstructureisotopeidentifier.setPeriod(substancespecificationstructureisotopeidentifierperiod);

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_End ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Strctr_Isotope_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Strctr_Isotope_Id_Prd_Enddate = SbstncSpcfctn_Strctr_Isotope_Id_Prd_Endsdf.parse(s.getSbstncSpcfctnStrctrIsotopeIdPrdEnd());
			substancespecificationstructureisotopeidentifierperiod.setEnd(SbstncSpcfctn_Strctr_Isotope_Id_Prd_Enddate);
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strtdate = SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strtsdf.parse(s.getSbstncSpcfctnStrctrIsotopeIdPrdStrt());
			substancespecificationstructureisotopeidentifierperiod.setStart(SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strtdate);
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdSys() != null) {
			substancespecificationstructureisotopeidentifier.setSystem(s.getSbstncSpcfctnStrctrIsotopeIdSys());
		}
		/******************** substancespecificationstructureisotopeidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopeidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructureisotopeidentifier.setType(substancespecificationstructureisotopeidentifiertype);

		/******************** substancespecificationstructureisotopeidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopeidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructureisotopeidentifiertype.addCoding(substancespecificationstructureisotopeidentifiertypecoding);

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgCd() != null) {
			substancespecificationstructureisotopeidentifiertypecoding.setCode(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgDsply() != null) {
			substancespecificationstructureisotopeidentifiertypecoding.setDisplay(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgSys() != null) {
			substancespecificationstructureisotopeidentifiertypecoding.setSystem(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd() != null) {
			substancespecificationstructureisotopeidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn() != null) {
			substancespecificationstructureisotopeidentifiertypecoding.setVersion(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdTypTxt() != null) {
			substancespecificationstructureisotopeidentifiertype.setText(s.getSbstncSpcfctnStrctrIsotopeIdTypTxt());
		}
		/******************** substancespecificationstructureisotopeidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancespecificationstructureisotopeidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancespecificationstructureisotopeidentifier.setUse(substancespecificationstructureisotopeidentifieruse.fromCode(s.getSbstncSpcfctnStrctrIsotopeIdUse()));

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeIdVl() != null) {
			substancespecificationstructureisotopeidentifier.setValue(s.getSbstncSpcfctnStrctrIsotopeIdVl());
		}
		/******************** substancespecificationstructureisotopemolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationstructureisotopemolecularweight =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent();
		substancespecificationstructureisotope.setMolecularWeight(substancespecificationstructureisotopemolecularweight);

		/******************** substancespecificationstructureisotopemolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructureisotopemolecularweightamount =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationstructureisotopemolecularweight.setAmount(substancespecificationstructureisotopemolecularweightamount);

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd() != null) {
			substancespecificationstructureisotopemolecularweightamount.setCode(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd());
		}
		/******************** substancespecificationstructureisotopemolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationstructureisotopemolecularweightamountcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationstructureisotopemolecularweightamount.setComparator(substancespecificationstructureisotopemolecularweightamountcomparator.fromCode(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr()));

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys() != null) {
			substancespecificationstructureisotopemolecularweightamount.setSystem(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt() != null) {
			substancespecificationstructureisotopemolecularweightamount.setUnit(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl() != null) {
			substancespecificationstructureisotopemolecularweightamount.setValue(Double.parseDouble((s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl())));
		}
		/******************** substancespecificationstructureisotopemolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopemolecularweightmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructureisotopemolecularweight.setMethod(substancespecificationstructureisotopemolecularweightmethod);

		/******************** substancespecificationstructureisotopemolecularweightmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopemolecularweightmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructureisotopemolecularweightmethod.addCoding(substancespecificationstructureisotopemolecularweightmethodcoding);

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd() != null) {
			substancespecificationstructureisotopemolecularweightmethodcoding.setCode(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply() != null) {
			substancespecificationstructureisotopemolecularweightmethodcoding.setDisplay(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys() != null) {
			substancespecificationstructureisotopemolecularweightmethodcoding.setSystem(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd() != null) {
			substancespecificationstructureisotopemolecularweightmethodcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn() != null) {
			substancespecificationstructureisotopemolecularweightmethodcoding.setVersion(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt() != null) {
			substancespecificationstructureisotopemolecularweightmethod.setText(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt());
		}
		/******************** substancespecificationstructureisotopemolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopemolecularweighttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructureisotopemolecularweight.setType(substancespecificationstructureisotopemolecularweighttype);

		/******************** substancespecificationstructureisotopemolecularweighttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopemolecularweighttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructureisotopemolecularweighttype.addCoding(substancespecificationstructureisotopemolecularweighttypecoding);

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd() != null) {
			substancespecificationstructureisotopemolecularweighttypecoding.setCode(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply() != null) {
			substancespecificationstructureisotopemolecularweighttypecoding.setDisplay(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys() != null) {
			substancespecificationstructureisotopemolecularweighttypecoding.setSystem(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd() != null) {
			substancespecificationstructureisotopemolecularweighttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn() != null) {
			substancespecificationstructureisotopemolecularweighttypecoding.setVersion(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt() != null) {
			substancespecificationstructureisotopemolecularweighttype.setText(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt());
		}
		/******************** substancespecificationstructureisotopename ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopename =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructureisotope.setName(substancespecificationstructureisotopename);

		/******************** substancespecificationstructureisotopenamecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopenamecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructureisotopename.addCoding(substancespecificationstructureisotopenamecoding);

		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgCd() != null) {
			substancespecificationstructureisotopenamecoding.setCode(s.getSbstncSpcfctnStrctrIsotopeNmCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgDsply() != null) {
			substancespecificationstructureisotopenamecoding.setDisplay(s.getSbstncSpcfctnStrctrIsotopeNmCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgSys() != null) {
			substancespecificationstructureisotopenamecoding.setSystem(s.getSbstncSpcfctnStrctrIsotopeNmCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd() != null) {
			substancespecificationstructureisotopenamecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgVrsn() != null) {
			substancespecificationstructureisotopenamecoding.setVersion(s.getSbstncSpcfctnStrctrIsotopeNmCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeNmTxt() != null) {
			substancespecificationstructureisotopename.setText(s.getSbstncSpcfctnStrctrIsotopeNmTxt());
		}
		/******************** substancespecificationstructureisotopesubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopesubstitution =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructureisotope.setSubstitution(substancespecificationstructureisotopesubstitution);

		/******************** substancespecificationstructureisotopesubstitutioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureisotopesubstitutioncoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructureisotopesubstitution.addCoding(substancespecificationstructureisotopesubstitutioncoding);

		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd() != null) {
			substancespecificationstructureisotopesubstitutioncoding.setCode(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply() != null) {
			substancespecificationstructureisotopesubstitutioncoding.setDisplay(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys() != null) {
			substancespecificationstructureisotopesubstitutioncoding.setSystem(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd() != null) {
			substancespecificationstructureisotopesubstitutioncoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn() != null) {
			substancespecificationstructureisotopesubstitutioncoding.setVersion(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionTxt() != null) {
			substancespecificationstructureisotopesubstitution.setText(s.getSbstncSpcfctnStrctrIsotopeSubstitutionTxt());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrFrmula ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrFrmula() != null) {
			substancespecificationstructure.setMolecularFormula(s.getSbstncSpcfctnStrctrMoleclrFrmula());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrFrmulaByMoiety ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrFrmulaByMoiety() != null) {
			substancespecificationstructure.setMolecularFormulaByMoiety(s.getSbstncSpcfctnStrctrMoleclrFrmulaByMoiety());
		}
		/******************** substancespecificationstructuremolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationstructuremolecularweight =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent();
		substancespecificationstructure.setMolecularWeight(substancespecificationstructuremolecularweight);

		/******************** substancespecificationstructuremolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructuremolecularweightamount =  new org.hl7.fhir.r4.model.Quantity();
		substancespecificationstructuremolecularweight.setAmount(substancespecificationstructuremolecularweightamount);

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCd() != null) {
			substancespecificationstructuremolecularweightamount.setCode(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCd());
		}
		/******************** substancespecificationstructuremolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substancespecificationstructuremolecularweightamountcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substancespecificationstructuremolecularweightamount.setComparator(substancespecificationstructuremolecularweightamountcomparator.fromCode(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr()));

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntSys() != null) {
			substancespecificationstructuremolecularweightamount.setSystem(s.getSbstncSpcfctnStrctrMoleclrWghtAmntSys());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntUnt() != null) {
			substancespecificationstructuremolecularweightamount.setUnit(s.getSbstncSpcfctnStrctrMoleclrWghtAmntUnt());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntVl() != null) {
			substancespecificationstructuremolecularweightamount.setValue(Double.parseDouble((s.getSbstncSpcfctnStrctrMoleclrWghtAmntVl())));
		}
		/******************** substancespecificationstructuremolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructuremolecularweightmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructuremolecularweight.setMethod(substancespecificationstructuremolecularweightmethod);

		/******************** substancespecificationstructuremolecularweightmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructuremolecularweightmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructuremolecularweightmethod.addCoding(substancespecificationstructuremolecularweightmethodcoding);

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd() != null) {
			substancespecificationstructuremolecularweightmethodcoding.setCode(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply() != null) {
			substancespecificationstructuremolecularweightmethodcoding.setDisplay(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys() != null) {
			substancespecificationstructuremolecularweightmethodcoding.setSystem(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd() != null) {
			substancespecificationstructuremolecularweightmethodcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn() != null) {
			substancespecificationstructuremolecularweightmethodcoding.setVersion(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdTxt() != null) {
			substancespecificationstructuremolecularweightmethod.setText(s.getSbstncSpcfctnStrctrMoleclrWghtMthdTxt());
		}
		/******************** substancespecificationstructuremolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructuremolecularweighttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructuremolecularweight.setType(substancespecificationstructuremolecularweighttype);

		/******************** substancespecificationstructuremolecularweighttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructuremolecularweighttypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructuremolecularweighttype.addCoding(substancespecificationstructuremolecularweighttypecoding);

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgCd() != null) {
			substancespecificationstructuremolecularweighttypecoding.setCode(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply() != null) {
			substancespecificationstructuremolecularweighttypecoding.setDisplay(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgSys() != null) {
			substancespecificationstructuremolecularweighttypecoding.setSystem(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd() != null) {
			substancespecificationstructuremolecularweighttypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn() != null) {
			substancespecificationstructuremolecularweighttypecoding.setVersion(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypTxt() != null) {
			substancespecificationstructuremolecularweighttype.setText(s.getSbstncSpcfctnStrctrMoleclrWghtTypTxt());
		}
		/******************** substancespecificationstructureopticalactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureopticalactivity =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructure.setOpticalActivity(substancespecificationstructureopticalactivity);

		/******************** substancespecificationstructureopticalactivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructureopticalactivitycoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructureopticalactivity.addCoding(substancespecificationstructureopticalactivitycoding);

		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgCd() != null) {
			substancespecificationstructureopticalactivitycoding.setCode(s.getSbstncSpcfctnStrctrOpticalActvtyCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgDsply() != null) {
			substancespecificationstructureopticalactivitycoding.setDisplay(s.getSbstncSpcfctnStrctrOpticalActvtyCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgSys() != null) {
			substancespecificationstructureopticalactivitycoding.setSystem(s.getSbstncSpcfctnStrctrOpticalActvtyCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd() != null) {
			substancespecificationstructureopticalactivitycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgVrsn() != null) {
			substancespecificationstructureopticalactivitycoding.setVersion(s.getSbstncSpcfctnStrctrOpticalActvtyCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrOpticalActvtyTxt() != null) {
			substancespecificationstructureopticalactivity.setText(s.getSbstncSpcfctnStrctrOpticalActvtyTxt());
		}
		/******************** substancespecificationstructurerepresentation ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent substancespecificationstructurerepresentation =  new org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent();
		substancespecificationstructure.addRepresentation(substancespecificationstructurerepresentation);

		/******************** substancespecificationstructurerepresentationattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancespecificationstructurerepresentationattachment =  new org.hl7.fhir.r4.model.Attachment();
		substancespecificationstructurerepresentation.setAttachment(substancespecificationstructurerepresentationattachment);

		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp() != null) {
			substancespecificationstructurerepresentationattachment.setContentType(s.getSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Creation ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntCreation() != null) {
			java.text.SimpleDateFormat SbstncSpcfctn_Strctr_Representation_Attchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncSpcfctn_Strctr_Representation_Attchmnt_Creationdate = SbstncSpcfctn_Strctr_Representation_Attchmnt_Creationsdf.parse(s.getSbstncSpcfctnStrctrRepresentationAttchmntCreation());
			substancespecificationstructurerepresentationattachment.setCreation(SbstncSpcfctn_Strctr_Representation_Attchmnt_Creationdate);
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Data ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntData() != null) {
			substancespecificationstructurerepresentationattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncSpcfctnStrctrRepresentationAttchmntData()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Hash ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntHash() != null) {
			substancespecificationstructurerepresentationattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncSpcfctnStrctrRepresentationAttchmntHash()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntLnguage() != null) {
			substancespecificationstructurerepresentationattachment.setLanguage(s.getSbstncSpcfctnStrctrRepresentationAttchmntLnguage());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Sz ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntSz() != null) {
			substancespecificationstructurerepresentationattachment.setSize(Integer.parseInt(s.getSbstncSpcfctnStrctrRepresentationAttchmntSz()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Ttl ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntTtl() != null) {
			substancespecificationstructurerepresentationattachment.setTitle(s.getSbstncSpcfctnStrctrRepresentationAttchmntTtl());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Url ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntUrl() != null) {
			substancespecificationstructurerepresentationattachment.setUrl(s.getSbstncSpcfctnStrctrRepresentationAttchmntUrl());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Representation ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationRepresentation() != null) {
			substancespecificationstructurerepresentation.setRepresentation(s.getSbstncSpcfctnStrctrRepresentationRepresentation());
		}
		/******************** substancespecificationstructurerepresentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructurerepresentationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructurerepresentation.setType(substancespecificationstructurerepresentationtype);

		/******************** substancespecificationstructurerepresentationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructurerepresentationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructurerepresentationtype.addCoding(substancespecificationstructurerepresentationtypecoding);

		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgCd() != null) {
			substancespecificationstructurerepresentationtypecoding.setCode(s.getSbstncSpcfctnStrctrRepresentationTypCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgDsply() != null) {
			substancespecificationstructurerepresentationtypecoding.setDisplay(s.getSbstncSpcfctnStrctrRepresentationTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgSys() != null) {
			substancespecificationstructurerepresentationtypecoding.setSystem(s.getSbstncSpcfctnStrctrRepresentationTypCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd() != null) {
			substancespecificationstructurerepresentationtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgVrsn() != null) {
			substancespecificationstructurerepresentationtypecoding.setVersion(s.getSbstncSpcfctnStrctrRepresentationTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrRepresentationTypTxt() != null) {
			substancespecificationstructurerepresentationtype.setText(s.getSbstncSpcfctnStrctrRepresentationTypTxt());
		}
		/******************** SbstncSpcfctn_Strctr_Src ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrSrc() != null) {
			substancespecificationstructure.addSource( new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnStrctrSrc()));
		}
		/******************** substancespecificationstructurestereochemistry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructurestereochemistry =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecificationstructure.setStereochemistry(substancespecificationstructurestereochemistry);

		/******************** substancespecificationstructurestereochemistrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationstructurestereochemistrycoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationstructurestereochemistry.addCoding(substancespecificationstructurestereochemistrycoding);

		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrStereochemistryCdgCd() != null) {
			substancespecificationstructurestereochemistrycoding.setCode(s.getSbstncSpcfctnStrctrStereochemistryCdgCd());
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrStereochemistryCdgDsply() != null) {
			substancespecificationstructurestereochemistrycoding.setDisplay(s.getSbstncSpcfctnStrctrStereochemistryCdgDsply());
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrStereochemistryCdgSys() != null) {
			substancespecificationstructurestereochemistrycoding.setSystem(s.getSbstncSpcfctnStrctrStereochemistryCdgSys());
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrStereochemistryCdgUsrSltd() != null) {
			substancespecificationstructurestereochemistrycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnStrctrStereochemistryCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrStereochemistryCdgVrsn() != null) {
			substancespecificationstructurestereochemistrycoding.setVersion(s.getSbstncSpcfctnStrctrStereochemistryCdgVrsn());
		}
		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnStrctrStereochemistryTxt() != null) {
			substancespecificationstructurestereochemistry.setText(s.getSbstncSpcfctnStrctrStereochemistryTxt());
		}
		/******************** substancespecificationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancespecification.setType(substancespecificationtype);

		/******************** substancespecificationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancespecificationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancespecificationtype.addCoding(substancespecificationtypecoding);

		/******************** SbstncSpcfctn_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSpcfctnTypCdgCd() != null) {
			substancespecificationtypecoding.setCode(s.getSbstncSpcfctnTypCdgCd());
		}
		/******************** SbstncSpcfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSpcfctnTypCdgDsply() != null) {
			substancespecificationtypecoding.setDisplay(s.getSbstncSpcfctnTypCdgDsply());
		}
		/******************** SbstncSpcfctn_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSpcfctnTypCdgSys() != null) {
			substancespecificationtypecoding.setSystem(s.getSbstncSpcfctnTypCdgSys());
		}
		/******************** SbstncSpcfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSpcfctnTypCdgUsrSltd() != null) {
			substancespecificationtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncSpcfctnTypCdgUsrSltd()));
		}
		/******************** SbstncSpcfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSpcfctnTypCdgVrsn() != null) {
			substancespecificationtypecoding.setVersion(s.getSbstncSpcfctnTypCdgVrsn());
		}
		/******************** SbstncSpcfctn_Typ_Txt ********************************************************************************/
		if(s.getSbstncSpcfctnTypTxt() != null) {
			substancespecificationtype.setText(s.getSbstncSpcfctnTypTxt());
		}
		return substancespecification;
	}
}
