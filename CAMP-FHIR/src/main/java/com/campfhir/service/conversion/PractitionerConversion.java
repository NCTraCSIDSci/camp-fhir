package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Practitioner;
public class PractitionerConversion 
{
	public org.hl7.fhir.r4.model.Practitioner Practitioners(Practitioner p) throws ParseException
	{
		org.hl7.fhir.r4.model.Practitioner practitioner = new org.hl7.fhir.r4.model.Practitioner();

		/******************** id ********************************************************************************/
		practitioner.setId(p.getId());

<<<<<<< HEAD
		/******************** Prctitnr_Active ********************************************************************************/
		if(p.getPrctitnrActive() != null ) {

			if(p.getPrctitnrActive().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrActive()==null) {} else {
			practitioner.setActive(Boolean.parseBoolean(p.getPrctitnrActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prctitnr_Addr_City ********************************************************************************/
		if(p.getPrctitnrAddrCity() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Addr_Cntry ********************************************************************************/
		if(p.getPrctitnrAddrCntry() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Addr_District ********************************************************************************/
		if(p.getPrctitnrAddrDistrict() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Addr_Line ********************************************************************************/
		if(p.getPrctitnrAddrLine() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {practitioner.getAddress().get(i0).addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Addr_Prd_End ********************************************************************************/
		if(p.getPrctitnrAddrPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Addr_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrAddrPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Addr_PostalCd ********************************************************************************/
		if(p.getPrctitnrAddrPostalCd() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Addr_State ********************************************************************************/
		if(p.getPrctitnrAddrState() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Addr_Txt ********************************************************************************/
		if(p.getPrctitnrAddrTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Addr_Typ ********************************************************************************/
		if(p.getPrctitnrAddrTyp() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Addr_Use ********************************************************************************/
		if(p.getPrctitnrAddrUse() != null ) {

			String[] arrayi0 = p.getPrctitnrAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getAddress().size() < i0+1) { practitioner.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getAddress().get(i0).setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_BirthDt ********************************************************************************/
		if(p.getPrctitnrBirthDt() != null ) {

			if(p.getPrctitnrBirthDt().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrBirthDt()==null) {} else {
			practitioner.setBirthDate(p.getPrctitnrBirthDt().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrBirthDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrctitnrBirthDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrCmmnctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getCommunication().size() < i0+1) { practitioner.addCommunication(); }
				String[] arrayi1 = p.getPrctitnrCmmnctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getCommunication().get(i0).getCoding().size() < i1+1) { practitioner.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getCommunication().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrCmmnctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getCommunication().size() < i0+1) { practitioner.addCommunication(); }
				String[] arrayi1 = p.getPrctitnrCmmnctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getCommunication().get(i0).getCoding().size() < i1+1) { practitioner.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getCommunication().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrCmmnctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getCommunication().size() < i0+1) { practitioner.addCommunication(); }
				String[] arrayi1 = p.getPrctitnrCmmnctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getCommunication().get(i0).getCoding().size() < i1+1) { practitioner.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getCommunication().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrCmmnctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getCommunication().size() < i0+1) { practitioner.addCommunication(); }
				String[] arrayi1 = p.getPrctitnrCmmnctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getCommunication().get(i0).getCoding().size() < i1+1) { practitioner.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getCommunication().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrCmmnctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getCommunication().size() < i0+1) { practitioner.addCommunication(); }
				String[] arrayi1 = p.getPrctitnrCmmnctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getCommunication().get(i0).getCoding().size() < i1+1) { practitioner.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getCommunication().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Cmmnctn_Txt ********************************************************************************/
		if(p.getPrctitnrCmmnctnTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrCmmnctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getCommunication().size() < i0+1) { practitioner.addCommunication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getCommunication().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Gender ********************************************************************************/
		if(p.getPrctitnrGender() != null ) {

			if(p.getPrctitnrGender().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrGender()==null) {} else {
			practitioner.setGender(new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory().fromCode(p.getPrctitnrGender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prctitnr_Id_Assigner ********************************************************************************/
		if(p.getPrctitnrIdAssigner() != null ) {

			String[] arrayi0 = p.getPrctitnrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Id_Prd_End ********************************************************************************/
		if(p.getPrctitnrIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Id_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Id_Sys ********************************************************************************/
		if(p.getPrctitnrIdSys() != null ) {

			String[] arrayi0 = p.getPrctitnrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitioner.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitioner.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitioner.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitioner.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitioner.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Id_Typ_Txt ********************************************************************************/
		if(p.getPrctitnrIdTypTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Id_Use ********************************************************************************/
		if(p.getPrctitnrIdUse() != null ) {

			String[] arrayi0 = p.getPrctitnrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Id_Vl ********************************************************************************/
		if(p.getPrctitnrIdVl() != null ) {

			String[] arrayi0 = p.getPrctitnrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getIdentifier().size() < i0+1) { practitioner.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Nm_Fmly ********************************************************************************/
		if(p.getPrctitnrNmFmly() != null ) {

			String[] arrayi0 = p.getPrctitnrNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getName().get(i0).setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Nm_Given ********************************************************************************/
		if(p.getPrctitnrNmGiven() != null ) {

			String[] arrayi0 = p.getPrctitnrNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {practitioner.getName().get(i0).addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Nm_Prd_End ********************************************************************************/
		if(p.getPrctitnrNmPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getName().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Nm_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrNmPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getName().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Nm_Prefix ********************************************************************************/
		if(p.getPrctitnrNmPrefix() != null ) {

			String[] arrayi0 = p.getPrctitnrNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {practitioner.getName().get(i0).addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Nm_Suffix ********************************************************************************/
		if(p.getPrctitnrNmSuffix() != null ) {

			String[] arrayi0 = p.getPrctitnrNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {practitioner.getName().get(i0).addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Nm_Txt ********************************************************************************/
		if(p.getPrctitnrNmTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getName().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Nm_Use ********************************************************************************/
		if(p.getPrctitnrNmUse() != null ) {

			String[] arrayi0 = p.getPrctitnrNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getName().size() < i0+1) { practitioner.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getName().get(i0).setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Photo_CntntTyp ********************************************************************************/
		if(p.getPrctitnrPhotoCntntTyp() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Photo_Creation ********************************************************************************/
		if(p.getPrctitnrPhotoCreation() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Photo_Data ********************************************************************************/
		if(p.getPrctitnrPhotoData() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Prctitnr_Photo_Hash ********************************************************************************/
		if(p.getPrctitnrPhotoHash() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Prctitnr_Photo_Lnguage ********************************************************************************/
		if(p.getPrctitnrPhotoLnguage() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Photo_Sz ********************************************************************************/
		if(p.getPrctitnrPhotoSz() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Photo_Ttl ********************************************************************************/
		if(p.getPrctitnrPhotoTtl() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Photo_Url ********************************************************************************/
		if(p.getPrctitnrPhotoUrl() != null ) {

			String[] arrayi0 = p.getPrctitnrPhotoUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getPhoto().size() < i0+1) { practitioner.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getPhoto().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getCode().getCoding().size() < i1+1) { practitioner.getQualification().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getCode().getCoding().size() < i1+1) { practitioner.getQualification().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getCode().getCoding().size() < i1+1) { practitioner.getQualification().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getCode().getCoding().size() < i1+1) { practitioner.getQualification().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getCode().getCoding().size() < i1+1) { practitioner.getQualification().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Cd_Txt ********************************************************************************/
		if(p.getPrctitnrQualificationCdTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getQualification().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prctitnr_Qualification_Id_Assigner ********************************************************************************/
		if(p.getPrctitnrQualificationIdAssigner() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Prd_End ********************************************************************************/
		if(p.getPrctitnrQualificationIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrQualificationIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Sys ********************************************************************************/
		if(p.getPrctitnrQualificationIdSys() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					String[] arrayi2 = p.getPrctitnrQualificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					String[] arrayi2 = p.getPrctitnrQualificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					String[] arrayi2 = p.getPrctitnrQualificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					String[] arrayi2 = p.getPrctitnrQualificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					String[] arrayi2 = p.getPrctitnrQualificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Typ_Txt ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Use ********************************************************************************/
		if(p.getPrctitnrQualificationIdUse() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Id_Vl ********************************************************************************/
		if(p.getPrctitnrQualificationIdVl() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				String[] arrayi1 = p.getPrctitnrQualificationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitioner.getQualification().get(i0).getIdentifier().size() < i1+1) { practitioner.getQualification().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitioner.getQualification().get(i0).getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prctitnr_Qualification_Issuer ********************************************************************************/
		if(p.getPrctitnrQualificationIssuer() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationIssuer().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getQualification().get(i0).setIssuer(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Qualification_Prd_End ********************************************************************************/
		if(p.getPrctitnrQualificationPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getQualification().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Qualification_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrQualificationPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrQualificationPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getQualification().size() < i0+1) { practitioner.addQualification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getQualification().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPrctitnrTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getTelecom().size() < i0+1) { practitioner.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getTelecom().size() < i0+1) { practitioner.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Tlcm_Rnk ********************************************************************************/
		if(p.getPrctitnrTlcmRnk() != null ) {

			String[] arrayi0 = p.getPrctitnrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getTelecom().size() < i0+1) { practitioner.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Tlcm_Sys ********************************************************************************/
		if(p.getPrctitnrTlcmSys() != null ) {

			String[] arrayi0 = p.getPrctitnrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getTelecom().size() < i0+1) { practitioner.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Tlcm_Use ********************************************************************************/
		if(p.getPrctitnrTlcmUse() != null ) {

			String[] arrayi0 = p.getPrctitnrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getTelecom().size() < i0+1) { practitioner.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prctitnr_Tlcm_Vl ********************************************************************************/
		if(p.getPrctitnrTlcmVl() != null ) {

			String[] arrayi0 = p.getPrctitnrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitioner.getTelecom().size() < i0+1) { practitioner.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitioner.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
=======
		/******************** Pract_Active ********************************************************************************/
		if(p.getPractActive() != null) {
			practitioner.setActive(Boolean.parseBoolean(p.getPractActive()));
		}

		org.hl7.fhir.r4.model.Address practitioneraddaddress = practitioner.addAddress();

		/******************** Pract_Address_City ********************************************************************************/
		if(p.getPractAddressCity() != null) {
			practitioneraddaddress.setCity(p.getPractAddressCity());
		}
		/******************** Pract_Address_Country ********************************************************************************/
		if(p.getPractAddressCountry() != null) {
			practitioneraddaddress.setCountry(p.getPractAddressCountry());
		}
		/******************** Pract_Address_District ********************************************************************************/
		if(p.getPractAddressDistrict() != null) {
			practitioneraddaddress.setDistrict(p.getPractAddressDistrict());
		}
		/******************** Pract_Address_Line ********************************************************************************/
		if(p.getPractAddressLine() != null) {
			practitioneraddaddress.addLine(p.getPractAddressLine());
		}

		org.hl7.fhir.r4.model.Period practitioneraddaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddaddress.setPeriod(practitioneraddaddresssetperiod);

		/******************** Pract_Address_Period_End ********************************************************************************/
		if(p.getPractAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PractAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractAddressPeriodEnddate = PractAddressPeriodEndsdf.parse(p.getPractAddressPeriodEnd());
			practitioneraddaddresssetperiod.setEnd(PractAddressPeriodEnddate);
		}
		/******************** Pract_Address_Period_Start ********************************************************************************/
		if(p.getPractAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PractAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractAddressPeriodStartdate = PractAddressPeriodStartsdf.parse(p.getPractAddressPeriodStart());
			practitioneraddaddresssetperiod.setStart(PractAddressPeriodStartdate);
		}
		/******************** Pract_Address_PostalCode ********************************************************************************/
		if(p.getPractAddressPostalCode() != null) {
			practitioneraddaddress.setPostalCode(p.getPractAddressPostalCode());
		}
		/******************** Pract_Address_State ********************************************************************************/
		if(p.getPractAddressState() != null) {
			practitioneraddaddress.setState(p.getPractAddressState());
		}
		/******************** Pract_Address_Text ********************************************************************************/
		if(p.getPractAddressText() != null) {
			practitioneraddaddress.setText(p.getPractAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory practitioneraddaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Pract_Address_Type_Code ********************************************************************************/
		if(p.getPractAddressTypeCode() != null) {
			practitioneraddaddress.setType(practitioneraddaddresssettypeEnumFactory.fromCode(p.getPractAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory practitioneraddaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Pract_Address_Use_Code ********************************************************************************/
		if(p.getPractAddressUseCode() != null) {
			practitioneraddaddress.setUse(practitioneraddaddresssetuseEnumFactory.fromCode(p.getPractAddressUseCode()));

		}
		/******************** Pract_BirthDate ********************************************************************************/
		if(p.getPractBirthDate() != null) {
			java.text.SimpleDateFormat PractBirthDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractBirthDatedate = PractBirthDatesdf.parse(p.getPractBirthDate());
			practitioner.setBirthDate(PractBirthDatedate);
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddcommunication = practitioner.addCommunication();


		org.hl7.fhir.r4.model.Coding practitioneraddcommunicationaddcoding = practitioneraddcommunication.addCoding();

		/******************** Pract_Commn_Coding_Code ********************************************************************************/
		if(p.getPractCommnCodingCode() != null) {
			practitioneraddcommunicationaddcoding.setCode(p.getPractCommnCodingCode());
		}
		/******************** Pract_Commn_Coding_Display ********************************************************************************/
		if(p.getPractCommnCodingDisplay() != null) {
			practitioneraddcommunicationaddcoding.setDisplay(p.getPractCommnCodingDisplay());
		}
		/******************** Pract_Commn_Coding_System ********************************************************************************/
		if(p.getPractCommnCodingSystem() != null) {
			practitioneraddcommunicationaddcoding.setSystem(p.getPractCommnCodingSystem());
		}
		/******************** Pract_Commn_Coding_Usrslt ********************************************************************************/
		if(p.getPractCommnCodingUsrslt() != null) {
			practitioneraddcommunicationaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractCommnCodingUsrslt()));
		}
		/******************** Pract_Commn_Coding_Version ********************************************************************************/
		if(p.getPractCommnCodingVersion() != null) {
			practitioneraddcommunicationaddcoding.setVersion(p.getPractCommnCodingVersion());
		}
		/******************** Pract_Commn_Text ********************************************************************************/
		if(p.getPractCommnText() != null) {
			practitioneraddcommunication.setText(p.getPractCommnText());
		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory practitionersetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Pract_Gender_Code ********************************************************************************/
		if(p.getPractGenderCode() != null) {
			practitioner.setGender(practitionersetgenderEnumFactory.fromCode(p.getPractGenderCode()));

		}

		org.hl7.fhir.r4.model.Identifier practitioneraddidentifier = practitioner.addIdentifier();

		/******************** Pract_Id_Assigner ********************************************************************************/
		if(p.getPractIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PractIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddidentifier.setAssigner(PractIdAssignerref.setReference(p.getPractIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddidentifier.setPeriod(practitioneraddidentifiersetperiod);

		/******************** Pract_Id_Period_End ********************************************************************************/
		if(p.getPractIdPeriodEnd() != null) {
			java.text.SimpleDateFormat PractIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractIdPeriodEnddate = PractIdPeriodEndsdf.parse(p.getPractIdPeriodEnd());
			practitioneraddidentifiersetperiod.setEnd(PractIdPeriodEnddate);
		}
		/******************** Pract_Id_Period_Start ********************************************************************************/
		if(p.getPractIdPeriodStart() != null) {
			java.text.SimpleDateFormat PractIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractIdPeriodStartdate = PractIdPeriodStartsdf.parse(p.getPractIdPeriodStart());
			practitioneraddidentifiersetperiod.setStart(PractIdPeriodStartdate);
		}
		/******************** Pract_Id_System ********************************************************************************/
		if(p.getPractIdSystem() != null) {
			practitioneraddidentifier.setSystem(p.getPractIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddidentifier.setType(practitioneraddidentifiersettype);


		org.hl7.fhir.r4.model.Coding practitioneraddidentifiersettypeaddcoding = practitioneraddidentifiersettype.addCoding();

		/******************** Pract_Id_Type_Coding_Code ********************************************************************************/
		if(p.getPractIdTypeCodingCode() != null) {
			practitioneraddidentifiersettypeaddcoding.setCode(p.getPractIdTypeCodingCode());
		}
		/******************** Pract_Id_Type_Coding_Display ********************************************************************************/
		if(p.getPractIdTypeCodingDisplay() != null) {
			practitioneraddidentifiersettypeaddcoding.setDisplay(p.getPractIdTypeCodingDisplay());
		}
		/******************** Pract_Id_Type_Coding_System ********************************************************************************/
		if(p.getPractIdTypeCodingSystem() != null) {
			practitioneraddidentifiersettypeaddcoding.setSystem(p.getPractIdTypeCodingSystem());
		}
		/******************** Pract_Id_Type_Coding_Usrslt ********************************************************************************/
		if(p.getPractIdTypeCodingUsrslt() != null) {
			practitioneraddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractIdTypeCodingUsrslt()));
		}
		/******************** Pract_Id_Type_Coding_Version ********************************************************************************/
		if(p.getPractIdTypeCodingVersion() != null) {
			practitioneraddidentifiersettypeaddcoding.setVersion(p.getPractIdTypeCodingVersion());
		}
		/******************** Pract_Id_Type_Text ********************************************************************************/
		if(p.getPractIdTypeText() != null) {
			practitioneraddidentifiersettype.setText(p.getPractIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneraddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Pract_Id_Use_Code ********************************************************************************/
		if(p.getPractIdUseCode() != null) {
			practitioneraddidentifier.setUse(practitioneraddidentifiersetuseEnumFactory.fromCode(p.getPractIdUseCode()));

		}
		/******************** Pract_Id_Value ********************************************************************************/
		if(p.getPractIdValue() != null) {
			practitioneraddidentifier.setValue(p.getPractIdValue());
		}

		org.hl7.fhir.r4.model.HumanName practitioneraddname = practitioner.addName();

		/******************** Pract_Name_Family ********************************************************************************/
		if(p.getPractNameFamily() != null) {
			practitioneraddname.setFamily(p.getPractNameFamily());
		}
		/******************** Pract_Name_Given ********************************************************************************/
		if(p.getPractNameGiven() != null) {
			practitioneraddname.addGiven(p.getPractNameGiven());
		}

		org.hl7.fhir.r4.model.Period practitioneraddnamesetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddname.setPeriod(practitioneraddnamesetperiod);

		/******************** Pract_Name_Period_End ********************************************************************************/
		if(p.getPractNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PractNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractNamePeriodEnddate = PractNamePeriodEndsdf.parse(p.getPractNamePeriodEnd());
			practitioneraddnamesetperiod.setEnd(PractNamePeriodEnddate);
		}
		/******************** Pract_Name_Period_Start ********************************************************************************/
		if(p.getPractNamePeriodStart() != null) {
			java.text.SimpleDateFormat PractNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractNamePeriodStartdate = PractNamePeriodStartsdf.parse(p.getPractNamePeriodStart());
			practitioneraddnamesetperiod.setStart(PractNamePeriodStartdate);
		}
		/******************** Pract_Name_Prefix ********************************************************************************/
		if(p.getPractNamePrefix() != null) {
			practitioneraddname.addPrefix(p.getPractNamePrefix());
		}
		/******************** Pract_Name_Suffix ********************************************************************************/
		if(p.getPractNameSuffix() != null) {
			practitioneraddname.addSuffix(p.getPractNameSuffix());
		}
		/******************** Pract_Name_Text ********************************************************************************/
		if(p.getPractNameText() != null) {
			practitioneraddname.setText(p.getPractNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory practitioneraddnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Pract_Name_Use_Code ********************************************************************************/
		if(p.getPractNameUseCode() != null) {
			practitioneraddname.setUse(practitioneraddnamesetuseEnumFactory.fromCode(p.getPractNameUseCode()));

		}

		org.hl7.fhir.r4.model.Attachment practitioneraddphoto = practitioner.addPhoto();

		/******************** Pract_Photo_ContentType ********************************************************************************/
		if(p.getPractPhotoContentType() != null) {
			practitioneraddphoto.setContentType(p.getPractPhotoContentType());
		}
		/******************** Pract_Photo_Creation ********************************************************************************/
		if(p.getPractPhotoCreation() != null) {
			java.text.SimpleDateFormat PractPhotoCreationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractPhotoCreationdate = PractPhotoCreationsdf.parse(p.getPractPhotoCreation());
			practitioneraddphoto.setCreation(PractPhotoCreationdate);
		}
		/******************** Pract_Photo_Data ********************************************************************************/
		if(p.getPractPhotoData() != null) {
			practitioneraddphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPractPhotoData()));
		}
		/******************** Pract_Photo_Hash ********************************************************************************/
		if(p.getPractPhotoHash() != null) {
			practitioneraddphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPractPhotoHash()));
		}
		/******************** Pract_Photo_Lang ********************************************************************************/
		if(p.getPractPhotoLang() != null) {
			practitioneraddphoto.setLanguage(p.getPractPhotoLang());
		}
		/******************** Pract_Photo_Size ********************************************************************************/
		if(p.getPractPhotoSize() != null) {
			practitioneraddphoto.setSize(Integer.parseInt(p.getPractPhotoSize()));
		}
		/******************** Pract_Photo_Title ********************************************************************************/
		if(p.getPractPhotoTitle() != null) {
			practitioneraddphoto.setTitle(p.getPractPhotoTitle());
		}
		/******************** Pract_Photo_Url ********************************************************************************/
		if(p.getPractPhotoUrl() != null) {
			practitioneraddphoto.setUrl(p.getPractPhotoUrl());
		}

		org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent practitioneraddqualification = practitioner.addQualification();


		org.hl7.fhir.r4.model.CodeableConcept practitioneraddqualificationsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddqualification.setCode(practitioneraddqualificationsetcode);


		org.hl7.fhir.r4.model.Coding practitioneraddqualificationsetcodeaddcoding = practitioneraddqualificationsetcode.addCoding();

		/******************** Pract_Qualification_Code_Coding_Code ********************************************************************************/
		if(p.getPractQualificationCodeCodingCode() != null) {
			practitioneraddqualificationsetcodeaddcoding.setCode(p.getPractQualificationCodeCodingCode());
		}
		/******************** Pract_Qualification_Code_Coding_Display ********************************************************************************/
		if(p.getPractQualificationCodeCodingDisplay() != null) {
			practitioneraddqualificationsetcodeaddcoding.setDisplay(p.getPractQualificationCodeCodingDisplay());
		}
		/******************** Pract_Qualification_Code_Coding_System ********************************************************************************/
		if(p.getPractQualificationCodeCodingSystem() != null) {
			practitioneraddqualificationsetcodeaddcoding.setSystem(p.getPractQualificationCodeCodingSystem());
		}
		/******************** Pract_Qualification_Code_Coding_Usrslt ********************************************************************************/
		if(p.getPractQualificationCodeCodingUsrslt() != null) {
			practitioneraddqualificationsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractQualificationCodeCodingUsrslt()));
		}
		/******************** Pract_Qualification_Code_Coding_Version ********************************************************************************/
		if(p.getPractQualificationCodeCodingVersion() != null) {
			practitioneraddqualificationsetcodeaddcoding.setVersion(p.getPractQualificationCodeCodingVersion());
		}
		/******************** Pract_Qualification_Code_Text ********************************************************************************/
		if(p.getPractQualificationCodeText() != null) {
			practitioneraddqualificationsetcode.setText(p.getPractQualificationCodeText());
		}

		org.hl7.fhir.r4.model.Identifier practitioneraddqualificationaddidentifier = practitioneraddqualification.addIdentifier();

		/******************** Pract_Qualification_Id_Assigner ********************************************************************************/
		if(p.getPractQualificationIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PractQualificationIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddqualificationaddidentifier.setAssigner(PractQualificationIdAssignerref.setReference(p.getPractQualificationIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddqualificationaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddqualificationaddidentifier.setPeriod(practitioneraddqualificationaddidentifiersetperiod);

		/******************** Pract_Qualification_Id_Period_End ********************************************************************************/
		if(p.getPractQualificationIdPeriodEnd() != null) {
			java.text.SimpleDateFormat PractQualificationIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationIdPeriodEnddate = PractQualificationIdPeriodEndsdf.parse(p.getPractQualificationIdPeriodEnd());
			practitioneraddqualificationaddidentifiersetperiod.setEnd(PractQualificationIdPeriodEnddate);
		}
		/******************** Pract_Qualification_Id_Period_Start ********************************************************************************/
		if(p.getPractQualificationIdPeriodStart() != null) {
			java.text.SimpleDateFormat PractQualificationIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationIdPeriodStartdate = PractQualificationIdPeriodStartsdf.parse(p.getPractQualificationIdPeriodStart());
			practitioneraddqualificationaddidentifiersetperiod.setStart(PractQualificationIdPeriodStartdate);
		}
		/******************** Pract_Qualification_Id_System ********************************************************************************/
		if(p.getPractQualificationIdSystem() != null) {
			practitioneraddqualificationaddidentifier.setSystem(p.getPractQualificationIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddqualificationaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddqualificationaddidentifier.setType(practitioneraddqualificationaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding practitioneraddqualificationaddidentifiersettypeaddcoding = practitioneraddqualificationaddidentifiersettype.addCoding();

		/******************** Pract_Qualification_Id_Type_Coding_Code ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingCode() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setCode(p.getPractQualificationIdTypeCodingCode());
		}
		/******************** Pract_Qualification_Id_Type_Coding_Display ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingDisplay() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setDisplay(p.getPractQualificationIdTypeCodingDisplay());
		}
		/******************** Pract_Qualification_Id_Type_Coding_System ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingSystem() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setSystem(p.getPractQualificationIdTypeCodingSystem());
		}
		/******************** Pract_Qualification_Id_Type_Coding_Usrslt ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingUsrslt() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractQualificationIdTypeCodingUsrslt()));
		}
		/******************** Pract_Qualification_Id_Type_Coding_Version ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingVersion() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setVersion(p.getPractQualificationIdTypeCodingVersion());
		}
		/******************** Pract_Qualification_Id_Type_Text ********************************************************************************/
		if(p.getPractQualificationIdTypeText() != null) {
			practitioneraddqualificationaddidentifiersettype.setText(p.getPractQualificationIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneraddqualificationaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Pract_Qualification_Id_Use_Code ********************************************************************************/
		if(p.getPractQualificationIdUseCode() != null) {
			practitioneraddqualificationaddidentifier.setUse(practitioneraddqualificationaddidentifiersetuseEnumFactory.fromCode(p.getPractQualificationIdUseCode()));

		}
		/******************** Pract_Qualification_Id_Value ********************************************************************************/
		if(p.getPractQualificationIdValue() != null) {
			practitioneraddqualificationaddidentifier.setValue(p.getPractQualificationIdValue());
		}
		/******************** Pract_Qualification_Issuer ********************************************************************************/
		if(p.getPractQualificationIssuer() != null) {
			org.hl7.fhir.r4.model.Reference PractQualificationIssuerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddqualification.setIssuer(PractQualificationIssuerref.setReference(p.getPractQualificationIssuer()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddqualificationsetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddqualification.setPeriod(practitioneraddqualificationsetperiod);

		/******************** Pract_Qualification_Period_End ********************************************************************************/
		if(p.getPractQualificationPeriodEnd() != null) {
			java.text.SimpleDateFormat PractQualificationPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationPeriodEnddate = PractQualificationPeriodEndsdf.parse(p.getPractQualificationPeriodEnd());
			practitioneraddqualificationsetperiod.setEnd(PractQualificationPeriodEnddate);
		}
		/******************** Pract_Qualification_Period_Start ********************************************************************************/
		if(p.getPractQualificationPeriodStart() != null) {
			java.text.SimpleDateFormat PractQualificationPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationPeriodStartdate = PractQualificationPeriodStartsdf.parse(p.getPractQualificationPeriodStart());
			practitioneraddqualificationsetperiod.setStart(PractQualificationPeriodStartdate);
		}

		org.hl7.fhir.r4.model.ContactPoint practitioneraddtelecom = practitioner.addTelecom();


		org.hl7.fhir.r4.model.Period practitioneraddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddtelecom.setPeriod(practitioneraddtelecomsetperiod);

		/******************** Pract_Telecom_Period_End ********************************************************************************/
		if(p.getPractTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PractTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractTelecomPeriodEnddate = PractTelecomPeriodEndsdf.parse(p.getPractTelecomPeriodEnd());
			practitioneraddtelecomsetperiod.setEnd(PractTelecomPeriodEnddate);
		}
		/******************** Pract_Telecom_Period_Start ********************************************************************************/
		if(p.getPractTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PractTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractTelecomPeriodStartdate = PractTelecomPeriodStartsdf.parse(p.getPractTelecomPeriodStart());
			practitioneraddtelecomsetperiod.setStart(PractTelecomPeriodStartdate);
		}
		/******************** Pract_Telecom_Rank ********************************************************************************/
		if(p.getPractTelecomRank() != null) {
			practitioneraddtelecom.setRank(Integer.parseInt(p.getPractTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory practitioneraddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Pract_Telecom_System_Code ********************************************************************************/
		if(p.getPractTelecomSystemCode() != null) {
			practitioneraddtelecom.setSystem(practitioneraddtelecomsetsystemEnumFactory.fromCode(p.getPractTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory practitioneraddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Pract_Telecom_Use_Code ********************************************************************************/
		if(p.getPractTelecomUseCode() != null) {
			practitioneraddtelecom.setUse(practitioneraddtelecomsetuseEnumFactory.fromCode(p.getPractTelecomUseCode()));

		}
		/******************** Pract_Telecom_Value ********************************************************************************/
		if(p.getPractTelecomValue() != null) {
			practitioneraddtelecom.setValue(p.getPractTelecomValue());
		}
>>>>>>> master
		return practitioner;
	}
}
