package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchDefinition;
public class ResearchDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ResearchDefinition ResearchDefinitions(ResearchDefinition r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchDefinition researchdefinition = new org.hl7.fhir.r4.model.ResearchDefinition();

		/******************** id ********************************************************************************/
		researchdefinition.setId(r.getId());

		/******************** RsrchDfn_ApprovalDt ********************************************************************************/
		if(r.getRsrchDfnApprovalDt() != null ) {

			if(r.getRsrchDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnApprovalDt()==null) {} else {
			researchdefinition.setApprovalDate(r.getRsrchDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchDfnApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Athr_Nm ********************************************************************************/
		if(r.getRsrchDfnAthrNm() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Athr_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Athr_Tlcm_Use ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnAthrTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getAuthor().size() < i0+1) { researchdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Comment ********************************************************************************/
		if(r.getRsrchDfnComment() != null ) {

				for( String currListStrSplit : r.getRsrchDfnComment().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchdefinition.addComment(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** RsrchDfn_Cntct_Nm ********************************************************************************/
		if(r.getRsrchDfnCntctNm() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getContact().size() < i0+1) { researchdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Copyright ********************************************************************************/
		if(r.getRsrchDfnCopyright() != null ) {

			if(r.getRsrchDfnCopyright().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnCopyright()==null) {} else {
			researchdefinition.setCopyright(r.getRsrchDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Dt ********************************************************************************/
		if(r.getRsrchDfnDt() != null ) {

			if(r.getRsrchDfnDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnDt()==null) {} else {
			researchdefinition.setDate(r.getRsrchDfnDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Dscrptn ********************************************************************************/
		if(r.getRsrchDfnDscrptn() != null ) {

			if(r.getRsrchDfnDscrptn().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnDscrptn()==null) {} else {
			researchdefinition.setDescription(r.getRsrchDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Editor_Nm ********************************************************************************/
		if(r.getRsrchDfnEditorNm() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Editor_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Editor_Tlcm_Use ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnEditorTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEditor().size() < i0+1) { researchdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_EfctivePrd_End ********************************************************************************/
		if(r.getRsrchDfnEfctivePrdEnd() != null ) {

			if(r.getRsrchDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnEfctivePrdEnd()==null) {} else {
			researchdefinition.getEffectivePeriod().setEnd(r.getRsrchDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchDfnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_EfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchDfnEfctivePrdStrt() != null ) {

			if(r.getRsrchDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnEfctivePrdStrt()==null) {} else {
			researchdefinition.getEffectivePeriod().setStart(r.getRsrchDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchDfnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Endsr_Nm ********************************************************************************/
		if(r.getRsrchDfnEndsrNm() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Endsr_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Endsr_Tlcm_Use ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnEndsrTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getEndorser().size() < i0+1) { researchdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Exprmtl ********************************************************************************/
		if(r.getRsrchDfnExprmtl() != null ) {

			if(r.getRsrchDfnExprmtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnExprmtl()==null) {} else {
			researchdefinition.setExperimental(Boolean.parseBoolean(r.getRsrchDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Exposure ********************************************************************************/
		if(r.getRsrchDfnExposure() != null ) {

			if(r.getRsrchDfnExposure().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnExposure()==null) {} else {
			researchdefinition.setExposure(new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnExposure().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_ExposureAlternative ********************************************************************************/
		if(r.getRsrchDfnExposureAlternative() != null ) {

			if(r.getRsrchDfnExposureAlternative().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnExposureAlternative()==null) {} else {
			researchdefinition.setExposureAlternative(new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnExposureAlternative().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Id_Assigner ********************************************************************************/
		if(r.getRsrchDfnIdAssigner() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_Id_Prd_End ********************************************************************************/
		if(r.getRsrchDfnIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_Id_Sys ********************************************************************************/
		if(r.getRsrchDfnIdSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchDfnIdTypTxt() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Id_Use ********************************************************************************/
		if(r.getRsrchDfnIdUse() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_Id_Vl ********************************************************************************/
		if(r.getRsrchDfnIdVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getIdentifier().size() < i0+1) { researchdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getJurisdiction().size() < i0+1) { researchdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getJurisdiction().size() < i0+1) { researchdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getJurisdiction().size() < i0+1) { researchdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getJurisdiction().size() < i0+1) { researchdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getJurisdiction().size() < i0+1) { researchdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Jrsdctn_Txt ********************************************************************************/
		if(r.getRsrchDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = r.getRsrchDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getJurisdiction().size() < i0+1) { researchdefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_LastReviewDt ********************************************************************************/
		if(r.getRsrchDfnLastReviewDt() != null ) {

			if(r.getRsrchDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnLastReviewDt()==null) {} else {
			researchdefinition.setLastReviewDate(r.getRsrchDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchDfnLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Library ********************************************************************************/
		if(r.getRsrchDfnLibrary() != null ) {

				for( String currListStrSplit : r.getRsrchDfnLibrary().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchdefinition.addLibrary(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** RsrchDfn_Nm ********************************************************************************/
		if(r.getRsrchDfnNm() != null ) {

			if(r.getRsrchDfnNm().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnNm()==null) {} else {
			researchdefinition.setName(r.getRsrchDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Outcome ********************************************************************************/
		if(r.getRsrchDfnOutcome() != null ) {

			if(r.getRsrchDfnOutcome().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnOutcome()==null) {} else {
			researchdefinition.setOutcome(new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Popln ********************************************************************************/
		if(r.getRsrchDfnPopln() != null ) {

			if(r.getRsrchDfnPopln().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnPopln()==null) {} else {
			researchdefinition.setPopulation(new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnPopln().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Pblshr ********************************************************************************/
		if(r.getRsrchDfnPblshr() != null ) {

			if(r.getRsrchDfnPblshr().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnPblshr()==null) {} else {
			researchdefinition.setPublisher(r.getRsrchDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Prpse ********************************************************************************/
		if(r.getRsrchDfnPrpse() != null ) {

			if(r.getRsrchDfnPrpse().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnPrpse()==null) {} else {
			researchdefinition.setPurpose(r.getRsrchDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_RltedArtfct_Citation ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctCitation() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocData() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocHash() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocSz() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctLbl() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctRsrc() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Typ ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctTyp() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_RltedArtfct_Url ********************************************************************************/
		if(r.getRsrchDfnRltedArtfctUrl() != null ) {

			String[] arrayi0 = r.getRsrchDfnRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getRelatedArtifact().size() < i0+1) { researchdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Rviewr_Nm ********************************************************************************/
		if(r.getRsrchDfnRviewrNm() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Rviewr_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Rviewr_Tlcm_Use ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchDfnRviewrTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getReviewer().size() < i0+1) { researchdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_ShortTtl ********************************************************************************/
		if(r.getRsrchDfnShortTtl() != null ) {

			if(r.getRsrchDfnShortTtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnShortTtl()==null) {} else {
			researchdefinition.setShortTitle(r.getRsrchDfnShortTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Sts ********************************************************************************/
		if(r.getRsrchDfnSts() != null ) {

			if(r.getRsrchDfnSts().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnSts()==null) {} else {
			researchdefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(r.getRsrchDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchDfnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchDfnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchDfnSbjctCdbleCncptTxt() != null ) {

			if(r.getRsrchDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnSbjctCdbleCncptTxt()==null) {} else {
			researchdefinition.getSubjectCodeableConcept().setText(r.getRsrchDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_SbjctRfrnc ********************************************************************************/
		if(r.getRsrchDfnSbjctRfrnc() != null ) {

			if(r.getRsrchDfnSbjctRfrnc().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnSbjctRfrnc()==null) {} else {
			researchdefinition.setSubject(new org.hl7.fhir.r4.model.Reference(r.getRsrchDfnSbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchDfn_Subtitle ********************************************************************************/
		if(r.getRsrchDfnSubtitle() != null ) {

			if(r.getRsrchDfnSubtitle().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnSubtitle()==null) {} else {
			researchdefinition.setSubtitle(r.getRsrchDfnSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Ttl ********************************************************************************/
		if(r.getRsrchDfnTtl() != null ) {

			if(r.getRsrchDfnTtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnTtl()==null) {} else {
			researchdefinition.setTitle(r.getRsrchDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Topic_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnTopicCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getTopic().size() < i0+1) { researchdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnTopicCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getTopic().size() < i0+1) { researchdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Topic_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnTopicCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getTopic().size() < i0+1) { researchdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getTopic().size() < i0+1) { researchdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnTopicCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getTopic().size() < i0+1) { researchdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_Topic_Txt ********************************************************************************/
		if(r.getRsrchDfnTopicTxt() != null ) {

			String[] arrayi0 = r.getRsrchDfnTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getTopic().size() < i0+1) { researchdefinition.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_Url ********************************************************************************/
		if(r.getRsrchDfnUrl() != null ) {

			if(r.getRsrchDfnUrl().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnUrl()==null) {} else {
			researchdefinition.setUrl(r.getRsrchDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_Usg ********************************************************************************/
		if(r.getRsrchDfnUsg() != null ) {

			if(r.getRsrchDfnUsg().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnUsg()==null) {} else {
			researchdefinition.setUsage(r.getRsrchDfnUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(r.getRsrchDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = r.getRsrchDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchdefinition.getUseContext().size() < i0+1) { researchdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchdefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchDfn_Vrsn ********************************************************************************/
		if(r.getRsrchDfnVrsn() != null ) {

			if(r.getRsrchDfnVrsn().replace("[","").replace("]","").equals("NULL") | r.getRsrchDfnVrsn()==null) {} else {
			researchdefinition.setVersion(r.getRsrchDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return researchdefinition;
	}
}
