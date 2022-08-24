package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OrganizationAffiliation;
public class OrganizationAffiliationConversion 
{
	public org.hl7.fhir.r4.model.OrganizationAffiliation OrganizationAffiliations(OrganizationAffiliation o) throws ParseException
	{
		org.hl7.fhir.r4.model.OrganizationAffiliation organizationaffiliation = new org.hl7.fhir.r4.model.OrganizationAffiliation();

		/******************** id ********************************************************************************/
		organizationaffiliation.setId(o.getId());

		/******************** OrgnztnAffiliation_Active ********************************************************************************/
		if(o.getOrgnztnAffiliationActive() != null ) {

			if(o.getOrgnztnAffiliationActive().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationActive()==null) {} else {
			organizationaffiliation.setActive(Boolean.parseBoolean(o.getOrgnztnAffiliationActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgCd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getCode().size() < i0+1) { organizationaffiliation.addCode(); }
				String[] arrayi1 = o.getOrgnztnAffiliationCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getCode().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgDsply() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getCode().size() < i0+1) { organizationaffiliation.addCode(); }
				String[] arrayi1 = o.getOrgnztnAffiliationCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getCode().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgSys() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getCode().size() < i0+1) { organizationaffiliation.addCode(); }
				String[] arrayi1 = o.getOrgnztnAffiliationCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getCode().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getCode().size() < i0+1) { organizationaffiliation.addCode(); }
				String[] arrayi1 = o.getOrgnztnAffiliationCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getCode().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnAffiliationCdCdgVrsn() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getCode().size() < i0+1) { organizationaffiliation.addCode(); }
				String[] arrayi1 = o.getOrgnztnAffiliationCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getCode().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Cd_Txt ********************************************************************************/
		if(o.getOrgnztnAffiliationCdTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getCode().size() < i0+1) { organizationaffiliation.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OrgnztnAffiliation_Endpoint ********************************************************************************/
		if(o.getOrgnztnAffiliationEndpoint() != null ) {

				for( String currListStrSplit : o.getOrgnztnAffiliationEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			organizationaffiliation.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** OrgnztnAffiliation_HlthcrSrv ********************************************************************************/
		if(o.getOrgnztnAffiliationHlthcrSrv() != null ) {

				for( String currListStrSplit : o.getOrgnztnAffiliationHlthcrSrv().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			organizationaffiliation.addHealthcareService(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** OrgnztnAffiliation_Id_Assigner ********************************************************************************/
		if(o.getOrgnztnAffiliationIdAssigner() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Id_Prd_End ********************************************************************************/
		if(o.getOrgnztnAffiliationIdPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Id_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAffiliationIdPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Id_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationIdSys() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgCd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnAffiliationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organizationaffiliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgDsply() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnAffiliationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organizationaffiliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgSys() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnAffiliationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organizationaffiliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnAffiliationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organizationaffiliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				String[] arrayi1 = o.getOrgnztnAffiliationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { organizationaffiliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Id_Typ_Txt ********************************************************************************/
		if(o.getOrgnztnAffiliationIdTypTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OrgnztnAffiliation_Id_Use ********************************************************************************/
		if(o.getOrgnztnAffiliationIdUse() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Id_Vl ********************************************************************************/
		if(o.getOrgnztnAffiliationIdVl() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getIdentifier().size() < i0+1) { organizationaffiliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OrgnztnAffiliation_Lctn ********************************************************************************/
		if(o.getOrgnztnAffiliationLctn() != null ) {

				for( String currListStrSplit : o.getOrgnztnAffiliationLctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			organizationaffiliation.addLocation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** OrgnztnAffiliation_Network ********************************************************************************/
		if(o.getOrgnztnAffiliationNetwork() != null ) {

				for( String currListStrSplit : o.getOrgnztnAffiliationNetwork().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			organizationaffiliation.addNetwork(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** OrgnztnAffiliation_Orgnztn ********************************************************************************/
		if(o.getOrgnztnAffiliationOrgnztn() != null ) {

			if(o.getOrgnztnAffiliationOrgnztn().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationOrgnztn()==null) {} else {
			organizationaffiliation.setOrganization(new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OrgnztnAffiliation_ParticipatingOrgnztn ********************************************************************************/
		if(o.getOrgnztnAffiliationParticipatingOrgnztn() != null ) {

			if(o.getOrgnztnAffiliationParticipatingOrgnztn().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationParticipatingOrgnztn()==null) {} else {
			organizationaffiliation.setParticipatingOrganization(new org.hl7.fhir.r4.model.Reference(o.getOrgnztnAffiliationParticipatingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OrgnztnAffiliation_Prd_End ********************************************************************************/
		if(o.getOrgnztnAffiliationPrdEnd() != null ) {

			if(o.getOrgnztnAffiliationPrdEnd().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationPrdEnd()==null) {} else {
			organizationaffiliation.getPeriod().setEnd(o.getOrgnztnAffiliationPrdEnd().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getOrgnztnAffiliationPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OrgnztnAffiliation_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAffiliationPrdStrt() != null ) {

			if(o.getOrgnztnAffiliationPrdStrt().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationPrdStrt()==null) {} else {
			organizationaffiliation.getPeriod().setStart(o.getOrgnztnAffiliationPrdStrt().replace("[","").replace("]","").equals("NULL") | o.getOrgnztnAffiliationPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getOrgnztnAffiliationPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Cd ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgCd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getSpecialty().size() < i0+1) { organizationaffiliation.addSpecialty(); }
				String[] arrayi1 = o.getOrgnztnAffiliationSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getSpecialty().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getSpecialty().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Dsply ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgDsply() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getSpecialty().size() < i0+1) { organizationaffiliation.addSpecialty(); }
				String[] arrayi1 = o.getOrgnztnAffiliationSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getSpecialty().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getSpecialty().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgSys() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getSpecialty().size() < i0+1) { organizationaffiliation.addSpecialty(); }
				String[] arrayi1 = o.getOrgnztnAffiliationSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getSpecialty().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getSpecialty().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getSpecialty().size() < i0+1) { organizationaffiliation.addSpecialty(); }
				String[] arrayi1 = o.getOrgnztnAffiliationSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getSpecialty().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getSpecialty().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Spclty_Cdg_Vrsn ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyCdgVrsn() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getSpecialty().size() < i0+1) { organizationaffiliation.addSpecialty(); }
				String[] arrayi1 = o.getOrgnztnAffiliationSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(organizationaffiliation.getSpecialty().get(i0).getCoding().size() < i1+1) { organizationaffiliation.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {organizationaffiliation.getSpecialty().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OrgnztnAffiliation_Spclty_Txt ********************************************************************************/
		if(o.getOrgnztnAffiliationSpcltyTxt() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationSpcltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getSpecialty().size() < i0+1) { organizationaffiliation.addSpecialty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getSpecialty().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OrgnztnAffiliation_Tlcm_Prd_End ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmPrdEnd() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getTelecom().size() < i0+1) { organizationaffiliation.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmPrdStrt() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getTelecom().size() < i0+1) { organizationaffiliation.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Tlcm_Rnk ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmRnk() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getTelecom().size() < i0+1) { organizationaffiliation.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Tlcm_Sys ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmSys() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getTelecom().size() < i0+1) { organizationaffiliation.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Tlcm_Use ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmUse() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getTelecom().size() < i0+1) { organizationaffiliation.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OrgnztnAffiliation_Tlcm_Vl ********************************************************************************/
		if(o.getOrgnztnAffiliationTlcmVl() != null ) {

			String[] arrayi0 = o.getOrgnztnAffiliationTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(organizationaffiliation.getTelecom().size() < i0+1) { organizationaffiliation.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {organizationaffiliation.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return organizationaffiliation;
	}
}
