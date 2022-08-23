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
		return practitioner;
	}
}
