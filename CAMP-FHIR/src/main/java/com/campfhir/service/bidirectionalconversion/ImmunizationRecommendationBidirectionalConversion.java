package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationRecommendation;
public class ImmunizationRecommendationBidirectionalConversion 
{
	public ImmunizationRecommendation ImmunizationRecommendations(org.hl7.fhir.r4.model.ImmunizationRecommendation immunizationrecommendation) throws ParseException
	{
		 main.java.com.campfhir.model.ImmunizationRecommendation i = new  main.java.com.campfhir.model.ImmunizationRecommendation();

		/******************** id ********************************************************************************/
		immunizationrecommendation.setId(i.getId());

		/******************** ImmnztnRecmndation_Athrity ********************************************************************************/
		if(immunizationrecommendation.hasAuthority()) {
			i.setImmnztnRecmndationAthrity(String.valueOf(immunizationrecommendation.getAuthority()));
		}
		/******************** ImmnztnRecmndation_Dt ********************************************************************************/
		if(immunizationrecommendation.hasDate()) {
			i.setImmnztnRecmndationDt(String.valueOf(immunizationrecommendation.getDate()));
		}
		/******************** immunizationrecommendationrecommendation ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent immunizationrecommendationrecommendation = immunizationrecommendation.getRecommendationFirstRep();

		/******************** immunizationrecommendationrecommendationforecaststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationforecaststatus = immunizationrecommendationrecommendation.getForecastStatus();

		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatus.hasText()) {
			i.setImmnztnRecmndationRecmndationForecastStsTxt(String.valueOf(immunizationrecommendationrecommendationforecaststatus.getText()));
		}
		/******************** immunizationrecommendationrecommendationforecaststatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationforecaststatuscoding = immunizationrecommendationrecommendationforecaststatus.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasVersion()) {
			i.setImmnztnRecmndationRecmndationForecastStsCdgVrsn(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasDisplay()) {
			i.setImmnztnRecmndationRecmndationForecastStsCdgDsply(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasCode()) {
			i.setImmnztnRecmndationRecmndationForecastStsCdgCd(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasUserSelected()) {
			i.setImmnztnRecmndationRecmndationForecastStsCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasSystem()) {
			i.setImmnztnRecmndationRecmndationForecastStsCdgSys(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getSystem()));
		}
		/******************** ImmnztnRecmndation_Recmndation_Series ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSeries()) {
			i.setImmnztnRecmndationRecmndationSeries(String.valueOf(immunizationrecommendationrecommendation.getSeries()));
		}
		/******************** ImmnztnRecmndation_Recmndation_Dscrptn ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasDescription()) {
			i.setImmnztnRecmndationRecmndationDscrptn(String.valueOf(immunizationrecommendationrecommendation.getDescription()));
		}
		/******************** immunizationrecommendationrecommendationforecastreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationforecastreason = immunizationrecommendationrecommendation.getForecastReasonFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreason.hasText()) {
			i.setImmnztnRecmndationRecmndationForecastRsnTxt(String.valueOf(immunizationrecommendationrecommendationforecastreason.getText()));
		}
		/******************** immunizationrecommendationrecommendationforecastreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationforecastreasoncoding = immunizationrecommendationrecommendationforecastreason.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasVersion()) {
			i.setImmnztnRecmndationRecmndationForecastRsnCdgVrsn(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasDisplay()) {
			i.setImmnztnRecmndationRecmndationForecastRsnCdgDsply(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasCode()) {
			i.setImmnztnRecmndationRecmndationForecastRsnCdgCd(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasUserSelected()) {
			i.setImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasSystem()) {
			i.setImmnztnRecmndationRecmndationForecastRsnCdgSys(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getSystem()));
		}
		/******************** immunizationrecommendationrecommendationdatecriterion ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent immunizationrecommendationrecommendationdatecriterion = immunizationrecommendationrecommendation.getDateCriterionFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Vl ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterion.hasValue()) {
			i.setImmnztnRecmndationRecmndationDtCriterionVl(String.valueOf(immunizationrecommendationrecommendationdatecriterion.getValue()));
		}
		/******************** immunizationrecommendationrecommendationdatecriterioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationdatecriterioncode = immunizationrecommendationrecommendationdatecriterion.getCode();

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncode.hasText()) {
			i.setImmnztnRecmndationRecmndationDtCriterionCdTxt(String.valueOf(immunizationrecommendationrecommendationdatecriterioncode.getText()));
		}
		/******************** immunizationrecommendationrecommendationdatecriterioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationdatecriterioncodecoding = immunizationrecommendationrecommendationdatecriterioncode.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasVersion()) {
			i.setImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasDisplay()) {
			i.setImmnztnRecmndationRecmndationDtCriterionCdCdgDsply(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasCode()) {
			i.setImmnztnRecmndationRecmndationDtCriterionCdCdgCd(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasUserSelected()) {
			i.setImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasSystem()) {
			i.setImmnztnRecmndationRecmndationDtCriterionCdCdgSys(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getSystem()));
		}
		/******************** immunizationrecommendationrecommendationvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationvaccinecode = immunizationrecommendationrecommendation.getVaccineCodeFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecode.hasText()) {
			i.setImmnztnRecmndationRecmndationVaccineCdTxt(String.valueOf(immunizationrecommendationrecommendationvaccinecode.getText()));
		}
		/******************** immunizationrecommendationrecommendationvaccinecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationvaccinecodecoding = immunizationrecommendationrecommendationvaccinecode.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasVersion()) {
			i.setImmnztnRecmndationRecmndationVaccineCdCdgVrsn(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasDisplay()) {
			i.setImmnztnRecmndationRecmndationVaccineCdCdgDsply(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasCode()) {
			i.setImmnztnRecmndationRecmndationVaccineCdCdgCd(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasUserSelected()) {
			i.setImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasSystem()) {
			i.setImmnztnRecmndationRecmndationVaccineCdCdgSys(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getSystem()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SprtingImmnztn ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSupportingImmunization()) {
			i.setImmnztnRecmndationRecmndationSprtingImmnztn(String.valueOf(immunizationrecommendationrecommendation.getSupportingImmunizationFirstRep()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasDoseNumberPositiveIntType()) {
			i.setImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp(String.valueOf(immunizationrecommendationrecommendation.getDoseNumberPositiveIntType()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesStrgTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSeriesDosesStringType()) {
			i.setImmnztnRecmndationRecmndationSeriesDosesStrgTyp(String.valueOf(immunizationrecommendationrecommendation.getSeriesDosesStringType()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrStrgTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasDoseNumberStringType()) {
			i.setImmnztnRecmndationRecmndationDoseNmbrStrgTyp(String.valueOf(immunizationrecommendationrecommendation.getDoseNumberStringType()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSeriesDosesPositiveIntType()) {
			i.setImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp(String.valueOf(immunizationrecommendationrecommendation.getSeriesDosesPositiveIntType()));
		}
		/******************** immunizationrecommendationrecommendationtargetdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationtargetdisease = immunizationrecommendationrecommendation.getTargetDisease();

		/******************** ImmnztnRecmndation_Recmndation_TargetDisease_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdisease.hasText()) {
			i.setImmnztnRecmndationRecmndationTarDiseaseTxt(String.valueOf(immunizationrecommendationrecommendationtargetdisease.getText()));
		}
		/******************** immunizationrecommendationrecommendationtargetdiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationtargetdiseasecoding = immunizationrecommendationrecommendationtargetdisease.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_TargetDisease_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasVersion()) {
			i.setImmnztnRecmndationRecmndationTarDiseaseCdgVrsn(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Recmndation_TargetDisease_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasDisplay()) {
			i.setImmnztnRecmndationRecmndationTarDiseaseCdgDsply(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Recmndation_TargetDisease_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasCode()) {
			i.setImmnztnRecmndationRecmndationTarDiseaseCdgCd(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Recmndation_TargetDisease_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasUserSelected()) {
			i.setImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Recmndation_TargetDisease_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasSystem()) {
			i.setImmnztnRecmndationRecmndationTarDiseaseCdgSys(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getSystem()));
		}
		/******************** immunizationrecommendationrecommendationcontraindicatedvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationcontraindicatedvaccinecode = immunizationrecommendationrecommendation.getContraindicatedVaccineCodeFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecode.hasText()) {
			i.setImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecode.getText()));
		}
		/******************** immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding = immunizationrecommendationrecommendationcontraindicatedvaccinecode.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasVersion()) {
			i.setImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasDisplay()) {
			i.setImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasCode()) {
			i.setImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasUserSelected()) {
			i.setImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasSystem()) {
			i.setImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getSystem()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SprtingPntInfo ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSupportingPatientInformation()) {
			i.setImmnztnRecmndationRecmndationSprtingPntInfo(String.valueOf(immunizationrecommendationrecommendation.getSupportingPatientInformationFirstRep()));
		}
		/******************** ImmnztnRecmndation_Pnt ********************************************************************************/
		if(immunizationrecommendation.hasPatient()) {
			i.setImmnztnRecmndationPnt(String.valueOf(immunizationrecommendation.getPatient()));
		}
		/******************** immunizationrecommendationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier immunizationrecommendationidentifier = immunizationrecommendation.getIdentifierFirstRep();

		/******************** ImmnztnRecmndation_Id_Vl ********************************************************************************/
		if(immunizationrecommendationidentifier.hasValue()) {
			i.setImmnztnRecmndationIdVl(String.valueOf(immunizationrecommendationidentifier.getValue()));
		}
		/******************** immunizationrecommendationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationidentifiertype = immunizationrecommendationidentifier.getType();

		/******************** ImmnztnRecmndation_Id_Typ_Txt ********************************************************************************/
		if(immunizationrecommendationidentifiertype.hasText()) {
			i.setImmnztnRecmndationIdTypTxt(String.valueOf(immunizationrecommendationidentifiertype.getText()));
		}
		/******************** immunizationrecommendationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationidentifiertypecoding = immunizationrecommendationidentifiertype.getCodingFirstRep();

		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationidentifiertypecoding.hasVersion()) {
			i.setImmnztnRecmndationIdTypCdgVrsn(String.valueOf(immunizationrecommendationidentifiertypecoding.getVersion()));
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationidentifiertypecoding.hasDisplay()) {
			i.setImmnztnRecmndationIdTypCdgDsply(String.valueOf(immunizationrecommendationidentifiertypecoding.getDisplay()));
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationidentifiertypecoding.hasCode()) {
			i.setImmnztnRecmndationIdTypCdgCd(String.valueOf(immunizationrecommendationidentifiertypecoding.getCode()));
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationidentifiertypecoding.hasUserSelected()) {
			i.setImmnztnRecmndationIdTypCdgUsrSltd(String.valueOf(immunizationrecommendationidentifiertypecoding.getUserSelected()));
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationidentifiertypecoding.hasSystem()) {
			i.setImmnztnRecmndationIdTypCdgSys(String.valueOf(immunizationrecommendationidentifiertypecoding.getSystem()));
		}
		/******************** immunizationrecommendationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationrecommendationidentifierperiod = immunizationrecommendationidentifier.getPeriod();

		/******************** ImmnztnRecmndation_Id_Prd_Strt ********************************************************************************/
		if(immunizationrecommendationidentifierperiod.hasStart()) {
			i.setImmnztnRecmndationIdPrdStrt(String.valueOf(immunizationrecommendationidentifierperiod.getStart()));
		}
		/******************** ImmnztnRecmndation_Id_Prd_End ********************************************************************************/
		if(immunizationrecommendationidentifierperiod.hasEnd()) {
			i.setImmnztnRecmndationIdPrdEnd(String.valueOf(immunizationrecommendationidentifierperiod.getEnd()));
		}
		/******************** ImmnztnRecmndation_Id_Assigner ********************************************************************************/
		if(immunizationrecommendationidentifier.hasAssigner()) {
			i.setImmnztnRecmndationIdAssigner(String.valueOf(immunizationrecommendationidentifier.getAssigner()));
		}
		/******************** ImmnztnRecmndation_Id_Sys ********************************************************************************/
		if(immunizationrecommendationidentifier.hasSystem()) {
			i.setImmnztnRecmndationIdSys(String.valueOf(immunizationrecommendationidentifier.getSystem()));
		}
		/******************** immunizationrecommendationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse immunizationrecommendationidentifieruse = immunizationrecommendationidentifier.getUse();
		i.setImmnztnRecmndationIdUse(immunizationrecommendationidentifieruse.toCode());

		return i;
	}
}
