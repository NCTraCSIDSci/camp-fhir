package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EventDefinition;
public class EventDefinitionConversion 
{
	public org.hl7.fhir.r4.model.EventDefinition EventDefinitions(EventDefinition e) throws ParseException
	{
		org.hl7.fhir.r4.model.EventDefinition eventdefinition = new org.hl7.fhir.r4.model.EventDefinition();

		/******************** id ********************************************************************************/
		eventdefinition.setId(e.getId());

		/******************** EvntDfn_ApprovalDt ********************************************************************************/
		if(e.getEvntDfnApprovalDt() != null ) {

			if(e.getEvntDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnApprovalDt()==null) {} else {
			eventdefinition.setApprovalDate(e.getEvntDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvntDfnApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_Athr_Nm ********************************************************************************/
		if(e.getEvntDfnAthrNm() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				String[] arrayi1 = e.getEvntDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				String[] arrayi1 = e.getEvntDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnAthrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				String[] arrayi1 = e.getEvntDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Athr_Tlcm_Sys ********************************************************************************/
		if(e.getEvntDfnAthrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				String[] arrayi1 = e.getEvntDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Athr_Tlcm_Use ********************************************************************************/
		if(e.getEvntDfnAthrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				String[] arrayi1 = e.getEvntDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnAthrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvntDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getAuthor().size() < i0+1) { eventdefinition.addAuthor(); }
				String[] arrayi1 = e.getEvntDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Cntct_Nm ********************************************************************************/
		if(e.getEvntDfnCntctNm() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				String[] arrayi1 = e.getEvntDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getContact().get(i0).getTelecom().size() < i1+1) { eventdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				String[] arrayi1 = e.getEvntDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getContact().get(i0).getTelecom().size() < i1+1) { eventdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				String[] arrayi1 = e.getEvntDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getContact().get(i0).getTelecom().size() < i1+1) { eventdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(e.getEvntDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				String[] arrayi1 = e.getEvntDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getContact().get(i0).getTelecom().size() < i1+1) { eventdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(e.getEvntDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				String[] arrayi1 = e.getEvntDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getContact().get(i0).getTelecom().size() < i1+1) { eventdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = e.getEvntDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getContact().size() < i0+1) { eventdefinition.addContact(); }
				String[] arrayi1 = e.getEvntDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getContact().get(i0).getTelecom().size() < i1+1) { eventdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Copyright ********************************************************************************/
		if(e.getEvntDfnCopyright() != null ) {

			if(e.getEvntDfnCopyright().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnCopyright()==null) {} else {
			eventdefinition.setCopyright(e.getEvntDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Dt ********************************************************************************/
		if(e.getEvntDfnDt() != null ) {

			if(e.getEvntDfnDt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnDt()==null) {} else {
			eventdefinition.setDate(e.getEvntDfnDt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvntDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_Dscrptn ********************************************************************************/
		if(e.getEvntDfnDscrptn() != null ) {

			if(e.getEvntDfnDscrptn().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnDscrptn()==null) {} else {
			eventdefinition.setDescription(e.getEvntDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Editor_Nm ********************************************************************************/
		if(e.getEvntDfnEditorNm() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				String[] arrayi1 = e.getEvntDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				String[] arrayi1 = e.getEvntDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnEditorTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				String[] arrayi1 = e.getEvntDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Editor_Tlcm_Sys ********************************************************************************/
		if(e.getEvntDfnEditorTlcmSys() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				String[] arrayi1 = e.getEvntDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Editor_Tlcm_Use ********************************************************************************/
		if(e.getEvntDfnEditorTlcmUse() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				String[] arrayi1 = e.getEvntDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnEditorTlcmVl() != null ) {

			String[] arrayi0 = e.getEvntDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEditor().size() < i0+1) { eventdefinition.addEditor(); }
				String[] arrayi1 = e.getEvntDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_EfctivePrd_End ********************************************************************************/
		if(e.getEvntDfnEfctivePrdEnd() != null ) {

			if(e.getEvntDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnEfctivePrdEnd()==null) {} else {
			eventdefinition.getEffectivePeriod().setEnd(e.getEvntDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvntDfnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_EfctivePrd_Strt ********************************************************************************/
		if(e.getEvntDfnEfctivePrdStrt() != null ) {

			if(e.getEvntDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnEfctivePrdStrt()==null) {} else {
			eventdefinition.getEffectivePeriod().setStart(e.getEvntDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvntDfnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_Endsr_Nm ********************************************************************************/
		if(e.getEvntDfnEndsrNm() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				String[] arrayi1 = e.getEvntDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				String[] arrayi1 = e.getEvntDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				String[] arrayi1 = e.getEvntDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Endsr_Tlcm_Sys ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				String[] arrayi1 = e.getEvntDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Endsr_Tlcm_Use ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				String[] arrayi1 = e.getEvntDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnEndsrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvntDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getEndorser().size() < i0+1) { eventdefinition.addEndorser(); }
				String[] arrayi1 = e.getEvntDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { eventdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Exprmtl ********************************************************************************/
		if(e.getEvntDfnExprmtl() != null ) {

			if(e.getEvntDfnExprmtl().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnExprmtl()==null) {} else {
			eventdefinition.setExperimental(Boolean.parseBoolean(e.getEvntDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_Id_Assigner ********************************************************************************/
		if(e.getEvntDfnIdAssigner() != null ) {

			String[] arrayi0 = e.getEvntDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Id_Prd_End ********************************************************************************/
		if(e.getEvntDfnIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Id_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Id_Sys ********************************************************************************/
		if(e.getEvntDfnIdSys() != null ) {

			String[] arrayi0 = e.getEvntDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				String[] arrayi1 = e.getEvntDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { eventdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				String[] arrayi1 = e.getEvntDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { eventdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				String[] arrayi1 = e.getEvntDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { eventdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				String[] arrayi1 = e.getEvntDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { eventdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				String[] arrayi1 = e.getEvntDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { eventdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Id_Typ_Txt ********************************************************************************/
		if(e.getEvntDfnIdTypTxt() != null ) {

			String[] arrayi0 = e.getEvntDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Id_Use ********************************************************************************/
		if(e.getEvntDfnIdUse() != null ) {

			String[] arrayi0 = e.getEvntDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Id_Vl ********************************************************************************/
		if(e.getEvntDfnIdVl() != null ) {

			String[] arrayi0 = e.getEvntDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getIdentifier().size() < i0+1) { eventdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getJurisdiction().size() < i0+1) { eventdefinition.addJurisdiction(); }
				String[] arrayi1 = e.getEvntDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { eventdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getJurisdiction().size() < i0+1) { eventdefinition.addJurisdiction(); }
				String[] arrayi1 = e.getEvntDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { eventdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getJurisdiction().size() < i0+1) { eventdefinition.addJurisdiction(); }
				String[] arrayi1 = e.getEvntDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { eventdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getJurisdiction().size() < i0+1) { eventdefinition.addJurisdiction(); }
				String[] arrayi1 = e.getEvntDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { eventdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getJurisdiction().size() < i0+1) { eventdefinition.addJurisdiction(); }
				String[] arrayi1 = e.getEvntDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { eventdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Jrsdctn_Txt ********************************************************************************/
		if(e.getEvntDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = e.getEvntDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getJurisdiction().size() < i0+1) { eventdefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_LastReviewDt ********************************************************************************/
		if(e.getEvntDfnLastReviewDt() != null ) {

			if(e.getEvntDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnLastReviewDt()==null) {} else {
			eventdefinition.setLastReviewDate(e.getEvntDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvntDfnLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_Nm ********************************************************************************/
		if(e.getEvntDfnNm() != null ) {

			if(e.getEvntDfnNm().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnNm()==null) {} else {
			eventdefinition.setName(e.getEvntDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Pblshr ********************************************************************************/
		if(e.getEvntDfnPblshr() != null ) {

			if(e.getEvntDfnPblshr().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnPblshr()==null) {} else {
			eventdefinition.setPublisher(e.getEvntDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Prpse ********************************************************************************/
		if(e.getEvntDfnPrpse() != null ) {

			if(e.getEvntDfnPrpse().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnPrpse()==null) {} else {
			eventdefinition.setPurpose(e.getEvntDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_RltedArtfct_Citation ********************************************************************************/
		if(e.getEvntDfnRltedArtfctCitation() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocData() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocHash() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocSz() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEvntDfnRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEvntDfnRltedArtfctLbl() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEvntDfnRltedArtfctRsrc() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Typ ********************************************************************************/
		if(e.getEvntDfnRltedArtfctTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_RltedArtfct_Url ********************************************************************************/
		if(e.getEvntDfnRltedArtfctUrl() != null ) {

			String[] arrayi0 = e.getEvntDfnRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getRelatedArtifact().size() < i0+1) { eventdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Rviewr_Nm ********************************************************************************/
		if(e.getEvntDfnRviewrNm() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				String[] arrayi1 = e.getEvntDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { eventdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				String[] arrayi1 = e.getEvntDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { eventdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				String[] arrayi1 = e.getEvntDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { eventdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Rviewr_Tlcm_Sys ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				String[] arrayi1 = e.getEvntDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { eventdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Rviewr_Tlcm_Use ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				String[] arrayi1 = e.getEvntDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { eventdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEvntDfnRviewrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvntDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getReviewer().size() < i0+1) { eventdefinition.addReviewer(); }
				String[] arrayi1 = e.getEvntDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { eventdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Sts ********************************************************************************/
		if(e.getEvntDfnSts() != null ) {

			if(e.getEvntDfnSts().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnSts()==null) {} else {
			eventdefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(e.getEvntDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { eventdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { eventdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { eventdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { eventdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { eventdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvntDfnSbjctCdbleCncptTxt() != null ) {

			if(e.getEvntDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnSbjctCdbleCncptTxt()==null) {} else {
			eventdefinition.getSubjectCodeableConcept().setText(e.getEvntDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_SbjctRfrnc ********************************************************************************/
		if(e.getEvntDfnSbjctRfrnc() != null ) {

			if(e.getEvntDfnSbjctRfrnc().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnSbjctRfrnc()==null) {} else {
			eventdefinition.setSubject(new org.hl7.fhir.r4.model.Reference(e.getEvntDfnSbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvntDfn_Subtitle ********************************************************************************/
		if(e.getEvntDfnSubtitle() != null ) {

			if(e.getEvntDfnSubtitle().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnSubtitle()==null) {} else {
			eventdefinition.setSubtitle(e.getEvntDfnSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Ttl ********************************************************************************/
		if(e.getEvntDfnTtl() != null ) {

			if(e.getEvntDfnTtl().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnTtl()==null) {} else {
			eventdefinition.setTitle(e.getEvntDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnTopicCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTopic().size() < i0+1) { eventdefinition.addTopic(); }
				String[] arrayi1 = e.getEvntDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTopic().get(i0).getCoding().size() < i1+1) { eventdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnTopicCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTopic().size() < i0+1) { eventdefinition.addTopic(); }
				String[] arrayi1 = e.getEvntDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTopic().get(i0).getCoding().size() < i1+1) { eventdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnTopicCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTopic().size() < i0+1) { eventdefinition.addTopic(); }
				String[] arrayi1 = e.getEvntDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTopic().get(i0).getCoding().size() < i1+1) { eventdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTopic().size() < i0+1) { eventdefinition.addTopic(); }
				String[] arrayi1 = e.getEvntDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTopic().get(i0).getCoding().size() < i1+1) { eventdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnTopicCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTopic().size() < i0+1) { eventdefinition.addTopic(); }
				String[] arrayi1 = e.getEvntDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTopic().get(i0).getCoding().size() < i1+1) { eventdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Topic_Txt ********************************************************************************/
		if(e.getEvntDfnTopicTxt() != null ) {

			String[] arrayi0 = e.getEvntDfnTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTopic().size() < i0+1) { eventdefinition.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnDscrptn() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrCndtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getCondition().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnExprsn() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrCndtnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getCondition().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnLnguage() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrCndtnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getCondition().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_Cndtn_Nm ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnNm() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrCndtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getCondition().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(e.getEvntDfnTrgrCndtnRfrnc() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrCndtnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getCondition().setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvntDfnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvntDfnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvntDfnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvntDfnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrCdVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvntDfnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrPath() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrSrchParam() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(e.getEvntDfnTrgrDataCdFltrVlSt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getCodeFilter().get(i2).setValueSet(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrPath() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrSrchParam() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValueDuration().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValueDuration().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValueDuration().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValueDuration().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValuePeriod().setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(e.getEvntDfnTrgrDataDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getDateFilter().get(i2).getValuePeriod().setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_Lmt ********************************************************************************/
		if(e.getEvntDfnTrgrDataLmt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).setLimit(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_MustSupport ********************************************************************************/
		if(e.getEvntDfnTrgrDataMustSupport() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_Profile ********************************************************************************/
		if(e.getEvntDfnTrgrDataProfile() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_Sort_Direction ********************************************************************************/
		if(e.getEvntDfnTrgrDataSortDirection() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSort().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSort().get(i2).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_Sort_Path ********************************************************************************/
		if(e.getEvntDfnTrgrDataSortPath() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSort().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSort().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					String[] arrayi2 = e.getEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).getSubjectCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(e.getEvntDfnTrgrDataSbjctRfrnc() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Trgr_Data_Typ ********************************************************************************/
		if(e.getEvntDfnTrgrDataTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getData().size() < i1+1) { eventdefinition.getTrigger().get(i0).addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getData().get(i1).setType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_Nm ********************************************************************************/
		if(e.getEvntDfnTrgrNm() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(e.getEvntDfnTrgrTmgDtTimeTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).setTiming(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgDtTyp ********************************************************************************/
		if(e.getEvntDfnTrgrTmgDtTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).setTiming(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgRfrnc ********************************************************************************/
		if(e.getEvntDfnTrgrTmgRfrnc() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).setTiming(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				String[] arrayi1 = e.getEvntDfnTrgrTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgCdTxt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Evnt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgEvnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptCnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptCntMx() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptDuration() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptDurationMx() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptFrqncy() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptOff() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptPrd() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptPrdMx() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(e.getEvntDfnTrgrTmgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTmgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {eventdefinition.getTrigger().get(i0).getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_Trgr_Typ ********************************************************************************/
		if(e.getEvntDfnTrgrTyp() != null ) {

			String[] arrayi0 = e.getEvntDfnTrgrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getTrigger().size() < i0+1) { eventdefinition.addTrigger(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getTrigger().get(i0).setType(new org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Url ********************************************************************************/
		if(e.getEvntDfnUrl() != null ) {

			if(e.getEvntDfnUrl().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnUrl()==null) {} else {
			eventdefinition.setUrl(e.getEvntDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_Usg ********************************************************************************/
		if(e.getEvntDfnUsg() != null ) {

			if(e.getEvntDfnUsg().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnUsg()==null) {} else {
			eventdefinition.setUsage(e.getEvntDfnUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvntDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvntDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				String[] arrayi1 = e.getEvntDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { eventdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				String[] arrayi1 = e.getEvntDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { eventdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				String[] arrayi1 = e.getEvntDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { eventdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				String[] arrayi1 = e.getEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { eventdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				String[] arrayi1 = e.getEvntDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { eventdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {eventdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvntDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = e.getEvntDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(eventdefinition.getUseContext().size() < i0+1) { eventdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {eventdefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvntDfn_Vrsn ********************************************************************************/
		if(e.getEvntDfnVrsn() != null ) {

			if(e.getEvntDfnVrsn().replace("[","").replace("]","").equals("NULL") | e.getEvntDfnVrsn()==null) {} else {
			eventdefinition.setVersion(e.getEvntDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return eventdefinition;
	}
}
