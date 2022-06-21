package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Immunization;
public class ImmunizationBidirectionalConversion 
{
	public Immunization Immunizations(org.hl7.fhir.r4.model.Immunization immunization) throws ParseException
	{
		 main.java.com.campfhir.model.Immunization i = new  main.java.com.campfhir.model.Immunization();

		/******************** id ********************************************************************************/
		immunization.setId(i.getId());

		/******************** Immnztn_Lctn ********************************************************************************/
		if(immunization.hasLocation()) {
			i.setImmnztnLctn(String.valueOf(immunization.getLocation()));
		}
		/******************** Immnztn_OccrnceDtTimeTyp ********************************************************************************/
		if(immunization.hasOccurrenceDateTimeType()) {
			i.setImmnztnOccrnceDtTimeTyp(String.valueOf(immunization.getOccurrenceDateTimeType()));
		}
		/******************** immunizationprotocolapplied ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent immunizationprotocolapplied = immunization.getProtocolAppliedFirstRep();

		/******************** Immnztn_ProtocolApplied_Athrity ********************************************************************************/
		if(immunizationprotocolapplied.hasAuthority()) {
			i.setImmnztnProtocolAppliedAthrity(String.valueOf(immunizationprotocolapplied.getAuthority()));
		}
		/******************** Immnztn_ProtocolApplied_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasDoseNumberPositiveIntType()) {
			i.setImmnztnProtocolAppliedDoseNmbrPositiveIntTyp(String.valueOf(immunizationprotocolapplied.getDoseNumberPositiveIntType()));
		}
		/******************** Immnztn_ProtocolApplied_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasSeriesDosesPositiveIntType()) {
			i.setImmnztnProtocolAppliedSeriesDosesPositiveIntTyp(String.valueOf(immunizationprotocolapplied.getSeriesDosesPositiveIntType()));
		}
		/******************** Immnztn_ProtocolApplied_SeriesDosesStrgTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasSeriesDosesStringType()) {
			i.setImmnztnProtocolAppliedSeriesDosesStrgTyp(String.valueOf(immunizationprotocolapplied.getSeriesDosesStringType()));
		}
		/******************** Immnztn_ProtocolApplied_DoseNmbrStrgTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasDoseNumberStringType()) {
			i.setImmnztnProtocolAppliedDoseNmbrStrgTyp(String.valueOf(immunizationprotocolapplied.getDoseNumberStringType()));
		}
		/******************** Immnztn_ProtocolApplied_Series ********************************************************************************/
		if(immunizationprotocolapplied.hasSeries()) {
			i.setImmnztnProtocolAppliedSeries(String.valueOf(immunizationprotocolapplied.getSeries()));
		}
		/******************** immunizationprotocolappliedtargetdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationprotocolappliedtargetdisease = immunizationprotocolapplied.getTargetDiseaseFirstRep();

		/******************** immunizationprotocolappliedtargetdiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationprotocolappliedtargetdiseasecoding = immunizationprotocolappliedtargetdisease.getCodingFirstRep();

		/******************** Immnztn_ProtocolApplied_TargetDisease_Cdg_Dsply ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecoding.hasDisplay()) {
			i.setImmnztnProtocolAppliedTarDiseaseCdgDsply(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getDisplay()));
		}
		/******************** Immnztn_ProtocolApplied_TargetDisease_Cdg_Vrsn ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecoding.hasVersion()) {
			i.setImmnztnProtocolAppliedTarDiseaseCdgVrsn(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getVersion()));
		}
		/******************** Immnztn_ProtocolApplied_TargetDisease_Cdg_Cd ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecoding.hasCode()) {
			i.setImmnztnProtocolAppliedTarDiseaseCdgCd(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getCode()));
		}
		/******************** Immnztn_ProtocolApplied_TargetDisease_Cdg_Sys ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecoding.hasSystem()) {
			i.setImmnztnProtocolAppliedTarDiseaseCdgSys(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getSystem()));
		}
		/******************** Immnztn_ProtocolApplied_TargetDisease_Cdg_UsrSltd ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecoding.hasUserSelected()) {
			i.setImmnztnProtocolAppliedTarDiseaseCdgUsrSltd(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getUserSelected()));
		}
		/******************** Immnztn_ProtocolApplied_TargetDisease_Txt ********************************************************************************/
		if(immunizationprotocolappliedtargetdisease.hasText()) {
			i.setImmnztnProtocolAppliedTarDiseaseTxt(String.valueOf(immunizationprotocolappliedtargetdisease.getText()));
		}
		/******************** immunizationreaction ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent immunizationreaction = immunization.getReactionFirstRep();

		/******************** Immnztn_Reaction_Dt ********************************************************************************/
		if(immunizationreaction.hasDate()) {
			i.setImmnztnReactionDt(String.valueOf(immunizationreaction.getDate()));
		}
		/******************** Immnztn_Reaction_Rpted ********************************************************************************/
		if(immunizationreaction.hasReported()) {
			i.setImmnztnReactionRpted(String.valueOf(immunizationreaction.getReported()));
		}
		/******************** Immnztn_Reaction_Dtl ********************************************************************************/
		if(immunizationreaction.hasDetail()) {
			i.setImmnztnReactionDtl(String.valueOf(immunizationreaction.getDetail()));
		}
		/******************** immunizationperformer ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent immunizationperformer = immunization.getPerformerFirstRep();

		/******************** immunizationperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationperformerfunction = immunizationperformer.getFunction();

		/******************** immunizationperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationperformerfunctioncoding = immunizationperformerfunction.getCodingFirstRep();

		/******************** Immnztn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(immunizationperformerfunctioncoding.hasDisplay()) {
			i.setImmnztnPrfrmrFunctionCdgDsply(String.valueOf(immunizationperformerfunctioncoding.getDisplay()));
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(immunizationperformerfunctioncoding.hasVersion()) {
			i.setImmnztnPrfrmrFunctionCdgVrsn(String.valueOf(immunizationperformerfunctioncoding.getVersion()));
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(immunizationperformerfunctioncoding.hasCode()) {
			i.setImmnztnPrfrmrFunctionCdgCd(String.valueOf(immunizationperformerfunctioncoding.getCode()));
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(immunizationperformerfunctioncoding.hasSystem()) {
			i.setImmnztnPrfrmrFunctionCdgSys(String.valueOf(immunizationperformerfunctioncoding.getSystem()));
		}
		/******************** Immnztn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(immunizationperformerfunctioncoding.hasUserSelected()) {
			i.setImmnztnPrfrmrFunctionCdgUsrSltd(String.valueOf(immunizationperformerfunctioncoding.getUserSelected()));
		}
		/******************** Immnztn_Prfrmr_Function_Txt ********************************************************************************/
		if(immunizationperformerfunction.hasText()) {
			i.setImmnztnPrfrmrFunctionTxt(String.valueOf(immunizationperformerfunction.getText()));
		}
		/******************** Immnztn_Prfrmr_Actor ********************************************************************************/
		if(immunizationperformer.hasActor()) {
			i.setImmnztnPrfrmrActor(String.valueOf(immunizationperformer.getActor()));
		}
		/******************** immunizationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationStatus immunizationstatus = immunization.getStatus();
		i.setImmnztnSts(immunizationstatus.toCode());

		/******************** Immnztn_Enc ********************************************************************************/
		if(immunization.hasEncounter()) {
			i.setImmnztnEnc(String.valueOf(immunization.getEncounter()));
		}
		/******************** immunizationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation immunizationnote = immunization.getNoteFirstRep();

		/******************** Immnztn_Nt_Time ********************************************************************************/
		if(immunizationnote.hasTime()) {
			i.setImmnztnNtTime(String.valueOf(immunizationnote.getTime()));
		}
		/******************** Immnztn_Nt_AthrRfrnc ********************************************************************************/
		if(immunizationnote.hasAuthorReference()) {
			i.setImmnztnNtAthrRfrnc(String.valueOf(immunizationnote.getAuthorReference()));
		}
		/******************** Immnztn_Nt_Txt ********************************************************************************/
		if(immunizationnote.hasText()) {
			i.setImmnztnNtTxt(String.valueOf(immunizationnote.getText()));
		}
		/******************** Immnztn_Nt_AthrStrgTyp ********************************************************************************/
		if(immunizationnote.hasAuthorStringType()) {
			i.setImmnztnNtAthrStrgTyp(String.valueOf(immunizationnote.getAuthorStringType()));
		}
		/******************** immunizationeducation ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent immunizationeducation = immunization.getEducationFirstRep();

		/******************** Immnztn_Education_Rfrnc ********************************************************************************/
		if(immunizationeducation.hasReference()) {
			i.setImmnztnEducationRfrnc(String.valueOf(immunizationeducation.getReference()));
		}
		/******************** Immnztn_Education_PublicationDt ********************************************************************************/
		if(immunizationeducation.hasPublicationDate()) {
			i.setImmnztnEducationPublicationDt(String.valueOf(immunizationeducation.getPublicationDate()));
		}
		/******************** Immnztn_Education_PrsnttnDt ********************************************************************************/
		if(immunizationeducation.hasPresentationDate()) {
			i.setImmnztnEducationPrsnttnDt(String.valueOf(immunizationeducation.getPresentationDate()));
		}
		/******************** Immnztn_Education_DocTyp ********************************************************************************/
		if(immunizationeducation.hasDocumentType()) {
			i.setImmnztnEducationDocTyp(String.valueOf(immunizationeducation.getDocumentType()));
		}
		/******************** immunizationsubpotentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationsubpotentreason = immunization.getSubpotentReasonFirstRep();

		/******************** immunizationsubpotentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationsubpotentreasoncoding = immunizationsubpotentreason.getCodingFirstRep();

		/******************** Immnztn_SubpotentRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationsubpotentreasoncoding.hasDisplay()) {
			i.setImmnztnSubpotentRsnCdgDsply(String.valueOf(immunizationsubpotentreasoncoding.getDisplay()));
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationsubpotentreasoncoding.hasVersion()) {
			i.setImmnztnSubpotentRsnCdgVrsn(String.valueOf(immunizationsubpotentreasoncoding.getVersion()));
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Cd ********************************************************************************/
		if(immunizationsubpotentreasoncoding.hasCode()) {
			i.setImmnztnSubpotentRsnCdgCd(String.valueOf(immunizationsubpotentreasoncoding.getCode()));
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Sys ********************************************************************************/
		if(immunizationsubpotentreasoncoding.hasSystem()) {
			i.setImmnztnSubpotentRsnCdgSys(String.valueOf(immunizationsubpotentreasoncoding.getSystem()));
		}
		/******************** Immnztn_SubpotentRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationsubpotentreasoncoding.hasUserSelected()) {
			i.setImmnztnSubpotentRsnCdgUsrSltd(String.valueOf(immunizationsubpotentreasoncoding.getUserSelected()));
		}
		/******************** Immnztn_SubpotentRsn_Txt ********************************************************************************/
		if(immunizationsubpotentreason.hasText()) {
			i.setImmnztnSubpotentRsnTxt(String.valueOf(immunizationsubpotentreason.getText()));
		}
		/******************** immunizationprogrameligibility ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationprogrameligibility = immunization.getProgramEligibilityFirstRep();

		/******************** immunizationprogrameligibilitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationprogrameligibilitycoding = immunizationprogrameligibility.getCodingFirstRep();

		/******************** Immnztn_PrgrmElgblty_Cdg_Dsply ********************************************************************************/
		if(immunizationprogrameligibilitycoding.hasDisplay()) {
			i.setImmnztnPrgrmElgbltyCdgDsply(String.valueOf(immunizationprogrameligibilitycoding.getDisplay()));
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Vrsn ********************************************************************************/
		if(immunizationprogrameligibilitycoding.hasVersion()) {
			i.setImmnztnPrgrmElgbltyCdgVrsn(String.valueOf(immunizationprogrameligibilitycoding.getVersion()));
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Cd ********************************************************************************/
		if(immunizationprogrameligibilitycoding.hasCode()) {
			i.setImmnztnPrgrmElgbltyCdgCd(String.valueOf(immunizationprogrameligibilitycoding.getCode()));
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Sys ********************************************************************************/
		if(immunizationprogrameligibilitycoding.hasSystem()) {
			i.setImmnztnPrgrmElgbltyCdgSys(String.valueOf(immunizationprogrameligibilitycoding.getSystem()));
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_UsrSltd ********************************************************************************/
		if(immunizationprogrameligibilitycoding.hasUserSelected()) {
			i.setImmnztnPrgrmElgbltyCdgUsrSltd(String.valueOf(immunizationprogrameligibilitycoding.getUserSelected()));
		}
		/******************** Immnztn_PrgrmElgblty_Txt ********************************************************************************/
		if(immunizationprogrameligibility.hasText()) {
			i.setImmnztnPrgrmElgbltyTxt(String.valueOf(immunizationprogrameligibility.getText()));
		}
		/******************** Immnztn_OccrnceStrgTyp ********************************************************************************/
		if(immunization.hasOccurrenceStringType()) {
			i.setImmnztnOccrnceStrgTyp(String.valueOf(immunization.getOccurrenceStringType()));
		}
		/******************** immunizationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationstatusreason = immunization.getStatusReason();

		/******************** immunizationstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationstatusreasoncoding = immunizationstatusreason.getCodingFirstRep();

		/******************** Immnztn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationstatusreasoncoding.hasDisplay()) {
			i.setImmnztnStsRsnCdgDsply(String.valueOf(immunizationstatusreasoncoding.getDisplay()));
		}
		/******************** Immnztn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationstatusreasoncoding.hasVersion()) {
			i.setImmnztnStsRsnCdgVrsn(String.valueOf(immunizationstatusreasoncoding.getVersion()));
		}
		/******************** Immnztn_StsRsn_Cdg_Cd ********************************************************************************/
		if(immunizationstatusreasoncoding.hasCode()) {
			i.setImmnztnStsRsnCdgCd(String.valueOf(immunizationstatusreasoncoding.getCode()));
		}
		/******************** Immnztn_StsRsn_Cdg_Sys ********************************************************************************/
		if(immunizationstatusreasoncoding.hasSystem()) {
			i.setImmnztnStsRsnCdgSys(String.valueOf(immunizationstatusreasoncoding.getSystem()));
		}
		/******************** Immnztn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationstatusreasoncoding.hasUserSelected()) {
			i.setImmnztnStsRsnCdgUsrSltd(String.valueOf(immunizationstatusreasoncoding.getUserSelected()));
		}
		/******************** Immnztn_StsRsn_Txt ********************************************************************************/
		if(immunizationstatusreason.hasText()) {
			i.setImmnztnStsRsnTxt(String.valueOf(immunizationstatusreason.getText()));
		}
		/******************** Immnztn_Manufacturer ********************************************************************************/
		if(immunization.hasManufacturer()) {
			i.setImmnztnManufacturer(String.valueOf(immunization.getManufacturer()));
		}
		/******************** Immnztn_ExpirationDt ********************************************************************************/
		if(immunization.hasExpirationDate()) {
			i.setImmnztnExpirationDt(String.valueOf(immunization.getExpirationDate()));
		}
		/******************** Immnztn_LotNmbr ********************************************************************************/
		if(immunization.hasLotNumber()) {
			i.setImmnztnLotNmbr(String.valueOf(immunization.getLotNumber()));
		}
		/******************** Immnztn_Pnt ********************************************************************************/
		if(immunization.hasPatient()) {
			i.setImmnztnPnt(String.valueOf(immunization.getPatient()));
		}
		/******************** Immnztn_RsnRfrnc ********************************************************************************/
		if(immunization.hasReasonReference()) {
			i.setImmnztnRsnRfrnc(String.valueOf(immunization.getReasonReferenceFirstRep()));
		}
		/******************** immunizationreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationreasoncode = immunization.getReasonCodeFirstRep();

		/******************** immunizationreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationreasoncodecoding = immunizationreasoncode.getCodingFirstRep();

		/******************** Immnztn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(immunizationreasoncodecoding.hasDisplay()) {
			i.setImmnztnRsnCdCdgDsply(String.valueOf(immunizationreasoncodecoding.getDisplay()));
		}
		/******************** Immnztn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationreasoncodecoding.hasVersion()) {
			i.setImmnztnRsnCdCdgVrsn(String.valueOf(immunizationreasoncodecoding.getVersion()));
		}
		/******************** Immnztn_RsnCd_Cdg_Cd ********************************************************************************/
		if(immunizationreasoncodecoding.hasCode()) {
			i.setImmnztnRsnCdCdgCd(String.valueOf(immunizationreasoncodecoding.getCode()));
		}
		/******************** Immnztn_RsnCd_Cdg_Sys ********************************************************************************/
		if(immunizationreasoncodecoding.hasSystem()) {
			i.setImmnztnRsnCdCdgSys(String.valueOf(immunizationreasoncodecoding.getSystem()));
		}
		/******************** Immnztn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationreasoncodecoding.hasUserSelected()) {
			i.setImmnztnRsnCdCdgUsrSltd(String.valueOf(immunizationreasoncodecoding.getUserSelected()));
		}
		/******************** Immnztn_RsnCd_Txt ********************************************************************************/
		if(immunizationreasoncode.hasText()) {
			i.setImmnztnRsnCdTxt(String.valueOf(immunizationreasoncode.getText()));
		}
		/******************** Immnztn_Recorded ********************************************************************************/
		if(immunization.hasRecorded()) {
			i.setImmnztnRecorded(String.valueOf(immunization.getRecorded()));
		}
		/******************** immunizationsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationsite = immunization.getSite();

		/******************** immunizationsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationsitecoding = immunizationsite.getCodingFirstRep();

		/******************** Immnztn_Site_Cdg_Dsply ********************************************************************************/
		if(immunizationsitecoding.hasDisplay()) {
			i.setImmnztnSiteCdgDsply(String.valueOf(immunizationsitecoding.getDisplay()));
		}
		/******************** Immnztn_Site_Cdg_Vrsn ********************************************************************************/
		if(immunizationsitecoding.hasVersion()) {
			i.setImmnztnSiteCdgVrsn(String.valueOf(immunizationsitecoding.getVersion()));
		}
		/******************** Immnztn_Site_Cdg_Cd ********************************************************************************/
		if(immunizationsitecoding.hasCode()) {
			i.setImmnztnSiteCdgCd(String.valueOf(immunizationsitecoding.getCode()));
		}
		/******************** Immnztn_Site_Cdg_Sys ********************************************************************************/
		if(immunizationsitecoding.hasSystem()) {
			i.setImmnztnSiteCdgSys(String.valueOf(immunizationsitecoding.getSystem()));
		}
		/******************** Immnztn_Site_Cdg_UsrSltd ********************************************************************************/
		if(immunizationsitecoding.hasUserSelected()) {
			i.setImmnztnSiteCdgUsrSltd(String.valueOf(immunizationsitecoding.getUserSelected()));
		}
		/******************** Immnztn_Site_Txt ********************************************************************************/
		if(immunizationsite.hasText()) {
			i.setImmnztnSiteTxt(String.valueOf(immunizationsite.getText()));
		}
		/******************** immunizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier immunizationidentifier = immunization.getIdentifierFirstRep();

		/******************** Immnztn_Id_Vl ********************************************************************************/
		if(immunizationidentifier.hasValue()) {
			i.setImmnztnIdVl(String.valueOf(immunizationidentifier.getValue()));
		}
		/******************** immunizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationidentifiertype = immunizationidentifier.getType();

		/******************** immunizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationidentifiertypecoding = immunizationidentifiertype.getCodingFirstRep();

		/******************** Immnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(immunizationidentifiertypecoding.hasDisplay()) {
			i.setImmnztnIdTypCdgDsply(String.valueOf(immunizationidentifiertypecoding.getDisplay()));
		}
		/******************** Immnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(immunizationidentifiertypecoding.hasVersion()) {
			i.setImmnztnIdTypCdgVrsn(String.valueOf(immunizationidentifiertypecoding.getVersion()));
		}
		/******************** Immnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(immunizationidentifiertypecoding.hasCode()) {
			i.setImmnztnIdTypCdgCd(String.valueOf(immunizationidentifiertypecoding.getCode()));
		}
		/******************** Immnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(immunizationidentifiertypecoding.hasSystem()) {
			i.setImmnztnIdTypCdgSys(String.valueOf(immunizationidentifiertypecoding.getSystem()));
		}
		/******************** Immnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(immunizationidentifiertypecoding.hasUserSelected()) {
			i.setImmnztnIdTypCdgUsrSltd(String.valueOf(immunizationidentifiertypecoding.getUserSelected()));
		}
		/******************** Immnztn_Id_Typ_Txt ********************************************************************************/
		if(immunizationidentifiertype.hasText()) {
			i.setImmnztnIdTypTxt(String.valueOf(immunizationidentifiertype.getText()));
		}
		/******************** Immnztn_Id_Sys ********************************************************************************/
		if(immunizationidentifier.hasSystem()) {
			i.setImmnztnIdSys(String.valueOf(immunizationidentifier.getSystem()));
		}
		/******************** Immnztn_Id_Assigner ********************************************************************************/
		if(immunizationidentifier.hasAssigner()) {
			i.setImmnztnIdAssigner(String.valueOf(immunizationidentifier.getAssigner()));
		}
		/******************** immunizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationidentifierperiod = immunizationidentifier.getPeriod();

		/******************** Immnztn_Id_Prd_End ********************************************************************************/
		if(immunizationidentifierperiod.hasEnd()) {
			i.setImmnztnIdPrdEnd(String.valueOf(immunizationidentifierperiod.getEnd()));
		}
		/******************** Immnztn_Id_Prd_Strt ********************************************************************************/
		if(immunizationidentifierperiod.hasStart()) {
			i.setImmnztnIdPrdStrt(String.valueOf(immunizationidentifierperiod.getStart()));
		}
		/******************** immunizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse immunizationidentifieruse = immunizationidentifier.getUse();
		i.setImmnztnIdUse(immunizationidentifieruse.toCode());

		/******************** immunizationvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationvaccinecode = immunization.getVaccineCode();

		/******************** immunizationvaccinecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationvaccinecodecoding = immunizationvaccinecode.getCodingFirstRep();

		/******************** Immnztn_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(immunizationvaccinecodecoding.hasDisplay()) {
			i.setImmnztnVaccineCdCdgDsply(String.valueOf(immunizationvaccinecodecoding.getDisplay()));
		}
		/******************** Immnztn_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationvaccinecodecoding.hasVersion()) {
			i.setImmnztnVaccineCdCdgVrsn(String.valueOf(immunizationvaccinecodecoding.getVersion()));
		}
		/******************** Immnztn_VaccineCd_Cdg_Cd ********************************************************************************/
		if(immunizationvaccinecodecoding.hasCode()) {
			i.setImmnztnVaccineCdCdgCd(String.valueOf(immunizationvaccinecodecoding.getCode()));
		}
		/******************** Immnztn_VaccineCd_Cdg_Sys ********************************************************************************/
		if(immunizationvaccinecodecoding.hasSystem()) {
			i.setImmnztnVaccineCdCdgSys(String.valueOf(immunizationvaccinecodecoding.getSystem()));
		}
		/******************** Immnztn_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationvaccinecodecoding.hasUserSelected()) {
			i.setImmnztnVaccineCdCdgUsrSltd(String.valueOf(immunizationvaccinecodecoding.getUserSelected()));
		}
		/******************** Immnztn_VaccineCd_Txt ********************************************************************************/
		if(immunizationvaccinecode.hasText()) {
			i.setImmnztnVaccineCdTxt(String.valueOf(immunizationvaccinecode.getText()));
		}
		/******************** Immnztn_PrimarySrc ********************************************************************************/
		if(immunization.hasPrimarySource()) {
			i.setImmnztnPrimarySrc(String.valueOf(immunization.getPrimarySource()));
		}
		/******************** immunizationreportorigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationreportorigin = immunization.getReportOrigin();

		/******************** immunizationreportorigincoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationreportorigincoding = immunizationreportorigin.getCodingFirstRep();

		/******************** Immnztn_RptOrigin_Cdg_Dsply ********************************************************************************/
		if(immunizationreportorigincoding.hasDisplay()) {
			i.setImmnztnRptOriginCdgDsply(String.valueOf(immunizationreportorigincoding.getDisplay()));
		}
		/******************** Immnztn_RptOrigin_Cdg_Vrsn ********************************************************************************/
		if(immunizationreportorigincoding.hasVersion()) {
			i.setImmnztnRptOriginCdgVrsn(String.valueOf(immunizationreportorigincoding.getVersion()));
		}
		/******************** Immnztn_RptOrigin_Cdg_Cd ********************************************************************************/
		if(immunizationreportorigincoding.hasCode()) {
			i.setImmnztnRptOriginCdgCd(String.valueOf(immunizationreportorigincoding.getCode()));
		}
		/******************** Immnztn_RptOrigin_Cdg_Sys ********************************************************************************/
		if(immunizationreportorigincoding.hasSystem()) {
			i.setImmnztnRptOriginCdgSys(String.valueOf(immunizationreportorigincoding.getSystem()));
		}
		/******************** Immnztn_RptOrigin_Cdg_UsrSltd ********************************************************************************/
		if(immunizationreportorigincoding.hasUserSelected()) {
			i.setImmnztnRptOriginCdgUsrSltd(String.valueOf(immunizationreportorigincoding.getUserSelected()));
		}
		/******************** Immnztn_RptOrigin_Txt ********************************************************************************/
		if(immunizationreportorigin.hasText()) {
			i.setImmnztnRptOriginTxt(String.valueOf(immunizationreportorigin.getText()));
		}
		/******************** immunizationroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationroute = immunization.getRoute();

		/******************** immunizationroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationroutecoding = immunizationroute.getCodingFirstRep();

		/******************** Immnztn_Route_Cdg_Dsply ********************************************************************************/
		if(immunizationroutecoding.hasDisplay()) {
			i.setImmnztnRouteCdgDsply(String.valueOf(immunizationroutecoding.getDisplay()));
		}
		/******************** Immnztn_Route_Cdg_Vrsn ********************************************************************************/
		if(immunizationroutecoding.hasVersion()) {
			i.setImmnztnRouteCdgVrsn(String.valueOf(immunizationroutecoding.getVersion()));
		}
		/******************** Immnztn_Route_Cdg_Cd ********************************************************************************/
		if(immunizationroutecoding.hasCode()) {
			i.setImmnztnRouteCdgCd(String.valueOf(immunizationroutecoding.getCode()));
		}
		/******************** Immnztn_Route_Cdg_Sys ********************************************************************************/
		if(immunizationroutecoding.hasSystem()) {
			i.setImmnztnRouteCdgSys(String.valueOf(immunizationroutecoding.getSystem()));
		}
		/******************** Immnztn_Route_Cdg_UsrSltd ********************************************************************************/
		if(immunizationroutecoding.hasUserSelected()) {
			i.setImmnztnRouteCdgUsrSltd(String.valueOf(immunizationroutecoding.getUserSelected()));
		}
		/******************** Immnztn_Route_Txt ********************************************************************************/
		if(immunizationroute.hasText()) {
			i.setImmnztnRouteTxt(String.valueOf(immunizationroute.getText()));
		}
		/******************** immunizationdosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity immunizationdosequantity = immunization.getDoseQuantity();

		/******************** Immnztn_DoseQnty_Vl ********************************************************************************/
		if(immunizationdosequantity.hasValue()) {
			i.setImmnztnDoseQntyVl(String.valueOf(immunizationdosequantity.getValue()));
		}
		/******************** immunizationdosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator immunizationdosequantitycomparator = immunizationdosequantity.getComparator();
		i.setImmnztnDoseQntyCmprtr(immunizationdosequantitycomparator.toCode());

		/******************** Immnztn_DoseQnty_Cd ********************************************************************************/
		if(immunizationdosequantity.hasCode()) {
			i.setImmnztnDoseQntyCd(String.valueOf(immunizationdosequantity.getCode()));
		}
		/******************** Immnztn_DoseQnty_Sys ********************************************************************************/
		if(immunizationdosequantity.hasSystem()) {
			i.setImmnztnDoseQntySys(String.valueOf(immunizationdosequantity.getSystem()));
		}
		/******************** Immnztn_DoseQnty_Unt ********************************************************************************/
		if(immunizationdosequantity.hasUnit()) {
			i.setImmnztnDoseQntyUnt(String.valueOf(immunizationdosequantity.getUnit()));
		}
		/******************** Immnztn_IsSubpotent ********************************************************************************/
		if(immunization.hasIsSubpotent()) {
			i.setImmnztnIsSubpotent(String.valueOf(immunization.getIsSubpotent()));
		}
		/******************** immunizationfundingsource ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationfundingsource = immunization.getFundingSource();

		/******************** immunizationfundingsourcecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationfundingsourcecoding = immunizationfundingsource.getCodingFirstRep();

		/******************** Immnztn_FundingSrc_Cdg_Dsply ********************************************************************************/
		if(immunizationfundingsourcecoding.hasDisplay()) {
			i.setImmnztnFundingSrcCdgDsply(String.valueOf(immunizationfundingsourcecoding.getDisplay()));
		}
		/******************** Immnztn_FundingSrc_Cdg_Vrsn ********************************************************************************/
		if(immunizationfundingsourcecoding.hasVersion()) {
			i.setImmnztnFundingSrcCdgVrsn(String.valueOf(immunizationfundingsourcecoding.getVersion()));
		}
		/******************** Immnztn_FundingSrc_Cdg_Cd ********************************************************************************/
		if(immunizationfundingsourcecoding.hasCode()) {
			i.setImmnztnFundingSrcCdgCd(String.valueOf(immunizationfundingsourcecoding.getCode()));
		}
		/******************** Immnztn_FundingSrc_Cdg_Sys ********************************************************************************/
		if(immunizationfundingsourcecoding.hasSystem()) {
			i.setImmnztnFundingSrcCdgSys(String.valueOf(immunizationfundingsourcecoding.getSystem()));
		}
		/******************** Immnztn_FundingSrc_Cdg_UsrSltd ********************************************************************************/
		if(immunizationfundingsourcecoding.hasUserSelected()) {
			i.setImmnztnFundingSrcCdgUsrSltd(String.valueOf(immunizationfundingsourcecoding.getUserSelected()));
		}
		/******************** Immnztn_FundingSrc_Txt ********************************************************************************/
		if(immunizationfundingsource.hasText()) {
			i.setImmnztnFundingSrcTxt(String.valueOf(immunizationfundingsource.getText()));
		}
		return i;
	}
}
