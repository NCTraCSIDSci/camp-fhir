package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NamingSystem;
public class NamingSystemConversion 
{
	public org.hl7.fhir.r4.model.NamingSystem NamingSystems(NamingSystem n) throws ParseException
	{
		org.hl7.fhir.r4.model.NamingSystem namingsystem = new org.hl7.fhir.r4.model.NamingSystem();

		/******************** id ********************************************************************************/
		namingsystem.setId(n.getId());

		/******************** NmingSys_Cntct_Nm ********************************************************************************/
		if(n.getNmingSysCntctNm() != null ) {

			String[] arrayi0 = n.getNmingSysCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(n.getNmingSysCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = n.getNmingSysCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				String[] arrayi1 = n.getNmingSysCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getContact().get(i0).getTelecom().size() < i1+1) { namingsystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(n.getNmingSysCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = n.getNmingSysCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				String[] arrayi1 = n.getNmingSysCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getContact().get(i0).getTelecom().size() < i1+1) { namingsystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(n.getNmingSysCntctTlcmRnk() != null ) {

			String[] arrayi0 = n.getNmingSysCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				String[] arrayi1 = n.getNmingSysCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getContact().get(i0).getTelecom().size() < i1+1) { namingsystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_Cntct_Tlcm_Sys ********************************************************************************/
		if(n.getNmingSysCntctTlcmSys() != null ) {

			String[] arrayi0 = n.getNmingSysCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				String[] arrayi1 = n.getNmingSysCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getContact().get(i0).getTelecom().size() < i1+1) { namingsystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_Cntct_Tlcm_Use ********************************************************************************/
		if(n.getNmingSysCntctTlcmUse() != null ) {

			String[] arrayi0 = n.getNmingSysCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				String[] arrayi1 = n.getNmingSysCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getContact().get(i0).getTelecom().size() < i1+1) { namingsystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(n.getNmingSysCntctTlcmVl() != null ) {

			String[] arrayi0 = n.getNmingSysCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getContact().size() < i0+1) { namingsystem.addContact(); }
				String[] arrayi1 = n.getNmingSysCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getContact().get(i0).getTelecom().size() < i1+1) { namingsystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_Dt ********************************************************************************/
		if(n.getNmingSysDt() != null ) {

			if(n.getNmingSysDt().replace("[","").replace("]","").equals("NULL") | n.getNmingSysDt()==null) {} else {
			namingsystem.setDate(n.getNmingSysDt().replace("[","").replace("]","").equals("NULL") | n.getNmingSysDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(n.getNmingSysDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NmingSys_Dscrptn ********************************************************************************/
		if(n.getNmingSysDscrptn() != null ) {

			if(n.getNmingSysDscrptn().replace("[","").replace("]","").equals("NULL") | n.getNmingSysDscrptn()==null) {} else {
			namingsystem.setDescription(n.getNmingSysDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NmingSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgCd() != null ) {

			String[] arrayi0 = n.getNmingSysJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getJurisdiction().size() < i0+1) { namingsystem.addJurisdiction(); }
				String[] arrayi1 = n.getNmingSysJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { namingsystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = n.getNmingSysJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getJurisdiction().size() < i0+1) { namingsystem.addJurisdiction(); }
				String[] arrayi1 = n.getNmingSysJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { namingsystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgSys() != null ) {

			String[] arrayi0 = n.getNmingSysJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getJurisdiction().size() < i0+1) { namingsystem.addJurisdiction(); }
				String[] arrayi1 = n.getNmingSysJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { namingsystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNmingSysJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getJurisdiction().size() < i0+1) { namingsystem.addJurisdiction(); }
				String[] arrayi1 = n.getNmingSysJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { namingsystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = n.getNmingSysJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getJurisdiction().size() < i0+1) { namingsystem.addJurisdiction(); }
				String[] arrayi1 = n.getNmingSysJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { namingsystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_Jrsdctn_Txt ********************************************************************************/
		if(n.getNmingSysJrsdctnTxt() != null ) {

			String[] arrayi0 = n.getNmingSysJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getJurisdiction().size() < i0+1) { namingsystem.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Kind ********************************************************************************/
		if(n.getNmingSysKind() != null ) {

			if(n.getNmingSysKind().replace("[","").replace("]","").equals("NULL") | n.getNmingSysKind()==null) {} else {
			namingsystem.setKind(new org.hl7.fhir.r4.model.NamingSystem.NamingSystemTypeEnumFactory().fromCode(n.getNmingSysKind().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NmingSys_Nm ********************************************************************************/
		if(n.getNmingSysNm() != null ) {

			if(n.getNmingSysNm().replace("[","").replace("]","").equals("NULL") | n.getNmingSysNm()==null) {} else {
			namingsystem.setName(n.getNmingSysNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NmingSys_Pblshr ********************************************************************************/
		if(n.getNmingSysPblshr() != null ) {

			if(n.getNmingSysPblshr().replace("[","").replace("]","").equals("NULL") | n.getNmingSysPblshr()==null) {} else {
			namingsystem.setPublisher(n.getNmingSysPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NmingSys_Responsible ********************************************************************************/
		if(n.getNmingSysResponsible() != null ) {

			if(n.getNmingSysResponsible().replace("[","").replace("]","").equals("NULL") | n.getNmingSysResponsible()==null) {} else {
			namingsystem.setResponsible(n.getNmingSysResponsible().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NmingSys_Sts ********************************************************************************/
		if(n.getNmingSysSts() != null ) {

			if(n.getNmingSysSts().replace("[","").replace("]","").equals("NULL") | n.getNmingSysSts()==null) {} else {
			namingsystem.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(n.getNmingSysSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NmingSys_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNmingSysTypCdgCd() != null ) {

			String[] arrayi0 = n.getNmingSysTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getType().getCoding().size() < i0+1) { namingsystem.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNmingSysTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNmingSysTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getType().getCoding().size() < i0+1) { namingsystem.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNmingSysTypCdgSys() != null ) {

			String[] arrayi0 = n.getNmingSysTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getType().getCoding().size() < i0+1) { namingsystem.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNmingSysTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNmingSysTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getType().getCoding().size() < i0+1) { namingsystem.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNmingSysTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNmingSysTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getType().getCoding().size() < i0+1) { namingsystem.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Typ_Txt ********************************************************************************/
		if(n.getNmingSysTypTxt() != null ) {

			if(n.getNmingSysTypTxt().replace("[","").replace("]","").equals("NULL") | n.getNmingSysTypTxt()==null) {} else {
			namingsystem.getType().setText(n.getNmingSysTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NmingSys_UniqueId_Comment ********************************************************************************/
		if(n.getNmingSysUniqueIdComment() != null ) {

			String[] arrayi0 = n.getNmingSysUniqueIdComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUniqueId().size() < i0+1) { namingsystem.addUniqueId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUniqueId().get(i0).setComment(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UniqueId_Prd_End ********************************************************************************/
		if(n.getNmingSysUniqueIdPrdEnd() != null ) {

			String[] arrayi0 = n.getNmingSysUniqueIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUniqueId().size() < i0+1) { namingsystem.addUniqueId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUniqueId().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UniqueId_Prd_Strt ********************************************************************************/
		if(n.getNmingSysUniqueIdPrdStrt() != null ) {

			String[] arrayi0 = n.getNmingSysUniqueIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUniqueId().size() < i0+1) { namingsystem.addUniqueId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUniqueId().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UniqueId_Preferred ********************************************************************************/
		if(n.getNmingSysUniqueIdPreferred() != null ) {

			String[] arrayi0 = n.getNmingSysUniqueIdPreferred().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUniqueId().size() < i0+1) { namingsystem.addUniqueId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUniqueId().get(i0).setPreferred(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UniqueId_Typ ********************************************************************************/
		if(n.getNmingSysUniqueIdTyp() != null ) {

			String[] arrayi0 = n.getNmingSysUniqueIdTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUniqueId().size() < i0+1) { namingsystem.addUniqueId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUniqueId().get(i0).setType(new org.hl7.fhir.r4.model.NamingSystem.NamingSystemIdentifierTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UniqueId_Vl ********************************************************************************/
		if(n.getNmingSysUniqueIdVl() != null ) {

			String[] arrayi0 = n.getNmingSysUniqueIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUniqueId().size() < i0+1) { namingsystem.addUniqueId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUniqueId().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_Usg ********************************************************************************/
		if(n.getNmingSysUsg() != null ) {

			if(n.getNmingSysUsg().replace("[","").replace("]","").equals("NULL") | n.getNmingSysUsg()==null) {} else {
			namingsystem.setUsage(n.getNmingSysUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NmingSys_UseCntxt_Cd_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtCdCd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(n.getNmingSysUseCntxtCdDsply() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtCdSys() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(n.getNmingSysUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(n.getNmingSysUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				String[] arrayi1 = n.getNmingSysUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { namingsystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				String[] arrayi1 = n.getNmingSysUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { namingsystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				String[] arrayi1 = n.getNmingSysUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { namingsystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				String[] arrayi1 = n.getNmingSysUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { namingsystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				String[] arrayi1 = n.getNmingSysUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { namingsystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {namingsystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NmingSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = n.getNmingSysUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(namingsystem.getUseContext().size() < i0+1) { namingsystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {namingsystem.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return namingsystem;
	}
}
