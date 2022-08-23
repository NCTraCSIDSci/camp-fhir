package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CommunicationRequest;
public class CommunicationRequestConversion 
{
	public org.hl7.fhir.r4.model.CommunicationRequest CommunicationRequests(CommunicationRequest c) throws ParseException
	{
		org.hl7.fhir.r4.model.CommunicationRequest communicationrequest = new org.hl7.fhir.r4.model.CommunicationRequest();

		/******************** id ********************************************************************************/
		communicationrequest.setId(c.getId());

		/******************** CmmnctnRqst_About ********************************************************************************/
		if(c.getCmmnctnRqstAbout() != null ) {

				for( String currListStrSplit : c.getCmmnctnRqstAbout().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communicationrequest.addAbout(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CmmnctnRqst_AthredOn ********************************************************************************/
		if(c.getCmmnctnRqstAthredOn() != null ) {

			if(c.getCmmnctnRqstAthredOn().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstAthredOn()==null) {} else {
			communicationrequest.setAuthoredOn(c.getCmmnctnRqstAthredOn().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnRqstAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_BasedOn ********************************************************************************/
		if(c.getCmmnctnRqstBasedOn() != null ) {

				for( String currListStrSplit : c.getCmmnctnRqstBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communicationrequest.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getCategory().size() < i0+1) { communicationrequest.addCategory(); }
				String[] arrayi1 = c.getCmmnctnRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { communicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getCategory().size() < i0+1) { communicationrequest.addCategory(); }
				String[] arrayi1 = c.getCmmnctnRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { communicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getCategory().size() < i0+1) { communicationrequest.addCategory(); }
				String[] arrayi1 = c.getCmmnctnRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { communicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getCategory().size() < i0+1) { communicationrequest.addCategory(); }
				String[] arrayi1 = c.getCmmnctnRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { communicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getCategory().size() < i0+1) { communicationrequest.addCategory(); }
				String[] arrayi1 = c.getCmmnctnRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { communicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Ctgry_Txt ********************************************************************************/
		if(c.getCmmnctnRqstCtgryTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getCategory().size() < i0+1) { communicationrequest.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_DoNotPerform ********************************************************************************/
		if(c.getCmmnctnRqstDoNotPerform() != null ) {

			if(c.getCmmnctnRqstDoNotPerform().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstDoNotPerform()==null) {} else {
			communicationrequest.setDoNotPerform(Boolean.parseBoolean(c.getCmmnctnRqstDoNotPerform().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_Enc ********************************************************************************/
		if(c.getCmmnctnRqstEnc() != null ) {

			if(c.getCmmnctnRqstEnc().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstEnc()==null) {} else {
			communicationrequest.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_GrpId_Assigner ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdAssigner() != null ) {

			if(c.getCmmnctnRqstGrpIdAssigner().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdAssigner()==null) {} else {
			communicationrequest.getGroupIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstGrpIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_GrpId_Prd_End ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdPrdEnd() != null ) {

			if(c.getCmmnctnRqstGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdPrdEnd()==null) {} else {
			communicationrequest.getGroupIdentifier().getPeriod().setEnd(c.getCmmnctnRqstGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnRqstGrpIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdPrdStrt() != null ) {

			if(c.getCmmnctnRqstGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdPrdStrt()==null) {} else {
			communicationrequest.getGroupIdentifier().getPeriod().setStart(c.getCmmnctnRqstGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnRqstGrpIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_GrpId_Sys ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdSys() != null ) {

			if(c.getCmmnctnRqstGrpIdSys().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdSys()==null) {} else {
			communicationrequest.getGroupIdentifier().setSystem(c.getCmmnctnRqstGrpIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { communicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { communicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { communicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { communicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { communicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypTxt() != null ) {

			if(c.getCmmnctnRqstGrpIdTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdTypTxt()==null) {} else {
			communicationrequest.getGroupIdentifier().getType().setText(c.getCmmnctnRqstGrpIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmmnctnRqst_GrpId_Use ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdUse() != null ) {

			if(c.getCmmnctnRqstGrpIdUse().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdUse()==null) {} else {
			communicationrequest.getGroupIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(c.getCmmnctnRqstGrpIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_GrpId_Vl ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdVl() != null ) {

			if(c.getCmmnctnRqstGrpIdVl().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstGrpIdVl()==null) {} else {
			communicationrequest.getGroupIdentifier().setValue(c.getCmmnctnRqstGrpIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmmnctnRqst_Id_Assigner ********************************************************************************/
		if(c.getCmmnctnRqstIdAssigner() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Id_Prd_End ********************************************************************************/
		if(c.getCmmnctnRqstIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Id_Prd_Strt ********************************************************************************/
		if(c.getCmmnctnRqstIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Id_Sys ********************************************************************************/
		if(c.getCmmnctnRqstIdSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Id_Typ_Txt ********************************************************************************/
		if(c.getCmmnctnRqstIdTypTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Id_Use ********************************************************************************/
		if(c.getCmmnctnRqstIdUse() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Id_Vl ********************************************************************************/
		if(c.getCmmnctnRqstIdVl() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getIdentifier().size() < i0+1) { communicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Medium_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstMediumCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getMedium().size() < i0+1) { communicationrequest.addMedium(); }
				String[] arrayi1 = c.getCmmnctnRqstMediumCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getMedium().get(i0).getCoding().size() < i1+1) { communicationrequest.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getMedium().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Medium_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstMediumCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getMedium().size() < i0+1) { communicationrequest.addMedium(); }
				String[] arrayi1 = c.getCmmnctnRqstMediumCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getMedium().get(i0).getCoding().size() < i1+1) { communicationrequest.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getMedium().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Medium_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstMediumCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getMedium().size() < i0+1) { communicationrequest.addMedium(); }
				String[] arrayi1 = c.getCmmnctnRqstMediumCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getMedium().get(i0).getCoding().size() < i1+1) { communicationrequest.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getMedium().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Medium_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstMediumCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getMedium().size() < i0+1) { communicationrequest.addMedium(); }
				String[] arrayi1 = c.getCmmnctnRqstMediumCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getMedium().get(i0).getCoding().size() < i1+1) { communicationrequest.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getMedium().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmmnctnRqst_Medium_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstMediumCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getMedium().size() < i0+1) { communicationrequest.addMedium(); }
				String[] arrayi1 = c.getCmmnctnRqstMediumCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getMedium().get(i0).getCoding().size() < i1+1) { communicationrequest.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getMedium().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_Medium_Txt ********************************************************************************/
		if(c.getCmmnctnRqstMediumTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstMediumTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getMedium().size() < i0+1) { communicationrequest.addMedium(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getMedium().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCmmnctnRqstNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getNote().size() < i0+1) { communicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCmmnctnRqstNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getNote().size() < i0+1) { communicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Nt_Txt ********************************************************************************/
		if(c.getCmmnctnRqstNtTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getNote().size() < i0+1) { communicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Nt_Time ********************************************************************************/
		if(c.getCmmnctnRqstNtTime() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getNote().size() < i0+1) { communicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(c.getCmmnctnRqstOccrnceDtTimeTyp() != null ) {

			if(c.getCmmnctnRqstOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstOccrnceDtTimeTyp()==null) {} else {
			communicationrequest.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(c.getCmmnctnRqstOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_OccrncePrd_End ********************************************************************************/
		if(c.getCmmnctnRqstOccrncePrdEnd() != null ) {

			if(c.getCmmnctnRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstOccrncePrdEnd()==null) {} else {
			communicationrequest.getOccurrencePeriod().setEnd(c.getCmmnctnRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnRqstOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_OccrncePrd_Strt ********************************************************************************/
		if(c.getCmmnctnRqstOccrncePrdStrt() != null ) {

			if(c.getCmmnctnRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstOccrncePrdStrt()==null) {} else {
			communicationrequest.getOccurrencePeriod().setStart(c.getCmmnctnRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnRqstOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntData() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntHash() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntSz() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).getContentAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntRfrnc ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntRfrnc() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).setContent(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Payload_CntntStrgTyp ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntStrgTyp() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstPayloadCntntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getPayload().size() < i0+1) { communicationrequest.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getPayload().get(i0).setContent(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_Priority ********************************************************************************/
		if(c.getCmmnctnRqstPriority() != null ) {

			if(c.getCmmnctnRqstPriority().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstPriority()==null) {} else {
			communicationrequest.setPriority(new org.hl7.fhir.r4.model.CommunicationRequest.CommunicationPriorityEnumFactory().fromCode(c.getCmmnctnRqstPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getReasonCode().size() < i0+1) { communicationrequest.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { communicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getReasonCode().size() < i0+1) { communicationrequest.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { communicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getReasonCode().size() < i0+1) { communicationrequest.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { communicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getReasonCode().size() < i0+1) { communicationrequest.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { communicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getReasonCode().size() < i0+1) { communicationrequest.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { communicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communicationrequest.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmmnctnRqst_RsnCd_Txt ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getReasonCode().size() < i0+1) { communicationrequest.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_RsnRfrnc ********************************************************************************/
		if(c.getCmmnctnRqstRsnRfrnc() != null ) {

				for( String currListStrSplit : c.getCmmnctnRqstRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communicationrequest.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CmmnctnRqst_Recipient ********************************************************************************/
		if(c.getCmmnctnRqstRecipient() != null ) {

				for( String currListStrSplit : c.getCmmnctnRqstRecipient().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communicationrequest.addRecipient(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CmmnctnRqst_Replaces ********************************************************************************/
		if(c.getCmmnctnRqstReplaces() != null ) {

				for( String currListStrSplit : c.getCmmnctnRqstReplaces().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communicationrequest.addReplaces(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CmmnctnRqst_Rqster ********************************************************************************/
		if(c.getCmmnctnRqstRqster() != null ) {

			if(c.getCmmnctnRqstRqster().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstRqster()==null) {} else {
			communicationrequest.setRequester(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstRqster().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_Sender ********************************************************************************/
		if(c.getCmmnctnRqstSender() != null ) {

			if(c.getCmmnctnRqstSender().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstSender()==null) {} else {
			communicationrequest.setSender(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstSender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_Sts ********************************************************************************/
		if(c.getCmmnctnRqstSts() != null ) {

			if(c.getCmmnctnRqstSts().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstSts()==null) {} else {
			communicationrequest.setStatus(new org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestStatusEnumFactory().fromCode(c.getCmmnctnRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getStatusReason().getCoding().size() < i0+1) { communicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getStatusReason().getCoding().size() < i0+1) { communicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getStatusReason().getCoding().size() < i0+1) { communicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getStatusReason().getCoding().size() < i0+1) { communicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRqstStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communicationrequest.getStatusReason().getCoding().size() < i0+1) { communicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communicationrequest.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmmnctnRqst_StsRsn_Txt ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnTxt() != null ) {

			if(c.getCmmnctnRqstStsRsnTxt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstStsRsnTxt()==null) {} else {
			communicationrequest.getStatusReason().setText(c.getCmmnctnRqstStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmmnctnRqst_Sbjct ********************************************************************************/
		if(c.getCmmnctnRqstSbjct() != null ) {

			if(c.getCmmnctnRqstSbjct().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnRqstSbjct()==null) {} else {
			communicationrequest.setSubject(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return communicationrequest;
	}
}
