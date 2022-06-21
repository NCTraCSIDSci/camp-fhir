package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationEvaluation;
public class ImmunizationEvaluationBidirectionalConversion 
{
	public ImmunizationEvaluation ImmunizationEvaluations(org.hl7.fhir.r4.model.ImmunizationEvaluation immunizationevaluation) throws ParseException
	{
		 main.java.com.campfhir.model.ImmunizationEvaluation i = new  main.java.com.campfhir.model.ImmunizationEvaluation();

		/******************** id ********************************************************************************/
		immunizationevaluation.setId(i.getId());

		/******************** ImmnztnEvaluation_Athrity ********************************************************************************/
		if(immunizationevaluation.hasAuthority()) {
			i.setImmnztnEvaluationAthrity(String.valueOf(immunizationevaluation.getAuthority()));
		}
		/******************** ImmnztnEvaluation_Dt ********************************************************************************/
		if(immunizationevaluation.hasDate()) {
			i.setImmnztnEvaluationDt(String.valueOf(immunizationevaluation.getDate()));
		}
		/******************** immunizationevaluationdosestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationdosestatusreason = immunizationevaluation.getDoseStatusReasonFirstRep();

		/******************** immunizationevaluationdosestatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationdosestatusreasoncoding = immunizationevaluationdosestatusreason.getCodingFirstRep();

		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncoding.hasDisplay()) {
			i.setImmnztnEvaluationDoseStsRsnCdgDsply(String.valueOf(immunizationevaluationdosestatusreasoncoding.getDisplay()));
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncoding.hasVersion()) {
			i.setImmnztnEvaluationDoseStsRsnCdgVrsn(String.valueOf(immunizationevaluationdosestatusreasoncoding.getVersion()));
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncoding.hasCode()) {
			i.setImmnztnEvaluationDoseStsRsnCdgCd(String.valueOf(immunizationevaluationdosestatusreasoncoding.getCode()));
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncoding.hasSystem()) {
			i.setImmnztnEvaluationDoseStsRsnCdgSys(String.valueOf(immunizationevaluationdosestatusreasoncoding.getSystem()));
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncoding.hasUserSelected()) {
			i.setImmnztnEvaluationDoseStsRsnCdgUsrSltd(String.valueOf(immunizationevaluationdosestatusreasoncoding.getUserSelected()));
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Txt ********************************************************************************/
		if(immunizationevaluationdosestatusreason.hasText()) {
			i.setImmnztnEvaluationDoseStsRsnTxt(String.valueOf(immunizationevaluationdosestatusreason.getText()));
		}
		/******************** ImmnztnEvaluation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(immunizationevaluation.hasDoseNumberPositiveIntType()) {
			i.setImmnztnEvaluationDoseNmbrPositiveIntTyp(String.valueOf(immunizationevaluation.getDoseNumberPositiveIntType()));
		}
		/******************** ImmnztnEvaluation_ImmnztnEvnt ********************************************************************************/
		if(immunizationevaluation.hasImmunizationEvent()) {
			i.setImmnztnEvaluationImmnztnEvnt(String.valueOf(immunizationevaluation.getImmunizationEvent()));
		}
		/******************** ImmnztnEvaluation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(immunizationevaluation.hasSeriesDosesPositiveIntType()) {
			i.setImmnztnEvaluationSeriesDosesPositiveIntTyp(String.valueOf(immunizationevaluation.getSeriesDosesPositiveIntType()));
		}
		/******************** ImmnztnEvaluation_SeriesDosesStrgTyp ********************************************************************************/
		if(immunizationevaluation.hasSeriesDosesStringType()) {
			i.setImmnztnEvaluationSeriesDosesStrgTyp(String.valueOf(immunizationevaluation.getSeriesDosesStringType()));
		}
		/******************** ImmnztnEvaluation_DoseNmbrStrgTyp ********************************************************************************/
		if(immunizationevaluation.hasDoseNumberStringType()) {
			i.setImmnztnEvaluationDoseNmbrStrgTyp(String.valueOf(immunizationevaluation.getDoseNumberStringType()));
		}
		/******************** immunizationevaluationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationEvaluation.ImmunizationEvaluationStatus immunizationevaluationstatus = immunizationevaluation.getStatus();
		i.setImmnztnEvaluationSts(immunizationevaluationstatus.toCode());

		/******************** ImmnztnEvaluation_Dscrptn ********************************************************************************/
		if(immunizationevaluation.hasDescription()) {
			i.setImmnztnEvaluationDscrptn(String.valueOf(immunizationevaluation.getDescription()));
		}
		/******************** ImmnztnEvaluation_Series ********************************************************************************/
		if(immunizationevaluation.hasSeries()) {
			i.setImmnztnEvaluationSeries(String.valueOf(immunizationevaluation.getSeries()));
		}
		/******************** ImmnztnEvaluation_Pnt ********************************************************************************/
		if(immunizationevaluation.hasPatient()) {
			i.setImmnztnEvaluationPnt(String.valueOf(immunizationevaluation.getPatient()));
		}
		/******************** immunizationevaluationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier immunizationevaluationidentifier = immunizationevaluation.getIdentifierFirstRep();

		/******************** ImmnztnEvaluation_Id_Vl ********************************************************************************/
		if(immunizationevaluationidentifier.hasValue()) {
			i.setImmnztnEvaluationIdVl(String.valueOf(immunizationevaluationidentifier.getValue()));
		}
		/******************** immunizationevaluationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationidentifiertype = immunizationevaluationidentifier.getType();

		/******************** immunizationevaluationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationidentifiertypecoding = immunizationevaluationidentifiertype.getCodingFirstRep();

		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationidentifiertypecoding.hasDisplay()) {
			i.setImmnztnEvaluationIdTypCdgDsply(String.valueOf(immunizationevaluationidentifiertypecoding.getDisplay()));
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationidentifiertypecoding.hasVersion()) {
			i.setImmnztnEvaluationIdTypCdgVrsn(String.valueOf(immunizationevaluationidentifiertypecoding.getVersion()));
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationidentifiertypecoding.hasCode()) {
			i.setImmnztnEvaluationIdTypCdgCd(String.valueOf(immunizationevaluationidentifiertypecoding.getCode()));
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationidentifiertypecoding.hasSystem()) {
			i.setImmnztnEvaluationIdTypCdgSys(String.valueOf(immunizationevaluationidentifiertypecoding.getSystem()));
		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationidentifiertypecoding.hasUserSelected()) {
			i.setImmnztnEvaluationIdTypCdgUsrSltd(String.valueOf(immunizationevaluationidentifiertypecoding.getUserSelected()));
		}
		/******************** ImmnztnEvaluation_Id_Typ_Txt ********************************************************************************/
		if(immunizationevaluationidentifiertype.hasText()) {
			i.setImmnztnEvaluationIdTypTxt(String.valueOf(immunizationevaluationidentifiertype.getText()));
		}
		/******************** ImmnztnEvaluation_Id_Sys ********************************************************************************/
		if(immunizationevaluationidentifier.hasSystem()) {
			i.setImmnztnEvaluationIdSys(String.valueOf(immunizationevaluationidentifier.getSystem()));
		}
		/******************** ImmnztnEvaluation_Id_Assigner ********************************************************************************/
		if(immunizationevaluationidentifier.hasAssigner()) {
			i.setImmnztnEvaluationIdAssigner(String.valueOf(immunizationevaluationidentifier.getAssigner()));
		}
		/******************** immunizationevaluationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationevaluationidentifierperiod = immunizationevaluationidentifier.getPeriod();

		/******************** ImmnztnEvaluation_Id_Prd_End ********************************************************************************/
		if(immunizationevaluationidentifierperiod.hasEnd()) {
			i.setImmnztnEvaluationIdPrdEnd(String.valueOf(immunizationevaluationidentifierperiod.getEnd()));
		}
		/******************** ImmnztnEvaluation_Id_Prd_Strt ********************************************************************************/
		if(immunizationevaluationidentifierperiod.hasStart()) {
			i.setImmnztnEvaluationIdPrdStrt(String.valueOf(immunizationevaluationidentifierperiod.getStart()));
		}
		/******************** immunizationevaluationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse immunizationevaluationidentifieruse = immunizationevaluationidentifier.getUse();
		i.setImmnztnEvaluationIdUse(immunizationevaluationidentifieruse.toCode());

		/******************** immunizationevaluationdosestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationdosestatus = immunizationevaluation.getDoseStatus();

		/******************** immunizationevaluationdosestatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationdosestatuscoding = immunizationevaluationdosestatus.getCodingFirstRep();

		/******************** ImmnztnEvaluation_DoseSts_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationdosestatuscoding.hasDisplay()) {
			i.setImmnztnEvaluationDoseStsCdgDsply(String.valueOf(immunizationevaluationdosestatuscoding.getDisplay()));
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationdosestatuscoding.hasVersion()) {
			i.setImmnztnEvaluationDoseStsCdgVrsn(String.valueOf(immunizationevaluationdosestatuscoding.getVersion()));
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationdosestatuscoding.hasCode()) {
			i.setImmnztnEvaluationDoseStsCdgCd(String.valueOf(immunizationevaluationdosestatuscoding.getCode()));
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationdosestatuscoding.hasSystem()) {
			i.setImmnztnEvaluationDoseStsCdgSys(String.valueOf(immunizationevaluationdosestatuscoding.getSystem()));
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationdosestatuscoding.hasUserSelected()) {
			i.setImmnztnEvaluationDoseStsCdgUsrSltd(String.valueOf(immunizationevaluationdosestatuscoding.getUserSelected()));
		}
		/******************** ImmnztnEvaluation_DoseSts_Txt ********************************************************************************/
		if(immunizationevaluationdosestatus.hasText()) {
			i.setImmnztnEvaluationDoseStsTxt(String.valueOf(immunizationevaluationdosestatus.getText()));
		}
		/******************** immunizationevaluationtargetdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationtargetdisease = immunizationevaluation.getTargetDisease();

		/******************** immunizationevaluationtargetdiseasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding immunizationevaluationtargetdiseasecoding = immunizationevaluationtargetdisease.getCodingFirstRep();

		/******************** ImmnztnEvaluation_TargetDisease_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationtargetdiseasecoding.hasDisplay()) {
			i.setImmnztnEvaluationTarDiseaseCdgDsply(String.valueOf(immunizationevaluationtargetdiseasecoding.getDisplay()));
		}
		/******************** ImmnztnEvaluation_TargetDisease_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationtargetdiseasecoding.hasVersion()) {
			i.setImmnztnEvaluationTarDiseaseCdgVrsn(String.valueOf(immunizationevaluationtargetdiseasecoding.getVersion()));
		}
		/******************** ImmnztnEvaluation_TargetDisease_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationtargetdiseasecoding.hasCode()) {
			i.setImmnztnEvaluationTarDiseaseCdgCd(String.valueOf(immunizationevaluationtargetdiseasecoding.getCode()));
		}
		/******************** ImmnztnEvaluation_TargetDisease_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationtargetdiseasecoding.hasSystem()) {
			i.setImmnztnEvaluationTarDiseaseCdgSys(String.valueOf(immunizationevaluationtargetdiseasecoding.getSystem()));
		}
		/******************** ImmnztnEvaluation_TargetDisease_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationtargetdiseasecoding.hasUserSelected()) {
			i.setImmnztnEvaluationTarDiseaseCdgUsrSltd(String.valueOf(immunizationevaluationtargetdiseasecoding.getUserSelected()));
		}
		/******************** ImmnztnEvaluation_TargetDisease_Txt ********************************************************************************/
		if(immunizationevaluationtargetdisease.hasText()) {
			i.setImmnztnEvaluationTarDiseaseTxt(String.valueOf(immunizationevaluationtargetdisease.getText()));
		}
		return i;
	}
}
