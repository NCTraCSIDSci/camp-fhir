package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageDefinition;
public class MessageDefinitionConversion 
{
	public org.hl7.fhir.r4.model.MessageDefinition MessageDefinitions(MessageDefinition m) throws ParseException
	{
		org.hl7.fhir.r4.model.MessageDefinition messagedefinition = new org.hl7.fhir.r4.model.MessageDefinition();

		/******************** id ********************************************************************************/
		messagedefinition.setId(m.getId());

		/******************** MsgDfn_AllowedRsps_Msg ********************************************************************************/
		if(m.getMsgDfnAllowedRspsMsg() != null ) {

			String[] arrayi0 = m.getMsgDfnAllowedRspsMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getAllowedResponse().size() < i0+1) { messagedefinition.addAllowedResponse(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getAllowedResponse().get(i0).setMessage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_AllowedRsps_Situation ********************************************************************************/
		if(m.getMsgDfnAllowedRspsSituation() != null ) {

			String[] arrayi0 = m.getMsgDfnAllowedRspsSituation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getAllowedResponse().size() < i0+1) { messagedefinition.addAllowedResponse(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getAllowedResponse().get(i0).setSituation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Base ********************************************************************************/
		if(m.getMsgDfnBase() != null ) {

			if(m.getMsgDfnBase().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnBase()==null) {} else {
			messagedefinition.setBase(m.getMsgDfnBase().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_Ctgry ********************************************************************************/
		if(m.getMsgDfnCtgry() != null ) {

			if(m.getMsgDfnCtgry().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnCtgry()==null) {} else {
			messagedefinition.setCategory(new org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategoryEnumFactory().fromCode(m.getMsgDfnCtgry().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_Cntct_Nm ********************************************************************************/
		if(m.getMsgDfnCntctNm() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsgDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				String[] arrayi1 = m.getMsgDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getContact().get(i0).getTelecom().size() < i1+1) { messagedefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsgDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				String[] arrayi1 = m.getMsgDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getContact().get(i0).getTelecom().size() < i1+1) { messagedefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(m.getMsgDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				String[] arrayi1 = m.getMsgDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getContact().get(i0).getTelecom().size() < i1+1) { messagedefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(m.getMsgDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				String[] arrayi1 = m.getMsgDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getContact().get(i0).getTelecom().size() < i1+1) { messagedefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(m.getMsgDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				String[] arrayi1 = m.getMsgDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getContact().get(i0).getTelecom().size() < i1+1) { messagedefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(m.getMsgDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = m.getMsgDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getContact().size() < i0+1) { messagedefinition.addContact(); }
				String[] arrayi1 = m.getMsgDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getContact().get(i0).getTelecom().size() < i1+1) { messagedefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Copyright ********************************************************************************/
		if(m.getMsgDfnCopyright() != null ) {

			if(m.getMsgDfnCopyright().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnCopyright()==null) {} else {
			messagedefinition.setCopyright(m.getMsgDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_Dt ********************************************************************************/
		if(m.getMsgDfnDt() != null ) {

			if(m.getMsgDfnDt().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnDt()==null) {} else {
			messagedefinition.setDate(m.getMsgDfnDt().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsgDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_Dscrptn ********************************************************************************/
		if(m.getMsgDfnDscrptn() != null ) {

			if(m.getMsgDfnDscrptn().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnDscrptn()==null) {} else {
			messagedefinition.setDescription(m.getMsgDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_EvntCdg_Cd ********************************************************************************/
		if(m.getMsgDfnEvntCdgCd() != null ) {

			if(m.getMsgDfnEvntCdgCd().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnEvntCdgCd()==null) {} else {
			messagedefinition.getEventCoding().setCode(m.getMsgDfnEvntCdgCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_EvntCdg_Dsply ********************************************************************************/
		if(m.getMsgDfnEvntCdgDsply() != null ) {

			if(m.getMsgDfnEvntCdgDsply().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnEvntCdgDsply()==null) {} else {
			messagedefinition.getEventCoding().setDisplay(m.getMsgDfnEvntCdgDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_EvntCdg_Sys ********************************************************************************/
		if(m.getMsgDfnEvntCdgSys() != null ) {

			if(m.getMsgDfnEvntCdgSys().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnEvntCdgSys()==null) {} else {
			messagedefinition.getEventCoding().setSystem(m.getMsgDfnEvntCdgSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_EvntCdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnEvntCdgUsrSltd() != null ) {

			if(m.getMsgDfnEvntCdgUsrSltd().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnEvntCdgUsrSltd()==null) {} else {
			messagedefinition.getEventCoding().setUserSelected(Boolean.parseBoolean(m.getMsgDfnEvntCdgUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_EvntCdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnEvntCdgVrsn() != null ) {

			if(m.getMsgDfnEvntCdgVrsn().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnEvntCdgVrsn()==null) {} else {
			messagedefinition.getEventCoding().setVersion(m.getMsgDfnEvntCdgVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_EvntUriTyp ********************************************************************************/
		if(m.getMsgDfnEvntUriTyp() != null ) {

			if(m.getMsgDfnEvntUriTyp().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnEvntUriTyp()==null) {} else {
			messagedefinition.setEvent(new org.hl7.fhir.r4.model.UriType(m.getMsgDfnEvntUriTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_Exprmtl ********************************************************************************/
		if(m.getMsgDfnExprmtl() != null ) {

			if(m.getMsgDfnExprmtl().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnExprmtl()==null) {} else {
			messagedefinition.setExperimental(Boolean.parseBoolean(m.getMsgDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_Focus_Cd ********************************************************************************/
		if(m.getMsgDfnFocusCd() != null ) {

			String[] arrayi0 = m.getMsgDfnFocusCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getFocus().size() < i0+1) { messagedefinition.addFocus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getFocus().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Focus_Mx ********************************************************************************/
		if(m.getMsgDfnFocusMx() != null ) {

			String[] arrayi0 = m.getMsgDfnFocusMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getFocus().size() < i0+1) { messagedefinition.addFocus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getFocus().get(i0).setMax(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Focus_Min ********************************************************************************/
		if(m.getMsgDfnFocusMin() != null ) {

			String[] arrayi0 = m.getMsgDfnFocusMin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getFocus().size() < i0+1) { messagedefinition.addFocus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getFocus().get(i0).setMin(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_Focus_Profile ********************************************************************************/
		if(m.getMsgDfnFocusProfile() != null ) {

			String[] arrayi0 = m.getMsgDfnFocusProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getFocus().size() < i0+1) { messagedefinition.addFocus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getFocus().get(i0).setProfile(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Graph ********************************************************************************/
		if(m.getMsgDfnGraph() != null ) {

				for( String currListStrSplit : m.getMsgDfnGraph().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			messagedefinition.addGraph(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MsgDfn_Id_Assigner ********************************************************************************/
		if(m.getMsgDfnIdAssigner() != null ) {

			String[] arrayi0 = m.getMsgDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_Id_Prd_End ********************************************************************************/
		if(m.getMsgDfnIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMsgDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_Id_Prd_Strt ********************************************************************************/
		if(m.getMsgDfnIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMsgDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_Id_Sys ********************************************************************************/
		if(m.getMsgDfnIdSys() != null ) {

			String[] arrayi0 = m.getMsgDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsgDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMsgDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				String[] arrayi1 = m.getMsgDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { messagedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsgDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMsgDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				String[] arrayi1 = m.getMsgDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { messagedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsgDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMsgDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				String[] arrayi1 = m.getMsgDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { messagedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsgDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				String[] arrayi1 = m.getMsgDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { messagedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsgDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				String[] arrayi1 = m.getMsgDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { messagedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Id_Typ_Txt ********************************************************************************/
		if(m.getMsgDfnIdTypTxt() != null ) {

			String[] arrayi0 = m.getMsgDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Id_Use ********************************************************************************/
		if(m.getMsgDfnIdUse() != null ) {

			String[] arrayi0 = m.getMsgDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_Id_Vl ********************************************************************************/
		if(m.getMsgDfnIdVl() != null ) {

			String[] arrayi0 = m.getMsgDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getIdentifier().size() < i0+1) { messagedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMsgDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getJurisdiction().size() < i0+1) { messagedefinition.addJurisdiction(); }
				String[] arrayi1 = m.getMsgDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { messagedefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMsgDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getJurisdiction().size() < i0+1) { messagedefinition.addJurisdiction(); }
				String[] arrayi1 = m.getMsgDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { messagedefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMsgDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getJurisdiction().size() < i0+1) { messagedefinition.addJurisdiction(); }
				String[] arrayi1 = m.getMsgDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { messagedefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsgDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getJurisdiction().size() < i0+1) { messagedefinition.addJurisdiction(); }
				String[] arrayi1 = m.getMsgDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { messagedefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsgDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getJurisdiction().size() < i0+1) { messagedefinition.addJurisdiction(); }
				String[] arrayi1 = m.getMsgDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { messagedefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_Jrsdctn_Txt ********************************************************************************/
		if(m.getMsgDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMsgDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getJurisdiction().size() < i0+1) { messagedefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_Nm ********************************************************************************/
		if(m.getMsgDfnNm() != null ) {

			if(m.getMsgDfnNm().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnNm()==null) {} else {
			messagedefinition.setName(m.getMsgDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_Parent ********************************************************************************/
		if(m.getMsgDfnParent() != null ) {

				for( String currListStrSplit : m.getMsgDfnParent().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			messagedefinition.addParent(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MsgDfn_Pblshr ********************************************************************************/
		if(m.getMsgDfnPblshr() != null ) {

			if(m.getMsgDfnPblshr().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnPblshr()==null) {} else {
			messagedefinition.setPublisher(m.getMsgDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_Prpse ********************************************************************************/
		if(m.getMsgDfnPrpse() != null ) {

			if(m.getMsgDfnPrpse().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnPrpse()==null) {} else {
			messagedefinition.setPurpose(m.getMsgDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_Replaces ********************************************************************************/
		if(m.getMsgDfnReplaces() != null ) {

				for( String currListStrSplit : m.getMsgDfnReplaces().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			messagedefinition.addReplaces(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MsgDfn_RspsRequired ********************************************************************************/
		if(m.getMsgDfnRspsRequired() != null ) {

			if(m.getMsgDfnRspsRequired().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnRspsRequired()==null) {} else {
			messagedefinition.setResponseRequired(new org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequestEnumFactory().fromCode(m.getMsgDfnRspsRequired().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_Sts ********************************************************************************/
		if(m.getMsgDfnSts() != null ) {

			if(m.getMsgDfnSts().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnSts()==null) {} else {
			messagedefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(m.getMsgDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgDfn_Ttl ********************************************************************************/
		if(m.getMsgDfnTtl() != null ) {

			if(m.getMsgDfnTtl().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnTtl()==null) {} else {
			messagedefinition.setTitle(m.getMsgDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_Url ********************************************************************************/
		if(m.getMsgDfnUrl() != null ) {

			if(m.getMsgDfnUrl().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnUrl()==null) {} else {
			messagedefinition.setUrl(m.getMsgDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				String[] arrayi1 = m.getMsgDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { messagedefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				String[] arrayi1 = m.getMsgDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { messagedefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				String[] arrayi1 = m.getMsgDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { messagedefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				String[] arrayi1 = m.getMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { messagedefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				String[] arrayi1 = m.getMsgDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { messagedefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {messagedefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MsgDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = m.getMsgDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messagedefinition.getUseContext().size() < i0+1) { messagedefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messagedefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgDfn_Vrsn ********************************************************************************/
		if(m.getMsgDfnVrsn() != null ) {

			if(m.getMsgDfnVrsn().replace("[","").replace("]","").equals("NULL") | m.getMsgDfnVrsn()==null) {} else {
			messagedefinition.setVersion(m.getMsgDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return messagedefinition;
	}
}
