package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CompartmentDefinition;
public class CompartmentDefinitionConversion 
{
	public org.hl7.fhir.r4.model.CompartmentDefinition CompartmentDefinitions(CompartmentDefinition c) throws ParseException
	{
		org.hl7.fhir.r4.model.CompartmentDefinition compartmentdefinition = new org.hl7.fhir.r4.model.CompartmentDefinition();

		/******************** id ********************************************************************************/
		compartmentdefinition.setId(c.getId());

		/******************** CmprtmntDfn_Cd ********************************************************************************/
		if(c.getCmprtmntDfnCd() != null ) {

			if(c.getCmprtmntDfnCd().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnCd()==null) {} else {
			compartmentdefinition.setCode(new org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentTypeEnumFactory().fromCode(c.getCmprtmntDfnCd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmprtmntDfn_Cntct_Nm ********************************************************************************/
		if(c.getCmprtmntDfnCntctNm() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				String[] arrayi1 = c.getCmprtmntDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getContact().get(i0).getTelecom().size() < i1+1) { compartmentdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				String[] arrayi1 = c.getCmprtmntDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getContact().get(i0).getTelecom().size() < i1+1) { compartmentdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				String[] arrayi1 = c.getCmprtmntDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getContact().get(i0).getTelecom().size() < i1+1) { compartmentdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				String[] arrayi1 = c.getCmprtmntDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getContact().get(i0).getTelecom().size() < i1+1) { compartmentdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				String[] arrayi1 = c.getCmprtmntDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getContact().get(i0).getTelecom().size() < i1+1) { compartmentdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getContact().size() < i0+1) { compartmentdefinition.addContact(); }
				String[] arrayi1 = c.getCmprtmntDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getContact().get(i0).getTelecom().size() < i1+1) { compartmentdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmprtmntDfn_Dt ********************************************************************************/
		if(c.getCmprtmntDfnDt() != null ) {

			if(c.getCmprtmntDfnDt().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnDt()==null) {} else {
			compartmentdefinition.setDate(c.getCmprtmntDfnDt().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmprtmntDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmprtmntDfn_Dscrptn ********************************************************************************/
		if(c.getCmprtmntDfnDscrptn() != null ) {

			if(c.getCmprtmntDfnDscrptn().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnDscrptn()==null) {} else {
			compartmentdefinition.setDescription(c.getCmprtmntDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmprtmntDfn_Exprmtl ********************************************************************************/
		if(c.getCmprtmntDfnExprmtl() != null ) {

			if(c.getCmprtmntDfnExprmtl().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnExprmtl()==null) {} else {
			compartmentdefinition.setExperimental(Boolean.parseBoolean(c.getCmprtmntDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmprtmntDfn_Nm ********************************************************************************/
		if(c.getCmprtmntDfnNm() != null ) {

			if(c.getCmprtmntDfnNm().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnNm()==null) {} else {
			compartmentdefinition.setName(c.getCmprtmntDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmprtmntDfn_Pblshr ********************************************************************************/
		if(c.getCmprtmntDfnPblshr() != null ) {

			if(c.getCmprtmntDfnPblshr().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnPblshr()==null) {} else {
			compartmentdefinition.setPublisher(c.getCmprtmntDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmprtmntDfn_Prpse ********************************************************************************/
		if(c.getCmprtmntDfnPrpse() != null ) {

			if(c.getCmprtmntDfnPrpse().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnPrpse()==null) {} else {
			compartmentdefinition.setPurpose(c.getCmprtmntDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmprtmntDfn_Rsrc_Cd ********************************************************************************/
		if(c.getCmprtmntDfnRsrcCd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnRsrcCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getResource().size() < i0+1) { compartmentdefinition.addResource(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getResource().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_Rsrc_Docation ********************************************************************************/
		if(c.getCmprtmntDfnRsrcDocation() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnRsrcDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getResource().size() < i0+1) { compartmentdefinition.addResource(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getResource().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_Rsrc_Param ********************************************************************************/
		if(c.getCmprtmntDfnRsrcParam() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnRsrcParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getResource().size() < i0+1) { compartmentdefinition.addResource(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {compartmentdefinition.getResource().get(i0).addParam(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmprtmntDfn_Srch ********************************************************************************/
		if(c.getCmprtmntDfnSrch() != null ) {

			if(c.getCmprtmntDfnSrch().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnSrch()==null) {} else {
			compartmentdefinition.setSearch(Boolean.parseBoolean(c.getCmprtmntDfnSrch().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmprtmntDfn_Sts ********************************************************************************/
		if(c.getCmprtmntDfnSts() != null ) {

			if(c.getCmprtmntDfnSts().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnSts()==null) {} else {
			compartmentdefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(c.getCmprtmntDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CmprtmntDfn_Url ********************************************************************************/
		if(c.getCmprtmntDfnUrl() != null ) {

			if(c.getCmprtmntDfnUrl().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnUrl()==null) {} else {
			compartmentdefinition.setUrl(c.getCmprtmntDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				String[] arrayi1 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				String[] arrayi1 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				String[] arrayi1 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				String[] arrayi1 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				String[] arrayi1 = c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CmprtmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = c.getCmprtmntDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(compartmentdefinition.getUseContext().size() < i0+1) { compartmentdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {compartmentdefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CmprtmntDfn_Vrsn ********************************************************************************/
		if(c.getCmprtmntDfnVrsn() != null ) {

			if(c.getCmprtmntDfnVrsn().replace("[","").replace("]","").equals("NULL") | c.getCmprtmntDfnVrsn()==null) {} else {
			compartmentdefinition.setVersion(c.getCmprtmntDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return compartmentdefinition;
	}
}
