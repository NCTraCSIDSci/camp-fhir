package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CapabilityStatement;
public class CapabilityStatementConversion 
{
	public org.hl7.fhir.r4.model.CapabilityStatement CapabilityStatements(CapabilityStatement c) throws ParseException
	{
		org.hl7.fhir.r4.model.CapabilityStatement capabilitystatement = new org.hl7.fhir.r4.model.CapabilityStatement();

		/******************** id ********************************************************************************/
		capabilitystatement.setId(c.getId());

		/******************** CapbltyStmnt_Cntct_Nm ********************************************************************************/
		if(c.getCapbltyStmntCntctNm() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				String[] arrayi1 = c.getCapbltyStmntCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getContact().get(i0).getTelecom().size() < i1+1) { capabilitystatement.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				String[] arrayi1 = c.getCapbltyStmntCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getContact().get(i0).getTelecom().size() < i1+1) { capabilitystatement.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmRnk() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				String[] arrayi1 = c.getCapbltyStmntCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getContact().get(i0).getTelecom().size() < i1+1) { capabilitystatement.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Sys ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				String[] arrayi1 = c.getCapbltyStmntCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getContact().get(i0).getTelecom().size() < i1+1) { capabilitystatement.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Use ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmUse() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				String[] arrayi1 = c.getCapbltyStmntCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getContact().get(i0).getTelecom().size() < i1+1) { capabilitystatement.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCapbltyStmntCntctTlcmVl() != null ) {

			String[] arrayi0 = c.getCapbltyStmntCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getContact().size() < i0+1) { capabilitystatement.addContact(); }
				String[] arrayi1 = c.getCapbltyStmntCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getContact().get(i0).getTelecom().size() < i1+1) { capabilitystatement.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Copyright ********************************************************************************/
		if(c.getCapbltyStmntCopyright() != null ) {

			if(c.getCapbltyStmntCopyright().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntCopyright()==null) {} else {
			capabilitystatement.setCopyright(c.getCapbltyStmntCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Dt ********************************************************************************/
		if(c.getCapbltyStmntDt() != null ) {

			if(c.getCapbltyStmntDt().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntDt()==null) {} else {
			capabilitystatement.setDate(c.getCapbltyStmntDt().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCapbltyStmntDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_Dscrptn ********************************************************************************/
		if(c.getCapbltyStmntDscrptn() != null ) {

			if(c.getCapbltyStmntDscrptn().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntDscrptn()==null) {} else {
			capabilitystatement.setDescription(c.getCapbltyStmntDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Doc_Docation ********************************************************************************/
		if(c.getCapbltyStmntDocDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntDocDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getDocument().size() < i0+1) { capabilitystatement.addDocument(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getDocument().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Doc_Mode ********************************************************************************/
		if(c.getCapbltyStmntDocMode() != null ) {

			String[] arrayi0 = c.getCapbltyStmntDocMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getDocument().size() < i0+1) { capabilitystatement.addDocument(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getDocument().get(i0).setMode(new org.hl7.fhir.r4.model.CapabilityStatement.DocumentModeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_Doc_Profile ********************************************************************************/
		if(c.getCapbltyStmntDocProfile() != null ) {

			String[] arrayi0 = c.getCapbltyStmntDocProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getDocument().size() < i0+1) { capabilitystatement.addDocument(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getDocument().get(i0).setProfile(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Exprmtl ********************************************************************************/
		if(c.getCapbltyStmntExprmtl() != null ) {

			if(c.getCapbltyStmntExprmtl().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntExprmtl()==null) {} else {
			capabilitystatement.setExperimental(Boolean.parseBoolean(c.getCapbltyStmntExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_FhirVrsn ********************************************************************************/
		if(c.getCapbltyStmntFhirVrsn() != null ) {

			if(c.getCapbltyStmntFhirVrsn().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntFhirVrsn()==null) {} else {
			capabilitystatement.setFhirVersion(new org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory().fromCode(c.getCapbltyStmntFhirVrsn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_Frmat ********************************************************************************/
		if(c.getCapbltyStmntFrmat() != null ) {

				for( String currListStrSplit : c.getCapbltyStmntFrmat().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			capabilitystatement.addFormat(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CapbltyStmnt_Implementation_Custodian ********************************************************************************/
		if(c.getCapbltyStmntImplementationCustodian() != null ) {

			if(c.getCapbltyStmntImplementationCustodian().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntImplementationCustodian()==null) {} else {
			capabilitystatement.getImplementation().setCustodian(new org.hl7.fhir.r4.model.Reference(c.getCapbltyStmntImplementationCustodian().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_Implementation_Dscrptn ********************************************************************************/
		if(c.getCapbltyStmntImplementationDscrptn() != null ) {

			if(c.getCapbltyStmntImplementationDscrptn().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntImplementationDscrptn()==null) {} else {
			capabilitystatement.getImplementation().setDescription(c.getCapbltyStmntImplementationDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Implementation_Url ********************************************************************************/
		if(c.getCapbltyStmntImplementationUrl() != null ) {

			if(c.getCapbltyStmntImplementationUrl().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntImplementationUrl()==null) {} else {
			capabilitystatement.getImplementation().setUrl(c.getCapbltyStmntImplementationUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_ImplementationGuide ********************************************************************************/
		if(c.getCapbltyStmntImplementationGuide() != null ) {

				for( String currListStrSplit : c.getCapbltyStmntImplementationGuide().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			capabilitystatement.addImplementationGuide(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CapbltyStmnt_Imports ********************************************************************************/
		if(c.getCapbltyStmntImports() != null ) {

				for( String currListStrSplit : c.getCapbltyStmntImports().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			capabilitystatement.addImports(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CapbltyStmnt_Instantiates ********************************************************************************/
		if(c.getCapbltyStmntInstantiates() != null ) {

				for( String currListStrSplit : c.getCapbltyStmntInstantiates().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			capabilitystatement.addInstantiates(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getJurisdiction().size() < i0+1) { capabilitystatement.addJurisdiction(); }
				String[] arrayi1 = c.getCapbltyStmntJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getJurisdiction().get(i0).getCoding().size() < i1+1) { capabilitystatement.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = c.getCapbltyStmntJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getJurisdiction().size() < i0+1) { capabilitystatement.addJurisdiction(); }
				String[] arrayi1 = c.getCapbltyStmntJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getJurisdiction().get(i0).getCoding().size() < i1+1) { capabilitystatement.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getJurisdiction().size() < i0+1) { capabilitystatement.addJurisdiction(); }
				String[] arrayi1 = c.getCapbltyStmntJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getJurisdiction().get(i0).getCoding().size() < i1+1) { capabilitystatement.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getJurisdiction().size() < i0+1) { capabilitystatement.addJurisdiction(); }
				String[] arrayi1 = c.getCapbltyStmntJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getJurisdiction().get(i0).getCoding().size() < i1+1) { capabilitystatement.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getJurisdiction().size() < i0+1) { capabilitystatement.addJurisdiction(); }
				String[] arrayi1 = c.getCapbltyStmntJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getJurisdiction().get(i0).getCoding().size() < i1+1) { capabilitystatement.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Jrsdctn_Txt ********************************************************************************/
		if(c.getCapbltyStmntJrsdctnTxt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getJurisdiction().size() < i0+1) { capabilitystatement.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Kind ********************************************************************************/
		if(c.getCapbltyStmntKind() != null ) {

			if(c.getCapbltyStmntKind().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntKind()==null) {} else {
			capabilitystatement.setKind(new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKindEnumFactory().fromCode(c.getCapbltyStmntKind().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_Messaging_Docation ********************************************************************************/
		if(c.getCapbltyStmntMessagingDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getMessaging().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Addr ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointAddr() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingEndpointAddr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingEndpointAddr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getEndpoint().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addEndpoint(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getEndpoint().get(i1).setAddress(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Cd ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingEndpointProtocolCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingEndpointProtocolCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getEndpoint().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addEndpoint(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getEndpoint().get(i1).getProtocol().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Dsply ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolDsply() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingEndpointProtocolDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingEndpointProtocolDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getEndpoint().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addEndpoint(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getEndpoint().get(i1).getProtocol().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Sys ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingEndpointProtocolSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingEndpointProtocolSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getEndpoint().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addEndpoint(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getEndpoint().get(i1).getProtocol().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolUsrSltd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingEndpointProtocolUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingEndpointProtocolUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getEndpoint().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addEndpoint(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getEndpoint().get(i1).getProtocol().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_Endpoint_Protocol_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntMessagingEndpointProtocolVrsn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingEndpointProtocolVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingEndpointProtocolVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getEndpoint().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addEndpoint(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getEndpoint().get(i1).getProtocol().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_ReliableCache ********************************************************************************/
		if(c.getCapbltyStmntMessagingReliableCache() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingReliableCache().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getMessaging().get(i0).setReliableCache(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_Messaging_SupportedMsg_Dfn ********************************************************************************/
		if(c.getCapbltyStmntMessagingSupportedMsgDfn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingSupportedMsgDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingSupportedMsgDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getSupportedMessage().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addSupportedMessage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getSupportedMessage().get(i1).setDefinition(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Messaging_SupportedMsg_Mode ********************************************************************************/
		if(c.getCapbltyStmntMessagingSupportedMsgMode() != null ) {

			String[] arrayi0 = c.getCapbltyStmntMessagingSupportedMsgMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getMessaging().size() < i0+1) { capabilitystatement.addMessaging(); }
				String[] arrayi1 = c.getCapbltyStmntMessagingSupportedMsgMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getMessaging().get(i0).getSupportedMessage().size() < i1+1) { capabilitystatement.getMessaging().get(i0).addSupportedMessage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getMessaging().get(i0).getSupportedMessage().get(i1).setMode(new org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityModeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Nm ********************************************************************************/
		if(c.getCapbltyStmntNm() != null ) {

			if(c.getCapbltyStmntNm().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntNm()==null) {} else {
			capabilitystatement.setName(c.getCapbltyStmntNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_PatchFrmat ********************************************************************************/
		if(c.getCapbltyStmntPatchFrmat() != null ) {

				for( String currListStrSplit : c.getCapbltyStmntPatchFrmat().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			capabilitystatement.addPatchFormat(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CapbltyStmnt_Pblshr ********************************************************************************/
		if(c.getCapbltyStmntPblshr() != null ) {

			if(c.getCapbltyStmntPblshr().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntPblshr()==null) {} else {
			capabilitystatement.setPublisher(c.getCapbltyStmntPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Prpse ********************************************************************************/
		if(c.getCapbltyStmntPrpse() != null ) {

			if(c.getCapbltyStmntPrpse().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntPrpse()==null) {} else {
			capabilitystatement.setPurpose(c.getCapbltyStmntPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Rest_Cmprtmnt ********************************************************************************/
		if(c.getCapbltyStmntRestCmprtmnt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestCmprtmnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {capabilitystatement.getRest().get(i0).addCompartment(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getRest().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Rest_Interaction_Cd ********************************************************************************/
		if(c.getCapbltyStmntRestInteractionCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestInteractionCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestInteractionCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getInteraction().size() < i1+1) { capabilitystatement.getRest().get(i0).addInteraction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getInteraction().get(i1).setCode(new org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteractionEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Interaction_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestInteractionDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestInteractionDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestInteractionDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getInteraction().size() < i1+1) { capabilitystatement.getRest().get(i0).addInteraction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getInteraction().get(i1).setDocumentation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Mode ********************************************************************************/
		if(c.getCapbltyStmntRestMode() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getRest().get(i0).setMode(new org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityModeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_Rest_Oprtn_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestOprtnDfn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestOprtnDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestOprtnDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getOperation().size() < i1+1) { capabilitystatement.getRest().get(i0).addOperation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getOperation().get(i1).setDefinition(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Oprtn_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestOprtnDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestOprtnDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestOprtnDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getOperation().size() < i1+1) { capabilitystatement.getRest().get(i0).addOperation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getOperation().get(i1).setDocumentation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Oprtn_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestOprtnNm() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestOprtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestOprtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getOperation().size() < i1+1) { capabilitystatement.getRest().get(i0).addOperation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getOperation().get(i1).setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalCreate ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcCndtnalCreate() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcCndtnalCreate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcCndtnalCreate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setConditionalCreate(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalDelete ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcCndtnalDelete() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcCndtnalDelete().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcCndtnalDelete().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setConditionalDelete(new org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatusEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalRead ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcCndtnalRead() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcCndtnalRead().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcCndtnalRead().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setConditionalRead(new org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatusEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_CndtnalUpdate ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcCndtnalUpdate() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcCndtnalUpdate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcCndtnalUpdate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setConditionalUpdate(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setDocumentation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Interaction_Cd ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcInteractionCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcInteractionCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcInteractionCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcInteractionCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getInteraction().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addInteraction(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getInteraction().get(i2).setCode(new org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteractionEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Interaction_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcInteractionDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcInteractionDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcInteractionDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcInteractionDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getInteraction().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addInteraction(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getInteraction().get(i2).setDocumentation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcOprtnDfn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcOprtnDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcOprtnDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcOprtnDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getOperation().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addOperation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getOperation().get(i2).setDefinition(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcOprtnDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcOprtnDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcOprtnDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcOprtnDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getOperation().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addOperation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getOperation().get(i2).setDocumentation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Oprtn_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcOprtnNm() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcOprtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcOprtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcOprtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getOperation().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addOperation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getOperation().get(i2).setName(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Profile ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcProfile() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setProfile(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_ReadHis ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcReadHis() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcReadHis().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcReadHis().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setReadHistory(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchInclude ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchInclude() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSrchInclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSrchInclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).addSearchInclude(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamDfn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSrchParamDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSrchParamDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcSrchParamDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addSearchParam(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().get(i2).setDefinition(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSrchParamDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSrchParamDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcSrchParamDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addSearchParam(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().get(i2).setDocumentation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamNm() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSrchParamNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSrchParamNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcSrchParamNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addSearchParam(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().get(i2).setName(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchParam_Typ ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchParamTyp() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSrchParamTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSrchParamTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					String[] arrayi2 = c.getCapbltyStmntRestRsrcSrchParamTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().size() < i2+1) { capabilitystatement.getRest().get(i0).getResource().get(i1).addSearchParam(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).getSearchParam().get(i2).setType(new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SrchRevInclude ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSrchRevInclude() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSrchRevInclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSrchRevInclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).addSearchRevInclude(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_SupportedProfile ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcSupportedProfile() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcSupportedProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcSupportedProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).addSupportedProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Typ ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcTyp() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_UpdateCreate ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcUpdateCreate() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcUpdateCreate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcUpdateCreate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setUpdateCreate(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Rsrc_Vrsning ********************************************************************************/
		if(c.getCapbltyStmntRestRsrcVrsning() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestRsrcVrsning().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestRsrcVrsning().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getResource().size() < i1+1) { capabilitystatement.getRest().get(i0).addResource(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getResource().get(i1).setVersioning(new org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicyEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_SrchParam_Dfn ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamDfn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSrchParamDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSrchParamDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSearchParam().size() < i1+1) { capabilitystatement.getRest().get(i0).addSearchParam(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getSearchParam().get(i1).setDefinition(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_SrchParam_Docation ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamDocation() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSrchParamDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSrchParamDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSearchParam().size() < i1+1) { capabilitystatement.getRest().get(i0).addSearchParam(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getSearchParam().get(i1).setDocumentation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_SrchParam_Nm ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamNm() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSrchParamNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSrchParamNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSearchParam().size() < i1+1) { capabilitystatement.getRest().get(i0).addSearchParam(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getSearchParam().get(i1).setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_SrchParam_Typ ********************************************************************************/
		if(c.getCapbltyStmntRestSrchParamTyp() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSrchParamTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSrchParamTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSearchParam().size() < i1+1) { capabilitystatement.getRest().get(i0).addSearchParam(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getSearchParam().get(i1).setType(new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Cors ********************************************************************************/
		if(c.getCapbltyStmntRestSecurityCors() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecurityCors().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().setCors(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Dscrptn ********************************************************************************/
		if(c.getCapbltyStmntRestSecurityDscrptn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecurityDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Cd ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecuritySrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSecuritySrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSecurity().getService().size() < i1+1) { capabilitystatement.getRest().get(i0).getSecurity().addService(); }
					String[] arrayi2 = c.getCapbltyStmntRestSecuritySrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().size() < i2+1) { capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Dsply ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgDsply() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecuritySrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSecuritySrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSecurity().getService().size() < i1+1) { capabilitystatement.getRest().get(i0).getSecurity().addService(); }
					String[] arrayi2 = c.getCapbltyStmntRestSecuritySrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().size() < i2+1) { capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Sys ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecuritySrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSecuritySrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSecurity().getService().size() < i1+1) { capabilitystatement.getRest().get(i0).getSecurity().addService(); }
					String[] arrayi2 = c.getCapbltyStmntRestSecuritySrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().size() < i2+1) { capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecuritySrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSecuritySrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSecurity().getService().size() < i1+1) { capabilitystatement.getRest().get(i0).getSecurity().addService(); }
					String[] arrayi2 = c.getCapbltyStmntRestSecuritySrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().size() < i2+1) { capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Cdg_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecuritySrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSecuritySrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSecurity().getService().size() < i1+1) { capabilitystatement.getRest().get(i0).getSecurity().addService(); }
					String[] arrayi2 = c.getCapbltyStmntRestSecuritySrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().size() < i2+1) { capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CapbltyStmnt_Rest_Security_Srv_Txt ********************************************************************************/
		if(c.getCapbltyStmntRestSecuritySrvTxt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntRestSecuritySrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getRest().size() < i0+1) { capabilitystatement.addRest(); }
				String[] arrayi1 = c.getCapbltyStmntRestSecuritySrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getRest().get(i0).getSecurity().getService().size() < i1+1) { capabilitystatement.getRest().get(i0).getSecurity().addService(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getRest().get(i0).getSecurity().getService().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_Software_Nm ********************************************************************************/
		if(c.getCapbltyStmntSoftwareNm() != null ) {

			if(c.getCapbltyStmntSoftwareNm().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntSoftwareNm()==null) {} else {
			capabilitystatement.getSoftware().setName(c.getCapbltyStmntSoftwareNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Software_ReleaseDt ********************************************************************************/
		if(c.getCapbltyStmntSoftwareReleaseDt() != null ) {

			if(c.getCapbltyStmntSoftwareReleaseDt().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntSoftwareReleaseDt()==null) {} else {
			capabilitystatement.getSoftware().setReleaseDate(c.getCapbltyStmntSoftwareReleaseDt().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntSoftwareReleaseDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCapbltyStmntSoftwareReleaseDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_Software_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntSoftwareVrsn() != null ) {

			if(c.getCapbltyStmntSoftwareVrsn().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntSoftwareVrsn()==null) {} else {
			capabilitystatement.getSoftware().setVersion(c.getCapbltyStmntSoftwareVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Sts ********************************************************************************/
		if(c.getCapbltyStmntSts() != null ) {

			if(c.getCapbltyStmntSts().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntSts()==null) {} else {
			capabilitystatement.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(c.getCapbltyStmntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CapbltyStmnt_Ttl ********************************************************************************/
		if(c.getCapbltyStmntTtl() != null ) {

			if(c.getCapbltyStmntTtl().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntTtl()==null) {} else {
			capabilitystatement.setTitle(c.getCapbltyStmntTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_Url ********************************************************************************/
		if(c.getCapbltyStmntUrl() != null ) {

			if(c.getCapbltyStmntUrl().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntUrl()==null) {} else {
			capabilitystatement.setUrl(c.getCapbltyStmntUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdDsply() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				String[] arrayi1 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				String[] arrayi1 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				String[] arrayi1 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				String[] arrayi1 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				String[] arrayi1 = c.getCapbltyStmntUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CapbltyStmnt_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCapbltyStmntUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = c.getCapbltyStmntUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(capabilitystatement.getUseContext().size() < i0+1) { capabilitystatement.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {capabilitystatement.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CapbltyStmnt_Vrsn ********************************************************************************/
		if(c.getCapbltyStmntVrsn() != null ) {

			if(c.getCapbltyStmntVrsn().replace("[","").replace("]","").equals("NULL") | c.getCapbltyStmntVrsn()==null) {} else {
			capabilitystatement.setVersion(c.getCapbltyStmntVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return capabilitystatement;
	}
}
