package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceNucleicAcid;
public class SubstanceNucleicAcidBidirectionalConversion 
{
	public SubstanceNucleicAcid SubstanceNucleicAcids(org.hl7.fhir.r4.model.SubstanceNucleicAcid substancenucleicacid) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceNucleicAcid s = new  main.java.com.campfhir.model.SubstanceNucleicAcid();

		/******************** id ********************************************************************************/
		substancenucleicacid.setId(s.getId());

		/******************** SbstncNclicAcid_NmbrOfSubunts ********************************************************************************/
		if(substancenucleicacid.hasNumberOfSubunits()) {
			s.setSbstncNclicAcidNmbrOfSubunts(String.valueOf(substancenucleicacid.getNumberOfSubunits()));
		}
		/******************** SbstncNclicAcid_AreaOfHybridisation ********************************************************************************/
		if(substancenucleicacid.hasAreaOfHybridisation()) {
			s.setSbstncNclicAcidAreaOfHybridisation(String.valueOf(substancenucleicacid.getAreaOfHybridisation()));
		}
		/******************** substancenucleicacidoligonucleotidetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidoligonucleotidetype = substancenucleicacid.getOligoNucleotideType();

		/******************** SbstncNclicAcid_OligoNucleotideTyp_Txt ********************************************************************************/
		if(substancenucleicacidoligonucleotidetype.hasText()) {
			s.setSbstncNclicAcidOligoNucleotideTypTxt(String.valueOf(substancenucleicacidoligonucleotidetype.getText()));
		}
		/******************** substancenucleicacidoligonucleotidetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidoligonucleotidetypecoding = substancenucleicacidoligonucleotidetype.getCodingFirstRep();

		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecoding.hasVersion()) {
			s.setSbstncNclicAcidOligoNucleotideTypCdgVrsn(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getVersion()));
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecoding.hasDisplay()) {
			s.setSbstncNclicAcidOligoNucleotideTypCdgDsply(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getDisplay()));
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecoding.hasCode()) {
			s.setSbstncNclicAcidOligoNucleotideTypCdgCd(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getCode()));
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecoding.hasUserSelected()) {
			s.setSbstncNclicAcidOligoNucleotideTypCdgUsrSltd(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getUserSelected()));
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidoligonucleotidetypecoding.hasSystem()) {
			s.setSbstncNclicAcidOligoNucleotideTypCdgSys(String.valueOf(substancenucleicacidoligonucleotidetypecoding.getSystem()));
		}
		/******************** substancenucleicacidsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsequencetype = substancenucleicacid.getSequenceType();

		/******************** SbstncNclicAcid_SqncTyp_Txt ********************************************************************************/
		if(substancenucleicacidsequencetype.hasText()) {
			s.setSbstncNclicAcidSqncTypTxt(String.valueOf(substancenucleicacidsequencetype.getText()));
		}
		/******************** substancenucleicacidsequencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsequencetypecoding = substancenucleicacidsequencetype.getCodingFirstRep();

		/******************** SbstncNclicAcid_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsequencetypecoding.hasVersion()) {
			s.setSbstncNclicAcidSqncTypCdgVrsn(String.valueOf(substancenucleicacidsequencetypecoding.getVersion()));
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsequencetypecoding.hasDisplay()) {
			s.setSbstncNclicAcidSqncTypCdgDsply(String.valueOf(substancenucleicacidsequencetypecoding.getDisplay()));
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsequencetypecoding.hasCode()) {
			s.setSbstncNclicAcidSqncTypCdgCd(String.valueOf(substancenucleicacidsequencetypecoding.getCode()));
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsequencetypecoding.hasUserSelected()) {
			s.setSbstncNclicAcidSqncTypCdgUsrSltd(String.valueOf(substancenucleicacidsequencetypecoding.getUserSelected()));
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsequencetypecoding.hasSystem()) {
			s.setSbstncNclicAcidSqncTypCdgSys(String.valueOf(substancenucleicacidsequencetypecoding.getSystem()));
		}
		/******************** substancenucleicacidsubunit ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent substancenucleicacidsubunit = substancenucleicacid.getSubunitFirstRep();

		/******************** SbstncNclicAcid_Subunt_Length ********************************************************************************/
		if(substancenucleicacidsubunit.hasLength()) {
			s.setSbstncNclicAcidSubuntLength(String.valueOf(substancenucleicacidsubunit.getLength()));
		}
		/******************** SbstncNclicAcid_Subunt_Sqnc ********************************************************************************/
		if(substancenucleicacidsubunit.hasSequence()) {
			s.setSbstncNclicAcidSubuntSqnc(String.valueOf(substancenucleicacidsubunit.getSequence()));
		}
		/******************** substancenucleicacidsubunitfiveprime ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitfiveprime = substancenucleicacidsubunit.getFivePrime();

		/******************** SbstncNclicAcid_Subunt_FivePrime_Txt ********************************************************************************/
		if(substancenucleicacidsubunitfiveprime.hasText()) {
			s.setSbstncNclicAcidSubuntFivePrimeTxt(String.valueOf(substancenucleicacidsubunitfiveprime.getText()));
		}
		/******************** substancenucleicacidsubunitfiveprimecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitfiveprimecoding = substancenucleicacidsubunitfiveprime.getCodingFirstRep();

		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecoding.hasVersion()) {
			s.setSbstncNclicAcidSubuntFivePrimeCdgVrsn(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getVersion()));
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecoding.hasDisplay()) {
			s.setSbstncNclicAcidSubuntFivePrimeCdgDsply(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getDisplay()));
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecoding.hasCode()) {
			s.setSbstncNclicAcidSubuntFivePrimeCdgCd(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getCode()));
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecoding.hasUserSelected()) {
			s.setSbstncNclicAcidSubuntFivePrimeCdgUsrSltd(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getUserSelected()));
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitfiveprimecoding.hasSystem()) {
			s.setSbstncNclicAcidSubuntFivePrimeCdgSys(String.valueOf(substancenucleicacidsubunitfiveprimecoding.getSystem()));
		}
		/******************** substancenucleicacidsubunitsugar ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent substancenucleicacidsubunitsugar = substancenucleicacidsubunit.getSugarFirstRep();

		/******************** SbstncNclicAcid_Subunt_Sugar_Nm ********************************************************************************/
		if(substancenucleicacidsubunitsugar.hasName()) {
			s.setSbstncNclicAcidSubuntSugarNm(String.valueOf(substancenucleicacidsubunitsugar.getName()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_ResidueSite ********************************************************************************/
		if(substancenucleicacidsubunitsugar.hasResidueSite()) {
			s.setSbstncNclicAcidSubuntSugarResidueSite(String.valueOf(substancenucleicacidsubunitsugar.getResidueSite()));
		}
		/******************** substancenucleicacidsubunitsugaridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancenucleicacidsubunitsugaridentifier = substancenucleicacidsubunitsugar.getIdentifier();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Vl ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifier.hasValue()) {
			s.setSbstncNclicAcidSubuntSugarIdVl(String.valueOf(substancenucleicacidsubunitsugaridentifier.getValue()));
		}
		/******************** substancenucleicacidsubunitsugaridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitsugaridentifiertype = substancenucleicacidsubunitsugaridentifier.getType();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Txt ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertype.hasText()) {
			s.setSbstncNclicAcidSubuntSugarIdTypTxt(String.valueOf(substancenucleicacidsubunitsugaridentifiertype.getText()));
		}
		/******************** substancenucleicacidsubunitsugaridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitsugaridentifiertypecoding = substancenucleicacidsubunitsugaridentifiertype.getCodingFirstRep();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasVersion()) {
			s.setSbstncNclicAcidSubuntSugarIdTypCdgVrsn(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getVersion()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasDisplay()) {
			s.setSbstncNclicAcidSubuntSugarIdTypCdgDsply(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getDisplay()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasCode()) {
			s.setSbstncNclicAcidSubuntSugarIdTypCdgCd(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getCode()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasUserSelected()) {
			s.setSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getUserSelected()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifiertypecoding.hasSystem()) {
			s.setSbstncNclicAcidSubuntSugarIdTypCdgSys(String.valueOf(substancenucleicacidsubunitsugaridentifiertypecoding.getSystem()));
		}
		/******************** substancenucleicacidsubunitsugaridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancenucleicacidsubunitsugaridentifierperiod = substancenucleicacidsubunitsugaridentifier.getPeriod();

		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strt ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifierperiod.hasStart()) {
			s.setSbstncNclicAcidSubuntSugarIdPrdStrt(String.valueOf(substancenucleicacidsubunitsugaridentifierperiod.getStart()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_End ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifierperiod.hasEnd()) {
			s.setSbstncNclicAcidSubuntSugarIdPrdEnd(String.valueOf(substancenucleicacidsubunitsugaridentifierperiod.getEnd()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Assigner ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifier.hasAssigner()) {
			s.setSbstncNclicAcidSubuntSugarIdAssigner(String.valueOf(substancenucleicacidsubunitsugaridentifier.getAssigner()));
		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Sys ********************************************************************************/
		if(substancenucleicacidsubunitsugaridentifier.hasSystem()) {
			s.setSbstncNclicAcidSubuntSugarIdSys(String.valueOf(substancenucleicacidsubunitsugaridentifier.getSystem()));
		}
		/******************** substancenucleicacidsubunitsugaridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancenucleicacidsubunitsugaridentifieruse = substancenucleicacidsubunitsugaridentifier.getUse();
		s.setSbstncNclicAcidSubuntSugarIdUse(substancenucleicacidsubunitsugaridentifieruse.toCode());

		/******************** substancenucleicacidsubunitthreeprime ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitthreeprime = substancenucleicacidsubunit.getThreePrime();

		/******************** SbstncNclicAcid_Subunt_ThreePrime_Txt ********************************************************************************/
		if(substancenucleicacidsubunitthreeprime.hasText()) {
			s.setSbstncNclicAcidSubuntThreePrimeTxt(String.valueOf(substancenucleicacidsubunitthreeprime.getText()));
		}
		/******************** substancenucleicacidsubunitthreeprimecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitthreeprimecoding = substancenucleicacidsubunitthreeprime.getCodingFirstRep();

		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecoding.hasVersion()) {
			s.setSbstncNclicAcidSubuntThreePrimeCdgVrsn(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getVersion()));
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecoding.hasDisplay()) {
			s.setSbstncNclicAcidSubuntThreePrimeCdgDsply(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getDisplay()));
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecoding.hasCode()) {
			s.setSbstncNclicAcidSubuntThreePrimeCdgCd(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getCode()));
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecoding.hasUserSelected()) {
			s.setSbstncNclicAcidSubuntThreePrimeCdgUsrSltd(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getUserSelected()));
		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitthreeprimecoding.hasSystem()) {
			s.setSbstncNclicAcidSubuntThreePrimeCdgSys(String.valueOf(substancenucleicacidsubunitthreeprimecoding.getSystem()));
		}
		/******************** substancenucleicacidsubunitlinkage ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent substancenucleicacidsubunitlinkage = substancenucleicacidsubunit.getLinkageFirstRep();

		/******************** SbstncNclicAcid_Subunt_Linkage_Nm ********************************************************************************/
		if(substancenucleicacidsubunitlinkage.hasName()) {
			s.setSbstncNclicAcidSubuntLinkageNm(String.valueOf(substancenucleicacidsubunitlinkage.getName()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_ResidueSite ********************************************************************************/
		if(substancenucleicacidsubunitlinkage.hasResidueSite()) {
			s.setSbstncNclicAcidSubuntLinkageResidueSite(String.valueOf(substancenucleicacidsubunitlinkage.getResidueSite()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Connectivity ********************************************************************************/
		if(substancenucleicacidsubunitlinkage.hasConnectivity()) {
			s.setSbstncNclicAcidSubuntLinkageConnectivity(String.valueOf(substancenucleicacidsubunitlinkage.getConnectivity()));
		}
		/******************** substancenucleicacidsubunitlinkageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancenucleicacidsubunitlinkageidentifier = substancenucleicacidsubunitlinkage.getIdentifier();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Vl ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifier.hasValue()) {
			s.setSbstncNclicAcidSubuntLinkageIdVl(String.valueOf(substancenucleicacidsubunitlinkageidentifier.getValue()));
		}
		/******************** substancenucleicacidsubunitlinkageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancenucleicacidsubunitlinkageidentifiertype = substancenucleicacidsubunitlinkageidentifier.getType();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Txt ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertype.hasText()) {
			s.setSbstncNclicAcidSubuntLinkageIdTypTxt(String.valueOf(substancenucleicacidsubunitlinkageidentifiertype.getText()));
		}
		/******************** substancenucleicacidsubunitlinkageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancenucleicacidsubunitlinkageidentifiertypecoding = substancenucleicacidsubunitlinkageidentifiertype.getCodingFirstRep();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasVersion()) {
			s.setSbstncNclicAcidSubuntLinkageIdTypCdgVrsn(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getVersion()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasDisplay()) {
			s.setSbstncNclicAcidSubuntLinkageIdTypCdgDsply(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getDisplay()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasCode()) {
			s.setSbstncNclicAcidSubuntLinkageIdTypCdgCd(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getCode()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasUserSelected()) {
			s.setSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getUserSelected()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifiertypecoding.hasSystem()) {
			s.setSbstncNclicAcidSubuntLinkageIdTypCdgSys(String.valueOf(substancenucleicacidsubunitlinkageidentifiertypecoding.getSystem()));
		}
		/******************** substancenucleicacidsubunitlinkageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancenucleicacidsubunitlinkageidentifierperiod = substancenucleicacidsubunitlinkageidentifier.getPeriod();

		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strt ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifierperiod.hasStart()) {
			s.setSbstncNclicAcidSubuntLinkageIdPrdStrt(String.valueOf(substancenucleicacidsubunitlinkageidentifierperiod.getStart()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_End ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifierperiod.hasEnd()) {
			s.setSbstncNclicAcidSubuntLinkageIdPrdEnd(String.valueOf(substancenucleicacidsubunitlinkageidentifierperiod.getEnd()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Assigner ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifier.hasAssigner()) {
			s.setSbstncNclicAcidSubuntLinkageIdAssigner(String.valueOf(substancenucleicacidsubunitlinkageidentifier.getAssigner()));
		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Sys ********************************************************************************/
		if(substancenucleicacidsubunitlinkageidentifier.hasSystem()) {
			s.setSbstncNclicAcidSubuntLinkageIdSys(String.valueOf(substancenucleicacidsubunitlinkageidentifier.getSystem()));
		}
		/******************** substancenucleicacidsubunitlinkageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancenucleicacidsubunitlinkageidentifieruse = substancenucleicacidsubunitlinkageidentifier.getUse();
		s.setSbstncNclicAcidSubuntLinkageIdUse(substancenucleicacidsubunitlinkageidentifieruse.toCode());

		/******************** substancenucleicacidsubunitsequenceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancenucleicacidsubunitsequenceattachment = substancenucleicacidsubunit.getSequenceAttachment();

		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasSize()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntSz(String.valueOf(substancenucleicacidsubunitsequenceattachment.getSize()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasLanguage()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntLnguage(String.valueOf(substancenucleicacidsubunitsequenceattachment.getLanguage()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasContentType()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntCntntTyp(String.valueOf(substancenucleicacidsubunitsequenceattachment.getContentType()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasTitle()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntTtl(String.valueOf(substancenucleicacidsubunitsequenceattachment.getTitle()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasUrl()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntUrl(String.valueOf(substancenucleicacidsubunitsequenceattachment.getUrl()));
		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasData()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntData(String.valueOf(substancenucleicacidsubunitsequenceattachment.getData()));
		}

		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasHash()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntHash(String.valueOf(substancenucleicacidsubunitsequenceattachment.getHash()));
		}

		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(substancenucleicacidsubunitsequenceattachment.hasCreation()) {
			s.setSbstncNclicAcidSubuntSqncAttchmntCreation(String.valueOf(substancenucleicacidsubunitsequenceattachment.getCreation()));
		}
		return s;
	}
}
