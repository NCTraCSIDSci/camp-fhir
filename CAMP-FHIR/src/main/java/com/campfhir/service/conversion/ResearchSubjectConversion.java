package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchSubject;
public class ResearchSubjectConversion 
{
	public org.hl7.fhir.r4.model.ResearchSubject ResearchSubjects(ResearchSubject r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchSubject researchsubject = new org.hl7.fhir.r4.model.ResearchSubject();

		/******************** id ********************************************************************************/
		researchsubject.setId(r.getId());

		/******************** RsrchSbjct_ActualArm ********************************************************************************/
		if(r.getRsrchSbjctActualArm() != null ) {

			if(r.getRsrchSbjctActualArm().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctActualArm()==null) {} else {
			researchsubject.setActualArm(r.getRsrchSbjctActualArm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchSbjct_AssignedArm ********************************************************************************/
		if(r.getRsrchSbjctAssignedArm() != null ) {

			if(r.getRsrchSbjctAssignedArm().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctAssignedArm()==null) {} else {
			researchsubject.setAssignedArm(r.getRsrchSbjctAssignedArm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchSbjct_Cnsnt ********************************************************************************/
		if(r.getRsrchSbjctCnsnt() != null ) {

			if(r.getRsrchSbjctCnsnt().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctCnsnt()==null) {} else {
			researchsubject.setConsent(new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctCnsnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchSbjct_Id_Assigner ********************************************************************************/
		if(r.getRsrchSbjctIdAssigner() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchSbjct_Id_Prd_End ********************************************************************************/
		if(r.getRsrchSbjctIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchSbjct_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchSbjctIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchSbjct_Id_Sys ********************************************************************************/
		if(r.getRsrchSbjctIdSys() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				String[] arrayi1 = r.getRsrchSbjctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchsubject.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchsubject.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchsubject.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				String[] arrayi1 = r.getRsrchSbjctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchsubject.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchsubject.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchsubject.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				String[] arrayi1 = r.getRsrchSbjctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchsubject.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchsubject.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchsubject.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchSbjct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				String[] arrayi1 = r.getRsrchSbjctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchsubject.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchsubject.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchsubject.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				String[] arrayi1 = r.getRsrchSbjctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchsubject.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchsubject.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchsubject.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchSbjct_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchSbjctIdTypTxt() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchSbjct_Id_Use ********************************************************************************/
		if(r.getRsrchSbjctIdUse() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchSbjct_Id_Vl ********************************************************************************/
		if(r.getRsrchSbjctIdVl() != null ) {

			String[] arrayi0 = r.getRsrchSbjctIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchsubject.getIdentifier().size() < i0+1) { researchsubject.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchsubject.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchSbjct_Individual ********************************************************************************/
		if(r.getRsrchSbjctIndividual() != null ) {

			if(r.getRsrchSbjctIndividual().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctIndividual()==null) {} else {
			researchsubject.setIndividual(new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctIndividual().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchSbjct_Prd_End ********************************************************************************/
		if(r.getRsrchSbjctPrdEnd() != null ) {

			if(r.getRsrchSbjctPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctPrdEnd()==null) {} else {
			researchsubject.getPeriod().setEnd(r.getRsrchSbjctPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchSbjctPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchSbjct_Prd_Strt ********************************************************************************/
		if(r.getRsrchSbjctPrdStrt() != null ) {

			if(r.getRsrchSbjctPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctPrdStrt()==null) {} else {
			researchsubject.getPeriod().setStart(r.getRsrchSbjctPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchSbjctPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchSbjct_Sts ********************************************************************************/
		if(r.getRsrchSbjctSts() != null ) {

			if(r.getRsrchSbjctSts().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctSts()==null) {} else {
			researchsubject.setStatus(new org.hl7.fhir.r4.model.ResearchSubject.ResearchSubjectStatusEnumFactory().fromCode(r.getRsrchSbjctSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchSbjct_Stdy ********************************************************************************/
		if(r.getRsrchSbjctStdy() != null ) {

			if(r.getRsrchSbjctStdy().replace("[","").replace("]","").equals("NULL") | r.getRsrchSbjctStdy()==null) {} else {
			researchsubject.setStudy(new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctStdy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return researchsubject;
	}
}
