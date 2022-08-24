package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Person;
public class PersonConversion 
{
	public org.hl7.fhir.r4.model.Person Persons(Person p) throws ParseException
	{
		org.hl7.fhir.r4.model.Person person = new org.hl7.fhir.r4.model.Person();

		/******************** id ********************************************************************************/
		person.setId(p.getId());

		/******************** Prsn_Active ********************************************************************************/
		if(p.getPrsnActive() != null ) {

			if(p.getPrsnActive().replace("[","").replace("]","").equals("NULL") | p.getPrsnActive()==null) {} else {
			person.setActive(Boolean.parseBoolean(p.getPrsnActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prsn_Addr_City ********************************************************************************/
		if(p.getPrsnAddrCity() != null ) {

			String[] arrayi0 = p.getPrsnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Addr_Cntry ********************************************************************************/
		if(p.getPrsnAddrCntry() != null ) {

			String[] arrayi0 = p.getPrsnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Addr_District ********************************************************************************/
		if(p.getPrsnAddrDistrict() != null ) {

			String[] arrayi0 = p.getPrsnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Addr_Line ********************************************************************************/
		if(p.getPrsnAddrLine() != null ) {

			String[] arrayi0 = p.getPrsnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {person.getAddress().get(i0).addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Addr_Prd_End ********************************************************************************/
		if(p.getPrsnAddrPrdEnd() != null ) {

			String[] arrayi0 = p.getPrsnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Addr_Prd_Strt ********************************************************************************/
		if(p.getPrsnAddrPrdStrt() != null ) {

			String[] arrayi0 = p.getPrsnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Addr_PostalCd ********************************************************************************/
		if(p.getPrsnAddrPostalCd() != null ) {

			String[] arrayi0 = p.getPrsnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Addr_State ********************************************************************************/
		if(p.getPrsnAddrState() != null ) {

			String[] arrayi0 = p.getPrsnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Addr_Txt ********************************************************************************/
		if(p.getPrsnAddrTxt() != null ) {

			String[] arrayi0 = p.getPrsnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Addr_Typ ********************************************************************************/
		if(p.getPrsnAddrTyp() != null ) {

			String[] arrayi0 = p.getPrsnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Addr_Use ********************************************************************************/
		if(p.getPrsnAddrUse() != null ) {

			String[] arrayi0 = p.getPrsnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getAddress().size() < i0+1) { person.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getAddress().get(i0).setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_BirthDt ********************************************************************************/
		if(p.getPrsnBirthDt() != null ) {

			if(p.getPrsnBirthDt().replace("[","").replace("]","").equals("NULL") | p.getPrsnBirthDt()==null) {} else {
			person.setBirthDate(p.getPrsnBirthDt().replace("[","").replace("]","").equals("NULL") | p.getPrsnBirthDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrsnBirthDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prsn_Gender ********************************************************************************/
		if(p.getPrsnGender() != null ) {

			if(p.getPrsnGender().replace("[","").replace("]","").equals("NULL") | p.getPrsnGender()==null) {} else {
			person.setGender(new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory().fromCode(p.getPrsnGender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prsn_Id_Assigner ********************************************************************************/
		if(p.getPrsnIdAssigner() != null ) {

			String[] arrayi0 = p.getPrsnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Id_Prd_End ********************************************************************************/
		if(p.getPrsnIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPrsnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Id_Prd_Strt ********************************************************************************/
		if(p.getPrsnIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPrsnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Id_Sys ********************************************************************************/
		if(p.getPrsnIdSys() != null ) {

			String[] arrayi0 = p.getPrsnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrsnIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPrsnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				String[] arrayi1 = p.getPrsnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(person.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { person.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {person.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrsnIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPrsnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				String[] arrayi1 = p.getPrsnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(person.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { person.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {person.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrsnIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPrsnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				String[] arrayi1 = p.getPrsnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(person.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { person.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {person.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrsnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrsnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				String[] arrayi1 = p.getPrsnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(person.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { person.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {person.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrsnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrsnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				String[] arrayi1 = p.getPrsnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(person.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { person.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {person.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Id_Typ_Txt ********************************************************************************/
		if(p.getPrsnIdTypTxt() != null ) {

			String[] arrayi0 = p.getPrsnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Id_Use ********************************************************************************/
		if(p.getPrsnIdUse() != null ) {

			String[] arrayi0 = p.getPrsnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Id_Vl ********************************************************************************/
		if(p.getPrsnIdVl() != null ) {

			String[] arrayi0 = p.getPrsnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getIdentifier().size() < i0+1) { person.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Link_Assurance ********************************************************************************/
		if(p.getPrsnLinkAssurance() != null ) {

			String[] arrayi0 = p.getPrsnLinkAssurance().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getLink().size() < i0+1) { person.addLink(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getLink().get(i0).setAssurance(new org.hl7.fhir.r4.model.Person.IdentityAssuranceLevelEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_ManagingOrgnztn ********************************************************************************/
		if(p.getPrsnManagingOrgnztn() != null ) {

			if(p.getPrsnManagingOrgnztn().replace("[","").replace("]","").equals("NULL") | p.getPrsnManagingOrgnztn()==null) {} else {
			person.setManagingOrganization(new org.hl7.fhir.r4.model.Reference(p.getPrsnManagingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prsn_Nm_Fmly ********************************************************************************/
		if(p.getPrsnNmFmly() != null ) {

			String[] arrayi0 = p.getPrsnNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getName().get(i0).setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Nm_Given ********************************************************************************/
		if(p.getPrsnNmGiven() != null ) {

			String[] arrayi0 = p.getPrsnNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {person.getName().get(i0).addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Nm_Prd_End ********************************************************************************/
		if(p.getPrsnNmPrdEnd() != null ) {

			String[] arrayi0 = p.getPrsnNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getName().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Nm_Prd_Strt ********************************************************************************/
		if(p.getPrsnNmPrdStrt() != null ) {

			String[] arrayi0 = p.getPrsnNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getName().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Nm_Prefix ********************************************************************************/
		if(p.getPrsnNmPrefix() != null ) {

			String[] arrayi0 = p.getPrsnNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {person.getName().get(i0).addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Nm_Suffix ********************************************************************************/
		if(p.getPrsnNmSuffix() != null ) {

			String[] arrayi0 = p.getPrsnNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {person.getName().get(i0).addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prsn_Nm_Txt ********************************************************************************/
		if(p.getPrsnNmTxt() != null ) {

			String[] arrayi0 = p.getPrsnNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getName().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prsn_Nm_Use ********************************************************************************/
		if(p.getPrsnNmUse() != null ) {

			String[] arrayi0 = p.getPrsnNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getName().size() < i0+1) { person.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getName().get(i0).setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Photo_CntntTyp ********************************************************************************/
		if(p.getPrsnPhotoCntntTyp() != null ) {

			if(p.getPrsnPhotoCntntTyp().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoCntntTyp()==null) {} else {
			person.getPhoto().setContentType(p.getPrsnPhotoCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prsn_Photo_Creation ********************************************************************************/
		if(p.getPrsnPhotoCreation() != null ) {

			if(p.getPrsnPhotoCreation().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoCreation()==null) {} else {
			person.getPhoto().setCreation(p.getPrsnPhotoCreation().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrsnPhotoCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prsn_Photo_Data ********************************************************************************/
		if(p.getPrsnPhotoData() != null ) {

			if(p.getPrsnPhotoData().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoData()==null) {} else {
			person.getPhoto().setData(p.getPrsnPhotoData().getBytes());
			}
		}
		/******************** Prsn_Photo_Hash ********************************************************************************/
		if(p.getPrsnPhotoHash() != null ) {

			if(p.getPrsnPhotoHash().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoHash()==null) {} else {
			person.getPhoto().setHash(p.getPrsnPhotoHash().getBytes());
			}
		}
		/******************** Prsn_Photo_Lnguage ********************************************************************************/
		if(p.getPrsnPhotoLnguage() != null ) {

			if(p.getPrsnPhotoLnguage().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoLnguage()==null) {} else {
			person.getPhoto().setLanguage(p.getPrsnPhotoLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prsn_Photo_Sz ********************************************************************************/
		if(p.getPrsnPhotoSz() != null ) {

			if(p.getPrsnPhotoSz().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoSz()==null) {} else {
			person.getPhoto().setSize(Integer.parseInt(p.getPrsnPhotoSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prsn_Photo_Ttl ********************************************************************************/
		if(p.getPrsnPhotoTtl() != null ) {

			if(p.getPrsnPhotoTtl().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoTtl()==null) {} else {
			person.getPhoto().setTitle(p.getPrsnPhotoTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prsn_Photo_Url ********************************************************************************/
		if(p.getPrsnPhotoUrl() != null ) {

			if(p.getPrsnPhotoUrl().replace("[","").replace("]","").equals("NULL") | p.getPrsnPhotoUrl()==null) {} else {
			person.getPhoto().setUrl(p.getPrsnPhotoUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prsn_Tlcm_Prd_End ********************************************************************************/
		if(p.getPrsnTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPrsnTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getTelecom().size() < i0+1) { person.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPrsnTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPrsnTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getTelecom().size() < i0+1) { person.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Tlcm_Rnk ********************************************************************************/
		if(p.getPrsnTlcmRnk() != null ) {

			String[] arrayi0 = p.getPrsnTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getTelecom().size() < i0+1) { person.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Tlcm_Sys ********************************************************************************/
		if(p.getPrsnTlcmSys() != null ) {

			String[] arrayi0 = p.getPrsnTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getTelecom().size() < i0+1) { person.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Tlcm_Use ********************************************************************************/
		if(p.getPrsnTlcmUse() != null ) {

			String[] arrayi0 = p.getPrsnTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getTelecom().size() < i0+1) { person.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prsn_Tlcm_Vl ********************************************************************************/
		if(p.getPrsnTlcmVl() != null ) {

			String[] arrayi0 = p.getPrsnTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(person.getTelecom().size() < i0+1) { person.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {person.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return person;
	}
}
