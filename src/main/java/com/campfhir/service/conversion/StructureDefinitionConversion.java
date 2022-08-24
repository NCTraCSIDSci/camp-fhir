package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.StructureDefinition;
public class StructureDefinitionConversion 
{
	public org.hl7.fhir.r4.model.StructureDefinition StructureDefinitions(StructureDefinition s) throws ParseException
	{
		org.hl7.fhir.r4.model.StructureDefinition structuredefinition = new org.hl7.fhir.r4.model.StructureDefinition();

		/******************** id ********************************************************************************/
		structuredefinition.setId(s.getId());

		/******************** StrctrDfn_Abstract ********************************************************************************/
		if(s.getStrctrDfnAbstract() != null ) {

			if(s.getStrctrDfnAbstract().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnAbstract()==null) {} else {
			structuredefinition.setAbstract(Boolean.parseBoolean(s.getStrctrDfnAbstract().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_BaseDfn ********************************************************************************/
		if(s.getStrctrDfnBaseDfn() != null ) {

			if(s.getStrctrDfnBaseDfn().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnBaseDfn()==null) {} else {
			structuredefinition.setBaseDefinition(s.getStrctrDfnBaseDfn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Cntct_Nm ********************************************************************************/
		if(s.getStrctrDfnCntctNm() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				String[] arrayi1 = s.getStrctrDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getContact().get(i0).getTelecom().size() < i1+1) { structuredefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				String[] arrayi1 = s.getStrctrDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getContact().get(i0).getTelecom().size() < i1+1) { structuredefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				String[] arrayi1 = s.getStrctrDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getContact().get(i0).getTelecom().size() < i1+1) { structuredefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				String[] arrayi1 = s.getStrctrDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getContact().get(i0).getTelecom().size() < i1+1) { structuredefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				String[] arrayi1 = s.getStrctrDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getContact().get(i0).getTelecom().size() < i1+1) { structuredefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContact().size() < i0+1) { structuredefinition.addContact(); }
				String[] arrayi1 = s.getStrctrDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getContact().get(i0).getTelecom().size() < i1+1) { structuredefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Cntxt_Exprsn ********************************************************************************/
		if(s.getStrctrDfnCntxtExprsn() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntxtExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContext().size() < i0+1) { structuredefinition.addContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getContext().get(i0).setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Cntxt_Typ ********************************************************************************/
		if(s.getStrctrDfnCntxtTyp() != null ) {

			String[] arrayi0 = s.getStrctrDfnCntxtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getContext().size() < i0+1) { structuredefinition.addContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getContext().get(i0).setType(new org.hl7.fhir.r4.model.StructureDefinition.ExtensionContextTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_CntxtInvariant ********************************************************************************/
		if(s.getStrctrDfnCntxtInvariant() != null ) {

				for( String currListStrSplit : s.getStrctrDfnCntxtInvariant().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			structuredefinition.addContextInvariant(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** StrctrDfn_Copyright ********************************************************************************/
		if(s.getStrctrDfnCopyright() != null ) {

			if(s.getStrctrDfnCopyright().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnCopyright()==null) {} else {
			structuredefinition.setCopyright(s.getStrctrDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Dt ********************************************************************************/
		if(s.getStrctrDfnDt() != null ) {

			if(s.getStrctrDfnDt().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnDt()==null) {} else {
			structuredefinition.setDate(s.getStrctrDfnDt().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getStrctrDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_Derivation ********************************************************************************/
		if(s.getStrctrDfnDerivation() != null ) {

			if(s.getStrctrDfnDerivation().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnDerivation()==null) {} else {
			structuredefinition.setDerivation(new org.hl7.fhir.r4.model.StructureDefinition.TypeDerivationRuleEnumFactory().fromCode(s.getStrctrDfnDerivation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_Dscrptn ********************************************************************************/
		if(s.getStrctrDfnDscrptn() != null ) {

			if(s.getStrctrDfnDscrptn().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnDscrptn()==null) {} else {
			structuredefinition.setDescription(s.getStrctrDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Exprmtl ********************************************************************************/
		if(s.getStrctrDfnExprmtl() != null ) {

			if(s.getStrctrDfnExprmtl().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnExprmtl()==null) {} else {
			structuredefinition.setExperimental(Boolean.parseBoolean(s.getStrctrDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_FhirVrsn ********************************************************************************/
		if(s.getStrctrDfnFhirVrsn() != null ) {

			if(s.getStrctrDfnFhirVrsn().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnFhirVrsn()==null) {} else {
			structuredefinition.setFhirVersion(new org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory().fromCode(s.getStrctrDfnFhirVrsn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_Id_Assigner ********************************************************************************/
		if(s.getStrctrDfnIdAssigner() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_Id_Prd_End ********************************************************************************/
		if(s.getStrctrDfnIdPrdEnd() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_Id_Prd_Strt ********************************************************************************/
		if(s.getStrctrDfnIdPrdStrt() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_Id_Sys ********************************************************************************/
		if(s.getStrctrDfnIdSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				String[] arrayi1 = s.getStrctrDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { structuredefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				String[] arrayi1 = s.getStrctrDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { structuredefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				String[] arrayi1 = s.getStrctrDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { structuredefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				String[] arrayi1 = s.getStrctrDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { structuredefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				String[] arrayi1 = s.getStrctrDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { structuredefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Id_Typ_Txt ********************************************************************************/
		if(s.getStrctrDfnIdTypTxt() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Id_Use ********************************************************************************/
		if(s.getStrctrDfnIdUse() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_Id_Vl ********************************************************************************/
		if(s.getStrctrDfnIdVl() != null ) {

			String[] arrayi0 = s.getStrctrDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getIdentifier().size() < i0+1) { structuredefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getJurisdiction().size() < i0+1) { structuredefinition.addJurisdiction(); }
				String[] arrayi1 = s.getStrctrDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { structuredefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = s.getStrctrDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getJurisdiction().size() < i0+1) { structuredefinition.addJurisdiction(); }
				String[] arrayi1 = s.getStrctrDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { structuredefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getJurisdiction().size() < i0+1) { structuredefinition.addJurisdiction(); }
				String[] arrayi1 = s.getStrctrDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { structuredefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getStrctrDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getJurisdiction().size() < i0+1) { structuredefinition.addJurisdiction(); }
				String[] arrayi1 = s.getStrctrDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { structuredefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = s.getStrctrDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getJurisdiction().size() < i0+1) { structuredefinition.addJurisdiction(); }
				String[] arrayi1 = s.getStrctrDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { structuredefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_Jrsdctn_Txt ********************************************************************************/
		if(s.getStrctrDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = s.getStrctrDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getJurisdiction().size() < i0+1) { structuredefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Keyword_Cd ********************************************************************************/
		if(s.getStrctrDfnKeywordCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnKeywordCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getKeyword().size() < i0+1) { structuredefinition.addKeyword(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getKeyword().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Keyword_Dsply ********************************************************************************/
		if(s.getStrctrDfnKeywordDsply() != null ) {

			String[] arrayi0 = s.getStrctrDfnKeywordDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getKeyword().size() < i0+1) { structuredefinition.addKeyword(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getKeyword().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Keyword_Sys ********************************************************************************/
		if(s.getStrctrDfnKeywordSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnKeywordSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getKeyword().size() < i0+1) { structuredefinition.addKeyword(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getKeyword().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Keyword_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnKeywordUsrSltd() != null ) {

			String[] arrayi0 = s.getStrctrDfnKeywordUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getKeyword().size() < i0+1) { structuredefinition.addKeyword(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getKeyword().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_Keyword_Vrsn ********************************************************************************/
		if(s.getStrctrDfnKeywordVrsn() != null ) {

			String[] arrayi0 = s.getStrctrDfnKeywordVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getKeyword().size() < i0+1) { structuredefinition.addKeyword(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getKeyword().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Kind ********************************************************************************/
		if(s.getStrctrDfnKind() != null ) {

			if(s.getStrctrDfnKind().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnKind()==null) {} else {
			structuredefinition.setKind(new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionKindEnumFactory().fromCode(s.getStrctrDfnKind().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_Mapping_Comment ********************************************************************************/
		if(s.getStrctrDfnMappingComment() != null ) {

			String[] arrayi0 = s.getStrctrDfnMappingComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getMapping().size() < i0+1) { structuredefinition.addMapping(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getMapping().get(i0).setComment(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Mapping_Identity ********************************************************************************/
		if(s.getStrctrDfnMappingIdentity() != null ) {

			String[] arrayi0 = s.getStrctrDfnMappingIdentity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getMapping().size() < i0+1) { structuredefinition.addMapping(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getMapping().get(i0).setIdentity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Mapping_Nm ********************************************************************************/
		if(s.getStrctrDfnMappingNm() != null ) {

			String[] arrayi0 = s.getStrctrDfnMappingNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getMapping().size() < i0+1) { structuredefinition.addMapping(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getMapping().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Mapping_Uri ********************************************************************************/
		if(s.getStrctrDfnMappingUri() != null ) {

			String[] arrayi0 = s.getStrctrDfnMappingUri().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getMapping().size() < i0+1) { structuredefinition.addMapping(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getMapping().get(i0).setUri(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_Nm ********************************************************************************/
		if(s.getStrctrDfnNm() != null ) {

			if(s.getStrctrDfnNm().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnNm()==null) {} else {
			structuredefinition.setName(s.getStrctrDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Pblshr ********************************************************************************/
		if(s.getStrctrDfnPblshr() != null ) {

			if(s.getStrctrDfnPblshr().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnPblshr()==null) {} else {
			structuredefinition.setPublisher(s.getStrctrDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Prpse ********************************************************************************/
		if(s.getStrctrDfnPrpse() != null ) {

			if(s.getStrctrDfnPrpse().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnPrpse()==null) {} else {
			structuredefinition.setPurpose(s.getStrctrDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Sts ********************************************************************************/
		if(s.getStrctrDfnSts() != null ) {

			if(s.getStrctrDfnSts().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnSts()==null) {} else {
			structuredefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(s.getStrctrDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** StrctrDfn_Ttl ********************************************************************************/
		if(s.getStrctrDfnTtl() != null ) {

			if(s.getStrctrDfnTtl().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnTtl()==null) {} else {
			structuredefinition.setTitle(s.getStrctrDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Typ ********************************************************************************/
		if(s.getStrctrDfnTyp() != null ) {

			if(s.getStrctrDfnTyp().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnTyp()==null) {} else {
			structuredefinition.setType(s.getStrctrDfnTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_Url ********************************************************************************/
		if(s.getStrctrDfnUrl() != null ) {

			if(s.getStrctrDfnUrl().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnUrl()==null) {} else {
			structuredefinition.setUrl(s.getStrctrDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** StrctrDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				String[] arrayi1 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { structuredefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				String[] arrayi1 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { structuredefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				String[] arrayi1 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { structuredefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				String[] arrayi1 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { structuredefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				String[] arrayi1 = s.getStrctrDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { structuredefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {structuredefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** StrctrDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = s.getStrctrDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(structuredefinition.getUseContext().size() < i0+1) { structuredefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {structuredefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** StrctrDfn_Vrsn ********************************************************************************/
		if(s.getStrctrDfnVrsn() != null ) {

			if(s.getStrctrDfnVrsn().replace("[","").replace("]","").equals("NULL") | s.getStrctrDfnVrsn()==null) {} else {
			structuredefinition.setVersion(s.getStrctrDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return structuredefinition;
	}
}
