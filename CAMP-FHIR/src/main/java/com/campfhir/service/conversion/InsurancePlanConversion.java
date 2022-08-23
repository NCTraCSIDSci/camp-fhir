package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.InsurancePlan;
public class InsurancePlanConversion 
{
	public org.hl7.fhir.r4.model.InsurancePlan InsurancePlans(InsurancePlan i) throws ParseException
	{
		org.hl7.fhir.r4.model.InsurancePlan insuranceplan = new org.hl7.fhir.r4.model.InsurancePlan();

		/******************** id ********************************************************************************/
		insuranceplan.setId(i.getId());

		/******************** InsrncPln_AdministeredBy ********************************************************************************/
		if(i.getInsrncPlnAdministeredBy() != null ) {

			if(i.getInsrncPlnAdministeredBy().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnAdministeredBy()==null) {} else {
			insuranceplan.setAdministeredBy(new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnAdministeredBy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** InsrncPln_Alias ********************************************************************************/
		if(i.getInsrncPlnAlias() != null ) {

				for( String currListStrSplit : i.getInsrncPlnAlias().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			insuranceplan.addAlias(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** InsrncPln_Cntct_Addr_City ********************************************************************************/
		if(i.getInsrncPlnCntctAddrCity() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_Cntry ********************************************************************************/
		if(i.getInsrncPlnCntctAddrCntry() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_District ********************************************************************************/
		if(i.getInsrncPlnCntctAddrDistrict() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_Line ********************************************************************************/
		if(i.getInsrncPlnCntctAddrLine() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getContact().get(i0).getAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Addr_Prd_End ********************************************************************************/
		if(i.getInsrncPlnCntctAddrPrdEnd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnCntctAddrPrdStrt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_PostalCd ********************************************************************************/
		if(i.getInsrncPlnCntctAddrPostalCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_State ********************************************************************************/
		if(i.getInsrncPlnCntctAddrState() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_Txt ********************************************************************************/
		if(i.getInsrncPlnCntctAddrTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_Typ ********************************************************************************/
		if(i.getInsrncPlnCntctAddrTyp() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Addr_Use ********************************************************************************/
		if(i.getInsrncPlnCntctAddrUse() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Nm_Fmly ********************************************************************************/
		if(i.getInsrncPlnCntctNmFmly() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getName().setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Nm_Given ********************************************************************************/
		if(i.getInsrncPlnCntctNmGiven() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getContact().get(i0).getName().addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Nm_Prd_End ********************************************************************************/
		if(i.getInsrncPlnCntctNmPrdEnd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getName().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnCntctNmPrdStrt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getName().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Nm_Prefix ********************************************************************************/
		if(i.getInsrncPlnCntctNmPrefix() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getContact().get(i0).getName().addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Nm_Suffix ********************************************************************************/
		if(i.getInsrncPlnCntctNmSuffix() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getContact().get(i0).getName().addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Nm_Txt ********************************************************************************/
		if(i.getInsrncPlnCntctNmTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getName().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Nm_Use ********************************************************************************/
		if(i.getInsrncPlnCntctNmUse() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getName().setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctPrpseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctPrpseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { insuranceplan.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getPurpose().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctPrpseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctPrpseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { insuranceplan.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getPurpose().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctPrpseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctPrpseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { insuranceplan.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getPurpose().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctPrpseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctPrpseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { insuranceplan.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getPurpose().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctPrpseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctPrpseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { insuranceplan.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getPurpose().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Prpse_Txt ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctPrpseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getContact().get(i0).getPurpose().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getTelecom().size() < i1+1) { insuranceplan.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getTelecom().size() < i1+1) { insuranceplan.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Tlcm_Rnk ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmRnk() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getTelecom().size() < i1+1) { insuranceplan.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Tlcm_Sys ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getTelecom().size() < i1+1) { insuranceplan.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Tlcm_Use ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmUse() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getTelecom().size() < i1+1) { insuranceplan.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cntct_Tlcm_Vl ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmVl() != null ) {

			String[] arrayi0 = i.getInsrncPlnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getContact().size() < i0+1) { insuranceplan.addContact(); }
				String[] arrayi1 = i.getInsrncPlnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getContact().get(i0).getTelecom().size() < i1+1) { insuranceplan.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						String[] arrayi3 = i.getInsrncPlnCvgBnftLmtCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().size() < i3+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						String[] arrayi3 = i.getInsrncPlnCvgBnftLmtCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().size() < i3+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						String[] arrayi3 = i.getInsrncPlnCvgBnftLmtCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().size() < i3+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						String[] arrayi3 = i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().size() < i3+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						String[] arrayi3 = i.getInsrncPlnCvgBnftLmtCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().size() < i3+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Txt ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getCode().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getValue().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Cmprtr ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlCmprtr() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getValue().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getValue().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Unt ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlUnt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getValue().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Vl ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlVl() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftLmtVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftLmtVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftLmtVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).addLimit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getLimit().get(i2).getValue().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Rqrment ********************************************************************************/
		if(i.getInsrncPlnCvgBnftRqrment() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftRqrment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftRqrment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).setRequirement(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					String[] arrayi2 = i.getInsrncPlnCvgBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getBenefit().size() < i1+1) { insuranceplan.getCoverage().get(i0).addBenefit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getBenefit().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Network ********************************************************************************/
		if(i.getInsrncPlnCvgNetwork() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgNetwork().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getCoverage().get(i0).addNetwork(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getCoverage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getCoverage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getCoverage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getCoverage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				String[] arrayi1 = i.getInsrncPlnCvgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getCoverage().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getCoverage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getCoverage().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Cvg_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnCvgTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnCvgTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getCoverage().size() < i0+1) { insuranceplan.addCoverage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getCoverage().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_CvgArea ********************************************************************************/
		if(i.getInsrncPlnCvgArea() != null ) {

				for( String currListStrSplit : i.getInsrncPlnCvgArea().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			insuranceplan.addCoverageArea(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** InsrncPln_Endpoint ********************************************************************************/
		if(i.getInsrncPlnEndpoint() != null ) {

				for( String currListStrSplit : i.getInsrncPlnEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			insuranceplan.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** InsrncPln_Id_Assigner ********************************************************************************/
		if(i.getInsrncPlnIdAssigner() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Id_Prd_End ********************************************************************************/
		if(i.getInsrncPlnIdPrdEnd() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Id_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnIdPrdStrt() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Id_Sys ********************************************************************************/
		if(i.getInsrncPlnIdSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				String[] arrayi1 = i.getInsrncPlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				String[] arrayi1 = i.getInsrncPlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				String[] arrayi1 = i.getInsrncPlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				String[] arrayi1 = i.getInsrncPlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				String[] arrayi1 = i.getInsrncPlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Id_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnIdTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Id_Use ********************************************************************************/
		if(i.getInsrncPlnIdUse() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** InsrncPln_Id_Vl ********************************************************************************/
		if(i.getInsrncPlnIdVl() != null ) {

			String[] arrayi0 = i.getInsrncPlnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getIdentifier().size() < i0+1) { insuranceplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Nm ********************************************************************************/
		if(i.getInsrncPlnNm() != null ) {

			if(i.getInsrncPlnNm().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnNm()==null) {} else {
			insuranceplan.setName(i.getInsrncPlnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** InsrncPln_Network ********************************************************************************/
		if(i.getInsrncPlnNetwork() != null ) {

				for( String currListStrSplit : i.getInsrncPlnNetwork().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			insuranceplan.addNetwork(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** InsrncPln_OwnedBy ********************************************************************************/
		if(i.getInsrncPlnOwnedBy() != null ) {

			if(i.getInsrncPlnOwnedBy().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnOwnedBy()==null) {} else {
			insuranceplan.setOwnedBy(new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnOwnedBy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** InsrncPln_Prd_End ********************************************************************************/
		if(i.getInsrncPlnPrdEnd() != null ) {

			if(i.getInsrncPlnPrdEnd().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnPrdEnd()==null) {} else {
			insuranceplan.getPeriod().setEnd(i.getInsrncPlnPrdEnd().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getInsrncPlnPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** InsrncPln_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnPrdStrt() != null ) {

			if(i.getInsrncPlnPrdStrt().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnPrdStrt()==null) {} else {
			insuranceplan.getPeriod().setStart(i.getInsrncPlnPrdStrt().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getInsrncPlnPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** InsrncPln_Pln_CvgArea ********************************************************************************/
		if(i.getInsrncPlnPlnCvgArea() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnCvgArea().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getPlan().get(i0).addCoverageArea(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
	return InsurancePlans_Extended( i, insuranceplan) ;	
	}
	public org.hl7.fhir.r4.model.InsurancePlan InsurancePlans_Extended(InsurancePlan i, org.hl7.fhir.r4.model.InsurancePlan insuranceplan) throws ParseException
	{
		/******************** InsrncPln_Pln_GeneralCst_Comment ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstComment() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).setComment(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Cst_Crncy ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstCstCrncy() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstCstCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstCstCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getCost().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Cst_Vl ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstCstVl() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstCstVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstCstVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getCost().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_GrpSz ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstGrpSz() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstGrpSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstGrpSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).setGroupSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnGeneralCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnGeneralCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnGeneralCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnGeneralCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnGeneralCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnGeneralCstTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnGeneralCstTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getGeneralCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addGeneralCost(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getGeneralCost().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Assigner ********************************************************************************/
		if(i.getInsrncPlnPlnIdAssigner() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Prd_End ********************************************************************************/
		if(i.getInsrncPlnPlnIdPrdEnd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnPlnIdPrdStrt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnIdSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					String[] arrayi2 = i.getInsrncPlnPlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					String[] arrayi2 = i.getInsrncPlnPlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					String[] arrayi2 = i.getInsrncPlnPlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					String[] arrayi2 = i.getInsrncPlnPlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					String[] arrayi2 = i.getInsrncPlnPlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Use ********************************************************************************/
		if(i.getInsrncPlnPlnIdUse() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_Id_Vl ********************************************************************************/
		if(i.getInsrncPlnPlnIdVl() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getIdentifier().size() < i1+1) { insuranceplan.getPlan().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Network ********************************************************************************/
		if(i.getInsrncPlnPlnNetwork() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnNetwork().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {insuranceplan.getPlan().get(i0).addNetwork(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getApplicability().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).addQualifiers(); }
								String[] arrayi5 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i4].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
								for(int i5 = 0; i5 < arrayi5.length; i5++) {
									if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().size() < i5+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).addCoding(); }
									if(arrayi5[i5].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi5[i5]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().get(i5).setCode(arrayi5[i5].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
								}
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).addQualifiers(); }
								String[] arrayi5 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i4].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
								for(int i5 = 0; i5 < arrayi5.length; i5++) {
									if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().size() < i5+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).addCoding(); }
									if(arrayi5[i5].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi5[i5]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().get(i5).setDisplay(arrayi5[i5].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
								}
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).addQualifiers(); }
								String[] arrayi5 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i4].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
								for(int i5 = 0; i5 < arrayi5.length; i5++) {
									if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().size() < i5+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).addCoding(); }
									if(arrayi5[i5].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi5[i5]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().get(i5).setSystem(arrayi5[i5].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
								}
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).addQualifiers(); }
								String[] arrayi5 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i4].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
								for(int i5 = 0; i5 < arrayi5.length; i5++) {
									if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().size() < i5+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).addCoding(); }
									if(arrayi5[i5].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi5[i5]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().get(i5).setUserSelected(Boolean.parseBoolean(arrayi5[i5].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
								}
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).addQualifiers(); }
								String[] arrayi5 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i4].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
								for(int i5 = 0; i5 < arrayi5.length; i5++) {
									if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().size() < i5+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).addCoding(); }
									if(arrayi5[i5].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi5[i5]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).getCoding().get(i5).setVersion(arrayi5[i5].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
								}
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).addQualifiers(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getQualifiers().get(i4).setText(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							String[] arrayi4 = i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().size() < i4+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getType().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getValue().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Cmprtr ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlCmprtr() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getValue().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getValue().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Unt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlUnt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getValue().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Vl ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlVl() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftCstVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftCstVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftCstVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftCstVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).addCost(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getCost().get(i3).getValue().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						String[] arrayi3 = i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getBenefit().get(i2).getType().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					String[] arrayi2 = i.getInsrncPlnPlnSpecificCstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().size() < i2+1) { insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnSpecificCstCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnSpecificCstCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getSpecificCost().size() < i1+1) { insuranceplan.getPlan().get(i0).addSpecificCost(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getSpecificCost().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getPlan().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getPlan().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getPlan().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getPlan().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Pln_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				String[] arrayi1 = i.getInsrncPlnPlnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getPlan().get(i0).getType().getCoding().size() < i1+1) { insuranceplan.getPlan().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getPlan().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Pln_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnPlnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getPlan().size() < i0+1) { insuranceplan.addPlan(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getPlan().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** InsrncPln_Sts ********************************************************************************/
		if(i.getInsrncPlnSts() != null ) {

			if(i.getInsrncPlnSts().replace("[","").replace("]","").equals("NULL") | i.getInsrncPlnSts()==null) {} else {
			insuranceplan.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(i.getInsrncPlnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** InsrncPln_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnTypCdgCd() != null ) {

			String[] arrayi0 = i.getInsrncPlnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getType().size() < i0+1) { insuranceplan.addType(); }
				String[] arrayi1 = i.getInsrncPlnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getType().get(i0).getCoding().size() < i1+1) { insuranceplan.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInsrncPlnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getType().size() < i0+1) { insuranceplan.addType(); }
				String[] arrayi1 = i.getInsrncPlnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getType().get(i0).getCoding().size() < i1+1) { insuranceplan.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnTypCdgSys() != null ) {

			String[] arrayi0 = i.getInsrncPlnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getType().size() < i0+1) { insuranceplan.addType(); }
				String[] arrayi1 = i.getInsrncPlnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getType().get(i0).getCoding().size() < i1+1) { insuranceplan.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInsrncPlnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getType().size() < i0+1) { insuranceplan.addType(); }
				String[] arrayi1 = i.getInsrncPlnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getType().get(i0).getCoding().size() < i1+1) { insuranceplan.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** InsrncPln_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInsrncPlnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getType().size() < i0+1) { insuranceplan.addType(); }
				String[] arrayi1 = i.getInsrncPlnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(insuranceplan.getType().get(i0).getCoding().size() < i1+1) { insuranceplan.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {insuranceplan.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** InsrncPln_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnTypTxt() != null ) {

			String[] arrayi0 = i.getInsrncPlnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(insuranceplan.getType().size() < i0+1) { insuranceplan.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {insuranceplan.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return insuranceplan;
	}
}
