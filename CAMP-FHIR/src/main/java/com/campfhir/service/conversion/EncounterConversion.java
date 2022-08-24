package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Encounter;
public class EncounterConversion 
{
	public org.hl7.fhir.r4.model.Encounter Encounters(Encounter e) throws ParseException
	{
		org.hl7.fhir.r4.model.Encounter encounter = new org.hl7.fhir.r4.model.Encounter();

		/******************** id ********************************************************************************/
		encounter.setId(e.getId());

		/******************** Enc_Account ********************************************************************************/
<<<<<<< HEAD
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
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_ClsHis_Prd_Strt ********************************************************************************/
		if(e.getEncClsHisPrdStrt() != null ) {

			String[] arrayi0 = e.getEncClsHisPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getClassHistory().size() < i0+1) { encounter.addClassHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getClassHistory().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
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
			encounter.getHospitalization().getPreAdmissionIdentifier().getPeriod().setEnd(e.getEncHospitalizationPreAdmissionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEncHospitalizationPreAdmissionIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Prd_Strt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPrdStrt() != null ) {

			if(e.getEncHospitalizationPreAdmissionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdStrt()==null) {} else {
			encounter.getHospitalization().getPreAdmissionIdentifier().getPeriod().setStart(e.getEncHospitalizationPreAdmissionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncHospitalizationPreAdmissionIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEncHospitalizationPreAdmissionIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
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
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Id_Prd_Strt ********************************************************************************/
		if(e.getEncIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getIdentifier().size() < i0+1) { encounter.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
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
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Lctn_Prd_Strt ********************************************************************************/
		if(e.getEncLctnPrdStrt() != null ) {

			String[] arrayi0 = e.getEncLctnPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getLocation().size() < i0+1) { encounter.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getLocation().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
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
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getParticipant().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_Prtcpnt_Prd_Strt ********************************************************************************/
		if(e.getEncPrtcpntPrdStrt() != null ) {

			String[] arrayi0 = e.getEncPrtcpntPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getParticipant().size() < i0+1) { encounter.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getParticipant().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
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
			encounter.getPeriod().setEnd(e.getEncPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEncPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEncPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Enc_Prd_Strt ********************************************************************************/
		if(e.getEncPrdStrt() != null ) {

			if(e.getEncPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncPrdStrt()==null) {} else {
			encounter.getPeriod().setStart(e.getEncPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEncPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEncPrdStrt().replace("[","").replace("]","").replace("\"","")));
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
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getStatusHistory().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Enc_StsHis_Prd_Strt ********************************************************************************/
		if(e.getEncStsHisPrdStrt() != null ) {

			String[] arrayi0 = e.getEncStsHisPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(encounter.getStatusHistory().size() < i0+1) { encounter.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {encounter.getStatusHistory().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
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

=======
		if(e.getEncAccount() != null) {
			org.hl7.fhir.r4.model.Reference EncAccountref = new org.hl7.fhir.r4.model.Reference();
			encounter.addAccount(EncAccountref.setReference(e.getEncAccount()));
		}
		/******************** Enc_Appointment ********************************************************************************/
		if(e.getEncAppointment() != null) {
			org.hl7.fhir.r4.model.Reference EncAppointmentref = new org.hl7.fhir.r4.model.Reference();
			encounter.addAppointment(EncAppointmentref.setReference(e.getEncAppointment()));
		}
		/******************** Enc_BasedOn ********************************************************************************/
		if(e.getEncBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference EncBasedOnref = new org.hl7.fhir.r4.model.Reference();
			encounter.addBasedOn(EncBasedOnref.setReference(e.getEncBasedOn()));
		}

		org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent encounteraddclasshistory = encounter.addClassHistory();


		org.hl7.fhir.r4.model.Coding encounteraddclasshistorysetclass_ = new org.hl7.fhir.r4.model.Coding();
		encounteraddclasshistory.setClass_(encounteraddclasshistorysetclass_);

		/******************** Enc_ClassHistory_Class__Code ********************************************************************************/
		if(e.getEncClassHistoryClassCode() != null) {
			encounteraddclasshistorysetclass_.setCode(e.getEncClassHistoryClassCode());
		}
		/******************** Enc_ClassHistory_Class__Display ********************************************************************************/
		if(e.getEncClassHistoryClassDisplay() != null) {
			encounteraddclasshistorysetclass_.setDisplay(e.getEncClassHistoryClassDisplay());
		}
		/******************** Enc_ClassHistory_Class__System ********************************************************************************/
		if(e.getEncClassHistoryClassSystem() != null) {
			encounteraddclasshistorysetclass_.setSystem(e.getEncClassHistoryClassSystem());
		}
		/******************** Enc_ClassHistory_Class__Usrslt ********************************************************************************/
		if(e.getEncClassHistoryClassUsrslt() != null) {
			encounteraddclasshistorysetclass_.setUserSelected(Boolean.parseBoolean(e.getEncClassHistoryClassUsrslt()));
		}
		/******************** Enc_ClassHistory_Class__Version ********************************************************************************/
		if(e.getEncClassHistoryClassVersion() != null) {
			encounteraddclasshistorysetclass_.setVersion(e.getEncClassHistoryClassVersion());
		}

		org.hl7.fhir.r4.model.Period encounteraddclasshistorysetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddclasshistory.setPeriod(encounteraddclasshistorysetperiod);

		/******************** Enc_ClassHistory_Period_End ********************************************************************************/
		if(e.getEncClassHistoryPeriodEnd() != null) {
			java.text.SimpleDateFormat EncClassHistoryPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncClassHistoryPeriodEnddate = EncClassHistoryPeriodEndsdf.parse(e.getEncClassHistoryPeriodEnd());
			encounteraddclasshistorysetperiod.setEnd(EncClassHistoryPeriodEnddate);
		}
		/******************** Enc_ClassHistory_Period_Start ********************************************************************************/
		if(e.getEncClassHistoryPeriodStart() != null) {
			java.text.SimpleDateFormat EncClassHistoryPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncClassHistoryPeriodStartdate = EncClassHistoryPeriodStartsdf.parse(e.getEncClassHistoryPeriodStart());
			encounteraddclasshistorysetperiod.setStart(EncClassHistoryPeriodStartdate);
		}

		org.hl7.fhir.r4.model.Coding encountersetclass_ = new org.hl7.fhir.r4.model.Coding();
		encounter.setClass_(encountersetclass_);

		/******************** Enc_Class__Code ********************************************************************************/
		if(e.getEncClassCode() != null) {
			encountersetclass_.setCode(e.getEncClassCode());
		}
		/******************** Enc_Class__Display ********************************************************************************/
		if(e.getEncClassDisplay() != null) {
			encountersetclass_.setDisplay(e.getEncClassDisplay());
		}
		/******************** Enc_Class__System ********************************************************************************/
		if(e.getEncClassSystem() != null) {
			encountersetclass_.setSystem(e.getEncClassSystem());
		}
		/******************** Enc_Class__Usrslt ********************************************************************************/
		if(e.getEncClassUsrslt() != null) {
			encountersetclass_.setUserSelected(Boolean.parseBoolean(e.getEncClassUsrslt()));
		}
		/******************** Enc_Class__Version ********************************************************************************/
		if(e.getEncClassVersion() != null) {
			encountersetclass_.setVersion(e.getEncClassVersion());
		}

		org.hl7.fhir.r4.model.Encounter.DiagnosisComponent encounteradddiagnosis = encounter.addDiagnosis();

		/******************** Enc_Diagnosis_Condition ********************************************************************************/
		if(e.getEncDiagnosisCondition() != null) {
			org.hl7.fhir.r4.model.Reference EncDiagnosisConditionref = new org.hl7.fhir.r4.model.Reference();
			encounteradddiagnosis.setCondition(EncDiagnosisConditionref.setReference(e.getEncDiagnosisCondition()));
		}
		/******************** Enc_Diagnosis_Rank ********************************************************************************/
		if(e.getEncDiagnosisRank() != null) {
			encounteradddiagnosis.setRank(Integer.parseInt(e.getEncDiagnosisRank()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteradddiagnosissetuse = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteradddiagnosis.setUse(encounteradddiagnosissetuse);


		org.hl7.fhir.r4.model.Coding encounteradddiagnosissetuseaddcoding = encounteradddiagnosissetuse.addCoding();

		/******************** Enc_Diagnosis_Use_Coding_Code ********************************************************************************/
		if(e.getEncDiagnosisUseCodingCode() != null) {
			encounteradddiagnosissetuseaddcoding.setCode(e.getEncDiagnosisUseCodingCode());
		}
		/******************** Enc_Diagnosis_Use_Coding_Display ********************************************************************************/
		if(e.getEncDiagnosisUseCodingDisplay() != null) {
			encounteradddiagnosissetuseaddcoding.setDisplay(e.getEncDiagnosisUseCodingDisplay());
		}
		/******************** Enc_Diagnosis_Use_Coding_System ********************************************************************************/
		if(e.getEncDiagnosisUseCodingSystem() != null) {
			encounteradddiagnosissetuseaddcoding.setSystem(e.getEncDiagnosisUseCodingSystem());
		}
		/******************** Enc_Diagnosis_Use_Coding_Usrslt ********************************************************************************/
		if(e.getEncDiagnosisUseCodingUsrslt() != null) {
			encounteradddiagnosissetuseaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncDiagnosisUseCodingUsrslt()));
		}
		/******************** Enc_Diagnosis_Use_Coding_Version ********************************************************************************/
		if(e.getEncDiagnosisUseCodingVersion() != null) {
			encounteradddiagnosissetuseaddcoding.setVersion(e.getEncDiagnosisUseCodingVersion());
		}
		/******************** Enc_Diagnosis_Use_Text ********************************************************************************/
		if(e.getEncDiagnosisUseText() != null) {
			encounteradddiagnosissetuse.setText(e.getEncDiagnosisUseText());
		}
		/******************** Enc_EpisodeOfCare ********************************************************************************/
		if(e.getEncEpisodeOfCare() != null) {
			org.hl7.fhir.r4.model.Reference EncEpisodeOfCareref = new org.hl7.fhir.r4.model.Reference();
			encounter.addEpisodeOfCare(EncEpisodeOfCareref.setReference(e.getEncEpisodeOfCare()));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent encountersethospitalization = new org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent();
		encounter.setHospitalization(encountersethospitalization);


		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetadmitsource = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setAdmitSource(encountersethospitalizationsetadmitsource);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetadmitsourceaddcoding = encountersethospitalizationsetadmitsource.addCoding();

		/******************** Enc_Hospitalization_AdmitSource_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingCode() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setCode(e.getEncHospitalizationAdmitSourceCodingCode());
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingDisplay() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setDisplay(e.getEncHospitalizationAdmitSourceCodingDisplay());
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingSystem() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setSystem(e.getEncHospitalizationAdmitSourceCodingSystem());
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingUsrslt() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationAdmitSourceCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_AdmitSource_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceCodingVersion() != null) {
			encountersethospitalizationsetadmitsourceaddcoding.setVersion(e.getEncHospitalizationAdmitSourceCodingVersion());
		}
		/******************** Enc_Hospitalization_AdmitSource_Text ********************************************************************************/
		if(e.getEncHospitalizationAdmitSourceText() != null) {
			encountersethospitalizationsetadmitsource.setText(e.getEncHospitalizationAdmitSourceText());
		}
		/******************** Enc_Hospitalization_Destination ********************************************************************************/
		if(e.getEncHospitalizationDestination() != null) {
			org.hl7.fhir.r4.model.Reference EncHospitalizationDestinationref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalization.setDestination(EncHospitalizationDestinationref.setReference(e.getEncHospitalizationDestination()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationadddietpreference = encountersethospitalization.addDietPreference();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationadddietpreferenceaddcoding = encountersethospitalizationadddietpreference.addCoding();

		/******************** Enc_Hospitalization_DietPreference_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingCode() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setCode(e.getEncHospitalizationDietPreferenceCodingCode());
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingDisplay() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setDisplay(e.getEncHospitalizationDietPreferenceCodingDisplay());
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingSystem() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setSystem(e.getEncHospitalizationDietPreferenceCodingSystem());
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingUsrslt() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDietPreferenceCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_DietPreference_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceCodingVersion() != null) {
			encountersethospitalizationadddietpreferenceaddcoding.setVersion(e.getEncHospitalizationDietPreferenceCodingVersion());
		}
		/******************** Enc_Hospitalization_DietPreference_Text ********************************************************************************/
		if(e.getEncHospitalizationDietPreferenceText() != null) {
			encountersethospitalizationadddietpreference.setText(e.getEncHospitalizationDietPreferenceText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetdischargedisposition = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setDischargeDisposition(encountersethospitalizationsetdischargedisposition);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetdischargedispositionaddcoding = encountersethospitalizationsetdischargedisposition.addCoding();

		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingCode() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setCode(e.getEncHospitalizationDischargeDispositionCodingCode());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingDisplay() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setDisplay(e.getEncHospitalizationDischargeDispositionCodingDisplay());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingSystem() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setSystem(e.getEncHospitalizationDischargeDispositionCodingSystem());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingUsrslt() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationDischargeDispositionCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionCodingVersion() != null) {
			encountersethospitalizationsetdischargedispositionaddcoding.setVersion(e.getEncHospitalizationDischargeDispositionCodingVersion());
		}
		/******************** Enc_Hospitalization_DischargeDisposition_Text ********************************************************************************/
		if(e.getEncHospitalizationDischargeDispositionText() != null) {
			encountersethospitalizationsetdischargedisposition.setText(e.getEncHospitalizationDischargeDispositionText());
		}
		/******************** Enc_Hospitalization_Origin ********************************************************************************/
		if(e.getEncHospitalizationOrigin() != null) {
			org.hl7.fhir.r4.model.Reference EncHospitalizationOriginref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalization.setOrigin(EncHospitalizationOriginref.setReference(e.getEncHospitalizationOrigin()));
		}

		org.hl7.fhir.r4.model.Identifier encountersethospitalizationsetpreadmissionidentifier = new org.hl7.fhir.r4.model.Identifier();
		encountersethospitalization.setPreAdmissionIdentifier(encountersethospitalizationsetpreadmissionidentifier);

		/******************** Enc_Hospitalization_PreAdmissionId_Assigner ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference EncHospitalizationPreAdmissionIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			encountersethospitalizationsetpreadmissionidentifier.setAssigner(EncHospitalizationPreAdmissionIdAssignerref.setReference(e.getEncHospitalizationPreAdmissionIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period encountersethospitalizationsetpreadmissionidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		encountersethospitalizationsetpreadmissionidentifier.setPeriod(encountersethospitalizationsetpreadmissionidentifiersetperiod);

		/******************** Enc_Hospitalization_PreAdmissionId_Period_End ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPeriodEnd() != null) {
			java.text.SimpleDateFormat EncHospitalizationPreAdmissionIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncHospitalizationPreAdmissionIdPeriodEnddate = EncHospitalizationPreAdmissionIdPeriodEndsdf.parse(e.getEncHospitalizationPreAdmissionIdPeriodEnd());
			encountersethospitalizationsetpreadmissionidentifiersetperiod.setEnd(EncHospitalizationPreAdmissionIdPeriodEnddate);
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Period_Start ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdPeriodStart() != null) {
			java.text.SimpleDateFormat EncHospitalizationPreAdmissionIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncHospitalizationPreAdmissionIdPeriodStartdate = EncHospitalizationPreAdmissionIdPeriodStartsdf.parse(e.getEncHospitalizationPreAdmissionIdPeriodStart());
			encountersethospitalizationsetpreadmissionidentifiersetperiod.setStart(EncHospitalizationPreAdmissionIdPeriodStartdate);
		}
		/******************** Enc_Hospitalization_PreAdmissionId_System ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdSystem() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setSystem(e.getEncHospitalizationPreAdmissionIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetpreadmissionidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalizationsetpreadmissionidentifier.setType(encountersethospitalizationsetpreadmissionidentifiersettype);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding = encountersethospitalizationsetpreadmissionidentifiersettype.addCoding();

		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingCode() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setCode(e.getEncHospitalizationPreAdmissionIdTypeCodingCode());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingDisplay() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setDisplay(e.getEncHospitalizationPreAdmissionIdTypeCodingDisplay());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingSystem() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setSystem(e.getEncHospitalizationPreAdmissionIdTypeCodingSystem());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingUsrslt() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationPreAdmissionIdTypeCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeCodingVersion() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettypeaddcoding.setVersion(e.getEncHospitalizationPreAdmissionIdTypeCodingVersion());
		}
		/******************** Enc_Hospitalization_PreAdmissionId_Type_Text ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdTypeText() != null) {
			encountersethospitalizationsetpreadmissionidentifiersettype.setText(e.getEncHospitalizationPreAdmissionIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encountersethospitalizationsetpreadmissionidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Enc_Hospitalization_PreAdmissionId_Use_Code ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdUseCode() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setUse(encountersethospitalizationsetpreadmissionidentifiersetuseEnumFactory.fromCode(e.getEncHospitalizationPreAdmissionIdUseCode()));

		}
		/******************** Enc_Hospitalization_PreAdmissionId_Value ********************************************************************************/
		if(e.getEncHospitalizationPreAdmissionIdValue() != null) {
			encountersethospitalizationsetpreadmissionidentifier.setValue(e.getEncHospitalizationPreAdmissionIdValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationsetreadmission = new org.hl7.fhir.r4.model.CodeableConcept();
		encountersethospitalization.setReAdmission(encountersethospitalizationsetreadmission);


		org.hl7.fhir.r4.model.Coding encountersethospitalizationsetreadmissionaddcoding = encountersethospitalizationsetreadmission.addCoding();

		/******************** Enc_Hospitalization_ReAdmission_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingCode() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setCode(e.getEncHospitalizationReAdmissionCodingCode());
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingDisplay() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setDisplay(e.getEncHospitalizationReAdmissionCodingDisplay());
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingSystem() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setSystem(e.getEncHospitalizationReAdmissionCodingSystem());
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingUsrslt() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationReAdmissionCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_ReAdmission_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionCodingVersion() != null) {
			encountersethospitalizationsetreadmissionaddcoding.setVersion(e.getEncHospitalizationReAdmissionCodingVersion());
		}
		/******************** Enc_Hospitalization_ReAdmission_Text ********************************************************************************/
		if(e.getEncHospitalizationReAdmissionText() != null) {
			encountersethospitalizationsetreadmission.setText(e.getEncHospitalizationReAdmissionText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationaddspecialarrangement = encountersethospitalization.addSpecialArrangement();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationaddspecialarrangementaddcoding = encountersethospitalizationaddspecialarrangement.addCoding();

		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingCode() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setCode(e.getEncHospitalizationSpecialArrangementCodingCode());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingDisplay() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setDisplay(e.getEncHospitalizationSpecialArrangementCodingDisplay());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingSystem() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setSystem(e.getEncHospitalizationSpecialArrangementCodingSystem());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingUsrslt() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpecialArrangementCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementCodingVersion() != null) {
			encountersethospitalizationaddspecialarrangementaddcoding.setVersion(e.getEncHospitalizationSpecialArrangementCodingVersion());
		}
		/******************** Enc_Hospitalization_SpecialArrangement_Text ********************************************************************************/
		if(e.getEncHospitalizationSpecialArrangementText() != null) {
			encountersethospitalizationaddspecialarrangement.setText(e.getEncHospitalizationSpecialArrangementText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersethospitalizationaddspecialcourtesy = encountersethospitalization.addSpecialCourtesy();


		org.hl7.fhir.r4.model.Coding encountersethospitalizationaddspecialcourtesyaddcoding = encountersethospitalizationaddspecialcourtesy.addCoding();

		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Code ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingCode() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setCode(e.getEncHospitalizationSpecialCourtesyCodingCode());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Display ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingDisplay() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setDisplay(e.getEncHospitalizationSpecialCourtesyCodingDisplay());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_System ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingSystem() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setSystem(e.getEncHospitalizationSpecialCourtesyCodingSystem());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Usrslt ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingUsrslt() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncHospitalizationSpecialCourtesyCodingUsrslt()));
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Coding_Version ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyCodingVersion() != null) {
			encountersethospitalizationaddspecialcourtesyaddcoding.setVersion(e.getEncHospitalizationSpecialCourtesyCodingVersion());
		}
		/******************** Enc_Hospitalization_SpecialCourtesy_Text ********************************************************************************/
		if(e.getEncHospitalizationSpecialCourtesyText() != null) {
			encountersethospitalizationaddspecialcourtesy.setText(e.getEncHospitalizationSpecialCourtesyText());
		}

		org.hl7.fhir.r4.model.Identifier encounteraddidentifier = encounter.addIdentifier();

		/******************** Enc_Id_Assigner ********************************************************************************/
		if(e.getEncIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference EncIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			encounteraddidentifier.setAssigner(EncIdAssignerref.setReference(e.getEncIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period encounteraddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddidentifier.setPeriod(encounteraddidentifiersetperiod);

		/******************** Enc_Id_Period_End ********************************************************************************/
		if(e.getEncIdPeriodEnd() != null) {
			java.text.SimpleDateFormat EncIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncIdPeriodEnddate = EncIdPeriodEndsdf.parse(e.getEncIdPeriodEnd());
			encounteraddidentifiersetperiod.setEnd(EncIdPeriodEnddate);
		}
		/******************** Enc_Id_Period_Start ********************************************************************************/
		if(e.getEncIdPeriodStart() != null) {
			java.text.SimpleDateFormat EncIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncIdPeriodStartdate = EncIdPeriodStartsdf.parse(e.getEncIdPeriodStart());
			encounteraddidentifiersetperiod.setStart(EncIdPeriodStartdate);
		}
		/******************** Enc_Id_System ********************************************************************************/
		if(e.getEncIdSystem() != null) {
			encounteraddidentifier.setSystem(e.getEncIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteraddidentifier.setType(encounteraddidentifiersettype);


		org.hl7.fhir.r4.model.Coding encounteraddidentifiersettypeaddcoding = encounteraddidentifiersettype.addCoding();

		/******************** Enc_Id_Type_Coding_Code ********************************************************************************/
		if(e.getEncIdTypeCodingCode() != null) {
			encounteraddidentifiersettypeaddcoding.setCode(e.getEncIdTypeCodingCode());
		}
		/******************** Enc_Id_Type_Coding_Display ********************************************************************************/
		if(e.getEncIdTypeCodingDisplay() != null) {
			encounteraddidentifiersettypeaddcoding.setDisplay(e.getEncIdTypeCodingDisplay());
		}
		/******************** Enc_Id_Type_Coding_System ********************************************************************************/
		if(e.getEncIdTypeCodingSystem() != null) {
			encounteraddidentifiersettypeaddcoding.setSystem(e.getEncIdTypeCodingSystem());
		}
		/******************** Enc_Id_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncIdTypeCodingUsrslt() != null) {
			encounteraddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncIdTypeCodingUsrslt()));
		}
		/******************** Enc_Id_Type_Coding_Version ********************************************************************************/
		if(e.getEncIdTypeCodingVersion() != null) {
			encounteraddidentifiersettypeaddcoding.setVersion(e.getEncIdTypeCodingVersion());
		}
		/******************** Enc_Id_Type_Text ********************************************************************************/
		if(e.getEncIdTypeText() != null) {
			encounteraddidentifiersettype.setText(e.getEncIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory encounteraddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Enc_Id_Use_Code ********************************************************************************/
		if(e.getEncIdUseCode() != null) {
			encounteraddidentifier.setUse(encounteraddidentifiersetuseEnumFactory.fromCode(e.getEncIdUseCode()));

		}
		/******************** Enc_Id_Value ********************************************************************************/
		if(e.getEncIdValue() != null) {
			encounteraddidentifier.setValue(e.getEncIdValue());
		}
		/******************** Enc_Length ********************************************************************************/
		if(e.getEncLength() != null) {
			org.hl7.fhir.r4.model.Duration EncLengthdur = new org.hl7.fhir.r4.model.Duration();
			encounter.setLength((org.hl7.fhir.r4.model.Duration)EncLengthdur.setValue(Double.parseDouble(e.getEncLength())));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent encounteraddlocation = encounter.addLocation();

		/******************** Enc_Location_Location ********************************************************************************/
		if(e.getEncLocationLocation() != null) {
			org.hl7.fhir.r4.model.Reference EncLocationLocationref = new org.hl7.fhir.r4.model.Reference();
			encounteraddlocation.setLocation(EncLocationLocationref.setReference(e.getEncLocationLocation()));
		}

		org.hl7.fhir.r4.model.Period encounteraddlocationsetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddlocation.setPeriod(encounteraddlocationsetperiod);

		/******************** Enc_Location_Period_End ********************************************************************************/
		if(e.getEncLocationPeriodEnd() != null) {
			java.text.SimpleDateFormat EncLocationPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncLocationPeriodEnddate = EncLocationPeriodEndsdf.parse(e.getEncLocationPeriodEnd());
			encounteraddlocationsetperiod.setEnd(EncLocationPeriodEnddate);
		}
		/******************** Enc_Location_Period_Start ********************************************************************************/
		if(e.getEncLocationPeriodStart() != null) {
			java.text.SimpleDateFormat EncLocationPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncLocationPeriodStartdate = EncLocationPeriodStartsdf.parse(e.getEncLocationPeriodStart());
			encounteraddlocationsetperiod.setStart(EncLocationPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddlocationsetphysicaltype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounteraddlocation.setPhysicalType(encounteraddlocationsetphysicaltype);


		org.hl7.fhir.r4.model.Coding encounteraddlocationsetphysicaltypeaddcoding = encounteraddlocationsetphysicaltype.addCoding();

		/******************** Enc_Location_PhysicalType_Coding_Code ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingCode() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setCode(e.getEncLocationPhysicalTypeCodingCode());
		}
		/******************** Enc_Location_PhysicalType_Coding_Display ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingDisplay() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setDisplay(e.getEncLocationPhysicalTypeCodingDisplay());
		}
		/******************** Enc_Location_PhysicalType_Coding_System ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingSystem() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setSystem(e.getEncLocationPhysicalTypeCodingSystem());
		}
		/******************** Enc_Location_PhysicalType_Coding_Usrslt ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingUsrslt() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncLocationPhysicalTypeCodingUsrslt()));
		}
		/******************** Enc_Location_PhysicalType_Coding_Version ********************************************************************************/
		if(e.getEncLocationPhysicalTypeCodingVersion() != null) {
			encounteraddlocationsetphysicaltypeaddcoding.setVersion(e.getEncLocationPhysicalTypeCodingVersion());
		}
		/******************** Enc_Location_PhysicalType_Text ********************************************************************************/
		if(e.getEncLocationPhysicalTypeText() != null) {
			encounteraddlocationsetphysicaltype.setText(e.getEncLocationPhysicalTypeText());
		}

		org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory encounteraddlocationsetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterLocationStatusEnumFactory();

		/******************** Enc_Location_Status_Code ********************************************************************************/
		if(e.getEncLocationStatusCode() != null) {
			encounteraddlocation.setStatus(encounteraddlocationsetstatusEnumFactory.fromCode(e.getEncLocationStatusCode()));

		}
		/******************** Enc_PartOf ********************************************************************************/
		if(e.getEncPartOf() != null) {
			org.hl7.fhir.r4.model.Reference EncPartOfref = new org.hl7.fhir.r4.model.Reference();
			encounter.setPartOf(EncPartOfref.setReference(e.getEncPartOf()));
		}

		org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent encounteraddparticipant = encounter.addParticipant();

		/******************** Enc_Participant_Individual ********************************************************************************/
		if(e.getEncParticipantIndividual() != null) {
			org.hl7.fhir.r4.model.Reference EncParticipantIndividualref = new org.hl7.fhir.r4.model.Reference();
			encounteraddparticipant.setIndividual(EncParticipantIndividualref.setReference(e.getEncParticipantIndividual()));
		}

		org.hl7.fhir.r4.model.Period encounteraddparticipantsetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddparticipant.setPeriod(encounteraddparticipantsetperiod);

		/******************** Enc_Participant_Period_End ********************************************************************************/
		if(e.getEncParticipantPeriodEnd() != null) {
			java.text.SimpleDateFormat EncParticipantPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncParticipantPeriodEnddate = EncParticipantPeriodEndsdf.parse(e.getEncParticipantPeriodEnd());
			encounteraddparticipantsetperiod.setEnd(EncParticipantPeriodEnddate);
		}
		/******************** Enc_Participant_Period_Start ********************************************************************************/
		if(e.getEncParticipantPeriodStart() != null) {
			java.text.SimpleDateFormat EncParticipantPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncParticipantPeriodStartdate = EncParticipantPeriodStartsdf.parse(e.getEncParticipantPeriodStart());
			encounteraddparticipantsetperiod.setStart(EncParticipantPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddparticipantaddtype = encounteraddparticipant.addType();


		org.hl7.fhir.r4.model.Coding encounteraddparticipantaddtypeaddcoding = encounteraddparticipantaddtype.addCoding();

		/******************** Enc_Participant_Type_Coding_Code ********************************************************************************/
		if(e.getEncParticipantTypeCodingCode() != null) {
			encounteraddparticipantaddtypeaddcoding.setCode(e.getEncParticipantTypeCodingCode());
		}
		/******************** Enc_Participant_Type_Coding_Display ********************************************************************************/
		if(e.getEncParticipantTypeCodingDisplay() != null) {
			encounteraddparticipantaddtypeaddcoding.setDisplay(e.getEncParticipantTypeCodingDisplay());
		}
		/******************** Enc_Participant_Type_Coding_System ********************************************************************************/
		if(e.getEncParticipantTypeCodingSystem() != null) {
			encounteraddparticipantaddtypeaddcoding.setSystem(e.getEncParticipantTypeCodingSystem());
		}
		/******************** Enc_Participant_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncParticipantTypeCodingUsrslt() != null) {
			encounteraddparticipantaddtypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncParticipantTypeCodingUsrslt()));
		}
		/******************** Enc_Participant_Type_Coding_Version ********************************************************************************/
		if(e.getEncParticipantTypeCodingVersion() != null) {
			encounteraddparticipantaddtypeaddcoding.setVersion(e.getEncParticipantTypeCodingVersion());
		}
		/******************** Enc_Participant_Type_Text ********************************************************************************/
		if(e.getEncParticipantTypeText() != null) {
			encounteraddparticipantaddtype.setText(e.getEncParticipantTypeText());
		}

		org.hl7.fhir.r4.model.Period encountersetperiod = new org.hl7.fhir.r4.model.Period();
		encounter.setPeriod(encountersetperiod);

		/******************** Enc_Period_End ********************************************************************************/
		if(e.getEncPeriodEnd() != null) {
			java.text.SimpleDateFormat EncPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncPeriodEnddate = EncPeriodEndsdf.parse(e.getEncPeriodEnd());
			encountersetperiod.setEnd(EncPeriodEnddate);
		}
		/******************** Enc_Period_Start ********************************************************************************/
		if(e.getEncPeriodStart() != null) {
			java.text.SimpleDateFormat EncPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncPeriodStartdate = EncPeriodStartsdf.parse(e.getEncPeriodStart());
			encountersetperiod.setStart(EncPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersetpriority = new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setPriority(encountersetpriority);


		org.hl7.fhir.r4.model.Coding encountersetpriorityaddcoding = encountersetpriority.addCoding();

		/******************** Enc_Priority_Coding_Code ********************************************************************************/
		if(e.getEncPriorityCodingCode() != null) {
			encountersetpriorityaddcoding.setCode(e.getEncPriorityCodingCode());
		}
		/******************** Enc_Priority_Coding_Display ********************************************************************************/
		if(e.getEncPriorityCodingDisplay() != null) {
			encountersetpriorityaddcoding.setDisplay(e.getEncPriorityCodingDisplay());
		}
		/******************** Enc_Priority_Coding_System ********************************************************************************/
		if(e.getEncPriorityCodingSystem() != null) {
			encountersetpriorityaddcoding.setSystem(e.getEncPriorityCodingSystem());
		}
		/******************** Enc_Priority_Coding_Usrslt ********************************************************************************/
		if(e.getEncPriorityCodingUsrslt() != null) {
			encountersetpriorityaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncPriorityCodingUsrslt()));
		}
		/******************** Enc_Priority_Coding_Version ********************************************************************************/
		if(e.getEncPriorityCodingVersion() != null) {
			encountersetpriorityaddcoding.setVersion(e.getEncPriorityCodingVersion());
		}
		/******************** Enc_Priority_Text ********************************************************************************/
		if(e.getEncPriorityText() != null) {
			encountersetpriority.setText(e.getEncPriorityText());
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddreasoncode = encounter.addReasonCode();


		org.hl7.fhir.r4.model.Coding encounteraddreasoncodeaddcoding = encounteraddreasoncode.addCoding();

		/******************** Enc_ReasonCode_Coding_Code ********************************************************************************/
		if(e.getEncReasonCodeCodingCode() != null) {
			encounteraddreasoncodeaddcoding.setCode(e.getEncReasonCodeCodingCode());
		}
		/******************** Enc_ReasonCode_Coding_Display ********************************************************************************/
		if(e.getEncReasonCodeCodingDisplay() != null) {
			encounteraddreasoncodeaddcoding.setDisplay(e.getEncReasonCodeCodingDisplay());
		}
		/******************** Enc_ReasonCode_Coding_System ********************************************************************************/
		if(e.getEncReasonCodeCodingSystem() != null) {
			encounteraddreasoncodeaddcoding.setSystem(e.getEncReasonCodeCodingSystem());
		}
		/******************** Enc_ReasonCode_Coding_Usrslt ********************************************************************************/
		if(e.getEncReasonCodeCodingUsrslt() != null) {
			encounteraddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncReasonCodeCodingUsrslt()));
		}
		/******************** Enc_ReasonCode_Coding_Version ********************************************************************************/
		if(e.getEncReasonCodeCodingVersion() != null) {
			encounteraddreasoncodeaddcoding.setVersion(e.getEncReasonCodeCodingVersion());
		}
		/******************** Enc_ReasonCode_Text ********************************************************************************/
		if(e.getEncReasonCodeText() != null) {
			encounteraddreasoncode.setText(e.getEncReasonCodeText());
		}
		/******************** Enc_ReasonReference ********************************************************************************/
		if(e.getEncReasonReference() != null) {
			org.hl7.fhir.r4.model.Reference EncReasonReferenceref = new org.hl7.fhir.r4.model.Reference();
			encounter.addReasonReference(EncReasonReferenceref.setReference(e.getEncReasonReference()));
		}
		/******************** Enc_ServiceProvider ********************************************************************************/
		if(e.getEncServiceProvider() != null) {
			org.hl7.fhir.r4.model.Reference EncServiceProviderref = new org.hl7.fhir.r4.model.Reference();
			encounter.setServiceProvider(EncServiceProviderref.setReference(e.getEncServiceProvider()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encountersetservicetype = new org.hl7.fhir.r4.model.CodeableConcept();
		encounter.setServiceType(encountersetservicetype);


		org.hl7.fhir.r4.model.Coding encountersetservicetypeaddcoding = encountersetservicetype.addCoding();

		/******************** Enc_ServiceType_Coding_Code ********************************************************************************/
		if(e.getEncServiceTypeCodingCode() != null) {
			encountersetservicetypeaddcoding.setCode(e.getEncServiceTypeCodingCode());
		}
		/******************** Enc_ServiceType_Coding_Display ********************************************************************************/
		if(e.getEncServiceTypeCodingDisplay() != null) {
			encountersetservicetypeaddcoding.setDisplay(e.getEncServiceTypeCodingDisplay());
		}
		/******************** Enc_ServiceType_Coding_System ********************************************************************************/
		if(e.getEncServiceTypeCodingSystem() != null) {
			encountersetservicetypeaddcoding.setSystem(e.getEncServiceTypeCodingSystem());
		}
		/******************** Enc_ServiceType_Coding_Usrslt ********************************************************************************/
		if(e.getEncServiceTypeCodingUsrslt() != null) {
			encountersetservicetypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncServiceTypeCodingUsrslt()));
		}
		/******************** Enc_ServiceType_Coding_Version ********************************************************************************/
		if(e.getEncServiceTypeCodingVersion() != null) {
			encountersetservicetypeaddcoding.setVersion(e.getEncServiceTypeCodingVersion());
		}
		/******************** Enc_ServiceType_Text ********************************************************************************/
		if(e.getEncServiceTypeText() != null) {
			encountersetservicetype.setText(e.getEncServiceTypeText());
		}

		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encountersetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();

		/******************** Enc_Status_Code ********************************************************************************/
		if(e.getEncStatusCode() != null) {
			encounter.setStatus(encountersetstatusEnumFactory.fromCode(e.getEncStatusCode()));

		}

		org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent encounteraddstatushistory = encounter.addStatusHistory();


		org.hl7.fhir.r4.model.Period encounteraddstatushistorysetperiod = new org.hl7.fhir.r4.model.Period();
		encounteraddstatushistory.setPeriod(encounteraddstatushistorysetperiod);

		/******************** Enc_StatusHistory_Period_End ********************************************************************************/
		if(e.getEncStatusHistoryPeriodEnd() != null) {
			java.text.SimpleDateFormat EncStatusHistoryPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncStatusHistoryPeriodEnddate = EncStatusHistoryPeriodEndsdf.parse(e.getEncStatusHistoryPeriodEnd());
			encounteraddstatushistorysetperiod.setEnd(EncStatusHistoryPeriodEnddate);
		}
		/******************** Enc_StatusHistory_Period_Start ********************************************************************************/
		if(e.getEncStatusHistoryPeriodStart() != null) {
			java.text.SimpleDateFormat EncStatusHistoryPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EncStatusHistoryPeriodStartdate = EncStatusHistoryPeriodStartsdf.parse(e.getEncStatusHistoryPeriodStart());
			encounteraddstatushistorysetperiod.setStart(EncStatusHistoryPeriodStartdate);
		}

		org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory encounteraddstatushistorysetstatusEnumFactory = new org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory();

		/******************** Enc_StatusHistory_Status_Code ********************************************************************************/
		if(e.getEncStatusHistoryStatusCode() != null) {
			encounteraddstatushistory.setStatus(encounteraddstatushistorysetstatusEnumFactory.fromCode(e.getEncStatusHistoryStatusCode()));

		}
		/******************** Enc_Subject ********************************************************************************/
		if(e.getEncSubject() != null) {
			org.hl7.fhir.r4.model.Reference EncSubjectref = new org.hl7.fhir.r4.model.Reference();
			encounter.setSubject(EncSubjectref.setReference(e.getEncSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept encounteraddtype = encounter.addType();


		org.hl7.fhir.r4.model.Coding encounteraddtypeaddcoding = encounteraddtype.addCoding();

		/******************** Enc_Type_Coding_Code ********************************************************************************/
		if(e.getEncTypeCodingCode() != null) {
			encounteraddtypeaddcoding.setCode(e.getEncTypeCodingCode());
		}
		/******************** Enc_Type_Coding_Display ********************************************************************************/
		if(e.getEncTypeCodingDisplay() != null) {
			encounteraddtypeaddcoding.setDisplay(e.getEncTypeCodingDisplay());
		}
		/******************** Enc_Type_Coding_System ********************************************************************************/
		if(e.getEncTypeCodingSystem() != null) {
			encounteraddtypeaddcoding.setSystem(e.getEncTypeCodingSystem());
		}
		/******************** Enc_Type_Coding_Usrslt ********************************************************************************/
		if(e.getEncTypeCodingUsrslt() != null) {
			encounteraddtypeaddcoding.setUserSelected(Boolean.parseBoolean(e.getEncTypeCodingUsrslt()));
		}
		/******************** Enc_Type_Coding_Version ********************************************************************************/
		if(e.getEncTypeCodingVersion() != null) {
			encounteraddtypeaddcoding.setVersion(e.getEncTypeCodingVersion());
		}
		/******************** Enc_Type_Text ********************************************************************************/
		if(e.getEncTypeText() != null) {
			encounteraddtype.setText(e.getEncTypeText());
>>>>>>> master
		}
		return encounter;
	}
}
