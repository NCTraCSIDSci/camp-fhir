package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EpisodeOfCare;
public class EpisodeOfCareConversion 
{
	public org.hl7.fhir.r4.model.EpisodeOfCare EpisodeOfCares(EpisodeOfCare e) throws ParseException
	{
		org.hl7.fhir.r4.model.EpisodeOfCare episodeofcare = new org.hl7.fhir.r4.model.EpisodeOfCare();

		/******************** id ********************************************************************************/
		episodeofcare.setId(e.getId());

		/******************** EpisodeOfCare_Account ********************************************************************************/
		if(e.getEpisodeOfCareAccount() != null ) {

				for( String currListStrSplit : e.getEpisodeOfCareAccount().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			episodeofcare.addAccount(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** EpisodeOfCare_CareManager ********************************************************************************/
		if(e.getEpisodeOfCareCareManager() != null ) {

			if(e.getEpisodeOfCareCareManager().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCareCareManager()==null) {} else {
			episodeofcare.setCareManager(new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareCareManager().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EpisodeOfCare_Dgnsis_Cndtn ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisCndtn() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisCndtn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getDiagnosis().get(i0).setCondition(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Rnk ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRnk() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getDiagnosis().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Cd ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgCd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				String[] arrayi1 = e.getEpisodeOfCareDgnsisRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getDiagnosis().get(i0).getRole().getCoding().size() < i1+1) { episodeofcare.getDiagnosis().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getDiagnosis().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Dsply ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgDsply() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				String[] arrayi1 = e.getEpisodeOfCareDgnsisRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getDiagnosis().get(i0).getRole().getCoding().size() < i1+1) { episodeofcare.getDiagnosis().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getDiagnosis().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Sys ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgSys() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				String[] arrayi1 = e.getEpisodeOfCareDgnsisRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getDiagnosis().get(i0).getRole().getCoding().size() < i1+1) { episodeofcare.getDiagnosis().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getDiagnosis().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_UsrSltd ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				String[] arrayi1 = e.getEpisodeOfCareDgnsisRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getDiagnosis().get(i0).getRole().getCoding().size() < i1+1) { episodeofcare.getDiagnosis().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getDiagnosis().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Vrsn ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgVrsn() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				String[] arrayi1 = e.getEpisodeOfCareDgnsisRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getDiagnosis().get(i0).getRole().getCoding().size() < i1+1) { episodeofcare.getDiagnosis().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getDiagnosis().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Dgnsis_Role_Txt ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleTxt() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareDgnsisRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getDiagnosis().size() < i0+1) { episodeofcare.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getDiagnosis().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EpisodeOfCare_Id_Assigner ********************************************************************************/
		if(e.getEpisodeOfCareIdAssigner() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Id_Prd_End ********************************************************************************/
		if(e.getEpisodeOfCareIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Id_Prd_Strt ********************************************************************************/
		if(e.getEpisodeOfCareIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Id_Sys ********************************************************************************/
		if(e.getEpisodeOfCareIdSys() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				String[] arrayi1 = e.getEpisodeOfCareIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { episodeofcare.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				String[] arrayi1 = e.getEpisodeOfCareIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { episodeofcare.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				String[] arrayi1 = e.getEpisodeOfCareIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { episodeofcare.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				String[] arrayi1 = e.getEpisodeOfCareIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { episodeofcare.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				String[] arrayi1 = e.getEpisodeOfCareIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { episodeofcare.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Id_Typ_Txt ********************************************************************************/
		if(e.getEpisodeOfCareIdTypTxt() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EpisodeOfCare_Id_Use ********************************************************************************/
		if(e.getEpisodeOfCareIdUse() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Id_Vl ********************************************************************************/
		if(e.getEpisodeOfCareIdVl() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getIdentifier().size() < i0+1) { episodeofcare.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EpisodeOfCare_ManagingOrgnztn ********************************************************************************/
		if(e.getEpisodeOfCareManagingOrgnztn() != null ) {

			if(e.getEpisodeOfCareManagingOrgnztn().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCareManagingOrgnztn()==null) {} else {
			episodeofcare.setManagingOrganization(new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareManagingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EpisodeOfCare_Pnt ********************************************************************************/
		if(e.getEpisodeOfCarePnt() != null ) {

			if(e.getEpisodeOfCarePnt().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCarePnt()==null) {} else {
			episodeofcare.setPatient(new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCarePnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EpisodeOfCare_Prd_End ********************************************************************************/
		if(e.getEpisodeOfCarePrdEnd() != null ) {

			if(e.getEpisodeOfCarePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCarePrdEnd()==null) {} else {
			episodeofcare.getPeriod().setEnd(e.getEpisodeOfCarePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCarePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEpisodeOfCarePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EpisodeOfCare_Prd_Strt ********************************************************************************/
		if(e.getEpisodeOfCarePrdStrt() != null ) {

			if(e.getEpisodeOfCarePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCarePrdStrt()==null) {} else {
			episodeofcare.getPeriod().setStart(e.getEpisodeOfCarePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCarePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEpisodeOfCarePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EpisodeOfCare_ReferralRqst ********************************************************************************/
		if(e.getEpisodeOfCareReferralRqst() != null ) {

				for( String currListStrSplit : e.getEpisodeOfCareReferralRqst().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			episodeofcare.addReferralRequest(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** EpisodeOfCare_Sts ********************************************************************************/
		if(e.getEpisodeOfCareSts() != null ) {

			if(e.getEpisodeOfCareSts().replace("[","").replace("]","").equals("NULL") | e.getEpisodeOfCareSts()==null) {} else {
			episodeofcare.setStatus(new org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusEnumFactory().fromCode(e.getEpisodeOfCareSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EpisodeOfCare_StsHis_Prd_End ********************************************************************************/
		if(e.getEpisodeOfCareStsHisPrdEnd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareStsHisPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getStatusHistory().size() < i0+1) { episodeofcare.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getStatusHistory().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_StsHis_Prd_Strt ********************************************************************************/
		if(e.getEpisodeOfCareStsHisPrdStrt() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareStsHisPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getStatusHistory().size() < i0+1) { episodeofcare.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getStatusHistory().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_StsHis_Sts ********************************************************************************/
		if(e.getEpisodeOfCareStsHisSts() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareStsHisSts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getStatusHistory().size() < i0+1) { episodeofcare.addStatusHistory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getStatusHistory().get(i0).setStatus(new org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EpisodeOfCare_Team ********************************************************************************/
		if(e.getEpisodeOfCareTeam() != null ) {

				for( String currListStrSplit : e.getEpisodeOfCareTeam().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			episodeofcare.addTeam(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** EpisodeOfCare_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgCd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getType().size() < i0+1) { episodeofcare.addType(); }
				String[] arrayi1 = e.getEpisodeOfCareTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getType().get(i0).getCoding().size() < i1+1) { episodeofcare.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getType().size() < i0+1) { episodeofcare.addType(); }
				String[] arrayi1 = e.getEpisodeOfCareTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getType().get(i0).getCoding().size() < i1+1) { episodeofcare.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgSys() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getType().size() < i0+1) { episodeofcare.addType(); }
				String[] arrayi1 = e.getEpisodeOfCareTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getType().get(i0).getCoding().size() < i1+1) { episodeofcare.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getType().size() < i0+1) { episodeofcare.addType(); }
				String[] arrayi1 = e.getEpisodeOfCareTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getType().get(i0).getCoding().size() < i1+1) { episodeofcare.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EpisodeOfCare_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getType().size() < i0+1) { episodeofcare.addType(); }
				String[] arrayi1 = e.getEpisodeOfCareTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(episodeofcare.getType().get(i0).getCoding().size() < i1+1) { episodeofcare.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {episodeofcare.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EpisodeOfCare_Typ_Txt ********************************************************************************/
		if(e.getEpisodeOfCareTypTxt() != null ) {

			String[] arrayi0 = e.getEpisodeOfCareTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(episodeofcare.getType().size() < i0+1) { episodeofcare.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {episodeofcare.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return episodeofcare;
	}
}
