package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceNucleicAcid;
public class SubstanceNucleicAcidConversion 
{
	public org.hl7.fhir.r4.model.SubstanceNucleicAcid SubstanceNucleicAcids(SubstanceNucleicAcid s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceNucleicAcid substancenucleicacid = new org.hl7.fhir.r4.model.SubstanceNucleicAcid();

		/******************** id ********************************************************************************/
		substancenucleicacid.setId(s.getId());

		/******************** SbstncNclicAcid_AreaOfHybridisation ********************************************************************************/
		if(s.getSbstncNclicAcidAreaOfHybridisation() != null) {
			substancenucleicacid.setAreaOfHybridisation(s.getSbstncNclicAcidAreaOfHybridisation());
		}
		/******************** SbstncNclicAcid_NmbrOfSubunts ********************************************************************************/
		if(s.getSbstncNclicAcidNmbrOfSubunts() != null) {
			substancenucleicacid.setNumberOfSubunits(Integer.parseInt(s.getSbstncNclicAcidNmbrOfSubunts()));
		}
		/******************** substancenucleicacidoligonucleotidetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidoligonucleotidetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancenucleicacid.setOligoNucleotideType(substancenucleicacidoligonucleotidetype);

		/******************** substancenucleicacidoligonucleotidetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidoligonucleotidetypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancenucleicacidoligonucleotidetype.addCoding(substancenucleicacidoligonucleotidetypecoding);

		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgCd() != null) {
			substancenucleicacidoligonucleotidetypecoding.setCode(s.getSbstncNclicAcidOligoNucleotideTypCdgCd());
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgDsply() != null) {
			substancenucleicacidoligonucleotidetypecoding.setDisplay(s.getSbstncNclicAcidOligoNucleotideTypCdgDsply());
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgSys() != null) {
			substancenucleicacidoligonucleotidetypecoding.setSystem(s.getSbstncNclicAcidOligoNucleotideTypCdgSys());
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgUsrSltd() != null) {
			substancenucleicacidoligonucleotidetypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncNclicAcidOligoNucleotideTypCdgUsrSltd()));
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgVrsn() != null) {
			substancenucleicacidoligonucleotidetypecoding.setVersion(s.getSbstncNclicAcidOligoNucleotideTypCdgVrsn());
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypTxt() != null) {
			substancenucleicacidoligonucleotidetype.setText(s.getSbstncNclicAcidOligoNucleotideTypTxt());
		}
		/******************** substancenucleicacidsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsequencetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancenucleicacid.setSequenceType(substancenucleicacidsequencetype);

		/******************** substancenucleicacidsequencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsequencetypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancenucleicacidsequencetype.addCoding(substancenucleicacidsequencetypecoding);

		/******************** SbstncNclicAcid_SqncTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgCd() != null) {
			substancenucleicacidsequencetypecoding.setCode(s.getSbstncNclicAcidSqncTypCdgCd());
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgDsply() != null) {
			substancenucleicacidsequencetypecoding.setDisplay(s.getSbstncNclicAcidSqncTypCdgDsply());
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgSys() != null) {
			substancenucleicacidsequencetypecoding.setSystem(s.getSbstncNclicAcidSqncTypCdgSys());
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgUsrSltd() != null) {
			substancenucleicacidsequencetypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncNclicAcidSqncTypCdgUsrSltd()));
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgVrsn() != null) {
			substancenucleicacidsequencetypecoding.setVersion(s.getSbstncNclicAcidSqncTypCdgVrsn());
		}
		/******************** SbstncNclicAcid_SqncTyp_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypTxt() != null) {
			substancenucleicacidsequencetype.setText(s.getSbstncNclicAcidSqncTypTxt());
		}
		/******************** substancenucleicacidsubunit ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent substancenucleicacidsubunit =  new org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent();
		substancenucleicacid.addSubunit(substancenucleicacidsubunit);

		/******************** substancenucleicacidsubunitfiveprime ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitfiveprime =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancenucleicacidsubunit.setFivePrime(substancenucleicacidsubunitfiveprime);

		/******************** substancenucleicacidsubunitfiveprimecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitfiveprimecoding =  new org.hl7.fhir.r4.model.Coding();
		substancenucleicacidsubunitfiveprime.addCoding(substancenucleicacidsubunitfiveprimecoding);

		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgCd() != null) {
			substancenucleicacidsubunitfiveprimecoding.setCode(s.getSbstncNclicAcidSubuntFivePrimeCdgCd());
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgDsply() != null) {
			substancenucleicacidsubunitfiveprimecoding.setDisplay(s.getSbstncNclicAcidSubuntFivePrimeCdgDsply());
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgSys() != null) {
			substancenucleicacidsubunitfiveprimecoding.setSystem(s.getSbstncNclicAcidSubuntFivePrimeCdgSys());
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgUsrSltd() != null) {
			substancenucleicacidsubunitfiveprimecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncNclicAcidSubuntFivePrimeCdgUsrSltd()));
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgVrsn() != null) {
			substancenucleicacidsubunitfiveprimecoding.setVersion(s.getSbstncNclicAcidSubuntFivePrimeCdgVrsn());
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeTxt() != null) {
			substancenucleicacidsubunitfiveprime.setText(s.getSbstncNclicAcidSubuntFivePrimeTxt());
		}
		/******************** SbstncNclicAcid_Subunt_Length ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLength() != null) {
			substancenucleicacidsubunit.setLength(Integer.parseInt(s.getSbstncNclicAcidSubuntLength()));
		}
		/******************** substancenucleicacidsubunitlinkage ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent substancenucleicacidsubunitlinkage =  new org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent();
		substancenucleicacidsubunit.addLinkage(substancenucleicacidsubunitlinkage);

		/******************** SbstncNclicAcid_Subunt_Linkage_Connectivity ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageConnectivity() != null) {
			substancenucleicacidsubunitlinkage.setConnectivity(s.getSbstncNclicAcidSubuntLinkageConnectivity());
		}
		/******************** substancenucleicacidsubunitlinkageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancenucleicacidsubunitlinkageidentifier =  new org.hl7.fhir.r4.model.Identifier();
		substancenucleicacidsubunitlinkage.setIdentifier(substancenucleicacidsubunitlinkageidentifier);

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Assigner ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdAssigner() != null) {
			substancenucleicacidsubunitlinkageidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncNclicAcidSubuntLinkageIdAssigner()));
		}
		/******************** substancenucleicacidsubunitlinkageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancenucleicacidsubunitlinkageidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substancenucleicacidsubunitlinkageidentifier.setPeriod(substancenucleicacidsubunitlinkageidentifierperiod);

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_End ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncNclicAcid_Subunt_Linkage_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncNclicAcid_Subunt_Linkage_Id_Prd_Enddate = SbstncNclicAcid_Subunt_Linkage_Id_Prd_Endsdf.parse(s.getSbstncNclicAcidSubuntLinkageIdPrdEnd());
			substancenucleicacidsubunitlinkageidentifierperiod.setEnd(SbstncNclicAcid_Subunt_Linkage_Id_Prd_Enddate);
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strtdate = SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strtsdf.parse(s.getSbstncNclicAcidSubuntLinkageIdPrdStrt());
			substancenucleicacidsubunitlinkageidentifierperiod.setStart(SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strtdate);
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdSys() != null) {
			substancenucleicacidsubunitlinkageidentifier.setSystem(s.getSbstncNclicAcidSubuntLinkageIdSys());
		}
		/******************** substancenucleicacidsubunitlinkageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitlinkageidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancenucleicacidsubunitlinkageidentifier.setType(substancenucleicacidsubunitlinkageidentifiertype);

		/******************** substancenucleicacidsubunitlinkageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitlinkageidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancenucleicacidsubunitlinkageidentifiertype.addCoding(substancenucleicacidsubunitlinkageidentifiertypecoding);

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgCd() != null) {
			substancenucleicacidsubunitlinkageidentifiertypecoding.setCode(s.getSbstncNclicAcidSubuntLinkageIdTypCdgCd());
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgDsply() != null) {
			substancenucleicacidsubunitlinkageidentifiertypecoding.setDisplay(s.getSbstncNclicAcidSubuntLinkageIdTypCdgDsply());
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgSys() != null) {
			substancenucleicacidsubunitlinkageidentifiertypecoding.setSystem(s.getSbstncNclicAcidSubuntLinkageIdTypCdgSys());
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd() != null) {
			substancenucleicacidsubunitlinkageidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgVrsn() != null) {
			substancenucleicacidsubunitlinkageidentifiertypecoding.setVersion(s.getSbstncNclicAcidSubuntLinkageIdTypCdgVrsn());
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypTxt() != null) {
			substancenucleicacidsubunitlinkageidentifiertype.setText(s.getSbstncNclicAcidSubuntLinkageIdTypTxt());
		}
		/******************** substancenucleicacidsubunitlinkageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancenucleicacidsubunitlinkageidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancenucleicacidsubunitlinkageidentifier.setUse(substancenucleicacidsubunitlinkageidentifieruse.fromCode(s.getSbstncNclicAcidSubuntLinkageIdUse()));

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Vl ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdVl() != null) {
			substancenucleicacidsubunitlinkageidentifier.setValue(s.getSbstncNclicAcidSubuntLinkageIdVl());
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Nm ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageNm() != null) {
			substancenucleicacidsubunitlinkage.setName(s.getSbstncNclicAcidSubuntLinkageNm());
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_ResidueSite ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageResidueSite() != null) {
			substancenucleicacidsubunitlinkage.setResidueSite(s.getSbstncNclicAcidSubuntLinkageResidueSite());
		}
		/******************** SbstncNclicAcid_Subunt_Sqnc ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqnc() != null) {
			substancenucleicacidsubunit.setSequence(s.getSbstncNclicAcidSubuntSqnc());
		}
		/******************** substancenucleicacidsubunitsequenceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancenucleicacidsubunitsequenceattachment =  new org.hl7.fhir.r4.model.Attachment();
		substancenucleicacidsubunit.setSequenceAttachment(substancenucleicacidsubunitsequenceattachment);

		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntCntntTyp() != null) {
			substancenucleicacidsubunitsequenceattachment.setContentType(s.getSbstncNclicAcidSubuntSqncAttchmntCntntTyp());
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntCreation() != null) {
			java.text.SimpleDateFormat SbstncNclicAcid_Subunt_SqncAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncNclicAcid_Subunt_SqncAttchmnt_Creationdate = SbstncNclicAcid_Subunt_SqncAttchmnt_Creationsdf.parse(s.getSbstncNclicAcidSubuntSqncAttchmntCreation());
			substancenucleicacidsubunitsequenceattachment.setCreation(SbstncNclicAcid_Subunt_SqncAttchmnt_Creationdate);
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntData() != null) {
			substancenucleicacidsubunitsequenceattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncNclicAcidSubuntSqncAttchmntData()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntHash() != null) {
			substancenucleicacidsubunitsequenceattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncNclicAcidSubuntSqncAttchmntHash()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntLnguage() != null) {
			substancenucleicacidsubunitsequenceattachment.setLanguage(s.getSbstncNclicAcidSubuntSqncAttchmntLnguage());
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntSz() != null) {
			substancenucleicacidsubunitsequenceattachment.setSize(Integer.parseInt(s.getSbstncNclicAcidSubuntSqncAttchmntSz()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntTtl() != null) {
			substancenucleicacidsubunitsequenceattachment.setTitle(s.getSbstncNclicAcidSubuntSqncAttchmntTtl());
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntUrl() != null) {
			substancenucleicacidsubunitsequenceattachment.setUrl(s.getSbstncNclicAcidSubuntSqncAttchmntUrl());
		}
		/******************** SbstncNclicAcid_Subunt_Subunt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSubunt() != null) {
			substancenucleicacidsubunit.setSubunit(Integer.parseInt(s.getSbstncNclicAcidSubuntSubunt()));
		}
		/******************** substancenucleicacidsubunitsugar ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent substancenucleicacidsubunitsugar =  new org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent();
		substancenucleicacidsubunit.addSugar(substancenucleicacidsubunitsugar);

		/******************** substancenucleicacidsubunitsugaridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancenucleicacidsubunitsugaridentifier =  new org.hl7.fhir.r4.model.Identifier();
		substancenucleicacidsubunitsugar.setIdentifier(substancenucleicacidsubunitsugaridentifier);

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Assigner ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdAssigner() != null) {
			substancenucleicacidsubunitsugaridentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncNclicAcidSubuntSugarIdAssigner()));
		}
		/******************** substancenucleicacidsubunitsugaridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancenucleicacidsubunitsugaridentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substancenucleicacidsubunitsugaridentifier.setPeriod(substancenucleicacidsubunitsugaridentifierperiod);

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_End ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncNclicAcid_Subunt_Sugar_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncNclicAcid_Subunt_Sugar_Id_Prd_Enddate = SbstncNclicAcid_Subunt_Sugar_Id_Prd_Endsdf.parse(s.getSbstncNclicAcidSubuntSugarIdPrdEnd());
			substancenucleicacidsubunitsugaridentifierperiod.setEnd(SbstncNclicAcid_Subunt_Sugar_Id_Prd_Enddate);
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strtdate = SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strtsdf.parse(s.getSbstncNclicAcidSubuntSugarIdPrdStrt());
			substancenucleicacidsubunitsugaridentifierperiod.setStart(SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strtdate);
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdSys() != null) {
			substancenucleicacidsubunitsugaridentifier.setSystem(s.getSbstncNclicAcidSubuntSugarIdSys());
		}
		/******************** substancenucleicacidsubunitsugaridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitsugaridentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancenucleicacidsubunitsugaridentifier.setType(substancenucleicacidsubunitsugaridentifiertype);

		/******************** substancenucleicacidsubunitsugaridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitsugaridentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substancenucleicacidsubunitsugaridentifiertype.addCoding(substancenucleicacidsubunitsugaridentifiertypecoding);

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgCd() != null) {
			substancenucleicacidsubunitsugaridentifiertypecoding.setCode(s.getSbstncNclicAcidSubuntSugarIdTypCdgCd());
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgDsply() != null) {
			substancenucleicacidsubunitsugaridentifiertypecoding.setDisplay(s.getSbstncNclicAcidSubuntSugarIdTypCdgDsply());
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgSys() != null) {
			substancenucleicacidsubunitsugaridentifiertypecoding.setSystem(s.getSbstncNclicAcidSubuntSugarIdTypCdgSys());
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd() != null) {
			substancenucleicacidsubunitsugaridentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgVrsn() != null) {
			substancenucleicacidsubunitsugaridentifiertypecoding.setVersion(s.getSbstncNclicAcidSubuntSugarIdTypCdgVrsn());
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypTxt() != null) {
			substancenucleicacidsubunitsugaridentifiertype.setText(s.getSbstncNclicAcidSubuntSugarIdTypTxt());
		}
		/******************** substancenucleicacidsubunitsugaridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substancenucleicacidsubunitsugaridentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substancenucleicacidsubunitsugaridentifier.setUse(substancenucleicacidsubunitsugaridentifieruse.fromCode(s.getSbstncNclicAcidSubuntSugarIdUse()));

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Vl ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdVl() != null) {
			substancenucleicacidsubunitsugaridentifier.setValue(s.getSbstncNclicAcidSubuntSugarIdVl());
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Nm ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarNm() != null) {
			substancenucleicacidsubunitsugar.setName(s.getSbstncNclicAcidSubuntSugarNm());
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_ResidueSite ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarResidueSite() != null) {
			substancenucleicacidsubunitsugar.setResidueSite(s.getSbstncNclicAcidSubuntSugarResidueSite());
		}
		/******************** substancenucleicacidsubunitthreeprime ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitthreeprime =  new org.hl7.fhir.r4.model.CodeableConcept();
		substancenucleicacidsubunit.setThreePrime(substancenucleicacidsubunitthreeprime);

		/******************** substancenucleicacidsubunitthreeprimecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitthreeprimecoding =  new org.hl7.fhir.r4.model.Coding();
		substancenucleicacidsubunitthreeprime.addCoding(substancenucleicacidsubunitthreeprimecoding);

		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgCd() != null) {
			substancenucleicacidsubunitthreeprimecoding.setCode(s.getSbstncNclicAcidSubuntThreePrimeCdgCd());
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgDsply() != null) {
			substancenucleicacidsubunitthreeprimecoding.setDisplay(s.getSbstncNclicAcidSubuntThreePrimeCdgDsply());
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgSys() != null) {
			substancenucleicacidsubunitthreeprimecoding.setSystem(s.getSbstncNclicAcidSubuntThreePrimeCdgSys());
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgUsrSltd() != null) {
			substancenucleicacidsubunitthreeprimecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncNclicAcidSubuntThreePrimeCdgUsrSltd()));
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgVrsn() != null) {
			substancenucleicacidsubunitthreeprimecoding.setVersion(s.getSbstncNclicAcidSubuntThreePrimeCdgVrsn());
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeTxt() != null) {
			substancenucleicacidsubunitthreeprime.setText(s.getSbstncNclicAcidSubuntThreePrimeTxt());
		}
		return substancenucleicacid;
	}
}
