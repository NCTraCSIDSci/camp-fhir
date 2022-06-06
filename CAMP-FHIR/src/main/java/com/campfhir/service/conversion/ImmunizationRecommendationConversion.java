package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationRecommendation;
public class ImmunizationRecommendationConversion 
{
	public org.hl7.fhir.r4.model.ImmunizationRecommendation ImmunizationRecommendations(ImmunizationRecommendation i) throws ParseException
	{
		org.hl7.fhir.r4.model.ImmunizationRecommendation immunizationrecommendation = new org.hl7.fhir.r4.model.ImmunizationRecommendation();

		/******************** id ********************************************************************************/
		immunizationrecommendation.setId(i.getId());

		/******************** ImmnztnRecmndation_Athrity ********************************************************************************/
		if(i.getImmnztnRecmndationAthrity() != null) {
			immunizationrecommendation.setAuthority( new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationAthrity()));
		}
		/******************** ImmnztnRecmndation_Dt ********************************************************************************/
		if(i.getImmnztnRecmndationDt() != null) {
			java.text.SimpleDateFormat ImmnztnRecmndation_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnRecmndation_Dtdate = ImmnztnRecmndation_Dtsdf.parse(i.getImmnztnRecmndationDt());
			immunizationrecommendation.setDate(ImmnztnRecmndation_Dtdate);
		}
		/******************** immunizationrecommendationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier immunizationrecommendationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		immunizationrecommendation.addIdentifier(immunizationrecommendationidentifier);

		/******************** ImmnztnRecmndation_Id_Assigner ********************************************************************************/
		if(i.getImmnztnRecmndationIdAssigner() != null) {
			immunizationrecommendationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationIdAssigner()));
		}
		/******************** immunizationrecommendationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationrecommendationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		immunizationrecommendationidentifier.setPeriod(immunizationrecommendationidentifierperiod);

		/******************** ImmnztnRecmndation_Id_Prd_End ********************************************************************************/
		if(i.getImmnztnRecmndationIdPrdEnd() != null) {
			java.text.SimpleDateFormat ImmnztnRecmndation_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnRecmndation_Id_Prd_Enddate = ImmnztnRecmndation_Id_Prd_Endsdf.parse(i.getImmnztnRecmndationIdPrdEnd());
			immunizationrecommendationidentifierperiod.setEnd(ImmnztnRecmndation_Id_Prd_Enddate);
		}
		/******************** ImmnztnRecmndation_Id_Prd_Strt ********************************************************************************/
		if(i.getImmnztnRecmndationIdPrdStrt() != null) {
			java.text.SimpleDateFormat ImmnztnRecmndation_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnRecmndation_Id_Prd_Strtdate = ImmnztnRecmndation_Id_Prd_Strtsdf.parse(i.getImmnztnRecmndationIdPrdStrt());
			immunizationrecommendationidentifierperiod.setStart(ImmnztnRecmndation_Id_Prd_Strtdate);
		}
		/******************** ImmnztnRecmndation_Id_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationIdSys() != null) {
			immunizationrecommendationidentifier.setSystem(i.getImmnztnRecmndationIdSys());
		}
		/******************** immunizationrecommendationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationidentifier.setType(immunizationrecommendationidentifiertype);

		/******************** immunizationrecommendationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationidentifiertype.addCoding(immunizationrecommendationidentifiertypecoding);

		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgCd() != null) {
			immunizationrecommendationidentifiertypecoding.setCode(i.getImmnztnRecmndationIdTypCdgCd());
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgDsply() != null) {
			immunizationrecommendationidentifiertypecoding.setDisplay(i.getImmnztnRecmndationIdTypCdgDsply());
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgSys() != null) {
			immunizationrecommendationidentifiertypecoding.setSystem(i.getImmnztnRecmndationIdTypCdgSys());
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgUsrSltd() != null) {
			immunizationrecommendationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationIdTypCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgVrsn() != null) {
			immunizationrecommendationidentifiertypecoding.setVersion(i.getImmnztnRecmndationIdTypCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Id_Typ_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypTxt() != null) {
			immunizationrecommendationidentifiertype.setText(i.getImmnztnRecmndationIdTypTxt());
		}
		/******************** immunizationrecommendationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory immunizationrecommendationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		immunizationrecommendationidentifier.setUse(immunizationrecommendationidentifieruse.fromCode(i.getImmnztnRecmndationIdUse()));

		/******************** ImmnztnRecmndation_Id_Vl ********************************************************************************/
		if(i.getImmnztnRecmndationIdVl() != null) {
			immunizationrecommendationidentifier.setValue(i.getImmnztnRecmndationIdVl());
		}
		/******************** ImmnztnRecmndation_Pnt ********************************************************************************/
		if(i.getImmnztnRecmndationPnt() != null) {
			immunizationrecommendation.setPatient( new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationPnt()));
		}
		/******************** immunizationrecommendationrecommendation ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent immunizationrecommendationrecommendation =  new org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent();
		immunizationrecommendation.addRecommendation(immunizationrecommendationrecommendation);

		/******************** immunizationrecommendationrecommendationcontraindicatedvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationcontraindicatedvaccinecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationrecommendation.addContraindicatedVaccineCode(immunizationrecommendationrecommendationcontraindicatedvaccinecode);

		/******************** immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationrecommendationcontraindicatedvaccinecode.addCoding(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding);

		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd() != null) {
			immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.setCode(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd());
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply() != null) {
			immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.setDisplay(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply());
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys() != null) {
			immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.setSystem(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys());
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd() != null) {
			immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn() != null) {
			immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.setVersion(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt() != null) {
			immunizationrecommendationrecommendationcontraindicatedvaccinecode.setText(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt());
		}
		/******************** immunizationrecommendationrecommendationdatecriterion ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent immunizationrecommendationrecommendationdatecriterion =  new org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent();
		immunizationrecommendationrecommendation.addDateCriterion(immunizationrecommendationrecommendationdatecriterion);

		/******************** immunizationrecommendationrecommendationdatecriterioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationdatecriterioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationrecommendationdatecriterion.setCode(immunizationrecommendationrecommendationdatecriterioncode);

		/******************** immunizationrecommendationrecommendationdatecriterioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationdatecriterioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationrecommendationdatecriterioncode.addCoding(immunizationrecommendationrecommendationdatecriterioncodecoding);

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgCd() != null) {
			immunizationrecommendationrecommendationdatecriterioncodecoding.setCode(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgCd());
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgDsply() != null) {
			immunizationrecommendationrecommendationdatecriterioncodecoding.setDisplay(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgDsply());
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgSys() != null) {
			immunizationrecommendationrecommendationdatecriterioncodecoding.setSystem(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgSys());
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd() != null) {
			immunizationrecommendationrecommendationdatecriterioncodecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn() != null) {
			immunizationrecommendationrecommendationdatecriterioncodecoding.setVersion(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdTxt() != null) {
			immunizationrecommendationrecommendationdatecriterioncode.setText(i.getImmnztnRecmndationRecmndationDtCriterionCdTxt());
		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Vl ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionVl() != null) {
			java.text.SimpleDateFormat ImmnztnRecmndation_Recmndation_DtCriterion_Vlsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnRecmndation_Recmndation_DtCriterion_Vldate = ImmnztnRecmndation_Recmndation_DtCriterion_Vlsdf.parse(i.getImmnztnRecmndationRecmndationDtCriterionVl());
			immunizationrecommendationrecommendationdatecriterion.setValue(ImmnztnRecmndation_Recmndation_DtCriterion_Vldate);
		}
		/******************** ImmnztnRecmndation_Recmndation_Dscrptn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDscrptn() != null) {
			immunizationrecommendationrecommendation.setDescription(i.getImmnztnRecmndationRecmndationDscrptn());
		}
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp() != null) {
			immunizationrecommendationrecommendation.setDoseNumber( new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp()));
		}
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrStrgTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDoseNmbrStrgTyp() != null) {
			immunizationrecommendationrecommendation.setDoseNumber( new org.hl7.fhir.r4.model.StringType(i.getImmnztnRecmndationRecmndationDoseNmbrStrgTyp()));
		}
		/******************** immunizationrecommendationrecommendationforecastreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationforecastreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationrecommendation.addForecastReason(immunizationrecommendationrecommendationforecastreason);

		/******************** immunizationrecommendationrecommendationforecastreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationforecastreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationrecommendationforecastreason.addCoding(immunizationrecommendationrecommendationforecastreasoncoding);

		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgCd() != null) {
			immunizationrecommendationrecommendationforecastreasoncoding.setCode(i.getImmnztnRecmndationRecmndationForecastRsnCdgCd());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgDsply() != null) {
			immunizationrecommendationrecommendationforecastreasoncoding.setDisplay(i.getImmnztnRecmndationRecmndationForecastRsnCdgDsply());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgSys() != null) {
			immunizationrecommendationrecommendationforecastreasoncoding.setSystem(i.getImmnztnRecmndationRecmndationForecastRsnCdgSys());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd() != null) {
			immunizationrecommendationrecommendationforecastreasoncoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgVrsn() != null) {
			immunizationrecommendationrecommendationforecastreasoncoding.setVersion(i.getImmnztnRecmndationRecmndationForecastRsnCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnTxt() != null) {
			immunizationrecommendationrecommendationforecastreason.setText(i.getImmnztnRecmndationRecmndationForecastRsnTxt());
		}
		/******************** immunizationrecommendationrecommendationforecaststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationforecaststatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationrecommendation.setForecastStatus(immunizationrecommendationrecommendationforecaststatus);

		/******************** immunizationrecommendationrecommendationforecaststatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationforecaststatuscoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationrecommendationforecaststatus.addCoding(immunizationrecommendationrecommendationforecaststatuscoding);

		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgCd() != null) {
			immunizationrecommendationrecommendationforecaststatuscoding.setCode(i.getImmnztnRecmndationRecmndationForecastStsCdgCd());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgDsply() != null) {
			immunizationrecommendationrecommendationforecaststatuscoding.setDisplay(i.getImmnztnRecmndationRecmndationForecastStsCdgDsply());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgSys() != null) {
			immunizationrecommendationrecommendationforecaststatuscoding.setSystem(i.getImmnztnRecmndationRecmndationForecastStsCdgSys());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgUsrSltd() != null) {
			immunizationrecommendationrecommendationforecaststatuscoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationRecmndationForecastStsCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgVrsn() != null) {
			immunizationrecommendationrecommendationforecaststatuscoding.setVersion(i.getImmnztnRecmndationRecmndationForecastStsCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsTxt() != null) {
			immunizationrecommendationrecommendationforecaststatus.setText(i.getImmnztnRecmndationRecmndationForecastStsTxt());
		}
		/******************** ImmnztnRecmndation_Recmndation_Series ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSeries() != null) {
			immunizationrecommendationrecommendation.setSeries(i.getImmnztnRecmndationRecmndationSeries());
		}
		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp() != null) {
			immunizationrecommendationrecommendation.setSeriesDoses( new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesStrgTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSeriesDosesStrgTyp() != null) {
			immunizationrecommendationrecommendation.setSeriesDoses( new org.hl7.fhir.r4.model.StringType(i.getImmnztnRecmndationRecmndationSeriesDosesStrgTyp()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SprtingImmnztn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSprtingImmnztn() != null) {
			immunizationrecommendationrecommendation.addSupportingImmunization( new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationRecmndationSprtingImmnztn()));
		}
		/******************** ImmnztnRecmndation_Recmndation_SprtingPntInfo ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSprtingPntInfo() != null) {
			immunizationrecommendationrecommendation.addSupportingPatientInformation( new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationRecmndationSprtingPntInfo()));
		}
		/******************** immunizationrecommendationrecommendationtardisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationtardisease =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationrecommendation.setTargetDisease(immunizationrecommendationrecommendationtardisease);

		/******************** immunizationrecommendationrecommendationtardiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationtardiseasecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationrecommendationtardisease.addCoding(immunizationrecommendationrecommendationtardiseasecoding);

		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgCd() != null) {
			immunizationrecommendationrecommendationtardiseasecoding.setCode(i.getImmnztnRecmndationRecmndationTarDiseaseCdgCd());
		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgDsply() != null) {
			immunizationrecommendationrecommendationtardiseasecoding.setDisplay(i.getImmnztnRecmndationRecmndationTarDiseaseCdgDsply());
		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgSys() != null) {
			immunizationrecommendationrecommendationtardiseasecoding.setSystem(i.getImmnztnRecmndationRecmndationTarDiseaseCdgSys());
		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd() != null) {
			immunizationrecommendationrecommendationtardiseasecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgVrsn() != null) {
			immunizationrecommendationrecommendationtardiseasecoding.setVersion(i.getImmnztnRecmndationRecmndationTarDiseaseCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseTxt() != null) {
			immunizationrecommendationrecommendationtardisease.setText(i.getImmnztnRecmndationRecmndationTarDiseaseTxt());
		}
		/******************** immunizationrecommendationrecommendationvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationvaccinecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationrecommendationrecommendation.addVaccineCode(immunizationrecommendationrecommendationvaccinecode);

		/******************** immunizationrecommendationrecommendationvaccinecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationrecommendationrecommendationvaccinecodecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationrecommendationrecommendationvaccinecode.addCoding(immunizationrecommendationrecommendationvaccinecodecoding);

		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgCd() != null) {
			immunizationrecommendationrecommendationvaccinecodecoding.setCode(i.getImmnztnRecmndationRecmndationVaccineCdCdgCd());
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgDsply() != null) {
			immunizationrecommendationrecommendationvaccinecodecoding.setDisplay(i.getImmnztnRecmndationRecmndationVaccineCdCdgDsply());
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgSys() != null) {
			immunizationrecommendationrecommendationvaccinecodecoding.setSystem(i.getImmnztnRecmndationRecmndationVaccineCdCdgSys());
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd() != null) {
			immunizationrecommendationrecommendationvaccinecodecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd()));
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgVrsn() != null) {
			immunizationrecommendationrecommendationvaccinecodecoding.setVersion(i.getImmnztnRecmndationRecmndationVaccineCdCdgVrsn());
		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdTxt() != null) {
			immunizationrecommendationrecommendationvaccinecode.setText(i.getImmnztnRecmndationRecmndationVaccineCdTxt());
		}
		return immunizationrecommendation;
	}
}
