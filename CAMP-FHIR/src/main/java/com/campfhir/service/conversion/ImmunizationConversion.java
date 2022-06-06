package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Immunization;
public class ImmunizationConversion 
{
	public org.hl7.fhir.r4.model.Immunization Immunizations(Immunization i) throws ParseException
	{
		org.hl7.fhir.r4.model.Immunization immunization = new org.hl7.fhir.r4.model.Immunization();

		/******************** id ********************************************************************************/
		immunization.setId(i.getId());

		/******************** immunizationdosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity immunizationdosequantity =  new org.hl7.fhir.r4.model.Quantity();
		immunization.setDoseQuantity(immunizationdosequantity);

		/******************** Immnztn_DoseQnty_Cd ********************************************************************************/
		if(i.getImmnztnDoseQntyCd() != null) {
			immunizationdosequantity.setCode(i.getImmnztnDoseQntyCd());
		}
		/******************** immunizationdosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory immunizationdosequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		immunizationdosequantity.setComparator(immunizationdosequantitycomparator.fromCode(i.getImmnztnDoseQntyCmprtr()));

		/******************** Immnztn_DoseQnty_Sys ********************************************************************************/
		if(i.getImmnztnDoseQntySys() != null) {
			immunizationdosequantity.setSystem(i.getImmnztnDoseQntySys());
		}
		/******************** Immnztn_DoseQnty_Unt ********************************************************************************/
		if(i.getImmnztnDoseQntyUnt() != null) {
			immunizationdosequantity.setUnit(i.getImmnztnDoseQntyUnt());
		}
		/******************** Immnztn_DoseQnty_Vl ********************************************************************************/
		if(i.getImmnztnDoseQntyVl() != null) {
			immunizationdosequantity.setValue(Double.parseDouble((i.getImmnztnDoseQntyVl())));
		}
		/******************** immunizationeducation ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent immunizationeducation =  new org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent();
		immunization.addEducation(immunizationeducation);

		/******************** Immnztn_Education_DocTyp ********************************************************************************/
		if(i.getImmnztnEducationDocTyp() != null) {
			immunizationeducation.setDocumentType(i.getImmnztnEducationDocTyp());
		}
		/******************** Immnztn_Education_PrsnttnDt ********************************************************************************/
		if(i.getImmnztnEducationPrsnttnDt() != null) {
			java.text.SimpleDateFormat Immnztn_Education_PrsnttnDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Education_PrsnttnDtdate = Immnztn_Education_PrsnttnDtsdf.parse(i.getImmnztnEducationPrsnttnDt());
			immunizationeducation.setPresentationDate(Immnztn_Education_PrsnttnDtdate);
		}
		/******************** Immnztn_Education_PublicationDt ********************************************************************************/
		if(i.getImmnztnEducationPublicationDt() != null) {
			java.text.SimpleDateFormat Immnztn_Education_PublicationDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Education_PublicationDtdate = Immnztn_Education_PublicationDtsdf.parse(i.getImmnztnEducationPublicationDt());
			immunizationeducation.setPublicationDate(Immnztn_Education_PublicationDtdate);
		}
		/******************** Immnztn_Education_Rfrnc ********************************************************************************/
		if(i.getImmnztnEducationRfrnc() != null) {
			immunizationeducation.setReference(i.getImmnztnEducationRfrnc());
		}
		/******************** Immnztn_Enc ********************************************************************************/
		if(i.getImmnztnEnc() != null) {
			immunization.setEncounter( new org.hl7.fhir.r4.model.Reference(i.getImmnztnEnc()));
		}
		/******************** Immnztn_ExpirationDt ********************************************************************************/
		if(i.getImmnztnExpirationDt() != null) {
			java.text.SimpleDateFormat Immnztn_ExpirationDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_ExpirationDtdate = Immnztn_ExpirationDtsdf.parse(i.getImmnztnExpirationDt());
			immunization.setExpirationDate(Immnztn_ExpirationDtdate);
		}
		/******************** immunizationfundingsource ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationfundingsource =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.setFundingSource(immunizationfundingsource);

		/******************** immunizationfundingsourcecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationfundingsourcecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationfundingsource.addCoding(immunizationfundingsourcecoding);

		/******************** Immnztn_FundingSrc_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgCd() != null) {
			immunizationfundingsourcecoding.setCode(i.getImmnztnFundingSrcCdgCd());
		}
		/******************** Immnztn_FundingSrc_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgDsply() != null) {
			immunizationfundingsourcecoding.setDisplay(i.getImmnztnFundingSrcCdgDsply());
		}
		/******************** Immnztn_FundingSrc_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgSys() != null) {
			immunizationfundingsourcecoding.setSystem(i.getImmnztnFundingSrcCdgSys());
		}
		/******************** Immnztn_FundingSrc_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgUsrSltd() != null) {
			immunizationfundingsourcecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnFundingSrcCdgUsrSltd()));
		}
		/******************** Immnztn_FundingSrc_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgVrsn() != null) {
			immunizationfundingsourcecoding.setVersion(i.getImmnztnFundingSrcCdgVrsn());
		}
		/******************** Immnztn_FundingSrc_Txt ********************************************************************************/
		if(i.getImmnztnFundingSrcTxt() != null) {
			immunizationfundingsource.setText(i.getImmnztnFundingSrcTxt());
		}
		/******************** immunizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier immunizationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		immunization.addIdentifier(immunizationidentifier);

		/******************** Immnztn_Id_Assigner ********************************************************************************/
		if(i.getImmnztnIdAssigner() != null) {
			immunizationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getImmnztnIdAssigner()));
		}
		/******************** immunizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		immunizationidentifier.setPeriod(immunizationidentifierperiod);

		/******************** Immnztn_Id_Prd_End ********************************************************************************/
		if(i.getImmnztnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Immnztn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Id_Prd_Enddate = Immnztn_Id_Prd_Endsdf.parse(i.getImmnztnIdPrdEnd());
			immunizationidentifierperiod.setEnd(Immnztn_Id_Prd_Enddate);
		}
		/******************** Immnztn_Id_Prd_Strt ********************************************************************************/
		if(i.getImmnztnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Immnztn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Id_Prd_Strtdate = Immnztn_Id_Prd_Strtsdf.parse(i.getImmnztnIdPrdStrt());
			immunizationidentifierperiod.setStart(Immnztn_Id_Prd_Strtdate);
		}
		/******************** Immnztn_Id_Sys ********************************************************************************/
		if(i.getImmnztnIdSys() != null) {
			immunizationidentifier.setSystem(i.getImmnztnIdSys());
		}
		/******************** immunizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationidentifier.setType(immunizationidentifiertype);

		/******************** immunizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationidentifiertype.addCoding(immunizationidentifiertypecoding);

		/******************** Immnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnIdTypCdgCd() != null) {
			immunizationidentifiertypecoding.setCode(i.getImmnztnIdTypCdgCd());
		}
		/******************** Immnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnIdTypCdgDsply() != null) {
			immunizationidentifiertypecoding.setDisplay(i.getImmnztnIdTypCdgDsply());
		}
		/******************** Immnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnIdTypCdgSys() != null) {
			immunizationidentifiertypecoding.setSystem(i.getImmnztnIdTypCdgSys());
		}
		/******************** Immnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnIdTypCdgUsrSltd() != null) {
			immunizationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnIdTypCdgUsrSltd()));
		}
		/******************** Immnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnIdTypCdgVrsn() != null) {
			immunizationidentifiertypecoding.setVersion(i.getImmnztnIdTypCdgVrsn());
		}
		/******************** Immnztn_Id_Typ_Txt ********************************************************************************/
		if(i.getImmnztnIdTypTxt() != null) {
			immunizationidentifiertype.setText(i.getImmnztnIdTypTxt());
		}
		/******************** immunizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory immunizationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		immunizationidentifier.setUse(immunizationidentifieruse.fromCode(i.getImmnztnIdUse()));

		/******************** Immnztn_Id_Vl ********************************************************************************/
		if(i.getImmnztnIdVl() != null) {
			immunizationidentifier.setValue(i.getImmnztnIdVl());
		}
		/******************** Immnztn_IsSubpotent ********************************************************************************/
		if(i.getImmnztnIsSubpotent() != null) {
			immunization.setIsSubpotent(Boolean.parseBoolean(i.getImmnztnIsSubpotent()));
		}
		/******************** Immnztn_Lctn ********************************************************************************/
		if(i.getImmnztnLctn() != null) {
			immunization.setLocation( new org.hl7.fhir.r4.model.Reference(i.getImmnztnLctn()));
		}
		/******************** Immnztn_LotNmbr ********************************************************************************/
		if(i.getImmnztnLotNmbr() != null) {
			immunization.setLotNumber(i.getImmnztnLotNmbr());
		}
		/******************** Immnztn_Manufacturer ********************************************************************************/
		if(i.getImmnztnManufacturer() != null) {
			immunization.setManufacturer( new org.hl7.fhir.r4.model.Reference(i.getImmnztnManufacturer()));
		}
		/******************** immunizationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation immunizationnote =  new org.hl7.fhir.r4.model.Annotation();
		immunization.addNote(immunizationnote);

		/******************** Immnztn_Nt_AthrRfrnc ********************************************************************************/
		if(i.getImmnztnNtAthrRfrnc() != null) {
			immunizationnote.setAuthor( new org.hl7.fhir.r4.model.Reference(i.getImmnztnNtAthrRfrnc()));
		}
		/******************** Immnztn_Nt_AthrStrgTyp ********************************************************************************/
		if(i.getImmnztnNtAthrStrgTyp() != null) {
			immunizationnote.setAuthor( new org.hl7.fhir.r4.model.StringType(i.getImmnztnNtAthrStrgTyp()));
		}
		/******************** Immnztn_Nt_Txt ********************************************************************************/
		if(i.getImmnztnNtTxt() != null) {
			immunizationnote.setText(i.getImmnztnNtTxt());
		}
		/******************** Immnztn_Nt_Time ********************************************************************************/
		if(i.getImmnztnNtTime() != null) {
			java.text.SimpleDateFormat Immnztn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Nt_Timedate = Immnztn_Nt_Timesdf.parse(i.getImmnztnNtTime());
			immunizationnote.setTime(Immnztn_Nt_Timedate);
		}
		/******************** Immnztn_OccrnceDtTimeTyp ********************************************************************************/
		if(i.getImmnztnOccrnceDtTimeTyp() != null) {
			immunization.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(i.getImmnztnOccrnceDtTimeTyp()));
		}
		/******************** Immnztn_OccrnceStrgTyp ********************************************************************************/
		if(i.getImmnztnOccrnceStrgTyp() != null) {
			immunization.setOccurrence( new org.hl7.fhir.r4.model.StringType(i.getImmnztnOccrnceStrgTyp()));
		}
		/******************** Immnztn_Pnt ********************************************************************************/
		if(i.getImmnztnPnt() != null) {
			immunization.setPatient( new org.hl7.fhir.r4.model.Reference(i.getImmnztnPnt()));
		}
		/******************** immunizationperformer ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent immunizationperformer =  new org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent();
		immunization.addPerformer(immunizationperformer);

		/******************** Immnztn_Prfrmr_Actor ********************************************************************************/
		if(i.getImmnztnPrfrmrActor() != null) {
			immunizationperformer.setActor( new org.hl7.fhir.r4.model.Reference(i.getImmnztnPrfrmrActor()));
		}
		/******************** immunizationperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationperformerfunction =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationperformer.setFunction(immunizationperformerfunction);

		/******************** immunizationperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationperformerfunctioncoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationperformerfunction.addCoding(immunizationperformerfunctioncoding);

		/******************** Immnztn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgCd() != null) {
			immunizationperformerfunctioncoding.setCode(i.getImmnztnPrfrmrFunctionCdgCd());
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgDsply() != null) {
			immunizationperformerfunctioncoding.setDisplay(i.getImmnztnPrfrmrFunctionCdgDsply());
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgSys() != null) {
			immunizationperformerfunctioncoding.setSystem(i.getImmnztnPrfrmrFunctionCdgSys());
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgUsrSltd() != null) {
			immunizationperformerfunctioncoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnPrfrmrFunctionCdgUsrSltd()));
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgVrsn() != null) {
			immunizationperformerfunctioncoding.setVersion(i.getImmnztnPrfrmrFunctionCdgVrsn());
		}
		/******************** Immnztn_Prfrmr_Function_Txt ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionTxt() != null) {
			immunizationperformerfunction.setText(i.getImmnztnPrfrmrFunctionTxt());
		}
		/******************** Immnztn_PrimarySrc ********************************************************************************/
		if(i.getImmnztnPrimarySrc() != null) {
			immunization.setPrimarySource(Boolean.parseBoolean(i.getImmnztnPrimarySrc()));
		}
		/******************** immunizationprogrameligibility ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationprogrameligibility =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.addProgramEligibility(immunizationprogrameligibility);

		/******************** immunizationprogrameligibilitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationprogrameligibilitycoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationprogrameligibility.addCoding(immunizationprogrameligibilitycoding);

		/******************** Immnztn_PrgrmElgblty_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgCd() != null) {
			immunizationprogrameligibilitycoding.setCode(i.getImmnztnPrgrmElgbltyCdgCd());
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgDsply() != null) {
			immunizationprogrameligibilitycoding.setDisplay(i.getImmnztnPrgrmElgbltyCdgDsply());
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgSys() != null) {
			immunizationprogrameligibilitycoding.setSystem(i.getImmnztnPrgrmElgbltyCdgSys());
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgUsrSltd() != null) {
			immunizationprogrameligibilitycoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnPrgrmElgbltyCdgUsrSltd()));
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgVrsn() != null) {
			immunizationprogrameligibilitycoding.setVersion(i.getImmnztnPrgrmElgbltyCdgVrsn());
		}
		/******************** Immnztn_PrgrmElgblty_Txt ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyTxt() != null) {
			immunizationprogrameligibility.setText(i.getImmnztnPrgrmElgbltyTxt());
		}
		/******************** immunizationprotocolapplied ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent immunizationprotocolapplied =  new org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent();
		immunization.addProtocolApplied(immunizationprotocolapplied);

		/******************** Immnztn_ProtocolApplied_Athrity ********************************************************************************/
		if(i.getImmnztnProtocolAppliedAthrity() != null) {
			immunizationprotocolapplied.setAuthority( new org.hl7.fhir.r4.model.Reference(i.getImmnztnProtocolAppliedAthrity()));
		}
		/******************** Immnztn_ProtocolApplied_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedDoseNmbrPositiveIntTyp() != null) {
			immunizationprotocolapplied.setDoseNumber( new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnProtocolAppliedDoseNmbrPositiveIntTyp()));
		}
		/******************** Immnztn_ProtocolApplied_DoseNmbrStrgTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedDoseNmbrStrgTyp() != null) {
			immunizationprotocolapplied.setDoseNumber( new org.hl7.fhir.r4.model.StringType(i.getImmnztnProtocolAppliedDoseNmbrStrgTyp()));
		}
		/******************** Immnztn_ProtocolApplied_Series ********************************************************************************/
		if(i.getImmnztnProtocolAppliedSeries() != null) {
			immunizationprotocolapplied.setSeries(i.getImmnztnProtocolAppliedSeries());
		}
		/******************** Immnztn_ProtocolApplied_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedSeriesDosesPositiveIntTyp() != null) {
			immunizationprotocolapplied.setSeriesDoses( new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnProtocolAppliedSeriesDosesPositiveIntTyp()));
		}
		/******************** Immnztn_ProtocolApplied_SeriesDosesStrgTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedSeriesDosesStrgTyp() != null) {
			immunizationprotocolapplied.setSeriesDoses( new org.hl7.fhir.r4.model.StringType(i.getImmnztnProtocolAppliedSeriesDosesStrgTyp()));
		}
		/******************** immunizationprotocolappliedtardisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationprotocolappliedtardisease =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationprotocolapplied.addTargetDisease(immunizationprotocolappliedtardisease);

		/******************** immunizationprotocolappliedtardiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationprotocolappliedtardiseasecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationprotocolappliedtardisease.addCoding(immunizationprotocolappliedtardiseasecoding);

		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgCd() != null) {
			immunizationprotocolappliedtardiseasecoding.setCode(i.getImmnztnProtocolAppliedTarDiseaseCdgCd());
		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgDsply() != null) {
			immunizationprotocolappliedtardiseasecoding.setDisplay(i.getImmnztnProtocolAppliedTarDiseaseCdgDsply());
		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgSys() != null) {
			immunizationprotocolappliedtardiseasecoding.setSystem(i.getImmnztnProtocolAppliedTarDiseaseCdgSys());
		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgUsrSltd() != null) {
			immunizationprotocolappliedtardiseasecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnProtocolAppliedTarDiseaseCdgUsrSltd()));
		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgVrsn() != null) {
			immunizationprotocolappliedtardiseasecoding.setVersion(i.getImmnztnProtocolAppliedTarDiseaseCdgVrsn());
		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Txt ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseTxt() != null) {
			immunizationprotocolappliedtardisease.setText(i.getImmnztnProtocolAppliedTarDiseaseTxt());
		}
		/******************** immunizationreaction ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent immunizationreaction =  new org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent();
		immunization.addReaction(immunizationreaction);

		/******************** Immnztn_Reaction_Dt ********************************************************************************/
		if(i.getImmnztnReactionDt() != null) {
			java.text.SimpleDateFormat Immnztn_Reaction_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Reaction_Dtdate = Immnztn_Reaction_Dtsdf.parse(i.getImmnztnReactionDt());
			immunizationreaction.setDate(Immnztn_Reaction_Dtdate);
		}
		/******************** Immnztn_Reaction_Dtl ********************************************************************************/
		if(i.getImmnztnReactionDtl() != null) {
			immunizationreaction.setDetail( new org.hl7.fhir.r4.model.Reference(i.getImmnztnReactionDtl()));
		}
		/******************** Immnztn_Reaction_Rpted ********************************************************************************/
		if(i.getImmnztnReactionRpted() != null) {
			immunizationreaction.setReported(Boolean.parseBoolean(i.getImmnztnReactionRpted()));
		}
		/******************** immunizationreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.addReasonCode(immunizationreasoncode);

		/******************** immunizationreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationreasoncode.addCoding(immunizationreasoncodecoding);

		/******************** Immnztn_RsnCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRsnCdCdgCd() != null) {
			immunizationreasoncodecoding.setCode(i.getImmnztnRsnCdCdgCd());
		}
		/******************** Immnztn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRsnCdCdgDsply() != null) {
			immunizationreasoncodecoding.setDisplay(i.getImmnztnRsnCdCdgDsply());
		}
		/******************** Immnztn_RsnCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRsnCdCdgSys() != null) {
			immunizationreasoncodecoding.setSystem(i.getImmnztnRsnCdCdgSys());
		}
		/******************** Immnztn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRsnCdCdgUsrSltd() != null) {
			immunizationreasoncodecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRsnCdCdgUsrSltd()));
		}
		/******************** Immnztn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRsnCdCdgVrsn() != null) {
			immunizationreasoncodecoding.setVersion(i.getImmnztnRsnCdCdgVrsn());
		}
		/******************** Immnztn_RsnCd_Txt ********************************************************************************/
		if(i.getImmnztnRsnCdTxt() != null) {
			immunizationreasoncode.setText(i.getImmnztnRsnCdTxt());
		}
		/******************** Immnztn_RsnRfrnc ********************************************************************************/
		if(i.getImmnztnRsnRfrnc() != null) {
			immunization.addReasonReference( new org.hl7.fhir.r4.model.Reference(i.getImmnztnRsnRfrnc()));
		}
		/******************** Immnztn_Recorded ********************************************************************************/
		if(i.getImmnztnRecorded() != null) {
			java.text.SimpleDateFormat Immnztn_Recordedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Immnztn_Recordeddate = Immnztn_Recordedsdf.parse(i.getImmnztnRecorded());
			immunization.setRecorded(Immnztn_Recordeddate);
		}
		/******************** immunizationreportorigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationreportorigin =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.setReportOrigin(immunizationreportorigin);

		/******************** immunizationreportorigincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationreportorigincoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationreportorigin.addCoding(immunizationreportorigincoding);

		/******************** Immnztn_RptOrigin_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRptOriginCdgCd() != null) {
			immunizationreportorigincoding.setCode(i.getImmnztnRptOriginCdgCd());
		}
		/******************** Immnztn_RptOrigin_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRptOriginCdgDsply() != null) {
			immunizationreportorigincoding.setDisplay(i.getImmnztnRptOriginCdgDsply());
		}
		/******************** Immnztn_RptOrigin_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRptOriginCdgSys() != null) {
			immunizationreportorigincoding.setSystem(i.getImmnztnRptOriginCdgSys());
		}
		/******************** Immnztn_RptOrigin_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRptOriginCdgUsrSltd() != null) {
			immunizationreportorigincoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRptOriginCdgUsrSltd()));
		}
		/******************** Immnztn_RptOrigin_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRptOriginCdgVrsn() != null) {
			immunizationreportorigincoding.setVersion(i.getImmnztnRptOriginCdgVrsn());
		}
		/******************** Immnztn_RptOrigin_Txt ********************************************************************************/
		if(i.getImmnztnRptOriginTxt() != null) {
			immunizationreportorigin.setText(i.getImmnztnRptOriginTxt());
		}
		/******************** immunizationroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.setRoute(immunizationroute);

		/******************** immunizationroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationroutecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationroute.addCoding(immunizationroutecoding);

		/******************** Immnztn_Route_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRouteCdgCd() != null) {
			immunizationroutecoding.setCode(i.getImmnztnRouteCdgCd());
		}
		/******************** Immnztn_Route_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRouteCdgDsply() != null) {
			immunizationroutecoding.setDisplay(i.getImmnztnRouteCdgDsply());
		}
		/******************** Immnztn_Route_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRouteCdgSys() != null) {
			immunizationroutecoding.setSystem(i.getImmnztnRouteCdgSys());
		}
		/******************** Immnztn_Route_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRouteCdgUsrSltd() != null) {
			immunizationroutecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRouteCdgUsrSltd()));
		}
		/******************** Immnztn_Route_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRouteCdgVrsn() != null) {
			immunizationroutecoding.setVersion(i.getImmnztnRouteCdgVrsn());
		}
		/******************** Immnztn_Route_Txt ********************************************************************************/
		if(i.getImmnztnRouteTxt() != null) {
			immunizationroute.setText(i.getImmnztnRouteTxt());
		}
		/******************** immunizationsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.setSite(immunizationsite);

		/******************** immunizationsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationsitecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationsite.addCoding(immunizationsitecoding);

		/******************** Immnztn_Site_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnSiteCdgCd() != null) {
			immunizationsitecoding.setCode(i.getImmnztnSiteCdgCd());
		}
		/******************** Immnztn_Site_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnSiteCdgDsply() != null) {
			immunizationsitecoding.setDisplay(i.getImmnztnSiteCdgDsply());
		}
		/******************** Immnztn_Site_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnSiteCdgSys() != null) {
			immunizationsitecoding.setSystem(i.getImmnztnSiteCdgSys());
		}
		/******************** Immnztn_Site_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnSiteCdgUsrSltd() != null) {
			immunizationsitecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnSiteCdgUsrSltd()));
		}
		/******************** Immnztn_Site_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnSiteCdgVrsn() != null) {
			immunizationsitecoding.setVersion(i.getImmnztnSiteCdgVrsn());
		}
		/******************** Immnztn_Site_Txt ********************************************************************************/
		if(i.getImmnztnSiteTxt() != null) {
			immunizationsite.setText(i.getImmnztnSiteTxt());
		}
		/******************** immunizationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationStatusEnumFactory immunizationstatus =  new org.hl7.fhir.r4.model.Immunization.ImmunizationStatusEnumFactory();
		immunization.setStatus(immunizationstatus.fromCode(i.getImmnztnSts()));

		/******************** immunizationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.setStatusReason(immunizationstatusreason);

		/******************** immunizationstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationstatusreason.addCoding(immunizationstatusreasoncoding);

		/******************** Immnztn_StsRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnStsRsnCdgCd() != null) {
			immunizationstatusreasoncoding.setCode(i.getImmnztnStsRsnCdgCd());
		}
		/******************** Immnztn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnStsRsnCdgDsply() != null) {
			immunizationstatusreasoncoding.setDisplay(i.getImmnztnStsRsnCdgDsply());
		}
		/******************** Immnztn_StsRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnStsRsnCdgSys() != null) {
			immunizationstatusreasoncoding.setSystem(i.getImmnztnStsRsnCdgSys());
		}
		/******************** Immnztn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnStsRsnCdgUsrSltd() != null) {
			immunizationstatusreasoncoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnStsRsnCdgUsrSltd()));
		}
		/******************** Immnztn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnStsRsnCdgVrsn() != null) {
			immunizationstatusreasoncoding.setVersion(i.getImmnztnStsRsnCdgVrsn());
		}
		/******************** Immnztn_StsRsn_Txt ********************************************************************************/
		if(i.getImmnztnStsRsnTxt() != null) {
			immunizationstatusreason.setText(i.getImmnztnStsRsnTxt());
		}
		/******************** immunizationsubpotentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationsubpotentreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.addSubpotentReason(immunizationsubpotentreason);

		/******************** immunizationsubpotentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationsubpotentreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationsubpotentreason.addCoding(immunizationsubpotentreasoncoding);

		/******************** Immnztn_SubpotentRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgCd() != null) {
			immunizationsubpotentreasoncoding.setCode(i.getImmnztnSubpotentRsnCdgCd());
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgDsply() != null) {
			immunizationsubpotentreasoncoding.setDisplay(i.getImmnztnSubpotentRsnCdgDsply());
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgSys() != null) {
			immunizationsubpotentreasoncoding.setSystem(i.getImmnztnSubpotentRsnCdgSys());
		}
		/******************** Immnztn_SubpotentRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgUsrSltd() != null) {
			immunizationsubpotentreasoncoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnSubpotentRsnCdgUsrSltd()));
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgVrsn() != null) {
			immunizationsubpotentreasoncoding.setVersion(i.getImmnztnSubpotentRsnCdgVrsn());
		}
		/******************** Immnztn_SubpotentRsn_Txt ********************************************************************************/
		if(i.getImmnztnSubpotentRsnTxt() != null) {
			immunizationsubpotentreason.setText(i.getImmnztnSubpotentRsnTxt());
		}
		/******************** immunizationvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationvaccinecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunization.setVaccineCode(immunizationvaccinecode);

		/******************** immunizationvaccinecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationvaccinecodecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationvaccinecode.addCoding(immunizationvaccinecodecoding);

		/******************** Immnztn_VaccineCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgCd() != null) {
			immunizationvaccinecodecoding.setCode(i.getImmnztnVaccineCdCdgCd());
		}
		/******************** Immnztn_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgDsply() != null) {
			immunizationvaccinecodecoding.setDisplay(i.getImmnztnVaccineCdCdgDsply());
		}
		/******************** Immnztn_VaccineCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgSys() != null) {
			immunizationvaccinecodecoding.setSystem(i.getImmnztnVaccineCdCdgSys());
		}
		/******************** Immnztn_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgUsrSltd() != null) {
			immunizationvaccinecodecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnVaccineCdCdgUsrSltd()));
		}
		/******************** Immnztn_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgVrsn() != null) {
			immunizationvaccinecodecoding.setVersion(i.getImmnztnVaccineCdCdgVrsn());
		}
		/******************** Immnztn_VaccineCd_Txt ********************************************************************************/
		if(i.getImmnztnVaccineCdTxt() != null) {
			immunizationvaccinecode.setText(i.getImmnztnVaccineCdTxt());
		}
		return immunization;
	}
}
