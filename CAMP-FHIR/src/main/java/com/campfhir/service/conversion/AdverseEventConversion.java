package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AdverseEvent;
public class AdverseEventConversion 
{
	public org.hl7.fhir.r4.model.AdverseEvent AdverseEvents(AdverseEvent a) throws ParseException
	{
		org.hl7.fhir.r4.model.AdverseEvent adverseevent = new org.hl7.fhir.r4.model.AdverseEvent();

		/******************** id ********************************************************************************/
		adverseevent.setId(a.getId());

		/******************** AdvsEvnt_Actuality ********************************************************************************/
		if(a.getAdvsEvntActuality() != null ) {

			if(a.getAdvsEvntActuality().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntActuality()==null) {} else {
			adverseevent.setActuality(new org.hl7.fhir.r4.model.AdverseEvent.AdverseEventActualityEnumFactory().fromCode(a.getAdvsEvntActuality().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getCategory().size() < i0+1) { adverseevent.addCategory(); }
				String[] arrayi1 = a.getAdvsEvntCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getCategory().get(i0).getCoding().size() < i1+1) { adverseevent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getCategory().size() < i0+1) { adverseevent.addCategory(); }
				String[] arrayi1 = a.getAdvsEvntCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getCategory().get(i0).getCoding().size() < i1+1) { adverseevent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getCategory().size() < i0+1) { adverseevent.addCategory(); }
				String[] arrayi1 = a.getAdvsEvntCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getCategory().get(i0).getCoding().size() < i1+1) { adverseevent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getCategory().size() < i0+1) { adverseevent.addCategory(); }
				String[] arrayi1 = a.getAdvsEvntCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getCategory().get(i0).getCoding().size() < i1+1) { adverseevent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AdvsEvnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getCategory().size() < i0+1) { adverseevent.addCategory(); }
				String[] arrayi1 = a.getAdvsEvntCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getCategory().get(i0).getCoding().size() < i1+1) { adverseevent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_Ctgry_Txt ********************************************************************************/
		if(a.getAdvsEvntCtgryTxt() != null ) {

			String[] arrayi0 = a.getAdvsEvntCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getCategory().size() < i0+1) { adverseevent.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Contributor ********************************************************************************/
		if(a.getAdvsEvntContributor() != null ) {

				for( String currListStrSplit : a.getAdvsEvntContributor().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			adverseevent.addContributor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** AdvsEvnt_Dt ********************************************************************************/
		if(a.getAdvsEvntDt() != null ) {

			if(a.getAdvsEvntDt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntDt()==null) {} else {
			adverseevent.setDate(a.getAdvsEvntDt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAdvsEvntDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Detected ********************************************************************************/
		if(a.getAdvsEvntDetected() != null ) {

			if(a.getAdvsEvntDetected().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntDetected()==null) {} else {
			adverseevent.setDetected(a.getAdvsEvntDetected().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntDetected()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAdvsEvntDetected().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Enc ********************************************************************************/
		if(a.getAdvsEvntEnc() != null ) {

			if(a.getAdvsEvntEnc().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntEnc()==null) {} else {
			adverseevent.setEncounter(new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Evnt_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntEvntCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntEvntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getEvent().getCoding().size() < i0+1) { adverseevent.getEvent().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getEvent().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Evnt_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntEvntCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntEvntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getEvent().getCoding().size() < i0+1) { adverseevent.getEvent().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getEvent().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Evnt_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntEvntCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntEvntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getEvent().getCoding().size() < i0+1) { adverseevent.getEvent().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getEvent().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntEvntCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntEvntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getEvent().getCoding().size() < i0+1) { adverseevent.getEvent().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getEvent().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AdvsEvnt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntEvntCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntEvntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getEvent().getCoding().size() < i0+1) { adverseevent.getEvent().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getEvent().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Evnt_Txt ********************************************************************************/
		if(a.getAdvsEvntEvntTxt() != null ) {

			if(a.getAdvsEvntEvntTxt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntEvntTxt()==null) {} else {
			adverseevent.getEvent().setText(a.getAdvsEvntEvntTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_Id_Assigner ********************************************************************************/
		if(a.getAdvsEvntIdAssigner() != null ) {

			if(a.getAdvsEvntIdAssigner().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdAssigner()==null) {} else {
			adverseevent.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Id_Prd_End ********************************************************************************/
		if(a.getAdvsEvntIdPrdEnd() != null ) {

			if(a.getAdvsEvntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdPrdEnd()==null) {} else {
			adverseevent.getIdentifier().getPeriod().setEnd(a.getAdvsEvntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAdvsEvntIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Id_Prd_Strt ********************************************************************************/
		if(a.getAdvsEvntIdPrdStrt() != null ) {

			if(a.getAdvsEvntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdPrdStrt()==null) {} else {
			adverseevent.getIdentifier().getPeriod().setStart(a.getAdvsEvntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAdvsEvntIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Id_Sys ********************************************************************************/
		if(a.getAdvsEvntIdSys() != null ) {

			if(a.getAdvsEvntIdSys().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdSys()==null) {} else {
			adverseevent.getIdentifier().setSystem(a.getAdvsEvntIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getIdentifier().getType().getCoding().size() < i0+1) { adverseevent.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getIdentifier().getType().getCoding().size() < i0+1) { adverseevent.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getIdentifier().getType().getCoding().size() < i0+1) { adverseevent.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getIdentifier().getType().getCoding().size() < i0+1) { adverseevent.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getIdentifier().getType().getCoding().size() < i0+1) { adverseevent.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Id_Typ_Txt ********************************************************************************/
		if(a.getAdvsEvntIdTypTxt() != null ) {

			if(a.getAdvsEvntIdTypTxt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdTypTxt()==null) {} else {
			adverseevent.getIdentifier().getType().setText(a.getAdvsEvntIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_Id_Use ********************************************************************************/
		if(a.getAdvsEvntIdUse() != null ) {

			if(a.getAdvsEvntIdUse().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdUse()==null) {} else {
			adverseevent.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(a.getAdvsEvntIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Id_Vl ********************************************************************************/
		if(a.getAdvsEvntIdVl() != null ) {

			if(a.getAdvsEvntIdVl().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntIdVl()==null) {} else {
			adverseevent.getIdentifier().setValue(a.getAdvsEvntIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_Lctn ********************************************************************************/
		if(a.getAdvsEvntLctn() != null ) {

			if(a.getAdvsEvntLctn().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntLctn()==null) {} else {
			adverseevent.setLocation(new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Outcome_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntOutcomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getOutcome().getCoding().size() < i0+1) { adverseevent.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getOutcome().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Outcome_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntOutcomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getOutcome().getCoding().size() < i0+1) { adverseevent.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getOutcome().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Outcome_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntOutcomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getOutcome().getCoding().size() < i0+1) { adverseevent.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getOutcome().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntOutcomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getOutcome().getCoding().size() < i0+1) { adverseevent.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getOutcome().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AdvsEvnt_Outcome_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntOutcomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getOutcome().getCoding().size() < i0+1) { adverseevent.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getOutcome().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Outcome_Txt ********************************************************************************/
		if(a.getAdvsEvntOutcomeTxt() != null ) {

			if(a.getAdvsEvntOutcomeTxt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntOutcomeTxt()==null) {} else {
			adverseevent.getOutcome().setText(a.getAdvsEvntOutcomeTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_RecordedDt ********************************************************************************/
		if(a.getAdvsEvntRecordedDt() != null ) {

			if(a.getAdvsEvntRecordedDt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntRecordedDt()==null) {} else {
			adverseevent.setRecordedDate(a.getAdvsEvntRecordedDt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntRecordedDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAdvsEvntRecordedDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_Recorder ********************************************************************************/
		if(a.getAdvsEvntRecorder() != null ) {

			if(a.getAdvsEvntRecorder().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntRecorder()==null) {} else {
			adverseevent.setRecorder(new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntRecorder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_RfrncDoc ********************************************************************************/
		if(a.getAdvsEvntRfrncDoc() != null ) {

				for( String currListStrSplit : a.getAdvsEvntRfrncDoc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			adverseevent.addReferenceDocument(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** AdvsEvnt_RsltingCndtn ********************************************************************************/
		if(a.getAdvsEvntRsltingCndtn() != null ) {

				for( String currListStrSplit : a.getAdvsEvntRsltingCndtn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			adverseevent.addResultingCondition(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** AdvsEvnt_Seriousness_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeriousnessCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeriousness().getCoding().size() < i0+1) { adverseevent.getSeriousness().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeriousness().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Seriousness_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeriousnessCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeriousness().getCoding().size() < i0+1) { adverseevent.getSeriousness().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeriousness().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Seriousness_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeriousnessCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeriousness().getCoding().size() < i0+1) { adverseevent.getSeriousness().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeriousness().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Seriousness_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeriousnessCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeriousness().getCoding().size() < i0+1) { adverseevent.getSeriousness().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeriousness().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AdvsEvnt_Seriousness_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeriousnessCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeriousness().getCoding().size() < i0+1) { adverseevent.getSeriousness().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeriousness().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Seriousness_Txt ********************************************************************************/
		if(a.getAdvsEvntSeriousnessTxt() != null ) {

			if(a.getAdvsEvntSeriousnessTxt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntSeriousnessTxt()==null) {} else {
			adverseevent.getSeriousness().setText(a.getAdvsEvntSeriousnessTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_Severity_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeverityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeverity().getCoding().size() < i0+1) { adverseevent.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeverity().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Severity_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeverityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeverity().getCoding().size() < i0+1) { adverseevent.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeverity().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Severity_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeverityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeverity().getCoding().size() < i0+1) { adverseevent.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeverity().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Severity_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeverityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeverity().getCoding().size() < i0+1) { adverseevent.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeverity().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AdvsEvnt_Severity_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntSeverityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSeverity().getCoding().size() < i0+1) { adverseevent.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSeverity().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AdvsEvnt_Severity_Txt ********************************************************************************/
		if(a.getAdvsEvntSeverityTxt() != null ) {

			if(a.getAdvsEvntSeverityTxt().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntSeverityTxt()==null) {} else {
			adverseevent.getSeverity().setText(a.getAdvsEvntSeverityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AdvsEvnt_Stdy ********************************************************************************/
		if(a.getAdvsEvntStdy() != null ) {

				for( String currListStrSplit : a.getAdvsEvntStdy().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			adverseevent.addStudy(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** AdvsEvnt_Sbjct ********************************************************************************/
		if(a.getAdvsEvntSbjct() != null ) {

			if(a.getAdvsEvntSbjct().replace("[","").replace("]","").equals("NULL") | a.getAdvsEvntSbjct()==null) {} else {
			adverseevent.setSubject(new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AdvsEvnt_SbjctMedicalHis ********************************************************************************/
		if(a.getAdvsEvntSbjctMedicalHis() != null ) {

				for( String currListStrSplit : a.getAdvsEvntSbjctMedicalHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			adverseevent.addSubjectMedicalHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityAssmntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Txt ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntTxt() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAssmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAssmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getAssessment().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Athr ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAthr() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityAthr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityAthr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgCd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgDsply() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgSys() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgVrsn() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					String[] arrayi2 = a.getAdvsEvntSuspectEntityCausalityMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().size() < i2+1) { adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Txt ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdTxt() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).getMethod().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Causality_PrdctRltedness ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityPrdctRltedness() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityCausalityPrdctRltedness().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				String[] arrayi1 = a.getAdvsEvntSuspectEntityCausalityPrdctRltedness().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(adverseevent.getSuspectEntity().get(i0).getCausality().size() < i1+1) { adverseevent.getSuspectEntity().get(i0).addCausality(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {adverseevent.getSuspectEntity().get(i0).getCausality().get(i1).setProductRelatedness(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AdvsEvnt_SuspectEntity_Instance ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityInstance() != null ) {

			String[] arrayi0 = a.getAdvsEvntSuspectEntityInstance().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(adverseevent.getSuspectEntity().size() < i0+1) { adverseevent.addSuspectEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {adverseevent.getSuspectEntity().get(i0).setInstance(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return adverseevent;
	}
}
