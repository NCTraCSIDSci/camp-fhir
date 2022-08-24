package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DetectedIssue;
public class DetectedIssueConversion 
{
	public org.hl7.fhir.r4.model.DetectedIssue DetectedIssues(DetectedIssue d) throws ParseException
	{
		org.hl7.fhir.r4.model.DetectedIssue detectedissue = new org.hl7.fhir.r4.model.DetectedIssue();

		/******************** id ********************************************************************************/
		detectedissue.setId(d.getId());

		/******************** DetectedIssue_Athr ********************************************************************************/
		if(d.getDetectedIssueAthr() != null ) {

			if(d.getDetectedIssueAthr().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueAthr()==null) {} else {
			detectedissue.setAuthor(new org.hl7.fhir.r4.model.Reference(d.getDetectedIssueAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DetectedIssue_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueCdCdgCd() != null ) {

			String[] arrayi0 = d.getDetectedIssueCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getCode().getCoding().size() < i0+1) { detectedissue.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDetectedIssueCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getCode().getCoding().size() < i0+1) { detectedissue.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueCdCdgSys() != null ) {

			String[] arrayi0 = d.getDetectedIssueCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getCode().getCoding().size() < i0+1) { detectedissue.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDetectedIssueCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getCode().getCoding().size() < i0+1) { detectedissue.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDetectedIssueCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getCode().getCoding().size() < i0+1) { detectedissue.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Cd_Txt ********************************************************************************/
		if(d.getDetectedIssueCdTxt() != null ) {

			if(d.getDetectedIssueCdTxt().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueCdTxt()==null) {} else {
			detectedissue.getCode().setText(d.getDetectedIssueCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DetectedIssue_Dtl ********************************************************************************/
		if(d.getDetectedIssueDtl() != null ) {

			if(d.getDetectedIssueDtl().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueDtl()==null) {} else {
			detectedissue.setDetail(d.getDetectedIssueDtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgCd() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				String[] arrayi1 = d.getDetectedIssueEvdnceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getEvidence().get(i0).getCode().size() < i1+1) { detectedissue.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = d.getDetectedIssueEvdnceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { detectedissue.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				String[] arrayi1 = d.getDetectedIssueEvdnceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getEvidence().get(i0).getCode().size() < i1+1) { detectedissue.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = d.getDetectedIssueEvdnceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { detectedissue.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgSys() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				String[] arrayi1 = d.getDetectedIssueEvdnceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getEvidence().get(i0).getCode().size() < i1+1) { detectedissue.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = d.getDetectedIssueEvdnceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { detectedissue.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				String[] arrayi1 = d.getDetectedIssueEvdnceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getEvidence().get(i0).getCode().size() < i1+1) { detectedissue.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = d.getDetectedIssueEvdnceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { detectedissue.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				String[] arrayi1 = d.getDetectedIssueEvdnceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getEvidence().get(i0).getCode().size() < i1+1) { detectedissue.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = d.getDetectedIssueEvdnceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { detectedissue.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {detectedissue.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DetectedIssue_Evdnce_Cd_Txt ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdTxt() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				String[] arrayi1 = d.getDetectedIssueEvdnceCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getEvidence().get(i0).getCode().size() < i1+1) { detectedissue.getEvidence().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getEvidence().get(i0).getCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Evdnce_Dtl ********************************************************************************/
		if(d.getDetectedIssueEvdnceDtl() != null ) {

			String[] arrayi0 = d.getDetectedIssueEvdnceDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getEvidence().size() < i0+1) { detectedissue.addEvidence(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {detectedissue.getEvidence().get(i0).addDetail(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DetectedIssue_IdentifiedDtTimeTyp ********************************************************************************/
		if(d.getDetectedIssueIdentifiedDtTimeTyp() != null ) {

			if(d.getDetectedIssueIdentifiedDtTimeTyp().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueIdentifiedDtTimeTyp()==null) {} else {
			detectedissue.setIdentified(new org.hl7.fhir.r4.model.DateTimeType(d.getDetectedIssueIdentifiedDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DetectedIssue_IdentifiedPrd_End ********************************************************************************/
		if(d.getDetectedIssueIdentifiedPrdEnd() != null ) {

			if(d.getDetectedIssueIdentifiedPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueIdentifiedPrdEnd()==null) {} else {
			detectedissue.getIdentifiedPeriod().setEnd(d.getDetectedIssueIdentifiedPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueIdentifiedPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDetectedIssueIdentifiedPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DetectedIssue_IdentifiedPrd_Strt ********************************************************************************/
		if(d.getDetectedIssueIdentifiedPrdStrt() != null ) {

			if(d.getDetectedIssueIdentifiedPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueIdentifiedPrdStrt()==null) {} else {
			detectedissue.getIdentifiedPeriod().setStart(d.getDetectedIssueIdentifiedPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueIdentifiedPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDetectedIssueIdentifiedPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DetectedIssue_Id_Assigner ********************************************************************************/
		if(d.getDetectedIssueIdAssigner() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Id_Prd_End ********************************************************************************/
		if(d.getDetectedIssueIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Id_Prd_Strt ********************************************************************************/
		if(d.getDetectedIssueIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Id_Sys ********************************************************************************/
		if(d.getDetectedIssueIdSys() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				String[] arrayi1 = d.getDetectedIssueIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { detectedissue.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				String[] arrayi1 = d.getDetectedIssueIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { detectedissue.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				String[] arrayi1 = d.getDetectedIssueIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { detectedissue.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				String[] arrayi1 = d.getDetectedIssueIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { detectedissue.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DetectedIssue_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				String[] arrayi1 = d.getDetectedIssueIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { detectedissue.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Id_Typ_Txt ********************************************************************************/
		if(d.getDetectedIssueIdTypTxt() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Id_Use ********************************************************************************/
		if(d.getDetectedIssueIdUse() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Id_Vl ********************************************************************************/
		if(d.getDetectedIssueIdVl() != null ) {

			String[] arrayi0 = d.getDetectedIssueIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getIdentifier().size() < i0+1) { detectedissue.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Implicated ********************************************************************************/
		if(d.getDetectedIssueImplicated() != null ) {

				for( String currListStrSplit : d.getDetectedIssueImplicated().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			detectedissue.addImplicated(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgCd() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				String[] arrayi1 = d.getDetectedIssueMitigationActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getMitigation().get(i0).getAction().getCoding().size() < i1+1) { detectedissue.getMitigation().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getMitigation().get(i0).getAction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgDsply() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				String[] arrayi1 = d.getDetectedIssueMitigationActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getMitigation().get(i0).getAction().getCoding().size() < i1+1) { detectedissue.getMitigation().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getMitigation().get(i0).getAction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgSys() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				String[] arrayi1 = d.getDetectedIssueMitigationActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getMitigation().get(i0).getAction().getCoding().size() < i1+1) { detectedissue.getMitigation().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getMitigation().get(i0).getAction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				String[] arrayi1 = d.getDetectedIssueMitigationActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getMitigation().get(i0).getAction().getCoding().size() < i1+1) { detectedissue.getMitigation().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getMitigation().get(i0).getAction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgVrsn() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				String[] arrayi1 = d.getDetectedIssueMitigationActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(detectedissue.getMitigation().get(i0).getAction().getCoding().size() < i1+1) { detectedissue.getMitigation().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {detectedissue.getMitigation().get(i0).getAction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DetectedIssue_Mitigation_Actn_Txt ********************************************************************************/
		if(d.getDetectedIssueMitigationActnTxt() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationActnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getMitigation().get(i0).getAction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DetectedIssue_Mitigation_Athr ********************************************************************************/
		if(d.getDetectedIssueMitigationAthr() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationAthr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getMitigation().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Mitigation_Dt ********************************************************************************/
		if(d.getDetectedIssueMitigationDt() != null ) {

			String[] arrayi0 = d.getDetectedIssueMitigationDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(detectedissue.getMitigation().size() < i0+1) { detectedissue.addMitigation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {detectedissue.getMitigation().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DetectedIssue_Pnt ********************************************************************************/
		if(d.getDetectedIssuePnt() != null ) {

			if(d.getDetectedIssuePnt().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssuePnt()==null) {} else {
			detectedissue.setPatient(new org.hl7.fhir.r4.model.Reference(d.getDetectedIssuePnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DetectedIssue_Rfrnc ********************************************************************************/
		if(d.getDetectedIssueRfrnc() != null ) {

			if(d.getDetectedIssueRfrnc().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueRfrnc()==null) {} else {
			detectedissue.setReference(d.getDetectedIssueRfrnc().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DetectedIssue_Severity ********************************************************************************/
		if(d.getDetectedIssueSeverity() != null ) {

			if(d.getDetectedIssueSeverity().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueSeverity()==null) {} else {
			detectedissue.setSeverity(new org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueSeverityEnumFactory().fromCode(d.getDetectedIssueSeverity().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DetectedIssue_Sts ********************************************************************************/
		if(d.getDetectedIssueSts() != null ) {

			if(d.getDetectedIssueSts().replace("[","").replace("]","").equals("NULL") | d.getDetectedIssueSts()==null) {} else {
			detectedissue.setStatus(new org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueStatusEnumFactory().fromCode(d.getDetectedIssueSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return detectedissue;
	}
}
