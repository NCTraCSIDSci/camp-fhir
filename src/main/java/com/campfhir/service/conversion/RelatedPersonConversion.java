package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RelatedPerson;
public class RelatedPersonConversion 
{
	public org.hl7.fhir.r4.model.RelatedPerson RelatedPersons(RelatedPerson r) throws ParseException
	{
		org.hl7.fhir.r4.model.RelatedPerson relatedperson = new org.hl7.fhir.r4.model.RelatedPerson();

		/******************** id ********************************************************************************/
		relatedperson.setId(r.getId());

		/******************** RltedPrsn_Active ********************************************************************************/
		if(r.getRltedPrsnActive() != null ) {

			if(r.getRltedPrsnActive().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnActive()==null) {} else {
			relatedperson.setActive(Boolean.parseBoolean(r.getRltedPrsnActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RltedPrsn_Addr_City ********************************************************************************/
		if(r.getRltedPrsnAddrCity() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Addr_Cntry ********************************************************************************/
		if(r.getRltedPrsnAddrCntry() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Addr_District ********************************************************************************/
		if(r.getRltedPrsnAddrDistrict() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Addr_Line ********************************************************************************/
		if(r.getRltedPrsnAddrLine() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {relatedperson.getAddress().get(i0).addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Addr_Prd_End ********************************************************************************/
		if(r.getRltedPrsnAddrPrdEnd() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Addr_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnAddrPrdStrt() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Addr_PostalCd ********************************************************************************/
		if(r.getRltedPrsnAddrPostalCd() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Addr_State ********************************************************************************/
		if(r.getRltedPrsnAddrState() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Addr_Txt ********************************************************************************/
		if(r.getRltedPrsnAddrTxt() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Addr_Typ ********************************************************************************/
		if(r.getRltedPrsnAddrTyp() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Addr_Use ********************************************************************************/
		if(r.getRltedPrsnAddrUse() != null ) {

			String[] arrayi0 = r.getRltedPrsnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getAddress().size() < i0+1) { relatedperson.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getAddress().get(i0).setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_BirthDt ********************************************************************************/
		if(r.getRltedPrsnBirthDt() != null ) {

			if(r.getRltedPrsnBirthDt().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnBirthDt()==null) {} else {
			relatedperson.setBirthDate(r.getRltedPrsnBirthDt().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnBirthDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRltedPrsnBirthDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgCd() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				String[] arrayi1 = r.getRltedPrsnCmmnctnLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { relatedperson.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getCommunication().get(i0).getLanguage().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgDsply() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				String[] arrayi1 = r.getRltedPrsnCmmnctnLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { relatedperson.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getCommunication().get(i0).getLanguage().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgSys() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				String[] arrayi1 = r.getRltedPrsnCmmnctnLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { relatedperson.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getCommunication().get(i0).getLanguage().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				String[] arrayi1 = r.getRltedPrsnCmmnctnLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { relatedperson.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getCommunication().get(i0).getLanguage().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgVrsn() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				String[] arrayi1 = r.getRltedPrsnCmmnctnLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { relatedperson.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getCommunication().get(i0).getLanguage().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageTxt() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getCommunication().get(i0).getLanguage().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Cmmnctn_Preferred ********************************************************************************/
		if(r.getRltedPrsnCmmnctnPreferred() != null ) {

			String[] arrayi0 = r.getRltedPrsnCmmnctnPreferred().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getCommunication().size() < i0+1) { relatedperson.addCommunication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getCommunication().get(i0).setPreferred(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Gender ********************************************************************************/
		if(r.getRltedPrsnGender() != null ) {

			if(r.getRltedPrsnGender().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnGender()==null) {} else {
			relatedperson.setGender(new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory().fromCode(r.getRltedPrsnGender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RltedPrsn_Id_Assigner ********************************************************************************/
		if(r.getRltedPrsnIdAssigner() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Id_Prd_End ********************************************************************************/
		if(r.getRltedPrsnIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Id_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Id_Sys ********************************************************************************/
		if(r.getRltedPrsnIdSys() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				String[] arrayi1 = r.getRltedPrsnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { relatedperson.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				String[] arrayi1 = r.getRltedPrsnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { relatedperson.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				String[] arrayi1 = r.getRltedPrsnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { relatedperson.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				String[] arrayi1 = r.getRltedPrsnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { relatedperson.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RltedPrsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				String[] arrayi1 = r.getRltedPrsnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { relatedperson.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Id_Typ_Txt ********************************************************************************/
		if(r.getRltedPrsnIdTypTxt() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Id_Use ********************************************************************************/
		if(r.getRltedPrsnIdUse() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Id_Vl ********************************************************************************/
		if(r.getRltedPrsnIdVl() != null ) {

			String[] arrayi0 = r.getRltedPrsnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getIdentifier().size() < i0+1) { relatedperson.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Nm_Fmly ********************************************************************************/
		if(r.getRltedPrsnNmFmly() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getName().get(i0).setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Nm_Given ********************************************************************************/
		if(r.getRltedPrsnNmGiven() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {relatedperson.getName().get(i0).addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Nm_Prd_End ********************************************************************************/
		if(r.getRltedPrsnNmPrdEnd() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getName().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Nm_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnNmPrdStrt() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getName().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Nm_Prefix ********************************************************************************/
		if(r.getRltedPrsnNmPrefix() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {relatedperson.getName().get(i0).addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Nm_Suffix ********************************************************************************/
		if(r.getRltedPrsnNmSuffix() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {relatedperson.getName().get(i0).addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Nm_Txt ********************************************************************************/
		if(r.getRltedPrsnNmTxt() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getName().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Nm_Use ********************************************************************************/
		if(r.getRltedPrsnNmUse() != null ) {

			String[] arrayi0 = r.getRltedPrsnNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getName().size() < i0+1) { relatedperson.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getName().get(i0).setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Pnt ********************************************************************************/
		if(r.getRltedPrsnPnt() != null ) {

			if(r.getRltedPrsnPnt().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnPnt()==null) {} else {
			relatedperson.setPatient(new org.hl7.fhir.r4.model.Reference(r.getRltedPrsnPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RltedPrsn_Prd_End ********************************************************************************/
		if(r.getRltedPrsnPrdEnd() != null ) {

			if(r.getRltedPrsnPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnPrdEnd()==null) {} else {
			relatedperson.getPeriod().setEnd(r.getRltedPrsnPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRltedPrsnPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RltedPrsn_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnPrdStrt() != null ) {

			if(r.getRltedPrsnPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnPrdStrt()==null) {} else {
			relatedperson.getPeriod().setStart(r.getRltedPrsnPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRltedPrsnPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRltedPrsnPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RltedPrsn_Photo_CntntTyp ********************************************************************************/
		if(r.getRltedPrsnPhotoCntntTyp() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Photo_Creation ********************************************************************************/
		if(r.getRltedPrsnPhotoCreation() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Photo_Data ********************************************************************************/
		if(r.getRltedPrsnPhotoData() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RltedPrsn_Photo_Hash ********************************************************************************/
		if(r.getRltedPrsnPhotoHash() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RltedPrsn_Photo_Lnguage ********************************************************************************/
		if(r.getRltedPrsnPhotoLnguage() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Photo_Sz ********************************************************************************/
		if(r.getRltedPrsnPhotoSz() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Photo_Ttl ********************************************************************************/
		if(r.getRltedPrsnPhotoTtl() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Photo_Url ********************************************************************************/
		if(r.getRltedPrsnPhotoUrl() != null ) {

			String[] arrayi0 = r.getRltedPrsnPhotoUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getPhoto().size() < i0+1) { relatedperson.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getPhoto().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Rltnship_Cdg_Cd ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgCd() != null ) {

			String[] arrayi0 = r.getRltedPrsnRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getRelationship().size() < i0+1) { relatedperson.addRelationship(); }
				String[] arrayi1 = r.getRltedPrsnRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getRelationship().get(i0).getCoding().size() < i1+1) { relatedperson.getRelationship().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getRelationship().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Rltnship_Cdg_Dsply ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgDsply() != null ) {

			String[] arrayi0 = r.getRltedPrsnRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getRelationship().size() < i0+1) { relatedperson.addRelationship(); }
				String[] arrayi1 = r.getRltedPrsnRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getRelationship().get(i0).getCoding().size() < i1+1) { relatedperson.getRelationship().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getRelationship().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Rltnship_Cdg_Sys ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgSys() != null ) {

			String[] arrayi0 = r.getRltedPrsnRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getRelationship().size() < i0+1) { relatedperson.addRelationship(); }
				String[] arrayi1 = r.getRltedPrsnRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getRelationship().get(i0).getCoding().size() < i1+1) { relatedperson.getRelationship().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getRelationship().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRltedPrsnRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getRelationship().size() < i0+1) { relatedperson.addRelationship(); }
				String[] arrayi1 = r.getRltedPrsnRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getRelationship().get(i0).getCoding().size() < i1+1) { relatedperson.getRelationship().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getRelationship().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RltedPrsn_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgVrsn() != null ) {

			String[] arrayi0 = r.getRltedPrsnRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getRelationship().size() < i0+1) { relatedperson.addRelationship(); }
				String[] arrayi1 = r.getRltedPrsnRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(relatedperson.getRelationship().get(i0).getCoding().size() < i1+1) { relatedperson.getRelationship().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {relatedperson.getRelationship().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RltedPrsn_Rltnship_Txt ********************************************************************************/
		if(r.getRltedPrsnRltnshipTxt() != null ) {

			String[] arrayi0 = r.getRltedPrsnRltnshipTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getRelationship().size() < i0+1) { relatedperson.addRelationship(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getRelationship().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RltedPrsn_Tlcm_Prd_End ********************************************************************************/
		if(r.getRltedPrsnTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRltedPrsnTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getTelecom().size() < i0+1) { relatedperson.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRltedPrsnTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getTelecom().size() < i0+1) { relatedperson.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Tlcm_Rnk ********************************************************************************/
		if(r.getRltedPrsnTlcmRnk() != null ) {

			String[] arrayi0 = r.getRltedPrsnTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getTelecom().size() < i0+1) { relatedperson.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Tlcm_Sys ********************************************************************************/
		if(r.getRltedPrsnTlcmSys() != null ) {

			String[] arrayi0 = r.getRltedPrsnTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getTelecom().size() < i0+1) { relatedperson.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Tlcm_Use ********************************************************************************/
		if(r.getRltedPrsnTlcmUse() != null ) {

			String[] arrayi0 = r.getRltedPrsnTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getTelecom().size() < i0+1) { relatedperson.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RltedPrsn_Tlcm_Vl ********************************************************************************/
		if(r.getRltedPrsnTlcmVl() != null ) {

			String[] arrayi0 = r.getRltedPrsnTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(relatedperson.getTelecom().size() < i0+1) { relatedperson.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {relatedperson.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return relatedperson;
	}
}
