package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Organization;
public class OrganizationConversion 
{
	public org.hl7.fhir.r4.model.Organization Organizations(Organization o) throws ParseException
	{
		org.hl7.fhir.r4.model.Organization organization = new org.hl7.fhir.r4.model.Organization();

		/******************** id ********************************************************************************/
		organization.setId(o.getId());

		/******************** Orgnztn_Active ********************************************************************************/
		if(o.getOrgnztnActive() != null ) {

			if(o.getOrgnztnActive().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnActive()==null) {} else {
			organization.setActive(Boolean.parseBoolean(o.getOrgnztnActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Orgnztn_Addr_City ********************************************************************************/
		if(o.getOrgnztnAddrCity() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Addr_Cntry ********************************************************************************/
		if(o.getOrgnztnAddrCntry() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Addr_District ********************************************************************************/
		if(o.getOrgnztnAddrDistrict() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Addr_Line ********************************************************************************/
		if(o.getOrgnztnAddrLine() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {organization.getAddress().get(i0).addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Addr_Prd_End ********************************************************************************/
		if(o.getOrgnztnAddrPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Addr_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAddrPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Addr_PostalCd ********************************************************************************/
		if(o.getOrgnztnAddrPostalCd() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Addr_State ********************************************************************************/
		if(o.getOrgnztnAddrState() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Addr_Txt ********************************************************************************/
		if(o.getOrgnztnAddrTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Addr_Typ ********************************************************************************/
		if(o.getOrgnztnAddrTyp() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Addr_Use ********************************************************************************/
		if(o.getOrgnztnAddrUse() != null ) {

			String[] arrayi0 = o.getOrgnztnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getAddress().size() < i0+1) { organization.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getAddress().get(i0).setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Alias ********************************************************************************/
		if(o.getOrgnztnAlias() != null ) {

				for( String currListStrSplit : o.getOrgnztnAlias().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			organization.addAlias(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Orgnztn_Cntct_Addr_City ********************************************************************************/
		if(o.getOrgnztnCntctAddrCity() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_Cntry ********************************************************************************/
		if(o.getOrgnztnCntctAddrCntry() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_District ********************************************************************************/
		if(o.getOrgnztnCntctAddrDistrict() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_Line ********************************************************************************/
		if(o.getOrgnztnCntctAddrLine() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {organization.getContact().get(i0).getAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Addr_Prd_End ********************************************************************************/
		if(o.getOrgnztnCntctAddrPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnCntctAddrPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_PostalCd ********************************************************************************/
		if(o.getOrgnztnCntctAddrPostalCd() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_State ********************************************************************************/
		if(o.getOrgnztnCntctAddrState() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_Txt ********************************************************************************/
		if(o.getOrgnztnCntctAddrTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_Typ ********************************************************************************/
		if(o.getOrgnztnCntctAddrTyp() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Addr_Use ********************************************************************************/
		if(o.getOrgnztnCntctAddrUse() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Nm_Fmly ********************************************************************************/
		if(o.getOrgnztnCntctNmFmly() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getName().setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Nm_Given ********************************************************************************/
		if(o.getOrgnztnCntctNmGiven() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {organization.getContact().get(i0).getName().addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Nm_Prd_End ********************************************************************************/
		if(o.getOrgnztnCntctNmPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getName().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnCntctNmPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getName().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Nm_Prefix ********************************************************************************/
		if(o.getOrgnztnCntctNmPrefix() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {organization.getContact().get(i0).getName().addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Nm_Suffix ********************************************************************************/
		if(o.getOrgnztnCntctNmSuffix() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {organization.getContact().get(i0).getName().addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Nm_Txt ********************************************************************************/
		if(o.getOrgnztnCntctNmTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getName().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Nm_Use ********************************************************************************/
		if(o.getOrgnztnCntctNmUse() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getName().setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgCd() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctPrpseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctPrpseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { organization.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getPurpose().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgDsply() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctPrpseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctPrpseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { organization.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getPurpose().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgSys() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctPrpseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctPrpseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { organization.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getPurpose().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctPrpseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctPrpseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { organization.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getPurpose().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnCntctPrpseCdgVrsn() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctPrpseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctPrpseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getPurpose().getCoding().size() < i1+1) { organization.getContact().get(i0).getPurpose().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getPurpose().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Prpse_Txt ********************************************************************************/
		if(o.getOrgnztnCntctPrpseTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctPrpseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getContact().get(i0).getPurpose().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(o.getOrgnztnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getTelecom().size() < i1+1) { organization.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getTelecom().size() < i1+1) { organization.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(o.getOrgnztnCntctTlcmRnk() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getTelecom().size() < i1+1) { organization.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Tlcm_Sys ********************************************************************************/
		if(o.getOrgnztnCntctTlcmSys() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getTelecom().size() < i1+1) { organization.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Tlcm_Use ********************************************************************************/
		if(o.getOrgnztnCntctTlcmUse() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getTelecom().size() < i1+1) { organization.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Cntct_Tlcm_Vl ********************************************************************************/
		if(o.getOrgnztnCntctTlcmVl() != null ) {

			String[] arrayi0 = o.getOrgnztnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getContact().size() < i0+1) { organization.addContact(); }
				String[] arrayi1 = o.getOrgnztnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getContact().get(i0).getTelecom().size() < i1+1) { organization.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Endpoint ********************************************************************************/
		if(o.getOrgnztnEndpoint() != null ) {

				for( String currListStrSplit : o.getOrgnztnEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			organization.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Orgnztn_Id_Assigner ********************************************************************************/
		if(o.getOrgnztnIdAssigner() != null ) {

			String[] arrayi0 = o.getOrgnztnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Id_Prd_End ********************************************************************************/
		if(o.getOrgnztnIdPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Id_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnIdPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Id_Sys ********************************************************************************/
		if(o.getOrgnztnIdSys() != null ) {

			String[] arrayi0 = o.getOrgnztnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnIdTypCdgCd() != null ) {

			String[] arrayi0 = o.getOrgnztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnIdTypCdgDsply() != null ) {

			String[] arrayi0 = o.getOrgnztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnIdTypCdgSys() != null ) {

			String[] arrayi0 = o.getOrgnztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOrgnztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getOrgnztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Id_Typ_Txt ********************************************************************************/
		if(o.getOrgnztnIdTypTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Id_Use ********************************************************************************/
		if(o.getOrgnztnIdUse() != null ) {

			String[] arrayi0 = o.getOrgnztnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Id_Vl ********************************************************************************/
		if(o.getOrgnztnIdVl() != null ) {

			String[] arrayi0 = o.getOrgnztnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getIdentifier().size() < i0+1) { organization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Nm ********************************************************************************/
		if(o.getOrgnztnNm() != null ) {

			if(o.getOrgnztnNm().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnNm()==null) {} else {
			organization.setName(o.getOrgnztnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Orgnztn_PartOf ********************************************************************************/
		if(o.getOrgnztnPartOf() != null ) {

			if(o.getOrgnztnPartOf().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnPartOf()==null) {} else {
			organization.setPartOf(new org.hl7.fhir.r4.model.Reference(o.getOrgnztnPartOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Orgnztn_Tlcm_Prd_End ********************************************************************************/
		if(o.getOrgnztnTlcmPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getTelecom().size() < i0+1) { organization.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnTlcmPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getTelecom().size() < i0+1) { organization.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Tlcm_Rnk ********************************************************************************/
		if(o.getOrgnztnTlcmRnk() != null ) {

			String[] arrayi0 = o.getOrgnztnTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getTelecom().size() < i0+1) { organization.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Tlcm_Sys ********************************************************************************/
		if(o.getOrgnztnTlcmSys() != null ) {

			String[] arrayi0 = o.getOrgnztnTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getTelecom().size() < i0+1) { organization.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Tlcm_Use ********************************************************************************/
		if(o.getOrgnztnTlcmUse() != null ) {

			String[] arrayi0 = o.getOrgnztnTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getTelecom().size() < i0+1) { organization.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Orgnztn_Tlcm_Vl ********************************************************************************/
		if(o.getOrgnztnTlcmVl() != null ) {

			String[] arrayi0 = o.getOrgnztnTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getTelecom().size() < i0+1) { organization.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Orgnztn_Typ_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnTypCdgCd() != null ) {

			String[] arrayi0 = o.getOrgnztnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getType().size() < i0+1) { organization.addType(); }
				String[] arrayi1 = o.getOrgnztnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getType().get(i0).getCoding().size() < i1+1) { organization.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnTypCdgDsply() != null ) {

			String[] arrayi0 = o.getOrgnztnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getType().size() < i0+1) { organization.addType(); }
				String[] arrayi1 = o.getOrgnztnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getType().get(i0).getCoding().size() < i1+1) { organization.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Typ_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnTypCdgSys() != null ) {

			String[] arrayi0 = o.getOrgnztnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getType().size() < i0+1) { organization.addType(); }
				String[] arrayi1 = o.getOrgnztnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getType().get(i0).getCoding().size() < i1+1) { organization.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOrgnztnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getType().size() < i0+1) { organization.addType(); }
				String[] arrayi1 = o.getOrgnztnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getType().get(i0).getCoding().size() < i1+1) { organization.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Orgnztn_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getOrgnztnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getType().size() < i0+1) { organization.addType(); }
				String[] arrayi1 = o.getOrgnztnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organization.getType().get(i0).getCoding().size() < i1+1) { organization.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organization.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Orgnztn_Typ_Txt ********************************************************************************/
		if(o.getOrgnztnTypTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organization.getType().size() < i0+1) { organization.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organization.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return organization;
	}
}
