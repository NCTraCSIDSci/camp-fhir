package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationRecommendation;
public class ImmunizationRecommendationBidirectionalConversion 
{
	public ImmunizationRecommendation ImmunizationRecommendations(org.hl7.fhir.r4.model.ImmunizationRecommendation immunizationrecommendation) throws ParseException
	{
		 main.java.com.campfhir.model.ImmunizationRecommendation i = new  main.java.com.campfhir.model.ImmunizationRecommendation();

		/******************** id ********************************************************************************/
		i.setId(immunizationrecommendation.getIdElement().getIdPart());

		/******************** ImmnztnRecmndation_Athrity ********************************************************************************/
		if(immunizationrecommendation.hasAuthority()) {

			if(immunizationrecommendation.getAuthority().getReference() != null) {
			i.addImmnztnRecmndationAthrity(immunizationrecommendation.getAuthority().getReference());
			}
		} else {
			i.addImmnztnRecmndationAthrity("NULL");
		}


		/******************** ImmnztnRecmndation_Dt ********************************************************************************/
		if(immunizationrecommendation.hasDate()) {

			i.addImmnztnRecmndationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationrecommendation.getDate())+"\"");
		} else {
			i.addImmnztnRecmndationDt("NULL");
		}


		/******************** immunizationrecommendationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> immunizationrecommendationidentifierlist = immunizationrecommendation.getIdentifier();
		for(int immunizationrecommendationidentifieri = 0; immunizationrecommendationidentifieri<immunizationrecommendationidentifierlist.size();immunizationrecommendationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  immunizationrecommendationidentifier = immunizationrecommendationidentifierlist.get(immunizationrecommendationidentifieri);

		/******************** ImmnztnRecmndation_Id_Vl ********************************************************************************/
		if(immunizationrecommendationidentifieri == 0) {i.addImmnztnRecmndationIdVl("[");}
		if(immunizationrecommendationidentifier.hasValue()) {

			i.addImmnztnRecmndationIdVl(String.valueOf(immunizationrecommendationidentifier.getValue()));
		} else {
			i.addImmnztnRecmndationIdVl("NULL");
		}

		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {i.addImmnztnRecmndationIdVl("]");}


		/******************** immunizationrecommendationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationidentifiertype = immunizationrecommendationidentifier.getType();

		/******************** ImmnztnRecmndation_Id_Typ_Txt ********************************************************************************/
		if(immunizationrecommendationidentifieri == 0) {i.addImmnztnRecmndationIdTypTxt("[");}
		if(immunizationrecommendationidentifiertype.hasText()) {

			i.addImmnztnRecmndationIdTypTxt(String.valueOf(immunizationrecommendationidentifiertype.getText()));
		} else {
			i.addImmnztnRecmndationIdTypTxt("NULL");
		}

		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {i.addImmnztnRecmndationIdTypTxt("]");}


		/******************** immunizationrecommendationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationidentifiertypecodinglist = immunizationrecommendationidentifiertype.getCoding();
		for(int immunizationrecommendationidentifiertypecodingi = 0; immunizationrecommendationidentifiertypecodingi<immunizationrecommendationidentifiertypecodinglist.size();immunizationrecommendationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationidentifiertypecoding = immunizationrecommendationidentifiertypecodinglist.get(immunizationrecommendationidentifiertypecodingi);

		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationidentifiertypecodingi == 0) {i.addImmnztnRecmndationIdTypCdgDsply("[[");}
		if(immunizationrecommendationidentifiertypecoding.hasDisplay()) {

			i.addImmnztnRecmndationIdTypCdgDsply(String.valueOf(immunizationrecommendationidentifiertypecoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationIdTypCdgDsply("NULL");
		}

		if(immunizationrecommendationidentifiertypecodingi == immunizationrecommendationidentifiertypecodinglist.size()-1) {i.addImmnztnRecmndationIdTypCdgDsply("]]");}


		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationidentifiertypecodingi == 0) {i.addImmnztnRecmndationIdTypCdgVrsn("[[");}
		if(immunizationrecommendationidentifiertypecoding.hasVersion()) {

			i.addImmnztnRecmndationIdTypCdgVrsn(String.valueOf(immunizationrecommendationidentifiertypecoding.getVersion()));
		} else {
			i.addImmnztnRecmndationIdTypCdgVrsn("NULL");
		}

		if(immunizationrecommendationidentifiertypecodingi == immunizationrecommendationidentifiertypecodinglist.size()-1) {i.addImmnztnRecmndationIdTypCdgVrsn("]]");}


		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationidentifiertypecodingi == 0) {i.addImmnztnRecmndationIdTypCdgCd("[[");}
		if(immunizationrecommendationidentifiertypecoding.hasCode()) {

			i.addImmnztnRecmndationIdTypCdgCd(String.valueOf(immunizationrecommendationidentifiertypecoding.getCode()));
		} else {
			i.addImmnztnRecmndationIdTypCdgCd("NULL");
		}

		if(immunizationrecommendationidentifiertypecodingi == immunizationrecommendationidentifiertypecodinglist.size()-1) {i.addImmnztnRecmndationIdTypCdgCd("]]");}


		/******************** ImmnztnRecmndation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationidentifiertypecodingi == 0) {i.addImmnztnRecmndationIdTypCdgUsrSltd("[[");}
		if(immunizationrecommendationidentifiertypecoding.hasUserSelected()) {

			i.addImmnztnRecmndationIdTypCdgUsrSltd(String.valueOf(immunizationrecommendationidentifiertypecoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationIdTypCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationidentifiertypecodingi == immunizationrecommendationidentifiertypecodinglist.size()-1) {i.addImmnztnRecmndationIdTypCdgUsrSltd("]]");}


		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationidentifiertypecodingi == 0) {i.addImmnztnRecmndationIdTypCdgSys("[[");}
		if(immunizationrecommendationidentifiertypecoding.hasSystem()) {

			i.addImmnztnRecmndationIdTypCdgSys(String.valueOf(immunizationrecommendationidentifiertypecoding.getSystem()));
		} else {
			i.addImmnztnRecmndationIdTypCdgSys("NULL");
		}

		if(immunizationrecommendationidentifiertypecodingi == immunizationrecommendationidentifiertypecodinglist.size()-1) {i.addImmnztnRecmndationIdTypCdgSys("]]");}


		 };
		/******************** immunizationrecommendationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationrecommendationidentifierperiod = immunizationrecommendationidentifier.getPeriod();

		/******************** ImmnztnRecmndation_Id_Prd_Strt ********************************************************************************/
		if(immunizationrecommendationidentifieri == 0) {i.addImmnztnRecmndationIdPrdStrt("[");}
		if(immunizationrecommendationidentifierperiod.hasStart()) {

			i.addImmnztnRecmndationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationrecommendationidentifierperiod.getStart())+"\"");
		} else {
			i.addImmnztnRecmndationIdPrdStrt("NULL");
		}

		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {i.addImmnztnRecmndationIdPrdStrt("]");}


		/******************** ImmnztnRecmndation_Id_Prd_End ********************************************************************************/
		if(immunizationrecommendationidentifieri == 0) {i.addImmnztnRecmndationIdPrdEnd("[");}
		if(immunizationrecommendationidentifierperiod.hasEnd()) {

			i.addImmnztnRecmndationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationrecommendationidentifierperiod.getEnd())+"\"");
		} else {
			i.addImmnztnRecmndationIdPrdEnd("NULL");
		}

		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {i.addImmnztnRecmndationIdPrdEnd("]");}


		/******************** immunizationrecommendationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse immunizationrecommendationidentifieruse = immunizationrecommendationidentifier.getUse();
		if(immunizationrecommendationidentifieruse!=null) {
		if(immunizationrecommendationidentifieri == 0) {

		i.addImmnztnRecmndationIdUse("[");		}
			i.addImmnztnRecmndationIdUse(immunizationrecommendationidentifieruse.toCode());
		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {

		i.addImmnztnRecmndationIdUse("]");		}

		} else {
			i.addImmnztnRecmndationIdUse("NULL");
		}

		/******************** ImmnztnRecmndation_Id_Assigner ********************************************************************************/
		if(immunizationrecommendationidentifieri == 0) {i.addImmnztnRecmndationIdAssigner("[");}
		if(immunizationrecommendationidentifier.hasAssigner()) {

			if(immunizationrecommendationidentifier.getAssigner().getReference() != null) {
			i.addImmnztnRecmndationIdAssigner(immunizationrecommendationidentifier.getAssigner().getReference());
			}
		} else {
			i.addImmnztnRecmndationIdAssigner("NULL");
		}

		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {i.addImmnztnRecmndationIdAssigner("]");}


		/******************** ImmnztnRecmndation_Id_Sys ********************************************************************************/
		if(immunizationrecommendationidentifieri == 0) {i.addImmnztnRecmndationIdSys("[");}
		if(immunizationrecommendationidentifier.hasSystem()) {

			i.addImmnztnRecmndationIdSys(String.valueOf(immunizationrecommendationidentifier.getSystem()));
		} else {
			i.addImmnztnRecmndationIdSys("NULL");
		}

		if(immunizationrecommendationidentifieri == immunizationrecommendationidentifierlist.size()-1) {i.addImmnztnRecmndationIdSys("]");}


		 };
		/******************** ImmnztnRecmndation_Pnt ********************************************************************************/
		if(immunizationrecommendation.hasPatient()) {

			if(immunizationrecommendation.getPatient().getReference() != null) {
			i.addImmnztnRecmndationPnt(immunizationrecommendation.getPatient().getReference());
			}
		} else {
			i.addImmnztnRecmndationPnt("NULL");
		}


		/******************** immunizationrecommendationrecommendation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent> immunizationrecommendationrecommendationlist = immunizationrecommendation.getRecommendation();
		for(int immunizationrecommendationrecommendationi = 0; immunizationrecommendationrecommendationi<immunizationrecommendationrecommendationlist.size();immunizationrecommendationrecommendationi++ ) {
		org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent  immunizationrecommendationrecommendation = immunizationrecommendationrecommendationlist.get(immunizationrecommendationrecommendationi);

		/******************** ImmnztnRecmndation_Recmndation_Series ********************************************************************************/
		if(immunizationrecommendationrecommendationi == 0) {i.addImmnztnRecmndationRecmndationSeries("[");}
		if(immunizationrecommendationrecommendation.hasSeries()) {

			i.addImmnztnRecmndationRecmndationSeries(String.valueOf(immunizationrecommendationrecommendation.getSeries()));
		} else {
			i.addImmnztnRecmndationRecmndationSeries("NULL");
		}

		if(immunizationrecommendationrecommendationi == immunizationrecommendationrecommendationlist.size()-1) {i.addImmnztnRecmndationRecmndationSeries("]");}


		/******************** ImmnztnRecmndation_Recmndation_Dscrptn ********************************************************************************/
		if(immunizationrecommendationrecommendationi == 0) {i.addImmnztnRecmndationRecmndationDscrptn("[");}
		if(immunizationrecommendationrecommendation.hasDescription()) {

			i.addImmnztnRecmndationRecmndationDscrptn(String.valueOf(immunizationrecommendationrecommendation.getDescription()));
		} else {
			i.addImmnztnRecmndationRecmndationDscrptn("NULL");
		}

		if(immunizationrecommendationrecommendationi == immunizationrecommendationrecommendationlist.size()-1) {i.addImmnztnRecmndationRecmndationDscrptn("]");}


		/******************** ImmnztnRecmndation_Recmndation_SprtingImmnztn ********************************************************************************/
		if(immunizationrecommendationrecommendationi == 0) {i.addImmnztnRecmndationRecmndationSprtingImmnztn("[");}
		if(immunizationrecommendationrecommendation.hasSupportingImmunization()) {

			String  array = "[";
			for(int incr=0; incr<immunizationrecommendationrecommendation.getSupportingImmunization().size(); incr++) {
				array = array + immunizationrecommendationrecommendation.getSupportingImmunization().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImmnztnRecmndationRecmndationSprtingImmnztn(array);

		} else {
			i.addImmnztnRecmndationRecmndationSprtingImmnztn("NULL");
		}

		if(immunizationrecommendationrecommendationi == immunizationrecommendationrecommendationlist.size()-1) {i.addImmnztnRecmndationRecmndationSprtingImmnztn("]");}


		/******************** ImmnztnRecmndation_Recmndation_SprtingPntInfo ********************************************************************************/
		if(immunizationrecommendationrecommendationi == 0) {i.addImmnztnRecmndationRecmndationSprtingPntInfo("[");}
		if(immunizationrecommendationrecommendation.hasSupportingPatientInformation()) {

			String  array = "[";
			for(int incr=0; incr<immunizationrecommendationrecommendation.getSupportingPatientInformation().size(); incr++) {
				array = array + immunizationrecommendationrecommendation.getSupportingPatientInformation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImmnztnRecmndationRecmndationSprtingPntInfo(array);

		} else {
			i.addImmnztnRecmndationRecmndationSprtingPntInfo("NULL");
		}

		if(immunizationrecommendationrecommendationi == immunizationrecommendationrecommendationlist.size()-1) {i.addImmnztnRecmndationRecmndationSprtingPntInfo("]");}


		/******************** immunizationrecommendationrecommendationcontraindicatedvaccinecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationrecommendationrecommendationcontraindicatedvaccinecodelist = immunizationrecommendationrecommendation.getContraindicatedVaccineCode();
		for(int immunizationrecommendationrecommendationcontraindicatedvaccinecodei = 0; immunizationrecommendationrecommendationcontraindicatedvaccinecodei<immunizationrecommendationrecommendationcontraindicatedvaccinecodelist.size();immunizationrecommendationrecommendationcontraindicatedvaccinecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationrecommendationrecommendationcontraindicatedvaccinecode = immunizationrecommendationrecommendationcontraindicatedvaccinecodelist.get(immunizationrecommendationrecommendationcontraindicatedvaccinecodei);

		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodei == 0) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt("[[");}
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecode.hasText()) {

			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecode.getText()));
		} else {
			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt("NULL");
		}

		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodei == immunizationrecommendationrecommendationcontraindicatedvaccinecodelist.size()-1) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt("]]");}


		/******************** immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist = immunizationrecommendationrecommendationcontraindicatedvaccinecode.getCoding();
		for(int immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi = 0; immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi<immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.size();immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding = immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.get(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi);

		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply("[[[");}
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasDisplay()) {

			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply("NULL");
		}

		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn("[[[");}
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasVersion()) {

			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getVersion()));
		} else {
			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn("NULL");
		}

		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd("[[[");}
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasCode()) {

			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getCode()));
		} else {
			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd("NULL");
		}

		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd("[[[");}
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasUserSelected()) {

			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys("[[[");}
		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.hasSystem()) {

			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys(String.valueOf(immunizationrecommendationrecommendationcontraindicatedvaccinecodecoding.getSystem()));
		} else {
			i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys("NULL");
		}

		if(immunizationrecommendationrecommendationcontraindicatedvaccinecodecodingi == immunizationrecommendationrecommendationcontraindicatedvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys("]]]");}


		 };
		 };
		/******************** immunizationrecommendationrecommendationtargetdisease ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationtargetdisease = immunizationrecommendationrecommendation.getTargetDisease();

		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdisease.hasText()) {

			i.addImmnztnRecmndationRecmndationTarDiseaseTxt(String.valueOf(immunizationrecommendationrecommendationtargetdisease.getText()));
		} else {
			i.addImmnztnRecmndationRecmndationTarDiseaseTxt("NULL");
		}


		/******************** immunizationrecommendationrecommendationtargetdiseasecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationrecommendationtargetdiseasecodinglist = immunizationrecommendationrecommendationtargetdisease.getCoding();
		for(int immunizationrecommendationrecommendationtargetdiseasecodingi = 0; immunizationrecommendationrecommendationtargetdiseasecodingi<immunizationrecommendationrecommendationtargetdiseasecodinglist.size();immunizationrecommendationrecommendationtargetdiseasecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationrecommendationtargetdiseasecoding = immunizationrecommendationrecommendationtargetdiseasecodinglist.get(immunizationrecommendationrecommendationtargetdiseasecodingi);

		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecodingi == 0) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgDsply("[[");}
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasDisplay()) {

			i.addImmnztnRecmndationRecmndationTarDiseaseCdgDsply(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationRecmndationTarDiseaseCdgDsply("NULL");
		}

		if(immunizationrecommendationrecommendationtargetdiseasecodingi == immunizationrecommendationrecommendationtargetdiseasecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgDsply("]]");}


		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecodingi == 0) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgVrsn("[[");}
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasVersion()) {

			i.addImmnztnRecmndationRecmndationTarDiseaseCdgVrsn(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getVersion()));
		} else {
			i.addImmnztnRecmndationRecmndationTarDiseaseCdgVrsn("NULL");
		}

		if(immunizationrecommendationrecommendationtargetdiseasecodingi == immunizationrecommendationrecommendationtargetdiseasecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgVrsn("]]");}


		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecodingi == 0) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgCd("[[");}
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasCode()) {

			i.addImmnztnRecmndationRecmndationTarDiseaseCdgCd(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getCode()));
		} else {
			i.addImmnztnRecmndationRecmndationTarDiseaseCdgCd("NULL");
		}

		if(immunizationrecommendationrecommendationtargetdiseasecodingi == immunizationrecommendationrecommendationtargetdiseasecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgCd("]]");}


		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecodingi == 0) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd("[[");}
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasUserSelected()) {

			i.addImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationrecommendationtargetdiseasecodingi == immunizationrecommendationrecommendationtargetdiseasecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd("]]");}


		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationtargetdiseasecodingi == 0) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgSys("[[");}
		if(immunizationrecommendationrecommendationtargetdiseasecoding.hasSystem()) {

			i.addImmnztnRecmndationRecmndationTarDiseaseCdgSys(String.valueOf(immunizationrecommendationrecommendationtargetdiseasecoding.getSystem()));
		} else {
			i.addImmnztnRecmndationRecmndationTarDiseaseCdgSys("NULL");
		}

		if(immunizationrecommendationrecommendationtargetdiseasecodingi == immunizationrecommendationrecommendationtargetdiseasecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationTarDiseaseCdgSys("]]");}


		 };
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasDoseNumberPositiveIntType()) {

			i.addImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp("\""+immunizationrecommendationrecommendation.getDoseNumberPositiveIntType().getValueAsString()+"\"");
		} else {
			i.addImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp("NULL");
		}


		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSeriesDosesPositiveIntType()) {

			i.addImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp("\""+immunizationrecommendationrecommendation.getSeriesDosesPositiveIntType().getValueAsString()+"\"");
		} else {
			i.addImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp("NULL");
		}


		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrStrgTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasDoseNumberStringType()) {

			i.addImmnztnRecmndationRecmndationDoseNmbrStrgTyp("\""+immunizationrecommendationrecommendation.getDoseNumberStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnRecmndationRecmndationDoseNmbrStrgTyp("NULL");
		}


		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesStrgTyp ********************************************************************************/
		if(immunizationrecommendationrecommendation.hasSeriesDosesStringType()) {

			i.addImmnztnRecmndationRecmndationSeriesDosesStrgTyp("\""+immunizationrecommendationrecommendation.getSeriesDosesStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnRecmndationRecmndationSeriesDosesStrgTyp("NULL");
		}


		/******************** immunizationrecommendationrecommendationforecastreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationrecommendationrecommendationforecastreasonlist = immunizationrecommendationrecommendation.getForecastReason();
		for(int immunizationrecommendationrecommendationforecastreasoni = 0; immunizationrecommendationrecommendationforecastreasoni<immunizationrecommendationrecommendationforecastreasonlist.size();immunizationrecommendationrecommendationforecastreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationrecommendationrecommendationforecastreason = immunizationrecommendationrecommendationforecastreasonlist.get(immunizationrecommendationrecommendationforecastreasoni);

		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoni == 0) {i.addImmnztnRecmndationRecmndationForecastRsnTxt("[[");}
		if(immunizationrecommendationrecommendationforecastreason.hasText()) {

			i.addImmnztnRecmndationRecmndationForecastRsnTxt(String.valueOf(immunizationrecommendationrecommendationforecastreason.getText()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastRsnTxt("NULL");
		}

		if(immunizationrecommendationrecommendationforecastreasoni == immunizationrecommendationrecommendationforecastreasonlist.size()-1) {i.addImmnztnRecmndationRecmndationForecastRsnTxt("]]");}


		/******************** immunizationrecommendationrecommendationforecastreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationrecommendationforecastreasoncodinglist = immunizationrecommendationrecommendationforecastreason.getCoding();
		for(int immunizationrecommendationrecommendationforecastreasoncodingi = 0; immunizationrecommendationrecommendationforecastreasoncodingi<immunizationrecommendationrecommendationforecastreasoncodinglist.size();immunizationrecommendationrecommendationforecastreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationrecommendationforecastreasoncoding = immunizationrecommendationrecommendationforecastreasoncodinglist.get(immunizationrecommendationrecommendationforecastreasoncodingi);

		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncodingi == 0) {i.addImmnztnRecmndationRecmndationForecastRsnCdgDsply("[[[");}
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasDisplay()) {

			i.addImmnztnRecmndationRecmndationForecastRsnCdgDsply(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastRsnCdgDsply("NULL");
		}

		if(immunizationrecommendationrecommendationforecastreasoncodingi == immunizationrecommendationrecommendationforecastreasoncodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastRsnCdgDsply("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncodingi == 0) {i.addImmnztnRecmndationRecmndationForecastRsnCdgVrsn("[[[");}
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasVersion()) {

			i.addImmnztnRecmndationRecmndationForecastRsnCdgVrsn(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getVersion()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastRsnCdgVrsn("NULL");
		}

		if(immunizationrecommendationrecommendationforecastreasoncodingi == immunizationrecommendationrecommendationforecastreasoncodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastRsnCdgVrsn("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncodingi == 0) {i.addImmnztnRecmndationRecmndationForecastRsnCdgCd("[[[");}
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasCode()) {

			i.addImmnztnRecmndationRecmndationForecastRsnCdgCd(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getCode()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastRsnCdgCd("NULL");
		}

		if(immunizationrecommendationrecommendationforecastreasoncodingi == immunizationrecommendationrecommendationforecastreasoncodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastRsnCdgCd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncodingi == 0) {i.addImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd("[[[");}
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasUserSelected()) {

			i.addImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationrecommendationforecastreasoncodingi == immunizationrecommendationrecommendationforecastreasoncodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationforecastreasoncodingi == 0) {i.addImmnztnRecmndationRecmndationForecastRsnCdgSys("[[[");}
		if(immunizationrecommendationrecommendationforecastreasoncoding.hasSystem()) {

			i.addImmnztnRecmndationRecmndationForecastRsnCdgSys(String.valueOf(immunizationrecommendationrecommendationforecastreasoncoding.getSystem()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastRsnCdgSys("NULL");
		}

		if(immunizationrecommendationrecommendationforecastreasoncodingi == immunizationrecommendationrecommendationforecastreasoncodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastRsnCdgSys("]]]");}


		 };
		 };
		/******************** immunizationrecommendationrecommendationforecaststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationforecaststatus = immunizationrecommendationrecommendation.getForecastStatus();

		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatus.hasText()) {

			i.addImmnztnRecmndationRecmndationForecastStsTxt(String.valueOf(immunizationrecommendationrecommendationforecaststatus.getText()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastStsTxt("NULL");
		}


		/******************** immunizationrecommendationrecommendationforecaststatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationrecommendationforecaststatuscodinglist = immunizationrecommendationrecommendationforecaststatus.getCoding();
		for(int immunizationrecommendationrecommendationforecaststatuscodingi = 0; immunizationrecommendationrecommendationforecaststatuscodingi<immunizationrecommendationrecommendationforecaststatuscodinglist.size();immunizationrecommendationrecommendationforecaststatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationrecommendationforecaststatuscoding = immunizationrecommendationrecommendationforecaststatuscodinglist.get(immunizationrecommendationrecommendationforecaststatuscodingi);

		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscodingi == 0) {i.addImmnztnRecmndationRecmndationForecastStsCdgDsply("[[");}
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasDisplay()) {

			i.addImmnztnRecmndationRecmndationForecastStsCdgDsply(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastStsCdgDsply("NULL");
		}

		if(immunizationrecommendationrecommendationforecaststatuscodingi == immunizationrecommendationrecommendationforecaststatuscodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastStsCdgDsply("]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscodingi == 0) {i.addImmnztnRecmndationRecmndationForecastStsCdgVrsn("[[");}
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasVersion()) {

			i.addImmnztnRecmndationRecmndationForecastStsCdgVrsn(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getVersion()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastStsCdgVrsn("NULL");
		}

		if(immunizationrecommendationrecommendationforecaststatuscodingi == immunizationrecommendationrecommendationforecaststatuscodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastStsCdgVrsn("]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscodingi == 0) {i.addImmnztnRecmndationRecmndationForecastStsCdgCd("[[");}
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasCode()) {

			i.addImmnztnRecmndationRecmndationForecastStsCdgCd(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getCode()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastStsCdgCd("NULL");
		}

		if(immunizationrecommendationrecommendationforecaststatuscodingi == immunizationrecommendationrecommendationforecaststatuscodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastStsCdgCd("]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscodingi == 0) {i.addImmnztnRecmndationRecmndationForecastStsCdgUsrSltd("[[");}
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasUserSelected()) {

			i.addImmnztnRecmndationRecmndationForecastStsCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastStsCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationrecommendationforecaststatuscodingi == immunizationrecommendationrecommendationforecaststatuscodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastStsCdgUsrSltd("]]");}


		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationforecaststatuscodingi == 0) {i.addImmnztnRecmndationRecmndationForecastStsCdgSys("[[");}
		if(immunizationrecommendationrecommendationforecaststatuscoding.hasSystem()) {

			i.addImmnztnRecmndationRecmndationForecastStsCdgSys(String.valueOf(immunizationrecommendationrecommendationforecaststatuscoding.getSystem()));
		} else {
			i.addImmnztnRecmndationRecmndationForecastStsCdgSys("NULL");
		}

		if(immunizationrecommendationrecommendationforecaststatuscodingi == immunizationrecommendationrecommendationforecaststatuscodinglist.size()-1) {i.addImmnztnRecmndationRecmndationForecastStsCdgSys("]]");}


		 };
		/******************** immunizationrecommendationrecommendationdatecriterion ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent> immunizationrecommendationrecommendationdatecriterionlist = immunizationrecommendationrecommendation.getDateCriterion();
		for(int immunizationrecommendationrecommendationdatecriterioni = 0; immunizationrecommendationrecommendationdatecriterioni<immunizationrecommendationrecommendationdatecriterionlist.size();immunizationrecommendationrecommendationdatecriterioni++ ) {
		org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent  immunizationrecommendationrecommendationdatecriterion = immunizationrecommendationrecommendationdatecriterionlist.get(immunizationrecommendationrecommendationdatecriterioni);

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Vl ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioni == 0) {i.addImmnztnRecmndationRecmndationDtCriterionVl("[[");}
		if(immunizationrecommendationrecommendationdatecriterion.hasValue()) {

			i.addImmnztnRecmndationRecmndationDtCriterionVl("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationrecommendationrecommendationdatecriterion.getValue())+"\"");
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionVl("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioni == immunizationrecommendationrecommendationdatecriterionlist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionVl("]]");}


		/******************** immunizationrecommendationrecommendationdatecriterioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationrecommendationrecommendationdatecriterioncode = immunizationrecommendationrecommendationdatecriterion.getCode();

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioni == 0) {i.addImmnztnRecmndationRecmndationDtCriterionCdTxt("[[");}
		if(immunizationrecommendationrecommendationdatecriterioncode.hasText()) {

			i.addImmnztnRecmndationRecmndationDtCriterionCdTxt(String.valueOf(immunizationrecommendationrecommendationdatecriterioncode.getText()));
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionCdTxt("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioni == immunizationrecommendationrecommendationdatecriterionlist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionCdTxt("]]");}


		/******************** immunizationrecommendationrecommendationdatecriterioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationrecommendationdatecriterioncodecodinglist = immunizationrecommendationrecommendationdatecriterioncode.getCoding();
		for(int immunizationrecommendationrecommendationdatecriterioncodecodingi = 0; immunizationrecommendationrecommendationdatecriterioncodecodingi<immunizationrecommendationrecommendationdatecriterioncodecodinglist.size();immunizationrecommendationrecommendationdatecriterioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationrecommendationdatecriterioncodecoding = immunizationrecommendationrecommendationdatecriterioncodecodinglist.get(immunizationrecommendationrecommendationdatecriterioncodecodingi);

		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == 0) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgDsply("[[[");}
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasDisplay()) {

			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgDsply(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgDsply("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == immunizationrecommendationrecommendationdatecriterioncodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgDsply("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == 0) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn("[[[");}
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasVersion()) {

			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getVersion()));
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == immunizationrecommendationrecommendationdatecriterioncodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == 0) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgCd("[[[");}
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasCode()) {

			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgCd(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getCode()));
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgCd("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == immunizationrecommendationrecommendationdatecriterioncodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgCd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == 0) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd("[[[");}
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasUserSelected()) {

			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == immunizationrecommendationrecommendationdatecriterioncodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == 0) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgSys("[[[");}
		if(immunizationrecommendationrecommendationdatecriterioncodecoding.hasSystem()) {

			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgSys(String.valueOf(immunizationrecommendationrecommendationdatecriterioncodecoding.getSystem()));
		} else {
			i.addImmnztnRecmndationRecmndationDtCriterionCdCdgSys("NULL");
		}

		if(immunizationrecommendationrecommendationdatecriterioncodecodingi == immunizationrecommendationrecommendationdatecriterioncodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationDtCriterionCdCdgSys("]]]");}


		 };
		 };
		/******************** immunizationrecommendationrecommendationvaccinecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationrecommendationrecommendationvaccinecodelist = immunizationrecommendationrecommendation.getVaccineCode();
		for(int immunizationrecommendationrecommendationvaccinecodei = 0; immunizationrecommendationrecommendationvaccinecodei<immunizationrecommendationrecommendationvaccinecodelist.size();immunizationrecommendationrecommendationvaccinecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationrecommendationrecommendationvaccinecode = immunizationrecommendationrecommendationvaccinecodelist.get(immunizationrecommendationrecommendationvaccinecodei);

		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Txt ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodei == 0) {i.addImmnztnRecmndationRecmndationVaccineCdTxt("[[");}
		if(immunizationrecommendationrecommendationvaccinecode.hasText()) {

			i.addImmnztnRecmndationRecmndationVaccineCdTxt(String.valueOf(immunizationrecommendationrecommendationvaccinecode.getText()));
		} else {
			i.addImmnztnRecmndationRecmndationVaccineCdTxt("NULL");
		}

		if(immunizationrecommendationrecommendationvaccinecodei == immunizationrecommendationrecommendationvaccinecodelist.size()-1) {i.addImmnztnRecmndationRecmndationVaccineCdTxt("]]");}


		/******************** immunizationrecommendationrecommendationvaccinecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationrecommendationrecommendationvaccinecodecodinglist = immunizationrecommendationrecommendationvaccinecode.getCoding();
		for(int immunizationrecommendationrecommendationvaccinecodecodingi = 0; immunizationrecommendationrecommendationvaccinecodecodingi<immunizationrecommendationrecommendationvaccinecodecodinglist.size();immunizationrecommendationrecommendationvaccinecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationrecommendationrecommendationvaccinecodecoding = immunizationrecommendationrecommendationvaccinecodecodinglist.get(immunizationrecommendationrecommendationvaccinecodecodingi);

		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationVaccineCdCdgDsply("[[[");}
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasDisplay()) {

			i.addImmnztnRecmndationRecmndationVaccineCdCdgDsply(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getDisplay()));
		} else {
			i.addImmnztnRecmndationRecmndationVaccineCdCdgDsply("NULL");
		}

		if(immunizationrecommendationrecommendationvaccinecodecodingi == immunizationrecommendationrecommendationvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationVaccineCdCdgDsply("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationVaccineCdCdgVrsn("[[[");}
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasVersion()) {

			i.addImmnztnRecmndationRecmndationVaccineCdCdgVrsn(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getVersion()));
		} else {
			i.addImmnztnRecmndationRecmndationVaccineCdCdgVrsn("NULL");
		}

		if(immunizationrecommendationrecommendationvaccinecodecodingi == immunizationrecommendationrecommendationvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationVaccineCdCdgVrsn("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Cd ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationVaccineCdCdgCd("[[[");}
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasCode()) {

			i.addImmnztnRecmndationRecmndationVaccineCdCdgCd(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getCode()));
		} else {
			i.addImmnztnRecmndationRecmndationVaccineCdCdgCd("NULL");
		}

		if(immunizationrecommendationrecommendationvaccinecodecodingi == immunizationrecommendationrecommendationvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationVaccineCdCdgCd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd("[[[");}
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasUserSelected()) {

			i.addImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getUserSelected()));
		} else {
			i.addImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd("NULL");
		}

		if(immunizationrecommendationrecommendationvaccinecodecodingi == immunizationrecommendationrecommendationvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd("]]]");}


		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Sys ********************************************************************************/
		if(immunizationrecommendationrecommendationvaccinecodecodingi == 0) {i.addImmnztnRecmndationRecmndationVaccineCdCdgSys("[[[");}
		if(immunizationrecommendationrecommendationvaccinecodecoding.hasSystem()) {

			i.addImmnztnRecmndationRecmndationVaccineCdCdgSys(String.valueOf(immunizationrecommendationrecommendationvaccinecodecoding.getSystem()));
		} else {
			i.addImmnztnRecmndationRecmndationVaccineCdCdgSys("NULL");
		}

		if(immunizationrecommendationrecommendationvaccinecodecodingi == immunizationrecommendationrecommendationvaccinecodecodinglist.size()-1) {i.addImmnztnRecmndationRecmndationVaccineCdCdgSys("]]]");}


		 };
		 };
		 };
		return i;
	}
}
