package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationEvaluation;
public class ImmunizationEvaluationBidirectionalConversion 
{
	public ImmunizationEvaluation ImmunizationEvaluations(org.hl7.fhir.r4.model.ImmunizationEvaluation immunizationevaluation) throws ParseException
	{
		 main.java.com.campfhir.model.ImmunizationEvaluation i = new  main.java.com.campfhir.model.ImmunizationEvaluation();

		/******************** id ********************************************************************************/
		i.setId(immunizationevaluation.getIdElement().getIdPart());

		/******************** ImmnztnEvaluation_Athrity ********************************************************************************/
		if(immunizationevaluation.hasAuthority()) {

			if(immunizationevaluation.getAuthority().getReference() != null) {
			i.addImmnztnEvaluationAthrity(immunizationevaluation.getAuthority().getReference());
			}
		} else {
			i.addImmnztnEvaluationAthrity("NULL");
		}


		/******************** ImmnztnEvaluation_Dt ********************************************************************************/
		if(immunizationevaluation.hasDate()) {

			i.addImmnztnEvaluationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationevaluation.getDate())+"\"");
		} else {
			i.addImmnztnEvaluationDt("NULL");
		}


		/******************** immunizationevaluationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ImmunizationEvaluation.ImmunizationEvaluationStatus immunizationevaluationstatus = immunizationevaluation.getStatus();
		if(immunizationevaluationstatus!=null) {
			i.addImmnztnEvaluationSts(immunizationevaluationstatus.toCode());
		} else {
			i.addImmnztnEvaluationSts("NULL");
		}

		/******************** ImmnztnEvaluation_Series ********************************************************************************/
		if(immunizationevaluation.hasSeries()) {

			i.addImmnztnEvaluationSeries(String.valueOf(immunizationevaluation.getSeries()));
		} else {
			i.addImmnztnEvaluationSeries("NULL");
		}


		/******************** ImmnztnEvaluation_Dscrptn ********************************************************************************/
		if(immunizationevaluation.hasDescription()) {

			i.addImmnztnEvaluationDscrptn(String.valueOf(immunizationevaluation.getDescription()));
		} else {
			i.addImmnztnEvaluationDscrptn("NULL");
		}


		/******************** immunizationevaluationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> immunizationevaluationidentifierlist = immunizationevaluation.getIdentifier();
		for(int immunizationevaluationidentifieri = 0; immunizationevaluationidentifieri<immunizationevaluationidentifierlist.size();immunizationevaluationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  immunizationevaluationidentifier = immunizationevaluationidentifierlist.get(immunizationevaluationidentifieri);

		/******************** ImmnztnEvaluation_Id_Vl ********************************************************************************/
		if(immunizationevaluationidentifieri == 0) {i.addImmnztnEvaluationIdVl("[");}
		if(immunizationevaluationidentifier.hasValue()) {

			i.addImmnztnEvaluationIdVl(String.valueOf(immunizationevaluationidentifier.getValue()));
		} else {
			i.addImmnztnEvaluationIdVl("NULL");
		}

		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {i.addImmnztnEvaluationIdVl("]");}


		/******************** immunizationevaluationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationidentifiertype = immunizationevaluationidentifier.getType();

		/******************** ImmnztnEvaluation_Id_Typ_Txt ********************************************************************************/
		if(immunizationevaluationidentifieri == 0) {i.addImmnztnEvaluationIdTypTxt("[");}
		if(immunizationevaluationidentifiertype.hasText()) {

			i.addImmnztnEvaluationIdTypTxt(String.valueOf(immunizationevaluationidentifiertype.getText()));
		} else {
			i.addImmnztnEvaluationIdTypTxt("NULL");
		}

		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {i.addImmnztnEvaluationIdTypTxt("]");}


		/******************** immunizationevaluationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationevaluationidentifiertypecodinglist = immunizationevaluationidentifiertype.getCoding();
		for(int immunizationevaluationidentifiertypecodingi = 0; immunizationevaluationidentifiertypecodingi<immunizationevaluationidentifiertypecodinglist.size();immunizationevaluationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationevaluationidentifiertypecoding = immunizationevaluationidentifiertypecodinglist.get(immunizationevaluationidentifiertypecodingi);

		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationidentifiertypecodingi == 0) {i.addImmnztnEvaluationIdTypCdgDsply("[[");}
		if(immunizationevaluationidentifiertypecoding.hasDisplay()) {

			i.addImmnztnEvaluationIdTypCdgDsply(String.valueOf(immunizationevaluationidentifiertypecoding.getDisplay()));
		} else {
			i.addImmnztnEvaluationIdTypCdgDsply("NULL");
		}

		if(immunizationevaluationidentifiertypecodingi == immunizationevaluationidentifiertypecodinglist.size()-1) {i.addImmnztnEvaluationIdTypCdgDsply("]]");}


		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationidentifiertypecodingi == 0) {i.addImmnztnEvaluationIdTypCdgVrsn("[[");}
		if(immunizationevaluationidentifiertypecoding.hasVersion()) {

			i.addImmnztnEvaluationIdTypCdgVrsn(String.valueOf(immunizationevaluationidentifiertypecoding.getVersion()));
		} else {
			i.addImmnztnEvaluationIdTypCdgVrsn("NULL");
		}

		if(immunizationevaluationidentifiertypecodingi == immunizationevaluationidentifiertypecodinglist.size()-1) {i.addImmnztnEvaluationIdTypCdgVrsn("]]");}


		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationidentifiertypecodingi == 0) {i.addImmnztnEvaluationIdTypCdgCd("[[");}
		if(immunizationevaluationidentifiertypecoding.hasCode()) {

			i.addImmnztnEvaluationIdTypCdgCd(String.valueOf(immunizationevaluationidentifiertypecoding.getCode()));
		} else {
			i.addImmnztnEvaluationIdTypCdgCd("NULL");
		}

		if(immunizationevaluationidentifiertypecodingi == immunizationevaluationidentifiertypecodinglist.size()-1) {i.addImmnztnEvaluationIdTypCdgCd("]]");}


		/******************** ImmnztnEvaluation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationidentifiertypecodingi == 0) {i.addImmnztnEvaluationIdTypCdgUsrSltd("[[");}
		if(immunizationevaluationidentifiertypecoding.hasUserSelected()) {

			i.addImmnztnEvaluationIdTypCdgUsrSltd(String.valueOf(immunizationevaluationidentifiertypecoding.getUserSelected()));
		} else {
			i.addImmnztnEvaluationIdTypCdgUsrSltd("NULL");
		}

		if(immunizationevaluationidentifiertypecodingi == immunizationevaluationidentifiertypecodinglist.size()-1) {i.addImmnztnEvaluationIdTypCdgUsrSltd("]]");}


		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationidentifiertypecodingi == 0) {i.addImmnztnEvaluationIdTypCdgSys("[[");}
		if(immunizationevaluationidentifiertypecoding.hasSystem()) {

			i.addImmnztnEvaluationIdTypCdgSys(String.valueOf(immunizationevaluationidentifiertypecoding.getSystem()));
		} else {
			i.addImmnztnEvaluationIdTypCdgSys("NULL");
		}

		if(immunizationevaluationidentifiertypecodingi == immunizationevaluationidentifiertypecodinglist.size()-1) {i.addImmnztnEvaluationIdTypCdgSys("]]");}


		 };
		/******************** immunizationevaluationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationevaluationidentifierperiod = immunizationevaluationidentifier.getPeriod();

		/******************** ImmnztnEvaluation_Id_Prd_Strt ********************************************************************************/
		if(immunizationevaluationidentifieri == 0) {i.addImmnztnEvaluationIdPrdStrt("[");}
		if(immunizationevaluationidentifierperiod.hasStart()) {

			i.addImmnztnEvaluationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationevaluationidentifierperiod.getStart())+"\"");
		} else {
			i.addImmnztnEvaluationIdPrdStrt("NULL");
		}

		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {i.addImmnztnEvaluationIdPrdStrt("]");}


		/******************** ImmnztnEvaluation_Id_Prd_End ********************************************************************************/
		if(immunizationevaluationidentifieri == 0) {i.addImmnztnEvaluationIdPrdEnd("[");}
		if(immunizationevaluationidentifierperiod.hasEnd()) {

			i.addImmnztnEvaluationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationevaluationidentifierperiod.getEnd())+"\"");
		} else {
			i.addImmnztnEvaluationIdPrdEnd("NULL");
		}

		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {i.addImmnztnEvaluationIdPrdEnd("]");}


		/******************** immunizationevaluationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse immunizationevaluationidentifieruse = immunizationevaluationidentifier.getUse();
		if(immunizationevaluationidentifieruse!=null) {
		if(immunizationevaluationidentifieri == 0) {

		i.addImmnztnEvaluationIdUse("[");		}
			i.addImmnztnEvaluationIdUse(immunizationevaluationidentifieruse.toCode());
		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {

		i.addImmnztnEvaluationIdUse("]");		}

		} else {
			i.addImmnztnEvaluationIdUse("NULL");
		}

		/******************** ImmnztnEvaluation_Id_Assigner ********************************************************************************/
		if(immunizationevaluationidentifieri == 0) {i.addImmnztnEvaluationIdAssigner("[");}
		if(immunizationevaluationidentifier.hasAssigner()) {

			if(immunizationevaluationidentifier.getAssigner().getReference() != null) {
			i.addImmnztnEvaluationIdAssigner(immunizationevaluationidentifier.getAssigner().getReference());
			}
		} else {
			i.addImmnztnEvaluationIdAssigner("NULL");
		}

		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {i.addImmnztnEvaluationIdAssigner("]");}


		/******************** ImmnztnEvaluation_Id_Sys ********************************************************************************/
		if(immunizationevaluationidentifieri == 0) {i.addImmnztnEvaluationIdSys("[");}
		if(immunizationevaluationidentifier.hasSystem()) {

			i.addImmnztnEvaluationIdSys(String.valueOf(immunizationevaluationidentifier.getSystem()));
		} else {
			i.addImmnztnEvaluationIdSys("NULL");
		}

		if(immunizationevaluationidentifieri == immunizationevaluationidentifierlist.size()-1) {i.addImmnztnEvaluationIdSys("]");}


		 };
		/******************** immunizationevaluationtargetdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationtargetdisease = immunizationevaluation.getTargetDisease();

		/******************** ImmnztnEvaluation_TarDisease_Txt ********************************************************************************/
		if(immunizationevaluationtargetdisease.hasText()) {

			i.addImmnztnEvaluationTarDiseaseTxt(String.valueOf(immunizationevaluationtargetdisease.getText()));
		} else {
			i.addImmnztnEvaluationTarDiseaseTxt("NULL");
		}


		/******************** immunizationevaluationtargetdiseasecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationevaluationtargetdiseasecodinglist = immunizationevaluationtargetdisease.getCoding();
		for(int immunizationevaluationtargetdiseasecodingi = 0; immunizationevaluationtargetdiseasecodingi<immunizationevaluationtargetdiseasecodinglist.size();immunizationevaluationtargetdiseasecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationevaluationtargetdiseasecoding = immunizationevaluationtargetdiseasecodinglist.get(immunizationevaluationtargetdiseasecodingi);

		/******************** ImmnztnEvaluation_TarDisease_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationtargetdiseasecodingi == 0) {i.addImmnztnEvaluationTarDiseaseCdgDsply("[");}
		if(immunizationevaluationtargetdiseasecoding.hasDisplay()) {

			i.addImmnztnEvaluationTarDiseaseCdgDsply(String.valueOf(immunizationevaluationtargetdiseasecoding.getDisplay()));
		} else {
			i.addImmnztnEvaluationTarDiseaseCdgDsply("NULL");
		}

		if(immunizationevaluationtargetdiseasecodingi == immunizationevaluationtargetdiseasecodinglist.size()-1) {i.addImmnztnEvaluationTarDiseaseCdgDsply("]");}


		/******************** ImmnztnEvaluation_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationtargetdiseasecodingi == 0) {i.addImmnztnEvaluationTarDiseaseCdgVrsn("[");}
		if(immunizationevaluationtargetdiseasecoding.hasVersion()) {

			i.addImmnztnEvaluationTarDiseaseCdgVrsn(String.valueOf(immunizationevaluationtargetdiseasecoding.getVersion()));
		} else {
			i.addImmnztnEvaluationTarDiseaseCdgVrsn("NULL");
		}

		if(immunizationevaluationtargetdiseasecodingi == immunizationevaluationtargetdiseasecodinglist.size()-1) {i.addImmnztnEvaluationTarDiseaseCdgVrsn("]");}


		/******************** ImmnztnEvaluation_TarDisease_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationtargetdiseasecodingi == 0) {i.addImmnztnEvaluationTarDiseaseCdgCd("[");}
		if(immunizationevaluationtargetdiseasecoding.hasCode()) {

			i.addImmnztnEvaluationTarDiseaseCdgCd(String.valueOf(immunizationevaluationtargetdiseasecoding.getCode()));
		} else {
			i.addImmnztnEvaluationTarDiseaseCdgCd("NULL");
		}

		if(immunizationevaluationtargetdiseasecodingi == immunizationevaluationtargetdiseasecodinglist.size()-1) {i.addImmnztnEvaluationTarDiseaseCdgCd("]");}


		/******************** ImmnztnEvaluation_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationtargetdiseasecodingi == 0) {i.addImmnztnEvaluationTarDiseaseCdgUsrSltd("[");}
		if(immunizationevaluationtargetdiseasecoding.hasUserSelected()) {

			i.addImmnztnEvaluationTarDiseaseCdgUsrSltd(String.valueOf(immunizationevaluationtargetdiseasecoding.getUserSelected()));
		} else {
			i.addImmnztnEvaluationTarDiseaseCdgUsrSltd("NULL");
		}

		if(immunizationevaluationtargetdiseasecodingi == immunizationevaluationtargetdiseasecodinglist.size()-1) {i.addImmnztnEvaluationTarDiseaseCdgUsrSltd("]");}


		/******************** ImmnztnEvaluation_TarDisease_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationtargetdiseasecodingi == 0) {i.addImmnztnEvaluationTarDiseaseCdgSys("[");}
		if(immunizationevaluationtargetdiseasecoding.hasSystem()) {

			i.addImmnztnEvaluationTarDiseaseCdgSys(String.valueOf(immunizationevaluationtargetdiseasecoding.getSystem()));
		} else {
			i.addImmnztnEvaluationTarDiseaseCdgSys("NULL");
		}

		if(immunizationevaluationtargetdiseasecodingi == immunizationevaluationtargetdiseasecodinglist.size()-1) {i.addImmnztnEvaluationTarDiseaseCdgSys("]");}


		 };
		/******************** immunizationevaluationdosestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationevaluationdosestatus = immunizationevaluation.getDoseStatus();

		/******************** ImmnztnEvaluation_DoseSts_Txt ********************************************************************************/
		if(immunizationevaluationdosestatus.hasText()) {

			i.addImmnztnEvaluationDoseStsTxt(String.valueOf(immunizationevaluationdosestatus.getText()));
		} else {
			i.addImmnztnEvaluationDoseStsTxt("NULL");
		}


		/******************** immunizationevaluationdosestatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationevaluationdosestatuscodinglist = immunizationevaluationdosestatus.getCoding();
		for(int immunizationevaluationdosestatuscodingi = 0; immunizationevaluationdosestatuscodingi<immunizationevaluationdosestatuscodinglist.size();immunizationevaluationdosestatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationevaluationdosestatuscoding = immunizationevaluationdosestatuscodinglist.get(immunizationevaluationdosestatuscodingi);

		/******************** ImmnztnEvaluation_DoseSts_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationdosestatuscodingi == 0) {i.addImmnztnEvaluationDoseStsCdgDsply("[");}
		if(immunizationevaluationdosestatuscoding.hasDisplay()) {

			i.addImmnztnEvaluationDoseStsCdgDsply(String.valueOf(immunizationevaluationdosestatuscoding.getDisplay()));
		} else {
			i.addImmnztnEvaluationDoseStsCdgDsply("NULL");
		}

		if(immunizationevaluationdosestatuscodingi == immunizationevaluationdosestatuscodinglist.size()-1) {i.addImmnztnEvaluationDoseStsCdgDsply("]");}


		/******************** ImmnztnEvaluation_DoseSts_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationdosestatuscodingi == 0) {i.addImmnztnEvaluationDoseStsCdgVrsn("[");}
		if(immunizationevaluationdosestatuscoding.hasVersion()) {

			i.addImmnztnEvaluationDoseStsCdgVrsn(String.valueOf(immunizationevaluationdosestatuscoding.getVersion()));
		} else {
			i.addImmnztnEvaluationDoseStsCdgVrsn("NULL");
		}

		if(immunizationevaluationdosestatuscodingi == immunizationevaluationdosestatuscodinglist.size()-1) {i.addImmnztnEvaluationDoseStsCdgVrsn("]");}


		/******************** ImmnztnEvaluation_DoseSts_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationdosestatuscodingi == 0) {i.addImmnztnEvaluationDoseStsCdgCd("[");}
		if(immunizationevaluationdosestatuscoding.hasCode()) {

			i.addImmnztnEvaluationDoseStsCdgCd(String.valueOf(immunizationevaluationdosestatuscoding.getCode()));
		} else {
			i.addImmnztnEvaluationDoseStsCdgCd("NULL");
		}

		if(immunizationevaluationdosestatuscodingi == immunizationevaluationdosestatuscodinglist.size()-1) {i.addImmnztnEvaluationDoseStsCdgCd("]");}


		/******************** ImmnztnEvaluation_DoseSts_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationdosestatuscodingi == 0) {i.addImmnztnEvaluationDoseStsCdgUsrSltd("[");}
		if(immunizationevaluationdosestatuscoding.hasUserSelected()) {

			i.addImmnztnEvaluationDoseStsCdgUsrSltd(String.valueOf(immunizationevaluationdosestatuscoding.getUserSelected()));
		} else {
			i.addImmnztnEvaluationDoseStsCdgUsrSltd("NULL");
		}

		if(immunizationevaluationdosestatuscodingi == immunizationevaluationdosestatuscodinglist.size()-1) {i.addImmnztnEvaluationDoseStsCdgUsrSltd("]");}


		/******************** ImmnztnEvaluation_DoseSts_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationdosestatuscodingi == 0) {i.addImmnztnEvaluationDoseStsCdgSys("[");}
		if(immunizationevaluationdosestatuscoding.hasSystem()) {

			i.addImmnztnEvaluationDoseStsCdgSys(String.valueOf(immunizationevaluationdosestatuscoding.getSystem()));
		} else {
			i.addImmnztnEvaluationDoseStsCdgSys("NULL");
		}

		if(immunizationevaluationdosestatuscodingi == immunizationevaluationdosestatuscodinglist.size()-1) {i.addImmnztnEvaluationDoseStsCdgSys("]");}


		 };
		/******************** immunizationevaluationdosestatusreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationevaluationdosestatusreasonlist = immunizationevaluation.getDoseStatusReason();
		for(int immunizationevaluationdosestatusreasoni = 0; immunizationevaluationdosestatusreasoni<immunizationevaluationdosestatusreasonlist.size();immunizationevaluationdosestatusreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationevaluationdosestatusreason = immunizationevaluationdosestatusreasonlist.get(immunizationevaluationdosestatusreasoni);

		/******************** ImmnztnEvaluation_DoseStsRsn_Txt ********************************************************************************/
		if(immunizationevaluationdosestatusreasoni == 0) {i.addImmnztnEvaluationDoseStsRsnTxt("[");}
		if(immunizationevaluationdosestatusreason.hasText()) {

			i.addImmnztnEvaluationDoseStsRsnTxt(String.valueOf(immunizationevaluationdosestatusreason.getText()));
		} else {
			i.addImmnztnEvaluationDoseStsRsnTxt("NULL");
		}

		if(immunizationevaluationdosestatusreasoni == immunizationevaluationdosestatusreasonlist.size()-1) {i.addImmnztnEvaluationDoseStsRsnTxt("]");}


		/******************** immunizationevaluationdosestatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationevaluationdosestatusreasoncodinglist = immunizationevaluationdosestatusreason.getCoding();
		for(int immunizationevaluationdosestatusreasoncodingi = 0; immunizationevaluationdosestatusreasoncodingi<immunizationevaluationdosestatusreasoncodinglist.size();immunizationevaluationdosestatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationevaluationdosestatusreasoncoding = immunizationevaluationdosestatusreasoncodinglist.get(immunizationevaluationdosestatusreasoncodingi);

		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncodingi == 0) {i.addImmnztnEvaluationDoseStsRsnCdgDsply("[[");}
		if(immunizationevaluationdosestatusreasoncoding.hasDisplay()) {

			i.addImmnztnEvaluationDoseStsRsnCdgDsply(String.valueOf(immunizationevaluationdosestatusreasoncoding.getDisplay()));
		} else {
			i.addImmnztnEvaluationDoseStsRsnCdgDsply("NULL");
		}

		if(immunizationevaluationdosestatusreasoncodingi == immunizationevaluationdosestatusreasoncodinglist.size()-1) {i.addImmnztnEvaluationDoseStsRsnCdgDsply("]]");}


		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncodingi == 0) {i.addImmnztnEvaluationDoseStsRsnCdgVrsn("[[");}
		if(immunizationevaluationdosestatusreasoncoding.hasVersion()) {

			i.addImmnztnEvaluationDoseStsRsnCdgVrsn(String.valueOf(immunizationevaluationdosestatusreasoncoding.getVersion()));
		} else {
			i.addImmnztnEvaluationDoseStsRsnCdgVrsn("NULL");
		}

		if(immunizationevaluationdosestatusreasoncodingi == immunizationevaluationdosestatusreasoncodinglist.size()-1) {i.addImmnztnEvaluationDoseStsRsnCdgVrsn("]]");}


		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Cd ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncodingi == 0) {i.addImmnztnEvaluationDoseStsRsnCdgCd("[[");}
		if(immunizationevaluationdosestatusreasoncoding.hasCode()) {

			i.addImmnztnEvaluationDoseStsRsnCdgCd(String.valueOf(immunizationevaluationdosestatusreasoncoding.getCode()));
		} else {
			i.addImmnztnEvaluationDoseStsRsnCdgCd("NULL");
		}

		if(immunizationevaluationdosestatusreasoncodingi == immunizationevaluationdosestatusreasoncodinglist.size()-1) {i.addImmnztnEvaluationDoseStsRsnCdgCd("]]");}


		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncodingi == 0) {i.addImmnztnEvaluationDoseStsRsnCdgUsrSltd("[[");}
		if(immunizationevaluationdosestatusreasoncoding.hasUserSelected()) {

			i.addImmnztnEvaluationDoseStsRsnCdgUsrSltd(String.valueOf(immunizationevaluationdosestatusreasoncoding.getUserSelected()));
		} else {
			i.addImmnztnEvaluationDoseStsRsnCdgUsrSltd("NULL");
		}

		if(immunizationevaluationdosestatusreasoncodingi == immunizationevaluationdosestatusreasoncodinglist.size()-1) {i.addImmnztnEvaluationDoseStsRsnCdgUsrSltd("]]");}


		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Sys ********************************************************************************/
		if(immunizationevaluationdosestatusreasoncodingi == 0) {i.addImmnztnEvaluationDoseStsRsnCdgSys("[[");}
		if(immunizationevaluationdosestatusreasoncoding.hasSystem()) {

			i.addImmnztnEvaluationDoseStsRsnCdgSys(String.valueOf(immunizationevaluationdosestatusreasoncoding.getSystem()));
		} else {
			i.addImmnztnEvaluationDoseStsRsnCdgSys("NULL");
		}

		if(immunizationevaluationdosestatusreasoncodingi == immunizationevaluationdosestatusreasoncodinglist.size()-1) {i.addImmnztnEvaluationDoseStsRsnCdgSys("]]");}


		 };
		 };
		/******************** ImmnztnEvaluation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(immunizationevaluation.hasDoseNumberPositiveIntType()) {

			i.addImmnztnEvaluationDoseNmbrPositiveIntTyp("\""+immunizationevaluation.getDoseNumberPositiveIntType().getValueAsString()+"\"");
		} else {
			i.addImmnztnEvaluationDoseNmbrPositiveIntTyp("NULL");
		}


		/******************** ImmnztnEvaluation_ImmnztnEvnt ********************************************************************************/
		if(immunizationevaluation.hasImmunizationEvent()) {

			if(immunizationevaluation.getImmunizationEvent().getReference() != null) {
			i.addImmnztnEvaluationImmnztnEvnt(immunizationevaluation.getImmunizationEvent().getReference());
			}
		} else {
			i.addImmnztnEvaluationImmnztnEvnt("NULL");
		}


		/******************** ImmnztnEvaluation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(immunizationevaluation.hasSeriesDosesPositiveIntType()) {

			i.addImmnztnEvaluationSeriesDosesPositiveIntTyp("\""+immunizationevaluation.getSeriesDosesPositiveIntType().getValueAsString()+"\"");
		} else {
			i.addImmnztnEvaluationSeriesDosesPositiveIntTyp("NULL");
		}


		/******************** ImmnztnEvaluation_DoseNmbrStrgTyp ********************************************************************************/
		if(immunizationevaluation.hasDoseNumberStringType()) {

			i.addImmnztnEvaluationDoseNmbrStrgTyp("\""+immunizationevaluation.getDoseNumberStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnEvaluationDoseNmbrStrgTyp("NULL");
		}


		/******************** ImmnztnEvaluation_SeriesDosesStrgTyp ********************************************************************************/
		if(immunizationevaluation.hasSeriesDosesStringType()) {

			i.addImmnztnEvaluationSeriesDosesStrgTyp("\""+immunizationevaluation.getSeriesDosesStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnEvaluationSeriesDosesStrgTyp("NULL");
		}


		/******************** ImmnztnEvaluation_Pnt ********************************************************************************/
		if(immunizationevaluation.hasPatient()) {

			if(immunizationevaluation.getPatient().getReference() != null) {
			i.addImmnztnEvaluationPnt(immunizationevaluation.getPatient().getReference());
			}
		} else {
			i.addImmnztnEvaluationPnt("NULL");
		}


		return i;
	}
}
