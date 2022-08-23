package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ListResource;
public class ListResourceConversion 
{
	public org.hl7.fhir.r4.model.ListResource ListResources(ListResource l) throws ParseException
	{
		org.hl7.fhir.r4.model.ListResource listresource = new org.hl7.fhir.r4.model.ListResource();

		/******************** id ********************************************************************************/
		listresource.setId(l.getId());

		/******************** ListRsrc_Cd_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcCdCdgCd() != null ) {

			String[] arrayi0 = l.getListRsrcCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getCode().getCoding().size() < i0+1) { listresource.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Cd_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcCdCdgDsply() != null ) {

			String[] arrayi0 = l.getListRsrcCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getCode().getCoding().size() < i0+1) { listresource.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Cd_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcCdCdgSys() != null ) {

			String[] arrayi0 = l.getListRsrcCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getCode().getCoding().size() < i0+1) { listresource.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcCdCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getListRsrcCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getCode().getCoding().size() < i0+1) { listresource.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Cd_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcCdCdgVrsn() != null ) {

			String[] arrayi0 = l.getListRsrcCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getCode().getCoding().size() < i0+1) { listresource.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Cd_Txt ********************************************************************************/
		if(l.getListRsrcCdTxt() != null ) {

			if(l.getListRsrcCdTxt().replace("[","").replace("]","").equals("NULL") | l.getListRsrcCdTxt()==null) {} else {
			listresource.getCode().setText(l.getListRsrcCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ListRsrc_Dt ********************************************************************************/
		if(l.getListRsrcDt() != null ) {

			if(l.getListRsrcDt().replace("[","").replace("]","").equals("NULL") | l.getListRsrcDt()==null) {} else {
			listresource.setDate(l.getListRsrcDt().replace("[","").replace("]","").equals("NULL") | l.getListRsrcDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getListRsrcDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ListRsrc_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgCd() != null ) {

			String[] arrayi0 = l.getListRsrcEmptyRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEmptyReason().getCoding().size() < i0+1) { listresource.getEmptyReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEmptyReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgDsply() != null ) {

			String[] arrayi0 = l.getListRsrcEmptyRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEmptyReason().getCoding().size() < i0+1) { listresource.getEmptyReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEmptyReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgSys() != null ) {

			String[] arrayi0 = l.getListRsrcEmptyRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEmptyReason().getCoding().size() < i0+1) { listresource.getEmptyReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEmptyReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getListRsrcEmptyRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEmptyReason().getCoding().size() < i0+1) { listresource.getEmptyReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEmptyReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcEmptyRsnCdgVrsn() != null ) {

			String[] arrayi0 = l.getListRsrcEmptyRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEmptyReason().getCoding().size() < i0+1) { listresource.getEmptyReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEmptyReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_EmptyRsn_Txt ********************************************************************************/
		if(l.getListRsrcEmptyRsnTxt() != null ) {

			if(l.getListRsrcEmptyRsnTxt().replace("[","").replace("]","").equals("NULL") | l.getListRsrcEmptyRsnTxt()==null) {} else {
			listresource.getEmptyReason().setText(l.getListRsrcEmptyRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ListRsrc_Enc ********************************************************************************/
		if(l.getListRsrcEnc() != null ) {

			if(l.getListRsrcEnc().replace("[","").replace("]","").equals("NULL") | l.getListRsrcEnc()==null) {} else {
			listresource.setEncounter(new org.hl7.fhir.r4.model.Reference(l.getListRsrcEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ListRsrc_Entry_Dt ********************************************************************************/
		if(l.getListRsrcEntryDt() != null ) {

			String[] arrayi0 = l.getListRsrcEntryDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEntry().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Entry_Deleted ********************************************************************************/
		if(l.getListRsrcEntryDeleted() != null ) {

			String[] arrayi0 = l.getListRsrcEntryDeleted().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEntry().get(i0).setDeleted(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Entry_Flag_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgCd() != null ) {

			String[] arrayi0 = l.getListRsrcEntryFlagCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				String[] arrayi1 = l.getListRsrcEntryFlagCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getEntry().get(i0).getFlag().getCoding().size() < i1+1) { listresource.getEntry().get(i0).getFlag().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getEntry().get(i0).getFlag().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Entry_Flag_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgDsply() != null ) {

			String[] arrayi0 = l.getListRsrcEntryFlagCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				String[] arrayi1 = l.getListRsrcEntryFlagCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getEntry().get(i0).getFlag().getCoding().size() < i1+1) { listresource.getEntry().get(i0).getFlag().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getEntry().get(i0).getFlag().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Entry_Flag_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgSys() != null ) {

			String[] arrayi0 = l.getListRsrcEntryFlagCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				String[] arrayi1 = l.getListRsrcEntryFlagCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getEntry().get(i0).getFlag().getCoding().size() < i1+1) { listresource.getEntry().get(i0).getFlag().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getEntry().get(i0).getFlag().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Entry_Flag_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getListRsrcEntryFlagCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				String[] arrayi1 = l.getListRsrcEntryFlagCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getEntry().get(i0).getFlag().getCoding().size() < i1+1) { listresource.getEntry().get(i0).getFlag().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getEntry().get(i0).getFlag().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ListRsrc_Entry_Flag_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcEntryFlagCdgVrsn() != null ) {

			String[] arrayi0 = l.getListRsrcEntryFlagCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				String[] arrayi1 = l.getListRsrcEntryFlagCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getEntry().get(i0).getFlag().getCoding().size() < i1+1) { listresource.getEntry().get(i0).getFlag().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getEntry().get(i0).getFlag().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Entry_Flag_Txt ********************************************************************************/
		if(l.getListRsrcEntryFlagTxt() != null ) {

			String[] arrayi0 = l.getListRsrcEntryFlagTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEntry().get(i0).getFlag().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Entry_Itm ********************************************************************************/
		if(l.getListRsrcEntryItm() != null ) {

			String[] arrayi0 = l.getListRsrcEntryItm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getEntry().size() < i0+1) { listresource.addEntry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getEntry().get(i0).setItem(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Id_Assigner ********************************************************************************/
		if(l.getListRsrcIdAssigner() != null ) {

			String[] arrayi0 = l.getListRsrcIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Id_Prd_End ********************************************************************************/
		if(l.getListRsrcIdPrdEnd() != null ) {

			String[] arrayi0 = l.getListRsrcIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Id_Prd_Strt ********************************************************************************/
		if(l.getListRsrcIdPrdStrt() != null ) {

			String[] arrayi0 = l.getListRsrcIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Id_Sys ********************************************************************************/
		if(l.getListRsrcIdSys() != null ) {

			String[] arrayi0 = l.getListRsrcIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcIdTypCdgCd() != null ) {

			String[] arrayi0 = l.getListRsrcIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				String[] arrayi1 = l.getListRsrcIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { listresource.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcIdTypCdgDsply() != null ) {

			String[] arrayi0 = l.getListRsrcIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				String[] arrayi1 = l.getListRsrcIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { listresource.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcIdTypCdgSys() != null ) {

			String[] arrayi0 = l.getListRsrcIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				String[] arrayi1 = l.getListRsrcIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { listresource.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getListRsrcIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				String[] arrayi1 = l.getListRsrcIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { listresource.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ListRsrc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcIdTypCdgVrsn() != null ) {

			String[] arrayi0 = l.getListRsrcIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				String[] arrayi1 = l.getListRsrcIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(listresource.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { listresource.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {listresource.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ListRsrc_Id_Typ_Txt ********************************************************************************/
		if(l.getListRsrcIdTypTxt() != null ) {

			String[] arrayi0 = l.getListRsrcIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Id_Use ********************************************************************************/
		if(l.getListRsrcIdUse() != null ) {

			String[] arrayi0 = l.getListRsrcIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Id_Vl ********************************************************************************/
		if(l.getListRsrcIdVl() != null ) {

			String[] arrayi0 = l.getListRsrcIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getIdentifier().size() < i0+1) { listresource.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Mode ********************************************************************************/
		if(l.getListRsrcMode() != null ) {

			if(l.getListRsrcMode().replace("[","").replace("]","").equals("NULL") | l.getListRsrcMode()==null) {} else {
			listresource.setMode(new org.hl7.fhir.r4.model.ListResource.ListModeEnumFactory().fromCode(l.getListRsrcMode().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ListRsrc_Nt_AthrRfrnc ********************************************************************************/
		if(l.getListRsrcNtAthrRfrnc() != null ) {

			String[] arrayi0 = l.getListRsrcNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getNote().size() < i0+1) { listresource.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Nt_AthrStrgTyp ********************************************************************************/
		if(l.getListRsrcNtAthrStrgTyp() != null ) {

			String[] arrayi0 = l.getListRsrcNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getNote().size() < i0+1) { listresource.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_Nt_Txt ********************************************************************************/
		if(l.getListRsrcNtTxt() != null ) {

			String[] arrayi0 = l.getListRsrcNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getNote().size() < i0+1) { listresource.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_Nt_Time ********************************************************************************/
		if(l.getListRsrcNtTime() != null ) {

			String[] arrayi0 = l.getListRsrcNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getNote().size() < i0+1) { listresource.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_OrdredBy_Cdg_Cd ********************************************************************************/
		if(l.getListRsrcOrdredByCdgCd() != null ) {

			String[] arrayi0 = l.getListRsrcOrdredByCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getOrderedBy().getCoding().size() < i0+1) { listresource.getOrderedBy().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getOrderedBy().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(l.getListRsrcOrdredByCdgDsply() != null ) {

			String[] arrayi0 = l.getListRsrcOrdredByCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getOrderedBy().getCoding().size() < i0+1) { listresource.getOrderedBy().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getOrderedBy().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_OrdredBy_Cdg_Sys ********************************************************************************/
		if(l.getListRsrcOrdredByCdgSys() != null ) {

			String[] arrayi0 = l.getListRsrcOrdredByCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getOrderedBy().getCoding().size() < i0+1) { listresource.getOrderedBy().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getOrderedBy().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(l.getListRsrcOrdredByCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getListRsrcOrdredByCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getOrderedBy().getCoding().size() < i0+1) { listresource.getOrderedBy().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getOrderedBy().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ListRsrc_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(l.getListRsrcOrdredByCdgVrsn() != null ) {

			String[] arrayi0 = l.getListRsrcOrdredByCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(listresource.getOrderedBy().getCoding().size() < i0+1) { listresource.getOrderedBy().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {listresource.getOrderedBy().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ListRsrc_OrdredBy_Txt ********************************************************************************/
		if(l.getListRsrcOrdredByTxt() != null ) {

			if(l.getListRsrcOrdredByTxt().replace("[","").replace("]","").equals("NULL") | l.getListRsrcOrdredByTxt()==null) {} else {
			listresource.getOrderedBy().setText(l.getListRsrcOrdredByTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ListRsrc_Src ********************************************************************************/
		if(l.getListRsrcSrc() != null ) {

			if(l.getListRsrcSrc().replace("[","").replace("]","").equals("NULL") | l.getListRsrcSrc()==null) {} else {
			listresource.setSource(new org.hl7.fhir.r4.model.Reference(l.getListRsrcSrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ListRsrc_Sts ********************************************************************************/
		if(l.getListRsrcSts() != null ) {

			if(l.getListRsrcSts().replace("[","").replace("]","").equals("NULL") | l.getListRsrcSts()==null) {} else {
			listresource.setStatus(new org.hl7.fhir.r4.model.ListResource.ListStatusEnumFactory().fromCode(l.getListRsrcSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ListRsrc_Sbjct ********************************************************************************/
		if(l.getListRsrcSbjct() != null ) {

			if(l.getListRsrcSbjct().replace("[","").replace("]","").equals("NULL") | l.getListRsrcSbjct()==null) {} else {
			listresource.setSubject(new org.hl7.fhir.r4.model.Reference(l.getListRsrcSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ListRsrc_Ttl ********************************************************************************/
		if(l.getListRsrcTtl() != null ) {

			if(l.getListRsrcTtl().replace("[","").replace("]","").equals("NULL") | l.getListRsrcTtl()==null) {} else {
			listresource.setTitle(l.getListRsrcTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return listresource;
	}
}
