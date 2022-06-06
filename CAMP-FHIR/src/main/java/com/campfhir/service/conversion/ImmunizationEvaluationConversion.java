package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationEvaluation;
public class ImmunizationEvaluationConversion 
{
	public org.hl7.fhir.r4.model.ImmunizationEvaluation ImmunizationEvaluations(ImmunizationEvaluation i) throws ParseException
	{
		org.hl7.fhir.r4.model.ImmunizationEvaluation immunizationevaluation = new org.hl7.fhir.r4.model.ImmunizationEvaluation();

		/******************** id ********************************************************************************/
		immunizationevaluation.setId(i.getId());

		/******************** ImmnztnEvaluation_Athrity ********************************************************************************/
		if(i.getImmnztnEvaluationAthrity() != null) {
			immunizationevaluation.setAuthority( new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationAthrity()));
		}
		/******************** ImmnztnEvaluation_Dt ********************************************************************************/
		if(i.getImmnztnEvaluationDt() != null) {
			java.text.SimpleDateFormat ImmnztnEvaluation_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnEvaluation_Dtdate = ImmnztnEvaluation_Dtsdf.parse(i.getImmnztnEvaluationDt());
			immunizationevaluation.setDate(ImmnztnEvaluation_Dtdate);
		}
		/******************** ImmnztnEvaluation_Dscrptn ********************************************************************************/
		if(i.getImmnztnEvaluationDscrptn() != null) {
			immunizationevaluation.setDescription(i.getImmnztnEvaluationDscrptn());
		}
		/******************** ImmnztnEvaluation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnEvaluationDoseNmbrPositiveIntTyp() != null) {
			immunizationevaluation.setDoseNumber( new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnEvaluationDoseNmbrPositiveIntTyp()));
		}
		/******************** ImmnztnEvaluation_DoseNmbrStrgTyp ********************************************************************************/
		if(i.getImmnztnEvaluationDoseNmbrStrgTyp() != null) {
			immunizationevaluation.setDoseNumber( new org.hl7.fhir.r4.model.StringType(i.getImmnztnEvaluationDoseNmbrStrgTyp()));
		}
		/******************** immunizationevaluationdosestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationdosestatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationevaluation.setDoseStatus(immunizationevaluationdosestatus);

		/******************** immunizationevaluationdosestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationdosestatuscoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationevaluationdosestatus.addCoding(immunizationevaluationdosestatuscoding);

		/******************** ImmnztnEvaluation_DoseSts_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgCd() != null) {
			immunizationevaluationdosestatuscoding.setCode(i.getImmnztnEvaluationDoseStsCdgCd());
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgDsply() != null) {
			immunizationevaluationdosestatuscoding.setDisplay(i.getImmnztnEvaluationDoseStsCdgDsply());
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgSys() != null) {
			immunizationevaluationdosestatuscoding.setSystem(i.getImmnztnEvaluationDoseStsCdgSys());
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgUsrSltd() != null) {
			immunizationevaluationdosestatuscoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnEvaluationDoseStsCdgUsrSltd()));
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgVrsn() != null) {
			immunizationevaluationdosestatuscoding.setVersion(i.getImmnztnEvaluationDoseStsCdgVrsn());
		}
		/******************** ImmnztnEvaluation_DoseSts_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsTxt() != null) {
			immunizationevaluationdosestatus.setText(i.getImmnztnEvaluationDoseStsTxt());
		}
		/******************** immunizationevaluationdosestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationdosestatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationevaluation.addDoseStatusReason(immunizationevaluationdosestatusreason);

		/******************** immunizationevaluationdosestatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationdosestatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationevaluationdosestatusreason.addCoding(immunizationevaluationdosestatusreasoncoding);

		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgCd() != null) {
			immunizationevaluationdosestatusreasoncoding.setCode(i.getImmnztnEvaluationDoseStsRsnCdgCd());
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgDsply() != null) {
			immunizationevaluationdosestatusreasoncoding.setDisplay(i.getImmnztnEvaluationDoseStsRsnCdgDsply());
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgSys() != null) {
			immunizationevaluationdosestatusreasoncoding.setSystem(i.getImmnztnEvaluationDoseStsRsnCdgSys());
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgUsrSltd() != null) {
			immunizationevaluationdosestatusreasoncoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnEvaluationDoseStsRsnCdgUsrSltd()));
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgVrsn() != null) {
			immunizationevaluationdosestatusreasoncoding.setVersion(i.getImmnztnEvaluationDoseStsRsnCdgVrsn());
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnTxt() != null) {
			immunizationevaluationdosestatusreason.setText(i.getImmnztnEvaluationDoseStsRsnTxt());
		}
		/******************** immunizationevaluationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier immunizationevaluationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		immunizationevaluation.addIdentifier(immunizationevaluationidentifier);

		/******************** ImmnztnEvaluation_Id_Assigner ********************************************************************************/
		if(i.getImmnztnEvaluationIdAssigner() != null) {
			immunizationevaluationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationIdAssigner()));
		}
		/******************** immunizationevaluationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationevaluationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		immunizationevaluationidentifier.setPeriod(immunizationevaluationidentifierperiod);

		/******************** ImmnztnEvaluation_Id_Prd_End ********************************************************************************/
		if(i.getImmnztnEvaluationIdPrdEnd() != null) {
			java.text.SimpleDateFormat ImmnztnEvaluation_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnEvaluation_Id_Prd_Enddate = ImmnztnEvaluation_Id_Prd_Endsdf.parse(i.getImmnztnEvaluationIdPrdEnd());
			immunizationevaluationidentifierperiod.setEnd(ImmnztnEvaluation_Id_Prd_Enddate);
		}
		/******************** ImmnztnEvaluation_Id_Prd_Strt ********************************************************************************/
		if(i.getImmnztnEvaluationIdPrdStrt() != null) {
			java.text.SimpleDateFormat ImmnztnEvaluation_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImmnztnEvaluation_Id_Prd_Strtdate = ImmnztnEvaluation_Id_Prd_Strtsdf.parse(i.getImmnztnEvaluationIdPrdStrt());
			immunizationevaluationidentifierperiod.setStart(ImmnztnEvaluation_Id_Prd_Strtdate);
		}
		/******************** ImmnztnEvaluation_Id_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationIdSys() != null) {
			immunizationevaluationidentifier.setSystem(i.getImmnztnEvaluationIdSys());
		}
		/******************** immunizationevaluationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationevaluationidentifier.setType(immunizationevaluationidentifiertype);

		/******************** immunizationevaluationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationevaluationidentifiertype.addCoding(immunizationevaluationidentifiertypecoding);

		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgCd() != null) {
			immunizationevaluationidentifiertypecoding.setCode(i.getImmnztnEvaluationIdTypCdgCd());
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgDsply() != null) {
			immunizationevaluationidentifiertypecoding.setDisplay(i.getImmnztnEvaluationIdTypCdgDsply());
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgSys() != null) {
			immunizationevaluationidentifiertypecoding.setSystem(i.getImmnztnEvaluationIdTypCdgSys());
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgUsrSltd() != null) {
			immunizationevaluationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnEvaluationIdTypCdgUsrSltd()));
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgVrsn() != null) {
			immunizationevaluationidentifiertypecoding.setVersion(i.getImmnztnEvaluationIdTypCdgVrsn());
		}
		/******************** ImmnztnEvaluation_Id_Typ_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypTxt() != null) {
			immunizationevaluationidentifiertype.setText(i.getImmnztnEvaluationIdTypTxt());
		}
		/******************** immunizationevaluationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory immunizationevaluationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		immunizationevaluationidentifier.setUse(immunizationevaluationidentifieruse.fromCode(i.getImmnztnEvaluationIdUse()));

		/******************** ImmnztnEvaluation_Id_Vl ********************************************************************************/
		if(i.getImmnztnEvaluationIdVl() != null) {
			immunizationevaluationidentifier.setValue(i.getImmnztnEvaluationIdVl());
		}
		/******************** ImmnztnEvaluation_ImmnztnEvnt ********************************************************************************/
		if(i.getImmnztnEvaluationImmnztnEvnt() != null) {
			immunizationevaluation.setImmunizationEvent( new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationImmnztnEvnt()));
		}
		/******************** ImmnztnEvaluation_Pnt ********************************************************************************/
		if(i.getImmnztnEvaluationPnt() != null) {
			immunizationevaluation.setPatient( new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationPnt()));
		}
		/******************** ImmnztnEvaluation_Series ********************************************************************************/
		if(i.getImmnztnEvaluationSeries() != null) {
			immunizationevaluation.setSeries(i.getImmnztnEvaluationSeries());
		}
		/******************** ImmnztnEvaluation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnEvaluationSeriesDosesPositiveIntTyp() != null) {
			immunizationevaluation.setSeriesDoses( new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnEvaluationSeriesDosesPositiveIntTyp()));
		}
		/******************** ImmnztnEvaluation_SeriesDosesStrgTyp ********************************************************************************/
		if(i.getImmnztnEvaluationSeriesDosesStrgTyp() != null) {
			immunizationevaluation.setSeriesDoses( new org.hl7.fhir.r4.model.StringType(i.getImmnztnEvaluationSeriesDosesStrgTyp()));
		}
		/******************** immunizationevaluationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationEvaluation.ImmunizationEvaluationStatusEnumFactory immunizationevaluationstatus =  new org.hl7.fhir.r4.model.ImmunizationEvaluation.ImmunizationEvaluationStatusEnumFactory();
		immunizationevaluation.setStatus(immunizationevaluationstatus.fromCode(i.getImmnztnEvaluationSts()));

		/******************** immunizationevaluationtardisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationtardisease =  new org.hl7.fhir.r4.model.CodeableConcept();
		immunizationevaluation.setTargetDisease(immunizationevaluationtardisease);

		/******************** immunizationevaluationtardiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationtardiseasecoding =  new org.hl7.fhir.r4.model.Coding();
		immunizationevaluationtardisease.addCoding(immunizationevaluationtardiseasecoding);

		/******************** ImmnztnEvaluation_TarDisease_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgCd() != null) {
			immunizationevaluationtardiseasecoding.setCode(i.getImmnztnEvaluationTarDiseaseCdgCd());
		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgDsply() != null) {
			immunizationevaluationtardiseasecoding.setDisplay(i.getImmnztnEvaluationTarDiseaseCdgDsply());
		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgSys() != null) {
			immunizationevaluationtardiseasecoding.setSystem(i.getImmnztnEvaluationTarDiseaseCdgSys());
		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgUsrSltd() != null) {
			immunizationevaluationtardiseasecoding.setUserSelected(Boolean.parseBoolean(i.getImmnztnEvaluationTarDiseaseCdgUsrSltd()));
		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgVrsn() != null) {
			immunizationevaluationtardiseasecoding.setVersion(i.getImmnztnEvaluationTarDiseaseCdgVrsn());
		}
		/******************** ImmnztnEvaluation_TarDisease_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseTxt() != null) {
			immunizationevaluationtardisease.setText(i.getImmnztnEvaluationTarDiseaseTxt());
		}
		return immunizationevaluation;
	}
}
