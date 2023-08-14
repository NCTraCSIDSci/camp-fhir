package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import main.java.com.campfhir.model.Encounter;
public class EncounterConversion 
{

	
	public org.hl7.fhir.r4.model.Encounter Encounters(Encounter e) throws ParseException
	{
		org.hl7.fhir.r4.model.Encounter encounter = new org.hl7.fhir.r4.model.Encounter();
//		 SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd");
		/******************** id ********************************************************************************/
		encounter.setId(e.getId());

		/******************** Enc_Account ********************************************************************************/
		if(e.getEncAccount() != null ) {

				for( String currListStrSplit : e.getEncAccount().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			encounter.addAccount(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Enc_Appmnt ********************************************************************************/
		if(e.getEncAppmnt() != null ) {

				for( String currListStrSplit : e.getEncAppmnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			encounter.addAppointment(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Enc_BasedOn ********************************************************************************/
		if(e.getEncBasedOn() != null ) {

				for( String currListStrSplit : e.getEncBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			encounter.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Enc_ClsHis_Cls__Cd ********************************************************************************/
		if(e.getEncClsHisClsCd() != null ) {

			String[] arrayi0 = e.getEncClsHisClsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getClass_().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_ClsHis_Cls__Dsply ********************************************************************************/
		if(e.getEncClsHisClsDsply() != null ) {

			String[] arrayi0 = e.getEncClsHisClsDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getClass_().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_ClsHis_Cls__Sys ********************************************************************************/
		if(e.getEncClsHisClsSys() != null ) {

			String[] arrayi0 = e.getEncClsHisClsSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getClass_().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_ClsHis_Cls__UsrSltd ********************************************************************************/
		if(e.getEncClsHisClsUsrSltd() != null ) {

			String[] arrayi0 = e.getEncClsHisClsUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getClass_().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_ClsHis_Cls__Vrsn ********************************************************************************/
		if(e.getEncClsHisClsVrsn() != null ) {

			String[] arrayi0 = e.getEncClsHisClsVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getClass_().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_ClsHis_Prd_End ********************************************************************************/
		if(e.getEncClsHisPrdEnd() != null ) {

			String[] arrayi0 = e.getEncClsHisPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_ClsHis_Prd_Strt ********************************************************************************/
		if(e.getEncClsHisPrdStrt() != null ) {

			String[] arrayi0 = e.getEncClsHisPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Cls__Cd ********************************************************************************/
		if(e.getEncClsCd() != null ) {

			if(e.getEncClsCd().replace("[","").replace("]","").equals("NULL") | e.getEncClsCd()==null) {} else {
			encounter.getClass_().setCode(e.getEncClsCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Cls__Dsply ********************************************************************************/
		if(e.getEncClsDsply() != null ) {

			if(e.getEncClsDsply().replace("[","").replace("]","").equals("NULL") | e.getEncClsDsply()==null) {} else {
			encounter.getClass_().setDisplay(e.getEncClsDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Cls__Sys ********************************************************************************/
		if(e.getEncClsSys() != null ) {

			if(e.getEncClsSys().replace("[","").replace("]","").equals("NULL") | e.getEncClsSys()==null) {} else {
			encounter.getClass_().setSystem(e.getEncClsSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Cls__UsrSltd ********************************************************************************/
		if(e.getEncClsUsrSltd() != null ) {

			if(e.getEncClsUsrSltd().replace("[","").replace("]","").equals("NULL") | e.getEncClsUsrSltd()==null) {} else {
			encounter.getClass_().setUserSelected(Boolean.parseBoolean(e.getEncClsUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Cls__Vrsn ********************************************************************************/
		if(e.getEncClsVrsn() != null ) {

			if(e.getEncClsVrsn().replace("[","").replace("]","").equals("NULL") | e.getEncClsVrsn()==null) {} else {
			encounter.getClass_().setVersion(e.getEncClsVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Dgnsis_Cndtn ********************************************************************************/
		if(e.getEncDgnsisCndtn() != null ) {

			String[] arrayi0 = e.getEncDgnsisCndtn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getDiagnosis().get(i0).setCondition(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Dgnsis_Rnk ********************************************************************************/
		if(e.getEncDgnsisRnk() != null ) {

			String[] arrayi0 = e.getEncDgnsisRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getDiagnosis().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Dgnsis_Use_Cdg_Cd ********************************************************************************/
		if(e.getEncDgnsisUseCdgCd() != null ) {

			String[] arrayi0 = e.getEncDgnsisUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				String[] arrayi1 = e.getEncDgnsisUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getDiagnosis().get(i0).getUse().getCoding().size() < i1+1) { encounter.getDiagnosis().get(i0).getUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getDiagnosis().get(i0).getUse().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Dgnsis_Use_Cdg_Dsply ********************************************************************************/
		if(e.getEncDgnsisUseCdgDsply() != null ) {

			String[] arrayi0 = e.getEncDgnsisUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				String[] arrayi1 = e.getEncDgnsisUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getDiagnosis().get(i0).getUse().getCoding().size() < i1+1) { encounter.getDiagnosis().get(i0).getUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getDiagnosis().get(i0).getUse().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Dgnsis_Use_Cdg_Sys ********************************************************************************/
		if(e.getEncDgnsisUseCdgSys() != null ) {

			String[] arrayi0 = e.getEncDgnsisUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				String[] arrayi1 = e.getEncDgnsisUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getDiagnosis().get(i0).getUse().getCoding().size() < i1+1) { encounter.getDiagnosis().get(i0).getUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getDiagnosis().get(i0).getUse().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Dgnsis_Use_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncDgnsisUseCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncDgnsisUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				String[] arrayi1 = e.getEncDgnsisUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getDiagnosis().get(i0).getUse().getCoding().size() < i1+1) { encounter.getDiagnosis().get(i0).getUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getDiagnosis().get(i0).getUse().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Dgnsis_Use_Cdg_Vrsn ********************************************************************************/
		if(e.getEncDgnsisUseCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncDgnsisUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				String[] arrayi1 = e.getEncDgnsisUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getDiagnosis().get(i0).getUse().getCoding().size() < i1+1) { encounter.getDiagnosis().get(i0).getUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getDiagnosis().get(i0).getUse().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Dgnsis_Use_Txt ********************************************************************************/
		if(e.getEncDgnsisUseTxt() != null ) {

			String[] arrayi0 = e.getEncDgnsisUseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getDiagnosis().size() < i0+1) { encounter.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getDiagnosis().get(i0).getUse().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_EpisodeOfCare ********************************************************************************/
		if(e.getEncEpisodeOfCare() != null ) {

				for( String currListStrSplit : e.getEncEpisodeOfCare().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			encounter.addEpisodeOfCare(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationAdmitSrcCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getAdmitSource().getCoding().size() < i0+1) { encounter.getHospitalization().getAdmitSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getAdmitSource().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationAdmitSrcCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getAdmitSource().getCoding().size() < i0+1) { encounter.getHospitalization().getAdmitSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getAdmitSource().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationAdmitSrcCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getAdmitSource().getCoding().size() < i0+1) { encounter.getHospitalization().getAdmitSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getAdmitSource().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationAdmitSrcCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getAdmitSource().getCoding().size() < i0+1) { encounter.getHospitalization().getAdmitSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getAdmitSource().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Hospitalization_AdmitSrc_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationAdmitSrcCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getAdmitSource().getCoding().size() < i0+1) { encounter.getHospitalization().getAdmitSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getAdmitSource().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_AdmitSrc_Txt ********************************************************************************/
		if(e.getEncHospitalizationAdmitSrcTxt() != null ) {

			if(e.getEncHospitalizationAdmitSrcTxt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationAdmitSrcTxt()==null) {} else {
			encounter.getHospitalization().getAdmitSource().setText(e.getEncHospitalizationAdmitSrcTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Hospitalization_Destination ********************************************************************************/
		if(e.getEncHospitalizationDestination() != null ) {

			if(e.getEncHospitalizationDestination().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationDestination()==null) {} else {
			encounter.getHospitalization().setDestination(new org.hl7.fhir.r4.model.Reference(e.getEncHospitalizationDestination().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDietPreferenceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDietPreference().size() < i0+1) { encounter.getHospitalization().addDietPreference(); }
				String[] arrayi1 = e.getEncHospitalizationDietPreferenceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getDietPreference().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getDietPreference().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getDietPreference().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDietPreferenceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDietPreference().size() < i0+1) { encounter.getHospitalization().addDietPreference(); }
				String[] arrayi1 = e.getEncHospitalizationDietPreferenceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getDietPreference().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getDietPreference().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getDietPreference().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDietPreferenceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDietPreference().size() < i0+1) { encounter.getHospitalization().addDietPreference(); }
				String[] arrayi1 = e.getEncHospitalizationDietPreferenceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getDietPreference().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getDietPreference().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getDietPreference().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDietPreferenceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDietPreference().size() < i0+1) { encounter.getHospitalization().addDietPreference(); }
				String[] arrayi1 = e.getEncHospitalizationDietPreferenceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getDietPreference().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getDietPreference().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getDietPreference().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Hospitalization_DietPreference_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDietPreferenceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDietPreference().size() < i0+1) { encounter.getHospitalization().addDietPreference(); }
				String[] arrayi1 = e.getEncHospitalizationDietPreferenceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getDietPreference().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getDietPreference().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getDietPreference().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_DietPreference_Txt ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceTxt() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDietPreferenceTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDietPreference().size() < i0+1) { encounter.getHospitalization().addDietPreference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getDietPreference().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDischargeDispositionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDischargeDisposition().getCoding().size() < i0+1) { encounter.getHospitalization().getDischargeDisposition().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getDischargeDisposition().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDischargeDispositionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDischargeDisposition().getCoding().size() < i0+1) { encounter.getHospitalization().getDischargeDisposition().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getDischargeDisposition().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDischargeDispositionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDischargeDisposition().getCoding().size() < i0+1) { encounter.getHospitalization().getDischargeDisposition().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getDischargeDisposition().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDischargeDispositionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDischargeDisposition().getCoding().size() < i0+1) { encounter.getHospitalization().getDischargeDisposition().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getDischargeDisposition().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Hospitalization_DischargeDisposition_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationDischargeDispositionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getDischargeDisposition().getCoding().size() < i0+1) { encounter.getHospitalization().getDischargeDisposition().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getDischargeDisposition().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_DischargeDisposition_Txt ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionTxt() != null ) {

			if(e.getEncHospitalizationDischargeDispositionTxt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationDischargeDispositionTxt()==null) {} else {
			encounter.getHospitalization().getDischargeDisposition().setText(e.getEncHospitalizationDischargeDispositionTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Hospitalization_Origin ********************************************************************************/
		if(e.getEncHospitalizationOrigin() != null ) {

			if(e.getEncHospitalizationOrigin().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationOrigin()==null) {} else {
			encounter.getHospitalization().setOrigin(new org.hl7.fhir.r4.model.Reference(e.getEncHospitalizationOrigin().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Assigner ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdAssigner() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdAssigner().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdAssigner()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(e.getEncHospitalizationPreAdmissionIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Prd_End ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPrdEnd() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdEnd()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().getPeriod().setEnd(e.getEncHospitalizationPreAdmissionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdEnd()==null ? null : convertStringToDate(e.getEncHospitalizationPreAdmissionIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Prd_Strt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPrdStrt() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdStrt()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().getPeriod().setStart(e.getEncHospitalizationPreAdmissionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdStrt()==null ? null : convertStringToDate(e.getEncHospitalizationPreAdmissionIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Sys ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdSys() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdSys().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdSys()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().setSystem(e.getEncHospitalizationPreAdmissionIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationPreAdmissionIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().size() < i0+1) { encounter.getHospitalization().getPreAdmissionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationPreAdmissionIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().size() < i0+1) { encounter.getHospitalization().getPreAdmissionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationPreAdmissionIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().size() < i0+1) { encounter.getHospitalization().getPreAdmissionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationPreAdmissionIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().size() < i0+1) { encounter.getHospitalization().getPreAdmissionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationPreAdmissionIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().size() < i0+1) { encounter.getHospitalization().getPreAdmissionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getPreAdmissionIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Typ_Txt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypTxt() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdTypTxt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdTypTxt()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().getType().setText(e.getEncHospitalizationPreAdmissionIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Use ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdUse() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdUse().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdUse()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(e.getEncHospitalizationPreAdmissionIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Vl ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdVl() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdVl().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdVl()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().setValue(e.getEncHospitalizationPreAdmissionIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationReAdmissionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getReAdmission().getCoding().size() < i0+1) { encounter.getHospitalization().getReAdmission().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getReAdmission().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationReAdmissionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getReAdmission().getCoding().size() < i0+1) { encounter.getHospitalization().getReAdmission().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getReAdmission().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationReAdmissionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getReAdmission().getCoding().size() < i0+1) { encounter.getHospitalization().getReAdmission().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getReAdmission().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationReAdmissionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getReAdmission().getCoding().size() < i0+1) { encounter.getHospitalization().getReAdmission().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getReAdmission().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Hospitalization_ReAdmission_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationReAdmissionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getReAdmission().getCoding().size() < i0+1) { encounter.getHospitalization().getReAdmission().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getReAdmission().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_ReAdmission_Txt ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionTxt() != null ) {

			if(e.getEncHospitalizationReAdmissionTxt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationReAdmissionTxt()==null) {} else {
			encounter.getHospitalization().getReAdmission().setText(e.getEncHospitalizationReAdmissionTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclArrangementCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialArrangement().size() < i0+1) { encounter.getHospitalization().addSpecialArrangement(); }
				String[] arrayi1 = e.getEncHospitalizationSpclArrangementCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialArrangement().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclArrangementCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialArrangement().size() < i0+1) { encounter.getHospitalization().addSpecialArrangement(); }
				String[] arrayi1 = e.getEncHospitalizationSpclArrangementCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialArrangement().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclArrangementCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialArrangement().size() < i0+1) { encounter.getHospitalization().addSpecialArrangement(); }
				String[] arrayi1 = e.getEncHospitalizationSpclArrangementCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialArrangement().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclArrangementCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialArrangement().size() < i0+1) { encounter.getHospitalization().addSpecialArrangement(); }
				String[] arrayi1 = e.getEncHospitalizationSpclArrangementCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialArrangement().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclArrangement_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclArrangementCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialArrangement().size() < i0+1) { encounter.getHospitalization().addSpecialArrangement(); }
				String[] arrayi1 = e.getEncHospitalizationSpclArrangementCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialArrangement().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialArrangement().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclArrangement_Txt ********************************************************************************/
		if(e.getEncHospitalizationSpclArrangementTxt() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclArrangementTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialArrangement().size() < i0+1) { encounter.getHospitalization().addSpecialArrangement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getSpecialArrangement().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Cd ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgCd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclCourtesyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialCourtesy().size() < i0+1) { encounter.getHospitalization().addSpecialCourtesy(); }
				String[] arrayi1 = e.getEncHospitalizationSpclCourtesyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialCourtesy().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Dsply ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgDsply() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclCourtesyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialCourtesy().size() < i0+1) { encounter.getHospitalization().addSpecialCourtesy(); }
				String[] arrayi1 = e.getEncHospitalizationSpclCourtesyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialCourtesy().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Sys ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgSys() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclCourtesyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialCourtesy().size() < i0+1) { encounter.getHospitalization().addSpecialCourtesy(); }
				String[] arrayi1 = e.getEncHospitalizationSpclCourtesyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialCourtesy().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclCourtesyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialCourtesy().size() < i0+1) { encounter.getHospitalization().addSpecialCourtesy(); }
				String[] arrayi1 = e.getEncHospitalizationSpclCourtesyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialCourtesy().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclCourtesy_Cdg_Vrsn ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclCourtesyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialCourtesy().size() < i0+1) { encounter.getHospitalization().addSpecialCourtesy(); }
				String[] arrayi1 = e.getEncHospitalizationSpclCourtesyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().size() < i1+1) { encounter.getHospitalization().getSpecialCourtesy().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getHospitalization().getSpecialCourtesy().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Hospitalization_SpclCourtesy_Txt ********************************************************************************/
		if(e.getEncHospitalizationSpclCourtesyTxt() != null ) {

			String[] arrayi0 = e.getEncHospitalizationSpclCourtesyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getHospitalization().getSpecialCourtesy().size() < i0+1) { encounter.getHospitalization().addSpecialCourtesy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getHospitalization().getSpecialCourtesy().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Id_Assigner ********************************************************************************/
		if(e.getEncIdAssigner() != null ) {

			String[] arrayi0 = e.getEncIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Id_Prd_End ********************************************************************************/
		if(e.getEncIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEncIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Id_Prd_Strt ********************************************************************************/
		if(e.getEncIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Id_Sys ********************************************************************************/
		if(e.getEncIdSys() != null ) {

			String[] arrayi0 = e.getEncIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				String[] arrayi1 = e.getEncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { encounter.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				String[] arrayi1 = e.getEncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { encounter.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				String[] arrayi1 = e.getEncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { encounter.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				String[] arrayi1 = e.getEncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { encounter.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				String[] arrayi1 = e.getEncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { encounter.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Id_Typ_Txt ********************************************************************************/
		if(e.getEncIdTypTxt() != null ) {

			String[] arrayi0 = e.getEncIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Id_Use ********************************************************************************/
		if(e.getEncIdUse() != null ) {

			String[] arrayi0 = e.getEncIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Id_Vl ********************************************************************************/
		if(e.getEncIdVl() != null ) {

			String[] arrayi0 = e.getEncIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Length_Cd ********************************************************************************/
		if(e.getEncLengthCd() != null ) {

			if(e.getEncLengthCd().replace("[","").replace("]","").equals("NULL") | e.getEncLengthCd()==null) {} else {
			encounter.getLength().setCode(e.getEncLengthCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Length_Cmprtr ********************************************************************************/
		if(e.getEncLengthCmprtr() != null ) {

			if(e.getEncLengthCmprtr().replace("[","").replace("]","").equals("NULL") | e.getEncLengthCmprtr()==null) {} else {
			encounter.getLength().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(e.getEncLengthCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Length_Sys ********************************************************************************/
		if(e.getEncLengthSys() != null ) {

			if(e.getEncLengthSys().replace("[","").replace("]","").equals("NULL") | e.getEncLengthSys()==null) {} else {
			encounter.getLength().setSystem(e.getEncLengthSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Length_Unt ********************************************************************************/
		if(e.getEncLengthUnt() != null ) {

			if(e.getEncLengthUnt().replace("[","").replace("]","").equals("NULL") | e.getEncLengthUnt()==null) {} else {
			encounter.getLength().setUnit(e.getEncLengthUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Length_Vl ********************************************************************************/
		if(e.getEncLengthVl() != null ) {

			if(e.getEncLengthVl().replace("[","").replace("]","").equals("NULL") | e.getEncLengthVl()==null) {} else {
			encounter.getLength().setValue((new java.math.BigDecimal((e.getEncLengthVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Enc_Lctn_Lctn ********************************************************************************/
		if(e.getEncLctnLctn() != null ) {

			String[] arrayi0 = e.getEncLctnLctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Lctn_Prd_End ********************************************************************************/
		if(e.getEncLctnPrdEnd() != null ) {

			String[] arrayi0 = e.getEncLctnPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Lctn_Prd_Strt ********************************************************************************/
		if(e.getEncLctnPrdStrt() != null ) {

			String[] arrayi0 = e.getEncLctnPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgCd() != null ) {

			String[] arrayi0 = e.getEncLctnPhysclTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				String[] arrayi1 = e.getEncLctnPhysclTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getLocation().get(i0).getPhysicalType().getCoding().size() < i1+1) { encounter.getLocation().get(i0).getPhysicalType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getLocation().get(i0).getPhysicalType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEncLctnPhysclTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				String[] arrayi1 = e.getEncLctnPhysclTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getLocation().get(i0).getPhysicalType().getCoding().size() < i1+1) { encounter.getLocation().get(i0).getPhysicalType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getLocation().get(i0).getPhysicalType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgSys() != null ) {

			String[] arrayi0 = e.getEncLctnPhysclTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				String[] arrayi1 = e.getEncLctnPhysclTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getLocation().get(i0).getPhysicalType().getCoding().size() < i1+1) { encounter.getLocation().get(i0).getPhysicalType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getLocation().get(i0).getPhysicalType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncLctnPhysclTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				String[] arrayi1 = e.getEncLctnPhysclTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getLocation().get(i0).getPhysicalType().getCoding().size() < i1+1) { encounter.getLocation().get(i0).getPhysicalType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getLocation().get(i0).getPhysicalType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEncLctnPhysclTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncLctnPhysclTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				String[] arrayi1 = e.getEncLctnPhysclTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getLocation().get(i0).getPhysicalType().getCoding().size() < i1+1) { encounter.getLocation().get(i0).getPhysicalType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getLocation().get(i0).getPhysicalType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Lctn_PhysclTyp_Txt ********************************************************************************/
		if(e.getEncLctnPhysclTypTxt() != null ) {

			String[] arrayi0 = e.getEncLctnPhysclTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).getPhysicalType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Lctn_Sts ********************************************************************************/
		if(e.getEncLctnSts() != null ) {

			String[] arrayi0 = e.getEncLctnSts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).setStatus(new org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_PartOf ********************************************************************************/
		if(e.getEncPartOf() != null ) {

			if(e.getEncPartOf().replace("[","").replace("]","").equals("NULL") | e.getEncPartOf()==null) {} else {
			encounter.setPartOf(new org.hl7.fhir.r4.model.Reference(e.getEncPartOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Prtcpnt_Individual ********************************************************************************/
		if(e.getEncPrtcpntIndividual() != null ) {

			String[] arrayi0 = e.getEncPrtcpntIndividual().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getParticipant().get(i0).setIndividual(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Prtcpnt_Prd_End ********************************************************************************/
		if(e.getEncPrtcpntPrdEnd() != null ) {

			String[] arrayi0 = e.getEncPrtcpntPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getParticipant().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Prtcpnt_Prd_Strt ********************************************************************************/
		if(e.getEncPrtcpntPrdStrt() != null ) {

			String[] arrayi0 = e.getEncPrtcpntPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getParticipant().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncPrtcpntTypCdgCd() != null ) {

			String[] arrayi0 = e.getEncPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				String[] arrayi1 = e.getEncPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getParticipant().get(i0).getType().size() < i1+1) { encounter.getParticipant().get(i0).addType(); }
					String[] arrayi2 = e.getEncPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(encounter.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { encounter.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {encounter.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncPrtcpntTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEncPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				String[] arrayi1 = e.getEncPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getParticipant().get(i0).getType().size() < i1+1) { encounter.getParticipant().get(i0).addType(); }
					String[] arrayi2 = e.getEncPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(encounter.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { encounter.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {encounter.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncPrtcpntTypCdgSys() != null ) {

			String[] arrayi0 = e.getEncPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				String[] arrayi1 = e.getEncPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getParticipant().get(i0).getType().size() < i1+1) { encounter.getParticipant().get(i0).addType(); }
					String[] arrayi2 = e.getEncPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(encounter.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { encounter.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {encounter.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Enc_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncPrtcpntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				String[] arrayi1 = e.getEncPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getParticipant().get(i0).getType().size() < i1+1) { encounter.getParticipant().get(i0).addType(); }
					String[] arrayi2 = e.getEncPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(encounter.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { encounter.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {encounter.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Enc_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncPrtcpntTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				String[] arrayi1 = e.getEncPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getParticipant().get(i0).getType().size() < i1+1) { encounter.getParticipant().get(i0).addType(); }
					String[] arrayi2 = e.getEncPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(encounter.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { encounter.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {encounter.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Enc_Prtcpnt_Typ_Txt ********************************************************************************/
		if(e.getEncPrtcpntTypTxt() != null ) {

			String[] arrayi0 = e.getEncPrtcpntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				String[] arrayi1 = e.getEncPrtcpntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getParticipant().get(i0).getType().size() < i1+1) { encounter.getParticipant().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getParticipant().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Prd_End ********************************************************************************/
		if(e.getEncPrdEnd() != null ) {

			if(e.getEncPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEncPrdEnd()==null) {} else {
			encounter.getPeriod().setEnd(e.getEncPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEncPrdEnd()==null ? null : convertStringToDate(e.getEncPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Prd_Strt ********************************************************************************/
		if(e.getEncPrdStrt() != null ) {

			if(e.getEncPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncPrdStrt()==null) {} else {
			encounter.getPeriod().setStart(e.getEncPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncPrdStrt()==null ? null : convertStringToDate(e.getEncPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Priority_Cdg_Cd ********************************************************************************/
		if(e.getEncPriorityCdgCd() != null ) {

			String[] arrayi0 = e.getEncPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getPriority().getCoding().size() < i0+1) { encounter.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getPriority().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Priority_Cdg_Dsply ********************************************************************************/
		if(e.getEncPriorityCdgDsply() != null ) {

			String[] arrayi0 = e.getEncPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getPriority().getCoding().size() < i0+1) { encounter.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getPriority().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Priority_Cdg_Sys ********************************************************************************/
		if(e.getEncPriorityCdgSys() != null ) {

			String[] arrayi0 = e.getEncPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getPriority().getCoding().size() < i0+1) { encounter.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getPriority().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Priority_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncPriorityCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getPriority().getCoding().size() < i0+1) { encounter.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getPriority().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Priority_Cdg_Vrsn ********************************************************************************/
		if(e.getEncPriorityCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getPriority().getCoding().size() < i0+1) { encounter.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getPriority().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_Priority_Txt ********************************************************************************/
		if(e.getEncPriorityTxt() != null ) {

			if(e.getEncPriorityTxt().replace("[","").replace("]","").equals("NULL") | e.getEncPriorityTxt()==null) {} else {
			encounter.getPriority().setText(e.getEncPriorityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_RsnCd_Cdg_Cd ********************************************************************************/
		if(e.getEncRsnCdCdgCd() != null ) {

			String[] arrayi0 = e.getEncRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getReasonCode().size() < i0+1) { encounter.addReasonCode(); }
				String[] arrayi1 = e.getEncRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getReasonCode().get(i0).getCoding().size() < i1+1) { encounter.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_RsnCd_Cdg_Dsply ********************************************************************************/
		if(e.getEncRsnCdCdgDsply() != null ) {

			String[] arrayi0 = e.getEncRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getReasonCode().size() < i0+1) { encounter.addReasonCode(); }
				String[] arrayi1 = e.getEncRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getReasonCode().get(i0).getCoding().size() < i1+1) { encounter.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_RsnCd_Cdg_Sys ********************************************************************************/
		if(e.getEncRsnCdCdgSys() != null ) {

			String[] arrayi0 = e.getEncRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getReasonCode().size() < i0+1) { encounter.addReasonCode(); }
				String[] arrayi1 = e.getEncRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getReasonCode().get(i0).getCoding().size() < i1+1) { encounter.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getReasonCode().size() < i0+1) { encounter.addReasonCode(); }
				String[] arrayi1 = e.getEncRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getReasonCode().get(i0).getCoding().size() < i1+1) { encounter.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(e.getEncRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getReasonCode().size() < i0+1) { encounter.addReasonCode(); }
				String[] arrayi1 = e.getEncRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getReasonCode().get(i0).getCoding().size() < i1+1) { encounter.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_RsnCd_Txt ********************************************************************************/
		if(e.getEncRsnCdTxt() != null ) {

			String[] arrayi0 = e.getEncRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getReasonCode().size() < i0+1) { encounter.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_RsnRfrnc ********************************************************************************/
		if(e.getEncRsnRfrnc() != null ) {

				for( String currListStrSplit : e.getEncRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			encounter.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Enc_SrvProvider ********************************************************************************/
		if(e.getEncSrvProvider() != null ) {

			if(e.getEncSrvProvider().replace("[","").replace("]","").equals("NULL") | e.getEncSrvProvider()==null) {} else {
			encounter.setServiceProvider(new org.hl7.fhir.r4.model.Reference(e.getEncSrvProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_SrvTyp_Cdg_Cd ********************************************************************************/
		if(e.getEncSrvTypCdgCd() != null ) {

			String[] arrayi0 = e.getEncSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getServiceType().getCoding().size() < i0+1) { encounter.getServiceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getServiceType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEncSrvTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEncSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getServiceType().getCoding().size() < i0+1) { encounter.getServiceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getServiceType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_SrvTyp_Cdg_Sys ********************************************************************************/
		if(e.getEncSrvTypCdgSys() != null ) {

			String[] arrayi0 = e.getEncSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getServiceType().getCoding().size() < i0+1) { encounter.getServiceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getServiceType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncSrvTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getServiceType().getCoding().size() < i0+1) { encounter.getServiceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getServiceType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEncSrvTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getServiceType().getCoding().size() < i0+1) { encounter.getServiceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getServiceType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Enc_SrvTyp_Txt ********************************************************************************/
		if(e.getEncSrvTypTxt() != null ) {

			if(e.getEncSrvTypTxt().replace("[","").replace("]","").equals("NULL") | e.getEncSrvTypTxt()==null) {} else {
			encounter.getServiceType().setText(e.getEncSrvTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Enc_Sts ********************************************************************************/
		if(e.getEncSts() != null ) {

			if(e.getEncSts().replace("[","").replace("]","").equals("NULL") | e.getEncSts()==null) {} else {
			encounter.setStatus(new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory().fromCode(e.getEncSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_StsHis_Prd_End ********************************************************************************/
		if(e.getEncStsHisPrdEnd() != null ) {

			String[] arrayi0 = e.getEncStsHisPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getStatusHistory().size() < i0+1) { encounter.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getStatusHistory().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_StsHis_Prd_Strt ********************************************************************************/
		if(e.getEncStsHisPrdStrt() != null ) {

			String[] arrayi0 = e.getEncStsHisPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getStatusHistory().size() < i0+1) { encounter.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getStatusHistory().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_StsHis_Sts ********************************************************************************/
		if(e.getEncStsHisSts() != null ) {

			String[] arrayi0 = e.getEncStsHisSts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getStatusHistory().size() < i0+1) { encounter.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getStatusHistory().get(i0).setStatus(new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Sbjct ********************************************************************************/
		if(e.getEncSbjct() != null ) {

			if(e.getEncSbjct().replace("[","").replace("]","").equals("NULL") | e.getEncSbjct()==null) {} else {
			encounter.setSubject(new org.hl7.fhir.r4.model.Reference(e.getEncSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEncTypCdgCd() != null ) {

			String[] arrayi0 = e.getEncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getType().size() < i0+1) { encounter.addType(); }
				String[] arrayi1 = e.getEncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getType().get(i0).getCoding().size() < i1+1) { encounter.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEncTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getType().size() < i0+1) { encounter.addType(); }
				String[] arrayi1 = e.getEncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getType().get(i0).getCoding().size() < i1+1) { encounter.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEncTypCdgSys() != null ) {

			String[] arrayi0 = e.getEncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getType().size() < i0+1) { encounter.addType(); }
				String[] arrayi1 = e.getEncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getType().get(i0).getCoding().size() < i1+1) { encounter.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getType().size() < i0+1) { encounter.addType(); }
				String[] arrayi1 = e.getEncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getType().get(i0).getCoding().size() < i1+1) { encounter.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Enc_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEncTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getType().size() < i0+1) { encounter.addType(); }
				String[] arrayi1 = e.getEncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(encounter.getType().get(i0).getCoding().size() < i1+1) { encounter.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {encounter.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Enc_Typ_Txt ********************************************************************************/
		if(e.getEncTypTxt() != null ) {

			String[] arrayi0 = e.getEncTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getType().size() < i0+1) { encounter.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}


		}
		return encounter;
	}
	
	public static DateTimeFormatter formatter = new DateTimeFormatterBuilder()
		    .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"))
		    .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"))
            .appendOptional(DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss 'GMT'"))
		    .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
		    .toFormatter();
	

	private static Date convertStringToDate(String dateString) {
		 try {
			 return Date.from(LocalDateTime.parse(dateString, formatter).atZone(ZoneOffset.UTC).toInstant());
		 } catch(Exception e) {
			 return Date.from(LocalDate.parse(dateString, formatter).atStartOfDay(ZoneId.systemDefault()).toInstant());
		 }
	}
	
}
