package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CareTeam;
public class CareTeamConversion 
{
	public org.hl7.fhir.r4.model.CareTeam CareTeams(CareTeam c) throws ParseException
	{
		org.hl7.fhir.r4.model.CareTeam careteam = new org.hl7.fhir.r4.model.CareTeam();

		/******************** id ********************************************************************************/
		careteam.setId(c.getId());

		/******************** CareTeam_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCareTeamCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getCategory().size() < i0+1) { careteam.addCategory(); }
				String[] arrayi1 = c.getCareTeamCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getCategory().get(i0).getCoding().size() < i1+1) { careteam.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCareTeamCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getCategory().size() < i0+1) { careteam.addCategory(); }
				String[] arrayi1 = c.getCareTeamCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getCategory().get(i0).getCoding().size() < i1+1) { careteam.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCareTeamCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getCategory().size() < i0+1) { careteam.addCategory(); }
				String[] arrayi1 = c.getCareTeamCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getCategory().get(i0).getCoding().size() < i1+1) { careteam.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCareTeamCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getCategory().size() < i0+1) { careteam.addCategory(); }
				String[] arrayi1 = c.getCareTeamCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getCategory().get(i0).getCoding().size() < i1+1) { careteam.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CareTeam_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCareTeamCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getCategory().size() < i0+1) { careteam.addCategory(); }
				String[] arrayi1 = c.getCareTeamCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getCategory().get(i0).getCoding().size() < i1+1) { careteam.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Ctgry_Txt ********************************************************************************/
		if(c.getCareTeamCtgryTxt() != null ) {

			String[] arrayi0 = c.getCareTeamCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getCategory().size() < i0+1) { careteam.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CareTeam_Enc ********************************************************************************/
		if(c.getCareTeamEnc() != null ) {

			if(c.getCareTeamEnc().replace("[","").replace("]","").equals("NULL") | c.getCareTeamEnc()==null) {} else {
			careteam.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getCareTeamEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CareTeam_Id_Assigner ********************************************************************************/
		if(c.getCareTeamIdAssigner() != null ) {

			String[] arrayi0 = c.getCareTeamIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Id_Prd_End ********************************************************************************/
		if(c.getCareTeamIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCareTeamIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Id_Prd_Strt ********************************************************************************/
		if(c.getCareTeamIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCareTeamIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Id_Sys ********************************************************************************/
		if(c.getCareTeamIdSys() != null ) {

			String[] arrayi0 = c.getCareTeamIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CareTeam_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCareTeamIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				String[] arrayi1 = c.getCareTeamIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careteam.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCareTeamIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				String[] arrayi1 = c.getCareTeamIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careteam.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCareTeamIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				String[] arrayi1 = c.getCareTeamIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careteam.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCareTeamIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				String[] arrayi1 = c.getCareTeamIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careteam.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CareTeam_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCareTeamIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				String[] arrayi1 = c.getCareTeamIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careteam.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Id_Typ_Txt ********************************************************************************/
		if(c.getCareTeamIdTypTxt() != null ) {

			String[] arrayi0 = c.getCareTeamIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CareTeam_Id_Use ********************************************************************************/
		if(c.getCareTeamIdUse() != null ) {

			String[] arrayi0 = c.getCareTeamIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Id_Vl ********************************************************************************/
		if(c.getCareTeamIdVl() != null ) {

			String[] arrayi0 = c.getCareTeamIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getIdentifier().size() < i0+1) { careteam.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CareTeam_ManagingOrgnztn ********************************************************************************/
		if(c.getCareTeamManagingOrgnztn() != null ) {

				for( String currListStrSplit : c.getCareTeamManagingOrgnztn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careteam.addManagingOrganization(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CareTeam_Nm ********************************************************************************/
		if(c.getCareTeamNm() != null ) {

			if(c.getCareTeamNm().replace("[","").replace("]","").equals("NULL") | c.getCareTeamNm()==null) {} else {
			careteam.setName(c.getCareTeamNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CareTeam_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCareTeamNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCareTeamNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getNote().size() < i0+1) { careteam.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCareTeamNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCareTeamNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getNote().size() < i0+1) { careteam.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Nt_Txt ********************************************************************************/
		if(c.getCareTeamNtTxt() != null ) {

			String[] arrayi0 = c.getCareTeamNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getNote().size() < i0+1) { careteam.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CareTeam_Nt_Time ********************************************************************************/
		if(c.getCareTeamNtTime() != null ) {

			String[] arrayi0 = c.getCareTeamNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getNote().size() < i0+1) { careteam.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Prtcpnt_Mmbr ********************************************************************************/
		if(c.getCareTeamPrtcpntMmbr() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntMmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getParticipant().get(i0).setMember(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Prtcpnt_OnBehalfOf ********************************************************************************/
		if(c.getCareTeamPrtcpntOnBehalfOf() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getParticipant().get(i0).setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Prtcpnt_Prd_End ********************************************************************************/
		if(c.getCareTeamPrtcpntPrdEnd() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getParticipant().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Prtcpnt_Prd_Strt ********************************************************************************/
		if(c.getCareTeamPrtcpntPrdStrt() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getParticipant().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgCd() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				String[] arrayi1 = c.getCareTeamPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getParticipant().get(i0).getRole().size() < i1+1) { careteam.getParticipant().get(i0).addRole(); }
					String[] arrayi2 = c.getCareTeamPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careteam.getParticipant().get(i0).getRole().get(i1).getCoding().size() < i2+1) { careteam.getParticipant().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careteam.getParticipant().get(i0).getRole().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgDsply() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				String[] arrayi1 = c.getCareTeamPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getParticipant().get(i0).getRole().size() < i1+1) { careteam.getParticipant().get(i0).addRole(); }
					String[] arrayi2 = c.getCareTeamPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careteam.getParticipant().get(i0).getRole().get(i1).getCoding().size() < i2+1) { careteam.getParticipant().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careteam.getParticipant().get(i0).getRole().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgSys() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				String[] arrayi1 = c.getCareTeamPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getParticipant().get(i0).getRole().size() < i1+1) { careteam.getParticipant().get(i0).addRole(); }
					String[] arrayi2 = c.getCareTeamPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careteam.getParticipant().get(i0).getRole().get(i1).getCoding().size() < i2+1) { careteam.getParticipant().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careteam.getParticipant().get(i0).getRole().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				String[] arrayi1 = c.getCareTeamPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getParticipant().get(i0).getRole().size() < i1+1) { careteam.getParticipant().get(i0).addRole(); }
					String[] arrayi2 = c.getCareTeamPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careteam.getParticipant().get(i0).getRole().get(i1).getCoding().size() < i2+1) { careteam.getParticipant().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careteam.getParticipant().get(i0).getRole().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgVrsn() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				String[] arrayi1 = c.getCareTeamPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getParticipant().get(i0).getRole().size() < i1+1) { careteam.getParticipant().get(i0).addRole(); }
					String[] arrayi2 = c.getCareTeamPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careteam.getParticipant().get(i0).getRole().get(i1).getCoding().size() < i2+1) { careteam.getParticipant().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careteam.getParticipant().get(i0).getRole().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CareTeam_Prtcpnt_Role_Txt ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleTxt() != null ) {

			String[] arrayi0 = c.getCareTeamPrtcpntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getParticipant().size() < i0+1) { careteam.addParticipant(); }
				String[] arrayi1 = c.getCareTeamPrtcpntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getParticipant().get(i0).getRole().size() < i1+1) { careteam.getParticipant().get(i0).addRole(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getParticipant().get(i0).getRole().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_Prd_End ********************************************************************************/
		if(c.getCareTeamPrdEnd() != null ) {

			if(c.getCareTeamPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCareTeamPrdEnd()==null) {} else {
			careteam.getPeriod().setEnd(c.getCareTeamPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCareTeamPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCareTeamPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CareTeam_Prd_Strt ********************************************************************************/
		if(c.getCareTeamPrdStrt() != null ) {

			if(c.getCareTeamPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCareTeamPrdStrt()==null) {} else {
			careteam.getPeriod().setStart(c.getCareTeamPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCareTeamPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCareTeamPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CareTeam_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamRsnCdCdgCd() != null ) {

			String[] arrayi0 = c.getCareTeamRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getReasonCode().size() < i0+1) { careteam.addReasonCode(); }
				String[] arrayi1 = c.getCareTeamRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getReasonCode().get(i0).getCoding().size() < i1+1) { careteam.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamRsnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCareTeamRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getReasonCode().size() < i0+1) { careteam.addReasonCode(); }
				String[] arrayi1 = c.getCareTeamRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getReasonCode().get(i0).getCoding().size() < i1+1) { careteam.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamRsnCdCdgSys() != null ) {

			String[] arrayi0 = c.getCareTeamRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getReasonCode().size() < i0+1) { careteam.addReasonCode(); }
				String[] arrayi1 = c.getCareTeamRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getReasonCode().get(i0).getCoding().size() < i1+1) { careteam.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCareTeamRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getReasonCode().size() < i0+1) { careteam.addReasonCode(); }
				String[] arrayi1 = c.getCareTeamRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getReasonCode().get(i0).getCoding().size() < i1+1) { careteam.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CareTeam_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCareTeamRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getReasonCode().size() < i0+1) { careteam.addReasonCode(); }
				String[] arrayi1 = c.getCareTeamRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careteam.getReasonCode().get(i0).getCoding().size() < i1+1) { careteam.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careteam.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CareTeam_RsnCd_Txt ********************************************************************************/
		if(c.getCareTeamRsnCdTxt() != null ) {

			String[] arrayi0 = c.getCareTeamRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getReasonCode().size() < i0+1) { careteam.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CareTeam_RsnRfrnc ********************************************************************************/
		if(c.getCareTeamRsnRfrnc() != null ) {

				for( String currListStrSplit : c.getCareTeamRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careteam.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CareTeam_Sts ********************************************************************************/
		if(c.getCareTeamSts() != null ) {

			if(c.getCareTeamSts().replace("[","").replace("]","").equals("NULL") | c.getCareTeamSts()==null) {} else {
			careteam.setStatus(new org.hl7.fhir.r4.model.CareTeam.CareTeamStatusEnumFactory().fromCode(c.getCareTeamSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CareTeam_Sbjct ********************************************************************************/
		if(c.getCareTeamSbjct() != null ) {

			if(c.getCareTeamSbjct().replace("[","").replace("]","").equals("NULL") | c.getCareTeamSbjct()==null) {} else {
			careteam.setSubject(new org.hl7.fhir.r4.model.Reference(c.getCareTeamSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CareTeam_Tlcm_Prd_End ********************************************************************************/
		if(c.getCareTeamTlcmPrdEnd() != null ) {

			String[] arrayi0 = c.getCareTeamTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getTelecom().size() < i0+1) { careteam.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCareTeamTlcmPrdStrt() != null ) {

			String[] arrayi0 = c.getCareTeamTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getTelecom().size() < i0+1) { careteam.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Tlcm_Rnk ********************************************************************************/
		if(c.getCareTeamTlcmRnk() != null ) {

			String[] arrayi0 = c.getCareTeamTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getTelecom().size() < i0+1) { careteam.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Tlcm_Sys ********************************************************************************/
		if(c.getCareTeamTlcmSys() != null ) {

			String[] arrayi0 = c.getCareTeamTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getTelecom().size() < i0+1) { careteam.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Tlcm_Use ********************************************************************************/
		if(c.getCareTeamTlcmUse() != null ) {

			String[] arrayi0 = c.getCareTeamTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getTelecom().size() < i0+1) { careteam.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CareTeam_Tlcm_Vl ********************************************************************************/
		if(c.getCareTeamTlcmVl() != null ) {

			String[] arrayi0 = c.getCareTeamTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careteam.getTelecom().size() < i0+1) { careteam.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careteam.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return careteam;
	}
}
