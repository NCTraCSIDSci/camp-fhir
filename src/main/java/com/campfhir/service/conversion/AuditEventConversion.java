package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AuditEvent;
public class AuditEventConversion 
{
	public org.hl7.fhir.r4.model.AuditEvent AuditEvents(AuditEvent a) throws ParseException
	{
		org.hl7.fhir.r4.model.AuditEvent auditevent = new org.hl7.fhir.r4.model.AuditEvent();

		/******************** id ********************************************************************************/
		auditevent.setId(a.getId());

		/******************** AuditEvnt_Actn ********************************************************************************/
		if(a.getAuditEvntActn() != null ) {

			if(a.getAuditEvntActn().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntActn()==null) {} else {
			auditevent.setAction(new org.hl7.fhir.r4.model.AuditEvent.AuditEventActionEnumFactory().fromCode(a.getAuditEvntActn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_Agnt_AltId ********************************************************************************/
		if(a.getAuditEvntAgntAltId() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntAltId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).setAltId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Lctn ********************************************************************************/
		if(a.getAuditEvntAgntLctn() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntLctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Agnt_Media_Cd ********************************************************************************/
		if(a.getAuditEvntAgntMediaCd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntMediaCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getMedia().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Media_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntMediaDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntMediaDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getMedia().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Media_Sys ********************************************************************************/
		if(a.getAuditEvntAgntMediaSys() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntMediaSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getMedia().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Media_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntMediaUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntMediaUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getMedia().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Agnt_Media_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntMediaVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntMediaVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getMedia().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Nm ********************************************************************************/
		if(a.getAuditEvntAgntNm() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Network_Addr ********************************************************************************/
		if(a.getAuditEvntAgntNetworkAddr() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntNetworkAddr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getNetwork().setAddress(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Network_Typ ********************************************************************************/
		if(a.getAuditEvntAgntNetworkTyp() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntNetworkTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getNetwork().setType(new org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Agnt_Policy ********************************************************************************/
		if(a.getAuditEvntAgntPolicy() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPolicy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {auditevent.getAgent().get(i0).addPolicy(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgCd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPrpseOfUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntPrpseOfUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getPurposeOfUse().size() < i1+1) { auditevent.getAgent().get(i0).addPurposeOfUse(); }
					String[] arrayi2 = a.getAuditEvntAgntPrpseOfUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPrpseOfUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntPrpseOfUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getPurposeOfUse().size() < i1+1) { auditevent.getAgent().get(i0).addPurposeOfUse(); }
					String[] arrayi2 = a.getAuditEvntAgntPrpseOfUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgSys() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPrpseOfUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntPrpseOfUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getPurposeOfUse().size() < i1+1) { auditevent.getAgent().get(i0).addPurposeOfUse(); }
					String[] arrayi2 = a.getAuditEvntAgntPrpseOfUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPrpseOfUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntPrpseOfUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getPurposeOfUse().size() < i1+1) { auditevent.getAgent().get(i0).addPurposeOfUse(); }
					String[] arrayi2 = a.getAuditEvntAgntPrpseOfUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPrpseOfUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntPrpseOfUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getPurposeOfUse().size() < i1+1) { auditevent.getAgent().get(i0).addPurposeOfUse(); }
					String[] arrayi2 = a.getAuditEvntAgntPrpseOfUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Txt ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseTxt() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntPrpseOfUseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntPrpseOfUseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getPurposeOfUse().size() < i1+1) { auditevent.getAgent().get(i0).addPurposeOfUse(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getPurposeOfUse().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Rqstor ********************************************************************************/
		if(a.getAuditEvntAgntRqstor() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRqstor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).setRequestor(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgCd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getRole().size() < i1+1) { auditevent.getAgent().get(i0).addRole(); }
					String[] arrayi2 = a.getAuditEvntAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getRole().size() < i1+1) { auditevent.getAgent().get(i0).addRole(); }
					String[] arrayi2 = a.getAuditEvntAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgSys() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getRole().size() < i1+1) { auditevent.getAgent().get(i0).addRole(); }
					String[] arrayi2 = a.getAuditEvntAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getRole().size() < i1+1) { auditevent.getAgent().get(i0).addRole(); }
					String[] arrayi2 = a.getAuditEvntAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getRole().size() < i1+1) { auditevent.getAgent().get(i0).addRole(); }
					String[] arrayi2 = a.getAuditEvntAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(auditevent.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { auditevent.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {auditevent.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AuditEvnt_Agnt_Role_Txt ********************************************************************************/
		if(a.getAuditEvntAgntRoleTxt() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getRole().size() < i1+1) { auditevent.getAgent().get(i0).addRole(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getRole().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgCd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getType().getCoding().size() < i1+1) { auditevent.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getType().getCoding().size() < i1+1) { auditevent.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgSys() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getType().getCoding().size() < i1+1) { auditevent.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getType().getCoding().size() < i1+1) { auditevent.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				String[] arrayi1 = a.getAuditEvntAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getAgent().get(i0).getType().getCoding().size() < i1+1) { auditevent.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getAgent().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Agnt_Typ_Txt ********************************************************************************/
		if(a.getAuditEvntAgntTypTxt() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Agnt_Who ********************************************************************************/
		if(a.getAuditEvntAgntWho() != null ) {

			String[] arrayi0 = a.getAuditEvntAgntWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getAgent().size() < i0+1) { auditevent.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getAgent().get(i0).setWho(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Entity_Dscrptn ********************************************************************************/
		if(a.getAuditEvntEntityDscrptn() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Dtl_Typ ********************************************************************************/
		if(a.getAuditEvntEntityDtlTyp() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityDtlTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntityDtlTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getDetail().size() < i1+1) { auditevent.getEntity().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getDetail().get(i1).setType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Entity_Dtl_VlBase64BinaryTyp ********************************************************************************/
		if(a.getAuditEvntEntityDtlVlBase64binaryTyp() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityDtlVlBase64binaryTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntityDtlVlBase64binaryTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getDetail().size() < i1+1) { auditevent.getEntity().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getDetail().get(i1).setValue(new org.hl7.fhir.r4.model.Base64BinaryType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AuditEvnt_Entity_Dtl_VlStrgTyp ********************************************************************************/
		if(a.getAuditEvntEntityDtlVlStrgTyp() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityDtlVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntityDtlVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getDetail().size() < i1+1) { auditevent.getEntity().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getDetail().get(i1).setValue(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AuditEvnt_Entity_Lifecycle_Cd ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleCd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityLifecycleCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getLifecycle().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Lifecycle_Dsply ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityLifecycleDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getLifecycle().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Lifecycle_Sys ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleSys() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityLifecycleSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getLifecycle().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Lifecycle_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityLifecycleUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getLifecycle().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Entity_Lifecycle_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityLifecycleVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getLifecycle().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Nm ********************************************************************************/
		if(a.getAuditEvntEntityNm() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Query ********************************************************************************/
		if(a.getAuditEvntEntityQuery() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityQuery().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).setQuery(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** AuditEvnt_Entity_Role_Cd ********************************************************************************/
		if(a.getAuditEvntEntityRoleCd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityRoleCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getRole().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Role_Dsply ********************************************************************************/
		if(a.getAuditEvntEntityRoleDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityRoleDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getRole().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Role_Sys ********************************************************************************/
		if(a.getAuditEvntEntityRoleSys() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityRoleSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getRole().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Role_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntityRoleUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityRoleUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getRole().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Entity_Role_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntityRoleVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityRoleVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getRole().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_SecurityLbl_Cd ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblCd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntitySecurityLblCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntitySecurityLblCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getSecurityLabel().size() < i1+1) { auditevent.getEntity().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getSecurityLabel().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Entity_SecurityLbl_Dsply ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntEntitySecurityLblDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntitySecurityLblDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getSecurityLabel().size() < i1+1) { auditevent.getEntity().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getSecurityLabel().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Entity_SecurityLbl_Sys ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblSys() != null ) {

			String[] arrayi0 = a.getAuditEvntEntitySecurityLblSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntitySecurityLblSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getSecurityLabel().size() < i1+1) { auditevent.getEntity().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getSecurityLabel().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Entity_SecurityLbl_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntitySecurityLblUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntitySecurityLblUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getSecurityLabel().size() < i1+1) { auditevent.getEntity().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getSecurityLabel().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AuditEvnt_Entity_SecurityLbl_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntEntitySecurityLblVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				String[] arrayi1 = a.getAuditEvntEntitySecurityLblVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getEntity().get(i0).getSecurityLabel().size() < i1+1) { auditevent.getEntity().get(i0).addSecurityLabel(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getEntity().get(i0).getSecurityLabel().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_Entity_Typ_Cd ********************************************************************************/
		if(a.getAuditEvntEntityTypCd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getType().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Typ_Dsply ********************************************************************************/
		if(a.getAuditEvntEntityTypDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getType().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Typ_Sys ********************************************************************************/
		if(a.getAuditEvntEntityTypSys() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getType().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_Typ_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntityTypUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getType().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Entity_Typ_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntityTypVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).getType().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Entity_What ********************************************************************************/
		if(a.getAuditEvntEntityWhat() != null ) {

			String[] arrayi0 = a.getAuditEvntEntityWhat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getEntity().size() < i0+1) { auditevent.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getEntity().get(i0).setWhat(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Outcome ********************************************************************************/
		if(a.getAuditEvntOutcome() != null ) {

			if(a.getAuditEvntOutcome().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntOutcome()==null) {} else {
			auditevent.setOutcome(new org.hl7.fhir.r4.model.AuditEvent.AuditEventOutcomeEnumFactory().fromCode(a.getAuditEvntOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_OutcomeDesc ********************************************************************************/
		if(a.getAuditEvntOutcomeDesc() != null ) {

			if(a.getAuditEvntOutcomeDesc().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntOutcomeDesc()==null) {} else {
			auditevent.setOutcomeDesc(a.getAuditEvntOutcomeDesc().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AuditEvnt_Prd_End ********************************************************************************/
		if(a.getAuditEvntPrdEnd() != null ) {

			if(a.getAuditEvntPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntPrdEnd()==null) {} else {
			auditevent.getPeriod().setEnd(a.getAuditEvntPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAuditEvntPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_Prd_Strt ********************************************************************************/
		if(a.getAuditEvntPrdStrt() != null ) {

			if(a.getAuditEvntPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntPrdStrt()==null) {} else {
			auditevent.getPeriod().setStart(a.getAuditEvntPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAuditEvntPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgCd() != null ) {

			String[] arrayi0 = a.getAuditEvntPrpseOfEvntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getPurposeOfEvent().size() < i0+1) { auditevent.addPurposeOfEvent(); }
				String[] arrayi1 = a.getAuditEvntPrpseOfEvntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getPurposeOfEvent().get(i0).getCoding().size() < i1+1) { auditevent.getPurposeOfEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getPurposeOfEvent().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntPrpseOfEvntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getPurposeOfEvent().size() < i0+1) { auditevent.addPurposeOfEvent(); }
				String[] arrayi1 = a.getAuditEvntPrpseOfEvntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getPurposeOfEvent().get(i0).getCoding().size() < i1+1) { auditevent.getPurposeOfEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getPurposeOfEvent().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgSys() != null ) {

			String[] arrayi0 = a.getAuditEvntPrpseOfEvntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getPurposeOfEvent().size() < i0+1) { auditevent.addPurposeOfEvent(); }
				String[] arrayi1 = a.getAuditEvntPrpseOfEvntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getPurposeOfEvent().get(i0).getCoding().size() < i1+1) { auditevent.getPurposeOfEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getPurposeOfEvent().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntPrpseOfEvntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getPurposeOfEvent().size() < i0+1) { auditevent.addPurposeOfEvent(); }
				String[] arrayi1 = a.getAuditEvntPrpseOfEvntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getPurposeOfEvent().get(i0).getCoding().size() < i1+1) { auditevent.getPurposeOfEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getPurposeOfEvent().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntPrpseOfEvntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getPurposeOfEvent().size() < i0+1) { auditevent.addPurposeOfEvent(); }
				String[] arrayi1 = a.getAuditEvntPrpseOfEvntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(auditevent.getPurposeOfEvent().get(i0).getCoding().size() < i1+1) { auditevent.getPurposeOfEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {auditevent.getPurposeOfEvent().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AuditEvnt_PrpseOfEvnt_Txt ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntTxt() != null ) {

			String[] arrayi0 = a.getAuditEvntPrpseOfEvntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getPurposeOfEvent().size() < i0+1) { auditevent.addPurposeOfEvent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getPurposeOfEvent().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Recorded ********************************************************************************/
		if(a.getAuditEvntRecorded() != null ) {

			if(a.getAuditEvntRecorded().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntRecorded()==null) {} else {
			auditevent.setRecorded(a.getAuditEvntRecorded().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntRecorded()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAuditEvntRecorded().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_Src_Observer ********************************************************************************/
		if(a.getAuditEvntSrcObserver() != null ) {

			if(a.getAuditEvntSrcObserver().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntSrcObserver()==null) {} else {
			auditevent.getSource().setObserver(new org.hl7.fhir.r4.model.Reference(a.getAuditEvntSrcObserver().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_Src_Site ********************************************************************************/
		if(a.getAuditEvntSrcSite() != null ) {

			if(a.getAuditEvntSrcSite().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntSrcSite()==null) {} else {
			auditevent.getSource().setSite(a.getAuditEvntSrcSite().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AuditEvnt_Src_Typ_Cd ********************************************************************************/
		if(a.getAuditEvntSrcTypCd() != null ) {

			String[] arrayi0 = a.getAuditEvntSrcTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSource().getType().size() < i0+1) { auditevent.getSource().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSource().getType().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Src_Typ_Dsply ********************************************************************************/
		if(a.getAuditEvntSrcTypDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntSrcTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSource().getType().size() < i0+1) { auditevent.getSource().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSource().getType().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Src_Typ_Sys ********************************************************************************/
		if(a.getAuditEvntSrcTypSys() != null ) {

			String[] arrayi0 = a.getAuditEvntSrcTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSource().getType().size() < i0+1) { auditevent.getSource().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSource().getType().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Src_Typ_UsrSltd ********************************************************************************/
		if(a.getAuditEvntSrcTypUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntSrcTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSource().getType().size() < i0+1) { auditevent.getSource().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSource().getType().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Src_Typ_Vrsn ********************************************************************************/
		if(a.getAuditEvntSrcTypVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntSrcTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSource().getType().size() < i0+1) { auditevent.getSource().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSource().getType().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Subtype_Cd ********************************************************************************/
		if(a.getAuditEvntSubtypeCd() != null ) {

			String[] arrayi0 = a.getAuditEvntSubtypeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSubtype().size() < i0+1) { auditevent.addSubtype(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSubtype().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Subtype_Dsply ********************************************************************************/
		if(a.getAuditEvntSubtypeDsply() != null ) {

			String[] arrayi0 = a.getAuditEvntSubtypeDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSubtype().size() < i0+1) { auditevent.addSubtype(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSubtype().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Subtype_Sys ********************************************************************************/
		if(a.getAuditEvntSubtypeSys() != null ) {

			String[] arrayi0 = a.getAuditEvntSubtypeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSubtype().size() < i0+1) { auditevent.addSubtype(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSubtype().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Subtype_UsrSltd ********************************************************************************/
		if(a.getAuditEvntSubtypeUsrSltd() != null ) {

			String[] arrayi0 = a.getAuditEvntSubtypeUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSubtype().size() < i0+1) { auditevent.addSubtype(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSubtype().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AuditEvnt_Subtype_Vrsn ********************************************************************************/
		if(a.getAuditEvntSubtypeVrsn() != null ) {

			String[] arrayi0 = a.getAuditEvntSubtypeVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(auditevent.getSubtype().size() < i0+1) { auditevent.addSubtype(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {auditevent.getSubtype().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AuditEvnt_Typ_Cd ********************************************************************************/
		if(a.getAuditEvntTypCd() != null ) {

			if(a.getAuditEvntTypCd().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntTypCd()==null) {} else {
			auditevent.getType().setCode(a.getAuditEvntTypCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AuditEvnt_Typ_Dsply ********************************************************************************/
		if(a.getAuditEvntTypDsply() != null ) {

			if(a.getAuditEvntTypDsply().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntTypDsply()==null) {} else {
			auditevent.getType().setDisplay(a.getAuditEvntTypDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AuditEvnt_Typ_Sys ********************************************************************************/
		if(a.getAuditEvntTypSys() != null ) {

			if(a.getAuditEvntTypSys().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntTypSys()==null) {} else {
			auditevent.getType().setSystem(a.getAuditEvntTypSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AuditEvnt_Typ_UsrSltd ********************************************************************************/
		if(a.getAuditEvntTypUsrSltd() != null ) {

			if(a.getAuditEvntTypUsrSltd().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntTypUsrSltd()==null) {} else {
			auditevent.getType().setUserSelected(Boolean.parseBoolean(a.getAuditEvntTypUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AuditEvnt_Typ_Vrsn ********************************************************************************/
		if(a.getAuditEvntTypVrsn() != null ) {

			if(a.getAuditEvntTypVrsn().replace("[","").replace("]","").equals("NULL") | a.getAuditEvntTypVrsn()==null) {} else {
			auditevent.getType().setVersion(a.getAuditEvntTypVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return auditevent;
	}
}
