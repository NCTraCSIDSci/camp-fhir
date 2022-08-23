package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ConceptMap;
public class ConceptMapConversion 
{
	public org.hl7.fhir.r4.model.ConceptMap ConceptMaps(ConceptMap c) throws ParseException
	{
		org.hl7.fhir.r4.model.ConceptMap conceptmap = new org.hl7.fhir.r4.model.ConceptMap();

		/******************** id ********************************************************************************/
		conceptmap.setId(c.getId());

		/******************** CncptMap_Cntct_Nm ********************************************************************************/
		if(c.getCncptMapCntctNm() != null ) {

			String[] arrayi0 = c.getCncptMapCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCncptMapCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = c.getCncptMapCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				String[] arrayi1 = c.getCncptMapCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getContact().get(i0).getTelecom().size() < i1+1) { conceptmap.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCncptMapCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = c.getCncptMapCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				String[] arrayi1 = c.getCncptMapCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getContact().get(i0).getTelecom().size() < i1+1) { conceptmap.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCncptMapCntctTlcmRnk() != null ) {

			String[] arrayi0 = c.getCncptMapCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				String[] arrayi1 = c.getCncptMapCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getContact().get(i0).getTelecom().size() < i1+1) { conceptmap.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_Cntct_Tlcm_Sys ********************************************************************************/
		if(c.getCncptMapCntctTlcmSys() != null ) {

			String[] arrayi0 = c.getCncptMapCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				String[] arrayi1 = c.getCncptMapCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getContact().get(i0).getTelecom().size() < i1+1) { conceptmap.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_Cntct_Tlcm_Use ********************************************************************************/
		if(c.getCncptMapCntctTlcmUse() != null ) {

			String[] arrayi0 = c.getCncptMapCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				String[] arrayi1 = c.getCncptMapCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getContact().get(i0).getTelecom().size() < i1+1) { conceptmap.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCncptMapCntctTlcmVl() != null ) {

			String[] arrayi0 = c.getCncptMapCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getContact().size() < i0+1) { conceptmap.addContact(); }
				String[] arrayi1 = c.getCncptMapCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getContact().get(i0).getTelecom().size() < i1+1) { conceptmap.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_Copyright ********************************************************************************/
		if(c.getCncptMapCopyright() != null ) {

			if(c.getCncptMapCopyright().replace("[","").replace("]","").equals("NULL") | c.getCncptMapCopyright()==null) {} else {
			conceptmap.setCopyright(c.getCncptMapCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Dt ********************************************************************************/
		if(c.getCncptMapDt() != null ) {

			if(c.getCncptMapDt().replace("[","").replace("]","").equals("NULL") | c.getCncptMapDt()==null) {} else {
			conceptmap.setDate(c.getCncptMapDt().replace("[","").replace("]","").equals("NULL") | c.getCncptMapDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCncptMapDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Dscrptn ********************************************************************************/
		if(c.getCncptMapDscrptn() != null ) {

			if(c.getCncptMapDscrptn().replace("[","").replace("]","").equals("NULL") | c.getCncptMapDscrptn()==null) {} else {
			conceptmap.setDescription(c.getCncptMapDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Exprmtl ********************************************************************************/
		if(c.getCncptMapExprmtl() != null ) {

			if(c.getCncptMapExprmtl().replace("[","").replace("]","").equals("NULL") | c.getCncptMapExprmtl()==null) {} else {
			conceptmap.setExperimental(Boolean.parseBoolean(c.getCncptMapExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Grp_Src ********************************************************************************/
		if(c.getCncptMapGrpSrc() != null ) {

			String[] arrayi0 = c.getCncptMapGrpSrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).setSource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Grp_SrcVrsn ********************************************************************************/
		if(c.getCncptMapGrpSrcVrsn() != null ) {

			String[] arrayi0 = c.getCncptMapGrpSrcVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).setSourceVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Grp_TarVrsn ********************************************************************************/
		if(c.getCncptMapGrpTarVrsn() != null ) {

			String[] arrayi0 = c.getCncptMapGrpTarVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).setTargetVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Grp_Unmapped_Cd ********************************************************************************/
		if(c.getCncptMapGrpUnmappedCd() != null ) {

			String[] arrayi0 = c.getCncptMapGrpUnmappedCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).getUnmapped().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Grp_Unmapped_Dsply ********************************************************************************/
		if(c.getCncptMapGrpUnmappedDsply() != null ) {

			String[] arrayi0 = c.getCncptMapGrpUnmappedDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).getUnmapped().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Grp_Unmapped_Mode ********************************************************************************/
		if(c.getCncptMapGrpUnmappedMode() != null ) {

			String[] arrayi0 = c.getCncptMapGrpUnmappedMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).getUnmapped().setMode(new org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedModeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_Grp_Unmapped_Url ********************************************************************************/
		if(c.getCncptMapGrpUnmappedUrl() != null ) {

			String[] arrayi0 = c.getCncptMapGrpUnmappedUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getGroup().size() < i0+1) { conceptmap.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getGroup().get(i0).getUnmapped().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Id_Assigner ********************************************************************************/
		if(c.getCncptMapIdAssigner() != null ) {

			if(c.getCncptMapIdAssigner().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdAssigner()==null) {} else {
			conceptmap.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(c.getCncptMapIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Id_Prd_End ********************************************************************************/
		if(c.getCncptMapIdPrdEnd() != null ) {

			if(c.getCncptMapIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdPrdEnd()==null) {} else {
			conceptmap.getIdentifier().getPeriod().setEnd(c.getCncptMapIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCncptMapIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Id_Prd_Strt ********************************************************************************/
		if(c.getCncptMapIdPrdStrt() != null ) {

			if(c.getCncptMapIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdPrdStrt()==null) {} else {
			conceptmap.getIdentifier().getPeriod().setStart(c.getCncptMapIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCncptMapIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Id_Sys ********************************************************************************/
		if(c.getCncptMapIdSys() != null ) {

			if(c.getCncptMapIdSys().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdSys()==null) {} else {
			conceptmap.getIdentifier().setSystem(c.getCncptMapIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCncptMapIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCncptMapIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getIdentifier().getType().getCoding().size() < i0+1) { conceptmap.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCncptMapIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCncptMapIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getIdentifier().getType().getCoding().size() < i0+1) { conceptmap.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCncptMapIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCncptMapIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getIdentifier().getType().getCoding().size() < i0+1) { conceptmap.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCncptMapIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCncptMapIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getIdentifier().getType().getCoding().size() < i0+1) { conceptmap.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCncptMapIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCncptMapIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getIdentifier().getType().getCoding().size() < i0+1) { conceptmap.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Id_Typ_Txt ********************************************************************************/
		if(c.getCncptMapIdTypTxt() != null ) {

			if(c.getCncptMapIdTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdTypTxt()==null) {} else {
			conceptmap.getIdentifier().getType().setText(c.getCncptMapIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Id_Use ********************************************************************************/
		if(c.getCncptMapIdUse() != null ) {

			if(c.getCncptMapIdUse().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdUse()==null) {} else {
			conceptmap.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(c.getCncptMapIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Id_Vl ********************************************************************************/
		if(c.getCncptMapIdVl() != null ) {

			if(c.getCncptMapIdVl().replace("[","").replace("]","").equals("NULL") | c.getCncptMapIdVl()==null) {} else {
			conceptmap.getIdentifier().setValue(c.getCncptMapIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgCd() != null ) {

			String[] arrayi0 = c.getCncptMapJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getJurisdiction().size() < i0+1) { conceptmap.addJurisdiction(); }
				String[] arrayi1 = c.getCncptMapJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getJurisdiction().get(i0).getCoding().size() < i1+1) { conceptmap.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = c.getCncptMapJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getJurisdiction().size() < i0+1) { conceptmap.addJurisdiction(); }
				String[] arrayi1 = c.getCncptMapJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getJurisdiction().get(i0).getCoding().size() < i1+1) { conceptmap.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgSys() != null ) {

			String[] arrayi0 = c.getCncptMapJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getJurisdiction().size() < i0+1) { conceptmap.addJurisdiction(); }
				String[] arrayi1 = c.getCncptMapJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getJurisdiction().get(i0).getCoding().size() < i1+1) { conceptmap.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCncptMapJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getJurisdiction().size() < i0+1) { conceptmap.addJurisdiction(); }
				String[] arrayi1 = c.getCncptMapJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getJurisdiction().get(i0).getCoding().size() < i1+1) { conceptmap.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCncptMapJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getJurisdiction().size() < i0+1) { conceptmap.addJurisdiction(); }
				String[] arrayi1 = c.getCncptMapJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getJurisdiction().get(i0).getCoding().size() < i1+1) { conceptmap.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_Jrsdctn_Txt ********************************************************************************/
		if(c.getCncptMapJrsdctnTxt() != null ) {

			String[] arrayi0 = c.getCncptMapJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getJurisdiction().size() < i0+1) { conceptmap.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_Nm ********************************************************************************/
		if(c.getCncptMapNm() != null ) {

			if(c.getCncptMapNm().replace("[","").replace("]","").equals("NULL") | c.getCncptMapNm()==null) {} else {
			conceptmap.setName(c.getCncptMapNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Pblshr ********************************************************************************/
		if(c.getCncptMapPblshr() != null ) {

			if(c.getCncptMapPblshr().replace("[","").replace("]","").equals("NULL") | c.getCncptMapPblshr()==null) {} else {
			conceptmap.setPublisher(c.getCncptMapPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Prpse ********************************************************************************/
		if(c.getCncptMapPrpse() != null ) {

			if(c.getCncptMapPrpse().replace("[","").replace("]","").equals("NULL") | c.getCncptMapPrpse()==null) {} else {
			conceptmap.setPurpose(c.getCncptMapPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_SrcCanonicalTyp ********************************************************************************/
		if(c.getCncptMapSrcCanonicalTyp() != null ) {

			if(c.getCncptMapSrcCanonicalTyp().replace("[","").replace("]","").equals("NULL") | c.getCncptMapSrcCanonicalTyp()==null) {} else {
			conceptmap.setSource(new org.hl7.fhir.r4.model.CanonicalType(c.getCncptMapSrcCanonicalTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_SrcUriTyp ********************************************************************************/
		if(c.getCncptMapSrcUriTyp() != null ) {

			if(c.getCncptMapSrcUriTyp().replace("[","").replace("]","").equals("NULL") | c.getCncptMapSrcUriTyp()==null) {} else {
			conceptmap.setSource(new org.hl7.fhir.r4.model.UriType(c.getCncptMapSrcUriTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Sts ********************************************************************************/
		if(c.getCncptMapSts() != null ) {

			if(c.getCncptMapSts().replace("[","").replace("]","").equals("NULL") | c.getCncptMapSts()==null) {} else {
			conceptmap.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(c.getCncptMapSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_TarCanonicalTyp ********************************************************************************/
		if(c.getCncptMapTarCanonicalTyp() != null ) {

			if(c.getCncptMapTarCanonicalTyp().replace("[","").replace("]","").equals("NULL") | c.getCncptMapTarCanonicalTyp()==null) {} else {
			conceptmap.setTarget(new org.hl7.fhir.r4.model.CanonicalType(c.getCncptMapTarCanonicalTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_TarUriTyp ********************************************************************************/
		if(c.getCncptMapTarUriTyp() != null ) {

			if(c.getCncptMapTarUriTyp().replace("[","").replace("]","").equals("NULL") | c.getCncptMapTarUriTyp()==null) {} else {
			conceptmap.setTarget(new org.hl7.fhir.r4.model.UriType(c.getCncptMapTarUriTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CncptMap_Ttl ********************************************************************************/
		if(c.getCncptMapTtl() != null ) {

			if(c.getCncptMapTtl().replace("[","").replace("]","").equals("NULL") | c.getCncptMapTtl()==null) {} else {
			conceptmap.setTitle(c.getCncptMapTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_Url ********************************************************************************/
		if(c.getCncptMapUrl() != null ) {

			if(c.getCncptMapUrl().replace("[","").replace("]","").equals("NULL") | c.getCncptMapUrl()==null) {} else {
			conceptmap.setUrl(c.getCncptMapUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CncptMap_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtCdCd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCncptMapUseCntxtCdDsply() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtCdSys() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCncptMapUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCncptMapUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				String[] arrayi1 = c.getCncptMapUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { conceptmap.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				String[] arrayi1 = c.getCncptMapUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { conceptmap.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				String[] arrayi1 = c.getCncptMapUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { conceptmap.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				String[] arrayi1 = c.getCncptMapUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { conceptmap.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				String[] arrayi1 = c.getCncptMapUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { conceptmap.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {conceptmap.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CncptMap_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = c.getCncptMapUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(conceptmap.getUseContext().size() < i0+1) { conceptmap.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {conceptmap.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CncptMap_Vrsn ********************************************************************************/
		if(c.getCncptMapVrsn() != null ) {

			if(c.getCncptMapVrsn().replace("[","").replace("]","").equals("NULL") | c.getCncptMapVrsn()==null) {} else {
			conceptmap.setVersion(c.getCncptMapVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return conceptmap;
	}
}
