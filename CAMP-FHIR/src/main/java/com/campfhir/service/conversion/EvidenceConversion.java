package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Evidence;
public class EvidenceConversion 
{
	public org.hl7.fhir.r4.model.Evidence Evidences(Evidence e) throws ParseException
	{
		org.hl7.fhir.r4.model.Evidence evidence = new org.hl7.fhir.r4.model.Evidence();

		/******************** id ********************************************************************************/
		evidence.setId(e.getId());

		/******************** Evdnce_ApprovalDt ********************************************************************************/
		if(e.getEvdnceApprovalDt() != null ) {

			if(e.getEvdnceApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceApprovalDt()==null) {} else {
			evidence.setApprovalDate(e.getEvdnceApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_Athr_Nm ********************************************************************************/
		if(e.getEvdnceAthrNm() != null ) {

			String[] arrayi0 = e.getEvdnceAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				String[] arrayi1 = e.getEvdnceAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getAuthor().get(i0).getTelecom().size() < i1+1) { evidence.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				String[] arrayi1 = e.getEvdnceAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getAuthor().get(i0).getTelecom().size() < i1+1) { evidence.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceAthrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				String[] arrayi1 = e.getEvdnceAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getAuthor().get(i0).getTelecom().size() < i1+1) { evidence.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Athr_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceAthrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				String[] arrayi1 = e.getEvdnceAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getAuthor().get(i0).getTelecom().size() < i1+1) { evidence.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Athr_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceAthrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				String[] arrayi1 = e.getEvdnceAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getAuthor().get(i0).getTelecom().size() < i1+1) { evidence.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceAthrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getAuthor().size() < i0+1) { evidence.addAuthor(); }
				String[] arrayi1 = e.getEvdnceAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getAuthor().get(i0).getTelecom().size() < i1+1) { evidence.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Cntct_Nm ********************************************************************************/
		if(e.getEvdnceCntctNm() != null ) {

			String[] arrayi0 = e.getEvdnceCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				String[] arrayi1 = e.getEvdnceCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getContact().get(i0).getTelecom().size() < i1+1) { evidence.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				String[] arrayi1 = e.getEvdnceCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getContact().get(i0).getTelecom().size() < i1+1) { evidence.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceCntctTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				String[] arrayi1 = e.getEvdnceCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getContact().get(i0).getTelecom().size() < i1+1) { evidence.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Cntct_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceCntctTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				String[] arrayi1 = e.getEvdnceCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getContact().get(i0).getTelecom().size() < i1+1) { evidence.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Cntct_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceCntctTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				String[] arrayi1 = e.getEvdnceCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getContact().get(i0).getTelecom().size() < i1+1) { evidence.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceCntctTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getContact().size() < i0+1) { evidence.addContact(); }
				String[] arrayi1 = e.getEvdnceCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getContact().get(i0).getTelecom().size() < i1+1) { evidence.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Copyright ********************************************************************************/
		if(e.getEvdnceCopyright() != null ) {

			if(e.getEvdnceCopyright().replace("[","").replace("]","").equals("NULL") | e.getEvdnceCopyright()==null) {} else {
			evidence.setCopyright(e.getEvdnceCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_Dt ********************************************************************************/
		if(e.getEvdnceDt() != null ) {

			if(e.getEvdnceDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceDt()==null) {} else {
			evidence.setDate(e.getEvdnceDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_Dscrptn ********************************************************************************/
		if(e.getEvdnceDscrptn() != null ) {

			if(e.getEvdnceDscrptn().replace("[","").replace("]","").equals("NULL") | e.getEvdnceDscrptn()==null) {} else {
			evidence.setDescription(e.getEvdnceDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_Editor_Nm ********************************************************************************/
		if(e.getEvdnceEditorNm() != null ) {

			String[] arrayi0 = e.getEvdnceEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				String[] arrayi1 = e.getEvdnceEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEditor().get(i0).getTelecom().size() < i1+1) { evidence.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				String[] arrayi1 = e.getEvdnceEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEditor().get(i0).getTelecom().size() < i1+1) { evidence.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceEditorTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				String[] arrayi1 = e.getEvdnceEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEditor().get(i0).getTelecom().size() < i1+1) { evidence.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Editor_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceEditorTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				String[] arrayi1 = e.getEvdnceEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEditor().get(i0).getTelecom().size() < i1+1) { evidence.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Editor_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceEditorTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				String[] arrayi1 = e.getEvdnceEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEditor().get(i0).getTelecom().size() < i1+1) { evidence.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceEditorTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEditor().size() < i0+1) { evidence.addEditor(); }
				String[] arrayi1 = e.getEvdnceEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEditor().get(i0).getTelecom().size() < i1+1) { evidence.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_EfctivePrd_End ********************************************************************************/
		if(e.getEvdnceEfctivePrdEnd() != null ) {

			if(e.getEvdnceEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEvdnceEfctivePrdEnd()==null) {} else {
			evidence.getEffectivePeriod().setEnd(e.getEvdnceEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEvdnceEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_EfctivePrd_Strt ********************************************************************************/
		if(e.getEvdnceEfctivePrdStrt() != null ) {

			if(e.getEvdnceEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceEfctivePrdStrt()==null) {} else {
			evidence.getEffectivePeriod().setStart(e.getEvdnceEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_Endsr_Nm ********************************************************************************/
		if(e.getEvdnceEndsrNm() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				String[] arrayi1 = e.getEvdnceEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEndorser().get(i0).getTelecom().size() < i1+1) { evidence.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				String[] arrayi1 = e.getEvdnceEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEndorser().get(i0).getTelecom().size() < i1+1) { evidence.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceEndsrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				String[] arrayi1 = e.getEvdnceEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEndorser().get(i0).getTelecom().size() < i1+1) { evidence.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Endsr_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceEndsrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				String[] arrayi1 = e.getEvdnceEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEndorser().get(i0).getTelecom().size() < i1+1) { evidence.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Endsr_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceEndsrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				String[] arrayi1 = e.getEvdnceEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEndorser().get(i0).getTelecom().size() < i1+1) { evidence.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceEndsrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getEndorser().size() < i0+1) { evidence.addEndorser(); }
				String[] arrayi1 = e.getEvdnceEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getEndorser().get(i0).getTelecom().size() < i1+1) { evidence.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_ExposureBackground ********************************************************************************/
		if(e.getEvdnceExposureBackground() != null ) {

			if(e.getEvdnceExposureBackground().replace("[","").replace("]","").equals("NULL") | e.getEvdnceExposureBackground()==null) {} else {
			evidence.setExposureBackground(new org.hl7.fhir.r4.model.Reference(e.getEvdnceExposureBackground().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_ExposureVariant ********************************************************************************/
		if(e.getEvdnceExposureVariant() != null ) {

				for( String currListStrSplit : e.getEvdnceExposureVariant().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			evidence.addExposureVariant(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Evdnce_Id_Assigner ********************************************************************************/
		if(e.getEvdnceIdAssigner() != null ) {

			String[] arrayi0 = e.getEvdnceIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Id_Prd_End ********************************************************************************/
		if(e.getEvdnceIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Id_Prd_Strt ********************************************************************************/
		if(e.getEvdnceIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Id_Sys ********************************************************************************/
		if(e.getEvdnceIdSys() != null ) {

			String[] arrayi0 = e.getEvdnceIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Id_Typ_Txt ********************************************************************************/
		if(e.getEvdnceIdTypTxt() != null ) {

			String[] arrayi0 = e.getEvdnceIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Id_Use ********************************************************************************/
		if(e.getEvdnceIdUse() != null ) {

			String[] arrayi0 = e.getEvdnceIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Id_Vl ********************************************************************************/
		if(e.getEvdnceIdVl() != null ) {

			String[] arrayi0 = e.getEvdnceIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getIdentifier().size() < i0+1) { evidence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getJurisdiction().size() < i0+1) { evidence.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidence.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getJurisdiction().size() < i0+1) { evidence.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidence.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getJurisdiction().size() < i0+1) { evidence.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidence.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getJurisdiction().size() < i0+1) { evidence.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidence.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getJurisdiction().size() < i0+1) { evidence.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidence.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Jrsdctn_Txt ********************************************************************************/
		if(e.getEvdnceJrsdctnTxt() != null ) {

			String[] arrayi0 = e.getEvdnceJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getJurisdiction().size() < i0+1) { evidence.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_LastReviewDt ********************************************************************************/
		if(e.getEvdnceLastReviewDt() != null ) {

			if(e.getEvdnceLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceLastReviewDt()==null) {} else {
			evidence.setLastReviewDate(e.getEvdnceLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_Nm ********************************************************************************/
		if(e.getEvdnceNm() != null ) {

			if(e.getEvdnceNm().replace("[","").replace("]","").equals("NULL") | e.getEvdnceNm()==null) {} else {
			evidence.setName(e.getEvdnceNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEvdnceNtAthrRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getNote().size() < i0+1) { evidence.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEvdnceNtAthrStrgTyp() != null ) {

			String[] arrayi0 = e.getEvdnceNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getNote().size() < i0+1) { evidence.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Nt_Txt ********************************************************************************/
		if(e.getEvdnceNtTxt() != null ) {

			String[] arrayi0 = e.getEvdnceNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getNote().size() < i0+1) { evidence.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Nt_Time ********************************************************************************/
		if(e.getEvdnceNtTime() != null ) {

			String[] arrayi0 = e.getEvdnceNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getNote().size() < i0+1) { evidence.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Outcome ********************************************************************************/
		if(e.getEvdnceOutcome() != null ) {

				for( String currListStrSplit : e.getEvdnceOutcome().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			evidence.addOutcome(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Evdnce_Pblshr ********************************************************************************/
		if(e.getEvdncePblshr() != null ) {

			if(e.getEvdncePblshr().replace("[","").replace("]","").equals("NULL") | e.getEvdncePblshr()==null) {} else {
			evidence.setPublisher(e.getEvdncePblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_RltedArtfct_Citation ********************************************************************************/
		if(e.getEvdnceRltedArtfctCitation() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEvdnceRltedArtfctDsply() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocData() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocHash() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocSz() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEvdnceRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEvdnceRltedArtfctLbl() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEvdnceRltedArtfctRsrc() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_RltedArtfct_Typ ********************************************************************************/
		if(e.getEvdnceRltedArtfctTyp() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_RltedArtfct_Url ********************************************************************************/
		if(e.getEvdnceRltedArtfctUrl() != null ) {

			String[] arrayi0 = e.getEvdnceRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getRelatedArtifact().size() < i0+1) { evidence.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Rviewr_Nm ********************************************************************************/
		if(e.getEvdnceRviewrNm() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				String[] arrayi1 = e.getEvdnceRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getReviewer().get(i0).getTelecom().size() < i1+1) { evidence.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				String[] arrayi1 = e.getEvdnceRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getReviewer().get(i0).getTelecom().size() < i1+1) { evidence.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceRviewrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				String[] arrayi1 = e.getEvdnceRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getReviewer().get(i0).getTelecom().size() < i1+1) { evidence.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Rviewr_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceRviewrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				String[] arrayi1 = e.getEvdnceRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getReviewer().get(i0).getTelecom().size() < i1+1) { evidence.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Rviewr_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceRviewrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				String[] arrayi1 = e.getEvdnceRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getReviewer().get(i0).getTelecom().size() < i1+1) { evidence.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceRviewrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getReviewer().size() < i0+1) { evidence.addReviewer(); }
				String[] arrayi1 = e.getEvdnceRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getReviewer().get(i0).getTelecom().size() < i1+1) { evidence.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_ShortTtl ********************************************************************************/
		if(e.getEvdnceShortTtl() != null ) {

			if(e.getEvdnceShortTtl().replace("[","").replace("]","").equals("NULL") | e.getEvdnceShortTtl()==null) {} else {
			evidence.setShortTitle(e.getEvdnceShortTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_Sts ********************************************************************************/
		if(e.getEvdnceSts() != null ) {

			if(e.getEvdnceSts().replace("[","").replace("]","").equals("NULL") | e.getEvdnceSts()==null) {} else {
			evidence.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(e.getEvdnceSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Evdnce_Subtitle ********************************************************************************/
		if(e.getEvdnceSubtitle() != null ) {

			if(e.getEvdnceSubtitle().replace("[","").replace("]","").equals("NULL") | e.getEvdnceSubtitle()==null) {} else {
			evidence.setSubtitle(e.getEvdnceSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_Ttl ********************************************************************************/
		if(e.getEvdnceTtl() != null ) {

			if(e.getEvdnceTtl().replace("[","").replace("]","").equals("NULL") | e.getEvdnceTtl()==null) {} else {
			evidence.setTitle(e.getEvdnceTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceTopicCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getTopic().size() < i0+1) { evidence.addTopic(); }
				String[] arrayi1 = e.getEvdnceTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getTopic().get(i0).getCoding().size() < i1+1) { evidence.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceTopicCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getTopic().size() < i0+1) { evidence.addTopic(); }
				String[] arrayi1 = e.getEvdnceTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getTopic().get(i0).getCoding().size() < i1+1) { evidence.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceTopicCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getTopic().size() < i0+1) { evidence.addTopic(); }
				String[] arrayi1 = e.getEvdnceTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getTopic().get(i0).getCoding().size() < i1+1) { evidence.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getTopic().size() < i0+1) { evidence.addTopic(); }
				String[] arrayi1 = e.getEvdnceTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getTopic().get(i0).getCoding().size() < i1+1) { evidence.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceTopicCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getTopic().size() < i0+1) { evidence.addTopic(); }
				String[] arrayi1 = e.getEvdnceTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getTopic().get(i0).getCoding().size() < i1+1) { evidence.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_Topic_Txt ********************************************************************************/
		if(e.getEvdnceTopicTxt() != null ) {

			String[] arrayi0 = e.getEvdnceTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getTopic().size() < i0+1) { evidence.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_Url ********************************************************************************/
		if(e.getEvdnceUrl() != null ) {

			if(e.getEvdnceUrl().replace("[","").replace("]","").equals("NULL") | e.getEvdnceUrl()==null) {} else {
			evidence.setUrl(e.getEvdnceUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Evdnce_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtCdCd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceUseCntxtCdDsply() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtCdSys() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				String[] arrayi1 = e.getEvdnceUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidence.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				String[] arrayi1 = e.getEvdnceUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidence.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				String[] arrayi1 = e.getEvdnceUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidence.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				String[] arrayi1 = e.getEvdnceUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidence.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				String[] arrayi1 = e.getEvdnceUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidence.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidence.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvdnceUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Evdnce_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvdnceUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidence.getUseContext().size() < i0+1) { evidence.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidence.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Evdnce_Vrsn ********************************************************************************/
		if(e.getEvdnceVrsn() != null ) {

			if(e.getEvdnceVrsn().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrsn()==null) {} else {
			evidence.setVersion(e.getEvdnceVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return evidence;
	}
}
