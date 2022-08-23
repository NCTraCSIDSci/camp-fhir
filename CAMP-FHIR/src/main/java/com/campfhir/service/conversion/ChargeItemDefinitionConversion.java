package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItemDefinition;
public class ChargeItemDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ChargeItemDefinition ChargeItemDefinitions(ChargeItemDefinition c) throws ParseException
	{
		org.hl7.fhir.r4.model.ChargeItemDefinition chargeitemdefinition = new org.hl7.fhir.r4.model.ChargeItemDefinition();

		/******************** id ********************************************************************************/
		chargeitemdefinition.setId(c.getId());

		/******************** ChrgItmDfn_Applicability_Dscrptn ********************************************************************************/
		if(c.getChrgItmDfnApplicabilityDscrptn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnApplicabilityDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getApplicability().size() < i0+1) { chargeitemdefinition.addApplicability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getApplicability().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Applicability_Exprsn ********************************************************************************/
		if(c.getChrgItmDfnApplicabilityExprsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnApplicabilityExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getApplicability().size() < i0+1) { chargeitemdefinition.addApplicability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getApplicability().get(i0).setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Applicability_Lnguage ********************************************************************************/
		if(c.getChrgItmDfnApplicabilityLnguage() != null ) {

			String[] arrayi0 = c.getChrgItmDfnApplicabilityLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getApplicability().size() < i0+1) { chargeitemdefinition.addApplicability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getApplicability().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_ApprovalDt ********************************************************************************/
		if(c.getChrgItmDfnApprovalDt() != null ) {

			if(c.getChrgItmDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnApprovalDt()==null) {} else {
			chargeitemdefinition.setApprovalDate(c.getChrgItmDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmDfnApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnCdCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getCode().getCoding().size() < i0+1) { chargeitemdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getCode().getCoding().size() < i0+1) { chargeitemdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnCdCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getCode().getCoding().size() < i0+1) { chargeitemdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getCode().getCoding().size() < i0+1) { chargeitemdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getCode().getCoding().size() < i0+1) { chargeitemdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Cd_Txt ********************************************************************************/
		if(c.getChrgItmDfnCdTxt() != null ) {

			if(c.getChrgItmDfnCdTxt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnCdTxt()==null) {} else {
			chargeitemdefinition.getCode().setText(c.getChrgItmDfnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItmDfn_Cntct_Nm ********************************************************************************/
		if(c.getChrgItmDfnCntctNm() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				String[] arrayi1 = c.getChrgItmDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getContact().get(i0).getTelecom().size() < i1+1) { chargeitemdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				String[] arrayi1 = c.getChrgItmDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getContact().get(i0).getTelecom().size() < i1+1) { chargeitemdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				String[] arrayi1 = c.getChrgItmDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getContact().get(i0).getTelecom().size() < i1+1) { chargeitemdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				String[] arrayi1 = c.getChrgItmDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getContact().get(i0).getTelecom().size() < i1+1) { chargeitemdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				String[] arrayi1 = c.getChrgItmDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getContact().get(i0).getTelecom().size() < i1+1) { chargeitemdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = c.getChrgItmDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getContact().size() < i0+1) { chargeitemdefinition.addContact(); }
				String[] arrayi1 = c.getChrgItmDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getContact().get(i0).getTelecom().size() < i1+1) { chargeitemdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Copyright ********************************************************************************/
		if(c.getChrgItmDfnCopyright() != null ) {

			if(c.getChrgItmDfnCopyright().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnCopyright()==null) {} else {
			chargeitemdefinition.setCopyright(c.getChrgItmDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItmDfn_Dt ********************************************************************************/
		if(c.getChrgItmDfnDt() != null ) {

			if(c.getChrgItmDfnDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnDt()==null) {} else {
			chargeitemdefinition.setDate(c.getChrgItmDfnDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_DerivedFromUri ********************************************************************************/
		if(c.getChrgItmDfnDerivedFromUri() != null ) {

				for( String currListStrSplit : c.getChrgItmDfnDerivedFromUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitemdefinition.addDerivedFromUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ChrgItmDfn_Dscrptn ********************************************************************************/
		if(c.getChrgItmDfnDscrptn() != null ) {

			if(c.getChrgItmDfnDscrptn().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnDscrptn()==null) {} else {
			chargeitemdefinition.setDescription(c.getChrgItmDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItmDfn_EfctivePrd_End ********************************************************************************/
		if(c.getChrgItmDfnEfctivePrdEnd() != null ) {

			if(c.getChrgItmDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnEfctivePrdEnd()==null) {} else {
			chargeitemdefinition.getEffectivePeriod().setEnd(c.getChrgItmDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmDfnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_EfctivePrd_Strt ********************************************************************************/
		if(c.getChrgItmDfnEfctivePrdStrt() != null ) {

			if(c.getChrgItmDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnEfctivePrdStrt()==null) {} else {
			chargeitemdefinition.getEffectivePeriod().setStart(c.getChrgItmDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmDfnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_Exprmtl ********************************************************************************/
		if(c.getChrgItmDfnExprmtl() != null ) {

			if(c.getChrgItmDfnExprmtl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnExprmtl()==null) {} else {
			chargeitemdefinition.setExperimental(Boolean.parseBoolean(c.getChrgItmDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_Id_Assigner ********************************************************************************/
		if(c.getChrgItmDfnIdAssigner() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_Id_Prd_End ********************************************************************************/
		if(c.getChrgItmDfnIdPrdEnd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_Id_Prd_Strt ********************************************************************************/
		if(c.getChrgItmDfnIdPrdStrt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_Id_Sys ********************************************************************************/
		if(c.getChrgItmDfnIdSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitemdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitemdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitemdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitemdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitemdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Id_Typ_Txt ********************************************************************************/
		if(c.getChrgItmDfnIdTypTxt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Id_Use ********************************************************************************/
		if(c.getChrgItmDfnIdUse() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_Id_Vl ********************************************************************************/
		if(c.getChrgItmDfnIdVl() != null ) {

			String[] arrayi0 = c.getChrgItmDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getIdentifier().size() < i0+1) { chargeitemdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_Instance ********************************************************************************/
		if(c.getChrgItmDfnInstance() != null ) {

				for( String currListStrSplit : c.getChrgItmDfnInstance().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitemdefinition.addInstance(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getJurisdiction().size() < i0+1) { chargeitemdefinition.addJurisdiction(); }
				String[] arrayi1 = c.getChrgItmDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { chargeitemdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getJurisdiction().size() < i0+1) { chargeitemdefinition.addJurisdiction(); }
				String[] arrayi1 = c.getChrgItmDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { chargeitemdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getJurisdiction().size() < i0+1) { chargeitemdefinition.addJurisdiction(); }
				String[] arrayi1 = c.getChrgItmDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { chargeitemdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getJurisdiction().size() < i0+1) { chargeitemdefinition.addJurisdiction(); }
				String[] arrayi1 = c.getChrgItmDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { chargeitemdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getJurisdiction().size() < i0+1) { chargeitemdefinition.addJurisdiction(); }
				String[] arrayi1 = c.getChrgItmDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { chargeitemdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_Jrsdctn_Txt ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getJurisdiction().size() < i0+1) { chargeitemdefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_LastReviewDt ********************************************************************************/
		if(c.getChrgItmDfnLastReviewDt() != null ) {

			if(c.getChrgItmDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnLastReviewDt()==null) {} else {
			chargeitemdefinition.setLastReviewDate(c.getChrgItmDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmDfnLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_PartOf ********************************************************************************/
		if(c.getChrgItmDfnPartOf() != null ) {

				for( String currListStrSplit : c.getChrgItmDfnPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitemdefinition.addPartOf(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Dscrptn ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpApplicabilityDscrptn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpApplicabilityDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpApplicabilityDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getApplicability().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addApplicability(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getApplicability().get(i1).setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Exprsn ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpApplicabilityExprsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpApplicabilityExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpApplicabilityExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getApplicability().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addApplicability(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getApplicability().get(i1).setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Lnguage ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpApplicabilityLnguage() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpApplicabilityLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpApplicabilityLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getApplicability().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addApplicability(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getApplicability().get(i1).setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntAmntCrncy() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getAmount().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntAmntVl() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getAmount().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					String[] arrayi2 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					String[] arrayi2 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					String[] arrayi2 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					String[] arrayi2 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					String[] arrayi2 = c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdTxt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Factor ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntFactor() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).setFactor((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Typ ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntTyp() != null ) {

			String[] arrayi0 = c.getChrgItmDfnPrptyGrpPriceCmpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getPropertyGroup().size() < i0+1) { chargeitemdefinition.addPropertyGroup(); }
				String[] arrayi1 = c.getChrgItmDfnPrptyGrpPriceCmpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().size() < i1+1) { chargeitemdefinition.getPropertyGroup().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getPropertyGroup().get(i0).getPriceComponent().get(i1).setType(new org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPriceComponentTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_Pblshr ********************************************************************************/
		if(c.getChrgItmDfnPblshr() != null ) {

			if(c.getChrgItmDfnPblshr().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnPblshr()==null) {} else {
			chargeitemdefinition.setPublisher(c.getChrgItmDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItmDfn_Replaces ********************************************************************************/
		if(c.getChrgItmDfnReplaces() != null ) {

				for( String currListStrSplit : c.getChrgItmDfnReplaces().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitemdefinition.addReplaces(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ChrgItmDfn_Sts ********************************************************************************/
		if(c.getChrgItmDfnSts() != null ) {

			if(c.getChrgItmDfnSts().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnSts()==null) {} else {
			chargeitemdefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(c.getChrgItmDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItmDfn_Ttl ********************************************************************************/
		if(c.getChrgItmDfnTtl() != null ) {

			if(c.getChrgItmDfnTtl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnTtl()==null) {} else {
			chargeitemdefinition.setTitle(c.getChrgItmDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItmDfn_Url ********************************************************************************/
		if(c.getChrgItmDfnUrl() != null ) {

			if(c.getChrgItmDfnUrl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnUrl()==null) {} else {
			chargeitemdefinition.setUrl(c.getChrgItmDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				String[] arrayi1 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				String[] arrayi1 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				String[] arrayi1 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				String[] arrayi1 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				String[] arrayi1 = c.getChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ChrgItmDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = c.getChrgItmDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitemdefinition.getUseContext().size() < i0+1) { chargeitemdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitemdefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItmDfn_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnVrsn() != null ) {

			if(c.getChrgItmDfnVrsn().replace("[","").replace("]","").equals("NULL") | c.getChrgItmDfnVrsn()==null) {} else {
			chargeitemdefinition.setVersion(c.getChrgItmDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return chargeitemdefinition;
	}
}
