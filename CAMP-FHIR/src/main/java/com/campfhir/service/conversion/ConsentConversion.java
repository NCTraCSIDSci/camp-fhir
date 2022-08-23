package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Consent;
public class ConsentConversion 
{
	public org.hl7.fhir.r4.model.Consent Consents(Consent c) throws ParseException
	{
		org.hl7.fhir.r4.model.Consent consent = new org.hl7.fhir.r4.model.Consent();

		/******************** id ********************************************************************************/
		consent.setId(c.getId());

		/******************** Cnsnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCnsntCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getCategory().size() < i0+1) { consent.addCategory(); }
				String[] arrayi1 = c.getCnsntCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getCategory().get(i0).getCoding().size() < i1+1) { consent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getCategory().size() < i0+1) { consent.addCategory(); }
				String[] arrayi1 = c.getCnsntCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getCategory().get(i0).getCoding().size() < i1+1) { consent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCnsntCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getCategory().size() < i0+1) { consent.addCategory(); }
				String[] arrayi1 = c.getCnsntCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getCategory().get(i0).getCoding().size() < i1+1) { consent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getCategory().size() < i0+1) { consent.addCategory(); }
				String[] arrayi1 = c.getCnsntCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getCategory().get(i0).getCoding().size() < i1+1) { consent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnsnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getCategory().size() < i0+1) { consent.addCategory(); }
				String[] arrayi1 = c.getCnsntCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getCategory().get(i0).getCoding().size() < i1+1) { consent.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Ctgry_Txt ********************************************************************************/
		if(c.getCnsntCtgryTxt() != null ) {

			String[] arrayi0 = c.getCnsntCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getCategory().size() < i0+1) { consent.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_DtTime ********************************************************************************/
		if(c.getCnsntDtTime() != null ) {

			if(c.getCnsntDtTime().replace("[","").replace("]","").equals("NULL") | c.getCnsntDtTime()==null) {} else {
			consent.setDateTime(c.getCnsntDtTime().replace("[","").replace("]","").equals("NULL") | c.getCnsntDtTime()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnsntDtTime().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Id_Assigner ********************************************************************************/
		if(c.getCnsntIdAssigner() != null ) {

			String[] arrayi0 = c.getCnsntIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Id_Prd_End ********************************************************************************/
		if(c.getCnsntIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCnsntIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Id_Prd_Strt ********************************************************************************/
		if(c.getCnsntIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCnsntIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Id_Sys ********************************************************************************/
		if(c.getCnsntIdSys() != null ) {

			String[] arrayi0 = c.getCnsntIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnsntIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				String[] arrayi1 = c.getCnsntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { consent.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				String[] arrayi1 = c.getCnsntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { consent.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnsntIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				String[] arrayi1 = c.getCnsntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { consent.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				String[] arrayi1 = c.getCnsntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { consent.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnsnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				String[] arrayi1 = c.getCnsntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { consent.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Id_Typ_Txt ********************************************************************************/
		if(c.getCnsntIdTypTxt() != null ) {

			String[] arrayi0 = c.getCnsntIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Id_Use ********************************************************************************/
		if(c.getCnsntIdUse() != null ) {

			String[] arrayi0 = c.getCnsntIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Id_Vl ********************************************************************************/
		if(c.getCnsntIdVl() != null ) {

			String[] arrayi0 = c.getCnsntIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getIdentifier().size() < i0+1) { consent.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Orgnztn ********************************************************************************/
		if(c.getCnsntOrgnztn() != null ) {

				for( String currListStrSplit : c.getCnsntOrgnztn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			consent.addOrganization(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnsnt_Pnt ********************************************************************************/
		if(c.getCnsntPnt() != null ) {

			if(c.getCnsntPnt().replace("[","").replace("]","").equals("NULL") | c.getCnsntPnt()==null) {} else {
			consent.setPatient(new org.hl7.fhir.r4.model.Reference(c.getCnsntPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Prfrmr ********************************************************************************/
		if(c.getCnsntPrfrmr() != null ) {

				for( String currListStrSplit : c.getCnsntPrfrmr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			consent.addPerformer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cnsnt_Policy_Athrity ********************************************************************************/
		if(c.getCnsntPolicyAthrity() != null ) {

			String[] arrayi0 = c.getCnsntPolicyAthrity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicy().size() < i0+1) { consent.addPolicy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicy().get(i0).setAuthority(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Policy_Uri ********************************************************************************/
		if(c.getCnsntPolicyUri() != null ) {

			String[] arrayi0 = c.getCnsntPolicyUri().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicy().size() < i0+1) { consent.addPolicy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicy().get(i0).setUri(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_PolicyRule_Cdg_Cd ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntPolicyRuleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicyRule().getCoding().size() < i0+1) { consent.getPolicyRule().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicyRule().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_PolicyRule_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntPolicyRuleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicyRule().getCoding().size() < i0+1) { consent.getPolicyRule().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicyRule().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_PolicyRule_Cdg_Sys ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntPolicyRuleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicyRule().getCoding().size() < i0+1) { consent.getPolicyRule().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicyRule().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_PolicyRule_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntPolicyRuleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicyRule().getCoding().size() < i0+1) { consent.getPolicyRule().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicyRule().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_PolicyRule_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntPolicyRuleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getPolicyRule().getCoding().size() < i0+1) { consent.getPolicyRule().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getPolicyRule().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_PolicyRule_Txt ********************************************************************************/
		if(c.getCnsntPolicyRuleTxt() != null ) {

			if(c.getCnsntPolicyRuleTxt().replace("[","").replace("]","").equals("NULL") | c.getCnsntPolicyRuleTxt()==null) {} else {
			consent.getPolicyRule().setText(c.getCnsntPolicyRuleTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Cd ********************************************************************************/
		if(c.getCnsntProvisionActnCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getAction().size() < i0+1) { consent.getProvision().addAction(); }
				String[] arrayi1 = c.getCnsntProvisionActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getAction().get(i0).getCoding().size() < i1+1) { consent.getProvision().getAction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getAction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actn_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntProvisionActnCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getAction().size() < i0+1) { consent.getProvision().addAction(); }
				String[] arrayi1 = c.getCnsntProvisionActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getAction().get(i0).getCoding().size() < i1+1) { consent.getProvision().getAction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getAction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actn_Cdg_Sys ********************************************************************************/
		if(c.getCnsntProvisionActnCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getAction().size() < i0+1) { consent.getProvision().addAction(); }
				String[] arrayi1 = c.getCnsntProvisionActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getAction().get(i0).getCoding().size() < i1+1) { consent.getProvision().getAction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getAction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionActnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getAction().size() < i0+1) { consent.getProvision().addAction(); }
				String[] arrayi1 = c.getCnsntProvisionActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getAction().get(i0).getCoding().size() < i1+1) { consent.getProvision().getAction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getAction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actn_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionActnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getAction().size() < i0+1) { consent.getProvision().addAction(); }
				String[] arrayi1 = c.getCnsntProvisionActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getAction().get(i0).getCoding().size() < i1+1) { consent.getProvision().getAction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getAction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actn_Txt ********************************************************************************/
		if(c.getCnsntProvisionActnTxt() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getAction().size() < i0+1) { consent.getProvision().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getAction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Actor_Rfrnc ********************************************************************************/
		if(c.getCnsntProvisionActorRfrnc() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getActor().get(i0).setReference(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Cd ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				String[] arrayi1 = c.getCnsntProvisionActorRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getActor().get(i0).getRole().getCoding().size() < i1+1) { consent.getProvision().getActor().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getActor().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				String[] arrayi1 = c.getCnsntProvisionActorRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getActor().get(i0).getRole().getCoding().size() < i1+1) { consent.getProvision().getActor().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getActor().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Sys ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				String[] arrayi1 = c.getCnsntProvisionActorRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getActor().get(i0).getRole().getCoding().size() < i1+1) { consent.getProvision().getActor().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getActor().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				String[] arrayi1 = c.getCnsntProvisionActorRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getActor().get(i0).getRole().getCoding().size() < i1+1) { consent.getProvision().getActor().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getActor().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				String[] arrayi1 = c.getCnsntProvisionActorRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getActor().get(i0).getRole().getCoding().size() < i1+1) { consent.getProvision().getActor().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getActor().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Actor_Role_Txt ********************************************************************************/
		if(c.getCnsntProvisionActorRoleTxt() != null ) {

			String[] arrayi0 = c.getCnsntProvisionActorRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getActor().size() < i0+1) { consent.getProvision().addActor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getActor().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Cls__Cd ********************************************************************************/
		if(c.getCnsntProvisionClsCd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionClsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getClass_().size() < i0+1) { consent.getProvision().addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getClass_().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Cls__Dsply ********************************************************************************/
		if(c.getCnsntProvisionClsDsply() != null ) {

			String[] arrayi0 = c.getCnsntProvisionClsDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getClass_().size() < i0+1) { consent.getProvision().addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getClass_().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Cls__Sys ********************************************************************************/
		if(c.getCnsntProvisionClsSys() != null ) {

			String[] arrayi0 = c.getCnsntProvisionClsSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getClass_().size() < i0+1) { consent.getProvision().addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getClass_().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Cls__UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionClsUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionClsUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getClass_().size() < i0+1) { consent.getProvision().addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getClass_().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Provision_Cls__Vrsn ********************************************************************************/
		if(c.getCnsntProvisionClsVrsn() != null ) {

			String[] arrayi0 = c.getCnsntProvisionClsVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getClass_().size() < i0+1) { consent.getProvision().addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getClass_().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCnsntProvisionCdCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getCode().size() < i0+1) { consent.getProvision().addCode(); }
				String[] arrayi1 = c.getCnsntProvisionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getCode().get(i0).getCoding().size() < i1+1) { consent.getProvision().getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntProvisionCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntProvisionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getCode().size() < i0+1) { consent.getProvision().addCode(); }
				String[] arrayi1 = c.getCnsntProvisionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getCode().get(i0).getCoding().size() < i1+1) { consent.getProvision().getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCnsntProvisionCdCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntProvisionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getCode().size() < i0+1) { consent.getProvision().addCode(); }
				String[] arrayi1 = c.getCnsntProvisionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getCode().get(i0).getCoding().size() < i1+1) { consent.getProvision().getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getCode().size() < i0+1) { consent.getProvision().addCode(); }
				String[] arrayi1 = c.getCnsntProvisionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getCode().get(i0).getCoding().size() < i1+1) { consent.getProvision().getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cnsnt_Provision_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntProvisionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getCode().size() < i0+1) { consent.getProvision().addCode(); }
				String[] arrayi1 = c.getCnsntProvisionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(consent.getProvision().getCode().get(i0).getCoding().size() < i1+1) { consent.getProvision().getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {consent.getProvision().getCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cnsnt_Provision_Cd_Txt ********************************************************************************/
		if(c.getCnsntProvisionCdTxt() != null ) {

			String[] arrayi0 = c.getCnsntProvisionCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getCode().size() < i0+1) { consent.getProvision().addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Data_Meaning ********************************************************************************/
		if(c.getCnsntProvisionDataMeaning() != null ) {

			String[] arrayi0 = c.getCnsntProvisionDataMeaning().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getData().size() < i0+1) { consent.getProvision().addData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getData().get(i0).setMeaning(new org.hl7.fhir.r4.model.Consent.ConsentDataMeaningEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Provision_Data_Rfrnc ********************************************************************************/
		if(c.getCnsntProvisionDataRfrnc() != null ) {

			String[] arrayi0 = c.getCnsntProvisionDataRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getData().size() < i0+1) { consent.getProvision().addData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getData().get(i0).setReference(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Provision_DataPrd_End ********************************************************************************/
		if(c.getCnsntProvisionDataPrdEnd() != null ) {

			if(c.getCnsntProvisionDataPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionDataPrdEnd()==null) {} else {
			consent.getProvision().getDataPeriod().setEnd(c.getCnsntProvisionDataPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionDataPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnsntProvisionDataPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Provision_DataPrd_Strt ********************************************************************************/
		if(c.getCnsntProvisionDataPrdStrt() != null ) {

			if(c.getCnsntProvisionDataPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionDataPrdStrt()==null) {} else {
			consent.getProvision().getDataPeriod().setStart(c.getCnsntProvisionDataPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionDataPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnsntProvisionDataPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Provision_Prd_End ********************************************************************************/
		if(c.getCnsntProvisionPrdEnd() != null ) {

			if(c.getCnsntProvisionPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionPrdEnd()==null) {} else {
			consent.getProvision().getPeriod().setEnd(c.getCnsntProvisionPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnsntProvisionPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Provision_Prd_Strt ********************************************************************************/
		if(c.getCnsntProvisionPrdStrt() != null ) {

			if(c.getCnsntProvisionPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionPrdStrt()==null) {} else {
			consent.getProvision().getPeriod().setStart(c.getCnsntProvisionPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnsntProvisionPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Provision_Prpse_Cd ********************************************************************************/
		if(c.getCnsntProvisionPrpseCd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionPrpseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getPurpose().size() < i0+1) { consent.getProvision().addPurpose(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getPurpose().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Prpse_Dsply ********************************************************************************/
		if(c.getCnsntProvisionPrpseDsply() != null ) {

			String[] arrayi0 = c.getCnsntProvisionPrpseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getPurpose().size() < i0+1) { consent.getProvision().addPurpose(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getPurpose().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Prpse_Sys ********************************************************************************/
		if(c.getCnsntProvisionPrpseSys() != null ) {

			String[] arrayi0 = c.getCnsntProvisionPrpseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getPurpose().size() < i0+1) { consent.getProvision().addPurpose(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getPurpose().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Prpse_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionPrpseUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionPrpseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getPurpose().size() < i0+1) { consent.getProvision().addPurpose(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getPurpose().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Provision_Prpse_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionPrpseVrsn() != null ) {

			String[] arrayi0 = c.getCnsntProvisionPrpseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getPurpose().size() < i0+1) { consent.getProvision().addPurpose(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getPurpose().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_SecurityLbl_Cd ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblCd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionSecurityLblCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getSecurityLabel().size() < i0+1) { consent.getProvision().addSecurityLabel(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getSecurityLabel().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_SecurityLbl_Dsply ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblDsply() != null ) {

			String[] arrayi0 = c.getCnsntProvisionSecurityLblDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getSecurityLabel().size() < i0+1) { consent.getProvision().addSecurityLabel(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getSecurityLabel().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_SecurityLbl_Sys ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblSys() != null ) {

			String[] arrayi0 = c.getCnsntProvisionSecurityLblSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getSecurityLabel().size() < i0+1) { consent.getProvision().addSecurityLabel(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getSecurityLabel().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_SecurityLbl_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntProvisionSecurityLblUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getSecurityLabel().size() < i0+1) { consent.getProvision().addSecurityLabel(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getSecurityLabel().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Provision_SecurityLbl_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblVrsn() != null ) {

			String[] arrayi0 = c.getCnsntProvisionSecurityLblVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getProvision().getSecurityLabel().size() < i0+1) { consent.getProvision().addSecurityLabel(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getProvision().getSecurityLabel().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Provision_Typ ********************************************************************************/
		if(c.getCnsntProvisionTyp() != null ) {

			if(c.getCnsntProvisionTyp().replace("[","").replace("]","").equals("NULL") | c.getCnsntProvisionTyp()==null) {} else {
			consent.getProvision().setType(new org.hl7.fhir.r4.model.Consent.ConsentProvisionTypeEnumFactory().fromCode(c.getCnsntProvisionTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Scope_Cdg_Cd ********************************************************************************/
		if(c.getCnsntScopeCdgCd() != null ) {

			String[] arrayi0 = c.getCnsntScopeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getScope().getCoding().size() < i0+1) { consent.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getScope().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Scope_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntScopeCdgDsply() != null ) {

			String[] arrayi0 = c.getCnsntScopeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getScope().getCoding().size() < i0+1) { consent.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getScope().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Scope_Cdg_Sys ********************************************************************************/
		if(c.getCnsntScopeCdgSys() != null ) {

			String[] arrayi0 = c.getCnsntScopeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getScope().getCoding().size() < i0+1) { consent.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getScope().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Scope_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntScopeCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCnsntScopeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getScope().getCoding().size() < i0+1) { consent.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getScope().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Scope_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntScopeCdgVrsn() != null ) {

			String[] arrayi0 = c.getCnsntScopeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getScope().getCoding().size() < i0+1) { consent.getScope().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getScope().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cnsnt_Scope_Txt ********************************************************************************/
		if(c.getCnsntScopeTxt() != null ) {

			if(c.getCnsntScopeTxt().replace("[","").replace("]","").equals("NULL") | c.getCnsntScopeTxt()==null) {} else {
			consent.getScope().setText(c.getCnsntScopeTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnsnt_SrcAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnsntSrcAttchmntCntntTyp() != null ) {

			if(c.getCnsntSrcAttchmntCntntTyp().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntCntntTyp()==null) {} else {
			consent.getSourceAttachment().setContentType(c.getCnsntSrcAttchmntCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Creation ********************************************************************************/
		if(c.getCnsntSrcAttchmntCreation() != null ) {

			if(c.getCnsntSrcAttchmntCreation().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntCreation()==null) {} else {
			consent.getSourceAttachment().setCreation(c.getCnsntSrcAttchmntCreation().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCnsntSrcAttchmntCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Data ********************************************************************************/
		if(c.getCnsntSrcAttchmntData() != null ) {

			if(c.getCnsntSrcAttchmntData().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntData()==null) {} else {
			consent.getSourceAttachment().setData(c.getCnsntSrcAttchmntData().getBytes());
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Hash ********************************************************************************/
		if(c.getCnsntSrcAttchmntHash() != null ) {

			if(c.getCnsntSrcAttchmntHash().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntHash()==null) {} else {
			consent.getSourceAttachment().setHash(c.getCnsntSrcAttchmntHash().getBytes());
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnsntSrcAttchmntLnguage() != null ) {

			if(c.getCnsntSrcAttchmntLnguage().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntLnguage()==null) {} else {
			consent.getSourceAttachment().setLanguage(c.getCnsntSrcAttchmntLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Sz ********************************************************************************/
		if(c.getCnsntSrcAttchmntSz() != null ) {

			if(c.getCnsntSrcAttchmntSz().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntSz()==null) {} else {
			consent.getSourceAttachment().setSize(Integer.parseInt(c.getCnsntSrcAttchmntSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Ttl ********************************************************************************/
		if(c.getCnsntSrcAttchmntTtl() != null ) {

			if(c.getCnsntSrcAttchmntTtl().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntTtl()==null) {} else {
			consent.getSourceAttachment().setTitle(c.getCnsntSrcAttchmntTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnsnt_SrcAttchmnt_Url ********************************************************************************/
		if(c.getCnsntSrcAttchmntUrl() != null ) {

			if(c.getCnsntSrcAttchmntUrl().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcAttchmntUrl()==null) {} else {
			consent.getSourceAttachment().setUrl(c.getCnsntSrcAttchmntUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cnsnt_SrcRfrnc ********************************************************************************/
		if(c.getCnsntSrcRfrnc() != null ) {

			if(c.getCnsntSrcRfrnc().replace("[","").replace("]","").equals("NULL") | c.getCnsntSrcRfrnc()==null) {} else {
			consent.setSource(new org.hl7.fhir.r4.model.Reference(c.getCnsntSrcRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Sts ********************************************************************************/
		if(c.getCnsntSts() != null ) {

			if(c.getCnsntSts().replace("[","").replace("]","").equals("NULL") | c.getCnsntSts()==null) {} else {
			consent.setStatus(new org.hl7.fhir.r4.model.Consent.ConsentStateEnumFactory().fromCode(c.getCnsntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cnsnt_Vrfctn_VrfctnDt ********************************************************************************/
		if(c.getCnsntVrfctnVrfctnDt() != null ) {

			String[] arrayi0 = c.getCnsntVrfctnVrfctnDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getVerification().size() < i0+1) { consent.addVerification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getVerification().get(i0).setVerificationDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Vrfctn_Verified ********************************************************************************/
		if(c.getCnsntVrfctnVerified() != null ) {

			String[] arrayi0 = c.getCnsntVrfctnVerified().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getVerification().size() < i0+1) { consent.addVerification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getVerification().get(i0).setVerified(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cnsnt_Vrfctn_VerifiedWith ********************************************************************************/
		if(c.getCnsntVrfctnVerifiedWith() != null ) {

			String[] arrayi0 = c.getCnsntVrfctnVerifiedWith().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(consent.getVerification().size() < i0+1) { consent.addVerification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {consent.getVerification().get(i0).setVerifiedWith(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return consent;
	}
}
